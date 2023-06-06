package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.meituan.robust.common.StringUtil;
import com.tencent.mapsdk.internal.io;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ip {
    int a;
    io b;
    io c;
    Interpolator d;
    ArrayList<io> e = new ArrayList<>();
    iu f;

    public ip(io... ioVarArr) {
        this.a = ioVarArr.length;
        this.e.addAll(Arrays.asList(ioVarArr));
        this.b = this.e.get(0);
        this.c = this.e.get(this.a - 1);
        this.d = this.c.c;
    }

    private static ip a(int... iArr) {
        int length = iArr.length;
        io.b[] bVarArr = new io.b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (io.b) io.a();
            bVarArr[1] = (io.b) io.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (io.b) io.a(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                bVarArr[i] = (io.b) io.a(i / (length - 1), iArr[i]);
            }
        }
        return new in(bVarArr);
    }

    private static ip a(double... dArr) {
        int length = dArr.length;
        io.a[] aVarArr = new io.a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (io.a) io.b();
            aVarArr[1] = (io.a) io.a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (io.a) io.a(0.0f, dArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (io.a) io.a(i / (length - 1), dArr[i]);
            }
        }
        return new il(aVarArr);
    }

    private static ip a(io... ioVarArr) {
        int length = ioVarArr.length;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < length; i2++) {
            if (ioVarArr[i2] instanceof io.a) {
                z = true;
            } else if (ioVarArr[i2] instanceof io.b) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if (z && !z2 && !z3) {
            io.a[] aVarArr = new io.a[length];
            while (i < length) {
                aVarArr[i] = (io.a) ioVarArr[i];
                i++;
            }
            return new il(aVarArr);
        } else if (z2 && !z && !z3) {
            io.b[] bVarArr = new io.b[length];
            while (i < length) {
                bVarArr[i] = (io.b) ioVarArr[i];
                i++;
            }
            return new in(bVarArr);
        } else {
            return new ip(ioVarArr);
        }
    }

    public static ip a(Object... objArr) {
        int length = objArr.length;
        io.c[] cVarArr = new io.c[Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (io.c) io.c();
            cVarArr[1] = (io.c) io.a(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (io.c) io.a(0.0f, objArr[0]);
            for (int i = 1; i < length; i++) {
                cVarArr[i] = (io.c) io.a(i / (length - 1), objArr[i]);
            }
        }
        return new ip(cVarArr);
    }

    private void a(iu iuVar) {
        this.f = iuVar;
    }

    @Override // 
    /* renamed from: a */
    public ip clone() {
        ArrayList<io> arrayList = this.e;
        int size = this.e.size();
        io[] ioVarArr = new io[size];
        for (int i = 0; i < size; i++) {
            ioVarArr[i] = arrayList.get(i).clone();
        }
        return new ip(ioVarArr);
    }

    public Object a(float f) {
        if (this.a == 2) {
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            return this.f.a(f, this.b.d(), this.c.d());
        }
        int i = 1;
        if (f <= 0.0f) {
            io ioVar = this.e.get(1);
            Interpolator interpolator = ioVar.c;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            float f2 = this.b.a;
            return this.f.a((f - f2) / (ioVar.a - f2), this.b.d(), ioVar.d());
        } else if (f >= 1.0f) {
            io ioVar2 = this.e.get(this.a - 2);
            Interpolator interpolator2 = this.c.c;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float f3 = ioVar2.a;
            return this.f.a((f - f3) / (this.c.a - f3), ioVar2.d(), this.c.d());
        } else {
            io ioVar3 = this.b;
            while (i < this.a) {
                io ioVar4 = this.e.get(i);
                if (f < ioVar4.a) {
                    Interpolator interpolator3 = ioVar4.c;
                    if (interpolator3 != null) {
                        f = interpolator3.getInterpolation(f);
                    }
                    float f4 = ioVar3.a;
                    return this.f.a((f - f4) / (ioVar4.a - f4), ioVar3.d(), ioVar4.d());
                }
                i++;
                ioVar3 = ioVar4;
            }
            return this.c.d();
        }
    }

    public String toString() {
        String str = StringUtil.SPACE;
        for (int i = 0; i < this.a; i++) {
            str = str + this.e.get(i).d() + "  ";
        }
        return str;
    }
}
