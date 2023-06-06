package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.poi.list.newp.home.callback.d b;
    private boolean c;

    public g(com.sankuai.waimai.store.poi.list.newp.home.callback.d dVar, boolean z) {
        Object[] objArr = {dVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b30f37e8c781e65016a673f557d5a4db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b30f37e8c781e65016a673f557d5a4db");
            return;
        }
        this.b = dVar;
        this.c = true;
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a8eefbe7f92c077a3a3fd1ead6312a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a8eefbe7f92c077a3a3fd1ead6312a");
        } else if (((map == null || map.size() == 0) && !this.c) || this.b == null) {
        } else {
            this.b.a(str, map);
        }
    }
}
