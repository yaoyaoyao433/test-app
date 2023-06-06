package com.dianping.base.push.pushservice;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.base.push.pushservice.dp.DPPushService;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.tencent.smtt.sdk.TbsListener;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static ChangeQuickRedirect a = null;
    public static String b = "";
    public static String c = "";
    public static int d;
    public static b f;
    public static a j;
    private static com.dianping.base.push.pushservice.monitor.a k;
    private static Context n;
    private static a[] o;
    private static int p;
    public static h e = new com.dianping.base.push.pushservice.a();
    public static boolean g = false;
    public static boolean h = true;
    public static boolean i = false;
    private static boolean l = false;
    private static int m = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        boolean a(Context context);

        void b(Context context);
    }

    public static void a(final Context context, h hVar, String str, int i2) {
        boolean z = true;
        Object[] objArr = {context, hVar, str, 11};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f493c961a1e6b83e692cdc087be808b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f493c961a1e6b83e692cdc087be808b");
            return;
        }
        Object[] objArr2 = {context, hVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bb40b551c9c808b9fc445079015fade7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bb40b551c9c808b9fc445079015fade7");
        } else if (n == null) {
            n = context.getApplicationContext();
            e = hVar;
            c = str;
            b = n.getPackageName();
            d = n.getApplicationInfo().targetSdkVersion;
            if (e.a()) {
                c.b = 2;
            } else {
                c.b = Integer.MAX_VALUE;
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5f0da5dbda9a51e478566c709683f914", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5f0da5dbda9a51e478566c709683f914")).booleanValue();
            } else {
                String currentProcessName = ProcessUtils.getCurrentProcessName(context);
                if (TextUtils.isEmpty(currentProcessName) || !currentProcessName.endsWith(":dppushservice")) {
                    z = false;
                }
            }
            if (z) {
                com.sankuai.waimai.launcher.util.aop.b.a(com.dianping.base.push.pushservice.util.h.a(), new Runnable() { // from class: com.dianping.base.push.pushservice.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "31bf0c5f8a45c4083c9f5e29540de65e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "31bf0c5f8a45c4083c9f5e29540de65e");
                        } else {
                            SDKInfoManager.a("push").a(context, "4.5.20.1", 1, new SDKInfoManager.a() { // from class: com.dianping.base.push.pushservice.f.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                                public final boolean a(String str2) {
                                    Object[] objArr5 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e2c89f929a0c021d8f32dabb875dc63a", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e2c89f929a0c021d8f32dabb875dc63a")).booleanValue();
                                    }
                                    c.d("Push", "interceptForceManage");
                                    f.c(context);
                                    return true;
                                }

                                @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                                public final boolean b(String str2) {
                                    Object[] objArr5 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6f6c654cd50593b404c57e5720ebe440", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6f6c654cd50593b404c57e5720ebe440")).booleanValue();
                                    }
                                    c.d("Push", "interceptNormanManage");
                                    return true;
                                }

                                @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                                public final void c(String str2) {
                                    Object[] objArr5 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e1001c0371009560e4361abc71d5db17", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e1001c0371009560e4361abc71d5db17");
                                    } else {
                                        super.c(str2);
                                    }
                                }

                                @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                                public final void d(String str2) {
                                    Object[] objArr5 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "182793f4238312774541c68757655f30", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "182793f4238312774541c68757655f30");
                                    } else {
                                        super.d(str2);
                                    }
                                }
                            });
                        }
                    }
                });
                i a2 = i.a(context);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = i.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "af246febff950013748e41d73bb88364", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "af246febff950013748e41d73bb88364");
                } else {
                    a2.a(0);
                }
                Statistics.initStatistics(context);
            }
        }
        m = 11;
    }

    public static com.dianping.base.push.pushservice.monitor.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d67520032f3def6834a021c645b00e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.base.push.pushservice.monitor.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d67520032f3def6834a021c645b00e9");
        }
        if (n == null) {
            Log.e("Push", "Push is not initialized!");
            return null;
        }
        if (k == null) {
            synchronized (f.class) {
                if (k == null) {
                    if (m <= 0) {
                        m = TbsListener.ErrorCode.ERROR_QBSDK_INIT_ISSUPPORT;
                    }
                    k = new com.dianping.base.push.pushservice.monitor.b(n, m);
                }
            }
        }
        return k;
    }

    public static Context b() {
        return n;
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5861787b1264f2a024cb7d5bca4d99c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5861787b1264f2a024cb7d5bca4d99c5");
            return;
        }
        c.a("Push", "setCloseBG true");
        i = true;
    }

    public static void a(Context context) {
        boolean z;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11a6b0d71cd9fd38b0ce070433dbf6f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11a6b0d71cd9fd38b0ce070433dbf6f7");
            return;
        }
        boolean b2 = b(context);
        c.a("Push", "startPushService isMainProcess" + b2);
        if (b2) {
            if (j == null && o != null) {
                for (int i2 = 0; i2 < p; i2++) {
                    a aVar = o[i2];
                    Object[] objArr2 = {context, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0a741ea91ad42d1a2b95f6681f39033d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0a741ea91ad42d1a2b95f6681f39033d");
                    } else {
                        try {
                            Object[] objArr3 = {context, aVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8cab6e8ebf1574220d9f97d87f8cb2fa", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8cab6e8ebf1574220d9f97d87f8cb2fa")).booleanValue();
                            } else {
                                if (!l) {
                                    if (aVar.a() == 11) {
                                        c.a("Push", "fcm is in use");
                                        l = true;
                                        if (j != null) {
                                            j = null;
                                        }
                                        if (aVar.a(context)) {
                                            j = aVar;
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                                z = true;
                            }
                            if (!z && aVar.a(context)) {
                                StringBuilder sb = new StringBuilder("set mPushWrapper, before is null? ");
                                sb.append(j == null);
                                sb.append(" channelId=");
                                sb.append(aVar.a());
                                c.a("PushEnable", sb.toString());
                                j = aVar;
                            }
                        } catch (Exception e2) {
                            c.d("Push", e2.toString());
                        }
                    }
                }
            }
            if (j != null) {
                j.b(context);
            }
            Object[] objArr4 = {context};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b6b4f11039279c8ee13f8f78c37ae43a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b6b4f11039279c8ee13f8f78c37ae43a");
            } else {
                try {
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, PhoneStatusReceiver.class), 1, 1);
                } catch (Throwable th) {
                    c.d("Push", th.toString());
                }
            }
            a(context, context.getApplicationContext().getPackageName());
        }
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bb1287b4ff1acf86c5685b09d1be72e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bb1287b4ff1acf86c5685b09d1be72e")).booleanValue() : ProcessUtils.isMainProcess(context);
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "108bec8d372eea8467ac40286eb27273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "108bec8d372eea8467ac40286eb27273");
            return;
        }
        c.a("Push", "startPushService source = " + str);
        if (h && Build.VERSION.SDK_INT >= 21 && !PushWakeUpJob.c(context)) {
            PushWakeUpJob.a(context);
        }
        DPPushService.a(context, str);
    }

    public static void b(boolean z) {
        int i2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "257516454c19bd8c0a347eaf327bbd35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "257516454c19bd8c0a347eaf327bbd35");
            return;
        }
        c.a("Push", "enterBG " + z + ", closeBG = " + i);
        if (i) {
            if (z) {
                Context context = n;
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b2b21d6b737c3cdcff0292020ebd3aa0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b2b21d6b737c3cdcff0292020ebd3aa0");
                    return;
                }
                try {
                    i2 = e.a(context).a("service_alive", 1);
                } catch (Exception e2) {
                    c.d("Push", e2.toString());
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        PushWakeUpJob.b(context);
                    }
                    c(context);
                    return;
                }
                return;
            }
            a(n);
        }
    }

    public static void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17338d0ab575d3ea6c6fc78837d2d4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17338d0ab575d3ea6c6fc78837d2d4db");
        } else {
            DPPushService.a(context);
        }
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e01cd02442e62679436edb805ffa60e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e01cd02442e62679436edb805ffa60e0");
        }
        try {
            return e.a(context).a("pushToken", "");
        } catch (Exception e2) {
            c.d("Push", e2.toString());
            return "";
        }
    }

    public static void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c36b43c6a483c8c3140a51552931f2a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c36b43c6a483c8c3140a51552931f2a6");
            return;
        }
        h hVar = e;
        Object[] objArr2 = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "2d7cd0fe4c2dd3d5d6c9283600591199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "2d7cd0fe4c2dd3d5d6c9283600591199");
            return;
        }
        try {
            String a2 = e.a(context).a("pushEnv", (String) null);
            if (z && !"beta".equals(a2)) {
                e.a(context).b("pushEnv", "beta");
                e.a(context).b("pushToken", "");
            } else if (z || PTFloatInfo.TYPE_PRODUCT.equals(a2)) {
            } else {
                e.a(context).b("pushEnv", PTFloatInfo.TYPE_PRODUCT);
                e.a(context).b("pushToken", "");
            }
        } catch (Exception e2) {
            c.d("PushEnvironment", e2.toString());
        }
    }

    public static boolean e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c9de0e747b152a8108fb42ff71c4a9d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c9de0e747b152a8108fb42ff71c4a9d")).booleanValue() : e.a(context);
    }

    public static void c(boolean z) {
        g = false;
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c025008cc418f70492593c3ab7299f3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c025008cc418f70492593c3ab7299f3f");
            return;
        }
        if (o == null) {
            o = new a[10];
            p = 0;
        }
        if (p < 10) {
            a[] aVarArr = o;
            int i2 = p;
            p = i2 + 1;
            aVarArr[i2] = aVar;
        }
    }

    public static NotificationChannel a(JSONObject jSONObject) {
        int i2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        NotificationChannelGroup notificationChannelGroup = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fc3d9dfa22a1b7f9b1862f2afbc9cb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (NotificationChannel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fc3d9dfa22a1b7f9b1862f2afbc9cb5");
        }
        if (jSONObject == null) {
            c.d("Push", "createNotificationChannel extra is null");
            return null;
        } else if (n == null) {
            c.d("Push", "push not init");
            return null;
        } else if (Build.VERSION.SDK_INT < 26) {
            return null;
        } else {
            String optString = jSONObject.optString("c_id");
            String optString2 = jSONObject.optString("c_name");
            String optString3 = jSONObject.optString("c_des");
            String optString4 = jSONObject.optString("c_imp");
            String optString5 = jSONObject.optString("c_group");
            String optString6 = jSONObject.optString("c_vib");
            String optString7 = jSONObject.optString("c_lock");
            String optString8 = jSONObject.optString("c_light");
            c.a("Push", "channelId = " + optString + ", channelName = " + optString2 + ", channelDesc = " + optString3 + ", channelImportance = " + optString4 + ", channelGroup = " + optString5 + ", channelVibration = " + optString6 + ", channelLock = " + optString7 + ", channelLight = " + optString8);
            NotificationManager notificationManager = (NotificationManager) n.getApplicationContext().getSystemService(RemoteMessageConst.NOTIFICATION);
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return null;
            }
            if (!TextUtils.isEmpty(optString5)) {
                notificationChannelGroup = new NotificationChannelGroup(optString5, optString5);
                notificationManager.createNotificationChannelGroup(notificationChannelGroup);
            }
            try {
                i2 = Integer.parseInt(optString4);
            } catch (Exception e2) {
                c.d("Push", e2.toString());
                i2 = 3;
            }
            NotificationChannel notificationChannel = new NotificationChannel(optString, optString2, i2);
            if (notificationChannelGroup != null) {
                notificationChannel.setGroup(notificationChannelGroup.getId());
            }
            if (!TextUtils.isEmpty(optString3)) {
                notificationChannel.setDescription(optString3);
            }
            notificationChannel.enableVibration("1".equals(optString6));
            if ("1".equals(optString7)) {
                notificationChannel.setLockscreenVisibility(1);
            } else {
                notificationChannel.setLockscreenVisibility(-1);
            }
            notificationChannel.enableLights("1".equals(optString8));
            notificationManager.createNotificationChannel(notificationChannel);
            return notificationChannel;
        }
    }
}
