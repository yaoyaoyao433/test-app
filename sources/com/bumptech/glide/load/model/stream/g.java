package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.p;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends p<InputStream> implements e<String> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<String, InputStream> {
        @Override // com.bumptech.glide.load.model.m
        public final l<String, InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new g(cVar.a(Uri.class, InputStream.class));
        }
    }

    public g(l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
