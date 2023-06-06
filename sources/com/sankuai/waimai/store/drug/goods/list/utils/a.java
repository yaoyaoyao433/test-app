package com.sankuai.waimai.store.drug.goods.list.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.drug.MEDQualityMonitorReporter;
import com.sankuai.waimai.store.drug.util.monitor.DrugCommonMonitor;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.w;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static int b;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a53bb552a8c02ea1e02e05eb7ed53bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a53bb552a8c02ea1e02e05eb7ed53bef");
        } else {
            com.sankuai.waimai.store.util.monitor.c.b(new DrugCommonMonitor("MEDStoreCreate"), "", "商家页面监控", d());
        }
    }

    public static void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "625ae4afd15caf80a2f8b20f0f6f8a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "625ae4afd15caf80a2f8b20f0f6f8a91");
        } else if (b != i) {
            HashMap hashMap = new HashMap();
            hashMap.put("isHasLoadData", z ? "1" : "0");
            hashMap.putAll(d());
            com.sankuai.waimai.store.util.monitor.c.a(new DrugCommonMonitor("MEDStoreDestroyNoData"), "", "商家页面监控", d());
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "234cc29bb407186fa9698cfb148ce6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "234cc29bb407186fa9698cfb148ce6c8");
        } else {
            com.sankuai.waimai.store.util.monitor.c.b(new DrugCommonMonitor("MEDStoreHeaderCreate"), "", "商家页面监控", d());
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "961e622dc7cbc8584e1c44d672a4f727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "961e622dc7cbc8584e1c44d672a4f727");
        } else {
            com.sankuai.waimai.store.util.monitor.c.b(new DrugCommonMonitor("MEDStoreRequestCreate"), "", "商家页面监控", d());
        }
    }

    public static void a(RestMenuResponse restMenuResponse, boolean z) {
        Object[] objArr = {restMenuResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53a3a5964cda47f2931c423cfca38b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53a3a5964cda47f2931c423cfca38b85");
            return;
        }
        HashMap hashMap = new HashMap();
        if (restMenuResponse != null) {
            hashMap.put("store_type", com.sankuai.waimai.store.drug.util.c.a(restMenuResponse));
            hashMap.put("is_drug_scheme", z ? "1" : "0");
            hashMap.put("template_type", restMenuResponse == null ? "Unknown" : com.sankuai.waimai.store.drug.util.c.a(restMenuResponse.mPoi));
            hashMap.putAll(d());
        }
        com.sankuai.waimai.store.util.monitor.c.b(new DrugCommonMonitor("MEDStoreRequest"), "", "商家页面监控", hashMap);
    }

    public static void a(int i, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a506cec945579cbe104d1805af9d972d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a506cec945579cbe104d1805af9d972d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
        hashMap.put("is_drug_scheme", z ? "1" : "0");
        hashMap.put(NetLogConstants.Details.ERROR_MSG, str);
        hashMap.putAll(d());
        com.sankuai.waimai.store.util.monitor.c.a(new DrugCommonMonitor("MEDStoreRequest", "RequestError"), "", "商家页面监控", hashMap);
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12b0d38e72800fb1e651939b7d9ca7e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12b0d38e72800fb1e651939b7d9ca7e5");
        } else if (b != i) {
            b = i;
            com.sankuai.waimai.store.util.monitor.c.b(new DrugCommonMonitor("MEDStoreRender"), "", "商家页面监控", d());
        }
    }

    public static void a(boolean z, int i, long j, String str, String str2, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67ba44de7144545e99c664a3525b1051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67ba44de7144545e99c664a3525b1051");
        } else if (z && i == 1 && j == 1) {
            a(str, str2, i2);
        }
    }

    public static void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e229ffc45238ad0b3207b0c10c00e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e229ffc45238ad0b3207b0c10c00e42");
        } else if (b != i) {
            b = i;
            HashMap hashMap = new HashMap();
            hashMap.put("error_type", str);
            hashMap.put(NetLogConstants.Details.ERROR_MSG, str2);
            hashMap.putAll(d());
            com.sankuai.waimai.store.util.monitor.c.a(new DrugCommonMonitor("MEDStoreRender"), "", "商家页面监控", hashMap);
        }
    }

    private static HashMap<String, String> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b237047303a9bb6dbaf0fbc4d229458", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b237047303a9bb6dbaf0fbc4d229458");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("page_version", "7.83");
        return hashMap;
    }

    @NonNull
    private static Map<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "582f2b67aee344e243db3fe0d1a06d50", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "582f2b67aee344e243db3fe0d1a06d50");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_version", 1);
        return hashMap;
    }

    public static void b(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa0b8219efc5ec7bd170028d6b94ffa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa0b8219efc5ec7bd170028d6b94ffa5");
        } else if (aVar != null) {
            aVar.a().b("MEDDrugShopPageCreate", e());
        }
    }

    public static void c(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2a4a5cb51898224324c99a1f8c77989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2a4a5cb51898224324c99a1f8c77989");
        } else if (aVar != null) {
            MEDQualityMonitorReporter a2 = aVar.a();
            Map<String, Object> e = e();
            Object[] objArr2 = {"MEDDrugShopPageV9RequestStart", e};
            ChangeQuickRedirect changeQuickRedirect2 = MEDQualityMonitorReporter.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "cdafa30e7d50b8b3beb60bf1e1f7411b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "cdafa30e7d50b8b3beb60bf1e1f7411b");
                return;
            }
            a2.b++;
            if (a2.a()) {
                a2.b("MEDDrugShopPageV9RequestStart", e);
            }
        }
    }

    public static void d(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cc5d6940dff8b488e4be3ab01af28fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cc5d6940dff8b488e4be3ab01af28fb");
        } else if (aVar != null) {
            MEDQualityMonitorReporter a2 = aVar.a();
            Map<String, Object> e = e();
            Object[] objArr2 = {"MEDDrugShopPageV9Request", e};
            ChangeQuickRedirect changeQuickRedirect2 = MEDQualityMonitorReporter.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c29bd3f511c1f90462519d382f442408", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c29bd3f511c1f90462519d382f442408");
            } else if (a2.a()) {
                a2.b("MEDDrugShopPageV9Request", e);
            }
        }
    }

    public static void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17f1285c580153fa5b03194d2f63bbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17f1285c580153fa5b03194d2f63bbab");
        } else if (aVar != null) {
            Map<String, Object> e = e();
            e.put("exp_code", Integer.valueOf(i));
            MEDQualityMonitorReporter a2 = aVar.a();
            Object[] objArr2 = {"MEDDrugShopPageV9Request", e};
            ChangeQuickRedirect changeQuickRedirect2 = MEDQualityMonitorReporter.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "17f8c1b57c5fa6f8f609d83c755703cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "17f8c1b57c5fa6f8f609d83c755703cb");
            } else if (a2.a()) {
                a2.a("MEDDrugShopPageV9Request", e);
            }
        }
    }

    public static void e(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        boolean z = false;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60043fff491cb955026002f6db9d5c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60043fff491cb955026002f6db9d5c35");
        } else if (aVar != null) {
            MEDQualityMonitorReporter a2 = aVar.a();
            Map<String, Object> e = e();
            Object[] objArr2 = {"MEDDrugShopPageRenderHeaderStart", e};
            ChangeQuickRedirect changeQuickRedirect2 = MEDQualityMonitorReporter.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9109aba47d75b465b1854079e3fb2200", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9109aba47d75b465b1854079e3fb2200");
                return;
            }
            if (a2.b == 1 && a2.c == 0) {
                z = true;
            }
            if (z) {
                a2.c++;
                a2.b("MEDDrugShopPageRenderHeaderStart", e);
            }
        }
    }

    public static void f(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae8dd64f50a36f1c911f010c5b73ad8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae8dd64f50a36f1c911f010c5b73ad8a");
        } else if (aVar != null) {
            MEDQualityMonitorReporter a2 = aVar.a();
            Map<String, Object> e = e();
            Object[] objArr2 = {"MEDDrugShopPageRenderHeader", e};
            ChangeQuickRedirect changeQuickRedirect2 = MEDQualityMonitorReporter.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d175ac3de1cd38bdb660f187bf80d762", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d175ac3de1cd38bdb660f187bf80d762");
            } else if (a2.b()) {
                a2.d++;
                a2.b("MEDDrugShopPageRenderHeader", e);
            }
        }
    }

    public static void g(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "274f8129e9f543684e59ba3b675997bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "274f8129e9f543684e59ba3b675997bb");
        } else if (aVar != null) {
            MEDQualityMonitorReporter a2 = aVar.a();
            Map<String, Object> e = e();
            Object[] objArr2 = {"MEDDrugShopPageRenderHeader", e};
            ChangeQuickRedirect changeQuickRedirect2 = MEDQualityMonitorReporter.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9cf89ca5cf2a1a1c39c1c2ba2d7f7193", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9cf89ca5cf2a1a1c39c1c2ba2d7f7193");
            } else if (a2.b()) {
                a2.d++;
                a2.a("MEDDrugShopPageRenderHeader", e);
            }
        }
    }

    public static void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "029e0172483af6e2c74e6f8511b3cca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "029e0172483af6e2c74e6f8511b3cca7");
        } else if (aVar == null || !w.d(aVar.b)) {
        } else {
            HashMap hashMap = new HashMap();
            String j = aVar.j();
            if (TextUtils.isEmpty(j)) {
                j = "";
            }
            String d = aVar.d();
            hashMap.put("poi_info", j + '-' + d);
            com.sankuai.waimai.store.util.monitor.c.a(new DrugCommonMonitor("MEDStoreRetail"), "", "零售版商家页监控", hashMap);
        }
    }
}
