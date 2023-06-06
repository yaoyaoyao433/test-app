package com.dianping.nvtlstunnel;

import com.dianping.nvtunnelkit.kit.t;
import com.dianping.nvtunnelkit.kit.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends w {
    public static ChangeQuickRedirect i;
    private boolean a;

    public a(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress, t tVar) {
        super(aVar, socketAddress, tVar);
        Object[] objArr = {aVar, socketAddress, tVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01cedcaa11b9daaf42824dab94704aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01cedcaa11b9daaf42824dab94704aa");
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.b
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0385eb468e96dacbb75cafe27b80b646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0385eb468e96dacbb75cafe27b80b646");
        } else if (!this.a) {
            b();
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c8ae62ab4549f23ff6c236c75d8e12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c8ae62ab4549f23ff6c236c75d8e12");
        } else {
            super.i();
        }
    }
}
