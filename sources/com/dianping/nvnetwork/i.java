package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i {
    public static ChangeQuickRedirect a;
    private static volatile i b;

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbf6046004ec996432a66184a44f9d01", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbf6046004ec996432a66184a44f9d01");
        }
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i();
                }
            }
        }
        return b;
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3466ee855353a568c582ce8e9f5e5fee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3466ee855353a568c582ce8e9f5e5fee");
        } else {
            s.a().a(z, z2);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48462775e849a736e4492e3e4267547a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48462775e849a736e4492e3e4267547a");
            return;
        }
        s.a();
        s.a(str);
    }
}
