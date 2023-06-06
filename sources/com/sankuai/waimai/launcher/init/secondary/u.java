package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class u extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "SharkMock";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        boolean z;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d836ebe444ad2b2ec764d74d9743cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d836ebe444ad2b2ec764d74d9743cf2");
        } else if (!com.sankuai.meituan.takeoutnew.a.f || com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "OCTOPUS_IS_REPLAYING", false)) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.shark.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "33b3090c5c8ac2be8f9672f592ab81b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "33b3090c5c8ac2be8f9672f592ab81b8");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.shark.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d154ddd00f3121f0c8a4656d533f7a47", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d154ddd00f3121f0c8a4656d533f7a47")).booleanValue();
            } else {
                z = com.sankuai.waimai.foundation.core.a.b() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "shark_mock_switch", false);
            }
            if (z) {
                com.sankuai.waimai.platform.net.shark.a.a(true);
            }
        }
    }
}
