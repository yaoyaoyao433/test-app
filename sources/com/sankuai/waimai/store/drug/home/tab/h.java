package com.sankuai.waimai.store.drug.home.tab;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.msc.modules.container.MSCWidgetFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.newp.PoiVerticalityFragment;
import com.sankuai.waimai.store.drug.mrn.DrugCommonMRNFragment;
import com.sankuai.waimai.store.i.poi.PoiFlashBuyService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    @NonNull
    e<g> b;
    @NonNull
    g c;
    Fragment d;
    boolean e;
    f f;
    int g;
    @NonNull
    private com.sankuai.waimai.store.param.a h;
    @NonNull
    private SCBaseActivity i;
    @NonNull
    private FrameLayout j;

    public h(@NonNull g gVar, @NonNull SCBaseActivity sCBaseActivity, @NonNull FrameLayout frameLayout, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.drug.widgets.lottie.a aVar2) {
        e<g> bVar;
        Object[] objArr = {gVar, sCBaseActivity, frameLayout, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91844a98a3bd30b56471f12e7574b5cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91844a98a3bd30b56471f12e7574b5cf");
            return;
        }
        this.h = aVar;
        this.c = gVar;
        this.e = this.c.a == 0;
        this.i = sCBaseActivity;
        this.j = frameLayout;
        j jVar = new j();
        g gVar2 = this.c;
        SCBaseActivity sCBaseActivity2 = this.i;
        Object[] objArr2 = {gVar2, sCBaseActivity2, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "1bdb2adb53f72cd767198fc9cf5f09df", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (e) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "1bdb2adb53f72cd767198fc9cf5f09df");
        } else if (gVar2.a == 0) {
            bVar = new c(sCBaseActivity2, gVar2, aVar2);
        } else {
            bVar = new b(sCBaseActivity2, gVar2, aVar2);
        }
        this.b = bVar;
        this.b.b().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.tab.h.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "599ad9d966c2225d59860f5e68dce1ef", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "599ad9d966c2225d59860f5e68dce1ef");
                } else if (h.this.f != null) {
                    h.this.f.a(h.this);
                }
            }
        });
        if (this.e) {
            return;
        }
        c();
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf4a34d539bf8c9b955057f616c53c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf4a34d539bf8c9b955057f616c53c1") : String.valueOf(this.c.a);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7118cfda75ba1389c82a9b1a695c89ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7118cfda75ba1389c82a9b1a695c89ab");
            return;
        }
        Fragment findFragmentByTag = this.i.getSupportFragmentManager().findFragmentByTag(b());
        if (findFragmentByTag != null) {
            this.d = findFragmentByTag;
        } else if (this.c.a == 1) {
            this.d = ((PoiFlashBuyService) com.sankuai.waimai.router.a.a(PoiFlashBuyService.class, PoiFlashBuyService.KEY_SG)).getOrderListFragment();
        } else if (this.c.a == 0) {
            PoiVerticalityFragment poiVerticalityFragment = new PoiVerticalityFragment();
            poiVerticalityFragment.d = this.h;
            this.d = poiVerticalityFragment;
        } else if (this.c.g == 2) {
            MSCWidgetFragment.a aVar = new MSCWidgetFragment.a();
            aVar.b = this.c.f;
            this.d = MSCWidgetFragment.a(aVar);
        } else {
            this.d = DrugCommonMRNFragment.d(this.c.f);
        }
    }

    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cdafe330101f18f715815a4f2abf63e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cdafe330101f18f715815a4f2abf63e");
            return;
        }
        this.b.a(iVar);
        if (i.SHOWING.equals(iVar)) {
            if (this.d == null) {
                c();
            }
            FragmentManager supportFragmentManager = this.i.getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            if (!this.d.isAdded()) {
                if (supportFragmentManager.getFragments().contains(this.d)) {
                    beginTransaction.remove(this.d);
                }
                beginTransaction.add(this.j.getId(), this.d, b()).show(this.d).commitAllowingStateLoss();
            } else if (this.d.isHidden()) {
                beginTransaction.show(this.d).commitAllowingStateLoss();
            }
        } else if (i.HIDDEN.equals(iVar) && this.d != null && this.d.isVisible()) {
            this.i.getSupportFragmentManager().beginTransaction().hide(this.d).commitAllowingStateLoss();
        }
    }

    @NonNull
    public final ViewGroup a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dabe6210d50ee9fea8ecb20293217c3", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dabe6210d50ee9fea8ecb20293217c3") : this.b.b();
    }
}
