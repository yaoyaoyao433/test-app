package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public final class b implements d {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    @Override // android.support.transition.d
    public final void a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // android.support.transition.d
    public final void a(@NonNull Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof a) {
                    ((a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    @Override // android.support.transition.d
    public final void b(@NonNull Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof a) {
                    ((a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
