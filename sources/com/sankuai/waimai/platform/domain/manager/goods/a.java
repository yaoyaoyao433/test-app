package com.sankuai.waimai.platform.domain.manager.goods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a g;
    public int b;
    public GoodsSpu c;
    public boolean d;
    public boolean e;
    public String f;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea32607c0ac6c4ba64fcdb23ce44fdbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea32607c0ac6c4ba64fcdb23ce44fdbc");
        }
        if (g == null) {
            g = new a();
        }
        return g;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72497643414c8bb62e3e3698f3ae2d99", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72497643414c8bb62e3e3698f3ae2d99") : this.c == null ? "" : String.valueOf(this.c.getId());
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56fec00d8def88891f9ade2a2f45c969", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56fec00d8def88891f9ade2a2f45c969") : (this.c == null || this.c.getGoodLogField() == null) ? "" : this.c.getGoodLogField().getLabelTypeList();
    }
}
