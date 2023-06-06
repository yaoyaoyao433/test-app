package com.sankuai.waimai.business.page.home.list.future.modulelistheader;

import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, c, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;
    private PageFragment s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5ef1352e24faff5d00c6610e954f8a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5ef1352e24faff5d00c6610e954f8a") : (c) super.L();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91deea07199784b8fc27ca06fee92f84", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91deea07199784b8fc27ca06fee92f84") : new b(F().a());
    }

    public a(com.meituan.android.cube.pga.type.a aVar, PageFragment pageFragment) {
        super(aVar);
        Object[] objArr = {aVar, pageFragment};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb6523cfc284cfccf96e75c33790d6b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb6523cfc284cfccf96e75c33790d6b4");
            return;
        }
        this.s = pageFragment;
        if (this.g != 0) {
            final b bVar = (b) this.g;
            PageFragment pageFragment2 = this.s;
            Object[] objArr2 = {pageFragment2};
            ChangeQuickRedirect changeQuickRedirect2 = b.d;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "00b17676cf0ae8c50368ba85b2acad12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "00b17676cf0ae8c50368ba85b2acad12");
                return;
            }
            bVar.i = pageFragment2;
            if (pageFragment2 == null || !pageFragment2.isAdded()) {
                return;
            }
            bVar.j = (HomePageViewModel) q.a(pageFragment2).a(HomePageViewModel.class);
            bVar.j.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.list.future.modulelistheader.b.3
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable d.a aVar2) {
                    d.a aVar3 = aVar2;
                    Object[] objArr3 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acbe1f142cb6faf2ddb93b0e2cefc16d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acbe1f142cb6faf2ddb93b0e2cefc16d");
                    } else if (aVar3 == d.a.ON_RESUME && TextUtils.equals(com.sankuai.waimai.platform.settings.a.a().b(), "0")) {
                        bVar.e();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f0a4ebbe4f84f2c391eb911cd2dfab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f0a4ebbe4f84f2c391eb911cd2dfab");
        } else {
            super.s();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc726c2b93da589d2fce29043f717e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc726c2b93da589d2fce29043f717e33");
            return;
        }
        super.c(obj);
        if (obj instanceof PersonalizedBean) {
            b bVar = (b) this.g;
            PersonalizedBean personalizedBean = (PersonalizedBean) obj;
            Object[] objArr2 = {personalizedBean};
            ChangeQuickRedirect changeQuickRedirect2 = b.d;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0bda2bb6f9870c831ba035605dcee4d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0bda2bb6f9870c831ba035605dcee4d7");
            } else if (personalizedBean == null || !personalizedBean.isCardDataValid()) {
                bVar.e();
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7f777d791768fa18c3d83633acdfcf97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7f777d791768fa18c3d83633acdfcf97");
                } else if (bVar.h != null && (layoutParams = bVar.h.getLayoutParams()) != null) {
                    layoutParams.height = -2;
                    bVar.h.setLayoutParams(layoutParams);
                }
                bVar.g = personalizedBean;
                bVar.e.setText(personalizedBean.title);
                bVar.f.setText(personalizedBean.iconTitle);
                if (bVar.j != null) {
                    HomePageViewModel homePageViewModel = bVar.j;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = HomePageViewModel.a;
                    if (PatchProxy.isSupport(objArr4, homePageViewModel, changeQuickRedirect4, false, "64167b2b50e78aa977dddafa98fddcef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, homePageViewModel, changeQuickRedirect4, false, "64167b2b50e78aa977dddafa98fddcef");
                    } else {
                        homePageViewModel.w.b((k<Void>) null);
                    }
                }
                Object[] objArr5 = {"b_waimai_zc5gnlmu_mv"};
                ChangeQuickRedirect changeQuickRedirect5 = f.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e233994da7a335b6a712632501103138", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e233994da7a335b6a712632501103138");
                } else {
                    JudasManualManager.b("b_waimai_zc5gnlmu_mv", "c_m84bv26", (String) null).a();
                }
            }
        }
    }
}
