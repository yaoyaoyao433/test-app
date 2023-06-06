package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tencent.mapsdk.internal.ch;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private Context a;
    private GrsBaseInfo b;
    private com.huawei.hms.framework.network.grs.a.a c;

    public c(Context context, com.huawei.hms.framework.network.grs.a.a aVar, GrsBaseInfo grsBaseInfo) {
        this.a = context;
        this.b = grsBaseInfo;
        this.c = aVar;
    }

    public String a(boolean z) {
        String str;
        String a = com.huawei.hms.framework.network.grs.a.a(this.c.a().a("geoipCountryCode", ""), "geoip.countrycode", "ROOT");
        Logger.i("GeoipCountry", "geoIpCountry is: " + a);
        String a2 = this.c.a().a("geoipCountryCodetime", "0");
        long j = 0;
        if (!TextUtils.isEmpty(a2) && a2.matches("\\d+")) {
            try {
                j = Long.parseLong(a2);
            } catch (NumberFormatException e) {
                Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        if (TextUtils.isEmpty(a) || com.huawei.hms.framework.network.grs.d.e.a(Long.valueOf(j))) {
            com.huawei.hms.framework.network.grs.c.b.c cVar = new com.huawei.hms.framework.network.grs.c.b.c(this.b, this.a);
            cVar.a("geoip.countrycode");
            com.huawei.hms.framework.network.grs.a.c c = this.c.c();
            if (c != null) {
                try {
                    str = n.a(c.a(ch.a_, ""), cVar.c());
                } catch (JSONException e2) {
                    Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException.", e2);
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    c.b(ch.a_, str);
                }
            }
            if (z) {
                f a3 = this.c.b().a(cVar, "geoip.countrycode", c);
                if (a3 != null) {
                    a = com.huawei.hms.framework.network.grs.a.a(a3.i(), "geoip.countrycode", "ROOT");
                }
                Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + a);
            } else {
                Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                this.c.b().a(cVar, null, "geoip.countrycode", c);
            }
        }
        return a;
    }
}
