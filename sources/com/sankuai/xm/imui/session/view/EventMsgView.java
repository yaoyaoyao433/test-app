package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.common.processors.f;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IEventMsgAdapter;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EventMsgView extends BaseCommonView<EventMessage, IEventMsgAdapter> {
    public static ChangeQuickRedirect a;
    private LinkTextView s;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_event_msg;
    }

    public EventMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b19d3f8771e7e0206df67e7f021e885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b19d3f8771e7e0206df67e7f021e885");
        }
    }

    private EventMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4027b23f6dd5cd239d919412d6606e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4027b23f6dd5cd239d919412d6606e");
        }
    }

    public EventMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9e62976b5fceea69a1bc89e2f32670", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9e62976b5fceea69a1bc89e2f32670");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<EventMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6cd3a1c659145a44932528476c0d45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6cd3a1c659145a44932528476c0d45");
            return;
        }
        this.s = (LinkTextView) view;
        a(this.s, (b) bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<EventMessage> bVar) {
        String text;
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d50ea119ac2ff0f5ee1f9317ec2f94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d50ea119ac2ff0f5ee1f9317ec2f94");
            return;
        }
        super.a(bVar);
        if (this.r != 0) {
            text = ((IEventMsgAdapter) this.r).getShowText(bVar);
        } else {
            text = ((EventMessage) this.n.b).getText();
        }
        int i = -1;
        Set<String> hashSet = new HashSet<>();
        ICommonAdapter b = com.sankuai.xm.imui.session.b.b(this);
        if (b != null) {
            i = b.getLinkColor(bVar);
            z = b.hasLinkTextUnderLine(bVar);
            hashSet = b.getTextLinkSchema();
        }
        this.s.setText(f.b().a().a(z).a(i).a(hashSet).b(getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_event_msg_text_size)).a(text));
    }
}
