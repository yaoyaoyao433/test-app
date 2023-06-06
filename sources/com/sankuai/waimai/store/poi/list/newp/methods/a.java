package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;

    public a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0374bd3f8b487b6e839a7034cd74746b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0374bd3f8b487b6e839a7034cd74746b");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bd4d83c1bfc29034ed201d28bad2ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bd4d83c1bfc29034ed201d28bad2ff");
        } else if (p.a(map)) {
        } else {
            long longValue = map.get("cate_id") != null ? Long.valueOf(map.get("cate_id").toString()).longValue() : 0L;
            if (longValue != 0) {
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.refactor.event.f(longValue));
            }
        }
    }
}
