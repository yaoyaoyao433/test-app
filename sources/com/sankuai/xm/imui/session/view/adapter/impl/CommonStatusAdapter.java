package com.sankuai.xm.imui.session.view.adapter.impl;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.locale.a;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonStatusAdapter extends BaseMsgAdapter implements ICommonStatusAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getProgressBarResource(b bVar) {
        return R.drawable.xm_sdk_rotate_loading;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getStatusGravity(b bVar) {
        return 3;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getTimeStampVisibility(b bVar) {
        return 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public void onMsgStatusClick(View view, b bVar) {
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public void onMsgFailTipClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374e93c011405b2ce56d8ff179e3e79d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374e93c011405b2ce56d8ff179e3e79d");
        } else if (bVar != null) {
            IMUIManager.a().a(bVar.b, true);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad1693fadaa2a6836e04df1e04e07b7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad1693fadaa2a6836e04df1e04e07b7")).intValue();
        }
        if (MessageUtils.isIMPeerService(bVar.b.getCategory()) || bVar.b.isReceipt() || IMUIManager.f()) {
            if (!IMUIManager.f() || IMUIManager.g()) {
                switch (MsgViewType.a(bVar.b)) {
                    case 4:
                        if (MessageUtils.isPubService(bVar.b.getCategory())) {
                            return 8;
                        }
                        break;
                    case 11:
                    case 12:
                        return 8;
                    case 20:
                    case 21:
                        if (bVar.b.getFromUid() != IMUIManager.a().e()) {
                            return 8;
                        }
                        break;
                }
                return 0;
            }
            return 8;
        }
        return 8;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public String getTimeStamp(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6fc95f638f2794b63f43551a7609e8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6fc95f638f2794b63f43551a7609e8");
        }
        Locale a2 = com.sankuai.xm.base.util.locale.b.a(this.e).a();
        if (a2 != null && a2.equals(com.sankuai.xm.base.util.locale.b.b)) {
            a2 = a.a(this.e.getResources().getConfiguration());
        }
        return k.a(this.e, bVar.i(), a2);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c477aeec2f23cc5a198722b0a151f50a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c477aeec2f23cc5a198722b0a151f50a")).intValue();
        }
        if (bVar.b.getMsgStatus() == 16) {
            return this.e.getResources().getColor(R.color.xm_sdk_text_color_red_light);
        }
        if (IMUIManager.f() && bVar.g == 2) {
            if (bVar.b.getCategory() == 2) {
                if (bVar.j == 1) {
                    return this.e.getResources().getColor(R.color.xm_sdk_msg_status_read);
                }
                return this.e.getResources().getColor(R.color.xm_sdk_msg_status_unread);
            } else if (bVar.i <= 0) {
                return this.e.getResources().getColor(R.color.xm_sdk_msg_status_read);
            } else {
                return this.e.getResources().getColor(R.color.xm_sdk_msg_status_unread);
            }
        } else if (bVar.g == 2) {
            return this.e.getResources().getColor(R.color.xm_sdk_main_blue);
        } else {
            return this.e.getResources().getColor(R.color.xm_sdk_text_color_gray);
        }
    }
}
