package com.sankuai.waimai.alita.core.aidata;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.cache.result.ResultColumnValue;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.aidata.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0696a {
        @Nullable
        public com.sankuai.waimai.alita.core.jsexecutor.task.d a = null;
        public boolean b = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public boolean i;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed9cb7579cb45732710fadc0f9d2508f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed9cb7579cb45732710fadc0f9d2508f");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final Map<String, List<Map<String, Object>>> a(List<c> list, @Nullable C0696a c0696a) {
        Object[] objArr = {list, c0696a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb62fe0c05583c74b7f703dfcc26f91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb62fe0c05583c74b7f703dfcc26f91");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            List<Map<String, Object>> a2 = a(cVar, c0696a);
            if (!TextUtils.isEmpty(cVar.a) && a2 != null) {
                hashMap.put(cVar.a, a2);
            }
        }
        return hashMap;
    }

    public final List<Map<String, Object>> a(c cVar, @Nullable C0696a c0696a) {
        int i;
        Object[] objArr = {cVar, c0696a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7db83f7a349a718ba6f3848c5bf65b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7db83f7a349a718ba6f3848c5bf65b5");
        }
        List<Map<String, Object>> a2 = a("", cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
        if (AlitaBizConfigUtil.a(6) && cVar.i) {
            HashMap hashMap = new HashMap();
            for (Map<String, Object> map : a2) {
                if (map != null && !map.isEmpty()) {
                    String a3 = a(map);
                    if (!TextUtils.isEmpty(a3)) {
                        hashMap.put(a3, map);
                    }
                }
            }
            Map<String, String> a4 = a(hashMap.keySet());
            String str = "";
            String str2 = "";
            if (c0696a != null && c0696a.a != null) {
                str = c0696a.a.b;
                str2 = c0696a.a.c;
            }
            String a5 = AlitaBundleUtil.a(str);
            for (Map.Entry entry : hashMap.entrySet()) {
                Map map2 = (Map) entry.getValue();
                String str3 = a4.get((String) entry.getKey());
                try {
                    new JSONObject(str3);
                    map2.put("val_lab", str3);
                    i = 1;
                } catch (Exception unused) {
                    map2.put("val_lab", "");
                    i = 0;
                }
                if (i != 0 && c0696a != null) {
                    c0696a.b = true;
                }
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ReadSqlCompatible.MONITOR_KEY, i, a5).addTags("bundle_id", str).addTags("bundle_version", str2).addTags(AlitaMonitorCenter.AlitaMonitorConst.ReadSqlCompatible.TAG_KEY_SQL_NAME, cVar.a).commit();
            }
        }
        return a2;
    }

    @NonNull
    private List<Map<String, Object>> a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c4bf76749fa047ef5092c4125bd7232", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c4bf76749fa047ef5092c4125bd7232");
        }
        LinkedList linkedList = new LinkedList();
        List<ResultRow> list = null;
        try {
            list = AIData.query(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (Exception unused) {
        }
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Map<String, Object> a2 = a(list.get(i));
                if (a2 != null) {
                    linkedList.add(a2);
                }
            }
        }
        return linkedList;
    }

    private String a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655aea66fede74ba305a4c84f3a0eb9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655aea66fede74ba305a4c84f3a0eb9d");
        }
        Object obj = map.get("val_lab");
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.contains(AlitaRealTimeEventCenter.ALITA_SPLIT_EVENT_KEY)) {
                try {
                    return new JSONObject(str).optString(AlitaRealTimeEventCenter.ALITA_SPLIT_EVENT_KEY);
                } catch (Exception unused) {
                }
            }
        }
        return "";
    }

    private Map<String, String> a(@Nullable Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c31440082ecdf6d77a3ac67cdbc8ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c31440082ecdf6d77a3ac67cdbc8ee");
        }
        HashMap hashMap = new HashMap();
        if (set == null || set.isEmpty()) {
            return hashMap;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("nm='ALITA_LONG_DATA_SPLIT");
        sb.append("' ");
        sb.append("and ");
        sb.append("category in (");
        for (String str : set) {
            sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
            sb.append(str);
            sb.append("',");
        }
        sb.replace(sb.length() - 1, sb.length(), CommonConstant.Symbol.BRACKET_RIGHT);
        List<Map<String, Object>> a2 = a("", "category, cid, bid, val_lab", "", sb.toString(), "", "", "category, bid", "");
        HashMap hashMap2 = new HashMap();
        for (Map<String, Object> map : a2) {
            if (map != null && !map.isEmpty()) {
                Object obj = map.get("category");
                Object obj2 = map.get("cid");
                Object obj3 = map.get("bid");
                Object obj4 = map.get("val_lab");
                if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String) && (obj4 instanceof String)) {
                    String str2 = (String) obj;
                    String str3 = (String) obj3;
                    String str4 = (String) obj4;
                    try {
                        int parseInt = Integer.parseInt((String) obj2);
                        int parseInt2 = Integer.parseInt(str3);
                        String optString = new JSONObject(str4).optString(AlitaRealTimeEventCenter.ALITA_SPLIT_EVENT_KEY);
                        if (parseInt2 >= 0 && parseInt > parseInt2 && !TextUtils.isEmpty(optString)) {
                            List list = (List) hashMap2.get(str2);
                            if (list == null) {
                                list = new ArrayList(parseInt);
                                for (int i = 0; i < parseInt; i++) {
                                    list.add("");
                                }
                                hashMap2.put(str2, list);
                            }
                            list.set(parseInt2, optString);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Set<Map.Entry> entrySet = hashMap2.entrySet();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : entrySet) {
            String str5 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (!TextUtils.isEmpty(str5) && list2 != null && !list2.isEmpty()) {
                sb2.replace(0, sb2.length(), "");
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str6 = (String) it.next();
                    if (!TextUtils.isEmpty(str6)) {
                        sb2.append(str6);
                    } else {
                        sb2.replace(0, sb2.length(), "");
                        break;
                    }
                }
                hashMap.put(str5, sb2.toString());
            }
        }
        return hashMap;
    }

    private Map<String, Object> a(ResultRow resultRow) {
        Object obj;
        char c2 = 1;
        Object[] objArr = {resultRow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4185ad450224e74dc24669ea9236f95f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4185ad450224e74dc24669ea9236f95f");
        }
        if (resultRow == null) {
            return null;
        }
        int columnCount = resultRow.getColumnCount();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < columnCount) {
            ResultColumnValue valueAtIndex = resultRow.getValueAtIndex(i);
            String columnName = resultRow.getColumnName(i);
            int type = resultRow.getType(i);
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(type);
            objArr2[c2] = valueAtIndex;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ca907ef05e0fc97435f9ebdbfd7a11", RobustBitConfig.DEFAULT_VALUE)) {
                obj = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ca907ef05e0fc97435f9ebdbfd7a11");
            } else {
                if (type != 0) {
                    if (type == 1) {
                        obj = Integer.valueOf(valueAtIndex.toInt());
                    } else if (type == 2) {
                        obj = Long.valueOf(valueAtIndex.toLong());
                    } else if (type == 11) {
                        obj = Double.valueOf(valueAtIndex.toDouble());
                    } else if (type == 21) {
                        obj = valueAtIndex.toString();
                    }
                }
                obj = null;
            }
            if (obj != null && !TextUtils.isEmpty(columnName)) {
                hashMap.put(columnName, obj);
            }
            i++;
            c2 = 1;
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public boolean j;

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdc0169608c01a50adcd7f741896e17", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdc0169608c01a50adcd7f741896e17");
            }
            c cVar = new c();
            cVar.a = this.b;
            cVar.b = this.c;
            cVar.c = this.d;
            cVar.d = this.e;
            cVar.e = this.f;
            cVar.f = this.g;
            cVar.g = this.h;
            cVar.h = this.i;
            cVar.i = this.j;
            return cVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d555d853e31dec65623714951394f0", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d555d853e31dec65623714951394f0");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ");
            sb.append(this.b);
            sb.append(StringUtil.SPACE);
            sb.append("FROM ");
            sb.append(this.c);
            sb.append(StringUtil.SPACE);
            if (!TextUtils.isEmpty(this.d)) {
                sb.append("WHERE ");
                sb.append(this.d);
                sb.append(StringUtil.SPACE);
            }
            if (!TextUtils.isEmpty(this.e)) {
                sb.append("GROUP BY ");
                sb.append(this.e);
                sb.append(StringUtil.SPACE);
            }
            if (!TextUtils.isEmpty(this.f)) {
                sb.append("HAVING ");
                sb.append(this.f);
                sb.append(StringUtil.SPACE);
            }
            if (!TextUtils.isEmpty(this.g)) {
                sb.append("ORDER BY ");
                sb.append(this.g);
                sb.append(StringUtil.SPACE);
            }
            if (!TextUtils.isEmpty(this.h)) {
                sb.append("LIMIT ");
                sb.append(this.h);
            }
            return sb.toString();
        }
    }
}
