package com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g<GoodsPoiCategory, b> {
    public static ChangeQuickRedirect a;
    ImageView b;
    private View c;
    private ImageView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ViewGroup h;
    private View i;
    private TextView j;
    private com.sankuai.waimai.store.expose.v2.entity.b k;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_goods_list_tmp_v6_category_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(GoodsPoiCategory goodsPoiCategory, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        GoodsPoiCategory goodsPoiCategory2 = goodsPoiCategory;
        Object[] objArr = {goodsPoiCategory2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244595c00e3046dd389ed9a06de35a72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244595c00e3046dd389ed9a06de35a72");
        } else if (goodsPoiCategory2 != null) {
            Object[] objArr2 = {goodsPoiCategory2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a00377c70a914bfadf4fd446f499dc7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a00377c70a914bfadf4fd446f499dc7c");
            } else {
                com.sankuai.waimai.store.platform.domain.manager.poi.a a2 = ((b) this.o).a();
                if (a2 != null) {
                    this.k.a("poi_id", a2.d());
                    this.k.a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(a2.v()));
                }
                this.k.a("category_name", goodsPoiCategory2.getTagName());
                this.k.a("category_index", Integer.valueOf(i));
                this.k.a(DataConstants.CATEGORY_ID, goodsPoiCategory2.getTagCode());
                this.k.a("category_type", Integer.valueOf(goodsPoiCategory2.type));
                this.k.a(SearchIntents.EXTRA_QUERY, goodsPoiCategory2.activityInfo == null ? "" : goodsPoiCategory2.activityInfo.activityText);
            }
            boolean isSelected = goodsPoiCategory2.isSelected();
            if (TextUtils.isEmpty(goodsPoiCategory2.bigPicUrl)) {
                this.h.setVisibility(0);
                this.b.setVisibility(8);
                String tagIcon = goodsPoiCategory2.getTagIcon();
                if (!TextUtils.isEmpty(tagIcon)) {
                    this.d.setVisibility(0);
                    m.a(tagIcon, this.d, (int) this.d.getResources().getDimension(R.dimen.wm_sc_common_dimen_15));
                } else {
                    this.d.setVisibility(8);
                }
                Object[] objArr3 = {goodsPoiCategory2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81a824d12023caaca3b1958a9a7c63ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81a824d12023caaca3b1958a9a7c63ab");
                } else {
                    String tagName = goodsPoiCategory2.getTagName();
                    if (!TextUtils.isEmpty(tagName)) {
                        if (this.d.getVisibility() == 0 && tagName.length() > 3) {
                            try {
                                String substring = tagName.substring(0, 3);
                                String substring2 = tagName.substring(3, tagName.length());
                                this.e.setText(substring);
                                this.f.setVisibility(0);
                                this.f.setText(substring2);
                            } catch (Exception e) {
                                com.sankuai.shangou.stone.util.log.a.a(e);
                            }
                        }
                        if (((b) this.o).a().d == 3) {
                            this.e.setEllipsize(TextUtils.TruncateAt.END);
                        }
                        this.e.setText(tagName);
                        this.f.setVisibility(8);
                    }
                }
                boolean z = goodsPoiCategory2.aggregationActivityTags;
                Object[] objArr4 = {goodsPoiCategory2, Byte.valueOf(isSelected ? (byte) 1 : (byte) 0), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3203471b95b27102df8b68e2534f12d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3203471b95b27102df8b68e2534f12d");
                } else {
                    Resources resources = this.c.getContext().getResources();
                    int i6 = R.color.wm_st_common_fff4f4f4;
                    int i7 = R.color.wm_sg_color_666666;
                    if (z) {
                        if (isSelected) {
                            i7 = R.color.wm_sg_color_FE4C00;
                        }
                        if (isSelected) {
                            i6 = R.drawable.wm_sc_goods_list_category_image_bg;
                        }
                        i5 = 13;
                        this.h.setPadding(resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16));
                        i4 = i6;
                        i3 = 3;
                    } else {
                        int i8 = isSelected ? R.color.wm_st_common_text_title : R.color.wm_sg_color_666666;
                        Object[] objArr5 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f111096c3818cf38aadfc09be0ed9772", RobustBitConfig.DEFAULT_VALUE)) {
                            i6 = ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f111096c3818cf38aadfc09be0ed9772")).intValue();
                        } else {
                            if (isSelected) {
                                i3 = 3;
                                i6 = R.color.wm_st_common_white;
                            } else if (((b) this.o).a() != null) {
                                i3 = 3;
                                if (((b) this.o).a().d == 3) {
                                    i6 = R.color.wm_sg_color_F7F7F7;
                                }
                            }
                            this.h.setPadding(resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), a(resources), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9), a(resources));
                            i7 = i8;
                            i4 = i6;
                            i5 = 12;
                        }
                        i3 = 3;
                        this.h.setPadding(resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), a(resources), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9), a(resources));
                        i7 = i8;
                        i4 = i6;
                        i5 = 12;
                    }
                    float f = i5;
                    this.e.setTextSize(2, f);
                    this.f.setTextSize(2, f);
                    this.e.setTextColor(this.e.getContext().getResources().getColor(i7));
                    this.f.setTextColor(this.f.getContext().getResources().getColor(i7));
                    this.e.getPaint().setFakeBoldText(isSelected);
                    this.f.getPaint().setFakeBoldText(isSelected);
                    if (goodsPoiCategory2.previousNeighborState) {
                        this.c.setBackgroundResource(R.drawable.wm_sc_goods_list_category_previous_bg);
                    } else if (goodsPoiCategory2.nextNeighborState) {
                        this.c.setBackgroundResource(R.drawable.wm_sc_goods_list_category_next_bg);
                    } else {
                        this.c.setBackgroundResource(i4);
                    }
                    if (((b) this.o).a() != null && ((b) this.o).a().d == i3) {
                        this.h.setBackgroundResource(i4);
                    }
                }
                i2 = 8;
            } else {
                i2 = 8;
                this.h.setVisibility(8);
                this.b.setVisibility(0);
                m.a(goodsPoiCategory2.bigPicUrl, (int) this.d.getResources().getDimension(R.dimen.wm_sc_common_dimen_40), new b.a() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr6 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d0e5851bb782105fed5ad29ccd47f4d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d0e5851bb782105fed5ad29ccd47f4d6");
                            return;
                        }
                        c.this.b.getLayoutParams().width = (bitmap.getWidth() * h.a(c.this.b.getContext(), 20.0f)) / bitmap.getHeight();
                        c.this.b.setImageBitmap(bitmap);
                    }
                });
                this.c.setBackgroundResource(isSelected ? R.color.wm_st_common_white : R.color.wm_sg_color_F4F4F4);
            }
            int a3 = ((b) this.o).a(goodsPoiCategory2);
            if (a3 <= 0) {
                this.g.setVisibility(4);
            } else {
                this.g.setVisibility(0);
                if (a3 <= 99) {
                    this.g.setText(String.valueOf(a3));
                } else {
                    this.g.setText("99+");
                }
            }
            ((b) this.o).a(goodsPoiCategory2, i, this.c);
            View view = this.i;
            if (isSelected) {
                i2 = 0;
            }
            view.setVisibility(i2);
            u.a(this.j, goodsPoiCategory2.getSubName());
        }
    }

    private int a(@NonNull Resources resources) {
        Object[] objArr = {resources};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c453d001c8bbc2c2d9b1ae2eda3028e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c453d001c8bbc2c2d9b1ae2eda3028e")).intValue() : resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_17);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d0dc2dbe1a4290005851c9814aa812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d0dc2dbe1a4290005851c9814aa812");
            return;
        }
        this.c = view;
        this.d = (ImageView) view.findViewById(R.id.img_foodList_adapter_tag_combo);
        this.e = (TextView) view.findViewById(R.id.txt_category_name_1);
        this.f = (TextView) view.findViewById(R.id.txt_category_name_2);
        this.g = (TextView) view.findViewById(R.id.order_count);
        this.h = (ViewGroup) view.findViewById(R.id.layout_tag_category);
        this.b = (ImageView) view.findViewById(R.id.img_tag_big);
        this.i = view.findViewById(R.id.category_item_indicator_left);
        this.j = (TextView) view.findViewById(R.id.tv_sub_title);
        this.k = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_xoqh1dxp_mv", this.c);
        if (view.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) view.getContext(), this.k);
        }
    }
}
