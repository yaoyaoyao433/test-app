package com.sankuai.xm.login.manager.channel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements com.sankuai.xm.login.manager.e {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.login.manager.e b;

    public c(com.sankuai.xm.login.manager.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4e6e94d7579ca1e431e16fa72f29fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4e6e94d7579ca1e431e16fa72f29fd");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void d(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b987c83a16b343077319bc331338672b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b987c83a16b343077319bc331338672b");
        } else {
            a(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.channel.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "613a30d574a0b8a5c29f53f87559e479", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "613a30d574a0b8a5c29f53f87559e479");
                    } else {
                        c.this.b.d(i);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(final int i, final byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb9f701dd4e61ba9e49d5efa7f1611f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb9f701dd4e61ba9e49d5efa7f1611f");
        } else {
            a(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.channel.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c0c3d472bafc961e0d778d2f23618db", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c0c3d472bafc961e0d778d2f23618db");
                    } else {
                        c.this.b.b(i, bArr);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.login.manager.e
    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3909ef5170ce72d13fe77b9944da319", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3909ef5170ce72d13fe77b9944da319");
        } else {
            a(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.channel.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07c8de15afea2cc8aaa24ce299d815cb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07c8de15afea2cc8aaa24ce299d815cb");
                    } else {
                        c.this.b.a(i);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void a_(final com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a081bf5169445dcbd00768465cfeb55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a081bf5169445dcbd00768465cfeb55");
        } else {
            a(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.channel.c.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "086cc9ecebfc2d02a4434c33f437cc2c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "086cc9ecebfc2d02a4434c33f437cc2c");
                    } else {
                        c.this.b.a_(cVar);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b1f822c50fcf58e0584c69a15e6a8a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b1f822c50fcf58e0584c69a15e6a8a2");
        } else {
            a(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.channel.c.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7aa7ed61dbeacfdcdeff63bdfed393f2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7aa7ed61dbeacfdcdeff63bdfed393f2");
                    } else {
                        c.this.b.b(z);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(final long j, final int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1be035c35db2dc684d0e44d59366ec1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1be035c35db2dc684d0e44d59366ec1");
        } else {
            a(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.channel.c.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f824cd2b99229f654d17f4d1c7047f87", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f824cd2b99229f654d17f4d1c7047f87");
                    } else {
                        c.this.b.b(j, i);
                    }
                }
            }));
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6dfe7217771a5e11597723b6db78353", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6dfe7217771a5e11597723b6db78353");
        } else {
            m.e().a(12, runnable);
        }
    }
}
