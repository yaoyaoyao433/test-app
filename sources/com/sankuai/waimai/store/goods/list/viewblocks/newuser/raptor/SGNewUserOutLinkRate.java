package com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGNewUserOutLinkRate implements IMonitor {
    SGNewUserOutLink,
    SGNewUserOutLinkHook,
    SGNewUserOutLinkOpen,
    SGNewUserOutLinkRender,
    SGNewUserRequestFail,
    SGNewUserNoneNewProduct,
    SGNewUserHasNewProduct,
    SGNewUserRequestEmpty;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGNewUserOutLinkRate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a497a437495af5477f91a4772c3f263", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a497a437495af5477f91a4772c3f263");
        }
    }

    public static SGNewUserOutLinkRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db023f183693debe9a779e3d8d05f0e3", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserOutLinkRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db023f183693debe9a779e3d8d05f0e3") : (SGNewUserOutLinkRate) Enum.valueOf(SGNewUserOutLinkRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGNewUserOutLinkRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7df8b3f4f4c5bb9bcce9c289130dc9c", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserOutLinkRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7df8b3f4f4c5bb9bcce9c289130dc9c") : (SGNewUserOutLinkRate[]) values().clone();
    }
}
