package com.tencent.liteav.txcvodplayer;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.app.PayTask;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.ijk.media.player.MediaPlayerProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private IMediaPlayer a;
    private Handler b = new Handler() { // from class: com.tencent.liteav.txcvodplayer.b.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IMediaPlayer internalMediaPlayer;
            if (message.what != 1) {
                return;
            }
            IjkMediaPlayer ijkMediaPlayer = null;
            if (b.this.a != null) {
                if (b.this.a instanceof IjkMediaPlayer) {
                    ijkMediaPlayer = (IjkMediaPlayer) b.this.a;
                } else if ((b.this.a instanceof MediaPlayerProxy) && (internalMediaPlayer = ((MediaPlayerProxy) b.this.a).getInternalMediaPlayer()) != null && (internalMediaPlayer instanceof IjkMediaPlayer)) {
                    ijkMediaPlayer = (IjkMediaPlayer) internalMediaPlayer;
                }
                if (ijkMediaPlayer != null) {
                    float rate = ijkMediaPlayer.getRate();
                    if (Math.abs(ijkMediaPlayer.getAVDiff()) <= 0.5f || rate <= 1.0f) {
                        b.this.b.removeMessages(1);
                        b.this.b.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    double d = rate;
                    float min = (float) (d - Math.min((d - 1.0d) / 2.0d, 0.25d));
                    ijkMediaPlayer.setRate(min);
                    new StringBuilder("downside rate ").append(min);
                    b.this.b.removeMessages(1);
                    b.this.b.sendEmptyMessageDelayed(1, PayTask.j);
                }
            }
        }
    };

    public void a(IMediaPlayer iMediaPlayer) {
        this.a = iMediaPlayer;
        if (this.a != null) {
            this.b.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.b.removeMessages(1);
        }
    }
}
