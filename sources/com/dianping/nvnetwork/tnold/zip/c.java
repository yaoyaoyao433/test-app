package com.dianping.nvnetwork.tnold.zip;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cfd88ba0124af6a5afc768d7f3e7cec", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cfd88ba0124af6a5afc768d7f3e7cec");
        }
        if (i != 104) {
            switch (i) {
                case 1:
                case 2:
                    return new com.dianping.nvnetwork.tnold.zip.gzip.e();
                case 3:
                case 4:
                    break;
                default:
                    return new com.dianping.nvnetwork.tnold.zip.old.c();
            }
        }
        return new com.dianping.nvnetwork.tnold.zip.hpack.d();
    }

    public static a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6838aaef5e815ad812b02c6d3430f4f2", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6838aaef5e815ad812b02c6d3430f4f2");
        }
        if (i != 2) {
            switch (i) {
                case 4:
                case 5:
                    break;
                default:
                    return new com.dianping.nvnetwork.tnold.zip.old.a();
            }
        }
        return new com.dianping.nvnetwork.tnold.zip.gzip.a();
    }
}
