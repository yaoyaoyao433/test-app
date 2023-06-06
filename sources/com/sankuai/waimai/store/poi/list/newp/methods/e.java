package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.im.entrance.mach.b b;

    public e(com.sankuai.waimai.store.im.entrance.mach.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd0609f17d1f62b984d67617336060c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd0609f17d1f62b984d67617336060c");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506ae1d587e3e587bb452d70ec777de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506ae1d587e3e587bb452d70ec777de0");
        } else if (this.b != null) {
            if ("click_drug_im_entrance".equals(str)) {
                this.b.a(0, 0L, "");
            } else if ("query_drug_im_msg_number".equals(str)) {
                this.b.b();
            }
        }
    }
}
