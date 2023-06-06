package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BadCommentGroupChatCommonAdapter extends WmImCommonAdapter {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getInnerSideLayout(Context context, b bVar) {
        return R.layout.wm_im_bad_comment_group_chat_side_layout;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public boolean onAvatarLongClick(View view, b bVar) {
        return true;
    }

    public BadCommentGroupChatCommonAdapter(ICommonAdapter iCommonAdapter) {
        super(iCommonAdapter);
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "546b1687d3ff55aedd0db8a8920ca42a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "546b1687d3ff55aedd0db8a8920ca42a");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter, com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b441744181471c69c0e9d669e163ea5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b441744181471c69c0e9d669e163ea5c")).intValue();
        }
        if (IMUIManager.f() && bVar.g == 2) {
            if (bVar.b.getCategory() == 2) {
                if (bVar.j == 1) {
                    return this.e.getResources().getColor(R.color.wm_im_chat_read_color);
                }
                if (bVar.j == 3) {
                    return this.e.getResources().getColor(R.color.wm_im_chat_read_color);
                }
                return this.e.getResources().getColor(R.color.wm_im_text_highlight);
            } else if (bVar.i <= 0) {
                return this.e.getResources().getColor(R.color.wm_im_chat_read_color);
            } else {
                return this.e.getResources().getColor(R.color.wm_im_text_highlight);
            }
        }
        return super.getMsgStatusTextColor(bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff3c945aa803017e8b51577ef6a0a78", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff3c945aa803017e8b51577ef6a0a78")).intValue() : bVar.g == 1 ? 0 : 8;
    }
}
