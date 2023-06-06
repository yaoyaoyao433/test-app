package com.sankuai.waimai.store.base.net.file;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.net.a {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.base.net.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77d4915aa25b04f5078baf484c28d36", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77d4915aa25b04f5078baf484c28d36") : com.sankuai.waimai.store.manager.abtest.a.a("sc_host_convert_wm").a() ? "https://files-scapi.waimai.meituan.com" : "http://files-scapi.waimai.meituan.com";
    }
}
