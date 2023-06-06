package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {view, textView, textView2, textView3, textView4, textView5, poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "084f2910f7e22d95544c86ba4f793371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "084f2910f7e22d95544c86ba4f793371");
        } else if (view == null || poiCouponItem == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            switch (poiCouponItem.mCouponType) {
                case 1:
                case 3:
                    sb.append(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_label_poi_coupon));
                    break;
                case 2:
                    sb.append(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_label_member_coupon));
                    break;
                case 5:
                case 6:
                case 8:
                    sb.append(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_label_normal_coupon));
                    break;
                case 9:
                    sb.append(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_label_magic_coupon));
                    break;
            }
            if (textView != null && textView.getVisibility() == 0) {
                sb.append(textView.getText());
            }
            if (textView2 != null && textView2.getVisibility() == 0) {
                sb.append(textView2.getText());
            }
            if (textView3 != null && textView3.getVisibility() == 0) {
                sb.append(textView3.getText());
            }
            if (textView4 != null && textView4.getVisibility() == 0) {
                sb.append(textView4.getText());
            }
            if (textView5 != null && textView5.getVisibility() == 0) {
                sb.append(textView5.getText());
            }
            view.setContentDescription(sb.toString());
        }
    }
}
