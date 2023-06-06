package com.meituan.passport.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.meituan.passport.LoginActivity;
import com.meituan.passport.interfaces.OAuthProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ag {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        List list;
        com.meituan.passport.interfaces.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7e481fe91339b3235230c08f6db79a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7e481fe91339b3235230c08f6db79a3")).booleanValue();
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(com.meituan.passport.interfaces.b.class, "passport.operatorlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (bVar = (com.meituan.passport.interfaces.b) list.get(0)) == null) {
            return false;
        }
        return bVar.a();
    }

    public static String b() {
        List list;
        com.meituan.passport.interfaces.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5597e0532dbc944de1ed9bab6139e00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5597e0532dbc944de1ed9bab6139e00");
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(com.meituan.passport.interfaces.b.class, "passport.operatorlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        return (CollectionUtils.isEmpty(list) || list.size() <= 0 || (bVar = (com.meituan.passport.interfaces.b) list.get(0)) == null) ? "" : bVar.b();
    }

    public static com.meituan.passport.plugins.o a(Context context) {
        List list;
        com.meituan.passport.interfaces.b bVar;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c81722de7b8eeef992ee4c12b8a301df", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.plugins.o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c81722de7b8eeef992ee4c12b8a301df");
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(com.meituan.passport.interfaces.b.class, "passport.operatorlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (bVar = (com.meituan.passport.interfaces.b) list.get(0)) == null) {
            return null;
        }
        return bVar.a(context);
    }

    public static boolean c() {
        List list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5966ff5b9324bdb890c7fdd5de214ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5966ff5b9324bdb890c7fdd5de214ac")).booleanValue();
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(OAuthProvider.class, "passport.oauthlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        return (CollectionUtils.isEmpty(list) || list.size() <= 0 || ((OAuthProvider) list.get(0)) == null) ? false : true;
    }

    public static Intent a(String str) {
        List list;
        OAuthProvider oAuthProvider;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07c3bfdd9b909b17aae91e1614c2adc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07c3bfdd9b909b17aae91e1614c2adc1");
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(OAuthProvider.class, "passport.oauthlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (oAuthProvider = (OAuthProvider) list.get(0)) == null) {
            return null;
        }
        return oAuthProvider.a(str);
    }

    public static void a(Fragment fragment, String str, int i, int i2, Intent intent) {
        List list;
        OAuthProvider oAuthProvider;
        Object[] objArr = {fragment, str, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c575923c24e9a5a38051c07d518bea7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c575923c24e9a5a38051c07d518bea7d");
            return;
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(OAuthProvider.class, "passport.oauthlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (oAuthProvider = (OAuthProvider) list.get(0)) == null) {
            return;
        }
        oAuthProvider.a(fragment, str, i, i2, intent);
    }

    public static boolean d() {
        List list;
        com.meituan.passport.interfaces.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64323a29fa33dc199ffdc848f1517907", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64323a29fa33dc199ffdc848f1517907")).booleanValue();
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(com.meituan.passport.interfaces.a.class, "passport.facelogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (aVar = (com.meituan.passport.interfaces.a) list.get(0)) == null) {
            return false;
        }
        return aVar.a();
    }

    public static void a(LoginActivity.c cVar) {
        List list;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9aad87e062806f4c2f62d0a7f1f068b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9aad87e062806f4c2f62d0a7f1f068b");
            return;
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(com.meituan.passport.interfaces.b.class, "passport.operatorlogin", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0) {
            return;
        }
        list.get(0);
    }
}
