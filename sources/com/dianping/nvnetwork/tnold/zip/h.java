package com.dianping.nvnetwork.tnold.zip;

import android.text.TextUtils;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final String f = com.dianping.nvtunnelkit.logger.a.a("ZipUtil");
    public static final Charset b = Charset.forName("UTF-8");
    public static final Exception c = new Exception("compress type mismatch");
    public static final Exception d = new Exception("server notify compress exception");
    public static final g e = new g(0, 0);

    public static byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b97874bc84abf404d0a740183d6e4010", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b97874bc84abf404d0a740183d6e4010");
        }
        if (!TextUtils.isEmpty(str)) {
            return str.getBytes(b);
        }
        return new byte[0];
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e40c958287dfaa3c1c5c14643d08d8dc", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e40c958287dfaa3c1c5c14643d08d8dc") : bArr == null ? "" : new String(bArr, b);
    }

    public static void a(v vVar) throws Exception {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9234d5d6bfc9a75df5756d8fe1c16be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9234d5d6bfc9a75df5756d8fe1c16be");
            return;
        }
        byte b2 = vVar.a;
        if (b2 != 3 && b2 != 4 && b2 != 104) {
            throw c;
        }
    }

    public static void b(v vVar) throws Exception {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5836265401d0e2abce548f90db993ab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5836265401d0e2abce548f90db993ab5");
            return;
        }
        byte b2 = vVar.a;
        if (b2 != 1 && b2 != 2) {
            throw c;
        }
    }

    public static void c(v vVar) throws Exception {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6994cf313b27d1274af1cfc3d7b713e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6994cf313b27d1274af1cfc3d7b713e3");
            return;
        }
        byte b2 = vVar.a;
        if (b2 != 5 && b2 != 2 && b2 != 4) {
            throw c;
        }
    }

    public static boolean b(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }
}
