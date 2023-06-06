package com.sankuai.meituan.xp.core.codec;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class XPMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "XPMediaCodecInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank;

    private static String getLevelName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01bb30b4318333cc75526dd671709503", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01bb30b4318333cc75526dd671709503");
        }
        switch (i) {
            case 1:
                return "1";
            case 2:
                return "1b";
            case 4:
                return "11";
            case 8:
                return "12";
            case 16:
                return "13";
            case 32:
                return "2";
            case 64:
                return "21";
            case 128:
                return Constants.VIA_REPORT_TYPE_DATALINE;
            case 256:
                return "3";
            case 512:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case 4096:
                return "41";
            case 8192:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07defb2e0070ba29cb4f918e14a2d423", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07defb2e0070ba29cb4f918e14a2d423");
        }
        if (i != 4) {
            if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            switch (i) {
                                case 1:
                                    return "Baseline";
                                case 2:
                                    return "Main";
                                default:
                                    return "Unknown";
                            }
                        }
                        return "High444";
                    }
                    return "High422";
                }
                return "High10";
            }
            return "High";
        }
        return "Extends";
    }

    public XPMediaCodecInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f1ef3bec746a1edc5a1dbb268ef6250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f1ef3bec746a1edc5a1dbb268ef6250");
        } else {
            this.mRank = 0;
        }
    }

    private static synchronized Map<String, Integer> getKnownCodecList() {
        synchronized (XPMediaCodecInfo.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b09b4abb9725795a5d1cb60fd49a8275", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b09b4abb9725795a5d1cb60fd49a8275");
            } else if (sKnownCodecList != null) {
                return sKnownCodecList;
            } else {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                sKnownCodecList = treeMap;
                treeMap.put("OMX.Nvidia.h264.decode", 800);
                sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", 300);
                sKnownCodecList.put("OMX.Intel.hw_vd.h264", 801);
                sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", 800);
                sKnownCodecList.put("OMX.qcom.video.decoder.avc", 800);
                sKnownCodecList.put("OMX.ittiam.video.decoder.avc", 0);
                sKnownCodecList.put("OMX.SEC.avc.dec", 800);
                sKnownCodecList.put("OMX.SEC.AVC.Decoder", 799);
                sKnownCodecList.put("OMX.SEC.avcdec", 798);
                sKnownCodecList.put("OMX.SEC.avc.sw.dec", 200);
                sKnownCodecList.put("OMX.Exynos.avc.dec", 800);
                sKnownCodecList.put("OMX.Exynos.AVC.Decoder", 799);
                sKnownCodecList.put("OMX.k3.video.decoder.avc", 800);
                sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", 800);
                sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", 800);
                sKnownCodecList.put("OMX.rk.video_decoder.avc", 800);
                sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", 800);
                sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 800);
                sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", 200);
                sKnownCodecList.remove("OMX.Action.Video.Decoder");
                sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
                sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
                sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
                sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
                sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
                sKnownCodecList.remove("OMX.duos.h264.decoder");
                sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
                sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
                sKnownCodecList.remove("OMX.hisi.video.decoder");
                sKnownCodecList.remove("OMX.LG.decoder.video.avc");
                sKnownCodecList.remove("OMX.MS.AVC.Decoder");
                sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
                sKnownCodecList.remove("OMX.RTK.video.decoder");
                sKnownCodecList.remove("OMX.sprd.h264.decoder");
                sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
                sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
                sKnownCodecList.remove("OMX.WMT.decoder.avc");
                sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
                sKnownCodecList.put("OMX.google.h264.decoder", 200);
                sKnownCodecList.put("OMX.google.h264.lc.decoder", 200);
                sKnownCodecList.put("OMX.k3.ffmpeg.decoder", 200);
                sKnownCodecList.put("OMX.ffmpeg.video.decoder", 200);
                sKnownCodecList.put("OMX.sprd.node.soft.h264.decoder", 200);
                return sKnownCodecList;
            }
        }
    }

    @TargetApi(16)
    public static XPMediaCodecInfo setupCandidate(MediaCodecInfo mediaCodecInfo, String str) {
        int i = 0;
        Object[] objArr = {mediaCodecInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "721c364b62eda90aa9844d53b2b5bb0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (XPMediaCodecInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "721c364b62eda90aa9844d53b2b5bb0e");
        }
        if (mediaCodecInfo == null || Build.VERSION.SDK_INT < 16) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        String lowerCase = name.toLowerCase(Locale.US);
        if (!lowerCase.startsWith("omx.")) {
            i = 100;
        } else if (lowerCase.startsWith("omx.pv") || lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || lowerCase.startsWith("omx.k3.ffmpeg.") || lowerCase.startsWith("omx.avcodec.")) {
            i = 200;
        } else if (!lowerCase.startsWith("omx.ittiam.")) {
            if (lowerCase.startsWith("omx.mtk.")) {
                if (Build.VERSION.SDK_INT >= 18) {
                    i = 800;
                }
            } else {
                Integer num = getKnownCodecList().get(lowerCase);
                if (num != null) {
                    i = num.intValue();
                } else {
                    try {
                        if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                            i = 700;
                        }
                    } catch (Throwable unused) {
                    }
                    i = 600;
                }
            }
        }
        XPMediaCodecInfo xPMediaCodecInfo = new XPMediaCodecInfo();
        xPMediaCodecInfo.mCodecInfo = mediaCodecInfo;
        xPMediaCodecInfo.mRank = i;
        xPMediaCodecInfo.mMimeType = str;
        return xPMediaCodecInfo;
    }

    @TargetApi(16)
    public void dumpProfileLevels(String str) {
        int i;
        int i2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a97d73dd54cc1cc379aca8e8a4643b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a97d73dd54cc1cc379aca8e8a4643b5");
        } else if (Build.VERSION.SDK_INT >= 16) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.mCodecInfo.getCapabilitiesForType(str);
                if (capabilitiesForType == null || capabilitiesForType.profileLevels == null) {
                    i = 0;
                    i2 = 0;
                } else {
                    i = 0;
                    i2 = 0;
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                        if (codecProfileLevel != null) {
                            i2 = Math.max(i2, codecProfileLevel.profile);
                            i = Math.max(i, codecProfileLevel.level);
                        }
                    }
                }
                String.format(Locale.US, "%s", getProfileLevelName(i2, i));
            } catch (Throwable unused) {
            }
        }
    }

    public static String getProfileLevelName(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74b67f8c8b47faf1cb5cb0ad95d38316", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74b67f8c8b47faf1cb5cb0ad95d38316") : String.format(Locale.US, " %s Profile Level %s (%d,%d)", getProfileName(i), getLevelName(i2), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
