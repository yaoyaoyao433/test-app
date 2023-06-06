package com.meituan.android.pay.desk.component.view;

import com.meituan.android.pay.common.promotion.bean.PromotionRefreshment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements com.meituan.android.pay.desk.component.fragment.h {
    public static ChangeQuickRedirect a;
    private final c b;

    public f(c cVar) {
        this.b = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.fragment.h
    public final void a(PromotionRefreshment promotionRefreshment, ArrayList arrayList, boolean z) {
        Object[] objArr = {promotionRefreshment, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb6517e6e3c87810a6c1abd385d75ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb6517e6e3c87810a6c1abd385d75ab");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, promotionRefreshment, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "184b1d6ecca1bda7eb0e0a4c47e5eb19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "184b1d6ecca1bda7eb0e0a4c47e5eb19");
        } else if (cVar.e != null) {
            cVar.e.a(cVar.c, cVar.b, z);
        }
    }
}
