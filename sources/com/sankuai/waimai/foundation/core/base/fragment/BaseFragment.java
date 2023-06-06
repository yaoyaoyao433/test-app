package com.sankuai.waimai.foundation.core.base.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.waimai.foundation.core.base.activity.d;
import com.sankuai.waimai.foundation.utils.ae;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseFragment extends Fragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect E;
    public Activity F;
    protected boolean G;
    public boolean H;
    private String a;
    private d b;
    private Dialog c;

    public void a(boolean z) {
    }

    public BaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2e835fcc3b268a3a2ec64b4c375492", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2e835fcc3b268a3a2ec64b4c375492");
            return;
        }
        this.b = d.a();
        this.c = null;
        this.G = false;
        this.H = false;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5fdacf7720aabe48a274441f915fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5fdacf7720aabe48a274441f915fe5");
            return;
        }
        super.onAttach(context);
        c(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6b6b251787db237bf93e25925074b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6b6b251787db237bf93e25925074b9");
            return;
        }
        super.onAttach(activity);
        this.F = activity;
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36fd0c7445eb89ecacf748744aeb3be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36fd0c7445eb89ecacf748744aeb3be");
            return;
        }
        super.onDetach();
        c(false);
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eeb6fc9db70180391a1bfc7d787da81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eeb6fc9db70180391a1bfc7d787da81");
            return;
        }
        super.onCreate(bundle);
        this.F = getActivity();
        this.a = getClass().getSimpleName() + System.currentTimeMillis();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eacc1c8e03d480d3680f0f7186f2f22a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eacc1c8e03d480d3680f0f7186f2f22a");
            return;
        }
        b.a().a(this);
        o();
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = E;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17279be81e852eedc304c1f898bec01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17279be81e852eedc304c1f898bec01c");
        } else {
            this.b.c();
        }
        b.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1678804a13963dea1008379f7b691489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1678804a13963dea1008379f7b691489");
            return;
        }
        super.onStart();
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0ec72f8aa1522095c5cc40dc3f01ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0ec72f8aa1522095c5cc40dc3f01ad");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a4a2083c8ba36d3e8547cc8ec24b71a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a4a2083c8ba36d3e8547cc8ec24b71a");
            return;
        }
        super.onStop();
        b(false);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a05db9f0e912b3bc526e95c337e6e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a05db9f0e912b3bc526e95c337e6e0");
            return;
        }
        this.G = z;
        c(z);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d698a474bc5116463232d2ea41612b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d698a474bc5116463232d2ea41612b");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89dab4c5e59cc8cf15844ea820e6f17f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89dab4c5e59cc8cf15844ea820e6f17f");
            return;
        }
        super.onHiddenChanged(z);
        c(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e900986638f01f25b32a65f5cff7e5db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e900986638f01f25b32a65f5cff7e5db");
            return;
        }
        super.setUserVisibleHint(z);
        c(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b199b3dce9bbac0172b97b0005b82a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b199b3dce9bbac0172b97b0005b82a");
        } else {
            c(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc79bf2adbe8abc01c1e8cdc8d1e6118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc79bf2adbe8abc01c1e8cdc8d1e6118");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        c(false);
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb28d18540000c0a0c6ab03e025a652b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb28d18540000c0a0c6ab03e025a652b")).booleanValue();
        }
        return this.G && super.isVisible() && getUserVisibleHint();
    }

    private void c(boolean z) {
        boolean d;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25839c1448e8785045b8dd20d96946eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25839c1448e8785045b8dd20d96946eb");
        } else if (z == this.H || (d = d()) == this.H) {
        } else {
            this.H = d;
            b.a().a(this, d);
            a(this.H);
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78df00b67f61cfd0a0a32e5d99d91200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78df00b67f61cfd0a0a32e5d99d91200");
        } else {
            ae.a(this.F, str);
        }
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc56e5507faa45c8470c8cc9058bbb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc56e5507faa45c8470c8cc9058bbb2")).booleanValue();
        }
        if (p()) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.c);
        this.c = com.sankuai.waimai.foundation.core.utils.d.a((Activity) getActivity());
        return true;
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7024f46c72f147ba0ef40046a46ba749", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7024f46c72f147ba0ef40046a46ba749")).booleanValue();
        }
        if (p()) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.c);
        this.c = null;
        return true;
    }

    public final boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae07ad8c2f34eb03f369caeec0d55ad8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae07ad8c2f34eb03f369caeec0d55ad8")).booleanValue();
        }
        FragmentActivity activity = getActivity();
        return activity == null || activity.isFinishing();
    }

    public String q() {
        return this.a;
    }

    public final Activity r() {
        return this.F;
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = E;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d045ae2e73e0d613f7ca499daefce4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d045ae2e73e0d613f7ca499daefce4a");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            b.a().a(this, i, strArr, iArr);
        }
    }
}
