package com.sankuai.waimai.store;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseFragment;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGBaseCubeFragment extends SCBaseFragment {
    public static ChangeQuickRedirect a;
    private com.meituan.android.cube.core.i c;

    public abstract k a();

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "144bb1932781808ec45d6fe31c11638e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "144bb1932781808ec45d6fe31c11638e");
            return;
        }
        super.onCreate(bundle);
        this.c = new com.meituan.android.cube.core.i(q()) { // from class: com.sankuai.waimai.store.SGBaseCubeFragment.1
            public static ChangeQuickRedirect f;

            @Override // com.meituan.android.cube.core.g
            public final /* synthetic */ com.meituan.android.cube.core.f g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26fb88218cbbd63ca79fb728bafcd6c6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.core.h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26fb88218cbbd63ca79fb728bafcd6c6") : SGBaseCubeFragment.this.a();
            }
        };
        this.c.a(getActivity(), bundle);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9579947388e631810a85d27d7c5068f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9579947388e631810a85d27d7c5068f") : this.c.a(viewGroup);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3c975b45f4a6e15626a54d24e630be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3c975b45f4a6e15626a54d24e630be");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        this.c.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140defcd9af2ed0d66fbd4da9dd079f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140defcd9af2ed0d66fbd4da9dd079f6");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.c.a(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8340f94ccc683cf204f84d0c540091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8340f94ccc683cf204f84d0c540091");
            return;
        }
        super.onResume();
        this.c.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac732e8e1f52343a865fb859f0b46eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac732e8e1f52343a865fb859f0b46eb");
            return;
        }
        super.onStart();
        this.c.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63196b035ac0b28b204308c0858122b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63196b035ac0b28b204308c0858122b2");
            return;
        }
        this.c.c();
        super.onPause();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd35e7376ef4f7b70c0d829cf98c4eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd35e7376ef4f7b70c0d829cf98c4eea");
            return;
        }
        this.c.d();
        super.onStop();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda13d8b90213b5c5c612d5b426b5e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda13d8b90213b5c5c612d5b426b5e90");
            return;
        }
        this.c.h();
        super.onDestroyView();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe51853ed71eb4ef7725c7688fff2b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe51853ed71eb4ef7725c7688fff2b33");
            return;
        }
        this.c.e();
        super.onDestroy();
    }
}
