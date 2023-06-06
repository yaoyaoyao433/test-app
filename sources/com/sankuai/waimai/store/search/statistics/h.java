package com.sankuai.waimai.store.search.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.OasisModule;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static Set<String> b;

    public static void a(List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fc4845ce584f198448150be53d752e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fc4845ce584f198448150be53d752e1");
        } else if (list != null && !list.isEmpty()) {
            int size = list.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Serializable serializable = list.get(i3) == null ? null : list.get(i3).data;
                if (serializable instanceof b) {
                    ((b) serializable).getStaggerIndexLookup().a(i % 2);
                    i++;
                } else {
                    i = 0;
                }
                if (serializable instanceof i) {
                    int i4 = i3 - i2;
                    ((i) serializable).setStatisticsIndex(i4);
                    if (serializable instanceof CommonMachData) {
                        if (b == null || !b.contains(((CommonMachData) serializable).mItem.a())) {
                            ((CommonMachData) serializable).mItem.a("mach_extra_key_index", Integer.valueOf(i4));
                        }
                    }
                }
                i2++;
            }
        }
    }

    public static int a(Serializable serializable) {
        Object[] objArr = {serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1278ec385cc590e37cd2ddf91a8b30c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1278ec385cc590e37cd2ddf91a8b30c0")).intValue();
        }
        if (serializable instanceof i) {
            return ((i) serializable).getStatisticsIndex();
        }
        return -1;
    }
}
