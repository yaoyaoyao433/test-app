package com.sankuai.waimai.business.im.group.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BadCommentGroupChatReadView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private TextView b;
    private ProgressBar e;
    private ICommonStatusAdapter f;

    public BadCommentGroupChatReadView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c2a3f1329adb8b7b3d6965bef70bf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c2a3f1329adb8b7b3d6965bef70bf6");
        }
    }

    public BadCommentGroupChatReadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11e1d3e9c081b525e5b7e78c070d6f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11e1d3e9c081b525e5b7e78c070d6f3");
        }
    }

    public BadCommentGroupChatReadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47bdcfcd49985ad0980b31a6ccfb19de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47bdcfcd49985ad0980b31a6ccfb19de");
            return;
        }
        inflate(context, R.layout.wm_im_bad_comment_group_chat_read_view_layout, this);
        this.b = (TextView) findViewById(R.id.read_view_status_text);
        this.f = b.b(this);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        int progressBarResource;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e64d5072ba0d81ab8dc8d20ff6f78f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e64d5072ba0d81ab8dc8d20ff6f78f6");
            return;
        }
        super.a(bVar);
        l.a(this.e);
        inflate(getContext(), R.layout.xm_sdk_chat_progress_bar, this);
        this.e = (ProgressBar) findViewById(R.id.xm_sdk_progress_chat_msg_sending);
        if (this.f == null || (progressBarResource = this.f.getProgressBarResource(getMessage())) == 0) {
            return;
        }
        this.e.setIndeterminateDrawable(getResources().getDrawable(progressBarResource));
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void d(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb44b4571f8846e5e5f146e2e6c3722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb44b4571f8846e5e5f146e2e6c3722");
            return;
        }
        a();
        if (getMessage().b.getMsgStatus() != 14) {
            l.a(8, this.e);
            return;
        }
        l.a(0, this.e);
        l.a(8, this.b);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void e(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340804db95e92f3e051f2426b05a1846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340804db95e92f3e051f2426b05a1846");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de31b2c0e283d1f03388dcfdc8c18855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de31b2c0e283d1f03388dcfdc8c18855");
        } else if (this.f == null || getContext() == null) {
        } else {
            if (this.f.getMsgStatusVisibility(getMessage()) != 0) {
                this.b.setVisibility(8);
                return;
            }
            this.b.setText((CharSequence) null);
            this.b.setTextColor(this.f.getMsgStatusTextColor(getMessage()));
            if (getMessage().b.getMsgStatus() == 16) {
                this.b.setVisibility(0);
                this.b.setText(R.string.xm_sdk_recall_fail);
                this.b.setEnabled(false);
            } else if (IMUIManager.f() && getMessage().g == 2) {
                this.b.setEnabled(true);
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.view.BadCommentGroupChatReadView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63b391a6086bd61f5c2afe7794febc5c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63b391a6086bd61f5c2afe7794febc5c");
                        } else {
                            BadCommentGroupChatReadView.this.f.onMsgStatusClick(BadCommentGroupChatReadView.this.b, BadCommentGroupChatReadView.this.getMessage());
                        }
                    }
                });
                if (getMessage().b.getCategory() == 2) {
                    if (getMessage().j == 1) {
                        this.b.setText("已读");
                    } else if (getMessage().j == 3) {
                        this.b.setText("已读");
                    } else {
                        this.b.setText("未读");
                    }
                } else if (getMessage().i <= 0) {
                    this.b.setText(R.string.xm_sdk_msg_receipt_status_read);
                } else {
                    this.b.setText(R.string.xm_sdk_msg_receipt_status_unread);
                }
            } else if (getMessage().b.isReceipt()) {
                this.b.setVisibility(0);
                if (getMessage().g == 2) {
                    this.b.setEnabled(true);
                    this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.view.BadCommentGroupChatReadView.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e7b9dfd9b02aae32f584471ffe6a6a5", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e7b9dfd9b02aae32f584471ffe6a6a5");
                            } else {
                                BadCommentGroupChatReadView.this.f.onMsgStatusClick(BadCommentGroupChatReadView.this.b, BadCommentGroupChatReadView.this.getMessage());
                            }
                        }
                    });
                    if (getMessage().b.getCategory() == 1) {
                        if (getMessage().h < 0) {
                            this.b.setText(R.string.xm_sdk_msg_receipt_status_unread);
                        } else if (getMessage().h == 0) {
                            this.b.setText(R.string.xm_sdk_msg_receipt_status_read);
                        } else {
                            this.b.setText(R.string.xm_sdk_msg_receipt_status_unread);
                        }
                    }
                } else {
                    this.b.setEnabled(false);
                    if (getMessage().b.getMsgStatus() == 17) {
                        this.b.setText(R.string.xm_sdk_msg_receipt_status_read);
                    } else {
                        this.b.setText("");
                    }
                }
            } else {
                this.b.setVisibility(8);
            }
            l.a(TextUtils.isEmpty(this.b.getText()) ? 8 : 0, this.b, this);
        }
    }
}
