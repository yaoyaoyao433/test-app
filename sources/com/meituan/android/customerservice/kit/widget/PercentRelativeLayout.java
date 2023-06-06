package com.meituan.android.customerservice.kit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.customerservice.kit.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PercentRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.customerservice.kit.widget.a b;

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496c79ab26d16ba535be4b5d6b602605", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496c79ab26d16ba535be4b5d6b602605") : new a(-1, -1);
    }

    public PercentRelativeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6de5a0744cb8705e610c050e7ef0dba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6de5a0744cb8705e610c050e7ef0dba");
        } else {
            this.b = new com.meituan.android.customerservice.kit.widget.a(this);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "248892f4c1a555fedc3a7e1e92235295", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "248892f4c1a555fedc3a7e1e92235295");
        } else {
            this.b = new com.meituan.android.customerservice.kit.widget.a(this);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f356d41a18b8de24a97c2ff1f830de56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f356d41a18b8de24a97c2ff1f830de56");
        } else {
            this.b = new com.meituan.android.customerservice.kit.widget.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: a */
    public a generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06f0a6dd3682b51f3db00ad1f7cc94a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06f0a6dd3682b51f3db00ad1f7cc94a") : new a(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f927504fc8c5230721e53f570877b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f927504fc8c5230721e53f570877b6e");
            return;
        }
        this.b.a(i, i2);
        super.onMeasure(i, i2);
        if (this.b.b()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f76c990ba3667dffdce5a623fbf02c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f76c990ba3667dffdce5a623fbf02c41");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.b.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends RelativeLayout.LayoutParams implements a.b {
        public static ChangeQuickRedirect a;
        private a.C0249a b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae745e8bf4120a9e13f555e3861c0c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae745e8bf4120a9e13f555e3861c0c8");
            } else {
                this.b = com.meituan.android.customerservice.kit.widget.a.a(context, attributeSet);
            }
        }

        public a(int i, int i2) {
            super(-1, -1);
            Object[] objArr = {-1, -1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2225a999535decf9a1a917a7739e8546", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2225a999535decf9a1a917a7739e8546");
            }
        }

        @Override // com.meituan.android.customerservice.kit.widget.a.b
        public final a.C0249a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d454e54c3a14b1d172f9e2e4eb7d4b10", RobustBitConfig.DEFAULT_VALUE)) {
                return (a.C0249a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d454e54c3a14b1d172f9e2e4eb7d4b10");
            }
            if (this.b == null) {
                this.b = new a.C0249a();
            }
            return this.b;
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            Object[] objArr = {typedArray, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5ff23beff32344cfa72d31bb8897ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5ff23beff32344cfa72d31bb8897ad");
            } else {
                com.meituan.android.customerservice.kit.widget.a.a(this, typedArray, i, i2);
            }
        }
    }
}
