package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import com.squareup.picasso.MonitorData;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements l<a> {
    private final a a;
    private MonitorData b;

    @Override // com.bumptech.glide.load.engine.l
    public final String b() {
        return null;
    }

    public b(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.a = aVar;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final int c() {
        a aVar = this.a;
        if (aVar.b != null) {
            return aVar.b.c();
        }
        return aVar.a.c();
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void d() {
        l<Bitmap> lVar = this.a.b;
        if (lVar != null) {
            lVar.d();
        }
        l<com.bumptech.glide.load.resource.gif.b> lVar2 = this.a.a;
        if (lVar2 != null) {
            lVar2.d();
        }
    }

    @Override // com.bumptech.glide.load.engine.l
    public final MonitorData e() {
        if (this.b != null) {
            return this.b;
        }
        a aVar = this.a;
        if (aVar != null) {
            l<Bitmap> lVar = aVar.b;
            l<com.bumptech.glide.load.resource.gif.b> lVar2 = aVar.a;
            if (lVar != null) {
                return lVar.e();
            }
            if (lVar2 != null) {
                return lVar2.e();
            }
            return null;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void a(MonitorData monitorData) {
        this.b = monitorData;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final /* bridge */ /* synthetic */ a a() {
        return this.a;
    }
}
