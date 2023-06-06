package com.sankuai.xm.imui.session.view.adapter.impl;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IVideoMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoMsgAdapter extends BaseMsgAdapter implements IVideoMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.IVideoMsgAdapter
    public int getShapeBorderColor(b<VideoMessage> bVar) {
        return 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IVideoMsgAdapter
    public int getShapeCornerRadius(b<VideoMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232163e672299d235ec5fbac361c4694", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232163e672299d235ec5fbac361c4694")).intValue() : this.e.getResources().getDimensionPixelOffset(R.dimen.xm_sdk_msg_bg_corner_radius);
    }
}
