package com.meituan.mmp.lib.api.input;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.mmp.lib.api.input.b;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.y;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class InputApi extends NativeViewApi<b> {
    public static ChangeQuickRedirect h;
    public static final String[] i = {"insertInput", "updateInput", "removeInput", "hideKeyboard"};
    @SupportApiNames
    public static final String[] API_NAMES = {"insertInput", "updateInput", "removeInput", "hideKeyboard", TensorConfig.KEY_INPUT_ARRAY};

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "inputId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ b b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0fe1e2eb851994df543d988e0cbfa0", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0fe1e2eb851994df543d988e0cbfa0") : new b(getContext(), d(jSONObject), a(jSONObject), jSONObject.optString("type", "text"), this.d);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5693eef6ecea8b1fa410c53afa64a530", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5693eef6ecea8b1fa410c53afa64a530") : new String[]{"insertInput", "updateInput", "removeInput", "hideKeyboard"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        b.C0396b c0396b;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a56c5982016098521b6d46317f26a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a56c5982016098521b6d46317f26a4");
        } else if ("insertInput".equals(str)) {
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b54a42f005fe558245947ae5c9180c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b54a42f005fe558245947ae5c9180c0");
                return;
            }
            final b d = d(jSONObject, iApiCallback);
            if (d != null) {
                com.meituan.mmp.lib.trace.b.b("InputApi", "insertCoverView");
                d.a(b.a.a(jSONObject));
                d.a(jSONObject);
                c.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.InputApi.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1ab26c7f3eb6d181769583d1896d7a98", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1ab26c7f3eb6d181769583d1896d7a98");
                        } else {
                            d.requestFocus();
                        }
                    }
                }, 100L);
                ((CoverViewWrapper) d.getParent()).a(jSONObject);
                iApiCallback.onSuccess(null);
            }
        } else if (!"updateInput".equals(str)) {
            if ("removeInput".equals(str)) {
                a(jSONObject, iApiCallback);
            } else if ("hideKeyboard".equals(str)) {
                Object[] objArr3 = {iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6844a18961a5e412020ef425360b4705", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6844a18961a5e412020ef425360b4705");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("InputApi", "hideKeyboard");
                y.a((Activity) getContext());
                iApiCallback.onSuccess(null);
            }
        } else {
            Object[] objArr4 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect4 = h;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0e274f123d15508a904ac43666f5b225", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0e274f123d15508a904ac43666f5b225");
                return;
            }
            String d2 = d(jSONObject);
            a(jSONObject);
            CoverViewWrapper c = c(jSONObject, iApiCallback);
            if (c != null) {
                final b bVar = (b) c.b(b.class);
                if (bVar == null) {
                    iApiCallback.onFail(a("view not found!", new Object[0]));
                    return;
                }
                Object[] objArr5 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect5 = b.C0396b.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "35c10c166584dd001b8398a930b70bce", RobustBitConfig.DEFAULT_VALUE)) {
                    c0396b = (b.C0396b) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "35c10c166584dd001b8398a930b70bce");
                } else {
                    c0396b = new b.C0396b();
                    c0396b.c = jSONObject.has(ReactTextInputShadowNode.PROP_PLACEHOLDER);
                    if (c0396b.c) {
                        c0396b.g = jSONObject.optString(ReactTextInputShadowNode.PROP_PLACEHOLDER);
                    }
                    c0396b.e = jSONObject.has("defaultValue");
                    if (c0396b.e) {
                        c0396b.i = jSONObject.optString("defaultValue");
                    }
                    if (jSONObject.has("cursorSpacing")) {
                        c0396b.j = p.a((float) jSONObject.optDouble("cursorSpacing", 0.0d));
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("style");
                    if (optJSONObject != null) {
                        c0396b.d = true;
                        c0396b.f = optJSONObject.optInt(MarginBottom.LOWER_CASE_NAME);
                        if (c0396b.f > 0) {
                            c0396b.f = p.a(c0396b.f);
                        }
                        c0396b.b = optJSONObject.optString("backgroundColor");
                        c0396b.h = optJSONObject.optString("color");
                    }
                }
                bVar.a(jSONObject);
                bVar.a(c0396b);
                if (jSONObject.has("position")) {
                    AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) c.getLayoutParams();
                    int i2 = layoutParams.y + layoutParams.height;
                    a(jSONObject, d2);
                    AbsoluteLayout.LayoutParams layoutParams2 = (AbsoluteLayout.LayoutParams) c.getLayoutParams();
                    if (layoutParams2.y + layoutParams2.height != i2) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = b.x;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "6e9e7d0b4532d20fec92b29f6360dc0c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "6e9e7d0b4532d20fec92b29f6360dc0c");
                        } else {
                            bVar.post(new Runnable() { // from class: com.meituan.mmp.lib.api.input.b.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4f52ec048995530810febe9deb249b6c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4f52ec048995530810febe9deb249b6c");
                                    } else {
                                        bVar.e();
                                    }
                                }
                            });
                        }
                    }
                }
                c.a(jSONObject);
                iApiCallback.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d47ef606f8327e289b20ecf248110c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d47ef606f8327e289b20ecf248110c3");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c != null) {
            b bVar = (b) c.b(b.class);
            if (bVar != null) {
                bVar.setOnFocusChangeListener(null);
            }
            ((ViewGroup) c.getParent()).removeView(c);
            iApiCallback.onSuccess(null);
            return;
        }
        iApiCallback.onFail(a("view not found!", new Object[0]));
    }
}
