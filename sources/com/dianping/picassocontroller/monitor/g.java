package com.dianping.picassocontroller.monitor;

import android.os.Build;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoHorn;
import com.dianping.picasso.PicassoUtils;
import com.dianping.shield.AgentConfigParser;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(20);
    private static OkHttpClient c;
    private static long d;
    private static final SimpleDateFormat e;

    static {
        SimpleDateFormat simpleDateFormat;
        if (Build.VERSION.SDK_INT >= 26) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault(Locale.Category.DISPLAY));
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        e = simpleDateFormat;
    }

    @WorkerThread
    public static String a(Exception exc, String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {exc, str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f81539f9957341a0d723f35bf363e13", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f81539f9957341a0d723f35bf363e13") : a(exc, str, str2, jSONObject, (com.dianping.picassocontroller.vc.b) null);
    }

    @WorkerThread
    public static String a(Exception exc, String str, String str2, JSONObject jSONObject, com.dianping.picassocontroller.vc.b bVar) {
        String str3;
        boolean z;
        String[] split;
        Object[] objArr = {exc, str, str2, jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59c7a42429dad9635dc6211177fa903a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59c7a42429dad9635dc6211177fa903a");
        }
        StringWriter stringWriter = new StringWriter();
        try {
            if (exc.getLocalizedMessage().split("\n").length >= 3) {
                str3 = split[0] + CommonConstant.Symbol.COMMA + split[2];
            } else {
                str3 = exc.getLocalizedMessage();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = "";
        }
        String replace = str3.replace('\t', Constants.SPACE).replace('\n', Constants.SPACE);
        String md5 = PicassoUtils.md5(str);
        stringWriter.append((CharSequence) "$$$").append((CharSequence) md5).append((CharSequence) "###").append((CharSequence) replace).append((CharSequence) "$$$").append((CharSequence) "\n");
        stringWriter.append((CharSequence) "In ").append((CharSequence) str2).append((CharSequence) CommonConstant.Symbol.COLON);
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Log.e("JS Exception", stringWriter2);
        com.dianping.codelog.b.a(g.class, stringWriter2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c74e84384f7fd5969e5dd88f004fb165", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c74e84384f7fd5969e5dd88f004fb165")).booleanValue();
        } else {
            if (System.currentTimeMillis() - d > 86400000) {
                d = System.currentTimeMillis();
                b.set(20);
            }
            z = b.getAndDecrement() > 0 && !com.dianping.picassocontroller.debug.c.a().d;
        }
        if (z) {
            PicassoHorn.HornConfig hornConfig = PicassoHorn.getHornConfig();
            if (hornConfig.jsErrorUploadVCInfo) {
                com.dianping.networklog.c.a("[Picasso vcInfo] " + a(bVar), 3);
            }
            if (hornConfig.jsErrorUploadToCat) {
                JSONObject a2 = a(replace, stringWriter2, str2, jSONObject, md5);
                Object[] objArr3 = {a2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "290695ec2ceefaf55fe7e7e1a5a28de6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "290695ec2ceefaf55fe7e7e1a5a28de6");
                } else {
                    if (c == null) {
                        c = new OkHttpClient();
                    }
                    c.newCall(new Request.Builder().url("https://catdot.dianping.com/broker-service/crashlog").header("Accept-Encoding", "gzip").post(RequestBody.create(MediaType.parse("multipart/form-data"), c(a2.toString()))).build()).enqueue(new Callback() { // from class: com.dianping.picassocontroller.monitor.g.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Callback
                        public final void onResponse(Call call, Response response) throws IOException {
                            Object[] objArr4 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3360dc518de8bc06fa690fd46929ec38", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3360dc518de8bc06fa690fd46929ec38");
                            }
                        }

                        @Override // okhttp3.Callback
                        public final void onFailure(Call call, IOException iOException) {
                            Object[] objArr4 = {call, iOException};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "37f6dc0ce1f64471dd4659e5590b4619", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "37f6dc0ce1f64471dd4659e5590b4619");
                            } else {
                                Log.e("CrashReport", "Failed to send crash report to Cat");
                            }
                        }
                    });
                }
            }
            if (hornConfig.jsErrorUploadToCrashPlatform) {
                JSONObject b2 = b(replace, stringWriter2, str2, jSONObject, md5);
                Object[] objArr4 = {b2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "73c84c6502b98d7fbeb4f8c2d04afd5b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "73c84c6502b98d7fbeb4f8c2d04afd5b");
                } else {
                    if (c == null) {
                        c = new OkHttpClient();
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(b2);
                    c.newCall(new Request.Builder().url("https://dreport.meituan.net/perf/public/").header("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON).post(RequestBody.create(MediaType.parse(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON), jSONArray.toString())).build()).enqueue(new Callback() { // from class: com.dianping.picassocontroller.monitor.g.2
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Callback
                        public final void onResponse(Call call, Response response) throws IOException {
                            Object[] objArr5 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "86aba03f4db7e763a47d4d30627d8d42", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "86aba03f4db7e763a47d4d30627d8d42");
                            }
                        }

                        @Override // okhttp3.Callback
                        public final void onFailure(Call call, IOException iOException) {
                            Object[] objArr5 = {call, iOException};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1abcbd70e41116e18d99c2cb68d340b7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1abcbd70e41116e18d99c2cb68d340b7");
                            } else {
                                Log.e("CrashReport", "Failed to send crash report to Crash");
                            }
                        }
                    });
                }
            }
            if (hornConfig.jsErrorUploadToRaptor) {
                JSONObject c2 = c(replace, stringWriter2, str2, jSONObject, md5);
                Object[] objArr5 = {c2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "cf74564f861394de316ae40a0bb6c772", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "cf74564f861394de316ae40a0bb6c772");
                } else {
                    String format = String.format("c=[%s]", c2.toString().replaceAll("&", "%26").replaceAll("=", "%3D"));
                    if (c == null) {
                        c = new OkHttpClient();
                    }
                    c.newCall(new Request.Builder().url("https://catfront.dianping.com/api/log?v=1").header(Constants.TRAFFIC_REFERER, AgentConfigParser.PICASSO_PREFIX).header("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM).post(RequestBody.create(MediaType.parse(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM), format)).build()).enqueue(new Callback() { // from class: com.dianping.picassocontroller.monitor.g.3
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Callback
                        public final void onResponse(Call call, Response response) throws IOException {
                            Object[] objArr6 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "86179ff867ea2f56d3a12ff4075f91f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "86179ff867ea2f56d3a12ff4075f91f0");
                            }
                        }

                        @Override // okhttp3.Callback
                        public final void onFailure(Call call, IOException iOException) {
                            Object[] objArr6 = {call, iOException};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "aaaae3f856de7cabf786752399131f2c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "aaaae3f856de7cabf786752399131f2c");
                            } else {
                                Log.e("CrashReport", "Failed to send crash report to Raptor");
                            }
                        }
                    });
                }
            }
            return stringWriter2;
        }
        return stringWriter2;
    }

    private static String a(com.dianping.picassocontroller.vc.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9360c048a876f5945bbac9cf8eeeada", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9360c048a876f5945bbac9cf8eeeada");
        }
        if (bVar != null) {
            try {
                return com.dianping.picassocontroller.jse.b.b(bVar, "currentVCInfo", new Object[0]).string();
            } catch (ArchiveException e2) {
                e2.printStackTrace();
                return "";
            }
        }
        return "";
    }

    private static String a(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fbaf8819f973c4a81126427e9b67008", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fbaf8819f973c4a81126427e9b67008") : (TextUtils.isEmpty(str) || (indexOf = str.indexOf(47)) <= 0) ? "default" : str.substring(0, indexOf);
    }

    private static String b(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "860daddfe07262b65b117e1df1f877c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "860daddfe07262b65b117e1df1f877c2") : (TextUtils.isEmpty(str) || (indexOf = str.indexOf(47)) <= 0) ? str : str.substring(indexOf + 1, str.length());
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59975826506956c14ac349bbef293a4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59975826506956c14ac349bbef293a4d");
        }
        String str = PicassoEnvironment.getPicassoEnvironment(null).unionId;
        return TextUtils.isEmpty(str) ? com.dianping.codelog.b.a() != null ? com.dianping.codelog.b.a().b() : StringUtil.NULL : str;
    }

    private static String a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, str, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a96a53658dc499d3e6b4d40e3aa2d61f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a96a53658dc499d3e6b4d40e3aa2d61f");
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                sb.append(next + "=" + string + "\n");
            }
            sb.append("\n");
            sb.append("\n");
            sb.append("\n");
            sb.append(str);
            sb.append("\n");
            sb.append("\n");
            if (jSONObject2 != null) {
                sb.append(jSONObject2.toString());
                sb.append("\n");
                sb.append("\n");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    private static JSONObject a(String str, String str2, String str3, JSONObject jSONObject, String str4) {
        Object[] objArr = {str, str2, str3, jSONObject, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "121ee63f60c8c9c4f44d65ffaae3b00e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "121ee63f60c8c9c4f44d65ffaae3b00e");
        }
        JSONObject jSONObject2 = new JSONObject();
        PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(null);
        try {
            jSONObject2.put("category", "PICASSO");
            jSONObject2.put("appId", a(picassoEnvironment.appID));
            jSONObject2.put("debug", picassoEnvironment.isDebug);
            jSONObject2.put("crashTime", e.format(new Date(System.currentTimeMillis())));
            jSONObject2.put("platVersion", Build.VERSION.RELEASE);
            jSONObject2.put("os-build", Build.ID);
            jSONObject2.put("deviceBrand", Build.BRAND);
            jSONObject2.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
            jSONObject2.put("device-fingerprint", Build.FINGERPRINT);
            jSONObject2.put("platform", "android");
            jSONObject2.put("unionId", a());
            jSONObject2.put("thread", "JS Thread");
            jSONObject2.put("reason", str);
            jSONObject2.put("appVersion", picassoEnvironment.appVersion);
            jSONObject2.put("md5", str4);
            jSONObject2.put("projectName", a(str3));
            jSONObject2.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, b(str3));
            jSONObject2.put("crashContent", a(jSONObject2, str2, jSONObject));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    private static JSONObject b(String str, String str2, String str3, JSONObject jSONObject, String str4) {
        Object[] objArr = {str, str2, str3, jSONObject, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d90e2bc40636ac553344b76172905d2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d90e2bc40636ac553344b76172905d2e");
        }
        JSONObject jSONObject2 = new JSONObject();
        PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(null);
        try {
            jSONObject2.put("category", "fe_perf_public");
            jSONObject2.put("type", AgentConfigParser.PICASSO_PREFIX);
            jSONObject2.put("appVersion", picassoEnvironment.appVersion);
            jSONObject2.put("osVersion", Build.VERSION.RELEASE);
            jSONObject2.put("deviceManufacturer", Build.MANUFACTURER);
            jSONObject2.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
            jSONObject2.put("uploadTime", e.format(new Date(System.currentTimeMillis())));
            jSONObject2.put("occurTime", e.format(new Date(System.currentTimeMillis())));
            jSONObject2.put(DeviceInfo.USER_ID, a());
            jSONObject2.put("os", "Android");
            jSONObject2.put("platform", "Android");
            if (picassoEnvironment.appID == 0) {
                jSONObject2.put("token", picassoEnvironment.isDebug ? "5af445f3bf1f4a79528b38b7" : "57451e181ad409036f4d3e79");
                jSONObject2.put("project", picassoEnvironment.isDebug ? "dianpingdebug" : "android-nova");
            } else if (picassoEnvironment.appID == 1) {
                jSONObject2.put("token", picassoEnvironment.isDebug ? "55507bb5ce08881827921b6c" : "566a3fa581e6e3b434f44a75");
                jSONObject2.put("project", picassoEnvironment.isDebug ? "androidtest" : "android_platform_monitor");
            }
            jSONObject2.put(ShowLogJsHandler.PARAM_NAME_MODULE, b(str3));
            jSONObject2.put("message", str);
            jSONObject2.put("guid", UUID.randomUUID().toString());
            jSONObject2.put("pageStack", "");
            jSONObject2.put("lastPage", "");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("debug", picassoEnvironment.isDebug);
            jSONObject3.put("appId", a(picassoEnvironment.appID));
            jSONObject3.put("projectName", a(str3));
            jSONObject3.put("md5", str4);
            jSONObject3.put("status", jSONObject);
            jSONObject2.put("userInfo", jSONObject3);
            jSONObject2.put(SnifferDBHelper.COLUMN_LOG, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    private static JSONObject c(String str, String str2, String str3, JSONObject jSONObject, String str4) {
        String str5;
        Object[] objArr = {str, str2, str3, jSONObject, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "503bf10530195fa2fdb7a871c85992e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "503bf10530195fa2fdb7a871c85992e9");
        }
        JSONObject jSONObject2 = new JSONObject();
        PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(null);
        try {
            jSONObject2.put("level", picassoEnvironment.isDebug ? "debug" : "error");
            jSONObject2.put("os", "Android");
            Object[] objArr2 = {str3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0fcdde6df08dca83358af50ea4bcb79a", RobustBitConfig.DEFAULT_VALUE)) {
                str5 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0fcdde6df08dca83358af50ea4bcb79a");
            } else {
                str5 = "com.sankuai.pcs.jserror." + a(str3).toLowerCase().replaceAll("[-_]", "");
            }
            jSONObject2.put("project", str5);
            jSONObject2.put("category", "jsError");
            jSONObject2.put("pageUrl", str3);
            jSONObject2.put("unionId", a());
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("sec_category", str);
            }
            String b2 = b(str3);
            if (!TextUtils.isEmpty(b2)) {
                jSONObject2.put("resourceUrl", b2);
            }
            jSONObject2.put("content", str2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("appId", a(picassoEnvironment.appID));
            jSONObject3.put("appVersion", picassoEnvironment.appVersion);
            jSONObject3.put("platVersion", Build.VERSION.RELEASE);
            jSONObject3.put("deviceBrand", Build.BRAND);
            jSONObject3.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
            jSONObject3.put("projectName", a(str3));
            jSONObject3.put("md5", str4);
            jSONObject3.put("crashTime", e.format(new Date(System.currentTimeMillis())));
            jSONObject3.put("status", jSONObject);
            jSONObject2.put("dynamicMetric", jSONObject3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d01d771db6b49d755ed21ca3c9dbd85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d01d771db6b49d755ed21ca3c9dbd85");
        }
        switch (i) {
            case 0:
                return "1";
            case 1:
                return "10";
            default:
                return String.valueOf(i);
        }
    }

    private static byte[] c(String str) {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55a869dd0873645d48586c200a70fcc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55a869dd0873645d48586c200a70fcc1");
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                gZIPOutputStream.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                th.printStackTrace();
                byte[] bArr = new byte[0];
                try {
                    byteArrayOutputStream.close();
                    if (gZIPOutputStream2 != null) {
                        gZIPOutputStream2.close();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                return bArr;
            } catch (Throwable th3) {
                GZIPOutputStream gZIPOutputStream3 = gZIPOutputStream2;
                try {
                    byteArrayOutputStream.close();
                    if (gZIPOutputStream3 != null) {
                        gZIPOutputStream3.close();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                throw th3;
            }
        }
    }
}
