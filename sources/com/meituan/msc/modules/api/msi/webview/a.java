package com.meituan.msc.modules.api.msi.webview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.r;
import com.meituan.msi.bean.MsiContext;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a = null;
    public static String d = "javascript:window.__wxjs_environment = 'miniprogram';";
    protected String b;
    protected int c;
    e e;
    public com.meituan.msc.modules.engine.h f;
    public Context g;
    public com.meituan.msi.view.e h;
    public MsiContext i;
    public ValueCallback<Uri[]> j;
    public j k;
    public com.meituan.msc.modules.page.j l;
    public boolean m;

    public abstract View a(MsiContext msiContext, JsonObject jsonObject, WebViewComponentParam webViewComponentParam, com.meituan.msc.modules.page.j jVar);

    public abstract com.meituan.msi.view.e a();

    public abstract void a(int i, Intent intent);

    public abstract boolean a(String str);

    public a(Context context, com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.page.j jVar) {
        Object[] objArr = {context, hVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2e63fbabe48439331b9572ff558601", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2e63fbabe48439331b9572ff558601");
            return;
        }
        this.f = hVar;
        this.g = context;
        this.l = jVar;
    }

    public final View a(MsiContext msiContext, JsonObject jsonObject, WebViewComponentParam webViewComponentParam) {
        Object[] objArr = {msiContext, jsonObject, webViewComponentParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bebeb33c6cc3b0adb15f28b07ef32a8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bebeb33c6cc3b0adb15f28b07ef32a8c");
        }
        this.c = msiContext.getPageId();
        this.b = webViewComponentParam.htmlId;
        this.i = msiContext;
        return a(msiContext, jsonObject, webViewComponentParam, this.l);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.api.msi.webview.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0456a {
        public static ChangeQuickRedirect a;

        public C0456a() {
        }
    }

    public final String a(String str, com.meituan.msi.api.c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0602e2d895e107431ca14fc60bdd58", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0602e2d895e107431ca14fc60bdd58") : this.f.m.a(str, cVar);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0474c5b7061f7bad8581dd72a6d484ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0474c5b7061f7bad8581dd72a6d484ac");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject2.put("pageId", this.c);
            jSONObject3.put("startTime", System.currentTimeMillis());
            jSONObject4.put("title", str);
            jSONObject.put("uiArgs", jSONObject2);
            jSONObject.put(Constants.PARAM_SCOPE, "default");
            jSONObject.put("name", "setNavigationBarTitle");
            jSONObject.put("args", jSONObject4);
            a(jSONObject.toString(), new com.meituan.msi.api.c() { // from class: com.meituan.msc.modules.api.msi.webview.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.c
                public final void b(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e372cd72bd35050437db4603a1d40115", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e372cd72bd35050437db4603a1d40115");
                    } else {
                        com.meituan.msc.modules.reporter.g.d("BaseWebViewComponentManager", "setNavigationBarTitle success!");
                    }
                }

                @Override // com.meituan.msi.api.c
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70fd81ace6f60f0e20d849b210048c2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70fd81ace6f60f0e20d849b210048c2b");
                    } else {
                        com.meituan.msc.modules.reporter.g.d("BaseWebViewComponentManager", "setNavigationBarTitle onFail!");
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e5e5c1ae3c5a14a6717c84e33e0318", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e5e5c1ae3c5a14a6717c84e33e0318");
        }
        String str2 = com.meituan.msc.modules.update.f.e;
        return (str == null || str2 == null) ? str2 : str2.replace("MicroMessenger/6.5.7  miniprogram", str);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d581d469dee85da5b414ba1ce290faa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d581d469dee85da5b414ba1ce290faa8");
        } else if (this.e == null) {
        } else {
            OnWebViewStartLoadEvent onWebViewStartLoadEvent = new OnWebViewStartLoadEvent();
            onWebViewStartLoadEvent.pageId = this.c;
            onWebViewStartLoadEvent.htmlId = this.b;
            onWebViewStartLoadEvent.src = str;
            this.e.a("onWebviewStartLoad", onWebViewStartLoadEvent, this.c, this.b);
        }
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90807a237880ef48a34647f02bf575a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90807a237880ef48a34647f02bf575a7");
        } else if (this.e == null) {
        } else {
            OnWebViewFinishLoadEvent onWebViewFinishLoadEvent = new OnWebViewFinishLoadEvent();
            onWebViewFinishLoadEvent.pageId = this.c;
            onWebViewFinishLoadEvent.htmlId = this.b;
            onWebViewFinishLoadEvent.src = str;
            this.e.a("onWebviewFinishLoad", onWebViewFinishLoadEvent, this.c, this.b);
        }
    }

    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c323cbca2d03fa37d156bec4cf10cb26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c323cbca2d03fa37d156bec4cf10cb26");
        } else if (this.e == null) {
        } else {
            OnWebViewErrorEvent onWebViewErrorEvent = new OnWebViewErrorEvent();
            onWebViewErrorEvent.pageId = this.c;
            onWebViewErrorEvent.htmlId = this.b;
            onWebViewErrorEvent.src = str2;
            onWebViewErrorEvent.description = str;
            onWebViewErrorEvent.errorCode = i;
            this.e.a("onWebviewError", onWebViewErrorEvent, this.c, this.b);
        }
    }

    public final boolean f(String str) {
        ResolveInfo resolveActivity;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293cc046bcdeb74b5d80339047c2b212", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293cc046bcdeb74b5d80339047c2b212")).booleanValue();
        }
        if (!str.startsWith("http")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            PackageManager packageManager = this.g.getPackageManager();
            if (packageManager != null) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(this.g.getPackageName());
                ResolveInfo resolveInfo = null;
                try {
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                } catch (RuntimeException unused) {
                }
                if (resolveInfo == null || resolveInfo.activityInfo == null) {
                    try {
                        resolveActivity = packageManager.resolveActivity(intent2, 0);
                    } catch (RuntimeException unused2) {
                    }
                    if (resolveActivity != null && resolveActivity.activityInfo != null) {
                        this.i.startActivityForResult(intent2, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msi.context.b
                            public final void onFail(int i, String str2) {
                            }

                            @Override // com.meituan.msi.context.b
                            public final void onActivityResult(int i, Intent intent3) {
                                Object[] objArr2 = {Integer.valueOf(i), intent3};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "469400898f34142ec4e7849a055ca8c1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "469400898f34142ec4e7849a055ca8c1");
                                } else {
                                    a.this.a(i, intent3);
                                }
                            }
                        });
                        return true;
                    }
                }
                resolveActivity = resolveInfo;
                if (resolveActivity != null) {
                    this.i.startActivityForResult(intent2, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.context.b
                        public final void onFail(int i, String str2) {
                        }

                        @Override // com.meituan.msi.context.b
                        public final void onActivityResult(int i, Intent intent3) {
                            Object[] objArr2 = {Integer.valueOf(i), intent3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "469400898f34142ec4e7849a055ca8c1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "469400898f34142ec4e7849a055ca8c1");
                            } else {
                                a.this.a(i, intent3);
                            }
                        }
                    });
                    return true;
                }
            }
            if (!com.meituan.msc.common.config.b.c(str) && g(str)) {
                if (this.g != null && intent.resolveActivity(this.g.getPackageManager()) != null) {
                    this.i.startActivityForResult(intent, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.a.3
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.context.b
                        public final void onFail(int i, String str2) {
                        }

                        @Override // com.meituan.msi.context.b
                        public final void onActivityResult(int i, Intent intent3) {
                            Object[] objArr2 = {Integer.valueOf(i), intent3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec42200c7ba154058334dd9802601dc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec42200c7ba154058334dd9802601dc");
                            } else {
                                a.this.a(i, intent3);
                            }
                        }
                    });
                } else {
                    aw.b("no app support:" + str, new Object[0]);
                }
                return true;
            }
        }
        return false;
    }

    private boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a08b75b53efddb90b7ae1d1c7254774", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a08b75b53efddb90b7ae1d1c7254774")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("weixin://") || str.startsWith("tel:") || str.startsWith("mailto:") || str.startsWith("sms:") || str.startsWith("geo:") || str.startsWith("alipays:")) {
            return true;
        }
        try {
            return com.meituan.msc.common.config.b.d(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a(MTWebView mTWebView) {
        String str;
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bda64ff496cbc601340f014c42a83f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bda64ff496cbc601340f014c42a83f0")).booleanValue();
        }
        try {
            str = r.a(this.g, "mscwxjs.js");
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8170f94823bb9898d77dfc80f4406958", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8170f94823bb9898d77dfc80f4406958")).booleanValue();
        }
        try {
            str = r.a(this.g, "mscwxjs.js");
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

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922ffa52ef4d9eb6d5e140f4933542d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922ffa52ef4d9eb6d5e140f4933542d2");
        } else if (this.l != null) {
            a(this.l.c(), this.e);
        }
    }

    public static void a(boolean z, e eVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40128d9d76af0bc206e3748b0b16c8e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40128d9d76af0bc206e3748b0b16c8e2");
        } else if (eVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AppStateModule.APP_STATE_ACTIVE, z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            WebJSBridge.dispatchEvent("onPageStateChange", jSONObject.toString(), eVar);
        }
    }
}
