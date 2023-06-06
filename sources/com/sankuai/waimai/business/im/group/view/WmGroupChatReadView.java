package com.sankuai.waimai.business.im.group.View;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupChatReadView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    protected ProgressBar b;
    private TextView e;
    private TextView f;
    private TextView g;
    private RelativeLayout h;
    private ICommonStatusAdapter i;
    private WmGroupShareData j;

    public WmGroupChatReadView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ba2dca535049e887fe31c184f0132e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ba2dca535049e887fe31c184f0132e");
        }
    }

    public WmGroupChatReadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11bc4bcd36da0dcf8930e71669e7a89e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11bc4bcd36da0dcf8930e71669e7a89e");
        }
    }

    public WmGroupChatReadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b925e30ac8bb925b18b75e21531c84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b925e30ac8bb925b18b75e21531c84");
            return;
        }
        inflate(context, R.layout.wm_im_group_chat_unread_detail_layout, this);
        this.e = (TextView) findViewById(R.id.wm_im_group_chat_status_text);
        this.h = (RelativeLayout) findViewById(R.id.wm_im_group_chat_unread_container);
        this.f = (TextView) findViewById(R.id.wm_im_group_chat_unread_text_top);
        this.g = (TextView) findViewById(R.id.wm_im_group_chat_unread_text_bottom);
        this.i = b.b(this);
        this.j = WmGroupShareData.a(context);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e053f9a91b6402e3e786fe2ef226b592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e053f9a91b6402e3e786fe2ef226b592");
            return;
        }
        super.a(bVar);
        l.a(this.b);
        inflate(getContext(), R.layout.xm_sdk_chat_progress_bar, this);
        this.b = (ProgressBar) findViewById(R.id.xm_sdk_progress_chat_msg_sending);
        int progressBarResource = this.i != null ? this.i.getProgressBarResource(getMessage()) : 0;
        if (progressBarResource != 0) {
            this.b.setIndeterminateDrawable(getResources().getDrawable(progressBarResource));
        }
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void d(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a7b35c82402dcd5290bec1b7b2b173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a7b35c82402dcd5290bec1b7b2b173");
            return;
        }
        b();
        if (getMessage().b.getMsgStatus() != 14) {
            l.a(8, this.b);
            return;
        }
        l.a(0, this.b);
        l.a(8, this.e);
        l.a(8, this.h);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void e(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc39874765d346dae83eaaf47658676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc39874765d346dae83eaaf47658676");
        } else {
            b();
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6e3b4531546c09195706c4a73334ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6e3b4531546c09195706c4a73334ad")).booleanValue();
        }
        return (getMessage().b != 0 ? getMessage().b.getCts() : 0L) < ((this.j.e == null || this.j.e.d == null) ? 0L : this.j.e.d.m);
    }

    private void b() {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8b33a0e5c7e4750656cc7575df9a15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8b33a0e5c7e4750656cc7575df9a15");
        } else if (this.i == null || getContext() == null) {
        } else {
            if (this.i.getMsgStatusVisibility(getMessage()) != 0) {
                this.e.setVisibility(8);
                this.h.setVisibility(8);
                return;
            }
            this.e.setVisibility(8);
            this.e.setTextColor(this.i.getMsgStatusTextColor(getMessage()));
            this.h.setVisibility(8);
            if (getMessage().b.getMsgStatus() == 16) {
                this.e.setVisibility(0);
                this.h.setVisibility(8);
                this.e.setText(R.string.xm_sdk_recall_fail);
                this.e.setEnabled(false);
                return;
            }
            if (IMUIManager.f() && getMessage().g == 2) {
                this.e.setVisibility(8);
                this.h.setVisibility(0);
                this.h.setEnabled(true);
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.View.WmGroupChatReadView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64d2325d02202a45fd48fb0950f15f5d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64d2325d02202a45fd48fb0950f15f5d");
                        } else {
                            WmGroupChatReadView.this.i.onMsgStatusClick(WmGroupChatReadView.this.h, WmGroupChatReadView.this.getMessage());
                        }
                    }
                });
                if (getMessage().b.getCategory() != 2) {
                    return;
                }
                if (!a()) {
                    if (getMessage().j == 1) {
                        c();
                        return;
                    } else if (getMessage().j != 3) {
                        d();
                        return;
                    } else {
                        Set<Long> set = getMessage().k;
                        if (set != null) {
                            if (this.j.f != null) {
                                z = (this.j.f.b == null || this.j.f.b.a == null || !a(set, this.j.f.b.a)) ? false : true;
                                if (this.j.f.c != null && this.j.f.c.a != null && a(set, this.j.f.c.a)) {
                                    z2 = true;
                                }
                            } else {
                                z = false;
                            }
                            if (z && z2) {
                                c();
                                return;
                            } else if (z && !z2) {
                                e();
                                return;
                            } else if (!z && z2) {
                                f();
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                        return;
                    }
                }
            } else if (getMessage().b.isReceipt()) {
                this.h.setVisibility(8);
                this.e.setVisibility(0);
                if (getMessage().g == 2) {
                    this.e.setEnabled(true);
                    this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.View.WmGroupChatReadView.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c84b3141c83121fd8a150ab28075703a", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c84b3141c83121fd8a150ab28075703a");
                            } else {
                                WmGroupChatReadView.this.i.onMsgStatusClick(WmGroupChatReadView.this.e, WmGroupChatReadView.this.getMessage());
                            }
                        }
                    });
                    if (getMessage().b.getCategory() == 1) {
                        if (getMessage().h < 0) {
                            this.e.setText(R.string.xm_sdk_msg_receipt_status_unread);
                            return;
                        } else if (getMessage().h == 0) {
                            this.e.setText(R.string.xm_sdk_msg_receipt_status_read);
                            return;
                        } else {
                            this.e.setText(R.string.xm_sdk_msg_receipt_status_unread);
                            return;
                        }
                    }
                    return;
                }
                this.e.setEnabled(false);
                if (getMessage().b.getMsgStatus() == 17) {
                    this.e.setText(R.string.xm_sdk_msg_receipt_status_read);
                    return;
                } else {
                    this.e.setText("");
                    return;
                }
            }
            this.e.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    private boolean a(Set<Long> set, long[] jArr) {
        Object[] objArr = {set, jArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aed65c5079497b2cc28e3e40bad5655", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aed65c5079497b2cc28e3e40bad5655")).booleanValue();
        }
        if (jArr == null || set == null) {
            return false;
        }
        for (Long l : set) {
            if (l != null) {
                for (long j : jArr) {
                    if (l.longValue() == Long.valueOf(j).longValue()) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82b6b5f4e6924fae07a0efb992c3530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82b6b5f4e6924fae07a0efb992c3530");
            return;
        }
        this.h.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setText("全部已读");
        this.f.setTextColor(getResources().getColor(R.color.wm_im_chat_read_color));
        this.g.setTextColor(getResources().getColor(R.color.wm_im_chat_read_color));
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466c952b66ed680e49c9599aad032ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466c952b66ed680e49c9599aad032ade");
            return;
        }
        this.h.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setText("全部未读");
        this.g.setTextColor(getResources().getColor(R.color.wm_im_text_highlight));
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f7c3a1c9e2dc9bfb5a3a7d4ab53220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f7c3a1c9e2dc9bfb5a3a7d4ab53220");
            return;
        }
        this.h.setVisibility(0);
        this.e.setVisibility(8);
        this.g.setVisibility(0);
        this.f.setVisibility(0);
        this.f.setText("商家已读");
        this.f.setTextColor(getResources().getColor(R.color.wm_im_chat_read_color));
        this.g.setText("骑手未读");
        this.g.setTextColor(getResources().getColor(R.color.wm_im_text_highlight));
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13100d5db98d15e852baaa75a625e578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13100d5db98d15e852baaa75a625e578");
            return;
        }
        this.h.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        this.f.setText("商家未读");
        this.g.setText("骑手已读");
        this.f.setTextColor(getResources().getColor(R.color.wm_im_text_highlight));
        this.g.setTextColor(getResources().getColor(R.color.wm_im_chat_read_color));
    }
}
