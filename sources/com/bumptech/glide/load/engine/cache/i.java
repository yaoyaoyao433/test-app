package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final int b;
    private final Context c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();
    }

    public i(Context context) {
        this(context, (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME), new a(context.getResources().getDisplayMetrics()));
    }

    private i(Context context, ActivityManager activityManager, b bVar) {
        this.c = context;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (a(activityManager) ? 0.33f : 0.4f));
        int a2 = bVar.a() * bVar.b() * 4;
        int i = a2 * 4;
        int i2 = a2 * 2;
        int i3 = i2 + i;
        if (i3 <= round) {
            this.b = i2;
            this.a = i;
        } else {
            int round2 = Math.round(round / 6.0f);
            this.b = round2 * 2;
            this.a = round2 * 4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculated memory cache size: ");
            sb.append(a(this.b));
            sb.append(" pool size: ");
            sb.append(a(this.a));
            sb.append(" memory class limited? ");
            sb.append(i3 > round);
            sb.append(" max size: ");
            sb.append(a(round));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(a(activityManager));
        }
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.c, i);
    }

    @TargetApi(19)
    private static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return Build.VERSION.SDK_INT < 11;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements b {
        private final DisplayMetrics a;

        public a(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.i.b
        public final int a() {
            return this.a.widthPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.i.b
        public final int b() {
            return this.a.heightPixels;
        }
    }
}
