package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;
/* loaded from: classes6.dex */
public final class fy extends Exception {
    Throwable a;
    private gi b;
    private gj c;

    public fy() {
        this.b = null;
        this.c = null;
        this.a = null;
    }

    public fy(gi giVar) {
        this.b = null;
        this.c = null;
        this.a = null;
        this.b = giVar;
    }

    public fy(String str) {
        super(str);
        this.b = null;
        this.c = null;
        this.a = null;
    }

    public fy(String str, Throwable th) {
        super(str);
        this.b = null;
        this.c = null;
        this.a = null;
        this.a = th;
    }

    public fy(Throwable th) {
        this.b = null;
        this.c = null;
        this.a = null;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        return (message != null || this.c == null) ? (message != null || this.b == null) ? message : this.b.toString() : this.c.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.a != null) {
            printStream.println("Nested Exception: ");
            this.a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.a != null) {
            printWriter.println("Nested Exception: ");
            this.a.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        if (this.c != null) {
            sb.append(this.c);
        }
        if (this.b != null) {
            sb.append(this.b);
        }
        if (this.a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.a);
        }
        return sb.toString();
    }
}
