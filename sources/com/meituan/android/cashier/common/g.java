package com.meituan.android.cashier.common;

import com.meituan.android.cashier.common.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements u.a {
    public static ChangeQuickRedirect a;
    private final Map b;
    private final u.a c;

    public g(Map map, u.a aVar) {
        this.b = map;
        this.c = aVar;
    }

    @Override // com.meituan.android.cashier.common.u.a
    public final void a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b91d0ba937aa286857feb6474405ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b91d0ba937aa286857feb6474405ca");
            return;
        }
        Map<String, String> map2 = this.b;
        u.a aVar = this.c;
        Object[] objArr2 = {map2, aVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "eb8a35346c57c5595a48db8e95fff7bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "eb8a35346c57c5595a48db8e95fff7bd");
            return;
        }
        if (!com.meituan.android.paybase.utils.i.a(map)) {
            map2.putAll(map);
        }
        aVar.a(map2);
    }
}
