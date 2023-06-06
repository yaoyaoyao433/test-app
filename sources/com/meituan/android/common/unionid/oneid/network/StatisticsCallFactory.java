package com.meituan.android.common.unionid.oneid.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsCallFactory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile a.InterfaceC0637a sCallFactory;

    public static a.InterfaceC0637a getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43a1f48632a35aae6c408dbc704434ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43a1f48632a35aae6c408dbc704434ce");
        }
        if (sCallFactory == null) {
            synchronized (StatisticsCallFactory.class) {
                if (sCallFactory == null) {
                    sCallFactory = com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a(30000, 30000);
                }
            }
        }
        return sCallFactory;
    }
}
