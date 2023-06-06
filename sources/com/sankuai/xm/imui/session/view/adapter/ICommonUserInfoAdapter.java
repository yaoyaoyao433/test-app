package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.DrawableRes;
import android.support.annotation.Px;
import android.view.View;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ICommonUserInfoAdapter extends IMsgAdapter {
    @Px
    int getAvatarCornerRadius(b bVar);

    @Px
    int getAvatarSize(b bVar);

    int getAvatarVisibility(b bVar);

    @DrawableRes
    int getDefaultAvatarDrawableResource(b bVar);

    int getNickNameVisibility(b bVar);

    void onAvatarClick(View view, b bVar);

    boolean onAvatarLongClick(View view, b bVar);
}
