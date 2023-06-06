package com.sankuai.xm.imui.session.view.adapter.impl;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ImageMsgAdapter extends BaseMsgAdapter implements IImageMsgAdapter {
    public static ChangeQuickRedirect c;

    public int getShapeBorderColor(b<ImageMessage> bVar) {
        return 0;
    }

    public int getShapeCornerRadius(b<ImageMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08785b95d61de86a12f986e3bbdcb8f3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08785b95d61de86a12f986e3bbdcb8f3")).intValue() : this.e.getResources().getDimensionPixelOffset(R.dimen.xm_sdk_msg_bg_corner_radius);
    }
}
