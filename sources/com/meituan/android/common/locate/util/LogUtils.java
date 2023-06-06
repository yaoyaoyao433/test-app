package com.meituan.android.common.locate.util;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class LogUtils {
    public static boolean a = false;
    public static boolean b = false;
    private static File c = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String d = null;
    private static PrintWriter e = null;
    private static String f = "";
    private static String g = "locateLog.log";

    static {
        try {
            if (com.meituan.android.common.locate.platform.abtest.a.a) {
                g = "compare_locateLog.log";
            }
            c = new File(Environment.getExternalStorageDirectory(), g);
        } catch (Exception e2) {
            a(e2.getMessage());
        }
    }

    public static void a(final Class cls, final Throwable th) {
        Object[] objArr = {cls, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3a5f42100ed2e3b1a8a5004a1aac8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3a5f42100ed2e3b1a8a5004a1aac8b1");
        } else if (!a || c == null || cls == null) {
        } else {
            final long id = Thread.currentThread().getId();
            final String name = Thread.currentThread().getName();
            f.a().a(new Runnable() { // from class: com.meituan.android.common.locate.util.LogUtils.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc8e7a3245838e152212a2f2dd69c2f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc8e7a3245838e152212a2f2dd69c2f0");
                        return;
                    }
                    LogUtils.b(cls.getName() + " Exception ", true, id, name);
                    if (th == null) {
                        return;
                    }
                    LogUtils.b(LogUtils.c(th), true, id, name);
                }
            });
        }
    }

    public static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66a47efd597020b6ca8e620a18837459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66a47efd597020b6ca8e620a18837459");
        } else if (!a || c == null || str == null) {
        } else {
            final long id = Thread.currentThread().getId();
            final String name = Thread.currentThread().getName();
            f.a().a(new Runnable() { // from class: com.meituan.android.common.locate.util.LogUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "29639e946323e33083ede144d1ccd071", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "29639e946323e33083ede144d1ccd071");
                    } else {
                        LogUtils.b(str, false, id, name);
                    }
                }
            });
        }
    }

    private static void a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cea3db7fb3be988824a434c40cdeb37a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cea3db7fb3be988824a434c40cdeb37a");
        } else if (e != null) {
            String format = h.a.format(new Date());
            try {
                if (b) {
                    PrintWriter printWriter = e;
                    printWriter.println(LocationUtils.a((format + " Pid(): " + Process.myPid() + " T" + Thread.currentThread().getId() + f + str).getBytes()));
                } else {
                    PrintWriter printWriter2 = e;
                    printWriter2.println(format + " Pid(): " + Process.myPid() + " T" + j + StringUtil.SPACE + str2 + StringUtil.SPACE + f + str);
                }
                e.flush();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, MtLocation mtLocation, Context context) {
        double d2;
        Context a2;
        boolean z = false;
        Object[] objArr = {str, mtLocation, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "21c49361c350e12d1874ee5615f7a55c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "21c49361c350e12d1874ee5615f7a55c");
        } else if (!a || c == null) {
        } else {
            if (mtLocation == null) {
                a("location_taglocation is null");
                return;
            }
            String str2 = "";
            double d3 = 0.0d;
            if (mtLocation.getExtras() != null) {
                str2 = mtLocation.getExtras().getString("from");
                d3 = mtLocation.getExtras().getDouble("gpslat");
                d2 = mtLocation.getExtras().getDouble("gpslng");
            } else {
                d2 = 0.0d;
            }
            if (context == null && (a2 = com.meituan.android.common.locate.provider.g.a()) != null) {
                z = LocationUtils.b(a2);
            }
            a(str + mtLocation.getLatitude() + CommonConstant.Symbol.COLON + mtLocation.getLongitude() + ",provider:" + mtLocation.getProvider() + ",accuracy:" + mtLocation.getAccuracy() + ",from:" + str2 + ",time:" + mtLocation.getTime() + ",gpslatlng:" + d3 + CommonConstant.Symbol.COMMA + d2 + ",isBack:" + z);
        }
    }

    public static void a(String str, List<ScanResult> list) {
        String str2;
        long j;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57424f94cc7e130741b4551f42a18e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57424f94cc7e130741b4551f42a18e7e");
        } else if (a && com.meituan.android.common.locate.provider.g.a() != null && c != null) {
            if (list == null) {
                a(str + " scanResults is null");
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, new Comparator<ScanResult>() { // from class: com.meituan.android.common.locate.util.LogUtils.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                /* renamed from: a */
                public final int compare(ScanResult scanResult, ScanResult scanResult2) {
                    if (scanResult.level < scanResult2.level) {
                        return 1;
                    }
                    return scanResult.level > scanResult2.level ? -1 : 0;
                }
            });
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                ScanResult scanResult = (ScanResult) arrayList.get(i);
                if (scanResult.BSSID != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("mac_address", scanResult.BSSID);
                        jSONObject.put("signal_strength", scanResult.level);
                        jSONObject.put(Constants.PRIVACY.KEY_SSID, s.a(scanResult));
                        jSONObject.put("wififrequency", scanResult.frequency);
                        if (Build.VERSION.SDK_INT >= 17) {
                            jSONObject.put(DeviceInfo.TM, scanResult.timestamp);
                            if (com.meituan.android.common.locate.provider.g.a() == null || !u.a(com.meituan.android.common.locate.provider.g.a()).a()) {
                                str2 = "subwifiage";
                                j = scanResult.timestamp;
                            } else {
                                str2 = "subwifiage";
                                j = com.meituan.android.common.locate.wifi.a.a().a(scanResult.BSSID);
                            }
                            jSONObject.put(str2, j);
                            j2 += jSONObject.getLong("subwifiage");
                        } else {
                            a("no subwifiage because os version");
                        }
                        String str3 = scanResult.capabilities;
                        if (TextUtils.isEmpty(str3)) {
                            jSONObject.put("wifiencrypt", false);
                            jSONObject.put("wifiencrypttype", "");
                        } else {
                            jSONObject.put("wifiencrypt", !str3.startsWith("[ESS]"));
                            jSONObject.put("wifiencrypttype", str3);
                        }
                        jSONArray.put(jSONObject);
                    } catch (Exception e2) {
                        a("getConnectedWifiInfo exception: " + e2.getMessage());
                    }
                }
            }
            if (arrayList.size() > 0) {
                j2 /= arrayList.size();
            }
            a(str + "compare wifi list average age : " + j2 + ",list is:" + jSONArray.toString());
        }
    }

    public static void a(final Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89cd1b95544202963ff082bcf89e397b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89cd1b95544202963ff082bcf89e397b");
        } else if (!a || c == null) {
        } else {
            final long id = Thread.currentThread().getId();
            final String name = Thread.currentThread().getName();
            f.a().a(new Runnable() { // from class: com.meituan.android.common.locate.util.LogUtils.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8a7a6782a8ab8844a4d180aeacc72c90", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8a7a6782a8ab8844a4d180aeacc72c90");
                        return;
                    }
                    LogUtils.b(" Exception ", true, id, name);
                    if (th == null) {
                        return;
                    }
                    LogUtils.b(LogUtils.c(th), true, id, name);
                }
            });
        }
    }

    public static boolean a() {
        return a;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f61be16806cd1ecc0f9ae3f3435e9fee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f61be16806cd1ecc0f9ae3f3435e9fee");
        }
        if (!a || c == null) {
            return "";
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length <= 5 || stackTrace[5] == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(stackTrace[3].getClassName() + CommonConstant.Symbol.DOT + stackTrace[2].getMethodName() + CommonConstant.Symbol.COMMA);
            sb.append(stackTrace[4].getClassName() + CommonConstant.Symbol.DOT + stackTrace[2].getMethodName() + CommonConstant.Symbol.COMMA);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(stackTrace[5].getClassName());
            sb2.append(CommonConstant.Symbol.DOT);
            sb2.append(stackTrace[2].getMethodName());
            sb.append(sb2.toString());
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "015b080830af394935f2a7c688fc8706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "015b080830af394935f2a7c688fc8706");
            return;
        }
        new StringBuilder("setPath: ").append(str);
        d = str;
        try {
            e = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d, true))), true);
            c = new File(d);
            new StringBuilder("logPath ").append(d);
        } catch (IOException e2) {
            new StringBuilder("setPath exception: ").append(e2.getMessage());
        }
    }

    public static void b(String str, List<MTCellInfo> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53fce7d60acea3115c64febff8ed7a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53fce7d60acea3115c64febff8ed7a41");
        } else if (a && c != null) {
            a("location_tagshow cells start");
            for (MTCellInfo mTCellInfo : list) {
                if (mTCellInfo != null) {
                    a("showcells " + str + StringUtil.SPACE + mTCellInfo.toString());
                }
            }
            a("location_tagshow cells end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, boolean z, long j, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6006f4e273b40744b1e561b3035f368d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6006f4e273b40744b1e561b3035f368d");
        } else if (!a || c == null) {
        } else {
            if (d != null && c != null && !c.exists()) {
                b(d);
            }
            if (d == null && c != null) {
                b(c.getAbsolutePath());
            }
            if (!a || TextUtils.isEmpty(str) || c == null || c.length() >= 1073741824) {
                return;
            }
            if (z) {
                Log.e("location_tag", str);
            }
            a(str, j, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcb46ffa7120a4e7f90175dac6605ee7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcb46ffa7120a4e7f90175dac6605ee7") : Log.getStackTraceString(th);
    }

    public static void setLogEnabled(boolean z) {
        a = z;
    }
}
