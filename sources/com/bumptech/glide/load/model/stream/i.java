package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends r<InputStream> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.m
        public final l<URL, InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new i(cVar.a(com.bumptech.glide.load.model.d.class, InputStream.class));
        }
    }

    public i(l<com.bumptech.glide.load.model.d, InputStream> lVar) {
        super(lVar);
    }
}
