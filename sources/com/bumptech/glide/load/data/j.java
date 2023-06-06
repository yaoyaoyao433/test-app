package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends a<InputStream> {
    @Override // com.bumptech.glide.load.data.a
    protected final /* synthetic */ void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    public j(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.a
    protected final /* synthetic */ InputStream a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
