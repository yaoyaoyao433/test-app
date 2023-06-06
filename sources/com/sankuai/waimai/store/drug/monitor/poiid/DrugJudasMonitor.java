package com.sankuai.waimai.store.drug.monitor.poiid;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.util.monitor.DrugCommonMonitor;
import com.sankuai.waimai.store.manager.judas.JudasMonitorService;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugJudasMonitor implements JudasMonitorService {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static List<String> getExcludeBids() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1bcd06c2e955c70b4ea1c36ce7c6166", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1bcd06c2e955c70b4ea1c36ce7c6166") : (List) d.h().a("poi_id_monitor/judas/exclude_bids", new TypeToken<List<String>>() { // from class: com.sankuai.waimai.store.drug.monitor.poiid.DrugJudasMonitor.1
        }.getType());
    }

    @Override // com.sankuai.waimai.store.manager.judas.JudasMonitorService
    public void onCommit(EventInfo eventInfo) {
        boolean z = false;
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "562c590434d6835ab375faf61c8f6e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "562c590434d6835ab375faf61c8f6e2a");
        } else if (b.a("judas/switch") && eventInfo != null) {
            List<String> excludeBids = getExcludeBids();
            if (excludeBids == null || !excludeBids.contains(eventInfo.val_bid)) {
                Map<String, Object> map = eventInfo.val_lab;
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1c0eb067f66151e363e1e8a0a5b81427", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1c0eb067f66151e363e1e8a0a5b81427")).booleanValue();
                } else if (map != null) {
                    String a = b.a(map);
                    if (!TextUtils.isEmpty(a)) {
                        z = b.a(map.get(a));
                    }
                }
                if (z) {
                    reportError(eventInfo.val_cid, eventInfo.val_bid);
                }
            }
        }
    }

    private static void reportError(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7fade2b1c74ac3e82ca28b7b6344d37d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7fade2b1c74ac3e82ca28b7b6344d37d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cid", str);
        hashMap.put("bid", str2);
        hashMap.put("error_type", "5");
        c.a(new DrugCommonMonitor(b.a("judas/key", "MEDPoiIdJudas")), "", "poi id judas error!", hashMap);
    }
}
