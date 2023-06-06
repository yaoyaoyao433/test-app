package com.sankuai.waimai.pouch.mach.text;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect e = null;
    public static String f = "pouch_ad_textchange";
    public static String g = "content";

    @Override // com.sankuai.waimai.mach.component.e, com.sankuai.waimai.mach.component.base.a
    public final void a(com.sankuai.waimai.mach.widget.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c9b5e8d05070a6c69b354f8e2a34c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c9b5e8d05070a6c69b354f8e2a34c4");
            return;
        }
        super.a(eVar);
        j(a(g));
    }

    public final void j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4861aa1aa5dc75bead92a56f9af3a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4861aa1aa5dc75bead92a56f9af3a2c");
        } else if (this.d != null) {
            this.d.setText(str);
        }
    }
}
