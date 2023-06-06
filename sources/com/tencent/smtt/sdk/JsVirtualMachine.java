package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Looper;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class JsVirtualMachine {
    private final Context a;
    private final IX5JsVirtualMachine b;
    private final HashSet<WeakReference<a>> c;

    /* loaded from: classes6.dex */
    static class a implements IX5JsContext {
        private WebView a;

        public a(Context context) {
            this.a = new WebView(context);
            this.a.getSettings().setJavaScriptEnabled(true);
        }

        public void a() {
            if (this.a == null) {
                return;
            }
            this.a.onPause();
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void addJavascriptInterface(Object obj, String str) {
            if (this.a == null) {
                return;
            }
            this.a.addJavascriptInterface(obj, str);
            this.a.loadUrl("about:blank");
        }

        public void b() {
            if (this.a == null) {
                return;
            }
            this.a.onResume();
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void destroy() {
            if (this.a == null) {
                return;
            }
            this.a.clearHistory();
            this.a.clearCache(true);
            this.a.loadUrl("about:blank");
            this.a.freeMemory();
            this.a.pauseTimers();
            this.a.destroy();
            this.a = null;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void evaluateJavascript(String str, final android.webkit.ValueCallback<String> valueCallback, URL url) {
            if (this.a == null) {
                return;
            }
            this.a.evaluateJavascript(str, valueCallback == null ? null : new ValueCallback<String>() { // from class: com.tencent.smtt.sdk.JsVirtualMachine.a.1
                @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
                /* renamed from: a */
                public void onReceiveValue(String str2) {
                    valueCallback.onReceiveValue(str2);
                }
            });
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public IX5JsValue evaluateScript(String str, URL url) {
            if (this.a == null) {
                return null;
            }
            this.a.evaluateJavascript(str, null);
            return null;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void evaluateScriptAsync(String str, final android.webkit.ValueCallback<IX5JsValue> valueCallback, URL url) {
            if (this.a == null) {
                return;
            }
            this.a.evaluateJavascript(str, valueCallback == null ? null : new ValueCallback<String>() { // from class: com.tencent.smtt.sdk.JsVirtualMachine.a.2
                @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
                /* renamed from: a */
                public void onReceiveValue(String str2) {
                    valueCallback.onReceiveValue(null);
                }
            });
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public byte[] getNativeBuffer(int i) {
            return null;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public int getNativeBufferId() {
            return -1;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void removeJavascriptInterface(String str) {
            if (this.a == null) {
                return;
            }
            this.a.removeJavascriptInterface(str);
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void setExceptionHandler(android.webkit.ValueCallback<IX5JsError> valueCallback) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void setName(String str) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public int setNativeBuffer(int i, byte[] bArr) {
            return -1;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void setPerContextData(Object obj) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void stealValueFromOtherCtx(String str, IX5JsContext iX5JsContext, String str2) {
        }
    }

    public JsVirtualMachine(Context context) {
        this(context, null);
    }

    public JsVirtualMachine(Context context, Looper looper) {
        this.c = new HashSet<>();
        this.a = context;
        this.b = X5JsCore.a(context, looper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final IX5JsContext a() {
        if (this.b == null) {
            a aVar = new a(this.a);
            this.c.add(new WeakReference<>(aVar));
            return aVar;
        }
        return this.b.createJsContext();
    }

    public final void destroy() {
        if (this.b != null) {
            this.b.destroy();
            return;
        }
        Iterator<WeakReference<a>> it = this.c.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            if (next.get() != null) {
                next.get().destroy();
            }
        }
    }

    public final Looper getLooper() {
        return this.b != null ? this.b.getLooper() : Looper.myLooper();
    }

    public final boolean isFallback() {
        return this.b == null;
    }

    public final void onPause() {
        if (this.b != null) {
            this.b.onPause();
            return;
        }
        Iterator<WeakReference<a>> it = this.c.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            if (next.get() != null) {
                next.get().a();
            }
        }
    }

    public final void onResume() {
        if (this.b != null) {
            this.b.onResume();
            return;
        }
        Iterator<WeakReference<a>> it = this.c.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            if (next.get() != null) {
                next.get().b();
            }
        }
    }
}
