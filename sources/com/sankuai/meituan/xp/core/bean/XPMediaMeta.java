package com.sankuai.meituan.xp.core.bean;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class XPMediaMeta {
    public static final long AV_CH_BACK_CENTER = 256;
    public static final long AV_CH_BACK_LEFT = 16;
    public static final long AV_CH_BACK_RIGHT = 32;
    public static final long AV_CH_FRONT_CENTER = 4;
    public static final long AV_CH_FRONT_LEFT = 1;
    public static final long AV_CH_FRONT_LEFT_OF_CENTER = 64;
    public static final long AV_CH_FRONT_RIGHT = 2;
    public static final long AV_CH_FRONT_RIGHT_OF_CENTER = 128;
    public static final long AV_CH_LAYOUT_2POINT1 = 11;
    public static final long AV_CH_LAYOUT_2_1 = 259;
    public static final long AV_CH_LAYOUT_2_2 = 1539;
    public static final long AV_CH_LAYOUT_3POINT1 = 15;
    public static final long AV_CH_LAYOUT_4POINT0 = 263;
    public static final long AV_CH_LAYOUT_4POINT1 = 271;
    public static final long AV_CH_LAYOUT_5POINT0 = 1543;
    public static final long AV_CH_LAYOUT_5POINT0_BACK = 55;
    public static final long AV_CH_LAYOUT_5POINT1 = 1551;
    public static final long AV_CH_LAYOUT_5POINT1_BACK = 63;
    public static final long AV_CH_LAYOUT_6POINT0 = 1799;
    public static final long AV_CH_LAYOUT_6POINT0_FRONT = 1731;
    public static final long AV_CH_LAYOUT_6POINT1 = 1807;
    public static final long AV_CH_LAYOUT_6POINT1_BACK = 319;
    public static final long AV_CH_LAYOUT_6POINT1_FRONT = 1739;
    public static final long AV_CH_LAYOUT_7POINT0 = 1591;
    public static final long AV_CH_LAYOUT_7POINT0_FRONT = 1735;
    public static final long AV_CH_LAYOUT_7POINT1 = 1599;
    public static final long AV_CH_LAYOUT_7POINT1_WIDE = 1743;
    public static final long AV_CH_LAYOUT_7POINT1_WIDE_BACK = 255;
    public static final long AV_CH_LAYOUT_HEXAGONAL = 311;
    public static final long AV_CH_LAYOUT_MONO = 4;
    public static final long AV_CH_LAYOUT_OCTAGONAL = 1847;
    public static final long AV_CH_LAYOUT_QUAD = 51;
    public static final long AV_CH_LAYOUT_STEREO = 3;
    public static final long AV_CH_LAYOUT_STEREO_DOWNMIX = 1610612736;
    public static final long AV_CH_LAYOUT_SURROUND = 7;
    public static final long AV_CH_LOW_FREQUENCY = 8;
    public static final long AV_CH_LOW_FREQUENCY_2 = 34359738368L;
    public static final long AV_CH_SIDE_LEFT = 512;
    public static final long AV_CH_SIDE_RIGHT = 1024;
    public static final long AV_CH_STEREO_LEFT = 536870912;
    public static final long AV_CH_STEREO_RIGHT = 1073741824;
    public static final long AV_CH_SURROUND_DIRECT_LEFT = 8589934592L;
    public static final long AV_CH_SURROUND_DIRECT_RIGHT = 17179869184L;
    public static final long AV_CH_TOP_BACK_CENTER = 65536;
    public static final long AV_CH_TOP_BACK_LEFT = 32768;
    public static final long AV_CH_TOP_BACK_RIGHT = 131072;
    public static final long AV_CH_TOP_CENTER = 2048;
    public static final long AV_CH_TOP_FRONT_CENTER = 8192;
    public static final long AV_CH_TOP_FRONT_LEFT = 4096;
    public static final long AV_CH_TOP_FRONT_RIGHT = 16384;
    public static final long AV_CH_WIDE_LEFT = 2147483648L;
    public static final long AV_CH_WIDE_RIGHT = 4294967296L;
    public static final int FF_PROFILE_H264_BASELINE = 66;
    public static final int FF_PROFILE_H264_CAVLC_444 = 44;
    public static final int FF_PROFILE_H264_CONSTRAINED = 512;
    public static final int FF_PROFILE_H264_CONSTRAINED_BASELINE = 578;
    public static final int FF_PROFILE_H264_EXTENDED = 88;
    public static final int FF_PROFILE_H264_HIGH = 100;
    public static final int FF_PROFILE_H264_HIGH_10 = 110;
    public static final int FF_PROFILE_H264_HIGH_10_INTRA = 2158;
    public static final int FF_PROFILE_H264_HIGH_422 = 122;
    public static final int FF_PROFILE_H264_HIGH_422_INTRA = 2170;
    public static final int FF_PROFILE_H264_HIGH_444 = 144;
    public static final int FF_PROFILE_H264_HIGH_444_INTRA = 2292;
    public static final int FF_PROFILE_H264_HIGH_444_PREDICTIVE = 244;
    public static final int FF_PROFILE_H264_INTRA = 2048;
    public static final int FF_PROFILE_H264_MAIN = 77;
    public static final String IJKM_KEY_AUDIO_STREAM = "audio";
    public static final String IJKM_KEY_BITRATE = "bitrate";
    public static final String IJKM_KEY_CHANNEL_LAYOUT = "channel_layout";
    public static final String IJKM_KEY_CODEC_LEVEL = "codec_level";
    public static final String IJKM_KEY_CODEC_LONG_NAME = "codec_long_name";
    public static final String IJKM_KEY_CODEC_NAME = "codec_name";
    public static final String IJKM_KEY_CODEC_PIXEL_FORMAT = "codec_pixel_format";
    public static final String IJKM_KEY_CODEC_PROFILE = "codec_profile";
    public static final String IJKM_KEY_CODEC_PROFILE_ID = "codec_profile_id";
    public static final String IJKM_KEY_DURATION_US = "duration_us";
    public static final String IJKM_KEY_FORMAT = "format";
    public static final String IJKM_KEY_FPS_DEN = "fps_den";
    public static final String IJKM_KEY_FPS_NUM = "fps_num";
    public static final String IJKM_KEY_HEIGHT = "height";
    public static final String IJKM_KEY_LANGUAGE = "language";
    public static final String IJKM_KEY_SAMPLE_RATE = "sample_rate";
    public static final String IJKM_KEY_SAR_DEN = "sar_den";
    public static final String IJKM_KEY_SAR_NUM = "sar_num";
    public static final String IJKM_KEY_START_US = "start_us";
    public static final String IJKM_KEY_STREAMS = "streams";
    public static final String IJKM_KEY_TBR_DEN = "tbr_den";
    public static final String IJKM_KEY_TBR_NUM = "tbr_num";
    public static final String IJKM_KEY_TIMEDTEXT_STREAM = "timedtext";
    public static final String IJKM_KEY_TYPE = "type";
    public static final String IJKM_KEY_VIDEO_STREAM = "video";
    public static final String IJKM_KEY_WIDTH = "width";
    public static final String IJKM_VAL_TYPE__AUDIO = "audio";
    public static final String IJKM_VAL_TYPE__TIMEDTEXT = "timedtext";
    public static final String IJKM_VAL_TYPE__UNKNOWN = "unknown";
    public static final String IJKM_VAL_TYPE__VIDEO = "video";
    public static ChangeQuickRedirect changeQuickRedirect;
    public IjkStreamMeta mAudioStream;
    public long mBitrate;
    public long mDurationUS;
    public String mFormat;
    public Bundle mMediaMeta;
    public long mStartUS;
    public final ArrayList<IjkStreamMeta> mStreams;
    public IjkStreamMeta mVideoStream;

    public XPMediaMeta() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24fa97bbfba2c3485df8069f11cddd5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24fa97bbfba2c3485df8069f11cddd5e");
        } else {
            this.mStreams = new ArrayList<>();
        }
    }

    public String getString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db40416611741dc66633aa90b715c5a4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db40416611741dc66633aa90b715c5a4") : this.mMediaMeta.getString(str);
    }

    public int getInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d1c6e42a617c9045ef3262229ae29eb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d1c6e42a617c9045ef3262229ae29eb")).intValue() : getInt(str, 0);
    }

    public int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82dc49f662371337f2dd3304d78278cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82dc49f662371337f2dd3304d78278cd")).intValue();
        }
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public long getLong(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "483e2fe27471383ab0dc88f505b08e7a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "483e2fe27471383ab0dc88f505b08e7a")).longValue() : getLong(str, 0L);
    }

    public long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3175c0ae324d45d417b67018b7c6c52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3175c0ae324d45d417b67018b7c6c52")).longValue();
        }
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return j;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public ArrayList<Bundle> getParcelableArrayList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab0353b4ef4cc5143bebb4d9129734f3", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab0353b4ef4cc5143bebb4d9129734f3") : this.mMediaMeta.getParcelableArrayList(str);
    }

    public String getDurationInline() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa92de6d85f4b57bd2ed95a4708ee213", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa92de6d85f4b57bd2ed95a4708ee213");
        }
        long j = (this.mDurationUS + MetricsAnrManager.ANR_THRESHOLD) / 1000000;
        long j2 = j / 60;
        return String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60), Long.valueOf(j % 60));
    }

    public static XPMediaMeta parse(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03a9045fefd80997cd619cbe6866516b", RobustBitConfig.DEFAULT_VALUE)) {
            return (XPMediaMeta) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03a9045fefd80997cd619cbe6866516b");
        }
        if (bundle == null) {
            return null;
        }
        XPMediaMeta xPMediaMeta = new XPMediaMeta();
        xPMediaMeta.mMediaMeta = bundle;
        xPMediaMeta.mFormat = xPMediaMeta.getString("format");
        xPMediaMeta.mDurationUS = xPMediaMeta.getLong("duration_us");
        xPMediaMeta.mStartUS = xPMediaMeta.getLong("start_us");
        xPMediaMeta.mBitrate = xPMediaMeta.getLong("bitrate");
        int i = -1;
        int i2 = xPMediaMeta.getInt("video", -1);
        int i3 = xPMediaMeta.getInt("audio", -1);
        ArrayList<Bundle> parcelableArrayList = xPMediaMeta.getParcelableArrayList("streams");
        if (parcelableArrayList == null) {
            return xPMediaMeta;
        }
        Iterator<Bundle> it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Bundle next = it.next();
            i++;
            if (next != null) {
                IjkStreamMeta ijkStreamMeta = new IjkStreamMeta(i);
                ijkStreamMeta.mMeta = next;
                ijkStreamMeta.mType = ijkStreamMeta.getString("type");
                ijkStreamMeta.mLanguage = ijkStreamMeta.getString("language");
                if (!TextUtils.isEmpty(ijkStreamMeta.mType)) {
                    ijkStreamMeta.mCodecName = ijkStreamMeta.getString("codec_name");
                    ijkStreamMeta.mCodecProfile = ijkStreamMeta.getString("codec_profile");
                    ijkStreamMeta.mCodecLongName = ijkStreamMeta.getString("codec_long_name");
                    ijkStreamMeta.mBitrate = ijkStreamMeta.getInt("bitrate");
                    if (ijkStreamMeta.mType.equalsIgnoreCase("video")) {
                        ijkStreamMeta.mWidth = ijkStreamMeta.getInt("width");
                        ijkStreamMeta.mHeight = ijkStreamMeta.getInt("height");
                        ijkStreamMeta.mFpsNum = ijkStreamMeta.getInt("fps_num");
                        ijkStreamMeta.mFpsDen = ijkStreamMeta.getInt("fps_den");
                        ijkStreamMeta.mTbrNum = ijkStreamMeta.getInt("tbr_num");
                        ijkStreamMeta.mTbrDen = ijkStreamMeta.getInt("tbr_den");
                        ijkStreamMeta.mSarNum = ijkStreamMeta.getInt("sar_num");
                        ijkStreamMeta.mSarDen = ijkStreamMeta.getInt("sar_den");
                        if (i2 == i) {
                            xPMediaMeta.mVideoStream = ijkStreamMeta;
                        }
                    } else if (ijkStreamMeta.mType.equalsIgnoreCase("audio")) {
                        ijkStreamMeta.mSampleRate = ijkStreamMeta.getInt("sample_rate");
                        ijkStreamMeta.mChannelLayout = ijkStreamMeta.getLong("channel_layout");
                        if (i3 == i) {
                            xPMediaMeta.mAudioStream = ijkStreamMeta;
                        }
                    }
                    xPMediaMeta.mStreams.add(ijkStreamMeta);
                }
            }
        }
        return xPMediaMeta;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class IjkStreamMeta {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long mBitrate;
        public long mChannelLayout;
        public String mCodecLongName;
        public String mCodecName;
        public String mCodecProfile;
        public int mFpsDen;
        public int mFpsNum;
        public int mHeight;
        public final int mIndex;
        public String mLanguage;
        public Bundle mMeta;
        public int mSampleRate;
        public int mSarDen;
        public int mSarNum;
        public int mTbrDen;
        public int mTbrNum;
        public String mType;
        public int mWidth;

        public IjkStreamMeta(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a3800d8df28e42c2e95f58a046d93e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a3800d8df28e42c2e95f58a046d93e9");
            } else {
                this.mIndex = i;
            }
        }

        public String getString(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0677a615dd1e11d815c12d1bdff15d5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0677a615dd1e11d815c12d1bdff15d5") : this.mMeta.getString(str);
        }

        public int getInt(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efcfb3c315bc017da16317a946739399", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efcfb3c315bc017da16317a946739399")).intValue() : getInt(str, 0);
        }

        public int getInt(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24d660a058391a323a8c6e5431aeb6f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24d660a058391a323a8c6e5431aeb6f2")).intValue();
            }
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return i;
            }
            try {
                return Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                return i;
            }
        }

        public long getLong(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe2986d3da3d01d72262bd88de180b73", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe2986d3da3d01d72262bd88de180b73")).longValue() : getLong(str, 0L);
        }

        public long getLong(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "582e639e11c498e579b984d89cf9acd4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "582e639e11c498e579b984d89cf9acd4")).longValue();
            }
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return j;
            }
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return j;
            }
        }

        public String getCodecLongNameInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297fbf24605af418659ecfb6e18b77ea", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297fbf24605af418659ecfb6e18b77ea");
            }
            if (TextUtils.isEmpty(this.mCodecLongName)) {
                return !TextUtils.isEmpty(this.mCodecName) ? this.mCodecName : "N/A";
            }
            return this.mCodecLongName;
        }

        public String getCodecShortNameInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75039313915f73dde7759fc1bc96289f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75039313915f73dde7759fc1bc96289f") : !TextUtils.isEmpty(this.mCodecName) ? this.mCodecName : "N/A";
        }

        public String getResolutionInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f04e005facde4c5dd483ddd76befa4aa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f04e005facde4c5dd483ddd76befa4aa") : (this.mWidth <= 0 || this.mHeight <= 0) ? "N/A" : (this.mSarNum <= 0 || this.mSarDen <= 0) ? String.format(Locale.US, "%d x %d", Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight)) : String.format(Locale.US, "%d x %d [SAR %d:%d]", Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mSarNum), Integer.valueOf(this.mSarDen));
        }

        public String getFpsInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f45c976fe75f715dcac8ac84d217cae3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f45c976fe75f715dcac8ac84d217cae3") : (this.mFpsNum <= 0 || this.mFpsDen <= 0) ? "N/A" : String.valueOf(this.mFpsNum / this.mFpsDen);
        }

        public String getBitrateInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0568341e2e004a5f747bf87a9b1f2e7b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0568341e2e004a5f747bf87a9b1f2e7b") : this.mBitrate <= 0 ? "N/A" : this.mBitrate < 1000 ? String.format(Locale.US, "%d bit/s", Long.valueOf(this.mBitrate)) : String.format(Locale.US, "%d kb/s", Long.valueOf(this.mBitrate / 1000));
        }

        public String getSampleRateInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee029ec1fecaa2231f17dfab7eb0d524", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee029ec1fecaa2231f17dfab7eb0d524") : this.mSampleRate <= 0 ? "N/A" : String.format(Locale.US, "%d Hz", Integer.valueOf(this.mSampleRate));
        }

        public String getChannelLayoutInline() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89289ff672c8089e6c1a01f7d08c19bd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89289ff672c8089e6c1a01f7d08c19bd") : this.mChannelLayout <= 0 ? "N/A" : this.mChannelLayout == 4 ? "mono" : this.mChannelLayout == 3 ? "stereo" : String.format(Locale.US, "%x", Long.valueOf(this.mChannelLayout));
        }
    }
}
