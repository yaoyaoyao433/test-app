package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.support.constraint.R;
import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapUtils;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.waimai.business.order.api.submit.model.BusinessType;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.m;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public m b;
    private Context c;
    private long d;
    private String e;
    private com.sankuai.waimai.bussiness.order.confirm.a f;
    private int g;

    public j(Context context, long j, String str, m mVar, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {context, new Long(j), str, mVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a2c541f3fa6c0a4c58dccae14b2f72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a2c541f3fa6c0a4c58dccae14b2f72");
            return;
        }
        this.c = context;
        this.d = j;
        this.e = str;
        this.b = mVar;
        this.f = aVar;
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6e87cf9aa5b1f530b5e0052b3e0f57", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6e87cf9aa5b1f530b5e0052b3e0f57")).booleanValue() : this.b == null || this.b.moduleList == null || this.b.moduleList.isEmpty();
    }

    @WorkerThread
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87360c355bf0bb5c2eba1c84fc8f68f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87360c355bf0bb5c2eba1c84fc8f68f4");
        } else if (b()) {
        } else {
            try {
                c();
                a(this.b.moduleList);
            } catch (Exception e) {
                com.sankuai.waimai.imbase.log.a.a(e);
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8154e9a0637dc1e1ddfd85875e05fe8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8154e9a0637dc1e1ddfd85875e05fe8a");
            return;
        }
        this.b.b.put("poi_id", Long.valueOf(this.d));
        if (aa.a(this.e)) {
            String valueOf = String.valueOf(this.b.b.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
            if (!aa.a(valueOf)) {
                this.e = valueOf;
            }
        }
        com.sankuai.waimai.platform.domain.core.poi.b.a(this.d, this.e);
    }

    private void a(List<RocksServerModel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0477ef62c0536f80ed1070552111f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0477ef62c0536f80ed1070552111f12");
        } else if (list != null && !list.isEmpty()) {
            Iterator<RocksServerModel> it = list.iterator();
            while (it.hasNext()) {
                RocksServerModel next = it.next();
                if (TextUtils.isEmpty(next.templateId)) {
                    next.templateId = next.moduleId;
                }
                Map<String, Object> b = b(next);
                if (b.containsKey("request_params")) {
                    for (Map.Entry entry : ((Map) b.get("request_params")).entrySet()) {
                        d.b(false, false, (String) entry.getKey(), entry.getValue());
                    }
                }
                b.putAll(this.b.b);
                a(b);
                if (a(next)) {
                    it.remove();
                }
                a(next.moduleList);
                if (TextUtils.equals("wm_confirm_order_mt_delivery", next.moduleId)) {
                    b(b);
                }
                if (TextUtils.equals("wm_confirm_order_self_delivery", next.moduleId)) {
                    c(b);
                }
                if (TextUtils.equals("wm_confirm_order_quick_payment", next.moduleId)) {
                    d(b);
                }
                if (TextUtils.equals("wm_confirm_order_food_flower_cake", next.moduleId)) {
                    this.g = r.a(String.valueOf(b.get("template_type")), 0);
                    if (this.g == 1 || this.g == 2) {
                        d.a("template_type", Integer.valueOf(this.g));
                    }
                }
                if (TextUtils.equals("wm_confirm_order_food_list_info_mach", next.moduleId)) {
                    e(b);
                }
                if (TextUtils.equals("wm_confirm_order_service_guarantee", next.moduleId)) {
                    a(b, this.b.b);
                }
                if (TextUtils.equals("wm_confirm_order_extend_information_mach", next.moduleId)) {
                    f(b);
                }
            }
        }
    }

    private boolean a(RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acdc739116be47ea1728e4cb9809a3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acdc739116be47ea1728e4cb9809a3b")).booleanValue();
        }
        if (this.b.c == null) {
            this.b.c = new ArrayList();
        }
        if (l.a.contains(rocksServerModel.moduleId)) {
            this.b.c.add(new m.a(rocksServerModel.moduleId, rocksServerModel.jsonData));
            return true;
        }
        return false;
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723a9db5595a32f2b87e6c98719be2eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723a9db5595a32f2b87e6c98719be2eb");
        } else if (a.b == null || a.b.isEmpty()) {
        } else {
            map.put("machState", a.b);
        }
    }

    private Map<String, Object> b(RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80188506fca6d3455e358a16d5851ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80188506fca6d3455e358a16d5851ea5");
        }
        if (rocksServerModel.jsonData == null) {
            rocksServerModel.jsonData = new HashMap();
        }
        return rocksServerModel.jsonData;
    }

    private void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2bd0efd6a7c176b0b16b87c27118d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2bd0efd6a7c176b0b16b87c27118d7b");
            return;
        }
        Map hashMap = map.get("address_info") != null ? (Map) map.get("address_info") : new HashMap();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashMap.get(Constants.PRIVACY.KEY_LONGITUDE));
        sb.append(r.a(sb2.toString(), 0));
        sb.append(CommonConstant.Symbol.COLON);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(hashMap.get(Constants.PRIVACY.KEY_LATITUDE));
        sb.append(r.a(sb3.toString(), 0));
        map.put("cabinetCloseCount", Integer.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, sb.toString(), 0)));
        int j = com.sankuai.waimai.platform.b.A().j();
        if (j > com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.OLD_VERSION, 0)) {
            com.sankuai.waimai.platform.utils.sharedpreference.a.a().b(PlatformSPKeys.WM_ORDER_CONFIRM_LABEL_COUNT);
            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.OLD_VERSION, j);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(hashMap.get("id"));
        map.put("labelCloseCount", Integer.valueOf(com.sankuai.waimai.platform.utils.sharedpreference.a.a(r.a(sb4.toString(), 0L), 0)));
        map.put("localState", d.c.get("localState"));
        String str = "";
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        if (b != null) {
            String k = b.k();
            String l = b.l();
            if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
                str = k + CommonConstant.Symbol.MINUS + l + "-1";
            }
        }
        WmAddress k2 = com.sankuai.waimai.foundation.location.v2.g.a().k();
        String address = k2 != null ? k2.getAddress() : null;
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        if (p != null) {
            map.put("user_latitude", Long.valueOf((long) (p.getLatitude() * 1000000.0d)));
            map.put("user_longitude", Long.valueOf((long) (p.getLongitude() * 1000000.0d)));
        }
        map.put("biz_page", str);
        map.put("user_locate_address", address);
        map.put("order_confirm_mach_alert", Boolean.valueOf(com.sankuai.waimai.platform.capacity.abtest.b.b(this.c)));
    }

    private void c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14816eff49af63fec3eda5c562666dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14816eff49af63fec3eda5c562666dae");
            return;
        }
        map.put("isPreviewOrderResp", this.f.au.a());
        Map hashMap = map.get("address_info") != null ? (Map) map.get("address_info") : new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(hashMap.get(Constants.PRIVACY.KEY_LATITUDE));
        int a2 = r.a(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashMap.get(Constants.PRIVACY.KEY_LONGITUDE));
        map.put("poiDistance", a(a2 / 1000000.0d, r.a(sb2.toString(), 0) / 1000000.0d));
        map.put("localState", d.c.get("localState"));
    }

    private String a(double d, double d2) {
        double d3;
        double d4;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f7f5c0b7e04768835f8c38bb5c4d7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f7f5c0b7e04768835f8c38bb5c4d7c");
        }
        double[] h = com.sankuai.waimai.foundation.location.g.h();
        if (h != null) {
            d3 = h[0];
            d4 = h[1];
        } else {
            d3 = 0.0d;
            d4 = 0.0d;
        }
        if (Double.compare(d3, 0.0d) == 0 || Double.compare(d4, 0.0d) == 0) {
            return null;
        }
        float calculateLineDistance = MapUtils.calculateLineDistance(new LatLng(d3, d4), new LatLng(d, d2)) * 1.4f;
        float f = calculateLineDistance > 1000.0f ? calculateLineDistance / 1000.0f : -1.0f;
        if (f >= 100.0f) {
            return com.meituan.android.singleton.b.a.getString(R.string.wm_common_self_delivery_distance_far);
        }
        if (f > 0.0f) {
            return com.meituan.android.singleton.b.a.getString(R.string.wm_common_self_delivery_distance_km, Float.valueOf(f));
        }
        return com.meituan.android.singleton.b.a.getString(R.string.wm_common_self_delivery_distance_m, Integer.valueOf((int) calculateLineDistance));
    }

    private void d(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2a7c3d555ff68022a3d90ee54bb5e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2a7c3d555ff68022a3d90ee54bb5e0");
        } else {
            map.put("payment_type", Integer.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "wm_order_quick_pay_type", 0)));
        }
    }

    private void e(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9c5df0761ae17f6add821f183fc53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9c5df0761ae17f6add821f183fc53d");
            return;
        }
        int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "pref_show", 0);
        String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "pref_portal", "");
        String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "pref_url", "");
        map.put("pref_show", Integer.valueOf(b));
        map.put("pref_title", b2);
        map.put("pref_url", b3);
        Map<String, Object> b4 = this.b.b("wm_confirm_order_wm_card");
        if (!b4.isEmpty()) {
            map.put("mach_template_map", com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(b4));
        }
        String obj = this.b.b.get("biz_client_data_map") != null ? this.b.b.get("biz_client_data_map").toString() : null;
        if (!TextUtils.isEmpty(obj)) {
            map.put("biz_client_data_map", obj);
            try {
                JSONObject jSONObject = new JSONObject(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(this.b.b.get("biz_client_data_map")));
                if (jSONObject.optJSONObject("member_tied") != null) {
                    map.put("cate_id", Integer.valueOf(com.sankuai.waimai.bussiness.order.confirm.model.b.a(jSONObject.optJSONObject("member_tied")).k == 31 ? 2 : 1));
                }
            } catch (Exception unused) {
            }
        }
        Map hashMap = map.get("poi_coupon_ap_param") != null ? (Map) map.get("poi_coupon_ap_param") : new HashMap();
        Map hashMap2 = new HashMap();
        if (hashMap != null && hashMap.get("wm-submit-order-poi-coupon-package-detail") != null) {
            hashMap2 = com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(hashMap.get("wm-submit-order-poi-coupon-package-detail")));
        } else if (hashMap != null && hashMap.get("wm-submit-order-poi-coupon-guide") != null) {
            hashMap2 = com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(hashMap.get("wm-submit-order-poi-coupon-guide")));
        }
        if (hashMap2.isEmpty()) {
            return;
        }
        try {
            String valueOf = String.valueOf(new JSONObject(String.valueOf(hashMap2.get("model_data"))).opt("string_data"));
            map.put("vp_sku_id", b(valueOf));
            JSONObject jSONObject2 = new JSONObject(valueOf);
            map.put("guide_title", jSONObject2.opt("biz_title"));
            map.put("product_common_desc", jSONObject2.opt("product_common_desc"));
            map.put("biz_show_price", jSONObject2.opt("biz_show_price"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String b(String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469f6f7466d2f5353a7af4c84778cf0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469f6f7466d2f5353a7af4c84778cf0f");
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("products");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.optJSONObject(i) != null) {
                            if (!TextUtils.isEmpty(str2)) {
                                str2 = str2 + CommonConstant.Symbol.COMMA;
                            }
                            str2 = str2 + optJSONObject.optString("product_id");
                        }
                    }
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return str2;
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09301e66d85369c462103a1de34d5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09301e66d85369c462103a1de34d5af");
            return;
        }
        if (map.containsKey("food_insurance")) {
            d.b(false, false, "has_food_safety_insurance", 1);
        }
        map.put("token", String.valueOf(map2.get("token")));
        List arrayList = map2.get("business_type_list") != null ? (List) map2.get("business_type_list") : new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add((BusinessType) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(arrayList.get(i)), (Class<Object>) BusinessType.class));
        }
        map.put("businessType", Integer.valueOf(c(arrayList2)));
        map.put("hasShowNewTag", Boolean.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_confirm_privacy_show_new_first", false)));
    }

    private BusinessType b(List<BusinessType> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef256472a990c8765068a2f69ed9295", RobustBitConfig.DEFAULT_VALUE)) {
            return (BusinessType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef256472a990c8765068a2f69ed9295");
        }
        if (list != null) {
            if (list.size() == 1) {
                return list.get(0);
            }
            for (BusinessType businessType : list) {
                if (businessType.selected == 1) {
                    return businessType;
                }
            }
            return null;
        }
        return null;
    }

    private int c(List<BusinessType> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f464dc3c926a03baed18c5826414fd91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f464dc3c926a03baed18c5826414fd91")).intValue();
        }
        BusinessType b = b(list);
        if (b != null) {
            return b.type;
        }
        return -1;
    }

    private void f(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07810ba1942717f0fe2f78c556839c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07810ba1942717f0fe2f78c556839c17");
            return;
        }
        g(map);
        com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c h = h(map);
        int i = h.h;
        Invoice b = h.b();
        if (!a(b)) {
            b = com.sankuai.waimai.bussiness.order.confirm.cache.a.a().b("");
            if (a(b) && i == 1) {
                map.put("invoice_title", b.getTitle());
                map.put("invoice_type", Integer.valueOf(b.getInvoiceType()));
                map.put("taxpayer_id_number", b.getTaxpayerId());
                d.b(false, false, "invoice_title", b.getTitle());
                d.b(false, false, "invoice_type", Integer.valueOf(b.getInvoiceType()));
                d.b(false, false, "taxpayer_id_number", b.getTaxpayerId());
            }
        }
        if (!a(b) || TextUtils.isEmpty(b.getTitle())) {
            com.sankuai.waimai.bussiness.order.confirm.cache.a.a().c(this.e);
        }
        map.put("recipient_notes", a(this.e));
        map.put("select_dinner_count", Integer.valueOf(g()));
        map.put("select_dinner_code", Integer.valueOf(h()));
        map.put("use_default_tableware_tip", Boolean.valueOf(i()));
        map.put("hasShown", Boolean.valueOf(e()));
        map.put("inDifferentDay", Boolean.valueOf(d()));
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879f33e9879f2bb3a52c50e186ce075c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879f33e9879f2bb3a52c50e186ce075c")).booleanValue();
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_confirm_tableware_switch_bubble", (String) null);
        return b == null || !b.equals(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()));
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c987b4aa07e168d5af20648f87140d7b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c987b4aa07e168d5af20648f87140d7b")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_confirm_tableware_settings_tip", false);
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16ed7473a4b9aa87b784cdf19898b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16ed7473a4b9aa87b784cdf19898b6b");
        }
        String f = f();
        return aa.a(f) ? com.sankuai.waimai.bussiness.order.confirm.cache.a.a().a(str) : f;
    }

    private int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04a56e2cda2949853e45b1c0bc8c2ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04a56e2cda2949853e45b1c0bc8c2ec")).intValue();
        }
        int a2 = r.a(String.valueOf(d.c.get("choose_diners_count")), 0);
        if (a2 == Integer.MIN_VALUE) {
            return 0;
        }
        return a2;
    }

    private int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb42e2738e7c587cc3291f43683d1474", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb42e2738e7c587cc3291f43683d1474")).intValue();
        }
        int a2 = r.a(String.valueOf(d.c.get("choose_diners_code")), 0);
        if (a2 == Integer.MIN_VALUE) {
            return 0;
        }
        return a2;
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df1d7199035579fdfe6ff151a562a98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df1d7199035579fdfe6ff151a562a98")).booleanValue();
        }
        if (d.c.containsKey("use_default_tableware_tip")) {
            return ((Boolean) d.c.get("use_default_tableware_tip")).booleanValue();
        }
        return false;
    }

    private void g(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "292ce60e0cd7c629069eb9dfadcf47c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "292ce60e0cd7c629069eb9dfadcf47c7");
            return;
        }
        SubmitOrderManager submitOrderManager = SubmitOrderManager.getInstance();
        String invoiceTitle = submitOrderManager.getInvoiceTitle();
        int invoiceType = submitOrderManager.getInvoiceType();
        String taxPayerId = submitOrderManager.getTaxPayerId();
        HashMap<Long, String> invoiceMap = submitOrderManager.getInvoiceMap();
        if (map != null && !TextUtils.isEmpty(invoiceTitle) && invoiceMap != null && invoiceMap.containsKey(Long.valueOf(this.d))) {
            map.put("invoice_title", invoiceTitle);
            map.put("invoice_type", Integer.valueOf(invoiceType));
            map.put("taxpayer_id_number", taxPayerId);
            d.b(false, false, "invoice_title", invoiceTitle);
            d.b(false, false, "invoice_type", Integer.valueOf(invoiceType));
            d.b(false, false, "taxpayer_id_number", taxPayerId);
        }
        submitOrderManager.setInvoiceType(0);
        submitOrderManager.setTaxPayerId(null);
        submitOrderManager.setInvoiceTitle(null);
        submitOrderManager.setInvoice(null);
    }

    private com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c h(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5c87761c01e92599d1ecec5a955699", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5c87761c01e92599d1ecec5a955699");
        }
        com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c cVar = new com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c();
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.get("has_invoice"));
            cVar.g = r.a(sb.toString(), 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(map.get("invoice_support"));
            cVar.h = r.a(sb2.toString(), 0);
            cVar.f = String.valueOf(map.get("invoice_text"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(map.get("min_invoice_price"));
            cVar.j = r.a(sb3.toString(), 0.0d);
            cVar.e = map.containsKey("invoice_show") ? ((Boolean) map.get("invoice_show")).booleanValue() : false;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(map.get("invoice_type"));
            cVar.l = r.a(sb4.toString(), 0);
            cVar.m = String.valueOf(map.get("taxpayer_id_number"));
            cVar.n = String.valueOf(map.get("invoice_title"));
            cVar.o = String.valueOf(map.get("invoice_link"));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(map.get("invoice_make_type"));
            cVar.p = r.a(sb5.toString(), 0);
        } else {
            cVar.g = 0;
            cVar.h = 0;
            cVar.f = "";
            cVar.j = 0.0d;
            cVar.e = false;
            cVar.l = -1;
            cVar.m = "";
            cVar.n = "";
            cVar.o = "";
            cVar.p = 0;
        }
        return cVar;
    }

    private boolean a(Invoice invoice) {
        Object[] objArr = {invoice};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7053e99382797cb5ed3e0707c43eb0b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7053e99382797cb5ed3e0707c43eb0b4")).booleanValue() : (invoice == null || TextUtils.isEmpty(invoice.getTitle())) ? false : true;
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada640562129790f8717a2cdaebef94c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada640562129790f8717a2cdaebef94c");
        }
        String sharedValue = StorageUtil.getSharedValue(com.meituan.android.singleton.b.a, "netbar_address_info");
        if (aa.a(sharedValue)) {
            return null;
        }
        try {
            return new JSONObject(sharedValue).optString("remark");
        } catch (JSONException unused) {
            return null;
        }
    }
}
