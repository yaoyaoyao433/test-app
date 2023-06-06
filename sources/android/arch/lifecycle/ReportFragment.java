package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.d;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ReportFragment extends Fragment {
    a a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReportFragment b(Activity activity) {
        return (ReportFragment) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        a(d.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
        a(d.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(d.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(d.a.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(d.a.ON_DESTROY);
        this.a = null;
    }

    private void a(d.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof h) {
            ((h) activity).a().a(aVar);
        } else if (activity instanceof f) {
            d lifecycle = ((f) activity).getLifecycle();
            if (lifecycle instanceof g) {
                ((g) lifecycle).a(aVar);
            }
        }
    }
}
