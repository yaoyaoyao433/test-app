package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends n<ParcelFileDescriptor> implements b<Integer> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<Integer, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.m
        public final l<Integer, ParcelFileDescriptor> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new c(context, cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public c(Context context, l<Uri, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }
}
