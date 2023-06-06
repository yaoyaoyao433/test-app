package com.sankuai.waimai.bussiness.order.transfer.single.sg;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
import com.sankuai.waimai.bussiness.order.transfer.single.f;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.bussiness.order.transfer.single.c {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.bussiness.order.transfer.single.c
    public final void a(@NonNull d dVar, @NonNull f fVar, @NonNull String str) {
        Map<String, Object> map;
        Map<String, Object> hashMap;
        Object[] objArr = {dVar, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0478c4ffd0494cb09c2a0d84a1994a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0478c4ffd0494cb09c2a0d84a1994a68");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b21c41eea90098e82abf93e1464fd47", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b21c41eea90098e82abf93e1464fd47");
        } else {
            map = null;
            String a = a(str, "prescription_info");
            if (!aa.a(a)) {
                map = com.sankuai.waimai.mach.utils.b.a(a);
            }
        }
        fVar.J = map;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4bae18ef619d8c5680ef6837bc0d03cc", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4bae18ef619d8c5680ef6837bc0d03cc");
        } else {
            String a2 = a(str, "ext_param");
            if (!aa.a(a2)) {
                hashMap = com.sankuai.waimai.mach.utils.b.a(a2);
            } else {
                hashMap = new HashMap<>();
            }
        }
        fVar.Y = hashMap;
    }

    @Override // com.sankuai.waimai.bussiness.order.transfer.single.c
    @Nullable
    public final f a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06e46d3b5ca2c8c74c0966c4958c37a", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06e46d3b5ca2c8c74c0966c4958c37a");
        }
        try {
            JsonPrimitive a = dVar.a("submit_params");
            if (a == null || !a.isString()) {
                return null;
            }
            return (f) com.sankuai.waimai.mach.utils.b.a().fromJson(a.getAsString(), (Class<Object>) f.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
