/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available at the root of this project (under the
 * names LGPL-3.0.txt and ASL-2.0.txt respectively) or, if you have a jar instead,
 * in the META-INF/ directory.
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.jsonschema.core.report;

import com.github.fge.jsonschema.core.processing.Processor;

/**
 * Message providing interface
 *
 * <p>This interface must be implemented by all inputs and outputs used by
 * {@link Processor}s. This allows a processor to grab a context-dependent
 * message for more accurate reporting.</p>
 */
public interface MessageProvider
{
    /**
     * Provide a message template for this context
     *
     * @return a new processing message
     */
    ProcessingMessage newMessage();
}
