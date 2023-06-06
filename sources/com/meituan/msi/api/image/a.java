package com.meituan.msi.api.image;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    String d;

    public a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4079da7fa80bcb58e2c0e4294d2ed205", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4079da7fa80bcb58e2c0e4294d2ed205");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
