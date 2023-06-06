package uk.co.senab.photoview;

import android.os.Build;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.postDelayed(runnable, 16L);
        } else {
            view.postOnAnimation(runnable);
        }
    }
}
