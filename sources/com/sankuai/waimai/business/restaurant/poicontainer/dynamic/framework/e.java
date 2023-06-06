package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static e b;
    private Map<String, f> c;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1343b17ae476279416c9b8b1111772", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1343b17ae476279416c9b8b1111772");
            return;
        }
        this.c = new HashMap();
        this.c.put("poi_food", g.c());
    }

    public final void a(List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03334c08f561384bb5e5cb1f81b8ed1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03334c08f561384bb5e5cb1f81b8ed1f");
        } else if (com.sankuai.waimai.modular.utils.a.a(list)) {
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(true, null);
        } else {
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(true, list);
            for (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b bVar : list) {
                f fVar = this.c.get(bVar.b);
                if (fVar != null) {
                    fVar.a(bVar);
                }
            }
        }
    }
}
