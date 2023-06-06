package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.qo;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qm implements qo.a {
    public static final String a = "rastermap/handdraw";
    private static final int c = 4;
    private static final int d = 20;
    private so f;
    private TileOverlayOptions g;
    private final Object e = new Object();
    public TileOverlay b = null;

    public qm(so soVar) {
        this.f = null;
        this.f = soVar;
        if (this.f != null) {
            ql.a(this.f.G());
            qo qoVar = new qo(this.f.G(), this);
            com.sankuai.waimai.launcher.util.aop.b.a(new qo.b(qoVar, (byte) 0), qoVar.a);
        }
    }

    public final void a() {
        Field[] declaredFields;
        if (this.b != null || this.f == null || this.f.e_ == 0) {
            return;
        }
        VectorMap vectorMap = (VectorMap) this.f.e_;
        if (this.g == null) {
            this.g = new TileOverlayOptions();
            this.g.tileProvider(new qn(this.g)).diskCacheDir(a).zIndex(2);
        }
        vectorMap.b(19);
        this.b = vectorMap.addTileOverlay(this.g);
        synchronized (this.e) {
            if (this.b == null) {
                return;
            }
            for (Field field : this.b.getClass().getDeclaredFields()) {
                if (field.getType() == qc.class) {
                    try {
                        field.setAccessible(true);
                        ((qc) field.get(this.b)).a(4, 20);
                        field.setAccessible(false);
                        return;
                    } catch (IllegalAccessException e) {
                        kj.b("SketchOverlayManager set data level with reflect", e);
                        return;
                    }
                }
            }
        }
    }

    private void d() {
        if (this.g != null) {
            qn qnVar = (qn) this.g.getTileProvider();
            qn.a = ql.a();
            if (qnVar.b != null) {
                qnVar.b.versionInfo(qn.a());
            }
        }
        synchronized (this.e) {
            if (this.b != null) {
                this.b.clearTileCache();
                this.b.reload();
            }
        }
    }

    public final void b() {
        synchronized (this.e) {
            if (this.b == null) {
                return;
            }
            this.b.remove();
            this.b = null;
        }
    }

    private boolean e() {
        return this.b != null;
    }

    private void f() {
        Field[] declaredFields;
        synchronized (this.e) {
            if (this.b == null) {
                return;
            }
            for (Field field : this.b.getClass().getDeclaredFields()) {
                if (field.getType() == qc.class) {
                    try {
                        field.setAccessible(true);
                        ((qc) field.get(this.b)).a(4, 20);
                        field.setAccessible(false);
                        return;
                    } catch (IllegalAccessException e) {
                        kj.b("SketchOverlayManager set data level with reflect", e);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.qo.a
    public final void c() {
        if (this.g != null) {
            qn qnVar = (qn) this.g.getTileProvider();
            qn.a = ql.a();
            if (qnVar.b != null) {
                qnVar.b.versionInfo(qn.a());
            }
        }
        synchronized (this.e) {
            if (this.b != null) {
                this.b.clearTileCache();
                this.b.reload();
            }
        }
    }
}
