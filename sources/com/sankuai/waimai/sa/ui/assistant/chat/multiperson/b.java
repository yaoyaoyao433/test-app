package com.sankuai.waimai.sa.ui.assistant.chat.multiperson;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.sa.model.Product;
import com.sankuai.waimai.sa.model.l;
import com.sankuai.waimai.sa.ui.assistant.adapter.g;
import com.sankuai.waimai.sa.ui.assistant.chat.i;
import com.sankuai.waimai.sa.ui.assistant.view.MultiPersonMealFooterRelativeLayout;
import com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonDetailDialog;
import com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonStatisticsItemView;
import com.sankuai.waimai.sa.ui.assistant.view.multiperson.RoundCornerImageView;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends g.a {
    public static ChangeQuickRedirect a;
    private TextView A;
    private LinearLayout B;
    private TextView C;
    private TextView D;
    private TextView E;
    private RecyclerView.k F;
    com.sankuai.waimai.sa.ui.assistant.a b;
    public com.sankuai.waimai.sa.model.b c;
    public int d;
    String e;
    private ImageView g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private ViewGroup n;
    private RelativeLayout o;
    private View p;
    private i q;
    private RelativeLayout r;
    private MultiPersonStatisticsItemView s;
    private int t;
    private int u;
    private int v;
    private MultiPersonMealFooterRelativeLayout w;
    private MultiPersonFooterController x;
    private LinearLayout y;
    private ImageView z;

    public b(View view, com.sankuai.waimai.sa.ui.assistant.a aVar, i iVar, String str, MultiPersonStatisticsItemView multiPersonStatisticsItemView, int i) {
        super(view);
        Object[] objArr = {view, aVar, iVar, str, multiPersonStatisticsItemView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a12d031b8104ba3e618da9fbb30c969", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a12d031b8104ba3e618da9fbb30c969");
            return;
        }
        this.F = new RecyclerView.k() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                l lVar;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9db6dda8dc64be503a40cc2e1defea1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9db6dda8dc64be503a40cc2e1defea1");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                switch (i2) {
                    case 0:
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        b.this.t = linearLayoutManager.findLastVisibleItemPosition();
                        b.this.u = linearLayoutManager.findFirstVisibleItemPosition();
                        for (int i3 = b.this.u; i3 <= b.this.t; i3++) {
                            if (ah.b(layoutManager.findViewByPosition(i3).findViewById(R.id.wm_smart_assistant_multi_person_merchant_more)) && b.this.c != null && !d.a(b.this.c.p) && i3 < b.this.c.p.size() && i3 > 0 && (lVar = b.this.c.p.get(i3)) != null && !lVar.B && !d.a(lVar.C)) {
                                JudasManualManager.b("b_solew3lv").a("c_6tg6wz4r").a("result_id", b.this.c.c).a("package_key_sku", lVar.p).a("poi_id", lVar.c).a("layout_type", b.this.c.b).a("index", i3).a();
                                lVar.B = true;
                            }
                        }
                        return;
                    case 1:
                        return;
                    case 2:
                        return;
                    default:
                        return;
                }
            }
        };
        this.b = aVar;
        this.e = str;
        this.q = iVar;
        this.s = multiPersonStatisticsItemView;
        this.v = i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "053388466b7ee2dc08a6ad9ee8c7193b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "053388466b7ee2dc08a6ad9ee8c7193b");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3390abe0bc713930154d46493d06722", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3390abe0bc713930154d46493d06722");
            } else {
                this.g = (ImageView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_icon);
                this.j = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_arrive_distance);
                this.i = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_delivery_time);
                this.k = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_name);
                this.l = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_more);
                this.n = (ViewGroup) this.f.findViewById(R.id.wm_smart_assistant_multi_person_meal_item_product_item);
                this.o = (RelativeLayout) this.f.findViewById(R.id.wm_smart_assistant_muti_persion_container);
                this.h = (ImageView) this.f.findViewById(R.id.recommend_info_icon);
                this.m = (TextView) this.f.findViewById(R.id.recommend_info_reason_text);
                this.p = this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_divider);
                this.r = (RelativeLayout) this.f.findViewById(R.id.chat_item_head_layout);
                if (this.v == 0) {
                    this.w = (MultiPersonMealFooterRelativeLayout) this.f.findViewById(R.id.multi_person_bottom_layout);
                } else {
                    this.y = (LinearLayout) this.f.findViewById(R.id.money_off_info_container);
                    this.z = (ImageView) this.f.findViewById(R.id.money_off_info_icon);
                    this.A = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_on_sale);
                    this.B = (LinearLayout) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_actual_price_container);
                    this.C = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_actual_price);
                    this.D = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_original_price);
                    this.E = (TextView) this.f.findViewById(R.id.wm_smart_assistant_multi_person_merchant_buy_package);
                }
            }
        }
        this.s.c();
        this.s.addOnScrollListener(this.F);
    }

    public void a(final l lVar) {
        int i;
        TypedArray typedArray;
        String str;
        TextView textView;
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc443e97bfeea4f33e067d644ce81ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc443e97bfeea4f33e067d644ce81ac3");
            return;
        }
        a(this.g, lVar.e);
        this.k.setText(lVar.d);
        this.r.setOnClickListener(this);
        this.i.setText(lVar.u);
        this.j.setText(lVar.f);
        if (TextUtils.isEmpty(lVar.u) || TextUtils.isEmpty(lVar.f)) {
            this.p.setVisibility(8);
        } else {
            this.p.setVisibility(0);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        if (TextUtils.isEmpty(lVar.u)) {
            this.i.setVisibility(4);
            layoutParams.addRule(1, R.id.wm_smart_assistant_multi_person_merchant_delivery_time);
        } else {
            this.i.setVisibility(0);
            layoutParams.addRule(1, R.id.wm_smart_assistant_multi_person_merchant_divider);
        }
        this.j.setLayoutParams(layoutParams);
        this.k.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int a2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ecba0bd6923ecc3c8202740b3577d40", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ecba0bd6923ecc3c8202740b3577d40")).booleanValue();
                }
                b.this.k.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!d.a(lVar.C)) {
                    a2 = com.sankuai.waimai.foundation.utils.g.a(b.this.f.getContext(), 150.0f);
                } else {
                    a2 = com.sankuai.waimai.foundation.utils.g.a(b.this.f.getContext(), 90.0f);
                }
                b.this.k.setMaxWidth(((ViewGroup) b.this.k.getParent()).getMeasuredWidth() - a2);
                return true;
            }
        });
        if (!d.a(lVar.C)) {
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        this.l.setOnClickListener(this);
        this.o.setOnClickListener(this);
        if (lVar.r != null && !TextUtils.isEmpty(lVar.r.b)) {
            this.m.setText(lVar.r.b);
        } else {
            this.m.setText(this.f.getContext().getString(R.string.wm_sa_quality_combination_recommendation));
        }
        if (lVar.r != null && !TextUtils.isEmpty(lVar.r.a)) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.itemView.getContext();
            a2.c = lVar.r.a;
            a2.i = R.drawable.wm_smart_assistant_multi_person_vertical_recommend_icon_default;
            a2.j = R.drawable.wm_smart_assistant_multi_person_vertical_recommend_icon_default;
            a2.e = 1;
            a2.a(this.h);
        }
        if (com.sankuai.waimai.foundation.utils.b.b(lVar.n)) {
            return;
        }
        int size = lVar.n.size();
        TypedArray obtainTypedArray = this.n.getContext().getResources().obtainTypedArray(R.array.wm_smart_assistant_multi_person_item_id);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(this.f.getContext(), 4.0f);
        int a4 = com.sankuai.waimai.foundation.utils.g.a(this.f.getContext(), 0.5f);
        int i2 = 0;
        while (i2 < size && i2 < 6) {
            FrameLayout frameLayout = (FrameLayout) this.n.findViewById(obtainTypedArray.getResourceId(i2, -1));
            if (frameLayout != null) {
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) frameLayout.findViewById(R.id.wm_smart_assistant_multi_person_meal_item_product_image);
                TextView textView2 = (TextView) frameLayout.findViewById(R.id.wm_smart_assistant_multi_person_meal_item_product_name);
                Product product = lVar.n.get(i2);
                int i3 = i2;
                typedArray = obtainTypedArray;
                a(frameLayout, roundCornerImageView, textView2, i2, size, a3, a4, product.picture);
                SpannableString spannableString = new SpannableString("");
                String str2 = "";
                if (product.sku != null && product.sku.count > 1) {
                    str = this.itemView.getContext().getString(R.string.wm_sa_good_count, Integer.valueOf(product.sku.count), product.name);
                } else {
                    str = product.name;
                }
                if (product.sku != null) {
                    StringBuilder sb = new StringBuilder();
                    if (!d.a(product.sku.spuAttrs)) {
                        for (GoodsAttrList goodsAttrList : product.sku.spuAttrs) {
                            if (!d.a(goodsAttrList.values)) {
                                Iterator<GoodsAttr> it = goodsAttrList.values.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    GoodsAttr next = it.next();
                                    if (next != null && !TextUtils.isEmpty(next.getValue())) {
                                        sb.append(next.getValue());
                                        sb.append((char) 12289);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    str2 = sb.toString();
                    if (!TextUtils.isEmpty(str2)) {
                        str2 = str2.substring(0, str2.length() - 1);
                    }
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    spannableString = new SpannableString(str + "  |  " + str2);
                    spannableString.setSpan(new com.sankuai.waimai.sa.ui.assistant.view.multiperson.c(8), str.length(), str.length() + 5, 17);
                } else if (!TextUtils.isEmpty(str2)) {
                    spannableString = new SpannableString(str2);
                } else if (!TextUtils.isEmpty(str)) {
                    spannableString = new SpannableString(str);
                }
                if (TextUtils.isEmpty(spannableString.toString())) {
                    textView = textView2;
                    textView.setVisibility(4);
                } else {
                    textView = textView2;
                    textView.setText(spannableString);
                }
                if (size > 6) {
                    i = i3;
                    if (i == 5) {
                        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.wm_smart_assistant_multi_person_meal_item_product_cover);
                        relativeLayout.setVisibility(0);
                        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.wm_smart_assistant_multi_person_meal_item_product_cover_txt);
                        int i4 = size - 5;
                        if (i4 > 999) {
                            textView3.setText(String.format("+%d", 999));
                        } else {
                            textView3.setText(String.format("+%d", Integer.valueOf(i4)));
                        }
                        textView.setVisibility(8);
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i2;
                typedArray = obtainTypedArray;
            }
            i2 = i + 1;
            obtainTypedArray = typedArray;
        }
        obtainTypedArray.recycle();
        if (this.v == 0) {
            if (this.x == null) {
                this.x = new MultiPersonFooterController(this.w);
            }
            this.x.a(this.c.p.get(this.d), this.c.c, this.b, this.d, this.e, 0, this.c.b);
            return;
        }
        if (!TextUtils.isEmpty(lVar.m)) {
            this.A.setText(lVar.m);
            if (!TextUtils.isEmpty(lVar.z)) {
                b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a5.b = this.itemView.getContext();
                a5.c = lVar.z;
                a5.i = R.drawable.wm_smart_assistant_multi_person_vertical_money_off_icon_default;
                a5.j = R.drawable.wm_smart_assistant_multi_person_vertical_money_off_icon_default;
                a5.e = 1;
                a5.a(this.z);
            } else {
                this.z.setImageResource(R.drawable.wm_smart_assistant_multi_person_vertical_money_off_icon_default);
            }
            this.y.setVisibility(0);
        } else if (h.d(Double.valueOf(lVar.s), Double.valueOf(0.0d))) {
            this.A.setText(this.A.getContext().getString(R.string.wm_sa_multi_person_item_discount_price, h.a(lVar.s)));
            this.z.setImageResource(R.drawable.wm_smart_assistant_multi_person_vertical_discount_icon_default);
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(8);
        }
        if (h.b(Double.valueOf(lVar.j), Double.valueOf(0.0d)) || h.b(Double.valueOf(lVar.i), Double.valueOf(0.0d))) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(0);
        }
        this.C.setText(h.a(lVar.j));
        if (h.c(Double.valueOf(lVar.i), Double.valueOf(lVar.j))) {
            this.D.setVisibility(8);
        } else {
            this.D.setVisibility(0);
        }
        this.D.setPaintFlags(this.D.getPaintFlags() | 16);
        this.D.setText(String.format(Locale.US, "¥%s", h.a(lVar.i)));
        this.E.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d51fce65f1104c2956e5682412c5ece7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d51fce65f1104c2956e5682412c5ece7");
                } else {
                    a.a(view.getContext(), lVar, b.this.b, String.valueOf(b.this.c.c), b.this.d, b.this.e, 0, b.this.c.b);
                }
            }
        });
    }

    private void a(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5b7712fad8e2af72abc1493931507d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5b7712fad8e2af72abc1493931507d");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.itemView.getContext();
        a2.c = str;
        a2.i = R.drawable.wm_common_poi_error;
        a2.j = R.drawable.wm_common_poi_error;
        a2.e = 1;
        a2.a(imageView);
    }

    private void a(FrameLayout frameLayout, RoundCornerImageView roundCornerImageView, TextView textView, int i, int i2, int i3, int i4, String str) {
        Object[] objArr = {frameLayout, roundCornerImageView, textView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f726af2763ccb16c85b8c0a6a514285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f726af2763ccb16c85b8c0a6a514285");
            return;
        }
        int i5 = R.drawable.wm_smart_assistant_multi_person_item_default_2;
        switch (i2) {
            case 1:
                roundCornerImageView.setRound(i3);
                textView.setBackground(textView.getResources().getDrawable(R.drawable.wm_smart_assistant_multi_person_name_bg_left_right_radius));
                i5 = R.drawable.wm_smart_assistant_multi_person_item_default_1;
                break;
            case 2:
                if (i == 0) {
                    roundCornerImageView.setRound(i3);
                    textView.setBackground(textView.getResources().getDrawable(R.drawable.wm_smart_assistant_multi_person_name_bg_left_right_radius));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.setMargins(0, 0, com.sankuai.waimai.foundation.utils.g.a(textView.getContext(), 97.0f), 0);
                    textView.setLayoutParams(layoutParams);
                    i5 = R.drawable.wm_smart_assistant_multi_person_item_default_1;
                }
                if (i == 1) {
                    frameLayout.setPadding(i4, i4, 0, 0);
                    float f = i3;
                    roundCornerImageView.setLeftTopRound(f);
                    roundCornerImageView.setRightBottomRound(f);
                    break;
                }
                break;
            case 3:
                if (i == 0) {
                    float f2 = i3;
                    roundCornerImageView.setLeftTopRound(f2);
                    roundCornerImageView.setLeftBottomRound(f2);
                    textView.setBackground(textView.getResources().getDrawable(R.drawable.wm_smart_assistant_multi_person_name_bg_left_right_radius));
                    i5 = R.drawable.wm_smart_assistant_multi_person_item_default_3;
                }
                if (i == 1) {
                    roundCornerImageView.setRightTopRound(i3);
                }
                if (i == 2) {
                    roundCornerImageView.setRightBottomRound(i3);
                    break;
                }
                break;
            case 4:
                if (i == 0) {
                    roundCornerImageView.setLeftTopRound(i3);
                }
                if (i == 1) {
                    roundCornerImageView.setRightTopRound(i3);
                }
                if (i == 2) {
                    roundCornerImageView.setLeftBottomRound(i3);
                    textView.setBackground(textView.getResources().getDrawable(R.drawable.wm_smart_assistant_multi_person_name_bg_left_right_radius));
                }
                if (i == 3) {
                    roundCornerImageView.setRightBottomRound(i3);
                }
                i5 = R.drawable.wm_smart_assistant_multi_person_item_default_4;
                break;
            case 5:
                if (i == 0) {
                    roundCornerImageView.setLeftTopRound(i3);
                    i5 = R.drawable.wm_smart_assistant_multi_person_item_default_4;
                }
                if (i == 1) {
                    roundCornerImageView.setRightTopRound(i3);
                    i5 = R.drawable.wm_smart_assistant_multi_person_item_default_4;
                }
                if (i == 2) {
                    roundCornerImageView.setLeftBottomRound(i3);
                    textView.setBackground(textView.getResources().getDrawable(R.drawable.wm_smart_assistant_multi_person_name_bg_left_right_radius));
                }
                if (i == 4) {
                    roundCornerImageView.setRightBottomRound(i3);
                    break;
                }
                break;
            default:
                if (i == 0) {
                    roundCornerImageView.setLeftTopRound(i3);
                }
                if (i == 2) {
                    roundCornerImageView.setRightTopRound(i3);
                }
                if (i == 3) {
                    roundCornerImageView.setLeftBottomRound(i3);
                    textView.setBackground(textView.getResources().getDrawable(R.drawable.wm_smart_assistant_multi_person_name_bg_left_right_radius));
                }
                if (i == 5) {
                    roundCornerImageView.setRightBottomRound(i3);
                    break;
                }
                break;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.itemView.getContext();
        a2.j = i5;
        a2.i = i5;
        a2.c = str;
        a2.a((ImageView) roundCornerImageView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f29d2588e07175d593eaa65f7202ac1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f29d2588e07175d593eaa65f7202ac1");
        } else if (this.b == null || this.c == null || this.c.p == null || this.c.p.size() <= this.d || this.c.p.get(this.d) == null || d.a(this.c.p.get(this.d).n) || this.itemView == view) {
        } else {
            l lVar = this.c.p.get(this.d);
            if (view.getId() == R.id.wm_smart_assistant_muti_persion_container) {
                if (this.c.p.get(this.d).n.size() == 1 && this.c.p.get(this.d).x == 1) {
                    this.b.a(this.c.p.get(this.d).c, this.c.p.get(this.d).d, this.c.p.get(this.d).n.get(0).spuId);
                } else {
                    Object[] objArr2 = {view, lVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "377fa04dc4cc3bca81eb70951da1e57c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "377fa04dc4cc3bca81eb70951da1e57c");
                    } else {
                        new MultiPersonDetailDialog((Activity) view.getContext(), this.b, lVar, this.c.c, this.d, this.e).a().show();
                    }
                }
                JudasManualManager.a("b_qdf5a390").a("c_6tg6wz4r").a("result_id", this.c.c).a("package_key_sku", this.c.p.get(this.d).p).a("poi_id", this.c.p.get(this.d).c).a("index", this.d).a("layout_type", this.c.b).a();
            }
            if (view.getId() == R.id.wm_smart_assistant_multi_person_merchant_more && lVar != null && !d.a(lVar.C)) {
                this.q.b(lVar.C.get(0).msg, lVar.C.get(0).label);
                JudasManualManager.a("b_gfjt7a5a").a("c_6tg6wz4r").a("result_id", this.c.c).a("package_key_sku", this.c.p.get(this.d).p).a("poi_id", lVar.c).a("index", this.d).a("layout_type", this.c.b).a();
            }
            if (view.getId() != R.id.chat_item_head_layout || lVar == null) {
                return;
            }
            this.b.a(lVar.c, lVar.d);
            JudasManualManager.a("b_wv2byxmg").a("c_6tg6wz4r").a("result_id", this.c.c).a("package_key_sku", lVar.p).a("index", this.d).a("layout_type", this.c.b).a("poi_id", lVar.c).a();
        }
    }
}
