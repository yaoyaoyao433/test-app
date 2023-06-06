package com.meituan.android.paybase.screen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.android.paybase.screen.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoFitLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect b;
    private com.meituan.android.paybase.screen.a a;

    public AutoFitLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "651aa42a7c41123cdeae97b022188421", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "651aa42a7c41123cdeae97b022188421");
        } else {
            this.a = new com.meituan.android.paybase.screen.a(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5276df9e37359c8dd28d08ed1efe966", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5276df9e37359c8dd28d08ed1efe966") : new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a510a2f63657767444f941a3a5514139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a510a2f63657767444f941a3a5514139");
            return;
        }
        super.addView(view, i, layoutParams);
        b.a().a(view);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64add2695d12c94d9002529423f9ab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64add2695d12c94d9002529423f9ab4");
            return;
        }
        this.a.a(layoutParams);
        super.setLayoutParams(layoutParams);
        this.a.a(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends LinearLayout.LayoutParams implements b.a {
        public static ChangeQuickRedirect a;
        private com.meituan.android.paybase.screen.a c;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {AutoFitLinearLayout.this, context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534cd2e9e734d11aa92da74ca2183589", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534cd2e9e734d11aa92da74ca2183589");
                return;
            }
            this.c = new com.meituan.android.paybase.screen.a(AutoFitLinearLayout.this.getContext(), attributeSet);
            this.c.a(this);
        }

        @Override // com.meituan.android.paybase.screen.b.a
        public final com.meituan.android.paybase.screen.a a() {
            return this.c;
        }
    }
}
