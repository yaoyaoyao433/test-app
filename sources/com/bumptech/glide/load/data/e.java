package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends a<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.data.a
    protected final /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    public e(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.a
    protected final /* synthetic */ ParcelFileDescriptor a(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
