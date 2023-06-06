package com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.templet.newmarket.c;
import com.sankuai.waimai.store.goods.list.templet.newmarket.g;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopAllSpuFragment extends SCBaseFragment {
    public static ChangeQuickRedirect a;
    public g c;
    private e d;

    public static ShopAllSpuFragment a(e eVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {eVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4858af977060a42e264787c92e6a52a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShopAllSpuFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4858af977060a42e264787c92e6a52a2");
        }
        ShopAllSpuFragment shopAllSpuFragment = new ShopAllSpuFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ShopData", restMenuResponse);
        shopAllSpuFragment.setArguments(bundle);
        shopAllSpuFragment.d = eVar;
        shopAllSpuFragment.c = new c(eVar, null);
        return shopAllSpuFragment;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c60eedc6bca2c309ef49d98d9c8793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c60eedc6bca2c309ef49d98d9c8793");
            return;
        }
        super.onCreate(bundle);
        this.c.a(getArguments() != null ? (RestMenuResponse) f.a(getArguments(), "ShopData") : null);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2f339db88d7f76ee696ef5032b88095", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2f339db88d7f76ee696ef5032b88095") : this.c.a(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932e92e54e15f80e14b014f452bdd375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932e92e54e15f80e14b014f452bdd375");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588926eb70608e22254f61dafd758214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588926eb70608e22254f61dafd758214");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ec01ae20a80b620839f93f8eb3079f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ec01ae20a80b620839f93f8eb3079f");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6aa4b27e9023f076a6940eae44f6da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6aa4b27e9023f076a6940eae44f6da");
            return;
        }
        super.a(z);
        if (this.c != null) {
            this.c.c(true);
        }
    }
}
