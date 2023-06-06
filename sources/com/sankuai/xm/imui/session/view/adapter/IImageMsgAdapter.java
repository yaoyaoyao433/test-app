package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.ColorInt;
import android.support.annotation.Px;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IImageMsgAdapter extends IExtraAdapter<ImageMessage> {
    @ColorInt
    @Deprecated
    int getShapeBorderColor(b<ImageMessage> bVar);

    @Px
    int getShapeCornerRadius(b<ImageMessage> bVar);
}
