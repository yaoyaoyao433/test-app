package com.meituan.android.common.locate.platform.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class d extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int a;
    private int d;
    private int e;
    private final Map<String, Integer> f;

    /* loaded from: classes2.dex */
    public static final class a {
        private static final d a = new d();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85f8da9b4c7be831c71230aa8e773993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85f8da9b4c7be831c71230aa8e773993");
            return;
        }
        this.a = 0;
        this.d = 0;
        this.e = 0;
        this.f = new HashMap();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45aa377b7f0437a482257739d620382a", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45aa377b7f0437a482257739d620382a") : a.a;
    }

    public final synchronized void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f63dab6c8259b573ce3c7a89d1f838e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f63dab6c8259b573ce3c7a89d1f838e7");
            return;
        }
        this.a += i;
        this.d += i2;
        this.e += i3;
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90c11ec2f969ce854a9e9c67e158aa6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90c11ec2f969ce854a9e9c67e158aa6e");
        } else {
            this.f.put(str, Integer.valueOf((this.f.containsKey(str) ? this.f.get(str).intValue() : 0) + 1));
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public final void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3202b1848f9498b79fbfd79add1076ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3202b1848f9498b79fbfd79add1076ad");
            return;
        }
        super.a(concurrentHashMap);
        concurrentHashMap.put("cell_info_total", String.valueOf(this.e));
        concurrentHashMap.put("filter_by_age_num", String.valueOf(this.a));
        concurrentHashMap.put("filter_by_other_num", String.valueOf(this.d));
        if (this.f.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
            concurrentHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bd2cea18f8145559f2378c3c9fa087f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bd2cea18f8145559f2378c3c9fa087f");
            return;
        }
        super.b();
        this.e = 0;
        this.a = 0;
        this.d = 0;
        this.f.clear();
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public final void c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86577c518d8714ce2eb9fd98aa5b2ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86577c518d8714ce2eb9fd98aa5b2ef7");
            return;
        }
        if (com.meituan.android.common.locate.provider.g.a() == null) {
            str = "LogCellWrapper::ContextProvider::context is null";
        } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
            b();
            return;
        } else {
            try {
                ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                a(concurrentHashMap);
                if (concurrentHashMap.size() == 0) {
                    return;
                }
                com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                b();
                return;
            } catch (Exception e) {
                str = "LogCellWrapper::exception" + e.getMessage();
            }
        }
        c.a(str, 3);
    }
}
