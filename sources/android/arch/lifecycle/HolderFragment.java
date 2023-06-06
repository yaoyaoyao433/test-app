package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.HolderFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class HolderFragment extends Fragment implements s {
    private static final a b = new a();
    r a = new r();

    public HolderFragment() {
        setRetainInstance(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        a aVar = b;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            aVar.b.remove(parentFragment);
            parentFragment.getFragmentManager().unregisterFragmentLifecycleCallbacks(aVar.e);
            return;
        }
        aVar.a.remove(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.a();
    }

    @Override // android.arch.lifecycle.s
    @NonNull
    public final r ax_() {
        return this.a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static HolderFragment a(FragmentActivity fragmentActivity) {
        a aVar = b;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        HolderFragment a2 = a.a(supportFragmentManager);
        if (a2 != null) {
            return a2;
        }
        HolderFragment holderFragment = aVar.a.get(fragmentActivity);
        if (holderFragment != null) {
            return holderFragment;
        }
        if (!aVar.d) {
            aVar.d = true;
            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(aVar.c);
        }
        HolderFragment b2 = a.b(supportFragmentManager);
        aVar.a.put(fragmentActivity, b2);
        return b2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static HolderFragment a(Fragment fragment) {
        a aVar = b;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        HolderFragment a2 = a.a(childFragmentManager);
        if (a2 != null) {
            return a2;
        }
        HolderFragment holderFragment = aVar.b.get(fragment);
        if (holderFragment != null) {
            return holderFragment;
        }
        fragment.getFragmentManager().registerFragmentLifecycleCallbacks(aVar.e, false);
        HolderFragment b2 = a.b(childFragmentManager);
        aVar.b.put(fragment, b2);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        Map<Activity, HolderFragment> a = new HashMap();
        Map<Fragment, HolderFragment> b = new HashMap();
        Application.ActivityLifecycleCallbacks c = new b() { // from class: android.arch.lifecycle.HolderFragment.a.1
            @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if (a.this.a.remove(activity) != null) {
                    Log.e("ViewModelStores", "Failed to save a ViewModel for " + activity);
                }
            }
        };
        boolean d = false;
        FragmentManager.FragmentLifecycleCallbacks e = new FragmentManager.FragmentLifecycleCallbacks() { // from class: android.arch.lifecycle.HolderFragment$HolderFragmentManager$2
            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                super.onFragmentDestroyed(fragmentManager, fragment);
                if (HolderFragment.a.this.b.remove(fragment) != null) {
                    Log.e("ViewModelStores", "Failed to save a ViewModel for " + fragment);
                }
            }
        };

        a() {
        }

        static HolderFragment a(FragmentManager fragmentManager) {
            if (fragmentManager.isDestroyed()) {
                throw new IllegalStateException("Can't access ViewModels from onDestroy");
            }
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("android.arch.lifecycle.state.StateProviderHolderFragment");
            if (findFragmentByTag != null && !(findFragmentByTag instanceof HolderFragment)) {
                throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
            }
            return (HolderFragment) findFragmentByTag;
        }

        static HolderFragment b(FragmentManager fragmentManager) {
            HolderFragment holderFragment = new HolderFragment();
            fragmentManager.beginTransaction().add(holderFragment, "android.arch.lifecycle.state.StateProviderHolderFragment").commitAllowingStateLoss();
            return holderFragment;
        }
    }
}
