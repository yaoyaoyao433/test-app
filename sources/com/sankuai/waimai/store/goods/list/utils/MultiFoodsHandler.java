package com.sankuai.waimai.store.goods.list.utils;

import android.content.Intent;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodAttrValue;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class MultiFoodsHandler {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SimpleGoodsSku implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ArrayList<SGGoodAttrValue> attrs;
        public int count;
        public long id;
        public long skuid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        MT_SHOPCART(1);
        
        public static ChangeQuickRedirect a;
        public int c;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d804a28bec14b19f3a5e81ffa84abd22", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d804a28bec14b19f3a5e81ffa84abd22") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa3efb929f9d9084f36a6c3071fca655", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa3efb929f9d9084f36a6c3071fca655") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, 0, 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2959e0b7dc7413e0601647eab6581b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2959e0b7dc7413e0601647eab6581b");
            } else {
                this.c = 1;
            }
        }
    }

    private static boolean b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6beed30a369add6a829521bc86d379d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6beed30a369add6a829521bc86d379d1")).booleanValue() : a.MT_SHOPCART.c == d.a(intent, "page_from_type", "page_from_type", -1);
    }

    public static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd2ac7ecbd7059a4b308f7ffe34b6e76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd2ac7ecbd7059a4b308f7ffe34b6e76")).booleanValue() : b(intent);
    }

    public static void a(Intent intent, ArrayList<Long> arrayList, HashMap<Long, ArrayList<SimpleGoodsSku>> hashMap) {
        Object[] objArr = {intent, arrayList, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "266708b179c31d2f2d22b1824ba405c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "266708b179c31d2f2d22b1824ba405c9");
            return;
        }
        String a2 = d.a(intent, "multi_add_list", "multi_add_list", "");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        arrayList.clear();
        try {
            JSONArray jSONArray = new JSONArray(a2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("id");
                    if (!arrayList.contains(Long.valueOf(optLong))) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("skus");
                    ArrayList<SimpleGoodsSku> arrayList2 = new ArrayList<>();
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                            if (optJSONObject2 != null) {
                                SimpleGoodsSku simpleGoodsSku = new SimpleGoodsSku();
                                long optLong2 = optJSONObject2.optLong("id");
                                simpleGoodsSku.id = optLong;
                                simpleGoodsSku.skuid = optLong2;
                                simpleGoodsSku.count = optJSONObject2.optInt("count");
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("attrs");
                                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                    String jSONArray2 = optJSONObject2.optJSONArray("attrs").toString();
                                    if (!t.a(jSONArray2)) {
                                        simpleGoodsSku.attrs = (ArrayList) i.a().fromJson(jSONArray2, new TypeToken<ArrayList<SGGoodAttrValue>>() { // from class: com.sankuai.waimai.store.goods.list.utils.MultiFoodsHandler.2
                                        }.getType());
                                    }
                                }
                                arrayList2.add(simpleGoodsSku);
                                if (!com.sankuai.shangou.stone.util.a.b(hashMap.get(Long.valueOf(optLong2)))) {
                                    hashMap.get(Long.valueOf(optLong2)).addAll(arrayList2);
                                } else {
                                    hashMap.put(Long.valueOf(optLong2), arrayList2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }
}
