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
import com.sankuai.xm.imui.session.view.adapter.IPubLinkMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PubLinkMsgView extends BaseCommonView<LinkMessage, IPubLinkMsgAdapter> {
    public static ChangeQuickRedirect a;
    private TextView s;
    private View t;
    private TextView u;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_pub_link_msg;
    }

    public PubLinkMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e8a1686751a31b28552e4d991d1a5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e8a1686751a31b28552e4d991d1a5f");
        }
    }

    private PubLinkMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94433939c82f8e40ce1aa03c7f2d044", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94433939c82f8e40ce1aa03c7f2d044");
        }
    }

    public PubLinkMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7585434b40fd1590353832b76488b838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7585434b40fd1590353832b76488b838");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<LinkMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea7f9f50f167b870b0ca4b7d2255023", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea7f9f50f167b870b0ca4b7d2255023");
            return;
        }
        this.t = view.findViewById(R.id.xm_sdk_img_chat_single_link_pic);
        this.s = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_single_link_title);
        this.u = (TextView) view.findViewById(R.id.xm_sdk_img_chat_single_link_detail);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96337caddd43464869f1c79484b0d79a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96337caddd43464869f1c79484b0d79a");
        } else if (TextUtils.isEmpty(((LinkMessage) this.n.b).getLink())) {
        } else {
            l.a(getContext(), ((LinkMessage) this.n.b).getLink());
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<LinkMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95fc92378ce63a95e6e1025ec953f032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95fc92378ce63a95e6e1025ec953f032");
            return;
        }
        setShowTimeStamp(true);
        super.a(bVar);
        this.s.setText(bVar.b.getTitle());
        String content = bVar.b.getContent();
        if (!TextUtils.isEmpty(content)) {
            this.u.setText(content);
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
        com.sankuai.xm.integration.imageloader.b.a(com.sankuai.xm.integration.imageloader.utils.a.b(bVar.b.getImage())).b(R.drawable.xm_sdk_img_default).c(R.drawable.xm_sdk_img_no_exist).a(1).a(this.t);
    }
}
