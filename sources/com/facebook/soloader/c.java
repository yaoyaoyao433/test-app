package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends i {
    protected final File c;
    protected final int d;

    public c(File file, int i) {
        this.c = file;
        this.d = i;
    }

    @Override // com.facebook.soloader.i
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.c.getCanonicalPath());
        } catch (IOException unused) {
            name = this.c.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.d + ']';
    }
}
