package com.meituan.android.common.locate.platform.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String b;
    public String c;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0c3470d2c7411db0b4549bd5880ff8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0c3470d2c7411db0b4549bd5880ff8f");
            return;
        }
        this.b = null;
        this.c = "2.34.1";
        this.b = com.meituan.android.common.locate.provider.a.d();
    }

    public void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f88a261d41621030268089d834472f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f88a261d41621030268089d834472f5");
            return;
        }
        a(concurrentHashMap, "sdkver", this.c);
        a(concurrentHashMap, "suuid", this.b);
    }

    public void a(ConcurrentHashMap<String, String> concurrentHashMap, String str, double d) {
        Object[] objArr = {concurrentHashMap, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ffd818322f6167e0abdb543bc4bd502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ffd818322f6167e0abdb543bc4bd502");
        } else if (str == null) {
        } else {
            concurrentHashMap.put(str, String.valueOf(d));
        }
    }

    public void a(ConcurrentHashMap<String, String> concurrentHashMap, String str, int i) {
        Object[] objArr = {concurrentHashMap, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b04de14c1aae6e6be111854c5e090a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b04de14c1aae6e6be111854c5e090a0");
        } else if (i == 0 || str == null) {
        } else {
            concurrentHashMap.put(str, String.valueOf(i));
        }
    }

    public void a(ConcurrentHashMap<String, String> concurrentHashMap, String str, long j) {
        Object[] objArr = {concurrentHashMap, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0281ae57d73294f4397d2925a8980255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0281ae57d73294f4397d2925a8980255");
        } else if (j == 0 || str == null) {
        } else {
            concurrentHashMap.put(str, String.valueOf(j));
        }
    }

    public void a(ConcurrentHashMap<String, String> concurrentHashMap, String str, String str2) {
        Object[] objArr = {concurrentHashMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d6ed1141aba4229e860568ce2313c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d6ed1141aba4229e860568ce2313c4");
        } else if (str == null || str2 == null) {
        } else {
            concurrentHashMap.put(str, String.valueOf(str2));
        }
    }

    public void b() {
    }

    public void c() {
    }

    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5800139edd603177338af7477b6cec3f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5800139edd603177338af7477b6cec3f")).booleanValue() : com.meituan.android.common.locate.reporter.l.a().a;
    }
}
