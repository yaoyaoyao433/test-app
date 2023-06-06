package com.meituan.msc.mmpviews.list.msclist;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private HashMap<String, HashMap<String, com.meituan.msc.mmpviews.list.expression.a>> b;
    private HashMap<String, JSONObject> c;
    private HashMap<String, HashMap<String, Object>> d;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b609addc89a2e21f27d0c18291d10e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b609addc89a2e21f27d0c18291d10e");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
    }

    public final void a(HashMap<String, JSONObject> hashMap) throws JSONException {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8729425d1227dc58d8c2248059cbc50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8729425d1227dc58d8c2248059cbc50a");
        } else if (hashMap != null) {
            this.c = hashMap;
            for (Map.Entry<String, JSONObject> entry : this.c.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                HashMap<String, com.meituan.msc.mmpviews.list.expression.a> hashMap2 = new HashMap<>();
                if (value != null) {
                    Iterator<String> keys = value.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap2.put(next, com.meituan.msc.mmpviews.list.expression.a.a(value.getJSONObject(next)));
                    }
                }
                this.b.put(key, hashMap2);
            }
        }
    }

    public final Object a(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f91f1bcedf976750250cfe698e1238", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f91f1bcedf976750250cfe698e1238") : a(str, str2, null, jSONObject);
    }

    public final Object a(String str, String str2, List<Integer> list, JSONObject jSONObject) {
        Object[] objArr = {str, str2, list, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe166168434264e0deb6027cd6c7f74f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe166168434264e0deb6027cd6c7f74f");
        }
        if (str == null || str2 == null || jSONObject == null) {
            com.meituan.msc.modules.reporter.g.a("[VariableExpressionManager@calculateExpression] expression: ", str + ", itemType: " + str2 + ", data: " + jSONObject);
            return null;
        }
        String substring = str.substring(2);
        return b(substring.substring(0, substring.length() - 2), str2, list, jSONObject);
    }

    private Object b(String str, String str2, List<Integer> list, JSONObject jSONObject) {
        com.meituan.msc.mmpviews.list.expression.b bVar;
        Object[] objArr = {str, str2, list, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdbea82edf4ccfbf38030dc4a43a172", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdbea82edf4ccfbf38030dc4a43a172");
        }
        HashMap<String, com.meituan.msc.mmpviews.list.expression.a> hashMap = this.b.get(str2);
        if (hashMap == null) {
            throw new IllegalArgumentException("tplExpressions for: " + str2 + " is null, " + jSONObject);
        }
        com.meituan.msc.mmpviews.list.expression.a aVar = hashMap.get(str);
        if (aVar == null) {
            throw new IllegalArgumentException("generalExpression for: " + str + " is null, " + jSONObject);
        }
        if (list == null) {
            try {
                list = new ArrayList<>();
            } catch (Exception e) {
                com.meituan.msc.modules.reporter.g.a("[VariableExpressionManager@parse]", e);
                bVar = null;
            }
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        bVar = aVar.a(jSONObject, iArr);
        return com.meituan.msc.mmpviews.list.common.a.a(bVar);
    }
}
