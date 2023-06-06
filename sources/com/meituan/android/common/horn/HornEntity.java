package com.meituan.android.common.horn;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HornCallback mCallback;
    public Map<String, Object> mQuery;
    public String mType;

    public HornEntity(String str, HornCallback hornCallback, Map<String, Object> map) {
        Object[] objArr = {str, hornCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb2cb9a27097ff27b85bf46eba0a4d5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb2cb9a27097ff27b85bf46eba0a4d5c");
            return;
        }
        this.mType = str;
        this.mCallback = hornCallback;
        this.mQuery = removeNull(str, map);
    }

    private Map<String, Object> removeNull(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d771e0e9fb7bf8900c6c387f4786a386", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d771e0e9fb7bf8900c6c387f4786a386");
        }
        if (map == null || map.size() == 0) {
            return map;
        }
        if (map.containsKey(null) || map.containsValue(null)) {
            if (InnerHorn.isDebug) {
                PrintStream printStream = System.out;
                printStream.println("The value of querymap must be non null:\ntype:" + str + "\nquerymap:\n" + printMap(map));
            }
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                if (!TextUtils.isEmpty(str2) && map.get(str2) != null) {
                    hashMap.put(str2, map.get(str2));
                }
            }
            return hashMap;
        }
        return map;
    }

    private String printMap(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25323d4e36a8ea0ccf3cdcdbb4f49d07", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25323d4e36a8ea0ccf3cdcdbb4f49d07");
        }
        StringBuilder sb = new StringBuilder("");
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
