package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewStub;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.datarequest.dealfilter.Filter;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeedBackMultiChoiceBlock extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, b, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a> {
    public static ChangeQuickRedirect r;
    private RecyclerView s;
    private TextView t;
    private a u;

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961a3e3ac16c785e43a15ad83e45e12d", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961a3e3ac16c785e43a15ad83e45e12d") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.FeedBackMultiChoiceBlock.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_home_feedback_checkbox_list;
            }
        };
    }

    @Keep
    public FeedBackMultiChoiceBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f312dde3d77e1a2a56f72f75b0d0bdb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f312dde3d77e1a2a56f72f75b0d0bdb1");
        }
    }

    @Keep
    public FeedBackMultiChoiceBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ea6b214551d54ad0cfd1dcc539f95f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ea6b214551d54ad0cfd1dcc539f95f");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bda6437b755a4c94865f57e902b5f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bda6437b755a4c94865f57e902b5f6");
            return;
        }
        super.s();
        this.t = (TextView) this.g.a().findViewById(R.id.tv_title);
        this.s = (RecyclerView) this.g.a().findViewById(R.id.rv_checkbox);
        this.s.setLayoutManager(new LinearLayoutManager(m(), 1, false));
        this.u = new a();
        this.s.setAdapter(this.u);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf40de31f16096b15a831d26ffa40b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf40de31f16096b15a831d26ffa40b0c");
            return;
        }
        super.I();
        QuestionBean e = ((b) this.n).e();
        this.t.setText(e.questionTitle);
        if (e.requiredField) {
            this.t.setText(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.util.a.a(this.t.getContext(), e.questionTitle));
        } else {
            this.t.setText(e.questionTitle);
        }
        a aVar = this.u;
        Object[] objArr2 = {e};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d3393f3b8d0ab271d76103f33f01eecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d3393f3b8d0ab271d76103f33f01eecb");
            return;
        }
        aVar.d = e.questionType;
        aVar.b = e.getMapAnswers();
        aVar.e = e.questionId;
        if (aVar.b != null) {
            aVar.c = aVar.b.keySet();
        }
        aVar.notifyDataSetChanged();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02cf1b1d23bdbacbd5538896cd27045a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02cf1b1d23bdbacbd5538896cd27045a");
            return;
        }
        super.y();
        com.sankuai.waimai.foundation.utils.log.a.b("FeedBackExpose", Filter.SHOWTYPE_CHECKBOX, new Object[0]);
    }
}
