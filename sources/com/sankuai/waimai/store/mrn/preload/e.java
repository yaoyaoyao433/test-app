package com.sankuai.waimai.store.mrn.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0c00d8546b6da74bba4d55a94982471", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0c00d8546b6da74bba4d55a94982471");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(jSONObject.getString("baseURL"));
            sb.append(jSONObject.getString("url"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            Iterator<String> keys = jSONObject2.keys();
            ArrayList arrayList = new ArrayList();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            String[] strArr = new String[arrayList.size()];
            Arrays.sort(arrayList.toArray(strArr), new Comparator<String>() { // from class: com.sankuai.waimai.store.mrn.preload.e.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str, String str2) {
                    String str3 = str;
                    String str4 = str2;
                    Object[] objArr2 = {str3, str4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19f52a158a44c01c555a8207f326b55c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19f52a158a44c01c555a8207f326b55c")).intValue() : str3.compareTo(str4);
                }
            });
            for (String str : strArr) {
                sb.append(jSONObject2.get(str));
            }
            return com.sankuai.shangou.stone.util.m.a(sb.toString());
        } catch (Throwable th) {
            com.dianping.judas.util.a.a(th);
            return null;
        }
    }
}
