package com.sankuai.waimai.business.page.home.helper;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d c;
    public int b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33c649ef8660e113e618aa840c2622d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33c649ef8660e113e618aa840c2622d");
        } else {
            this.b = 0;
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d50fbb19853b42580ba0a0604ee8be1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d50fbb19853b42580ba0a0604ee8be1f");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public static void a(int i, Object obj, Map<String, Object> map) {
        Object[] objArr = {Integer.valueOf(i), obj, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c9a1113f33f30951d04d6b3f544c2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c9a1113f33f30951d04d6b3f544c2ad");
            return;
        }
        WMLocation p = g.a().p();
        LocationUtils.TransformData a2 = p != null ? LocationUtils.a(p.getLongitude(), p.getLatitude()) : null;
        JudasManualManager.a("c_m84bv26", i, obj).a(map).a("ji", a2 != null ? a2.ji : 0L).a("jf", a2 != null ? a2.jf : "").a("wi", a2 != null ? a2.wi : 0L).a("wf", a2 != null ? a2.wf : "").a(Constants.Environment.KEY_PUSHID, com.sankuai.waimai.platform.b.A().t()).b();
    }
}
