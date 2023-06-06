package com.sankuai.waimai.store.search.isomorphism;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.mach.SGCommonMachUtilModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StoreSearchIsomorphismProvider implements IMachProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashSet<String> mTargetTemplate;
    private static final com.sankuai.waimai.mach.recycler.b machLogicList = new com.sankuai.waimai.mach.recycler.b("wm_sg");
    private final boolean mDemote;

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @NonNull
    public String bizId() {
        return "wm_sg";
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public int constraintHeight(@NonNull Activity activity, @NonNull String str) {
        return 0;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public Map<String, Object> customEnv(@NonNull String str, @Nullable Map<String, Object> map) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public List<JSInvokeNativeMethod> jsInvokeNativeMethods(@NonNull String str) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public List<ITagProcessor> tagProcessors(@NonNull String str) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public int timeout(@NonNull String str) {
        return 5000;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        mTargetTemplate = hashSet;
        hashSet.add("waimai-search-supermarket-feed-1");
        mTargetTemplate.add("waimai-search-supermarket-feed-comment-1");
        mTargetTemplate.add("waimai-search-supermarket-feed-pinzhi-1");
        mTargetTemplate.add("waimai-search-supermarket-feed-xiaolv-1");
        mTargetTemplate.add("sg_search_category_template_v2");
        mTargetTemplate.add("supermarket-over-page-search");
    }

    public StoreSearchIsomorphismProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bab45ed3c6c87bd4d7fdbc564524103", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bab45ed3c6c87bd4d7fdbc564524103");
        } else {
            this.mDemote = j.h().a("store_global_search/isomorphism_demote", false);
        }
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public boolean intercept(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c9bca4499f66628119cb128ec9e1649", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c9bca4499f66628119cb128ec9e1649")).booleanValue() : !this.mDemote && mTargetTemplate.contains(str);
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @NonNull
    public com.sankuai.waimai.mach.recycler.b machLogicList() {
        return machLogicList;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public void interceptMachBuilder(@NonNull Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f17302e10e0ca80bcaa7976ac84c515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f17302e10e0ca80bcaa7976ac84c515");
        } else {
            aVar.a(new SGCommonMachUtilModule());
        }
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public d logReport(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8274c4a02a54adbaecfaf5ff740200b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8274c4a02a54adbaecfaf5ff740200b");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1930454728:
                if (str.equals("waimai-search-supermarket-feed-comment-1")) {
                    c = 1;
                    break;
                }
                break;
            case -891011732:
                if (str.equals("sg_search_category_template_v2")) {
                    c = 4;
                    break;
                }
                break;
            case -147007019:
                if (str.equals("waimai-search-supermarket-feed-pinzhi-1")) {
                    c = 2;
                    break;
                }
                break;
            case 528367736:
                if (str.equals("waimai-search-supermarket-feed-xiaolv-1")) {
                    c = 3;
                    break;
                }
                break;
            case 1961002534:
                if (str.equals("waimai-search-supermarket-feed-1")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new com.sankuai.waimai.store.search.mach.spu.a(2, str2, str3);
            case 4:
                return new com.sankuai.waimai.store.search.mach.poi.a(2, str2, str3);
            default:
                return new a(2, str2, str3);
        }
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public void interceptLogReport(@NonNull d dVar, @NonNull c cVar) {
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4edda40ad04ff82a0d9c295b2b42bb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4edda40ad04ff82a0d9c295b2b42bb72");
            return;
        }
        if (dVar instanceof com.sankuai.waimai.store.search.mach.spu.a) {
            ((com.sankuai.waimai.store.search.mach.spu.a) dVar).b = cVar;
        }
        if (dVar instanceof com.sankuai.waimai.store.search.mach.poi.a) {
            ((com.sankuai.waimai.store.search.mach.poi.a) dVar).b = cVar;
        }
        if (dVar instanceof a) {
            ((a) dVar).b = cVar;
        }
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public Map<String, Object> valLab(@NonNull String str, int i, @NonNull c cVar) {
        Object[] objArr = {str, Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85636c319d555459b53b9d126252dd9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85636c319d555459b53b9d126252dd9a");
        }
        HashMap hashMap = new HashMap();
        Object[] objArr2 = {hashMap, cVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2c9aa1bde7a95b781af8fe9c85e98d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2c9aa1bde7a95b781af8fe9c85e98d00");
        } else {
            Object a = cVar.a("mach_custom_env_value");
            if (a instanceof Map) {
                try {
                    hashMap.putAll((Map) a);
                    int i2 = ((Map) a).get("filter_codes");
                    int i3 = ((Map) a).get("sort_type");
                    if (i2 == null) {
                        i2 = -999;
                    }
                    hashMap.put("filter_type", i2);
                    if (i3 == null) {
                        i3 = 0;
                    }
                    hashMap.put("rank_type", i3);
                    hashMap.put("is_filter_sec_result", "");
                } catch (Exception unused) {
                }
            }
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public void customValue(@NonNull Map<String, Object> map, @NonNull String str, @Nullable Map<String, Object> map2) {
        Object[] objArr = {map, str, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be5163b208980192c4ec0a59855e8e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be5163b208980192c4ec0a59855e8e5b");
            return;
        }
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4396ccca56ce84403877ff43c5b4af95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4396ccca56ce84403877ff43c5b4af95");
        } else if (!map.isEmpty()) {
            try {
                map.put("is_filter_sec_result", "");
                map.put("app_model", Integer.valueOf(com.sankuai.waimai.log.judas.a.a));
                Object obj = map.get("filter_codes");
                map.put("filter_type", (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) ? "0" : (String) obj);
                int i = map.get("sort_type");
                if (i == null) {
                    i = 0;
                }
                map.put("rank_type", i);
            } catch (Exception unused) {
            }
        }
        map.put("isomorphism_sg", Boolean.TRUE);
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public int constraintWidth(@NonNull Activity activity, @NonNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944979fb7f05cac28d24b4ee99be139c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944979fb7f05cac28d24b4ee99be139c")).intValue() : g.a((Context) activity);
    }
}
