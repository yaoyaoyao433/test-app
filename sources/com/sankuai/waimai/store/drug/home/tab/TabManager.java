package com.sankuai.waimai.store.drug.home.tab;

import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.DrugTabItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TabManager implements l<List<g>>, d, f {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean b = !TabManager.class.desiredAssertionStatus();
    private LinearLayout c;
    private FrameLayout d;
    private LinearLayout e;
    private SCBaseActivity f;
    private com.sankuai.waimai.store.param.a g;
    private Fragment h;
    private h i;
    private List<h> j;
    private PageEventHandler k;
    private long l;
    private com.sankuai.waimai.store.drug.widgets.lottie.a m;
    private final List<String> n;
    private PoiPageViewModel o;

    public TabManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d112ad63cd4529faa87148df7da2a647", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d112ad63cd4529faa87148df7da2a647");
            return;
        }
        this.l = 0L;
        this.n = new ArrayList();
    }

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable List<g> list) {
        boolean d;
        LinearLayout linearLayout;
        List<g> list2 = list;
        Object[] objArr = {list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe516d99c69d4d3ccb792ba41689516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe516d99c69d4d3ccb792ba41689516");
            return;
        }
        Object[] objArr2 = {list2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f689b106383f77a4d8deb7af03053554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f689b106383f77a4d8deb7af03053554");
        } else if (com.sankuai.shangou.stone.util.a.a((List) list2) > 1) {
            if (this.j == null) {
                this.j = new ArrayList();
                d = true;
            } else {
                d = d();
            }
            if (!b && list2 == null) {
                throw new AssertionError();
            }
            a(list2, d);
            if (this.j.size() > 0) {
                if (this.e == null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c283909d1127186221b13bd61eaa02f6", RobustBitConfig.DEFAULT_VALUE)) {
                        linearLayout = (LinearLayout) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c283909d1127186221b13bd61eaa02f6");
                    } else {
                        linearLayout = new LinearLayout(this.f);
                        linearLayout.setOrientation(0);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, com.sankuai.shangou.stone.util.h.a(this.f, 55.0f)));
                        linearLayout.setBackgroundColor(-1);
                        linearLayout.setAlwaysDrawnWithCacheEnabled(false);
                        int a2 = com.sankuai.shangou.stone.util.h.a(this.f, 5.0f);
                        linearLayout.setPadding(0, a2, 0, a2);
                    }
                    this.e = linearLayout;
                    this.c.addView(this.e);
                } else {
                    this.e.removeAllViews();
                }
                int i = 0;
                for (h hVar : this.j) {
                    ViewGroup.LayoutParams layoutParams = hVar.a().getLayoutParams();
                    int a3 = com.sankuai.shangou.stone.util.h.a((Context) this.f) / this.j.size();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(a3, -2);
                    }
                    layoutParams.width = a3;
                    this.e.addView(hVar.a(), layoutParams);
                    Object[] objArr4 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = h.a;
                    if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "8730392def45025b3d1ab2252e99b0a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "8730392def45025b3d1ab2252e99b0a6");
                    } else {
                        hVar.g = i;
                        hVar.b.a(hVar.g);
                    }
                    i++;
                    if (hVar.e) {
                        this.i = hVar;
                        hVar.a(i.SHOWING);
                    } else {
                        hVar.a(i.HIDDEN);
                    }
                }
            }
        }
        a2(list2);
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.d
    public final void a(@NonNull SCBaseActivity sCBaseActivity, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull com.sankuai.waimai.store.param.a aVar) {
        k<List<g>> kVar;
        Object[] objArr = {sCBaseActivity, linearLayout, frameLayout, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431a8e0137aeb3907f516494c2573055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431a8e0137aeb3907f516494c2573055");
            return;
        }
        this.f = sCBaseActivity;
        this.c = linearLayout;
        this.d = frameLayout;
        this.g = aVar;
        this.m = new com.sankuai.waimai.store.drug.widgets.lottie.a(this.f);
        TabViewModel tabViewModel = (TabViewModel) q.a((FragmentActivity) this.f).a(TabViewModel.class);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = TabViewModel.a;
        if (PatchProxy.isSupport(objArr2, tabViewModel, changeQuickRedirect2, false, "db37fdfc02428d85eaf89c05adc66d8c", RobustBitConfig.DEFAULT_VALUE)) {
            kVar = (k) PatchProxy.accessDispatch(objArr2, tabViewModel, changeQuickRedirect2, false, "db37fdfc02428d85eaf89c05adc66d8c");
        } else {
            if (tabViewModel.b == null) {
                tabViewModel.b = new k<>();
            }
            kVar = tabViewModel.b;
        }
        kVar.a(this.f, this);
        this.o = (PoiPageViewModel) q.a((FragmentActivity) this.f).a(PoiPageViewModel.class);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c32a43ba95864e880c3cc68db5c4037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c32a43ba95864e880c3cc68db5c4037");
        } else {
            PoiVerticalityFragment poiVerticalityFragment = new PoiVerticalityFragment();
            poiVerticalityFragment.d = this.g;
            this.h = poiVerticalityFragment;
            this.f.getSupportFragmentManager().beginTransaction().add(this.d.getId(), poiVerticalityFragment, "0").show(poiVerticalityFragment).commitAllowingStateLoss();
        }
        e();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f2a841168ab82335ffe28c30f13c6fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f2a841168ab82335ffe28c30f13c6fe2");
        } else {
            this.k.a(this.f, com.sankuai.waimai.store.drug.home.refactor.event.b.class, new l<com.sankuai.waimai.store.drug.home.refactor.event.b>() { // from class: com.sankuai.waimai.store.drug.home.tab.TabManager.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.refactor.event.b bVar) {
                    com.sankuai.waimai.store.drug.home.refactor.event.b bVar2 = bVar;
                    Object[] objArr5 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2db5491b11a851438f7beb96c99297f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2db5491b11a851438f7beb96c99297f7");
                    } else if (TabManager.this.i == null || !TabManager.this.i.e) {
                    } else {
                        g gVar = TabManager.this.i.c;
                        gVar.h = bVar2.a;
                        h hVar = TabManager.this.i;
                        Object[] objArr6 = {gVar};
                        ChangeQuickRedirect changeQuickRedirect6 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar, changeQuickRedirect6, false, "576204c7b0d95daa78033d3e9921d7f6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar, changeQuickRedirect6, false, "576204c7b0d95daa78033d3e9921d7f6");
                        } else {
                            hVar.c = gVar;
                            hVar.b.a((e<g>) hVar.c);
                        }
                        TabManager.this.i.a(i.SHOWING);
                    }
                }
            });
        }
        com.meituan.android.bus.a.a().a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveDrugTabChangeEvent(com.sankuai.waimai.store.drug.home.refactor.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d1b7301c86128e2131e61915b83cf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d1b7301c86128e2131e61915b83cf3");
        } else if (iVar != null) {
            if (iVar.b) {
                h hVar = (h) com.sankuai.shangou.stone.util.a.a((List<Object>) this.j, iVar.a);
                if (hVar != null) {
                    a(hVar, false);
                    return;
                }
                return;
            }
            for (h hVar2 : this.j) {
                g gVar = hVar2.c;
                if (gVar != null && gVar.a == iVar.a) {
                    a(hVar2, false);
                }
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(List<g> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ce5e4d63fa905509ed9090966315a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ce5e4d63fa905509ed9090966315a1");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (g gVar : list) {
                if (gVar != null) {
                    String str = gVar.e;
                    if (!TextUtils.isEmpty(str) && !arrayList.contains(str) && !this.n.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (com.sankuai.shangou.stone.util.a.a((List) arrayList) > 0) {
            this.n.addAll(arrayList);
            this.m.a(this.n, this.f.w(), null);
        }
    }

    private void a(@NonNull List<g> list, boolean z) {
        h hVar;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05c3a1a4caf5bb4046780ee8612b9dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05c3a1a4caf5bb4046780ee8612b9dd");
            return;
        }
        boolean z2 = false;
        for (g gVar : list) {
            if (gVar != null && (z || gVar.a != 0)) {
                h hVar2 = new h(gVar, this.f, this.d, this.g, this.m);
                hVar2.f = this;
                if (z && hVar2.e) {
                    hVar2.d = this.h;
                    z2 = true;
                }
                hVar2.a(i.CREATED);
                this.j.add(hVar2);
            }
        }
        if (!z || z2) {
            return;
        }
        List<h> list2 = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98625cf48a0af0d0ea47e8fda167ebc2", RobustBitConfig.DEFAULT_VALUE)) {
            hVar = (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98625cf48a0af0d0ea47e8fda167ebc2");
        } else {
            DrugTabItem drugTabItem = new DrugTabItem();
            drugTabItem.tabId = 0;
            drugTabItem.tabName = com.sankuai.waimai.store.util.b.a(this.f, (int) R.string.wm_sc_init_page);
            h hVar3 = new h(new g(drugTabItem), this.f, this.d, this.g, this.m);
            hVar3.f = this;
            hVar3.d = this.h;
            hVar3.a(i.CREATED);
            hVar = hVar3;
        }
        list2.add(0, hVar);
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4427a99b34e51e4dd18a85cb2642e6fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4427a99b34e51e4dd18a85cb2642e6fa")).booleanValue();
        }
        if (this.j.size() > 0) {
            h hVar = null;
            Iterator<h> it = this.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h next = it.next();
                if (next.e) {
                    hVar = next;
                    break;
                }
            }
            this.j.clear();
            this.j.add(hVar);
            return false;
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.f
    public final void a(@NonNull h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb119352596cb0bf4a3f80b99e4f1b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb119352596cb0bf4a3f80b99e4f1b0");
        } else {
            a(hVar, true);
        }
    }

    private void a(@NonNull h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9a473e088d66b65289b6ab3b00e8b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9a473e088d66b65289b6ab3b00e8b3");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.l < 200) {
            this.l = currentTimeMillis;
            return;
        }
        this.l = currentTimeMillis;
        if (this.i != hVar) {
            if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                if (this.i != null) {
                    this.i.a(i.HIDDEN);
                }
                hVar.a(i.SHOWING);
                this.i = hVar;
                this.h = hVar.d;
                e();
                this.k.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.refactor.event.c(hVar.e ? 0 : -1));
            } else {
                com.sankuai.waimai.store.manager.user.a.a((Context) this.f);
                if (this.o != null) {
                    this.o.n = true;
                }
            }
            if (z) {
                a(hVar, 3);
            }
        } else if (this.i != null && this.i.e && hVar.e) {
            e();
            g gVar = this.i.c;
            if (gVar == null) {
                return;
            }
            if (gVar.h) {
                this.k.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.newp.block.rxevent.c(true));
                if (z) {
                    a(hVar, 2);
                    return;
                }
                return;
            }
            this.k.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.newp.block.rxevent.c(false));
            if (z) {
                a(hVar, 1);
            }
        }
    }

    private int b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f1389aeea74f54f08b8a30a3e07eda", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f1389aeea74f54f08b8a30a3e07eda")).intValue() : this.j.indexOf(hVar);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd568b0811a65681b0f58ba9d83884c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd568b0811a65681b0f58ba9d83884c4");
        } else if (this.k == null) {
            this.k = (PageEventHandler) q.a((FragmentActivity) this.f).a(PageEventHandler.class);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.d
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d028fb39784eff072a4ff532d8e548", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d028fb39784eff072a4ff532d8e548")).booleanValue();
        }
        if (this.i == null || this.i.e) {
            return ((this.h instanceof PoiVerticalityFragment) && ((PoiVerticalityFragment) this.h).e()) ? false : true;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "681744d5aac570658ce6e75adf314b37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "681744d5aac570658ce6e75adf314b37")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((List) this.j) > 0) {
            h hVar = null;
            Iterator<h> it = this.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h next = it.next();
                if (next.e) {
                    hVar = next;
                    break;
                }
            }
            if (hVar != null) {
                if (this.i != null) {
                    this.i.a(i.HIDDEN);
                }
                hVar.a(i.SHOWING);
                this.i = hVar;
                e();
                this.k.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.refactor.event.c(0));
                return false;
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2954fd630947c8d1364d6c25ee8dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2954fd630947c8d1364d6c25ee8dc2");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.a((List) this.j) > 1) {
            for (h hVar : this.j) {
                hVar.a(i.DESTROY);
            }
        }
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.d
    public final Fragment b() {
        return this.h;
    }

    private void a(h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030a25e22b30df597ec6361ddd588d8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030a25e22b30df597ec6361ddd588d8d");
            return;
        }
        g gVar = hVar.c;
        if (gVar != null) {
            JudasManualManager.a("b_waimai_9lohi5jg_mc", this.g.G, this.f.d()).a("source_id", gVar.a).a("tab_index", b(hVar)).a("tab_name", gVar.b).a("status", i).a();
        }
    }
}
