package com.meituan.mmp.lib;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class LazyFragment extends Fragment {
    public static ChangeQuickRedirect a;
    protected View b;
    protected boolean c;
    protected boolean d;
    protected boolean e;

    public abstract View a(FragmentActivity fragmentActivity, ViewGroup viewGroup, LayoutInflater layoutInflater, @Nullable Bundle bundle);

    public LazyFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a41daddce51725291131d107b990be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a41daddce51725291131d107b990be");
            return;
        }
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = false;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b3a4e532e5e68e8a90ad08f80ecbae", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b3a4e532e5e68e8a90ad08f80ecbae");
        }
        a("onCreateView");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.b = a(getActivity(), viewGroup, layoutInflater, bundle);
        this.c = true;
        StringBuilder sb = new StringBuilder("onCreateView !isHidden():");
        sb.append(!isHidden());
        sb.append(", getUserVisibleHint():");
        sb.append(getUserVisibleHint());
        a("FragmentLifeCycle", sb.toString());
        if (!isHidden() && getUserVisibleHint()) {
            a(true);
        }
        return this.b;
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7528015a300cf642afcb900d77e835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7528015a300cf642afcb900d77e835");
            return;
        }
        super.setUserVisibleHint(z);
        a("setUserVisibleHint: isVisibleToUser:" + z);
        if (this.c) {
            if (z && !this.e) {
                a(true);
            } else if (z || !this.e) {
            } else {
                a(false);
            }
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0094ac22ee571a8524ed9483c2dd259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0094ac22ee571a8524ed9483c2dd259");
            return;
        }
        a("dispatchUserVisibleHint currentVisibleState:" + this.e + ", isVisible:" + z);
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (z) {
            if (this.d) {
                this.d = false;
                a();
            }
            c();
            return;
        }
        d();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ed5cf24da9473fb3d9c5542d34a747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ed5cf24da9473fb3d9c5542d34a747");
        } else {
            a("onFragmentFirstVisible");
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e0c1eaf573996cf0ba3a91dde370fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e0c1eaf573996cf0ba3a91dde370fc");
        } else {
            a("onFragmentResume");
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05a4ecd712d1542aea9a15e1b2c24d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05a4ecd712d1542aea9a15e1b2c24d6");
        } else {
            a("onFragmentPause");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d123d670800f4a8f90de20976e61ca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d123d670800f4a8f90de20976e61ca2");
            return;
        }
        a("onHiddenChanged hidden:" + z);
        super.onHiddenChanged(z);
        if (z) {
            a(false);
        } else {
            a(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ec330eb32d2a03974a70061378dbe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ec330eb32d2a03974a70061378dbe8");
            return;
        }
        super.onResume();
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(", !isHidden():");
        sb.append(!isHidden());
        StringBuilder sb2 = new StringBuilder(", !currentVisibleState:");
        sb2.append(!this.e);
        sb2.append(", getUserVisibleHint():");
        sb2.append(getUserVisibleHint());
        a("onResume firstVisible:", sb.toString(), sb2.toString());
        if (this.d || isHidden() || this.e || !getUserVisibleHint()) {
            return;
        }
        a(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2aee69a81506a0048674913190b7ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2aee69a81506a0048674913190b7ee9");
            return;
        }
        super.onPause();
        a("onPause");
        if (this.e && getUserVisibleHint()) {
            a(false);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6717b5e4ffb2cb06677065759e101b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6717b5e4ffb2cb06677065759e101b57");
            return;
        }
        super.onDestroyView();
        a("onDestroyView");
        this.c = false;
        this.d = true;
    }

    private void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "dc5af7019f5c8ca9addb4bd8ec3e2dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "dc5af7019f5c8ca9addb4bd8ec3e2dbc");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("LazyFragment" + hashCode(), objArr);
    }
}
