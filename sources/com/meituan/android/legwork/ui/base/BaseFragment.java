package com.meituan.android.legwork.ui.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseFragment extends Fragment {
    public static ChangeQuickRedirect g;
    public MetricsSpeedMeterTask h;
    protected AtomicBoolean i;
    protected AtomicBoolean j;

    public BaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0e089352e18690691bf10f1f6ebb69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0e089352e18690691bf10f1f6ebb69");
            return;
        }
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f578d5f838466634da36da1a7f39b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f578d5f838466634da36da1a7f39b6");
            return;
        }
        super.onDestroyView();
        d();
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ced022e5e5cedb0b60771c4ca48d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ced022e5e5cedb0b60771c4ca48d3a");
        } else if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).f();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d7f32b6c79976caba043242e827759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d7f32b6c79976caba043242e827759");
            return;
        }
        try {
            super.startActivityForResult(intent, i);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.Fragment
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb4b9cde2bd584e624860dc0a90e4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb4b9cde2bd584e624860dc0a90e4cd");
            return;
        }
        try {
            super.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab34333175db28cbc8163c2ca245c5cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab34333175db28cbc8163c2ca245c5cc");
            return;
        }
        super.onAttach(context);
        this.h = MetricsSpeedMeterTask.createPageSpeedMeterTask(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfdf189cf90f5869b80ca41d61e1db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfdf189cf90f5869b80ca41d61e1db0");
            return;
        }
        super.onCreate(bundle);
        this.h.recordStep("activity_create");
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a59420d6bde1a3535f7117168cdd4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a59420d6bde1a3535f7117168cdd4a");
            return;
        }
        super.onStart();
        if (this.i.getAndSet(true)) {
            return;
        }
        this.h.recordStep("activity_start");
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8486aaa43db9dc8436315724ec5ea073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8486aaa43db9dc8436315724ec5ea073");
            return;
        }
        super.onResume();
        if (this.j.getAndSet(true)) {
            return;
        }
        this.h.recordStep("activity_resume");
    }
}
