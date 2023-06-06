package com.sankuai.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.StatFs;
import android.support.constraint.R;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.APNMatchTools;
import com.sankuai.waimai.launcher.util.image.a;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Character;
import java.net.URL;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Utils {
    public static final String CHANNEL = "mtplatform_common_utils";
    public static final String COMPONENT_NAME = "";
    private static final String[][] FILTER_CHARS = {new String[]{"<", "&lt;"}, new String[]{">", "&gt;"}, new String[]{StringUtil.SPACE, "&nbsp;"}, new String[]{CommonConstant.Symbol.DOUBLE_QUOTES, "&quot;"}, new String[]{"&", "&amp;"}, new String[]{"/", "&#47;"}, new String[]{"\\\\", "&#92;"}, new String[]{"\n", "<br>"}, new String[]{"“", "&ldquo;"}, new String[]{"”", "&rdquo;"}};
    public static final String LONG_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    private static final long MIN_DATA_BLOCK_SIZE = 3145728;
    public static final String SHORT_DATE_FORMAT = "HH:mm";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashMap<String, String> getConfig() {
        return null;
    }

    public static boolean isAppInUse(Context context) {
        return false;
    }

    public static boolean isRunning(Context context) {
        return false;
    }

    public static PackageInfo getCurrentVersion(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9fe9f2a4c5a24b3afdd44644f5cf736", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9fe9f2a4c5a24b3afdd44644f5cf736");
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getMetaDate(Context context, String str) {
        Object obj;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f5387ce21bbf3c9a8334ac9f6cee4f9f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f5387ce21bbf3c9a8334ac9f6cee4f9f");
        }
        try {
            obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            obj = null;
        }
        return obj == null ? "" : obj;
    }

    public static void deleteChildView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b445719d8e110fd2e96a802d6dec9860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b445719d8e110fd2e96a802d6dec9860");
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                for (int i = 0; i < childCount; i++) {
                    deleteChildView(viewGroup.getChildAt(i));
                }
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused) {
                if (view instanceof ListView) {
                    ((ListView) view).setAdapter((ListAdapter) null);
                }
            }
        }
    }

    public static String getCurrentAPN(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8377bb8b8cad949a041989cd80541d52", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8377bb8b8cad949a041989cd80541d52");
        }
        try {
            str = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0).getExtraInfo();
        } catch (Exception unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    @Deprecated
    public static String getDeviceId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bff82cc926b688bdb4c70f4c529d668b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bff82cc926b688bdb4c70f4c529d668b") : getDeviceId("", context);
    }

    public static String getDeviceId(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f68fb1a511c4e4f7918c04b2b1c0d05", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f68fb1a511c4e4f7918c04b2b1c0d05") : UniqueDeviceId.getDeviceId(str, context);
    }

    public static boolean hasSdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c750af376b0d46c363d640546e120b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c750af376b0d46c363d640546e120b5")).booleanValue() : Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isSdcardFull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1babe346325c0620aa2904c4981732de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1babe346325c0620aa2904c4981732de")).booleanValue();
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            return checkFull(Environment.getExternalStorageDirectory().getAbsolutePath());
        }
        return true;
    }

    public static boolean isDataFull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acc28e289dde693d4422b200c7a27015", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acc28e289dde693d4422b200c7a27015")).booleanValue();
        }
        try {
            return checkFull(Environment.getDataDirectory().getAbsolutePath());
        } catch (Throwable unused) {
            return true;
        }
    }

    private static boolean checkFull(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a89844e7b8f7cdcb7b5356741748d66a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a89844e7b8f7cdcb7b5356741748d66a")).booleanValue();
        }
        try {
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()) < MIN_DATA_BLOCK_SIZE;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isNetworkWifi(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "943c6a63e98e8edea7072d71e2adb06a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "943c6a63e98e8edea7072d71e2adb06a")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isHighspeedInternet(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7153ea1d436c5d9ef405540e957ea279", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7153ea1d436c5d9ef405540e957ea279")).booleanValue();
        }
        if (isNetworkWifi(context)) {
            return true;
        }
        String currentAPN = getCurrentAPN(context);
        return currentAPN.equals(APNMatchTools.APNNet.GNET_3) || currentAPN.equals(APNMatchTools.APNNet.GWAP_3) || currentAPN.equals(APNMatchTools.APNNet.CMTDS);
    }

    private static void delete(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b648e92baf556d11132c310a37a62ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b648e92baf556d11132c310a37a62ccf");
        } else if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                delete(file2);
            }
        }
    }

    public static long getCacheSize(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0689502725c26d64a2b269a75b57ca66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0689502725c26d64a2b269a75b57ca66")).longValue();
        }
        String format = String.format("/Android/data/%s/cache/", context.getPackageName());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File a = q.a(context, CHANNEL, (String) null, u.b);
        if (externalStorageDirectory == null) {
            return getFileSize(a);
        }
        return getFileSize(new File(externalStorageDirectory.getAbsolutePath() + format)) + getFileSize(a);
    }

    public static long getFileSize(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b9c38d07cacba920e3cb6605a2fc21b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b9c38d07cacba920e3cb6605a2fc21b")).longValue();
        }
        if (file.isDirectory()) {
            long j = 0;
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += getFileSize(file2);
                }
            }
            return j;
        }
        return file.length();
    }

    public static boolean clearData(Context context) {
        File[] listFiles;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b784aa40ecfd60b1dc8e25f3777f5bad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b784aa40ecfd60b1dc8e25f3777f5bad")).booleanValue();
        }
        File[] listFiles2 = new File(context.getApplicationInfo().dataDir).listFiles();
        if (listFiles2 != null) {
            for (File file : listFiles2) {
                if (!file.isDirectory()) {
                    delete(file);
                } else {
                    for (File file2 : file.listFiles()) {
                        if (!file2.isDirectory()) {
                            delete(file2);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean clearCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b0b66ada260bc8460cc1f31c8635327", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b0b66ada260bc8460cc1f31c8635327")).booleanValue();
        }
        String format = String.format("/Android/data/%s/cache/", context.getPackageName());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            delete(new File(externalStorageDirectory.getAbsolutePath() + format));
        }
        delete(q.a(context, CHANNEL, (String) null, u.b));
        return true;
    }

    public static boolean isOffline(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6a5c43e1c98816b08b89c1600f2acd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6a5c43e1c98816b08b89c1600f2acd5")).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo == null || !activeNetworkInfo.isAvailable();
    }

    public static void linkTextView(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bef67ab79cb91a315d79dbf8a998b3db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bef67ab79cb91a315d79dbf8a998b3db");
            return;
        }
        Linkify.addLinks(textView, 2);
        Linkify.addLinks(textView, 8);
        Linkify.addLinks(textView, 1);
        Linkify.addLinks(textView, Pattern.compile("((\\d{4}|\\d{3})?-?(\\d{7,8})(-\\d{1,2})?(\\d{1,2})?)|((\\d{4}|\\d{3})-(\\d{4}|\\d{3})-(\\d{4}|\\d{3}))"), "tel:");
    }

    public static Map<String, String> paramsToMap(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5061ef37b32d2a8d26e397c188ee7b37", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5061ef37b32d2a8d26e397c188ee7b37");
        }
        if (strArr == null || strArr.length % 2 != 0) {
            throw new RuntimeException("Invalid Name Value Pairs ");
        }
        int length = strArr.length / 2;
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            hashMap.put(strArr[i2], strArr[i2 + 1]);
        }
        return hashMap;
    }

    public static String[] mapToParams(Map<String, String> map) {
        int i = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c36ac90f64ef4a58399b6f5e3229c1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c36ac90f64ef4a58399b6f5e3229c1a");
        }
        String[] strArr = new String[map.entrySet().size() * 2];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int i2 = i + 1;
            strArr[i] = entry.getKey();
            i = i2 + 1;
            strArr[i2] = entry.getValue();
        }
        return strArr;
    }

    public static float getMaxInArray(float[] fArr) {
        int i = 0;
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "616bebc3a19ec44b7b4518dd203a1ab9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "616bebc3a19ec44b7b4518dd203a1ab9")).floatValue();
        }
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (fArr[i] < fArr[i2]) {
                i = i2;
            }
        }
        return fArr[i];
    }

    public static float getMinInArray(float[] fArr) {
        int i = 0;
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fb9c1b58902fa777bf4b9b2e18beece", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fb9c1b58902fa777bf4b9b2e18beece")).floatValue();
        }
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (fArr[i] > fArr[i2]) {
                i = i2;
            }
        }
        return fArr[i];
    }

    public static String[] getFormatDateLine(long j, Context context) {
        long[] countDown;
        Object[] objArr = {new Long(j), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "79eaca2e7a45b91efa92ddedfa9e5828", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "79eaca2e7a45b91efa92ddedfa9e5828");
        }
        if (context == null || (countDown = countDown(Long.valueOf(j * 1000))) == null) {
            return null;
        }
        String[] strArr = new String[4];
        long j2 = countDown[0];
        long j3 = countDown[1];
        long j4 = countDown[2];
        long j5 = countDown[3];
        if (j2 > 0) {
            strArr[0] = j2 + context.getString(R.string.commonutil_day);
            strArr[1] = j3 + context.getString(R.string.commonutil_hour);
            strArr[2] = j4 + context.getString(R.string.commonutil_minute);
        } else {
            strArr[0] = j3 + context.getString(R.string.commonutil_hour);
            strArr[1] = j4 + context.getString(R.string.commonutil_minute);
            strArr[2] = j5 + context.getString(R.string.commonutil_second);
        }
        return strArr;
    }

    public static long[] countDown(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e8ab4aabb84a816f646f6e67ab6704c", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e8ab4aabb84a816f646f6e67ab6704c");
        }
        if (l.longValue() < new Date().getTime()) {
            return null;
        }
        Date date = new Date();
        long longValue = (l.longValue() - date.getTime()) % 86400000;
        long j = longValue / DDLoadConstants.TIME_HOURS_MILLIS;
        long j2 = longValue % DDLoadConstants.TIME_HOURS_MILLIS;
        return new long[]{(l.longValue() - date.getTime()) / 86400000, j, j2 / LocationStrategy.LOCATION_TIMEOUT, (j2 % LocationStrategy.LOCATION_TIMEOUT) / 1000};
    }

    public static double getDistance(Location location, double d, double d2) {
        Object[] objArr = {location, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "091a9c6ed0301675118fc905cca62252", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "091a9c6ed0301675118fc905cca62252")).doubleValue();
        }
        if (location == null) {
            return -1.0d;
        }
        Location location2 = new Location("");
        location2.setLatitude(d);
        location2.setLongitude(d2);
        return location2.distanceTo(location);
    }

    public static String[] formatDistance(Double d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "347bc5d1deb10eecee326c3cc5b756dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "347bc5d1deb10eecee326c3cc5b756dd");
        }
        String[] strArr = new String[2];
        strArr[0] = "km";
        if (d.doubleValue() < 0.0d) {
            strArr[1] = "";
            strArr[0] = "";
        } else if (d.doubleValue() <= 1000.0d) {
            strArr[0] = "m";
            strArr[1] = new DecimalFormat("0").format(d);
        } else if (d.doubleValue() > 1000.0d && d.doubleValue() < 10000.0d) {
            strArr[1] = new DecimalFormat("0.1").format(d.doubleValue() / 1000.0d);
        } else if (d.doubleValue() >= 10000.0d) {
            strArr[1] = new DecimalFormat("0").format(d.doubleValue() / 1000.0d);
        }
        return strArr;
    }

    public static String splitFileNameFromUrl(URL url) {
        Object[] objArr = {url};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f71b7dd18726722653faec105abdc19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f71b7dd18726722653faec105abdc19");
        }
        String url2 = url.toString();
        return url2.substring(url2.lastIndexOf(47) + 1);
    }

    public static String[] mergeArray(String[] strArr, String[] strArr2) {
        Object[] objArr = {strArr, strArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bc5e5db7ea4c33f18a2f169e8aa6600", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1bc5e5db7ea4c33f18a2f169e8aa6600");
        }
        int length = strArr.length;
        int length2 = strArr2.length;
        String[] strArr3 = new String[length + length2];
        System.arraycopy(strArr, 0, strArr3, 0, length);
        System.arraycopy(strArr2, 0, strArr3, length, length2);
        return strArr3;
    }

    public static void exceptionShow(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1c53b36b20c640d9fcb063760e3765d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1c53b36b20c640d9fcb063760e3765d");
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }

    @Deprecated
    public static void msgShow(Context context, int i, boolean z) {
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35e959a68e2c82defb0f72eb82212bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35e959a68e2c82defb0f72eb82212bbd");
        } else {
            msgShow(context, context.getString(i), z);
        }
    }

    @Deprecated
    public static void msgShow(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b10394a59e4d5ed3550b506c803083ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b10394a59e4d5ed3550b506c803083ef");
        } else {
            Toast.makeText(context, str, z ? 1 : 0).show();
        }
    }

    @Deprecated
    public static void msgShow(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "101eac27875e6bfc0f40a2b71206a9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "101eac27875e6bfc0f40a2b71206a9b6");
        } else {
            Toast.makeText(context, context.getString(i), 0).show();
        }
    }

    @Deprecated
    public static void msgShow(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e38a6eba163e58a9d245369e6a914a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e38a6eba163e58a9d245369e6a914a99");
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }

    public static boolean inArray(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20a5cdb902df8198fe3deb173440b26d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20a5cdb902df8198fe3deb173440b26d")).booleanValue();
        }
        if (!str.equals("") && strArr.length > 0) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean checkEmail(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e7393eb2f80c9ad150739a3d7aff983", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e7393eb2f80c9ad150739a3d7aff983")).booleanValue() : Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$").matcher(str).find();
    }

    public static boolean checkPhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e29f5c48d934d267087332abc1afc6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e29f5c48d934d267087332abc1afc6d")).booleanValue() : Pattern.compile("((\\d{4}|\\d{3})?-?(\\d{7,8})(-\\d{1,2})?(\\d{1,2})?)|((\\d{4}|\\d{3})-(\\d{4}|\\d{3})-(\\d{4}|\\d{3}))").matcher(str).find();
    }

    public static boolean checkMobilePhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5026837e8c23da32fb1d717fdf83c33c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5026837e8c23da32fb1d717fdf83c33c")).booleanValue();
        }
        if (str.length() < 11) {
            return false;
        }
        return Pattern.compile("((\\d{4}|\\d{3})?-?(\\d{7,8})(-\\d{1,2})?(\\d{1,2})?)|((\\d{4}|\\d{3})-(\\d{4}|\\d{3})-(\\d{4}|\\d{3}))").matcher(str).find();
    }

    public static String formatMobilePhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03033167dec7c3228e7ae76c24a6a3c5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03033167dec7c3228e7ae76c24a6a3c5") : str.replaceAll("(\\d{3})([^<>]*)(\\d{4})", "$1****$3");
    }

    public static byte[] getBytesFromInputStream(InputStream inputStream, int i) throws IOException {
        Object[] objArr = {inputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a707c6d36508e3bf83c34beb4512310", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a707c6d36508e3bf83c34beb4512310");
        }
        byte[] bArr = new byte[4096];
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                allocate.put(bArr, 0, read);
                i2 += read;
            } else {
                byte[] bArr2 = new byte[i2];
                allocate.flip();
                allocate.get(bArr2, 0, i2);
                return bArr2;
            }
        }
    }

    public static Bitmap getPicFromBytes(byte[] bArr, BitmapFactory.Options options) throws OutOfMemoryError {
        Object[] objArr = {bArr, options};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "012fc0966bdcdc625ba0ae963dd44251", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "012fc0966bdcdc625ba0ae963dd44251");
        }
        if (bArr != null) {
            if (options != null) {
                return a.a(bArr, 0, bArr.length, options);
            }
            return a.a(bArr, 0, bArr.length);
        }
        return null;
    }

    public static boolean createFile(String str) throws IOException {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c020d81ab8af6e8edc5fb5e3b09781eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c020d81ab8af6e8edc5fb5e3b09781eb")).booleanValue();
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            z = false;
        }
        try {
            if (file.createNewFile()) {
                return z;
            }
            return false;
        } catch (IOException e) {
            throw e;
        }
    }

    public static String toHtml(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8af384329a42268fb299ed9102920c7d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8af384329a42268fb299ed9102920c7d") : replace(replace(replace(replace(replace(replace(replace(str, "&amp;", "&"), "&lt;", "<"), "&gt;", ">"), "\n", StringUtil.CRLF_STRING), "<br>\n", "\n"), "         ", "\t"), "   &nbsp;", "     ");
    }

    public static String replace(String str, String str2, String str3) {
        int i = 0;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba0dd89130562cf1ed64cadb2ea47522", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba0dd89130562cf1ed64cadb2ea47522");
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int length2 = str2.length();
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            stringBuffer.append(str.substring(i, indexOf));
            stringBuffer.append(str3);
            i = indexOf + length2;
        }
        if (i < length) {
            stringBuffer.append(str.substring(i));
        }
        return stringBuffer.toString();
    }

    public static Calendar getDate(Date date) {
        Object[] objArr = {date};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffae485b2ce5faf0185fd24465a54593", RobustBitConfig.DEFAULT_VALUE)) {
            return (Calendar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffae485b2ce5faf0185fd24465a54593");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.clear();
        calendar.set(i, i2, i3);
        return calendar;
    }

    public static boolean isChinese(char c) {
        Object[] objArr = {Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0dcb030a082e68e799b53e2b3348c00e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0dcb030a082e68e799b53e2b3348c00e")).booleanValue();
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    public static boolean isChinese(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d3ad9a525e97502268c5ccdec8c746f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d3ad9a525e97502268c5ccdec8c746f")).booleanValue();
        }
        for (char c : str.toCharArray()) {
            if (isChinese(c)) {
                return true;
            }
        }
        return false;
    }

    public static Calendar getToday() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b8419a366da3637531fa6df735a76ab", RobustBitConfig.DEFAULT_VALUE) ? (Calendar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b8419a366da3637531fa6df735a76ab") : getDate(new Date());
    }

    public static String formartToday(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d45268433f88841c741dbd2e3dcd6641", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d45268433f88841c741dbd2e3dcd6641");
        }
        if (context == null) {
            return "";
        }
        String[] strArr = {context.getString(R.string.commonutil_sunday), context.getString(R.string.commonutil_monday), context.getString(R.string.commonutil_tuesday), context.getString(R.string.commonutil_wednesday), context.getString(R.string.commonutil_thursday), context.getString(R.string.commonutil_friday), context.getString(R.string.commonutil_saturday)};
        Calendar today = getToday();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(today.get(1));
        stringBuffer.append(context.getString(R.string.commonutil_year));
        stringBuffer.append(today.get(2) + 1);
        stringBuffer.append(context.getString(R.string.commonutil_month));
        stringBuffer.append(today.get(5));
        stringBuffer.append(context.getString(R.string.commonutil_day));
        stringBuffer.append("  " + context.getString(R.string.commonutil_week));
        stringBuffer.append(strArr[today.get(7) - 1]);
        return stringBuffer.toString();
    }

    public static String strFormat(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0bb0b1f70e45786da69b83c1918c42e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0bb0b1f70e45786da69b83c1918c42e1");
        }
        if ("".equals(str)) {
            return "";
        }
        if (i <= 0) {
            return str;
        }
        if ("".equals(str2)) {
            str2 = StringUtil.SPACE;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int i2 = length % i > 0 ? (length / i) + 1 : length / i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i2 - 1) {
                stringBuffer.append(str.substring(i3 * i));
            } else {
                int i4 = i3 * i;
                stringBuffer.append(str.substring(i4, i4 + i));
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    public static String replaceHtml(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e069f5d6575ec0e7e8e31c73154d95a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e069f5d6575ec0e7e8e31c73154d95a") : TextUtils.isEmpty(str) ? "" : Pattern.compile("<.+?>").matcher(str).replaceAll("");
    }

    public static String filtePhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1968f5db15c48975a0cb8626a05b62e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1968f5db15c48975a0cb8626a05b62e3") : TextUtils.isEmpty(str) ? "" : Pattern.compile("[^0-9]").matcher(str).replaceAll("");
    }

    public static String get4ContinuousDigital(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45e4ab73b55e69c3d58109edda7e774e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45e4ab73b55e69c3d58109edda7e774e");
        }
        Matcher matcher = Pattern.compile("\\d{4}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    public static int getDateOffset(Date date, Date date2) {
        Object[] objArr = {date, date2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8279bf35f6d88818bdcb97967a6f6a8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8279bf35f6d88818bdcb97967a6f6a8")).intValue() : (int) ((((date.getTime() - date2.getTime()) / 3600) / 24) / 1000);
    }

    public static String getFormattedDateStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d30a23dfba8272476449f14f5c31ecf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d30a23dfba8272476449f14f5c31ecf3");
        }
        return new SimpleDateFormat(LONG_DATE_FORMAT).format(new Date());
    }

    public static String getDateStrByDateFormat(DateFormat dateFormat, Date date) {
        Object[] objArr = {dateFormat, date};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca04188ff66c330c3a950c55ce58717c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca04188ff66c330c3a950c55ce58717c") : dateFormat.format(date);
    }

    public static String getDateForDisplay(long j, Context context) {
        Date date;
        Object[] objArr = {new Long(j), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebda4384415122b6217b76ac8a005a37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebda4384415122b6217b76ac8a005a37");
        }
        if (j == 0) {
            return context.getString(R.string.commonutil_noupdatelasttime);
        }
        try {
            date = new Date(j * 1000);
        } catch (Exception unused) {
            date = null;
        }
        if (date == null) {
            return context.getString(R.string.commonutil_noupdatelasttime);
        }
        long time = date.getTime();
        long timeInMillis = getToday().getTimeInMillis();
        long j2 = timeInMillis - 86400000;
        if (time >= timeInMillis) {
            return context.getString(R.string.commonutil_today) + getDateStrByDateFormat(new SimpleDateFormat(SHORT_DATE_FORMAT), date);
        } else if (time >= j2) {
            return context.getString(R.string.commonutil_yesterday) + getDateStrByDateFormat(new SimpleDateFormat(SHORT_DATE_FORMAT), date);
        } else {
            return getDateStrByDateFormat(new SimpleDateFormat(LONG_DATE_FORMAT), date);
        }
    }

    public static String getDateStrByMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9e95a41eb2a5da87e3b6dfd427a02b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9e95a41eb2a5da87e3b6dfd427a02b2");
        }
        if (j == 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat(LONG_DATE_FORMAT).format(calendar.getTime());
    }

    public static boolean isToday(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58bb9688ba312d662c997a4bdd6ca801", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58bb9688ba312d662c997a4bdd6ca801")).booleanValue();
        }
        long timeInMillis = getToday().getTimeInMillis() / 1000;
        return j >= timeInMillis && j < TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC + timeInMillis;
    }

    private static void deleteFile(File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27bf45ae5e8053dbb9a6194b4d5df356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27bf45ae5e8053dbb9a6194b4d5df356");
        } else if (fileArr != null) {
            for (File file : fileArr) {
                try {
                    if (!file.isDirectory()) {
                        file.delete();
                    } else {
                        delete(file);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public static String getFormattedDoubleValue(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "abfa184b9a16a5bb805372c58ec8fd26", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "abfa184b9a16a5bb805372c58ec8fd26") : new DecimalFormat("0.00").format(d);
    }
}
