/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.gce.imagemosaic.jdbc;

import java.util.Iterator;
import org.geotools.coverage.grid.io.GridFormatFactorySpi;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.junit.Assert;
import org.junit.Test;

/** @author Simone Giannecchini */
public class ImageMosaicJDBCServiceTest {
    /** */
    public ImageMosaicJDBCServiceTest() {}

    @Test
    public void testIsAvailable() {
        Iterator<GridFormatFactorySpi> list = GridFormatFinder.getAvailableFormats().iterator();
        boolean found = false;

        while (list.hasNext()) {
            final GridFormatFactorySpi fac = list.next();

            if (fac instanceof ImageMosaicJDBCFormatFactory) {
                found = true;

                break;
            }
        }

        Assert.assertTrue("ImageMosaicJDBCFormatFactorySpi not registered", found);
    }
}
