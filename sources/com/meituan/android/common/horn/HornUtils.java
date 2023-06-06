package com.meituan.android.common.horn;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.b;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornUtils {
    private static final String RELEASEBASEURL = "https://portal-portm.meituan.com/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HornService hornService;
    private static String packageName;
    private static String processName;
    public static String token;
    private static String versionName;

    public static String getSdkVersion() {
        return com.meituan.android.common.horn.core.BuildConfig.VERSION_NAME_HORN;
    }

    public static int obtainRetryTimes() {
        return 3;
    }

    public static String obtainToken(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "679f75d34ad7485a010cf512bf3c1529", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "679f75d34ad7485a010cf512bf3c1529");
        }
        if (TextUtils.isEmpty(token)) {
            token = obtainTokenInner(context);
        }
        return token;
    }

    private static String obtainTokenInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd911f5d940a5e46afd89bc47eee5fff", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd911f5d940a5e46afd89bc47eee5fff");
        }
        if (context == null) {
            return "";
        }
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("horn_token");
            Logw.d(Logw.TAG, string);
            return string;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return "";
        }
    }

    public static String getVersionName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a541f2de5d1cf201d06c1305e6d59749", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a541f2de5d1cf201d06c1305e6d59749");
        }
        if (TextUtils.isEmpty(versionName)) {
            versionName = getVersionNameInner(context);
        }
        return versionName;
    }

    private static String getVersionNameInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e256fcfdcff2f863ec94703e7aa2dae", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e256fcfdcff2f863ec94703e7aa2dae");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dec06d1837181c3ba4ec5c0a0c021c72", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dec06d1837181c3ba4ec5c0a0c021c72");
        }
        if (TextUtils.isEmpty(packageName)) {
            packageName = getPackageNameInner(context);
        }
        return packageName;
    }

    private static String getPackageNameInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "294f8b3d0300f6fb4b30dd897458e8ce", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "294f8b3d0300f6fb4b30dd897458e8ce");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean isPushProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb5ba6c16fde64aea291ea48af0741f2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb5ba6c16fde64aea291ea48af0741f2")).booleanValue();
        }
        String obtainProcessName = obtainProcessName(context);
        if (TextUtils.isEmpty(obtainProcessName)) {
            return false;
        }
        return obtainProcessName.endsWith(":dppushservice") || obtainProcessName.endsWith(":pushservice");
    }

    private static String obtainProcessName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b277589c7bf03447a4ee5318d2b9f10f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b277589c7bf03447a4ee5318d2b9f10f");
        }
        if (TextUtils.isEmpty(processName)) {
            processName = obtainProcessNameInner(context);
        }
        return processName;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String getProcessNameByFile() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.common.horn.HornUtils.changeQuickRedirect
            java.lang.String r9 = "88487c668eefd56014b920614c8aac11"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r8, r1, r9)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1c:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L67
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L67
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L67
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L67
            r4.append(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L67
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "iso-8859-1"
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L67
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L68
        L4a:
            int r2 = r0.read()     // Catch: java.lang.Throwable -> L68
            if (r2 <= 0) goto L55
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L68
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            goto L4a
        L55:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L68
            r0.close()     // Catch: java.io.IOException -> L5c
        L5c:
            return r1
        L5d:
            r1 = move-exception
            r2 = r0
            goto L61
        L60:
            r1 = move-exception
        L61:
            if (r2 == 0) goto L66
            r2.close()     // Catch: java.io.IOException -> L66
        L66:
            throw r1
        L67:
            r0 = r2
        L68:
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.io.IOException -> L6d
        L6d:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornUtils.getProcessNameByFile():java.lang.String");
    }

    private static String obtainProcessNameInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80dfab34045f084391801fd463e6fd87", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80dfab34045f084391801fd463e6fd87");
        }
        if (context == null) {
            return "";
        }
        String processNameByPid = getProcessNameByPid(context);
        if (TextUtils.isEmpty(processNameByPid)) {
            processNameByPid = getProcessNameByFile();
        }
        return TextUtils.isEmpty(processNameByPid) ? "" : processNameByPid.replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE);
    }

    private static String getProcessNameByPid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64797282e6889dce3fda37407b02f17a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64797282e6889dce3fda37407b02f17a");
        }
        try {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String obtainValue(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d473511be2747d7044627d1fe6353cd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d473511be2747d7044627d1fe6353cd") : TextUtils.isEmpty(str) ? str2 : str;
    }

    public static void sleepForNext(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8385c58034aa893a0fa5ad8b3e89e5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8385c58034aa893a0fa5ad8b3e89e5e");
            return;
        }
        long j = 600000;
        switch (i) {
            case 1:
                j = 50000;
                break;
            case 2:
                j = MetricsAnrManager.ANR_THRESHOLD;
                break;
            case 3:
                j = 500;
                break;
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            if (InnerHorn.isDebug) {
                e.printStackTrace();
            }
        }
    }

    public static HornService obtainService() {
        a.InterfaceC0637a callFactory;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af4f03b061bc4e36ef6e23bd24b8f2a6", 6917529027641081856L)) {
            return (HornService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af4f03b061bc4e36ef6e23bd24b8f2a6");
        }
        if (hornService == null) {
            HornConfiguration config = InnerHorn.getConfig();
            if (config.callFactory() == null) {
                callFactory = com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a();
            } else {
                callFactory = config.callFactory();
            }
            ar.a a = new ar.a().a(config.baseUrl()).a(callFactory).a(new Interceptor() { // from class: com.meituan.android.common.horn.HornUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;
                private final String MOCK_HOST = "appmock.sankuai.com";
                private final String MOCK_SCHEME = "http";

                @Override // com.sankuai.meituan.retrofit2.Interceptor
                public final b intercept(Interceptor.a aVar) throws IOException {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "76c831c8ad2e1e0d6cedc6b5c1e38052", 6917529027641081856L)) {
                        return (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "76c831c8ad2e1e0d6cedc6b5c1e38052");
                    }
                    aj request = aVar.request();
                    try {
                        if (InnerHorn.isMock) {
                            URI uri = new URI(request.b());
                            aj.a b = request.a().b(new t.a().a("http").b("appmock.sankuai.com").c(uri.getRawPath()).d(uri.getRawQuery()).b().toString()).b("MKOriginHost", uri.getHost()).b("MKScheme", uri.getScheme()).b("MKTunnelType", "http").b("MKAppID", "10");
                            if (!TextUtils.isEmpty(InnerHorn.uuid)) {
                                b.b("mkunionid", InnerHorn.uuid);
                            }
                            request = b.a();
                        }
                    } catch (Throwable th) {
                        if (InnerHorn.isDebug) {
                            th.printStackTrace();
                        }
                    }
                    return aVar.a(request);
                }
            }).a(com.sankuai.meituan.retrofit2.converter.gson.a.a());
            if (InnerHorn.isDebug) {
                a.a(new LogInterceptor());
            }
            hornService = (HornService) a.a().a(HornService.class);
        }
        return hornService;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LogInterceptor implements Interceptor {
        public static ChangeQuickRedirect changeQuickRedirect;

        public LogInterceptor() {
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dece2f5635fce2121da4b8f0e86efaea", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dece2f5635fce2121da4b8f0e86efaea");
            }
            aj request = aVar.request();
            b a = aVar.a(request);
            if (InnerHorn.isDebug) {
                System.out.println(String.format("HornDebug>>拦截 请求网络(进程 %s) method:%s code:%s url:%s", ProcessUtils.getCurrentProcessName(), request.c(), String.valueOf(a.code()), request.b()));
            }
            return a;
        }
    }

    public static Map<String, String> jsonToMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1409674ca47db912777925045d4e274a", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1409674ca47db912777925045d4e274a");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return new HashMap();
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return new HashMap();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static byte[] convertGZip(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornUtils.changeQuickRedirect
            java.lang.String r10 = "f2905de1ab0dc6a8f38eb39779f4bee8"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            byte[] r11 = (byte[]) r11
            return r11
        L1e:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L52
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L53
            byte[] r11 = r11.getBytes(r3)     // Catch: java.lang.Throwable -> L53
            r1.write(r11)     // Catch: java.lang.Throwable -> L53
            r1.flush()     // Catch: java.lang.Throwable -> L53
            r1.close()     // Catch: java.lang.Throwable -> L53
            r0.close()     // Catch: java.lang.Throwable -> L53
            byte[] r11 = r0.toByteArray()     // Catch: java.lang.Throwable -> L53
            r0.close()     // Catch: java.io.IOException -> L5c
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L5c
        L45:
            r11 = move-exception
            goto L49
        L47:
            r11 = move-exception
            r1 = r2
        L49:
            r0.close()     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r11
        L52:
            r1 = r2
        L53:
            r0.close()     // Catch: java.io.IOException -> L5b
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L5b
        L5b:
            r11 = r2
        L5c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornUtils.convertGZip(java.lang.String):byte[]");
    }

    public static String unescapeJava(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff506685fd42e1e1fe21eea90b0a9ac2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff506685fd42e1e1fe21eea90b0a9ac2");
        }
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            unescapeJava(new PrintWriter(stringWriter), str);
            return stringWriter.getBuffer().toString();
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static void unescapeJava(Writer writer, String str) throws IOException {
        Object[] objArr = {writer, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c72422ae2b519ebd4cd5efc571a7ab81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c72422ae2b519ebd4cd5efc571a7ab81");
        } else if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        } else {
            if (str == null) {
                return;
            }
            int length = str.length();
            StringBuffer stringBuffer = new StringBuffer(4);
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!z) {
                    if (z2) {
                        if (charAt != '\"') {
                            if (charAt != '\'') {
                                if (charAt != '\\') {
                                    if (charAt != 'b') {
                                        if (charAt != 'f') {
                                            if (charAt != 'n') {
                                                if (charAt == 'r') {
                                                    writer.write(13);
                                                } else {
                                                    switch (charAt) {
                                                        case 't':
                                                            writer.write(9);
                                                            break;
                                                        case 'u':
                                                            z = true;
                                                            break;
                                                        default:
                                                            writer.write(charAt);
                                                            break;
                                                    }
                                                }
                                            } else {
                                                writer.write(10);
                                            }
                                        } else {
                                            writer.write(12);
                                        }
                                    } else {
                                        writer.write(8);
                                    }
                                } else {
                                    writer.write(92);
                                }
                            } else {
                                writer.write(39);
                            }
                        } else {
                            writer.write(34);
                        }
                    } else {
                        if (charAt == '\\') {
                            z2 = true;
                        } else {
                            writer.write(charAt);
                        }
                    }
                } else {
                    stringBuffer.append(charAt);
                    if (stringBuffer.length() == 4) {
                        try {
                            writer.write((char) Integer.parseInt(stringBuffer.toString(), 16));
                            stringBuffer.setLength(0);
                            z = false;
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                z2 = false;
            }
            if (z2) {
                writer.write(92);
            }
        }
    }

    public static boolean isBinaryFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa7aa182251f0348623def8a147d8c03", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa7aa182251f0348623def8a147d8c03")).booleanValue() : !TextUtils.isEmpty(str) && str.contains("horn-file-protocol-");
    }

    public static boolean isHighPriorityProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ae2edc4634d621997b89940cc400c63", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ae2edc4634d621997b89940cc400c63")).booleanValue();
        }
        String currentProcessName = ProcessUtils.getCurrentProcessName(context);
        return ProcessUtils.isMainProcess(context) || (!TextUtils.isEmpty(currentProcessName) && currentProcessName.contains("miniApp"));
    }
}
