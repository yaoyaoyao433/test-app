package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc4cec23e92c7a4dbd62a6402ae4f2e9", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc4cec23e92c7a4dbd62a6402ae4f2e9");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55e842d1850882091b38f6680e73bae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55e842d1850882091b38f6680e73bae");
        } else {
            a(z, true);
        }
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ca666f39b062dc885fd8b1b6bdd193", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ca666f39b062dc885fd8b1b6bdd193");
        } else {
            i.a().a(z, z2);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a56581ba31b195652582c067c17efe9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a56581ba31b195652582c067c17efe9");
        } else {
            i.a().a(str);
        }
    }
}
