package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class z {
    public static ChangeQuickRedirect a;
    public static final byte[] b = new byte[0];
    public static final ByteBuffer c = ByteBuffer.allocate(0);
    private static final ByteArrayOutputStream d = new ByteArrayOutputStream();

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07804042152f80b87a51e157cdde9298", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07804042152f80b87a51e157cdde9298")).longValue() : com.dianping.nvtunnelkit.utils.g.a();
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0142f75f6396ddb76041c62cbb63729a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0142f75f6396ddb76041c62cbb63729a")).intValue() : com.dianping.nvtunnelkit.utils.g.a(str);
    }

    public static void a(String str, int i) throws com.dianping.nvtunnelkit.exception.a {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afa1d1e2b258a68b4b0b7c054cbeb8a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afa1d1e2b258a68b4b0b7c054cbeb8a6");
        } else {
            com.dianping.nvtunnelkit.ext.d.a().pv4(0L, "tn_parse_frame_error", 0, 2, 0, 0, 0, 0, null, null, 100);
            throw new com.dianping.nvtunnelkit.exception.a(str);
        }
    }

    public static boolean a(SocketAddress socketAddress) {
        Object[] objArr = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22bd3fc0ae3673b555d16f53239de5d2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22bd3fc0ae3673b555d16f53239de5d2")).booleanValue();
        }
        if (socketAddress instanceof InetSocketAddress) {
            return ((InetSocketAddress) socketAddress).getAddress() instanceof Inet6Address;
        }
        return false;
    }
}
