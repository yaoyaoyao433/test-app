package com.meituan.mmp.lib.load;

import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private final c b;

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746e7badc07d6e7b679ec5d68d319277", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746e7badc07d6e7b679ec5d68d319277");
        } else {
            this.b = cVar;
        }
    }

    public final boolean a(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3586022afd497a4249da4713dd1178", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3586022afd497a4249da4713dd1178")).booleanValue() : a(str, true, bVar);
    }

    public final boolean a(String str, boolean z, final b bVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c0770b05ac282a9512d6d3c71dce6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c0770b05ac282a9512d6d3c71dce6c")).booleanValue();
        }
        if (this.b == null) {
            throw new RuntimeException("mPackageLoader must not be null");
        }
        if (!this.b.a(str)) {
            this.b.a(str, z, new a() { // from class: com.meituan.mmp.lib.load.d.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.load.a
                public final void a(final boolean z2, final boolean z3, final MMPPackageInfo mMPPackageInfo) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d182ab570a65ffa6b57f72f4b77d0803", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d182ab570a65ffa6b57f72f4b77d0803");
                    } else if (bVar != null) {
                        com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.load.d.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7fdade0084db0a4faa9f58f989879b94", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7fdade0084db0a4faa9f58f989879b94");
                                } else {
                                    bVar.a(z2, z3, mMPPackageInfo);
                                }
                            }
                        });
                    }
                }
            });
            return false;
        }
        if (bVar != null) {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.load.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c26cd3cc68c3e770233b413ce8061d5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c26cd3cc68c3e770233b413ce8061d5b");
                    } else {
                        bVar.a(true, false, null);
                    }
                }
            });
        }
        return true;
    }
}
