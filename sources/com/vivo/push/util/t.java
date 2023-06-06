package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class t {
    private static Boolean a;
    private static String b;

    public static com.vivo.push.model.b a(Context context) {
        com.vivo.push.model.b f;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        com.vivo.push.model.b d = d(applicationContext);
        if (d != null) {
            p.d("PushPackageUtils", "get system push info :".concat(String.valueOf(d)));
            return d;
        }
        List<String> e = e(applicationContext);
        com.vivo.push.model.b f2 = f(applicationContext, applicationContext.getPackageName());
        if (e.size() <= 0) {
            if (f2 != null && f2.d()) {
                d = f2;
            }
            p.a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            com.vivo.push.model.b bVar = null;
            String a2 = y.b(applicationContext).a("com.vivo.push.cur_pkg", null);
            com.vivo.push.model.b bVar2 = (TextUtils.isEmpty(a2) || !a(applicationContext, a2, "com.vivo.pushservice.action.METHOD") || (bVar2 = f(applicationContext, a2)) == null || !bVar2.d()) ? null : null;
            f2 = (f2 == null || !f2.d()) ? null : null;
            if (bVar2 == null) {
                bVar2 = null;
            }
            if (f2 != null && (bVar2 == null || (!f2.c() ? bVar2.c() || f2.b() > bVar2.b() : bVar2.c() && f2.b() > bVar2.b()))) {
                bVar2 = f2;
            }
            HashMap hashMap = new HashMap();
            if (bVar2 == null) {
                bVar2 = null;
            } else if (!bVar2.c()) {
                bVar = bVar2;
                bVar2 = null;
            }
            int size = e.size();
            com.vivo.push.model.b bVar3 = bVar;
            com.vivo.push.model.b bVar4 = bVar2;
            d = bVar3;
            for (int i = 0; i < size; i++) {
                String str = e.get(i);
                if (!TextUtils.isEmpty(str) && (f = f(applicationContext, str)) != null) {
                    hashMap.put(str, f);
                    if (f.d()) {
                        if (f.c()) {
                            if (bVar4 == null || f.b() > bVar4.b()) {
                                bVar4 = f;
                            }
                        } else if (d == null || f.b() > d.b()) {
                            d = f;
                        }
                    }
                }
            }
            if (d == null) {
                p.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                d = bVar4;
            }
        }
        if (d != null) {
            if (d.c()) {
                p.a(applicationContext, "查找最优包为:" + d.a() + CommonConstant.Symbol.BRACKET_LEFT + d.b() + ", Black)");
                p.d("PushPackageUtils", "finSuitablePushPackage" + d.a() + CommonConstant.Symbol.BRACKET_LEFT + d.b() + ", Black)");
            } else {
                p.a(applicationContext, "查找最优包为:" + d.a() + CommonConstant.Symbol.BRACKET_LEFT + d.b() + CommonConstant.Symbol.BRACKET_RIGHT);
                p.d("PushPackageUtils", "finSuitablePushPackage" + d.a() + CommonConstant.Symbol.BRACKET_LEFT + d.b() + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } else {
            p.b(applicationContext, "查找最优包为空!");
            p.d("PushPackageUtils", "finSuitablePushPackage is null");
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.database.Cursor] */
    public static String b(Context context) {
        Exception e;
        String str;
        if (TextUtils.isEmpty(b)) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    context = context.getContentResolver().query(com.vivo.push.p.a, null, null, null, null);
                } catch (Exception e2) {
                    p.a("PushPackageUtils", "close", e2);
                }
            } catch (Exception e3) {
                context = 0;
                e = e3;
                str = null;
            } catch (Throwable th2) {
                th = th2;
                context = 0;
                if (context != 0) {
                    try {
                        context.close();
                    } catch (Exception e4) {
                        p.a("PushPackageUtils", "close", e4);
                    }
                }
                throw th;
            }
            if (context != 0) {
                str = null;
                boolean z = false;
                while (context.moveToNext()) {
                    try {
                        if ("pushPkgName".equals(context.getString(context.getColumnIndex("name")))) {
                            str = context.getString(context.getColumnIndex("value"));
                        } else if ("pushEnable".equals(context.getString(context.getColumnIndex("name")))) {
                            z = Boolean.parseBoolean(context.getString(context.getColumnIndex("value")));
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                }
                b = str;
                if (TextUtils.isEmpty(str)) {
                    if (context != 0) {
                        try {
                            context.close();
                        } catch (Exception e6) {
                            p.a("PushPackageUtils", "close", e6);
                        }
                    }
                    return null;
                } else if (z) {
                    if (context != 0) {
                        context.close();
                    }
                    return str;
                } else {
                    if (context != 0) {
                        try {
                            context.close();
                        } catch (Exception e7) {
                            p.a("PushPackageUtils", "close", e7);
                        }
                    }
                    return null;
                }
            }
            try {
                p.a("PushPackageUtils", "cursor is null");
                if (context != 0) {
                    try {
                        context.close();
                    } catch (Exception e8) {
                        p.a("PushPackageUtils", "close", e8);
                    }
                }
                return null;
            } catch (Exception e9) {
                str = null;
                e = e9;
            }
            p.a("PushPackageUtils", "getSystemPush", e);
            if (context != 0) {
                context.close();
            }
            return str;
        }
        return b;
    }

    private static com.vivo.push.model.b d(Context context) {
        String b2 = b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        com.vivo.push.model.b bVar = new com.vivo.push.model.b(b2);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(b2, 128);
            if (packageInfo != null) {
                bVar.a(packageInfo.versionCode);
                bVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.a(z.a(context, b2));
            }
            bVar.a(a(context, bVar.b()));
            bVar.b(a(context, b2));
            return bVar;
        } catch (Exception e) {
            e.printStackTrace();
            p.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e);
            return null;
        }
    }

    private static com.vivo.push.model.b f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str)) {
            if (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE")) {
                com.vivo.push.model.b bVar = new com.vivo.push.model.b(str);
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                    if (packageInfo != null) {
                        bVar.a(packageInfo.versionCode);
                        bVar.a(packageInfo.versionName);
                        applicationInfo = packageInfo.applicationInfo;
                    } else {
                        applicationInfo = null;
                    }
                    if (applicationInfo != null) {
                        bVar.a(z.a(context, str));
                    }
                    bVar.b(a(context, str));
                    bVar.a(a(context, bVar.b()));
                    return bVar;
                } catch (Exception e) {
                    p.a("PushPackageUtils", "getPushPackageInfo exception: ", e);
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            p.a("PushPackageUtils", "isEnablePush error: can not find push service.");
            return false;
        }
        int size = queryIntentServices.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryIntentServices.get(i);
            if (resolveInfo != null && resolveInfo.serviceInfo != null) {
                String str2 = resolveInfo.serviceInfo.name;
                boolean z2 = resolveInfo.serviceInfo.exported;
                if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                    boolean z3 = resolveInfo.serviceInfo.enabled;
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                    boolean z4 = true;
                    if (componentEnabledSetting != 1 && (componentEnabledSetting != 0 || !z3)) {
                        z4 = false;
                    }
                    z = z4;
                }
            }
        }
        return z;
    }

    private static boolean a(Context context, long j) {
        com.vivo.push.cache.d a2 = com.vivo.push.cache.b.a().a(context);
        if (a2 != null) {
            return a2.isInBlackList(j);
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        return list != null && list.size() > 0;
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    public static boolean e(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    private static List<String> e(Context context) {
        List<ResolveInfo> list;
        g.a("findAllCoreClientPush");
        ArrayList arrayList = new ArrayList();
        try {
            list = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = list.get(i);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            p.d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    private static String g(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA256").digest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            p.a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e)));
            return null;
        }
    }

    public static boolean c(Context context) {
        ProviderInfo resolveContentProvider;
        if (a != null) {
            return a.booleanValue();
        }
        String str = null;
        if (context != null && !TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (resolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = resolveContentProvider.packageName;
        }
        Boolean valueOf = Boolean.valueOf("BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(g(context, str)));
        a = valueOf;
        return valueOf.booleanValue();
    }

    public static int b(Context context, String str) {
        int i = a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i;
    }
}
