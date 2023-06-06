package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.rate.RooRatingBar;
import com.sankuai.waimai.platform.domain.core.comment.BasePoiCommentResponse;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentDianping;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentScore;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    private boolean A;
    private LinearLayout b;
    private View c;
    private TextView d;
    private RooRatingBar e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private ViewGroup j;
    private TextView k;
    private TextView l;
    private LinearLayout m;
    private ImageView n;
    private TextView o;
    private TextView p;
    private View q;
    private TextView r;
    private LinearLayout s;
    private TextView t;
    private TextView u;
    private LinearLayout v;
    private View w;

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0993409a747ed13f2548eaa1cccfb27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0993409a747ed13f2548eaa1cccfb27");
        } else {
            this.A = com.sankuai.waimai.business.restaurant.poicontainer.b.P();
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f8448a2da55582894ebf58d9d64b33", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f8448a2da55582894ebf58d9d64b33");
        }
        this.q = layoutInflater.inflate(R.layout.wm_comment_poi_layout_score_info, viewGroup, false);
        this.b = (LinearLayout) this.q.findViewById(R.id.score_header_tips);
        this.o = (TextView) this.q.findViewById(R.id.wm_non_score_text_up);
        this.p = (TextView) this.q.findViewById(R.id.wm_non_score_text_bot);
        this.j = (ViewGroup) this.q.findViewById(R.id.layout_dianping_comment_info);
        this.k = (TextView) this.j.findViewById(R.id.txt_dianping_left);
        this.l = (TextView) this.j.findViewById(R.id.txt_dianping_right);
        this.c = this.q.findViewById(R.id.layout_comment_score);
        this.s = (LinearLayout) this.q.findViewById(R.id.store_score_layout);
        this.d = (TextView) this.q.findViewById(R.id.txt_poi_comment_total_score);
        this.e = (RooRatingBar) this.q.findViewById(R.id.rating_poi_comment_quality_score);
        this.t = (TextView) this.q.findViewById(R.id.rating_poi_comment_quality_score_text);
        this.f = (TextView) this.q.findViewById(R.id.txt_poi_comment_quality_score);
        this.g = (TextView) this.q.findViewById(R.id.txt_poi_comment_quality_label);
        this.h = (TextView) this.q.findViewById(R.id.txt_poi_comment_package_score);
        this.r = (TextView) this.q.findViewById(R.id.txt_poi_comment_package_label);
        this.i = (TextView) this.q.findViewById(R.id.txt_poi_comment_ship_score);
        this.u = (TextView) this.q.findViewById(R.id.delivery_satisfaction);
        this.m = (LinearLayout) this.q.findViewById(R.id.delivery_score);
        this.n = (ImageView) this.q.findViewById(R.id.driver_line);
        this.v = (LinearLayout) this.q.findViewById(R.id.poi_layout_score);
        this.w = this.q.findViewById(R.id.hidden_line01);
        return this.q;
    }

    public final void a(@NonNull BasePoiCommentResponse basePoiCommentResponse, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        PoiCommentDianping poiCommentDianping;
        Object[] objArr = {basePoiCommentResponse, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad16e9b571e8323b5662b24325979782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad16e9b571e8323b5662b24325979782");
            return;
        }
        if ((basePoiCommentResponse.tabs == null || basePoiCommentResponse.tabs.size() == 0) && (basePoiCommentResponse.score == null || !basePoiCommentResponse.score.show())) {
            this.q.setVisibility(8);
            return;
        }
        this.q.setVisibility(0);
        if (basePoiCommentResponse.score != null && basePoiCommentResponse.score.show()) {
            PoiCommentScore poiCommentScore = basePoiCommentResponse.score;
            boolean isFood = basePoiCommentResponse.isFood();
            Object[] objArr2 = {poiCommentScore, Byte.valueOf(isFood ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad76db527b28482facbae0d8b067fc65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad76db527b28482facbae0d8b067fc65");
            } else {
                this.c.setVisibility(0);
                this.d.setText(poiCommentScore.commentScore <= 0.0d ? this.y.getResources().getString(R.string.wm_comment_no_num) : com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(poiCommentScore.commentScore), 1, 1));
                if (poiCommentScore.packScore <= 0.0d) {
                    this.h.setText(this.y.getResources().getString(R.string.wm_comment_no_num));
                    this.h.setTextSize(12.0f);
                } else {
                    this.h.setTextSize(16.0f);
                    this.h.setText(com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(poiCommentScore.packScore), 1, 1));
                }
                this.g.setText(isFood ? R.string.wm_restaurant_flavor : R.string.wm_restaurant_quality);
                if (poiCommentScore.qualityScore <= 0.0d) {
                    this.f.setTextSize(12.0f);
                    this.f.setText(this.y.getResources().getString(R.string.wm_comment_no_num));
                } else {
                    this.f.setTextSize(16.0f);
                    this.f.setText(com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(poiCommentScore.qualityScore), 1, 1));
                }
                if (poiCommentScore.commentScore <= 0.0d) {
                    this.e.setRating(0.0f);
                } else {
                    this.e.setRating((float) poiCommentScore.commentScore);
                }
                if (!TextUtils.isEmpty(poiCommentScore.deliverySatisfactionRate)) {
                    this.i.setText(poiCommentScore.deliverySatisfactionRate);
                    this.i.setTextSize(16.0f);
                } else {
                    this.i.setTextSize(12.0f);
                    this.i.setText(this.y.getResources().getString(R.string.wm_comment_no_num));
                }
            }
            a();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "171f9b723c20ea6798437c078b837ba1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "171f9b723c20ea6798437c078b837ba1");
            } else {
                this.c.setVisibility(8);
            }
            if (!TextUtils.isEmpty(basePoiCommentResponse.commentTip) && !TextUtils.isEmpty(basePoiCommentResponse.commentTipInfo)) {
                String str = basePoiCommentResponse.commentTip;
                String str2 = basePoiCommentResponse.commentTipInfo;
                Object[] objArr4 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a9ebb8fb458d166db5b451ef266d7554", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a9ebb8fb458d166db5b451ef266d7554");
                } else {
                    this.o.setText(str);
                    this.p.setText(str2);
                    this.b.setVisibility(0);
                }
            } else {
                a();
            }
        }
        boolean z = true;
        Object[] objArr5 = {basePoiCommentResponse};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "14403c3099096fb4fa120847467baf64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "14403c3099096fb4fa120847467baf64");
        } else {
            if (com.sankuai.waimai.foundation.utils.b.b(basePoiCommentResponse.scoreTypeInfos) && com.sankuai.waimai.foundation.utils.b.b(basePoiCommentResponse.labels) && com.sankuai.waimai.foundation.utils.b.b(basePoiCommentResponse.tabs) && (poiCommentDianping = basePoiCommentResponse.commentsDianping) != null && poiCommentDianping.show() && !TextUtils.isEmpty(poiCommentDianping.accurateCommentScoreTitle)) {
                this.k.setText(poiCommentDianping.accurateCommentScoreTitle);
                this.l.setText(poiCommentDianping.totalCountDesc);
            } else {
                z = false;
            }
            this.j.setVisibility(z ? 0 : 8);
        }
        if (gVar.k) {
            this.m.setVisibility(4);
            this.n.setVisibility(4);
        } else {
            this.m.setVisibility(0);
            this.n.setVisibility(0);
        }
        if (this.A) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams.height = com.sankuai.waimai.foundation.utils.g.a(this.y, 90.0f);
            this.c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.v.getLayoutParams();
            layoutParams2.setMargins(com.sankuai.waimai.foundation.utils.g.a(this.y, 12.0f), com.sankuai.waimai.foundation.utils.g.a(this.y, 20.0f), com.sankuai.waimai.foundation.utils.g.a(this.y, 12.0f), com.sankuai.waimai.foundation.utils.g.a(this.y, 20.0f));
            this.v.setLayoutParams(layoutParams2);
            this.d.setTextSize(34.0f);
            this.t.setTextSize(18.0f);
            this.g.setTextSize(18.0f);
            this.f.setTextSize(22.0f);
            this.r.setTextSize(18.0f);
            this.h.setTextSize(22.0f);
            this.u.setTextSize(18.0f);
            this.i.setTextSize(22.0f);
            this.n.setVisibility(4);
            this.w.setVisibility(8);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1134201403f73a13e6faedfcb4aea2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1134201403f73a13e6faedfcb4aea2f2");
        } else {
            this.b.setVisibility(8);
        }
    }
}
