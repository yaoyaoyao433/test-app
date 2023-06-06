package com.bumptech.glide.load.data;

import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l implements c<InputStream> {
    private final int a;
    private final Resources b;
    private InputStream c;

    @Override // com.bumptech.glide.load.data.c
    public final void cancel() {
    }

    public l(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // com.bumptech.glide.load.data.c
    public final void a() {
        if (this.c != null) {
            try {
                this.c.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final String b() {
        return String.valueOf(this.a);
    }

    @Override // com.bumptech.glide.load.data.c
    public final /* synthetic */ InputStream a(int i) throws Exception {
        this.c = this.b.openRawResource(this.a);
        return this.c;
    }
}
