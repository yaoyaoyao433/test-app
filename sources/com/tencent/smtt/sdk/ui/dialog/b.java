package com.tencent.smtt.sdk.ui.dialog;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import com.tencent.smtt.sdk.TbsConfig;
import java.io.BufferedInputStream;
/* loaded from: classes6.dex */
public class b {
    private Context a;
    private ResolveInfo b;
    private Drawable c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r3, int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.d = r0
            java.lang.String r0 = ""
            r2.e = r0
            r0 = 0
            r2.g = r0
            r2.h = r0
            java.lang.String r0 = ""
            r2.i = r0
            r0 = 0
            r1 = -1
            if (r4 == r1) goto L21
            android.content.res.Resources r1 = r3.getResources()     // Catch: java.lang.Exception -> L21
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r4)     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
            r4 = r0
        L22:
            if (r4 != 0) goto L2a
            java.lang.String r4 = "application_icon"
            android.graphics.drawable.Drawable r4 = com.tencent.smtt.sdk.ui.dialog.e.a(r4)
        L2a:
            android.content.Context r3 = r3.getApplicationContext()
            r2.a = r3
            r2.b = r0
            r2.f = r0
            r2.c = r4
            r2.d = r6
            r3 = 1
            r2.g = r3
            r2.i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.ui.dialog.b.<init>(android.content.Context, int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, ResolveInfo resolveInfo) {
        this.d = "";
        this.e = "";
        this.g = false;
        this.h = false;
        this.i = "";
        this.a = context.getApplicationContext();
        this.b = resolveInfo;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, Drawable drawable, String str, String str2, String str3) {
        this.d = "";
        this.e = "";
        this.g = false;
        this.h = false;
        this.i = "";
        this.a = context.getApplicationContext();
        this.b = null;
        this.c = drawable;
        this.d = str;
        this.f = str2;
        this.h = true;
        this.e = str3;
    }

    public static Drawable a(Context context, String str) {
        if (TbsConfig.APP_QB.equals(str)) {
            try {
                return e.a("application_icon");
            } catch (Throwable th) {
                Log.e("error", "getApkIcon Error:" + Log.getStackTraceString(th));
                return null;
            }
        }
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo == null) {
                return null;
            }
            Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
            TypedValue typedValue = new TypedValue();
            resourcesForApplication.getValue(applicationInfo.icon, typedValue, true);
            try {
                return Drawable.createFromResourceStream(resourcesForApplication, typedValue, new BufferedInputStream(resourcesForApplication.getAssets().openNonAssetFd(typedValue.assetCookie, typedValue.string.toString()).createInputStream()), null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception e) {
            Log.e("sdk", "e = " + e);
        }
    }

    public Drawable a() {
        if (this.c != null) {
            return this.c;
        }
        Drawable a = a(this.a, d());
        return a == null ? this.b != null ? this.b.loadIcon(this.a.getPackageManager()) : this.c : a;
    }

    public void a(ResolveInfo resolveInfo) {
        this.b = resolveInfo;
    }

    public void a(Drawable drawable) {
        this.c = drawable;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public String b() {
        return this.b != null ? this.b.loadLabel(this.a.getPackageManager()).toString() : this.d;
    }

    public ResolveInfo c() {
        return this.b;
    }

    public String d() {
        return this.b != null ? this.b.activityInfo.packageName : this.f == null ? "" : this.f;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    public String g() {
        return this.i;
    }

    public String h() {
        return this.e;
    }
}
