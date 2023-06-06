package com.meituan.mmp.lib.api.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.mmp.lib.api.input.textarea.CustomTypefaceSpan;
import com.meituan.mmp.lib.api.input.textarea.d;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.y;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TextAreaApi extends NativeViewApi<com.meituan.mmp.lib.api.input.textarea.d> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "inputId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ com.meituan.mmp.lib.api.input.textarea.d b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c782fefa169524b75a6596ca9177a4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.api.input.textarea.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c782fefa169524b75a6596ca9177a4") : new com.meituan.mmp.lib.api.input.textarea.d(getContext(), d(jSONObject), a(jSONObject), jSONObject.optString("type", "text"), this.d);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f2eda356bc5aa7e952ff9ae61e02616", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f2eda356bc5aa7e952ff9ae61e02616") : new String[]{"insertTextArea", "updateTextArea", "removeTextArea", "hideKeyboard", "showKeyboard"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd55435e79bb1d5acc05c10f5241c40b", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd55435e79bb1d5acc05c10f5241c40b") : new String[]{"insertTextArea", "updateTextArea", "removeTextArea", "hideKeyboard", "showKeyboard", "textarea"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        boolean z;
        int length;
        int i;
        SpannableString a;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2b4a07687ee0b7413bf02d732097dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2b4a07687ee0b7413bf02d732097dc");
        } else if ("insertTextArea".equals(str)) {
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a5e0722cce041a4b73296526ae38cc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a5e0722cce041a4b73296526ae38cc2");
                return;
            }
            com.meituan.mmp.lib.api.input.textarea.d d = d(jSONObject, iApiCallback);
            if (d != null) {
                d.a a2 = d.a.a(jSONObject, null);
                int a3 = a(jSONObject);
                com.meituan.mmp.lib.trace.b.b("TextAreaApi", "insertCoverView, pageId: " + a3);
                if (a2.L) {
                    try {
                        jSONObject.getJSONObject("position").put("height", -2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                com.meituan.mmp.lib.page.e pageByPageId = getPageByPageId(a3);
                String str2 = "textArea" + d.j;
                Object[] objArr3 = {str2, d};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
                if (PatchProxy.isSupport(objArr3, pageByPageId, changeQuickRedirect3, false, "a7dbd210484b024e84d618ac075db78d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, pageByPageId, changeQuickRedirect3, false, "a7dbd210484b024e84d618ac075db78d");
                } else {
                    pageByPageId.h.put(str2, d);
                }
                d.a(a2);
                d.a(jSONObject);
                ((CoverViewWrapper) d.getParent()).a(jSONObject);
                iApiCallback.onSuccess(null);
            }
        } else if (!"updateTextArea".equals(str)) {
            if ("removeTextArea".equals(str)) {
                a(jSONObject, iApiCallback);
            } else if ("hideKeyboard".equals(str)) {
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "10c494946fc72d5565a1a6502af0661b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "10c494946fc72d5565a1a6502af0661b");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("TextAreaApi", "hideKeyboard");
                CoverViewWrapper c = c(jSONObject, iApiCallback);
                if (c != null) {
                    if (((com.meituan.mmp.lib.api.input.textarea.d) c.b(com.meituan.mmp.lib.api.input.textarea.d.class)) != null && com.meituan.mmp.lib.api.input.textarea.d.e()) {
                        y.a((Activity) getContext());
                        iApiCallback.onSuccess(null);
                        return;
                    }
                    iApiCallback.onFail(a("KeyBoard hide failed!", new Object[0]));
                }
            } else if ("showKeyboard".equals(str)) {
                Object[] objArr5 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect5 = h;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f46e0f1f9163bb25b4717020aea096c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f46e0f1f9163bb25b4717020aea096c4");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("TextAreaApi", "showKeyboard");
                int a4 = a(jSONObject);
                d(jSONObject);
                CoverViewWrapper c2 = c(jSONObject, iApiCallback);
                if (c2 != null) {
                    final com.meituan.mmp.lib.api.input.textarea.d dVar = (com.meituan.mmp.lib.api.input.textarea.d) c2.b(com.meituan.mmp.lib.api.input.textarea.d.class);
                    if (dVar == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    }
                    int optInt = jSONObject.optInt("selectionStart", -1);
                    int optInt2 = jSONObject.optInt("selectionEnd", -1);
                    int optInt3 = jSONObject.optInt("cursor", -1);
                    if (optInt3 >= 0 && optInt3 <= dVar.length()) {
                        dVar.setSelection(optInt3);
                    }
                    if (optInt3 > dVar.length()) {
                        dVar.setSelection(dVar.length());
                    }
                    if (optInt != 0 || optInt2 != 0) {
                        if (optInt2 > dVar.length()) {
                            optInt2 = dVar.length();
                        }
                        int i2 = optInt2;
                        Object[] objArr6 = {dVar, Integer.valueOf(optInt), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect6 = h;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "def53ee7e254535b4c8e9eff884ac760", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "def53ee7e254535b4c8e9eff884ac760")).booleanValue();
                        } else {
                            z = false;
                            if (i2 >= optInt && optInt <= (length = dVar.length()) && i2 <= length && optInt >= 0 && i2 >= 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            dVar.setSelection(optInt, i2);
                        }
                        if (optInt == -1 && i2 == -1 && optInt3 == -1) {
                            dVar.setSelection(dVar.length(), dVar.length());
                        }
                    }
                    com.meituan.mmp.lib.page.e pageByPageId2 = getPageByPageId(a4);
                    if (pageByPageId2.g) {
                        dVar.d(pageByPageId2.getKeyboardHeight());
                        dVar.h();
                    }
                    dVar.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.TextAreaApi.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z2;
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "063a9fd80dcddd7c33c035686ac25106", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "063a9fd80dcddd7c33c035686ac25106");
                                return;
                            }
                            dVar.requestFocus();
                            dVar.setAutoFocus(true);
                            TextAreaApi textAreaApi = TextAreaApi.this;
                            FrameLayout a5 = TextAreaApi.this.getPageManager().a();
                            Object[] objArr8 = {a5};
                            ChangeQuickRedirect changeQuickRedirect8 = TextAreaApi.h;
                            if (PatchProxy.isSupport(objArr8, textAreaApi, changeQuickRedirect8, false, "8abbfb49ea44693826f04fc05bc281d0", RobustBitConfig.DEFAULT_VALUE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr8, textAreaApi, changeQuickRedirect8, false, "8abbfb49ea44693826f04fc05bc281d0")).booleanValue();
                            } else {
                                int i3 = textAreaApi.getContext().getResources().getDisplayMetrics().heightPixels;
                                Rect rect = new Rect();
                                a5.getWindowVisibleDisplayFrame(rect);
                                z2 = rect.bottom < (i3 * 2) / 3;
                            }
                            if (z2) {
                                return;
                            }
                            Context context = TextAreaApi.this.getContext();
                            com.meituan.mmp.lib.api.input.textarea.d dVar2 = dVar;
                            Object[] objArr9 = {context, dVar2, 1};
                            ChangeQuickRedirect changeQuickRedirect9 = y.a;
                            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "48c1acfe2b61a68f3bce55463d1e40e9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "48c1acfe2b61a68f3bce55463d1e40e9");
                            } else {
                                try {
                                    InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                                    if (inputMethodManager != null) {
                                        inputMethodManager.showSoftInput(dVar2, 1);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            dVar.E = true;
                        }
                    }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                    iApiCallback.onSuccess(null);
                }
            }
        } else {
            Object[] objArr7 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect7 = h;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2e51e147d38496d80161d98ed16f428f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2e51e147d38496d80161d98ed16f428f");
                return;
            }
            String d2 = d(jSONObject);
            CoverViewWrapper c3 = c(jSONObject, iApiCallback);
            if (c3 == null || c3.b(com.meituan.mmp.lib.api.input.textarea.d.class) == null) {
                iApiCallback.onFail(a("view not found!", new Object[0]));
                return;
            }
            com.meituan.mmp.lib.api.input.textarea.d dVar2 = (com.meituan.mmp.lib.api.input.textarea.d) c3.b(com.meituan.mmp.lib.api.input.textarea.d.class);
            if (dVar2.K > 0) {
                dVar2.setMaxHeight(dVar2.K);
            }
            if (jSONObject.has("autoSize")) {
                if (jSONObject.optBoolean("autoSize", false)) {
                    try {
                        jSONObject.getJSONObject("position").put("height", -2);
                        a(jSONObject, d2);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (jSONObject.has("position")) {
                    a(jSONObject, d2);
                }
            } else if (jSONObject.has("position")) {
                if (dVar2.C) {
                    try {
                        jSONObject.getJSONObject("position").put("height", -2);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                a(jSONObject, d2);
            }
            d.a a5 = d.a.a(jSONObject, dVar2);
            dVar2.a(jSONObject);
            Object[] objArr8 = {a5};
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.mmp.lib.api.input.textarea.d.x;
            if (PatchProxy.isSupport(objArr8, dVar2, changeQuickRedirect8, false, "d683c60b587abd86e8c4dd860944d5ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, dVar2, changeQuickRedirect8, false, "d683c60b587abd86e8c4dd860944d5ae");
            } else {
                dVar2.y = a5;
                if (!a5.n || !a5.k || !TextUtils.isEmpty(a5.D) || !TextUtils.isEmpty(a5.x)) {
                    if (a5.k) {
                        dVar2.setHint(a5.x);
                    }
                    if (a5.l) {
                        if (!TextUtils.isEmpty(a5.y)) {
                            dVar2.setHintTextColor(i.b(a5.y));
                        }
                        if (a5.z > 0) {
                            dVar2.setTextSize(1, a5.z);
                        }
                        if (!TextUtils.isEmpty(a5.A) && !TextUtils.isEmpty(a5.A)) {
                            if (!"normal".equalsIgnoreCase(a5.A) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equalsIgnoreCase(a5.A)) {
                                a = CustomTypefaceSpan.a(Typeface.defaultFromStyle(1), a5.x);
                            } else {
                                a = CustomTypefaceSpan.a(Typeface.defaultFromStyle(0), a5.x);
                            }
                            dVar2.setHint(a);
                        }
                    }
                    if (a5.u > 0) {
                        dVar2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(a5.u)});
                    }
                    if (a5.n && !TextUtils.equals(dVar2.getValue(), a5.D)) {
                        if (Math.abs(System.currentTimeMillis() - dVar2.L) >= 500 && Math.abs(System.currentTimeMillis() - dVar2.M) >= 500) {
                            dVar2.J = a5.D;
                            dVar2.b = true;
                            dVar2.setText(dVar2.J);
                        }
                    }
                    if (a5.F >= 0) {
                        dVar2.z = a5.F;
                    }
                    if (a5.m) {
                        dVar2.requestLayout();
                    }
                    if (a5.f) {
                        dVar2.setEnabled(false);
                        dVar2.I = false;
                        i = 1;
                    } else {
                        i = 1;
                        dVar2.I = true;
                        dVar2.setEnabled(true);
                    }
                    dVar2.B = a5.M;
                    if (a5.i > 0) {
                        dVar2.setTextSize(i, a5.i);
                    }
                    dVar2.C = a5.L;
                }
            }
            c3.a(jSONObject);
            iApiCallback.onSuccess(null);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5cf56784a7a3cbd69e92b6106fd4f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5cf56784a7a3cbd69e92b6106fd4f00");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c != null) {
            com.meituan.mmp.lib.api.input.textarea.d dVar = (com.meituan.mmp.lib.api.input.textarea.d) c.b(com.meituan.mmp.lib.api.input.textarea.d.class);
            if (dVar != null) {
                dVar.setOnFocusChangeListener(null);
                dVar.setFocusable(false);
            }
            ((ViewGroup) c.getParent()).removeView(c);
            iApiCallback.onSuccess(null);
        }
    }
}
