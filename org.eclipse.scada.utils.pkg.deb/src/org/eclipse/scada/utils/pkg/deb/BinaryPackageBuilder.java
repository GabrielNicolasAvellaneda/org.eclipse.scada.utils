/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.utils.pkg.deb;

import java.io.IOException;

/**
 * An interface for binary installation package builders <br/>
 * <p>
 * Target path names are relative to the root of the system. Absolute paths will
 * stay absolute and relative ones get converted to absolute using root. So
 * <tt>usr/bin</tt> will become <tt>/usr/bin</tt>.
 * </p>
 */
public interface BinaryPackageBuilder
{

    /**
     * Add a file to the binary package
     *
     * @param contentProvider
     *            the content provider
     * @param fileName
     *            the name of the target file
     * @param entryInformation
     *            additional entry information
     * @throws IOException
     *             if the file cannot be written to the package
     */
    public void addFile ( ContentProvider contentProvider, String fileName, EntryInformation entryInformation ) throws IOException;

    /**
     * Add a directory to the binary package
     *
     * @param directory
     *            the name of the target directory
     * @param entryInformation
     *            additional entry information
     * @throws IOException
     *             if the directory information cannot be written to the package
     */
    public void addDirectory ( String directory, EntryInformation entryInformation ) throws IOException;

}
