package com.sankuai.waimai.store.poi.list.newp.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements Mach.d {
    public static ChangeQuickRedirect a;
    private Context b;

    public f(com.sankuai.waimai.mach.recycler.c cVar, Context context) {
        Object[] objArr = {cVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33a8bdf34dc1267ec89a8925a57b3ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33a8bdf34dc1267ec89a8925a57b3ea");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        int i = 0;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14df6acccebb93ea8276b01c8984c41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14df6acccebb93ea8276b01c8984c41b");
        } else if (str != null && !com.sankuai.waimai.store.util.b.a(this.b)) {
            com.sankuai.waimai.store.mach.page.event.f.a().a(str, map);
            if (TextUtils.equals(str, "back")) {
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mach.page.event.a());
                return;
            }
            if (TextUtils.equals(str, "go_to_search")) {
                com.sankuai.waimai.store.router.g.a(this.b, new com.sankuai.waimai.store.param.a(), "", (SearchCarouselText) null);
            } else if (TextUtils.equals(str, "jump")) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19e3cbf4facc999ce22f165a5eb99aa2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19e3cbf4facc999ce22f165a5eb99aa2");
                } else if (map != null) {
                    if (map.get("type") != null) {
                        if (map.get("type").getClass().equals(Long.class)) {
                            i = ((Long) map.get("type")).intValue();
                        } else if (map.get("type").getClass().equals(String.class)) {
                            try {
                                i = Integer.valueOf((String) map.get("type")).intValue();
                            } catch (Exception e) {
                                com.sankuai.shangou.stone.util.log.a.a(e);
                            }
                        }
                    }
                    String str2 = map.get(NetLogConstants.Details.SCHEME) instanceof String ? (String) map.get(NetLogConstants.Details.SCHEME) : null;
                    HashMap hashMap = new HashMap();
                    if (map.get("append_params") instanceof Map) {
                        for (Map.Entry entry : ((Map) map.get("append_params")).entrySet()) {
                            if (entry.getKey() != null && entry.getValue() != null) {
                                if (entry.getValue() instanceof String) {
                                    hashMap.put(entry.getKey(), (String) entry.getValue());
                                } else {
                                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    if (i == 1) {
                        com.sankuai.waimai.store.router.d.a(this.b, str2, hashMap);
                    } else {
                        com.sankuai.waimai.store.router.d.a(this.b, str2);
                    }
                }
            }
        }
    }
}
