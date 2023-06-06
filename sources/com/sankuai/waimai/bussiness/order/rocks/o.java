package com.sankuai.waimai.bussiness.order.rocks;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OperationSPKeys;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private static final String[] f = {"poi_label_list", "show_phone_list", "phone_list", "rights", "has_comment", "is_comment", "comment", "status", "buz_code", "can_additional_comment", "mt_delivery_info", "courier_name", "courier_icon", "courier_page_url", "source_order_code", "diners_icon", "button_list", "complaint_entry", "service_page_url", "plat_from", "insurance", "poi_im_info", "speed_refund_info", "wm_comment_id", "comment_star", "has_comment_del", "user_visible"};
    public Map<String, Object> b;
    public OrderRocksServerModel c;
    public String d;
    public int e;

    @WorkerThread
    public o(Map<String, Object> map, OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {map, orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce6e164a4713bf6a22b599ab87ca1a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce6e164a4713bf6a22b599ab87ca1a6");
            return;
        }
        this.b = map;
        this.c = orderRocksServerModel;
        c();
    }

    public o(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c43b94556e0a00fc373b5bd74f4258c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c43b94556e0a00fc373b5bd74f4258c6");
            return;
        }
        this.e = i;
        this.d = str;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b996a51ac3f018d5d02fed1bbd1d0ba2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b996a51ac3f018d5d02fed1bbd1d0ba2")).booleanValue() : TextUtils.equals(str, "order_status_operatearea_group") || TextUtils.equals(str, "order_status_food_info_group") || TextUtils.equals(str, "order_status_delivery_info_group");
    }

    public final int a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6e3a7eaaa3420af1c0b04f9d0f024c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6e3a7eaaa3420af1c0b04f9d0f024c1")).intValue();
        }
        for (RocksServerModel rocksServerModel : this.c.moduleList) {
            if (a(rocksServerModel.moduleId)) {
                i++;
            }
        }
        return i;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e786f2f84e7d9a45c9557f88ae967f44", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e786f2f84e7d9a45c9557f88ae967f44")).booleanValue() : this.b == null || this.b.isEmpty() || this.c == null || this.c.moduleList == null || this.c.moduleList.isEmpty();
    }

    @WorkerThread
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854c5d05f7c159f1b8d1a4d948c6aaa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854c5d05f7c159f1b8d1a4d948c6aaa5");
        } else if (b()) {
        } else {
            try {
                e();
                this.c.g = this.b;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("orderH5Env", com.sankuai.waimai.platform.capacity.abtest.f.b());
                hashMap2.put("applyrefund", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_applyrefund_android") ? 1 : 0));
                hashMap2.put("cancelReason", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_cancel_reason_android") ? 1 : 0));
                hashMap2.put("editPhone", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_edit_phone_android") ? 1 : 0));
                hashMap2.put("editinfo", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_editinfo_android") ? 1 : 0));
                hashMap2.put("payByAnother", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_pay_by_friend_android") ? 1 : 0));
                hashMap2.put("modifyAddress", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_mmp_modify_address_android") ? 1 : 0));
                hashMap2.put("refundstatus", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_refundstatus_android") ? 1 : 0));
                hashMap2.put("remark", Integer.valueOf(com.sankuai.waimai.platform.capacity.abtest.f.a(com.meituan.android.singleton.b.a, "order_h5_remark_android") ? 1 : 0));
                hashMap.put("strategy", hashMap2);
                this.c.g.put("orderH5Strategy", hashMap);
                this.c.a();
                f();
                d();
                a(this.c.moduleList);
                g();
                this.c.d();
            } catch (Exception e) {
                com.sankuai.waimai.imbase.log.a.a(e);
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a27660b6645833a12459e4b657fbcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a27660b6645833a12459e4b657fbcd");
            return;
        }
        String str = com.dianping.mainboard.a.b().h;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.b.put("push_token", str);
    }

    private void a(List<RocksServerModel> list) {
        Map<String, Object> map;
        boolean z;
        int i = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da61c6762073bd57582ccfccd2b18344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da61c6762073bd57582ccfccd2b18344");
        } else if (list == null || list.isEmpty()) {
        } else {
            Iterator<RocksServerModel> it = list.iterator();
            while (it.hasNext()) {
                RocksServerModel next = it.next();
                if (TextUtils.isEmpty(next.templateId)) {
                    next.templateId = next.moduleId;
                }
                Object[] objArr2 = new Object[i];
                objArr2[0] = next;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c9f860b2073a41130a28208e6b4352d", RobustBitConfig.DEFAULT_VALUE)) {
                    map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c9f860b2073a41130a28208e6b4352d");
                } else {
                    if (next.jsonData == null) {
                        next.jsonData = new HashMap();
                    }
                    map = next.jsonData;
                }
                Map<String, Object> map2 = map;
                map2.putAll(this.b);
                map2.putAll(this.c.f);
                Object[] objArr3 = new Object[i];
                objArr3[0] = map2;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bc8bc45e1db3309b1321448bac64f77e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bc8bc45e1db3309b1321448bac64f77e");
                } else if (com.sankuai.waimai.bussiness.order.base.mach.c.b != null && !com.sankuai.waimai.bussiness.order.base.mach.c.b.isEmpty()) {
                    map2.put("machState", com.sankuai.waimai.bussiness.order.base.mach.c.b);
                }
                Object[] objArr4 = new Object[i];
                objArr4[0] = next;
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "455908072b38d81acfc552835fa0f745", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "455908072b38d81acfc552835fa0f745")).booleanValue();
                } else {
                    if (this.c.b == null) {
                        this.c.b = new ArrayList();
                    }
                    if (!m.a.contains(next.moduleId) || TextUtils.equals(next.renderMode, "mach")) {
                        z = false;
                    } else {
                        this.c.b.add(new OrderRocksServerModel.a(next.moduleId, next.jsonData));
                        z = true;
                    }
                }
                if (z) {
                    it.remove();
                }
                a(next.moduleList);
                if (TextUtils.equals("wm_order_status_operatearea_buttonlist", next.moduleId)) {
                    Object[] objArr5 = new Object[i];
                    objArr5[0] = map2;
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "df6c6a712976d4ae326bc370b5f8300a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "df6c6a712976d4ae326bc370b5f8300a");
                    } else {
                        map2.put("unread_count", com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b);
                    }
                }
                if (TextUtils.equals("wm_order_status_operatearea_bottomarea", next.moduleId)) {
                    Object[] objArr6 = new Object[i];
                    objArr6[0] = map2;
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1378fb4c9515ffcfc92aa50aaae20609", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1378fb4c9515ffcfc92aa50aaae20609");
                    } else {
                        map2.put("pushOpenStatus", Integer.valueOf(com.sankuai.waimai.platform.utils.i.a(com.meituan.android.singleton.b.a) ? 1 : 0));
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        map2.put("closePushTimeMargin", Integer.valueOf(PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9a6e62877de19b12e033eca0b98ffe7f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9a6e62877de19b12e033eca0b98ffe7f")).intValue() : (int) ((System.currentTimeMillis() - new com.sankuai.waimai.foundation.utils.e("order_detail_status_operation_file_name").b((com.sankuai.waimai.foundation.utils.e) OperationSPKeys.NOTIFICATION_SWITCH, 0L)) / 1000)));
                    }
                }
                if (TextUtils.equals("wm_order_status_food_info", next.moduleId)) {
                    Object[] objArr8 = {map2};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "736b6142cacd757e10b0d17c79662c92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "736b6142cacd757e10b0d17c79662c92");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(map2.remove("wm_poi_valid"));
                        map2.put("wm_poi_valid", Boolean.valueOf(r.a(sb.toString(), 0) == 1));
                    }
                }
                if (TextUtils.equals("wm_order_status_im_info_food_info", next.moduleId)) {
                    Object[] objArr9 = {map2};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "38e05911954840773566491eb293fbf0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "38e05911954840773566491eb293fbf0");
                    } else {
                        a(map2);
                        map2.remove("rider_info");
                    }
                }
                if (TextUtils.equals("wm_order_status_im_info_delivery_info", next.moduleId)) {
                    i = 1;
                    Object[] objArr10 = {map2};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "7cb31919795910c75d699469a9855aa3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "7cb31919795910c75d699469a9855aa3");
                    } else {
                        a(map2);
                        map2.remove("poi_info");
                    }
                } else {
                    i = 1;
                }
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf19bbf21e39089df0f9a08b234779d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf19bbf21e39089df0f9a08b234779d");
        } else if (this.b != null) {
            for (String str : f) {
                this.b.remove(str);
            }
        }
    }

    private void f() {
        Map map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecbd77edeefdbe3ef7d4abcf823ef6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecbd77edeefdbe3ef7d4abcf823ef6ab");
            return;
        }
        this.b.put(Constants.EventConstants.KEY_ORDER_ID, String.valueOf(this.b.get("id")));
        this.b.put("poiId", this.b.get("wm_poi_id"));
        String valueOf = String.valueOf(this.b.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (aa.a(valueOf)) {
            valueOf = "";
        }
        this.b.put(FoodDetailNetWorkPreLoader.URI_POI_STR, valueOf);
        this.b.put("businessType", this.b.get("business_type"));
        Map<String, Object> map2 = this.c.f;
        Map map3 = (Map) map2.get("order_common_info");
        if (map3 != null) {
            map2.put("orderStatus", map3.get("order_status"));
            map2.put("statusCode", map3.get("status_code"));
            map2.put("deliveryType", map3.get("delivery_type"));
            map2.put("actualDeliveryType", map3.get("actual_delivery_type"));
            map2.put("bizType", map3.get("biz_type"));
            map2.put("orderedTime", map3.get("order_time"));
            map2.put("deliveryTime", map3.get("delivery_time"));
        }
        Map map4 = (Map) map2.get("order_status_desc");
        if (map4 != null && (map = (Map) map4.get("time_detail")) != null) {
            map2.put("formatted_time", map.get("formatted_time"));
            map2.put("time", map.get("time"));
        }
        Map map5 = (Map) map2.get("poi_info");
        if (map5 != null) {
            map2.put("cityId", map5.get(DataConstants.CITY_ID));
        }
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be038d21a0664f3f0a2da421c0e3306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be038d21a0664f3f0a2da421c0e3306");
        } else {
            map.put("unread_count", com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5a1b0ced988dabfcb793bf1985f10d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5a1b0ced988dabfcb793bf1985f10d0");
        } else if (this.c.b()) {
        } else {
            this.c.h();
        }
    }
}
