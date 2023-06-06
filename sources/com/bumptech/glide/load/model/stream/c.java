package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements e<byte[]> {
    private final String a;

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(Object obj, int i, int i2) {
        return new com.bumptech.glide.load.data.b((byte[]) obj, this.a);
    }

    public c() {
        this("");
    }

    @Deprecated
    private c(String str) {
        this.a = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<byte[], InputStream> {
        @Override // com.bumptech.glide.load.model.m
        public final l<byte[], InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new c();
        }
    }
}
