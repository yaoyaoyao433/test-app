package com.dianping.nvnetwork.tnold;

import com.dianping.nvnetwork.tnold.a;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o<C extends a> extends b<C> {
    public static ChangeQuickRedirect b;
    protected final m<C> c;
    private final Map<C, e<C>> d;

    @Override // com.dianping.nvtunnelkit.codec.a
    public final /* synthetic */ com.dianping.nvbinarytunnel.b a(Object obj, v vVar) throws Exception {
        a aVar = (a) obj;
        v vVar2 = vVar;
        Object[] objArr = {aVar, vVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b166ba1aa87900d58597b8a8bd349b", 6917529027641081856L)) {
            return (com.dianping.nvbinarytunnel.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b166ba1aa87900d58597b8a8bd349b");
        }
        e<C> eVar = this.d.get(aVar);
        if (eVar == null) {
            throw new Exception("Can't get related compress manager");
        }
        return com.dianping.nvbinarytunnel.b.a(eVar.a(vVar2));
    }

    @Override // com.dianping.nvtunnelkit.codec.a
    public final /* synthetic */ void a(Object obj) {
        a aVar = (a) obj;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342adfa6be61561f4412f6d1d6da0c7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342adfa6be61561f4412f6d1d6da0c7b");
        } else {
            this.d.remove(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.codec.a
    public final /* synthetic */ void b(Object obj) {
        a aVar = (a) obj;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a855f746fa040bd002eeae29ef2893e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a855f746fa040bd002eeae29ef2893e");
        } else if (this.d.get(aVar) == null) {
            this.d.put(aVar, new e(this.c));
        }
    }

    public o(m<C> mVar) {
        super(mVar);
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4cb284170f4691fbdabcce4a33104c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4cb284170f4691fbdabcce4a33104c5");
            return;
        }
        this.d = new ConcurrentHashMap();
        this.c = mVar;
    }
}
