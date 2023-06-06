package com.sankuai.waimai.business.search.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static ArrayList<RecommendedSearchKeyword> a(List<RecommendedSearchKeyword> list, List<List<RecommendedSearchKeyword>> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eca5ed4a70fa855401e00dda2452a995", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eca5ed4a70fa855401e00dda2452a995");
        }
        ArrayList<RecommendedSearchKeyword> arrayList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list2)) {
            for (List<RecommendedSearchKeyword> list3 : list2) {
                if (!CollectionUtils.isEmpty(list3)) {
                    arrayList.addAll(list3);
                }
            }
        }
        if (!CollectionUtils.isEmpty(list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
