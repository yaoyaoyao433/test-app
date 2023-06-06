package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.PoiCommentResponse;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.d;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.CommentImageGallery;
import com.sankuai.waimai.business.restaurant.poicontainer.views.UgcTipView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.widget.common.a;
import com.sankuai.waimai.platform.widget.emptylayout.f;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.NovaSmoothRecyclerView;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.platform.widget.common.a<Comment> {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.platform.widget.common.c<Comment> b;
    View c;
    Animation d;
    Animation e;
    @NonNull
    private final com.sankuai.waimai.business.restaurant.base.manager.order.g p;
    private final com.sankuai.waimai.platform.widget.common.f<Comment> q;
    private a r;
    private com.sankuai.waimai.log.judas.d s;
    private d t;
    private final View u;
    private boolean v;
    private com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a w;

    public static /* synthetic */ void a(e eVar) {
        Comment comment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "6d1c4ee768ecd02cd6c658e276c2b1c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "6d1c4ee768ecd02cd6c658e276c2b1c0");
            return;
        }
        RecyclerView recyclerView = eVar.g;
        if (recyclerView != null) {
            int childCount = eVar.g.getChildCount();
            for (int i = 0; i <= childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null && (comment = (Comment) childAt.getTag(R.layout.wm_restaurant_comment_new_list_adapter)) != null) {
                    if (childAt != null && childAt.getVisibility() == 0 && ah.b(childAt)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("comment_id", Long.valueOf(comment.id));
                        hashMap.put("poi_id", eVar.p.f());
                        com.sankuai.waimai.log.judas.d dVar = eVar.s;
                        dVar.a("b_waimai_fwpvasp3_mv", comment.id + CommonConstant.Symbol.UNDERLINE + childAt.getId(), hashMap);
                        if (com.sankuai.waimai.foundation.utils.b.b(comment.commentPics) && comment.commentVideo == null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("comment_id", Long.valueOf(comment.id));
                            hashMap2.put("poi_id", eVar.p.f());
                            hashMap2.put(RaptorConstants.JS_BATCH_NUM, 0);
                            com.sankuai.waimai.log.judas.d dVar2 = eVar.s;
                            dVar2.a("b_waimai_mdjg4t0a_mv", comment.id + CommonConstant.Symbol.UNDERLINE + childAt.getId(), hashMap2);
                        }
                    }
                    if (!com.sankuai.waimai.foundation.utils.b.b(comment.commentPics) || comment.commentVideo != null) {
                        int size = com.sankuai.waimai.foundation.utils.b.b(comment.commentPics) ? 0 : comment.commentPics.size();
                        View findViewById = childAt.findViewById(R.id.wm_comment_image_gallery);
                        if (findViewById != null && findViewById.getVisibility() == 0 && ah.b(findViewById)) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("comment_id", Long.valueOf(comment.id));
                            hashMap3.put("poi_id", eVar.p.f());
                            if (comment.commentVideo != null) {
                                size++;
                            }
                            hashMap3.put(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(size));
                            com.sankuai.waimai.log.judas.d dVar3 = eVar.s;
                            dVar3.a("b_waimai_mdjg4t0a_mv", comment.id + CommonConstant.Symbol.UNDERLINE + childAt.getId(), hashMap3);
                        }
                    }
                    LinearLayout linearLayout = (LinearLayout) childAt.findViewById(R.id.wm_comment_recommend_food_container);
                    if (linearLayout != null && linearLayout.getVisibility() == 0 && ah.b(linearLayout)) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("comment_id", Long.valueOf(comment.id));
                        hashMap4.put("poi_id", eVar.p.f());
                        com.sankuai.waimai.log.judas.d dVar4 = eVar.s;
                        dVar4.a("b_waimai_uv2o9n9d_mv", comment.id + CommonConstant.Symbol.UNDERLINE + childAt.getId(), hashMap4);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        LinearLayout b;
        UgcTipView c;
        com.sankuai.waimai.platform.widget.emptylayout.f d;
        View e;
        View f;

        public a(@NonNull Context context, @NonNull com.sankuai.waimai.platform.widget.emptylayout.f fVar) {
            Object[] objArr = {context, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7b38a5bc34e53a29e787c2255e6e3d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7b38a5bc34e53a29e787c2255e6e3d");
                return;
            }
            this.b = new LinearLayout(context);
            this.b.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.b.setOrientation(1);
            this.c = (UgcTipView) LayoutInflater.from(context).inflate(R.layout.wm_restaurant_comment_list_ugc_tip_view, (ViewGroup) null);
            this.c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.c.a(false);
            this.d = fVar;
            this.d.a(0, "没有更多评价了~");
            this.e = new View(context);
            this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 3.0f));
            this.e.setVisibility(8);
            this.f = new View(context);
            this.f.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 7.0f));
            this.f.setVisibility(8);
            this.b.addView(this.c);
            this.b.addView(this.e);
            this.b.addView(this.d.e);
            this.b.addView(this.f);
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c51ae28c4363fdb07fa9b99f0fc7ceb", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c51ae28c4363fdb07fa9b99f0fc7ceb");
            }
            b();
            this.c.setVisibility(8);
            this.d.e.setBackgroundColor(Color.argb((int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL));
            this.d.a();
            return this;
        }

        void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a2ceaa82e3878f1d94a3706dca1161", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a2ceaa82e3878f1d94a3706dca1161");
                return;
            }
            this.b.setMinimumHeight(0);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
    }

    public e(@NonNull Context context, @NonNull d.a aVar, @NonNull CommentImageGallery.a aVar2, @NonNull a.InterfaceC0837a interfaceC0837a, @NotNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, String str) {
        super(context);
        Object[] objArr = {context, aVar, aVar2, interfaceC0837a, gVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1be8bc30645e7a48f1cdfe1ee59d75e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1be8bc30645e7a48f1cdfe1ee59d75e");
            return;
        }
        this.s = new com.sankuai.waimai.log.judas.d();
        this.p = gVar;
        this.t = new d(this.y, aVar, gVar);
        this.q = new com.sankuai.waimai.platform.widget.common.f<>(this.y, null);
        this.w = new com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a(context, this.p, this.s, aVar2, interfaceC0837a, str);
        this.q.a(this.w);
        this.b = new com.sankuai.waimai.platform.widget.common.c<>(this.q);
        this.u = this.t.a((ViewGroup) null);
        this.b.a(this.u);
        this.r = new a(this.y, new com.sankuai.waimai.platform.widget.emptylayout.f(this.y));
        com.sankuai.waimai.platform.widget.common.c<Comment> cVar = this.b;
        LinearLayout linearLayout = this.r.a().b;
        Object[] objArr2 = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.common.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "ff22672c04e3c3f325ec6cb9fae27058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "ff22672c04e3c3f325ec6cb9fae27058");
        } else if (cVar.b.size() == 0) {
            com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "addFootView-->mFootViews.size() == 0,put " + linearLayout + " success!!", new Object[0]);
            cVar.b.put(cVar.b.size() + 200000, linearLayout);
        } else {
            boolean z = false;
            for (int i = 0; i < cVar.b.size(); i++) {
                if (cVar.b.valueAt(i) == linearLayout) {
                    z = true;
                }
            }
            if (z) {
                com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "addFootView-->mFootViews.size() == " + cVar.b.size() + "put " + linearLayout + " fail, it's exist already", new Object[0]);
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "addFootView-->mFootViews.size() == " + cVar.b.size() + "put " + linearLayout + " success!!", new Object[0]);
                cVar.b.put(cVar.b.size() + 200000, linearLayout);
            }
        }
        this.d = AnimationUtils.loadAnimation(this.y, R.anim.wm_comment_poi_ceiling_tags_in);
        this.e = AnimationUtils.loadAnimation(this.y, R.anim.wm_comment_poi_ceiling_tags_out);
    }

    @Override // com.sankuai.waimai.platform.widget.common.a, com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3eac5ed2bcaf198887993b033ac575f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3eac5ed2bcaf198887993b033ac575f");
        }
        View a2 = super.a(layoutInflater, viewGroup);
        d dVar = this.t;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        this.c = PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6d47c3662deddf43ac01188908b30972", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6d47c3662deddf43ac01188908b30972") : dVar.d.h();
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return a2;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a3b15916ea63bd2d5f69042ab5ea60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a3b15916ea63bd2d5f69042ab5ea60");
            return;
        }
        super.e();
        View view = this.c;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.common.a.f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95b94c69e24f7a9a6e429f621b558c02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95b94c69e24f7a9a6e429f621b558c02");
        } else {
            this.n.removeAllViews();
            if (view != null) {
                this.n.addView(view);
            }
        }
        this.g.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.e.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d8a770e83f369b978a0874cd111b44a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d8a770e83f369b978a0874cd111b44a");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    e.a(e.this);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08dc86977619d1b62ae410727f4909b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08dc86977619d1b62ae410727f4909b8");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (e.this.c == null || recyclerView.getChildCount() <= 0) {
                    return;
                }
                View findViewByPosition = recyclerView.getLayoutManager().findViewByPosition(0);
                if (findViewByPosition == null) {
                    e.this.a(e.this.d);
                } else if (((int) findViewByPosition.getY()) + findViewByPosition.getHeight() <= e.this.c.getMeasuredHeight()) {
                    e.this.a(e.this.d);
                } else {
                    e eVar = e.this;
                    Animation animation = e.this.e;
                    Object[] objArr4 = {animation};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.widget.common.a.f;
                    if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "53a182b56036e38485aaaa17804f1062", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "53a182b56036e38485aaaa17804f1062");
                    } else if (eVar.n.getVisibility() != 4) {
                        eVar.n.setVisibility(4);
                        if (animation != null) {
                            eVar.n.startAnimation(animation);
                        }
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.common.a
    public final com.sankuai.waimai.platform.widget.common.f<Comment> a() {
        return this.b;
    }

    @Override // com.sankuai.waimai.platform.widget.common.a
    public final a.C1081a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65eb850d76486b3eec737d202fed2a4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C1081a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65eb850d76486b3eec737d202fed2a4a");
        }
        a.C1081a.C1082a c1082a = new a.C1081a.C1082a();
        c1082a.c = R.drawable.wm_common_default_empty_icon;
        c1082a.g = R.string.wm_comment_no_content;
        c1082a.l = 3;
        c1082a.j = true;
        c1082a.b = 20;
        c1082a.i = new LinearLayoutManager(this.y, 1, false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.C1081a.C1082a.a;
        return PatchProxy.isSupport(objArr2, c1082a, changeQuickRedirect2, false, "0d04863b381f8bc276ebfb1b7700d524", RobustBitConfig.DEFAULT_VALUE) ? (a.C1081a) PatchProxy.accessDispatch(objArr2, c1082a, changeQuickRedirect2, false, "0d04863b381f8bc276ebfb1b7700d524") : new a.C1081a(c1082a);
    }

    @Override // com.sankuai.waimai.platform.widget.common.a
    public final RecyclerView a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242afdf09f45c5808371b8cc08e6cc3e", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242afdf09f45c5808371b8cc08e6cc3e") : new NovaSmoothRecyclerView(linearLayout.getContext());
    }

    public final void a(PoiCommentResponse poiCommentResponse, boolean z) {
        Object[] objArr = {poiCommentResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b6d5fa9831820f76d05dc36e53a69b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b6d5fa9831820f76d05dc36e53a69b");
            return;
        }
        this.v = poiCommentResponse.tabs == null || poiCommentResponse.tabs.size() == 0;
        this.t.a(poiCommentResponse);
        a aVar = this.r;
        String str = poiCommentResponse.lastPageCommentTip;
        String str2 = poiCommentResponse.lastPageCommentTitle;
        String str3 = poiCommentResponse.lastPageCommentUrl;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c542af8e2d152bd4e3ef86bd319cfa22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c542af8e2d152bd4e3ef86bd319cfa22");
        } else {
            aVar.c.a(str, str2, str3);
        }
        this.w.h = poiCommentResponse.isShowUserCommentEntrance();
        if (poiCommentResponse.commentList != null && !poiCommentResponse.commentList.isEmpty() && poiCommentResponse.commentLabelTipList != null && !poiCommentResponse.commentLabelTipList.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            for (com.sankuai.waimai.business.restaurant.base.repository.model.c cVar : poiCommentResponse.commentLabelTipList) {
                sparseArray.put(cVar.a, cVar.b);
            }
            Iterator<Comment> it = poiCommentResponse.commentList.iterator();
            while (it.hasNext()) {
                Comment next = it.next();
                next.scoreText = (String) sparseArray.get(next.score);
            }
        }
        a(poiCommentResponse.commentList, z, poiCommentResponse.hasMore);
        if (z) {
            this.g.scrollToPosition(0);
        }
        this.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08e6ed27dd0356a18e7a5a7a531c7e24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08e6ed27dd0356a18e7a5a7a531c7e24");
                } else {
                    e.a(e.this);
                }
            }
        }, 300L);
    }

    @Override // com.sankuai.waimai.platform.widget.common.a
    public final void a(boolean z) {
        int intValue;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec0bbd39d462d748b85eab706d49aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec0bbd39d462d748b85eab706d49aeb");
        } else if (!z) {
            int size = this.b.a() == null ? 0 : this.b.a().size();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb920ff1da58030453a86211809dd621", RobustBitConfig.DEFAULT_VALUE)) {
                intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb920ff1da58030453a86211809dd621")).intValue();
            } else {
                d dVar = this.t;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                intValue = PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "82a0d56ed3014402926173ba8c65aeb3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "82a0d56ed3014402926173ba8c65aeb3")).intValue() : dVar.f.d;
            }
            if (intValue != 21 && size > 0) {
                a aVar = this.r;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "69f1f7225c70f39432f7f57e0edfbdb4", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar2 = (a) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "69f1f7225c70f39432f7f57e0edfbdb4");
                    return;
                }
                aVar.b();
                aVar.c.setVisibility(0);
                aVar.d.e.setBackgroundColor(Color.argb((int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL));
                aVar.d.b();
            } else if (size == 0) {
                a aVar3 = this.r;
                boolean z2 = this.v;
                Object[] objArr5 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "9fcb9e5c898e4c4d5f8e1d4b11aab5b6", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar4 = (a) PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "9fcb9e5c898e4c4d5f8e1d4b11aab5b6");
                    return;
                }
                int argb = Color.argb(255, 255, 255, 255);
                Object[] objArr6 = {Integer.valueOf(argb)};
                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "f236851ba55677b1337be71fd830089c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "f236851ba55677b1337be71fd830089c");
                } else {
                    aVar3.b.setMinimumHeight(com.meituan.roodesign.widgets.internal.a.a(aVar3.b.getContext(), 400.0f));
                    aVar3.e.setVisibility(0);
                    aVar3.f.setVisibility(0);
                    aVar3.e.setBackgroundColor(argb);
                    aVar3.f.setBackgroundColor(argb);
                }
                aVar3.c.setVisibility(8);
                aVar3.d.e.setBackgroundColor(Color.argb(255, 255, 255, 255));
                com.sankuai.waimai.platform.widget.emptylayout.f fVar = aVar3.d;
                int i = z2 ? R.string.wm_comment_total_no_content : R.string.wm_comment_no_content;
                Object[] objArr7 = {Integer.valueOf((int) R.drawable.wm_common_default_empty_icon), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.platform.widget.emptylayout.f.a;
                if (PatchProxy.isSupport(objArr7, fVar, changeQuickRedirect7, false, "5eaa613df780a35a0102eb183ed71977", RobustBitConfig.DEFAULT_VALUE)) {
                    com.sankuai.waimai.platform.widget.emptylayout.f fVar2 = (com.sankuai.waimai.platform.widget.emptylayout.f) PatchProxy.accessDispatch(objArr7, fVar, changeQuickRedirect7, false, "5eaa613df780a35a0102eb183ed71977");
                } else {
                    fVar.a(f.a.INFO, R.drawable.wm_common_default_empty_icon, fVar.a(i));
                }
            } else {
                a aVar5 = this.r;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a.a;
                if (PatchProxy.isSupport(objArr8, aVar5, changeQuickRedirect8, false, "49dc1c5240e215d3233f633f080d4c98", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar6 = (a) PatchProxy.accessDispatch(objArr8, aVar5, changeQuickRedirect8, false, "49dc1c5240e215d3233f633f080d4c98");
                    return;
                }
                aVar5.b();
                aVar5.c.setVisibility(8);
                aVar5.d.e.setBackgroundColor(Color.argb((int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, (int) TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL));
                aVar5.d.b();
            }
        } else {
            this.r.a();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb8b5bd2e39e0bebd00f90292426672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb8b5bd2e39e0bebd00f90292426672");
        } else {
            this.t.a();
        }
    }
}
