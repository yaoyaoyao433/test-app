package com.sankuai.waimai.bussiness.order.transfer.single.cart;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.transfer.single.c;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
import com.sankuai.waimai.bussiness.order.transfer.single.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends c {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.bussiness.order.transfer.single.c
    public final void a(@NonNull d dVar, @NonNull f fVar, @NonNull String str) {
        Object[] objArr = {dVar, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e7a126fc4798da2617e7dd0ea9b12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e7a126fc4798da2617e7dd0ea9b12b");
            return;
        }
        fVar.F = 0;
        if (TextUtils.isEmpty(fVar.H)) {
            fVar.H = null;
        }
        if (TextUtils.isEmpty(fVar.I)) {
            fVar.I = null;
        }
        if (TextUtils.isEmpty(fVar.M)) {
            fVar.M = null;
        }
    }
}
