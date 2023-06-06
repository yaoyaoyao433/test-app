package com.meituan.mmp.lib.msi.tabbar;

import android.text.TextUtils;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.page.view.j;
import com.meituan.mmp.lib.page.view.k;
import com.meituan.mmp.lib.utils.i;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TabBarApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    public ab b;
    private final String c;
    private final String d;

    public TabBarApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a679f331a04653b8043d5c6643c19e4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a679f331a04653b8043d5c6643c19e4d");
            return;
        }
        this.c = "#f5f5f5";
        this.d = "#e5e5e5";
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "showTabBar", onUiThread = true)
    public void showTabBar(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5041563f6c0c95ae13014be939d4f042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5041563f6c0c95ae13014be939d4f042");
        } else if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                f.setVisibility(0);
                msiContext.onSuccess("");
            }
        } else {
            msiContext.onError("");
        }
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "hideTabBar", onUiThread = true)
    public void hideTabBar(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beff8396ebaefec67c1797d86cd8a6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beff8396ebaefec67c1797d86cd8a6fb");
        } else if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                f.setVisibility(8);
                msiContext.onSuccess("");
            }
        } else {
            msiContext.onError("");
        }
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "setTabBarBadge", onUiThread = true, request = TabBarApiParam.class)
    public void setTabBarBadge(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0228e6a49ee3ada6fab23f9446d32421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0228e6a49ee3ada6fab23f9446d32421");
            return;
        }
        if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                a(tabBarApiParam, f, msiContext);
                k a2 = f.a(tabBarApiParam.index);
                if (a2 != null) {
                    a2.setTabBarBadge(tabBarApiParam.text);
                    msiContext.onSuccess("");
                    return;
                }
                return;
            }
        }
        msiContext.onError("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "removeTabBarBadge", onUiThread = true, request = TabBarApiParam.class)
    public void removeTabBarBadge(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06aef73d634ff9ae3b988f029a09546b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06aef73d634ff9ae3b988f029a09546b");
            return;
        }
        if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                a(tabBarApiParam, f, msiContext);
                k a2 = f.a(tabBarApiParam.index);
                if (a2 != null) {
                    a2.c();
                    msiContext.onSuccess("");
                    return;
                }
                return;
            }
        }
        msiContext.onError("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "showTabBarRedDot", onUiThread = true, request = TabBarApiParam.class)
    public void showTabBarRedDot(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ecd0d46863b439fd408006852862fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ecd0d46863b439fd408006852862fe");
            return;
        }
        if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                a(tabBarApiParam, f, msiContext);
                k a2 = f.a(tabBarApiParam.index);
                if (a2 != null) {
                    a2.a();
                    msiContext.onSuccess("");
                    return;
                }
                return;
            }
        }
        msiContext.onError("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "hideTabBarRedDot", onUiThread = true, request = TabBarApiParam.class)
    public void hideTabBarRedDot(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "917e3875dd9372d0969330d8b0132c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "917e3875dd9372d0969330d8b0132c43");
            return;
        }
        if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                a(tabBarApiParam, f, msiContext);
                k a2 = f.a(tabBarApiParam.index);
                if (a2 != null) {
                    a2.b();
                    msiContext.onSuccess("");
                    return;
                }
                return;
            }
        }
        msiContext.onError("");
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "setTabBarStyle", onUiThread = true, request = TabBarApiParam.class)
    public void setTabBarStyle(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "006f3625f3fb002e4a79edee0fed2cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "006f3625f3fb002e4a79edee0fed2cdd");
        } else if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                if (!TextUtils.isEmpty(tabBarApiParam.backgroundColor)) {
                    f.setBackgroundColor(i.a(tabBarApiParam.backgroundColor));
                }
                if (!TextUtils.isEmpty(tabBarApiParam.borderStyle)) {
                    f.setBorderColor(i.a("white".equals(tabBarApiParam.borderStyle) ? this.c : this.d));
                }
                int tabItemCount = f.getTabItemCount();
                for (int i = 0; i < tabItemCount; i++) {
                    k a2 = f.a(i);
                    if (a2 != null) {
                        a2.getInfo().a = tabBarApiParam.color;
                        a2.getInfo().b = tabBarApiParam.selectedColor;
                        a2.setSelected(a2.isSelected());
                    }
                }
                msiContext.onSuccess("");
            }
        } else {
            msiContext.onError("");
        }
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "setTabBarItem", onUiThread = true, request = TabBarApiParam.class)
    public void setTabBarItem(TabBarApiParam tabBarApiParam, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a20c02d56b31af7ee68b1c4f2638d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a20c02d56b31af7ee68b1c4f2638d7");
        } else if (this.b != null) {
            if (!a(msiContext)) {
                msiContext.onError("not tabbarPage");
                return;
            }
            j f = this.b.f();
            if (f != null) {
                a(tabBarApiParam, f, msiContext);
                k a2 = f.a(tabBarApiParam.index);
                if (a2 != null) {
                    a2.a(tabBarApiParam.text, tabBarApiParam.iconPath, tabBarApiParam.selectedIconPath);
                    a2.setSelected(a2.isSelected());
                    msiContext.onSuccess("");
                }
            }
        } else {
            msiContext.onError("");
        }
    }

    private void a(TabBarApiParam tabBarApiParam, j jVar, MsiContext msiContext) {
        Object[] objArr = {tabBarApiParam, jVar, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218d28ab67b7634c9e43ce7cfac64b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218d28ab67b7634c9e43ce7cfac64b5f");
        } else if (tabBarApiParam.index > jVar.getTabItemCount() - 1) {
            msiContext.onError("index越界");
        }
    }

    private boolean a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b5b9737baaba00e00bc60bb51a2d81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b5b9737baaba00e00bc60bb51a2d81")).booleanValue() : this.b.e() == null || this.b.e().getTabBar() != null;
    }
}
