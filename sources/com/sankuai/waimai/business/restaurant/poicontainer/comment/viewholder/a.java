package com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.CommentImageGallery;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.lottie.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.CommentGood;
import com.sankuai.waimai.platform.widget.CommentTextView;
import com.sankuai.waimai.platform.widget.common.b;
import com.sankuai.waimai.platform.widget.common.d;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d<Comment> {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected g c;
    String d;
    int e;
    String f;
    InterfaceC0837a g;
    public boolean h;
    HashMap<String, e> i;
    private boolean j;
    private com.sankuai.waimai.log.judas.d k;
    private CommentImageGallery.a l;
    private int m;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0837a {
        void a(Comment comment);

        void a(String str, Comment comment);
    }

    @Override // com.sankuai.waimai.platform.widget.common.d
    public final int a() {
        return R.layout.wm_restaurant_comment_new_list_adapter;
    }

    @Override // com.sankuai.waimai.platform.widget.common.d
    public final /* bridge */ /* synthetic */ boolean a(Comment comment, int i) {
        return true;
    }

    public static /* synthetic */ Bundle a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "fe6f87f2a98c0b75a08ed2f36fc868cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "fe6f87f2a98c0b75a08ed2f36fc868cd");
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(FoodDetailNetWorkPreLoader.INTENT_IS_SELFDELIVERY_SHOP, aVar.c.k);
        bundle.putInt("intent_business_type", aVar.c.o);
        bundle.putInt("intent_traffic_from", aVar.c.l);
        bundle.putSerializable(FoodDetailNetWorkPreLoader.INTENT_POI, aVar.c.g);
        return bundle;
    }

    public static /* synthetic */ void a(a aVar, Comment comment) {
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1d714a182e0ab74a1e9d674f7276439c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1d714a182e0ab74a1e9d674f7276439c");
        } else if (aVar.h) {
            if (comment.commentSourceType == 1) {
                if (aVar.b != null) {
                    if (com.sankuai.waimai.foundation.core.a.e()) {
                        aVar.a(aVar.b, comment.userId, comment.id);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("comment_id", comment.id);
                    bundle.putLong("user_id", comment.userId);
                    com.sankuai.waimai.foundation.router.a.a(aVar.b, c.p, bundle);
                }
            } else if (aVar.b != null) {
                if (com.sankuai.waimai.foundation.core.a.e()) {
                    aVar.a(aVar.b, comment.userId, comment.id);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("comment_id", comment.id);
                bundle2.putLong("user_id", comment.userId);
                com.sankuai.waimai.foundation.router.a.a(aVar.b, c.q, bundle2);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.common.d
    public final /* synthetic */ void a(b bVar, Comment comment, int i) {
        final Comment comment2 = comment;
        Object[] objArr = {bVar, comment2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79df19ddd47e8ddc6266f51f5a0f7e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79df19ddd47e8ddc6266f51f5a0f7e13");
            return;
        }
        a(bVar, comment2);
        b(bVar, comment2);
        c(bVar, comment2);
        Object[] objArr2 = {bVar, comment2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cc39b6038f41531752f2fcfb4cf1250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cc39b6038f41531752f2fcfb4cf1250");
        } else {
            ImageView imageView = (ImageView) bVar.a(R.id.wm_comment_more_btn);
            if (comment2.isDpComment() || comment2.functionMenu == null || !comment2.functionMenu.b) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.8
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ce459a00a670164e525bca81fcfe2aa", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ce459a00a670164e525bca81fcfe2aa");
                        } else if (a.this.g != null) {
                            a.this.g.a(comment2);
                        }
                    }
                });
            }
        }
        bVar.itemView.setTag(R.layout.wm_restaurant_comment_new_list_adapter, comment2);
    }

    public a(Context context, g gVar, com.sankuai.waimai.log.judas.d dVar, CommentImageGallery.a aVar, InterfaceC0837a interfaceC0837a, String str) {
        Object[] objArr = {context, gVar, dVar, aVar, interfaceC0837a, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b96d9d047e9a520b003f61ad447949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b96d9d047e9a520b003f61ad447949");
            return;
        }
        this.i = new HashMap<>();
        this.b = context;
        this.c = gVar;
        this.d = gVar.f();
        this.e = gVar.s();
        this.j = gVar.i;
        this.k = dVar;
        this.l = aVar;
        this.g = interfaceC0837a;
        this.f = str;
        this.m = com.sankuai.waimai.foundation.utils.g.a(context, 36.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.waimai.platform.widget.common.b r29, final com.sankuai.waimai.platform.domain.core.comment.Comment r30) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.a(com.sankuai.waimai.platform.widget.common.b, com.sankuai.waimai.platform.domain.core.comment.Comment):void");
    }

    private void b(b bVar, final Comment comment) {
        View inflate;
        String string;
        char c = 1;
        Object[] objArr = {bVar, comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc423d6ce725f152bfceae2736d98920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc423d6ce725f152bfceae2736d98920");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) bVar.a(R.id.wm_comment_content_container);
        final CommentTextView commentTextView = (CommentTextView) bVar.a(R.id.wm_comment_content);
        TextView textView = (TextView) bVar.a(R.id.wm_comment_content_desc);
        final TextView textView2 = (TextView) bVar.a(R.id.wm_comment_fold);
        CommentImageGallery commentImageGallery = (CommentImageGallery) bVar.a(R.id.wm_comment_image_gallery);
        LinearLayout linearLayout2 = (LinearLayout) bVar.a(R.id.wm_comment_addition_info_container);
        if (TextUtils.isEmpty(comment.content) && ((comment.commentPics == null || comment.commentPics.isEmpty()) && (comment.addCommentList == null || comment.addCommentList.isEmpty()))) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        if (TextUtils.isEmpty(comment.content)) {
            commentTextView.setVisibility(8);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            commentTextView.setVisibility(0);
            commentTextView.setText(comment.content);
            textView.setVisibility(0);
            textView.setContentDescription("评价内容，" + comment.content);
            if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                commentTextView.setTextSize(26.0f);
                textView2.setTextSize(26.0f);
            }
            commentTextView.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03b5aa21fe623050108d9eb6266ae098", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03b5aa21fe623050108d9eb6266ae098");
                    } else if (commentTextView == null || textView2 == null) {
                    } else {
                        if (commentTextView.getLineCount() > 6) {
                            commentTextView.setMaxLines(6);
                            textView2.setVisibility(0);
                            return;
                        }
                        textView2.setVisibility(8);
                    }
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b48f57a6fc793261910c76638cdf1feb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b48f57a6fc793261910c76638cdf1feb");
                        return;
                    }
                    textView2.setVisibility(8);
                    commentTextView.setMaxLines(100);
                }
            });
            if (!com.sankuai.waimai.foundation.utils.b.b(comment.commentGoodsList)) {
                commentTextView.setCommentGoodList(comment.commentGoodsList);
                commentTextView.setHighLightColorId(R.color.wm_common_text_highlight);
                commentTextView.a();
                a(commentTextView, comment);
            }
            commentTextView.setOnSpanTextListener(new CommentTextView.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.CommentTextView.b
                public final void a(View view, CommentGood commentGood) {
                    Object[] objArr2 = {view, commentGood};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d846e5351751f30b97648f66ba0dcca5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d846e5351751f30b97648f66ba0dcca5");
                        return;
                    }
                    if (commentGood != null && commentGood.getSchemeUrl() != null) {
                        com.sankuai.waimai.foundation.router.a.a(a.this.b, commentGood.getSchemeUrl(), a.a(a.this));
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_7m0vF").a("comment_id", comment.id).a("spu_id", commentGood != null ? commentGood.spuId : 0L).a("poi_id", a.this.d).a(KernelConfig.KEY_CONTAINER_TYPE, a.this.e);
                    a2.b = AppUtil.generatePageInfoKey(a.this.b);
                    a2.a("c_CijEL").a();
                }
            });
        }
        if (com.sankuai.waimai.foundation.utils.b.b(comment.commentPics) && comment.commentVideo == null) {
            commentImageGallery.setVisibility(8);
        } else {
            commentImageGallery.setVisibility(0);
            commentImageGallery.setPadding(com.sankuai.waimai.foundation.utils.g.a(this.b, 4.0f));
            commentImageGallery.setImageCornerRadius(com.sankuai.waimai.foundation.utils.g.a(this.b, 6.0f));
            commentImageGallery.setImageClickListener(this.l);
            commentImageGallery.setPictures(comment);
        }
        linearLayout2.removeAllViews();
        if (comment.addCommentList == null || comment.addCommentList.isEmpty()) {
            return;
        }
        for (Comment.a aVar : comment.addCommentList) {
            if (!TextUtils.isEmpty(aVar.d)) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = linearLayout2;
                objArr2[c] = aVar;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00d915dd7703a3dc6fb2b5686a9c23de", RobustBitConfig.DEFAULT_VALUE)) {
                    inflate = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00d915dd7703a3dc6fb2b5686a9c23de");
                } else {
                    if (aVar.b == 2) {
                        inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_comment_poi_reply, (ViewGroup) linearLayout2, false);
                        if (!TextUtils.isEmpty(aVar.c)) {
                            string = aVar.c;
                        } else {
                            string = this.b.getString(R.string.wm_comment_poi_reply);
                        }
                    } else {
                        inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_comment_add_item, (ViewGroup) linearLayout2, false);
                        if (!TextUtils.isEmpty(aVar.c)) {
                            string = aVar.c;
                        } else {
                            string = this.b.getString(R.string.wm_comment_add_comment);
                        }
                    }
                    TextView textView3 = (TextView) inflate.findViewById(R.id.sub_item_title);
                    TextView textView4 = (TextView) inflate.findViewById(R.id.sub_item_content);
                    textView3.setText(string);
                    textView4.setText(aVar.d);
                    if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                        textView3.setTextSize(26.0f);
                        textView4.setTextSize(26.0f);
                        linearLayout2.addView(inflate);
                        c = 1;
                    }
                }
                linearLayout2.addView(inflate);
                c = 1;
            }
        }
    }

    private void c(b bVar, final Comment comment) {
        Object[] objArr = {bVar, comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2131d248a7f7942bcd16f6cc2b850f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2131d248a7f7942bcd16f6cc2b850f4f");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) bVar.a(R.id.wm_comment_recommend_food_and_useful_container);
        LinearLayout linearLayout = (LinearLayout) bVar.a(R.id.wm_comment_recommend_food_container);
        TextView textView = (TextView) bVar.a(R.id.wm_comment_recommend_food_text);
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P() || comment.praiseFoodList == null || comment.praiseFoodList.isEmpty()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23fa2c6243f135dc02ab27b463088786", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23fa2c6243f135dc02ab27b463088786");
                        return;
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_uv2o9n9d_mc");
                    a2.b = AppUtil.generatePageInfoKey(a.this.b);
                    a2.a("c_CijEL").a("comment_id", comment.id).a("poi_id", a.this.c.f()).a();
                    if (a.this.g != null) {
                        a.this.g.a(a.this.d, comment);
                    }
                }
            });
            StringBuilder sb = new StringBuilder();
            for (Comment.d dVar : comment.praiseFoodList) {
                sb.append(dVar.b);
                sb.append("、");
            }
            textView.setText(sb.deleteCharAt(sb.length() - 1).toString());
        }
        FrameLayout frameLayout = (FrameLayout) bVar.a(R.id.wm_comment_useful_container);
        frameLayout.removeAllViews();
        FrameLayout frameLayout2 = (FrameLayout) bVar.a(R.id.wm_comment_useful_container_in_e_top);
        frameLayout2.removeAllViews();
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
            frameLayout.setVisibility(8);
            frameLayout2.setVisibility(8);
        } else {
            FrameLayout frameLayout3 = comment.eTop ? frameLayout2 : frameLayout;
            frameLayout3.setVisibility(0);
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_comment_useful, (ViewGroup) frameLayout3, true);
            final TextView textView2 = (TextView) inflate.findViewById(R.id.wm_comment_useful_text);
            final ImageView imageView = (ImageView) inflate.findViewById(R.id.wm_comment_useful_image);
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.wm_comment_useful_lottie_image);
            a(textView2, imageView, comment);
            ((ViewGroup) frameLayout3.getParent()).setClipChildren(false);
            frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = 0;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4306cad84964f9cc2f83637bf8ab5abe", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4306cad84964f9cc2f83637bf8ab5abe");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (comment.commentGoodsList != null && comment.commentGoodsList.size() > 0) {
                        Iterator<CommentGood> it = comment.commentGoodsList.iterator();
                        while (it.hasNext()) {
                            sb2.append(it.next().spuId);
                            if (i < comment.commentGoodsList.size() - 1) {
                                sb2.append(CommonConstant.Symbol.COMMA);
                            }
                            i++;
                        }
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_apdjey09_mc");
                    a2.b = AppUtil.generatePageInfoKey(a.this.b);
                    a2.a("c_CijEL").a("comment_id", comment.id).a("spu_id", sb2.toString()).a();
                    com.sankuai.waimai.platform.domain.manager.user.a.a(a.this.b, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.7.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49913c697f8179abf616175b13c8c238", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49913c697f8179abf616175b13c8c238");
                                return;
                            }
                            final a aVar = a.this;
                            Comment comment2 = comment;
                            int i2 = comment.isCurrentUserUseful ? 2 : 1;
                            long a3 = com.sankuai.waimai.platform.domain.core.poi.b.a(a.this.c.f());
                            String f = a.this.c.f();
                            Object[] objArr4 = {comment2, Integer.valueOf(i2), new Long(a3), f};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "d1b949ca4e4de1c026980d372f605f68", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "d1b949ca4e4de1c026980d372f605f68");
                            } else {
                                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((ShopApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ShopApiService.class)).doCommentSupport(comment2.id, i2, a3, f), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.9
                                    @Override // rx.e
                                    public final void onError(Throwable th) {
                                    }

                                    @Override // rx.e
                                    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                                    }
                                }, aVar.f);
                            }
                            comment.isCurrentUserUseful = !comment.isCurrentUserUseful;
                            comment.usefulCount += comment.isCurrentUserUseful ? 1 : -1;
                            imageView.setVisibility(comment.isCurrentUserUseful ? 8 : 0);
                            lottieAnimationView.setVisibility(comment.isCurrentUserUseful ? 0 : 8);
                            a.this.a(textView2, imageView, comment);
                            if (comment.isCurrentUserUseful) {
                                final a aVar2 = a.this;
                                Context context = a.this.b;
                                final LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                                final ImageView imageView2 = imageView;
                                Object[] objArr5 = {context, lottieAnimationView2, imageView2, "wm_comment_useful_animation.json"};
                                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "eb9f556e60799c86e11483f67c84f059", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "eb9f556e60799c86e11483f67c84f059");
                                    return;
                                }
                                lottieAnimationView2.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.10
                                    public static ChangeQuickRedirect a;

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationRepeat(Animator animator) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        Object[] objArr6 = {animator};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7157ee3776c8d45a720c99d8f605a78d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7157ee3776c8d45a720c99d8f605a78d");
                                            return;
                                        }
                                        lottieAnimationView2.setVisibility(8);
                                        lottieAnimationView2.setProgress(0.0f);
                                        imageView2.setVisibility(0);
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationCancel(Animator animator) {
                                        Object[] objArr6 = {animator};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8f57493588cfdd9309f17c36edaeb998", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8f57493588cfdd9309f17c36edaeb998");
                                            return;
                                        }
                                        imageView2.setVisibility(0);
                                        lottieAnimationView2.setVisibility(8);
                                    }
                                });
                                if (aVar2.i.containsKey("wm_comment_useful_animation.json") && aVar2.i.get("wm_comment_useful_animation.json") != null) {
                                    lottieAnimationView2.setComposition(aVar2.i.get("wm_comment_useful_animation.json"));
                                    lottieAnimationView2.a();
                                    return;
                                }
                                a.b.a(context, "wm_comment_useful_animation.json", new l() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.airbnb.lottie.l
                                    public final void a(@Nullable e eVar) {
                                        Object[] objArr6 = {eVar};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "40aa61e402fdc8d04a3fd5147a5b4ea8", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "40aa61e402fdc8d04a3fd5147a5b4ea8");
                                        } else if (eVar != null) {
                                            a.this.i.put(r2, eVar);
                                            lottieAnimationView2.setComposition(eVar);
                                            lottieAnimationView2.a();
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            });
        }
        FrameLayout frameLayout4 = (FrameLayout) bVar.a(R.id.wm_comment_etop_and_useful_container);
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P() || !comment.eTop) {
            frameLayout4.setVisibility(8);
        } else {
            frameLayout4.setVisibility(0);
            if (linearLayout.getVisibility() == 8) {
                viewGroup.setVisibility(8);
            }
        }
        WMUATRestaurantContext.a aVar = new WMUATRestaurantContext.a();
        aVar.a = comment.id + CommonConstant.Symbol.UNDERLINE + comment.userName;
        aVar.b = (float) comment.score;
        com.sankuai.waimai.ai.uat.b.a().a("COMMENT_DETAIL_EXPOSE_KEY", aVar);
    }

    void a(TextView textView, ImageView imageView, Comment comment) {
        String str;
        Object[] objArr = {textView, imageView, comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4076a11c9c8d51cd61bba0a8248252f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4076a11c9c8d51cd61bba0a8248252f2");
            return;
        }
        if (comment.usefulCount <= 0) {
            str = "有用";
        } else if (comment.usefulCount > 999) {
            str = "有用 999+";
        } else {
            str = "有用 " + comment.usefulCount;
        }
        textView.setText(str);
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
            textView.setTextSize(18.0f);
        }
        if (comment.isCurrentUserUseful) {
            textView.setTextColor(ColorUtils.a("#FF8000").intValue());
            imageView.setImageResource(R.drawable.wm_comment_useful_icon);
            return;
        }
        textView.setTextColor(ColorUtils.a("#575859").intValue());
        imageView.setImageResource(R.drawable.wm_comment_not_useful_icon);
    }

    private void a(CommentTextView commentTextView, Comment comment) {
        int i = 0;
        Object[] objArr = {commentTextView, comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d13b826da2be1af99176c9ff4c84e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d13b826da2be1af99176c9ff4c84e1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<CommentGood> it = comment.commentGoodsList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().spuId);
            if (i < comment.commentGoodsList.size() - 1) {
                sb.append(CommonConstant.Symbol.COMMA);
            }
            i++;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.e));
        hashMap.put("comment_id", Long.valueOf(comment.id));
        hashMap.put("spu_id", sb.toString());
        hashMap.put("poi_id", this.d);
        com.sankuai.waimai.log.judas.d dVar = this.k;
        dVar.a("b_nm4In", comment.id + CommonConstant.Symbol.UNDERLINE + commentTextView.getId(), hashMap);
    }

    private void a(Context context, long j, long j2) {
        Object[] objArr = {context, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca67430f69a290bb66153d7cde939987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca67430f69a290bb66153d7cde939987");
            return;
        }
        try {
            Uri.Builder appendEncodedPath = com.meituan.android.base.util.d.a().appendEncodedPath("userreview");
            appendEncodedPath.appendQueryParameter("uid", String.valueOf(j));
            appendEncodedPath.appendQueryParameter("type", "takeout");
            appendEncodedPath.appendQueryParameter("wm_comment_id", String.valueOf(j2));
            Intent intent = new Intent("android.intent.action.VIEW", appendEncodedPath.build());
            intent.addCategory("android.intent.category.DEFAULT");
            context.startActivity(intent);
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(th);
        }
    }
}
