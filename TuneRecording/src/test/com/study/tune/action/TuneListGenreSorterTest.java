package test.com.study.tune.action;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import com.study.tune.action.TuneList;
import com.study.tune.action.TuneListGenreSorter;
import com.study.tune.action.TuneListPopulator;
import com.study.tune.entity.ElectronicTune;
import com.study.tune.entity.InstrumentalTune;
import com.study.tune.entity.Tune;
import com.study.tune.entity.TuneGenreEnum;
import com.study.tune.entity.VocalTune;
import com.study.tune.util.InputFileReader;

public class TuneListGenreSorterTest {
/*	private List<String> inputFromFile = new LinkedList<String>();
	private Tune vocalTune = new VocalTune();
	private Tune anotherVocalTune = new VocalTune();
	private Tune instrumentalTune = new InstrumentalTune();
	private Tune electroTune = new ElectronicTune();*/
	@Before
	public void initInputFromFile(){

/*		vocalTune.setGenre(TuneGenreEnum.CLASSIC);
		anotherVocalTune.setGenre(TuneGenreEnum.POP);
		instrumentalTune.setGenre(TuneGenreEnum.RAP);
		electroTune.setGenre(TuneGenreEnum.CLASSIC);*/
		List<String> input = InputFileReader.readInput();
		TuneListPopulator.populateTuneListGivenInput(input);
	}
	@Test
	public void sortListAscTest(){
/*		List<Tune> expected = Arrays.asList(vocalTune, electroTune, anotherVocalTune, instrumentalTune);
		List<Tune> actual = Arrays.asList(anotherVocalTune, instrumentalTune, vocalTune, electroTune);*/
		List<Tune> unsortedList = TuneList.getTuneList();
		List<Tune> sortedList = TuneListGenreSorter.sortListAsc(unsortedList);
		assertThat(unsortedList, is(sortedList));
	}
	
}
