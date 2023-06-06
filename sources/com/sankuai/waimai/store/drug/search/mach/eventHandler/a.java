package com.sankuai.waimai.store.drug.search.mach.eventHandler;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.f;
import com.sankuai.waimai.store.search.statistics.e;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Mach.d {
    public static ChangeQuickRedirect a;
    private final ArrayList<Long> b;
    private SearchShareData c;
    private Context d;
    private com.sankuai.waimai.mach.recycler.c e;
    private com.sankuai.waimai.store.search.ui.result.b f;
    private Serializable g;

    public a(@NonNull com.sankuai.waimai.mach.recycler.c cVar, SearchShareData searchShareData, Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {cVar, searchShareData, context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9587c203a6b84305c594e84efc8ab94a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9587c203a6b84305c594e84efc8ab94a");
            return;
        }
        this.b = new ArrayList<>();
        this.c = searchShareData;
        this.d = context;
        this.e = cVar;
        this.f = bVar;
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "554cc00b59da981a10c63f1f1201ed1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "554cc00b59da981a10c63f1f1201ed1f");
            return;
        }
        if ("drug_search_inshop_noResult_jump".equals(str) && (this.d instanceof SCBaseActivity)) {
            ((GlobalSearchActivity) this.d).finish();
        }
        if (map == null) {
            return;
        }
        if ("drug_search_noresult_switch_tab".equals(str)) {
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c46b6e49105dc075cf858d379afae085", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c46b6e49105dc075cf858d379afae085");
            } else if (map != null) {
                Object obj = map.get("code");
                if (obj instanceof String) {
                    this.c.am = (String) obj;
                    if (this.f != null) {
                        this.f.a(35, this.c.am);
                    }
                }
            }
        } else if (TextUtils.equals(str, "splice_scheme_then_jump") && map != null) {
            Object obj2 = map.get(NetLogConstants.Details.SCHEME);
            Bundle bundle = null;
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a74a970a12ab27920d5d138bcbc6a707", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a74a970a12ab27920d5d138bcbc6a707");
            } else if (!TextUtils.isEmpty(str2) && !com.sankuai.waimai.store.util.b.a(this.d)) {
                if (!(this.g instanceof f)) {
                    d.a(this.d, str2);
                    return;
                }
                f fVar = (f) this.g;
                BaseProductPoi.RecommendSpuCombo recommendSpuCombo = (fVar == null || fVar.productInfoItem == null) ? null : fVar.productInfoItem.Q;
                this.b.clear();
                if (recommendSpuCombo != null) {
                    int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSpuCombo.recommendSpus);
                    for (int i = 0; i < a2; i++) {
                        BaseProductPoi.RecommendSpu recommendSpu = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSpuCombo.recommendSpus, i);
                        if (recommendSpu != null) {
                            this.b.add(Long.valueOf(recommendSpu.spuId));
                        }
                    }
                }
                ArrayList<Long> arrayList = this.b;
                Object[] objArr4 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ff179ec8b0dad03ab0ed8599077c2a0a", RobustBitConfig.DEFAULT_VALUE)) {
                    bundle = (Bundle) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ff179ec8b0dad03ab0ed8599077c2a0a");
                } else if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                    bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < com.sankuai.shangou.stone.util.a.a((List) arrayList); i2++) {
                        Long l = (Long) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i2);
                        if (l != null) {
                            jSONArray.put(l);
                        }
                    }
                    bundle.putString("search_spu_recommend_combo_ids", jSONArray.toString());
                }
                if (bundle == null) {
                    d.a(this.d, str2);
                } else {
                    d.a(this.d, str2, bundle);
                }
            }
        } else if (TextUtils.equals(str, "filter_search_request")) {
            if (map == null || !TextUtils.equals(str, "filter_search_request") || this.c.W == null) {
                return;
            }
            this.c.W.hasSelected = !this.c.W.hasSelected;
            Object obj3 = map.get("selected_filter_code");
            if (obj3 instanceof String) {
                if (this.c.W.hasSelected) {
                    this.c.ae = (String) obj3;
                } else {
                    this.c.ae = "";
                }
            }
            if (this.f != null) {
                this.f.a();
            }
        } else if (!TextUtils.equals(str, "query_with_selected_medicine_name")) {
            if (TextUtils.equals(str, "jump")) {
                a(map);
            }
        } else if (map != null) {
            Object obj4 = map.get(SearchIntents.EXTRA_QUERY);
            Object obj5 = map.get("tips_id");
            if (this.f != null && (obj4 instanceof String) && (obj5 instanceof Long)) {
                if (this.c != null) {
                    if (TextUtils.isEmpty(this.c.j)) {
                        this.c.j = this.c.h;
                    }
                    this.c.i = (String) obj4;
                    this.c.k = ((Long) obj5).longValue();
                }
                this.f.a((String) obj4, "_search_choose_guide");
            }
        }
    }

    private void a(@Nullable Map<String, Object> map) {
        int i = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd4030d90d7802291d118750566a90e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd4030d90d7802291d118750566a90e");
        } else if (map != null) {
            if (map.get("type") != null) {
                if (map.get("type").getClass().equals(Long.class)) {
                    i = ((Long) map.get("type")).intValue();
                } else if (map.get("type").getClass().equals(String.class)) {
                    try {
                        i = Integer.valueOf((String) map.get("type")).intValue();
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
            }
            String str = map.get(NetLogConstants.Details.SCHEME) instanceof String ? (String) map.get(NetLogConstants.Details.SCHEME) : null;
            HashMap hashMap = new HashMap();
            if (map.get("append_params") instanceof Map) {
                for (Map.Entry entry : ((Map) map.get("append_params")).entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        if (entry.getValue() instanceof String) {
                            hashMap.put(entry.getKey(), (String) entry.getValue());
                        } else {
                            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 1) {
                d.a(this.d, str, hashMap);
            } else {
                d.a(this.d, str);
            }
        }
    }
}
