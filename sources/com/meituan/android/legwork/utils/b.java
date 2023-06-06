package com.meituan.android.legwork.utils;

import android.text.TextUtils;
import com.meituan.android.legwork.bean.monitor.ABTestParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "a";
    public static String c = "100";
    private static final String h = "a";
    private static final String i = "b";
    private static b j;
    public Map<String, String> d;
    public ABTestParams e;
    @Nonnull
    public Map<String, String> f;
    public String g;
    private Map<String, String> k;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97fb50de18e2a8a08eca0e0f52c7c435", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97fb50de18e2a8a08eca0e0f52c7c435");
            return;
        }
        this.k = new HashMap();
        this.f = new HashMap();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f840d9682ac796da2f6d533caff2010e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f840d9682ac796da2f6d533caff2010e");
        }
        synchronized (b.class) {
            if (j == null) {
                j = new b();
            }
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Map<String, String> map) {
        char c2;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5217b3637f8728a3e5da3dfb6b37e64c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5217b3637f8728a3e5da3dfb6b37e64c");
            return;
        }
        this.k.clear();
        if (map == null) {
            return;
        }
        this.d = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                switch (key.hashCode()) {
                    case -1946953201:
                        if (key.equals("business_order")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1934894068:
                        if (key.equals("native_search_aoi")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1928964187:
                        if (key.equals("recognition_address_gif_native")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1638113447:
                        if (key.equals("native_search_poi_distance")) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1494243078:
                        if (key.equals("map_sdk_test")) {
                            c2 = 20;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1483405110:
                        if (key.equals("addresspage_autorecognition_native")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1354545615:
                        if (key.equals("address_recommend")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1178804849:
                        if (key.equals("native_backFromPay")) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1143518955:
                        if (key.equals("processing_order_entry")) {
                            c2 = 17;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1143108589:
                        if (key.equals("map_degrade")) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -462741609:
                        if (key.equals("address_page_map")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -336082145:
                        if (key.equals("recognition_address_pic_native")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -833584:
                        if (key.equals("urge_grab")) {
                            c2 = 18;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 401236926:
                        if (key.equals("searchaddresspage_addressorder")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 528904073:
                        if (key.equals("modify_order")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 856564495:
                        if (key.equals("buy_preview")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 977250403:
                        if (key.equals("home_page_opt")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1181521501:
                        if (key.equals("goods_code_switch")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1647875834:
                        if (key.equals("insurance_desc_redesign")) {
                            c2 = 19;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1970638071:
                        if (key.equals("certification_test")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1972897710:
                        if (key.equals("order_share")) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        this.d.put("ab_a_111_paotui_orderpage", "b");
                        continue;
                    case 1:
                        this.d.put("ab_a_201_paotui_orderpage_addsuggest", TextUtils.equals("202", entry.getValue()) ? i : h);
                        continue;
                    case 2:
                        this.d.put("business_order", TextUtils.equals("302", entry.getValue()) ? i : h);
                        continue;
                    case 3:
                        this.d.put("searchaddresspage_addressorder", entry.getValue());
                        continue;
                    case 4:
                        this.d.put("home_page_opt", entry.getValue());
                        continue;
                    case 5:
                        this.d.put("address_page_map", entry.getValue());
                        continue;
                    case 6:
                        this.d.put("addresspage_autorecognition_native", entry.getValue());
                        continue;
                    case 7:
                        this.d.put("recognition_address_gif_native", entry.getValue());
                        continue;
                    case '\b':
                        this.d.put("recognition_address_pic_native", entry.getValue());
                        continue;
                    case '\t':
                        this.d.put("modify_order", entry.getValue());
                        continue;
                    case '\n':
                        this.d.put("certification_test", entry.getValue());
                        continue;
                    case 11:
                        this.d.put("goods_code_switch", entry.getValue());
                        continue;
                    case '\f':
                        this.d.put("native_search_aoi", entry.getValue());
                        continue;
                    case '\r':
                        this.d.put("order_share", entry.getValue());
                        continue;
                    case 14:
                        this.d.put("map_degrade", entry.getValue());
                        continue;
                    case 15:
                        this.d.put("native_backFromPay", entry.getValue());
                        continue;
                    case 16:
                        this.d.put("native_search_poi_distance", entry.getValue());
                        continue;
                    case 17:
                        this.d.put("processing_order_entry", entry.getValue());
                        continue;
                    case 18:
                        this.d.put("urge_grab", entry.getValue());
                        continue;
                    case 19:
                        this.d.put("insurance_desc_redesign", entry.getValue());
                        continue;
                    case 20:
                        this.d.put("map_sdk_test", entry.getValue());
                        z.a(com.meituan.android.legwork.a.a(), "use_map_type", entry.getValue());
                        continue;
                    default:
                        this.k.put(entry.getKey(), entry.getValue());
                        this.d.put(entry.getKey(), entry.getValue());
                        continue;
                }
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eeb7ea35dd6736a61c143d03f725962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eeb7ea35dd6736a61c143d03f725962");
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("strategy", TextUtils.equals(this.g, "a") ? "a" : "b");
                jSONObject.put("ab_a_101_paotui_homepage", jSONObject2);
            } catch (JSONException e) {
                x.e("ABTestUtil.generateAbTestReport()", "exception msg:", e);
                x.a(e);
            }
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    String value = entry.getValue();
                    if (TextUtils.isEmpty(value)) {
                        value = h;
                    }
                    jSONObject3.put("strategy", value);
                    jSONObject.put(entry.getKey(), jSONObject3);
                } catch (JSONException e2) {
                    x.e("ABTestUtil.generateAbTestReport()", "exception2 msg:", e2);
                    x.a(e2);
                }
            }
            if (this.d == null) {
                return;
            }
            for (Map.Entry<String, String> entry2 : this.d.entrySet()) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("strategy", TextUtils.isEmpty(entry2.getValue()) ? h : entry2.getValue());
                    jSONObject.put(entry2.getKey(), jSONObject4);
                } catch (JSONException e3) {
                    x.e("ABTestUtil.generateAbTestReport()", "exception3 msg:", e3);
                    x.a(e3);
                }
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f241612b3edac228ce308296ae6e85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f241612b3edac228ce308296ae6e85")).booleanValue();
        }
        if (this.d == null || !this.d.containsKey("map_degrade")) {
            return false;
        }
        return "b".equalsIgnoreCase(this.d.get("map_degrade"));
    }
}
