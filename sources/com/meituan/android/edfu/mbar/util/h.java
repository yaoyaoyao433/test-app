package com.meituan.android.edfu.mbar.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static final String c = "h";
    private int d;
    private boolean e;
    private long f;
    private int g;
    private int h;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd8855cc2a5ccd6864c90eac54da827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd8855cc2a5ccd6864c90eac54da827");
            return;
        }
        this.d = 0;
        this.e = true;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
    }
}
