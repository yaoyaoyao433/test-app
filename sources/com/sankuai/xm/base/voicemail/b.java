package com.sankuai.xm.base.voicemail;

import android.media.MediaPlayer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b extends MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    void onCompletion(MediaPlayer mediaPlayer);

    @Override // android.media.MediaPlayer.OnErrorListener
    boolean onError(MediaPlayer mediaPlayer, int i, int i2);

    @Override // android.media.MediaPlayer.OnPreparedListener
    void onPrepared(MediaPlayer mediaPlayer);
}
