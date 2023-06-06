package com.sankuai.waimai.mach.manager_new.monitor;

import android.os.SystemClock;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.manager_new.common.c;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "0";
    private static String c = "1";

    private static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b8cc740e2aaa582309e4c536bd5e429", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b8cc740e2aaa582309e4c536bd5e429")).intValue();
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                return 0;
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d66281b9825e8097e0906fb0a7dc6bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d66281b9825e8097e0906fb0a7dc6bd");
            return;
        }
        c.b("syncLoadMachBundle | bundle not initialized ！！");
        HashMap hashMap = new HashMap();
        hashMap.put("version", com.alipay.sdk.widget.c.d);
        hashMap.put("biz", str2);
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, str);
        hashMap.put("machId", str3);
        hashMap.put("presetMachId", str4);
        if (i.a().e() != null) {
            i.a().e().a("mach_sdk_init", "SDK未初始化完成，即任务调用", "", hashMap);
            return;
        }
        try {
            com.dianping.codelog.b.b(a.class, "onSDKNotInit", new JSONObject(hashMap).toString());
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bbca9ab467f609d98097b65f6eaab0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bbca9ab467f609d98097b65f6eaab0f");
            return;
        }
        c.b("onLoadFault | meet fault ！！| " + str + " | " + str2);
        HashMap hashMap = new HashMap();
        hashMap.put("version", com.alipay.sdk.widget.c.d);
        hashMap.put("dir", str);
        hashMap.put("reason", str2);
        i.a().e().a("mch_v2_load_task_fault", "任务加载异常", "", hashMap);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0371a04e1a1f8e3da622b6fb7e041ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0371a04e1a1f8e3da622b6fb7e041ff");
            return;
        }
        c.b("onLoadFault | meet fault ！！| " + str);
        HashMap hashMap = new HashMap();
        hashMap.put("version", com.alipay.sdk.widget.c.d);
        hashMap.put("reason", str);
        i.a().e().a("mach_v2_task_fault", "IO队列任务异常", "", hashMap);
    }

    public static void a(MonitorManager monitorManager, String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9feb8a869910b059df6d450b5e1c60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9feb8a869910b059df6d450b5e1c60b");
            return;
        }
        c.e("syncLoadMachBundle | 同步加载网络磁盘模板成功 | " + str3);
        monitorManager.netTemplateLoadCatCustomReport(1, str, str2, str3, str4, b, 0);
        monitorManager.templateLoadCatCustomReport(1, str, str2, str3, str4, b, 0);
    }

    public static void a(MonitorManager monitorManager, String str, String str2, String str3, String str4, int i, long j) {
        int i2 = 5;
        Object[] objArr = {monitorManager, str, str2, str3, str4, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c8344d065bf0d9a983986398601e392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c8344d065bf0d9a983986398601e392");
            return;
        }
        c.c("syncLoadMachBundle | 同步加载网络磁盘模板失败 | " + str3);
        String str5 = b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0bc477de94925d3ed9e9cbaf4650827c", RobustBitConfig.DEFAULT_VALUE)) {
            if (i != 0) {
                switch (i) {
                    case 3:
                        i2 = 2;
                        break;
                    case 4:
                        i2 = 1;
                        break;
                    case 5:
                        i2 = 4;
                        break;
                    case 7:
                        i2 = 6;
                        break;
                    case 8:
                        i2 = 3;
                        break;
                }
            }
        } else {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0bc477de94925d3ed9e9cbaf4650827c")).intValue();
        }
        monitorManager.netTemplateLoadCatCustomReport(0, str, str2, str3, str4, str5, i2);
    }

    public static void b(MonitorManager monitorManager, String str, String str2, String str3, String str4, int i, long j) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cd5c20460a2a1e68ec6f61fd2b05561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cd5c20460a2a1e68ec6f61fd2b05561");
            return;
        }
        c.c("syncLoadMachBundle | 同步加载预置磁盘模板成功 | " + str3);
        monitorManager.templateLoadCatCustomReport(1, str, str2, str3, str4, b, 1);
        monitorManager.presetTemplateLoadCatCustomReport(1, str, str2, str3, str4, b, 0);
    }

    public static void a(MonitorManager monitorManager, String str, String str2, String str3, String str4, long j, int i, int i2) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e6906e8bb785158fd0adaa9b5339f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e6906e8bb785158fd0adaa9b5339f71");
            return;
        }
        c.c("syncLoadMachBundle | 同步加载预置磁盘模板失败 | " + str3);
        monitorManager.presetTemplateLoadCatCustomReport(0, str, str2, str3, str4, b, a(i2));
    }

    public static void a(MonitorManager monitorManager, String str, String str2, String str3, String str4, String str5, long j, int i, int i2) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, str5, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95ff1a06af528b3c203d013732193264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95ff1a06af528b3c203d013732193264");
            return;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
        c.b("syncLoadMachBundle | 同步加载模板失败 | " + str3 + " | " + str4 + " | 时间 = " + elapsedRealtime);
        HashMap hashMap = new HashMap();
        hashMap.put("version", com.alipay.sdk.widget.c.d);
        hashMap.put("biz", str2);
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, str);
        hashMap.put("machId", str3);
        hashMap.put("presetMachId", str4);
        hashMap.put("presetErrorCode", Integer.valueOf(i2));
        hashMap.put("netErrorCode", Integer.valueOf(i));
        hashMap.put("newUser", Boolean.valueOf(com.sankuai.waimai.mach.manager_new.b.a().d));
        i.a().e().a("mach_load_v2_sync", "模板", "同步加载Bundle失败", hashMap);
        monitorManager.loadBundleFailure(str5, str, str2, str3, new HashMap(), new CacheException(17807), elapsedRealtime);
        monitorManager.templateLoadCatCustomReport(0, str, str2, str4, str5, b, i2 != 0 ? 3 : 2);
    }

    public static void b(MonitorManager monitorManager, String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd43b75b94dbb5bf7739a41bb93732f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd43b75b94dbb5bf7739a41bb93732f3");
            return;
        }
        c.e("ASyncLoadMachBundle | 异步加载网络磁盘模板成功 | " + str3);
        monitorManager.netTemplateLoadCatCustomReport(1, str, str2, str3, str4, c, 10);
        monitorManager.templateLoadCatCustomReport(1, str, str2, str3, str4, c, 0);
    }

    public static void a(MonitorManager monitorManager, String str, String str2, String str3, String str4, long j, int i) {
        int i2;
        Object[] objArr = {monitorManager, str, str2, str3, str4, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecf405bd0c6748ae11e67493daf34cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecf405bd0c6748ae11e67493daf34cb3");
            return;
        }
        c.c("aSyncLoadMachBundle | 异步加载网络磁盘模板失败 | " + str3);
        String str5 = c;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cd87ef22697a41bfb8c421f850168867", RobustBitConfig.DEFAULT_VALUE)) {
            switch (i) {
                case 2:
                    i2 = 11;
                    break;
                case 3:
                    i2 = 12;
                    break;
                case 4:
                    i2 = 13;
                    break;
                case 5:
                    i2 = 14;
                    break;
                default:
                    i2 = 15;
                    break;
            }
        } else {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cd87ef22697a41bfb8c421f850168867")).intValue();
        }
        monitorManager.netTemplateLoadCatCustomReport(0, str, str2, str3, str4, str5, i2);
    }

    public static void b(MonitorManager monitorManager, String str, String str2, String str3, String str4, long j, int i) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94c94fbe43846a62a4e3c0b720103980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94c94fbe43846a62a4e3c0b720103980");
            return;
        }
        c.e("ASyncLoadMachBundle | 异步加载预置磁盘模板成功 | " + str3);
        monitorManager.presetTemplateLoadCatCustomReport(1, str, str2, str3, str4, b, 0);
        monitorManager.templateLoadCatCustomReport(1, str, str2, str3, str4, c, 1);
    }

    public static void b(MonitorManager monitorManager, String str, String str2, String str3, String str4, long j, int i, int i2) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9de00ae2a8dce9b5cbdc6f5c33f51e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9de00ae2a8dce9b5cbdc6f5c33f51e76");
            return;
        }
        c.c("aSyncLoadMachBundle | 异步加载预置磁盘模板失败 | " + str3);
        monitorManager.presetTemplateLoadCatCustomReport(0, str, str2, str3, str4, b, a(i2));
    }

    public static void b(MonitorManager monitorManager, String str, String str2, String str3, String str4, String str5, long j, int i, int i2) {
        Object[] objArr = {monitorManager, str, str2, str3, str4, str5, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e5af39074e46dc8bcfd93653e9c7ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e5af39074e46dc8bcfd93653e9c7ef6");
            return;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
        c.b("aSyncLoadMachBundle | 异步加载模板失败 | " + str3 + " | " + str4 + " | 时间 = " + elapsedRealtime);
        monitorManager.templateLoadCatCustomReport(0, str, str2, str4, str5, c, i2 != 0 ? 3 : 2);
        HashMap hashMap = new HashMap();
        hashMap.put("version", com.alipay.sdk.widget.c.d);
        hashMap.put("biz", str2);
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, str);
        hashMap.put("machId", str3);
        hashMap.put("presetMachId", str4);
        hashMap.put("presetErrorCode", Integer.valueOf(i2));
        hashMap.put("netErrorCode", Integer.valueOf(i));
        hashMap.put("newUser", Boolean.valueOf(com.sankuai.waimai.mach.manager_new.b.a().d));
        i.a().e().a("mach_load_v2_asyc", "模板", "异步加载Bundle失败", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("version", com.alipay.sdk.widget.c.d);
        hashMap2.put("biz", str2);
        hashMap2.put(ShieldMonitorKey.TAG_BUSINESS, str);
        hashMap2.put("machId", str3);
        hashMap2.put("presetMachId", str4);
        hashMap2.put("presetErrorCode", Integer.valueOf(i2));
        hashMap2.put("netErrorCode", Integer.valueOf(i));
        monitorManager.loadBundleFailure(str5, str, str2, str3, hashMap2, new CacheException(17807), elapsedRealtime);
    }

    public static void a(String str, long j, long j2, long j3) {
        Object[] objArr = {str, new Long(j), new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9440b402539599263b09d07277635d0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9440b402539599263b09d07277635d0c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timeout", Long.valueOf(j));
        hashMap.put("interval", Long.valueOf(j2));
        hashMap.put("machId", str);
        hashMap.put("downloadInterval", Long.valueOf(j3));
        i.a().e().a("mach_load_v2_async_timeout", "异步加载", "加载超时", hashMap);
    }

    public static void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c085e5f2b525cc349a9b530ad16bd04f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c085e5f2b525cc349a9b530ad16bd04f");
        } else if (z) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("machId", str);
            hashMap.put("isNewUser", Boolean.valueOf(z));
            i.a().e().a("mach_config_v2_miss", "配置异常", "缺少配置", hashMap);
            c.b("onConfigMiss | 缺少配置 " + str);
        }
    }

    public static void b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "370cfd8994fbe87ae8965ff8f876f25a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "370cfd8994fbe87ae8965ff8f876f25a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("machId", str);
        hashMap.put("isNewUser", Boolean.valueOf(z));
        i.a().e().a("mach_config_v2_no_match", "配置异常", "MachID无法匹配到运行时状态", hashMap);
        c.b("onConfigNoMatch | MachID无法匹配到运行时状态 | " + str);
    }
}
