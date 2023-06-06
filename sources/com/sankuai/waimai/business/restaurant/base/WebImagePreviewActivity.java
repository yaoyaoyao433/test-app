package com.sankuai.waimai.business.restaurant.base;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.l;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.BaseMediaPagerAdapter;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.FullScreenMediaPagerAdapter;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.j;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.lottie.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.CommentGood;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.n;
import com.sankuai.waimai.platform.widget.CommentTextView;
import com.sankuai.waimai.platform.widget.pager.SimplePageIndicator;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import com.sankuai.waimai.ugc.image.ImagePreviewActivity;
import com.sankuai.waimai.ugc.image.PhotoViewPager;
import com.sankuai.waimai.ugc.image.adapter.ImagePreviewAdapter;
import com.sankuai.waimai.ugc.image.adapter.WebImagePreviewAdapter;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebImagePreviewActivity extends ImagePreviewActivity {
    public static ChangeQuickRedirect a;
    private FullScreenMediaPagerAdapter l;
    private List<e> m;
    private int n;
    private g o;
    private com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a<?> p;
    private int q;

    public WebImagePreviewActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28ca8a1fea2a16d24456b4b9646c951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28ca8a1fea2a16d24456b4b9646c951");
        } else {
            this.m = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.ugc.image.ImagePreviewActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8331d980a93e8b9435fddb7220b0cd84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8331d980a93e8b9435fddb7220b0cd84");
            return;
        }
        this.d.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.business.restaurant.base.WebImagePreviewActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12743133d2904a306e378d2165b4d249", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12743133d2904a306e378d2165b4d249");
                    return;
                }
                if (WebImagePreviewActivity.this.n != i) {
                    int i2 = WebImagePreviewActivity.this.n;
                    WebImagePreviewActivity.this.n = i;
                    if (WebImagePreviewActivity.this.l != null) {
                        FullScreenMediaPagerAdapter fullScreenMediaPagerAdapter = WebImagePreviewActivity.this.l;
                        int i3 = WebImagePreviewActivity.this.n;
                        Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = BaseMediaPagerAdapter.a;
                        if (PatchProxy.isSupport(objArr3, fullScreenMediaPagerAdapter, changeQuickRedirect3, false, "6a7d6d77c61d387752f6ee66892a4c61", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fullScreenMediaPagerAdapter, changeQuickRedirect3, false, "6a7d6d77c61d387752f6ee66892a4c61");
                        } else {
                            fullScreenMediaPagerAdapter.a(i2, false);
                            fullScreenMediaPagerAdapter.a(i3, true);
                        }
                        if (WebImagePreviewActivity.this.o != null && WebImagePreviewActivity.this.m != null && WebImagePreviewActivity.this.m.get(i) != null) {
                            if (1 == ((e) WebImagePreviewActivity.this.m.get(i)).b) {
                                if (WebImagePreviewActivity.this.d instanceof PhotoViewPager) {
                                    ((PhotoViewPager) WebImagePreviewActivity.this.d).setIsDisallowInterceptTouchEvent(true);
                                }
                            } else if (WebImagePreviewActivity.this.d instanceof PhotoViewPager) {
                                ((PhotoViewPager) WebImagePreviewActivity.this.d).setIsDisallowInterceptTouchEvent(false);
                            }
                            JudasManualManager.a a2 = JudasManualManager.b("b_u8tgzgro").a("c_u4fk4kw");
                            a2.b = AppUtil.generatePageInfoKey(WebImagePreviewActivity.this);
                            a2.a("poi_id", WebImagePreviewActivity.this.o.f()).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a("index", i).a("source", ((e) WebImagePreviewActivity.this.m.get(i)).b).a();
                        }
                    }
                }
                if (WebImagePreviewActivity.this.p != null) {
                    WebImagePreviewActivity.this.p.a(i + 1);
                }
            }
        });
        this.e.setBackgroundColor(Color.argb((int) TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 0, 0, 0));
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // com.sankuai.waimai.ugc.image.ImagePreviewActivity
    public final boolean a(@NonNull Intent intent) {
        com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a<?> cVar;
        String str;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ef6d20c1c340a230a911a10c96100c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ef6d20c1c340a230a911a10c96100c")).booleanValue();
        }
        int a2 = f.a(intent, "current_img_path", 0);
        long a3 = f.a(intent, "intent_poi_id", -1L);
        String a4 = f.a(intent, "intent_poi_id_str");
        this.o = new g();
        this.o.a(a3, a4);
        boolean a5 = f.a(intent, "intent_media_include_boolean", false);
        this.q = f.a(intent, "from", -1);
        if (a5) {
            ArrayList arrayList = (ArrayList) f.c(intent, "intent_media_infos");
            if (b.b(arrayList)) {
                return false;
            }
            int a6 = f.a(intent, "comment_source", -1);
            this.l = new FullScreenMediaPagerAdapter(this, this.m, this.o, this.q, a2, true, f.a(intent, "lab"), f.a(intent, "theme", -1));
            this.l.e = a6;
            this.d.setAdapter(this.l);
            this.l.a(arrayList);
        } else {
            ArrayList<T> arrayList2 = (ArrayList) f.c(intent, "images");
            if (arrayList2 == 0 || arrayList2.isEmpty()) {
                return false;
            }
            ImagePreviewAdapterImpl imagePreviewAdapterImpl = new ImagePreviewAdapterImpl(this);
            this.d.setAdapter(imagePreviewAdapterImpl);
            Object[] objArr2 = {arrayList2};
            ChangeQuickRedirect changeQuickRedirect2 = ImagePreviewAdapter.c;
            if (PatchProxy.isSupport(objArr2, imagePreviewAdapterImpl, changeQuickRedirect2, false, "1e708b86a9114d0a8f43878ef4779df9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, imagePreviewAdapterImpl, changeQuickRedirect2, false, "1e708b86a9114d0a8f43878ef4779df9");
            } else {
                if (arrayList2 == 0) {
                    imagePreviewAdapterImpl.f.clear();
                } else {
                    imagePreviewAdapterImpl.f = arrayList2;
                }
                imagePreviewAdapterImpl.notifyDataSetChanged();
            }
        }
        this.d.setCurrentItem(a2);
        try {
            Object[] objArr3 = {intent};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03811b5fbd3ebe49de340b09c4fb2540", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03811b5fbd3ebe49de340b09c4fb2540");
            } else {
                int a7 = f.a(intent, "intent_float_layer_type", 0);
                if (a7 == 1 || a7 == 3 || a7 == 2) {
                    com.sankuai.waimai.business.restaurant.base.widget.imagepreview.b bVar = new com.sankuai.waimai.business.restaurant.base.widget.imagepreview.b();
                    Object[] objArr4 = {this, Integer.valueOf(a7)};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.widget.imagepreview.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "ed4feecc223ce74c8dafc65aa296158a", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar = (com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "ed4feecc223ce74c8dafc65aa296158a");
                    } else {
                        if (a7 != 1 && a7 != 2 && a7 != 3) {
                            cVar = null;
                        }
                        cVar = new c(this, a7);
                    }
                    this.p = cVar;
                    ArrayList<e> arrayList3 = (ArrayList) f.c(intent, "intent_media_infos");
                    if (this.p instanceof c) {
                        View a8 = this.p.a(this);
                        this.p.a(this.d.getCurrentItem() + 1);
                        ((c) this.p).A = arrayList3;
                        if (a7 == 1) {
                            final Comment comment = (Comment) n.a().a(Comment.class);
                            if (comment != null) {
                                ((c) this.p).e = this.o;
                                final c cVar2 = (c) this.p;
                                Object[] objArr5 = {comment};
                                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "fa002c3c9edaf13354053f563233f92d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "fa002c3c9edaf13354053f563233f92d");
                                } else {
                                    cVar2.d = new ab(cVar2.b, cVar2.e, com.sankuai.waimai.restaurant.shopcart.config.a.a(1, 66), cVar2.c);
                                    cVar2.d.b((ViewGroup) cVar2.g.findViewById(R.id.layout_shop_cart));
                                    cVar2.d.n();
                                    cVar2.f = new j(cVar2.b, cVar2.c, cVar2.e, cVar2.d, cVar2.g, cVar2.B);
                                    cVar2.f.a(false);
                                    if (!b.b(comment.praiseFoodList)) {
                                        cVar2.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.6
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Object[] objArr6 = {view};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7be4d97deda27c2a749f0c1de3345b29", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7be4d97deda27c2a749f0c1de3345b29");
                                                    return;
                                                }
                                                c.this.f.a(com.sankuai.waimai.platform.domain.core.poi.b.a(c.this.e.f()), c.this.e.f(), comment);
                                                JudasManualManager.a("b_waimai_uv2o9n9d_mc", "c_waimai_x6f4dc3r", AppUtil.generatePageInfoKey(c.this.b)).a();
                                            }
                                        });
                                        JudasManualManager.b("b_waimai_uv2o9n9d_mv", "c_waimai_x6f4dc3r", AppUtil.generatePageInfoKey(cVar2.b)).a();
                                    } else {
                                        cVar2.l.setVisibility(8);
                                    }
                                    cVar2.i.setText("/" + comment.commentPics.size());
                                    if (TextUtils.isEmpty(comment.userName)) {
                                        str = "";
                                    } else {
                                        str = "@" + comment.userName;
                                    }
                                    cVar2.m.setText(str);
                                    cVar2.a(comment);
                                    cVar2.a(cVar2.t, cVar2.r, comment);
                                    cVar2.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.7
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i = 0;
                                            Object[] objArr6 = {view};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f2dfc1080d15a0d63b81af4251f58235", 4611686018427387906L)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f2dfc1080d15a0d63b81af4251f58235");
                                                return;
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            if (comment.commentGoodsList != null && comment.commentGoodsList.size() > 0) {
                                                Iterator<CommentGood> it = comment.commentGoodsList.iterator();
                                                while (it.hasNext()) {
                                                    sb.append(it.next().spuId);
                                                    if (i < comment.commentGoodsList.size() - 1) {
                                                        sb.append(CommonConstant.Symbol.COMMA);
                                                    }
                                                    i++;
                                                }
                                            }
                                            JudasManualManager.a("b_waimai_apdjey09_mc", "c_waimai_x6f4dc3r", AppUtil.generatePageInfoKey(c.this.b)).a("comment_id", comment.id).a("spu_id", sb.toString()).a();
                                            com.sankuai.waimai.platform.domain.manager.user.a.a(c.this.b, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.7.1
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr7 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ad1417dd4e88d0f3d3fe2569f5a8b484", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ad1417dd4e88d0f3d3fe2569f5a8b484");
                                                        return;
                                                    }
                                                    final c cVar3 = c.this;
                                                    Comment comment2 = comment;
                                                    int i2 = comment.isCurrentUserUseful ? 2 : 1;
                                                    long a9 = com.sankuai.waimai.platform.domain.core.poi.b.a(c.this.e.f());
                                                    String f = c.this.e.f();
                                                    Object[] objArr8 = {comment2, Integer.valueOf(i2), new Long(a9), f};
                                                    ChangeQuickRedirect changeQuickRedirect8 = c.a;
                                                    if (PatchProxy.isSupport(objArr8, cVar3, changeQuickRedirect8, false, "840a83759eb89204577608505dbb2012", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, cVar3, changeQuickRedirect8, false, "840a83759eb89204577608505dbb2012");
                                                    } else {
                                                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((ShopApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ShopApiService.class)).doCommentSupport(comment2.id, i2, a9, f), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.11
                                                            @Override // rx.e
                                                            public final void onError(Throwable th) {
                                                            }

                                                            @Override // rx.e
                                                            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                                                            }
                                                        }, cVar3.c);
                                                    }
                                                    comment.isCurrentUserUseful = !comment.isCurrentUserUseful;
                                                    comment.usefulCount += comment.isCurrentUserUseful ? 1 : -1;
                                                    c.this.r.setVisibility(comment.isCurrentUserUseful ? 8 : 0);
                                                    c.this.s.setVisibility(comment.isCurrentUserUseful ? 0 : 8);
                                                    c.this.a(c.this.t, c.this.r, comment);
                                                    if (comment.isCurrentUserUseful) {
                                                        final c cVar4 = c.this;
                                                        Activity activity = c.this.b;
                                                        final LottieAnimationView lottieAnimationView = c.this.s;
                                                        final ImageView imageView = c.this.r;
                                                        Object[] objArr9 = {activity, lottieAnimationView, imageView, "wm_comment_useful_animation.json"};
                                                        ChangeQuickRedirect changeQuickRedirect9 = c.a;
                                                        if (PatchProxy.isSupport(objArr9, cVar4, changeQuickRedirect9, false, "6dc4d0ca96bb1911a82939ae5cae901a", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr9, cVar4, changeQuickRedirect9, false, "6dc4d0ca96bb1911a82939ae5cae901a");
                                                            return;
                                                        }
                                                        lottieAnimationView.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.9
                                                            public static ChangeQuickRedirect a;

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationRepeat(Animator animator) {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationStart(Animator animator) {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationEnd(Animator animator) {
                                                                Object[] objArr10 = {animator};
                                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "6f71246940938f59efd89c3e5495de61", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "6f71246940938f59efd89c3e5495de61");
                                                                    return;
                                                                }
                                                                lottieAnimationView.setVisibility(8);
                                                                lottieAnimationView.setProgress(0.0f);
                                                                imageView.setVisibility(0);
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationCancel(Animator animator) {
                                                                Object[] objArr10 = {animator};
                                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "84f749e12176233980f7f41d922f81fe", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "84f749e12176233980f7f41d922f81fe");
                                                                    return;
                                                                }
                                                                imageView.setVisibility(0);
                                                                lottieAnimationView.setVisibility(8);
                                                            }
                                                        });
                                                        if (cVar4.u.containsKey("wm_comment_useful_animation.json") && cVar4.u.get("wm_comment_useful_animation.json") != null) {
                                                            lottieAnimationView.setComposition(cVar4.u.get("wm_comment_useful_animation.json"));
                                                            lottieAnimationView.a();
                                                            return;
                                                        }
                                                        a.b.a(activity, "wm_comment_useful_animation.json", new l() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.10
                                                            public static ChangeQuickRedirect a;

                                                            @Override // com.airbnb.lottie.l
                                                            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                                                                Object[] objArr10 = {eVar};
                                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "111946547e32f1a6e0f0bba0c4097aa5", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "111946547e32f1a6e0f0bba0c4097aa5");
                                                                } else if (eVar != null) {
                                                                    c.this.u.put(r2, eVar);
                                                                    lottieAnimationView.setComposition(eVar);
                                                                    lottieAnimationView.a();
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            });
                                        }
                                    });
                                    if (!TextUtils.isEmpty(comment.content)) {
                                        cVar2.n.setMovementMethod(ScrollingMovementMethod.getInstance());
                                        cVar2.n.setText(comment.content);
                                        if (!com.sankuai.waimai.foundation.utils.b.b(comment.commentGoodsList)) {
                                            cVar2.n.setCommentGoodList(comment.commentGoodsList);
                                            cVar2.n.setHighLightColorId(R.color.wm_common_text_highlight);
                                            cVar2.n.a();
                                            if (cVar2.e != null) {
                                                JudasManualManager.b("b_pnsocuxs", "c_waimai_x6f4dc3r", AppUtil.generatePageInfoKey(cVar2.b)).a("poi_id", cVar2.e.f()).a();
                                            }
                                        }
                                        cVar2.n.setOnSpanTextListener(new CommentTextView.b() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.8
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.platform.widget.CommentTextView.b
                                            public final void a(View view, CommentGood commentGood) {
                                                Bundle bundle;
                                                Object[] objArr6 = {view, commentGood};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1d0e7062eafd1562dfeb0125203f125b", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1d0e7062eafd1562dfeb0125203f125b");
                                                    return;
                                                }
                                                if (commentGood != null && commentGood.getSchemeUrl() != null) {
                                                    c cVar3 = c.this;
                                                    Object[] objArr7 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                                    if (PatchProxy.isSupport(objArr7, cVar3, changeQuickRedirect7, false, "6986a96a63b6f1f7d9d6f76e1ef66bd6", RobustBitConfig.DEFAULT_VALUE)) {
                                                        bundle = (Bundle) PatchProxy.accessDispatch(objArr7, cVar3, changeQuickRedirect7, false, "6986a96a63b6f1f7d9d6f76e1ef66bd6");
                                                    } else {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putBoolean(FoodDetailNetWorkPreLoader.INTENT_IS_SELFDELIVERY_SHOP, cVar3.e.k);
                                                        bundle2.putInt("intent_business_type", cVar3.e.o);
                                                        bundle2.putInt("intent_traffic_from", cVar3.e.l);
                                                        bundle2.putSerializable(FoodDetailNetWorkPreLoader.INTENT_POI, cVar3.e.g);
                                                        bundle = bundle2;
                                                    }
                                                    com.sankuai.waimai.foundation.router.a.a(c.this.b, commentGood.getSchemeUrl(), bundle);
                                                }
                                                if (c.this.e != null) {
                                                    JudasManualManager.a("b_3u34azkh", "c_waimai_x6f4dc3r", AppUtil.generatePageInfoKey(c.this.b)).a("poi_id", c.this.e.f()).a();
                                                }
                                            }
                                        });
                                    }
                                    if (cVar2.y > 0 && comment.commentPics.get(cVar2.y - 1).isVideo()) {
                                        cVar2.o.setVisibility(0);
                                        cVar2.a(2.0f);
                                    } else {
                                        cVar2.o.setVisibility(8);
                                        cVar2.a(0.0f);
                                    }
                                    cVar2.b(true);
                                }
                            }
                        } else if (com.sankuai.waimai.foundation.utils.b.a(arrayList3)) {
                            final c cVar3 = (c) this.p;
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "d66f0dbbf8fbed32f5895d1769e51248", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "d66f0dbbf8fbed32f5895d1769e51248");
                            } else if (cVar3.v != 1) {
                                if (cVar3.d != null) {
                                    cVar3.d.j();
                                }
                                cVar3.w.setVisibility(8);
                                cVar3.n.setVisibility(8);
                                cVar3.x.setVisibility(8);
                                cVar3.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.3
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr7 = {view};
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "66223d6dcfadbfd07512ce2dfa1b9dab", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "66223d6dcfadbfd07512ce2dfa1b9dab");
                                        } else {
                                            c.this.b.onBackPressed();
                                        }
                                    }
                                });
                                if (com.sankuai.waimai.foundation.utils.b.a(cVar3.A)) {
                                    if (cVar3.A.size() == 1) {
                                        cVar3.h.setVisibility(4);
                                    } else {
                                        cVar3.h.setVisibility(0);
                                    }
                                    cVar3.i.setText("/" + cVar3.A.size());
                                }
                                if (cVar3.v == 3) {
                                    com.meituan.roodesign.widgets.iconfont.b.a(cVar3.k, R.string.wm_c_iconfont_jiantou_zuo, R.color.roo_color_white);
                                    cVar3.p.setVisibility(0);
                                } else {
                                    com.meituan.roodesign.widgets.iconfont.b.a(cVar3.k, R.string.wm_c_iconfont_76guanbi, R.color.roo_color_white);
                                    cVar3.p.setVisibility(8);
                                }
                                if (com.sankuai.waimai.foundation.utils.b.a(cVar3.A) && cVar3.y > 0 && cVar3.A.get(cVar3.y - 1).b == 1) {
                                    cVar3.o.setVisibility(0);
                                } else {
                                    cVar3.o.setVisibility(8);
                                }
                                cVar3.b(true);
                            }
                        }
                        this.c.addView(a8);
                    }
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class ImagePreviewAdapterImpl extends WebImagePreviewAdapter {
        public static ChangeQuickRedirect a;

        public ImagePreviewAdapterImpl(Context context) {
            super(context);
            Object[] objArr = {WebImagePreviewActivity.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9985ce2b897bafbfc853a3f0093700", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9985ce2b897bafbfc853a3f0093700");
            }
        }

        @Override // uk.co.senab.photoview.d.f
        public final void a(View view, float f, float f2) {
            Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a727dfd562de563442b82ee8048f8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a727dfd562de563442b82ee8048f8b");
            } else {
                WebImagePreviewActivity.this.finish();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad8a96ea16c1aa37dc4eea6a0f7f4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad8a96ea16c1aa37dc4eea6a0f7f4c9");
            return;
        }
        if (this.q != 7) {
            if (getIntent() != null) {
                try {
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("comment_id", f.a(getIntent(), "comment_id", -1L));
                    hashMap.put("custom", jSONObject);
                    Statistics.setValLab(AppUtil.generatePageInfoKey(this), hashMap);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
            JudasManualManager.a("c_waimai_x6f4dc3r", this);
        }
        if (this.l != null) {
            this.l.a(this.n);
        }
        if (this.p != null) {
            this.p.b();
        }
        super.onResume();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2906df07a9b5d1ca40a5c8c4636c961d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2906df07a9b5d1ca40a5c8c4636c961d");
            return;
        }
        super.onStart();
        if (this.p != null) {
            this.p.a(true);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf78381229a17564952d3018d5564c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf78381229a17564952d3018d5564c8");
            return;
        }
        super.onStop();
        if (this.p != null) {
            this.p.a(false);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ddbafdb229b89056e019438cc10436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ddbafdb229b89056e019438cc10436");
            return;
        }
        super.onPause();
        if (this.l != null) {
            this.l.b(this.n);
        }
    }

    @Override // com.sankuai.waimai.ugc.image.ImagePreviewActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468003c1bf0598c6b6360a7d8f7bf24e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468003c1bf0598c6b6360a7d8f7bf24e");
            return;
        }
        if (this.l != null) {
            this.l.a();
        }
        if (this.p != null) {
            this.p.a();
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee035f33d637d7073684f5d84c51d8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee035f33d637d7073684f5d84c51d8c");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.p != null) {
            this.p.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8d5c5469cca85bfaea1bcabcfb042c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8d5c5469cca85bfaea1bcabcfb042c")).booleanValue();
        }
        Object[] objArr2 = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cb69fc503df89ab08e00f241033e763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cb69fc503df89ab08e00f241033e763");
        } else {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b bVar = new com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b(0);
            bVar.d = i;
            bVar.e = keyEvent;
            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(bVar);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.sankuai.waimai.ugc.image.ImagePreviewActivity
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ad384a63f1be76114c49b424019508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ad384a63f1be76114c49b424019508");
        } else if (this.p instanceof c) {
        } else {
            SimplePageIndicator simplePageIndicator = this.i;
            ViewPager viewPager = this.d;
            Object[] objArr2 = {viewPager};
            ChangeQuickRedirect changeQuickRedirect2 = SimplePageIndicator.a;
            if (PatchProxy.isSupport(objArr2, simplePageIndicator, changeQuickRedirect2, false, "9d574da8b630c809e443e6a55e1cb46c", RobustBitConfig.DEFAULT_VALUE)) {
                ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) PatchProxy.accessDispatch(objArr2, simplePageIndicator, changeQuickRedirect2, false, "9d574da8b630c809e443e6a55e1cb46c");
                return;
            }
            simplePageIndicator.b = viewPager;
            simplePageIndicator.a();
        }
    }
}
