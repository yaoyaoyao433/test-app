package com.meituan.msc.modules.page.render.webview;

import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class WebViewMethods {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface WebViewPageData extends JavaScriptModule {
        void onInitialData(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface WebViewPageListener extends JavaScriptModule {
        void onPagePreload(JSONObject jSONObject);

        void onPageRecycle();

        void onPageStart(String str, String str2);

        void onUserTapBackToTop();
    }

    public static void a(n nVar, String str) {
        Object[] objArr = {nVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05400bef3705693290cf3d0ed2ec396b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05400bef3705693290cf3d0ed2ec396b");
        } else {
            ((WebViewPageData) nVar.a(WebViewPageData.class)).onInitialData(str);
        }
    }

    public static void a(n nVar, JSONObject jSONObject) {
        Object[] objArr = {nVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53f888eb951d3cbcfc2ebf42b3f37e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53f888eb951d3cbcfc2ebf42b3f37e5c");
        } else {
            ((WebViewPageListener) nVar.a(WebViewPageListener.class)).onPagePreload(jSONObject);
        }
    }
}
