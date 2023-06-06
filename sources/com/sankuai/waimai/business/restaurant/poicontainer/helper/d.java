package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.repository.model.FullReduceEntrance;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.poicontainer.base.repository.model.FullReduceAnim;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d implements OrderGoodObserver {
    public static ChangeQuickRedirect a;
    public Activity b;
    public View c;
    ImageView d;
    TextView e;
    public String f;
    LinearLayout g;
    ImageView h;
    boolean i;
    Boolean j;
    private TextView k;
    private TextView l;
    private boolean m;
    private ab n;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g o;
    private final String p;
    private String q;
    private TextView r;
    private int s;
    private boolean t;
    private Bitmap u;
    private long v;
    private long w;
    private boolean x;
    private FullReduceEntrance y;

    public abstract void b();

    public static /* synthetic */ Bitmap a(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e15e8adbd93809603a4354f106933f21", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e15e8adbd93809603a4354f106933f21");
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap.getHeight() != i) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i, i, false);
            if (createBitmap != bitmap) {
                createBitmap.recycle();
            }
            createBitmap = createScaledBitmap;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || config != Bitmap.Config.ARGB_8888) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i + 0, config);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = i / 2.0f;
        canvas.drawCircle(f, f - 0, f, paint);
        createBitmap.recycle();
        return createBitmap2;
    }

    public static /* synthetic */ void a(d dVar, Bitmap bitmap, String str) {
        Object[] objArr = {bitmap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "a354f94150cb6c2eae75c8c563ec6f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "a354f94150cb6c2eae75c8c563ec6f31");
            return;
        }
        dVar.h.setImageBitmap(bitmap);
        if (dVar.j.booleanValue()) {
            dVar.h.setVisibility(8);
        } else {
            dVar.h.setVisibility(0);
        }
        dVar.r.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            dVar.r.setText(R.string.wm_restaurant_money_off_assistant_done);
        } else {
            dVar.r.setText(str);
        }
        dVar.e.setVisibility(8);
        dVar.g.setVisibility(0);
        dVar.a(dVar.e, dVar.g, dVar.g, 300L);
        dVar.a(dVar.d, 300L, (Animator.AnimatorListener) null, 1.0f, 0.0f);
        dVar.a(dVar.h, 300L, (Animator.AnimatorListener) null, 0.0f, 1.0f);
    }

    public static /* synthetic */ void a(d dVar, FullReduceEntrance fullReduceEntrance, String str) {
        Object[] objArr = {fullReduceEntrance, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "100b710b2ef644730988b6a3e52b368e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "100b710b2ef644730988b6a3e52b368e");
            return;
        }
        dVar.m = fullReduceEntrance.showFullReduceEntrance;
        dVar.c.setVisibility(dVar.m ? 0 : 8);
        dVar.g.setVisibility(8);
        String str2 = fullReduceEntrance.fullReduceText;
        String str3 = fullReduceEntrance.assistantMsgLong;
        if (TextUtils.isEmpty(str2)) {
            dVar.e.setText(R.string.wm_restaurant_money_off_assistant_set);
        } else {
            dVar.e.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            dVar.k.setText(R.string.wm_restaurant_money_off_assistant_slogan_1);
        } else {
            dVar.k.setText(str3);
        }
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.c = fullReduceEntrance.fullReduceIcon;
        c.e = 1;
        c.i = R.drawable.waimai_c_icon_sr_top;
        c.j = R.drawable.waimai_c_icon_sr_top;
        c.a(dVar.d);
        String c2 = dVar.c();
        String str4 = fullReduceEntrance.traceId;
        Object[] objArr2 = {c2, str4, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "244f69526460b866ab14011e8aa16560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "244f69526460b866ab14011e8aa16560");
            return;
        }
        if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) dVar.b, "money_off_assistant_first_show", true)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "e0848a0b547967801fc14624bae0b7a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "e0848a0b547967801fc14624bae0b7a1");
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                dVar.k.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = dVar.k.getMeasuredWidth();
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                dVar.e.measure(makeMeasureSpec2, makeMeasureSpec2);
                int measuredWidth2 = dVar.e.getMeasuredWidth();
                dVar.e.getLayoutParams().width = 0;
                dVar.e.requestLayout();
                ValueAnimator ofInt = ValueAnimator.ofInt(measuredWidth, 0);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, measuredWidth2);
                ofInt.setDuration(500L);
                ofInt.setStartDelay(PayTask.j);
                ofInt.addUpdateListener(new a(dVar.k));
                ofInt2.setDuration(300L);
                ofInt2.setStartDelay(3500L);
                ofInt2.addUpdateListener(new a(dVar.e));
                animatorSet.playTogether(ofInt, ofInt2);
                animatorSet.start();
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.3
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr4 = {animator};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "42b68b3308a76c3735d162fa1daa33a9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "42b68b3308a76c3735d162fa1daa33a9");
                        } else {
                            d.a(d.this, true);
                        }
                    }
                });
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) dVar.b, "money_off_assistant_first_show", false);
        } else {
            dVar.x = true;
            dVar.k.setVisibility(8);
        }
        if (dVar.m) {
            JudasManualManager.a a2 = JudasManualManager.b("b_mz1laa05").a("c_CijEL");
            a2.b = AppUtil.generatePageInfoKey(dVar.b);
            a2.a("poi_id", str).a("btn_title", c2).a("mj_traceId", str4).a();
        }
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.x = true;
        return true;
    }

    public static /* synthetic */ void b(d dVar, final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "7a9ca01f1506f5580d262b46647dc06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "7a9ca01f1506f5580d262b46647dc06b");
            return;
        }
        dVar.v = System.currentTimeMillis();
        if (Math.abs(dVar.w - dVar.v) <= 500) {
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0fbf56c1ee52acbc14b318f442f3503", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0fbf56c1ee52acbc14b318f442f3503");
                    } else {
                        d.this.a(str, str2);
                    }
                }
            }, 300L);
        } else {
            dVar.a(str, str2);
        }
    }

    public static /* synthetic */ boolean b(d dVar, boolean z) {
        dVar.i = true;
        return true;
    }

    public d(@NonNull Activity activity, ab abVar, String str, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, View view) {
        Object[] objArr = {activity, abVar, str, gVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aab40cfa7f3fbf112cb01af3e950fd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aab40cfa7f3fbf112cb01af3e950fd8");
            return;
        }
        this.p = "money_off_assistant_first_show";
        this.q = "";
        this.s = 0;
        this.i = false;
        this.t = true;
        this.u = null;
        this.v = 0L;
        this.w = 0L;
        this.x = false;
        this.j = Boolean.valueOf(com.sankuai.waimai.business.restaurant.poicontainer.b.P());
        this.b = activity;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18175a1f8a96de28a8182c960690ac8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18175a1f8a96de28a8182c960690ac8f");
        } else if (view != null) {
            this.c = view.findViewById(R.id.restaurant_full_reduce_entrance_layout);
            this.d = (ImageView) view.findViewById(R.id.restaurant_full_reduce_entrance_icon);
            this.e = (TextView) view.findViewById(R.id.restaurant_full_reduce_entrance_text);
            this.k = (TextView) view.findViewById(R.id.tv_assistant_entrance_txt_first_show);
            this.l = (TextView) view.findViewById(R.id.restaurant_full_reduce_arrow);
            this.g = (LinearLayout) view.findViewById(R.id.restaurant_full_reduce_finish_container);
            this.r = (TextView) view.findViewById(R.id.restaurant_full_reduce_finish_text);
            this.h = (ImageView) view.findViewById(R.id.restaurant_full_reduce_anim_icon);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3ae8a8a21c003f0a22ea94ec1fcbe490", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3ae8a8a21c003f0a22ea94ec1fcbe490");
                        return;
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_kxben8lf").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(d.this.b);
                    a2.a("poi_id", d.this.q).a("btn_title", d.this.c()).a("brand_id", d.this.o.A()).a("mj_traceId", d.this.y != null ? d.this.y.traceId : "").a();
                    d.this.b();
                    d dVar = d.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "05734374c8d92da26c5df9d3657002fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "05734374c8d92da26c5df9d3657002fa");
                        return;
                    }
                    dVar.i = false;
                    dVar.g.setVisibility(8);
                    if (dVar.j.booleanValue()) {
                        dVar.d.setVisibility(8);
                    } else {
                        dVar.d.setVisibility(0);
                    }
                    dVar.h.setImageResource(R.drawable.waimai_c_icon_sr_top);
                    dVar.e.setVisibility(0);
                }
            });
            if (this.j.booleanValue()) {
                this.e.setTextSize(24.0f);
                this.e.setTypeface(Typeface.DEFAULT_BOLD);
                this.k.setTextSize(24.0f);
                this.k.setTypeface(Typeface.DEFAULT_BOLD);
                this.r.setTextSize(24.0f);
                this.r.setTypeface(Typeface.DEFAULT_BOLD);
                this.l.setVisibility(8);
                int a2 = com.sankuai.waimai.foundation.utils.g.a(this.b.getApplicationContext(), 17.0f);
                int a3 = com.sankuai.waimai.foundation.utils.g.a(this.b.getApplicationContext(), 8.0f);
                this.e.setPadding(a2, a3, a2, a3);
                this.e.setTextColor(-16777216);
                this.k.setPadding(a2, a3, a2, a3);
                this.k.setTextColor(-16777216);
                this.r.setTextColor(-16777216);
                this.d.setVisibility(8);
                this.h.setVisibility(8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
                marginLayoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(this.b.getApplicationContext(), 106.0f);
                this.c.setLayoutParams(marginLayoutParams);
            }
        }
        this.f = str;
        this.n = abVar;
        this.o = gVar;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7175d6cd656c3480d21d2c6692e20d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7175d6cd656c3480d21d2c6692e20d5");
        } else if (!this.m || this.c == null) {
        } else {
            this.c.setAlpha(f);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5a971526533019f867cf3130686d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5a971526533019f867cf3130686d1c");
        } else if (!this.m || this.c == null) {
        } else {
            this.c.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        OrderedFood orderedFood;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1bde9c6b99bf6d60000c2b8125b8e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1bde9c6b99bf6d60000c2b8125b8e10");
            return;
        }
        int d = d();
        boolean z = this.s == 0 && d == 1;
        this.s = d;
        if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4bd375cf13a9b4c72a5fbc81b2f8712", RobustBitConfig.DEFAULT_VALUE)) {
                orderedFood = (OrderedFood) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4bd375cf13a9b4c72a5fbc81b2f8712");
            } else {
                com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.q);
                if (n != null && !com.sankuai.waimai.foundation.utils.b.b(n.b) && n.b.size() > 0) {
                    ArrayList arrayList = (ArrayList) n.b.get(0).c;
                    if (!com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                        orderedFood = ((ShopCartItem) arrayList.get(0)).food;
                    }
                }
                orderedFood = null;
            }
            if (orderedFood == null || !this.x) {
                return;
            }
            final String str = this.q;
            final long skuId = orderedFood.getSkuId();
            long spuId = orderedFood.getSpuId();
            Object[] objArr3 = {str, new Long(skuId), new Long(spuId)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "432c6b0be4497e21e91fb0337aee3e34", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "432c6b0be4497e21e91fb0337aee3e34");
            } else {
                com.sankuai.waimai.business.restaurant.base.repository.b.a(this.f).a(str, skuId, spuId, new com.sankuai.waimai.business.restaurant.base.repository.net.b<FullReduceAnim>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2a4f0d59bd66fe0b75efb18582642eeb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2a4f0d59bd66fe0b75efb18582642eeb");
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final /* synthetic */ void a(FullReduceAnim fullReduceAnim) {
                        FullReduceAnim fullReduceAnim2 = fullReduceAnim;
                        Object[] objArr4 = {fullReduceAnim2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4441079788edcdc419d00f28398ee359", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4441079788edcdc419d00f28398ee359");
                        } else if (fullReduceAnim2 != null && fullReduceAnim2.isShowTips && d.this.d() == 1) {
                            d.b(d.this, true);
                            d.b(d.this, fullReduceAnim2.tipsText, fullReduceAnim2.productPicUrl);
                            JudasManualManager.a a2 = JudasManualManager.b("b_ba8iv8w4").a("c_CijEL");
                            a2.b = AppUtil.generatePageInfoKey(d.this.b);
                            a2.a("sku_id", skuId).a("poi_id", str).a("btn_title", fullReduceAnim2.tipsText).a("mj_traceId", fullReduceAnim2.traceId).a();
                        }
                    }
                });
            }
        } else if (this.i) {
            this.i = false;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa1785a620569ca7b0a7950343e4c570", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa1785a620569ca7b0a7950343e4c570");
                return;
            }
            this.w = System.currentTimeMillis();
            if (Math.abs(this.w - this.v) <= 500) {
                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7d2ef7f374191c0bc27e934ff0e52df7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7d2ef7f374191c0bc27e934ff0e52df7");
                        } else {
                            d.this.e();
                        }
                    }
                }, 300L);
            } else {
                e();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect d;
        private View a;

        public a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08b6303f9e041cb1820edac61537fdb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08b6303f9e041cb1820edac61537fdb");
            } else {
                this.a = view;
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26df3b8248dc83fcceb6871e3560b3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26df3b8248dc83fcceb6871e3560b3d");
            } else if (this.a != null) {
                ah.b(this.a, ((Integer) valueAnimator.getAnimatedValue()).intValue(), Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426c44b28c8b34c905b23964af87947e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426c44b28c8b34c905b23964af87947e")).intValue() : com.sankuai.waimai.business.restaurant.base.manager.order.k.a().i(this.q);
    }

    private void a(final View view, long j, Animator.AnimatorListener animatorListener, float... fArr) {
        Object[] objArr = {view, 300L, null, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52223b5ff301e6f988fa9fc3751d19ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52223b5ff301e6f988fa9fc3751d19ef");
        } else if (view != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new a(view) { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.d.a, android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1465484aa10af072efd20ed0d5a8a63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1465484aa10af072efd20ed0d5a8a63");
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    view.setAlpha(floatValue);
                    view.setScaleX(floatValue);
                    view.setScaleY(floatValue);
                }
            });
            ofFloat.start();
        }
    }

    private void a(View view, View view2, View view3, long j) {
        Object[] objArr = {view, view2, view3, 300L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05a0be92870d6c5b3dbaaa226e2f79ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05a0be92870d6c5b3dbaaa226e2f79ac");
        } else if (view == null || view2 == null) {
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(makeMeasureSpec, makeMeasureSpec);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredWidth(), view2.getMeasuredWidth());
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new a(view3));
            ofInt.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8c4e37589f9889afaa155528fd82bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8c4e37589f9889afaa155528fd82bb");
            return;
        }
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.c = str2;
        c.e = 1;
        c.j = R.drawable.waimai_c_wm_res_entrance_default_icon;
        c.a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1f5667af0ae6e5f83558d7cd12a6b23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1f5667af0ae6e5f83558d7cd12a6b23");
                    return;
                }
                d.this.u = d.a(bitmap, com.sankuai.waimai.foundation.utils.g.a(d.this.b, 30.0f), 0);
                d.a(d.this, d.this.u, str);
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc3b981f3d1da4b4b527eb5fc0eb48bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc3b981f3d1da4b4b527eb5fc0eb48bf");
                    return;
                }
                d.this.u = com.sankuai.waimai.launcher.util.image.a.a(d.this.b.getResources(), (int) R.drawable.waimai_c_wm_res_entrance_default_icon);
                d.a(d.this, d.this.u, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78bd60b22395893da7f488613a14350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78bd60b22395893da7f488613a14350");
            return;
        }
        this.e.setVisibility(0);
        a(this.g, this.e, this.g, 300L);
        this.g.setVisibility(4);
        a(this.h, 300L, (Animator.AnimatorListener) null, 1.0f, 0.0f);
        a(this.d, 300L, (Animator.AnimatorListener) null, 0.0f, 1.0f);
        this.i = false;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d674254830f4420585324ad9c7e0dd6d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d674254830f4420585324ad9c7e0dd6d") : this.i ? this.r != null ? this.r.getText().toString() : "" : this.e != null ? this.e.getText().toString() : "";
    }
}
