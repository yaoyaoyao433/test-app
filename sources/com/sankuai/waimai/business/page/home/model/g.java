package com.sankuai.waimai.business.page.home.model;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    private long g;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2aa5b9abaa53525c6934e196aeee83d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2aa5b9abaa53525c6934e196aeee83d");
            return;
        }
        this.g = 0L;
        this.b = "";
        this.c = "";
        this.e = Statistics.getSession();
        this.f = OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
    }
}
