package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe945cd5be375d6a8f4c356861823d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe945cd5be375d6a8f4c356861823d5");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "account_login", "account_login_success", null);
        }
    }
}
