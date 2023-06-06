package com.dianping.sdk.pike.handler;

import com.dianping.nvtunnelkit.exception.m;
import com.dianping.sdk.pike.packet.af;
import com.dianping.sdk.pike.packet.k;
import com.dianping.sdk.pike.service.q;
import com.dianping.sdk.pike.util.GsonUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f<R extends com.dianping.sdk.pike.packet.k> extends d<R> {
    public static ChangeQuickRedirect e;
    protected final Class<R> f;
    protected final int g;
    protected final String h;

    public String a(com.dianping.sdk.pike.service.l lVar) {
        return "";
    }

    public int b(com.dianping.sdk.pike.service.l lVar) {
        return -65;
    }

    public f(q qVar, Class<R> cls, String str, int i) {
        super(qVar);
        Object[] objArr = {qVar, cls, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26a4092f60c6a29150173e2f52265a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26a4092f60c6a29150173e2f52265a2");
            return;
        }
        this.f = cls;
        this.h = str;
        this.g = i;
    }

    @Override // com.dianping.sdk.pike.handler.d
    public void a(com.dianping.sdk.pike.service.l lVar, af afVar) {
        Object[] objArr = {lVar, afVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deeb627635a7fae61caf75425c1b5b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deeb627635a7fae61caf75425c1b5b23");
            return;
        }
        R a = a(afVar);
        String a2 = com.dianping.nvtunnelkit.utils.f.a(this.h) ? a(lVar) : this.h;
        int b = this.g == -65 ? b(lVar) : this.g;
        if (a != null && a.b()) {
            a(lVar, (com.dianping.sdk.pike.service.l) a, a2 + " success.");
            return;
        }
        a(lVar, b, a2 + " failed, reason: server status err.");
    }

    @Override // com.dianping.sdk.pike.handler.d
    public void a(com.dianping.sdk.pike.service.l lVar, com.dianping.nvtunnelkit.exception.d dVar) {
        int i;
        String str;
        Object[] objArr = {lVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362a2bc8e41f0f6f5b72526df6a27ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362a2bc8e41f0f6f5b72526df6a27ec8");
            return;
        }
        String a = com.dianping.nvtunnelkit.utils.f.a(this.h) ? a(lVar) : this.h;
        if ((dVar instanceof com.dianping.nvtunnelkit.exception.h) || (dVar instanceof com.dianping.nvtunnelkit.exception.k)) {
            i = -64;
            str = "timeout";
        } else if ((dVar instanceof m) || (dVar instanceof com.dianping.nvtunnelkit.exception.g) || (dVar instanceof com.dianping.nvtunnelkit.exception.l) || (dVar instanceof com.dianping.nvtunnelkit.exception.i)) {
            i = -66;
            str = "tunnel not ready or closed";
        } else if (dVar instanceof com.dianping.nvtunnelkit.exception.j) {
            i = -68;
            str = "tunnel is no secure";
        } else {
            i = -65;
            str = "other send err";
        }
        a(lVar, i, String.format("%s failed, reason: %s.", a, str));
    }

    public final R a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c928388a3d872e11f51941d902caf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (R) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c928388a3d872e11f51941d902caf7");
        }
        R r = (R) GsonUtils.a(afVar.d, this.f);
        if (r != null) {
            r.a(afVar.i);
        }
        return r;
    }
}
