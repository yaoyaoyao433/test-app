package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends h<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.data.h
    protected final /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    public f(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // com.bumptech.glide.load.data.h
    protected final /* synthetic */ ParcelFileDescriptor a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return contentResolver.openAssetFileDescriptor(uri, r.o).getParcelFileDescriptor();
    }
}
