package com.meituan.msc.modules.container;

import android.arch.lifecycle.d;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class LifecycleFragment extends LazyFragment implements android.arch.lifecycle.f {
    public static ChangeQuickRedirect f;
    private static boolean g;
    @Nullable
    private final android.arch.lifecycle.g h;

    public LifecycleFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c5db5f29463946340ec58238a0f9f60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c5db5f29463946340ec58238a0f9f60");
        } else if (g) {
            this.h = null;
        } else {
            this.h = new android.arch.lifecycle.g(this);
        }
    }

    static {
        try {
            LifecycleFragment.class.getSuperclass().getMethod("getLifecycle", new Class[0]);
            g = true;
        } catch (NoSuchMethodException unused) {
            com.meituan.msc.modules.reporter.g.d("LifecycleFragment", "Lifecycle not supported by current supportV4 Fragment, use alternative impl");
            g = false;
        }
    }

    @Override // com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "585623a2833f7106fa54cb559b40bd93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "585623a2833f7106fa54cb559b40bd93");
            return;
        }
        super.onHiddenChanged(z);
        new StringBuilder("onHiddenChanged").append(z);
    }

    @Override // com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad38ea90beb32ea4cd5764519d8691b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad38ea90beb32ea4cd5764519d8691b") : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3603fb83017d568a3c25f53dd7bb188f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3603fb83017d568a3c25f53dd7bb188f");
        } else {
            super.onDestroyView();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7250600e2ad62c057069e35cc2b0a76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7250600e2ad62c057069e35cc2b0a76c");
        } else {
            super.onActivityCreated(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2615deba71ed9f443696ea3956ab47a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2615deba71ed9f443696ea3956ab47a3");
            return;
        }
        super.onCreate(bundle);
        if (this.h != null) {
            this.h.a(d.a.ON_CREATE);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc0996a6cdef9803cd1e98cb998efa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc0996a6cdef9803cd1e98cb998efa7");
            return;
        }
        super.onStart();
        if (this.h != null) {
            this.h.a(d.a.ON_START);
        }
    }

    @Override // com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290143d093a1b6a8360a5122b5d697a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290143d093a1b6a8360a5122b5d697a5");
            return;
        }
        super.onResume();
        if (this.h != null) {
            this.h.a(d.a.ON_RESUME);
        }
    }

    @Override // com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d86de7103812266146e4f9376f17f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d86de7103812266146e4f9376f17f5");
            return;
        }
        if (this.h != null) {
            this.h.a(d.a.ON_PAUSE);
        }
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55757e97fedcd85d3b7793b2ec9959a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55757e97fedcd85d3b7793b2ec9959a4");
            return;
        }
        if (this.h != null) {
            this.h.a(d.a.ON_STOP);
        }
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359b815d2396b10c070d15af9969ab0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359b815d2396b10c070d15af9969ab0b");
            return;
        }
        if (this.h != null) {
            this.h.a(d.a.ON_DESTROY);
        }
        super.onDestroy();
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public android.arch.lifecycle.d getLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f7fcdc4b5bc73bdc871e00401a693d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (android.arch.lifecycle.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f7fcdc4b5bc73bdc871e00401a693d7");
        }
        if (this.h != null) {
            return this.h;
        }
        try {
            return (android.arch.lifecycle.d) LifecycleFragment.class.getSuperclass().getMethod("getLifecycle", new Class[0]).invoke(this, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
