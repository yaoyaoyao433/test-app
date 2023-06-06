package com.sankuai.meituan.mapsdk.mapcore.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static int b;

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "317c206d3cb68c2b8d53f59ff919f9aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "317c206d3cb68c2b8d53f59ff919f9aa")).floatValue();
        }
        if (Math.abs(f) <= 1.0E-6d) {
            return 0.0f;
        }
        return 360.0f - f;
    }

    public static double[] a(int i, int i2, LatLngBounds latLngBounds) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5cb5d1401ba1bdd83bf12c1da1ec3ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5cb5d1401ba1bdd83bf12c1da1ec3ee");
        }
        double[] dArr = new double[2];
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null || i2 <= 0 || i <= 0 || !latLngBounds.northeast.isValid() || !latLngBounds.southwest.isValid() || latLngBounds.northeast.equals(latLngBounds.southwest)) {
            if (i <= 0) {
                i = 1;
            }
            if (i2 <= 0) {
                i2 = 1;
            }
            dArr[0] = 1.0f / i;
            dArr[1] = 1.0f / i2;
        } else {
            PointD a2 = e.b.a(latLngBounds.southwest);
            PointD a3 = e.b.a(latLngBounds.northeast);
            double abs = Math.abs(a2.x - a3.x);
            double abs2 = Math.abs(a2.y - a3.y);
            dArr[0] = abs / i;
            dArr[1] = abs2 / i2;
        }
        return dArr;
    }

    public static List<LatLng> a(LatLng latLng, double d) {
        Object[] objArr = {latLng, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecd2c4c5f0c268809f0f3d450316e502", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecd2c4c5f0c268809f0f3d450316e502");
        }
        ArrayList arrayList = new ArrayList();
        double d2 = (latLng.latitude * 3.141592653589793d) / 180.0d;
        double d3 = (latLng.longitude * 3.141592653589793d) / 180.0d;
        double d4 = 0.0d;
        while (d4 <= 6.283185307179586d) {
            double d5 = d / 6378100.0d;
            arrayList.add(new LatLng((((Math.sin(d4) * d5) + d2) * 180.0d) / 3.141592653589793d, ((((d5 * Math.cos(d4)) / Math.cos(d2)) + d3) * 180.0d) / 3.141592653589793d));
            d4 += 1.5707963267948966d;
            d2 = d2;
        }
        return arrayList;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8b1d9f0bd60b26a83cebe4b0537dadb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8b1d9f0bd60b26a83cebe4b0537dadb")).booleanValue();
        }
        try {
            Class.forName("com.sankuai.meituan.mapsdk.core.e");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "276ca37e47019d363b67a10e93bdb225", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "276ca37e47019d363b67a10e93bdb225")).booleanValue();
        }
        try {
            Class.forName("com.sankuai.meituan.mapsdk.tencentadapter.TencentMapAdapter");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Bitmap a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dada361259186dc067884da6b208264", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dada361259186dc067884da6b208264");
        }
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.setDrawingCacheEnabled(true);
            try {
                view.buildDrawingCache();
                Bitmap copy = view.getDrawingCache().copy(Bitmap.Config.ARGB_8888, false);
                view.destroyDrawingCache();
                return copy;
            } catch (NullPointerException unused) {
            }
        }
        return null;
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22f63410789699209f81f80e5f44584a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22f63410789699209f81f80e5f44584a");
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b2 : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b2 & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return StringUtil.NULL;
        }
    }

    public static byte[] a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a1bde398be952185962910c851edf2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a1bde398be952185962910c851edf2f");
        }
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            c.f("readByteArrayFromAsset failed!");
            return null;
        }
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "472f83270ccccdea09e893944ece7ad9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "472f83270ccccdea09e893944ece7ad9");
        }
        try {
            return ((ActivityManager) com.sankuai.meituan.mapsdk.mapcore.a.a().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getDeviceConfigurationInfo().getGlEsVersion();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0798d4f12da4fa300c72847e304a0444", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0798d4f12da4fa300c72847e304a0444");
        }
        Context a2 = com.sankuai.meituan.mapsdk.mapcore.a.a();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            ((ActivityManager) a2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.format(Locale.getDefault(), "%.2fKB", Double.valueOf((memoryInfo.totalMem - memoryInfo.availMem) / 1024.0d));
    }

    public static int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cbe1f7aa3e9163477aeb5552c1155a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cbe1f7aa3e9163477aeb5552c1155a2")).intValue();
        }
        try {
            return Math.round(((WindowManager) com.sankuai.meituan.mapsdk.mapcore.a.a().getSystemService("window")).getDefaultDisplay().getRefreshRate());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
