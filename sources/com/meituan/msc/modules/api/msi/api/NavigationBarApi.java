package com.meituan.msc.modules.api.msi.api;

import com.meituan.msc.common.utils.g;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.f;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class NavigationBarApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class NavigationBarColorParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public String backgroundColor;
        @MsiParamChecker(required = true)
        public String frontColor;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class NavigationBarTitleParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public String title;
    }

    @MsiApiMethod(name = "setNavigationBarColor", onUiThread = true, request = NavigationBarColorParams.class)
    public void setNavigationBarColor(NavigationBarColorParams navigationBarColorParams, MsiContext msiContext) {
        Object[] objArr = {navigationBarColorParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f93244e403b86dc9fdbb448a45e314e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f93244e403b86dc9fdbb448a45e314e");
            return;
        }
        int d = d(msiContext);
        f b = b(d);
        if (b == null) {
            a(msiContext, d);
            return;
        }
        try {
            b.a(g.b(navigationBarColorParams.frontColor), g.b(navigationBarColorParams.backgroundColor));
            e(msiContext);
        } catch (Exception unused) {
            msiContext.onError("illegal argument name: frontColor or backgroundColor");
        }
    }

    @MsiApiMethod(name = "setNavigationBarTitle", onUiThread = true, request = NavigationBarTitleParams.class)
    public void setNavigationBarTitle(NavigationBarTitleParams navigationBarTitleParams, MsiContext msiContext) {
        Object[] objArr = {navigationBarTitleParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d27cf38f013fa3a9f9e369baf6da215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d27cf38f013fa3a9f9e369baf6da215");
            return;
        }
        int d = d(msiContext);
        f b = b(d);
        if (b == null) {
            a(msiContext, d);
            return;
        }
        b.a(navigationBarTitleParams.title);
        e(msiContext);
    }

    @MsiApiMethod(name = "showNavigationBarLoading", onUiThread = true)
    public void showNavigationBarLoading(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aef4e82e548ad024a692a9c1c6b7b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aef4e82e548ad024a692a9c1c6b7b40");
            return;
        }
        int d = d(msiContext);
        f b = b(d);
        if (b == null) {
            a(msiContext, d);
            return;
        }
        b.b();
        e(msiContext);
    }

    @MsiApiMethod(name = "hideNavigationBarLoading", onUiThread = true)
    public void hideNavigationBarLoading(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17600c89369c5c7873aae41888e2d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17600c89369c5c7873aae41888e2d1d");
            return;
        }
        int d = d(msiContext);
        f b = b(d);
        if (b == null) {
            a(msiContext, d);
            return;
        }
        b.c();
        e(msiContext);
    }

    private f b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b959ad39c487c37ff53a143485b55ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b959ad39c487c37ff53a143485b55ff");
        }
        e a2 = a(i);
        if (a2 == null) {
            return null;
        }
        return a2.k();
    }
}
