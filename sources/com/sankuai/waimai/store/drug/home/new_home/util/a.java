package com.sankuai.waimai.store.drug.home.new_home.util;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull SCBaseActivity sCBaseActivity, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull com.sankuai.waimai.store.param.a aVar, boolean z) {
        SparseArray<CategoryInfo> sparseArray;
        NewDrugHomeRealtimeViewModel newDrugHomeRealtimeViewModel;
        int i = 0;
        Object[] objArr = {sCBaseActivity, poiVerticalityDataResponse, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        CategoryInfo categoryInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96a8e06f32fc6a545fec446b419edd9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96a8e06f32fc6a545fec446b419edd9c");
            return;
        }
        if (com.sankuai.waimai.store.util.b.a(sCBaseActivity)) {
            sparseArray = null;
            newDrugHomeRealtimeViewModel = null;
        } else {
            newDrugHomeRealtimeViewModel = (NewDrugHomeRealtimeViewModel) q.a((FragmentActivity) sCBaseActivity).a(NewDrugHomeRealtimeViewModel.class);
            if (z) {
                newDrugHomeRealtimeViewModel.j = poiVerticalityDataResponse.categoryInfoRealtimeEnable;
            }
            sparseArray = ((PoiPageViewModel) q.a((FragmentActivity) sCBaseActivity).a(PoiPageViewModel.class)).c();
            if (sparseArray.size() > 0) {
                categoryInfo = sparseArray.get(0);
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    CategoryInfo valueAt = sparseArray.valueAt(i2);
                    if (valueAt != null) {
                        if (!z) {
                            valueAt.index = valueAt.index == 0 ? 0 : -1;
                        } else {
                            valueAt.index = -1;
                        }
                    }
                }
                sparseArray.clear();
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.categoryInfos)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CategoryInfo> it = poiVerticalityDataResponse.categoryInfos.iterator();
        while (it.hasNext()) {
            CategoryInfo next = it.next();
            if (next != null) {
                if (i == 0) {
                    next.isShow = 1;
                    next.traceId = poiVerticalityDataResponse.traceId;
                    next.rankTraceId = aVar.k;
                    aVar.f = next.code;
                    if (!z && categoryInfo != null) {
                        next.isDataLoadedSuccess = categoryInfo.isDataLoadedSuccess;
                        next.isLoading = categoryInfo.isLoading;
                        next.requestMode = categoryInfo.requestMode;
                        next.cellSize = categoryInfo.cellSize;
                    } else {
                        next.isLoading = true;
                    }
                }
                arrayList.add(next);
                next.index = i;
                if (sparseArray != null) {
                    sparseArray.put(i, next);
                }
                i++;
            } else {
                it.remove();
            }
        }
        if (newDrugHomeRealtimeViewModel != null) {
            newDrugHomeRealtimeViewModel.l = arrayList;
        }
    }

    public static boolean a(List<CategoryInfo> list, List<CategoryInfo> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c4d1e22598ea2654465fc3c4df32b3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c4d1e22598ea2654465fc3c4df32b3a")).booleanValue();
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        int a3 = com.sankuai.shangou.stone.util.a.a((List) list2);
        if (a3 == 0 || a3 != a2) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            CategoryInfo categoryInfo = list.get(i);
            CategoryInfo categoryInfo2 = list2.get(i);
            if (categoryInfo == null || categoryInfo2 == null || !TextUtils.equals(categoryInfo.code, categoryInfo2.code) || !TextUtils.equals(categoryInfo.name, categoryInfo2.name)) {
                return true;
            }
        }
        return false;
    }
}
