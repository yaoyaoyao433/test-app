package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.vector.VectorMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sj implements bb {
    private final so a;

    public sj(so soVar) {
        this.a = soVar;
    }

    @Override // com.tencent.mapsdk.internal.bb
    public final void a(v vVar) {
        if (this.a == null) {
            return;
        }
        if (vVar != null) {
            this.a.a(((VectorMap) this.a.e_).o.t.a());
        }
        so soVar = this.a;
        if (soVar.B == null || !soVar.B.getLooper().getThread().isAlive()) {
            return;
        }
        soVar.B.sendEmptyMessage(0);
    }
}
