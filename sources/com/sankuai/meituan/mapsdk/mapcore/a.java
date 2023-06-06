package com.sankuai.meituan.mapsdk.mapcore;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.cloudcontrol.b;
import com.sankuai.meituan.mapsdk.mapcore.config.MapConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static volatile a b = null;
    private static Context c = null;
    private static MapConfig e = null;
    private static String f = "";
    private static Platform g = Platform.NATIVE;
    private volatile SharedPreferences d;

    public static void a(Platform platform) {
        g = platform;
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971971dbd126a760c1d57d9b2afa2406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971971dbd126a760c1d57d9b2afa2406");
        } else {
            c = context.getApplicationContext();
        }
    }

    @Deprecated
    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a63097b4fd5fe033ded59afaef41da5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a63097b4fd5fe033ded59afaef41da5");
            return;
        }
        com.sankuai.meituan.mapfoundation.base.a.a(context);
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(context);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a23daaa4be746299edcdfb474b662a15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a23daaa4be746299edcdfb474b662a15");
                    } else {
                        com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                        c(PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "56dcc62be13f2bd1744811b0c1a024c8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "56dcc62be13f2bd1744811b0c1a024c8") : a2.b.getString("mt_map_sdk_config_json", ""));
                        com.sankuai.meituan.mapfoundation.cloudcontrol.a.a("MTMapConfig", new b() { // from class: com.sankuai.meituan.mapsdk.mapcore.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mapfoundation.cloudcontrol.b
                            public final void a(String str) {
                                Object[] objArr4 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "27efc5838bfc7f5f7541a72f4f36629f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "27efc5838bfc7f5f7541a72f4f36629f");
                                    return;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                com.sankuai.meituan.mapsdk.mapcore.preference.a a3 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                                Object[] objArr5 = {str};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                                if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "5ec774ac2e08afa33eda643964ba94c8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "5ec774ac2e08afa33eda643964ba94c8");
                                } else {
                                    a3.b.edit().putString("mt_map_sdk_config_json", str).apply();
                                }
                                a.c(str);
                            }
                        });
                    }
                }
            }
        }
    }

    @Deprecated
    public static Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17cdb91b9425dae2c5734131011e44d9", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17cdb91b9425dae2c5734131011e44d9");
        }
        char c2 = 65535;
        if (str.hashCode() == -475730188 && str.equals("STORAGE_PREFERENCES")) {
            c2 = 0;
        }
        if (c2 != 0) {
            return null;
        }
        a aVar = b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c0e81b3b47ca951933785e16d38a11d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c0e81b3b47ca951933785e16d38a11d0");
        }
        if (aVar.d == null) {
            aVar.d = com.sankuai.meituan.mapfoundation.storage.b.a("map_sdk");
        }
        return aVar.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "facd105997b244f204437d17e3adc5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "facd105997b244f204437d17e3adc5ca");
            return;
        }
        synchronized (MapConfig.class) {
            try {
                e = (MapConfig) new Gson().fromJson(str, (Class<Object>) MapConfig.class);
            } catch (Exception unused) {
                Context context = c;
                Class<?> cls = c.getClass();
                f.a(context, -1, "", cls, "parseMapConfig", 5101L, "horn_content=" + str, "MTMapAndroidStableExceptionStatus", 1.0f);
            }
        }
    }

    public static Context a() {
        return c;
    }

    public static MapConfig b() {
        return e;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "097316c3fb4f2fe96707d09c3a4a12ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "097316c3fb4f2fe96707d09c3a4a12ed");
        }
        if (TextUtils.isEmpty(f)) {
            f = com.sankuai.meituan.mapfoundation.mapuuid.a.a();
        }
        return f;
    }
}
