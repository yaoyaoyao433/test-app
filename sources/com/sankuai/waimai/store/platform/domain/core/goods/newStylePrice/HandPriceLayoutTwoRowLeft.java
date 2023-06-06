package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HandPriceLayoutTwoRowLeft extends BaseHandPriceView {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public int getLayoutId() {
        return R.layout.wm_drug_new_style_price_two_row_left;
    }

    public HandPriceLayoutTwoRowLeft(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68205a2b85ffa04dd14b426ea7e69dc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68205a2b85ffa04dd14b426ea7e69dc7");
        }
    }

    public HandPriceLayoutTwoRowLeft(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb887dabc278bfbb644039c0b1374096", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb887dabc278bfbb644039c0b1374096");
        }
    }
}
