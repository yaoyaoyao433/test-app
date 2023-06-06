package io.agora.rtc.video;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLiveConstants;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class VideoEncoderConfiguration {
    public static final int COMPATIBLE_BITRATE = -1;
    public static final int DEFAULT_MIN_BITRATE = -1;
    public static final int DEFAULT_MIN_FRAMERATE = -1;
    public static final int STANDARD_BITRATE = 0;
    public int bitrate;
    public DEGRADATION_PREFERENCE degradationPrefer;
    public VideoDimensions dimensions;
    public int frameRate;
    public int minBitrate;
    public int minFrameRate;
    public int mirrorMode;
    public ORIENTATION_MODE orientationMode;
    public static final VideoDimensions VD_120x120 = new VideoDimensions(120, 120);
    public static final VideoDimensions VD_160x120 = new VideoDimensions(160, 120);
    public static final VideoDimensions VD_180x180 = new VideoDimensions(TXLiveConstants.RENDER_ROTATION_180, TXLiveConstants.RENDER_ROTATION_180);
    public static final VideoDimensions VD_240x180 = new VideoDimensions(240, TXLiveConstants.RENDER_ROTATION_180);
    public static final VideoDimensions VD_320x180 = new VideoDimensions(jw.e, TXLiveConstants.RENDER_ROTATION_180);
    public static final VideoDimensions VD_240x240 = new VideoDimensions(240, 240);
    public static final VideoDimensions VD_320x240 = new VideoDimensions(jw.e, 240);
    public static final VideoDimensions VD_424x240 = new VideoDimensions(424, 240);
    public static final VideoDimensions VD_360x360 = new VideoDimensions(360, 360);
    public static final VideoDimensions VD_480x360 = new VideoDimensions(jw.g, 360);
    public static final VideoDimensions VD_640x360 = new VideoDimensions(jw.h, 360);
    public static final VideoDimensions VD_480x480 = new VideoDimensions(jw.g, jw.g);
    public static final VideoDimensions VD_640x480 = new VideoDimensions(jw.h, jw.g);
    public static final VideoDimensions VD_840x480 = new VideoDimensions(840, jw.g);
    public static final VideoDimensions VD_960x720 = new VideoDimensions(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 720);
    public static final VideoDimensions VD_1280x720 = new VideoDimensions(1280, 720);

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class VideoDimensions {
        public int height;
        public int width;

        public VideoDimensions(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public VideoDimensions() {
            this.width = jw.h;
            this.height = jw.g;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum FRAME_RATE {
        FRAME_RATE_FPS_1(1),
        FRAME_RATE_FPS_7(7),
        FRAME_RATE_FPS_10(10),
        FRAME_RATE_FPS_15(15),
        FRAME_RATE_FPS_24(24),
        FRAME_RATE_FPS_30(30);
        
        private int value;

        FRAME_RATE(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        ORIENTATION_MODE(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum DEGRADATION_PREFERENCE {
        MAINTAIN_QUALITY(0),
        MAINTAIN_FRAMERATE(1),
        MAINTAIN_BALANCED(2);
        
        private int value;

        DEGRADATION_PREFERENCE(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public VideoEncoderConfiguration() {
        this.dimensions = new VideoDimensions(jw.h, jw.g);
        this.frameRate = FRAME_RATE.FRAME_RATE_FPS_15.getValue();
        this.minFrameRate = -1;
        this.bitrate = 0;
        this.minBitrate = -1;
        this.orientationMode = ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_QUALITY;
        this.mirrorMode = 0;
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FRAME_RATE frame_rate, int i, ORIENTATION_MODE orientation_mode) {
        this.dimensions = videoDimensions;
        this.frameRate = frame_rate.getValue();
        this.minFrameRate = -1;
        this.bitrate = i;
        this.minBitrate = -1;
        this.orientationMode = orientation_mode;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_QUALITY;
        this.mirrorMode = 0;
    }

    public VideoEncoderConfiguration(int i, int i2, FRAME_RATE frame_rate, int i3, ORIENTATION_MODE orientation_mode) {
        this.dimensions = new VideoDimensions(i, i2);
        this.frameRate = frame_rate.getValue();
        this.minFrameRate = -1;
        this.bitrate = i3;
        this.minBitrate = -1;
        this.orientationMode = orientation_mode;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_QUALITY;
        this.mirrorMode = 0;
    }
}
