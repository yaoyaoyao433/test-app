package com.sankuai.waimai.store.poi.list.newp.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public final void a(String str, long j, k<Map<String, Object>> kVar) {
        Object[] objArr = {str, new Long(j), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4369df5498f0be6b64627f65392a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4369df5498f0be6b64627f65392a92");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(j, kVar);
        }
    }
}
