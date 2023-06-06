package com.tencent.ijk.media.player;

import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.misc.IMediaDataSource;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractMediaPlayer implements IMediaPlayer {
    private IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private IMediaPlayer.OnHLSKeyErrorListener mOnHLSKeyErrorListener;
    private IMediaPlayer.OnHevcVideoDecoderErrorListener mOnHevcVideoDecoderErrorListener;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IMediaPlayer.OnTimedTextListener mOnTimedTextListener;
    private IMediaPlayer.OnVideoDecoderErrorListener mOnVideoDecoderErrorListener;
    private IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        this.mOnTimedTextListener = onTimedTextListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnHLSKeyErrorListener(IMediaPlayer.OnHLSKeyErrorListener onHLSKeyErrorListener) {
        this.mOnHLSKeyErrorListener = onHLSKeyErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnHevcVideoDecoderErrorListener(IMediaPlayer.OnHevcVideoDecoderErrorListener onHevcVideoDecoderErrorListener) {
        this.mOnHevcVideoDecoderErrorListener = onHevcVideoDecoderErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnVideoDecoderErrorListener(IMediaPlayer.OnVideoDecoderErrorListener onVideoDecoderErrorListener) {
        this.mOnVideoDecoderErrorListener = onVideoDecoderErrorListener;
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnTimedTextListener = null;
        this.mOnHLSKeyErrorListener = null;
        this.mOnHevcVideoDecoderErrorListener = null;
        this.mOnVideoDecoderErrorListener = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnPrepared() {
        if (this.mOnPreparedListener != null) {
            this.mOnPreparedListener.onPrepared(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnCompletion() {
        if (this.mOnCompletionListener != null) {
            this.mOnCompletionListener.onCompletion(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnBufferingUpdate(int i) {
        if (this.mOnBufferingUpdateListener != null) {
            this.mOnBufferingUpdateListener.onBufferingUpdate(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnSeekComplete() {
        if (this.mOnSeekCompleteListener != null) {
            this.mOnSeekCompleteListener.onSeekComplete(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnVideoSizeChanged(int i, int i2, int i3, int i4) {
        if (this.mOnVideoSizeChangedListener != null) {
            this.mOnVideoSizeChangedListener.onVideoSizeChanged(this, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean notifyOnError(int i, int i2) {
        return this.mOnErrorListener != null && this.mOnErrorListener.onError(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean notifyOnInfo(int i, int i2) {
        return this.mOnInfoListener != null && this.mOnInfoListener.onInfo(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnTimedText(IjkTimedText ijkTimedText) {
        if (this.mOnTimedTextListener != null) {
            this.mOnTimedTextListener.onTimedText(this, ijkTimedText);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyHLSKeyError() {
        if (this.mOnHLSKeyErrorListener != null) {
            this.mOnHLSKeyErrorListener.onHLSKeyError(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyHevcVideoDecoderError() {
        if (this.mOnHevcVideoDecoderErrorListener != null) {
            this.mOnHevcVideoDecoderErrorListener.onHevcVideoDecoderError(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyVideoDecoderError() {
        if (this.mOnVideoDecoderErrorListener != null) {
            this.mOnVideoDecoderErrorListener.onVideoDecoderError(this);
        }
    }
}
