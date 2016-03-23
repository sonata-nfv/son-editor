/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert;

import eu.sonata.nfv.nec.convert.helpers.Utils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Bredel
 */
public class UtilsTest {

    @Test
    public void stripPath() {
        String path = "./test";
        assertEquals("The path should equal 'test', but " + Utils.stripPath(path), "test", Utils.stripPath(path));

        path = "/test";
        assertEquals("The path should equal 'test', but " + Utils.stripPath(path), "test", Utils.stripPath(path));

        path = ".test";
        assertEquals("The path should equal '.test', but " + Utils.stripPath(path), ".test", Utils.stripPath(path));
    }
}
