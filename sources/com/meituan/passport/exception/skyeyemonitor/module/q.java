package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb63affebe9702569b902d6de25dae64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb63affebe9702569b902d6de25dae64");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "new_share_login", "new_share_login_success", null);
        }
    }
}
