package io.agora.rtc.audio;

import android.content.Context;
import com.huawei.multimedia.audiokit.interfaces.c;
import com.huawei.multimedia.audiokit.interfaces.d;
import com.huawei.multimedia.audiokit.interfaces.e;
import io.agora.rtc.internal.Logging;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class HuaweiHardwareEarback implements IHardwareEarback {
    private static final String TAG = "HuaweiHardwareEarback";
    private Context mContext;
    private d mHwAudioKit = null;
    private c mHwAudioKaraokeFeatureKit = null;
    private boolean mInited = false;
    private boolean mEarbackEnabled = false;
    private int latency = 0;
    private int volume = 0;

    public HuaweiHardwareEarback(Context context) {
        this.mContext = null;
        Logging.d(TAG, ">>ctor");
        this.mContext = context;
        initialize();
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void initialize() {
        if (this.mContext == null) {
            Logging.e(TAG, "mContext is null!");
            return;
        }
        Logging.d(TAG, ">>initialize");
        this.mHwAudioKit = new d(this.mContext, new e() { // from class: io.agora.rtc.audio.HuaweiHardwareEarback.1
            @Override // com.huawei.multimedia.audiokit.interfaces.e
            public void onResult(int i) {
                if (i == 0) {
                    Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: HwAudioKit init success");
                } else if (i == 2) {
                    Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: audio kit not installed");
                } else if (i == 1000) {
                    HuaweiHardwareEarback.this.mInited = true;
                    Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: HwAudioKaraokeFeatureKit init success ");
                } else {
                    Logging.e(HuaweiHardwareEarback.TAG, "IAudioKitCallback: onResult error number " + i);
                }
            }
        });
        this.mHwAudioKit.a();
        this.mHwAudioKaraokeFeatureKit = (c) this.mHwAudioKit.a(d.a.HWAUDIO_FEATURE_KARAOKE);
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public boolean isHardwareEarbackSupported() {
        if (this.mInited) {
            Logging.d(TAG, ">>isHardwareEarbackSupported");
            boolean b = this.mHwAudioKaraokeFeatureKit.b();
            Logging.d(TAG, "isSupported " + b);
            return b;
        }
        return false;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public synchronized int setHardwareEarbackVolume(int i) {
        if (this.mInited) {
            Logging.d(TAG, ">>setHardwareEarbackVolume " + i);
            if (i < 0) {
                i = 0;
            } else if (i > 100) {
                i = 100;
            }
            int a = this.mHwAudioKaraokeFeatureKit.a(c.a.CMD_SET_VOCAL_VOLUME_BASE, i);
            if (a != 0) {
                Logging.e(TAG, "setParameter error number " + a);
                return -1;
            }
            this.volume = i;
            return 0;
        }
        return -7;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public synchronized int enableEarbackFeature(boolean z) {
        if (this.mInited) {
            Logging.d(TAG, ">>enableEarbackFeature " + z);
            if (!this.mHwAudioKaraokeFeatureKit.b()) {
                Logging.e(TAG, "karaoke not supported");
                return -1;
            }
            int a = this.mHwAudioKaraokeFeatureKit.a(z);
            if (a != 0) {
                Logging.e(TAG, "enableKaraokeFeature failed ret " + a);
                return -1;
            }
            this.mEarbackEnabled = z;
            if (this.mEarbackEnabled) {
                this.latency = this.mHwAudioKaraokeFeatureKit.c();
                Logging.i(TAG, "latency " + this.latency);
            }
            return 0;
        }
        return -7;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void destroy() {
        Logging.d(TAG, ">>destroy");
        this.mHwAudioKaraokeFeatureKit.a();
        this.mHwAudioKit.b();
    }

    protected void finalize() throws Throwable {
        Logging.d(TAG, ">>finalize");
        destroy();
        super.finalize();
    }
}
