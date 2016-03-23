/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.validate.modules;

import com.google.inject.AbstractModule;
import eu.sonata.nfv.nec.validate.ValidationService;
import eu.sonata.nfv.nec.validate.internal.DefaultValidator;

/**
 * The Guice module that binds the validation service to
 * a default validation implementation.
 *
 * @author Michael Bredel
 */
public class ValidationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ValidationService.class).to(DefaultValidator.class);
    }
}
