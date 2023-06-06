package com.dianping.nvnetwork.tnold.zip;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static f a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7558b8f321e4e135c29149bc1bd3b905", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7558b8f321e4e135c29149bc1bd3b905");
        }
        if (i != 104) {
            switch (i) {
                case 1:
                case 2:
                    return new com.dianping.nvnetwork.tnold.zip.gzip.f();
                case 3:
                case 4:
                    break;
                default:
                    return new com.dianping.nvnetwork.tnold.zip.old.d();
            }
        }
        return new com.dianping.nvnetwork.tnold.zip.hpack.f();
    }

    public static b b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e6a6b69a7f7ffc43b4d48e3a36ab572", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e6a6b69a7f7ffc43b4d48e3a36ab572");
        }
        if (i != 2) {
            switch (i) {
                case 4:
                case 5:
                    break;
                default:
                    return new com.dianping.nvnetwork.tnold.zip.old.b();
            }
        }
        return new com.dianping.nvnetwork.tnold.zip.gzip.b();
    }
}
