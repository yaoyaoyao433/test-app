package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g<ModelType> extends e<ModelType, InputStream, com.bumptech.glide.load.resource.gif.b, com.bumptech.glide.load.resource.gif.b> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.bumptech.glide.provider.f<ModelType, InputStream, com.bumptech.glide.load.resource.gif.b, com.bumptech.glide.load.resource.gif.b> fVar, Class<com.bumptech.glide.load.resource.gif.b> cls, e<ModelType, ?, ?, ?> eVar) {
        super(fVar, cls, eVar);
    }

    public final g<ModelType> a(com.bumptech.glide.load.resource.bitmap.d... dVarArr) {
        com.bumptech.glide.load.g[] gVarArr = {new com.bumptech.glide.load.d(dVarArr)};
        com.bumptech.glide.load.resource.gif.e[] eVarArr = new com.bumptech.glide.load.resource.gif.e[1];
        for (int i = 0; i <= 0; i++) {
            eVarArr[0] = new com.bumptech.glide.load.resource.gif.e(gVarArr[0], this.c.b);
        }
        super.a((com.bumptech.glide.load.g[]) eVarArr);
        return this;
    }

    public final g<ModelType> a() {
        super.a((com.bumptech.glide.request.animation.f) new com.bumptech.glide.request.animation.c());
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e d() {
        return (g) super.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(Object obj) {
        super.a((g<ModelType>) obj);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.request.animation.f<com.bumptech.glide.load.resource.gif.b> fVar) {
        super.a((com.bumptech.glide.request.animation.f) fVar);
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
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.g<com.bumptech.glide.load.resource.gif.b>[] gVarArr) {
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
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.b<InputStream> bVar) {
        super.a((com.bumptech.glide.load.b) bVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.e<File, com.bumptech.glide.load.resource.gif.b> eVar) {
        super.a((com.bumptech.glide.load.e) eVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(com.bumptech.glide.load.e<InputStream, com.bumptech.glide.load.resource.gif.b> eVar) {
        super.b(eVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(e<?, ?, ?, com.bumptech.glide.load.resource.gif.b> eVar) {
        super.a((e) eVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (g) super.clone();
    }
}
