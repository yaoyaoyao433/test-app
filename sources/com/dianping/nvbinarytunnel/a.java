package com.dianping.nvbinarytunnel;

import com.dianping.nvtunnelkit.kit.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends com.dianping.nvtlstunnel.a {
    public static ChangeQuickRedirect a;

    public a(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress, t tVar) {
        super(aVar, socketAddress, tVar);
        Object[] objArr = {aVar, socketAddress, tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffe22cbe944067610b3f5c172309d90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffe22cbe944067610b3f5c172309d90");
        }
    }
}
