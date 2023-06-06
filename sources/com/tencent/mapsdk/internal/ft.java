package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ft {
    public fu a;
    public fu[] b;
    public float c;

    public ft(fu fuVar, fu[] fuVarArr, float f) {
        this.a = fuVar;
        this.b = fuVarArr;
        this.c = f;
    }

    public final void a(fu fuVar, fu[] fuVarArr, float f) {
        this.a = fuVar;
        this.b = fuVarArr;
        this.c = f;
    }

    private fu b() {
        return this.a;
    }

    private fu[] c() {
        return this.b;
    }

    private float d() {
        return this.c;
    }

    public final boolean a(ft ftVar) {
        if (ftVar != null && Float.compare(ftVar.c, this.c) <= 0) {
            if (this.a == null || ftVar.a == null || kt.a(this.a, ftVar.a) <= 50.0d) {
                if (this.b != null && ftVar.b != null && this.b.length == ftVar.b.length) {
                    for (int i = 0; i < this.b.length; i++) {
                        if (kt.a(this.b[i], ftVar.b[i]) > 50.0d) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public final ft clone() {
        return new ft(this.a, this.b, this.c);
    }
}
