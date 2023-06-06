package com.sankuai.meituan.takeoutnew.util.aop;

import android.app.Application;
import android.support.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BootAPICatMonitor extends AbsInit {
    private static final String BOOT_MONITOR_PREFIX = "boot_";
    private static Set<String> bootCMDs = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean launchFinished = false;
    public static final Executor sCatExecutor = new m(com.sankuai.android.jarvis.c.a());

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "BootAPICatMonitor";
    }

    public static void setBootCMDs(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e9dd40fd62cfb73166a68d9f06089f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e9dd40fd62cfb73166a68d9f06089f6");
        } else if (set != null) {
            bootCMDs = set;
            WaimaiSP.b(set);
        }
    }

    public static void pvCat(com.dianping.monitor.e eVar, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, int i8, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8) {
        Object[] objArr = {eVar, new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, Integer.valueOf(i8), str4, str5, str6, hashMap, hashMap2, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bfd48ccddc78a17dccb2b0b4c8af4de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bfd48ccddc78a17dccb2b0b4c8af4de");
            return;
        }
        eVar.pvCat(j, str, i, i2, i3, i4, i5, i6, i7, str2, str3, i8, str4, str5, str6, hashMap, hashMap2, str7, str8);
        reportLaunchApi(j, str, i, i2, i4, i5, i6, i7);
    }

    public static void pvShark(com.dianping.monitor.impl.a aVar, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, int i9, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8, String str9) {
        Object[] objArr = {aVar, new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str2, str3, Integer.valueOf(i9), str4, str5, str6, hashMap, hashMap2, str7, str8, str9};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48623fcecac1e2431a9c047872fce887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48623fcecac1e2431a9c047872fce887");
            return;
        }
        aVar.pvShark(j, str, i, i2, i3, i4, i5, i6, i7, i8, str2, str3, i9, str4, str5, str6, hashMap, hashMap2, str7, str8, str9);
        reportLaunchApi(j, str, i, i2, i5, i6, i7, i8);
    }

    private static void reportLaunchApi(final long j, final String str, final int i, final int i2, final int i3, final int i4, final int i5, final int i6) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c390132ece142feae78015398920cd20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c390132ece142feae78015398920cd20");
        } else if (launchFinished || str == null || str.startsWith(BOOT_MONITOR_PREFIX)) {
        } else {
            if (bootCMDs == null) {
                bootCMDs = WaimaiSP.b();
            }
            Set<String> set = bootCMDs;
            if (set == null || set.isEmpty() || !set.contains(str)) {
                return;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(sCatExecutor, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.BootAPICatMonitor.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30dc1c1f5b7fcb45dba9f9496e250e07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30dc1c1f5b7fcb45dba9f9496e250e07");
                        return;
                    }
                    com.sankuai.waimai.platform.capacity.log.c a2 = com.sankuai.waimai.platform.capacity.log.c.a();
                    long j2 = j;
                    a2.a(j2, BootAPICatMonitor.BOOT_MONITOR_PREFIX + str, i, i2, i3, i4, i5, i6);
                }

                @NonNull
                public final String toString() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ed31a02c0409d544be3a21e101fefca", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ed31a02c0409d544be3a21e101fefca");
                    }
                    return super.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2159976a917c5d72ec56c37e8a004000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2159976a917c5d72ec56c37e8a004000");
            return;
        }
        super.idleInit(application);
        launchFinished = true;
    }
}
