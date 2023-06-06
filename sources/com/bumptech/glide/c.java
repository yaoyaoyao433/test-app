package com.bumptech.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import com.squareup.picasso.PicassoDrawable;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c<ModelType> extends e<ModelType, com.bumptech.glide.load.model.g, com.bumptech.glide.load.resource.gifbitmap.a, PicassoDrawable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, Class<ModelType> cls, com.bumptech.glide.provider.f<ModelType, com.bumptech.glide.load.model.g, com.bumptech.glide.load.resource.gifbitmap.a, PicassoDrawable> fVar, i iVar, com.bumptech.glide.manager.l lVar, com.bumptech.glide.manager.g gVar) {
        super(context, cls, fVar, PicassoDrawable.class, iVar, lVar, gVar);
        a();
    }

    public final c<ModelType> a() {
        super.a((com.bumptech.glide.request.animation.f) new com.bumptech.glide.request.animation.c());
        return this;
    }

    public final c<ModelType> a(Drawable drawable) {
        super.d(drawable);
        return this;
    }

    public final c<ModelType> b(Drawable drawable) {
        super.c(drawable);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c<ModelType> a(com.bumptech.glide.request.f<? super ModelType, PicassoDrawable> fVar) {
        super.b((com.bumptech.glide.request.f) fVar);
        return this;
    }

    public final c<ModelType> b(com.bumptech.glide.load.engine.b bVar) {
        super.a(bVar);
        return this;
    }

    public final c<ModelType> a(boolean z) {
        super.b(z);
        return this;
    }

    public final c<ModelType> b(com.bumptech.glide.load.c cVar) {
        super.a(cVar);
        return this;
    }

    public final c<ModelType> b(ModelType modeltype) {
        super.a((c<ModelType>) modeltype);
        return this;
    }

    public final c<ModelType> a(com.bumptech.glide.load.resource.bitmap.d... dVarArr) {
        com.bumptech.glide.load.resource.gifbitmap.f[] fVarArr = new com.bumptech.glide.load.resource.gifbitmap.f[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            fVarArr[i] = new com.bumptech.glide.load.resource.gifbitmap.f(this.c.b, dVarArr[i], dVarArr);
        }
        super.a((com.bumptech.glide.load.g[]) fVarArr);
        return this;
    }

    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e d() {
        return (c) super.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e a(Object obj) {
        super.a((c<ModelType>) obj);
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
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.request.animation.f<PicassoDrawable> fVar) {
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
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.g<com.bumptech.glide.load.resource.gifbitmap.a>[] gVarArr) {
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
    public final /* bridge */ /* synthetic */ e a(com.bumptech.glide.load.e<File, com.bumptech.glide.load.resource.gifbitmap.a> eVar) {
        super.a((com.bumptech.glide.load.e) eVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.e
    public final /* bridge */ /* synthetic */ e b(com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, com.bumptech.glide.load.resource.gifbitmap.a> eVar) {
        super.b((com.bumptech.glide.load.e) eVar);
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
    public final /* bridge */ /* synthetic */ e a(e<?, ?, ?, PicassoDrawable> eVar) {
        super.a((e) eVar);
        return this;
    }

    @Override // com.bumptech.glide.e
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (c) super.clone();
    }
}
