package com.dianping.sdk.pike.service;

import com.dianping.sdk.pike.packet.af;
import com.dianping.sdk.pike.util.GsonUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    boolean b;

    public g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576d13021b9d87b15a6af3847150ee53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576d13021b9d87b15a6af3847150ee53");
        } else {
            this.b = z;
        }
    }

    public final af a(String str, com.dianping.sdk.pike.packet.j jVar) {
        byte[] bytes;
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3750c2555abc0a3c6273c6bd9ba2f74d", RobustBitConfig.DEFAULT_VALUE)) {
            return (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3750c2555abc0a3c6273c6bd9ba2f74d");
        }
        af afVar = new af(str, jVar, this.b);
        if (this.b) {
            bytes = com.dianping.sdk.pike.util.b.a(afVar);
        } else {
            bytes = GsonUtils.a(afVar).getBytes();
        }
        afVar.j = bytes;
        return afVar;
    }
}
