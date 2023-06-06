package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.DrawableRes;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IAudioMsgAdapter extends IExtraAdapter<AudioMessage> {
    public static final int EVENT_PLAYER_COMPLETION = 5;
    public static final int EVENT_PLAYER_ERROR = 4;
    public static final int EVENT_PLAYER_PREPARED = 3;
    public static final int EVENT_PLAYER_START = 1;
    public static final int EVENT_PLAYER_STOP = 2;

    @DrawableRes
    int getPlayableAnimationResource(b<AudioMessage> bVar);

    @DrawableRes
    int getPlayingAnimationResource(b<AudioMessage> bVar);

    boolean onPlayerEvent(int i, b<AudioMessage> bVar);
}
