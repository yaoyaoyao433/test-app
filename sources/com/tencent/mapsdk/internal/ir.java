package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.io;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ir implements Cloneable {
    private static final iu<Integer> d = new im();
    private static final iu<Number> e = new ik();
    int a;
    Class<?> b;
    ip c;
    private iu f;
    private Object g;

    /* synthetic */ ir(int i, byte b2) {
        this(i);
    }

    private ir(int i) {
        this.c = null;
        this.a = i;
    }

    public static ir a(int i, int... iArr) {
        return new b(i, iArr);
    }

    public static ir a(int i, double... dArr) {
        return new a(i, dArr);
    }

    public static ir a(int i, Object... objArr) {
        ir irVar = new ir(i);
        irVar.a(objArr);
        irVar.a((iu) null);
        return irVar;
    }

    public void a(int... iArr) {
        this.b = Integer.TYPE;
        int length = iArr.length;
        io.b[] bVarArr = new io.b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = new io.b();
            bVarArr[1] = (io.b) io.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (io.b) io.a(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                bVarArr[i] = (io.b) io.a(i / (length - 1), iArr[i]);
            }
        }
        this.c = new in(bVarArr);
    }

    public void a(double... dArr) {
        this.b = Double.TYPE;
        int length = dArr.length;
        io.a[] aVarArr = new io.a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = new io.a();
            aVarArr[1] = (io.a) io.a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (io.a) io.a(0.0f, dArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (io.a) io.a(i / (length - 1), dArr[i]);
            }
        }
        this.c = new il(aVarArr);
    }

    private void a(io... ioVarArr) {
        int length = ioVarArr.length;
        io[] ioVarArr2 = new io[Math.max(length, 2)];
        for (int i = 0; i < length; i++) {
            ioVarArr2[i] = ioVarArr[i];
        }
        this.c = new ip(ioVarArr2);
    }

    public final void a(Object... objArr) {
        this.b = objArr[0].getClass();
        this.c = ip.a(objArr);
    }

    @Override // 
    /* renamed from: a */
    public ir clone() {
        try {
            ir irVar = (ir) super.clone();
            irVar.a = this.a;
            irVar.c = this.c.clone();
            irVar.f = this.f;
            return irVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    void a(id idVar) {
        if (idVar != null) {
            idVar.a(this.a, b());
        }
    }

    private void c() {
        if (this.f == null) {
            this.f = this.b == Integer.class ? d : this.b == Double.class ? e : null;
        }
        if (this.f != null) {
            this.c.f = this.f;
        }
    }

    public final void a(iu iuVar) {
        this.f = iuVar;
        this.c.f = iuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        this.g = this.c.a(f);
    }

    private void a(int i) {
        this.a = i;
    }

    private int d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object b() {
        return this.g;
    }

    public String toString() {
        return this.a + ": " + this.c.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends ir {
        in d;
        int e;

        private b(int i, in inVar) {
            super(i, (byte) 0);
            this.b = Integer.TYPE;
            this.c = inVar;
            this.d = (in) this.c;
        }

        public b(int i, int... iArr) {
            super(i, (byte) 0);
            a(iArr);
        }

        @Override // com.tencent.mapsdk.internal.ir
        public final void a(int... iArr) {
            super.a(iArr);
            this.d = (in) this.c;
        }

        @Override // com.tencent.mapsdk.internal.ir
        final void a(float f) {
            this.e = this.d.b(f);
        }

        @Override // com.tencent.mapsdk.internal.ir
        final Object b() {
            return Integer.valueOf(this.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.ir
        /* renamed from: c */
        public b clone() {
            b bVar = (b) super.clone();
            bVar.d = (in) bVar.c;
            return bVar;
        }

        @Override // com.tencent.mapsdk.internal.ir
        final void a(id idVar) {
            if (idVar != null) {
                idVar.a(this.a, Integer.valueOf(this.e));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends ir {
        il d;
        double e;

        private a(int i, il ilVar) {
            super(i, (byte) 0);
            this.b = Float.TYPE;
            this.c = ilVar;
            this.d = (il) this.c;
        }

        public a(int i, double... dArr) {
            super(i, (byte) 0);
            a(dArr);
        }

        @Override // com.tencent.mapsdk.internal.ir
        public final void a(double... dArr) {
            super.a(dArr);
            this.d = (il) this.c;
        }

        @Override // com.tencent.mapsdk.internal.ir
        final void a(float f) {
            this.e = this.d.b(f);
        }

        @Override // com.tencent.mapsdk.internal.ir
        final Object b() {
            return Double.valueOf(this.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.ir
        /* renamed from: c */
        public a clone() {
            a aVar = (a) super.clone();
            aVar.d = (il) aVar.c;
            return aVar;
        }

        @Override // com.tencent.mapsdk.internal.ir
        final void a(id idVar) {
            if (idVar != null) {
                idVar.a(this.a, Double.valueOf(this.e));
            }
        }
    }

    private static ir a(int i, io... ioVarArr) {
        ip ipVar;
        int length = ioVarArr.length;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < length; i3++) {
            if (ioVarArr[i3] instanceof io.a) {
                z = true;
            } else if (ioVarArr[i3] instanceof io.b) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if (z && !z2 && !z3) {
            io.a[] aVarArr = new io.a[length];
            while (i2 < length) {
                aVarArr[i2] = (io.a) ioVarArr[i2];
                i2++;
            }
            ipVar = new il(aVarArr);
        } else if (z2 && !z && !z3) {
            io.b[] bVarArr = new io.b[length];
            while (i2 < length) {
                bVarArr[i2] = (io.b) ioVarArr[i2];
                i2++;
            }
            ipVar = new in(bVarArr);
        } else {
            ipVar = new ip(ioVarArr);
        }
        ir irVar = new ir(i);
        irVar.c = ipVar;
        return irVar;
    }
}
