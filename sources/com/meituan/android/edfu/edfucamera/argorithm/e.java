package com.meituan.android.edfu.edfucamera.argorithm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public byte[] f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public long l;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5609692248dfa4127757351947112bc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5609692248dfa4127757351947112bc9");
            return;
        }
        this.i = -1;
        this.k = true;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b506cf98fc9991d2d4e07a5bc359903e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b506cf98fc9991d2d4e07a5bc359903e");
            return;
        }
        this.f = null;
        this.h = 0;
        this.g = 0;
        this.c = 0;
        this.b = 0;
        this.i = -1;
        this.k = false;
    }
}
