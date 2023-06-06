package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    Activity b;
    long c;
    String d;
    String e;
    private String f;

    public h(Activity activity, String str, long j, String str2, String str3) {
        Object[] objArr = {activity, str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0f3b52ecbda3f7f3b9eb2dc71ec01e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0f3b52ecbda3f7f3b9eb2dc71ec01e");
            return;
        }
        this.b = activity;
        this.f = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
    }
}
