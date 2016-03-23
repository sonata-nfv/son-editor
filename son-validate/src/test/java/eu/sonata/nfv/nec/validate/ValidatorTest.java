/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.validate;

import org.junit.Before;

/**
 * @author Michael Bredel
 */
public class ValidatorTest extends BasicValidatorTest {
    /**
     * Connect the converter singleton instance with the
     * conversion service API.
     */
    @Before
    public void init() {
        this.validationService = Validator.getInstance();
    }


}
