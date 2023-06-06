package com.bumptech.glide;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.m;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d<ModelType> extends c<ModelType> {
    private final com.bumptech.glide.load.model.l<ModelType, InputStream> h;
    private final com.bumptech.glide.load.model.l<ModelType, ParcelFileDescriptor> i;
    private final m.b j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.Class<ModelType> r11, com.bumptech.glide.load.model.l<ModelType, java.io.InputStream> r12, com.bumptech.glide.load.model.l<ModelType, android.os.ParcelFileDescriptor> r13, android.content.Context r14, com.bumptech.glide.i r15, com.bumptech.glide.manager.l r16, com.bumptech.glide.manager.g r17, com.bumptech.glide.m.b r18) {
        /*
            r10 = this;
            r7 = r10
            r8 = r12
            r9 = r13
            r4 = r15
            java.lang.Class<com.bumptech.glide.load.resource.gifbitmap.a> r0 = com.bumptech.glide.load.resource.gifbitmap.a.class
            java.lang.Class<com.squareup.picasso.PicassoDrawable> r1 = com.squareup.picasso.PicassoDrawable.class
            if (r8 != 0) goto Lf
            if (r9 != 0) goto Lf
            r0 = 0
            r3 = r0
            goto L23
        Lf:
            com.bumptech.glide.load.resource.transcode.c r1 = r15.a(r0, r1)
            java.lang.Class<com.bumptech.glide.load.model.g> r2 = com.bumptech.glide.load.model.g.class
            com.bumptech.glide.provider.b r0 = r15.b(r2, r0)
            com.bumptech.glide.load.model.f r2 = new com.bumptech.glide.load.model.f
            r2.<init>(r12, r13)
            com.bumptech.glide.provider.e r3 = new com.bumptech.glide.provider.e
            r3.<init>(r2, r1, r0)
        L23:
            r0 = r10
            r1 = r14
            r2 = r11
            r4 = r15
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.h = r8
            r7.i = r9
            r0 = r18
            r7.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.<init>(java.lang.Class, com.bumptech.glide.load.model.l, com.bumptech.glide.load.model.l, android.content.Context, com.bumptech.glide.i, com.bumptech.glide.manager.l, com.bumptech.glide.manager.g, com.bumptech.glide.m$b):void");
    }

    public final b<ModelType> b() {
        m.b bVar = this.j;
        return new b<>(this, this.h, this.i, this.j);
    }

    public final h<ModelType> c() {
        m.b bVar = this.j;
        return new h<>(this, this.h, this.j);
    }

    public final com.bumptech.glide.request.a<File> b(int i, int i2) {
        m.b bVar = this.j;
        return new f(File.class, this, this.h, InputStream.class, File.class, this.j).a().c(i, i2);
    }
}
