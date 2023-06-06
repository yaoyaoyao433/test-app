package com.meituan.msc.modules.api.msi.navigation;

import com.meituan.msc.modules.api.b;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.container.q;
import com.meituan.msc.modules.page.c;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class NavigationApi extends MSCApi {
    public static ChangeQuickRedirect a;
    private final String d;

    public NavigationApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20754cdefc6d35209b35b549e29f876", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20754cdefc6d35209b35b549e29f876");
            return;
        }
        this.d = "NavigationApi@" + Integer.toHexString(hashCode());
    }

    private boolean a(NavigationParam navigationParam, MsiContext msiContext) {
        Object[] objArr = {navigationParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebda723666a0a3ca7ec4cffe9dcdcbf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebda723666a0a3ca7ec4cffe9dcdcbf")).booleanValue();
        }
        if (a(msiContext)) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66192f7b81652dd98b8a0a835ea24f53", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.navigation.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66192f7b81652dd98b8a0a835ea24f53") : (com.meituan.msc.modules.navigation.a) a(com.meituan.msc.modules.navigation.a.class)).a(navigationParam.url, navigationParam.openSeq);
                msiContext.onSuccess("widget navigate to new app");
                return true;
            } catch (b e) {
                g.b(this.d, e, "handleWidgetNavigation", navigationParam.url);
                msiContext.onError(e.getMessage());
                return true;
            }
        }
        return false;
    }

    @MsiApiMethod(name = "navigateTo", onUiThread = true, request = NavigationParam.class)
    public void navigateTo(NavigationParam navigationParam, MsiContext msiContext) {
        Object[] objArr = {navigationParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236313e044a37b4db93b6a5a07b6e17f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236313e044a37b4db93b6a5a07b6e17f");
        } else if (a(navigationParam, msiContext)) {
        } else {
            try {
                b(d(msiContext)).b(navigationParam.url, navigationParam.openSeq);
                msiContext.onSuccess(null);
            } catch (b e) {
                g.b(this.d, e, "navigateTo", navigationParam.url);
                msiContext.onError(e.getMessage());
            }
        }
    }

    @MsiApiMethod(name = "switchTab", onUiThread = true, request = NavigationParam.class)
    public void switchTab(NavigationParam navigationParam, MsiContext msiContext) {
        Object[] objArr = {navigationParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d830eb43ba941ff72e13da44bc45722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d830eb43ba941ff72e13da44bc45722");
        } else if (a(navigationParam, msiContext)) {
        } else {
            try {
                b(d(msiContext)).b(navigationParam.url);
                msiContext.onSuccess(null);
            } catch (b e) {
                g.b(this.d, e, "switchTab", navigationParam.url);
                msiContext.onError(e.getMessage());
            }
        }
    }

    @MsiApiMethod(name = "reLaunch", onUiThread = true, request = NavigationParam.class)
    public void reLaunch(NavigationParam navigationParam, MsiContext msiContext) {
        Object[] objArr = {navigationParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6050412f78b343b188b1bc8ec039015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6050412f78b343b188b1bc8ec039015");
        } else if (a(navigationParam, msiContext)) {
        } else {
            try {
                b(d(msiContext)).a(navigationParam.url);
                msiContext.onSuccess(null);
            } catch (b e) {
                g.b(this.d, e, "reLaunch", navigationParam.url);
                msiContext.onError(e.getMessage());
            }
        }
    }

    @MsiApiMethod(name = "redirectTo", onUiThread = true, request = NavigationParam.class)
    public void redirectTo(NavigationParam navigationParam, MsiContext msiContext) {
        Object[] objArr = {navigationParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74855649f4f798579d3bc49cd5ce9f49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74855649f4f798579d3bc49cd5ce9f49");
        } else if (a(navigationParam, msiContext)) {
        } else {
            try {
                b(d(msiContext)).c(navigationParam.url);
                msiContext.onSuccess(null);
            } catch (b e) {
                g.b(this.d, e, "redirectTo", navigationParam.url);
                msiContext.onError(e.getMessage());
            }
        }
    }

    @MsiApiMethod(name = "navigateBack", onUiThread = true, request = NavigationParam.class)
    public void navigateBack(NavigationParam navigationParam, MsiContext msiContext) {
        Object[] objArr = {navigationParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff31a7e4809683987fde1ab7be416f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff31a7e4809683987fde1ab7be416f2c");
        } else if (a(msiContext)) {
            msiContext.onError("cannot navigate back in widget");
        } else {
            try {
                b(d(msiContext)).a(navigationParam.delta);
                msiContext.onSuccess(null);
            } catch (b e) {
                g.b(this.d, e, "navigateBack");
                msiContext.onError(e.getMessage());
            }
        }
    }

    private c b(int i) throws b {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678d0e1b3f8093bd368c384baf3c90fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678d0e1b3f8093bd368c384baf3c90fd");
        }
        c h = ((q) a(q.class)).h();
        if (h == null) {
            throw new b("operation not available for not pageStack");
        }
        c d = ((q) a(q.class)).d(i);
        if (d != h) {
            g.e(this.d, "pageStack misMatched", h, d);
            this.c.p.a("msc.navigation.page.stack.mismatched").b();
        }
        return h;
    }
}
