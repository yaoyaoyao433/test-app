package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.jz;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.io.FileFilter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kl implements kk {
    static Set<String> a;
    private static final int[] f;
    private boolean b;
    private long c;
    private int d;
    private final Map<String, int[]> e = new HashMap();
    private final File g;
    private final Context h;
    private boolean i;

    @Override // com.tencent.mapsdk.internal.kk
    public final void c() {
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(ki.h);
        a.add("NetManager");
        a.add("asset");
        f = new int[]{2, 3, 4, 5, 6};
    }

    public kl(Context context, TencentMapOptions tencentMapOptions) {
        String[] debugTags;
        this.h = context;
        File file = new File(mi.a(context, tencentMapOptions).c().getAbsolutePath());
        this.g = kc.a(file, "logs");
        if (ju.a("4.5.5.2", "4.3.4", 3) < 0) {
            kc.a(file, new FileFilter() { // from class: com.tencent.mapsdk.internal.kl.1
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return Pattern.compile("log-.*.log").matcher(file2.getName()).matches();
                }
            });
        }
        if (tencentMapOptions != null && (debugTags = tencentMapOptions.getDebugTags()) != null) {
            a(true, debugTags);
        }
        jy.a((jy.g) new AnonymousClass3()).a((jy.b.a) null);
        if (sd.d) {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.tencent.mapsdk.internal.kl.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    kl klVar = kl.this;
                    klVar.a(6, ki.c, "UncaughtException: t[" + thread + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, th);
                    throw new RuntimeException(th);
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.kl$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass3 extends jy.g<Void> {
        AnonymousClass3() {
        }

        private Void a() throws Exception {
            int i;
            Calendar calendar = Calendar.getInstance();
            Date date = new Date();
            calendar.setTime(date);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(CommonConstant.Symbol.BRACKET_LEFT);
            sb2.append(CommonConstant.Symbol.BRACKET_LEFT);
            int i2 = 2;
            while (true) {
                i = 0;
                if (i2 == 0) {
                    break;
                }
                calendar.add(2, -1);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(calendar.get(1));
                String sb4 = sb3.toString();
                String format = String.format(Locale.CHINA, "%02d", Integer.valueOf(calendar.get(2) + 1));
                sb.append(sb4);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb2.append(format);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                String str = sb4 + CommonConstant.Symbol.UNDERLINE + format;
                File[] e = kc.e(kl.this.g, ".*" + str + ".*.log.*");
                if (e != null && e.length > 0 && kf.a(e, kl.this.g, "archive-".concat(String.valueOf(str)))) {
                    int length = e.length;
                    while (i < length) {
                        kc.b(e[i]);
                        i++;
                    }
                }
                i2--;
            }
            calendar.setTime(date);
            sb.deleteCharAt(sb.lastIndexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)).append(CommonConstant.Symbol.BRACKET_RIGHT);
            sb2.deleteCharAt(sb2.lastIndexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)).append(CommonConstant.Symbol.BRACKET_RIGHT);
            String str2 = "archive-" + sb.toString() + CommonConstant.Symbol.UNDERLINE + sb2.toString() + MRNBundleManager.MRN_BUNDLE_SUFFIX;
            File[] e2 = kc.e(kl.this.g, "archive-.*.zip");
            if (e2 != null) {
                int length2 = e2.length;
                while (i < length2) {
                    File file = e2[i];
                    if (!file.getName().matches(str2)) {
                        kc.b(file);
                    }
                    i++;
                }
                return null;
            }
            return null;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            int i;
            Calendar calendar = Calendar.getInstance();
            Date date = new Date();
            calendar.setTime(date);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(CommonConstant.Symbol.BRACKET_LEFT);
            sb2.append(CommonConstant.Symbol.BRACKET_LEFT);
            int i2 = 2;
            while (true) {
                i = 0;
                if (i2 == 0) {
                    break;
                }
                calendar.add(2, -1);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(calendar.get(1));
                String sb4 = sb3.toString();
                String format = String.format(Locale.CHINA, "%02d", Integer.valueOf(calendar.get(2) + 1));
                sb.append(sb4);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb2.append(format);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                String str = sb4 + CommonConstant.Symbol.UNDERLINE + format;
                File[] e = kc.e(kl.this.g, ".*" + str + ".*.log.*");
                if (e != null && e.length > 0 && kf.a(e, kl.this.g, "archive-".concat(String.valueOf(str)))) {
                    int length = e.length;
                    while (i < length) {
                        kc.b(e[i]);
                        i++;
                    }
                }
                i2--;
            }
            calendar.setTime(date);
            sb.deleteCharAt(sb.lastIndexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)).append(CommonConstant.Symbol.BRACKET_RIGHT);
            sb2.deleteCharAt(sb2.lastIndexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)).append(CommonConstant.Symbol.BRACKET_RIGHT);
            String str2 = "archive-" + sb.toString() + CommonConstant.Symbol.UNDERLINE + sb2.toString() + MRNBundleManager.MRN_BUNDLE_SUFFIX;
            File[] e2 = kc.e(kl.this.g, "archive-.*.zip");
            if (e2 != null) {
                int length2 = e2.length;
                while (i < length2) {
                    File file = e2[i];
                    if (!file.getName().matches(str2)) {
                        kc.b(file);
                    }
                    i++;
                }
                return null;
            }
            return null;
        }
    }

    private void f() {
        jy.a((jy.g) new AnonymousClass3()).a((jy.b.a) null);
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final boolean a() {
        return a(ki.c);
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final boolean a(String str) {
        return this.e.containsKey(str) || this.b || (sd.d && !a.contains(str));
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final boolean a(int i, String str) {
        if (!this.e.containsKey(str)) {
            return this.b || (sd.d && !a.contains(str));
        }
        int[] iArr = this.e.get(str);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(String str, String str2) {
        if (a(2, str)) {
            a(2, str, str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(String str, String str2, Throwable th) {
        if (a(2, str)) {
            a(2, str, str2, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void b(String str, String str2) {
        if (a(3, str)) {
            a(3, str, str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void b(String str, String str2, Throwable th) {
        if (a(3, str)) {
            a(3, str, str2, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void c(String str, String str2) {
        if (a(4, str)) {
            a(4, str, str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void c(String str, String str2, Throwable th) {
        if (a(4, str)) {
            a(4, str, str2, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void d(String str, String str2) {
        if (a(5, str)) {
            a(5, str, str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void d(String str, String str2, Throwable th) {
        if (a(5, str)) {
            a(5, str, str2, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void e(String str, String str2) {
        if (a(6, str)) {
            a(6, str, str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void e(String str, String str2, Throwable th) {
        if (a(6, str)) {
            a(6, str, str2, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void g(String str) {
        a(this.g, "tms", str);
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void f(String str, String str2) {
        a(this.g, str, str2);
    }

    private static String g() {
        return "###########\n" + kn.a(gy.a("", "")) + "\n###########\n";
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final String b() {
        return this.g.getAbsolutePath();
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(Context context, jz.a aVar) {
        if (context != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.c == 0 || uptimeMillis - this.c < 400) {
                this.c = uptimeMillis;
                this.d++;
                String str = "触发调试模式" + this.d + "次";
                if (this.d >= 5 && this.d < 10) {
                    str = "开发者调试在" + (10 - this.d) + "次后开启";
                    if (aVar != null) {
                        aVar.a(str, 1).b();
                    }
                } else if (this.d == 10) {
                    this.b = true;
                    str = "开发者调试已开启";
                    if (aVar != null) {
                        aVar.a("开发者调试已开启", 1).b();
                    }
                }
                a(5, ki.c, str);
                return;
            }
            this.d = 0;
            this.c = 0L;
            this.b = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(boolean z, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                this.e.remove(str);
                if (z) {
                    this.e.put(str, f);
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(boolean z, int i, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                this.e.remove(str);
                if (z) {
                    this.e.put(str, new int[]{i});
                }
            }
        }
    }

    private static String h() {
        return new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.CHINA).format(new Date());
    }

    public static String d() {
        return new SimpleDateFormat("yyyy_MM_dd", Locale.CHINA).format(new Date());
    }

    private static String i() {
        return new SimpleDateFormat("yyyy_MM", Locale.CHINA).format(new Date());
    }

    private void a(int i, String str, String str2) {
        a(i, str, str2, (Throwable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2, Throwable th) {
        if (!ki.c.equals(str)) {
            str = TextUtils.isEmpty(str) ? ki.c : "TMS-".concat(String.valueOf(str));
        }
        if (th != null) {
            switch (i) {
                case 2:
                    Log.v(str, str2, th);
                    break;
                case 3:
                    Log.d(str, str2, th);
                    break;
                case 4:
                    Log.i(str, str2, th);
                    break;
                case 5:
                    Log.w(str, str2, th);
                    break;
                case 6:
                    Log.e(str, str2, th);
                    break;
                case 7:
                    Log.wtf(str, str2, th);
                    break;
            }
        } else {
            Log.println(i, str, str2);
        }
        if (this.i) {
            if (th != null) {
                str2 = str2 + " [error]:" + th.getMessage();
            }
            System.out.println("[" + str + "]:" + str2);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(boolean z) {
        this.i = z;
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void b(String str) {
        if (a(ki.c)) {
            a(2, ki.c, str);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(String str, Throwable th) {
        if (a(ki.c)) {
            a(2, ki.c, str, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void c(String str) {
        if (a(ki.c)) {
            a(3, ki.c, str);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void b(String str, Throwable th) {
        if (a(ki.c)) {
            a(3, ki.c, str, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void d(String str) {
        if (a(ki.c)) {
            a(4, ki.c, str);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void c(String str, Throwable th) {
        if (a(ki.c)) {
            a(4, ki.c, str, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void e(String str) {
        if (a(ki.c)) {
            a(5, ki.c, str);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void d(String str, Throwable th) {
        if (a(ki.c)) {
            a(5, ki.c, str, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void f(String str) {
        if (a(ki.c)) {
            a(6, ki.c, str);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void e(String str, Throwable th) {
        if (a(ki.c)) {
            a(6, ki.c, str, th);
        }
    }

    @Override // com.tencent.mapsdk.internal.kk
    public final void a(final File file, final String str, final String str2) {
        if (!a(ki.c) || TextUtils.isEmpty(str2)) {
            return;
        }
        new Thread(new Runnable() { // from class: com.tencent.mapsdk.internal.kl.4
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                File file2 = new File(file, str + CommonConstant.Symbol.MINUS + kl.d() + ".log");
                if (!file2.exists()) {
                    kc.a(file2);
                    str3 = kl.e() + str2;
                } else {
                    str3 = str2 + "\n";
                }
                if (file2.length() >= 2097152) {
                    boolean z = false;
                    File file3 = null;
                    int i = 1;
                    while (true) {
                        if (i > 500) {
                            break;
                        }
                        file3 = new File(file2.getParent(), file2.getName() + ".part" + i);
                        if (!file3.exists()) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        kc.a(file2, file3);
                        kc.a(file2);
                    }
                }
                kc.c(file2, str3);
            }
        }).start();
    }

    static /* synthetic */ String e() {
        return "###########\n" + kn.a(gy.a("", "")) + "\n###########\n";
    }
}
