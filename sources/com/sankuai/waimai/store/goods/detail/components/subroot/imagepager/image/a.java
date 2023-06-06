package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.c;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.SGAutoSizeTextView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    public ImageView d;
    private b.a e;
    private View f;
    private com.sankuai.waimai.store.expose.v2.entity.b g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c78e6d471593a69955c969cddc25df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c78e6d471593a69955c969cddc25df");
            return;
        }
        this.b = false;
        this.c = false;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final View a(ViewGroup viewGroup, e eVar, int i) {
        Object[] objArr = {viewGroup, eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e243cb853836beff701987d3295e2da", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e243cb853836beff701987d3295e2da");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_view_product_detail_atmosphere_image, viewGroup, false);
        this.f = inflate.findViewById(R.id.activity_ll);
        this.d = (ImageView) inflate.findViewById(R.id.picture_tag);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final void a(View view, final e eVar, final int i, @NonNull final b.a aVar, GoodDetailResponse.PoiExtendAttr poiExtendAttr, c cVar) {
        Object[] objArr = {view, eVar, Integer.valueOf(i), aVar, poiExtendAttr, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da87d3b341d1faac869cb1ce5aa394d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da87d3b341d1faac869cb1ce5aa394d5");
        } else if (eVar == null) {
        } else {
            this.e = aVar;
            final ImageView imageView = (ImageView) view.findViewById(R.id.img_product);
            b.C0608b a2 = m.a(eVar.c, ImageQualityUtil.a());
            a2.b = imageView.getContext();
            final boolean z = eVar.i;
            if (i == 0 && z) {
                this.b = false;
                a2.e = 0;
            } else {
                a2 = a2.b(h.a(imageView.getContext()));
            }
            a2.a(new b.a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "994e7890b11e2197d013ad79fbb171f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "994e7890b11e2197d013ad79fbb171f5");
                    } else if (com.sankuai.waimai.store.util.b.a(imageView.getContext())) {
                    } else {
                        if (z && a.this.b) {
                            return;
                        }
                        if (bitmap != null) {
                            imageView.setImageBitmap(bitmap);
                            if (!eVar.i) {
                                aVar.a(i, new b.C1178b(bitmap.getWidth(), bitmap.getHeight()));
                            }
                        } else {
                            m.a((int) R.drawable.wm_sc_common_poi_error, imageView);
                        }
                        a.this.b = true;
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f76f7a90203816463c0b550958d77d24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f76f7a90203816463c0b550958d77d24");
                    } else if (a.this.b || com.sankuai.waimai.store.util.b.a(imageView.getContext())) {
                    } else {
                        m.a((int) R.drawable.wm_sc_common_poi_error, imageView);
                    }
                }
            });
            aVar.a(imageView, eVar, i, false);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd6d35ff5e62cd3e5c47a004539fb0b6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd6d35ff5e62cd3e5c47a004539fb0b6");
                    } else {
                        aVar.a(eVar, i);
                    }
                }
            });
            if (poiExtendAttr != null) {
                GoodDetailResponse.HeaderConfig headerConfig = poiExtendAttr.headerConfig;
                Object[] objArr2 = {view, cVar, headerConfig};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f65f64f173993e0a91f59f8ada93aed7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f65f64f173993e0a91f59f8ada93aed7");
                } else if (this.g == null) {
                    this.g = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_ojft3z95_mv", view, "b_waimai_sg_ojft3z95_mv");
                    if (cVar != null && headerConfig != null) {
                        this.g.a("poi_id", Long.valueOf(cVar.a));
                        this.g.a("spu_id", Long.valueOf(cVar.b));
                        this.g.a("activity_id", Integer.valueOf(headerConfig.activityCode));
                        this.g.a("stid", cVar.c);
                        com.sankuai.waimai.store.expose.v2.b.a().a(cVar.d, this.g);
                    }
                }
                GoodDetailResponse.HeaderConfig headerConfig2 = poiExtendAttr.headerConfig;
                Object[] objArr3 = {headerConfig2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3fab4eba5d9141b3bac7fb646f1d0be3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3fab4eba5d9141b3bac7fb646f1d0be3");
                } else if (headerConfig2 != null) {
                    TextView textView = (TextView) this.f.findViewById(R.id.activity_name_tv);
                    final View findViewById = this.f.findViewById(R.id.activity_content_ll);
                    SGAutoSizeTextView sGAutoSizeTextView = (SGAutoSizeTextView) this.f.findViewById(R.id.content1);
                    SGAutoSizeTextView sGAutoSizeTextView2 = (SGAutoSizeTextView) this.f.findViewById(R.id.content2);
                    View findViewById2 = this.f.findViewById(R.id.real_activity_price_ll);
                    TextView textView2 = (TextView) this.f.findViewById(R.id.price_name_tv);
                    View findViewById3 = this.f.findViewById(R.id.real_activity_default_ll);
                    SGAutoSizeTextView sGAutoSizeTextView3 = (SGAutoSizeTextView) this.f.findViewById(R.id.price_defalut_line1);
                    SGAutoSizeTextView sGAutoSizeTextView4 = (SGAutoSizeTextView) this.f.findViewById(R.id.price_defalut_line2);
                    SGAutoSizeTextView sGAutoSizeTextView5 = (SGAutoSizeTextView) this.f.findViewById(R.id.sg_fixed_tv);
                    if (!TextUtils.isEmpty(headerConfig2.pharmacyReuctionTitle)) {
                        this.d.setVisibility(0);
                        m.a(headerConfig2.pharmacyReuctionTitle, ImageQualityUtil.a()).a(this.d);
                    } else {
                        this.d.setVisibility(8);
                    }
                    GoodDetailResponse.b bVar = headerConfig2.activityTitleList;
                    if (bVar != null && !com.sankuai.shangou.stone.util.a.b(bVar.b)) {
                        a((GoodDetailResponse.HeadFigureShowText) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.b, 0), textView);
                    }
                    if (!t.a(headerConfig2.contentBgUrl)) {
                        b.C0608b a3 = m.a(headerConfig2.contentBgUrl, ImageQualityUtil.b());
                        a3.b = findViewById.getContext();
                        a3.a(new b.a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.a.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap) {
                                Object[] objArr4 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d043430c35e8b5ad1cb199ed0e7e6345", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d043430c35e8b5ad1cb199ed0e7e6345");
                                } else if (com.sankuai.waimai.store.util.b.a(findViewById.getContext()) || a.this.c) {
                                } else {
                                    if (bitmap != null) {
                                        findViewById.setBackground(new BitmapDrawable(findViewById.getResources(), bitmap));
                                    }
                                    a.this.c = true;
                                }
                            }
                        });
                    }
                    GoodDetailResponse.b bVar2 = headerConfig2.activityContentList;
                    if (bVar2 != null && !com.sankuai.shangou.stone.util.a.b(bVar2.b)) {
                        a((GoodDetailResponse.HeadFigureShowText) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar2.b, 0), sGAutoSizeTextView);
                        a((GoodDetailResponse.HeadFigureShowText) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar2.b, 1), sGAutoSizeTextView2);
                    }
                    GoodDetailResponse.b bVar3 = headerConfig2.activityPriceList;
                    if (bVar3 == null || com.sankuai.shangou.stone.util.a.b(bVar3.b)) {
                        return;
                    }
                    GoodDetailResponse.HeadFigureShowText headFigureShowText = (GoodDetailResponse.HeadFigureShowText) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar3.b, 0);
                    GoodDetailResponse.HeadFigureShowText headFigureShowText2 = (GoodDetailResponse.HeadFigureShowText) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar3.b, 1);
                    if (bVar3.a == 0) {
                        findViewById2.setVisibility(0);
                        findViewById3.setVisibility(8);
                        a(headFigureShowText, textView2);
                        if (headFigureShowText2 == null || t.a(headFigureShowText2.value)) {
                            return;
                        }
                        String str = headFigureShowText2.value;
                        Object[] objArr4 = {str, (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect4 = SGAutoSizeTextView.a;
                        if (PatchProxy.isSupport(objArr4, sGAutoSizeTextView5, changeQuickRedirect4, false, "0e989a15b3b2e2a1fbd9e452b12cf7eb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, sGAutoSizeTextView5, changeQuickRedirect4, false, "0e989a15b3b2e2a1fbd9e452b12cf7eb");
                            return;
                        } else if (t.a(str)) {
                            return;
                        } else {
                            String str2 = "¥" + str;
                            SpannableString spannableString = new SpannableString(str2);
                            spannableString.setSpan(new AbsoluteSizeSpan((int) sGAutoSizeTextView5.b), 0, 1, 17);
                            int indexOf = str2.indexOf(CommonConstant.Symbol.DOT);
                            if (indexOf != -1 && sGAutoSizeTextView5.b > 0.0f) {
                                spannableString.setSpan(new AbsoluteSizeSpan((int) sGAutoSizeTextView5.b), indexOf, str2.length(), 17);
                            }
                            sGAutoSizeTextView5.setText(spannableString);
                            return;
                        }
                    }
                    findViewById2.setVisibility(8);
                    findViewById3.setVisibility(0);
                    a(headFigureShowText, sGAutoSizeTextView3);
                    a(headFigureShowText2, sGAutoSizeTextView4);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74122f8a16a1f07f0c6f9bd144e4941a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74122f8a16a1f07f0c6f9bd144e4941a");
        } else if (!z || this.e == null) {
        } else {
            this.e.a(true);
        }
    }

    private void a(GoodDetailResponse.HeadFigureShowText headFigureShowText, TextView textView) {
        Object[] objArr = {headFigureShowText, textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826d5caa00c75f5319063559b1f05506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826d5caa00c75f5319063559b1f05506");
        } else if (headFigureShowText != null && !t.a(headFigureShowText.value)) {
            textView.setVisibility(0);
            textView.setText(headFigureShowText.value);
        } else {
            textView.setVisibility(8);
        }
    }

    private void a(GoodDetailResponse.HeadFigureShowText headFigureShowText, SGAutoSizeTextView sGAutoSizeTextView) {
        Object[] objArr = {headFigureShowText, sGAutoSizeTextView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca6950f282a5ab011eb70c3475d175a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca6950f282a5ab011eb70c3475d175a");
        } else if (headFigureShowText != null && !t.a(headFigureShowText.value)) {
            sGAutoSizeTextView.setVisibility(0);
            sGAutoSizeTextView.setText(headFigureShowText.value);
        } else {
            sGAutoSizeTextView.setVisibility(8);
        }
    }
}
