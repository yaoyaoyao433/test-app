package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m extends RocksServerModel {
    public static ChangeQuickRedirect a;
    @SerializedName("global_data")
    public Map<String, Object> b;
    public List<a> c;
    public int d;
    public int e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public Map<String, Object> b;

        public a(String str, Map<String, Object> map) {
            this.a = str;
            this.b = map;
        }
    }

    public final Map<String, Object> a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39328b114bf8b0e356768923148a8afd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39328b114bf8b0e356768923148a8afd");
        }
        Map<String, Object> a2 = a(this.moduleList, strArr);
        a2.putAll(this.b);
        return a2;
    }

    public final Map<String, Object> b(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba52687a89fb17a889e25783859cb51", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba52687a89fb17a889e25783859cb51") : a(this.moduleList, strArr);
    }

    private Map<String, Object> a(List<RocksServerModel> list, String... strArr) {
        Object[] objArr = {list, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c117fcadf2698c0138caeba2d7abe2ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c117fcadf2698c0138caeba2d7abe2ec");
        }
        HashMap hashMap = new HashMap();
        if (list == null || list.isEmpty()) {
            return hashMap;
        }
        List asList = Arrays.asList(strArr);
        for (RocksServerModel rocksServerModel : list) {
            if (asList.contains(rocksServerModel.moduleId) && rocksServerModel.jsonData != null) {
                hashMap.putAll(rocksServerModel.jsonData);
            }
            hashMap.putAll(a(rocksServerModel.moduleList, strArr));
        }
        return hashMap;
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7afe13846da935b1e14b871abadcb2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7afe13846da935b1e14b871abadcb2")).intValue() : a(this.moduleList, str);
    }

    private int a(List<RocksServerModel> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4eedbe31154554ae9986479b6b930f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4eedbe31154554ae9986479b6b930f4")).intValue();
        }
        if (list == null || list.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).moduleId)) {
                return i;
            }
        }
        return 0;
    }

    public final Map<String, Object> c(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721df026add2611c05bc94b4342f8b5f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721df026add2611c05bc94b4342f8b5f") : b(this.c, strArr);
    }

    private Map<String, Object> b(List<a> list, String... strArr) {
        Object[] objArr = {list, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06b95f18b30c5db838f6600e65f4f22", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06b95f18b30c5db838f6600e65f4f22");
        }
        HashMap hashMap = new HashMap();
        if (list == null || list.isEmpty()) {
            return hashMap;
        }
        List asList = Arrays.asList(strArr);
        for (a aVar : list) {
            if (asList.contains(aVar.a)) {
                hashMap.putAll(aVar.b);
            }
        }
        hashMap.putAll(this.b);
        return hashMap;
    }

    public static m a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b080d63bd8df1d24d3fe11e16367825", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b080d63bd8df1d24d3fe11e16367825");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        m mVar = new m();
        JsonElement jsonElement2 = asJsonObject.get("render_mode");
        if (jsonElement2 != null) {
            mVar.renderMode = jsonElement2.getAsString();
        }
        JsonElement jsonElement3 = asJsonObject.get("view_type");
        if (jsonElement3 != null) {
            mVar.viewType = jsonElement3.getAsString();
        }
        JsonElement jsonElement4 = asJsonObject.get("module_id");
        if (jsonElement4 != null) {
            mVar.moduleId = jsonElement4.getAsString();
        }
        JsonElement jsonElement5 = asJsonObject.get("layout_type");
        if (jsonElement5 != null) {
            mVar.layoutType = jsonElement5.getAsString();
        }
        JsonElement jsonElement6 = asJsonObject.get("layout_info");
        if (jsonElement6 != null) {
            mVar.layoutInfo = jsonElement6.getAsString();
        }
        JsonElement jsonElement7 = asJsonObject.get("data_type");
        if (jsonElement7 != null) {
            mVar.dataType = jsonElement7.getAsInt();
        }
        JsonElement jsonElement8 = asJsonObject.get("data_id");
        if (jsonElement8 != null) {
            mVar.dataId = jsonElement8.getAsString();
        }
        JsonElement jsonElement9 = asJsonObject.get("template_id");
        if (jsonElement9 != null) {
            mVar.templateId = jsonElement9.getAsString();
        }
        JsonElement jsonElement10 = asJsonObject.get("template_ph_id");
        if (jsonElement10 != null) {
            mVar.templatePhId = jsonElement10.getAsString();
        }
        JsonElement jsonElement11 = asJsonObject.get("lx_view_info");
        if (jsonElement11 != null) {
            mVar.lxViewInfo = jsonElement11.getAsString();
        }
        JsonElement jsonElement12 = asJsonObject.get("lx_click_info");
        if (jsonElement12 != null) {
            mVar.lxClickInfo = jsonElement12.getAsString();
        }
        JsonElement jsonElement13 = asJsonObject.get("ad_view_info");
        if (jsonElement13 != null) {
            mVar.adViewInfo = jsonElement13.getAsString();
        }
        JsonElement jsonElement14 = asJsonObject.get("ad_click_info");
        if (jsonElement14 != null) {
            mVar.adClickInfo = jsonElement14.getAsString();
        }
        JsonElement jsonElement15 = asJsonObject.get("action");
        if (jsonElement15 != null) {
            mVar.action = jsonElement15.getAsString();
        }
        JsonElement jsonElement16 = asJsonObject.get("is_loading");
        if (jsonElement16 != null) {
            mVar.isLoading = jsonElement16.getAsString();
        }
        JsonElement jsonElement17 = asJsonObject.get("is_Main_url");
        if (jsonElement17 != null) {
            mVar.isMainUrl = jsonElement17.getAsString();
        }
        JsonElement jsonElement18 = asJsonObject.get("string_data");
        if (jsonElement18 != null) {
            mVar.stringData = jsonElement18.getAsString();
        }
        JsonElement jsonElement19 = asJsonObject.get("json_data");
        if (jsonElement19 != null) {
            mVar.jsonData = com.sankuai.waimai.mach.utils.b.a(jsonElement19.toString());
        }
        JsonElement jsonElement20 = asJsonObject.get("global_data");
        if (jsonElement20 != null) {
            mVar.b = com.sankuai.waimai.mach.utils.b.a(jsonElement20.toString());
            try {
                mVar.d = NumberUtils.parseInt(String.valueOf(mVar.b.get("page_style")), 0);
                if (mVar.b.containsKey("business_type_list")) {
                    mVar.e = ((List) mVar.b.get("business_type_list")).size();
                }
            } catch (Exception unused) {
            }
        }
        JsonElement jsonElement21 = asJsonObject.get("module_list");
        if (jsonElement21 != null && jsonElement21.isJsonArray()) {
            JsonArray asJsonArray = jsonElement21.getAsJsonArray();
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            mVar.moduleList = arrayList;
        }
        return mVar;
    }
}
