package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.packet.k;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g<R extends com.dianping.sdk.pike.packet.k> extends f<R> {
    public static ChangeQuickRedirect i;
    protected final k j;

    public g(q qVar, Class<R> cls, k kVar) {
        this(qVar, cls, "", -65, kVar);
        Object[] objArr = {qVar, cls, kVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8695bfba0f8c7dfecd5e9cfaea00a0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8695bfba0f8c7dfecd5e9cfaea00a0b");
        }
    }

    public g(q qVar, Class<R> cls, String str, int i2, k kVar) {
        super(qVar, cls, str, i2);
        Object[] objArr = {qVar, cls, str, Integer.valueOf(i2), kVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e847fa6e6b1733e28399a5b126c1ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e847fa6e6b1733e28399a5b126c1ce");
        } else if (kVar == null) {
            throw new IllegalArgumentException("retryDelegate can not be null.");
        } else {
            this.j = kVar;
        }
    }

    @Override // com.dianping.sdk.pike.handler.f, com.dianping.sdk.pike.handler.d
    public final void a(com.dianping.sdk.pike.service.l lVar, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {lVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c133768e6570c1ebbc9d06ea5302b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c133768e6570c1ebbc9d06ea5302b7");
            return;
        }
        int i2 = lVar.k + 1;
        lVar.k = i2;
        if (i2 <= lVar.j) {
            if (this.j != null) {
                this.j.a(lVar);
                return;
            }
            return;
        }
        super.a(lVar, dVar);
    }
}
