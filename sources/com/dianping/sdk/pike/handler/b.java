package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends g<com.dianping.sdk.pike.packet.c> {
    public static ChangeQuickRedirect a;
    private final Set<String> k;

    @Override // com.dianping.sdk.pike.handler.f
    public final String a(com.dianping.sdk.pike.service.l lVar) {
        return "fetch messages";
    }

    @Override // com.dianping.sdk.pike.handler.d
    public final /* synthetic */ void a(com.dianping.sdk.pike.service.l lVar, com.dianping.sdk.pike.packet.k kVar, String str) {
        com.dianping.sdk.pike.packet.c cVar = (com.dianping.sdk.pike.packet.c) kVar;
        Object[] objArr = {lVar, cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168efcc228a0704ce89afbef31e9ab4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168efcc228a0704ce89afbef31e9ab4c");
            return;
        }
        if (cVar != null && cVar.c != null && cVar.c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (com.dianping.sdk.pike.packet.g gVar : cVar.c) {
                if (cVar.b != null && gVar != null) {
                    String str2 = cVar.b + CommonConstant.Symbol.UNDERLINE + gVar.a;
                    if (this.k.contains(str2)) {
                        arrayList.add(gVar);
                        com.dianping.sdk.pike.i.a("AggFetchMessageHandler", "message id exist. cacheKey : " + str2);
                    } else {
                        a(str2);
                    }
                }
            }
            cVar.h = cVar.c.size();
            cVar.c.removeAll(arrayList);
            cVar.i = cVar.c.size();
        }
        super.a(lVar, (com.dianping.sdk.pike.service.l) cVar, str);
    }

    public b(q qVar, k kVar) {
        super(qVar, com.dianping.sdk.pike.packet.c.class, kVar);
        Object[] objArr = {qVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229dd466431674c2eed16cf8ff849fd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229dd466431674c2eed16cf8ff849fd8");
        } else {
            this.k = new LinkedHashSet(1000);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5c2cf19bedd0b1baa8d6a3a295378a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5c2cf19bedd0b1baa8d6a3a295378a");
            return;
        }
        if (this.k.size() >= 1000) {
            Iterator<String> it = this.k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (com.dianping.nvtunnelkit.utils.f.b(it.next())) {
                    it.remove();
                    break;
                }
            }
        }
        this.k.add(str);
    }
}
