package com.sankuai.waimai.business.search.api;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final ArrayList<String> b;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        b = arrayList;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.waimai.business.search.abtest.a.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc0a7a9c863da2cca38829b2f1e9b182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc0a7a9c863da2cca38829b2f1e9b182");
            return;
        }
        arrayList.add("wm_search_SpuModeUI_v729");
        arrayList.add("V740_wm_search_catFilter_AB_group1");
        arrayList.add("search_start_page_button");
    }

    public static String a(Context context) {
        ABStrategy strategy;
        String sb;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58cacbebdf784b427a3c2371d1bb207b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58cacbebdf784b427a3c2371d1bb207b");
        }
        String str = "";
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                String[] strArr = new String[2];
                strArr[0] = str;
                ABStrategy[] aBStrategyArr = new ABStrategy[1];
                Object[] objArr2 = {next};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a2fc30eee583389f33db375d9b52262c", RobustBitConfig.DEFAULT_VALUE)) {
                    strategy = (ABStrategy) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a2fc30eee583389f33db375d9b52262c");
                } else {
                    IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
                    strategy = iABTestService != null ? iABTestService.getStrategy(next, null) : null;
                }
                aBStrategyArr[0] = strategy;
                Object[] objArr3 = {aBStrategyArr};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0efc82c1cb944f93809ba92a1ba16183", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0efc82c1cb944f93809ba92a1ba16183");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i = 0; i <= 0; i++) {
                        ABStrategy aBStrategy = aBStrategyArr[0];
                        if (aBStrategy != null && !TextUtils.isEmpty(aBStrategy.getStid())) {
                            sb2.append(aBStrategy.getStid());
                            sb2.append(";");
                        }
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    sb = sb2.toString();
                }
                strArr[1] = sb;
                str = aa.a(strArr);
            }
        }
        return str;
    }
}
