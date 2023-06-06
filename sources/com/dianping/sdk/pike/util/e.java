package com.dianping.sdk.pike.util;

import com.dianping.sdk.pike.handler.d;
import com.dianping.sdk.pike.handler.i;
import com.dianping.sdk.pike.packet.k;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static <R extends k> com.dianping.sdk.pike.handler.d<R> a(q qVar, Class<R> cls, String str, int i, d.a<R> aVar) {
        Object[] objArr = {qVar, cls, str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70626eba6de9a82d4d1fb421498a47ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.sdk.pike.handler.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70626eba6de9a82d4d1fb421498a47ac");
        }
        com.dianping.sdk.pike.handler.f fVar = new com.dianping.sdk.pike.handler.f(qVar, cls, str, i);
        fVar.d = aVar;
        return fVar;
    }

    public static <R extends k> com.dianping.sdk.pike.handler.d<R> a(q qVar, Class<R> cls, String str, int i, d.a<R> aVar, com.dianping.sdk.pike.handler.k kVar) {
        Object[] objArr = {qVar, cls, str, Integer.valueOf(i), aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab3f4b92d41ddb68f89db08a8964ca2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.sdk.pike.handler.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab3f4b92d41ddb68f89db08a8964ca2c");
        }
        i iVar = new i(qVar, cls, str, i, kVar);
        iVar.d = aVar;
        return iVar;
    }
}
