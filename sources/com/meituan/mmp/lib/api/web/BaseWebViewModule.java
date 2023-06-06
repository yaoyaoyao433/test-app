package com.meituan.mmp.lib.api.web;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.react.modules.appstate.AppStateModule;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseWebViewModule extends NativeViewApi<h> {
    public static ChangeQuickRedirect h = null;
    public static String l = "javascript:window.__wxjs_environment = 'miniprogram';";
    protected com.meituan.mmp.lib.api.h i;
    protected String j;
    protected int k;
    public boolean m;
    private b n;

    public abstract boolean a(h hVar, String str);

    public abstract h c(JSONObject jSONObject);

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "htmlId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ h b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819467fa6455c6804c77e6f2b71b6605", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819467fa6455c6804c77e6f2b71b6605");
        }
        this.k = a(jSONObject);
        this.j = d(jSONObject);
        return c(jSONObject);
    }

    public BaseWebViewModule(com.meituan.mmp.lib.api.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b3e844e73c72cc7f6af0f0d28e6bc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b3e844e73c72cc7f6af0f0d28e6bc8");
        } else {
            this.i = hVar;
        }
    }

    public void a(b bVar) {
        this.n = bVar;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c43f116a1318e18291a2bd7a7db13d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c43f116a1318e18291a2bd7a7db13d") : new String[]{"insertHTMLWebView", "updateHTMLWebView", "removeHTMLWebView"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        char c;
        h hVar;
        boolean z = false;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d948a3ba59202d556b43a9ea61508259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d948a3ba59202d556b43a9ea61508259");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == 960671466) {
            if (str.equals("removeHTMLWebView")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1396826517) {
            if (hashCode == 2091319685 && str.equals("updateHTMLWebView")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("insertHTMLWebView")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17446f594b3d0b510fe6facc41e40619", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17446f594b3d0b510fe6facc41e40619");
                    return;
                }
                int a = a(jSONObject);
                Object[] objArr3 = {Integer.valueOf(a)};
                ChangeQuickRedirect changeQuickRedirect3 = NativeViewApi.p;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a06b01bbf930c2fd45d824492ea1e3c2", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a06b01bbf930c2fd45d824492ea1e3c2")).booleanValue();
                } else {
                    com.meituan.mmp.lib.page.e pageByPageId = getPageByPageId(a);
                    if (pageByPageId != null) {
                        z = pageByPageId.n();
                    }
                }
                if (z) {
                    iApiCallback.onFail();
                    return;
                }
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("position");
                    if (optJSONObject != null) {
                        optJSONObject.put("height", -1);
                        optJSONObject.put("width", -1);
                    }
                } catch (Exception unused) {
                }
                if (d(jSONObject, iApiCallback) != null) {
                    iApiCallback.onSuccess(null);
                    return;
                }
                return;
            case 1:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b1ce4d842996e6806715d88a6a7ec31d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b1ce4d842996e6806715d88a6a7ec31d");
                    return;
                }
                try {
                    String string = jSONObject.getString(RaptorUploaderImpl.SRC);
                    CoverViewWrapper c2 = c(jSONObject, iApiCallback);
                    if (c2 != null && (hVar = (h) c2.b(h.class)) != null && a(hVar, string)) {
                        iApiCallback.onSuccess(null);
                    } else {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                    }
                    return;
                } catch (JSONException unused2) {
                    iApiCallback.onFail();
                    return;
                }
            case 2:
                a(jSONObject, iApiCallback);
                return;
            default:
                return;
        }
    }

    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c41df44f60d80dceaaac8167daadee9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c41df44f60d80dceaaac8167daadee9b");
        }
        String str2 = com.meituan.mmp.lib.config.a.b;
        return (str == null || str2 == null) ? str2 : str2.replace("MicroMessenger/6.5.7  miniprogram", str);
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228ad6ea71e51780fb1bd07fabd9f049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228ad6ea71e51780fb1bd07fabd9f049");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("htmlId", this.j);
            jSONObject.put(RaptorUploaderImpl.SRC, str);
        } catch (JSONException unused) {
        }
        this.d.a("onWebviewStartLoad", jSONObject, this.k);
    }

    public final void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb09bf61a73037dc15d216e92932cc9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb09bf61a73037dc15d216e92932cc9a");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("htmlId", this.j);
            jSONObject.put(RaptorUploaderImpl.SRC, str);
        } catch (JSONException unused) {
        }
        this.d.a("onWebviewFinishLoad", jSONObject, this.k);
    }

    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31355112fbda8efe4c541780a2b9c751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31355112fbda8efe4c541780a2b9c751");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("htmlId", this.j);
            jSONObject.put("errorCode", i);
            jSONObject.put("description", str);
            jSONObject.put(RaptorUploaderImpl.SRC, str2);
        } catch (JSONException unused) {
        }
        this.d.a("onWebviewError", jSONObject, this.k);
    }

    public final boolean g(String str) {
        ResolveInfo resolveInfo;
        ResolveInfo resolveActivity;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fea8ce9ba92aaeaf9c18fa4f6ffd82c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fea8ce9ba92aaeaf9c18fa4f6ffd82c")).booleanValue();
        }
        if (!str.startsWith("http")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            PackageManager packageManager = getContext().getPackageManager();
            if (packageManager != null) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(getContext().getPackageName());
                try {
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                } catch (RuntimeException unused) {
                    resolveInfo = null;
                }
                if (resolveInfo == null || resolveInfo.activityInfo == null) {
                    try {
                        resolveActivity = packageManager.resolveActivity(intent2, 0);
                    } catch (RuntimeException unused2) {
                    }
                    if (resolveActivity != null && resolveActivity.activityInfo != null) {
                        startActivity(intent2, null);
                        return true;
                    }
                }
                resolveActivity = resolveInfo;
                if (resolveActivity != null) {
                    startActivity(intent2, null);
                    return true;
                }
            }
            if (!com.meituan.mmp.lib.config.b.e(str) && h(str)) {
                if (this.g != null && intent.resolveActivity(this.g.getPackageManager()) != null) {
                    startActivity(intent, null);
                } else {
                    bb.b("no app support:" + str, new Object[0]);
                }
                return true;
            }
        }
        return false;
    }

    private boolean h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25c1d06dda2d7f1dbe5db6d8520a7a01", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25c1d06dda2d7f1dbe5db6d8520a7a01")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("weixin://") || str.startsWith("tel:") || str.startsWith("mailto:") || str.startsWith("sms:") || str.startsWith("geo:") || str.startsWith("alipays:")) {
            return true;
        }
        try {
            return com.meituan.mmp.lib.config.b.f(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a(MTWebView mTWebView) {
        String str;
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38247bf7a9146747b8d1b2c0c8f5fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38247bf7a9146747b8d1b2c0c8f5fa3")).booleanValue();
        }
        try {
            str = s.a(getContext(), "wxjs.js");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null || mTWebView == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                mTWebView.evaluateJavascript(TitansConstants.JAVASCRIPT_PREFIX + str, null);
            } else {
                mTWebView.loadUrl(TitansConstants.JAVASCRIPT_PREFIX + str);
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final boolean a(WebView webView) {
        String str;
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a79e81c450d30230a4fedf40e898eba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a79e81c450d30230a4fedf40e898eba")).booleanValue();
        }
        try {
            str = s.a(getContext(), "wxjs.js");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null || webView == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript(TitansConstants.JAVASCRIPT_PREFIX + str, null);
            } else {
                webView.loadUrl(TitansConstants.JAVASCRIPT_PREFIX + str);
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb2ef7347b56156d8a8e31be81514689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb2ef7347b56156d8a8e31be81514689");
            return;
        }
        com.meituan.mmp.lib.page.e pageByPageId = getPageByPageId(this.k);
        if (pageByPageId != null) {
            a(!pageByPageId.r, this.n);
        }
    }

    public static void a(boolean z, b bVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c40eaaa89a9b0597d1337008174faa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c40eaaa89a9b0597d1337008174faa3");
        } else if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AppStateModule.APP_STATE_ACTIVE, z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            WebJSBridge.dispatcherEvent("onPageStateChange", jSONObject.toString(), bVar);
        }
    }
}
