package com.trello.rxlifecycle.components;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import rx.subjects.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RxActivity extends Activity {
    private final a<com.trello.rxlifecycle.a> a = a.g();

    @Override // android.app.Activity
    @CallSuper
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.onNext(com.trello.rxlifecycle.a.CREATE);
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onStart() {
        super.onStart();
        this.a.onNext(com.trello.rxlifecycle.a.START);
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onResume() {
        super.onResume();
        this.a.onNext(com.trello.rxlifecycle.a.RESUME);
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onPause() {
        this.a.onNext(com.trello.rxlifecycle.a.PAUSE);
        super.onPause();
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onStop() {
        this.a.onNext(com.trello.rxlifecycle.a.STOP);
        super.onStop();
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onDestroy() {
        this.a.onNext(com.trello.rxlifecycle.a.DESTROY);
        super.onDestroy();
    }
}
