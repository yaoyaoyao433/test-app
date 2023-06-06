package com.meituan.passport.oauthlogin;

import android.content.Intent;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.oauth.e;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "380f183f85615fc265456d1205480f4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "380f183f85615fc265456d1205480f4d");
        }
        if (b == null) {
            b = new b();
        }
        return b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Intent a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f29724006e901908fdcd09c32a4a17", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f29724006e901908fdcd09c32a4a17");
        }
        Intent intent = new Intent();
        intent.setClassName(com.meituan.android.singleton.b.a().getPackageName(), "com.sankuai.meituan.oauth.OauthLoginActivity");
        intent.putExtra("type", str);
        intent.putExtra("needlogin", true);
        return intent;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final com.meituan.passport.oauthlogin.model.a a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be63fb1ef3f77a1a8dae1f2dfbfff5ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.oauthlogin.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be63fb1ef3f77a1a8dae1f2dfbfff5ab");
        }
        e eVar = (e) f.c(intent, "oauth_result");
        if (eVar == null) {
            return null;
        }
        if (TextUtils.equals(eVar.b(), UserCenter.OAUTH_TYPE_QQ)) {
            return new com.meituan.passport.oauthlogin.model.a(eVar.b(), eVar.a(), eVar.d());
        }
        if (TextUtils.equals(eVar.b(), UserCenter.OAUTH_TYPE_WEIXIN)) {
            return new com.meituan.passport.oauthlogin.model.a(eVar.b(), eVar.c());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be070ee848b889a0e5bb51fbd30b32d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be070ee848b889a0e5bb51fbd30b32d6");
        }
        if (intent == null || !intent.hasExtra("oauth_result")) {
            return null;
        }
        return f.a(intent, "oauth_result");
    }
}
