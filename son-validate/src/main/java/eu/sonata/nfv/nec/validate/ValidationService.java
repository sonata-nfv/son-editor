/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.validate;

import org.everit.json.schema.SchemaException;
import org.everit.json.schema.ValidationException;
import org.json.JSONException;
import java.io.UncheckedIOException;

/**
 * The validation service offers the interface
 * specification to validate a JSON string against
 * a given schema.
 *
 * @author Michael Bredel
 */
public interface ValidationService {

    /**
     * Checks if a given JSON string is valid according
     * to the given schema file.
     *
     * @param jsonString A JSON string that is checked.
     * @param schemaString The JSON schema to check against.
     * @return True iff the given JSON string meets the given schema.
     */
    boolean isValid(String jsonString, String schemaString);

    /**
     * Validates a given JSON string is valid according
     * to the given schema file.
     *
     * @param jsonString A JSON string that is validated.
     * @param schemaString The JSON schema to check against.
     * @throws ValidationException The validation exception message contains hints why the validation has failed.
     */
    void validate(String jsonString, String schemaString) throws ValidationException, JSONException, UncheckedIOException, SchemaException;
}
