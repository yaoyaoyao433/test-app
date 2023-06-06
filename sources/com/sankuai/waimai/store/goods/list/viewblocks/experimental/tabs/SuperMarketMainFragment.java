package com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs;

import android.os.Bundle;
import android.support.annotation.NonNull;
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
import com.sankuai.waimai.store.goods.list.viewblocks.embed.a;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.b;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SuperMarketMainFragment extends SCBaseFragment {
    public static ChangeQuickRedirect a;
    public SuperMarketContentUnionBlock c;
    @NonNull
    private e d;
    private b e;

    static {
        a.b();
    }

    public static SuperMarketMainFragment a(@NonNull e eVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {eVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee334169dafdb8574e6967f5b4276d0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SuperMarketMainFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee334169dafdb8574e6967f5b4276d0c");
        }
        Bundle bundle = new Bundle();
        SuperMarketMainFragment superMarketMainFragment = new SuperMarketMainFragment();
        bundle.putSerializable("ShopData", restMenuResponse);
        superMarketMainFragment.setArguments(bundle);
        superMarketMainFragment.d = eVar;
        return superMarketMainFragment;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb038808f0ff07efb2a1d20d4c13d6ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb038808f0ff07efb2a1d20d4c13d6ef");
        }
        this.c = new SuperMarketContentUnionBlock(getActivity(), (RestMenuResponse) Objects.requireNonNull(f.a(getArguments(), "ShopData")), this.d);
        this.c.createView(viewGroup);
        this.c.d = this.e;
        return this.c.getView();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a292205359d2566cedabece3799d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a292205359d2566cedabece3799d81");
            return;
        }
        super.onCreate(bundle);
        this.e = new b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf1ef697614c0a3b2124c92cbfbd476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf1ef697614c0a3b2124c92cbfbd476");
            return;
        }
        super.onViewCreated(view, bundle);
        this.e.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7332a4e36c6e4785247f5bdb2cd2c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7332a4e36c6e4785247f5bdb2cd2c41");
            return;
        }
        super.onResume();
        if (this.c != null) {
            this.c.onResume();
        }
        this.e.c();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425019f9bc0a419315fe2b43cf3bc21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425019f9bc0a419315fe2b43cf3bc21c");
            return;
        }
        super.onDestroy();
        this.e.d();
        if (this.c != null) {
            this.c.onDestroy();
        }
    }
}
