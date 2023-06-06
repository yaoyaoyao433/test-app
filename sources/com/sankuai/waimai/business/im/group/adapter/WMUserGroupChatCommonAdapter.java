package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.constraint.R;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.group.model.g;
import com.sankuai.waimai.business.im.utils.a;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.session.entity.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMUserGroupChatCommonAdapter extends IMCommonAdapter {
    public static ChangeQuickRedirect b;
    private final g c;
    private long d;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getTopSideLayout(Context context, b bVar) {
        return R.layout.wm_im_top_layout;
    }

    public WMUserGroupChatCommonAdapter(g gVar, long j) {
        Object[] objArr = {gVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0957583e6f98c20a81e88198dfb066a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0957583e6f98c20a81e88198dfb066a");
            return;
        }
        if (gVar != null) {
            this.c = gVar;
        } else {
            this.c = new g();
        }
        this.d = j;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bedbf33dfb1c6ef2dadb43128890a39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bedbf33dfb1c6ef2dadb43128890a39")).intValue();
        }
        if (bVar.b instanceof EventMessage) {
            return 8;
        }
        return ((bVar.b instanceof GeneralMessage) && IMMessageAdapter.a((GeneralMessage) bVar.b) == 3) ? 8 : 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final boolean a(DialogInterface dialogInterface, int i, IMMessage iMMessage) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cb4d26f537d67719efd99fb66a60a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cb4d26f537d67719efd99fb66a60a4")).booleanValue();
        }
        if (i != 1002) {
            if (i == 2) {
                JudasManualManager.a("b_waimai_vupgr36r_mc", "c_waimai_reae8s5i", AppUtil.generatePageInfoKey(this.e)).a("poi_id", a.a(this.c.g, this.c.h)).a("im_group_id", this.d).a();
                return false;
            }
            return false;
        }
        JudasManualManager.a("b_waimai_veg2126o_mc", "c_waimai_reae8s5i", AppUtil.generatePageInfoKey(this.e)).a("poi_id", a.a(this.c.g, this.c.h)).a("im_group_id", this.d).a();
        String str = "https://i.waimai.meituan.com/c/content/appeal.html?targetUserId=" + iMMessage.getFromUid() + "&messageId=" + iMMessage.getMsgId();
        int i2 = -1;
        String str2 = "";
        if (iMMessage.getMsgType() == 1) {
            str2 = Uri.encode(((TextMessage) iMMessage).getText());
            i2 = 1;
        } else if (iMMessage.getMsgType() == 4) {
            str2 = Uri.encode(((ImageMessage) iMMessage).getNormalUrl());
            i2 = 2;
        } else if (iMMessage.getMsgType() == 3) {
            str2 = Uri.encode(((VideoMessage) iMMessage).getUrl());
            i2 = 3;
        }
        com.sankuai.waimai.foundation.router.a.a(this.e, str + "&contentType=" + i2 + "&content=" + str2 + "&poiId=" + this.c.g + "&poi_id_str=" + this.c.h + "&imGroupId=" + this.d);
        return true;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final Map<Integer, String> a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9817f2e1559b1669f533753ae7f8130", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9817f2e1559b1669f533753ae7f8130");
        }
        JudasManualManager.b("b_waimai_yhvvr2p3_mv", "c_waimai_reae8s5i", AppUtil.generatePageInfoKey(this.e)).a("poi_id", a.a(this.c.g, this.c.h)).a("im_group_id", this.d).a();
        Map<Integer, String> a = super.a(bVar);
        if (bVar.b.getMsgType() == 1) {
            a.put(2, this.e.getString(R.string.xm_sdk_msg_menu_copy));
        }
        a.put(7, this.e.getString(R.string.xm_sdk_msg_menu_cancel));
        if (bVar.b.getFromUid() != IMClient.a().k() && (bVar.b.getMsgType() == 1 || bVar.b.getMsgType() == 3 || bVar.b.getMsgType() == 4)) {
            a.put(1002, "举报");
        }
        return a;
    }
}
