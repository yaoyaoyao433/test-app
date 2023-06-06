package com.unionpay.mobile.android.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.unionpay.mobile.android.widgets.u;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class UPWidget extends aa implements u.b {
    private static final int o = com.unionpay.mobile.android.global.a.t / 3;
    protected int c;
    private long p;
    private boolean q;
    private String r;
    private boolean s;
    private ViewTreeObserver.OnGlobalLayoutListener t;
    private bb u;
    private View.OnClickListener v;

    public UPWidget(Context context, long j, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
        this.q = true;
        this.r = null;
        this.c = 0;
        this.s = false;
        this.t = new aw(this);
        this.u = null;
        this.v = new ax(this);
        this.p = j;
        this.b.a((u.b) this);
        this.b.a(new InputFilter.LengthFilter(6));
        this.b.f();
        this.b.d();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void appendOnce(long j, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(UPWidget uPWidget) {
        com.unionpay.mobile.android.utils.k.a("kb", "pwdInputFinished() +++");
        com.unionpay.mobile.android.utils.k.a("kb", "size = " + uPWidget.c);
        uPWidget.k();
        com.unionpay.mobile.android.utils.k.a("kb", "pwdInputFinished() ---");
    }

    private native void clearAll(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void deleteOnce(long j);

    private native String getMsg(long j);

    private native String getMsgExtra(long j, String str);

    private void w() {
        if (x() != null) {
            x().getViewTreeObserver().removeGlobalOnLayoutListener(this.t);
        }
        if (this.u == null || !this.u.b()) {
            return;
        }
        this.u.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View x() {
        return ((Activity) this.d).findViewById(8888);
    }

    @Override // com.unionpay.mobile.android.widgets.aa, com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        return this.q ? getMsgExtra(this.p, this.r) : getMsg(this.p);
    }

    public final void a(long j) {
        this.p = j;
    }

    @Override // com.unionpay.mobile.android.widgets.u.a
    public final void a(boolean z) {
        this.s = z;
        if (!z) {
            w();
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        int height = x().getRootView().getHeight() - x().getHeight();
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        if (height == rect.top) {
            l();
        } else if (j()) {
        } else {
            com.unionpay.mobile.android.utils.k.a("uppay", "key board is closing..");
            com.unionpay.mobile.android.utils.k.a("uppay", "registerKeyboardDissmisslisner() +++");
            if (x() != null) {
                x().getViewTreeObserver().addOnGlobalLayoutListener(this.t);
            }
            com.unionpay.mobile.android.utils.k.a("uppay", "registerKeyboardDissmisslisner() ---");
        }
    }

    @Override // com.unionpay.mobile.android.widgets.u.b
    public final void a_() {
        if (!this.s || j()) {
            return;
        }
        l();
    }

    public final void b(String str) {
        this.r = str;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return this.c == 6;
    }

    @Override // com.unionpay.mobile.android.widgets.aa, com.unionpay.mobile.android.widgets.ba.a
    public final boolean c() {
        com.unionpay.mobile.android.utils.k.a("uppay", "emptyCheck() +++ ");
        com.unionpay.mobile.android.utils.k.a("uppay", "mPINCounts =  " + this.c);
        com.unionpay.mobile.android.utils.k.a("uppay", "emptyCheck() --- ");
        return this.c != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_bank_pwd";
    }

    @Override // com.unionpay.mobile.android.widgets.u.b
    public final void e() {
        clearAll(this.p);
        this.c = 0;
    }

    public final boolean j() {
        return this.u != null && this.u.b();
    }

    public final void k() {
        com.unionpay.mobile.android.utils.k.a("uppay", "closeCustomKeyboard() +++");
        if (j()) {
            w();
        }
        com.unionpay.mobile.android.utils.k.a("uppay", "closeCustomKeyboard() ---");
    }

    public final void l() {
        if (!this.s || j()) {
            return;
        }
        this.u = new bb(getContext(), this.v, this);
        this.u.a(this);
        String str = "";
        for (int i = 0; i < this.c; i++) {
            str = str + "*";
        }
        this.b.c(str);
        this.b.b(str.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }
}
