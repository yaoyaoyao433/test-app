package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sm implements et {
    private so a;

    @Override // com.tencent.mapsdk.internal.et
    public final void a() {
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(float f) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(PointF pointF, PointF pointF2, double d, double d2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(PointF pointF, PointF pointF2, float f) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean b() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean b(float f) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean c() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean d() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean f(float f, float f2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean g(float f, float f2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean h(float f, float f2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean k(float f, float f2) {
        return false;
    }

    public sm(so soVar) {
        this.a = soVar;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(float f, float f2) {
        if (this.a != null && this.a.aw && this.a.av != null && this.a.aw) {
            return this.a.av.onDoubleTap(f, f2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
        r7 = com.tencent.mapsdk.internal.pa.a(r6.getId(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
        if (r0 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109 A[EDGE_INSN: B:81:0x0109->B:66:0x0109 ?: BREAK  , SYNTHETIC] */
    @Override // com.tencent.mapsdk.internal.et
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(float r14, float r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sm.b(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean c(float f, float f2) {
        if (this.a == null || !this.a.aw || this.a.av == null) {
            return false;
        }
        return this.a.av.onFling(f, f2);
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean d(float f, float f2) {
        if (this.a == null || !this.a.aw || this.a.av == null) {
            return false;
        }
        return this.a.av.onScroll(f, f2);
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean e(float f, float f2) {
        String c;
        if (this.a != null && this.a.aw) {
            so soVar = this.a;
            if (soVar.t != null && (c = soVar.c(f, f2)) != null && c.trim().length() != 0) {
                soVar.t.a(c);
            } else if (soVar.v != null && soVar.aw) {
                soVar.v.onMapLongClick(kb.a(((VectorMap) soVar.e_).getProjection().a(new fm(f, f2))));
            }
            if (this.a.av != null) {
                return this.a.av.onLongPress(f, f2);
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean i(float f, float f2) {
        if (this.a != null && this.a.aw) {
            this.a.aA++;
            if (this.a.av != null) {
                return this.a.av.onDown(f, f2);
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean j(float f, float f2) {
        int i;
        if (this.a != null && this.a.aw) {
            so soVar = this.a;
            if (this.a.aA > 0) {
                so soVar2 = this.a;
                i = soVar2.aA - 1;
                soVar2.aA = i;
            } else {
                i = 0;
            }
            soVar.aA = i;
            if (this.a.az && this.a.ay && this.a.aA == 0) {
                CameraPosition a = this.a.a();
                if (a == null) {
                    return false;
                }
                this.a.az = false;
                this.a.onCameraChangeFinished(a);
            }
            if (this.a.av != null) {
                return this.a.av.onUp(f, f2);
            }
            return false;
        }
        return false;
    }
}
