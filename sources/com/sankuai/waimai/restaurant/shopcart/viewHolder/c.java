package com.sankuai.waimai.restaurant.shopcart.viewHolder;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.stepper.RooStepper;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.l;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect f;
    private View A;
    private View.OnClickListener B;
    final g g;
    final com.sankuai.waimai.restaurant.shopcart.config.a h;
    k i;
    Activity j;
    TextView k;
    TextView l;
    TextView m;
    TextView n;
    TagCanvasView o;
    private final boolean p;
    private View q;
    private View r;
    private View s;
    private RooStepper t;
    private ImageView u;
    private ImageView v;
    private int w;
    private Typeface x;
    private com.sankuai.waimai.platform.widget.tag.virtualtag.g y;
    private RelativeLayout z;

    public c(@NonNull View view, Activity activity, g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, Typeface typeface, boolean z) {
        super(view);
        Object[] objArr = {view, activity, gVar, aVar, typeface, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6b1b9a1cff401755cb94a3595807bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6b1b9a1cff401755cb94a3595807bd");
            return;
        }
        this.i = k.a();
        this.x = null;
        this.B = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String physicalTag;
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e07ed91f7934542091240139ea7bbfd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e07ed91f7934542091240139ea7bbfd");
                } else if (view2.getId() == R.id.layout_food_item) {
                    OrderedFood orderedFood = (OrderedFood) view2.getTag();
                    if (orderedFood.spu.getActivityTag() != null && orderedFood.spu.getActivityTag().length() > 0) {
                        physicalTag = orderedFood.spu.getActivityTag();
                    } else if (orderedFood.spu.getTag() != null && orderedFood.spu.getTag().length() > 0) {
                        physicalTag = orderedFood.spu.getTag();
                    } else {
                        physicalTag = orderedFood.spu.getPhysicalTag();
                    }
                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(c.this.g.f(), physicalTag, orderedFood.getSpuId());
                    JudasManualManager.a a2 = JudasManualManager.a("b_mwhkm").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(c.this.j);
                    a2.a("is_combo", 0).a();
                }
            }
        };
        this.j = activity;
        this.g = gVar;
        this.h = aVar;
        this.w = com.sankuai.waimai.foundation.utils.g.a(this.j, 60.0f);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2031e2d226e1e66407058c7e21956fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2031e2d226e1e66407058c7e21956fa9");
        } else {
            this.q = view.findViewById(R.id.layout_food_item);
            this.u = (ImageView) view.findViewById(R.id.shop_cart_poi_icon);
            this.t = (RooStepper) view.findViewById(R.id.roo_stepper);
            this.m = (TextView) view.findViewById(R.id.txt_food_price);
            this.n = (TextView) view.findViewById(R.id.txt_food_original_price);
            this.n.setPaintFlags(17);
            this.v = (ImageView) view.findViewById(R.id.iv_additional_icon);
            this.k = (TextView) view.findViewById(R.id.txt_food_name);
            this.l = (TextView) view.findViewById(R.id.txt_food_attrs);
            this.r = view.findViewById(R.id.layout_food_item_divider_long_line);
            this.s = view.findViewById(R.id.layout_food_item_divider_short_line);
            this.o = (TagCanvasView) view.findViewById(R.id.tcv_shop_cart);
            this.A = a(R.id.img_foodCount_add);
            try {
                if (this.x != null) {
                    this.m.setTypeface(this.x);
                    this.n.setTypeface(this.x);
                }
            } catch (Throwable unused) {
            }
            this.z = (RelativeLayout) view.findViewById(R.id.rl_show_cart_price);
            this.z.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5904fc112fae12943a38aebb91d0882f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5904fc112fae12943a38aebb91d0882f");
                        return;
                    }
                    c cVar = c.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = c.f;
                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "8c0d9438564f0d55324162ed9c0f9430", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "8c0d9438564f0d55324162ed9c0f9430");
                        return;
                    }
                    int measuredWidth = (cVar.j.getResources().getDisplayMetrics().widthPixels - (cVar.m.getMeasuredWidth() + cVar.n.getMeasuredWidth())) - com.sankuai.waimai.foundation.utils.g.a(cVar.j, 194.0f);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.o.getLayoutParams();
                    if (layoutParams.width != measuredWidth) {
                        layoutParams.width = measuredWidth;
                        cVar.o.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        this.x = typeface;
        this.p = z;
    }

    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf965f603602ecc5891dc5d0e1412d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf965f603602ecc5891dc5d0e1412d2");
        } else if (gVar == null) {
        } else {
            b(gVar, i);
        }
    }

    private void b(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar, int i) {
        OrderedFood orderedFood;
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "324a82be7f3e9402040c0b3273fe70a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "324a82be7f3e9402040c0b3273fe70a8");
        } else if (gVar == null || (orderedFood = gVar.h.food) == null) {
        } else {
            a(gVar, orderedFood);
            a(orderedFood);
            c(gVar);
            if (gVar.e == 1) {
                this.k.setText(orderedFood.getName());
                this.t.a(orderedFood.getCount());
                d(gVar);
                e(gVar);
                b(gVar);
                f(gVar);
                if ((this.j instanceof Activity) && this.h.c == 1) {
                    this.q.setTag(orderedFood);
                    if (!this.p) {
                        this.q.setOnClickListener(this.B);
                        this.q.setClickable(false);
                    }
                }
                if (this.A != null) {
                    com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.A, true);
                    int a = com.sankuai.waimai.restaurant.shopcart.utils.d.a(gVar);
                    if (a(gVar) >= a && a != -1) {
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.A, false);
                    } else {
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.A, true);
                    }
                }
                if (!this.g.d && gVar.r) {
                    this.r.setVisibility(8);
                    this.s.setVisibility(8);
                    return;
                }
                this.r.setVisibility(gVar.r ? 0 : 8);
                this.s.setVisibility(gVar.r ? 8 : 0);
            }
            if (gVar.e == 3) {
                this.t.setVisibility(8);
                this.r.setVisibility(8);
                this.s.setVisibility(8);
                TextView textView = this.k;
                textView.setText(orderedFood.getName() + " x" + orderedFood.getCount());
                this.m.setTextColor(Color.parseColor("#33312E"));
            }
        }
    }

    private void b(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b66b45aa26c051619e49d6cf113912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b66b45aa26c051619e49d6cf113912");
        } else if (gVar.h.actTags != null && gVar.h.actTags.size() > 0) {
            this.o.setVisibility(0);
            this.y = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(this.j, com.sankuai.waimai.platform.widget.tag.util.a.a(this.j, gVar.h.actTags));
            this.o.setAdapter(this.y);
        } else {
            this.o.setVisibility(8);
        }
    }

    public static String a(ShopCartItem shopCartItem, OrderedFood orderedFood) {
        Object[] objArr = {shopCartItem, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b39e59f3bd8174138f69dbc34b32349", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b39e59f3bd8174138f69dbc34b32349");
        }
        String cartPoiPicUrl = shopCartItem != null ? shopCartItem.food.getCartPoiPicUrl() : "";
        return (!TextUtils.isEmpty(cartPoiPicUrl) || orderedFood.spu == null) ? cartPoiPicUrl : orderedFood.spu.picture;
    }

    private void a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar, OrderedFood orderedFood) {
        Object[] objArr = {gVar, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051ffa8adea21316676e0286f4b87712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051ffa8adea21316676e0286f4b87712");
            return;
        }
        String a = a(gVar.h, orderedFood);
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.j;
        a2.c = a;
        a2.f = ImageQualityUtil.b();
        b.C0608b a3 = a2.a(this.w);
        a3.k = 4;
        b.C0608b a4 = a3.a(new BitmapTransformation[]{new RoundAndCenterCropTransform(this.j, 2)}, new String[]{"2"});
        a4.i = R.drawable.wm_comment_img_load_placeholder_small;
        a4.j = R.drawable.wm_common_good_img_default;
        a4.a(this.u);
    }

    private void a(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c76a17dc68a68d1f8d9e4ec9083d029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c76a17dc68a68d1f8d9e4ec9083d029");
            return;
        }
        SpannableString spannableString = new SpannableString(orderedFood.getSubTotalPrice());
        if (spannableString.length() > 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, 1, 34);
        }
        this.m.setText(spannableString);
        this.m.setContentDescription(spannableString);
        if (orderedFood.getSubTotalOriginalPrice() != 0.0d && !h.a(Double.valueOf(orderedFood.getSubTotal()), Double.valueOf(orderedFood.getSubTotalOriginalPrice()))) {
            ah.a(this.n, orderedFood.getSubOriginalPrice());
            TextView textView = this.m;
            textView.setContentDescription("现价￥" + ((Object) this.m.getContentDescription()));
            TextView textView2 = this.n;
            textView2.setContentDescription("原价￥" + orderedFood.getSubOriginalPrice());
            return;
        }
        this.n.setVisibility(4);
    }

    private void c(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99fe8456e9a73e32c5acf12c3ca6c2d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99fe8456e9a73e32c5acf12c3ca6c2d0");
            return;
        }
        ShopCartItem shopCartItem = gVar.h;
        if (shopCartItem != null) {
            StringBuilder sb = new StringBuilder();
            int productType = shopCartItem.getFood().getProductType();
            if (productType == 6 || productType == 5) {
                List<OrderedFood> comboItems = shopCartItem.getFood().getComboItems();
                if (!com.sankuai.waimai.foundation.utils.b.b(comboItems)) {
                    for (OrderedFood orderedFood : comboItems) {
                        sb.append(orderedFood.getFoodDesc());
                        sb.append("\n");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(shopCartItem.food.getFoodDesc());
            }
            this.l.setText(sb);
        }
        this.l.post(new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01b30f57fb6762b5a61ad1a37d2eb4bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01b30f57fb6762b5a61ad1a37d2eb4bf");
                } else if (c.this.k.getLineCount() > 1 && TextUtils.isEmpty(c.this.l.getText())) {
                    c.this.l.setVisibility(8);
                } else {
                    c.this.l.setVisibility(0);
                }
            }
        });
    }

    private void d(final com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ff68b6bb6be6e41d5c9d5df3595fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ff68b6bb6be6e41d5c9d5df3595fac");
        } else {
            this.t.setIncListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aedaa1ab7a057a0159fc59c62b917391", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aedaa1ab7a057a0159fc59c62b917391");
                        return;
                    }
                    ShopCartItem shopCartItem = gVar.h;
                    if (shopCartItem == null) {
                        return;
                    }
                    try {
                        c.this.i.a(c.this.j, c.this.g.f(), gVar.f, gVar.h.food, 0, new e() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4a7331de22e9d61fafbc3c95b98d2d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4a7331de22e9d61fafbc3c95b98d2d9");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "40fa16a3d6b69412764cae04cb4b7bdd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "40fa16a3d6b69412764cae04cb4b7bdd");
                                } else if (c.this.a(gVar) < com.sankuai.waimai.restaurant.shopcart.utils.d.a(gVar) || com.sankuai.waimai.restaurant.shopcart.utils.d.a(gVar) == -1) {
                                } else {
                                    com.sankuai.waimai.restaurant.shopcart.utils.d.a(c.this.j);
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14107cba7525d98d852fabbc25134603", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14107cba7525d98d852fabbc25134603");
                                } else if (TextUtils.isEmpty(aVar.getMessage())) {
                                } else {
                                    ae.a(c.this.j, aVar.getMessage());
                                }
                            }
                        });
                    } catch (Exception e) {
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            com.sankuai.waimai.foundation.utils.log.a.b("ShopCartAdapter", e);
                            i.a(new com.sankuai.waimai.business.restaurant.base.log.d().a("restaurant_shopcart").d(e.getMessage()).c("add_food").b());
                        }
                    }
                    try {
                        if (c.this.h.c == 1) {
                            JudasManualManager.a a2 = JudasManualManager.a("b_4PyOt").a(l.a(c.this.j, (Map<String, Object>) null));
                            a2.b = AppUtil.generatePageInfoKey(c.this.j);
                            JudasManualManager.a a3 = a2.a("poi_id", c.this.g.f()).a("spu_type", shopCartItem.food.spu.spuType).a(KernelConfig.KEY_CONTAINER_TYPE, c.this.g.s()).a("rank_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok")).a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref")).a("sku_id", shopCartItem.food.sku.getSkuId()).a("spu_id", shopCartItem.food.spu.getId());
                            a3.b = AppUtil.generatePageInfoKey(c.this.j);
                            a3.a("c_CijEL").a("is_combo", 0).a();
                        }
                    } catch (Exception e2) {
                        String simpleName = getClass().getSimpleName();
                        com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e2.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    int a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd41b35f7ba2776a4f9632e84740fc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd41b35f7ba2776a4f9632e84740fc2")).intValue();
        }
        if (this.g != null) {
            return com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.g.f(), gVar.h.getFoodSpu(), gVar.h.getFoodSku());
        }
        return 0;
    }

    private void e(final com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb490a6eb7ee23ef3d6edb8dad0c5db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb490a6eb7ee23ef3d6edb8dad0c5db");
        } else {
            this.t.setDecListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55e75cdc50019b3a24015019bf860608", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55e75cdc50019b3a24015019bf860608");
                        return;
                    }
                    ShopCartItem shopCartItem = gVar.h;
                    if (shopCartItem == null) {
                        return;
                    }
                    try {
                        c.this.i.a(c.this.g.f(), gVar.f, shopCartItem.food, 0, new e() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.c.5.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f57cac080a079c55b80d836ce1b55dc7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f57cac080a079c55b80d836ce1b55dc7");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ee335716573196a7b4a469bfa986aba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ee335716573196a7b4a469bfa986aba");
                                } else if (TextUtils.isEmpty(aVar.getMessage())) {
                                } else {
                                    ae.a(c.this.j, aVar.getMessage());
                                }
                            }
                        });
                    } catch (Exception e) {
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            com.sankuai.waimai.foundation.utils.log.a.e("ShopCartAdapter", e.getMessage(), new Object[0]);
                            i.a(new com.sankuai.waimai.business.restaurant.base.log.d().a("restaurant_shopcart").d(e.getMessage()).c("dec_food").b());
                        }
                    }
                    try {
                        if (c.this.h.c == 1) {
                            JudasManualManager.a a2 = JudasManualManager.a("b_dmu2A").a("poi_id", c.this.g.f()).a(KernelConfig.KEY_CONTAINER_TYPE, c.this.g.s()).a("sku_id", shopCartItem.food.sku.getSkuId());
                            a2.b = AppUtil.generatePageInfoKey(c.this.j);
                            a2.a("c_CijEL").a();
                        }
                    } catch (Exception e2) {
                        String simpleName = getClass().getSimpleName();
                        com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e2.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    private void f(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4172d67ffae4ea98569d54a3eb77afc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4172d67ffae4ea98569d54a3eb77afc9");
        } else if (TextUtils.isEmpty(gVar.h.activityIconUrl)) {
            this.v.setVisibility(8);
        } else {
            this.v.setVisibility(0);
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = this.j;
            c.c = gVar.h.activityIconUrl;
            c.e = 1;
            c.a(this.v);
        }
    }
}
