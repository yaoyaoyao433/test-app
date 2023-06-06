package com.dianping.base.push.pushservice.friends;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Time;
import com.dianping.base.push.pushservice.friends.a;
import com.dianping.base.push.pushservice.util.e;
import com.dianping.base.push.pushservice.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private static List<a> c = new CopyOnWriteArrayList();
    private static String d = "";
    private static String e = "";
    private static String f = "";
    private static String g = "";
    private static Random h = new Random();
    private static String i = "";

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6b7ec4f28f26b7eb436b50205257872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6b7ec4f28f26b7eb436b50205257872");
            return;
        }
        com.dianping.base.push.pushservice.c.b(b, "reading ROM Version");
        i = e.a();
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b585599629fbdddc0aa9e416ea04bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b585599629fbdddc0aa9e416ea04bf6");
            return;
        }
        com.dianping.base.push.pushservice.c.b(b, "init FriendsWakeUpManager");
        if (context == null) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(h.a(), new Runnable() { // from class: com.dianping.base.push.pushservice.friends.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecdc8a4c784a5b217b106f18aa22d2d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecdc8a4c784a5b217b106f18aa22d2d1");
                    return;
                }
                b.f(context);
                b.a();
                if (b.c.size() <= 0) {
                    b.g(context);
                    b.i(context);
                }
            }
        });
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8059bd1489b145a713b1bf3627dee4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8059bd1489b145a713b1bf3627dee4a");
        } else if (context == null) {
        } else {
            com.dianping.base.push.pushservice.c.b(b, "reloadConfig");
            f(context);
            c.clear();
            g(context);
            i(context);
        }
    }

    public static void a(Context context, Intent intent) {
        boolean z;
        long nextInt;
        boolean z2;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "119f9618dee10a427cf7d69dc398bf12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "119f9618dee10a427cf7d69dc398bf12");
        } else if (context != null && intent != null) {
            if ("com.dianping.push.START".equals(intent.getAction())) {
                String a2 = f.a(intent, "source");
                if (!TextUtils.isEmpty(a2) && a2.equals(context.getPackageName()) && com.dianping.base.push.pushservice.util.d.a(context) && c()) {
                    Object[] objArr2 = {context};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9b0aae0736b9e1f17a72202400b8eaa0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9b0aae0736b9e1f17a72202400b8eaa0");
                        return;
                    }
                    com.dianping.base.push.pushservice.c.b(b, "start to wake up by app launch");
                    if (context == null || c.isEmpty()) {
                        return;
                    }
                    try {
                        boolean z3 = false;
                        for (int size = c.size() - 1; size >= 0; size--) {
                            a aVar = c.get(size);
                            Random random = h;
                            Object[] objArr3 = {context, random};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7fb6fe7651ab7687454addb01c64b7ee", RobustBitConfig.DEFAULT_VALUE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7fb6fe7651ab7687454addb01c64b7ee")).booleanValue();
                            } else {
                                if (aVar.j != d.APP_FIRST_LAUNCH) {
                                    com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + ": MODE != APP_FIRST_LAUNCH, won't wakeup");
                                } else {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e6eeb35fcc126c60d7a6c769574f548f", RobustBitConfig.DEFAULT_VALUE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e6eeb35fcc126c60d7a6c769574f548f")).booleanValue();
                                    } else {
                                        Time time = new Time();
                                        time.set(aVar.n);
                                        Time time2 = new Time();
                                        time2.setToNow();
                                        z = time.yearDay != time2.yearDay;
                                    }
                                    if (z) {
                                        com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + " is first launch of the day");
                                        if (aVar.k >= 0 && aVar.l >= 0) {
                                            if (aVar.l > aVar.k) {
                                                nextInt = (random.nextInt((int) (aVar.l - aVar.k)) + aVar.k) * 1000;
                                            } else {
                                                nextInt = aVar.k * 1000;
                                            }
                                        } else {
                                            nextInt = (random.nextInt(240) + 60) * 1000;
                                        }
                                        aVar.n = System.currentTimeMillis() + nextInt;
                                        com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + " will be woke up in " + nextInt + " ms");
                                        new Handler().postDelayed(new a.RunnableC0057a(context, aVar), nextInt);
                                        z2 = true;
                                    } else {
                                        com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + " is not first launch of the day, won't wakeup");
                                    }
                                }
                                z2 = false;
                            }
                            if (z2) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            j(context);
                        }
                    } catch (Throwable th) {
                        com.dianping.base.push.pushservice.c.d(b, th.toString());
                    }
                }
            } else if ("com.dianping.push.RECONNECT".equals(intent.getAction()) && c()) {
                h(context);
            }
        }
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d38b2ca07e2594d90831c1a7a011fe1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d38b2ca07e2594d90831c1a7a011fe1a")).booleanValue();
        }
        if (c.size() <= 0) {
            com.dianping.base.push.pushservice.c.b(b, "can't get installed pkgs or config is empty, won't wake up");
            return false;
        } else if (d()) {
            com.dianping.base.push.pushservice.c.b(b, "device is excluded, won't wake up");
            return false;
        } else {
            return true;
        }
    }

    private static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6560f3e4c287e4757463b2b23ca6dcc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6560f3e4c287e4757463b2b23ca6dcc3")).booleanValue();
        }
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(Build.BRAND) && d.contains(Build.BRAND.toLowerCase())) {
            String str = b;
            com.dianping.base.push.pushservice.c.b(str, "excludeBrand = " + Build.BRAND);
            return true;
        } else if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(Build.VERSION.RELEASE) && e.contains(Build.VERSION.RELEASE.toLowerCase())) {
            String str2 = b;
            com.dianping.base.push.pushservice.c.b(str2, "excludeOS = " + Build.VERSION.RELEASE);
            return true;
        } else if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(Build.MODEL) && f.contains(Build.MODEL.toLowerCase())) {
            String str3 = b;
            com.dianping.base.push.pushservice.c.b(str3, "excludeModel = " + Build.MODEL);
            return true;
        } else if (TextUtils.isEmpty(g) || TextUtils.isEmpty(i) || !g.contains(i.toLowerCase())) {
            return false;
        } else {
            String str4 = b;
            com.dianping.base.push.pushservice.c.b(str4, "excludeROM = " + i);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0feeb82ff2a2661d395ef328c9aab69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0feeb82ff2a2661d395ef328c9aab69");
            return;
        }
        com.dianping.base.push.pushservice.c.b(b, "reading Exclude Devices");
        try {
            d = com.dianping.base.push.pushservice.d.a(context).a("wakeExcludeBrand", "").toLowerCase();
            e = com.dianping.base.push.pushservice.d.a(context).a("wakeExcludeOS", "").toLowerCase();
            f = com.dianping.base.push.pushservice.d.a(context).a("wakeExcludeModel", "").toLowerCase();
            g = com.dianping.base.push.pushservice.d.a(context).a("wakeExcludeROM", "").toLowerCase();
        } catch (Exception e2) {
            com.dianping.base.push.pushservice.c.d(b, e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Context context) {
        String str;
        JSONArray jSONArray;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "596be687a3f880059f8f249e66c34a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "596be687a3f880059f8f249e66c34a9d");
            return;
        }
        com.dianping.base.push.pushservice.c.b(b, "reading App Configs");
        try {
            str = com.dianping.base.push.pushservice.d.a(context).a("friendsConfig", "");
        } catch (Exception e2) {
            com.dianping.base.push.pushservice.c.d(b, e2.toString());
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e3) {
            com.dianping.base.push.pushservice.c.d(b, e3.toString());
            jSONArray = null;
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("pkg");
                if (a(context, string)) {
                    c.add(new a(context, jSONObject));
                } else {
                    com.dianping.base.push.pushservice.c.b(b, string + " is not installed");
                }
            } catch (Exception e4) {
                com.dianping.base.push.pushservice.c.d(b, e4.toString());
            }
        }
    }

    private static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76cefbd2f575a2c7e121b028abf54fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76cefbd2f575a2c7e121b028abf54fa0")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e2) {
            com.dianping.base.push.pushservice.c.d(b, e2.toString());
            return false;
        }
    }

    private static void h(Context context) {
        boolean z;
        long j;
        boolean z2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3bb63fe9ab6ca6a30a852f3280f9b14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3bb63fe9ab6ca6a30a852f3280f9b14");
            return;
        }
        com.dianping.base.push.pushservice.c.b(b, "start to wake up if app need");
        if (context == null) {
            return;
        }
        boolean z3 = false;
        for (int size = c.size() - 1; size >= 0; size--) {
            a aVar = c.get(size);
            Random random = h;
            Object[] objArr2 = {context, random};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ceb44242e4a1387036c0b08fa6a31b2b", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ceb44242e4a1387036c0b08fa6a31b2b")).booleanValue();
            } else {
                if (aVar.j != d.ALWAYS) {
                    com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + ": MODE != ALWAYS, won't wakeup");
                } else if (SystemClock.elapsedRealtime() > aVar.n && SystemClock.elapsedRealtime() - aVar.n < aVar.m * 1000) {
                    com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + " try to wakeup again less than " + aVar.m + "s, won't wakeup");
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "625bce3e26cea56b8071aeb09d2a41b5", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "625bce3e26cea56b8071aeb09d2a41b5")).booleanValue();
                    } else {
                        if (aVar.k >= 0 && aVar.l > 0 && aVar.k < aVar.l) {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "97d7c47a51eec5ec6bfd46322be90dd8", RobustBitConfig.DEFAULT_VALUE)) {
                                j = ((Long) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "97d7c47a51eec5ec6bfd46322be90dd8")).longValue();
                            } else {
                                Time time = new Time();
                                time.setToNow();
                                j = (time.hour * 60 * 60) + (time.minute * 60) + time.second;
                            }
                            if (aVar.k > j || j > aVar.l) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        long nextInt = random.nextInt(120) * 1000;
                        aVar.n = SystemClock.elapsedRealtime() + nextInt;
                        com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + " will be woke up in " + nextInt + " ms");
                        new Handler().postDelayed(new a.RunnableC0057a(context, aVar), nextInt);
                        z2 = true;
                    } else {
                        com.dianping.base.push.pushservice.c.b("FriendAppInfo", aVar.b + " is beyond wakeup term, won't wakeup");
                    }
                }
                z2 = false;
            }
            if (z2) {
                z3 = true;
            }
        }
        if (z3) {
            j(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Context context) {
        String str;
        JSONObject jSONObject;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97b99d5a7be59e91ba4edd54f0c842fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97b99d5a7be59e91ba4edd54f0c842fc");
        } else if (context != null) {
            try {
                str = com.dianping.base.push.pushservice.d.a(context).a("friendsElapse", "");
            } catch (Exception e2) {
                com.dianping.base.push.pushservice.c.d(b, e2.toString());
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e3) {
                com.dianping.base.push.pushservice.c.d(b, e3.toString());
                jSONObject = null;
            }
            if (jSONObject != null) {
                for (int size = c.size() - 1; size >= 0; size--) {
                    try {
                        c.get(size).a(jSONObject.optLong(c.get(size).b, 0L));
                    } catch (Exception e4) {
                        com.dianping.base.push.pushservice.c.d(b, e4.toString());
                    }
                }
            }
        }
    }

    private static void j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb0ab31481bf83d3f24c562e5289800f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb0ab31481bf83d3f24c562e5289800f");
        } else if (context != null) {
            JSONObject jSONObject = new JSONObject();
            for (int size = c.size() - 1; size >= 0; size--) {
                try {
                    jSONObject.put(c.get(size).b, c.get(size).n);
                } catch (Exception e2) {
                    com.dianping.base.push.pushservice.c.d(b, e2.toString());
                }
            }
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return;
            }
            try {
                com.dianping.base.push.pushservice.d.a(context).b("friendsElapse", jSONObject.toString());
            } catch (Exception e3) {
                com.dianping.base.push.pushservice.c.d(b, e3.toString());
            }
        }
    }
}
