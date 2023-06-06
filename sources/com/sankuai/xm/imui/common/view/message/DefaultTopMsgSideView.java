package com.sankuai.xm.imui.common.view.message;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultTopMsgSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private TextView b;

    public DefaultTopMsgSideView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045cef5ca9767237558c3a14597c2958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045cef5ca9767237558c3a14597c2958");
        }
    }

    public DefaultTopMsgSideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e40a6d84cf3a844999428ef8773c7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e40a6d84cf3a844999428ef8773c7c");
        }
    }

    public DefaultTopMsgSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28be53e4e9a1d0021b6d248d5658c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28be53e4e9a1d0021b6d248d5658c2b");
            return;
        }
        inflate(context, R.layout.xm_sdk_msg_default_top_side_layout, this);
        this.b = (TextView) findViewById(R.id.xm_sdk_msg_nick_name);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a3df5f8531a7d3cc3c9a7e90319b19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a3df5f8531a7d3cc3c9a7e90319b19");
            return;
        }
        super.a(bVar);
        f(bVar);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView
    public final void c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89de4c0c5ac6899169c715268eff95a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89de4c0c5ac6899169c715268eff95a");
            return;
        }
        super.c(bVar);
        f(bVar);
    }

    private void f(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46004b7768cd1fe29ba57fdce58c7d3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46004b7768cd1fe29ba57fdce58c7d3d");
            return;
        }
        ICommonAdapter b = com.sankuai.xm.imui.session.b.b(this);
        int nickNameVisibility = b == null ? 8 : b.getNickNameVisibility(bVar);
        l.a(nickNameVisibility, this.b);
        if (nickNameVisibility != 0) {
            return;
        }
        if (bVar != null && !TextUtils.isEmpty(bVar.d)) {
            this.b.setText(bVar.d);
        } else {
            this.b.setText("");
        }
    }
}
