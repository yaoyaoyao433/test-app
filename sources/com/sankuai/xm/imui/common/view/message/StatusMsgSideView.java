package com.sankuai.xm.imui.common.view.message;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class StatusMsgSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    protected ImageView b;
    protected ProgressBar e;
    private ICommonStatusAdapter f;

    public StatusMsgSideView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6563bde5fbde7146e3d04721f47cd043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6563bde5fbde7146e3d04721f47cd043");
        }
    }

    public StatusMsgSideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2563fdd55ddff0bb978d2ce7d4e17347", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2563fdd55ddff0bb978d2ce7d4e17347");
        }
    }

    public StatusMsgSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc3fd87be8b024bf2688fce08119313", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc3fd87be8b024bf2688fce08119313");
            return;
        }
        inflate(context, R.layout.xm_sdk_msg_status_layout, this);
        this.b = (ImageView) findViewById(R.id.xm_sdk_img_chat_msg_send_failed);
        this.f = b.b(this);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e038090cc1955f5b4209e3b9e7231c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e038090cc1955f5b4209e3b9e7231c");
            return;
        }
        super.a(bVar);
        l.a(this.e);
        inflate(getContext(), R.layout.xm_sdk_chat_progress_bar, this);
        this.e = (ProgressBar) findViewById(R.id.xm_sdk_progress_chat_msg_sending);
        if (this.f == null) {
            return;
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.view.message.StatusMsgSideView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2417278ce97b147d4f0253faebfe85e", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2417278ce97b147d4f0253faebfe85e");
                } else {
                    StatusMsgSideView.this.f.onMsgFailTipClick(StatusMsgSideView.this.b, StatusMsgSideView.this.getMessage());
                }
            }
        });
        int progressBarResource = this.f.getProgressBarResource(getMessage());
        if (progressBarResource != 0) {
            this.e.setIndeterminateDrawable(android.support.v7.content.res.b.b(getContext(), progressBarResource));
        }
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void d(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5125f718eff7e4ec755a23fabf7c320c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5125f718eff7e4ec755a23fabf7c320c");
            return;
        }
        int msgStatus = getMessage().b.getMsgStatus();
        if (msgStatus != 14) {
            switch (msgStatus) {
                case 3:
                    break;
                case 4:
                    l.a(0, this.b, this);
                    l.a(8, this.e);
                    return;
                default:
                    l.a(8, this.b, this.e, this);
                    return;
            }
        }
        l.a(0, this.e, this);
        l.a(8, this.b);
    }
}
