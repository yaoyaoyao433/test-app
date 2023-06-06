package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c<T> implements e<File, T> {
    private static final a a = new a();
    private e<InputStream, T> b;
    private final a c;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "";
    }

    @Override // com.bumptech.glide.load.e
    public final /* bridge */ /* synthetic */ l a(File file, int i, int i2) throws IOException {
        return a(file, i, i2, 0);
    }

    public c(e<InputStream, T> eVar) {
        this(eVar, a);
    }

    private c(e<InputStream, T> eVar, a aVar) {
        this.b = eVar;
        this.c = aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }
    }

    public final l<T> a(File file, int i, int i2, int i3) throws IOException {
        com.bumptech.glide.load.resource.bitmap.l lVar = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (i3 != 0) {
                try {
                    lVar = new com.bumptech.glide.load.resource.bitmap.l(fileInputStream, i3);
                } catch (Throwable th) {
                    th = th;
                    lVar = fileInputStream;
                    if (lVar != null) {
                        try {
                            lVar.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } else {
                lVar = fileInputStream;
            }
            l<T> a2 = this.b.a(lVar, i, i2);
            try {
                lVar.close();
            } catch (IOException unused2) {
            }
            return a2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
