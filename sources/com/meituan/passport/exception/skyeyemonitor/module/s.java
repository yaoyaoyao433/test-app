package com.meituan.passport.exception.skyeyemonitor.module;

import android.text.TextUtils;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s implements l {
    public static ChangeQuickRedirect a;

    public final void a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e8aae99b2a4375d3d4d79c128905ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e8aae99b2a4375d3d4d79c128905ca");
        } else {
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "oauth_login_binded", "oauth_login_binded_success", null);
        }
    }

    public final void a(ApiException apiException, String str) {
        Object[] objArr = {apiException, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df722f57063bfde709daec0a8d44808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df722f57063bfde709daec0a8d44808");
        } else if (apiException == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(apiException.code));
            hashMap.put("message", apiException.getMessage());
            hashMap.put("type", apiException.type);
            hashMap.put("data", !TextUtils.isEmpty(apiException.data) ? apiException.data : "data is null");
            hashMap.put("oauth_type", str);
            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "oauth_login_binded", "oauth_login_binded_other", "其它", hashMap);
        }
    }
}
