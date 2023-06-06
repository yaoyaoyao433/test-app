package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(2:5|6)|(5:10|11|12|(6:14|(1:16)(1:36)|(1:35)(1:20)|21|(1:34)(2:23|(2:25|26)(2:28|(2:30|31)(2:32|33)))|27)|38)|(3:78|79|(4:82|(3:87|88|(3:100|101|102)(3:90|91|(3:97|98|99)(3:93|94|95)))|96|80))|41|42|(1:44)|45|(1:47)|48|(3:52|(1:54)|55)|56|(1:58)|59|(4:63|64|(2:66|(1:68)(2:71|(1:73)))(1:74)|69)|61|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: Throwable -> 0x009f, TryCatch #2 {Throwable -> 0x009f, blocks: (B:12:0x0039, B:14:0x003e, B:16:0x0048, B:19:0x0056, B:21:0x005e, B:23:0x006b, B:25:0x0071, B:27:0x0077, B:28:0x007b, B:30:0x0083, B:31:0x008f), top: B:88:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:50:0x00f2, B:52:0x00fd, B:53:0x0100, B:55:0x0109, B:56:0x010c, B:58:0x011d, B:60:0x0123, B:62:0x0129, B:63:0x012c, B:64:0x012f, B:66:0x0135, B:67:0x0142), top: B:86:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109 A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:50:0x00f2, B:52:0x00fd, B:53:0x0100, B:55:0x0109, B:56:0x010c, B:58:0x011d, B:60:0x0123, B:62:0x0129, B:63:0x012c, B:64:0x012f, B:66:0x0135, B:67:0x0142), top: B:86:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129 A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:50:0x00f2, B:52:0x00fd, B:53:0x0100, B:55:0x0109, B:56:0x010c, B:58:0x011d, B:60:0x0123, B:62:0x0129, B:63:0x012c, B:64:0x012f, B:66:0x0135, B:67:0x0142), top: B:86:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:50:0x00f2, B:52:0x00fd, B:53:0x0100, B:55:0x0109, B:56:0x010c, B:58:0x011d, B:60:0x0123, B:62:0x0129, B:63:0x012c, B:64:0x012f, B:66:0x0135, B:67:0x0142), top: B:86:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.Object> a(android.app.Activity r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.utils.c.a(android.app.Activity):java.util.Map");
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32fcc640b0702701c378b40ec3ef73df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32fcc640b0702701c378b40ec3ef73df")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase("abtest") || str.equalsIgnoreCase("order_id") || str.equalsIgnoreCase("cat_id") || str.equalsIgnoreCase("poi_id") || str.equalsIgnoreCase("deal_id") || str.equalsIgnoreCase("movie_id") || str.equalsIgnoreCase("goods_id") || str.equalsIgnoreCase("maiton_id") || str.equalsIgnoreCase("coupon_id") || str.equalsIgnoreCase("region_id") || str.equalsIgnoreCase("stid") || str.equalsIgnoreCase("ctpoi") || str.equalsIgnoreCase("traceid") || str.equalsIgnoreCase("keyword") || str.equalsIgnoreCase(DataConstants.ACTIVITYID) || str.equalsIgnoreCase("cinemaid") || str.equalsIgnoreCase("sortid") || str.equalsIgnoreCase("selectid") || str.equalsIgnoreCase("query_id") || str.equalsIgnoreCase("index") || str.equalsIgnoreCase("ad_id") || str.equalsIgnoreCase("title") || str.equalsIgnoreCase("biz_id") || str.equalsIgnoreCase("sku_id") || str.equalsIgnoreCase("search_id") || str.equalsIgnoreCase(DataConstants.SHOPUUID);
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dad5a039f9ed68971f559ea0f9779f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dad5a039f9ed68971f559ea0f9779f4");
        }
        if (map != null && map.containsKey("custom")) {
            Object obj = map.get("custom");
            map.remove("custom");
            if (obj instanceof Map) {
                return (Map) obj;
            }
            if (obj instanceof JSONObject) {
                return JsonUtil.jsonObjectToMap((JSONObject) obj);
            }
        }
        return null;
    }
}
