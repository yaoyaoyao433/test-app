package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.ColorInt;
import android.support.annotation.Px;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IVideoMsgAdapter extends IExtraAdapter<VideoMessage> {
    @ColorInt
    @Deprecated
    int getShapeBorderColor(b<VideoMessage> bVar);

    @Px
    int getShapeCornerRadius(b<VideoMessage> bVar);
}
