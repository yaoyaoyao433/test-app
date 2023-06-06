package com.sankuai.waimai.bussiness.order.transfer.single.sg;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
import com.sankuai.waimai.bussiness.order.transfer.single.f;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.bussiness.order.transfer.single.c {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.bussiness.order.transfer.single.c
    public final void a(@NonNull d dVar, @NonNull f fVar, @NonNull String str) {
        Map<String, Object> map;
        Object[] objArr = {dVar, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f6aaa872b83fe5dfc1008410bee854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f6aaa872b83fe5dfc1008410bee854");
            return;
        }
        super.a(dVar, fVar, str);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5916174e458da882966ad3fcc8f6b9f6", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5916174e458da882966ad3fcc8f6b9f6");
        } else {
            map = null;
            String a = a(str, "store_installment");
            if (!aa.a(a)) {
                map = com.sankuai.waimai.mach.utils.b.a(a);
            }
        }
        fVar.aa = map;
    }
}
