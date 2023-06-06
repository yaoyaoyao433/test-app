package com.huawei.hms.framework.network.grs.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.c.f;
import com.huawei.hms.framework.network.grs.c.m;
import com.huawei.hms.framework.network.grs.d.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static final String a = "a";
    private Map<String, Map<String, Map<String, String>>> b = new ConcurrentHashMap(16);
    private Map<String, Long> c = new ConcurrentHashMap(16);
    private c d;
    private c e;
    private m f;

    public a(c cVar, c cVar2, m mVar) {
        this.e = cVar2;
        this.d = cVar;
        this.f = mVar;
        this.f.a(this);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l = this.c.get(grsBaseInfo.getGrsParasKey(false, true, context));
        if (e.a(l)) {
            bVar.a(2);
            return;
        }
        if (e.a(l, 300000L)) {
            this.f.a(new com.huawei.hms.framework.network.grs.c.b.c(grsBaseInfo, context), null, str, this.e);
        }
        bVar.a(1);
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.c.get(str), 300000L)) {
            this.f.a(new com.huawei.hms.framework.network.grs.c.b.c(grsBaseInfo, context), null, null, this.e);
        }
    }

    public c a() {
        return this.d;
    }

    public String a(GrsBaseInfo grsBaseInfo, String str, String str2, b bVar, Context context) {
        Map<String, String> a2 = a(grsBaseInfo, str, bVar, context);
        if (a2 == null) {
            return null;
        }
        return a2.get(str2);
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        Map<String, Map<String, String>> map = this.b.get(grsBaseInfo.getGrsParasKey(false, true, context));
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        a(grsBaseInfo, bVar, context, str);
        return map.get(str);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        c cVar = this.d;
        cVar.b(grsParasKey + "time", "0");
        Map<String, Long> map = this.c;
        map.remove(grsParasKey + "time");
        this.b.remove(grsParasKey);
        this.f.a(grsParasKey);
    }

    public void a(GrsBaseInfo grsBaseInfo, f fVar, Context context, com.huawei.hms.framework.network.grs.c.b.c cVar) {
        if (fVar.e() == 2) {
            Logger.w(a, "update cache from server failed");
        } else if (cVar.d().size() != 0) {
            this.d.b("geoipCountryCode", fVar.i());
            this.d.b("geoipCountryCodetime", fVar.a());
        } else {
            String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
            this.d.b(grsParasKey, fVar.i());
            c cVar2 = this.d;
            cVar2.b(grsParasKey + "time", fVar.a());
            this.b.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(fVar.i()));
            this.c.put(grsParasKey, Long.valueOf(Long.parseLong(fVar.a())));
        }
    }

    public m b() {
        return this.f;
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        String a2 = this.d.a(grsParasKey, "");
        c cVar = this.d;
        String a3 = cVar.a(grsParasKey + "time", "0");
        long j = 0;
        if (!TextUtils.isEmpty(a3) && a3.matches("\\d+")) {
            try {
                j = Long.parseLong(a3);
            } catch (NumberFormatException e) {
                Logger.w(a, "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        this.b.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a2));
        this.c.put(grsParasKey, Long.valueOf(j));
        a(grsBaseInfo, grsParasKey, context);
    }

    public c c() {
        return this.e;
    }
}
