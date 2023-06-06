package com.sankuai.meituan.shortvideocore.mrn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum e {
    STATE_ERROR("onVideoError"),
    STATE_PREPARING("onVideoPreparing"),
    STATE_PREPARED("onVideoPrepared"),
    STATE_PLAY_STAT("onVideoPlayStat"),
    STATE_PLAYBACK_COMPLETED("onVideoCompleted"),
    STATE_PLAYING("onVideoPlaying"),
    STATE_MULTIPLEX_RENDERED("onVideoMultiplexRendered"),
    STATE_BUFFERING_PLAYING("onVideoBufferingPlaying"),
    STATE_BUFFER_LOADING("onVideoBufferLoading"),
    STATE_PAUSED("onVideoPaused"),
    STATE_BUFFERING_PAUSED("onVideoBufferingPaused"),
    STATE_IDLE("onVideoIdle"),
    STATE_PROGRESS("onVideoProgress"),
    STATE_LOADING("onVideoLoading"),
    STATE_LOAD_FINISHED("onVideoLoadFinished"),
    STATE_SIZE_CHANGED("onVideoSizeChanged"),
    STATE_FULLSCREEN_STATUS_CHANGED("onFullScreenStatusChanged"),
    STATE_PLAYBACK_STATE_CHANGED("onPlaybackStateChanged");
    
    public static ChangeQuickRedirect a;
    final String t;

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71fbbf277b3c11d7a4dae5596a83d36f", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71fbbf277b3c11d7a4dae5596a83d36f") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cb66e907eb125734c5b37b10705d928", RobustBitConfig.DEFAULT_VALUE) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cb66e907eb125734c5b37b10705d928") : (e[]) values().clone();
    }

    e(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a3b150c4483b375a9719f53a315d42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a3b150c4483b375a9719f53a315d42");
        } else {
            this.t = str;
        }
    }
}
