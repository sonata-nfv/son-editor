/*
 * Copyright (C) 2016, NEC, SONATA-NFV
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license. See the LICENSE file for details.
 */
package eu.sonata.nfv.nec.convert.helpers;

/**
 * A utils class the just collects some useful
 * functions.
 *
 * @author Michael Bredel
 */
public class Utils {

    /**
     * Strip the beginning of a path string.
     *
     * @param path The path string to strip.
     * @return A stripped path string.
     */
    public static synchronized String stripPath(String path) {
        if (path.startsWith("./"))
            return path.substring(2);
        if (path.startsWith("/"))
            return path.substring(1);
        return path;
    }

    /**
     * Private constructor to avoid instantiation.
     */
    private Utils() {
        // Do nothing.
    }
}
