/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.validate;

import com.carlosbecker.guice.GuiceModules;
import com.carlosbecker.guice.GuiceTestRunner;
import eu.sonata.nfv.nec.validate.modules.ValidationModule;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Bredel
 */
@RunWith(GuiceTestRunner.class)
@GuiceModules(ValidationModule.class)
public class ValidationServiceTest extends BasicValidatorTest {
    /** Use Guice to inject the conversion service API. */
    @Inject
    @SuppressWarnings("unused")
    private ValidationService validationService;

    @Before
    public void init() {
        super.validationService = this.validationService;
    }

    @Test
    public void injection() {
        assertNotNull("The injected validation service should not be null!", this.validationService);
        assertNotNull("The injected validation service should not be null!", super.validationService);
    }
}
