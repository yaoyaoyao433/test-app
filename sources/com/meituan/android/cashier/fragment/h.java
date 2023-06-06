package com.meituan.android.cashier.fragment;

import com.meituan.android.pay.common.promotion.bean.PromotionRefreshment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements com.meituan.android.pay.desk.component.fragment.h {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;
    private final BigDecimal c;

    public h(MTCashierRevisionFragment mTCashierRevisionFragment, BigDecimal bigDecimal) {
        this.b = mTCashierRevisionFragment;
        this.c = bigDecimal;
    }

    @Override // com.meituan.android.pay.desk.component.fragment.h
    public final void a(PromotionRefreshment promotionRefreshment, ArrayList arrayList, boolean z) {
        Object[] objArr = {promotionRefreshment, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65699036343d5b198e254a7de9a8085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65699036343d5b198e254a7de9a8085");
        } else {
            MTCashierRevisionFragment.a(this.b, this.c, promotionRefreshment, arrayList, z);
        }
    }
}
