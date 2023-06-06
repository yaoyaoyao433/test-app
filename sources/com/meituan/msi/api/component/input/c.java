package com.meituan.msi.api.component.input;

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
import com.meituan.msi.context.h;
import com.meituan.msi.dispather.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c extends MSIEdiText implements TextWatcher, View.OnFocusChangeListener {
    public static ChangeQuickRedirect b;
    protected static final Handler c = new Handler(Looper.getMainLooper());
    public boolean d;
    public InputConnectionWrapper e;
    protected char f;
    protected boolean g;
    protected boolean h;
    protected int i;
    protected String j;
    public String k;
    public String l;
    protected int m;
    protected int n;
    protected int o;
    protected boolean p;
    protected int q;
    protected float r;
    protected float s;
    protected a t;
    public e u;
    public h v;
    public com.meituan.msi.context.a w;
    public com.meituan.msi.page.c x;

    public abstract void a();

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean getConfirm() {
        return false;
    }

    public abstract int getInputHeight();

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f540f4398ee7ba2d22df77270b3ea32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f540f4398ee7ba2d22df77270b3ea32");
            return;
        }
        this.f = (char) 0;
        this.g = false;
        this.h = false;
        this.i = -1;
        this.k = "";
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = false;
        this.q = 0;
        this.r = 0.0f;
        this.s = 0.0f;
    }

    public final void a(String str, String str2, e eVar, h hVar, com.meituan.msi.context.a aVar) {
        Object[] objArr = {str, str2, eVar, hVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f8cbf5aa2390f7c0c5472003da84bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f8cbf5aa2390f7c0c5472003da84bd");
            return;
        }
        this.k = str;
        this.l = str2;
        this.u = eVar;
        this.v = hVar;
        this.w = aVar;
        if (hVar != null && hVar.a(Integer.valueOf(str2).intValue()) != null) {
            this.x = hVar.a(Integer.valueOf(str2).intValue()).getKeyBoard();
        }
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object[] objArr = {editorInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1581f03a5a5ee2789f6d583c1c1906d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1581f03a5a5ee2789f6d583c1c1906d0");
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        this.e = new InputConnectionWrapper(onCreateInputConnection, false) { // from class: com.meituan.msi.api.component.input.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean setComposingText(CharSequence charSequence, int i) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a9ed31d7d9a650f2ce5b8715ec0d690", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a9ed31d7d9a650f2ce5b8715ec0d690")).booleanValue();
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    c.this.f = charSequence.charAt(charSequence.length() - 1);
                }
                return super.setComposingText(charSequence, i);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cba46ab9093f2b398cfe243e71bb56f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cba46ab9093f2b398cfe243e71bb56f")).booleanValue();
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    c.this.f = charSequence.charAt(charSequence.length() - 1);
                }
                return super.commitText(charSequence, i);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc2c5b57984db21ed46daf55f34e58ba", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc2c5b57984db21ed46daf55f34e58ba")).booleanValue();
                }
                c.this.f = '\b';
                return super.deleteSurroundingText(i, i2);
            }
        };
        editorInfo.imeOptions |= y.a;
        return this.e;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c37b354cbdbb1e6d853342000ccb645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c37b354cbdbb1e6d853342000ccb645");
        } else if (this.g) {
            b();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90234269a85a520f811ded478e78d736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90234269a85a520f811ded478e78d736");
        } else if (this.h) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", getValue());
                jSONObject.put("cursor", getCursor());
                jSONObject.put("keyCode", (int) getLastKeyCode());
                jSONObject.put("viewId", this.k);
                if (this.u != null) {
                    this.u.a("onInput", jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r13.equals("go") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msi.api.component.input.c.b
            java.lang.String r11 = "8f37ed3b11ef77418f6e4ed7f818b71e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            return r13
        L22:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            r4 = 4
            r5 = 2
            r6 = 3
            if (r2 == r3) goto L6d
            r3 = 3304(0xce8, float:4.63E-42)
            if (r2 == r3) goto L63
            r0 = 3089282(0x2f2382, float:4.329006E-39)
            if (r2 == r0) goto L59
            r0 = 3377907(0x338af3, float:4.733456E-39)
            if (r2 == r0) goto L4e
            r0 = 3526536(0x35cf88, float:4.94173E-39)
            if (r2 == r0) goto L43
            goto L78
        L43:
            java.lang.String r0 = "send"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L78
            r0 = 4
            goto L79
        L4e:
            java.lang.String r0 = "next"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L78
            r0 = 3
            goto L79
        L59:
            java.lang.String r0 = "done"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L78
            r0 = 2
            goto L79
        L63:
            java.lang.String r2 = "go"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L78
            goto L79
        L6d:
            java.lang.String r0 = "search"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L78
            r0 = 0
            goto L79
        L78:
            r0 = -1
        L79:
            r13 = 6
            switch(r0) {
                case 0: goto L83;
                case 1: goto L82;
                case 2: goto L81;
                case 3: goto L7f;
                case 4: goto L7e;
                default: goto L7d;
            }
        L7d:
            return r13
        L7e:
            return r4
        L7f:
            r13 = 5
            return r13
        L81:
            return r13
        L82:
            return r5
        L83:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.component.input.c.a(java.lang.String):int");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1912fa48abf264a937c11c2a766219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1912fa48abf264a937c11c2a766219");
            return;
        }
        this.t = null;
        setOnEditorActionListener(null);
        removeTextChangedListener(this);
        super.onDetachedFromWindow();
    }

    public char getLastKeyCode() {
        return this.f;
    }

    public int getCursor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657905d18f498b498235bf7c725c42e3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657905d18f498b498235bf7c725c42e3")).intValue() : getSelectionStart();
    }

    public String getType() {
        return this.j;
    }

    public String getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7deb12eccaffb61958c405fc8e1e2b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7deb12eccaffb61958c405fc8e1e2b9") : getText().toString();
    }

    public void setValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966e3cd225786a0b438f437adc64b849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966e3cd225786a0b438f437adc64b849");
        } else {
            setText(str);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71462565eed8873861c790d3ce6d86a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71462565eed8873861c790d3ce6d86a6");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", getValue());
            jSONObject.put("cursor", getCursor());
            jSONObject.put("viewId", this.k);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.u != null) {
            this.u.a("onConfirm", jSONObject);
        }
    }

    @Override // android.view.View
    public boolean hasFocus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4832a4b50f9f51a310428bf94f10a1cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4832a4b50f9f51a310428bf94f10a1cd")).booleanValue() : super.hasFocus();
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd27b3682137e06d020d30f9f45caad0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd27b3682137e06d020d30f9f45caad0")).booleanValue();
        }
        if (i == 67) {
            this.f = '\b';
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (onKeyDown && i == 66) {
            this.f = '\n';
        }
        return onKeyDown;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100a05e0ccf327f6c1d4e105f3f4b3d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100a05e0ccf327f6c1d4e105f3f4b3d2")).intValue();
        }
        if (i < 0) {
            return 0;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.x.a(iArr);
        getLocationInWindow(iArr2);
        return Math.min(this.x.b() - ((iArr2[1] - iArr[1]) + getMeasuredHeight()), i);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0eabea916387c8f99a73da66c24b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0eabea916387c8f99a73da66c24b5a");
        } else if (this.v == null || this.v.a(Integer.valueOf(this.l).intValue()) == null) {
        } else {
            this.x = this.v.a(Integer.valueOf(this.l).intValue()).getKeyBoard();
            a();
        }
    }
}
