package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.l;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements e<Uri> {
    private final Context a;
    private final l<Uri, InputStream> b;

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(Object obj, int i, int i2) {
        Uri uri = (Uri) obj;
        return new com.bumptech.glide.load.data.i(this.a, uri, this.b.a(uri, i, i2), i, i2);
    }

    public b(Context context, l<Uri, InputStream> lVar) {
        this.a = context;
        this.b = lVar;
    }
}
