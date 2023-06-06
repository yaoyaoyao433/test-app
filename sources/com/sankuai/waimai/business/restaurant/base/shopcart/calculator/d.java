package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(GoodsAttr[] goodsAttrArr, String str) {
        boolean z;
        Object[] objArr = {goodsAttrArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b19951e182a109daf129fb1026cb70eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b19951e182a109daf129fb1026cb70eb");
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            sb.append(str);
            z = true;
        }
        if (goodsAttrArr != null && goodsAttrArr.length > 0) {
            for (GoodsAttr goodsAttr : goodsAttrArr) {
                if (goodsAttr != null && !TextUtils.isEmpty(goodsAttr.getValue())) {
                    if (z) {
                        sb.append("+");
                    } else {
                        z = true;
                    }
                    sb.append(goodsAttr.getValue());
                }
            }
        }
        return sb.toString();
    }

    @Nullable
    public static String a(int i, int i2, GoodsAttr[] goodsAttrArr, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), goodsAttrArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7ecae70f8a25191c4b1029b29aa3506", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7ecae70f8a25191c4b1029b29aa3506") : (i2 <= 0 || i2 >= i) ? a(goodsAttrArr, str) : com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_desc_original_price, Integer.valueOf(i - i2));
    }
}
