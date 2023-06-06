package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
/* compiled from: ProGuard */
@RequiresApi(19)
/* loaded from: classes.dex */
public final class c implements d {
    @Override // android.support.transition.d
    public final void a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    @Override // android.support.transition.d
    public final void a(@NonNull Animator animator) {
        animator.pause();
    }

    @Override // android.support.transition.d
    public final void b(@NonNull Animator animator) {
        animator.resume();
    }
}
