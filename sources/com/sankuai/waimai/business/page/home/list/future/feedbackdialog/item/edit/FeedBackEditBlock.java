package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.android.singleton.b;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.SubmitQuestionBean;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import io.agora.rtc.Constants;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeedBackEditBlock extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.a, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a> {
    public static ChangeQuickRedirect r;
    private static final int v = g.a(b.a, 14.0f);
    private static final int w = g.a(b.a, 8.0f);
    private TextView s;
    private EditText t;
    private long u;

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6359508b322a5dd6c5f00ae491dd207a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6359508b322a5dd6c5f00ae491dd207a") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.FeedBackEditBlock.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_home_feedback_edit_item;
            }
        };
    }

    @Keep
    public FeedBackEditBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13c5b0b12d372f7cde0250c697b5630", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13c5b0b12d372f7cde0250c697b5630");
        }
    }

    @Keep
    public FeedBackEditBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56432866bf2772726a2b8efa03d61958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56432866bf2772726a2b8efa03d61958");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70ef5d68ce6b0da3dd2845a9495b334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70ef5d68ce6b0da3dd2845a9495b334");
            return;
        }
        super.s();
        this.t = (EditText) this.g.a().findViewById(R.id.et_content);
        this.s = (TextView) this.g.a().findViewById(R.id.tv_title);
        this.t.setPadding(v, w, v, w);
        this.t.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.FeedBackEditBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2225c9bc7a3e560e2eb391754393360", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2225c9bc7a3e560e2eb391754393360")).booleanValue();
                }
                if (FeedBackEditBlock.this.t.canScrollVertically(-1) || FeedBackEditBlock.this.t.canScrollVertically(0)) {
                    if (motionEvent.getAction() == 0) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (1 == motionEvent.getAction()) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            }
        });
        this.t.setFilters(new InputFilter[]{new a(Constants.ERR_PUBLISH_STREAM_CDN_ERROR)});
        this.t.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.FeedBackEditBlock.3
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f933aa24af6099cd1773ee780101f23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f933aa24af6099cd1773ee780101f23");
                    return;
                }
                if (FeedBackEditBlock.this.t.getLineCount() > 4) {
                    FeedBackEditBlock.this.t.setPadding(FeedBackEditBlock.v, 0, FeedBackEditBlock.v, 0);
                } else {
                    FeedBackEditBlock.this.t.setPadding(FeedBackEditBlock.v, FeedBackEditBlock.w, FeedBackEditBlock.v, FeedBackEditBlock.w);
                }
                com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                StringBuilder sb = new StringBuilder();
                sb.append(FeedBackEditBlock.this.u);
                a2.a(sb.toString(), "text", editable.toString(), "", "", null);
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Map<String, String> answerToMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b484a87030acb6553febba22209ff88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b484a87030acb6553febba22209ff88");
            return;
        }
        super.I();
        QuestionBean e = ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.a) this.n).e();
        if (e != null) {
            this.u = e.questionId;
            if (!TextUtils.isEmpty(e.questionTitle)) {
                this.s.setVisibility(0);
                if (e.requiredField) {
                    this.s.setText(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.util.a.a(this.s.getContext(), e.questionTitle));
                } else {
                    this.s.setText(e.questionTitle);
                }
            } else {
                this.s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(e.q_shading)) {
                this.t.setHint(e.q_shading);
            }
            if (com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b) {
                com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                StringBuilder sb = new StringBuilder();
                sb.append(this.u);
                SubmitQuestionBean c = a2.c(sb.toString());
                if (c == null || (answerToMap = c.answerToMap()) == null || !answerToMap.containsKey("text")) {
                    return;
                }
                this.t.setText(answerToMap.get("text"));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements InputFilter {
        public static ChangeQuickRedirect a;
        private int c;

        public a(int i) {
            Object[] objArr = {FeedBackEditBlock.this, Integer.valueOf((int) Constants.ERR_PUBLISH_STREAM_CDN_ERROR)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aad7011d9a0649388e2d316a134ea6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aad7011d9a0649388e2d316a134ea6d");
            } else {
                this.c = MapConstant.ANIMATION_DURATION_SHORT;
            }
        }

        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f690f881b5a3efdda8627815ce01e73", RobustBitConfig.DEFAULT_VALUE)) {
                return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f690f881b5a3efdda8627815ce01e73");
            }
            int length = this.c - (spanned.length() - (i4 - i3));
            int i5 = i2 - i;
            if (length < i5) {
                ae.b(((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) FeedBackEditBlock.this.F()).b(), "字数已到上限");
            }
            if (length <= 0) {
                return "";
            }
            if (length >= i5) {
                return null;
            }
            return charSequence.subSequence(i, length + i);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec1421aea142ce99004493cd8b67654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec1421aea142ce99004493cd8b67654");
        } else {
            super.y();
        }
    }
}
