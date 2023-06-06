package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FoodSafetyGroupChatCommonAdapter extends WmImCommonAdapter {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getInnerSideLayout(Context context, b bVar) {
        return R.layout.wm_im_bad_comment_group_chat_side_layout;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        return 8;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public boolean onAvatarLongClick(View view, b bVar) {
        return true;
    }

    public FoodSafetyGroupChatCommonAdapter(ICommonAdapter iCommonAdapter) {
        super(iCommonAdapter);
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c245e492a40524d59deee10c43274d55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c245e492a40524d59deee10c43274d55");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter, com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6de01a4c5ef4911e22e0ae94b1c0777", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6de01a4c5ef4911e22e0ae94b1c0777")).intValue();
        }
        if (!IMUIManager.f() || bVar.g != 2) {
            return super.getMsgStatusTextColor(bVar);
        }
        if (bVar.i <= 0) {
            return this.e.getResources().getColor(R.color.wm_im_chat_read_color);
        }
        return this.e.getResources().getColor(R.color.wm_im_text_highlight);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14a3d5655ba3c667705518fc467bff6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14a3d5655ba3c667705518fc467bff6")).intValue();
        }
        if ((bVar.b instanceof GeneralMessage) && IMMessageAdapter.a((GeneralMessage) bVar.b) == 2003) {
            return 8;
        }
        return super.getAvatarVisibility(bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c34351deca379674dc65a5f659c44f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c34351deca379674dc65a5f659c44f5")).intValue() : bVar.g == 2 ? R.drawable.wm_im_group_user_default_avatar : super.getDefaultAvatarDrawableResource(bVar);
    }
}
