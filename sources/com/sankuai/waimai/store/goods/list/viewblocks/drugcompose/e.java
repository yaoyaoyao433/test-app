package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.helper.a;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, a.InterfaceC1183a, f {
    public static ChangeQuickRedirect a;
    FragmentManager b;
    DrugPoiTabMRNFragment c;
    com.facebook.react.views.scroll.e d;
    public String e;
    final int f;
    ViewTreeObserver.OnScrollChangedListener g;
    com.sankuai.waimai.store.goods.list.helper.c h;
    List<RecyclerView.k> i;
    private com.sankuai.waimai.store.goods.list.helper.a j;
    private com.sankuai.waimai.store.goods.list.delegate.e k;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final int bl_() {
        return 8;
    }

    public e(com.sankuai.waimai.store.goods.list.delegate.e eVar, @NonNull Context context, DrugPoiTabMRNFragment drugPoiTabMRNFragment, FragmentManager fragmentManager, RestMenuResponse.b bVar, int i) {
        super(context);
        Object[] objArr = {eVar, context, drugPoiTabMRNFragment, fragmentManager, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b332aea3a08f480570f833eef6c22c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b332aea3a08f480570f833eef6c22c");
            return;
        }
        this.b = fragmentManager;
        this.c = drugPoiTabMRNFragment;
        this.e = bVar == null ? "" : bVar.b;
        this.f = i;
        this.k = eVar;
        this.h = new com.sankuai.waimai.store.goods.list.helper.c();
        if (bVar == null || bVar.c != 1) {
            return;
        }
        this.j = new com.sankuai.waimai.store.goods.list.helper.a();
        this.j.a(eVar, this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f0cdf4fd8c38c7b7df370169cfb2ea8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f0cdf4fd8c38c7b7df370169cfb2ea8");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_shop_content_fragment_tab_mrn_container, viewGroup, false);
        inflate.setId(this.f);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "582e948b473a941191a0cda520d38300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "582e948b473a941191a0cda520d38300");
            return;
        }
        super.onViewCreated();
        this.c.a(new DrugPoiTabMRNFragment.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.a
            public final void a(@NonNull com.facebook.react.views.scroll.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b0f706c00c9a4ec75d8ebcba792b904", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b0f706c00c9a4ec75d8ebcba792b904");
                    return;
                }
                e.this.d = eVar;
                final e eVar2 = e.this;
                com.facebook.react.views.scroll.e eVar3 = e.this.d;
                Object[] objArr3 = {eVar3};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "6fc7c7d659bc149b30c60a94930b39c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "6fc7c7d659bc149b30c60a94930b39c5");
                } else if (eVar3 != null) {
                    eVar2.g = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.e.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8d64060e27b9592447aa9ac72d3c3bc7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8d64060e27b9592447aa9ac72d3c3bc7");
                            } else {
                                e.this.h.b();
                            }
                        }
                    };
                    eVar2.h.a(eVar3, eVar2.i);
                    eVar3.getViewTreeObserver().addOnScrollChangedListener(eVar2.g);
                }
            }
        });
        this.c.m = this.h;
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        boolean z2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf345c3ed35c4351f3dd8290e22e872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf345c3ed35c4351f3dd8290e22e872");
            return;
        }
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = this.c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = DrugPoiTabMRNFragment.a;
        if (PatchProxy.isSupport(objArr2, drugPoiTabMRNFragment, changeQuickRedirect2, false, "09deab5393b9f1d1584b59a2a9b7b3e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugPoiTabMRNFragment, changeQuickRedirect2, false, "09deab5393b9f1d1584b59a2a9b7b3e5");
        } else {
            if (z) {
                if (drugPoiTabMRNFragment.k == null) {
                    drugPoiTabMRNFragment.w();
                } else {
                    drugPoiTabMRNFragment.u();
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = DrugPoiTabMRNFragment.a;
                if (PatchProxy.isSupport(objArr3, drugPoiTabMRNFragment, changeQuickRedirect3, false, "c2cf7a0dc6b32cfc3c900224e5998675", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, drugPoiTabMRNFragment, changeQuickRedirect3, false, "c2cf7a0dc6b32cfc3c900224e5998675");
                } else if (drugPoiTabMRNFragment.k != null && drugPoiTabMRNFragment.b != null && drugPoiTabMRNFragment.b.e() != null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = DrugPoiTabMRNFragment.a;
                    if (PatchProxy.isSupport(objArr4, drugPoiTabMRNFragment, changeQuickRedirect4, false, "be6c4182c41f884f43330d958f1da1c7", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, drugPoiTabMRNFragment, changeQuickRedirect4, false, "be6c4182c41f884f43330d958f1da1c7")).booleanValue();
                    } else {
                        z2 = (drugPoiTabMRNFragment.b == null || drugPoiTabMRNFragment.b.d() == null || drugPoiTabMRNFragment.b.d().b == null || !w.f(drugPoiTabMRNFragment.b.d().b) || drugPoiTabMRNFragment.b.d().b.brandStory == null) ? false : true;
                    }
                    if (z2) {
                        drugPoiTabMRNFragment.b.e().setForbidScroll(drugPoiTabMRNFragment.b.e().canScrollVertically(-1) && drugPoiTabMRNFragment.v());
                    } else {
                        drugPoiTabMRNFragment.b.e().setForbidScroll(drugPoiTabMRNFragment.v());
                    }
                }
            } else {
                drugPoiTabMRNFragment.t();
            }
            Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = DrugPoiTabMRNFragment.a;
            if (PatchProxy.isSupport(objArr5, drugPoiTabMRNFragment, changeQuickRedirect5, false, "7c5c57b1e40a79a23a0c4fbf507d8d51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, drugPoiTabMRNFragment, changeQuickRedirect5, false, "7c5c57b1e40a79a23a0c4fbf507d8d51");
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("cur_view_visible", z);
                if (drugPoiTabMRNFragment.o != null) {
                    createMap.putString("cur_tab_info", i.a(drugPoiTabMRNFragment.o));
                }
                ReactContext s = drugPoiTabMRNFragment.s();
                if (s != null) {
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(s, "PoiTabVisibleChange", createMap);
                }
            }
        }
        if (this.c.isAdded()) {
            return;
        }
        try {
            getView().post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "047ee7e1dfdf4ddfc5a8efca40bb1e6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "047ee7e1dfdf4ddfc5a8efca40bb1e6e");
                    } else {
                        e.this.b.beginTransaction().replace(e.this.f, e.this.c).commitAllowingStateLoss();
                    }
                }
            });
        } catch (Exception e) {
            View findViewById = this.k.k().findViewById(this.f);
            View findViewById2 = getView() != null ? getView().findViewById(this.f) : null;
            SGStoreContentRender sGStoreContentRender = SGStoreContentRender.FoodComposeContainerLoad;
            StringBuilder sb = new StringBuilder("parentView:");
            sb.append(findViewById == null);
            sb.append("getView():");
            sb.append(getView() == null);
            sb.append("layoutView:");
            sb.append(findViewById2 == null);
            String sb2 = sb.toString();
            com.sankuai.waimai.store.util.monitor.c.a(sGStoreContentRender, sb2, "监控onVisibilityChanged时机问题：" + e.getMessage());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "763aa18ea2877c0daed1b5c782ec32c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "763aa18ea2877c0daed1b5c782ec32c1");
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(kVar);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final void bk_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a362c0479213e1e9cd53307e5e71db7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a362c0479213e1e9cd53307e5e71db7a");
        } else if (this.d != null) {
            this.d.fullScroll(33);
            this.d.scrollTo(0, 0);
            this.d.smoothScrollTo(0, 0);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aedac63082c69d8e7f39e267e3a4bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aedac63082c69d8e7f39e267e3a4bdb");
            return;
        }
        super.onDestroy();
        if (this.d != null && this.g != null) {
            this.d.getViewTreeObserver().removeOnScrollChangedListener(this.g);
        }
        if (this.h != null) {
            this.h.a();
        }
        if (this.j != null) {
            this.j.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.helper.a.InterfaceC1183a
    public final ReactContext a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c8fe40cfb9227690c6f6be225ead3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c8fe40cfb9227690c6f6be225ead3b");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd065d2158613eb0c21b20fe2c7b34ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd065d2158613eb0c21b20fe2c7b34ca");
        }
        if (this.c == null || this.c.s() == null) {
            return null;
        }
        return this.c.s();
    }
}
