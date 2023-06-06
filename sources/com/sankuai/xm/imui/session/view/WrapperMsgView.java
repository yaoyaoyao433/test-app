package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WrapperMsgView<M extends IMMessage, CA extends IExtraViewAdapter<M>> extends BaseCommonView<M, CA> {
    public static ChangeQuickRedirect a;
    private View s;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return 0;
    }

    public WrapperMsgView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1598323db40ba96f3dc15986b91ec0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1598323db40ba96f3dc15986b91ec0");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<M> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e161415e38b2df6b7ee722ae6be12059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e161415e38b2df6b7ee722ae6be12059");
        } else if (this.r != 0) {
            ViewGroup viewGroup = (ViewGroup) view;
            this.s = ((IExtraViewAdapter) this.r).createView(this.o, bVar, viewGroup);
            View view2 = this.s;
            if (view2 == view && viewGroup.getChildCount() > 0) {
                view2 = viewGroup.getChildAt(0);
            }
            if ("XM_SDK_CUSTOM_MAX_WIDTH".equals(view2.getTag()) || "XM_SDK_CUSTOM_MAX_WIDTH".equals(view2.getTag(R.id.xm_sdk_msg_layout_tag))) {
                this.e = false;
            }
            if (this.s.getParent() == null) {
                viewGroup.addView(this.s);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<M> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e064cf30235069454060366ef234d90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e064cf30235069454060366ef234d90");
            return;
        }
        super.a(bVar);
        if (this.r != 0) {
            ((IExtraViewAdapter) this.r).bindView(this.s, bVar);
        }
    }
}
