package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    private static final String a = "f";
    public static final Set<String> b = Collections.unmodifiableSet(new e(16));

    public static String a(Context context, com.huawei.hms.framework.network.grs.a.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(a, "routeBy must be not empty string or null.");
            return null;
        } else if ("no_route".equals(str) || "unconditional".equals(str)) {
            Logger.v(a, "routeBy equals NO_ROUTE_POLICY");
            return "no_route_country";
        } else {
            return b(context, aVar, str, grsBaseInfo, z);
        }
    }

    private static String b(Context context, com.huawei.hms.framework.network.grs.a.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        String[] split;
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str2 : str.split(">")) {
            if (b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(serCountry)) {
                    Logger.i(a, "current route_by is serCountry and routerCountry is:" + serCountry);
                    return serCountry;
                } else if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(regCountry)) {
                    Logger.i(a, "current route_by is regCountry and routerCountry is:" + regCountry);
                    return regCountry;
                } else if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(issueCountry)) {
                    Logger.i(a, "current route_by is issueCountry and routerCountry is:" + issueCountry);
                    return issueCountry;
                } else if ("geo_ip".equals(str2.trim())) {
                    String a2 = new com.huawei.hms.framework.network.grs.c.c(context, aVar, new GrsBaseInfo()).a(z);
                    Logger.i(a, "current route_by is geo_ip and routerCountry is: " + a2);
                    return a2;
                }
            }
        }
        return "";
    }
}
