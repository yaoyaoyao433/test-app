package com.meituan.msc.modules.api.msi.webview;

import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.MSCNativeViewApi;
import com.meituan.msc.modules.container.q;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class WebViewComponentApi extends MSCNativeViewApi<m, WebViewComponentParam> {
    public static ChangeQuickRedirect c;

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "onWebViewPostMessage")
    public void onWebViewPostMessage(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "onWebviewError")
    public void onWebviewError(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "onWebviewFinishLoad")
    public void onWebviewFinishLoad(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "onWebviewStartLoad")
    public void onWebviewStartLoad(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ View a(MsiContext msiContext, JsonObject jsonObject, Object obj) {
        com.meituan.msc.modules.page.e b;
        WebViewComponentParam webViewComponentParam = (WebViewComponentParam) obj;
        Object[] objArr = {msiContext, jsonObject, webViewComponentParam};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ddac58fbc6b62571d3625f1c3f28d63", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ddac58fbc6b62571d3625f1c3f28d63");
        }
        int pageId = msiContext.getPageId();
        Object[] objArr2 = {Integer.valueOf(pageId)};
        ChangeQuickRedirect changeQuickRedirect2 = MSCNativeViewApi.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e94689dca165f404b91b708e44d7e1e", RobustBitConfig.DEFAULT_VALUE)) {
            b = (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e94689dca165f404b91b708e44d7e1e");
        } else {
            q b2 = this.b.b();
            b = b2 == null ? null : b2.b(pageId);
        }
        if (b == null) {
            com.meituan.msc.modules.reporter.g.b("can't insert web-view pageModule is null");
            msiContext.onError("can't insert web-view pageModule is null");
            return null;
        }
        com.meituan.msc.modules.page.j S_ = b.S_();
        if (S_.a()) {
            com.meituan.msc.modules.reporter.g.b("can't insert web-view in web-view");
            msiContext.onError("can't insert web-view in web-view");
            return null;
        }
        JsonObject asJsonObject = jsonObject.getAsJsonObject("position");
        asJsonObject.addProperty("height", (Number) (-1));
        asJsonObject.addProperty("width", (Number) (-1));
        jsonObject.add("position", asJsonObject);
        return new m(this.b, msiContext, jsonObject, webViewComponentParam, S_);
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, View view, int i, int i2, JsonObject jsonObject, Object obj) {
        m mVar = (m) view;
        WebViewComponentParam webViewComponentParam = (WebViewComponentParam) obj;
        Object[] objArr = {msiContext, mVar, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, webViewComponentParam};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ca97bc116507e2980ce5e009052ab5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ca97bc116507e2980ce5e009052ab5")).booleanValue();
        }
        if (mVar != null) {
            String str = webViewComponentParam.src;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = m.a;
            return PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "98fa15f4c6d18aa4a78f25ecc78b8bc8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "98fa15f4c6d18aa4a78f25ecc78b8bc8")).booleanValue() : mVar.d.a(str);
        }
        return false;
    }

    @MsiApiMethod(name = "webView", request = WebViewComponentParam.class)
    public void beforeOperation(WebViewComponentParam webViewComponentParam, MsiContext msiContext) {
        Object[] objArr = {webViewComponentParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3505b33db92e78c5e4e6c472ede79de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3505b33db92e78c5e4e6c472ede79de");
        } else {
            a(msiContext, (MsiContext) webViewComponentParam);
        }
    }
}
