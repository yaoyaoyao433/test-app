package com.sankuai.xm.imui.common.view.message;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultInnerMsgSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    protected ProgressBar b;
    private TextView e;
    private ICommonStatusAdapter f;

    public DefaultInnerMsgSideView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd034564498577212bfda79b515d298b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd034564498577212bfda79b515d298b");
        }
    }

    public DefaultInnerMsgSideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc2b2d9e706b2ef70d9283b7525c7a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc2b2d9e706b2ef70d9283b7525c7a9");
        }
    }

    public DefaultInnerMsgSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776580edd33dc3c810a9d2bb61225b5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776580edd33dc3c810a9d2bb61225b5d");
            return;
        }
        inflate(context, R.layout.xm_sdk_msg_default_inner_side_layout, this);
        this.e = (TextView) findViewById(R.id.xm_sdk_status_text);
        this.f = b.b(this);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        int progressBarResource;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d2ab82ab7bba905c9259348680ec852", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d2ab82ab7bba905c9259348680ec852");
            return;
        }
        super.a(bVar);
        l.a(this.b);
        inflate(getContext(), R.layout.xm_sdk_chat_progress_bar, this);
        this.b = (ProgressBar) findViewById(R.id.xm_sdk_progress_chat_msg_sending);
        if (this.f == null || (progressBarResource = this.f.getProgressBarResource(getMessage())) == 0) {
            return;
        }
        this.b.setIndeterminateDrawable(getResources().getDrawable(progressBarResource));
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void d(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626c0a5e06a7d0ea46ef1a94bce7a0ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626c0a5e06a7d0ea46ef1a94bce7a0ab");
            return;
        }
        a();
        if (getMessage().b.getMsgStatus() != 14) {
            l.a(8, this.b);
            return;
        }
        l.a(0, this.b);
        l.a(8, this.e);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void e(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bea542c5039382a8603fa380c293c448", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bea542c5039382a8603fa380c293c448");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cbedb6ff658ca5153be2d7536a91a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cbedb6ff658ca5153be2d7536a91a5");
        } else if (this.f == null || getContext() == null) {
        } else {
            if (this.f.getMsgStatusVisibility(getMessage()) != 0) {
                this.e.setVisibility(8);
                return;
            }
            this.e.setText((CharSequence) null);
            this.e.setTextColor(this.f.getMsgStatusTextColor(getMessage()));
            if (getMessage().b.getMsgStatus() == 16) {
                this.e.setVisibility(0);
                this.e.setText(R.string.xm_sdk_recall_fail);
                this.e.setEnabled(false);
            } else if (IMUIManager.f() && getMessage().g == 2) {
                this.e.setEnabled(true);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.view.message.DefaultInnerMsgSideView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb25264adc4116c7e1dda8df15864905", 6917529027641081858L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb25264adc4116c7e1dda8df15864905");
                        } else {
                            DefaultInnerMsgSideView.this.f.onMsgStatusClick(DefaultInnerMsgSideView.this.e, DefaultInnerMsgSideView.this.getMessage());
                        }
                    }
                });
                if (getMessage().b.getCategory() == 2) {
                    if (getMessage().j == 1) {
                        this.e.setText(R.string.xm_sdk_msg_receipt_status_all_read);
                    } else if (getMessage().j == 3) {
                        this.e.setText(R.string.xm_sdk_msg_receipt_status_part_read);
                    } else {
                        this.e.setText(R.string.xm_sdk_msg_receipt_status_all_unread);
                    }
                } else if (getMessage().i <= 0) {
                    this.e.setText(R.string.xm_sdk_msg_receipt_status_read);
                } else {
                    this.e.setText(R.string.xm_sdk_msg_receipt_status_unread);
                }
            } else if (getMessage().b.isReceipt()) {
                this.e.setVisibility(0);
                if (getMessage().g == 2) {
                    this.e.setEnabled(true);
                    this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.view.message.DefaultInnerMsgSideView.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "517c964c99148e1750d71458444738d9", 6917529027641081858L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "517c964c99148e1750d71458444738d9");
                            } else {
                                DefaultInnerMsgSideView.this.f.onMsgStatusClick(DefaultInnerMsgSideView.this.e, DefaultInnerMsgSideView.this.getMessage());
                            }
                        }
                    });
                    if (MessageUtils.isIMPeerService(getMessage().b.getCategory())) {
                        if (getMessage().h < 0) {
                            this.e.setText(R.string.xm_sdk_msg_receipt_status_unread);
                        } else if (getMessage().h == 0) {
                            this.e.setText(R.string.xm_sdk_msg_receipt_status_read);
                        } else {
                            this.e.setText(R.string.xm_sdk_msg_receipt_status_unread);
                        }
                    }
                } else {
                    this.e.setEnabled(false);
                    if (getMessage().b.getMsgStatus() == 17) {
                        this.e.setText(R.string.xm_sdk_msg_receipt_status_read);
                    } else {
                        this.e.setText("");
                    }
                }
            } else {
                this.e.setVisibility(8);
            }
            l.a(TextUtils.isEmpty(this.e.getText()) ? 8 : 0, this.e, this);
        }
    }
}
