package com.sankuai.meituan.mtliveqos.common;

import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        INITIALIZE("initialize", "初始化"),
        DEVICE("device", "设备错误"),
        CAPTURE("capture", "采集错误"),
        ENCODE("encode", "编码错误"),
        DECODE("decode", "解码错误"),
        NETWORK("network", "网络错误"),
        MLVB_START_PREVIEW("MLVBStartPreview", ""),
        MLVB_START_PUSH("MLVBStartPush", ""),
        MLVB_SWITCH_CAMERA("MLVBSwitchCamera", ""),
        MLVB_START_PLAY("MLVBStartPlay", ""),
        MLVB_STOP_PLAY("MLVBStopPlay", ""),
        MLVB_PREPARE_LIVE_SEEK("MLVBPrepareLiveSeek", ""),
        MLVB_RESUME_LIVE("MLVBResumeLive", ""),
        MLVB_SEEK("MLVBSeek", ""),
        MLVB_START_RECORD("MLVBStartRecord", ""),
        MLVB_STOP_RECORD("MLVBStopRecord", ""),
        MLVB_SWITCH_STREAM("MLVBSwitchStream", ""),
        MLVB_PLAY_BGM("MLVBPlayBGM", ""),
        MLVB_STOP_BGM("MLVBStopBGM", ""),
        MLVB_PAUSE_BGM("MLVBPauseBGM", ""),
        MLVB_RESUME_BGM("MLVBResumeBGM", ""),
        MLVB_SET_BGM_VOLUME("MLVBSetBGMVolume", ""),
        MLVB_SET_MIC_VOLUME("MLVBSetMicVolume", ""),
        MLVB_SET_BGM_PITCH("MLVBSetBGMPitch", ""),
        MLVB_SET_REVER_BTYPE("MLVBSetReverbType", ""),
        MLVB_SET_VOICE_CHANGER_TYPE("MLVBSetVoiceChangerType", ""),
        MLVB_SET_BGM_POSITION("MLVBSetBGMPosition", ""),
        MLVB_STAR_TPLAY("MLVBStartPlay", ""),
        MLVB_PREPARE_LIVESEEK("MLVBPrepareLiveSeek", ""),
        TRTC_ENTER_ROOM("TRTCEnterRoom", ""),
        TRTC_EXITROOM("TRTCExitRoom", ""),
        TRTC_DEVICE("TRTCDevice", ""),
        TRTC_SHARESCREEN("TRTCShareScreen", ""),
        TRTC_CODEC("TRTCCodec", ""),
        TRTC_CUSTOMCAPTURE("TRTCCustomCapture", ""),
        TRTC_CDN("TRTCCDN", ""),
        TRTC_CONNECTOTHERROOM("TRTCConnectOtherRoom", ""),
        TRTC_OTHER("TRTCOther", ""),
        TRTC_NETWORK("TRTCNetwork", ""),
        TRTC_EXIT_ROOM("TRTCExitRoom", ""),
        TRTC_SHARE_SCREEN("TRTCShareScreen", ""),
        TRTC_CUSTOM_CAPTURE("TRTCCustomCapture", ""),
        TRTC_CONNECT_OTHERROOM("TRTCConnectOtherRoom", ""),
        TRTC_CUSTOM("TRTCCustom", ""),
        TRTC_STOP_SCREEN_CAPTURE("TRTCStopScreenCapture", ""),
        TRTC_ENABLE_ENC_SMALLVIDEOSTREAM("TRTCEnableEncSmallVideoStream", ""),
        TRTC_START_AUDIO_RECORDING("TRTCStartAudioRecording", ""),
        TRTC_SET_CURRENT_CAMERA_DEVICE("TRTCSetCurrentCameraDevice", ""),
        TRTC_SET_CURRENT_MIC_DEVICE("TRTCSetCurrentMicDevice", ""),
        TRTC_SET_CURRENT_SPEAKER_DEVICE("TRTCSetCurrentSpeakerDevice", ""),
        TRTC_SET_CURRENT_SPEAKER_DEVICE_VOLUME("TRTCSetCurrentSpeakerDeviceVolume", ""),
        TRTC_PAUSE_SCREEN_CAPTURE("TRTCPauseScreenCapture", ""),
        TRTC_RESUME_SCREEN_CAPTURE("TRTCResumeScreenCapture", ""),
        TRTC_SET_LOCAL_VIDEO_RENDER_DELEGATE("TRTCSetLocalVideoRenderDelegate", ""),
        TRTC_SET_REMOTE_VIDEO_RENDER_DELEGATE("TRTCSetRemoteVideoRenderDelegate", ""),
        TRTC_SET_BGM_POSITION("TRTCSetBGMPosition", ""),
        TRTC_ENBALE_TORCH("TRTCEnbaleTorch", ""),
        TRTC_SEND_CUSTOM_CMDMSG("TRTCSendCustomCmdMsg", ""),
        TRTC_SEND_SEIMSG("TRTCSendSEIMsg", ""),
        MTLIVE_ERROR_CATEGORY_FIRST_VIDEO_FRAME("first_video_frame", ""),
        MTLIVE_ERROR_CATEGORY_CPU_APP_OVERLOAD("cpu_app_overload", ""),
        MTLIVE_ERROR_CATEGORY_CPU_SYS_OVERLOAD("cpu_sys_overload", ""),
        MTLIVE_ERROR_CATEGORY_INVALID_STREAM_URL("invalid_stream_url", ""),
        RR_WARING_VIDEO_FROZEN("video_frozen", ""),
        RR_WARING_LATENCY_ALL("latency_all", "");
        
        public static ChangeQuickRedirect a;
        public String ao;
        private String ap;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8777de18540664d94b7760ef6587a4d6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8777de18540664d94b7760ef6587a4d6") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70c9715770da7a84752f7f56921c7227", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70c9715770da7a84752f7f56921c7227") : (a[]) values().clone();
        }

        a(String str, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af55f983458aecc2d3c1a8f861f6025", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af55f983458aecc2d3c1a8f861f6025");
                return;
            }
            this.ao = str;
            this.ap = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum f {
        UNKNOWN("Unknown", 0, ""),
        PUSH("Push", 1, "推流"),
        PLAY("Play", 2, "拉流"),
        VIDEO_CALL("VideoCall", 3, "视频通话场景"),
        AUDIO_CALL("AudioCall", 4, "语音通话场景"),
        LIVE("VideoChatRoom", 5, "视频互动直播"),
        VOICE_CHAT_ROOM("VoiceChatRoom", 6, "语音互动直播"),
        VOD("VOD", 6, "语音互动直播"),
        ANIM_PLAYER("anim-player", 6, "动效"),
        COIN_PLAYER("CoinPlayer", 7, "看视频领金币");
        
        public static ChangeQuickRedirect a;
        public String l;
        private int m;
        private String n;

        public static f valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "113e10068da828a43d57601d7188c0b4", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "113e10068da828a43d57601d7188c0b4") : (f) Enum.valueOf(f.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static f[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2980fd6c1966e103abadabe3e2b7733e", RobustBitConfig.DEFAULT_VALUE) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2980fd6c1966e103abadabe3e2b7733e") : (f[]) values().clone();
        }

        f(String str, int i, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa6561c2db0958e99219b334b25dd8f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa6561c2db0958e99219b334b25dd8f");
                return;
            }
            this.l = str;
            this.m = i;
            this.n = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum e {
        NETWORK_UNAVAILABLE("Unavailable", -2, ""),
        NETWORK_UNKNOWN("Unknown", -1, ""),
        NETWORK_WIFI("WiFi", 0, ""),
        NETWORK_G("Celluar", 1, ""),
        NETWORK_2G("2G", 2, ""),
        NETWORK_3G("3G", 3, ""),
        NETWORK_4G("4G", 4, ""),
        NETWORK_5G("5G", 5, "");
        
        public static ChangeQuickRedirect a;
        public String j;
        public int k;
        private String l;

        public static e valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e44c2b2fc67c3ec152d3570ecae17ea0", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e44c2b2fc67c3ec152d3570ecae17ea0") : (e) Enum.valueOf(e.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09c6400b97bdf03b637557a9b5309329", RobustBitConfig.DEFAULT_VALUE) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09c6400b97bdf03b637557a9b5309329") : (e[]) values().clone();
        }

        e(String str, int i, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25390cfd0476063a2b7d16ac7295584f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25390cfd0476063a2b7d16ac7295584f");
                return;
            }
            this.j = str;
            this.k = i;
            this.l = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum d {
        UNKNOWN("Unknown", 0, ""),
        SOFTWARE("Software", 1, ""),
        HARDWARE("Hardware", 2, "");
        
        public static ChangeQuickRedirect a;
        String e;
        private int f;
        private String g;

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d00eb563e91715f69d39a1ca9f7c240", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d00eb563e91715f69d39a1ca9f7c240") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ca5b03103ed3ff1cefbab1bb13137b9", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ca5b03103ed3ff1cefbab1bb13137b9") : (d[]) values().clone();
        }

        d(String str, int i, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddc921668efeecd28d86b3780c72564e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddc921668efeecd28d86b3780c72564e");
                return;
            }
            this.e = str;
            this.f = i;
            this.g = str2;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtliveqos.common.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0620c {
        UNKNOWN("Unknown", 0, ""),
        SOFTWARE("Software", 1, ""),
        HARDWARE("Hardware", 2, "");
        
        public static ChangeQuickRedirect a;
        String e;
        public int f;
        private String g;

        public static EnumC0620c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ea2ec3e6513dbe79c44149240c876e8", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0620c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ea2ec3e6513dbe79c44149240c876e8") : (EnumC0620c) Enum.valueOf(EnumC0620c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0620c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6f1333b1c95c30309df644dc0fc4a3c", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0620c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6f1333b1c95c30309df644dc0fc4a3c") : (EnumC0620c[]) values().clone();
        }

        EnumC0620c(String str, int i, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef7005d4a1c1163e093d7bc44fa86a4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef7005d4a1c1163e093d7bc44fa86a4");
                return;
            }
            this.e = str;
            this.f = i;
            this.g = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum g {
        UNKNOW("Unknown", 0, ""),
        MLVB("MLVB", 1, ""),
        TCRC(HHNetConfig.VIDEO_TYPE, 2, ""),
        RIVER_RUN("Riverrun", 3, ""),
        ANIM_PLAYER("anim-player", 6, "动效"),
        COIN_PLAYER("CoinPlayer", 4, "看视频领金币");
        
        public static ChangeQuickRedirect a;
        public String h;
        private String i;
        private int j;

        public static g valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be73c2c94144115b7efa290e24fd3427", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be73c2c94144115b7efa290e24fd3427") : (g) Enum.valueOf(g.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static g[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80b1a64d65df0f3e89cf67c5bacdca75", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80b1a64d65df0f3e89cf67c5bacdca75") : (g[]) values().clone();
        }

        g(String str, int i, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691110128f75201724dc77aeae500b65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691110128f75201724dc77aeae500b65");
                return;
            }
            this.h = str;
            this.i = str2;
            this.j = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        MTLIVE_ADD_EXTRA_EVENT_VALUE("event", ""),
        MTLIVE_ADD_EXTRA_EVENT_NAME("event_name", ""),
        MTLIVE_ADD_EXTRA_EVENT_TIMESTAMP("event_value", ""),
        MTLIVE_ADD_MATRIX_EVENT_TYPE("MTLIVE_EVENT", ""),
        MTLIVE_ADD_MATRIX_EVENT_NAME("MTLIVE_EVENT_TYPE", ""),
        MTLIVE_ADD_MATRIX_EVENT_VALUE("MTLIVE_EVENT_VALUE", ""),
        MTLIVE_EVENT_SYNC_CLOCK("MTLIVE_EVENT_SYNC_CLOCK", ""),
        MTLIVE_EVENT_ENTER_ROOM("MTLIVE_ENTER_ROOM", ""),
        MTLIVE_EVENT_EXIT_ROOM("MTLIVE_EXIT_ROOM", ""),
        MTLIVE_EVENT_PREPARE_TO_PLAY("MTLIVE_PREPARE_TO_PLAY", ""),
        MTLIVE_EVENT_FIRST_VIDEO_FRAME_SHOW("MTLIVE_FIRST_VIDEO_FRAME", ""),
        MTLIVE_EVENT_APP_DID_ENTER_BACKGROUND("MTLIVE_APP_ENTER_BACKGROUND", ""),
        MTLIVE_EVENT_APP_WILL_ENTER_FOREGROUND("MTLIVE_APP_ENTER_FOREGROUND", ""),
        MTLIVE_EVENT_START_PLAY("MTLIVE_START_PLAY", ""),
        MTLIVE_EVENT_STOP_PLAY("MTLIVE_STOP_PLAY", ""),
        MTLIVE_NORMAL_CATEGORY_PLAY_STATISTICS("MTLIVE_PLAY_STATISTICS", ""),
        MTLIVE_EVENT_LIVE_START_RESULT("MTLIVE_LIVE_START_RESULT", ""),
        MTLIVE_EVENT_LIVE_START_COUNT("MTLIVE_LIVE_START_COUNT", ""),
        MTLIVE_EVENT_LIVE_START_SUCCESS_COUNT("MTLIVE_LIVE_START_SUCCESS_COUNT", ""),
        MTLIVE_EVENT_LIVE_VIDEO_RESOLUTION("MTLIVE_LIVE_VIDEO_RESOLUTION", ""),
        MTLIVE_EVENT_LIVE_VIDEO_FPS("MTLIVE_LIVE_VIDEO_FPS", ""),
        MTLIVE_EVENT_LIVE_VIDEO_BITRATE("MTLIVE_LIVE_VIDEO_BITRATE", ""),
        MTLIVE_EVENT_LIVE_AUTO_RESTART("MTLIVE_LIVE_AUTO_RESTART", ""),
        MTLIVE_EVENT_LIVE_ABNORMAL_INDEX("MTLIVE_LIVE_ABNORMAL_INDEX", "异常指标"),
        MTLIVE_EVENT_LIVE_ERROR("MTLIVE_LIVE_ERROR", ""),
        MTLIVE_FIRST_FRAME_ERROR("MTLIVE_FIRST_FRAME_ERROR", ""),
        MTLIVE_VIDEO_FROZEN_ERROR("MTLIVE_VIDEO_FROZEN_ERROR", "");
        
        public static ChangeQuickRedirect a;
        public String C;
        public String D;

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09324cda54a40ad873a1a63f1d2b0487", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09324cda54a40ad873a1a63f1d2b0487") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "845000f74dd7d821223cbcdc66b3259a", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "845000f74dd7d821223cbcdc66b3259a") : (b[]) values().clone();
        }

        b(String str, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc35198d7fd9dc12afcbe47e25e8a6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc35198d7fd9dc12afcbe47e25e8a6c");
                return;
            }
            this.C = str;
            this.D = str2;
        }
    }
}
