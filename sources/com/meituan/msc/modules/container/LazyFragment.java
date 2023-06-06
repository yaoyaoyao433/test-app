package com.meituan.msc.modules.container;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8ccd0f21776063b220d0529f3d47aa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8ccd0f21776063b220d0529f3d47aa0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2253323845a3cfcb0b0e7ebfc75d86", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2253323845a3cfcb0b0e7ebfc75d86");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d4b0960f481868df5bf831a8af5907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d4b0960f481868df5bf831a8af5907");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226188eb40712b9ce04ccc1ae2e07f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226188eb40712b9ce04ccc1ae2e07f44");
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
                b();
            }
            m();
            return;
        }
        n();
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ad79a1ed1e11b1b45dfb266774f9cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ad79a1ed1e11b1b45dfb266774f9cb");
        } else {
            a("onFragmentFirstVisible");
        }
    }

    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf24ba8dfd4dd384899d0d26a0e96b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf24ba8dfd4dd384899d0d26a0e96b5");
        } else {
            a("onFragmentResume");
        }
    }

    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "669dd39876a759e1d3c3dbef26cbb10e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "669dd39876a759e1d3c3dbef26cbb10e");
        } else {
            a("onFragmentPause");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e50d90e4504db35eb901b1b0cb88eb34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e50d90e4504db35eb901b1b0cb88eb34");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f8e3caa91b820b8ca3b08a50fa358c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f8e3caa91b820b8ca3b08a50fa358c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c128bde6460dcd004060110fec354115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c128bde6460dcd004060110fec354115");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9ec6852511fbccf28795712cc49a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9ec6852511fbccf28795712cc49a57");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "ee642ac1bd90eea8a422edfd15541287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "ee642ac1bd90eea8a422edfd15541287");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("LazyFragment" + hashCode(), objArr);
    }
}
