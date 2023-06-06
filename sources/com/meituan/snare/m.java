package com.meituan.snare;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.ProcessUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.h;
import java.io.File;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static final m h = new m();
    Context c;
    public volatile boolean d;
    public volatile boolean e;
    public String f;
    public SimpleDateFormat g;
    private n i;
    private final Object j;
    private List<a> k;

    public static /* synthetic */ void a(m mVar, boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "8ce662cd451b097d11ea90e09b9a867c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "8ce662cd451b097d11ea90e09b9a867c");
        } else if (!z || str == null) {
        } else {
            try {
                NativeCrashHandler.setBacktraceConfig(new JSONObject(str).getInt("backtrace_type"));
            } catch (JSONException e) {
                Logger.getSnareLogger().e(e.getMessage(), e);
            }
        }
    }

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82aa35a355158e21b2cb75405baad2bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82aa35a355158e21b2cb75405baad2bc");
            return;
        }
        this.d = false;
        this.e = false;
        this.j = new Object();
        this.f = "";
        this.g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
    }

    public static m a() {
        return h;
    }

    public final synchronized void a(Context context, n nVar) {
        boolean z;
        Object[] objArr = {context, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6764a291e07951acbf3c3aab1a7a1487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6764a291e07951acbf3c3aab1a7a1487");
        } else if (this.d) {
        } else {
            Logger.getSnareLogger().i("Snare init start");
            if (context == null) {
                return;
            }
            this.c = context;
            n nVar2 = nVar == null ? new n() : nVar;
            this.i = nVar2;
            Internal.sSnareConfig = nVar2;
            boolean z2 = nVar2.f;
            b = z2;
            if (z2) {
                Logger.getSnareLogger().setLogLevel(2);
            }
            this.f = TimeUtil.formatTimeStamp(System.currentTimeMillis());
            f a2 = f.a();
            Object[] objArr2 = {context, nVar2};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "818dba3be52a73e9aabf10a64a3a658e", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "818dba3be52a73e9aabf10a64a3a658e")).booleanValue();
            } else {
                a2.a(context);
                a2.e = UUID.randomUUID().toString();
                a2.f = UUID.randomUUID().toString();
                a2.g = UUID.randomUUID().toString();
                String str = nVar2.r;
                if (TextUtils.isEmpty(str)) {
                    str = context.getPackageName();
                }
                a2.h = str.replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.DOT).replace(CommonConstant.Symbol.DOT, CommonConstant.Symbol.UNDERLINE);
                String str2 = nVar2.t;
                StringBuilder sb = new StringBuilder();
                sb.append(a2.b);
                sb.append("/tombstone");
                sb.append(CommonConstant.Symbol.UNDERLINE);
                sb.append(a2.h);
                sb.append(CommonConstant.Symbol.UNDERLINE);
                sb.append("appVersion:" + str2);
                sb.append("_%s");
                sb.append(CommonConstant.Symbol.UNDERLINE);
                sb.append(a2.e);
                a2.d = ((Object) sb) + ".steps";
                sb.append(".prepare");
                a2.c = sb.toString();
                File[] f = a2.f(null);
                if (f.length > 0) {
                    a2.a(f);
                    a2.b(f);
                    a2.c(f);
                }
                z = true;
            }
            if (!z) {
                Logger.getSnareLogger().e("file manager init failed");
                return;
            }
            if (this.i.b) {
                g a3 = g.a();
                Object[] objArr3 = {context, nVar2};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "eb48e72e7ccd640e6f76c29191949623", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "eb48e72e7ccd640e6f76c29191949623");
                } else {
                    a3.e = context;
                    a3.f = nVar2;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    if (a3.b == null) {
                        a3.b = defaultUncaughtExceptionHandler;
                        Thread.setDefaultUncaughtExceptionHandler(a3);
                    }
                }
            }
            if (this.i.c) {
                NativeCrashHandler.getInstance().init(context, nVar2);
                if (NativeCrashHandler.isSoInit) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c0ef6823e4961c3942e355edaa9214e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c0ef6823e4961c3942e355edaa9214e0");
                    } else {
                        com.sankuai.android.jarvis.c.c("snare-delay").schedule(new ScheduleRunnableDelegate(new Runnable() { // from class: com.meituan.snare.m.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1ad1bd336ee73c406bf86c2c21fe8ec5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1ad1bd336ee73c406bf86c2c21fe8ec5");
                                    return;
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                    m.a(m.this, true, Horn.accessCache("metrics_crash"));
                                    Horn.register("metrics_crash", new HornCallback() { // from class: com.meituan.snare.m.1.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.android.common.horn.HornCallback
                                        public final void onChanged(boolean z3, String str3) {
                                            Object[] objArr6 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str3};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a02099a163ee945fde201e32e11d7cde", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a02099a163ee945fde201e32e11d7cde");
                                            } else {
                                                m.a(m.this, z3, str3);
                                            }
                                        }
                                    });
                                }
                                NativeCrashHandler.configWebViewPackageAndVersion(m.this.c);
                            }
                        }), 10L, TimeUnit.SECONDS);
                    }
                }
            }
            if (this.i.e) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "aede653ca062f1987beecd50a1868d39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "aede653ca062f1987beecd50a1868d39");
                } else if (!this.e) {
                    NativeCrashHandler.initSigQuitHandlerJava();
                    this.e = true;
                }
            }
            if (this.i.m) {
                p a4 = p.a();
                Object[] objArr6 = {context, nVar2};
                ChangeQuickRedirect changeQuickRedirect6 = p.a;
                if (PatchProxy.isSupport(objArr6, a4, changeQuickRedirect6, false, "fccea2f6c27305c658e03e3b3b0650e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, a4, changeQuickRedirect6, false, "fccea2f6c27305c658e03e3b3b0650e3");
                } else if (nVar2.m) {
                    a4.b = nVar2;
                    f a5 = f.a();
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = f.a;
                    a4.c = PatchProxy.isSupport(objArr7, a5, changeQuickRedirect7, false, "9815516c73df5f392137cacd8239a25b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr7, a5, changeQuickRedirect7, false, "9815516c73df5f392137cacd8239a25b") : a5.b(a5.e, ".stderr");
                    a4.c();
                }
            }
            if (this.i.n) {
                final r a6 = r.a();
                Object[] objArr8 = {context, nVar2};
                ChangeQuickRedirect changeQuickRedirect8 = r.a;
                if (PatchProxy.isSupport(objArr8, a6, changeQuickRedirect8, false, "a173f396f38738726141894b9f3489b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, a6, changeQuickRedirect8, false, "a173f396f38738726141894b9f3489b2");
                } else {
                    if (a6.b == null) {
                        a6.b = new h.a() { // from class: com.meituan.snare.r.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.snare.h.a
                            public final boolean a() {
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "59f457c0402eebfa5074ac666173c09f", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "59f457c0402eebfa5074ac666173c09f")).booleanValue();
                                }
                                if (ProcessUtil.getThreadCount(Process.myPid()) >= 300) {
                                    r.a(a6);
                                    return true;
                                }
                                return true;
                            }
                        };
                    }
                    h.a().a(20000L, a6.b);
                }
            }
            if (this.i.o) {
                final e a7 = e.a();
                Object[] objArr9 = {context, nVar2};
                ChangeQuickRedirect changeQuickRedirect9 = e.a;
                if (PatchProxy.isSupport(objArr9, a7, changeQuickRedirect9, false, "7c900a28b635c0899b9989b1c11ad85f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, a7, changeQuickRedirect9, false, "7c900a28b635c0899b9989b1c11ad85f");
                } else {
                    if (a7.b == null) {
                        a7.b = new h.a() { // from class: com.meituan.snare.e.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.snare.h.a
                            public final boolean a() {
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "33a90077a4accded212674d1882b7b1f", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "33a90077a4accded212674d1882b7b1f")).booleanValue();
                                }
                                if (ProcessUtil.getFdCount(Process.myPid()) >= 800) {
                                    e.a(a7);
                                    return true;
                                }
                                return true;
                            }
                        };
                    }
                    h.a().a(20000L, a7.b);
                }
            }
            if (this.i.p) {
                i.a().a(context, nVar2);
            }
            this.d = true;
            Logger.getSnareLogger().i("Snare init end");
        }
    }

    public final void a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cad5c129b7673882fbe5b25d26cb08a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cad5c129b7673882fbe5b25d26cb08a");
            return;
        }
        synchronized (this.j) {
            for (a aVar : this.k) {
                aVar.a(str, z, z2);
            }
        }
    }

    public final String a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649465a88ba535338c35a797bb0deda4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649465a88ba535338c35a797bb0deda4");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            synchronized (this.j) {
                for (a aVar : this.k) {
                    try {
                        Map<String, String> a2 = aVar.a(str, z);
                        if (a2 != null) {
                            for (Map.Entry<String, String> entry : a2.entrySet()) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            return "get extra info failed because of " + th.toString();
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859c55ed5b896beb5a94ae144d055417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859c55ed5b896beb5a94ae144d055417");
            return;
        }
        synchronized (this.j) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(aVar);
        }
    }

    public final synchronized s[] b() {
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8e72ce8e106508a8ac00c1c276ba53", RobustBitConfig.DEFAULT_VALUE)) {
            return (s[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8e72ce8e106508a8ac00c1c276ba53");
        } else if (!this.d) {
            return new s[0];
        } else {
            File[] b2 = f.a().b();
            if (b2 == null) {
                return new s[0];
            }
            int length = b2.length;
            s[] sVarArr = new s[length];
            for (int i = 0; i < length; i++) {
                sVarArr[i] = new s(b2[i].getAbsolutePath());
            }
            p a2 = p.a();
            int i2 = 1;
            Object[] objArr2 = {sVarArr};
            ChangeQuickRedirect changeQuickRedirect2 = p.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "250c8c3d50ca36c1f30a78b805800721", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "250c8c3d50ca36c1f30a78b805800721");
            } else {
                f a3 = f.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                File[] f = PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "8d652e97574e87f64ae15a8b8a23c5c3", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "8d652e97574e87f64ae15a8b8a23c5c3") : a3.f(".stderr");
                if (f != null && f.length > 0) {
                    int length2 = sVarArr.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        s sVar = sVarArr[i3];
                        int i4 = 0;
                        while (true) {
                            if (i4 >= f.length) {
                                break;
                            }
                            File file = f[i4];
                            if (file == null || !f.a().a(sVar.c, file.getAbsolutePath())) {
                                i4++;
                                i2 = 1;
                            } else {
                                Object[] objArr4 = new Object[i2];
                                objArr4[0] = file;
                                ChangeQuickRedirect changeQuickRedirect4 = s.a;
                                if (PatchProxy.isSupport(objArr4, sVar, changeQuickRedirect4, false, "15fc857e14d5a25e47c63bb3d4de956b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, sVar, changeQuickRedirect4, false, "15fc857e14d5a25e47c63bb3d4de956b");
                                } else {
                                    sVar.f.put("Stderr Watchdog Info", file);
                                }
                                f[i4] = null;
                            }
                        }
                        i3++;
                        i2 = 1;
                    }
                    for (File file2 : f) {
                        if (file2 != null) {
                            f.a().e(file2.getAbsolutePath());
                        }
                    }
                }
            }
            r a4 = r.a();
            Object[] objArr5 = {sVarArr};
            ChangeQuickRedirect changeQuickRedirect5 = r.a;
            if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "5583f241138966206705504e8de06131", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "5583f241138966206705504e8de06131");
            } else {
                f a5 = f.a();
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = f.a;
                File[] f2 = PatchProxy.isSupport(objArr6, a5, changeQuickRedirect6, false, "a0670e1750971dc8741034c3179a61d8", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr6, a5, changeQuickRedirect6, false, "a0670e1750971dc8741034c3179a61d8") : a5.f(".thread");
                if (f2 != null && f2.length > 0) {
                    int length3 = sVarArr.length;
                    int i5 = 0;
                    while (i5 < length3) {
                        s sVar2 = sVarArr[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= f2.length) {
                                break;
                            }
                            File file3 = f2[i6];
                            if (file3 == null || !f.a().a(sVar2.c, file3.getAbsolutePath())) {
                                i6++;
                                c = 0;
                            } else {
                                Object[] objArr7 = new Object[1];
                                objArr7[c] = file3;
                                ChangeQuickRedirect changeQuickRedirect7 = s.a;
                                if (PatchProxy.isSupport(objArr7, sVar2, changeQuickRedirect7, false, "bc8cfdbf29b34e993782611da8a626ec", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, sVar2, changeQuickRedirect7, false, "bc8cfdbf29b34e993782611da8a626ec");
                                } else {
                                    sVar2.f.put("Thread Watchdog Info", file3);
                                }
                                f2[i6] = null;
                            }
                        }
                        i5++;
                        c = 0;
                    }
                    for (File file4 : f2) {
                        if (file4 != null) {
                            f.a().e(file4.getAbsolutePath());
                        }
                    }
                }
            }
            e.a().a(sVarArr);
            i.a().a(sVarArr);
            j.a().a(sVarArr);
            int i7 = 1;
            Object[] objArr8 = {sVarArr};
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "07944e2497cc0df7426851f5a96e495f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "07944e2497cc0df7426851f5a96e495f");
            } else {
                f a6 = f.a();
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = f.a;
                File[] f3 = PatchProxy.isSupport(objArr9, a6, changeQuickRedirect9, false, "104afec8564014861fa0fea64c87c09e", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr9, a6, changeQuickRedirect9, false, "104afec8564014861fa0fea64c87c09e") : a6.f(".steps");
                if (f3 != null && f3.length > 0) {
                    for (File file5 : f3) {
                        com.meituan.crashreporter.g.a().a("crashRecordCount", file5.getAbsolutePath(), "", "");
                    }
                    int length4 = sVarArr.length;
                    int i8 = 0;
                    while (i8 < length4) {
                        s sVar3 = sVarArr[i8];
                        int i9 = 0;
                        while (true) {
                            if (i9 >= f3.length) {
                                break;
                            }
                            File file6 = f3[i9];
                            if (file6 == null || !f.a().a(sVar3.c, file6.getAbsolutePath())) {
                                i9++;
                                i7 = 1;
                            } else {
                                Object[] objArr10 = new Object[i7];
                                objArr10[0] = file6;
                                ChangeQuickRedirect changeQuickRedirect10 = s.a;
                                if (PatchProxy.isSupport(objArr10, sVar3, changeQuickRedirect10, false, "88d1bd2468d735e62d381801823b9876", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, sVar3, changeQuickRedirect10, false, "88d1bd2468d735e62d381801823b9876");
                                } else {
                                    sVar3.f.put("File Write Steps", file6);
                                }
                                f3[i9] = null;
                            }
                        }
                        i8++;
                        i7 = 1;
                    }
                    for (File file7 : f3) {
                        if (file7 != null) {
                            f.a().e(file7.getAbsolutePath());
                        }
                    }
                }
            }
            return sVarArr;
        }
    }

    public final void a(s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4deb66c47d08f499f5501b45465fd812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4deb66c47d08f499f5501b45465fd812");
        } else if (this.d) {
            sVar.e();
        }
    }

    public final boolean c() {
        return this.i != null && this.i.q;
    }
}
