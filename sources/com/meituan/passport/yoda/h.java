package com.meituan.passport.yoda;

import com.meituan.passport.utils.s;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final a.c b;
    private final Map c;

    private h(a.c cVar, Map map) {
        this.b = cVar;
        this.c = map;
    }

    public static rx.functions.h a(a.c cVar, Map map) {
        Object[] objArr = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ef49c68dbdc48e1e56c5f21b90756ac", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ef49c68dbdc48e1e56c5f21b90756ac") : new h(cVar, map);
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe721a2b4d7f7885915d88f26ec51d93", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe721a2b4d7f7885915d88f26ec51d93");
        }
        a.c cVar = this.b;
        Map<String, Object> map = this.c;
        String str = (String) obj;
        String str2 = (String) obj2;
        Object[] objArr2 = {cVar, map, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a.c.e;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "63b60d58e07ba408edd0988423322512", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "63b60d58e07ba408edd0988423322512") : s.c().verify(cVar.d.e(), map, str, str2);
    }
}
