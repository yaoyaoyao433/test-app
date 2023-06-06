package com.dianping.nvnetwork.tnold;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("TNCompressMonitor");

    private static void a(String str, boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7cfe5aff4776a8d7b5df45814c81979", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7cfe5aff4776a8d7b5df45814c81979");
        } else if (z) {
            if (i == 3 || i == 5 || i == 105 || i == 4 || i == 104) {
                com.dianping.nvtunnelkit.ext.d.a().pv4(0L, str, 0, 2, 0, i2, i3, (int) (j2 - j), null, null, 100);
            }
        }
    }

    private static void a(boolean z, String str, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a449dc04c105daa9487c10d5795fc62f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a449dc04c105daa9487c10d5795fc62f");
        } else if (z) {
            com.dianping.nvtunnelkit.ext.d.a().pv4(0L, str, 0, 2, -1, 0, 0, 0, null, Arrays.asList(th.getStackTrace()).toString(), 100);
        }
    }

    public static void a(boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ad246864a0ca165e31b73a141ce7fa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ad246864a0ca165e31b73a141ce7fa2");
        } else {
            a("shark/compress/request_header_compress", z, i, j, j2, i2, i3);
        }
    }

    public static void b(boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2428021e189dbc3242e43628c835f000", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2428021e189dbc3242e43628c835f000");
        } else {
            a("shark/compress/request_body_compress", z, i, j, j2, i2, i3);
        }
    }

    public static void c(boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {(byte) 1, Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3bdfba12bde2d0484d09224c01671fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3bdfba12bde2d0484d09224c01671fb");
        } else {
            a("shark/compress/request_compress", true, i, j, j2, i2, i3);
        }
    }

    public static void d(boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74a6cfd272ebd2a31d0a11a5ae67a0c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74a6cfd272ebd2a31d0a11a5ae67a0c5");
        } else {
            a("shark/compress/response_header_decompress", z, i, j, j2, i2, i3);
        }
    }

    public static void e(boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a37e96ef9115c19ff613bd4e068122e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a37e96ef9115c19ff613bd4e068122e6");
        } else if (i == 4) {
            a("shark/compress/response_body_decompress", z, i, j, j2, i2, i3);
        }
    }

    public static void f(boolean z, int i, long j, long j2, int i2, int i3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "423a11abffbc18dbb44260551f79c282", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "423a11abffbc18dbb44260551f79c282");
        } else {
            a("shark/compress/response_decompress", z, i, j, j2, i2, i3);
        }
    }

    public static void a(boolean z, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61e7cb10cebb7ec64061c417e472ccbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61e7cb10cebb7ec64061c417e472ccbe");
        } else {
            a(z, "shark/compress/exception_compress", th);
        }
    }

    public static void b(boolean z, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca4705fce5c1712f2fab132fdd4ac07e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca4705fce5c1712f2fab132fdd4ac07e");
        } else {
            a(z, "shark/compress/exception_decompress", th);
        }
    }
}
