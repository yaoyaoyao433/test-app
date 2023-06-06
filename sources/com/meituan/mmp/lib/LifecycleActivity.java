package com.meituan.mmp.lib;

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
    public static ChangeQuickRedirect l;
    private final android.arch.lifecycle.g a;

    public LifecycleActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "883a49b6a96aa8ce9d7277f50742d347", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "883a49b6a96aa8ce9d7277f50742d347");
        } else {
            this.a = new android.arch.lifecycle.g(this);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0caa602d93a1edbde12c0279d5b7c793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0caa602d93a1edbde12c0279d5b7c793");
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
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba6ebbc2fce4defc30493517eff2270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba6ebbc2fce4defc30493517eff2270");
            return;
        }
        super.onStart();
        this.a.a(d.a.ON_START);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea08e61e708dec5099a2ccc3d995266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea08e61e708dec5099a2ccc3d995266");
            return;
        }
        super.onResume();
        this.a.a(d.a.ON_RESUME);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f90a9f60056d530905afced2f94c754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f90a9f60056d530905afced2f94c754");
            return;
        }
        this.a.a(d.a.ON_PAUSE);
        super.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13368af5557bd6f6f021495b819b0906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13368af5557bd6f6f021495b819b0906");
            return;
        }
        this.a.a(d.a.ON_STOP);
        super.onStop();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62278d946cb4ef34acb0c49256acfca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62278d946cb4ef34acb0c49256acfca4");
            return;
        }
        this.a.a(d.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cc1d82481cbba090a585fb1eb859973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cc1d82481cbba090a585fb1eb859973");
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
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "054f21709802a1895556906ea6b44109", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "054f21709802a1895556906ea6b44109");
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
