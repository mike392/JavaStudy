package test.com.study.tune.creator;

import org.junit.Assert;
import org.junit.Test;

import com.study.tune.creator.TuneCreator;
import com.study.tune.entity.Tune;
import com.study.tune.util.WrongTuneTypeException;

public class TuneCreatorTest {
	
	@Test
	public void createTunePositiveTest() throws WrongTuneTypeException{
		Tune actual = TuneCreator.createTune("Vocal".toUpperCase());
		Tune unexpected = null;
		Assert.assertNotEquals(unexpected, actual);
	}
	
	@Test( expected = WrongTuneTypeException.class )
	public void createTuneNegativeTest() throws WrongTuneTypeException{
		Tune actual = TuneCreator.createTune("SomeCrazyStuff".toUpperCase());
		Tune unexpected = null;
		Assert.assertNotEquals(unexpected, actual);
	}
}
