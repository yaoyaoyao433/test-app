package com.sankuai.titans.dns.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.dns.config.ITitansHttpDnsConfigInit;
import com.sankuai.titans.dns.config.ITitansHttpDnsLog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansHttpDnsUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ITitansHttpDnsConfigInit configInit;
    private static ITitansHttpDnsLog dnsLog;

    static {
        List a = b.a(ITitansHttpDnsConfigInit.class, (String) null);
        if (a != null && a.size() > 0) {
            configInit = (ITitansHttpDnsConfigInit) a.get(0);
        }
        List a2 = b.a(ITitansHttpDnsLog.class, (String) null);
        if (a2 == null || a2.size() <= 0) {
            return;
        }
        dnsLog = (ITitansHttpDnsLog) a2.get(0);
    }

    public static ITitansHttpDnsConfigInit getConfigInit() {
        return configInit;
    }

    public static ITitansHttpDnsLog getLogInit() {
        return dnsLog;
    }
}
