package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.tools.Callback;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rc implements VisualLayer {
    private static final int b = 15;
    rd a;
    private dw c;
    private List<VisualLayer.OnLayerStatusChangedListener> d;
    private int e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private boolean j;
    private final String k;
    private VectorOverlay l;
    private ed m;
    private boolean n = true;
    private volatile int o = -1;

    public rc(VisualLayerOptions visualLayerOptions) {
        this.k = visualLayerOptions.getLayerId();
        a(visualLayerOptions);
    }

    private void a(rd rdVar) {
        this.a = rdVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getLevel() {
        return this.e;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setLevel(int i) {
        if (this.e == i || i == 0) {
            return;
        }
        this.e = i;
        if (this.l != null) {
            this.l.setLevel(this.e);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(int i) {
        if (this.f != i) {
            this.f = i;
            if (this.l != null) {
                this.l.setZIndex(this.f);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(float f) {
        setZIndex((int) f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getZIndex() {
        return this.f;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void setTimeInterval(int i) {
        if (this.g != i) {
            this.n = true;
            this.g = i;
            if (this.g > 0 && this.g < 15) {
                this.g = 15;
            }
            c(this.c);
        }
    }

    private int b() {
        return this.g;
    }

    private <T extends ed> T c() {
        return (T) this.m;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void addLayerStatusChangedListener(VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.remove(onLayerStatusChangedListener);
        this.d.add(onLayerStatusChangedListener);
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void removeLayerStatusChangedListener(VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        if (this.d != null) {
            this.d.remove(onLayerStatusChangedListener);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final void setAlpha(float f) {
        if (this.h != f) {
            this.h = f;
            if (this.l != null) {
                this.l.setOpacity(this.h);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final float getAlpha() {
        return this.h;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        if (this.d != null) {
            this.d.clear();
            this.d = null;
        }
        a();
        if (this.c != null) {
            this.c.a(this.k);
            this.c = null;
        }
        this.i = true;
    }

    public final void a() {
        if (this.l != null) {
            this.l.remove();
            this.l = null;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final boolean isRemoved() {
        return this.i;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        if (isRemoved() || TextUtils.isEmpty(this.k)) {
            return;
        }
        a();
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void clearCache() {
        if (isRemoved() || TextUtils.isEmpty(this.k) || this.c == null) {
            return;
        }
        this.c.b(this.k);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final boolean isVisible() {
        return this.j;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (this.l != null) {
                this.l.setVisibility(this.j);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final String getId() {
        return this.k;
    }

    public final void a(final dw dwVar) {
        this.c = dwVar;
        if (dwVar.c(this.k)) {
            dwVar.a(this.k, new Callback<byte[]>() { // from class: com.tencent.mapsdk.internal.rc.1
                @Override // com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(byte[] bArr) {
                    byte[] bArr2 = bArr;
                    StringBuilder sb = new StringBuilder("读取本地图层数据[");
                    sb.append(bArr2 != null ? bArr2.length : 0);
                    sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    kj.b(ki.x, sb.toString());
                    if (bArr2 != null && bArr2.length > 0 && rc.this.a(bArr2)) {
                        rc.a(rc.this, dwVar);
                    }
                    rc.this.b(dwVar);
                }

                private void a(byte[] bArr) {
                    StringBuilder sb = new StringBuilder("读取本地图层数据[");
                    sb.append(bArr != null ? bArr.length : 0);
                    sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    kj.b(ki.x, sb.toString());
                    if (bArr != null && bArr.length > 0 && rc.this.a(bArr)) {
                        rc.a(rc.this, dwVar);
                    }
                    rc.this.b(dwVar);
                }
            });
        } else if (dwVar.a()) {
            a(2);
        } else {
            dwVar.d(this.k);
        }
    }

    public final void b(final dw dwVar) {
        if (dwVar == null) {
            return;
        }
        dwVar.b(this.k, new Callback<byte[]>() { // from class: com.tencent.mapsdk.internal.rc.2
            @Override // com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(byte[] bArr) {
                byte[] bArr2 = bArr;
                if (bArr2 != null && bArr2.length > 0 && rc.this.a(bArr2)) {
                    rc.a(rc.this, dwVar);
                    dwVar.a(rc.this.k, bArr2);
                }
                rc.this.c(dwVar);
            }

            private void a(byte[] bArr) {
                if (bArr != null && bArr.length > 0 && rc.this.a(bArr)) {
                    rc.a(rc.this, dwVar);
                    dwVar.a(rc.this.k, bArr);
                }
                rc.this.c(dwVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(dw dwVar) {
        if (dwVar == null || !this.n) {
            return;
        }
        this.n = false;
        if (this.g > 0) {
            if (this.g < 15) {
                this.g = 15;
            }
            dwVar.a(this.k, this.g);
            return;
        }
        dwVar.e(this.k);
    }

    public final void a(VisualLayerOptions visualLayerOptions) {
        if (visualLayerOptions != null) {
            setAlpha(visualLayerOptions.getAlpha());
            setLevel(visualLayerOptions.getLevel());
            setTimeInterval(visualLayerOptions.getTimeInterval());
            setVisible(visualLayerOptions.isVisible());
            setZIndex(visualLayerOptions.getZIndex());
        }
    }

    public final boolean a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("#parseLayerData[");
        sb.append(bArr != null ? bArr.length : 0);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        kj.b(ki.x, sb.toString());
        this.m = this.a != null ? this.a.a(bArr) : null;
        if (this.m != null && this.c != null && this.m.c()) {
            this.c.a(getId(), this.m.a(), this.m.b());
            kj.b(ki.x, "创建Protocol对象：成功");
            return true;
        }
        a(3);
        kj.d(ki.x, "创建Protocol对象：失败");
        return false;
    }

    private ed b(byte[] bArr) {
        if (this.a != null) {
            return this.a.a(bArr);
        }
        return null;
    }

    private BaseOverlayProvider a(ed edVar) {
        if (this.a != null) {
            return this.a.a(edVar);
        }
        return null;
    }

    private void d(dw dwVar) {
        kj.b(ki.x, "#drawLayer");
        if (this.m == null || !this.m.c() || dwVar == null) {
            return;
        }
        BaseOverlayProvider a = this.a != null ? this.a.a(this.m) : null;
        if (a == null) {
            kj.d(ki.x, "创建OverlayProvider失败");
            a(4);
            return;
        }
        kj.b(ki.x, "创建OverlayProvider:".concat(String.valueOf(a)));
        if (this.l == null) {
            this.l = dwVar.c_().b.getMap().addVectorOverlay(a);
            kj.b(ki.x, "创建Overlay:" + this.l);
        } else {
            dwVar.c_().b.getMap().updateVectorOverlay(this.l, a);
            kj.b(ki.x, "更新Overlay:" + this.l);
        }
        a(0);
    }

    public final void a(final int i) {
        kj.b(ki.x, "notifyStatusChange want from[" + this.o + "]to[" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.rc.3
            @Override // java.lang.Runnable
            public final void run() {
                if (rc.a(rc.this, i) && rc.this.d != null) {
                    kj.b(ki.x, "notifyStatusChange do success");
                    for (VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener : new ArrayList(rc.this.d)) {
                        if (onLayerStatusChangedListener != null) {
                            onLayerStatusChangedListener.onLayerLoadFinish(i);
                        }
                    }
                }
            }
        }, 10L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r3 > r2.o) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(int r3) {
        /*
            r2 = this;
            int r0 = r2.o
            r1 = 0
            if (r0 != r3) goto L6
            return r1
        L6:
            int r0 = r2.o
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L10;
                case 2: goto L10;
                case 3: goto L10;
                case 4: goto L10;
                default: goto Lb;
            }
        Lb:
            goto L12
        Lc:
            int r0 = r2.o
            if (r3 <= r0) goto L12
        L10:
            int r3 = r2.o
        L12:
            int r0 = r2.o
            if (r0 != r3) goto L17
            return r1
        L17:
            r2.o = r3
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rc.b(int):boolean");
    }

    static /* synthetic */ void a(rc rcVar, dw dwVar) {
        kj.b(ki.x, "#drawLayer");
        if (rcVar.m == null || !rcVar.m.c() || dwVar == null) {
            return;
        }
        BaseOverlayProvider a = rcVar.a != null ? rcVar.a.a(rcVar.m) : null;
        if (a == null) {
            kj.d(ki.x, "创建OverlayProvider失败");
            rcVar.a(4);
            return;
        }
        kj.b(ki.x, "创建OverlayProvider:".concat(String.valueOf(a)));
        if (rcVar.l == null) {
            rcVar.l = dwVar.c_().b.getMap().addVectorOverlay(a);
            kj.b(ki.x, "创建Overlay:" + rcVar.l);
        } else {
            dwVar.c_().b.getMap().updateVectorOverlay(rcVar.l, a);
            kj.b(ki.x, "更新Overlay:" + rcVar.l);
        }
        rcVar.a(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r3 > r2.o) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ boolean a(com.tencent.mapsdk.internal.rc r2, int r3) {
        /*
            int r0 = r2.o
            r1 = 0
            if (r0 != r3) goto L6
            return r1
        L6:
            int r0 = r2.o
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L10;
                case 2: goto L10;
                case 3: goto L10;
                case 4: goto L10;
                default: goto Lb;
            }
        Lb:
            goto L12
        Lc:
            int r0 = r2.o
            if (r3 <= r0) goto L12
        L10:
            int r3 = r2.o
        L12:
            int r0 = r2.o
            if (r0 != r3) goto L17
            return r1
        L17:
            r2.o = r3
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rc.a(com.tencent.mapsdk.internal.rc, int):boolean");
    }
}
