package com.meituan.android.common.statistics.ipc.independent;

import com.meituan.android.common.statistics.tag.TagNode;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConvertTagUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static JSONArray tagListToJSONArray(List<TagNode> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "096e716d853ea360c56008981740ce2d", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "096e716d853ea360c56008981740ce2d");
        }
        JSONArray jSONArray = new JSONArray();
        if (CollectionUtils.isEmpty(list)) {
            return jSONArray;
        }
        for (TagNode tagNode : list) {
            if (tagNode != null) {
                jSONArray.put(tagNode.toJson());
            }
        }
        return jSONArray;
    }

    public static List<TagNode> toTagNodeList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c83bb27b3a8c7573d459ecda8d18e3a", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c83bb27b3a8c7573d459ecda8d18e3a");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            TagNode tagNode = toTagNode(jSONArray.optJSONObject(i));
            if (tagNode != null) {
                arrayList.add(tagNode);
            }
        }
        return arrayList;
    }

    private static TagNode toTagNode(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8e06a067f5b72570344d7d20304c810", 6917529027641081856L)) {
            return (TagNode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8e06a067f5b72570344d7d20304c810");
        }
        if (jSONObject != null) {
            return new TagNode(jSONObject.optString("pageName"), toMap(jSONObject.optJSONObject("dataNode")));
        }
        return null;
    }

    private static Map<String, Map<String, Object>> toMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "832be8dc79f47a5c7635c130a7706617", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "832be8dc79f47a5c7635c130a7706617");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, JsonUtil.jsonObjectToMap(jSONObject.optJSONObject(next)));
        }
        return hashMap;
    }
}
