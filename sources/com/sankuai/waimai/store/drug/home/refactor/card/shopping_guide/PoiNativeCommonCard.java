package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiNativeCommonCard extends BaseCard {
    public static ChangeQuickRedirect h;
    private f i;
    private i j;

    public PoiNativeCommonCard(android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48bf52c2e72142b3907bd96c4134a377", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48bf52c2e72142b3907bd96c4134a377");
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc3e21b9341cef2c8118a84bb9a46d8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc3e21b9341cef2c8118a84bb9a46d8") : LayoutInflater.from(this.e).inflate(R.layout.wm_drug_home_channel_refactor_native_common_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7078eb74e7396a8a4110dc157e8ac09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7078eb74e7396a8a4110dc157e8ac09");
            return;
        }
        super.a(view);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        com.sankuai.waimai.store.param.a a = poiPageViewModel.d.a();
        k<Boolean> kVar = poiPageViewModel.h;
        android.arch.lifecycle.f fVar = this.d;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        kVar.a(fVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a31394528925bc1b91eb40e590d20bc1", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a31394528925bc1b91eb40e590d20bc1") : new g(this));
        this.i = (f) this.c.c;
        this.j = new i(a, (SCBaseActivity) this.e, this.i);
        i iVar = this.j;
        Object[] objArr3 = {view};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.newp.block.optimization.a.a;
        if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "382fbf972f23c9e81c120c6a77e6420a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "382fbf972f23c9e81c120c6a77e6420a");
        } else {
            iVar.g = (LinearLayout) view.findViewById(R.id.ll_module_container);
        }
        if ("mach".equals(this.i.a)) {
            this.c.b = this.i.b.templateId;
        } else {
            this.c.b = this.i.a;
        }
        ViewGroup viewGroup = (ViewGroup) a(R.id.ll_module_container);
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(0);
        }
        if (poiPageViewModel.b.a() != null) {
            try {
                this.j.a(poiPageViewModel.b.a().response);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public static /* synthetic */ void a(PoiNativeCommonCard poiNativeCommonCard, Boolean bool) {
        Object[] objArr = {poiNativeCommonCard, bool};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90d3dda2589656a7aa0f71f894b7dd89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90d3dda2589656a7aa0f71f894b7dd89");
        } else if (bool == null || poiNativeCommonCard.f == null) {
        } else {
            poiNativeCommonCard.f.a(bool.booleanValue());
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e8b9e2b34950a15d097566faac06de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e8b9e2b34950a15d097566faac06de6");
            return;
        }
        super.onResume();
        if (this.j != null) {
            this.j.a();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb547513b83c2bb69707457a4bb667a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb547513b83c2bb69707457a4bb667a");
            return;
        }
        super.onPause();
        if (this.j != null) {
            i iVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i.h;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "5f46e2a1e2388f34c5706ff9a6234516", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "5f46e2a1e2388f34c5706ff9a6234516");
            }
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31959d6166e6945ae237883d6fb6dffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31959d6166e6945ae237883d6fb6dffc");
            return;
        }
        super.onDestroy();
        if (this.j != null) {
            i iVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.home.newp.block.optimization.a.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "9102fb6669ca235b5a0b0abf0f41b138", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "9102fb6669ca235b5a0b0abf0f41b138");
            } else {
                iVar.e.a();
            }
        }
    }
}
