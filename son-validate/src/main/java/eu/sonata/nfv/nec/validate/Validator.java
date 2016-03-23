/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.validate;

import eu.sonata.nfv.nec.validate.internal.DefaultValidator;
import org.everit.json.schema.SchemaException;
import org.everit.json.schema.ValidationException;
import java.io.UncheckedIOException;

/**
 * The validator is a singleton implementation of the
 * validator service that uses the default validator in
 * a hard-coded way. Thus, the validator can be used
 * without Guice Dependency Injection.
 *
 * @author Michael Bredel
 */
public class Validator implements ValidationService {
    /** The private static validator instance for singleton. */
    private static Validator instance;
    /** A validation service interface to an validation service instance. */
    private ValidationService validationService;

    /**
     * A private constructor for singleton.
     */
    private Validator() {
        this.validationService = new DefaultValidator();
    }

    /**
     * Gets a singleton validator instance.
     *
     * @return A singleton validator instance.
     */
    public static Validator getInstance() {
        if (instance == null) {
            instance = new Validator();
        }
        return instance;
    }

    @Override
    public boolean isValid(String jsonString, String schemaString) {
        return validationService.isValid(jsonString, schemaString);
    }

    @Override
    public void validate(String jsonString, String schemaString) throws ValidationException, UncheckedIOException, SchemaException {
        validationService.validate(jsonString, schemaString);
    }
}
