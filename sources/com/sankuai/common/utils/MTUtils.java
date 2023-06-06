package com.sankuai.common.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTUtils {
    public static final int NETWORK_2G = 3;
    public static final int NETWORK_3G4G = 4;
    public static final int NETWORK_4G = 5;
    public static final int NETWORK_MOBILE = 2;
    public static final int NETWORK_NONE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static final int NETWORK_WIFI = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean checkGeoPoint(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8259614ee9a8eae0a984264bdd2c9e25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8259614ee9a8eae0a984264bdd2c9e25")).booleanValue();
        }
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i == 0 && d2 == 0.0d) {
            return false;
        }
        return (i == 0 && d2 == 0.0d) ? false : true;
    }

    public static String getDefaultPoint() {
        return "0.0,0.0";
    }

    @Deprecated
    public static void copyText(Context context, CharSequence charSequence) {
        Object[] objArr = {context, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a5bd64c30e334b47c6628b655d86c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a5bd64c30e334b47c6628b655d86c10");
        } else {
            copyText("", context, charSequence);
        }
    }

    public static void copyText(String str, Context context, CharSequence charSequence) {
        Object[] objArr = {str, context, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "367862d89cbbb3c3c5bd2391f3f6be26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "367862d89cbbb3c3c5bd2391f3f6be26");
        } else {
            Privacy.createClipboardManager(context, str).a(charSequence);
        }
    }

    @Deprecated
    public static CharSequence getPasteText(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9033d699a1234b85107ba565dc8e399a", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9033d699a1234b85107ba565dc8e399a") : getPasteText("", context);
    }

    public static CharSequence getPasteText(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b4c4c2d01c8fb99f73595df83406e4a", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b4c4c2d01c8fb99f73595df83406e4a") : Privacy.createClipboardManager(context, str).c();
    }

    public static double[] getLocationPoint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f49577a12a32338b4c3d16f1809a02f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f49577a12a32338b4c3d16f1809a02f0");
        }
        if (TextUtils.equals("", str)) {
            str = getDefaultPoint();
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        double[] dArr = {0.0d, 0.0d};
        try {
            return new double[]{Double.valueOf(split[0]).doubleValue(), Double.valueOf(split[1]).doubleValue()};
        } catch (Exception e) {
            e.printStackTrace();
            return dArr;
        }
    }

    public static boolean checkGeoPoint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e576900c645d259401a9af87419045ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e576900c645d259401a9af87419045ce")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length < 2 || TextUtils.equals("", split[0]) || TextUtils.equals("", split[1])) {
            return false;
        }
        try {
            return checkGeoPoint(Double.valueOf(split[0]).doubleValue(), Double.valueOf(split[1]).doubleValue());
        } catch (Exception unused) {
            return false;
        }
    }

    public static ArrayList<String> getTexts(Paint paint, float f, String str) {
        Object[] objArr = {paint, Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24c75a9309468c6c9c01faf0bf095d4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24c75a9309468c6c9c01faf0bf095d4d");
        }
        if (f <= 0.0f) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int length = str.length();
        float[] fArr = {0.0f};
        int i = 0;
        while (i < length) {
            int breakText = paint.breakText(str, i, length, true, f, fArr) + i;
            int indexOf = str.substring(i, breakText).indexOf(10);
            if (indexOf <= 0) {
                arrayList.add(str.substring(i, breakText));
                i = breakText;
            } else {
                arrayList.add(str.substring(i, i + indexOf));
                i += indexOf + 1;
            }
        }
        if (arrayList.size() > 1) {
            String str2 = arrayList.get(arrayList.size() - 1);
            if ("）".equals(str2)) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(arrayList.remove(arrayList.size() - 1) + str2);
            }
        }
        return arrayList;
    }

    public static int dip2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a286844f1dc7a1278e0518ffc19eccd3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a286844f1dc7a1278e0518ffc19eccd3")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "964d37c9e3a2a6533e5a2c398173e893", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "964d37c9e3a2a6533e5a2c398173e893")).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String getUrlSuffix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e01f5df001ec6c5c947fe6ac9dce750a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e01f5df001ec6c5c947fe6ac9dce750a");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT) + 1).toLowerCase();
    }

    @Deprecated
    public static int getNetworkType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a98b15ce18d2bcddb2cf212263f84ce1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a98b15ce18d2bcddb2cf212263f84ce1")).intValue() : getNetworkType("", context);
    }

    public static int getNetworkType(String str, Context context) {
        MtTelephonyManager createTelephonyManager;
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cecc1cb3053e767d00e329e65598dd2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cecc1cb3053e767d00e329e65598dd2a")).intValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return 0;
            }
            if (TextUtils.equals(activeNetworkInfo.getTypeName().toLowerCase(), "wifi")) {
                return 1;
            }
            if (!TextUtils.equals(activeNetworkInfo.getTypeName().toLowerCase(), "mobile") || (createTelephonyManager = Privacy.createTelephonyManager(context, str)) == null) {
                return -1;
            }
            int networkType = createTelephonyManager.getNetworkType();
            if (networkType != 4) {
                if (networkType != 13) {
                    switch (networkType) {
                        case 0:
                            return -1;
                        case 1:
                        case 2:
                            break;
                        default:
                            return 4;
                    }
                } else {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static Intent getWirelessSettingsIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7aa38990efcddc3cca41cf13ae877b8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7aa38990efcddc3cca41cf13ae877b8c");
        }
        Intent intent = new Intent("/");
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.WirelessSettings"));
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static String getFromAssets(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8be9e5087a35314dbfeb88ca3b9c5157", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8be9e5087a35314dbfeb88ca3b9c5157");
        }
        try {
            InputStream open = context.getResources().getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            return getString(bArr, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String fileToString(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c28cdbe677ed9e921ecf816a94f0a593", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c28cdbe677ed9e921ecf816a94f0a593");
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            stringBuffer.append(readLine);
        }
        fileInputStream.close();
        return stringBuffer.toString();
    }

    public static String stringToFile(String str, InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream;
        Object[] objArr = {str, inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "675c061406cc286ba716358bb20cfa3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "675c061406cc286ba716358bb20cfa3f");
        }
        File file = new File(str);
        if (!file.exists()) {
            file.createNewFile();
        }
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            fileOutputStream2.close();
            return str;
        } catch (Throwable th2) {
            th = th2;
            try {
                fileOutputStream.close();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            throw th;
        }
        return str;
    }

    public static int getActivityLabelRes(Activity activity) {
        ActivityInfo activityInfo;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43a60b7844f27b2c89587e5c9feb8d15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43a60b7844f27b2c89587e5c9feb8d15")).intValue();
        }
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (Exception e) {
            e.printStackTrace();
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.labelRes;
        }
        return 0;
    }

    public static String CRC32(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f86db137435e666571f66b3c7927f15", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f86db137435e666571f66b3c7927f15");
        }
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(str.getBytes("UTF-8"));
        } catch (Exception unused) {
            crc32.reset();
            crc32.update(str.getBytes());
        }
        return Long.toHexString(crc32.getValue());
    }

    public static <T> Class<T> getGenericType(Object obj) {
        Type[] actualTypeArguments;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a267733bf2c081de9ef1b52e7192e718", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a267733bf2c081de9ef1b52e7192e718");
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        while (cls != null) {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass != null && (genericSuperclass instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments()) != null && actualTypeArguments.length > 0) {
                return (Class) actualTypeArguments[0];
            }
            cls = cls.getSuperclass();
            if (Object.class.equals(cls)) {
                return null;
            }
        }
        return null;
    }

    public static String getHostAddress(String str) {
        InetAddress inetAddress;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8a7abaef564834c346354914bb04eef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8a7abaef564834c346354914bb04eef");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            inetAddress = InetAddress.getByName(str);
        } catch (Exception e) {
            e.printStackTrace();
            inetAddress = null;
        }
        return inetAddress == null ? "" : inetAddress.getHostAddress();
    }

    public static String formatDistance(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e5ef150d136f9c5980db06401103dcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e5ef150d136f9c5980db06401103dcc");
        }
        if (d == 2.147483648E9d) {
            return "";
        }
        if (d < 500.0d) {
            return "<0.5km";
        }
        if (d < 1000.0d) {
            return "<1km";
        }
        String[] formatDistance = Utils.formatDistance(Double.valueOf(d));
        return formatDistance[1] + formatDistance[0];
    }

    public static boolean isInteger(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "791a82602513bf6d768162e11a82ea66", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "791a82602513bf6d768162e11a82ea66")).booleanValue() : d == Math.floor(d) && !Double.isInfinite(d);
    }

    public static String getLatLngStr(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b9f5f814138d9026092908bce74d6bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b9f5f814138d9026092908bce74d6bf");
        }
        return String.valueOf(d) + CommonConstant.Symbol.COMMA + String.valueOf(d2);
    }

    public static String getLatLngStr(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39a30af6e8750be78350f089bb962bed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39a30af6e8750be78350f089bb962bed") : getLatLngStr(location.getLatitude(), location.getLongitude());
    }

    public static boolean checkMobile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91539b73925ef6dfb13b142f0abba418", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91539b73925ef6dfb13b142f0abba418")).booleanValue() : !TextUtils.isEmpty(str) && str.length() == 11;
    }

    public static int getViewMaxHeigth(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "934e73beb75a8f30659cc979f552ea7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "934e73beb75a8f30659cc979f552ea7f")).intValue();
        }
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static String segmentation(String str, int[] iArr, String str2) {
        int i = 0;
        Object[] objArr = {str, iArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78fc258edc8470300137a8590ff63184", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78fc258edc8470300137a8590ff63184");
        }
        if (TextUtils.isEmpty(str) || iArr == null || iArr.length == 0) {
            return str;
        }
        String replace = str.replace(str2, "");
        StringBuilder sb = new StringBuilder();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i3 = iArr[i] + i2;
            if (i3 >= replace.length()) {
                sb.append(replace.substring(i2, replace.length()));
                i2 = i3;
                break;
            }
            sb.append(replace.substring(i2, i3));
            sb.append(str2);
            i++;
            i2 = i3;
        }
        if (i2 < replace.length()) {
            sb.append(replace.substring(i2, replace.length()));
        }
        return sb.toString();
    }

    public static Uri buildUriWithStid(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2515e9169f11bbc9d9db4ffdb183788", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2515e9169f11bbc9d9db4ffdb183788") : (uri == null || !TextUtils.isEmpty(uri.getQueryParameter("stid"))) ? uri : uri.buildUpon().appendQueryParameter("stid", str).build();
    }

    public static String getString(byte[] bArr, String str) {
        Object[] objArr = {bArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cce5ce90a66f30ec770f4ecee7b7807b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cce5ce90a66f30ec770f4ecee7b7807b");
        }
        notNull(bArr, "Input");
        return getString(bArr, 0, bArr.length, str);
    }

    public static String getString(byte[] bArr, int i, int i2, String str) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f12e6f21f30e877124c6b529572c0a31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f12e6f21f30e877124c6b529572c0a31");
        }
        notNull(bArr, "Input");
        notEmpty(str, "Charset");
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i, i2);
        }
    }

    public static <T> T notNull(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58120d22434d71178f4ada3b8ad4b6c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58120d22434d71178f4ada3b8ad4b6c0");
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    public static <T extends CharSequence> T notEmpty(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5426ffb0cce0e3a446a90d0831573995", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5426ffb0cce0e3a446a90d0831573995");
        }
        if (t == null) {
            throw new IllegalArgumentException(str + " may not be null");
        } else if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(str + " may not be empty");
        } else {
            return t;
        }
    }
}
