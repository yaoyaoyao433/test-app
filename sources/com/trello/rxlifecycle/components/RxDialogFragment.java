package com.trello.rxlifecycle.components;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.view.View;
import com.trello.rxlifecycle.b;
import rx.subjects.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RxDialogFragment extends DialogFragment {
    private final a<b> a = a.g();

    @Override // android.app.Fragment
    @CallSuper
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.onNext(b.ATTACH);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @CallSuper
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.onNext(b.CREATE);
    }

    @Override // android.app.Fragment
    @CallSuper
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a.onNext(b.CREATE_VIEW);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @CallSuper
    public void onStart() {
        super.onStart();
        this.a.onNext(b.START);
    }

    @Override // android.app.Fragment
    @CallSuper
    public void onResume() {
        super.onResume();
        this.a.onNext(b.RESUME);
    }

    @Override // android.app.Fragment
    @CallSuper
    public void onPause() {
        this.a.onNext(b.PAUSE);
        super.onPause();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @CallSuper
    public void onStop() {
        this.a.onNext(b.STOP);
        super.onStop();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @CallSuper
    public void onDestroyView() {
        this.a.onNext(b.DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @CallSuper
    public void onDestroy() {
        this.a.onNext(b.DESTROY);
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @CallSuper
    public void onDetach() {
        this.a.onNext(b.DETACH);
        super.onDetach();
    }
}
