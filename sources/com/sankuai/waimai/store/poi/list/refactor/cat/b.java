package com.sankuai.waimai.store.poi.list.refactor.cat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(CardMonitorMessage cardMonitorMessage) {
        Object[] objArr = {cardMonitorMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c40e80b09a8578091898ce949654829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c40e80b09a8578091898ce949654829");
        } else if (cardMonitorMessage != null) {
            c.a(cardMonitorMessage.monitor);
        }
    }

    public static void b(CardMonitorMessage cardMonitorMessage) {
        Object[] objArr = {cardMonitorMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52a06c831095687f8ac12441a65f20c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52a06c831095687f8ac12441a65f20c9");
        } else if (cardMonitorMessage != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("card_name", cardMonitorMessage.cardName);
            hashMap.put("reason", cardMonitorMessage.reason);
            hashMap.put("navigate_type", cardMonitorMessage.navigateType);
            c.a(cardMonitorMessage.monitor, cardMonitorMessage.reason, i.a(hashMap));
        }
    }
}
