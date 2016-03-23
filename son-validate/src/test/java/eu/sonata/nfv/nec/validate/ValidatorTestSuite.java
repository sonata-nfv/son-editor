/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.validate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Michael Bredel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ValidationServiceTest.class,
        ValidatorTest.class
})
public class ValidatorTestSuite {
    // Do noting.
}
