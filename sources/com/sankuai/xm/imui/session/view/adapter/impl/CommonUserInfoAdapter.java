package com.sankuai.xm.imui.session.view.adapter.impl;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.entity.AtInfo;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonUserInfoAdapter extends BaseMsgAdapter implements ICommonUserInfoAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(b bVar) {
        return R.drawable.xm_sdk_default_portrait;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public void onAvatarClick(View view, b bVar) {
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0796b802c081ac9a36973c25a25a77", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0796b802c081ac9a36973c25a25a77")).intValue();
        }
        if (bVar.g == 2 || getAvatarVisibility(bVar) != 0) {
            return 8;
        }
        M m = bVar.b;
        if (MessageUtils.isIMPeerService(bVar.b.getCategory()) || m.getFromUid() == IMUIManager.a().e()) {
            return 8;
        }
        int a2 = MsgViewType.a(m);
        if (a2 != 4) {
            if (a2 != 11 && a2 != 13) {
                switch (a2) {
                }
            }
            return 8;
        } else if (MessageUtils.isPubService(bVar.b.getCategory())) {
            return 8;
        }
        return 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0706ab6900c63fe7b8ac1ce5e2c0d0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0706ab6900c63fe7b8ac1ce5e2c0d0")).intValue();
        }
        int a2 = MsgViewType.a(bVar.b);
        if (a2 != 4) {
            if (a2 != 11 && a2 != 13) {
                switch (a2) {
                    case 20:
                    case 21:
                        if (bVar.b.getFromUid() != IMUIManager.a().e()) {
                            return 8;
                        }
                        break;
                }
            } else {
                return 4;
            }
        } else if (MessageUtils.isPubService(bVar.b.getCategory())) {
            return 8;
        }
        return bVar.g == 3 ? 8 : 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarSize(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11cff32af217d4aac0018e2fec2835c", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11cff32af217d4aac0018e2fec2835c")).intValue() : this.e.getResources().getDimensionPixelOffset(R.dimen.xm_sdk_chat_msg_portrait_size);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarCornerRadius(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea3ce2b298d4e1ca8792fae3b124572", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea3ce2b298d4e1ca8792fae3b124572")).intValue() : this.e.getResources().getDimensionPixelOffset(R.dimen.xm_sdk_portrait_corner_radius);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public boolean onAvatarLongClick(View view, b bVar) {
        com.sankuai.xm.imui.common.panel.plugin.b bVar2;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ec751da227070c0f568be12ea6c628", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ec751da227070c0f568be12ea6c628")).booleanValue();
        }
        if (view != null && bVar != null && bVar.b != 0 && com.sankuai.xm.imui.session.b.b(view.getContext()).c() == 2 && bVar.b.getFromUid() != IMUIManager.a().e() && !TextUtils.isEmpty(bVar.b.getFromName()) && (bVar2 = (com.sankuai.xm.imui.common.panel.plugin.b) com.sankuai.xm.imui.session.b.a(view, com.sankuai.xm.imui.common.panel.plugin.b.class)) != null) {
            bVar2.a(new AtInfo(bVar.b.getFromUid(), bVar.b.getFromName()), true);
        }
        return true;
    }
}
