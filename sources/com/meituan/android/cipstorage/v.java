package com.meituan.android.cipstorage;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.cipstorage.af;
import com.meituan.android.cipstorage.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class v {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static volatile Context c;
    public static volatile ad e;
    public static volatile af f;
    public static volatile ac g;
    private static String i;
    private static final Object h = new Object();
    public static volatile boolean d = false;

    public static void a(String str, String str2, long j, Map<String, Object> map) {
        Object[] objArr = {str, str2, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3de00e507d8b4676ec37636f0ae4ea7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3de00e507d8b4676ec37636f0ae4ea7a");
        }
    }

    public static void a(String str, String str2, long j, Map<String, Object> map, boolean z) {
        Object[] objArr = {str, str2, new Long(j), map, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bdd1b7367df4ae2abd089a12d368907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bdd1b7367df4ae2abd089a12d368907");
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ada3a4262b76bbbf9f3ec44afe37d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ada3a4262b76bbbf9f3ec44afe37d2");
        }
        synchronized (h) {
            if (TextUtils.isEmpty(i)) {
                return "user";
            }
            return i;
        }
    }

    public static void a(Context context, h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81c538644581ecb51789ae6ba686edeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81c538644581ecb51789ae6ba686edeb");
        } else if (d) {
        } else {
            if (context == null && c == null) {
                throw new c((short) 1);
            }
            synchronized (v.class) {
                if (d) {
                    return;
                }
                if (c == null) {
                    Context applicationContext = context.getApplicationContext();
                    c = applicationContext == null ? context : applicationContext;
                }
                Object[] objArr2 = {hVar, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a64c5f88f2f4dab1625963ab79ed1d57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a64c5f88f2f4dab1625963ab79ed1d57");
                } else {
                    h hVar2 = hVar == null ? new h.a().b : hVar;
                    synchronized (v.class) {
                        b = hVar2.b;
                        g = hVar2.e;
                        if (e == null) {
                            ad adVar = hVar2.c;
                            if (adVar == null) {
                                adVar = new z();
                            }
                            e = adVar;
                        }
                        af afVar = hVar2.d;
                        if (afVar != null) {
                            f = afVar;
                        } else if (f == null) {
                            f = new af.b();
                        }
                    }
                }
                y.a(c);
                d = MMKV.a();
                e.c(new Runnable() { // from class: com.meituan.android.cipstorage.v.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9319a5e4c72f8727a4556672ac585721", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9319a5e4c72f8727a4556672ac585721");
                            return;
                        }
                        try {
                            j.a();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "279f13f973dfa9908fa9fea5612f145f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "279f13f973dfa9908fa9fea5612f145f");
        } else {
            a(str, "", 0L, map);
        }
    }

    public static void a(String str, long j, Map<String, Long> map) {
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cd72cb0239425e2c678ddabd228a0d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cd72cb0239425e2c678ddabd228a0d8");
        } else if (j > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("category", str);
            hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Long.valueOf(j));
            if (map != null && !map.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, Long> entry : map.entrySet()) {
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb.append(entry.getKey());
                    sb.append("#");
                    sb.append(entry.getValue());
                }
                hashMap.put("path", sb.substring(1));
            }
            a("cips.clean", hashMap);
        }
    }
}
