package com.sankuai.waimai.store.drug.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.load.c;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be4c5520136577dae25265da5090d6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be4c5520136577dae25265da5090d6cc");
        } else {
            c.a(DefaultHeaderService.KEY_DRUG, str);
        }
    }
}
