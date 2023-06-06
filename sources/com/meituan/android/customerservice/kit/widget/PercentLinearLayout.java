package com.meituan.android.customerservice.kit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.android.customerservice.kit.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PercentLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private com.meituan.android.customerservice.kit.widget.a b;

    public PercentLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ca64e7e8fa0ff740e8fca7f3eb459c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ca64e7e8fa0ff740e8fca7f3eb459c");
        } else {
            this.b = new com.meituan.android.customerservice.kit.widget.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51032e9036cbd313d1b8571b89b0ba59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51032e9036cbd313d1b8571b89b0ba59");
            return;
        }
        this.b.a(i, i2);
        super.onMeasure(i, i2);
        if (this.b.b()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42bd508d347368921d602d3b7003f903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42bd508d347368921d602d3b7003f903");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public a generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bfd6c5e935ce24cf28cec9ab327440d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bfd6c5e935ce24cf28cec9ab327440d") : new a(getContext(), attributeSet);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends LinearLayout.LayoutParams implements a.b {
        public static ChangeQuickRedirect a;
        private a.C0249a b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae86d222ec7068fc54716f35efdf931", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae86d222ec7068fc54716f35efdf931");
            } else {
                this.b = com.meituan.android.customerservice.kit.widget.a.a(context, attributeSet);
            }
        }

        @Override // com.meituan.android.customerservice.kit.widget.a.b
        public final a.C0249a a() {
            return this.b;
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            Object[] objArr = {typedArray, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8141f687bbb9b5e56fa28f069e046c30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8141f687bbb9b5e56fa28f069e046c30");
            } else {
                com.meituan.android.customerservice.kit.widget.a.a(this, typedArray, i, i2);
            }
        }
    }
}
