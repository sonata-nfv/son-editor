/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert.modules;

import com.google.inject.AbstractModule;
import eu.sonata.nfv.nec.convert.ConversionService;
import eu.sonata.nfv.nec.convert.internal.DefaultConverter;

/**
 * The Guice module that binds the conversion service to
 * a default conversion implementation.
 *
 * @author Michael Bredel
 */
public class ConversionModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ConversionService.class).to(DefaultConverter.class);
    }
}
