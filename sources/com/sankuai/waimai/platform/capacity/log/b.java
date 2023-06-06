package com.sankuai.waimai.platform.capacity.log;

import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b2c7303548ba18404903ff28360f170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b2c7303548ba18404903ff28360f170");
        } else {
            a(aVar, "info");
        }
    }

    private static void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e146c059fc25c3b34f64b3a4f2c61973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e146c059fc25c3b34f64b3a4f2c61973");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str);
            jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, aVar.c);
            jSONObject.put(ShowLogJsHandler.PARAM_NAME_MODULE, aVar.b);
            jSONObject.put("type", aVar.d);
            if (!TextUtils.isEmpty(aVar.f)) {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, aVar.f);
            }
            if (!TextUtils.isEmpty(aVar.e)) {
                jSONObject.put("description", aVar.e);
            }
            com.dianping.networklog.c.a(jSONObject.toString(), 3);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b("logan json", e.getMessage(), new Object[0]);
        }
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13094924190a62a9cb262ce557b70844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13094924190a62a9cb262ce557b70844");
            return;
        }
        Sniffer.smell(aVar.c, aVar.b, aVar.d, aVar.e, aVar.f);
        a(aVar, "error");
    }
}
