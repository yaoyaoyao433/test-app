package com.meituan.passport.exception.skyeyemonitor.module;

import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f884af0dd1fb4ed1d29643305705d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f884af0dd1fb4ed1d29643305705d7");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "second_verification", "second_verification_success", null);
        }
    }

    public final void a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6bf9a8fcb73a261d8e9cf7f16509f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6bf9a8fcb73a261d8e9cf7f16509f8b");
            return;
        }
        HashMap hashMap = new HashMap();
        if (apiException != null) {
            hashMap.put("code", Integer.valueOf(apiException.code));
            hashMap.put("message", apiException.getMessage());
            hashMap.put("type", apiException.type);
        }
        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "second_verification", "second_verification_failed", "二次验证失败", hashMap);
    }
}
