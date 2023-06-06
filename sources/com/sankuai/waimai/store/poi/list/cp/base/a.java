package com.sankuai.waimai.store.poi.list.cp.base;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.push.HmsMessageService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.Porcelain;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends ConstraintLayout {
    public static ChangeQuickRedirect h;
    protected final int A;
    protected final int B;
    protected final int C;
    private final String D;
    private Drawable E;
    private ArgbEvaluator F;
    private int G;
    private int H;
    private final String g;
    protected Context i;
    protected View j;
    protected TextView k;
    protected ImageView l;
    protected TextView m;
    protected UniversalImageView n;
    protected UniversalImageView o;
    protected View p;
    protected TextView q;
    protected ImageView r;
    protected View s;
    protected TextView t;
    protected UniversalImageView u;
    protected View v;
    protected ConstraintLayout w;
    protected ConstraintLayout x;
    protected FrameLayout y;
    protected com.sankuai.waimai.store.param.a z;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a667e9ade1f3af3dfcdcd64c2f331b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a667e9ade1f3af3dfcdcd64c2f331b2");
            return;
        }
        this.A = 1;
        this.B = 2;
        this.C = 3;
        this.g = "b_q0ok5ycv";
        this.D = "b_g0yurmn7";
        this.F = new ArgbEvaluator();
        this.G = -14539738;
        this.H = -46554;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428eee1f86661a41b77e90fe5aa73d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428eee1f86661a41b77e90fe5aa73d08");
            return;
        }
        this.i = context;
        this.j = inflate(context, R.layout.wm_cp_banner_custom_item, this);
        this.n = (UniversalImageView) findViewById(R.id.iv_item_pic_left);
        this.o = (UniversalImageView) findViewById(R.id.iv_item_pic_right);
        this.m = (TextView) findViewById(R.id.tv_custom_sub_title);
        this.k = (TextView) findViewById(R.id.tv_custom_title);
        this.l = (ImageView) findViewById(R.id.iv_custom_title);
        this.p = findViewById(R.id.ll_look_container);
        this.q = (TextView) findViewById(R.id.tv_to_look);
        this.r = (ImageView) findViewById(R.id.iv_right_arrow);
        this.s = findViewById(R.id.cl_label_container);
        this.t = (TextView) findViewById(R.id.tv_sku1_label);
        this.u = (UniversalImageView) findViewById(R.id.iv_wenli_bg);
        this.v = findViewById(R.id.iv_top_bg);
        this.w = (ConstraintLayout) findViewById(R.id.cl_porcelain_container);
        this.x = (ConstraintLayout) findViewById(R.id.ll_pic_container);
        this.y = (FrameLayout) findViewById(R.id.fl_wenli_container);
        setClipViewCornerRadius(this.y);
    }

    public void setClipViewCornerRadius(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe58ce03e12fb6be021f8e24fe6cd6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe58ce03e12fb6be021f8e24fe6cd6f");
        } else if (view == null) {
        } else {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.sankuai.waimai.store.poi.list.cp.base.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    Object[] objArr2 = {view2, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2b55e4b29db9d52ad154ed7abf1429f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2b55e4b29db9d52ad154ed7abf1429f");
                    } else {
                        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), h.a(a.this.i, 7.0f));
                    }
                }
            });
            view.setClipToOutline(true);
        }
    }

    public void a(final Porcelain porcelain, final int i, final int i2, PoiVerticalityDataResponse poiVerticalityDataResponse, int i3, Map<String, Object> map) {
        Object[] objArr = {porcelain, Integer.valueOf(i), Integer.valueOf(i2), poiVerticalityDataResponse, Integer.valueOf(i3), map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f11df43191838daecdfb508793b9623c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f11df43191838daecdfb508793b9623c");
        } else if (porcelain == null) {
        } else {
            if (!TextUtils.isEmpty(porcelain.titleIcon)) {
                b.C0608b b = m.b(porcelain.titleIcon, ImageQualityUtil.a());
                b.e = 0;
                b.a(this.l);
            } else if (!TextUtils.isEmpty(porcelain.title)) {
                this.k.setText(porcelain.title);
                this.k.setIncludeFontPadding(false);
                this.k.setTextColor(this.G);
            }
            if (!TextUtils.isEmpty(porcelain.subTitle)) {
                this.m.setText(porcelain.subTitle);
                this.m.setTextColor(this.H);
            }
            this.s.setVisibility(8);
            if (porcelain.skus != null && porcelain.skus.size() > 0 && 1 == porcelain.blockType && porcelain.skus.get(0) != null && porcelain.skus.get(0).labelInfo != null && !TextUtils.isEmpty(porcelain.skus.get(0).labelInfo.frontText)) {
                this.s.setVisibility(0);
                this.t.setText(porcelain.skus.get(0).labelInfo.frontText);
            }
            if (porcelain.skus != null && porcelain.skus.size() > 0) {
                b.C0608b a = m.a(porcelain.skus.get(0).picture);
                a.j = R.drawable.waimai_c_pagekit_banner_error_default;
                a.a((ImageView) this.o);
            }
            try {
                if (porcelain.skus != null && porcelain.skus.size() >= 2 && porcelain.skus.get(1) != null && !t.a(porcelain.skus.get(1).picture)) {
                    this.n.setVisibility(0);
                    this.p.setVisibility(8);
                    b.C0608b a2 = m.a(porcelain.skus.get(1).picture);
                    a2.j = R.drawable.waimai_c_pagekit_banner_error_default;
                    a2.a((ImageView) this.n);
                } else {
                    this.n.setVisibility(8);
                    this.p.setVisibility(0);
                    Object[] objArr2 = {poiVerticalityDataResponse, porcelain, map};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b5d8061b64bb916214db57a13668263", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b5d8061b64bb916214db57a13668263");
                    } else {
                        String str = "";
                        String str2 = "";
                        String str3 = "";
                        if (poiVerticalityDataResponse != null && map != null) {
                            str = (String) map.get("moreText");
                            str2 = (String) map.get(this.z.aX ? "proMoreTextColor" : "moreTextColor");
                            str3 = (String) map.get(this.z.aX ? "proMoreBackColor" : "moreBackColor");
                        }
                        int a3 = d.a(str2, -15810276);
                        int a4 = d.a(str2, 1712242972);
                        int a5 = d.a(str3, -1572887);
                        TextView textView = this.q;
                        if (t.a(str)) {
                            str = this.i.getString(R.string.wm_sg_to_look_default);
                        }
                        textView.setText(str);
                        this.q.setTextColor(a3);
                        GradientDrawable gradientDrawable = (GradientDrawable) this.p.getBackground();
                        gradientDrawable.setColor(a5);
                        gradientDrawable.setStroke(h.a(this.i, 0.5f), a4);
                        this.p.setBackground(gradientDrawable);
                        if (this.E == null) {
                            this.E = e.a(ContextCompat.getDrawable(this.i, R.drawable.sg_small_right_arrow), a3);
                        } else {
                            DrawableCompat.setTintList(this.E, ColorStateList.valueOf(a3));
                        }
                        this.r.setImageDrawable(this.E);
                    }
                }
                Object[] objArr3 = {poiVerticalityDataResponse, porcelain, Integer.valueOf(i3), map};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e064a17a702f047bc7f471ff66225a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e064a17a702f047bc7f471ff66225a4");
                } else if (poiVerticalityDataResponse != null && porcelain != null) {
                    String str4 = "";
                    PoiVerticalityDataResponse.Promotion backgroundPromotion = poiVerticalityDataResponse.getBackgroundPromotion();
                    if (backgroundPromotion != null && com.sankuai.shangou.stone.util.a.c(backgroundPromotion.bannerBackgroundPicList) > i3 && backgroundPromotion.bannerBackgroundPicList.get(i3) != null) {
                        str4 = backgroundPromotion.bannerBackgroundPicList.get(i3).backgroundColor;
                    }
                    String str5 = "";
                    if (map != null) {
                        str5 = (String) map.get("backColor");
                        String str6 = (String) map.get(this.z.aX ? "promotionWenliUrl" : "wenliUrl");
                        if (!t.a(str6)) {
                            m.a(str6, ImageQualityUtil.a()).a((ImageView) this.u);
                        }
                    }
                    int[] iArr = new int[2];
                    if (!t.a(str4)) {
                        str5 = str4;
                    }
                    iArr[0] = d.a(str5, -1);
                    iArr[1] = -1;
                    float a6 = h.a(getContext(), 7.0f);
                    this.v.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, iArr).a(a6, a6, 0.0f, 0.0f).a());
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.cp.base.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "88cb6d71d1b87f8b1088dd9fce3e0df1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "88cb6d71d1b87f8b1088dd9fce3e0df1");
                    } else if (TextUtils.isEmpty(porcelain.h5Url)) {
                    } else {
                        com.sankuai.waimai.store.router.d.a(a.this.i, porcelain.h5Url);
                        a.this.a(a.this.i, porcelain, i, i2);
                    }
                }
            });
        }
    }

    public void a(Porcelain porcelain, boolean z) {
        Object[] objArr = {porcelain, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb57df37661ddd1b9ccc9ab72f87a69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb57df37661ddd1b9ccc9ab72f87a69e");
        } else {
            this.u.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public final void a(int i, int i2, ArrayList<String> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), arrayList};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55582348df6161adb271702da6b0ce62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55582348df6161adb271702da6b0ce62");
            return;
        }
        final String str = arrayList.get(i);
        final String str2 = arrayList.get(i2);
        if (t.a(str) || t.a(str2)) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.poi.list.cp.base.a.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e9c67397a1e00204605e23e8509336e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e9c67397a1e00204605e23e8509336e");
                    return;
                }
                try {
                    int intValue = ((Integer) a.this.F.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(ColorUtils.a(str, 0)), Integer.valueOf(ColorUtils.a(str2, 0)))).intValue();
                    Drawable background = a.this.v.getBackground();
                    int[] iArr = {intValue, -1};
                    if (background == null) {
                        float a2 = h.a(a.this.getContext(), 7.0f);
                        a.this.v.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, iArr).a(a2, a2, 0.0f, 0.0f).a());
                        return;
                    }
                    ((GradientDrawable) background).setColors(iArr);
                } catch (Exception e) {
                    Log.e("CustomBaseItemView", e.getMessage());
                }
            }
        });
        ofFloat.start();
    }

    public final void a(Context context, Porcelain porcelain, int i, int i2) {
        Object[] objArr = {context, porcelain, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262a34cbf3a13306f1ee268c2e8c1d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262a34cbf3a13306f1ee268c2e8c1d7c");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(context, "b_q0ok5ycv").b(a(porcelain, i, i2)).a();
        }
    }

    public final void b(Context context, Porcelain porcelain, int i, int i2) {
        Object[] objArr = {context, porcelain, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c30ec366d107c719ff6f15f511005ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c30ec366d107c719ff6f15f511005ee");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(context, "b_g0yurmn7").b(a(porcelain, i, i2)).a();
        }
    }

    private Map<String, Object> a(Porcelain porcelain, int i, int i2) {
        Object[] objArr = {porcelain, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7133f63991464dd668a1491bf89519e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7133f63991464dd668a1491bf89519e");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("layout_type", porcelain.blockType > 0 ? Integer.valueOf(porcelain.blockType) : "-999");
        hashMap.put("cat_id", Long.valueOf(this.z.c));
        hashMap.put("stid", this.z.T);
        hashMap.put("activity_id", porcelain.activityId);
        hashMap.put("index", Integer.valueOf(i % i2));
        hashMap.put("subject_area", "-999");
        hashMap.put(HmsMessageService.SUBJECT_ID, porcelain.blockId);
        hashMap.put("target_type", "0");
        return hashMap;
    }
}
