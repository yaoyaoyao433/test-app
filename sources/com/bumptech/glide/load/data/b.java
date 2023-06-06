package com.bumptech.glide.load.data;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements c<InputStream> {
    private final byte[] a;
    private final String b;

    @Override // com.bumptech.glide.load.data.c
    public final void a() {
    }

    @Override // com.bumptech.glide.load.data.c
    public final void cancel() {
    }

    public b(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    @Override // com.bumptech.glide.load.data.c
    public final String b() {
        return this.b;
    }

    @Override // com.bumptech.glide.load.data.c
    public final /* synthetic */ InputStream a(int i) throws Exception {
        return new ByteArrayInputStream(this.a);
    }
}
