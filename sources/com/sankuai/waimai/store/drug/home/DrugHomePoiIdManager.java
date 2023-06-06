package com.sankuai.waimai.store.drug.home;

import android.arch.lifecycle.o;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugHomePoiIdManager extends o {
    public static ChangeQuickRedirect a;
    private long b;
    private ArrayMap<Long, String> c;

    public DrugHomePoiIdManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd40c01c0735aec6d318357cc81cd8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd40c01c0735aec6d318357cc81cd8f");
            return;
        }
        this.b = 1L;
        this.c = new ArrayMap<>();
    }

    private long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5f83cfdce0bc8bb074be702a3c2ecd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5f83cfdce0bc8bb074be702a3c2ecd")).longValue();
        }
        if (TextUtils.isEmpty(str) || this.c.isEmpty()) {
            return 0L;
        }
        for (Map.Entry<Long, String> entry : this.c.entrySet()) {
            if (entry != null && str.equals(entry.getValue())) {
                return entry.getKey().longValue();
            }
        }
        return 0L;
    }

    public static void a(SCBaseActivity sCBaseActivity, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {sCBaseActivity, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d390297a7bc18a0781ab1211cecd79f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d390297a7bc18a0781ab1211cecd79f6");
            return;
        }
        DrugHomePoiIdManager drugHomePoiIdManager = com.sankuai.waimai.store.util.b.a(sCBaseActivity) ? null : (DrugHomePoiIdManager) q.a((FragmentActivity) sCBaseActivity).a(DrugHomePoiIdManager.class);
        if (drugHomePoiIdManager != null) {
            Object[] objArr2 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, drugHomePoiIdManager, changeQuickRedirect2, false, "10a93b7e1e184dc9d73687adbf0def7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugHomePoiIdManager, changeQuickRedirect2, false, "10a93b7e1e184dc9d73687adbf0def7c");
            } else if (poiVerticalityDataResponse != null && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.machPoiCardInfos)) {
                for (BaseModuleDesc baseModuleDesc : poiVerticalityDataResponse.machPoiCardInfos) {
                    if (baseModuleDesc != null && baseModuleDesc.jsonData != null && !baseModuleDesc.jsonData.isEmpty()) {
                        Map<String, Object> map = baseModuleDesc.jsonData;
                        Object[] objArr3 = {map};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, drugHomePoiIdManager, changeQuickRedirect3, false, "11cf6899473441b8b0e3cfd4f33ba5b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, drugHomePoiIdManager, changeQuickRedirect3, false, "11cf6899473441b8b0e3cfd4f33ba5b9");
                        } else {
                            long a2 = com.sankuai.waimai.store.drug.home.realtime.b.a(map.get("id"));
                            Object obj = map.get(FoodDetailNetWorkPreLoader.URI_POI_STR);
                            String str = obj instanceof String ? (String) obj : null;
                            if (!TextUtils.isEmpty(str)) {
                                if (a2 <= 0) {
                                    a2 = drugHomePoiIdManager.a(str);
                                    if (a2 <= 0) {
                                        a2 = drugHomePoiIdManager.b;
                                        drugHomePoiIdManager.b = 1 + a2;
                                    }
                                    map.put("id", Long.valueOf(a2));
                                }
                                drugHomePoiIdManager.c.put(Long.valueOf(a2), str);
                            }
                        }
                    }
                }
            }
        }
    }

    @NonNull
    public static Pair<String, String> a(SCBaseActivity sCBaseActivity, String str) {
        String sb;
        Object[] objArr = {sCBaseActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a12319dd14da69292f93aa898efca522", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a12319dd14da69292f93aa898efca522");
        }
        if (!com.sankuai.waimai.store.util.b.a(sCBaseActivity)) {
            DrugHomePoiIdManager drugHomePoiIdManager = (DrugHomePoiIdManager) q.a((FragmentActivity) sCBaseActivity).a(DrugHomePoiIdManager.class);
            String str2 = (drugHomePoiIdManager.b > 1L ? 1 : (drugHomePoiIdManager.b == 1L ? 0 : -1)) > 0 ? "" : str;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, drugHomePoiIdManager, changeQuickRedirect2, false, "e1ec5a6553040a35ea80b63f0c687c2c", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, drugHomePoiIdManager, changeQuickRedirect2, false, "e1ec5a6553040a35ea80b63f0c687c2c");
            } else {
                StringBuilder sb2 = new StringBuilder("");
                if (str != null && str.length() > 2) {
                    String[] split = str.substring(1, str.length() - 1).split(CommonConstant.Symbol.COMMA);
                    if (!com.sankuai.shangou.stone.util.a.b(split)) {
                        ArrayList arrayList = new ArrayList(split.length);
                        for (String str3 : split) {
                            long a2 = r.a(str3, 0L);
                            String str4 = a2 > 0 ? drugHomePoiIdManager.c.get(Long.valueOf(a2)) : null;
                            if (!TextUtils.isEmpty(str4)) {
                                arrayList.add(str4);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                String str5 = (String) arrayList.get(i);
                                if (i == 0) {
                                    sb2.append("[");
                                } else {
                                    sb2.append(CommonConstant.Symbol.COMMA);
                                }
                                sb2.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                                sb2.append(str5);
                                sb2.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                                if (i == arrayList.size() - 1) {
                                    sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                }
                            }
                        }
                    }
                }
                sb = sb2.toString();
            }
            return Pair.create(str2, sb);
        }
        return Pair.create(str, "");
    }

    public static long a(@NonNull SCBaseActivity sCBaseActivity, Object obj) {
        Object[] objArr = {sCBaseActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc3f8854fdc96b2170f3e61fa4db5cc1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc3f8854fdc96b2170f3e61fa4db5cc1")).longValue();
        }
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return ((DrugHomePoiIdManager) q.a((FragmentActivity) sCBaseActivity).a(DrugHomePoiIdManager.class)).a(str);
    }
}
