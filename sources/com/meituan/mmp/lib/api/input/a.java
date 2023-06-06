package com.meituan.mmp.lib.api.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import com.meituan.mmp.lib.widget.MMMPEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public abstract class a extends MMMPEditText implements TextWatcher, View.OnFocusChangeListener, d {
    public static ChangeQuickRedirect a;
    public boolean b;
    public InputConnectionWrapper c;
    protected char d;
    protected boolean e;
    protected boolean f;
    protected int g;
    protected String h;
    protected int i;
    public final String j;
    protected int k;
    protected boolean l;
    protected int m;
    protected int n;
    protected int o;
    protected boolean p;
    protected int q;
    protected float r;
    protected float s;
    protected com.meituan.mmp.lib.interfaces.c t;
    public com.meituan.mmp.lib.page.e u;
    protected boolean v;
    protected e w;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean getConfirm() {
        return false;
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public abstract int getInputHeight();

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public a(Context context, String str, int i, String str2, com.meituan.mmp.lib.interfaces.c cVar) {
        super(context);
        Object[] objArr = {context, str, Integer.valueOf(i), str2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933eb6e4aaf0171e460ae64ae164e2f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933eb6e4aaf0171e460ae64ae164e2f6");
            return;
        }
        this.d = (char) 0;
        this.e = false;
        this.f = true;
        this.g = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = false;
        this.q = 0;
        this.r = 0.0f;
        this.s = 0.0f;
        this.i = str.hashCode();
        this.j = str;
        this.k = i;
        this.h = str2;
        this.t = cVar;
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    public void a(com.meituan.mmp.lib.page.e eVar) {
        this.u = eVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object[] objArr = {editorInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c1130ac05ffada22aa49f4192fa802", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c1130ac05ffada22aa49f4192fa802");
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        this.c = new InputConnectionWrapper(onCreateInputConnection, false) { // from class: com.meituan.mmp.lib.api.input.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean setComposingText(CharSequence charSequence, int i) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cad03510ef186856a268ad35284244f1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cad03510ef186856a268ad35284244f1")).booleanValue();
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    a.this.d = charSequence.charAt(charSequence.length() - 1);
                }
                return super.setComposingText(charSequence, i);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee98757fbfa821d94d10ff07cebc0525", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee98757fbfa821d94d10ff07cebc0525")).booleanValue();
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    a.this.d = charSequence.charAt(charSequence.length() - 1);
                }
                return super.commitText(charSequence, i);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1faf9b0dfe582ce2f0bfa2bced886ca4", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1faf9b0dfe582ce2f0bfa2bced886ca4")).booleanValue();
                }
                a.this.d = '\b';
                return super.deleteSurroundingText(i, i2);
            }
        };
        editorInfo.imeOptions |= y.a;
        return this.c;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779f8b2ab504c13afe2b9807861976d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779f8b2ab504c13afe2b9807861976d6");
        } else if (this.e) {
            if (TextUtils.isEmpty(editable.toString())) {
                if (this.p) {
                    setBackgroundColor(this.q);
                }
                setTextSize(1, this.r);
            } else {
                if (this.f) {
                    setBackgroundColor(this.g);
                }
                setTextSize(1, this.s);
            }
            if (this.b) {
                this.b = false;
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe3c7faaa2196bafce6a7dce55689795", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe3c7faaa2196bafce6a7dce55689795");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", getValue());
                jSONObject.put("inputId", this.j);
                jSONObject.put("cursor", getCursor());
                jSONObject.put("keyCode", (int) getLastKeyCode());
                if (this.t != null) {
                    this.t.a("onKeyboardValueChange", jSONObject, this.k);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(final View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9e451bd05ee844203894aa95ed7b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9e451bd05ee844203894aa95ed7b25");
            return;
        }
        if (z) {
            post(new Runnable() { // from class: com.meituan.mmp.lib.api.input.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75420a4f71e134b47fa6d57b5e20fc17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75420a4f71e134b47fa6d57b5e20fc17");
                        return;
                    }
                    if (a.this.m > 0 && a.this.m <= a.this.length()) {
                        a.this.setSelection(a.this.m);
                    }
                    if (!(a.this.n == 0 && a.this.o == 0) && a.this.a(a.this.n, a.this.o)) {
                        a.this.setSelection(a.this.n, a.this.o);
                    }
                }
            });
            final Context context = getContext();
            Object[] objArr2 = {view, context};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.utils.y.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d86966594e7263dd8778b40119216ee8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d86966594e7263dd8778b40119216ee8");
            } else if (view.requestFocus()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.mmp.lib.utils.y.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d4c511b78b02f2c905a5b9a15fc23f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d4c511b78b02f2c905a5b9a15fc23f8");
                        } else {
                            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 1);
                        }
                    }
                });
            }
        }
        if (this.w != null) {
            this.w.a(1, z, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4838bf108d12010ac9d8fb3f705e9b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4838bf108d12010ac9d8fb3f705e9b58");
            return;
        }
        this.t = null;
        this.w = null;
        setOnEditorActionListener(null);
        removeTextChangedListener(this);
        super.onDetachedFromWindow();
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public final int a() {
        return this.i;
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public final String I_() {
        return this.j;
    }

    public char getLastKeyCode() {
        return this.d;
    }

    public String getType() {
        return this.h;
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public String getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f48e3732d00c0f62cdfd857dd99108", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f48e3732d00c0f62cdfd857dd99108") : getText().toString();
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public int getCursor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3076d10dc3b53e106e4ee382db1535", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3076d10dc3b53e106e4ee382db1535")).intValue() : getSelectionStart();
    }

    @Override // android.view.View, com.meituan.mmp.lib.api.input.d
    public boolean hasFocus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761d231b15d8cb285644cd4aa790e2be", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761d231b15d8cb285644cd4aa790e2be")).booleanValue() : super.hasFocus();
    }

    public void setValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037e86b8d003658652214d57a44ce170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037e86b8d003658652214d57a44ce170");
        } else {
            setText(str);
        }
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public void a(e eVar) {
        this.w = eVar;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a60a86aaa7cd5e65bd1b58547dac59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a60a86aaa7cd5e65bd1b58547dac59");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", getText().toString());
            jSONObject.put("inputId", this.j);
            jSONObject.put("cursor", getCursor());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.t != null) {
            this.t.a("onKeyboardConfirm", jSONObject, this.k);
        }
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c43aec2d18b6d07c39a325a102212a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c43aec2d18b6d07c39a325a102212a9f");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", getValue());
            jSONObject.put("inputId", this.j);
            jSONObject.put("cursor", getCursor());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.t != null) {
            this.t.a("onKeyboardComplete", jSONObject, this.k);
        }
    }

    public final boolean a(int i, int i2) {
        int length;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12129ee7db943a69cbba58f636aa3635", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12129ee7db943a69cbba58f636aa3635")).booleanValue() : i2 >= i && i <= (length = length()) && i2 <= length && i >= 0 && i2 >= 0;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc65053c06686dce5926d46c5c724db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc65053c06686dce5926d46c5c724db")).booleanValue();
        }
        if (i == 67) {
            this.d = '\b';
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (onKeyDown && i == 66) {
            this.d = '\n';
        }
        return onKeyDown;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.input.a.a(org.json.JSONObject):void");
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a74ad4e9ebece678a65a12b21dd09d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a74ad4e9ebece678a65a12b21dd09d")).intValue();
        }
        if (i < 0) {
            return 0;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.u.getSwipeRefreshLayout().getLocationInWindow(iArr);
        getLocationInWindow(iArr2);
        return Math.min(this.u.getCurrentWebViewPageHeight() - ((iArr2[1] - iArr[1]) + getMeasuredHeight()), i);
    }
}
