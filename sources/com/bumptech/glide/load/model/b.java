package com.bumptech.glide.load.model;

import android.net.Uri;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b<T> implements l<File, T> {
    private final l<Uri, T> a;

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(File file, int i, int i2) {
        return this.a.a(Uri.fromFile(file), i, i2);
    }

    public b(l<Uri, T> lVar) {
        this.a = lVar;
    }
}
