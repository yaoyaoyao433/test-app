package com.sankuai.waimai.irmo.render.engine.factory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private Map<Integer, com.sankuai.waimai.irmo.render.engine.factory.a> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final b a = new b();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea54781970c0e1e3b5179c33469eefb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea54781970c0e1e3b5179c33469eefb");
            return;
        }
        this.b = new ConcurrentHashMap();
        a(1000, new g());
        a(1002, new d());
        a(1007, new c());
        a(1008, new f());
        a(1003, new e());
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "350a722e54e68757ecef915ebf4f31f5", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "350a722e54e68757ecef915ebf4f31f5") : a.a;
    }

    private void a(int i, com.sankuai.waimai.irmo.render.engine.factory.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1351b107e49a28131b475bb4a3a7ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1351b107e49a28131b475bb4a3a7ce");
        } else {
            this.b.put(Integer.valueOf(i), aVar);
        }
    }

    public final com.sankuai.waimai.irmo.render.engine.factory.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08142273b92e633a7ad5a91aea0995c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.irmo.render.engine.factory.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08142273b92e633a7ad5a91aea0995c") : this.b.get(Integer.valueOf(i));
    }
}
