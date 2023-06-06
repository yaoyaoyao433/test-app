package com.meituan.msc.modules.container;

import android.arch.lifecycle.d;
import android.os.Bundle;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LifecycleActivity extends FragmentActivity implements android.arch.lifecycle.f {
    public static ChangeQuickRedirect e;
    private final android.arch.lifecycle.g a;

    public LifecycleActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a145389faab07a657fc709eeedb3d07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a145389faab07a657fc709eeedb3d07");
        } else {
            this.a = new android.arch.lifecycle.g(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6afe376d845f99ec1dd7483dc071e077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6afe376d845f99ec1dd7483dc071e077");
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d2907abbf5a8f51a2c8433412eebf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d2907abbf5a8f51a2c8433412eebf4");
            return;
        }
        Trace.beginSection("super.onCreate");
        super.onCreate(bundle);
        Trace.endSection();
        new StringBuilder("onCreate, ").append(bundle != null ? "recreate" : "new create");
        this.a.a(d.a.ON_CREATE);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f91a36b06731b253a139144c725b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f91a36b06731b253a139144c725b17");
            return;
        }
        super.onStart();
        this.a.a(d.a.ON_START);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27949974bc775761b53c81938df39cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27949974bc775761b53c81938df39cd2");
            return;
        }
        super.onResume();
        this.a.a(d.a.ON_RESUME);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61bf85f4490b87818a88093990d6dba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61bf85f4490b87818a88093990d6dba");
            return;
        }
        this.a.a(d.a.ON_PAUSE);
        super.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41cbff680cf140364dfe88392822f3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41cbff680cf140364dfe88392822f3f9");
            return;
        }
        this.a.a(d.a.ON_STOP);
        super.onStop();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86cc69378c283c2bff747a3ab44c09df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86cc69378c283c2bff747a3ab44c09df");
            return;
        }
        this.a.a(d.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e0697ccf5237ea2dc0c4b664a4e9bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e0697ccf5237ea2dc0c4b664a4e9bc");
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public android.arch.lifecycle.d getLifecycle() {
        return this.a;
    }

    public static d.b a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "692af7769673bf34779ab20ef4f86d91", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "692af7769673bf34779ab20ef4f86d91");
        }
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return d.b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return d.b.STARTED;
            case ON_RESUME:
                return d.b.RESUMED;
            case ON_DESTROY:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }
}
