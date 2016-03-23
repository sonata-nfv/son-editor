/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert;

import eu.sonata.nfv.nec.convert.internal.DefaultConverter;
import java.util.Map;

/**
 * Convenience class to use the library without Guice
 * dependency injection.
 *
 * @author Michael Bredel
 */
@SuppressWarnings("unused")
public class Converter implements ConversionService {
    /** The private static converter instance for singleton. */
    private static Converter instance;
    /** A conversion service interface to an conversion service instance. */
    private ConversionService conversionService;

    /**
     * A private constructor for singleton.
     */
    private Converter() {
        this.conversionService = new DefaultConverter();
    }

    /**
     * Gets a singleton converter instance.
     *
     * @return A singleton converter instance.
     */
    public static Converter getInstance() {
        if (instance == null) {
            instance = new Converter();
        }
        return instance;
    }

    @Override
    public String convertToJson(String yamlString) {
        return this.conversionService.convertToJson(yamlString);
    }

    @Override
    public String convertToJson(Map<String, Object> map) {
        return this.conversionService.convertToJson(map);
    }

    @Override
    public String convertToYaml(String jsonString) {
        return this.conversionService.convertToYaml(jsonString);
    }

    @Override
    public String convertToYaml(Map<String, Object> map) {
        return this.conversionService.convertToYaml(map);
    }

    @Override
    public Map<String, Object> convertToMap(String string) {
        return this.conversionService.convertToMap(string);
    }

    @Override
    public boolean compare(String a, String b) {
        return this.conversionService.compare(a, b);
    }
}
