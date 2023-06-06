package com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static f b;
    public Map<String, Object> c;
    public Map<String, e> d;

    public static synchronized f a(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        synchronized (f.class) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26234e671709a762abb6c73656135826", RobustBitConfig.DEFAULT_VALUE)) {
                return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26234e671709a762abb6c73656135826");
            }
            if (b == null) {
                b = new f(aVar);
            }
            return b;
        }
    }

    private f(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841133bbc7e63f3edcb4c8922664650e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841133bbc7e63f3edcb4c8922664650e");
            return;
        }
        this.c = new HashMap();
        this.d = new HashMap();
        this.d.put("data_update_event", new a(aVar, this.c));
    }
}
