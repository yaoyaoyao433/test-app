package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.q;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends q<ParcelFileDescriptor> implements b<Uri> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<Uri, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.m
        public final l<Uri, ParcelFileDescriptor> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new e(context, cVar.a(com.bumptech.glide.load.model.d.class, ParcelFileDescriptor.class));
        }
    }

    public e(Context context, l<com.bumptech.glide.load.model.d, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }

    @Override // com.bumptech.glide.load.model.q
    public final com.bumptech.glide.load.data.c<ParcelFileDescriptor> a(Context context, Uri uri) {
        return new f(context, uri);
    }

    @Override // com.bumptech.glide.load.model.q
    public final com.bumptech.glide.load.data.c<ParcelFileDescriptor> a(Context context, String str) {
        return new com.bumptech.glide.load.data.e(context.getApplicationContext().getAssets(), str);
    }
}
