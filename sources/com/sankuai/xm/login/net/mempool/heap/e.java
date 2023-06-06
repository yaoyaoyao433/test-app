package com.sankuai.xm.login.net.mempool.heap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.login.net.mempool.base.e<ByteBuffer> {
    public static ChangeQuickRedirect e;

    public e(int i, int i2) {
        super(i, i2);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "265fc91d944007e6f63f2fb7ab66915b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "265fc91d944007e6f63f2fb7ab66915b");
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.e
    public final com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c595895f2cbcbc2e5912b6235881eb2", 6917529027641081856L) ? (com.sankuai.xm.login.net.mempool.base.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c595895f2cbcbc2e5912b6235881eb2") : new d(this.c);
    }
}
