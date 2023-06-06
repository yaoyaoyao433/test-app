package com.sankuai.waimai.platform.cube;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.core.f;
import com.meituan.android.cube.core.h;
import com.meituan.android.cube.core.i;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.fragment.BaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseCubeFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    private i b;

    public abstract h a();

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b52502be1798de19feda11260fd936c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b52502be1798de19feda11260fd936c9");
            return;
        }
        super.onCreate(bundle);
        this.b = new i(q()) { // from class: com.sankuai.waimai.platform.cube.BaseCubeFragment.1
            public static ChangeQuickRedirect f;

            @Override // com.meituan.android.cube.core.g
            public final /* synthetic */ f g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a05fbcb36d3c2b0d2909a44eee29b4a", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a05fbcb36d3c2b0d2909a44eee29b4a") : BaseCubeFragment.this.a();
            }
        };
        this.b.a(getActivity(), bundle);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569c4ec6cb158acc9de00f0d59895235", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569c4ec6cb158acc9de00f0d59895235") : this.b.a(viewGroup);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42bd43ddcaba78028831b5dc0824c4ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42bd43ddcaba78028831b5dc0824c4ec");
            return;
        }
        a.e();
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
        a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114ad8df1f822fca72174aff122330c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114ad8df1f822fca72174aff122330c8");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.b.a(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4cb6abd02ed6a39b78d7bac093dd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4cb6abd02ed6a39b78d7bac093dd22");
            return;
        }
        super.onResume();
        this.b.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f52d23f452035efd5a2d5a2bebaa71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f52d23f452035efd5a2d5a2bebaa71");
            return;
        }
        super.onStart();
        this.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318469057db5145facd7374f6e3d8be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318469057db5145facd7374f6e3d8be2");
            return;
        }
        this.b.c();
        super.onPause();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aab4f8abfe578309935ab5230bd69e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aab4f8abfe578309935ab5230bd69e3");
            return;
        }
        this.b.d();
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a63cdb442529a392b691c645f1279ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a63cdb442529a392b691c645f1279ee");
            return;
        }
        this.b.h();
        super.onDestroyView();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c3a8fa7eb7df2028356a3bddb96687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c3a8fa7eb7df2028356a3bddb96687");
            return;
        }
        this.b.e();
        super.onDestroy();
    }
}
