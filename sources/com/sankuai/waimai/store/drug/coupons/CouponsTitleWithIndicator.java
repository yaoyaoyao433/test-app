package com.sankuai.waimai.store.drug.coupons;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.newwidgets.indicator.SCTitleWithIndicator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CouponsTitleWithIndicator extends SCTitleWithIndicator {
    public static ChangeQuickRedirect e;
    protected float f;

    @Override // com.sankuai.waimai.store.drug.newwidgets.indicator.SCTitleWithIndicator, com.sankuai.waimai.store.drug.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_drug_common_title_with_indicator_container;
    }

    public CouponsTitleWithIndicator(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56185f2946d36f54ac386cdb10f4e0c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56185f2946d36f54ac386cdb10f4e0c1");
        } else {
            this.f = 0.0f;
        }
    }

    public CouponsTitleWithIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a2cece439a7c1d4e243ec6548c46ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a2cece439a7c1d4e243ec6548c46ad");
        } else {
            this.f = 0.0f;
        }
    }

    public CouponsTitleWithIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fe832cb673a2e0e4fe4669e270aa96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fe832cb673a2e0e4fe4669e270aa96");
        } else {
            this.f = 0.0f;
        }
    }

    public void setIndicateVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eab6b862d642f928cc5cfcab15173fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eab6b862d642f928cc5cfcab15173fb");
        } else {
            this.i.setVisibility(i);
        }
    }

    public void setTextSize(float f) {
        this.f = f;
    }

    @Override // com.sankuai.waimai.store.drug.newwidgets.indicator.SCTitleWithIndicator
    public final TabLayout.d a(int i, TabLayout.d dVar, com.sankuai.waimai.store.drug.newwidgets.indicator.a aVar) {
        Object[] objArr = {Integer.valueOf(i), dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f823820f8c8cb351320a8bda4433a642", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabLayout.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f823820f8c8cb351320a8bda4433a642");
        }
        TabLayout.d a = super.a(i, dVar, aVar);
        for (TextView textView : this.j.values()) {
            if (textView != null) {
                textView.setMaxEms(8);
                if (this.f > 0.0f) {
                    textView.setTextSize(this.f);
                }
            }
        }
        return a;
    }
}
