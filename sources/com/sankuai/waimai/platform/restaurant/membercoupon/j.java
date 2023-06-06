package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;
    a b;
    Activity c;
    long d;
    String e;
    String f;
    String g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);
    }

    public j(Activity activity, String str, long j, String str2, String str3, a aVar) {
        Object[] objArr = {activity, str, new Long(j), str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f93702a7c71c88ae0065255121ee8d45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f93702a7c71c88ae0065255121ee8d45");
            return;
        }
        this.c = activity;
        this.d = j;
        this.e = str2;
        this.f = str3;
        this.g = str;
        this.b = aVar;
    }
}
