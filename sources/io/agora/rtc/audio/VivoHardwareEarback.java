package io.agora.rtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import io.agora.rtc.internal.Logging;
import java.util.StringTokenizer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VivoHardwareEarback implements IHardwareEarback {
    private static final String KEY_KTV_MODE = "vivo_ktv_mode";
    private static final String KEY_MIC_TYPE = "vivo_ktv_mic_type";
    private static final String KEY_PLAY_SRC = "vivo_ktv_play_source";
    private static final String KEY_VOL_MIC = "vivo_ktv_volume_mic";
    private static final String TAG = "VivoHardwareEarback Java";
    private AudioManager mAudioManager = null;
    private Context mContext;

    public VivoHardwareEarback(Context context) {
        this.mContext = null;
        this.mContext = context;
        initialize();
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void initialize() {
        if (this.mContext == null) {
            Logging.e(TAG, "mContext should not be null!");
        } else {
            this.mAudioManager = (AudioManager) this.mContext.getSystemService("audio");
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public boolean isHardwareEarbackSupported() {
        int parseInt;
        if (this.mAudioManager != null && Build.MANUFACTURER.trim().contains("vivo")) {
            StringTokenizer stringTokenizer = new StringTokenizer(this.mAudioManager.getParameters(KEY_MIC_TYPE), "=");
            if (2 == stringTokenizer.countTokens() && stringTokenizer.nextToken().equals(KEY_MIC_TYPE) && (1 == (parseInt = Integer.parseInt(stringTokenizer.nextToken())) || parseInt == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public synchronized int setHardwareEarbackVolume(int i) {
        if (i < 0) {
            i = 0;
        }
        if (15 < i) {
            i = 15;
        }
        if (this.mAudioManager != null) {
            this.mAudioManager.setParameters("vivo_ktv_volume_mic=" + i);
            return 0;
        }
        return -1;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public synchronized int enableEarbackFeature(boolean z) {
        return -1;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void destroy() {
        this.mAudioManager = null;
        this.mContext = null;
    }

    protected void finalize() throws Throwable {
        destroy();
        super.finalize();
    }
}
