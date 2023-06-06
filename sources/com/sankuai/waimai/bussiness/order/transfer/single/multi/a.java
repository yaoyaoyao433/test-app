package com.sankuai.waimai.bussiness.order.transfer.single.multi;

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
public final class a extends c {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.bussiness.order.transfer.single.c
    public final void a(@NonNull d dVar, @NonNull f fVar, @NonNull String str) {
        Object[] objArr = {dVar, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f81df7462dc7609a6df170d991f418e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f81df7462dc7609a6df170d991f418e");
            return;
        }
        super.a(dVar, fVar, str);
        if (TextUtils.isEmpty(fVar.H)) {
            fVar.H = null;
        }
        if (TextUtils.isEmpty(fVar.I)) {
            fVar.I = null;
        }
        if (TextUtils.isEmpty(fVar.M)) {
            fVar.M = null;
        }
        if (TextUtils.isEmpty(fVar.N)) {
            fVar.N = null;
        }
    }
}
