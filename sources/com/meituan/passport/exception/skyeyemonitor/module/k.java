package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9b6314e901c5c3fb98bb6ad815bb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9b6314e901c5c3fb98bb6ad815bb73");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "dynamic_login", "dynamic_login_success", null);
        }
    }

    public final void a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e74dcf5aab225f845f804275908f0a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e74dcf5aab225f845f804275908f0a1e");
            return;
        }
        HashMap hashMap = new HashMap();
        if (apiException != null) {
            hashMap.put("code", Integer.valueOf(apiException.code));
            hashMap.put("message", apiException.getMessage());
            hashMap.put("type", apiException.type);
        }
        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "dynamic_login", "dynamic_login_other", "其它异常", hashMap);
    }
}
