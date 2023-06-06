package com.meituan.android.paybase.screen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.paybase.screen.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoFitRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private com.meituan.android.paybase.screen.a b;

    public AutoFitRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c718ded467490316493c24fde219088c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c718ded467490316493c24fde219088c");
        } else {
            this.b = new com.meituan.android.paybase.screen.a(context, attributeSet);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5374b6af62adcb448c56df1dc3d04b48", RobustBitConfig.DEFAULT_VALUE) ? (RelativeLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5374b6af62adcb448c56df1dc3d04b48") : new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6f0b1de187deb26481929d6dde0a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6f0b1de187deb26481929d6dde0a19");
            return;
        }
        super.addView(view, i, layoutParams);
        b.a().a(view);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ba4af9cc9517576a743c2ac2521d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ba4af9cc9517576a743c2ac2521d0f");
            return;
        }
        this.b.a(layoutParams);
        super.setLayoutParams(layoutParams);
        this.b.a(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends RelativeLayout.LayoutParams implements b.a {
        public static ChangeQuickRedirect a;
        private com.meituan.android.paybase.screen.a b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c4cf6a076086dd8cb6805173a5b9a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c4cf6a076086dd8cb6805173a5b9a2");
                return;
            }
            this.b = new com.meituan.android.paybase.screen.a(context, attributeSet);
            this.b.a(this);
        }

        @Override // com.meituan.android.paybase.screen.b.a
        public final com.meituan.android.paybase.screen.a a() {
            return this.b;
        }
    }
}
