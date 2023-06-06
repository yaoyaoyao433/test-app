package com.sankuai.waimai.business.im.common.adapter;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMImageMsgAdapter extends ImageMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter
    public int getShapeCornerRadius(b<ImageMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9262f7021281916d48216d2c17247c37", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9262f7021281916d48216d2c17247c37")).intValue() : g.a(this.e, 1.0f);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter
    public int getShapeBorderColor(b<ImageMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e7edbd503bfb5ce280ab1cf2cb64a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e7edbd503bfb5ce280ab1cf2cb64a9")).intValue();
        }
        if (bVar.g == 1) {
            return this.e.getResources().getColor(R.color.wm_im_msg_custom_shape_border_color_left);
        }
        if (bVar.g == 2) {
            return this.e.getResources().getColor(R.color.wm_im_msg_custom_shape_border_color_right);
        }
        return super.getShapeBorderColor(bVar);
    }
}
