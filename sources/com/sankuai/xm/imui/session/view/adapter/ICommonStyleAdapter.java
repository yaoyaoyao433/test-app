package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.DrawableRes;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ICommonStyleAdapter extends IMsgAdapter {
    @DrawableRes
    int getBackgroundResource(b bVar);

    @Deprecated
    int[] getPadding(b bVar);

    int getStyle(b bVar);
}
