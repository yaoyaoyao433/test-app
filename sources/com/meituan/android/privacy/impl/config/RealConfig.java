package com.meituan.android.privacy.impl.config;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.impl.config.SyncService;
import com.meituan.android.privacy.impl.config.d;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RealConfig implements b {
    public static ChangeQuickRedirect a;
    final ScheduledExecutorService b;
    final d c;
    ScheduledFuture<?> d;
    long e;
    @GuardedBy("this")
    volatile boolean f;
    @GuardedBy("this")
    volatile e g;
    public volatile e h;
    volatile String i;
    @NonNull
    private final Context j;
    private volatile Map<String, d.a> k;
    private final AtomicBoolean l;
    private final PermissionGuard m;
    private final a n;
    private final a o;
    private final a p;

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PrivacySingleThread {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2 A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee A[Catch: Throwable -> 0x01fb, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2 A[Catch: Throwable -> 0x01fb, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0200, blocks: (B:8:0x0023, B:11:0x0047, B:13:0x006b, B:15:0x0070, B:17:0x0090, B:18:0x0095, B:20:0x009d, B:23:0x00a4, B:25:0x00b1, B:27:0x00c8, B:29:0x00d4, B:31:0x00dd, B:33:0x00ee, B:35:0x0105, B:39:0x0126, B:41:0x012e, B:44:0x0135, B:46:0x013e, B:48:0x0147, B:51:0x014e, B:53:0x0157, B:55:0x0171, B:60:0x01ab, B:62:0x01c2, B:65:0x01c9, B:67:0x01d6, B:69:0x01ee, B:70:0x01f2, B:66:0x01d0, B:56:0x0175, B:58:0x019e, B:59:0x01a4, B:52:0x0153, B:45:0x013a, B:37:0x010b, B:38:0x0115, B:32:0x00e4, B:28:0x00cc, B:24:0x00ab), top: B:78:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.privacy.impl.config.RealConfig r19) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.privacy.impl.config.RealConfig.a(com.meituan.android.privacy.impl.config.RealConfig):void");
    }

    public static /* synthetic */ void a(RealConfig realConfig, e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, realConfig, changeQuickRedirect, false, "fe421b0834bacb6b9ef995eddf87e9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, realConfig, changeQuickRedirect, false, "fe421b0834bacb6b9ef995eddf87e9c6");
            return;
        }
        String b = eVar.b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        File d = realConfig.d(b + ".conf");
        l a2 = l.a(d.getAbsolutePath() + ".lock");
        try {
            a2.b();
            Object[] objArr2 = {d};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            FileOutputStream fileOutputStream = null;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2da4b7c82a50880d5036ef763a64fcc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2da4b7c82a50880d5036ef763a64fcc8");
            } else {
                if (!d.getParentFile().exists()) {
                    d.getParentFile().mkdirs();
                }
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(d);
                    try {
                        eVar.a((OutputStream) fileOutputStream2, false);
                        eVar.a(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        eVar.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            realConfig.c.d.a("additional_launch", (byte[]) null);
            realConfig.c.d.a("not_registered", Collections.emptySet());
            realConfig.i = d.getAbsolutePath();
            realConfig.c.d.a("current_config", realConfig.i);
        } catch (Throwable th3) {
            try {
                th3.printStackTrace();
                com.dianping.networklog.c.a("privacy config write failed: " + th3.getMessage(), 3);
            } finally {
                a2.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a implements Runnable {
        public static ChangeQuickRedirect c;
        public static com.meituan.android.privacy.impl.config.a d = new com.meituan.android.privacy.impl.config.a("ScheduleRunnable", 2);

        public abstract void a();

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc580bb173332c218e99d4ffa51803d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc580bb173332c218e99d4ffa51803d9");
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ffca32ff3ce666e5d89b5f1a427596", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ffca32ff3ce666e5d89b5f1a427596");
        }
        this.m.getInitConfig();
        return "TODO/api/privacy/config";
    }

    public RealConfig(@NonNull Context context, d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29acc59d6d1b9b86f87cd5348ac6405c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29acc59d6d1b9b86f87cd5348ac6405c");
            return;
        }
        this.k = Collections.emptyMap();
        this.b = com.sankuai.android.jarvis.c.c("privacy-policy");
        this.l = new AtomicBoolean(false);
        this.f = false;
        this.g = null;
        this.n = new a() { // from class: com.meituan.android.privacy.impl.config.RealConfig.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.impl.config.RealConfig.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3389f1b1ac735de7e414392f0df6f45b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3389f1b1ac735de7e414392f0df6f45b");
                    return;
                }
                synchronized (this) {
                    if (RealConfig.this.f && RealConfig.this.g != null) {
                        e eVar = RealConfig.this.g;
                        RealConfig.this.g = null;
                        try {
                            RealConfig.a(RealConfig.this, eVar);
                            synchronized (this) {
                                if (RealConfig.this.g == null) {
                                    RealConfig.this.f = false;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            synchronized (this) {
                                if (RealConfig.this.g == null) {
                                    RealConfig.this.f = false;
                                }
                                throw th;
                            }
                        }
                    }
                    RealConfig.this.f = false;
                    RealConfig.this.g = null;
                }
            }
        };
        this.o = new a() { // from class: com.meituan.android.privacy.impl.config.RealConfig.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.impl.config.RealConfig.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc4aaffaaeb238d554fe5d9eaa9a4280", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc4aaffaaeb238d554fe5d9eaa9a4280");
                    return;
                }
                RealConfig.this.b();
                if (SystemClock.elapsedRealtime() - RealConfig.this.e >= ((RealConfig.this.h.g * 60) * 1000) - 200) {
                    RealConfig.this.c("poll");
                    RealConfig.a(RealConfig.this);
                }
                if (RealConfig.this.h.g > 0) {
                    RealConfig.this.d = RealConfig.this.b.schedule(this, RealConfig.this.h.g, TimeUnit.MINUTES);
                }
            }
        };
        this.p = new a() { // from class: com.meituan.android.privacy.impl.config.RealConfig.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.impl.config.RealConfig.a
            public final void a() {
                char c = 0;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3fa4d5f7ffa9cf63b8c0e390cf75164", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3fa4d5f7ffa9cf63b8c0e390cf75164");
                    return;
                }
                try {
                    RealConfig.this.c();
                    final RealConfig realConfig = RealConfig.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = RealConfig.a;
                    if (PatchProxy.isSupport(objArr3, realConfig, changeQuickRedirect3, false, "12907d9f0f9cd19b810f3e0a71c292de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, realConfig, changeQuickRedirect3, false, "12907d9f0f9cd19b810f3e0a71c292de");
                    } else {
                        File parentFile = realConfig.d("test").getParentFile();
                        if (parentFile != null) {
                            File[] listFiles = parentFile.listFiles(new FilenameFilter() { // from class: com.meituan.android.privacy.impl.config.RealConfig.5
                                public static ChangeQuickRedirect a;

                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file, String str) {
                                    Object[] objArr4 = {file, str};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "276658e4fe14c8a546087c9e46972720", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "276658e4fe14c8a546087c9e46972720")).booleanValue() : str.endsWith(".conf");
                                }
                            });
                            if (listFiles != null) {
                                int length = listFiles.length;
                                int i = 0;
                                while (i < length) {
                                    String absolutePath = listFiles[i].getAbsolutePath();
                                    Object[] objArr4 = new Object[1];
                                    objArr4[c] = absolutePath;
                                    ChangeQuickRedirect changeQuickRedirect4 = RealConfig.a;
                                    File[] fileArr = listFiles;
                                    if (PatchProxy.isSupport(objArr4, realConfig, changeQuickRedirect4, false, "af64f63ff77a3dc9c6ebc322d592c30a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, realConfig, changeQuickRedirect4, false, "af64f63ff77a3dc9c6ebc322d592c30a");
                                    } else if (!TextUtils.isEmpty(absolutePath)) {
                                        File file = new File(absolutePath);
                                        if (file.exists()) {
                                            File file2 = new File(absolutePath + ".lock");
                                            l a2 = l.a(file2.getAbsolutePath());
                                            a2.b();
                                            String b = realConfig.c.d.b("current_config", (String) null);
                                            if (TextUtils.isEmpty(b) || !b.equals(absolutePath)) {
                                                file.delete();
                                                file2.delete();
                                            }
                                            a2.c();
                                        }
                                    }
                                    i++;
                                    listFiles = fileArr;
                                    c = 0;
                                }
                            }
                            File[] listFiles2 = parentFile.listFiles(new FilenameFilter() { // from class: com.meituan.android.privacy.impl.config.RealConfig.6
                                public static ChangeQuickRedirect a;

                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file3, String str) {
                                    Object[] objArr5 = {file3, str};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "eab1a36c5109c7f2eb75e13e934c3de6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "eab1a36c5109c7f2eb75e13e934c3de6")).booleanValue() : str.endsWith(".lock");
                                }
                            });
                            if (listFiles2 != null) {
                                for (File file3 : listFiles2) {
                                    l a3 = l.a(file3.getAbsolutePath());
                                    try {
                                        a3.b();
                                        file3.delete();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    a3.c();
                                }
                            }
                        }
                    }
                    RealConfig.this.c.a();
                    l.a();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.j = applicationContext;
        } else {
            this.j = context;
        }
        this.m = PermissionGuard.a.a;
        this.c = dVar;
    }

    @WorkerThread
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4418d0de2ec0e935efe219bfd2265bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4418d0de2ec0e935efe219bfd2265bad");
        } else if (this.h != null) {
        } else {
            synchronized (this) {
                if (this.h == null) {
                    e b = this.c.b(false);
                    a(b);
                    this.i = b.c;
                    this.b.execute(new a() { // from class: com.meituan.android.privacy.impl.config.RealConfig.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.privacy.impl.config.RealConfig.a
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36e3bbd4fc1a675d9f7a1dafd77d54f4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36e3bbd4fc1a675d9f7a1dafd77d54f4");
                                return;
                            }
                            RealConfig realConfig = RealConfig.this;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = RealConfig.a;
                            if (PatchProxy.isSupport(objArr3, realConfig, changeQuickRedirect3, false, "126087a1fee2e766e1f17e8683d608d1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, realConfig, changeQuickRedirect3, false, "126087a1fee2e766e1f17e8683d608d1");
                                return;
                            }
                            e eVar = realConfig.h;
                            if (eVar == null || eVar.d || eVar.c == null || realConfig.e(eVar.c)) {
                                return;
                            }
                            realConfig.i = null;
                            realConfig.c();
                        }
                    });
                }
            }
        }
    }

    private void a(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc325819a1b43403164befb56b7418f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc325819a1b43403164befb56b7418f");
            return;
        }
        try {
            f(eVar.l);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.h = eVar;
    }

    @Override // com.meituan.android.privacy.impl.config.b
    @Nullable
    public final d.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9550f17cf1fc7ba2fad27d480d7882db", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9550f17cf1fc7ba2fad27d480d7882db");
        }
        b();
        String[] strArr = {str, str.split(CommonConstant.Symbol.MINUS)[0]};
        for (int i = 0; i < 2; i++) {
            d.a aVar = this.k.get(strArr[i]);
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final com.meituan.android.privacy.interfaces.config.c a(f fVar, String str, String str2) {
        Object[] objArr = {fVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1f766bf1003e0e00de8ee7d2736f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1f766bf1003e0e00de8ee7d2736f8d");
        }
        b();
        return k.a(str, str2, this.h.i, fVar);
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2788d272d80e284b698f2dea3dd0d096", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2788d272d80e284b698f2dea3dd0d096") : AppUtil.getVersion(this.j);
    }

    public final e a(boolean z) throws IOException {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256da994dddc73e7b92318709f9f250f", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256da994dddc73e7b92318709f9f250f");
        }
        try {
            InputStream open = this.j.getAssets().open("privacy_preset_config.json");
            try {
                e eVar = new e();
                eVar.b = true;
                eVar.a(open, z);
                eVar.d = true;
                return eVar;
            } finally {
                open.close();
            }
        } catch (FileNotFoundException unused) {
            return e.a();
        }
    }

    private void f(@Nullable String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bdbf024f440dfdaaf90bb84185cd52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bdbf024f440dfdaaf90bb84185cd52a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject(str);
            Map<String, d.a> emptyMap = Collections.emptyMap();
            try {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    d.a aVar = new d.a();
                    aVar.b = jSONObject2.getString("displayName");
                    aVar.c = new HashMap<>();
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (!"displayName".equals(next2)) {
                            aVar.c.put(next2, jSONObject2.getString(next2));
                        }
                    }
                    hashMap.put(next, aVar);
                }
                this.k = hashMap;
            } catch (Throwable th) {
                this.k = emptyMap;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999c3e5c2b7d8e6c519281199a13b59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999c3e5c2b7d8e6c519281199a13b59d");
        } else {
            a(e(), str);
        }
    }

    private void a(String str, String str2) {
        if (NetWorkUtils.isNetworkConnected(this.j)) {
            SyncService a2 = m.a();
            this.e = SystemClock.elapsedRealtime();
            try {
                Response<ap> a3 = a2.sync(b(a(), str2)).a();
                if (a3.b() != 200) {
                    return;
                }
                String string = a3.e().string();
                c cVar = new c();
                e a4 = a(true);
                cVar.a(a4.h.keySet());
                cVar.b(a4.j);
                cVar.a(string);
                e a5 = cVar.a();
                a(a5);
                synchronized (this) {
                    this.f = true;
                    this.g = a5;
                    this.b.execute(this.n);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    File d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0f61a1d55407bf0ab2cd969591eb34", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0f61a1d55407bf0ab2cd969591eb34");
        }
        File a2 = q.a(this.j, "privacy_config", str);
        File parentFile = a2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return a2;
    }

    private String g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f958f470ae5eb976704804546da33bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f958f470ae5eb976704804546da33bb6");
        }
        if (str == null || !str.endsWith(".conf")) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            String name = file.getName();
            return name.substring(0, name.length() - 5);
        }
        return null;
    }

    public final void c() {
        e a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ea6e75ecd1047c652ddd659c2b1f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ea6e75ecd1047c652ddd659c2b1f09");
            return;
        }
        synchronized (this) {
            if (this.f) {
                return;
            }
            String b = this.c.d.b("current_config", (String) null);
            m.b = this.c.d.b("is_mock", false);
            if (TextUtils.equals(b, this.i) || !e(b) || (a2 = this.c.a(false, b)) == null) {
                return;
            }
            a2.c = b;
            a(a2);
            this.i = b;
        }
    }

    boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9d47ad158f4cacfccbf222d59960fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9d47ad158f4cacfccbf222d59960fe")).booleanValue();
        }
        String g = g(str);
        return g != null && g.equals(i.a(str));
    }

    private SyncService.SyncRequestArgs b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf8115c6c66690df6c482493a2561d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (SyncService.SyncRequestArgs) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf8115c6c66690df6c482493a2561d3");
        }
        SyncService.SyncRequestArgs syncRequestArgs = new SyncService.SyncRequestArgs();
        syncRequestArgs.os = "android";
        syncRequestArgs.osVersion = Build.VERSION.RELEASE;
        syncRequestArgs.deviceType = Build.MODEL;
        syncRequestArgs.appVersion = f();
        syncRequestArgs.sdkVersion = "1.0";
        syncRequestArgs.app = this.m.getInitConfig().a();
        syncRequestArgs.id = this.m.getInitConfig().b();
        syncRequestArgs.hash = str;
        syncRequestArgs.source = str2;
        return syncRequestArgs;
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final f a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073e35401aafa851fca96b3804c59e96", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073e35401aafa851fca96b3804c59e96");
        }
        b();
        return this.h.m.get(str);
    }

    @Override // com.meituan.android.privacy.impl.config.b
    @NonNull
    public final com.meituan.android.privacy.interfaces.config.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f167556e0b6403861d61c9d4dfc148", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f167556e0b6403861d61c9d4dfc148");
        }
        if (this.h == null || this.h.k == null || !this.h.k.containsKey(str)) {
            return com.meituan.android.privacy.interfaces.config.a.a();
        }
        return this.h.k.get(str);
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b96ea1bdeebbdc17f551e707e49ea9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b96ea1bdeebbdc17f551e707e49ea9");
        }
        b();
        return this.h.f;
    }

    public final synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd3db88d410994d44bab4b7ad22bdb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd3db88d410994d44bab4b7ad22bdb6");
            return;
        }
        if (ProcessUtils.isMainProcess(this.j) && this.l.compareAndSet(false, true)) {
            if (this.d != null) {
                this.d.cancel(false);
            }
            this.b.schedule(this.o, 5L, TimeUnit.SECONDS);
        }
        this.b.scheduleAtFixedRate(this.p, 1L, 1L, TimeUnit.MINUTES);
    }
}
