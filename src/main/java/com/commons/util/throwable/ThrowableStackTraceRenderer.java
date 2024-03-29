package com.commons.util.throwable;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;


/**
 * Default implementation of ThrowableStackTraceRenderer using
 * Throwable.printStackTrace.
 */
public final class ThrowableStackTraceRenderer {


    /**
     * Construct new instance.
     */
    public ThrowableStackTraceRenderer() {

    }

    /**
     * Render throwable using Throwable.printStackTrace.
     *
     * @param throwable throwable, may not be null.
     * @return string representation.
     */
    public static Collection render(final Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            throwable.printStackTrace(pw);
        } catch (RuntimeException ignored) {
        }
        pw.flush();
        LineNumberReader reader = new LineNumberReader(new StringReader(sw.toString()));
        ArrayList lines = new ArrayList();
        try {
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            if (ex instanceof InterruptedIOException) {
                Thread.currentThread().interrupt();
            }
            lines.add(ex.toString());
        }
        return lines;
    }


}
