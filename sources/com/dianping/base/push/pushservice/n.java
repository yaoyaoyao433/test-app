package com.dianping.base.push.pushservice;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.liteav.audio.TXEAudioDef;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    public static ChangeQuickRedirect a;

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1d989b53d94ba900d4c686a793b6932", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1d989b53d94ba900d4c686a793b6932") : i == 4 ? "hwPushToken" : i == 2 ? "miRegId" : i == 5 ? "gtClientId" : i == 6 ? "mzPushId" : i == 9 ? "vivoPushId" : i == 8 ? "oPushId" : i == 11 ? "fcmToken" : "";
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74e619fd4499dba0352828e6f056b44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74e619fd4499dba0352828e6f056b44d");
        } else if (context == null) {
        } else {
            try {
                e.a(context).b("pushChannel", i);
            } catch (Exception e) {
                c.d("ThirdPartyTokenManager", e.toString());
            }
        }
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6437a406adc3a10e8f52f0c89348180", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6437a406adc3a10e8f52f0c89348180")).intValue();
        }
        try {
            return e.a(context).a("pushChannel", 1);
        } catch (Exception e) {
            c.d("ThirdPartyTokenManager", e.toString());
            return 1;
        }
    }

    private static void b(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "664a1f73d5bb6350763d8f8eb3b5f586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "664a1f73d5bb6350763d8f8eb3b5f586");
            return;
        }
        String a2 = a(i);
        if (context == null || TextUtils.isEmpty(a2)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            e.a(context).b(a2, str);
        } catch (Exception e) {
            c.d("ThirdPartyTokenManager", e.toString());
        }
    }

    public static String b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a60d2dbd133237ee267e35b9cd10074a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a60d2dbd133237ee267e35b9cd10074a");
        }
        String a2 = a(i);
        if (context == null || TextUtils.isEmpty(a2)) {
            return "";
        }
        try {
            return e.a(context).a(a2, "");
        } catch (Exception e) {
            c.d("ThirdPartyTokenManager", "getLocalToken exception:" + e);
            return "";
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5165b898f4da921ac985c5c11c619a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5165b898f4da921ac985c5c11c619a75");
        } else if (f.j != null) {
            b(context, f.j.a(), "");
        }
    }

    public static void a(final Context context, final int i, final String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cc890a7edb9a8b4921d05588fa56a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cc890a7edb9a8b4921d05588fa56a9f");
            return;
        }
        Object[] objArr2 = {context, Integer.valueOf(i), str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "28657ab52e2bea281621f2011113deb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "28657ab52e2bea281621f2011113deb9");
        } else if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                b(context, i, str);
            }
            final String d = f.d(context);
            String c = c(context);
            String d2 = d(context);
            a("trying bind thirdPartyToken,channel:" + i + ",saveThirdToken:true\n,thirdToken:" + str + "\n,pushToken:" + d + "\n,remoteThirdToken:" + d2 + "\n,remotePushToken:" + c);
            if (TextUtils.isEmpty(str)) {
                c.d("ThirdPartyTokenManager", "bindToken failed: thirdPartyToken is empty");
            } else if (TextUtils.isEmpty(d)) {
                c.d("ThirdPartyTokenManager", "bindToken failed: dppush token is empty");
                if (f.a() != null) {
                    f.a().pv4(0L, "pushbind", 0, 0, TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS, 0, 0, 0, null, null, 1);
                }
            } else if (d.equals(c) && str.equals(d2)) {
                c.a("ThirdPartyTokenManager", "no need to bind token");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(com.dianping.base.push.pushservice.util.h.a(), new Runnable() { // from class: com.dianping.base.push.pushservice.n.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:81:0x0219  */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x0226 A[Catch: IOException -> 0x0222, TRY_LEAVE, TryCatch #9 {IOException -> 0x0222, blocks: (B:83:0x021e, B:87:0x0226), top: B:96:0x021e }] */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 564
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.n.AnonymousClass1.run():void");
                    }
                });
            }
        }
    }

    private static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cd2c333c67fa573432437a0cbd787bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cd2c333c67fa573432437a0cbd787bf");
        }
        try {
            return e.a(context).a("remotepushtoken", "");
        } catch (Exception e) {
            c.d("ThirdPartyTokenManager", "getLocalToken exception:" + e);
            return "";
        }
    }

    private static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2fbd820de493c6cc33d15af313929bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2fbd820de493c6cc33d15af313929bb");
        }
        try {
            return e.a(context).a("remotethirdtoken", "");
        } catch (Exception e) {
            c.d("ThirdPartyTokenManager", "getLocalToken exception:" + e);
            return "";
        }
    }

    static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7668634d55431540af1577df58102644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7668634d55431540af1577df58102644");
        } else {
            c.b("ThirdPartyTokenManager", str);
        }
    }
}
