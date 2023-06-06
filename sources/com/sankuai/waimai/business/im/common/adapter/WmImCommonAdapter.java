package com.sankuai.waimai.business.im.common.adapter;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmImCommonAdapter extends IMCommonAdapterWrapper {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean hasLinkTextUnderLine(b bVar) {
        return false;
    }

    public WmImCommonAdapter(ICommonAdapter iCommonAdapter) {
        super(iCommonAdapter);
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efac5760152052e91fe04c8db0dad86a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efac5760152052e91fe04c8db0dad86a");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int[] getPadding(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8fa591693aa2aebafc8f71891bf562", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8fa591693aa2aebafc8f71891bf562");
        }
        int[] padding = super.getPadding(bVar);
        if (MsgViewType.a(bVar.b) != 0 || padding == null || padding.length < 4) {
            return padding;
        }
        int a = g.a(this.e, 8.0f);
        int a2 = g.a(this.e, 9.0f);
        int a3 = g.a(this.e, 2.0f);
        padding[1] = a2;
        padding[3] = a2;
        padding[0] = a;
        padding[2] = a;
        if (bVar.g == 2) {
            padding[2] = padding[2] + a3;
        } else if (bVar.g == 1) {
            padding[0] = padding[0] + a3;
        }
        return padding;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d923b31dc387a6075720ac292ffe56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d923b31dc387a6075720ac292ffe56")).intValue();
        }
        if (!IMUIManager.f() || bVar.g != 2) {
            return super.getMsgStatusTextColor(bVar);
        }
        if (bVar.i <= 0) {
            return this.e.getResources().getColor(R.color.wm_im_chat_read_color);
        }
        return this.e.getResources().getColor(R.color.wm_im_text_highlight);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffba8aa7898771fb165a018d7f729282", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffba8aa7898771fb165a018d7f729282")).intValue() : this.e.getResources().getColor(R.color.wm_im_text_highlight_custom);
    }
}
