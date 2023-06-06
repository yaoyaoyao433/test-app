package com.meituan.android.paybase.screen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.paybase.screen.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoFitFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private com.meituan.android.paybase.screen.a b;

    public AutoFitFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ae836afc52937a5a2eee255397a88e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ae836afc52937a5a2eee255397a88e");
        } else {
            this.b = new com.meituan.android.paybase.screen.a(context, attributeSet);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4386396caeeba12801a642d9ee748231", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4386396caeeba12801a642d9ee748231") : new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fface77fa09cacc6279646b675e8d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fface77fa09cacc6279646b675e8d98");
            return;
        }
        super.addView(view, i, layoutParams);
        b.a().a(view);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a983f757b6e8df7ca2c27d2748390058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a983f757b6e8df7ca2c27d2748390058");
            return;
        }
        this.b.a(layoutParams);
        super.setLayoutParams(layoutParams);
        this.b.a(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends FrameLayout.LayoutParams implements b.a {
        public static ChangeQuickRedirect a;
        private com.meituan.android.paybase.screen.a c;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {AutoFitFrameLayout.this, context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d516356f86e65f6e9228da7a3e5049", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d516356f86e65f6e9228da7a3e5049");
                return;
            }
            this.c = new com.meituan.android.paybase.screen.a(AutoFitFrameLayout.this.getContext(), attributeSet);
            this.c.a(this);
        }

        @Override // com.meituan.android.paybase.screen.b.a
        public final com.meituan.android.paybase.screen.a a() {
            return this.c;
        }
    }
}
