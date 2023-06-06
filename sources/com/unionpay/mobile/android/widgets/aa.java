package com.unionpay.mobile.android.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class aa extends z {
    protected int a;
    protected u b;
    private a c;

    /* loaded from: classes6.dex */
    public interface a {
        void a(u uVar, String str);
    }

    public aa(Context context, int i, JSONObject jSONObject, String str) {
        this(context, i, jSONObject, str, (byte) 0);
    }

    public aa(Context context, int i, JSONObject jSONObject, String str, byte b) {
        super(context, jSONObject, str);
        u uVar;
        String str2;
        u uVar2;
        com.unionpay.mobile.android.resource.c a2;
        int i2;
        this.b = null;
        this.c = null;
        this.a = i;
        com.unionpay.mobile.android.resource.c.a(this.d);
        this.b = new u(getContext());
        if (this.i) {
            this.b.a();
            this.b.d();
        }
        this.b.c(i());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n);
        layoutParams.addRule(15, -1);
        this.m.addView(this.b, layoutParams);
        this.b.b(com.unionpay.mobile.android.utils.j.a(jSONObject, ReactTextInputShadowNode.PROP_PLACEHOLDER));
        this.b.setFocusable(true);
        this.b.a(new ab(this));
        this.b.a(new ac(this));
        this.b.a(com.unionpay.mobile.android.resource.c.a(this.d).a(2000, -1, com.unionpay.mobile.android.global.a.v));
        if (!(this instanceof af)) {
            if (this instanceof ap) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aR;
            } else if (this instanceof ah) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aT;
            } else if (this instanceof UPWidget) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aS;
            } else if (this instanceof au) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aU;
            } else if (this instanceof ao) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aV;
            } else if (this instanceof e) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aW;
            } else if (this instanceof ae) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aX;
            } else if (this instanceof bd) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aY;
            } else if (this instanceof at) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.aZ;
            } else if (this instanceof av) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.ba;
            } else if (this instanceof f) {
                uVar = this.b;
                str2 = com.unionpay.mobile.android.languages.c.bD.bb;
            }
            uVar.a(str2);
        } else if (this.i) {
            u uVar3 = this.b;
            uVar3.c(this.h + StringUtil.SPACE + this.g);
        } else {
            uVar = this.b;
            str2 = com.unionpay.mobile.android.languages.c.bD.aQ;
            uVar.a(str2);
        }
        if (this instanceof k) {
            uVar2 = this.b;
            a2 = com.unionpay.mobile.android.resource.c.a(this.d);
            i2 = 1011;
        } else {
            uVar2 = this.b;
            a2 = com.unionpay.mobile.android.resource.c.a(this.d);
            i2 = 1013;
        }
        uVar2.setBackgroundDrawable(a2.a(i2, -1, -1));
    }

    public String a() {
        return this.b.b();
    }

    public void a(Editable editable) {
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(View view) {
        if (view != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            Log.e("uppay", "v getGlobalVisibleRect():" + rect.toString());
            Rect rect2 = new Rect();
            ((Activity) this.d).getWindow().getDecorView().findViewById(16908290).getGlobalVisibleRect(rect2);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Log.e("uppay", " locationW = [" + iArr[0] + CommonConstant.Symbol.COMMA + iArr[1] + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Log.e("uppay", " locationS = [" + iArr2[0] + CommonConstant.Symbol.COMMA + iArr2[1] + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            boolean z = (iArr[1] + view.getHeight()) + 10 > rect2.bottom;
            View findViewById = ((Activity) this.d).getWindow().getDecorView().findViewById(16908290);
            Rect rect3 = new Rect();
            findViewById.getLocalVisibleRect(rect3);
            Log.e("uppay", " getLocalVisibleRect = " + rect3.toString());
            Rect rect4 = new Rect();
            findViewById.getGlobalVisibleRect(rect4);
            Log.e("uppay", " getGlobalVisibleRect = " + rect4.toString());
            return z;
        }
        throw new NullPointerException();
    }

    public final boolean a(u uVar) {
        return uVar != null && this.b == uVar;
    }

    public boolean c() {
        return (a() == null || a().length() == 0) ? false : true;
    }

    public final void g() {
        if (this.b == null || this.i) {
            return;
        }
        this.b.e();
    }
}
