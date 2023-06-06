package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.vector.VectorMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class st implements fe {
    private final so a;

    public st(so soVar) {
        this.a = soVar;
    }

    @Override // com.tencent.mapsdk.internal.fe
    public final void b(int i) {
        if (this.a == null || i != fw.c) {
            return;
        }
        so soVar = this.a;
        int r = ((VectorMap) soVar.e_).r();
        soVar.ab = true;
        soVar.ac = true;
        if (r <= soVar.aa) {
            soVar.ac = false;
        } else if (r >= soVar.Z) {
            soVar.ab = false;
        }
        if (!soVar.q.isEmpty()) {
            fs fsVar = new fs();
            fsVar.f = 0;
            fsVar.g = soVar.ab;
            fsVar.h = soVar.ac;
            for (ez ezVar : soVar.q) {
                ezVar.a(fsVar);
            }
        }
        so soVar2 = this.a;
        if (soVar2.q.isEmpty()) {
            return;
        }
        fs fsVar2 = new fs();
        fsVar2.f = 0;
        fsVar2.g = soVar2.ab;
        fsVar2.h = soVar2.ac;
        for (ez ezVar2 : soVar2.q) {
            ezVar2.a(fsVar2);
        }
    }
}
