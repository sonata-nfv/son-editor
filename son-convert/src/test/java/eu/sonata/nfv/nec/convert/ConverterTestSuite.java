/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Michael Bredel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConversionServiceTest.class,
        ConverterTest.class
})
public class ConverterTestSuite {
}
