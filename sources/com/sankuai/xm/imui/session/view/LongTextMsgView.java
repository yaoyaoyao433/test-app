package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ILongTextMsgAdapter;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LongTextMsgView extends BaseCommonView<FileMessage, ILongTextMsgAdapter> {
    public static ChangeQuickRedirect a;
    private TextView s;
    private TextView t;
    private LinkTextView u;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_long_text_content;
    }

    public LongTextMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021934cf8d4afaf0408cfc8bb31a8bf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021934cf8d4afaf0408cfc8bb31a8bf9");
        }
    }

    private LongTextMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db5e5f6e57f69c83fc8412411848f31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db5e5f6e57f69c83fc8412411848f31");
        }
    }

    public LongTextMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dea423a0296eef68a040a4732ec3e3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dea423a0296eef68a040a4732ec3e3d");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<FileMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d05520a8a4ea03eee6db8c3936a7fa9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d05520a8a4ea03eee6db8c3936a7fa9d");
            return;
        }
        this.u = (LinkTextView) view.findViewById(R.id.xm_sdk_tv_chat_long_text_describe);
        this.s = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_long_text_more);
        this.t = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_long_text_link);
        a(this.u, (b) bVar);
        float textFontSize = this.q.getTextFontSize(bVar);
        this.s.setTextSize(0, textFontSize);
        this.t.setTextSize(0, textFontSize);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f59199e6e05576b69615ba6333b0ce79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f59199e6e05576b69615ba6333b0ce79");
        } else {
            FileMsgView.a(getContext(), (FileMessage) this.n.b);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<FileMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e927ec747e11f7c1c5e42d7407a2c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e927ec747e11f7c1c5e42d7407a2c4");
            return;
        }
        super.a(bVar);
        if (TextUtils.isEmpty(bVar.b.getExtension())) {
            return;
        }
        try {
            JSONObject longTextInfo = MessageUtils.getLongTextInfo(bVar.b);
            if (longTextInfo != null) {
                if (longTextInfo.has("description")) {
                    a(this.u, (String) longTextInfo.get("description"));
                }
                if (longTextInfo.has("length")) {
                    this.s.setText(this.o.getString(R.string.xm_sdk_char_2_show, longTextInfo.get("length")));
                }
                this.t.setText(Html.fromHtml(this.o.getString(R.string.xm_sdk_msg_long_text_click_see_all)));
            }
        } catch (Exception e) {
            com.sankuai.xm.monitor.statistics.a.a("imui", "LongTextMsgView::bingView", e);
            d.d("ChatLongTextMsgView.dealView,parse message.extension ex,ex=" + e.toString(), new Object[0]);
        }
    }
}
