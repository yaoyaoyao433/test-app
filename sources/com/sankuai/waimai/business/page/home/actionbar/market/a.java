package com.sankuai.waimai.business.page.home.actionbar.market;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.model.e;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    public ViewGroup w;
    private ImageView x;
    private View y;
    private static int z = g.a(com.meituan.android.singleton.b.a, 60.0f);
    private static int A = g.a(com.meituan.android.singleton.b.a, 20.0f);

    public static /* synthetic */ void a(a aVar, boolean z2, final e eVar) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), eVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7a6863a07fa9bc80c8f7cce9f5ab36ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7a6863a07fa9bc80c8f7cce9f5ab36ec");
        } else if (aVar.y == null || !(aVar.y.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || aVar.w == null || aVar.x == null) {
        } else {
            if (z2 && eVar != null && eVar.c()) {
                aVar.w.setVisibility(0);
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market, data valid ,  set visible  ,notify weather", new Object[0]);
                ((HeaderFloatViewModel) q.a(aVar.s).a(HeaderFloatViewModel.class)).a(true);
                RequestCreator d = Picasso.g(aVar.s.getActivity()).d(eVar.a().a);
                d.s = new RequestListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.market.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.RequestListener
                    public final boolean a(Exception exc, Object obj, boolean z3) {
                        Object[] objArr2 = {exc, obj, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a76bf946bb6c8d9bc171bf9500db0c2f", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a76bf946bb6c8d9bc171bf9500db0c2f")).booleanValue();
                        }
                        a.this.w.setVisibility(8);
                        a.this.x.setImageDrawable(null);
                        com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market, pic  invalid ,  set gone ", new Object[0]);
                        return false;
                    }

                    @Override // com.squareup.picasso.RequestListener
                    public final boolean a(Object obj, Object obj2, boolean z3, boolean z4) {
                        String str;
                        e.b bVar;
                        String str2;
                        Object[] objArr2 = {obj, obj2, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08eb5bcfd42d8c3bb9b87cbb14bce2d9", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08eb5bcfd42d8c3bb9b87cbb14bce2d9")).booleanValue();
                        }
                        if (((obj instanceof PicassoDrawable) && a.this.x != null) || a.this.w == null) {
                            PicassoDrawable picassoDrawable = (PicassoDrawable) obj;
                            int intrinsicWidth = picassoDrawable.getIntrinsicWidth();
                            int intrinsicHeight = picassoDrawable.getIntrinsicHeight();
                            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                                float f = (intrinsicWidth * 1.0f) / intrinsicHeight;
                                com.sankuai.waimai.foundation.utils.log.a.b("HeaderFloatBlock", "ration: " + f, new Object[0]);
                                int min = Math.min(((int) f) * a.A, a.z);
                                ViewGroup.LayoutParams layoutParams = a.this.x.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.width = min;
                                    com.sankuai.waimai.foundation.utils.log.a.b("HeaderFloatBlock", "new  img width: " + min, new Object[0]);
                                }
                            }
                        }
                        JudasManualManager.a a2 = JudasManualManager.b("b_waimai_9hzffbsv_mv").a("c_m84bv26");
                        a2.b = AppUtil.generatePageInfoKey(a.this.s);
                        a2.a("entry_item_id", eVar.b()).a("activity_type", eVar.a().b).a();
                        com.sankuai.waimai.guidepop.manager.b a3 = com.sankuai.waimai.guidepop.manager.b.a();
                        e eVar2 = eVar;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = e.a;
                        if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "42fc3fd05cce45a0d8c9bea12ba0e155", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "42fc3fd05cce45a0d8c9bea12ba0e155");
                        } else {
                            str = (eVar2.d == null || eVar2.d.size() <= 0 || (bVar = eVar2.d.get(0)) == null || bVar.c == null || bVar.c.size() <= 0) ? "" : bVar.c.get(0).c;
                        }
                        int b = eVar.b();
                        Object[] objArr4 = {str, Integer.valueOf(b)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.guidepop.manager.b.a;
                        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "0168d750088f81d2e0e3076ead3a01b8", RobustBitConfig.DEFAULT_VALUE)) {
                            str2 = (String) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "0168d750088f81d2e0e3076ead3a01b8");
                        } else if (TextUtils.isEmpty(str)) {
                            str2 = "";
                        } else {
                            str2 = str + "@" + b;
                        }
                        com.sankuai.waimai.guidepop.manager.b.a().a(str2, a.this.x, 1);
                        return false;
                    }
                };
                d.a(aVar.x);
                aVar.x.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.market.a.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ba23c4d263100983339af3af1ae66f3", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ba23c4d263100983339af3af1ae66f3");
                            return;
                        }
                        com.sankuai.waimai.foundation.router.a.a(a.this.s.getActivity(), eVar.a().c);
                        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_9hzffbsv_mc").a("c_m84bv26");
                        a2.b = AppUtil.generatePageInfoKey(a.this.s);
                        a2.a("entry_item_id", eVar.b()).a("activity_type", eVar.a().b).a();
                    }
                });
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market, data invalid ,  set gone , notify  weather", new Object[0]);
                aVar.w.setVisibility(8);
                aVar.x.setImageDrawable(null);
                ((HeaderFloatViewModel) q.a(aVar.s).a(HeaderFloatViewModel.class)).a(false);
            }
            int a = g.a(com.meituan.android.singleton.b.a, z2 ? 12.0f : 20.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.y.getLayoutParams();
            marginLayoutParams.leftMargin = a;
            aVar.y.setLayoutParams(marginLayoutParams);
        }
    }

    public static /* synthetic */ boolean a(a aVar, e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0d0fd5a138788de511fe66866dba5045", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0d0fd5a138788de511fe66866dba5045")).booleanValue();
        }
        if (eVar == null || !eVar.c()) {
            return false;
        }
        if (((HeaderFloatViewModel) q.a(aVar.s).a(HeaderFloatViewModel.class)).g) {
            if (b.a()) {
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market, weather showing ,  AB test  marketFirst  , show market  ", new Object[0]);
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market, weather showing ,  AB test  weatherFirst , show weather", new Object[0]);
                return false;
            }
        }
        return true;
    }

    public a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9ffd6cb706454f1f54b1f611cd6a74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9ffd6cb706454f1f54b1f611cd6a74");
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a1b76a7c72c6bf927c543ae8b65e0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a1b76a7c72c6bf927c543ae8b65e0e");
        }
        super.a(viewGroup);
        this.w = (ViewGroup) viewGroup.findViewById(R.id.marking_header_float_container);
        this.x = (ImageView) viewGroup.findViewById(R.id.marking_header_float_img);
        this.y = viewGroup.findViewById(R.id.message_center_home_layout);
        ((HeaderFloatViewModel) q.a(this.s).a(HeaderFloatViewModel.class)).b.a(this.s, new l<e>() { // from class: com.sankuai.waimai.business.page.home.actionbar.market.a.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable e eVar) {
                e eVar2 = eVar;
                Object[] objArr2 = {eVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e034ef4ecca2952f0bb97918a32ed381", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e034ef4ecca2952f0bb97918a32ed381");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market  receive livedata : " + eVar2, new Object[0]);
                if (a.a(a.this, eVar2)) {
                    a.a(a.this, true, eVar2);
                } else {
                    a.a(a.this, false, (e) null);
                }
            }
        });
        ((HeaderFloatViewModel) q.a(this.s).a(HeaderFloatViewModel.class)).c.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.actionbar.market.a.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95ece4bf10eadda99a319b5a46f787e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95ece4bf10eadda99a319b5a46f787e7");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Market  receive notify: " + bool2, new Object[0]);
                if (bool2 == null || a.this.w == null || a.this.x == null) {
                    return;
                }
                if (bool2.booleanValue() && a.this.w.getVisibility() == 0) {
                    com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "weatherShow show , hide market", new Object[0]);
                    a.this.w.setVisibility(8);
                    a.this.x.setImageDrawable(null);
                }
                e eVar = ((HeaderFloatViewModel) q.a(a.this.s).a(HeaderFloatViewModel.class)).e;
                if (bool2.booleanValue() || a.this.w.getVisibility() != 8 || eVar == null || !eVar.c()) {
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "weatherShow hide , show market", new Object[0]);
                a.a(a.this, true, eVar);
            }
        });
        return viewGroup;
    }
}
