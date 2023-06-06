package com.sankuai.waimai.business.restaurant.poicontainer.selfdelivery;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.capacity.immersed.a;
import com.sankuai.waimai.platform.widget.emptylayout.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SelfDeliveryRestaurantActivity extends BaseActivity {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b188238a874f27e5ae07003921e7bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b188238a874f27e5ae07003921e7bbe");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_restaurant_main_layout);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d4d3c38a4f3ffdefd5ecd805a3f68c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d4d3c38a4f3ffdefd5ecd805a3f68c5");
        } else {
            a.b(this, false);
            a.a((Activity) this, true);
        }
        d dVar = new d(this);
        int i = d.m;
        Object[] objArr3 = {Integer.valueOf(i), "如需自取，请在提交订单前的页面切换选择", "（前提：商家需开通自取哦~）"};
        ChangeQuickRedirect changeQuickRedirect3 = d.c;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "072c3357648a74625ba259abbe12f890", RobustBitConfig.DEFAULT_VALUE)) {
            d dVar2 = (d) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "072c3357648a74625ba259abbe12f890");
        } else {
            dVar.b(i, "如需自取，请在提交订单前的页面切换选择", "（前提：商家需开通自取哦~）", (String) null, (View.OnClickListener) null);
        }
        dVar.f();
    }
}
