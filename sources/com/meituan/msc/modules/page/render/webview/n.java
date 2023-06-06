package com.meituan.msc.modules.page.render.webview;

import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.meituan.msc.jse.bridge.JSFunctionCaller;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.JavaScriptModuleRegistry;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLEncoder;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class n {
    public static ChangeQuickRedirect c;
    private final JavaScriptModuleRegistry a;
    final PerfEventRecorder d;

    public abstract void a(int i, JSONArray jSONArray);

    public abstract void a(String str, @Nullable ValueCallback<String> valueCallback);

    public abstract void a(String str, String str2, String str3, boolean z);

    public n(PerfEventRecorder perfEventRecorder) {
        Object[] objArr = {perfEventRecorder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a30047477720d7ede138d371075847a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a30047477720d7ede138d371075847a0");
            return;
        }
        this.a = new JavaScriptModuleRegistry();
        this.d = perfEventRecorder;
    }

    public final <T extends JavaScriptModule> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b071f326df3cc0ba6c02e15e382e95", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b071f326df3cc0ba6c02e15e382e95") : (T) this.a.getJavaScriptModule(new JSFunctionCaller() { // from class: com.meituan.msc.modules.page.render.webview.n.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.JSFunctionCaller
            public final void callFunction(String str, String str2, JSONArray jSONArray) {
                String str3;
                Object[] objArr2 = {str, str2, jSONArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8f31aeb259f6df4c76bd5349bb5b9e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8f31aeb259f6df4c76bd5349bb5b9e8");
                    return;
                }
                n nVar = n.this;
                Object[] objArr3 = {str, str2, jSONArray};
                ChangeQuickRedirect changeQuickRedirect3 = n.c;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "c45f23d01ec4dff0758de274cd64e9b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "c45f23d01ec4dff0758de274cd64e9b2");
                } else if ("WebViewPageListener".equals(str)) {
                    char c2 = 65535;
                    int hashCode = str2.hashCode();
                    if (hashCode != -1005781733) {
                        if (hashCode != 395575717) {
                            if (hashCode == 842002420 && str2.equals("onPageStart")) {
                                c2 = 0;
                            }
                        } else if (str2.equals("onPageRecycle")) {
                            c2 = 2;
                        }
                    } else if (str2.equals("onPagePreload")) {
                        c2 = 1;
                    }
                    switch (c2) {
                        case 0:
                            try {
                                String str4 = str2 + URLEncoder.encode(jSONArray.getString(0), "UTF-8");
                                try {
                                    str3 = str4 + jSONArray.getString(1);
                                } catch (Exception unused) {
                                    str3 = str4;
                                }
                            } catch (Exception unused2) {
                                str3 = str2;
                            }
                            nVar.d.c(str3);
                            break;
                        case 1:
                        case 2:
                            nVar.d.c(str2);
                            break;
                    }
                } else if ("WebViewPageData".equals(str) && "onInitialData".equals(str2)) {
                    nVar.d.c(str2);
                }
                com.meituan.msc.modules.reporter.g.d("WebViewBridge", str, str2);
                n.this.a(str, str2, jSONArray);
            }
        }, cls);
    }

    public final void a(String str, String str2, JSONArray jSONArray) {
        Object[] objArr = {str, str2, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bcbcf2ba4661dc0d23376c5c29a4a53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bcbcf2ba4661dc0d23376c5c29a4a53");
        } else {
            a(str, str2, jSONArray == null ? null : jSONArray.toString(), true);
        }
    }
}
