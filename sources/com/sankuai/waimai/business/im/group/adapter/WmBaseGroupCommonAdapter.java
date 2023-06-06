package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmBaseGroupCommonAdapter extends WmImCommonAdapter {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getInnerSideLayout(Context context, b bVar) {
        return R.layout.wm_im_group_chat_unread_layout;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public boolean onAvatarLongClick(View view, b bVar) {
        return true;
    }

    public WmBaseGroupCommonAdapter(ICommonAdapter iCommonAdapter) {
        super(iCommonAdapter);
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb24a1c0d47768639a5dc1370db30d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb24a1c0d47768639a5dc1370db30d8");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7556ada78adb682a78f7bfc74f2fb003", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7556ada78adb682a78f7bfc74f2fb003")).intValue() : bVar.g == 1 ? 0 : 8;
    }
}
