package com.study.parser.parser;

import org.xml.sax.helpers.DefaultHandler;

import com.study.parser.entity.AttributeEnum;
import com.study.parser.entity.DomesticMedicine;
import com.study.parser.entity.ElementEnum;
import com.study.parser.entity.ForeignMedicine;
import com.study.parser.entity.Medicine;

import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.commons.lang3.EnumUtils;
import org.xml.sax.Attributes;


public class MedicineHandler extends DefaultHandler {
	private Set<Medicine> medicines;
	private Medicine current = null;
	private Object currentInner = null;
	private AttributeEnum currentEnum = null;

	public MedicineHandler() {
		medicines = new HashSet<Medicine>();
	}
	
	public Set<Medicine> getMedicines() {
		return medicines;
	}
	public void startElement(String uri, String localName, String qName, Attributes attrs) {
		if ("foreign-medicine".equals(localName) || "domestic-medicine".equals(localName)) {
			current = "foreign-medicine".equals(localName) ? new ForeignMedicine() : new DomesticMedicine();
		} else {
			ElementEnum temp = getElementEnumByName(localName.replace("-", "").toUpperCase());
		}
		for (int i = 0; i< attrs.getLength(); i++){
			AttributeEnum temp = getAttributeEnumByName(attrs.getLocalName(i).toUpperCase());
			if (temp != null){
				currentEnum = temp;
				invokeSetterForAttribute(attrs.getValue(i));
			}
		}
			
	}
	private ElementEnum getElementEnumByName(String name) {
		ElementEnum result = null;
		for (ElementEnum item : ElementEnum.values()){
			if (item.toString().matches(name)){
				result = item;
				break;
			}
		}
		return result;
	}

	private AttributeEnum getAttributeEnumByName(String name) {
		AttributeEnum result = null;
		for (AttributeEnum item : AttributeEnum.values()){
			if (item.toString().matches(name)){
				result = item;
				break;
			}
		}
		return result;
	}

	public void endElement(String uri, String localName, String qName) {
		if ("foreign-medicine".equals(localName) || "domestic-medicine".equals(localName)) {
			medicines.add(current);
			current = null;
		}
		
	}
	public void characters(char[] ch, int start, int length) {
//		String s = new String(ch, start, length).trim();
//		if (currentEnum != null){
//			invokeSetterForAttribute(s);
//		}
//		currentEnum = null;
	}

	private void invokeSetterForAttribute(String s) {
		Method method = getSetterMethodForAttribute(current.getClass());
		try {
			method.invoke(current, s);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Method getSetterMethodForAttribute(Class<?> clazz) {
		Method result = null;
		List<Field> fieldList = getAllFields(new ArrayList<Field>(), clazz);
		for (Field item : fieldList){
			if (EnumUtils.isValidEnum(ElementEnum.class, item.getName().toUpperCase())){
				result = getSetterMethodForAttribute(item.getClass());
			}	
			if (item.getName().toUpperCase().matches(currentEnum.name())){
				
				result = getMethodByName(item, clazz);
				break;
			}
		}
		return result;
	}
	
	private Method getMethodByName(Field item, Class<?> clazz) {
		Method[] classMethods = clazz.getMethods();
		Method result = null;
		for (Method method : classMethods){
			if (method.getName().toUpperCase().matches("SET" + item.getName().toUpperCase())){
				result = method;
				break;
			}
		}
		return result;
	}

	private List<Field> getAllFields(List<Field> fields, Class<?> type) {
	    fields.addAll(Arrays.asList(type.getDeclaredFields()));

	    if (type.getSuperclass() != null) {
	        getAllFields(fields, type.getSuperclass());
	    }

	    return fields;
	}
}

