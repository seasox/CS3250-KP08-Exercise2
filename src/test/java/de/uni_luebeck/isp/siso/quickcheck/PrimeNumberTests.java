package de.uni_luebeck.isp.siso.quickcheck;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class PrimeNumberTests {
    
    @Property
    public void primeFactorsShouldBePrimeNumbers(@InRange(min = "2", max = "999999999") Long a) {
    	// TODO: Write property-based test
    }
	
    // TODO: Write two more tests.
    
}