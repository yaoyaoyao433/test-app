package com.meituan.android.common.locate.platform.logs;

import android.os.Bundle;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.meituan.android.common.locate.IPLocate;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class l {
    private static String a = "LogPointCloudIPLocation";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected double a;
        protected double b;
        protected int c;
        protected String d;
        protected int e;
        protected long f;
        protected long g;
        protected String h;

        public a() {
        }
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d4363cb2fcdc93d35e37860f1de4620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d4363cb2fcdc93d35e37860f1de4620");
            return;
        }
        try {
            b.a().a("LocateIpTime", Arrays.asList(Float.valueOf(((float) (aVar.g - aVar.f)) * 1.0f)));
            b a2 = b.a();
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.e);
            a2.a("ipcode", sb.toString());
            b a3 = b.a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.c);
            a3.a(UpdateKey.RESPONSE_CODE, sb2.toString());
            b a4 = b.a();
            a4.a(GearsLocator.FROM_WHERE, aVar.h);
            b.a().e();
            if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).e()) {
                LogUtils.a(a + "location babel unEnable use");
                return;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            if (!com.meituan.android.common.locate.reporter.l.a().a) {
                concurrentHashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(aVar.a));
                concurrentHashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(aVar.b));
            }
            concurrentHashMap.put(UpdateKey.RESPONSE_CODE, String.valueOf(aVar.c));
            concurrentHashMap.put("exceptionMessage", String.valueOf(aVar.d));
            concurrentHashMap.put("IpCode", String.valueOf(aVar.e));
            concurrentHashMap.put("startIpTime", String.valueOf(aVar.f));
            concurrentHashMap.put("endIpTime", String.valueOf(aVar.g));
            concurrentHashMap.put(GearsLocator.FROM_WHERE, String.valueOf(aVar.h));
            concurrentHashMap.put("logType", "1");
            com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
            LogUtils.a(a + StringUtil.SPACE + concurrentHashMap.toString());
        } catch (Throwable unused) {
            LogUtils.a(a + " report2Cloud error");
        }
    }

    public void a(IPLocate.IPLocateResult iPLocateResult) {
        Object[] objArr = {iPLocateResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "418a580a299ad5913ef8170ddddaea32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "418a580a299ad5913ef8170ddddaea32");
        } else if (iPLocateResult == null) {
        } else {
            try {
                a aVar = new a();
                aVar.a = iPLocateResult.getLat();
                aVar.b = iPLocateResult.getLng();
                aVar.e = iPLocateResult.getIpCode();
                aVar.h = iPLocateResult.getFromwhere();
                Bundle extras = iPLocateResult.getExtras();
                if (extras != null) {
                    aVar.f = extras.getLong("startIpTime", -1L);
                    aVar.g = extras.getLong("endIpTime", -1L);
                    aVar.c = extras.getInt(UpdateKey.RESPONSE_CODE, 0);
                    aVar.d = extras.getString("exceptionMessage", "");
                }
                a(aVar);
            } catch (Throwable unused) {
                LogUtils.a(a + " set IpReportLocation error ");
            }
        }
    }
}
