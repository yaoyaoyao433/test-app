package com.meituan.msc.modules.api.msi.tabbar;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.msc.common.utils.ar;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.h;
import com.meituan.msc.modules.page.view.tab.a;
import com.meituan.msc.modules.page.view.tab.c;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class TabBarApi extends MSCApi {
    public static ChangeQuickRedirect a;
    private final String d;
    private final String e;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class TabBarStyle {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String backgroundColor;
        public String borderStyle;
        public String color;
        public String selectedColor;
    }

    public TabBarApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba6e9273640e563e2cfc7421f07c11c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba6e9273640e563e2cfc7421f07c11c");
            return;
        }
        this.d = "#f5f5f5";
        this.e = "#e5e5e5";
    }

    private a f(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e47f22d5b12ad29c771782ac81398ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e47f22d5b12ad29c771782ac81398ca");
        }
        e c = c(msiContext);
        if (c == null) {
            msiContext.onError("no available page");
            return null;
        }
        h h = c.h();
        if (h == null) {
            msiContext.onError("can not operate tab api while not in tab page");
            return null;
        } else if (h.c()) {
            msiContext.onError("can not operate tab api in CustomTab Page");
            return null;
        } else {
            a tabBar = h.getTabBar();
            if (tabBar == null) {
                msiContext.onError("can not operate tab api while tabBar is null");
                return null;
            }
            return tabBar;
        }
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "showTabBar", onUiThread = true)
    public void showTabBar(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d392358dc705c16664b3f9359e65c3b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d392358dc705c16664b3f9359e65c3b7");
            return;
        }
        a f = f(msiContext);
        if (f == null) {
            return;
        }
        f.setVisibility(0);
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "hideTabBar", onUiThread = true)
    public void hideTabBar(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddba630719b605ea2990f616e7d1cf46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddba630719b605ea2990f616e7d1cf46");
            return;
        }
        a f = f(msiContext);
        if (f == null) {
            return;
        }
        f.setVisibility(8);
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "setTabBarBadge", onUiThread = true, request = TabBarApiParam.class)
    public void setTabBarBadge(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        c a2;
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290e99dc0c43ac0ccbe096c6416f4937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290e99dc0c43ac0ccbe096c6416f4937");
            return;
        }
        a f = f(msiContext);
        if (f == null || (a2 = a(tabBarApiParam, f, msiContext)) == null) {
            return;
        }
        a2.setTabBarBadge(tabBarApiParam.text);
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "removeTabBarBadge", onUiThread = true, request = TabBarApiParam.class)
    public void removeTabBarBadge(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        c a2;
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6185bb85e82c984f0600e1fa9059e7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6185bb85e82c984f0600e1fa9059e7e2");
            return;
        }
        a f = f(msiContext);
        if (f == null || (a2 = a(tabBarApiParam, f, msiContext)) == null) {
            return;
        }
        a2.b();
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "showTabBarRedDot", onUiThread = true, request = TabBarApiParam.class)
    public void showTabBarRedDot(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        c a2;
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62528f44f1dde0c1627b7c244152bab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62528f44f1dde0c1627b7c244152bab4");
            return;
        }
        a f = f(msiContext);
        if (f == null || (a2 = a(tabBarApiParam, f, msiContext)) == null) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9c2bc2e38cb713abed66c8297af34cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9c2bc2e38cb713abed66c8297af34cd1");
        } else {
            a2.b();
            if (a2.d == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ar.a(8.0f), ar.a(8.0f));
                layoutParams.addRule(5, a2.b.getId());
                layoutParams.leftMargin = ar.a(30.0f);
                a2.d = new View(a2.getContext());
                a2.d.setBackground(a2.getResources().getDrawable(R.drawable.msc_red_dot));
                a2.addView(a2.d, layoutParams);
            }
            a2.d.setVisibility(0);
        }
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "hideTabBarRedDot", onUiThread = true, request = TabBarApiParam.class)
    public void hideTabBarRedDot(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        c a2;
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0793ff527487d932eb3a7e892ef8b9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0793ff527487d932eb3a7e892ef8b9b5");
            return;
        }
        a f = f(msiContext);
        if (f == null || (a2 = a(tabBarApiParam, f, msiContext)) == null) {
            return;
        }
        a2.a();
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "setTabBarStyle", onUiThread = true, request = TabBarStyle.class)
    public void setTabBarStyle(TabBarStyle tabBarStyle, MsiContext msiContext) {
        Object[] objArr = {tabBarStyle, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207456fd55159592d44293f477bd9bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207456fd55159592d44293f477bd9bf8");
            return;
        }
        a f = f(msiContext);
        if (f == null) {
            return;
        }
        if (!TextUtils.isEmpty(tabBarStyle.backgroundColor)) {
            f.setBackgroundColor(g.a(tabBarStyle.backgroundColor));
        }
        if (!TextUtils.isEmpty(tabBarStyle.borderStyle)) {
            f.setBorderColor(g.a("white".equals(tabBarStyle.borderStyle) ? this.d : this.e));
        }
        int tabItemCount = f.getTabItemCount();
        for (int i = 0; i < tabItemCount; i++) {
            c a2 = f.a(i);
            if (a2 != null) {
                String str = tabBarStyle.color;
                String str2 = tabBarStyle.selectedColor;
                a2.c.a = str;
                a2.c.b = str2;
                a2.setSelected(a2.isSelected());
            }
        }
        msiContext.onSuccess("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MSC}, name = "setTabBarItem", onUiThread = true, request = TabBarApiParam.class)
    public void setTabBarItem(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        c a2;
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc17f6cb22e635ebcb53d474590fbc7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc17f6cb22e635ebcb53d474590fbc7d");
            return;
        }
        a f = f(msiContext);
        if (f == null || (a2 = a(tabBarApiParam, f, msiContext)) == null) {
            return;
        }
        String str = tabBarApiParam.text;
        String str2 = tabBarApiParam.iconPath;
        String str3 = tabBarApiParam.selectedIconPath;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5b24f226be471892c4aa2d0d2fe438a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5b24f226be471892c4aa2d0d2fe438a6");
        } else {
            if (!TextUtils.isEmpty(str)) {
                a2.c.e = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                a2.c.c = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                a2.c.d = str3;
            }
        }
        a2.setSelected(a2.isSelected());
        msiContext.onSuccess("");
    }

    private c a(TabBarApiParam tabBarApiParam, a aVar, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, aVar, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e98ea02cb9eaf4381d87229f615f06b", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e98ea02cb9eaf4381d87229f615f06b");
        }
        if (tabBarApiParam.index == null || tabBarApiParam.index.intValue() < 0 || tabBarApiParam.index.intValue() > aVar.getTabItemCount() - 1) {
            msiContext.onError("index越界");
            return null;
        }
        return aVar.a(tabBarApiParam.index.intValue());
    }
}
