package com.sankuai.waimai.reactnative.preload;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.config.horn.c;
import com.sankuai.waimai.platform.utils.sharedpreference.a;
import com.sankuai.waimai.reactnative.preload.MRNNetPreLoader;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNPreloadConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Set<MRNNetPreLoader.a> enabledBundles;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba65368198e31440a7835411c5a20bf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba65368198e31440a7835411c5a20bf9");
            return;
        }
        List<Map<String, String>> a = cVar.a("mrn_preload_bundle", Collections.emptyList());
        a.d(k.a().toJson(a));
        enabledBundles = convert(a);
    }

    public static Set<MRNNetPreLoader.a> getEnabledBundles() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20d4758b40b98a33f34a025b787e0963", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20d4758b40b98a33f34a025b787e0963");
        }
        if (enabledBundles == null) {
            String k = a.k();
            if (k == null) {
                return null;
            }
            enabledBundles = (Set) k.a().fromJson(k, new TypeToken<Set<MRNNetPreLoader.a>>() { // from class: com.sankuai.waimai.reactnative.preload.MRNPreloadConfig.1
            }.getType());
        }
        return enabledBundles;
    }

    private Set<MRNNetPreLoader.a> convert(List<Map<String, String>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bbf86b7bc340788784e5992f3241dff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bbf86b7bc340788784e5992f3241dff");
        }
        if (list == null) {
            return null;
        }
        HashSet hashSet = new HashSet(list.size());
        Gson a = k.a();
        for (Map<String, String> map : list) {
            hashSet.add(a.fromJson(a.toJsonTree(map), (Class<Object>) MRNNetPreLoader.a.class));
        }
        return hashSet;
    }
}
