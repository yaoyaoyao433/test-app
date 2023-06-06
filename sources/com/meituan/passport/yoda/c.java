package com.meituan.passport.yoda;

import com.meituan.passport.utils.s;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final a.C0517a b;
    private final Map c;

    private c(a.C0517a c0517a, Map map) {
        this.b = c0517a;
        this.c = map;
    }

    public static rx.functions.h a(a.C0517a c0517a, Map map) {
        Object[] objArr = {c0517a, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ca6ae47a97f633cf3c5105df2ea1048", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ca6ae47a97f633cf3c5105df2ea1048") : new c(c0517a, map);
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c92c6aa6c4e19d6f4b2edaa49158c71", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c92c6aa6c4e19d6f4b2edaa49158c71");
        }
        a.C0517a c0517a = this.b;
        Map<String, Object> map = this.c;
        String str = (String) obj;
        String str2 = (String) obj2;
        Object[] objArr2 = {c0517a, map, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a.C0517a.e;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04cdf6234283a5bffd54e92dad7b74d4", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04cdf6234283a5bffd54e92dad7b74d4") : s.c().info(c0517a.d.e(), map, str, str2);
    }
}
