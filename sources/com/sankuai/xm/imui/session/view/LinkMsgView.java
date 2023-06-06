package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.LinkMessage;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ILinkMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LinkMsgView extends BaseCommonView<LinkMessage, ILinkMsgAdapter> {
    public static ChangeQuickRedirect a;
    private TextView s;
    private View t;
    private TextView u;
    private TextView v;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_link_msg;
    }

    public LinkMsgView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba4e61abda2f529074bf1ac98f306f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba4e61abda2f529074bf1ac98f306f5");
        } else {
            this.v = null;
        }
    }

    public LinkMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e42f333f16ba78d5fa1fab68e4bc9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e42f333f16ba78d5fa1fab68e4bc9e");
        } else {
            this.v = null;
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<LinkMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f4215d92294b6467d1ce0e57bb70f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f4215d92294b6467d1ce0e57bb70f1");
            return;
        }
        this.t = view.findViewById(R.id.xm_sdk_img_chat_single_link_pic);
        this.s = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_single_link_title);
        this.u = (TextView) view.findViewById(R.id.xm_sdk_img_chat_single_link_detail);
        this.v = (TextView) view.findViewById(R.id.xm_sdk_other_msg_kind);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d53baf00d379102991e49dfec0d8933f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d53baf00d379102991e49dfec0d8933f");
        } else if (TextUtils.isEmpty(((LinkMessage) this.n.b).getLink())) {
        } else {
            l.a(getContext(), ((LinkMessage) this.n.b).getLink());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.xm.imui.session.entity.b<com.sankuai.xm.im.message.bean.LinkMessage> r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.session.view.LinkMsgView.a(com.sankuai.xm.imui.session.entity.b):void");
    }
}
