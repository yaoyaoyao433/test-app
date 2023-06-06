package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IUnknownMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UnknownMsgView extends BaseCommonView<UNKnownMessage, IUnknownMsgAdapter> {
    public static ChangeQuickRedirect a;
    private LinkTextView s;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_unknown_msg;
    }

    public UnknownMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c0746acd3b7ce8d0bb6ef2f91a1c8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c0746acd3b7ce8d0bb6ef2f91a1c8f");
        }
    }

    private UnknownMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da205b9300fbd5cbeaec9db9319e42c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da205b9300fbd5cbeaec9db9319e42c3");
        }
    }

    public UnknownMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b929c723f38874af77705402851fa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b929c723f38874af77705402851fa9");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<UNKnownMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "973c7f3bdb6e3d5a9495252f028fc61c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "973c7f3bdb6e3d5a9495252f028fc61c");
            return;
        }
        this.s = (LinkTextView) view.findViewById(R.id.xm_sdk_tv_chat_txt_msg);
        a(this.s, (b) bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<UNKnownMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3582d1b89bf2f571e99e2cfdda0aeca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3582d1b89bf2f571e99e2cfdda0aeca");
            return;
        }
        super.a(bVar);
        a(this.s, ((IUnknownMsgAdapter) this.r).getTipMsg(getMessage()));
    }
}
