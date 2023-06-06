package com.meituan.android.recce.shark;

import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private static volatile k b;
    private final a.InterfaceC0637a c;

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd735ad879114ba7067ac44d8cb0664c", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd735ad879114ba7067ac44d8cb0664c");
        }
        if (b == null) {
            synchronized (k.class) {
                if (b == null) {
                    b = new k();
                }
            }
        }
        return b;
    }

    public k() {
        com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018915919fe26d425887b32f9845a5c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018915919fe26d425887b32f9845a5c2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af7a65c25bd78275bab1cd5e40c6e9b7", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af7a65c25bd78275bab1cd5e40c6e9b7");
        } else if (com.dianping.nvnetwork.g.u()) {
            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.meituan.android.recce.a.b());
            SharkWrapper.addInterceptorToBuilder(aVar);
            aVar.a(new j(com.meituan.android.recce.a.b()));
            aVar.a(true);
            a2 = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(aVar.a());
        } else {
            a2 = null;
        }
        this.c = a2;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b1384b8020002f8544ab442c3e4065e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b1384b8020002f8544ab442c3e4065e") : this.c.get(ajVar);
    }
}
