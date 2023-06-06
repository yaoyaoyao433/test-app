package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.q;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends q<InputStream> implements e<Uri> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.m
        public final l<Uri, InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new h(context, cVar.a(com.bumptech.glide.load.model.d.class, InputStream.class));
        }
    }

    public h(Context context, l<com.bumptech.glide.load.model.d, InputStream> lVar) {
        super(context, lVar);
    }

    @Override // com.bumptech.glide.load.model.q
    public final com.bumptech.glide.load.data.c<InputStream> a(Context context, Uri uri) {
        return new k(context, uri);
    }

    @Override // com.bumptech.glide.load.model.q
    public final com.bumptech.glide.load.data.c<InputStream> a(Context context, String str) {
        return new j(context.getApplicationContext().getAssets(), str);
    }
}
