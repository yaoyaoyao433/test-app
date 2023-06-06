package com.sankuai.xm.login.manager.heartbeat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6282975c1e6685a37bfd764f6a90288b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6282975c1e6685a37bfd764f6a90288b");
        }
        String b = m.a().b(true);
        String o = m.a().o();
        if (ac.a(b) || ac.a(o)) {
            return null;
        }
        return b + CommonConstant.Symbol.UNDERLINE + o;
    }
}
