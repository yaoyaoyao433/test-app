package com.sankuai.waimai.store.drug.monitor.poiid;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.PoiDao;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.config.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb78392a3f5b25d339df66b3cd1ec5b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb78392a3f5b25d339df66b3cd1ec5b6")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Long) {
            return true;
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db6148031467e7cbc3789b00b9dce3c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db6148031467e7cbc3789b00b9dce3c3")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    private static boolean c(String str) {
        List list;
        List list2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7f0d620144fbf790561727b11b5fe4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7f0d620144fbf790561727b11b5fe4f")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.contains(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
            return false;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c8cc3f8000928171b355eebdedaf2079", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c8cc3f8000928171b355eebdedaf2079");
        } else {
            list = (List) d.h().a("poi_id_monitor/poi_matchers", new TypeToken<List<String>>() { // from class: com.sankuai.waimai.store.drug.monitor.poiid.b.2
            }.getType());
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                list = new ArrayList();
                list.add("poi");
                list.add("Poi");
                list.add(PoiDao.TABLENAME);
                list.add("restaurant");
            }
        }
        if (a(str, list)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1e4821b0c5f934b94f92c26129366a95", RobustBitConfig.DEFAULT_VALUE)) {
                list2 = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1e4821b0c5f934b94f92c26129366a95");
            } else {
                list2 = (List) d.h().a("poi_id_monitor/poi_matchers", new TypeToken<List<String>>() { // from class: com.sankuai.waimai.store.drug.monitor.poiid.b.1
                }.getType());
                if (com.sankuai.shangou.stone.util.a.b(list2)) {
                    list2 = new ArrayList();
                    list2.add("id");
                    list2.add("Id");
                    list2.add("ID");
                }
            }
            if (a(str, list2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(@NonNull String str, @NonNull List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2c7fc40c930b63bfe1ba11bec484d4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2c7fc40c930b63bfe1ba11bec484d4a")).booleanValue();
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e20e85a29e5025eebf17830584dc5a9c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e20e85a29e5025eebf17830584dc5a9c")).booleanValue() : map.containsKey(FoodDetailNetWorkPreLoader.URI_POI_STR) && map.get(FoodDetailNetWorkPreLoader.URI_POI_STR) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d29410c1e91c836604a31eca1b6e159b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d29410c1e91c836604a31eca1b6e159b");
        }
        Set<String> keySet = map.keySet();
        if (keySet == null) {
            return "";
        }
        for (String str : keySet) {
            if (c(str)) {
                return str;
            }
        }
        return "";
    }

    private static boolean d(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f514acb0465a1bb79b42c8309e05c0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f514acb0465a1bb79b42c8309e05c0e")).booleanValue() : (map == null || TextUtils.isEmpty(a(map)) || c(map)) ? false : true;
    }

    private static boolean e(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3aa3de83d6656b60187bdc8231269625", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3aa3de83d6656b60187bdc8231269625")).booleanValue();
        }
        if (map != null && c(map)) {
            return TextUtils.isEmpty(a(map));
        }
        return false;
    }

    private static boolean f(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e635ceaeaae7678a506bb0a14f04965", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e635ceaeaae7678a506bb0a14f04965")).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String a2 = a(map);
        return (TextUtils.isEmpty(a2) || a(map.get(a2))) ? false : true;
    }

    private static boolean g(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22f52c408777f41400d35fcdf89ce928", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22f52c408777f41400d35fcdf89ce928")).booleanValue();
        }
        if (map == null) {
            return false;
        }
        return a(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
    }

    private static boolean h(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "225eaa1274cdddc58da909c0f54e6a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "225eaa1274cdddc58da909c0f54e6a0d")).booleanValue();
        }
        if (map == null) {
            return false;
        }
        return "".equals(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f55e84a1d80de86e8a5cacc5afcc7b76", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f55e84a1d80de86e8a5cacc5afcc7b76")).booleanValue();
        }
        d h = d.h();
        return "1".equals(h.a("poi_id_monitor/" + str, "1"));
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1127d57a1c81037d4b8a001da374e5ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1127d57a1c81037d4b8a001da374e5ae");
        }
        d h = d.h();
        return h.a("poi_id_monitor/" + str, str2);
    }

    public static int b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6e87fa5d2250be6a2ba46d016c94d67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6e87fa5d2250be6a2ba46d016c94d67")).intValue();
        }
        if (d(map)) {
            return 1;
        }
        if (e(map)) {
            return 2;
        }
        if (f(map)) {
            return 3;
        }
        if (g(map)) {
            return 4;
        }
        return h(map) ? 6 : 0;
    }
}
