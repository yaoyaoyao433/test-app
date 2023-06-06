package com.meituan.android.legwork.ui.abfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LazyLoadHelperFragment extends Fragment {
    public static ChangeQuickRedirect a;
    public Fragment b;
    private boolean c;

    public LazyLoadHelperFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05773a5d01036eb55c3157d900aabff9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05773a5d01036eb55c3157d900aabff9");
            return;
        }
        this.b = null;
        this.c = false;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0774d9516b468c7045426ecf0cd23325", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0774d9516b468c7045426ecf0cd23325") : layoutInflater.inflate(R.layout.legwork_fragment_lazy_load_helper, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7149b3d43df6aeb60ef44d143c9f671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7149b3d43df6aeb60ef44d143c9f671");
            return;
        }
        super.onResume();
        if (getUserVisibleHint()) {
            a();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12bd9385beb78a213ccb9beee9cf2cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12bd9385beb78a213ccb9beee9cf2cc2");
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.c) {
                this.b.setUserVisibleHint(true);
            } else if (isAdded()) {
                a();
            }
        } else if (this.b != null) {
            this.b.setUserVisibleHint(false);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb988cf283d38d0f3d79c5a3f41e9e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb988cf283d38d0f3d79c5a3f41e9e94");
            return;
        }
        if (this.b == null) {
            this.b = b();
        }
        if (this.b == null || this.c) {
            return;
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.legwork_lazy_load_container);
        if (findFragmentById != null) {
            beginTransaction.remove(findFragmentById);
        }
        beginTransaction.replace(R.id.legwork_lazy_load_container, this.b);
        beginTransaction.commitAllowingStateLoss();
        this.c = true;
        this.b.setUserVisibleHint(true);
    }

    @Nullable
    private Fragment b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e402cd7b34b7ef35976826a1996d67cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e402cd7b34b7ef35976826a1996d67cd");
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        String string = arguments.getString("key_real_fragment_class_name");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Fragment.instantiate(getContext(), string, arguments.getBundle("key_real_argument"));
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6071a2a116a2fcadd76448d503c3960f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6071a2a116a2fcadd76448d503c3960f");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.b != null) {
            this.b.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }
}
