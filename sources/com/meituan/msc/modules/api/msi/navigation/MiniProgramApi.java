package com.meituan.msc.modules.api.msi.navigation;

import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.k;
import com.meituan.msc.common.utils.y;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.b;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.api.msi.api.PageBeforeUnloadParam;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.container.s;
import com.meituan.msc.modules.page.m;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.NavActivityInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import okhttp3.HttpUrl;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class MiniProgramApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class NavigateBackParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public JsonElement extraData;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class NavigateMiniProgramParams {
        public static final String ENV_VERSION_DEVELOP = "develop";
        public static final String ENV_VERSION_RELEASE = "release";
        public static final String ENV_VERSION_TRIAL = "trial";
        public static final String TARGET_MP_PLATFORM_MT = "mt";
        public static final String TARGET_MP_PLATFORM_WX = "wx";
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public String appId;
        public String checkUpdateUrl;
        public String envVersion = "release";
        public JsonElement extraData;
        public String path;
        public String platform;
        public Boolean reload;
    }

    @MsiApiMethod(isForeground = true, name = PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM, onUiThread = true)
    public void exitMiniProgram(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cbec24fdf27aeb93cc3db0213c666b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cbec24fdf27aeb93cc3db0213c666b3");
            return;
        }
        Object[] objArr2 = {msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dd1ed921eb29de7045f250113a630e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dd1ed921eb29de7045f250113a630e5");
        } else {
            p b = b(msiContext);
            if (b != null) {
                g.b("MiniProgramApi", "MiniProgramApi exitCurrentApp");
                m u = b.u();
                if (u != null) {
                    try {
                    } catch (b e) {
                        g.b("MiniProgramApi", e, "exitCurrentApp");
                    }
                    if (u.h() != null) {
                        String pagePath = u.h().getPagePath();
                        Intent H = b.H();
                        H.putExtra("finishByExitMiniProgram", true);
                        if (u.a(pagePath, H)) {
                        }
                        b.b(PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM);
                    }
                }
                g.b("MiniProgramApi", "MiniProgramApi exitCurrentApp", u);
                b.b(PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM);
            }
        }
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "navigateToMiniProgram", onUiThread = true, request = NavigateMiniProgramParams.class)
    public void navigateToMiniProgram(NavigateMiniProgramParams navigateMiniProgramParams, MsiContext msiContext) {
        NavActivityInfo navActivityInfo;
        Object[] objArr = {navigateMiniProgramParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e415496527078bb785886d2e40a1b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e415496527078bb785886d2e40a1b2");
        } else if (!NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX.equals(navigateMiniProgramParams.platform)) {
            Intent intent = new Intent();
            intent.setClassName(msiContext.getActivity(), MSCActivity.class.getName());
            intent.putExtra("appId", navigateMiniProgramParams.appId);
            intent.putExtra("srcAppId", this.c.a());
            intent.putExtra("startFromMinProgram", true);
            String str = navigateMiniProgramParams.path;
            if (!TextUtils.isEmpty(str)) {
                if (!str.startsWith("/")) {
                    str = "/" + str;
                }
                intent.putExtra("targetPath", str);
            }
            if (navigateMiniProgramParams.extraData != null && !navigateMiniProgramParams.extraData.isJsonNull()) {
                intent.putExtra("extraData", ab.a("extraData", navigateMiniProgramParams.extraData.toString()));
            }
            if (!TextUtils.isEmpty(navigateMiniProgramParams.checkUpdateUrl)) {
                if (HttpUrl.parse(navigateMiniProgramParams.checkUpdateUrl) != null) {
                    intent.putExtra("checkUpdateUrl", navigateMiniProgramParams.checkUpdateUrl);
                } else {
                    msiContext.onError("invalid checkUpdateUrl.");
                    return;
                }
            }
            if (navigateMiniProgramParams.reload != null) {
                intent.putExtra("reload", navigateMiniProgramParams.reload);
            }
            try {
                s sVar = (s) this.c.c(s.class);
                if (sVar == null) {
                    g.d("MiniProgramApi", "startActivityForResult,msc app exit");
                    return;
                }
                Object[] objArr2 = {msiContext};
                ChangeQuickRedirect changeQuickRedirect2 = MSCApi.b;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "59d5b32e9d3fd0a001f0955b02944320", RobustBitConfig.DEFAULT_VALUE)) {
                    navActivityInfo = (NavActivityInfo) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "59d5b32e9d3fd0a001f0955b02944320");
                } else {
                    navActivityInfo = new NavActivityInfo();
                    navActivityInfo.pageId = MSCApi.d(msiContext);
                    navActivityInfo.fromApiName = msiContext.request.getName();
                }
                sVar.a(intent, 96, navActivityInfo, (s.a) null);
                msiContext.onSuccess(null);
            } catch (Exception e) {
                msiContext.onError("start activity error. " + e.getMessage());
            }
        } else {
            Object[] objArr3 = {navigateMiniProgramParams, msiContext};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46bb171754ab305280d5830333e794e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46bb171754ab305280d5830333e794e9");
            } else if (!k.a(a.b())) {
                msiContext.onError("wx opensdk not available");
            } else if (msiContext.getActivity() != null && !TextUtils.isEmpty(MSCEnvHelper.getEnvInfo().getWXAppId())) {
                IWXAPI createWXAPI = WXAPIFactory.createWXAPI(msiContext.getActivity(), MSCEnvHelper.getEnvInfo().getWXAppId());
                WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
                req.userName = navigateMiniProgramParams.appId;
                req.path = navigateMiniProgramParams.path;
                if (TextUtils.isEmpty(req.userName)) {
                    msiContext.onError("invalid params, appId is required");
                    return;
                }
                String str2 = navigateMiniProgramParams.envVersion;
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != 110628630) {
                    if (hashCode != 1090594823) {
                        if (hashCode == 1559690845 && str2.equals("develop")) {
                            c = 1;
                        }
                    } else if (str2.equals("release")) {
                        c = 0;
                    }
                } else if (str2.equals("trial")) {
                    c = 2;
                }
                switch (c) {
                    case 0:
                        req.miniprogramType = 0;
                        break;
                    case 1:
                        req.miniprogramType = 1;
                        break;
                    case 2:
                        req.miniprogramType = 2;
                        break;
                    default:
                        req.miniprogramType = 0;
                        break;
                }
                if (createWXAPI.sendReq(req)) {
                    msiContext.onSuccess(null);
                } else {
                    msiContext.onError("failed to launch wx miniprogram");
                }
            } else {
                msiContext.onError("Current Activity is null or WXAppID is empty");
            }
        }
    }

    public static /* synthetic */ Class b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21d95ff6f1e20e0da277d24e708cf2da", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21d95ff6f1e20e0da277d24e708cf2da") : WXAPIFactory.class;
    }

    @MsiApiMethod(name = "navigateBackMiniProgram", onUiThread = true, request = NavigateBackParams.class)
    public void navigateBackMiniProgram(NavigateBackParams navigateBackParams, MsiContext msiContext) {
        Object[] objArr = {navigateBackParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978d1170c598fc2616c0d030fc01a8e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978d1170c598fc2616c0d030fc01a8e8");
            return;
        }
        g.b("MiniProgramApi", "MiniProgramApi navigateBackMiniProgram");
        p b = b(msiContext);
        if (b == null) {
            msiContext.onError("not containerDelegate alive");
            return;
        }
        if (navigateBackParams.extraData != null && !navigateBackParams.extraData.isJsonNull()) {
            Intent intent = new Intent();
            intent.putExtra("extraData", navigateBackParams.toString());
            intent.putExtra("srcAppId", a());
            b.a(-1, intent);
        }
        b.b("navigateBackMiniProgram");
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "navigateBackNative", onUiThread = true, request = NavigateBackParams.class)
    public void navigateBackNative(NavigateBackParams navigateBackParams, MsiContext msiContext) {
        Object[] objArr = {navigateBackParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09700ed3b0272767b26fd74d2d716a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09700ed3b0272767b26fd74d2d716a7c");
            return;
        }
        p b = b(msiContext);
        if (b == null) {
            msiContext.onError("not containerDelegate alive");
            return;
        }
        Intent intent = new Intent();
        if (navigateBackParams.extraData != null && !navigateBackParams.extraData.isJsonNull()) {
            intent.putExtra("extraData", navigateBackParams.toString());
            intent.putExtra("resultData", navigateBackParams.extraData.toString());
        }
        intent.putExtra("appId", a());
        b.a(-1, intent);
        String a2 = y.a(b.H(), "navigateBackBroadCastAction");
        if (TextUtils.isEmpty(a2)) {
            msiContext.onError("Using navigateBackNative API callback information, intent need to carry the broadcast name when starting Activity");
        } else {
            intent.setAction(a2);
            b.C().sendBroadcast(intent);
            msiContext.onSuccess(null);
        }
        if (b.A()) {
            b.C().finish();
            g.b("MiniProgramApi", "widget navigateBackNative");
            return;
        }
        g.b("MiniProgramApi", "navigateBackNative");
        b.b("navigateBackNative");
    }
}
