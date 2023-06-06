package com.sankuai.waimai.bussiness.order.rocks;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderExtInfo;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderRocksServerModel extends n {
    public static ChangeQuickRedirect a;
    public List<a> b;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b c;
    public int d;

    public OrderRocksServerModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cadc49d48eb6661c53bf34080bd3307e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cadc49d48eb6661c53bf34080bd3307e");
        } else {
            this.c = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b();
        }
    }

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589d1b0d532e887bd16d6f76676b982c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589d1b0d532e887bd16d6f76676b982c");
        }
        Map<String, Object> b = b(this.moduleList, strArr);
        b.putAll(a(this.b, strArr));
        return b;
    }

    public final Map<String, Object> b(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13d8c775e1c5ddbc5f885abc5bff890", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13d8c775e1c5ddbc5f885abc5bff890");
        }
        if (this.module_list_header == null) {
            return new HashMap();
        }
        Map<String, Object> b = b(this.module_list_header.moduleList, strArr);
        b.putAll(a(this.b, strArr));
        return b;
    }

    public final Map<String, Object> c(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0892d6b387141a0a6a3c06765270a0ae", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0892d6b387141a0a6a3c06765270a0ae") : a(this.b, strArr);
    }

    private Map<String, Object> a(List<a> list, String... strArr) {
        Object[] objArr = {list, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73755e3d810a62ef446b47efe2856c37", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73755e3d810a62ef446b47efe2856c37");
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
        return hashMap;
    }

    private Map<String, Object> b(List<RocksServerModel> list, String... strArr) {
        Object[] objArr = {list, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747d8ca961eb587a8e3b244c5ccdedf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747d8ca961eb587a8e3b244c5ccdedf8");
        }
        HashMap hashMap = new HashMap();
        if (list == null || list.isEmpty()) {
            return hashMap;
        }
        List asList = Arrays.asList(strArr);
        for (RocksServerModel rocksServerModel : list) {
            if (asList.contains(rocksServerModel.moduleId)) {
                hashMap.putAll(rocksServerModel.jsonData);
            }
            hashMap.putAll(b(rocksServerModel.moduleList, strArr));
        }
        return hashMap;
    }

    public final void a() {
        List<ExpInfo> list;
        RiderInfo riderInfo;
        com.sankuai.waimai.business.order.api.detail.model.b bVar;
        com.sankuai.waimai.business.order.api.detail.model.a aVar;
        com.sankuai.waimai.bussiness.order.detailnew.network.response.n nVar;
        com.sankuai.waimai.bussiness.order.detailnew.network.response.a aVar2;
        com.sankuai.waimai.bussiness.order.detailnew.network.response.o oVar;
        OrderExtInfo orderExtInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1943d7ec7d0a550072d67cc02602ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1943d7ec7d0a550072d67cc02602ec");
            return;
        }
        this.c.b = String.valueOf(this.g.get("id"));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar2 = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.g.get("wm_poi_id"));
        bVar2.c = r.a(sb.toString(), 0L);
        String valueOf = String.valueOf(this.g.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (aa.a(valueOf)) {
            valueOf = "";
        }
        this.c.d = valueOf;
        com.sankuai.waimai.platform.domain.core.poi.b.a(this.c.c, this.c.d);
        this.c.e = String.valueOf(this.g.get(AgainManager.EXTRA_POI_NAME));
        this.c.f = String.valueOf(this.g.get("poi_icon"));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar3 = this.c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.g.get("wm_poi_valid"));
        bVar3.g = r.a(sb2.toString(), 0);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar4 = this.c;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.g.get("business_type"));
        bVar4.h = r.a(sb3.toString(), 0);
        this.c.i = String.valueOf(this.g.get("recipient_phone"));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar5 = this.c;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g.get("ap_coupon_tag"));
        bVar5.r = r.a(sb4.toString(), 0);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar6 = this.c;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.g.get("template_type"));
        bVar6.s = r.a(sb5.toString(), 0);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar7 = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ea4ad5295055fa4ea4351fe56a85614", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ea4ad5295055fa4ea4351fe56a85614");
        } else {
            list = (List) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.g.get("exp_infos")), new TypeToken<List<ExpInfo>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel.1
            }.getType());
        }
        bVar7.p = list;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar8 = this.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb868a7610cfd9aa024c5c1798ccea7b", RobustBitConfig.DEFAULT_VALUE)) {
            riderInfo = (RiderInfo) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb868a7610cfd9aa024c5c1798ccea7b");
        } else {
            riderInfo = (RiderInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("rider_info")), (Class<Object>) RiderInfo.class);
        }
        bVar8.k = riderInfo;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar9 = this.c;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f98026ef1f54f7dd9e5e62ec4cd5acb", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.waimai.business.order.api.detail.model.b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f98026ef1f54f7dd9e5e62ec4cd5acb");
        } else {
            bVar = (com.sankuai.waimai.business.order.api.detail.model.b) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("poi_info")), (Class<Object>) com.sankuai.waimai.business.order.api.detail.model.b.class);
        }
        bVar9.j = bVar;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar10 = this.c;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b816e6a36dfad57d8012b5e85352d4ca", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.business.order.api.detail.model.a) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b816e6a36dfad57d8012b5e85352d4ca");
        } else {
            aVar = (com.sankuai.waimai.business.order.api.detail.model.a) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("order_common_info")), (Class<Object>) com.sankuai.waimai.business.order.api.detail.model.a.class);
        }
        bVar10.l = aVar;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar11 = this.c;
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ae1e7ac3c7083fa175a7a48d33fd5ec1", RobustBitConfig.DEFAULT_VALUE)) {
            nVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.n) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ae1e7ac3c7083fa175a7a48d33fd5ec1");
        } else {
            nVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.n) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("order_status_desc")), (Class<Object>) com.sankuai.waimai.bussiness.order.detailnew.network.response.n.class);
        }
        bVar11.m = nVar;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar12 = this.c;
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0e25807f864c7ea9111f21f3be3fd56a", RobustBitConfig.DEFAULT_VALUE)) {
            aVar2 = (com.sankuai.waimai.bussiness.order.detailnew.network.response.a) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0e25807f864c7ea9111f21f3be3fd56a");
        } else {
            aVar2 = (com.sankuai.waimai.bussiness.order.detailnew.network.response.a) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("address_modify_info")), (Class<Object>) com.sankuai.waimai.bussiness.order.detailnew.network.response.a.class);
        }
        bVar12.n = aVar2;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar13 = this.c;
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "7d0fdb717c661ba400478c0e3796d2e3", RobustBitConfig.DEFAULT_VALUE)) {
            oVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.o) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "7d0fdb717c661ba400478c0e3796d2e3");
        } else {
            oVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.o) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("rx_status_info_area")), (Class<Object>) com.sankuai.waimai.bussiness.order.detailnew.network.response.o.class);
        }
        bVar13.o = oVar;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar14 = this.c;
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = a;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "c53e275e56908b0a352a1ed22e295710", RobustBitConfig.DEFAULT_VALUE)) {
            orderExtInfo = (OrderExtInfo) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "c53e275e56908b0a352a1ed22e295710");
        } else {
            orderExtInfo = (OrderExtInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.f.get("order_ext_info")), (Class<Object>) OrderExtInfo.class);
        }
        bVar14.q = orderExtInfo;
        this.c.t = String.valueOf(this.g.get("biz_line"));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar15 = this.c;
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b.a;
        if (PatchProxy.isSupport(objArr10, bVar15, changeQuickRedirect10, false, "249bf01fcbeeb395927d295621736ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, bVar15, changeQuickRedirect10, false, "249bf01fcbeeb395927d295621736ac5");
        } else {
            bVar15.u = com.sankuai.waimai.bussiness.order.base.utils.i.a(bVar15.j, false);
            bVar15.v = com.sankuai.waimai.bussiness.order.base.utils.i.a(bVar15.k, false);
            bVar15.w = com.sankuai.waimai.bussiness.order.base.utils.i.a(bVar15.j, true);
            bVar15.x = com.sankuai.waimai.bussiness.order.base.utils.i.a(bVar15.k, true);
        }
        this.c.a(this.g, this.f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<n> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public OrderRocksServerModel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a3b7e6154c66dc48e8dccbec785002", RobustBitConfig.DEFAULT_VALUE)) {
                return (OrderRocksServerModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a3b7e6154c66dc48e8dccbec785002");
            }
            if (jsonElement == null || !jsonElement.isJsonObject()) {
                return null;
            }
            try {
                return OrderRocksServerModel.a(jsonElement);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        }
    }

    public static OrderRocksServerModel a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1eee3cb99b942212302d3f8ca406025", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderRocksServerModel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1eee3cb99b942212302d3f8ca406025");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        OrderRocksServerModel orderRocksServerModel = new OrderRocksServerModel();
        JsonElement jsonElement2 = asJsonObject.get("render_mode");
        if (jsonElement2 != null) {
            orderRocksServerModel.renderMode = jsonElement2.getAsString();
        }
        JsonElement jsonElement3 = asJsonObject.get("view_type");
        if (jsonElement3 != null) {
            orderRocksServerModel.viewType = jsonElement3.getAsString();
        }
        JsonElement jsonElement4 = asJsonObject.get("module_id");
        if (jsonElement4 != null) {
            orderRocksServerModel.moduleId = jsonElement4.getAsString();
        }
        JsonElement jsonElement5 = asJsonObject.get("layout_type");
        if (jsonElement5 != null) {
            orderRocksServerModel.layoutType = jsonElement5.getAsString();
        }
        JsonElement jsonElement6 = asJsonObject.get("layout_info");
        if (jsonElement6 != null) {
            orderRocksServerModel.layoutInfo = jsonElement6.getAsString().replace("margin_left", "padding_left").replace("margin_right", "padding_right");
        }
        JsonElement jsonElement7 = asJsonObject.get("data_type");
        if (jsonElement7 != null) {
            orderRocksServerModel.dataType = jsonElement7.getAsInt();
        }
        JsonElement jsonElement8 = asJsonObject.get("data_id");
        if (jsonElement8 != null) {
            orderRocksServerModel.dataId = jsonElement8.getAsString();
        }
        JsonElement jsonElement9 = asJsonObject.get("template_id");
        if (jsonElement9 != null) {
            orderRocksServerModel.templateId = jsonElement9.getAsString();
        }
        JsonElement jsonElement10 = asJsonObject.get("template_ph_id");
        if (jsonElement10 != null) {
            orderRocksServerModel.templatePhId = jsonElement10.getAsString();
        }
        JsonElement jsonElement11 = asJsonObject.get("lx_view_info");
        if (jsonElement11 != null) {
            orderRocksServerModel.lxViewInfo = jsonElement11.getAsString();
        }
        JsonElement jsonElement12 = asJsonObject.get("lx_click_info");
        if (jsonElement12 != null) {
            orderRocksServerModel.lxClickInfo = jsonElement12.getAsString();
        }
        JsonElement jsonElement13 = asJsonObject.get("ad_view_info");
        if (jsonElement13 != null) {
            orderRocksServerModel.adViewInfo = jsonElement13.getAsString();
        }
        JsonElement jsonElement14 = asJsonObject.get("ad_click_info");
        if (jsonElement14 != null) {
            orderRocksServerModel.adClickInfo = jsonElement14.getAsString();
        }
        JsonElement jsonElement15 = asJsonObject.get("action");
        if (jsonElement15 != null) {
            orderRocksServerModel.action = jsonElement15.getAsString();
        }
        JsonElement jsonElement16 = asJsonObject.get("is_loading");
        if (jsonElement16 != null) {
            orderRocksServerModel.isLoading = jsonElement16.getAsString();
        }
        JsonElement jsonElement17 = asJsonObject.get("is_Main_url");
        if (jsonElement17 != null) {
            orderRocksServerModel.isMainUrl = jsonElement17.getAsString();
        }
        JsonElement jsonElement18 = asJsonObject.get("string_data");
        if (jsonElement18 != null) {
            orderRocksServerModel.stringData = jsonElement18.getAsString();
        }
        JsonElement jsonElement19 = asJsonObject.get("json_data");
        if (jsonElement19 != null) {
            orderRocksServerModel.jsonData = com.sankuai.waimai.mach.utils.b.a(jsonElement19.toString());
        }
        JsonElement jsonElement20 = asJsonObject.get("global_data");
        if (jsonElement20 != null) {
            orderRocksServerModel.f = com.sankuai.waimai.mach.utils.b.a(jsonElement20.toString());
        }
        JsonElement jsonElement21 = asJsonObject.get("module_list");
        if (jsonElement21 != null && jsonElement21.isJsonArray()) {
            JsonArray asJsonArray = jsonElement21.getAsJsonArray();
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            orderRocksServerModel.moduleList = arrayList;
        }
        JsonElement jsonElement22 = asJsonObject.get("module_list_header");
        if (jsonElement22 != null) {
            orderRocksServerModel.module_list_header = a(jsonElement22);
        }
        JsonElement jsonElement23 = asJsonObject.get("module_header");
        if (jsonElement23 != null) {
            orderRocksServerModel.moduleHeader = a(jsonElement23);
        }
        JsonElement jsonElement24 = asJsonObject.get("page");
        if (jsonElement24 != null) {
            orderRocksServerModel.h = com.sankuai.waimai.mach.utils.b.a(jsonElement24.toString());
        }
        return orderRocksServerModel;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df6a7409dfe375e417891a36243349c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df6a7409dfe375e417891a36243349c")).booleanValue();
        }
        for (RocksServerModel rocksServerModel : this.moduleList) {
            if (TextUtils.equals(rocksServerModel.moduleId, "wm_order_status_feed_flow")) {
                return true;
            }
        }
        return false;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36656b12f2f139be9bf0614775b0ca0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36656b12f2f139be9bf0614775b0ca0d")).intValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(this.layoutInfo);
            return jSONObject.optInt("padding_left", 0) + jSONObject.optInt("margin_left", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dba495e2e6b845420ba336fc86445c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dba495e2e6b845420ba336fc86445c9");
            return;
        }
        try {
            this.d = new JSONObject(this.layoutInfo).optInt("vertical_space", 0);
        } catch (Exception unused) {
        }
    }
}
