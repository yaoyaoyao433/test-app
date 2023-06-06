package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.m;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f<ModelType, DataType, ResourceType> extends e<ModelType, DataType, ResourceType, ResourceType> {
    private final com.bumptech.glide.load.model.l<ModelType, DataType> h;
    private final Class<DataType> i;
    private final Class<ResourceType> j;
    private final m.b k;

    private static <A, T, Z, R> com.bumptech.glide.provider.f<A, T, Z, R> a(i iVar, com.bumptech.glide.load.model.l<A, T> lVar, Class<T> cls, Class<Z> cls2, com.bumptech.glide.load.resource.transcode.c<Z, R> cVar) {
        return new com.bumptech.glide.provider.e(lVar, cVar, iVar.b(cls, cls2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Class<ResourceType> cls, e<ModelType, ?, ?, ?> eVar, com.bumptech.glide.load.model.l<ModelType, DataType> lVar, Class<DataType> cls2, Class<ResourceType> cls3, m.b bVar) {
        super(a(eVar.c, lVar, cls2, cls3, com.bumptech.glide.load.resource.transcode.e.b()), cls, eVar);
        this.h = lVar;
        this.i = cls2;
        this.j = cls3;
        this.k = bVar;
    }

    public f(Context context, i iVar, Class<ModelType> cls, com.bumptech.glide.load.model.l<ModelType, DataType> lVar, Class<DataType> cls2, Class<ResourceType> cls3, com.bumptech.glide.manager.l lVar2, com.bumptech.glide.manager.g gVar, m.b bVar) {
        super(context, cls, a(iVar, lVar, cls2, cls3, com.bumptech.glide.load.resource.transcode.e.b()), cls3, iVar, lVar2, gVar);
        this.h = lVar;
        this.i = cls2;
        this.j = cls3;
        this.k = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e<ModelType, DataType, File, File> a() {
        com.bumptech.glide.provider.e eVar = new com.bumptech.glide.provider.e(this.h, com.bumptech.glide.load.resource.transcode.e.b(), this.c.b(this.i, File.class));
        m.b bVar = this.k;
        return new e(eVar, File.class, this).b(l.d).a(com.bumptech.glide.load.engine.b.SOURCE).b(true);
    }
}
