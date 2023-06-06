package com.sankuai.waimai.business.page.homepage.bubble;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static d c;
    public List<e> b;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "945193c5a974b80e7d98c2f73a85512e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "945193c5a974b80e7d98c2f73a85512e");
        }
        if (c == null) {
            c = new d();
        }
        return c;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d359867a3cfae8887bcff8af0ed175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d359867a3cfae8887bcff8af0ed175");
            return;
        }
        for (e eVar : this.b) {
            eVar.a(str);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3d63b2c4727541225f6b473d4fbdbf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3d63b2c4727541225f6b473d4fbdbf")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "key_sp_sky_bubble", false);
    }
}
