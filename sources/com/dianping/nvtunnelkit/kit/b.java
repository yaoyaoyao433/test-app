package com.dianping.nvtunnelkit.kit;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b<C, I_SRC, I_DST, O_SRC, O_DST> implements com.dianping.nvtunnelkit.codec.a<C, I_SRC, I_DST>, com.dianping.nvtunnelkit.codec.b<C, O_SRC, O_DST> {
    public static ChangeQuickRedirect a;
    private final com.dianping.nvtunnelkit.codec.a<C, I_SRC, I_DST> b;
    private final com.dianping.nvtunnelkit.codec.b<C, O_SRC, O_DST> c;
    private final Map<Integer, List<O_DST>> d;

    @SuppressLint({"UseSparseArrays"})
    public b(com.dianping.nvtunnelkit.codec.a<C, I_SRC, I_DST> aVar, com.dianping.nvtunnelkit.codec.b<C, O_SRC, O_DST> bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef6e5db06aeca4094d8fd67baace79c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef6e5db06aeca4094d8fd67baace79c");
            return;
        }
        this.b = aVar;
        this.c = bVar;
        this.d = new HashMap();
    }

    @Override // com.dianping.nvtunnelkit.codec.a
    public final void b(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0a4939cb4c6dc68847f8602fb94e1a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0a4939cb4c6dc68847f8602fb94e1a2");
            return;
        }
        this.b.b(c);
        this.c.b(c);
    }

    @Override // com.dianping.nvtunnelkit.codec.a
    public final I_DST a(C c, I_SRC i_src) throws Exception {
        Object[] objArr = {c, i_src};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "339c0c735894fc2e7c95827693eed827", RobustBitConfig.DEFAULT_VALUE) ? (I_DST) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "339c0c735894fc2e7c95827693eed827") : this.b.a(c, i_src);
    }

    @Override // com.dianping.nvtunnelkit.codec.b
    public final void a(C c, int i, O_SRC o_src, List<O_DST> list) throws Exception {
        Object[] objArr = {c, Integer.valueOf(i), o_src, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdae666c638355f641a331edd0ab255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdae666c638355f641a331edd0ab255");
        } else {
            this.c.a(c, i, o_src, list);
        }
    }

    @Override // com.dianping.nvtunnelkit.codec.a
    public final void a(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1819b1176428b05d87d659537f51c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1819b1176428b05d87d659537f51c7");
            return;
        }
        this.b.a(c);
        this.c.a(c);
    }
}
