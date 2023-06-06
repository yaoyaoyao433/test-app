package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.bumptech.glide.load.model.b<InputStream> implements e<File> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<File, InputStream> {
        @Override // com.bumptech.glide.load.model.m
        public final l<File, InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new d(cVar.a(Uri.class, InputStream.class));
        }
    }

    public d(l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
