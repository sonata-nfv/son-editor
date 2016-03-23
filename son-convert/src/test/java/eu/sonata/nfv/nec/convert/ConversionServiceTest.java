/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert;

import com.carlosbecker.guice.GuiceModules;
import com.carlosbecker.guice.GuiceTestRunner;
import eu.sonata.nfv.nec.convert.modules.ConversionModule;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

/**
 * Tests the conversion service.
 *
 * @author Michael Bredel
 */
@RunWith(GuiceTestRunner.class)
@GuiceModules(ConversionModule.class)
public class ConversionServiceTest extends BasicConverterTest {
    /** Use Guice to inject the conversion service API. */
    @Inject
    @SuppressWarnings("unused")
    private ConversionService conversionService;

    @Before
    public void init() {
        super.conversionService = this.conversionService;
    }

    @Test
    public void injection() {
        assertNotNull("The injected conversion service should not be null!", this.conversionService);
        assertNotNull("The injected conversion service should not be null!", super.conversionService);
    }
}
