package com.sankuai.waimai.platform.net.callfactory;

import android.support.annotation.NonNull;
import com.dianping.nvnetwork.g;
import com.meituan.android.singleton.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private e<a.InterfaceC0637a> b;
    private e<a.InterfaceC0637a> c;

    public d(@NonNull e<a.InterfaceC0637a> eVar, @NonNull e<a.InterfaceC0637a> eVar2) {
        Object[] objArr = {eVar, eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1c5d14f8727ad19595d585717fab0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1c5d14f8727ad19595d585717fab0c");
            return;
        }
        this.b = eVar;
        this.c = eVar2;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b184837175d1245171a0ea5ebd971595", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b184837175d1245171a0ea5ebd971595");
        }
        if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "shark_switch", true)) {
            if (g.u()) {
                return this.c.b().get(ajVar);
            }
            com.sankuai.waimai.platform.net.init.a.a();
        }
        return this.b.b().get(ajVar);
    }
}
