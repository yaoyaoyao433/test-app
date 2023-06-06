package com.meituan.msc.mmpviews.perflist.perf;

import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(com.meituan.msc.mmpviews.perflist.node.a aVar, JSONObject jSONObject, NativeViewHierarchyManager nativeViewHierarchyManager) {
        Object[] objArr = {aVar, jSONObject, nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14ca20c092c7c5121b808b9e70e33359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14ca20c092c7c5121b808b9e70e33359");
        } else if (aVar != null && nativeViewHierarchyManager != null) {
            ArrayList<com.meituan.msc.mmpviews.perflist.node.a> arrayList = new ArrayList();
            a(aVar, arrayList);
            for (com.meituan.msc.mmpviews.perflist.node.a aVar2 : arrayList) {
                JSONObject optJSONObject = (jSONObject == null || !jSONObject.has(String.valueOf(aVar2.c)) || jSONObject.opt(String.valueOf(aVar2.c)) == null) ? null : jSONObject.optJSONObject(String.valueOf(aVar2.c));
                if (optJSONObject == null || optJSONObject.length() == 0) {
                    optJSONObject = new JSONObject();
                    try {
                        optJSONObject.put("scrollLeft", 0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                nativeViewHierarchyManager.a(aVar2.c, aVar2.e, new ab(new MSCReadableMap(optJSONObject)));
            }
        }
    }

    private static void a(com.meituan.msc.mmpviews.perflist.node.a aVar, List<com.meituan.msc.mmpviews.perflist.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5f2bc90423f2e2e92c941506ac63f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5f2bc90423f2e2e92c941506ac63f53");
        } else if (aVar != null) {
            if ("MSCScrollView".equals(aVar.e)) {
                list.add(aVar);
            }
            for (int i = 0; i < aVar.n.size(); i++) {
                a(aVar.n.get(i), list);
            }
        }
    }
}
