package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.rate;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.rate.RooRatingBar;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeedBackRateBlock extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, a, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a> {
    public static ChangeQuickRedirect r;
    private TextView s;
    private TextView t;
    private long u;
    private RooRatingBar v;

    public static /* synthetic */ String a(FeedBackRateBlock feedBackRateBlock, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, feedBackRateBlock, changeQuickRedirect, false, "51be54fb6186670fb8a4bc2f298ee780", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, feedBackRateBlock, changeQuickRedirect, false, "51be54fb6186670fb8a4bc2f298ee780") : f == 1.0f ? "\\\"非常不满意\\\"" : f == 2.0f ? "\\\"不满意\\\"" : f == 3.0f ? "\\\"一般\\\"" : f == 4.0f ? "\\\"满意\\\"" : f == 5.0f ? "\\\"非常满意\\\"" : "";
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d382ecdc6dd642d50859e4df2dd22e6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d382ecdc6dd642d50859e4df2dd22e6") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.rate.FeedBackRateBlock.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_home_feedback_rate;
            }
        };
    }

    @Keep
    public FeedBackRateBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9edecff330b6ff0b5975e23e8f75021", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9edecff330b6ff0b5975e23e8f75021");
        }
    }

    @Keep
    public FeedBackRateBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8a2071b2829a9c3bd6bf162d75d8f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8a2071b2829a9c3bd6bf162d75d8f0");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff508773c7549a71d808d0bffadfd3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff508773c7549a71d808d0bffadfd3c3");
            return;
        }
        super.s();
        this.s = (TextView) this.g.a().findViewById(R.id.tv_title);
        this.t = (TextView) this.g.a().findViewById(R.id.tv_rate_level);
        this.v = (RooRatingBar) this.g.a().findViewById(R.id.rb_rate);
        this.v.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.rate.FeedBackRateBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                Object[] objArr2 = {ratingBar, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84ea31ad41132a8ef81a2dd25c3e48f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84ea31ad41132a8ef81a2dd25c3e48f4");
                    return;
                }
                FeedBackRateBlock.this.t.setText(FeedBackRateBlock.a(FeedBackRateBlock.this, f));
                com.sankuai.waimai.foundation.utils.log.a.b("FeedBackRateBlock", "onRatingChanged: " + f, new Object[0]);
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b44a9a359e4a5dc8ea4202e9c07eb43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b44a9a359e4a5dc8ea4202e9c07eb43");
            return;
        }
        super.I();
        QuestionBean e = ((a) this.n).e();
        if (e != null) {
            this.u = e.questionId;
            if (!TextUtils.isEmpty(e.questionTitle)) {
                this.s.setVisibility(0);
                if (e.requiredField) {
                    this.s.setText(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.util.a.a(this.s.getContext(), e.questionTitle));
                    return;
                } else {
                    this.s.setText(e.questionTitle);
                    return;
                }
            }
            this.s.setVisibility(8);
        }
    }
}
