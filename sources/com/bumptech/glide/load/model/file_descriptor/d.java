package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.p;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends p<ParcelFileDescriptor> implements b<String> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.m
        public final l<String, ParcelFileDescriptor> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new d(cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public d(l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
