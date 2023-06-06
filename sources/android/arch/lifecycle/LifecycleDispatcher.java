package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.d;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class LifecycleDispatcher {
    private static AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        if (a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes.dex */
    static class a extends android.arch.lifecycle.b {
        private final b a = new b();

        a() {
        }

        @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.a, true);
            }
            ReportFragment.a(activity);
        }

        @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            if (activity instanceof FragmentActivity) {
                LifecycleDispatcher.a((FragmentActivity) activity, d.b.CREATED);
            }
        }

        @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                LifecycleDispatcher.a((FragmentActivity) activity, d.b.CREATED);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class DestructionReportFragment extends Fragment {
        @Override // android.support.v4.app.Fragment
        public void onPause() {
            super.onPause();
            a(d.a.ON_PAUSE);
        }

        @Override // android.support.v4.app.Fragment
        public void onStop() {
            super.onStop();
            a(d.a.ON_STOP);
        }

        @Override // android.support.v4.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            a(d.a.ON_DESTROY);
        }

        private void a(d.a aVar) {
            LifecycleDispatcher.a(getParentFragment(), aVar);
        }
    }

    private static void a(FragmentManager fragmentManager, d.b bVar) {
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment != null) {
                a(fragment, bVar);
                if (fragment.isAdded()) {
                    a(fragment.getChildFragmentManager(), bVar);
                }
            }
        }
    }

    private static void a(Object obj, d.b bVar) {
        if (obj instanceof h) {
            ((h) obj).a().a(bVar);
        }
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes.dex */
    static class b extends FragmentManager.FragmentLifecycleCallbacks {
        b() {
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            LifecycleDispatcher.a(fragment, d.a.ON_CREATE);
            if ((fragment instanceof h) && fragment.getChildFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragment.getChildFragmentManager().beginTransaction().add(new DestructionReportFragment(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            }
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
            LifecycleDispatcher.a(fragment, d.a.ON_START);
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            LifecycleDispatcher.a(fragment, d.a.ON_RESUME);
        }
    }

    static /* synthetic */ void a(FragmentActivity fragmentActivity, d.b bVar) {
        a((Object) fragmentActivity, bVar);
        a(fragmentActivity.getSupportFragmentManager(), bVar);
    }

    static /* synthetic */ void a(Fragment fragment, d.a aVar) {
        if (fragment instanceof h) {
            ((h) fragment).a().a(aVar);
        }
    }
}
