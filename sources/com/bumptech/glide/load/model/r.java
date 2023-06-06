package com.bumptech.glide.load.model;

import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class r<T> implements l<URL, T> {
    private final l<d, T> a;

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(URL url, int i, int i2) {
        return this.a.a(new d(url), i, i2);
    }

    public r(l<d, T> lVar) {
        this.a = lVar;
    }
}
