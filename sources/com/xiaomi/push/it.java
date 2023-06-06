package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class it {
    public final String a;
    public final byte b;
    public final short c;

    public it() {
        this("", (byte) 0, (short) 0);
    }

    public it(String str, byte b, short s) {
        this.a = str;
        this.b = b;
        this.c = s;
    }

    public final String toString() {
        return "<TField name:'" + this.a + "' type:" + ((int) this.b) + " field-id:" + ((int) this.c) + ">";
    }
}
