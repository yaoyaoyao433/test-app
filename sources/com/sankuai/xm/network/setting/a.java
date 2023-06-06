package com.sankuai.xm.network.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements g {
    public static ChangeQuickRedirect a;
    private static final List<com.sankuai.xm.base.proto.protosingal.a> b = new ArrayList();

    @Override // com.sankuai.xm.network.setting.g
    public final List<com.sankuai.xm.base.proto.protosingal.a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "debc68fdcb18ed36569061985a4db7d6", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "debc68fdcb18ed36569061985a4db7d6");
        }
        synchronized (this) {
            if (b.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(b);
            return arrayList;
        }
    }

    @Override // com.sankuai.xm.network.setting.g
    public final void a(List<com.sankuai.xm.base.proto.protosingal.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b8ad1b349b4215b70b6cb964b05275", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b8ad1b349b4215b70b6cb964b05275");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            synchronized (this) {
                b.clear();
                b.addAll(list);
            }
        }
    }
}
