package com.sankuai.waimai.business.page.home.head.banner.mach;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.container.d;
import com.sankuai.waimai.mach.container.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@DynamicBinder(modelType = HomeNewHeadResponse.class, nativeId = {"wm_home_head_single_banner_mach"}, viewModel = c.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.page.common.arch.a<String> implements com.sankuai.waimai.business.page.home.head.b {
    public static ChangeQuickRedirect v;
    private boolean A;
    private List<com.sankuai.waimai.business.page.home.head.c> B;
    private boolean C;
    private d D;
    private b w;
    private AcrossBannerMachViewModel x;
    private View y;
    private ViewGroup z;

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final /* synthetic */ void d(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985cea45fd26fe3fb0a77e693d4c7820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985cea45fd26fe3fb0a77e693d4c7820");
            return;
        }
        try {
            this.w.w = false;
            Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(str2);
            String str3 = (String) a.get("template_id");
            String str4 = (String) a.get("default_template_id");
            if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                this.C = true;
                this.u.setVisibility(8);
                return;
            }
            this.u.setVisibility(0);
            this.w.a(str3, str4, a, g.a(com.meituan.android.singleton.b.a.getApplicationContext()), 0);
        } catch (Exception e) {
            this.C = true;
            this.u.setVisibility(8);
            com.sankuai.waimai.foundation.utils.log.a.b("AcrossBannerMachBlock", e.getMessage(), new Object[0]);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.C = true;
        return true;
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        this((PageFragment) aVar.h());
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9848c0ae5a3a00cb7fda8774ea7af7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9848c0ae5a3a00cb7fda8774ea7af7");
        }
    }

    private a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b40a0e474bb8eeb262ba6a951f608931", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b40a0e474bb8eeb262ba6a951f608931");
            return;
        }
        this.B = new CopyOnWriteArrayList();
        this.D = new e() { // from class: com.sankuai.waimai.business.page.home.head.banner.mach.a.1
            public static ChangeQuickRedirect a;

            private void h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b8b112a49221223b3059d2ff7381991", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b8b112a49221223b3059d2ff7381991");
                    return;
                }
                a.a(a.this, true);
                for (com.sankuai.waimai.business.page.home.head.c cVar : a.this.B) {
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6141a648501592580b791520f372df4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6141a648501592580b791520f372df4");
                } else {
                    a.this.w.w = false;
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ff4e2e47949c2b350ed178e735d9a3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ff4e2e47949c2b350ed178e735d9a3a");
                    return;
                }
                a.this.w.w = false;
                h();
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b27d2119651ab2f6f672fa395b87b7e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b27d2119651ab2f6f672fa395b87b7e3");
                    return;
                }
                a.this.w.w = false;
                h();
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e99a2dd63682ae1b24562746a2cbd85f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e99a2dd63682ae1b24562746a2cbd85f");
                    return;
                }
                a.this.w.w = false;
                h();
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2dcac48b415b26d12a2efeac97d5fc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2dcac48b415b26d12a2efeac97d5fc6");
                    return;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f793387e5eadd31b41032ddf5570a3aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f793387e5eadd31b41032ddf5570a3aa");
                } else {
                    a.a(a.this, true);
                    for (com.sankuai.waimai.business.page.home.head.c cVar : a.this.B) {
                        if (cVar != null) {
                            cVar.a(a.this.w);
                        }
                    }
                }
                a.this.u.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.business.page.home.head.banner.mach.a.1.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Type inference failed for: r0v14, types: [com.meituan.android.cube.pga.viewmodel.a] */
                    /* JADX WARN: Type inference failed for: r2v12, types: [com.meituan.android.cube.pga.viewmodel.a] */
                    /* JADX WARN: Type inference failed for: r2v18, types: [com.meituan.android.cube.pga.viewmodel.a] */
                    /* JADX WARN: Type inference failed for: r2v24, types: [com.meituan.android.cube.pga.viewmodel.a] */
                    /* JADX WARN: Type inference failed for: r2v6, types: [com.meituan.android.cube.pga.viewmodel.a] */
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ede2d70af68775bb72cc3eaaa0cf9e81", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ede2d70af68775bb72cc3eaaa0cf9e81")).booleanValue();
                        }
                        if (a.this.s == null || a.this.s.getActivity() == null) {
                            return true;
                        }
                        PromotionBgViewModel promotionBgViewModel = (PromotionBgViewModel) q.a(a.this.s).a(PromotionBgViewModel.class);
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = PromotionBgViewModel.a;
                        if (PatchProxy.isSupport(objArr5, promotionBgViewModel, changeQuickRedirect5, false, "a0828d0927f27767f947a4c2123961a4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, promotionBgViewModel, changeQuickRedirect5, false, "a0828d0927f27767f947a4c2123961a4");
                        } else {
                            promotionBgViewModel.h.b((k<Boolean>) Boolean.TRUE);
                        }
                        a.this.u.getViewTreeObserver().removeOnPreDrawListener(this);
                        com.sankuai.waimai.business.page.home.helper.b.a();
                        if (a.this.G() == 0 || a.this.G().j() == null) {
                            return true;
                        }
                        if (a.this.z != null && a.this.z.getVisibility() == 0) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.this.z.getLayoutParams();
                            marginLayoutParams.topMargin = g.a(com.meituan.android.singleton.b.a, a.this.G().j().a);
                            marginLayoutParams.bottomMargin = g.a(com.meituan.android.singleton.b.a, a.this.G().j().b);
                            a.this.z.setLayoutParams(marginLayoutParams);
                        }
                        if (a.this.u.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) a.this.u.getLayoutParams();
                            marginLayoutParams2.topMargin = g.a(com.meituan.android.singleton.b.a, a.this.G().j().a);
                            marginLayoutParams2.bottomMargin = g.a(com.meituan.android.singleton.b.a, a.this.G().j().b);
                            a.this.u.setLayoutParams(marginLayoutParams2);
                            return true;
                        }
                        return true;
                    }
                });
            }
        };
        this.x = (AcrossBannerMachViewModel) q.a(pageFragment).a(AcrossBannerMachViewModel.class);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        String generatePageInfoKey;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b70feec582441160089bcdf3d280f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b70feec582441160089bcdf3d280f3");
        }
        this.u = LayoutInflater.from(this.t).inflate(R.layout.wm_page_main_head_single_banner, viewGroup, false);
        this.y = this.u.findViewById(R.id.layout_single_banner_mach);
        this.z = (ViewGroup) this.u.findViewById(R.id.layout_qualification_mach);
        Activity activity = this.s.F;
        String q = this.s.q();
        String i = this.n.i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "121b6b33a4b11ea1ba3d6fff4220d4d9", RobustBitConfig.DEFAULT_VALUE)) {
            generatePageInfoKey = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "121b6b33a4b11ea1ba3d6fff4220d4d9");
        } else if (F() == 0) {
            generatePageInfoKey = "";
        } else {
            generatePageInfoKey = AppUtil.generatePageInfoKey(F().h() != null ? F().h() : F().b());
        }
        this.w = new b(activity, q, i, generatePageInfoKey);
        this.w.a(this.D);
        HashMap hashMap = new HashMap();
        hashMap.put("ab_info", this.n.h());
        this.w.a(hashMap);
        this.w.h();
        this.w.a((ViewGroup) this.y, this.n.k(), "waimai");
        if (this.x.b != null) {
            this.x.b.a(this.s, new l<View>() { // from class: com.sankuai.waimai.business.page.home.head.banner.mach.a.2
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable View view) {
                    View view2 = view;
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae49fa7973e01529a2a540f259fff8a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae49fa7973e01529a2a540f259fff8a0");
                        return;
                    }
                    a.this.z.setVisibility(((PromotionBgViewModel) q.a(a.this.s).a(PromotionBgViewModel.class)).j ? 0 : 8);
                    if (view2 != null && (view2.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) view2.getParent()).removeView(view2);
                    }
                    a.this.z.removeAllViews();
                    a.this.z.addView(view2);
                }
            });
        }
        return this.u;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f22f3a8044a664605926dc6cb2043b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f22f3a8044a664605926dc6cb2043b");
            return;
        }
        super.a(aVar);
        this.C = false;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void b(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f336b25ea5b9f1a112dd342c9fec962d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f336b25ea5b9f1a112dd342c9fec962d");
        } else if (rect == null || this.u == null) {
        } else {
            if (this.u.getWindowVisibility() == 0 && Rect.intersects(rect, ah.a(this.u))) {
                if (this.A) {
                    return;
                }
                this.A = true;
                this.w.a(true);
            } else if (this.A) {
                this.A = false;
                this.w.w = false;
                this.w.a(false);
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78ae8f9a349ea7aec632f6034a3c5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78ae8f9a349ea7aec632f6034a3c5e4");
        } else if (this.w != null) {
            if (this.w.w) {
                ((com.sankuai.waimai.platform.dynamic.a) this.w).e = true;
                this.w.b();
                return;
            }
            ((com.sankuai.waimai.platform.dynamic.a) this.w).e = false;
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final boolean ar_() {
        return this.C;
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final void a(com.sankuai.waimai.business.page.home.head.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70d4dad9bd2bc43dead58694c6558dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70d4dad9bd2bc43dead58694c6558dae");
        } else if (this.B.contains(cVar)) {
        } else {
            this.B.add(cVar);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final void b(com.sankuai.waimai.business.page.home.head.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c99c6946ca3c958651b397965bd544d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c99c6946ca3c958651b397965bd544d");
        } else if (this.B.contains(cVar)) {
            this.B.remove(cVar);
        }
    }
}
