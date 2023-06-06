package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import java.net.URL;
/* loaded from: classes6.dex */
public final class JsContext {
    private final JsVirtualMachine a;
    private final IX5JsContext b;
    private ExceptionHandler c;
    private String d;

    /* loaded from: classes6.dex */
    public interface ExceptionHandler {
        void handleException(JsContext jsContext, JsError jsError);
    }

    public JsContext(Context context) {
        this(new JsVirtualMachine(context));
    }

    public JsContext(JsVirtualMachine jsVirtualMachine) {
        if (jsVirtualMachine == null) {
            throw new IllegalArgumentException("The virtualMachine value can not be null");
        }
        this.a = jsVirtualMachine;
        this.b = this.a.a();
        try {
            this.b.setPerContextData(this);
        } catch (AbstractMethodError unused) {
        }
    }

    public static JsContext current() {
        return (JsContext) X5JsCore.a();
    }

    public final void addJavascriptInterface(Object obj, String str) {
        this.b.addJavascriptInterface(obj, str);
    }

    public final void destroy() {
        this.b.destroy();
    }

    public final void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback) {
        evaluateJavascript(str, valueCallback, null);
    }

    public final void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback, URL url) {
        this.b.evaluateJavascript(str, valueCallback, url);
    }

    public final JsValue evaluateScript(String str) {
        return evaluateScript(str, null);
    }

    public final JsValue evaluateScript(String str, URL url) {
        IX5JsValue evaluateScript = this.b.evaluateScript(str, url);
        if (evaluateScript == null) {
            return null;
        }
        return new JsValue(this, evaluateScript);
    }

    public final void evaluateScriptAsync(String str, final android.webkit.ValueCallback<JsValue> valueCallback, URL url) {
        this.b.evaluateScriptAsync(str, valueCallback == null ? null : new android.webkit.ValueCallback<IX5JsValue>() { // from class: com.tencent.smtt.sdk.JsContext.1
            @Override // android.webkit.ValueCallback
            /* renamed from: a */
            public void onReceiveValue(IX5JsValue iX5JsValue) {
                valueCallback.onReceiveValue(iX5JsValue == null ? null : new JsValue(JsContext.this, iX5JsValue));
            }
        }, url);
    }

    public final ExceptionHandler exceptionHandler() {
        return this.c;
    }

    public final byte[] getNativeBuffer(int i) {
        return this.b.getNativeBuffer(i);
    }

    public final int getNativeBufferId() {
        return this.b.getNativeBufferId();
    }

    public final String name() {
        return this.d;
    }

    public final void removeJavascriptInterface(String str) {
        this.b.removeJavascriptInterface(str);
    }

    public final void setExceptionHandler(ExceptionHandler exceptionHandler) {
        IX5JsContext iX5JsContext;
        android.webkit.ValueCallback<IX5JsError> valueCallback;
        this.c = exceptionHandler;
        if (exceptionHandler == null) {
            iX5JsContext = this.b;
            valueCallback = null;
        } else {
            iX5JsContext = this.b;
            valueCallback = new android.webkit.ValueCallback<IX5JsError>() { // from class: com.tencent.smtt.sdk.JsContext.2
                @Override // android.webkit.ValueCallback
                /* renamed from: a */
                public void onReceiveValue(IX5JsError iX5JsError) {
                    JsContext.this.c.handleException(JsContext.this, new JsError(iX5JsError));
                }
            };
        }
        iX5JsContext.setExceptionHandler(valueCallback);
    }

    public final void setName(String str) {
        this.d = str;
        this.b.setName(str);
    }

    public final int setNativeBuffer(int i, byte[] bArr) {
        return this.b.setNativeBuffer(i, bArr);
    }

    public final void stealValueFromOtherCtx(String str, JsContext jsContext, String str2) {
        this.b.stealValueFromOtherCtx(str, jsContext.b, str2);
    }

    public final JsVirtualMachine virtualMachine() {
        return this.a;
    }
}
