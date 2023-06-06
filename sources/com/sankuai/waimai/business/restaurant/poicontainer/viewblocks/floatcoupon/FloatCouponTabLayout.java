package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.AbsTabLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FloatCouponTabLayout extends AbsTabLayout {
    public static ChangeQuickRedirect a;

    public FloatCouponTabLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68e12e9936e8f6a9fd854ba4572a591", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68e12e9936e8f6a9fd854ba4572a591");
        }
    }

    public FloatCouponTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef4baa4e2cd5669b051f79880a31020", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef4baa4e2cd5669b051f79880a31020");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.AbsTabLayout
    public final View a(CharSequence charSequence, LayoutInflater layoutInflater, int i) {
        Object[] objArr = {charSequence, layoutInflater, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50b4eb40df034f3bda548e2e5307305", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50b4eb40df034f3bda548e2e5307305");
        }
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.wm_restaurant_tab_layout_float_coupon_item, (ViewGroup) this, false);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = i;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.requestLayout();
        ((TextView) viewGroup.findViewById(R.id.tv_tab)).setText(charSequence);
        return viewGroup;
    }

    @Override // com.sankuai.waimai.platform.widget.AbsTabLayout
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878bc48f92dbf3cb25d05ed78c96c828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878bc48f92dbf3cb25d05ed78c96c828");
        } else if (view == null) {
        } else {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab);
            textView.setTextColor(Color.parseColor("#222426"));
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    @Override // com.sankuai.waimai.platform.widget.AbsTabLayout
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9893ef3d07de8eca2d12f4246945c363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9893ef3d07de8eca2d12f4246945c363");
        } else if (view == null) {
        } else {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab);
            textView.setTextColor(Color.parseColor("#575859"));
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final View a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43352653cb34111c67f3e9c7813489dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43352653cb34111c67f3e9c7813489dd");
        }
        if (this.e == null || this.e.getChildCount() <= 0) {
            return null;
        }
        return this.e.getChildAt(0);
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1279b03a9cb6dfda890305e527aceb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1279b03a9cb6dfda890305e527aceb5e");
        } else if (this.e != null) {
            if (i >= this.e.getChildCount()) {
                i = 0;
            }
            for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
                b(this.e.getChildAt(i2));
            }
            a(this.e.getChildAt(i));
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfed542ca8eb1f683fe5c78d2b435048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfed542ca8eb1f683fe5c78d2b435048");
        } else if (z) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    public View getTabContainer() {
        return this.e;
    }

    public int getTabsCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad548f23593afd68dc3ff8e85cd303d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad548f23593afd68dc3ff8e85cd303d")).intValue();
        }
        if (this.e != null) {
            return this.e.getChildCount();
        }
        return 0;
    }
}
