package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.p;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q {
    private static Application a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    @NonNull
    @MainThread
    public static p a(@NonNull Fragment fragment) {
        r rVar;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            p.a a = p.a.a(a((Activity) activity));
            if (fragment instanceof s) {
                rVar = ((s) fragment).ax_();
            } else {
                rVar = HolderFragment.a(fragment).a;
            }
            return new p(rVar, a);
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    @NonNull
    @MainThread
    public static p a(@NonNull FragmentActivity fragmentActivity) {
        r rVar;
        p.a a = p.a.a(a((Activity) fragmentActivity));
        if (fragmentActivity instanceof s) {
            rVar = ((s) fragmentActivity).ax_();
        } else {
            rVar = HolderFragment.a(fragmentActivity).a;
        }
        return new p(rVar, a);
    }
}
