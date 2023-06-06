package com.sankuai.waimai.store.manager.abtest;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static com.sankuai.waimai.store.abtest.a a(String str, com.sankuai.waimai.store.abtest.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06c1ddf6d150051ced47d0e489e99c3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.abtest.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06c1ddf6d150051ced47d0e489e99c3f");
        }
        ABStrategy strategy = b.a().getStrategy(str, aVar == null ? null : new ABStrategy(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f));
        if (strategy == null) {
            return null;
        }
        return new com.sankuai.waimai.store.abtest.a(strategy.sceneName, strategy.modelName, strategy.groupName, strategy.expName, strategy.configName, strategy.isLast);
    }

    @NonNull
    public static com.sankuai.waimai.store.abtest.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8318e9defacc4dc32cd4bb94454b02a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.abtest.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8318e9defacc4dc32cd4bb94454b02a") : a(str, new com.sankuai.waimai.store.abtest.a());
    }

    public static com.sankuai.waimai.store.abtest.a a(String str, String str2) {
        com.sankuai.waimai.store.abtest.a aVar;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa6c7f46c2e8270caea04dbe84777d07", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.abtest.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa6c7f46c2e8270caea04dbe84777d07");
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar = new com.sankuai.waimai.store.abtest.a(str, str2);
        } else {
            aVar = new com.sankuai.waimai.store.abtest.a();
        }
        return a(str, aVar);
    }
}
