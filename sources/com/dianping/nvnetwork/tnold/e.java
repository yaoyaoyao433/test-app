package com.dianping.nvnetwork.tnold;

import com.dianping.nvnetwork.tnold.a;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<C extends a> {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("TNCompressManager");
    private static final com.dianping.nvnetwork.tnold.zip.f c = com.dianping.nvnetwork.tnold.zip.d.a(0);
    private static final com.dianping.nvnetwork.tnold.zip.b d = com.dianping.nvnetwork.tnold.zip.d.b(0);
    private static final com.dianping.nvnetwork.tnold.zip.f e = com.dianping.nvnetwork.tnold.zip.d.a(2);
    private static final com.dianping.nvnetwork.tnold.zip.b f = com.dianping.nvnetwork.tnold.zip.d.b(2);
    private final com.dianping.nvnetwork.tnold.zip.f g;
    private final Set<String> h;
    private final AtomicBoolean i;
    private final m<C> j;
    private boolean k;
    private com.dianping.nvnetwork.tnold.zip.f l;
    private com.dianping.nvnetwork.tnold.zip.b m;

    public e(m<C> mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b3cf5f26e74573fb792a87b80f160b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b3cf5f26e74573fb792a87b80f160b");
            return;
        }
        this.k = ((c) mVar).c.c;
        this.g = com.dianping.nvnetwork.tnold.zip.d.a(3);
        List<String> list = ((c) mVar).c.d;
        if (list == null) {
            this.h = new HashSet();
        } else {
            this.h = new HashSet(list);
        }
        this.i = new AtomicBoolean(false);
        this.j = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[Catch: MalformedURLException -> 0x00b9, Exception -> 0x0147, TryCatch #0 {MalformedURLException -> 0x00b9, blocks: (B:18:0x0074, B:20:0x0087, B:21:0x0092, B:23:0x0099, B:24:0x009c, B:28:0x00ac, B:29:0x00af, B:30:0x00b4, B:25:0x00a1, B:26:0x00a6), top: B:54:0x0074, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer a(com.dianping.nvnetwork.v r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.tnold.e.a(com.dianping.nvnetwork.v):java.nio.ByteBuffer");
    }

    private ByteBuffer a(SecureProtocolData secureProtocolData) {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c1be3ba09a87aea19f15b9a231a845", 6917529027641081856L) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c1be3ba09a87aea19f15b9a231a845") : ((c) this.j).d.a(secureProtocolData);
    }

    private SecureProtocolData b(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ad2261cdb19bd5cdf85052af4eb310", 6917529027641081856L)) {
            return (SecureProtocolData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ad2261cdb19bd5cdf85052af4eb310");
        }
        Objects.requireNonNull(vVar);
        SecureProtocolData secureProtocolData = new SecureProtocolData();
        secureProtocolData.id = vVar.c;
        secureProtocolData.isSecure = vVar.l;
        secureProtocolData.macFlag = vVar.m;
        if (vVar.g) {
            secureProtocolData.flag = SecureProtocol.DataPacketType.HTTP_REQUEST.getType();
        } else {
            secureProtocolData.flag = vVar.b;
        }
        return secureProtocolData;
    }
}
