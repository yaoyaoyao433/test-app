package com.sankuai.waimai.store.util.monitor.cache;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final List<ApiCache> b = Collections.synchronizedList(new a(5));
    private static final List<MachModuleCache> c = Collections.synchronizedList(new a());
    private static final List<ClickBidCache> d = Collections.synchronizedList(new a());
    private static final List<SchemeCache> e = Collections.synchronizedList(new a());

    public static void a(ApiCache apiCache) {
        Object[] objArr = {apiCache};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87d1e538a071773580ab260dbb8bd2be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87d1e538a071773580ab260dbb8bd2be");
        } else if (apiCache == null) {
        } else {
            b.add(apiCache);
        }
    }

    public static void a(SchemeCache schemeCache) {
        Object[] objArr = {schemeCache};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93a003257012982c6ca41f75821a04e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93a003257012982c6ca41f75821a04e8");
        } else if (schemeCache == null) {
        } else {
            e.add(schemeCache);
        }
    }

    public static void a(ClickBidCache clickBidCache) {
        Object[] objArr = {clickBidCache};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c43988e045371120515b0f5287f45d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c43988e045371120515b0f5287f45d98");
        } else if (clickBidCache == null) {
        } else {
            d.add(clickBidCache);
        }
    }

    public static void a(MachModuleCache machModuleCache) {
        Object[] objArr = {machModuleCache};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06c8b512eb9bda68ce882cd8dc920371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06c8b512eb9bda68ce882cd8dc920371");
        } else if (machModuleCache == null) {
        } else {
            c.add(machModuleCache);
        }
    }

    @NonNull
    public static List<MachModuleCache> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9981c1dd2d9665bc5c24525f45d91d78", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9981c1dd2d9665bc5c24525f45d91d78") : new ArrayList(c);
    }

    @NonNull
    public static List<ClickBidCache> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66d455987ff3abac14e01a67dcb6aafb", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66d455987ff3abac14e01a67dcb6aafb") : new ArrayList(d);
    }
}
