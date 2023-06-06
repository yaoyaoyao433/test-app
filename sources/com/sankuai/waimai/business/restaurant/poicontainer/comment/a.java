package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.PoiCommentResponse;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.b;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.PoiCommentSP;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_r_reviews"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.restaurant.base.config.b<b, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> implements com.sankuai.waimai.business.restaurant.framework.viewpager.a, b.a {
    public static ChangeQuickRedirect t;
    private com.sankuai.waimai.business.restaurant.base.repository.a u;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g v;
    private boolean w;
    private boolean x;
    private boolean y;

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f00d3edb93c69eb76683c07cbb16f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f00d3edb93c69eb76683c07cbb16f5a");
        }
        this.v = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        return new b(l(), this.v, this);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.x = false;
        return false;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.w = false;
        return false;
    }

    public a(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378f765e779275f51bf6f5523ffc18c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378f765e779275f51bf6f5523ffc18c0");
        } else {
            this.x = true;
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93433c31848502c38a79fc479d7e48f7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93433c31848502c38a79fc479d7e48f7") : new com.meituan.android.cube.pga.viewmodel.a();
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.viewpager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e269c5694624808d6d34d6410d0e1c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e269c5694624808d6d34d6410d0e1c5");
        } else if (z) {
            M();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc762205ecfca9a361440ce6734ef6af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc762205ecfca9a361440ce6734ef6af");
            return;
        }
        super.s();
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).L.b.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e1f78289ada6902276e7e0197228d93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e1f78289ada6902276e7e0197228d93");
                } else if (num2.intValue() == 0) {
                    ((b) a.this.g).h();
                }
            }
        });
        this.u = com.sankuai.waimai.business.restaurant.base.repository.b.a(((BaseActivity) l()).w());
        ((b) this.g).e();
        if (this.y) {
            M();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.b.a
    public final void a(int i, final int i2, long j, final boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263bd7fafbeb9c73bd3941967a7ae9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263bd7fafbeb9c73bd3941967a7ae9e4");
            return;
        }
        final String f = this.v.f();
        if (TextUtils.isEmpty(f)) {
            l().finish();
        } else if (this.w) {
        } else {
            this.w = true;
            com.sankuai.waimai.business.restaurant.base.repository.a aVar = this.u;
            b bVar = (b) this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.d;
            aVar.a(i, PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a99c7f2e524f61c98d03e0c13b65099f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a99c7f2e524f61c98d03e0c13b65099f")).intValue() : bVar.g.l.a, i2, j, f, new com.sankuai.waimai.business.restaurant.base.repository.net.c<PoiCommentResponse>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.a.2
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final /* synthetic */ void a(Object obj) {
                    PoiCommentResponse poiCommentResponse = (PoiCommentResponse) obj;
                    Object[] objArr3 = {poiCommentResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9a9b673082d35ddea140838a347be677", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9a9b673082d35ddea140838a347be677");
                        return;
                    }
                    a.a(a.this, false);
                    a.b(a.this, false);
                    if (poiCommentResponse != null && poiCommentResponse.commentsDianping != null) {
                        String str = poiCommentResponse.commentsDianping.wmPoiIdStr;
                        if (!f.equals(str)) {
                            GlobalCartManager.getInstance().addNewPoiId(f, str);
                            a.C1052a.a("comment_poi", f, str);
                            com.sankuai.waimai.platform.domain.core.poi.b.a(poiCommentResponse.commentsDianping.wmPoiId, str);
                        }
                    }
                    if (poiCommentResponse != null) {
                        b bVar2 = (b) a.this.g;
                        boolean z2 = z;
                        Object[] objArr4 = {poiCommentResponse, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = b.d;
                        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "af20e74e978e3e380d1105ebc5df70a7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "af20e74e978e3e380d1105ebc5df70a7");
                        } else {
                            bVar2.g.a(poiCommentResponse, z2);
                        }
                    }
                    com.sankuai.waimai.ai.uat.b.a().a("COMMENT_TYPE_KEY", Integer.valueOf(i2));
                    a.b(a.this, false);
                }

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3d64d942b84504154efb07157baca28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3d64d942b84504154efb07157baca28");
                        return;
                    }
                    if (aVar2.c()) {
                        ae.a((Activity) a.this.l(), com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_bad_net_retry_later_1));
                    }
                    b bVar2 = (b) a.this.g;
                    Object[] objArr4 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = b.d;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "29236eb41a4fff97e42a5a9242feed19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "29236eb41a4fff97e42a5a9242feed19");
                    } else {
                        e eVar = bVar2.g;
                        Object[] objArr5 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.widget.common.a.f;
                        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "49fd838cec2f445d96db533988d5bd5b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "49fd838cec2f445d96db533988d5bd5b");
                        } else if (aVar2.c()) {
                            eVar.k.g();
                        } else {
                            if (aVar2.b == 2) {
                                eVar.k.d("");
                            } else {
                                eVar.k.f();
                            }
                        }
                    }
                    a.b(a.this, false);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.b.a
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07434486bc5bfaddd213748180e3aa0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07434486bc5bfaddd213748180e3aa0e");
        } else if (this.x) {
            a(0, i, j, true);
        }
    }

    private void M() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5188fe6089ef8164e544458e65f92cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5188fe6089ef8164e544458e65f92cc7");
            return;
        }
        if (l() != null && this.g != 0) {
            z = true;
        }
        if (z) {
            a(((b) this.g).h, ((b) this.g).i);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8a7f8274b86275eb0d0691c4c6d449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8a7f8274b86275eb0d0691c4c6d449");
            return;
        }
        super.aX_();
        b bVar = (b) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a265ebcd1aadc913f0a9fb2f713dfc8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a265ebcd1aadc913f0a9fb2f713dfc8f");
            return;
        }
        if (!PoiCommentSP.b()) {
            PoiCommentSP.c();
        }
        PoiCommentSP.a(false);
        if (bVar.g != null) {
            e eVar = bVar.g;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "34ba46a357b23a93dfa8cc690281c260", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "34ba46a357b23a93dfa8cc690281c260");
            } else if (eVar.b != null) {
                eVar.b.notifyDataSetChanged();
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc22a028a136d7d4c320b07bf231e71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc22a028a136d7d4c320b07bf231e71");
            return;
        }
        super.bD_();
        ((b) this.g).f();
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd0cd8e02c804df9227cf2a7e5d3a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd0cd8e02c804df9227cf2a7e5d3a10");
            return;
        }
        super.bE_();
        com.sankuai.waimai.business.restaurant.base.repository.b.c(o());
        ((b) this.g).g();
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.b.a
    public final void a(String str, Comment comment) {
        Object[] objArr = {str, comment};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c4108f786de5ef3322d47eceb755b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c4108f786de5ef3322d47eceb755b3");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).G.b.a((com.meituan.android.cube.pga.common.b<Comment>) comment);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b52dfb2a97dfc8491dd150e851bb80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b52dfb2a97dfc8491dd150e851bb80");
            return;
        }
        super.y();
        ((b) this.g).h();
    }
}
