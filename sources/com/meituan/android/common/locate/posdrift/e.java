package com.meituan.android.common.locate.posdrift;

import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MtLocation a;
    private double b;
    private boolean c;
    private String d;

    public e(MtLocation mtLocation, double d, boolean z, String str) {
        Object[] objArr = {mtLocation, Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a4c8e370771f1a9d46bdda0091332f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a4c8e370771f1a9d46bdda0091332f");
            return;
        }
        this.a = mtLocation;
        this.b = d;
        this.c = z;
        this.d = str;
    }

    public double a() {
        return this.b;
    }

    public MtLocation b() {
        return this.a;
    }
}
