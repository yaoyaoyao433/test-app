package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class q<T> implements l<Uri, T> {
    Object a;
    private final Context b;
    private final l<d, T> c;

    protected abstract com.bumptech.glide.load.data.c<T> a(Context context, Uri uri);

    protected abstract com.bumptech.glide.load.data.c<T> a(Context context, String str);

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(Uri uri, int i, int i2) {
        Uri uri2 = uri;
        String scheme = uri2.getScheme();
        if ("file".equals(scheme) || "content".equals(scheme) || "android.resource".equals(scheme)) {
            if (a.a(uri2)) {
                return a(this.b, a.b(uri2));
            }
            return a(this.b, uri2);
        } else if (this.c == null || !("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
            return null;
        } else {
            d dVar = new d(uri2.toString());
            dVar.c = this.a;
            return this.c.a(dVar, i, i2);
        }
    }

    public q(Context context, l<d, T> lVar) {
        this.b = context;
        this.c = lVar;
    }
}
