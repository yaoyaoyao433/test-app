package com.sankuai.xm.imui.session.widget;

import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.session.event.e;
import com.sankuai.xm.imui.session.view.SafeDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends h {
    public static ChangeQuickRedirect a;
    private RadioButton j;
    private long k;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57b5e1ca418e3fdcf537b90ae54d3e71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57b5e1ca418e3fdcf537b90ae54d3e71");
        } else {
            this.k = 0L;
        }
    }

    public static /* synthetic */ void a(f fVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "de5657bb1b1b27309295661144a7c434", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "de5657bb1b1b27309295661144a7c434");
        } else if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
        } else {
            final ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IMMessage iMMessage = (IMMessage) it.next();
                if (MessageUtils.supportForward(iMMessage)) {
                    IMMessage copyMsg = MessageUtils.getCopyMsg(iMMessage);
                    iMMessage.setExtension(null);
                    arrayList.add(copyMsg);
                }
            }
            if (arrayList.size() == 0) {
                ad.a(fVar.f, (int) R.string.xm_sdk_msg_forward_by_one_not_support);
            } else if (list.size() != arrayList.size()) {
                new SafeDialog.a(fVar.f).b(R.string.xm_sdk_msg_forward_support_notice).a(R.string.xm_sdk_btn_send, new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.imui.session.widget.f.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5811c46325e311536866437b0fa97bff", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5811c46325e311536866437b0fa97bff");
                        } else {
                            f.this.a(arrayList);
                        }
                    }
                }).b(R.string.xm_sdk_btn_back, (DialogInterface.OnClickListener) null).b();
            } else {
                fVar.a(arrayList);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.widget.h, com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d84a8e6265270e3a9a41819a4d7b16", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d84a8e6265270e3a9a41819a4d7b16");
        }
        View inflate = layoutInflater.inflate(R.layout.xm_sdk_msg_forward_container_layout, viewGroup, false);
        this.j = (RadioButton) inflate.findViewById(R.id.sdk_sdk_btn_forward_by_one);
        if (this.j != null) {
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.widget.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62db95e741dc44eb970a628c24b36f6e", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62db95e741dc44eb970a628c24b36f6e");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - f.this.k < 500) {
                        return;
                    }
                    f.this.k = currentTimeMillis;
                    f.a(f.this, f.this.c);
                }
            });
        }
        return inflate;
    }

    @Override // com.sankuai.xm.imui.session.widget.h
    public final void a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451e162aac4a353796bd84a347466c0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451e162aac4a353796bd84a347466c0e");
        } else if (com.sankuai.xm.base.util.b.a(this.c) && this.j.isEnabled()) {
            this.j.setEnabled(false);
            this.j.setAlpha(0.6f);
        } else if (com.sankuai.xm.base.util.b.a(this.c) || this.j.isEnabled()) {
        } else {
            this.j.setEnabled(true);
            this.j.setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae210f15188c3a5215f9e7d8946fa1e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae210f15188c3a5215f9e7d8946fa1e7");
        } else {
            com.sankuai.xm.imui.session.b.b(this.f).a(e.C1400e.a(list));
        }
    }
}
