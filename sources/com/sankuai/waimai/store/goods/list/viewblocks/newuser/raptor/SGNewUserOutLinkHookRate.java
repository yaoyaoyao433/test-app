package com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGNewUserOutLinkHookRate implements IMonitor {
    SGOutLinkHookSuccess,
    SGOutLinkHookError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGNewUserOutLinkHookRate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73d4900a81e262e7e099458010f635f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73d4900a81e262e7e099458010f635f");
        }
    }

    public static SGNewUserOutLinkHookRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c727cd97627044a48e64b3d2c805149a", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserOutLinkHookRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c727cd97627044a48e64b3d2c805149a") : (SGNewUserOutLinkHookRate) Enum.valueOf(SGNewUserOutLinkHookRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGNewUserOutLinkHookRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56e1518654625f0bf64b5be3c3cf9712", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserOutLinkHookRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56e1518654625f0bf64b5be3c3cf9712") : (SGNewUserOutLinkHookRate[]) values().clone();
    }
}
