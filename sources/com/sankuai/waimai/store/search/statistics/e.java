package com.sankuai.waimai.store.search.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Map a(Map map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca49c4723a36bece36514834303954e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca49c4723a36bece36514834303954e1");
        }
        if (map != null && (map.get(str) instanceof Map)) {
            return (Map) map.get(str);
        }
        return null;
    }

    public static Map a(Map map, String str, int i) {
        List list;
        Object[] objArr = {map, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5c1b5bd584770862bada5bad4bbbc07", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5c1b5bd584770862bada5bad4bbbc07");
        }
        if (map != null && (map.get(str) instanceof List) && (list = (List) map.get(str)) != null && i < list.size() && (list.get(i) instanceof Map)) {
            return (Map) list.get(i);
        }
        return null;
    }

    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51fff50c18335d7ea798ce01a4cabcf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51fff50c18335d7ea798ce01a4cabcf3");
        } else if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                boolean z = obj == null;
                boolean z2 = (obj instanceof Map) && ((Map) obj).isEmpty();
                boolean z3 = (obj instanceof List) && ((List) obj).isEmpty();
                if (z || z2 || z3) {
                    map.put(str, "");
                }
            }
        }
    }

    public static String a(String str, List<Long> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0373981baa5a67914042e75539f64715", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0373981baa5a67914042e75539f64715");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (Long l : list) {
            if (l != null) {
                sb.append(l);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        return str + "&combo_spu_list=" + sb.toString();
    }
}
