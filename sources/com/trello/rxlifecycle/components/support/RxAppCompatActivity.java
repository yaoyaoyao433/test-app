package com.trello.rxlifecycle.components.support;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v7.app.AppCompatActivity;
import rx.subjects.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RxAppCompatActivity extends AppCompatActivity {
    private final a<com.trello.rxlifecycle.a> a = a.g();

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.onNext(com.trello.rxlifecycle.a.CREATE);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onStart() {
        super.onStart();
        this.a.onNext(com.trello.rxlifecycle.a.START);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onResume() {
        super.onResume();
        this.a.onNext(com.trello.rxlifecycle.a.RESUME);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onPause() {
        this.a.onNext(com.trello.rxlifecycle.a.PAUSE);
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onStop() {
        this.a.onNext(com.trello.rxlifecycle.a.STOP);
        super.onStop();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onDestroy() {
        this.a.onNext(com.trello.rxlifecycle.a.DESTROY);
        super.onDestroy();
    }
}
