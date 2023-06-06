package com.sankuai.waimai.alita.core.jsexecutor.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b implements l {
    public static ChangeQuickRedirect a;
    public final Map<String, a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "968264b2b82c27fde9175ef8cbedb370", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "968264b2b82c27fde9175ef8cbedb370");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa69d81715d3c6d2038685afd5cea80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa69d81715d3c6d2038685afd5cea80");
        } else {
            this.b.put(str, aVar);
        }
    }
}
