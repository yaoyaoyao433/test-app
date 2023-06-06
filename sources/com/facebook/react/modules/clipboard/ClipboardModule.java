package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.horn.f;
import com.meituan.android.mrn.util.a;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.r;
/* compiled from: ProGuard */
@ReactModule(name = ClipboardModule.NAME)
/* loaded from: classes.dex */
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String NAME = "Clipboard";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void getString(Promise promise) {
        f.a().a(getReactContext(), "Clipboard.getString");
        getStringForPrivacy("", promise);
    }

    @ReactMethod
    public void getStringForPrivacy(final String str, final Promise promise) {
        try {
            a.a(this, getReactContext(), "getString", new a.InterfaceC0293a() { // from class: com.facebook.react.modules.clipboard.ClipboardModule.1
                @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
                public final void a() {
                    r createClipboardManager = Privacy.createClipboardManager(ClipboardModule.this.getContext(), str);
                    if (createClipboardManager != null) {
                        if (createClipboardManager.b()) {
                            if (createClipboardManager.a().getItemCount() > 0) {
                                String valueOf = String.valueOf(createClipboardManager.a().getItemAt(0).getText());
                                Promise promise2 = promise;
                                if (TextUtils.isEmpty(valueOf)) {
                                    valueOf = "";
                                }
                                promise2.resolve(valueOf);
                                return;
                            }
                            promise.resolve("");
                            return;
                        }
                        promise.reject("Error: access to clipboard is restricted. permission.code = 0");
                        return;
                    }
                    promise.reject("Error: access to clipboard is restricted. permission.code = -1");
                }

                @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
                public final void a(String str2) {
                    promise.reject(str2);
                }
            });
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    private ReactApplicationContext getReactContext() {
        Context context = getContext();
        if (context instanceof ReactApplicationContext) {
            return (ReactApplicationContext) context;
        }
        return null;
    }

    @ReactMethod
    public void setString(String str) {
        f.a().a(getReactContext(), "Clipboard.setString");
        setStringForPrivacy(str, "");
    }

    @ReactMethod
    public void setStringForPrivacy(final String str, final String str2) {
        a.a(this, getReactContext(), "setString", new a.InterfaceC0293a() { // from class: com.facebook.react.modules.clipboard.ClipboardModule.2
            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a(String str3) {
            }

            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a() {
                Privacy.createClipboardManager(ClipboardModule.this.getContext(), str2).a(ClipData.newPlainText(null, str));
            }
        });
    }
}
