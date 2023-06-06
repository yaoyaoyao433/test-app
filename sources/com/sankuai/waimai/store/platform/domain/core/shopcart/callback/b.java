package com.sankuai.waimai.store.platform.domain.core.shopcart.callback;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect h;

    public f a(f fVar) {
        return null;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d49e80bd03ec582d1445bad1efbdaf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d49e80bd03ec582d1445bad1efbdaf0");
        }
    }

    public void a(com.sankuai.waimai.store.exceptions.a aVar) {
    }

    public abstract void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar);

    public void a(e eVar) {
    }

    public String b() {
        return "";
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5002732c39de568b3469ad02a4caab46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5002732c39de568b3469ad02a4caab46");
        } else if (bVar != null) {
            bVar.a();
        }
    }

    public static void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fce5dec80a523ecf638636352d60047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fce5dec80a523ecf638636352d60047");
        } else if (bVar2 != null) {
            bVar2.a(bVar);
        }
    }

    public static void a(com.sankuai.waimai.store.exceptions.a aVar, b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a68ece27f65cba308d6811f2a003b55c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a68ece27f65cba308d6811f2a003b55c");
        } else if (bVar != null) {
            bVar.a(aVar);
        }
    }
}
