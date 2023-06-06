package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.view.animation.Animation;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.s;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a<ModelType, TranscodeType> extends e<ModelType, com.bumptech.glide.load.model.g, Bitmap, TranscodeType> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.c h;
    private com.bumptech.glide.load.resource.bitmap.f i;
    private com.bumptech.glide.load.a j;
    private com.bumptech.glide.load.e<InputStream, Bitmap> k;
    private com.bumptech.glide.load.e<ParcelFileDescriptor, Bitmap> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.bumptech.glide.provider.f<ModelType, com.bumptech.glide.load.model.g, Bitmap, TranscodeType> fVar, Class<TranscodeType> cls, e<ModelType, ?, ?, ?> eVar) {
        super(fVar, cls, eVar);
        this.i = com.bumptech.glide.load.resource.bitmap.f.a;
        this.h = eVar.c.b;
        this.j = eVar.c.c;
        this.k = new q(this.h, this.j);
        this.l = new com.bumptech.glide.load.resource.bitmap.h(this.h, this.j);
    }

    public final a<ModelType, TranscodeType> a() {
        return a(com.bumptech.glide.load.resource.bitmap.f.c);
    }

    public final a<ModelType, TranscodeType> b() {
        return a(com.bumptech.glide.load.resource.bitmap.f.b);
    }

    private a<ModelType, TranscodeType> a(com.bumptech.glide.load.resource.bitmap.f fVar) {
        this.i = fVar;
        this.k = new q(fVar, this.h, this.j);
        super.b(new com.bumptech.glide.load.resource.bitmap.m(this.k, this.l));
        return this;
    }

    public final a<ModelType, TranscodeType> a(com.bumptech.glide.load.a aVar) {
        this.j = aVar;
        this.k = new q(this.i, this.h, aVar);
        this.l = new com.bumptech.glide.load.resource.bitmap.h(new s(), this.h, aVar);
        super.a((com.bumptech.glide.load.e) new com.bumptech.glide.load.resource.file.c(new q(this.i, this.h, aVar)));
        super.b(new com.bumptech.glide.load.resource.bitmap.m(this.k, this.l));
        return this;
    }

    public final a<ModelType, TranscodeType> a(com.bumptech.glide.load.resource.bitmap.d... dVarArr) {
        super.a((com.bumptech.glide.load.g[]) dVarArr);
        return this;
    }

    public final a<ModelType, TranscodeType> c() {
        if (!Bitmap.class.isAssignableFrom(this.d)) {
            if (Drawable.class.isAssignableFrom(this.d)) {
                super.a((com.bumptech.glide.request.animation.f) new com.bumptech.glide.request.animation.c());
                return this;
            }
            String canonicalName = this.d.getCanonicalName();
            if (canonicalName == null) {
                canonicalName = this.d.toString();
            }
            throw new UnsupportedOperationException(".crossFade() is not supported for " + canonicalName + ", use .animate() to provide a compatible animation.");
        }
        super.a((com.bumptech.glide.request.animation.f) new com.bumptech.glide.request.animation.b());
        return this;
    }

    public final a<ModelType, TranscodeType> a(Drawable drawable) {
        super.d(drawable);
        return this;
    }

    public final a<ModelType, TranscodeType> b(Drawable drawable) {
        super.c(drawable);
        return this;
    }

    public final a<ModelType, TranscodeType> a(String str) {
        super.b(str);
        return this;
    }

    public final a<ModelType, TranscodeType> a(com.bumptech.glide.request.f<? super ModelType, TranscodeType> fVar) {
        super.b(fVar);
        return this;
    }

    public final a<ModelType, TranscodeType> a(boolean z) {
        super.b(z);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e d() {
        return (a) super.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(Object obj) {
        super.a((a<ModelType, TranscodeType>) obj);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.c cVar) {
        super.a(cVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(boolean z) {
        super.b(z);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(com.bumptech.glide.request.f fVar) {
        super.b(fVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e c(Drawable drawable) {
        super.c(drawable);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(int i) {
        super.a(i);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e d(Drawable drawable) {
        super.d(drawable);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.request.animation.f fVar) {
        super.a(fVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    @Deprecated
    public final /* bridge */ /* synthetic */ e a(Animation animation) {
        super.a(animation);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e e() {
        super.e();
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e f() {
        super.f();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.g<Bitmap>[] gVarArr) {
        super.a((com.bumptech.glide.load.g[]) gVarArr);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(int i) {
        super.b(i);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.engine.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.b<com.bumptech.glide.load.model.g> bVar) {
        super.a((com.bumptech.glide.load.b) bVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.e<File, Bitmap> eVar) {
        super.a((com.bumptech.glide.load.e) eVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, Bitmap> eVar) {
        super.b(eVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(String str) {
        super.b(str);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(float f) {
        super.a(f);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(float f) {
        super.b(f);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(e eVar) {
        super.a(eVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (a) super.clone();
    }
}
