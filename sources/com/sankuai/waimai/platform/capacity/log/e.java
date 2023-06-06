package com.sankuai.waimai.platform.capacity.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    public e(String str, String str2, String str3, int i, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be6ad1f58fa960550f4d8e515d650e14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be6ad1f58fa960550f4d8e515d650e14");
            return;
        }
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = i;
        this.d = str4;
    }
}
