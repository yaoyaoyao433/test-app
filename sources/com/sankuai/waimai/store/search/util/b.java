package com.sankuai.waimai.store.search.util;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.DeliverTypeInfoVo;
import com.sankuai.waimai.store.view.DeliverView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(DeliverView deliverView, DeliverTypeInfoVo deliverTypeInfoVo) {
        Object[] objArr = {deliverView, deliverTypeInfoVo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0f5edc928c4d8b9aaccf102838aee36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0f5edc928c4d8b9aaccf102838aee36");
        } else if (deliverView == null) {
        } else {
            if (deliverTypeInfoVo == null) {
                u.c(deliverView);
            } else if (TextUtils.isEmpty(deliverTypeInfoVo.deliverText) && TextUtils.isEmpty(deliverTypeInfoVo.deliveryTimeTip)) {
                u.c(deliverView);
            } else {
                u.a(deliverView);
                float dimensionPixelOffset = deliverView.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
                deliverView.a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                deliverView.a(deliverTypeInfoVo.deliverText, deliverTypeInfoVo.deliveryTimeTip);
                deliverView.a(deliverTypeInfoVo.deliverType);
            }
        }
    }

    public static void a(DeliverTypeInfoVo deliverTypeInfoVo, View... viewArr) {
        Object[] objArr = {deliverTypeInfoVo, viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6240acdac6f8db5e45936ed01f77778c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6240acdac6f8db5e45936ed01f77778c");
        } else if (deliverTypeInfoVo != null) {
            if (TextUtils.isEmpty(deliverTypeInfoVo.deliverText) && TextUtils.isEmpty(deliverTypeInfoVo.deliveryTimeTip)) {
                return;
            }
            u.c(viewArr);
        }
    }
}
