package com.sankuai.waimai.store.drug.home.newp;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.SGBaseCubeFragment;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.newp.block.rxevent.b;
import com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.drug.home.util.c;
import com.sankuai.waimai.store.k;
import com.sankuai.waimai.store.manager.judas.d;
import com.sankuai.waimai.store.param.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiVerticalityFragment extends SGBaseCubeFragment {
    public static ChangeQuickRedirect c;
    public a d;
    private k e;
    private Map<String, Object> f;
    private boolean g;
    private PageEventHandler h;
    private Handler i;
    private Runnable j;

    public PoiVerticalityFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf90743c4c957869e53f834a51c8d21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf90743c4c957869e53f834a51c8d21");
            return;
        }
        this.g = true;
        this.i = new Handler(Looper.getMainLooper());
        this.j = new Runnable() { // from class: com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09529ad490d3c9879c04b48b6db18665", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09529ad490d3c9879c04b48b6db18665");
                } else {
                    Metrics.getInstance().stopCustomScrollFPS(PoiVerticalityFragment.this.getActivity());
                }
            }
        };
    }

    public static /* synthetic */ boolean a(PoiVerticalityFragment poiVerticalityFragment, boolean z) {
        poiVerticalityFragment.g = false;
        return false;
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment, com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b8cb64ddee53552e2c5df0ea495040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b8cb64ddee53552e2c5df0ea495040");
            return;
        }
        super.onCreate(bundle);
        if (getActivity() instanceof SCBaseActivity) {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) getActivity();
            this.h = (PageEventHandler) q.a((FragmentActivity) sCBaseActivity).a(PageEventHandler.class);
            PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a((FragmentActivity) sCBaseActivity).a(PoiPageViewModel.class);
            poiPageViewModel.b.a(sCBaseActivity, new l<PoiResult>() { // from class: com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable PoiResult poiResult) {
                    PoiResult poiResult2 = poiResult;
                    Object[] objArr2 = {poiResult2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "499f70f7ecf4189f75c41cd34baa27d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "499f70f7ecf4189f75c41cd34baa27d6");
                    } else if (poiResult2 == null || !PoiVerticalityFragment.this.g) {
                    } else {
                        PoiVerticalityFragment.this.g();
                        PoiVerticalityFragment.a(PoiVerticalityFragment.this, false);
                    }
                }
            });
            if (poiPageViewModel.b()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a13ff7ce95aec39ff1cb11dd3132580", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a13ff7ce95aec39ff1cb11dd3132580");
                    return;
                }
                final l<Integer> lVar = new l<Integer>() { // from class: com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment.3
                    public static ChangeQuickRedirect a;
                    public int b = 0;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable Integer num) {
                        Integer num2 = num;
                        Object[] objArr3 = {num2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce122e6422912dedbef42aa70d7d9817", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce122e6422912dedbef42aa70d7d9817");
                        } else if (num2 != null) {
                            if (this.b == 0 && num2.intValue() != 0) {
                                PoiVerticalityFragment.this.i.removeCallbacks(PoiVerticalityFragment.this.j);
                                Metrics.getInstance().startCustomScrollFPS(PoiVerticalityFragment.this.getActivity());
                            } else if (this.b != 0 && num2.intValue() == 0) {
                                PoiVerticalityFragment.this.i.removeCallbacks(PoiVerticalityFragment.this.j);
                                PoiVerticalityFragment.this.i.postDelayed(PoiVerticalityFragment.this.j, 1000L);
                            }
                            this.b = num2.intValue();
                        }
                    }
                };
                if (this.h != null) {
                    this.h.a((f) this.F, b.class, new l<b>() { // from class: com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment.4
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable b bVar) {
                            b bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c660558843796e426e237f81d5e5e87", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c660558843796e426e237f81d5e5e87");
                            } else if (bVar2 != null) {
                                lVar.a(Integer.valueOf(bVar2.a));
                            }
                        }
                    });
                    this.h.a((f) this.F, com.sankuai.waimai.store.assembler.component.l.class, new l<com.sankuai.waimai.store.assembler.component.l>() { // from class: com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment.5
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.assembler.component.l lVar2) {
                            com.sankuai.waimai.store.assembler.component.l lVar3 = lVar2;
                            Object[] objArr3 = {lVar3};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c3387392a6e6b331d0aadbeefd488df", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c3387392a6e6b331d0aadbeefd488df");
                            } else if (lVar3 != null) {
                                lVar.a(Integer.valueOf(lVar3.a));
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b99374bbb18b1c08f58981a1cba8c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b99374bbb18b1c08f58981a1cba8c9");
            return;
        }
        super.a(z);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3224d4e60a6b131f47f0443da87b371a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3224d4e60a6b131f47f0443da87b371a");
        } else if (z) {
            if (!this.g) {
                g();
            }
        } else {
            d.d(this, this.d.G);
        }
        if (this.e != null) {
            this.e.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment
    public final k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0ed4c0390b62f6556e6989c14c9de0", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0ed4c0390b62f6556e6989c14c9de0");
        }
        this.e = new com.sankuai.waimai.store.drug.home.refactor.f(this, this.d);
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a20c9d1605cc7945afd7e0650071a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a20c9d1605cc7945afd7e0650071a36");
            return;
        }
        if (this.f == null) {
            this.f = c.a(getActivity());
        }
        this.f.put("cat_id", Long.valueOf(this.d.c));
        this.f.put("source_type", Integer.valueOf(this.d.j()));
        d.a aVar = new d.a(this, this.d.G);
        aVar.a(this.f).a();
        d.a(this, this.d.G);
        com.sankuai.waimai.store.drug.home.refactor.cat.a.a(aVar);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment
    public final String b() {
        return this.d.G;
    }

    public final boolean e() {
        DrugPoiTemplate drugPoiTemplate;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1bd58ff51838f87617bb34abf9e36e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1bd58ff51838f87617bb34abf9e36e")).booleanValue();
        }
        if (this.e == null || (drugPoiTemplate = (DrugPoiTemplate) this.e.b(DrugPoiTemplate.class)) == null) {
            return false;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = DrugPoiTemplate.i;
        return PatchProxy.isSupport(objArr2, drugPoiTemplate, changeQuickRedirect2, false, "b79057e9ec57519bbf6b571a43f0554c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, drugPoiTemplate, changeQuickRedirect2, false, "b79057e9ec57519bbf6b571a43f0554c")).booleanValue() : drugPoiTemplate.w();
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed22ac1d3d5c3e63a84887a2fe6ad0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed22ac1d3d5c3e63a84887a2fe6ad0b7");
            return;
        }
        super.onDestroy();
        this.i.removeCallbacks(this.j);
    }
}
