package com.meituan.mmp.lib.api.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MaxLength;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class b extends com.meituan.mmp.lib.api.input.a {
    public static ChangeQuickRedirect x;
    private boolean A;
    public int y;
    private int z;

    @Override // com.meituan.mmp.lib.api.input.a
    public boolean getConfirm() {
        return false;
    }

    public b(Context context, String str, int i, String str2, com.meituan.mmp.lib.interfaces.c cVar) {
        super(context, str, i, str2, cVar);
        Object[] objArr = {context, str, Integer.valueOf(i), str2, cVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54677027ac20b28fd8781771e79c7ad2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54677027ac20b28fd8781771e79c7ad2");
            return;
        }
        this.z = 0;
        this.A = true;
        setSingleLine();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public boolean d;
        public float e;
        public boolean f;
        public boolean g;
        public int h;
        public int i;
        public int j;
        public int k;
        public boolean l;
        public String m;
        public String n;
        public float o;
        public String p;
        public String q;
        public String r;
        public int s;
        public String t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public boolean z;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea45afae6e79ca77150bafd4016c1efd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea45afae6e79ca77150bafd4016c1efd");
            } else {
                this.y = -1;
            }
        }

        public static a a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e143ae52dc12012cb158ea15fd2cb56", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e143ae52dc12012cb158ea15fd2cb56");
            }
            a aVar = new a();
            try {
                aVar.t = jSONObject.optString("type");
                aVar.k = jSONObject.optInt(MaxLength.LOWER_CASE_NAME);
                aVar.l = jSONObject.optBoolean("password");
                aVar.d = jSONObject.optBoolean("fixed", false);
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                aVar.v = jSONObject.optInt("selectionStart", 0);
                aVar.w = jSONObject.optInt("selectionEnd", 0);
                aVar.x = jSONObject.optInt("cursor", -1);
                aVar.z = jSONObject.optBoolean("adjustPosition", true);
                if (optJSONObject != null) {
                    aVar.g = true;
                    aVar.e = (float) optJSONObject.optDouble("fontSize");
                    aVar.u = optJSONObject.optInt("width");
                    if (aVar.u > 0) {
                        aVar.u = p.a(aVar.u);
                    }
                    aVar.h = (int) optJSONObject.optDouble("height");
                    if (aVar.h > 0) {
                        aVar.h = p.a((float) optJSONObject.optDouble("height"));
                    }
                    aVar.i = optJSONObject.optInt("left");
                    if (aVar.i > 0) {
                        aVar.i = p.a(aVar.i);
                    }
                    aVar.s = optJSONObject.optInt("top");
                    if (aVar.s > 0) {
                        aVar.s = p.a(aVar.s);
                    }
                    aVar.j = optJSONObject.optInt(MarginBottom.LOWER_CASE_NAME);
                    if (aVar.j > 0) {
                        aVar.j = p.a(aVar.j);
                    }
                    aVar.q = optJSONObject.optString(TextAlign.LOWER_CASE_NAME);
                    aVar.b = optJSONObject.optString("backgroundColor");
                    aVar.r = optJSONObject.optString("color");
                }
                aVar.p = jSONObject.optString(ReactTextInputShadowNode.PROP_PLACEHOLDER);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholderStyle");
                if (optJSONObject2 != null) {
                    aVar.f = true;
                    aVar.m = optJSONObject2.optString("color");
                    aVar.n = optJSONObject2.optString("backgroundColor");
                    aVar.o = (float) optJSONObject2.optDouble("fontSize");
                }
                aVar.c = jSONObject.optString("defaultValue");
                if (jSONObject.has("cursorSpacing")) {
                    aVar.y = p.a((float) jSONObject.optDouble("cursorSpacing", 0.0d));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return aVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.input.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0396b {
        public static ChangeQuickRedirect a;
        public String b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;
        public String g;
        public String h;
        public String i;
        public int j;

        public C0396b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cfd576fccaf8851fed0fd395efbdc10", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cfd576fccaf8851fed0fd395efbdc10");
            } else {
                this.j = -1;
            }
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81187f0db31f817792f96c53d5eda030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81187f0db31f817792f96c53d5eda030");
        } else {
            super.setSingleLine(true);
        }
    }

    @Override // com.meituan.mmp.lib.api.input.a, com.meituan.mmp.lib.api.input.d
    public int getInputHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e7ff61ac4d3b6269490982c7b45bac9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e7ff61ac4d3b6269490982c7b45bac9")).intValue() : getMeasuredHeight();
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2dfb0fe738c40dccc79d825ed137c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2dfb0fe738c40dccc79d825ed137c1");
            return;
        }
        if (aVar.y >= 0) {
            this.z = aVar.y;
        }
        this.l = aVar.d;
        if (aVar.g) {
            if (!TextUtils.isEmpty(aVar.b)) {
                setBackgroundColor(i.b(aVar.b));
                this.f = true;
                this.g = i.b(aVar.b);
            }
            if (!TextUtils.isEmpty(aVar.r)) {
                setTextColor(i.b(aVar.r));
            }
            if (aVar.e > 0.0f) {
                setTextSize(1, aVar.e);
            }
            if (TextUtils.equals(aVar.q, "center")) {
                setGravity(17);
            } else if (TextUtils.equals(aVar.q, "left")) {
                setGravity(19);
            } else if (TextUtils.equals(aVar.q, "right")) {
                setGravity(21);
            }
            if (!TextUtils.isEmpty(aVar.p)) {
                setHint(aVar.p);
                setTextSize(1, aVar.o);
            }
            if (!TextUtils.isEmpty(aVar.c)) {
                setText(aVar.c);
                setTextSize(1, aVar.e);
            }
            if (aVar.f) {
                if (!TextUtils.isEmpty(aVar.m)) {
                    setHintTextColor(i.b(aVar.m));
                }
                if (!TextUtils.isEmpty(aVar.n)) {
                    this.p = true;
                    this.q = i.b(aVar.n);
                    if (TextUtils.isEmpty(aVar.c)) {
                        setBackgroundColor(this.q);
                    }
                }
            }
            setPadding(0, 0, 0, 0);
            this.m = aVar.x;
            this.n = aVar.v;
            this.o = aVar.w;
            if (!TextUtils.isEmpty(getText())) {
                if (this.m == -1) {
                    setSelection(getText().length());
                } else {
                    setSelection(this.m);
                }
            }
            this.r = aVar.o;
            this.s = aVar.e;
            if (this.h.equals("text")) {
                setInputType(1);
                setImeOptions(6);
            } else if (this.h.equals("digit")) {
                setInputType(8194);
                setImeOptions(6);
            } else if (this.h.equals("number")) {
                setInputType(2);
                setImeOptions(6);
            }
            if (aVar.l) {
                setInputType(128);
                setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.A = aVar.z;
            this.e = true;
        }
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b16dd5452429dcd97c42bd3251d382fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b16dd5452429dcd97c42bd3251d382fa");
            return;
        }
        this.y = i;
        if (this.A) {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa5e770e9f0138a1f7efa96ab7f735e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa5e770e9f0138a1f7efa96ab7f735e0");
            return;
        }
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        int a2 = rect.bottom + a(this.z);
        int e = p.e() - this.y;
        boolean z = a2 <= this.u.getCurrentWebViewPageHeight();
        int i = a2 - e;
        if (i > 0) {
            this.u.a(i, this.y, z);
        } else if (i >= 0 || this.u.getPan() <= 0 || this.u.getPan() < (-i)) {
        } else {
            this.u.a(i, this.y, z);
        }
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        Object[] objArr = {rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec536acda42f39ff68c7326011f283e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec536acda42f39ff68c7326011f283e")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 17 && Build.VERSION.SDK_INT <= 23) {
            rect.offset(-getScrollX(), -getScrollY());
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    public final void a(C0396b c0396b) {
        Object[] objArr = {c0396b};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82303a5c3dba3acff45929746dde81d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82303a5c3dba3acff45929746dde81d0");
            return;
        }
        try {
            if (c0396b.c) {
                setHint(c0396b.g);
            }
            if (c0396b.e && !TextUtils.equals(getValue(), c0396b.i)) {
                this.b = true;
                setText(c0396b.i);
                setSelection(c0396b.i.length());
            }
            if (!TextUtils.isEmpty(c0396b.b)) {
                this.f = true;
                this.g = i.b(c0396b.b);
            }
            if (c0396b.j >= 0) {
                this.z = c0396b.j;
            }
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.e(th.toString());
        }
    }

    @Override // android.widget.EditText
    @SuppressLint({"DefaultLocale"})
    public void setSelection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545caf289c9540ea42924f949c15b350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545caf289c9540ea42924f949c15b350");
        } else if (a(i, i)) {
            super.setSelection(i);
        } else {
            com.meituan.mmp.lib.trace.b.d(String.format("cursor %d not support size %d", Integer.valueOf(i), Integer.valueOf(length())));
        }
    }
}
