package com.sankuai.xm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3d6dbcfcee7c1ec00a91dc1f7fcad972", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3d6dbcfcee7c1ec00a91dc1f7fcad972");
        } else {
            com.sankuai.xm.log.a.a().b("imcoredata", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0fd7165a77ca9eabc1556f9056b067ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0fd7165a77ca9eabc1556f9056b067ec");
        } else {
            com.sankuai.xm.log.a.a().d("imcoredata", str, objArr);
        }
    }
}
