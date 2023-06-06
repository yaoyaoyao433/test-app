package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.base.a;
import com.sankuai.meituan.mapsdk.mapcore.net.e;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.utils.d;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.MTMapEnv;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MapsInitializer {
    @Deprecated
    public static final int MAP_BAIDU = 2;
    @Deprecated
    public static final int MAP_GAODE = 0;
    public static final int MAP_MTMAP = 3;
    public static final int MAP_TENCENT = 1;
    public static final int MAP_TYPE_CONFIG_UNSPECIFIED = -2;
    public static final int MAP_TYPE_UNSPECIFIED = -1;
    private static int b;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Deprecated
    private static Context g;
    @Deprecated
    public static String mSdcardCachePath;
    @Deprecated
    public static String mSoFilePath;
    private static MTMapEnv a = MTMapEnv.RELEASE;
    private static int c = -1;
    private static boolean d = false;
    private static volatile boolean e = true;
    private static boolean f = false;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MapType {
    }

    @Deprecated
    public static void setBaiduCustomMapStylePath(String str) {
    }

    @Deprecated
    public static void setBaiduCustomTextureMapStylePath(String str) {
    }

    @Deprecated
    public static void setBaiduMapSoDynamicLoad(String str, String str2) {
    }

    public static void setMTMapEnv(MTMapEnv mTMapEnv) {
        a = mTMapEnv;
    }

    public static MTMapEnv getMTMapEnv() {
        return a;
    }

    public static void setDebug(boolean z) {
        f = z;
    }

    public static boolean isDebug() {
        return f;
    }

    public static void initMapSDK(@NonNull Context context, int i, int i2, @NonNull String str, @NonNull String str2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "845e3b0e5c65fefd59f09b9556c85899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "845e3b0e5c65fefd59f09b9556c85899");
            return;
        }
        a.a(context, i2);
        com.sankuai.meituan.mapsdk.mapcore.a.a(context);
        Object[] objArr2 = {context, Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4f5445690c7f94d72f455708bc3b9fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4f5445690c7f94d72f455708bc3b9fcb");
        } else if (context != null) {
            g = context.getApplicationContext();
            if (!d) {
                Object[] objArr3 = {context, Integer.valueOf(i2), str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "f0c99cecf04a2d9dcc70336710907a5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "f0c99cecf04a2d9dcc70336710907a5c");
                } else {
                    com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                    String string = PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "f0678bf7114bc903a8a14acb60a41ad0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "f0678bf7114bc903a8a14acb60a41ad0") : a2.b.getString("map_key", "");
                    String a3 = com.sankuai.meituan.mapsdk.mapcore.utils.a.a(context);
                    if (a3 == null) {
                        c.e("MapsInitializer获取美团地图Key失败。");
                    } else if (!a3.equals(string)) {
                        Object[] objArr5 = {a3};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect6, false, "09083d0165979130e2b8b609863ffc4f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect6, false, "09083d0165979130e2b8b609863ffc4f");
                        } else {
                            a2.b.edit().putString("map_key", a3).apply();
                        }
                    }
                    b = i2;
                    com.sankuai.meituan.mapfoundation.mapuuid.a.a();
                    Object[] objArr6 = {str2};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                    if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect7, false, "a24c3a54f6efd887c41f65393fff24eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect7, false, "a24c3a54f6efd887c41f65393fff24eb");
                    } else {
                        a2.b.edit().putString("sig", str2).apply();
                    }
                }
                d = true;
            }
        }
        Object[] objArr7 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect8 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect8, true, "afb7cbdb2871325c52528f92e68aad45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect8, true, "afb7cbdb2871325c52528f92e68aad45");
        } else {
            c = i;
            com.sankuai.meituan.mapsdk.mapcore.preference.a.a().a(i);
        }
        Object[] objArr8 = {context};
        ChangeQuickRedirect changeQuickRedirect9 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect9, true, "a5353c0c225316e45329a6e4df8852ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect9, true, "a5353c0c225316e45329a6e4df8852ec");
        } else {
            try {
                Class.forName("com.sankuai.meituan.mapsdk.api.MapInitializer").getMethod("initMapSDK", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
        }
        e.a(context);
        c.f("init_sdk_success:" + i);
    }

    public static boolean mapCanBeUsed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03f9a7d129c08cf04a8d3ecd54094e8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03f9a7d129c08cf04a8d3ecd54094e8b")).booleanValue();
        }
        try {
            Method method = Class.forName("com.sankuai.meituan.mapsdk.api.MapInitializer").getMethod("mapCanBeUsed", new Class[0]);
            method.setAccessible(true);
            return ((Boolean) method.invoke(null, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | Exception unused) {
            return false;
        }
    }

    public static void setIdentity(@NonNull Context context, String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "432cf56b92034342529e307ddb970fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "432cf56b92034342529e307ddb970fe7");
        } else if (strArr == null || strArr.length <= 0) {
        } else {
            if (strArr.length > 0 && strArr[0] != null) {
                com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                String str = strArr[0];
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "12bcc5207fdfd1ec28327d9decb2fbc5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "12bcc5207fdfd1ec28327d9decb2fbc5");
                } else {
                    a2.b.edit().putString("identity_user_key", str).apply();
                }
            }
            if (strArr.length <= 1 || strArr[1] == null) {
                return;
            }
            com.sankuai.meituan.mapsdk.mapcore.preference.a a3 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
            String str2 = strArr[1];
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "6539715455c93ee17300de366b22f1de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "6539715455c93ee17300de366b22f1de");
            } else {
                a3.b.edit().putString("identity_device_key", str2).apply();
            }
        }
    }

    public static int getCatAppId() {
        return b;
    }

    @Deprecated
    public static void preLoadMapData(@NonNull Context context, int i, int i2, String str, String str2, CameraPosition cameraPosition) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, str2, cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2235f2266d1c2a856a110a5b980e4ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2235f2266d1c2a856a110a5b980e4ed8");
        } else {
            preLoadMapData(context, i, i2, str, str2, CameraUpdateFactory.newCameraPosition(cameraPosition));
        }
    }

    public static void preLoadMapData(@NonNull Context context, int i, int i2, String str, String str2, CameraUpdate cameraUpdate) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, str2, cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62dd496199463c7f4fd785e2adf2ef19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62dd496199463c7f4fd785e2adf2ef19");
            return;
        }
        try {
            d.a("com.sankuai.meituan.mapsdk.api.MapPreLoader", new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class, String.class, CameraUpdate.class}, context, Integer.valueOf(i), Integer.valueOf(i2), str, str2, cameraUpdate);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void preLoadMapData(@NonNull Context context, int i, int i2, String str, int i3, CameraUpdate cameraUpdate) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c02d9186da8e0dce6a161cf4d3f64bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c02d9186da8e0dce6a161cf4d3f64bf");
            return;
        }
        try {
            d.a("com.sankuai.meituan.mapsdk.api.MapPreLoader", new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, CameraUpdate.class}, context, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), cameraUpdate);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static synchronized void setAgreePrivacy(boolean z) {
        synchronized (MapsInitializer.class) {
            e = z;
        }
    }

    public static synchronized boolean isAgreePrivacy() {
        boolean z;
        synchronized (MapsInitializer.class) {
            z = e;
        }
        return z;
    }

    @Deprecated
    public static void setMapType(int i) {
        c = i;
    }

    @Deprecated
    public static Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb5423e2792a0c95937c667149d9ffe8", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb5423e2792a0c95937c667149d9ffe8") : getApplicationContext();
    }

    @Deprecated
    public static Context getApplicationContext() {
        return g;
    }

    @Deprecated
    public static int getMapType() {
        return c;
    }
}
