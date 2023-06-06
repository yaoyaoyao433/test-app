package com.sankuai.waimai.store.goods.list.viewblocks.header.basic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.goods.list.base.d;
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.newwidgets.NotableView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.view.a;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends d {
    public static ChangeQuickRedirect c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private HorizontalFlowLayout g;
    private com.sankuai.waimai.store.expose.v2.entity.b h;
    private NotableView i;

    public b(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5580df49e198387f232464659888eef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5580df49e198387f232464659888eef");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c9087ab374ec19cf1c4716ed5f2fa7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c9087ab374ec19cf1c4716ed5f2fa7") : layoutInflater.inflate(R.layout.wm_sc_goods_list_layout_header_item_comment, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cd5a682fade3ec9ee69a5a2487dae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cd5a682fade3ec9ee69a5a2487dae0");
            return;
        }
        super.onViewCreated();
        this.d = (TextView) findView(R.id.wm_sc_goods_list_layout_header_item_comment_score);
        this.e = (TextView) findView(R.id.wm_sc_goods_list_layout_header_item_comment_main_summary);
        this.f = (ImageView) findView(R.id.wm_sc_goods_list_layout_header_item_comment_arrow);
        this.g = (HorizontalFlowLayout) findView(R.id.wm_sc_goods_list_layout_header_item_comment_sub_summary_list);
        this.f.setBackground(com.sankuai.waimai.store.view.a.a(getContext(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_7, (int) R.color.wm_sg_color_c9c5c2, a.EnumC1338a.RIGHT));
        this.h = new com.sankuai.waimai.store.expose.v2.entity.b("b_x9DU9", this.mView);
        this.i = (NotableView) findView(R.id.wm_sc_goods_list_layout_header_item_comment_main_summaries);
        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.h);
        }
    }

    public final void a(Poi.PoiComment poiComment) {
        Context context;
        float f;
        Object[] objArr = {poiComment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ce26e3d382b22936a52787d411ef07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ce26e3d382b22936a52787d411ef07");
            return;
        }
        Poi poi = this.a.d().b;
        if (poi == null) {
            return;
        }
        if (poiComment == null) {
            this.mView.setVisibility(8);
            return;
        }
        this.mView.setVisibility(0);
        String str = poiComment.commentScore;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93da0defe5fc29d6b62a77cb062f340a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93da0defe5fc29d6b62a77cb062f340a");
        } else {
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            if (TextUtils.isEmpty(str)) {
                this.d.setText(getContext().getResources().getString(R.string.wm_sc_comment));
                layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_32);
                layoutParams.width = -2;
                this.d.setBackground(null);
                this.d.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_16));
            } else {
                this.d.setText(str);
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_32);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                this.d.setBackgroundResource(R.drawable.wm_sc_goods_list_header_item_comment_bg);
                this.d.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_17));
            }
        }
        if (b(poiComment) && com.sankuai.shangou.stone.util.a.b(poiComment.commentLabels) && poiComment.commentNum == 0) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00fb2ff4f30325e8a88d922f3bd96423", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00fb2ff4f30325e8a88d922f3bd96423");
            } else {
                this.i.setVisibility(8);
                this.g.removeAllViews();
                this.g.setVisibility(8);
                this.e.setVisibility(0);
                this.e.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14));
                this.e.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_999794));
                this.e.setText(getContext().getResources().getString(R.string.wm_sc_no_comment));
            }
            this.f.setVisibility(8);
        } else if (b(poiComment) && com.sankuai.shangou.stone.util.a.b(poiComment.commentLabels)) {
            int i = poiComment.commentNum;
            Object[] objArr4 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = c;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f1f21480c495b11508c5c5212266e320", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f1f21480c495b11508c5c5212266e320");
            } else {
                this.g.removeAllViews();
                this.g.setVisibility(8);
                this.e.setVisibility(0);
                this.e.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14));
                this.e.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_333333));
                this.e.setText(this.mContext.getString(R.string.wm_sc_goods_list_comment_num, Integer.valueOf(i)));
            }
            this.f.setVisibility(0);
            a(poi);
        } else {
            final List<String> list = poiComment.comments;
            boolean a = com.sankuai.shangou.stone.util.a.a((Collection<?>) poiComment.commentLabels);
            Object[] objArr5 = {list, Byte.valueOf(a ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = c;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "94f4c252ead612205572855a07c9e292", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "94f4c252ead612205572855a07c9e292");
            } else if (com.sankuai.shangou.stone.util.a.b(list)) {
                this.e.setVisibility(8);
                this.i.setVisibility(8);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.i.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                if (a) {
                    context = getContext();
                    f = 25.0f;
                } else {
                    context = getContext();
                    f = 30.0f;
                }
                layoutParams2.height = h.a(context, f);
                this.i.setLayoutParams(layoutParams2);
                this.e.setVisibility(8);
                this.i.setVisibility(0);
                this.i.setAdapter(new NotableView.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.basic.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.newwidgets.NotableView.b
                    public final int a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f78a63d7169ea38966665e98246a8ee6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f78a63d7169ea38966665e98246a8ee6")).intValue() : list.size();
                    }

                    @Override // com.sankuai.waimai.store.newwidgets.NotableView.b
                    public final void a(View view, int i2) {
                        Object[] objArr6 = {view, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5bff67f8675a432c65394e47fe77a970", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5bff67f8675a432c65394e47fe77a970");
                        } else if (view instanceof TextView) {
                            ((TextView) view).setText((CharSequence) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2));
                        }
                    }

                    @Override // com.sankuai.waimai.store.newwidgets.NotableView.b
                    public final View a(@NonNull ViewGroup viewGroup) {
                        Object[] objArr6 = {viewGroup};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bacec4c0b759944086e59f1d3e258949", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bacec4c0b759944086e59f1d3e258949") : z.a(viewGroup.getContext(), R.layout.wm_sc_goods_list_layout_header_item_comment_summary, viewGroup, false);
                    }
                });
            }
            a(b(poiComment), poiComment.commentLabels);
            this.f.setVisibility(0);
            a(poi);
        }
        this.h.a("poi_id", poi.getOfficialPoiId()).a("score", TextUtils.isEmpty(poiComment.commentScore) ? "-999" : poiComment.commentScore).a("stid", poi.abExpInfo).a("has_comment", Integer.valueOf(!b(poiComment))).a("media_type", Integer.valueOf(com.sankuai.shangou.stone.util.a.a((List) poiComment.comments) <= 1 ? 1 : 2)).a("has_word", Integer.valueOf(com.sankuai.shangou.stone.util.a.a((List) poiComment.commentLabels) > 0 ? 1 : 0)).a("type", !TextUtils.isEmpty(poiComment.comment) ? "1" : "2");
    }

    boolean b(@NonNull Poi.PoiComment poiComment) {
        Object[] objArr = {poiComment};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e7399381535488f830af2d16716739", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e7399381535488f830af2d16716739")).booleanValue() : com.sankuai.shangou.stone.util.a.b(poiComment.comments);
    }

    private void a(boolean z, @Nullable List<String> list) {
        int dimensionPixelSize;
        int color;
        int i;
        Object inflate;
        char c2 = 0;
        int i2 = 1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d050508c588add20f1a0d540f5d7f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d050508c588add20f1a0d540f5d7f26");
            return;
        }
        this.g.removeAllViews();
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        if (z) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14);
            color = getContext().getResources().getColor(R.color.wm_sg_color_33312D);
            this.g.a(18, 12, 0, true);
        } else {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12);
            color = getContext().getResources().getColor(R.color.wm_sg_color_999999);
            this.g.a(16, 12, 0, true);
        }
        int i3 = dimensionPixelSize;
        int i4 = color;
        int i5 = 0;
        while (i5 < list.size()) {
            Context context = getContext();
            Object[] objArr2 = new Object[i2];
            objArr2[c2] = context;
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e489e23b88a5df4a9bb02446d0e856be", RobustBitConfig.DEFAULT_VALUE)) {
                i = 0;
                inflate = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e489e23b88a5df4a9bb02446d0e856be");
            } else {
                i = 0;
                inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_goods_list_layout_header_item_comment_list_item, (ViewGroup) this.g, false);
            }
            TextView textView = (TextView) inflate;
            textView.setText(list.get(i5));
            textView.setTextSize(i, i3);
            textView.setTextColor(i4);
            this.g.addView(textView);
            i5++;
            c2 = 0;
            i2 = 1;
        }
    }

    private void a(final Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c6ddb89c86de573891b5fe6f4039b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c6ddb89c86de573891b5fe6f4039b3");
        } else {
            getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.basic.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38456bd53c05b7a18c6ec73906b7a1fa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38456bd53c05b7a18c6ec73906b7a1fa");
                        return;
                    }
                    g.a(b.this.getContext(), poi.getId(), poi.getStringPoiId(), 101, poi, 0, b.this.a == null ? "" : b.this.a.b());
                    com.sankuai.waimai.store.manager.judas.b.a(b.this.getContext(), "b_suD8h").a("poi_id", poi.getOfficialPoiId()).a("score", TextUtils.isEmpty(poi.poiComment.commentScore) ? "-999" : poi.poiComment.commentScore).a("stid", poi.abExpInfo).a("type", !TextUtils.isEmpty(poi.poiComment.comment) ? "1" : "2").a("has_comment", Integer.valueOf(!b.this.b(poi.poiComment))).a("media_type", Integer.valueOf(com.sankuai.shangou.stone.util.a.a((List) poi.poiComment.comments) <= 1 ? 1 : 2)).a("has_word", Integer.valueOf(com.sankuai.shangou.stone.util.a.a((List) poi.poiComment.commentLabels) <= 0 ? 0 : 1)).a();
                }
            });
        }
    }
}
