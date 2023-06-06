package com.meituan.android.legwork.mvp.model;

import android.text.TextUtils;
import com.meituan.android.legwork.bean.PayCashierBean;
import com.meituan.android.legwork.bean.PayTypeBean;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public final rx.d<BaseEntity<PayTypeBean>> a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6ba5d11a7bf0aee2dd940e4ae34c03", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6ba5d11a7bf0aee2dd940e4ae34c03");
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("orderViewId", str);
        }
        hashMap.put("rechargeLongitude", Integer.valueOf(i));
        hashMap.put("rechargeLatitude", Integer.valueOf(i2));
        return ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getPayTypeInfo(hashMap);
    }

    public final rx.d<BaseEntity<PayCashierBean>> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edd3a19ffda0d7a3f9aab8d6aeb0ab7", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edd3a19ffda0d7a3f9aab8d6aeb0ab7") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getPayCashierInfo(str);
    }
}
