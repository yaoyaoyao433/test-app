package com.meituan.snare;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.AnyThread;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.WebViewUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class NativeCrashHandler {
    private static final String ON_BACKGROUND = "onBackground";
    private static final String ON_FOREGROUND = "onForeground";
    private static final String STEP_EXTRA = "Extra Info";
    private static final String STEP_JAVA_STACK_TRACE = "Java Stack Trace";
    private static final String STEP_ON_NATIVE_CRASH = "onNativeCrash";
    private static final String STEP_OTHER_INFO = "Other info";
    private static final String STEP_PROCESS_MEMORY = "Process Memory";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String filePath;
    public static boolean isSoInit;
    private static Field sThreadNativePeer;
    private static String stepsFilePath;
    private static final NativeCrashHandler instance = new NativeCrashHandler();
    public static volatile boolean isSignalAnrInit = false;
    private static String writeFileStep = "";

    private static native String aarch_();

    public static native boolean checkBacktrace();

    private String checkNull(String str) {
        return str == null ? "" : str;
    }

    private static native boolean checkThreadTidOffset(long j);

    private static native int dumpAllThreadStackTraceNative(String str);

    private static native int getTidOfThread(long j);

    private static native int init(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3);

    private static native int initSigQuitHandler(boolean z);

    public static native boolean initSignalAnrHandler_(boolean z);

    private static native void makeJNICrash();

    private static native int redirectStderr(String str);

    private static native int restoreStderr();

    public static native void setBacktraceConfig(int i);

    private static native void setWebViewPackageAndVersion(String str, String str2);

    private static native int suppressionGC();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        SUCCESS,
        FAIL,
        DEVICE_ENV_FAIL,
        DEVICE_UNWIND_FAIL,
        SIGNAL_HANDLER_FAIL,
        THREAD_FAIL,
        JAVA_BRIDGE_FAIL,
        CLEAN_JVM_FAIL;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e8563777cb5857c3d22c55a7708d59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e8563777cb5857c3d22c55a7708d59");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91561a90c19bf27f12e5598c0ff355cc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91561a90c19bf27f12e5598c0ff355cc") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd51439c2ac643098d1373fa488c05cf", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd51439c2ac643098d1373fa488c05cf") : (a[]) values().clone();
        }

        public static a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88e879887450701cfb9ab2e729011c65", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88e879887450701cfb9ab2e729011c65");
            }
            if (i == 0) {
                return SUCCESS;
            }
            switch (i) {
                case -7:
                    return CLEAN_JVM_FAIL;
                case -6:
                    return JAVA_BRIDGE_FAIL;
                case -5:
                    return THREAD_FAIL;
                case -4:
                    return SIGNAL_HANDLER_FAIL;
                case -3:
                    return DEVICE_UNWIND_FAIL;
                case -2:
                    return DEVICE_ENV_FAIL;
                default:
                    return FAIL;
            }
        }
    }

    static {
        isSoInit = false;
        try {
            System.loadLibrary("snare_2.0.0");
            isSoInit = true;
        } catch (Throwable th) {
            th.printStackTrace();
            new CatchException("metrics-crash", 1, 1000L).reportException(th);
        }
    }

    public static NativeCrashHandler getInstance() {
        return instance;
    }

    public void init(Context context, n nVar) {
        String str;
        Object[] objArr = {context, nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0098cf6142a9d4d90cf75c79d72aeeb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0098cf6142a9d4d90cf75c79d72aeeb1");
        } else if (!isSoInit) {
            com.meituan.crashreporter.g.a().a("soFailCount", "", "", "SO_LOAD_FAIL");
        } else {
            filePath = f.a().b("native-Crash");
            stepsFilePath = f.a().c("native-Crash");
            if (Build.VERSION.SDK_INT >= 21) {
                str = TextUtils.join(CommonConstant.Symbol.COMMA, Build.SUPPORTED_ABIS);
            } else {
                str = Build.CPU_ABI;
                String str2 = Build.CPU_ABI2;
                if (!TextUtils.isEmpty(str2)) {
                    str = str + CommonConstant.Symbol.COMMA + str2;
                }
            }
            a a2 = a.a(init(Build.VERSION.SDK_INT, checkNull(Build.VERSION.RELEASE), checkNull(str), checkNull(Build.MANUFACTURER), checkNull(Build.BRAND), checkNull(Build.MODEL), checkNull(Build.FINGERPRINT), checkNull(filePath), checkNull(f.a().d("native-Crash")), checkNull(Internal.getAppEnvironment().getApkHash()), checkNull(Internal.getAppEnvironment().getAppVersion()), checkNull(""), checkNull(""), checkNull(nVar.r), checkNull(m.a().f), checkNull(stepsFilePath), nVar.d, nVar.g, nVar.i, nVar.j, nVar.k, nVar.l, nVar.h));
            if (a2 != a.SUCCESS) {
                com.meituan.crashreporter.g.a().a("soFailCount", "", "", a2.name());
            }
        }
    }

    private static void onNativeCrash(String str, boolean z, String str2, int i) {
        RandomAccessFile randomAccessFile;
        StackTraceElement[] stackTrace;
        StackTraceElement[] stackTrace2;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        RandomAccessFile randomAccessFile2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ae1def9c107a1a7e9f4b5da34246153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ae1def9c107a1a7e9f4b5da34246153");
            return;
        }
        System.out.println("Crash GUID: " + f.a().d("native-Crash"));
        writeFileStep = STEP_ON_NATIVE_CRASH;
        try {
            try {
                p.a().b();
                randomAccessFile = new RandomAccessFile(new File(filePath), "rws");
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long j = 0;
            if (randomAccessFile.length() > 0) {
                MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                long length = randomAccessFile.length();
                while (length > 0 && map.get(((int) length) - 1) == 0) {
                    length--;
                }
                j = length;
            }
            randomAccessFile.seek(j);
            if (!z) {
                String stackTrace3 = getStackTrace(i, str2);
                if (!TextUtils.isEmpty(stackTrace3)) {
                    randomAccessFile.write(("Java stacktrace\n" + stackTrace3 + "\n").getBytes("UTF-8"));
                }
                Thread thread = Looper.getMainLooper().getThread();
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                    sb.append("    at ");
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
                randomAccessFile.write(("Main thread\n" + ((Object) sb) + "\n").getBytes("UTF-8"));
            } else {
                Thread thread2 = Looper.getMainLooper().getThread();
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement2 : thread2.getStackTrace()) {
                    sb2.append("    at ");
                    sb2.append(stackTraceElement2.toString());
                    sb2.append("\n");
                }
                randomAccessFile.write(("Java stacktrace\n" + sb2.toString() + "\n").getBytes("UTF-8"));
            }
            writeFileStep = STEP_JAVA_STACK_TRACE;
            String a2 = t.a();
            if (!TextUtils.isEmpty(a2)) {
                randomAccessFile.write(("Process Memory Info\n" + a2 + "\n").getBytes("UTF-8"));
            }
            writeFileStep = STEP_PROCESS_MEMORY;
            randomAccessFile.write(("dfpid\n" + com.meituan.crashreporter.e.a().c() + "\n").getBytes("UTF-8"));
            if (!com.meituan.crashreporter.c.c) {
                randomAccessFile.write(("OOMPage\n" + UserActionsProvider.getInstance().getOomPages() + "\n").getBytes("UTF-8"));
            }
            randomAccessFile.write(("appLaunched\n" + UserActionsProvider.getInstance().isAppLaunched() + "\n").getBytes("UTF-8"));
            randomAccessFile.write(("maxMemApp\n" + DeviceUtil.queryAppMemory(m.a().c) + "\n").getBytes("UTF-8"));
            randomAccessFile.write(("totalMemPhone\n" + DeviceUtil.queryTotalPhoneMemory(m.a().c) + "\n").getBytes("UTF-8"));
            randomAccessFile.write(("totalMemApp\n" + DeviceUtil.queryTotalAppMemory(m.a().c) + "\n").getBytes("UTF-8"));
            randomAccessFile.write(("App state\n" + (AppBus.getInstance().isForeground() ? ON_FOREGROUND : ON_BACKGROUND) + "\n").getBytes("UTF-8"));
            randomAccessFile.write(("MRN JS Details\n" + t.a(Metrics.getInstance().collectMrnJsMemory()) + "\n").getBytes("UTF-8"));
            randomAccessFile.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
            writeFileStep = STEP_OTHER_INFO;
            randomAccessFile.write(m.a().a(str, false).getBytes("UTF-8"));
            writeFileStep = STEP_EXTRA;
            writeStepToFile();
            randomAccessFile.close();
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            try {
                th.printStackTrace();
                writeStepToFile();
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                m.a().a(str, true, false);
            } catch (Throwable th3) {
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                writeStepToFile();
                if (randomAccessFile3 != null) {
                    try {
                        randomAccessFile3.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th3;
            }
        }
        m.a().a(str, true, false);
    }

    private static String getStackTrace(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "086a6c28e6b04c411dedcfef9a08cf17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "086a6c28e6b04c411dedcfef9a08cf17");
        }
        try {
            if (Build.VERSION.SDK_INT >= 23 && checkThreadTidOffset()) {
                Field declaredField = ThreadGroup.class.getDeclaredField("systemThreadGroup");
                declaredField.setAccessible(true);
                ThreadGroup threadGroup = (ThreadGroup) declaredField.get(null);
                int activeCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[activeCount + (activeCount / 2)];
                int enumerate = threadGroup.enumerate(threadArr);
                for (int i2 = 0; i2 < enumerate; i2++) {
                    Thread thread = threadArr[i2];
                    if (getTidOfThread(threadPeer(thread)) == i) {
                        return stackTrace(thread.getStackTrace());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                if (entry.getKey().getName().contains(str)) {
                    return stackTrace(entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String stackTrace(StackTraceElement[] stackTraceElementArr) {
        Object[] objArr = {stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57b498281981a2c851090fb6ad29c764", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57b498281981a2c851090fb6ad29c764");
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("    at ");
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private static void writeStepToFile() {
        RandomAccessFile randomAccessFile;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2db92fe129abd5f11a3b6ef496b9337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2db92fe129abd5f11a3b6ef496b9337");
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(new File(stepsFilePath), "rws");
        } catch (Exception unused) {
            randomAccessFile = null;
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(writeFileStep.getBytes("UTF-8"));
            try {
                randomAccessFile.close();
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused4) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
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
    public java.lang.String getAllThreadStackTrace() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.snare.NativeCrashHandler.changeQuickRedirect
            java.lang.String r10 = "cf202f6287e9fd6ab5e5fe785f726d73"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r9, r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            boolean r1 = com.meituan.snare.NativeCrashHandler.isSoInit
            if (r1 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            com.meituan.snare.p r1 = com.meituan.snare.p.a()
            r1.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.meituan.snare.f r9 = com.meituan.snare.f.a()
            java.lang.Object[] r10 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.snare.f.a
            java.lang.String r12 = "a8680bd146467c55ae237346b7ce1259"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L4c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r9, r11, r0, r12)
            java.lang.String r0 = (java.lang.String) r0
            goto L5a
        L4c:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = ".anr"
            java.lang.String r0 = r9.b(r0, r2)
        L5a:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L9a
            int r2 = dumpAllThreadStackTraceNative(r0)
            if (r2 < 0) goto L9a
            r2 = 0
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L93
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L93
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L93
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L93
        L76:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L85
            r1.append(r2)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L94
            goto L76
        L85:
            r0.close()     // Catch: java.lang.Throwable -> L97
            goto L97
        L89:
            r1 = move-exception
            goto L8d
        L8b:
            r1 = move-exception
            r0 = r2
        L8d:
            if (r0 == 0) goto L92
            r0.close()     // Catch: java.lang.Throwable -> L92
        L92:
            throw r1
        L93:
            r0 = r2
        L94:
            if (r0 == 0) goto L97
            goto L85
        L97:
            r3.delete()     // Catch: java.lang.Throwable -> L9a
        L9a:
            com.meituan.snare.p r0 = com.meituan.snare.p.a()
            r0.c()
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.NativeCrashHandler.getAllThreadStackTrace():java.lang.String");
    }

    public static int initSigQuitHandlerJava() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "038a23a1ab1fc52fd5deba9eb33a41bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "038a23a1ab1fc52fd5deba9eb33a41bd")).intValue();
        }
        if (isSoInit) {
            PrintStream printStream = System.err;
            printStream.println("handle sigquit ss" + initSigQuitHandler(isSignalAnrInit));
            return 0;
        }
        return -1;
    }

    public static int suppressionGCJava() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "362c078fc5e43283206dd80b7a93803b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "362c078fc5e43283206dd80b7a93803b")).intValue();
        }
        if (isSoInit) {
            return suppressionGC();
        }
        return -1;
    }

    public static void makeJNICrashJava() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "678bcccb8c440d9b45ce07548afe0afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "678bcccb8c440d9b45ce07548afe0afc");
        } else if (isSoInit) {
            makeJNICrash();
        }
    }

    public static int redirectStderrJava(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8375a26b0a7f2131cdf8d010a8659b5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8375a26b0a7f2131cdf8d010a8659b5b")).intValue();
        }
        if (isSoInit && !TextUtils.isEmpty(str)) {
            return redirectStderr(str);
        }
        return -1;
    }

    public static int restoreStderrJava() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "496dee9c9ac8500cdfad000022f6b505", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "496dee9c9ac8500cdfad000022f6b505")).intValue();
        }
        if (isSoInit) {
            return restoreStderr();
        }
        return -1;
    }

    @AnyThread
    public static void configWebViewPackageAndVersion(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fc3e4d57af3a10ed0ef3d00efc2501d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fc3e4d57af3a10ed0ef3d00efc2501d");
            return;
        }
        String chromePackageName = WebViewUtils.getChromePackageName(context);
        String chromeWebviewVersion = WebViewUtils.getChromeWebviewVersion(context);
        if (chromePackageName == null) {
            chromePackageName = "";
        }
        if (chromeWebviewVersion == null) {
            chromeWebviewVersion = "";
        }
        setWebViewPackageAndVersion(chromePackageName, chromeWebviewVersion);
    }

    public static String aarch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "910dcb362101328cb4e29726bd218c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "910dcb362101328cb4e29726bd218c5e");
        }
        try {
            return aarch_();
        } catch (Throwable th) {
            th.printStackTrace();
            return "Exception";
        }
    }

    public static boolean initSignalAnrHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a62583e9647f0f35a66f7533bd0c1b77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a62583e9647f0f35a66f7533bd0c1b77")).booleanValue();
        }
        if (!isSoInit || isSignalAnrInit) {
            return false;
        }
        isSignalAnrInit = true;
        return initSignalAnrHandler_(m.a().e);
    }

    public static boolean checkThreadTidOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ccc882de3b0041a3d1986f22cbc1aec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ccc882de3b0041a3d1986f22cbc1aec")).booleanValue();
        }
        try {
            return checkThreadTidOffset(threadPeer(Thread.currentThread()));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static Field getThreadNativePeer() throws NoSuchFieldException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3fce344701e5522df7b42cb2dae9d53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3fce344701e5522df7b42cb2dae9d53");
        }
        if (sThreadNativePeer == null) {
            Field declaredField = Thread.class.getDeclaredField("nativePeer");
            declaredField.setAccessible(true);
            sThreadNativePeer = declaredField;
        }
        return sThreadNativePeer;
    }

    private static long threadPeer(Thread thread) throws NoSuchFieldException, IllegalAccessException {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8abcb9d9571563c905c0648393f37378", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8abcb9d9571563c905c0648393f37378")).longValue() : getThreadNativePeer().getLong(thread);
    }
}
