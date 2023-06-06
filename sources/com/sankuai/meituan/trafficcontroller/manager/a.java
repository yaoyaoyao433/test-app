package com.sankuai.meituan.trafficcontroller.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.trafficcontroller.bean.TrafficStrategy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    long b;
    TrafficStrategy c;

    public a(TrafficStrategy trafficStrategy) {
        Object[] objArr = {trafficStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9403b44a84ecacbf7dbd8ee434a1b6cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9403b44a84ecacbf7dbd8ee434a1b6cf");
        } else {
            this.c = trafficStrategy;
        }
    }
}
