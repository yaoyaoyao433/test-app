package com.sankuai.waimai.business.page.home.head.promotion;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.cache.c;
import com.sankuai.waimai.business.page.home.head.promotionbg.PromotionBgResponse;
import com.sankuai.waimai.business.page.home.head.promotionbg.a;
import com.sankuai.waimai.business.page.home.head.promotionbg.e;
import com.sankuai.waimai.business.page.home.helper.ResourceHelper;
import com.sankuai.waimai.business.page.home.model.h;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.net.d;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PromotionBgViewModel extends PageViewModel {
    public static ChangeQuickRedirect a = null;
    static int c = 7;
    static int d = 2;
    private static int p = 0;
    private static int q = 4;
    ResourceHelper b;
    public k<Boolean> e;
    public k<Boolean> f;
    public k<List<com.meituan.android.cube.pga.block.a>> g;
    public k<Boolean> h;
    int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    l<h> n;
    public k<Integer> o;
    private com.sankuai.waimai.business.page.home.head.promotionbg.a r;
    private k<Boolean> s;
    private List<h> t;
    private d.a u;

    public static /* synthetic */ d.a a(PromotionBgViewModel promotionBgViewModel, d.a aVar) {
        promotionBgViewModel.u = null;
        return null;
    }

    @Override // android.arch.lifecycle.o
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ea68b5275e0d95a5c933f89067d417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ea68b5275e0d95a5c933f89067d417");
            return;
        }
        super.a();
        if (this.r != null) {
            com.sankuai.waimai.business.page.home.head.promotionbg.a aVar = this.r;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.head.promotionbg.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cc149c13307c7683d4cf27eaf9931231", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cc149c13307c7683d4cf27eaf9931231");
            } else if (aVar.d != null) {
                aVar.d.clear();
                aVar.d = null;
            }
        }
    }

    public PromotionBgViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72305cc85bf3aa4ed27b6feede660c09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72305cc85bf3aa4ed27b6feede660c09");
            return;
        }
        this.b = new ResourceHelper(b.a);
        this.e = new k<>();
        this.f = new k<>();
        this.g = new k<>();
        this.s = new k<>();
        this.h = new k<>();
        this.i = p;
        this.o = new k<>();
        this.r = new com.sankuai.waimai.business.page.home.head.promotionbg.a(b.a);
        this.r.c = new a.InterfaceC0773a() { // from class: com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.head.promotionbg.a.InterfaceC0773a
            public final void a(h hVar) {
                Object[] objArr2 = {hVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5c4c83ee17a4207a2e5ca7194dff765", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5c4c83ee17a4207a2e5ca7194dff765");
                } else if (PromotionBgViewModel.this.n != null) {
                    PromotionBgViewModel.this.n.a(hVar);
                }
            }

            @Override // com.sankuai.waimai.business.page.home.head.promotionbg.a.InterfaceC0773a
            public final void a(h hVar, Throwable th) {
                Object[] objArr2 = {hVar, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8347fc0fb5c551f318fe26465c69af4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8347fc0fb5c551f318fe26465c69af4");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("Promotion", "download with fault " + th.getMessage(), new Object[0]);
            }
        };
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641ecf26823bc28a7b0835ace78f79b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641ecf26823bc28a7b0835ace78f79b6");
        } else {
            this.e.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final boolean b() {
        return this.i == q || this.i == c;
    }

    public final boolean c() {
        return this.i == c && this.l;
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda3867841b79020d9d2ca47b8773490", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda3867841b79020d9d2ca47b8773490")).booleanValue() : this.b.getShowBitmapWithoutTime("banner_buttom_pic") != null;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b4e82a08890fe485648d1b06f8ab78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b4e82a08890fe485648d1b06f8ab78")).booleanValue() : this.b.getShowBitmapWithoutTime("block_area_title_picture") != null;
    }

    @NonNull
    private List<h> b(PromotionBgResponse promotionBgResponse) {
        Object[] objArr = {promotionBgResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "720d33525d7d642f480b896ce36b2013", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "720d33525d7d642f480b896ce36b2013");
        }
        ArrayList arrayList = new ArrayList();
        h hVar = new h();
        hVar.f = "banner_buttom_pic";
        String str = null;
        hVar.g = (promotionBgResponse.bannerBg == null || TextUtils.isEmpty(promotionBgResponse.bannerBg.a)) ? null : promotionBgResponse.bannerBg.a;
        hVar.e = h.b;
        arrayList.add(hVar);
        h hVar2 = new h();
        hVar2.f = "banner_bottom_video";
        hVar2.g = (promotionBgResponse.bannerBg == null || TextUtils.isEmpty(promotionBgResponse.bannerBg.b)) ? null : promotionBgResponse.bannerBg.b;
        hVar2.e = h.d;
        arrayList.add(hVar2);
        if (hVar2.g != null || hVar.g != null) {
            this.i |= 4;
        } else {
            this.i &= -5;
        }
        h hVar3 = new h();
        hVar3.f = "block_area_title_picture";
        hVar3.g = (promotionBgResponse.titleBg == null || TextUtils.isEmpty(promotionBgResponse.titleBg.a)) ? null : promotionBgResponse.titleBg.a;
        hVar3.e = h.b;
        arrayList.add(hVar3);
        if (hVar3.g != null) {
            this.i |= 2;
        } else {
            this.i &= -3;
        }
        h hVar4 = new h();
        hVar4.f = "area_bottom_picture";
        if (promotionBgResponse.areaBg != null && !TextUtils.isEmpty(promotionBgResponse.areaBg.a)) {
            str = promotionBgResponse.areaBg.a;
        }
        hVar4.g = str;
        hVar4.e = h.b;
        arrayList.add(hVar4);
        if (hVar4.g != null) {
            this.i = 1 | this.i;
        } else {
            this.i &= -2;
        }
        h hVar5 = new h();
        hVar5.f = com.sankuai.waimai.business.page.home.head.promotionbg.d.b;
        hVar5.g = String.valueOf(promotionBgResponse.sceneType);
        arrayList.add(hVar5);
        h hVar6 = new h();
        hVar6.e = h.c;
        hVar6.f = e.b;
        hVar6.g = promotionBgResponse.searchBtnColor;
        arrayList.add(hVar6);
        return arrayList;
    }

    public void a(PromotionBgResponse promotionBgResponse) {
        Object[] objArr = {promotionBgResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a932c03528c8d605c6d83f03e0e80126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a932c03528c8d605c6d83f03e0e80126");
            return;
        }
        try {
            this.t = b(promotionBgResponse);
            this.b.setResourceList(this.t);
        } catch (Exception e) {
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_execption").b("promotion_update_to_sp").c(e.getMessage()).b());
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffc5a0faff66e898b193d9af75feebe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffc5a0faff66e898b193d9af75feebe2");
        } else if (activity != null && d.a().b() && d.a().d) {
            if (this.u == null) {
                this.u = new d.a() { // from class: com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.d.a, com.sankuai.waimai.platform.net.d.b
                    public final void a(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb5e1a40ea9b546b9774930293e8beb4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb5e1a40ea9b546b9774930293e8beb4");
                        } else if (z) {
                            PromotionBgViewModel.this.f();
                            d.a().a(this);
                            PromotionBgViewModel.a(PromotionBgViewModel.this, null);
                        }
                    }
                };
            }
            d.a().a(activity, this.u);
        } else {
            if (this.u != null) {
                d.a().a(this.u);
                this.u = null;
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c626cd11a470f898e358ef7f843fe7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c626cd11a470f898e358ef7f843fe7a7");
        } else if (this.t == null || this.t.size() == 0) {
        } else {
            com.sankuai.waimai.platform.utils.l.a(new l.c<Void>() { // from class: com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.c
                public final /* bridge */ /* synthetic */ void a(Void r1) {
                }

                @Override // com.sankuai.waimai.platform.utils.l.c
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bf6dcfe7ebe3042d1b002f9ad9b6a05", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bf6dcfe7ebe3042d1b002f9ad9b6a05");
                    }
                    c cVar = new c(b.a);
                    for (int i = 0; i < PromotionBgViewModel.this.t.size(); i++) {
                        h hVar = (h) PromotionBgViewModel.this.t.get(i);
                        if (hVar != null && !com.sankuai.waimai.business.page.home.head.promotionbg.d.b.equals(hVar.f) && !TextUtils.isEmpty(hVar.g)) {
                            cVar.d = hVar.g;
                            if (!cVar.c()) {
                                PromotionBgViewModel.this.r.a(hVar);
                            }
                        }
                    }
                    return null;
                }
            }, "UPDATE_PROMOTION_RESOURCE");
        }
    }
}
