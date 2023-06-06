package com.sankuai.waimai.store.v2.marketing.coupons.dialog;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.indicator.TabInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CouponsTitleWithIndicatorV2 extends SCTitleWithIndicatorV2 {
    public static ChangeQuickRedirect e;
    protected float f;

    @Override // com.sankuai.waimai.store.v2.marketing.coupons.dialog.SCTitleWithIndicatorV2, com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_sc_common_title_with_indicator_container;
    }

    public CouponsTitleWithIndicatorV2(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412c24e35b8757a4a7067d645683687a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412c24e35b8757a4a7067d645683687a");
        } else {
            this.f = 0.0f;
        }
    }

    public CouponsTitleWithIndicatorV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad8b7abe78ecffa2076393a78163fcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad8b7abe78ecffa2076393a78163fcb");
        } else {
            this.f = 0.0f;
        }
    }

    public CouponsTitleWithIndicatorV2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5520bc043de3a3a9562073f8337abcb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5520bc043de3a3a9562073f8337abcb5");
        } else {
            this.f = 0.0f;
        }
    }

    public void setIndicateVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd10e3621d19553899859a0a3c9cded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd10e3621d19553899859a0a3c9cded");
        } else {
            this.i.setVisibility(i);
        }
    }

    public void setTextSize(float f) {
        this.f = f;
    }

    @Override // com.sankuai.waimai.store.v2.marketing.coupons.dialog.SCTitleWithIndicatorV2
    public final TabLayout.d a(int i, TabLayout.d dVar, TabInfo tabInfo) {
        Object[] objArr = {Integer.valueOf(i), dVar, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be318c507d37dce05f805af5a1494204", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabLayout.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be318c507d37dce05f805af5a1494204");
        }
        TabLayout.d a = super.a(i, dVar, tabInfo);
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
