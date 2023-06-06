package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.bumptech.glide.load.model.b<ParcelFileDescriptor> implements b<File> {

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.model.file_descriptor.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0042a implements m<File, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.m
        public final l<File, ParcelFileDescriptor> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new a(cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public a(l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
