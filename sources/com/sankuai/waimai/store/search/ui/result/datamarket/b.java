package com.sankuai.waimai.store.search.ui.result.datamarket;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b h;
    public final LinkedList<String> b;
    private final Map<String, Integer> c;
    private Set<String> d;
    private Set<String> e;
    private Set<Integer> f;
    private final int g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a86f9ebd3110ad050066c533639573", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a86f9ebd3110ad050066c533639573");
            return;
        }
        this.c = new HashMap();
        this.b = new LinkedList<>();
        this.g = 10;
    }

    public static b a() {
        Set<String> set;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ffe8902c8a385a8b66ab7b1d32287c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ffe8902c8a385a8b66ab7b1d32287c");
        }
        if (h == null) {
            synchronized (b.class) {
                if (h == null) {
                    b bVar = new b();
                    h = bVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "171d27f9c9838730adeeb7147f228a17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "171d27f9c9838730adeeb7147f228a17");
                    } else {
                        a a2 = a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "4d885264f67ac1e829a5251578e3ef9f", RobustBitConfig.DEFAULT_VALUE)) {
                            set = (Set) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "4d885264f67ac1e829a5251578e3ef9f");
                        } else {
                            if (a2.d.isEmpty()) {
                                a2.g();
                            }
                            set = a2.d;
                        }
                        for (String str : set) {
                            if (!TextUtils.isEmpty(str)) {
                                bVar.c.put(str, 0);
                            }
                        }
                        bVar.d = a.a().m();
                        bVar.e = a.a().o();
                        bVar.f = a.a().n();
                    }
                }
            }
        }
        return h;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8057e0a9ea9e034773aee8ccf5b3b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8057e0a9ea9e034773aee8ccf5b3b45");
            return;
        }
        for (String str : this.c.keySet()) {
            this.c.put(str, 0);
        }
    }

    public final void a(int i, boolean z, String str) {
        Integer num;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54bfaf199c77a6530cc7dadaa48317c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54bfaf199c77a6530cc7dadaa48317c7");
        } else if (!TextUtils.isEmpty(str)) {
            String str2 = z ? DefaultHeaderService.KEY_DRUG : DefaultHeaderService.KEY_STORE;
            for (String str3 : this.c.keySet()) {
                if (!TextUtils.isEmpty(str3) && (num = this.c.get(str3)) != null && str.contains(str3) && (num.intValue() & 8) == 0) {
                    this.c.put(str3, Integer.valueOf(num.intValue() | 8));
                    if (i == 100) {
                        StoreSearchChainExpErrorType storeSearchChainExpErrorType = StoreSearchChainExpErrorType.ExpRequestFail;
                        com.sankuai.waimai.store.util.monitor.c.b(storeSearchChainExpErrorType, null, str2 + "forbid" + str3);
                    }
                    StoreSearchChainExpErrorType storeSearchChainExpErrorType2 = StoreSearchChainExpErrorType.ExpRequestFail;
                    com.sankuai.waimai.store.util.monitor.c.b(storeSearchChainExpErrorType2, null, str2 + "not_forbid" + str3);
                }
            }
        }
    }

    public final void a(List<OasisModule> list, boolean z, String str) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "486be3259e8511324497ba9943055787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "486be3259e8511324497ba9943055787");
        } else if (TextUtils.isEmpty(str) || !a(list)) {
        } else {
            a(StoreSearchChainExpErrorType.ExpProcessEnd, 32, z, str);
        }
    }

    public final void a(EventInfo eventInfo) {
        int intValue;
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b36d9837fac7649c7fc042f7dfd984e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b36d9837fac7649c7fc042f7dfd984e");
            return;
        }
        String a2 = a(eventInfo.val_lab, "search_log_id");
        String a3 = a(eventInfo.val_lab, "stid");
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3) || !this.d.contains(eventInfo.val_bid) || !this.b.contains(a2)) {
            return;
        }
        Map<String, Object> map = eventInfo.val_lab;
        Object[] objArr2 = {map, "cat_id"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30b3d7ce6496723cdf0fbefda881806a", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30b3d7ce6496723cdf0fbefda881806a")).intValue();
        } else {
            Object obj = map.get("cat_id");
            intValue = obj instanceof Number ? ((Number) obj).intValue() : -1;
        }
        a(StoreSearchChainExpErrorType.ExpExpose, 64, this.f.contains(Integer.valueOf(intValue)), a3);
    }

    public void a(IMonitor iMonitor, int i, boolean z, String str) {
        Integer num;
        Object[] objArr = {iMonitor, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e98df499bb82f1cbd2ece826b349b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e98df499bb82f1cbd2ece826b349b6");
            return;
        }
        String str2 = z ? DefaultHeaderService.KEY_DRUG : DefaultHeaderService.KEY_STORE;
        for (String str3 : this.c.keySet()) {
            if (!TextUtils.isEmpty(str3) && str.contains(str3) && (num = this.c.get(str3)) != null) {
                if ((num.intValue() & i) == 0) {
                    num = Integer.valueOf(num.intValue() | i);
                    com.sankuai.waimai.store.util.monitor.c.b(iMonitor, null, str2 + str3);
                }
                if (i != 1 && (num.intValue() & 1) == 0) {
                    num = Integer.valueOf(num.intValue() | 1);
                    StoreSearchChainExpErrorType storeSearchChainExpErrorType = StoreSearchChainExpErrorType.ExpRequestStart;
                    com.sankuai.waimai.store.util.monitor.c.b(storeSearchChainExpErrorType, null, str2 + str3);
                }
                if (i == 4) {
                    num = Integer.valueOf(num.intValue() | 8);
                }
                this.c.put(str3, num);
            }
        }
    }

    public boolean a(List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb898ec19aa1e317b7a28f5e5d38d4f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb898ec19aa1e317b7a28f5e5d38d4f4")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return false;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i = 0; i < a2; i++) {
            OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (oasisModule != null) {
                String str = oasisModule.templateType == 0 ? oasisModule.nativeTemplateId : oasisModule.machTemplateId;
                if (!TextUtils.isEmpty(str) && this.e.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    private String a(@NonNull Map<String, Object> map, @NonNull String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc30377310631eb31f082aec0c864ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc30377310631eb31f082aec0c864ef");
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
