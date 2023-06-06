package com.meituan.metrics.cache.db;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PageReportCountDao {
    @Deprecated
    private static final String REPORT_COUNT = "reportcount";
    public static final String REPORT_COUNT_V2 = "reportcount_v2";
    @Deprecated
    private static final String REPORT_RECORD = "reportRecord_";
    public static final String REPORT_RECORD_V2 = "reportRecord_v2_";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Map<String, Integer> getCurrentDayReportCount(String str, q qVar, Map<String, Integer> map) {
        Map<String, Integer> map2;
        Object[] objArr = {str, qVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6bd1c2f29d4fc7ec08066a10d7c54379", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6bd1c2f29d4fc7ec08066a10d7c54379");
        }
        if (qVar == null) {
            return map;
        }
        long dayStartMillis = TimeUtil.getDayStartMillis();
        String b = qVar.b(str + dayStartMillis, "", u.e);
        return (TextUtils.isEmpty(b) || (map2 = (Map) new GsonBuilder().enableComplexMapKeySerialization().create().fromJson(b, new TypeToken<ConcurrentHashMap<String, Integer>>() { // from class: com.meituan.metrics.cache.db.PageReportCountDao.1
            public static ChangeQuickRedirect changeQuickRedirect;
        }.getType())) == null) ? map : map2;
    }

    public static int getCurrentDayCount(String str, q qVar) {
        Object[] objArr = {str, qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51117d9d70b4c102a16ed9219320e665", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51117d9d70b4c102a16ed9219320e665")).intValue();
        }
        String b = qVar.b(str, "", u.e);
        if (!TextUtils.isEmpty(b)) {
            long dayStartMillis = TimeUtil.getDayStartMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(dayStartMillis);
            if (b.contains(sb.toString())) {
                try {
                    return Integer.parseInt(b.substring(b.indexOf(CommonConstant.Symbol.COLON) + 1));
                } catch (Exception unused) {
                }
            } else {
                qVar.b(str, u.e);
            }
        }
        return 0;
    }

    public static void setCurrentDayLimit(String str, int i, q qVar) {
        Object[] objArr = {str, Integer.valueOf(i), qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "240aded5fb7716b60c8d4ab5584ea276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "240aded5fb7716b60c8d4ab5584ea276");
            return;
        }
        long dayStartMillis = TimeUtil.getDayStartMillis();
        qVar.a(str, dayStartMillis + CommonConstant.Symbol.COLON + i, u.e);
    }

    public static boolean addPageCountRecord(String str, Map<String, Integer> map, q qVar) {
        Object[] objArr = {str, map, qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17dafe73b98dfaca03779b18581ba40e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17dafe73b98dfaca03779b18581ba40e")).booleanValue();
        }
        if (map == null || map.size() == 0 || qVar == null) {
            return false;
        }
        long dayStartMillis = TimeUtil.getDayStartMillis();
        String json = new GsonBuilder().enableComplexMapKeySerialization().create().toJson(map);
        return qVar.a(str + dayStartMillis, json, u.e);
    }

    public static void removeInvalidPageCountRecord(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af4cca14a985620298f6dfceebabf180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af4cca14a985620298f6dfceebabf180");
        } else if (qVar != null) {
            long dayStartMillis = TimeUtil.getDayStartMillis();
            Map<String, ?> a = qVar.a(u.e);
            if (a == null || a.size() <= 0) {
                return;
            }
            for (String str : a.keySet()) {
                if (!REPORT_COUNT.equals(str)) {
                    if (!(REPORT_RECORD + dayStartMillis).equals(str) && !REPORT_COUNT_V2.equals(str)) {
                        if (!(REPORT_RECORD_V2 + dayStartMillis).equals(str)) {
                            qVar.b(str, u.e);
                        }
                    }
                }
            }
        }
    }
}
