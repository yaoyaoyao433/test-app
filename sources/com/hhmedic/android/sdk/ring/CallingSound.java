package com.hhmedic.android.sdk.ring;

import android.content.Context;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.trtc.TRTCCloud;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallingSound {
    private static final String URL = "https://imgs.hh-medic.com/video/001/calling.mp3";
    private final Context mContext;

    public CallingSound(Context context) {
        this.mContext = context;
    }

    public void start() {
        try {
            TXAudioEffectManager audioEffectManager = TRTCCloud.sharedInstance(this.mContext).getAudioEffectManager();
            TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(1000, URL);
            audioMusicParam.loopCount = 1000;
            audioEffectManager.startPlayMusic(audioMusicParam);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public void stop() {
        try {
            TRTCCloud.sharedInstance(this.mContext).getAudioEffectManager().stopPlayMusic(1000);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }
}
