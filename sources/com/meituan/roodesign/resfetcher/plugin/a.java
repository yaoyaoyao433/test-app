package com.meituan.roodesign.resfetcher.plugin;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public int d;
    public int e;
    private String f;
    private boolean g;

    public a(String str, String str2, int i, int i2, int i3, boolean z) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1ac186569da461baa1141f1e12b6b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1ac186569da461baa1141f1e12b6b7");
            return;
        }
        this.f = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
    }
}
