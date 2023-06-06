package com.sankuai.waimai.store.base.report;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.DrugSchemeMonitor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Context context, @NonNull Poi poi) {
        Object[] objArr = {context, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a3c438d1c684d4b06e098f22a0d4f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a3c438d1c684d4b06e098f22a0d4f58");
        } else if (poi == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("buz_type", poi.getBuzType());
                jSONObject.put("source_vc", context.getClass().getName());
                jSONObject.put("error_type", "SchemeNullError");
                c.a(DrugSchemeMonitor.MEDDetailTransferError, jSONObject.toString(), "商品详情页路由监控");
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public static long a(@NonNull Uri uri, String str, long j) {
        Object[] objArr = {uri, str, -999L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08d40bc2b2ceb20ad59d16ba871df591", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08d40bc2b2ceb20ad59d16ba871df591")).longValue();
        }
        if (uri != null) {
            return NumberUtils.parseLong(uri.getQueryParameter(str), -999L);
        }
        return -999L;
    }

    public static int a(@NonNull Uri uri, String str, int i) {
        Object[] objArr = {uri, str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49ea4fb43429509f975282df46e9410b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49ea4fb43429509f975282df46e9410b")).intValue();
        }
        String queryParameter = uri.getQueryParameter(str);
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return 0;
    }
}
