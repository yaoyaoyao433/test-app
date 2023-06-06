package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommenWithPackagePraiseParam;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendWithPackageFloatResponse;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import com.sankuai.waimai.restaurant.shopcart.ui.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends i {
    public static ChangeQuickRedirect e;
    ViewGroup f;
    View g;
    TranslateAnimation h;
    com.sankuai.waimai.business.restaurant.base.ui.g i;
    Activity j;
    ab k;
    public x l;
    public a m;
    private View n;
    private TranslateAnimation o;
    private String p;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z);
    }

    public j(@NonNull Activity activity, String str, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, ab abVar, View view, @NonNull com.sankuai.waimai.business.restaurant.base.interfaces.a aVar) {
        super(activity, str, gVar, abVar, view);
        Object[] objArr = {activity, str, gVar, abVar, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d059901719ada8d37a6954f53027a0d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d059901719ada8d37a6954f53027a0d6");
            return;
        }
        this.j = activity;
        this.p = str;
        this.n = view;
        this.k = abVar;
        this.i = new com.sankuai.waimai.business.restaurant.base.ui.g(activity, gVar, abVar, true, aVar);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e778ecf1f2743146a4fd5a853b875c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e778ecf1f2743146a4fd5a853b875c");
            return;
        }
        this.f = (ViewGroup) ((ViewStub) this.n.findViewById(R.id.view_stub_recommend_with_package)).inflate().findViewById(R.id.layout_recommend_package);
        this.g = this.f.findViewById(R.id.recommend_package_real);
        this.i.a(this.f);
        this.i.d = new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.j.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e9f715795cbfd742b52255217b77fc9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e9f715795cbfd742b52255217b77fc9");
                } else {
                    j.this.a();
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13b8d5d56861d3be9ab0ee211af38964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13b8d5d56861d3be9ab0ee211af38964");
            return;
        }
        this.h = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.h.setDuration(300L);
        this.o = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.o.setDuration(300L);
    }

    public final void a(long j, String str, final Comment comment) {
        Object[] objArr = {new Long(j), str, comment};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ec53b27e79397f01e3d8e2959f2a157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ec53b27e79397f01e3d8e2959f2a157");
            return;
        }
        if (this.f == null) {
            g();
        }
        String json = new Gson().toJson(a(comment.praiseFoodList));
        final String a2 = ListIDHelper.a.a.a();
        final Dialog a3 = com.sankuai.waimai.platform.widget.dialog.a.a(this.j);
        com.sankuai.waimai.business.restaurant.base.repository.b.a(this.p).a(json, j, str, comment.id, new com.sankuai.waimai.business.restaurant.base.repository.net.c<RecommendWithPackageFloatResponse>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.j.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final /* synthetic */ void a(Object obj) {
                RecommendWithPackageFloatResponse recommendWithPackageFloatResponse = (RecommendWithPackageFloatResponse) obj;
                Object[] objArr2 = {recommendWithPackageFloatResponse};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e3e758654b108ab55b38e1c0ed68329", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e3e758654b108ab55b38e1c0ed68329");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a3);
                recommendWithPackageFloatResponse.d = a2;
                j.this.i.a(recommendWithPackageFloatResponse.b, recommendWithPackageFloatResponse.c, 0, recommendWithPackageFloatResponse.d, comment, recommendWithPackageFloatResponse.e, recommendWithPackageFloatResponse.f);
                j jVar = j.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = j.e;
                if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "55a14e81be52a26530436caedad1942d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "55a14e81be52a26530436caedad1942d");
                } else if (jVar.b()) {
                } else {
                    jVar.a(true);
                    jVar.k.a(5);
                    jVar.f.setVisibility(0);
                    jVar.g.startAnimation(jVar.h);
                    if (jVar.l != null) {
                        jVar.l.a();
                    }
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc519840fef1c4f71b505eb44a6107dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc519840fef1c4f71b505eb44a6107dc");
                    return;
                }
                super.a(aVar);
                com.sankuai.waimai.platform.widget.dialog.a.b(a3);
                j jVar = j.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = j.e;
                if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "46bdc6066adad0dcb0289a1f3b2b26e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "46bdc6066adad0dcb0289a1f3b2b26e9");
                } else {
                    ae.a(jVar.j, jVar.j.getResources().getString(R.string.wm_restaurant_net_request_failed_retry));
                }
            }
        });
    }

    private List<RecommenWithPackagePraiseParam> a(List<Comment.d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11de2f74a4981a6dff8871e6752ed30", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11de2f74a4981a6dff8871e6752ed30");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            RecommenWithPackagePraiseParam recommenWithPackagePraiseParam = new RecommenWithPackagePraiseParam();
            recommenWithPackagePraiseParam.setSkuId(list.get(i).e);
            recommenWithPackagePraiseParam.setSpuId(list.get(i).d);
            arrayList.add(recommenWithPackagePraiseParam);
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f37cba80e7c9a946d3ee0095366014e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f37cba80e7c9a946d3ee0095366014e2");
            return;
        }
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79f90ec9ed8f5bf4f87ebc8eafba661d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79f90ec9ed8f5bf4f87ebc8eafba661d");
        } else if (b()) {
            a(false);
            this.k.a(1);
            this.g.startAnimation(this.o);
            this.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.j.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "187ffbc60da7aa907166137bf60295a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "187ffbc60da7aa907166137bf60295a7");
                        return;
                    }
                    j.this.f.setVisibility(8);
                    if (j.this.l != null) {
                        j.this.l.b();
                    }
                }
            }, 300L);
            if (this.i != null) {
                this.i.b();
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83ff13343a87db78d4baf8cea65c75a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83ff13343a87db78d4baf8cea65c75a");
            return;
        }
        this.k.a(1.0f);
        this.k.c(z);
        b(z);
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.i
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b6f6f4dd0eeed57fb17b26d690fd43f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b6f6f4dd0eeed57fb17b26d690fd43f")).booleanValue() : this.f != null && this.f.getVisibility() == 0;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.i
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c323b06ce984eb4d23a311298bec924d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c323b06ce984eb4d23a311298bec924d");
        } else if (this.i != null) {
            com.sankuai.waimai.business.restaurant.base.ui.g gVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.ui.g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "caa91f7cab5cae0a729518cc0e70cc98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "caa91f7cab5cae0a729518cc0e70cc98");
                return;
            }
            if (gVar.c != null) {
                gVar.c.a();
            }
            gVar.b();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.i
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d1ada09db807665dd95a73fad910d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d1ada09db807665dd95a73fad910d0");
        } else if (this.i != null) {
            com.sankuai.waimai.business.restaurant.base.ui.g gVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.ui.g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "b9c24e9ccacbb55cffad532185bacc1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "b9c24e9ccacbb55cffad532185bacc1e");
            } else if (gVar.b != null) {
                gVar.b.b();
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1134f8e2bd82d54de3da77c981c6bc07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1134f8e2bd82d54de3da77c981c6bc07");
        } else if (this.i != null) {
            this.i.c();
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae41404f9734b76d6f35c377427cef96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae41404f9734b76d6f35c377427cef96");
        } else if (this.m != null) {
            this.m.a(z);
        }
    }
}
