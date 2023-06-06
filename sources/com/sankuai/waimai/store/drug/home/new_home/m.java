package com.sankuai.waimai.store.drug.home.new_home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class m implements Mach.d {
    public static ChangeQuickRedirect a;
    private final l b;

    private m(l lVar) {
        this.b = lVar;
    }

    public static Mach.d a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af550db7014f32f0cfc9ccfc47164188", RobustBitConfig.DEFAULT_VALUE) ? (Mach.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af550db7014f32f0cfc9ccfc47164188") : new m(lVar);
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5827d2de2c63519508cd85f4ff046e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5827d2de2c63519508cd85f4ff046e");
        } else {
            l.a(this.b, str, map);
        }
    }
}
