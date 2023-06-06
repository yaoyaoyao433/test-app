package com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGNewUserAnimatorRate implements IMonitor {
    SGNewUserAnimatorRedEnvelop,
    SGNewUserAnimatorTurnTable,
    SGNewUserAnimatorRedError,
    SGNewUserAnimatorTurnError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGNewUserAnimatorRate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d53df17d3e6d0f32721def5fe22b0b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d53df17d3e6d0f32721def5fe22b0b9");
        }
    }

    public static SGNewUserAnimatorRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "012d2fa12a453bb27d2afcac168a5a78", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserAnimatorRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "012d2fa12a453bb27d2afcac168a5a78") : (SGNewUserAnimatorRate) Enum.valueOf(SGNewUserAnimatorRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGNewUserAnimatorRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44aba19d1bb2d1329149fdb2093dd2a0", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserAnimatorRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44aba19d1bb2d1329149fdb2093dd2a0") : (SGNewUserAnimatorRate[]) values().clone();
    }
}
