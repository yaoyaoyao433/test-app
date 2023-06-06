package com.tencent.mapsdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mi {
    public static final String a = "data/";
    private static final String f = "/tencentmapsdk/";
    private static mi g;
    public String b;
    public String c;
    public String d;
    public String e;
    private Context h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    private static mi a(Context context) {
        return a(context, (TencentMapOptions) null);
    }

    public static mi a(Context context, TencentMapOptions tencentMapOptions) {
        if (g == null) {
            g = new mi(context, tencentMapOptions);
        }
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private mi(android.content.Context r5, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r6) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.mi.<init>(android.content.Context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    private void f() {
        this.n = this.h.getFilesDir().getAbsolutePath();
        this.k = this.n + "/tencentMapSdk/config/";
        this.o = this.k + "temp/";
        this.l = this.n + "/tencentMapSdk/assets/";
        this.m = this.n + "/tencentMapSdk/dynamicAssets/";
        Context context = this.h;
        String a2 = mh.a(this.h).a("sdkVersion");
        if (hb.a(mh.a(context).a("sdkVersion")) || gy.b("4.1.0", a2) <= 0) {
            return;
        }
        mg.a(context);
        kc.f(new File(this.k));
        kc.f(new File(this.l));
        kc.f(new File(this.n + "/tencentMapSdk/subKey/"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L34
            java.lang.String r5 = r5.getCustomCacheRootPath()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L2f
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L2f
            boolean r1 = r0.canRead()
            if (r1 == 0) goto L2f
            boolean r0 = r0.canWrite()
            if (r0 == 0) goto L2f
            long r0 = e(r5)
            r2 = 5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L34
            r4.p = r5
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.mi.a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    private static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.isDirectory() && file.canRead() && file.canWrite() && e(str) > 5;
    }

    private void g() {
        String a2 = a();
        String a3 = kc.a(this.h);
        if (hb.a(a3)) {
            this.i = a2 + f;
        } else {
            this.i = a2 + f + a3;
        }
        this.j = this.i + "/data/v4/render/";
        this.b = this.i + "/sat/";
        this.c = this.j + "closeRoadDatas/";
        this.d = this.j + "events/icons";
        this.e = this.j + "offlineMaps/";
    }

    private void a(Context context, String str) {
        if (!hb.a(mh.a(context).a("sdkVersion")) && gy.b("4.1.0", str) > 0) {
            mg.a(context);
            kc.f(new File(this.k));
            kc.f(new File(this.l));
            kc.f(new File(this.n + "/tencentMapSdk/subKey/"));
        }
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.p)) {
            return this.p;
        }
        Context context = this.h;
        String b = b(context);
        if (e(b) < 5) {
            String path = context.getFilesDir().getPath();
            return e(path) < 5 ? b(context) : path;
        }
        return b;
    }

    private static String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return context.getFilesDir().getPath();
    }

    @SuppressLint({"NewApi"})
    private static long e(String str) {
        long blockSizeLong;
        long availableBlocksLong;
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT < 18) {
                blockSizeLong = statFs.getBlockSize();
                availableBlocksLong = statFs.getAvailableBlocks();
            } else {
                blockSizeLong = statFs.getBlockSizeLong();
                availableBlocksLong = statFs.getAvailableBlocksLong();
            }
            return ((blockSizeLong * availableBlocksLong) / 1024) / 1024;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final File b() {
        return new File(this.i + "/data/");
    }

    public final File c() {
        return new File(this.i);
    }

    public final String d() {
        kd.a(this.j);
        return this.j;
    }

    private String h() {
        kd.a(this.b);
        return this.b;
    }

    private String i() {
        kd.a(this.c);
        return this.c;
    }

    public final String a(String str) {
        String str2;
        if (hb.a(str)) {
            str2 = this.k;
        } else {
            str2 = this.n + "/tencentMapSdk/subKey/" + str + "/config/";
        }
        kd.a(str2);
        return str2;
    }

    public final String b(String str) {
        String str2;
        if (hb.a(str)) {
            str2 = this.l;
        } else {
            str2 = this.n + "/tencentMapSdk/subKey/" + str + "/assets/";
        }
        kd.a(str2);
        return str2;
    }

    public final String e() {
        kd.a(this.m);
        return this.m;
    }

    public final String c(String str) {
        String str2;
        if (hb.a(str)) {
            str2 = this.o;
        } else {
            str2 = a(str) + "temp/";
        }
        kd.a(str2);
        return str2;
    }

    private String j() {
        kd.a(this.d);
        return this.d;
    }

    private String k() {
        kd.a(this.e);
        return this.e;
    }
}
