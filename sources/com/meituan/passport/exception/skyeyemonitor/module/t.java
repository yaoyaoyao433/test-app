package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84361905f253bdf4f7611ed421f33e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84361905f253bdf4f7611ed421f33e8");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "oauth_login_unbinded", "oauth_login_unbinded_success", null);
        }
    }
}
