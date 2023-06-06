package com.sankuai.waimai.store.search.template.noresult;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.NoResultNonDeliveryEntity;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.platform.base.a<NoResultNonDeliveryEntity, Nullable> {
    public static ChangeQuickRedirect a;
    SCSingleLineFlowLayout b;
    SearchShareData c;
    Map<String, Object> d;
    Map<String, Object> e;
    private Drawable f;
    private TextView h;
    private TextView i;
    private TextView j;
    private ImageView k;
    private Drawable l;
    private TextView m;
    private TextView n;
    private ImageView o;
    private ImageView p;
    private View q;
    private TextView r;
    private TextView s;
    private ImageView t;
    private ImageView u;
    private View v;
    private View w;

    @Override // com.sankuai.waimai.platform.base.a
    public final /* synthetic */ void a(int i, @NonNull NoResultNonDeliveryEntity noResultNonDeliveryEntity) {
        final NoResultNonDeliveryEntity noResultNonDeliveryEntity2 = noResultNonDeliveryEntity;
        Object[] objArr = {Integer.valueOf(i), noResultNonDeliveryEntity2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732ea8c075bcfd15c04330d8872ff915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732ea8c075bcfd15c04330d8872ff915");
            return;
        }
        this.d.put("keyword", this.c.h);
        this.d.put("cat_id", Integer.valueOf(this.c.z));
        this.d.put("search_log_id", this.c.b(noResultNonDeliveryEntity2));
        this.d.put("search_global_id", this.c.r);
        this.d.put("search_source", Integer.valueOf(this.c.aw));
        this.d.put("stid", g.f(this.c));
        this.d.put("index", Integer.valueOf(noResultNonDeliveryEntity2.getStatisticsIndex()));
        this.e.put("last_keyword", this.c.h);
        this.e.put("cat_id", Integer.valueOf(this.c.z));
        this.e.put("search_log_id", this.c.b(noResultNonDeliveryEntity2));
        this.e.put("search_global_id", this.c.r);
        this.e.put("search_source", Integer.valueOf(this.c.aw));
        this.e.put("stid", g.f(this.c));
        this.e.put("index", Integer.valueOf(noResultNonDeliveryEntity2.getStatisticsIndex()));
        if (!TextUtils.isEmpty(noResultNonDeliveryEntity2.nonResultNonDeliveryContext)) {
            this.h.setText(noResultNonDeliveryEntity2.nonResultNonDeliveryContext);
        } else if (!TextUtils.isEmpty(noResultNonDeliveryEntity2.explain_text)) {
            this.h.setText(noResultNonDeliveryEntity2.explain_text);
        } else {
            this.h.setText(this.y.getResources().getString(R.string.wm_sc_nox_search_no_result));
        }
        final NoResultNonDeliveryEntity.SearchButton searchButton = noResultNonDeliveryEntity2.searchButton;
        if (searchButton != null && !TextUtils.isEmpty(searchButton.scheme) && !TextUtils.isEmpty(searchButton.text)) {
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            if (!noResultNonDeliveryEntity2.isMeiShiButtonExposed) {
                com.sankuai.waimai.store.manager.judas.b.b(this.y, "b_waimai_sg_liy13axl_mv").b(this.d).a();
                noResultNonDeliveryEntity2.isMeiShiButtonExposed = true;
            }
            this.j.setBackground(this.f);
            this.j.setText(noResultNonDeliveryEntity2.searchButton.text);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.noresult.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "966cc0ee58e361b421745c058268f55a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "966cc0ee58e361b421745c058268f55a");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(c.this.y, "b_waimai_sg_liy13axl_mc").b(c.this.d).a();
                    d.a(c.this.y, searchButton.scheme);
                    if (c.this.y instanceof GlobalSearchActivity) {
                        ((GlobalSearchActivity) c.this.y).finish();
                    }
                }
            });
        } else {
            this.j.setVisibility(8);
            this.i.setVisibility(0);
            this.i.setText(noResultNonDeliveryEntity2.nonResultNonDeliverySubContext);
        }
        b.C0608b a2 = m.a(noResultNonDeliveryEntity2.nonResultNonDeliveryIcon);
        a2.i = R.drawable.wm_sc_nox_search_nonresult_icon;
        a2.a(this.k);
        this.v.setVisibility(8);
        this.q.setVisibility(8);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) noResultNonDeliveryEntity2.getRecommendEntry())) {
            for (final NoResultNonDeliveryEntity.PaotuiRecommendEntrance paotuiRecommendEntrance : noResultNonDeliveryEntity2.getRecommendEntry()) {
                if (paotuiRecommendEntrance != null) {
                    if (paotuiRecommendEntrance.type == 1) {
                        this.q.setVisibility(0);
                        this.m.setText(paotuiRecommendEntrance.title);
                        this.n.setBackground(this.l);
                        this.n.setText(paotuiRecommendEntrance.schemeContext);
                        if (!TextUtils.isEmpty(paotuiRecommendEntrance.scheme)) {
                            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.noresult.c.2
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr2 = {view};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83e4292f596039cb3a2f90bce2b8149d", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83e4292f596039cb3a2f90bce2b8149d");
                                        return;
                                    }
                                    com.sankuai.waimai.store.manager.judas.b.a(c.this.y, "b_waimai_sg_o11u6kx1_mc").b(c.this.d).a();
                                    d.a(c.this.y, paotuiRecommendEntrance.scheme);
                                }
                            });
                        }
                        m.a(paotuiRecommendEntrance.titleIcon).a(this.o);
                        m.a(paotuiRecommendEntrance.backgroundPic).a(this.p);
                        if (!noResultNonDeliveryEntity2.isShangjiaExposed) {
                            com.sankuai.waimai.store.manager.judas.b.b(this.y, "b_waimai_sg_o11u6kx1_mv").b(this.d).a();
                            noResultNonDeliveryEntity2.isShangjiaExposed = true;
                        }
                    } else if (paotuiRecommendEntrance.type == 2) {
                        this.v.setVisibility(0);
                        this.r.setText(paotuiRecommendEntrance.title);
                        this.s.setBackground(this.l);
                        this.s.setText(paotuiRecommendEntrance.schemeContext);
                        if (!TextUtils.isEmpty(paotuiRecommendEntrance.scheme)) {
                            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.noresult.c.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr2 = {view};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efb8c9d29362909ae7e88e795d8c713c", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efb8c9d29362909ae7e88e795d8c713c");
                                        return;
                                    }
                                    com.sankuai.waimai.store.manager.judas.b.a(c.this.y, "b_YD98R").a("search_service_type", Integer.valueOf(paotuiRecommendEntrance.type)).a("paotui_channel", c.this.c.bp).b(c.this.d).a();
                                    d.a(c.this.y, paotuiRecommendEntrance.scheme);
                                }
                            });
                        }
                        m.a(paotuiRecommendEntrance.titleIcon).a(this.t);
                        m.a(paotuiRecommendEntrance.backgroundPic).a(this.u);
                        if (!noResultNonDeliveryEntity2.isPaotuiExposed) {
                            com.sankuai.waimai.store.manager.judas.b.b(this.y, "b_AvzZQ").a("search_service_type", Integer.valueOf(paotuiRecommendEntrance.type)).a("paotui_channel", this.c.bp).b(this.d).a();
                            noResultNonDeliveryEntity2.isPaotuiExposed = true;
                        }
                    }
                }
            }
        } else {
            this.q.setVisibility(8);
            this.v.setVisibility(8);
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) noResultNonDeliveryEntity2.getSearchHotLabels())) {
            this.w.setVisibility(0);
            this.b.removeAllViews();
            for (final NoResultNonDeliveryEntity.SearchHotLabel searchHotLabel : noResultNonDeliveryEntity2.getSearchHotLabels()) {
                if (searchHotLabel != null && !TextUtils.isEmpty(searchHotLabel.jumpScheme) && !TextUtils.isEmpty(searchHotLabel.labelName)) {
                    TextView textView = new TextView(this.y);
                    textView.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTextSize(0, this.y.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12));
                    textView.setIncludeFontPadding(false);
                    textView.setGravity(17);
                    textView.setText(searchHotLabel.labelName);
                    int dimensionPixelSize = this.y.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6);
                    int i2 = dimensionPixelSize * 2;
                    textView.setPadding(i2, dimensionPixelSize, i2, dimensionPixelSize);
                    textView.setTextColor(this.y.getResources().getColor(R.color.wm_sc_nox_search_color_575859));
                    textView.setBackground(new e.a().e(h.a(this.y, 28.0f)).c(this.y.getResources().getColor(R.color.white)).a(h.a(this.y, 14.0f)).a());
                    textView.setTag(searchHotLabel);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.noresult.c.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0db02c74f70312073785aa71c081b2a4", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0db02c74f70312073785aa71c081b2a4");
                                return;
                            }
                            com.sankuai.waimai.store.manager.judas.b.a(c.this.y, "b_waimai_sg_zl9lnbxb_mc").a(DataConstants.INDEX, Integer.valueOf(searchHotLabel.index)).a("recommend_word", searchHotLabel.labelName).a("keyword", searchHotLabel.labelName).b(c.this.e).a();
                            c.this.c.a(new f.g(searchHotLabel.labelName));
                        }
                    });
                    this.b.addView(textView);
                }
            }
            if (this.b.getChildCount() == 0) {
                this.w.setVisibility(8);
                return;
            } else {
                this.b.post(new Runnable() { // from class: com.sankuai.waimai.store.search.template.noresult.c.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        NoResultNonDeliveryEntity.SearchHotLabel searchHotLabel2;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67abea7c59eb423b93aa72f97c3887cc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67abea7c59eb423b93aa72f97c3887cc");
                            return;
                        }
                        for (int i3 = 0; i3 < c.this.b.getChildCount(); i3++) {
                            View childAt = c.this.b.getChildAt(i3);
                            if (childAt.getVisibility() == 0 && (childAt.getTag() instanceof NoResultNonDeliveryEntity.SearchHotLabel) && !noResultNonDeliveryEntity2.isMeiShiLabelExposed && (searchHotLabel2 = (NoResultNonDeliveryEntity.SearchHotLabel) childAt.getTag()) != null) {
                                com.sankuai.waimai.store.manager.judas.b.b(c.this.y, "b_waimai_sg_zl9lnbxb_mv").a(DataConstants.INDEX, Integer.valueOf(searchHotLabel2.index)).a("recommend_word", searchHotLabel2.labelName).a("keyword", searchHotLabel2.labelName).b(c.this.e).a();
                            }
                        }
                        noResultNonDeliveryEntity2.isMeiShiLabelExposed = true;
                    }
                });
                return;
            }
        }
        this.w.setVisibility(8);
        this.b.removeAllViews();
    }

    public c(@NonNull Context context, SearchShareData searchShareData) {
        super(context);
        Object[] objArr = {context, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef872067602c0a25f53a413953f5721", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef872067602c0a25f53a413953f5721");
            return;
        }
        this.d = new HashMap();
        this.e = new HashMap();
        this.c = searchShareData;
        this.f = new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.y.getResources().getColor(R.color.wm_sc_nox_search_color_FFE14D), this.y.getResources().getColor(R.color.wm_sc_nox_search_color_FFC34D)}).a(h.a(this.y, 6.0f)).a();
        this.l = new e.a().b(h.a(this.y, 1.0f)).a(this.y.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000)).a(h.a(this.y, 6.0f)).a();
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27013876f8d82f5d766fdd799ee2b379", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27013876f8d82f5d766fdd799ee2b379");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_nox_search_nonresult_item, viewGroup, false);
        this.h = (TextView) inflate.findViewById(R.id.nonresult_text);
        this.i = (TextView) inflate.findViewById(R.id.nonresult_subtext);
        this.j = (TextView) inflate.findViewById(R.id.nonresult_button);
        this.k = (ImageView) inflate.findViewById(R.id.no_result_img);
        this.m = (TextView) inflate.findViewById(R.id.shangjia_text);
        this.n = (TextView) inflate.findViewById(R.id.shangjia_btn);
        this.o = (ImageView) inflate.findViewById(R.id.shangjia_icon);
        this.p = (ImageView) inflate.findViewById(R.id.shangjia_bg);
        this.q = inflate.findViewById(R.id.shangjia_layout);
        this.r = (TextView) inflate.findViewById(R.id.paotui_text);
        this.s = (TextView) inflate.findViewById(R.id.paotui_btn);
        this.t = (ImageView) inflate.findViewById(R.id.paotui_icon);
        this.u = (ImageView) inflate.findViewById(R.id.paotui_bg);
        this.v = inflate.findViewById(R.id.paotui_layout);
        this.w = inflate.findViewById(R.id.label_view);
        this.b = (SCSingleLineFlowLayout) inflate.findViewById(R.id.label_layout);
        return inflate;
    }
}
