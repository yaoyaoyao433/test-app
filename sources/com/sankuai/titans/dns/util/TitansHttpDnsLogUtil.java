package com.sankuai.titans.dns.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.dns.config.ITitansHttpDnsLog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansHttpDnsLogUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ITitansHttpDnsLog dnsLog = TitansHttpDnsUtil.getLogInit();

    public static void log(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f635dfd031cf0757295577b16ada708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f635dfd031cf0757295577b16ada708");
        } else if (dnsLog != null) {
            dnsLog.log(str);
        }
    }
}
