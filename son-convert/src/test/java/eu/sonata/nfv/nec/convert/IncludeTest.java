/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert;

import eu.sonata.nfv.nec.convert.internal.IncludeConstructor;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author Michael Bredel
 */
public class IncludeTest {
    /** The path to the YAML test file. */
    public static final String YAML_FILE = "./src/test/resources/include.yaml";

    /** The YAML test string. */
    protected String yamlString;

    /**
     * Read the JSON and YAML test files.
     */
    @Before
    public void readTestFiles() {
        File yamlFile = new File(YAML_FILE);

        // Read the yaml file and populate the yaml string.
        try {
            FileInputStream fisYamlFile = new FileInputStream(yamlFile);
            yamlString = IOUtils.toString(fisYamlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        Yaml yaml = new Yaml(new IncludeConstructor());
        Object data = yaml.load(yamlString);
        Map<String, Object> map = (Map<String, Object>) data;
        System.out.println("TEST: " + map);
    }
}
