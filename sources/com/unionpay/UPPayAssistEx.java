package com.unionpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.common.StringUtil;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.utils.UPUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class UPPayAssistEx {
    private static String A = "";
    private static String B = "";
    private static String C = "";
    private static String D = "";
    private static boolean E = false;
    private static int F = 10;
    private static Context G = null;
    private static String H = "";
    private static String I = null;
    private static String J = null;
    private static String K = "";
    private static String L = "";
    private static boolean M = false;
    private static String N = "";
    private static int O = 0;
    private static boolean P = false;
    public static final int PLUGIN_NOT_FOUND = -1;
    public static final int PLUGIN_VALID = 0;
    private static com.unionpay.a.d Q = null;
    private static Handler R = null;
    private static String S = "application/vnd.android.package-archive";
    private static String T = "http://mobile.unionpay.com/getclient?platform=android&type=securepayplugin";
    private static String U = "[{\"type\":\"app\",\"sort\":100,\"package_info\":[{\"schema\":\"com.unionpay\",\"version\":\"^[5-9]{1}+(.[0-9]{1})+(.[0-9]{1,3})?$\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101}],\"need_install\":false,\"install_msg\":\"请先安装银联在线支付服务，安装完成后重新发起付款\",\"url\":\"https://mobile.unionpay.com/getclient?platform=android&type=securepayplugin\",\"download_app\":\"UPPayPluginEx.apk\",\"download_title\":\"银联在线支付服务\",\"download_desp\":\"正在下载银联在线支付服务…\",\"md5\":\"D75BB2802E61738A9A03BF014F927D9A\"},{\"type\":\"jar\",\"sort\":200}]";
    private static String V = "[{\"type\":\"app\",\"sort\":100,\"package_info\":[{\"schema\":\"com.unionpay.tsmservice\",\"version\":\"^[1-9].*|^0[2-9].*|^01\\.[1-9].*|^01\\.0[1-9].*|^01\\.00\\.[2-9].*|^01\\.00\\.1[012789].*|^01\\.00\\.0[8-9].*\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":102},{\"schema\":\"com.unionpay.tsmservice.mi\",\"version\":\"^[1-9].*|^0[2-9].*|^01\\.[1-9].*|^01\\.0[1-9].*|^01\\.00\\.[1-9].*|^01\\.00\\.0[8-9].*\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":103}],\"need_install\":false,\"install_msg\":\"请先安装银联在线支付服务，安装完成后重新发起付款\",\"url\":\"https://mobile.unionpay.com/getclient?platform=android&type=securepayplugin\",\"download_app\":\"UPPayPluginEx.apk\",\"download_title\":\"银联在线支付服务\",\"download_desp\":\"正在下载银联在线支付服务…\",\"md5\":\"D75BB2802E61738A9A03BF014F927D9A\"}]";
    public static final String VERSION = "3.4.8";
    private static JSONArray W = null;
    private static IntentFilter X = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
    private static BroadcastReceiver Y = new a();
    private static final Handler.Callback Z = new b();
    private static String a = "SpId";
    private static String b = "paydata";
    private static String c = "SysProvide";
    private static String d = "UseTestMode";
    private static String e = "SecurityChipType";
    private static String f = "uppayuri";
    private static String g = "resultIntentAction";
    private static String h = "reqOriginalId";
    private static String i = "wapurl";
    private static String j = "dlgstyle";
    private static String k = "com.unionpay.uppay";
    private static String l = "com.unionpay.uppay.PayActivity";
    private static String m = "ex_mode";
    private static String n = "server";
    private static String o = "source";
    private static String p = "samsung_out";
    private static String q = "se_type";
    private static String r = "se_title_logo";
    private static String s = "se_loading_logo";
    private static String t = "se_title_bg_color";
    private static String u = "se_cancel_bg_color";
    private static String v = "02";
    private static String w;
    private static String x;
    private static String y;
    private static String z;

    private static int a(Activity activity, String str, String str2) {
        try {
            String[] strArr = {"30820267308201d0a00302010202044", "ecb7d98300d06092a8", "64886f70d01010505003078310b30090603550", "406130238363111300f060355040813085", "368616e676", "861693111300f060355040713085368616e67686169311730", "15060355040a130e4368696e6120556e696f6e50617931173015060355040b130e4", "368696e612055", "6e696f6e5061793111300f06035504031308556e696f6e5061", "79301e170d3131313132323130343634385a170d333631313135313034", "3634385a3078310b300906035504061302383631", "11300f060355040813085368616e67686169311130", "0f060355040713085368616e676861693117", "3015060355040a130e4368696e6120556e696", "f6e50617931173015060355040b130e4368696e6120556e696", "f6e5061793111300f06035504031308556e696f6e50617930819f300d060", "92a864886f70d010101050003818d0030818902818100c42e6236d5054ffccaa", "a430ecd929d562", "b1ff56cef0e21c87260c63ce3ca868bf5974c14", "d9255940da7b6cd07483f4b4243fd1825b2705", "08eb9b5c67474d027fa03ce35109b11604083ab6bb4df2c46240f879f", "8cc1d6ed5e1b2cc00489215aec3fc2eac008e767b0215981cb5e", "e94ddc285669ec06b8a405dd4341eac4ea7030203010001300d06092a864886f70d010105050003818", "1001a3e74c601e3beb1b7ae4f9ab2872a0aaf1dbc2cba89c7528cd", "54aa526e7a37d8ba2311a1d3d2ab79b3fbeaf3ebb9e7da9e7cdd9be1ae5a53595f47", "b1fdf62b0f540fca5458b063af9354925a6c3505a18ff164b6b195f6e517eaee1fb783", "64c2f89fdffa16729c9779f99562bc189d2ce4722ba0faedb11aa22d0d9db228fda"};
            PackageManager packageManager = activity.getPackageManager();
            packageManager.getActivityInfo(activity.getComponentName(), 128);
            packageManager.getApplicationInfo("com.unionpay.uppay", 8192);
            PackageInfo packageInfo = packageManager.getPackageInfo("com.unionpay.uppay", 4160);
            String charsString = packageInfo.signatures[0].toCharsString();
            String str3 = "";
            for (int i2 = 0; i2 < 27; i2++) {
                str3 = str3 + strArr[i2];
            }
            if (charsString != null && charsString.equals(str3) && packageInfo.versionCode >= 31) {
                Bundle bundle = new Bundle();
                bundle.putInt(h, 1);
                bundle.putString(f, str);
                bundle.putString(g, str2);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClassName(k, l);
                activity.startActivity(intent);
                return 0;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static int a(Context context, UPQuerySEPayInfoCallback uPQuerySEPayInfoCallback, boolean z2) {
        return com.unionpay.utils.b.d(context, "com.unionpay.tsmservice.mi") ? new com.unionpay.b.e(context, uPQuerySEPayInfoCallback, z2).a() : new com.unionpay.b.b(context, uPQuerySEPayInfoCallback, z2).a();
    }

    private static int a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        G = context;
        H = str3;
        I = str;
        J = str2;
        K = str4;
        C = str6;
        B = str5;
        D = TextUtils.isEmpty(str6) ? "0" : "1";
        w = null;
        x = null;
        y = null;
        if (!TextUtils.isEmpty(str6)) {
            A = str6;
        } else if (TextUtils.isEmpty(UPUtils.a(context, "se_type"))) {
            if (a(G, (UPQuerySEPayInfoCallback) new c(), false) == 0) {
                return 0;
            }
        }
        s();
        return 0;
    }

    private static String a(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            String absolutePath = context.getFilesDir().getAbsolutePath();
            if (absolutePath != null) {
                String str2 = absolutePath + File.separator + str;
                if (!new File(str2).exists()) {
                    FileOutputStream openFileOutput = context.openFileOutput(str, 1);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        openFileOutput.write(bArr, 0, read);
                    }
                    openFileOutput.close();
                    open.close();
                }
                return str2;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, boolean z2) {
        int i2;
        NfcAdapter defaultAdapter;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                i2 = Integer.parseInt(K);
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
            if (!z2) {
                jSONObject.put(Constants.Environment.KEY_TN, UPUtils.forWap(i2, com.unionpay.utils.b.a(H)));
            }
            jSONObject.put("imei", com.unionpay.utils.e.b(context));
            jSONObject.put("locale", Locale.getDefault().toString().startsWith("zh") ? "zh_CN" : "en_US");
            jSONObject.put("terminal_version", VERSION);
            jSONObject.put("terminal_resolution", (context.getResources().getDisplayMetrics().widthPixels + "*" + context.getResources().getDisplayMetrics().heightPixels).trim());
            jSONObject.put("os_name", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE.trim());
            String trim = Build.MODEL.trim();
            if (trim != null) {
                trim.replace(StringUtil.SPACE, "");
            }
            jSONObject.put("device_model", trim);
            jSONObject.put("mac", com.unionpay.utils.e.a(context));
            try {
                jSONObject.put("time_zone", TimeZone.getDefault().getDisplayName(false, 0));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    str = "disConnect";
                } else if (activeNetworkInfo.getType() != 0) {
                    str = activeNetworkInfo.getType() == 1 ? "wifi" : "other";
                } else if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    str = "mobile:" + activeNetworkInfo.getExtraInfo();
                } else {
                    str = "mobile";
                }
                jSONObject.put("network_mode", str);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            try {
                jSONObject.put(Constants.Environment.KEY_IMSI, com.unionpay.utils.e.c(context));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            try {
                jSONObject.put("baseband_version", e(com.unionpay.utils.e.a()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                jSONObject.put("root", new File("/system/bin/su").exists() ? "1" : "0");
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            try {
                StringBuffer stringBuffer = new StringBuffer(Constant.DEFAULT_CVN2);
                if (Build.VERSION.SDK_INT >= 10 && (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) != null) {
                    if (defaultAdapter.isEnabled()) {
                        stringBuffer.setCharAt(0, '1');
                    } else {
                        stringBuffer.setCharAt(0, '2');
                    }
                    if (Build.VERSION.SDK_INT >= 19 && context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce")) {
                        stringBuffer.setCharAt(1, '1');
                    }
                }
                jSONObject.put("support_map", stringBuffer.toString());
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            jSONObject.put(GearsLocator.COUNTRY, e(Locale.getDefault().getCountry()));
            String packageName = ((Activity) context).getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            jSONObject.put("package", e(packageName));
            Location d2 = com.unionpay.utils.e.d(context);
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, e(d2 != null ? Double.valueOf(d2.getLatitude()).toString() : ""));
            Location d3 = com.unionpay.utils.e.d(context);
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, e(d3 != null ? Double.valueOf(d3.getLongitude()).toString() : ""));
            jSONObject.put("tel", e(com.unionpay.utils.e.e(context)));
            if (z2) {
                try {
                    Class.forName("com.unionpay.uppay.PayActivity");
                    jSONObject.put("has_sdk", "1");
                } catch (ClassNotFoundException unused2) {
                    jSONObject.put("has_sdk", "0");
                }
            }
            jSONObject.put("seType", com.unionpay.utils.b.d(A));
            jSONObject.put("isLimitSe", D);
        } catch (PatternSyntaxException e8) {
            e8.printStackTrace();
        } catch (JSONException e9) {
            e9.printStackTrace();
        } catch (Exception unused3) {
        }
        String jSONObject2 = jSONObject.toString();
        com.unionpay.utils.j.b("uppay", "init: ".concat(String.valueOf(jSONObject2)));
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        boolean z2;
        String a2 = a(context, str2);
        if (a2 == null || TextUtils.isEmpty(a2)) {
            z2 = false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(MTURLUtil.FILE_BASE.concat(String.valueOf(a2))), "application/vnd.android.package-archive");
            context.startActivity(intent);
            z2 = true;
        }
        if (!z2 && f(str)) {
            L = str5;
            N = str2;
            if (M) {
                return;
            }
            try {
                context.registerReceiver(Y, X);
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                request.setMimeType(S);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
                request.setTitle(str3);
                request.setDescription(str4);
                request.setNotificationVisibility(1);
                UPUtils.a(context, ((DownloadManager) context.getSystemService("download")).enqueue(request), "id");
                M = true;
            } catch (Exception e2) {
                if (!(e2 instanceof IllegalArgumentException)) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(com.unionpay.utils.k.a().d);
                builder.setMessage(com.unionpay.utils.k.a().f);
                builder.setPositiveButton(com.unionpay.utils.k.a().b, new g(context));
                builder.setNegativeButton(com.unionpay.utils.k.a().c, new h(context));
                builder.create().show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(android.content.Context r16, org.json.JSONArray r17, int r18) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.UPPayAssistEx.a(android.content.Context, org.json.JSONArray, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        Bundle bundle = new Bundle();
        a(H, bundle, K);
        bundle.putString(a, I);
        bundle.putString(c, J);
        bundle.putString(b, H);
        bundle.putString(o, B);
        bundle.putString(q, C);
        if (!TextUtils.isEmpty(C)) {
            bundle.putString(r, w);
            bundle.putString(s, x);
            bundle.putString(t, y);
            bundle.putString(u, z);
        }
        bundle.putString(n, str);
        bundle.putBoolean(j, E);
        bundle.putInt(h, 2);
        try {
            Class<?> cls = Class.forName("com.unionpay.uppay.PayActivity");
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(G, cls);
            if (G instanceof Activity) {
                ((Activity) G).startActivityForResult(intent, F);
                return;
            }
            intent.addFlags(com.tencent.mapsdk.internal.y.a);
            G.startActivity(intent);
        } catch (ClassNotFoundException unused) {
        }
    }

    private static void a(String str, Bundle bundle, String str2) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        if (str.trim().charAt(0) != '<') {
            bundle.putString(m, str2);
        } else if (str2 == null || !str2.trim().equalsIgnoreCase("00")) {
            bundle.putBoolean(d, true);
        } else {
            bundle.putBoolean(d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray b(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.optJSONObject(i2));
        }
        Collections.sort(arrayList, new i(str));
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jSONArray2.put((JSONObject) arrayList.get(i3));
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:com.android.providers.downloads"));
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            context.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        int i2;
        String str = U;
        String a2 = UPUtils.a(context, "configs" + C);
        String a3 = UPUtils.a(context, JsBridgeResult.ARG_KEY_LOCATION_MODE + C);
        String a4 = UPUtils.a(context, "or" + C);
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
            try {
                System.loadLibrary("entryexpro");
                JSONObject jSONObject = new JSONObject(a2);
                String a5 = com.unionpay.utils.i.a(jSONObject, DeviceInfo.SIGN);
                try {
                    i2 = Integer.parseInt(a3);
                } catch (NumberFormatException unused) {
                    i2 = 0;
                }
                String str2 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str3 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                String a6 = com.unionpay.utils.b.a(UPUtils.a(str2 + str3 + a4));
                String forConfig = UPUtils.forConfig(i2, a5);
                if (!TextUtils.isEmpty(forConfig)) {
                    if (forConfig.equals(a6)) {
                        str = str2;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                Object a7 = com.unionpay.utils.i.a(jSONArray, i3);
                if (a7 != null) {
                    JSONObject jSONObject2 = (JSONObject) a7;
                    if ("app".equals(com.unionpay.utils.i.a(jSONObject2, "type"))) {
                        JSONArray b2 = b(com.unionpay.utils.i.c(jSONObject2, "package_info"), "sort");
                        if (b2.length() > 0) {
                            int length2 = b2.length();
                            for (int i4 = 0; i4 < length2; i4++) {
                                Object a8 = com.unionpay.utils.i.a(b2, i4);
                                if (a8 != null) {
                                    JSONObject jSONObject3 = (JSONObject) a8;
                                    String a9 = com.unionpay.utils.i.a(jSONObject3, "schema");
                                    String a10 = com.unionpay.utils.i.a(jSONObject3, DeviceInfo.SIGN);
                                    String a11 = com.unionpay.utils.i.a(jSONObject3, "version");
                                    if (com.unionpay.utils.b.a(context, a9) && a10.equalsIgnoreCase(com.unionpay.utils.b.b(context, a9)) && com.unionpay.utils.b.c(context, a9).matches(a11)) {
                                        return true;
                                    }
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return false;
    }

    public static boolean checkWalletInstalled(Context context) {
        return com.unionpay.utils.b.a(context, "com.unionpay") && "536C79B93ACFBEA950AE365D8CE1AEF91FEA9535".equalsIgnoreCase(com.unionpay.utils.b.b(context, "com.unionpay"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            w = jSONObject.getString("titleLogo");
            x = jSONObject.getString("loadingLogo");
            y = jSONObject.getString("backGroundColor");
            z = jSONObject.getString("textColor");
        } catch (JSONException unused) {
        }
    }

    private static String e(String str) {
        return str != null ? Pattern.compile("[\":,\\[\\]{}]").matcher(str).replaceAll("").trim() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean f() {
        M = false;
        return false;
    }

    private static boolean f(String str) {
        try {
            return Pattern.compile(".*(\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net)(,.*|$)", 2).matcher(new URL(str).getHost()).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getSEPayInfo(Context context, UPQuerySEPayInfoCallback uPQuerySEPayInfoCallback) {
        return a(context, uPQuerySEPayInfoCallback, true);
    }

    public static boolean installUPPayPlugin(Context context) {
        try {
            InputStream open = context.getAssets().open("UPPayPluginEx.apk");
            String absolutePath = context.getFilesDir().getAbsolutePath();
            if (absolutePath != null) {
                String str = absolutePath + File.separator + "UPPayPluginEx.apk";
                if (!new File(str).exists()) {
                    FileOutputStream openFileOutput = context.openFileOutput("UPPayPluginEx.apk", 1);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        openFileOutput.write(bArr, 0, read);
                    }
                    openFileOutput.close();
                    open.close();
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse(MTURLUtil.FILE_BASE.concat(String.valueOf(str))), "application/vnd.android.package-archive");
                context.startActivity(intent);
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ JSONArray l() {
        return W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean n() {
        P = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int r() {
        int i2 = O + 1;
        O = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s() {
        int i2;
        JSONArray jSONArray;
        String str;
        int i3;
        if (G == null) {
            return 1;
        }
        if (TextUtils.isEmpty(B) && TextUtils.isEmpty(C)) {
            E = false;
        } else {
            E = true;
            if (v.equalsIgnoreCase(C)) {
                B = p;
            }
        }
        O = 0;
        P = false;
        System.loadLibrary("entryexpro");
        Context context = G;
        String a2 = UPUtils.a(context, "configs" + C);
        Context context2 = G;
        String a3 = UPUtils.a(context2, JsBridgeResult.ARG_KEY_LOCATION_MODE + C);
        Context context3 = G;
        String a4 = UPUtils.a(context3, "or" + C);
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                String a5 = com.unionpay.utils.i.a(jSONObject, DeviceInfo.SIGN);
                try {
                    i3 = Integer.parseInt(a3);
                } catch (NumberFormatException unused) {
                    i3 = 0;
                }
                String str2 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str3 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                com.unionpay.utils.j.a("uppay", str2);
                String a6 = com.unionpay.utils.b.a(UPUtils.a(str2 + str3 + a4));
                String forConfig = UPUtils.forConfig(i3, a5);
                if (!TextUtils.isEmpty(forConfig) && forConfig.equals(a6)) {
                    if (TextUtils.isEmpty(C)) {
                        U = str2;
                    } else {
                        V = str2;
                    }
                    if (!TextUtils.isEmpty(A)) {
                        Context context4 = G;
                        String a7 = UPUtils.a(context4, "se_configs" + A);
                        if (!TextUtils.isEmpty(a7)) {
                            d(a7);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            if (TextUtils.isEmpty(C)) {
                jSONArray = new JSONArray(U);
                str = "sort";
            } else {
                jSONArray = new JSONArray(V);
                str = "sort";
            }
            W = b(jSONArray, str);
        } catch (JSONException unused3) {
        }
        Context context5 = G;
        try {
            i2 = Integer.parseInt(K);
        } catch (NumberFormatException unused4) {
            i2 = 0;
        }
        String forUrl = UPUtils.forUrl(i2);
        com.unionpay.utils.j.b("uppay", "url: ".concat(String.valueOf(forUrl)));
        Q = new com.unionpay.a.d(forUrl);
        String a8 = a(context5, false);
        com.unionpay.utils.j.b("uppay", "postdata: ".concat(String.valueOf(a8)));
        Q.a(a8);
        R = new Handler(Z);
        new d().start();
        return 0;
    }

    public static int startPay(Context context, String str, String str2, String str3, String str4) {
        return a(context, str, str2, str3, str4, "", "");
    }

    public static void startPayByJAR(Context context, Class cls, String str, String str2, String str3, String str4) {
        startPay(context, str, str2, str3, str4);
    }

    public static int startPayFromBrowser(Activity activity, String str, String str2) {
        return a(activity, str, str2);
    }

    public static int startSEPay(Context context, String str, String str2, String str3, String str4, String str5) {
        return a(context, str, str2, str3, str4, "", str5);
    }

    public static void startSamsungPay(Context context, Class cls, String str, String str2, String str3, String str4) {
        a(context, str, str2, str3, str4, p, v);
    }
}
