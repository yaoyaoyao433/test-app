package com.sankuai.waimai.business.page.home.head.market;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.listfloat.e;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.preload.task.c;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoGifDrawable;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private boolean A;
    private PicassoGifDrawable B;
    private final Handler C;
    private boolean D;
    private Boolean E;
    private List<JudasManualManager.a> F;
    private final Runnable G;
    private ViewGroup w;
    private ViewGroup x;
    private ImageView y;
    private e z;

    public static /* synthetic */ void a(a aVar, final com.sankuai.waimai.business.page.home.model.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "704265bc88fec029a9d90d187cda1f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "704265bc88fec029a9d90d187cda1f39");
        } else if (aVar.w == null || aVar.y == null || aVar.x == null) {
        } else {
            if (eVar != null && eVar.c()) {
                aVar.w.setVisibility(0);
                aVar.x.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.head.market.a.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc1bb3aba4c1a1bcbd9bddd4c686b83f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc1bb3aba4c1a1bcbd9bddd4c686b83f");
                            return;
                        }
                        if (eVar != null) {
                            a.a(a.this, false, "b_waimai_xt732t2v_mc", eVar);
                        }
                        c.b = true;
                        ((HomeSideBarViewModel) q.a(a.this.s).a(HomeSideBarViewModel.class)).a(null);
                    }
                });
                aVar.w.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.head.market.a.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fce9c0ffc1a9860f158f1a1f3c59f1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fce9c0ffc1a9860f158f1a1f3c59f1");
                        } else if (eVar == null || !eVar.c()) {
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(a.this.s.getActivity(), eVar.a().c);
                            a.a(a.this, false, "b_waimai_91crs5ym_mc", eVar);
                        }
                    }
                });
                RequestCreator d = Picasso.g(aVar.s.getActivity()).d(eVar.a().a);
                d.s = new RequestListener() { // from class: com.sankuai.waimai.business.page.home.head.market.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.RequestListener
                    public final boolean a(Exception exc, Object obj, boolean z) {
                        Object[] objArr2 = {exc, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a1e4f3ffc98102126b1d7b03b76a019", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a1e4f3ffc98102126b1d7b03b76a019")).booleanValue();
                        }
                        a.a(a.this, (com.sankuai.waimai.business.page.home.model.e) null);
                        return false;
                    }

                    @Override // com.squareup.picasso.RequestListener
                    public final boolean a(Object obj, Object obj2, boolean z, boolean z2) {
                        Object[] objArr2 = {obj, obj2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4686bbcd8feafb664e7633df00ced87e", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4686bbcd8feafb664e7633df00ced87e")).booleanValue();
                        }
                        if (obj instanceof PicassoGifDrawable) {
                            a.this.B = (PicassoGifDrawable) obj;
                        } else {
                            a.this.B = null;
                        }
                        a.a(a.this, true, "b_waimai_91crs5ym_mv", eVar);
                        return false;
                    }
                };
                d.a(aVar.y);
                return;
            }
            aVar.w.setVisibility(8);
            aVar.y.setImageDrawable(null);
            aVar.B = null;
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z, String str, com.sankuai.waimai.business.page.home.model.e eVar) {
        JudasManualManager.a a;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, eVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b981d1f97391bdadc5fea227844a6aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b981d1f97391bdadc5fea227844a6aca");
        } else if (eVar != null) {
            if (z) {
                a = JudasManualManager.b(str);
            } else {
                a = JudasManualManager.a(str);
            }
            JudasManualManager.a a2 = a.a("c_m84bv26");
            a2.b = AppUtil.generatePageInfoKey(aVar.s);
            a2.a("entry_item_id", eVar.b()).a("activity_type", eVar.a().b);
            if (aVar.E != null) {
                a.a("is_show", aVar.E.booleanValue() ? 1 : 0);
                a.a();
                return;
            }
            aVar.F.add(a);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.D = false;
        return false;
    }

    public a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12cfe6da5ef7c1bc7cfe58ffbcbca04b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12cfe6da5ef7c1bc7cfe58ffbcbca04b");
            return;
        }
        this.C = new Handler();
        this.E = null;
        this.F = new ArrayList();
        this.G = new Runnable() { // from class: com.sankuai.waimai.business.page.home.head.market.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51b8db2013e951d121d2241abc3c342d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51b8db2013e951d121d2241abc3c342d");
                    return;
                }
                a.a(a.this, false);
                a.this.R();
            }
        };
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5f2e36971938d841a6291ca57f4917", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5f2e36971938d841a6291ca57f4917");
        }
        super.a(viewGroup);
        this.w = (ViewGroup) viewGroup.findViewById(R.id.marking_sidebar_container);
        this.y = (ImageView) viewGroup.findViewById(R.id.marking_sidebar_icon);
        this.x = (ViewGroup) viewGroup.findViewById(R.id.marking_sidebar_close);
        this.z = new e(this.w, this.s.F);
        ((HomePageViewModel) q.a(this.s).a(HomePageViewModel.class)).q.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.market.a.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                boolean z = true;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f0a27365bd5ac81d9b8f85bbf306759", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f0a27365bd5ac81d9b8f85bbf306759");
                    return;
                }
                a.this.A = (bool2 == null || !bool2.booleanValue()) ? false : false;
                a.this.R();
            }
        });
        ((HomeSideBarViewModel) q.a(this.s).a(HomeSideBarViewModel.class)).b.a(this.s, new l<com.sankuai.waimai.business.page.home.model.e>() { // from class: com.sankuai.waimai.business.page.home.head.market.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.home.model.e eVar) {
                com.sankuai.waimai.business.page.home.model.e eVar2 = eVar;
                Object[] objArr2 = {eVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "247f5d3c5a6a5f8af4ff94b90984ee59", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "247f5d3c5a6a5f8af4ff94b90984ee59");
                } else {
                    a.a(a.this, eVar2);
                }
            }
        });
        if (this.s.getActivity() != null) {
            ((HomeSideBarViewModel) q.a(this.s.getActivity()).a(HomeSideBarViewModel.class)).c.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.market.a.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82afec06b56cc28f3c5db6212d67e1d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82afec06b56cc28f3c5db6212d67e1d8");
                        return;
                    }
                    a.this.E = bool2;
                    if (bool2 == null || a.this.F.isEmpty()) {
                        return;
                    }
                    for (JudasManualManager.a aVar : a.this.F) {
                        if (aVar != null) {
                            aVar.a("is_show", bool2.booleanValue() ? 1 : 0);
                            aVar.a();
                        }
                    }
                    a.this.F.clear();
                }
            });
        }
        return viewGroup;
    }

    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdb41c7fa45d4dd150470be6bbcd150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdb41c7fa45d4dd150470be6bbcd150");
        } else if (this.s.getView() == null || this.s.getActivity() == null || this.s.getActivity().isFinishing() || this.z == null) {
        } else {
            this.z.a();
            if (this.C != null) {
                this.C.removeCallbacks(this.G);
            }
            this.D = true;
            R();
        }
    }

    public final void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ddf36ca6d9531fff361994240591e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ddf36ca6d9531fff361994240591e4");
        } else if (this.s.getView() == null || this.s.getActivity() == null || this.s.getActivity().isFinishing() || this.z == null) {
        } else {
            this.z.b();
            if (this.C != null) {
                this.C.postDelayed(this.G, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2945da2fc4a7e27545534c07aaa492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2945da2fc4a7e27545534c07aaa492");
        } else if (this.B == null || this.y == null) {
        } else {
            if (!this.D && !this.A) {
                this.y.setImageDrawable(this.B);
                this.B.start();
                return;
            }
            this.y.setImageBitmap(this.B.b());
        }
    }
}
