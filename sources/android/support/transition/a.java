package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final d a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new c();
        } else {
            a = new b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        a.a(animator, animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull Animator animator) {
        a.a(animator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@NonNull Animator animator) {
        a.b(animator);
    }
}
