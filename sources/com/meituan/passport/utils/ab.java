package com.meituan.passport.utils;

import com.meituan.passport.PassportConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    public static int a() {
        com.sankuai.meituan.library.a aVar;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5033a1a9b28be768ba06ab2e215d144d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5033a1a9b28be768ba06ab2e215d144d")).intValue();
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(com.sankuai.meituan.library.a.class, "app_display_type_provider", new Object[0]);
        if (CollectionUtils.isEmpty(a2) || a2.size() <= 0 || (aVar = (com.sankuai.meituan.library.a) a2.get(0)) == null || (i = aVar.a()) != 1) {
            if (PassportConfig.c()) {
                i = 3;
            }
            if (PassportConfig.b()) {
                return 2;
            }
            return i;
        }
        return i;
    }
}
