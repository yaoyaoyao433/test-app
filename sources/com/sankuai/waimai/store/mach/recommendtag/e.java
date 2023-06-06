package com.sankuai.waimai.store.mach.recommendtag;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.labelview.LabelView;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends g<PoiRecommendTagInfoListItem, d> {
    public static ChangeQuickRedirect a;
    LabelView b;
    private ImageView c;
    private ImageView d;
    private Drawable e;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_ui_list_poi_list_item_recommend_tag;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(PoiRecommendTagInfoListItem poiRecommendTagInfoListItem, int i) {
        Drawable drawable;
        boolean z;
        Integer num;
        final PoiRecommendTagInfoListItem poiRecommendTagInfoListItem2 = poiRecommendTagInfoListItem;
        Object[] objArr = {poiRecommendTagInfoListItem2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7dcf388414d7de5d405f77f08c1bda5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7dcf388414d7de5d405f77f08c1bda5");
        } else if (poiRecommendTagInfoListItem2 != null) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "292693605e92469148bf405cf33f3b10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "292693605e92469148bf405cf33f3b10");
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
                marginLayoutParams.leftMargin = i == 0 ? 0 : this.p.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
                this.p.setLayoutParams(marginLayoutParams);
            }
            if (t.a(poiRecommendTagInfoListItem2.scheme)) {
                this.p.setClickable(false);
                drawable = null;
            } else {
                this.p.setClickable(true);
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.mach.recommendtag.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "991e2b3e3b75a5d17c8bf552ca720423", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "991e2b3e3b75a5d17c8bf552ca720423");
                        } else if (TextUtils.isEmpty(poiRecommendTagInfoListItem2.scheme)) {
                        } else {
                            ((d) e.this.o).a(poiRecommendTagInfoListItem2.scheme);
                        }
                    }
                });
                drawable = ContextCompat.getDrawable(this.p.getContext(), R.drawable.wm_sc_common_right_arrow);
                int dimensionPixelOffset = this.p.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_9);
                Integer a2 = com.sankuai.shangou.stone.util.d.a(poiRecommendTagInfoListItem2.contentColor);
                if (a2 != null) {
                    if (this.e == null) {
                        this.e = com.sankuai.waimai.store.util.e.a(drawable, a2.intValue());
                    } else {
                        DrawableCompat.setTintList(drawable, ColorStateList.valueOf(a2.intValue()));
                    }
                    drawable = this.e;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
                }
            }
            this.b.setCompoundDrawables(null, null, drawable, null);
            Object[] objArr3 = {poiRecommendTagInfoListItem2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca719957399b38563812b69aa03710db", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca719957399b38563812b69aa03710db")).booleanValue();
            } else {
                z = !t.a(poiRecommendTagInfoListItem2.imageLabelUrl);
            }
            if (z) {
                Object[] objArr4 = {poiRecommendTagInfoListItem2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "eb0c3920062c474a8f3e685f06b7da40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "eb0c3920062c474a8f3e685f06b7da40");
                    return;
                }
                u.a(this.c);
                u.c(this.b, this.d);
                b.C0608b b = m.b(poiRecommendTagInfoListItem2.imageLabelUrl, this.p.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_15), ImageQualityUtil.a());
                b.b = this.p.getContext();
                b.a(this.c);
                return;
            }
            Object[] objArr5 = {poiRecommendTagInfoListItem2};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dfafe3286ba3c07843a1b85a449de9a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dfafe3286ba3c07843a1b85a449de9a2");
                return;
            }
            u.c(this.c);
            u.a(this.b);
            String str = poiRecommendTagInfoListItem2.content;
            int intValue = !t.a(poiRecommendTagInfoListItem2.contentColor.trim()) ? com.sankuai.shangou.stone.util.d.a(poiRecommendTagInfoListItem2.contentColor.trim()).intValue() : -103129;
            int intValue2 = !t.a(poiRecommendTagInfoListItem2.labelBackgroundColor.trim()) ? com.sankuai.shangou.stone.util.d.a(poiRecommendTagInfoListItem2.labelBackgroundColor.trim()).intValue() : -4916;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LabelView labelView = this.b;
            Object[] objArr6 = {str, Integer.valueOf(intValue), 0, (byte) 0, Integer.valueOf(intValue2), labelView};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "495387d9a48998165b5800c30a6906a7", RobustBitConfig.DEFAULT_VALUE)) {
                LabelView labelView2 = (LabelView) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "495387d9a48998165b5800c30a6906a7");
            } else if (labelView != null && !TextUtils.isEmpty(str)) {
                labelView.setBorderWidth(1);
                labelView.setText(str);
                labelView.setTextSize(1, 11.0f);
                Object[] objArr7 = {Integer.valueOf(intValue), null, null, null};
                ChangeQuickRedirect changeQuickRedirect7 = LabelView.a;
                if (PatchProxy.isSupport(objArr7, labelView, changeQuickRedirect7, false, "c0313ddbe98086661866fa44ab33fb0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, labelView, changeQuickRedirect7, false, "c0313ddbe98086661866fa44ab33fb0b");
                    num = null;
                } else {
                    com.sankuai.waimai.platform.widget.labelview.c cVar = new com.sankuai.waimai.platform.widget.labelview.c();
                    num = null;
                    cVar.a(intValue, null, null, null);
                    labelView.setTextColor(cVar);
                }
                labelView.getSolidColors().a(intValue2, num, num, num);
                labelView.setRadius(labelView.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4));
            }
            final int dimensionPixelOffset2 = this.p.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_15);
            b.C0608b b2 = m.b(poiRecommendTagInfoListItem2.iconUrl, dimensionPixelOffset2, ImageQualityUtil.a());
            b2.b = this.p.getContext();
            b2.a(new b.a() { // from class: com.sankuai.waimai.store.mach.recommendtag.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr8 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "7dedc6b3b55b0e4663bb2a80a0ae0f6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "7dedc6b3b55b0e4663bb2a80a0ae0f6a");
                    } else if (com.sankuai.waimai.store.util.b.a(e.this.p.getContext())) {
                    } else {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(e.this.p.getResources(), bitmap);
                        bitmapDrawable.setBounds(0, 0, dimensionPixelOffset2, dimensionPixelOffset2);
                        e.this.b.setIconLeft(bitmapDrawable);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1b058c60481531d509cc23e03a7d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1b058c60481531d509cc23e03a7d3d");
            return;
        }
        this.b = (LabelView) view.findViewById(R.id.recommend_labelView);
        this.d = (ImageView) view.findViewById(R.id.recommendIcon);
        this.c = (ImageView) view.findViewById(R.id.iv_label);
    }
}
