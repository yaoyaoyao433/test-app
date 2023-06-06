package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class iq extends iv {
    int b;

    private void a(int i) {
        if (this.k != null) {
            ir irVar = this.k[0];
            this.l.remove(Integer.valueOf(irVar.a));
            this.l.put(Integer.valueOf(i), irVar);
        }
        this.b = i;
    }

    private int o() {
        return this.b;
    }

    private iq(id idVar) {
        super(idVar);
    }

    private iq(id idVar, int i) {
        super(idVar);
        if (this.k != null) {
            ir irVar = this.k[0];
            this.l.remove(Integer.valueOf(irVar.a));
            this.l.put(Integer.valueOf(i), irVar);
        }
        this.b = i;
    }

    public static iq a(id idVar, int... iArr) {
        iq iqVar = new iq(idVar, 0);
        iqVar.a(iArr);
        return iqVar;
    }

    public static iq a(id idVar, int i, double... dArr) {
        iq iqVar = new iq(idVar, i);
        iqVar.a(dArr);
        return iqVar;
    }

    public static iq a(id idVar, iu iuVar, Object[] objArr) {
        iq iqVar = new iq(idVar, 1);
        iqVar.a(objArr);
        iqVar.a(iuVar);
        return iqVar;
    }

    private static iq a(id idVar, ir... irVarArr) {
        iq iqVar = new iq(idVar);
        iqVar.a(irVarArr);
        return iqVar;
    }

    @Override // com.tencent.mapsdk.internal.iv
    public final void a(int... iArr) {
        if (this.k == null || this.k.length == 0) {
            a(ir.a(this.b, iArr));
        } else {
            super.a(iArr);
        }
    }

    @Override // com.tencent.mapsdk.internal.iv
    public final void a(double... dArr) {
        if (this.k == null || this.k.length == 0) {
            a(ir.a(this.b, dArr));
        } else {
            super.a(dArr);
        }
    }

    @Override // com.tencent.mapsdk.internal.iv
    public final void a(Object... objArr) {
        if (this.k == null || this.k.length == 0) {
            a(ir.a(this.b, objArr));
        } else {
            super.a(objArr);
        }
    }

    private iq e(long j) {
        super.b(j);
        return this;
    }

    private id p() {
        return this.m;
    }

    private iq q() {
        return (iq) super.clone();
    }

    @Override // com.tencent.mapsdk.internal.iv
    public final String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.m;
        if (this.k != null) {
            for (int i = 0; i < this.k.length; i++) {
                str = str + "\n    " + this.k[i].toString();
            }
        }
        return str;
    }

    @Override // com.tencent.mapsdk.internal.iv, com.tencent.mapsdk.internal.ig
    public final /* bridge */ /* synthetic */ ig h() {
        return (iq) super.clone();
    }

    @Override // com.tencent.mapsdk.internal.iv, com.tencent.mapsdk.internal.ig
    public final /* bridge */ /* synthetic */ ig b(long j) {
        super.b(j);
        return this;
    }

    @Override // com.tencent.mapsdk.internal.iv, com.tencent.mapsdk.internal.ig
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (iq) super.clone();
    }
}
