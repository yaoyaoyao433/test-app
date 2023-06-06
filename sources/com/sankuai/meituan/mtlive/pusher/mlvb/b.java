package com.sankuai.meituan.mtlive.pusher.mlvb;

import android.content.Context;
import android.os.Bundle;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.e;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static int b;

    public static void a(Context context, Bundle bundle, com.sankuai.meituan.mtliveqos.statistic.b bVar) {
        Object[] objArr = {context, bundle, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ece3d3d956159aacf869924d7e1af6cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ece3d3d956159aacf869924d7e1af6cd");
            return;
        }
        String string = bundle.getString("CPU_USAGE");
        int i = bundle.getInt("VIDEO_WIDTH");
        int i2 = bundle.getInt("VIDEO_HEIGHT");
        int i3 = bundle.getInt("NET_SPEED");
        int i4 = bundle.getInt("VIDEO_BITRATE");
        int i5 = bundle.getInt("AUDIO_BITRATE");
        int i6 = bundle.getInt("VIDEO_FPS");
        int i7 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE);
        int i8 = bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE);
        int i9 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP);
        int i10 = bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP);
        int i11 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP);
        String string2 = bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO);
        String string3 = bundle.getString("SERVER_IP");
        int i12 = bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE);
        int i13 = bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD);
        int i14 = bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL);
        bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE);
        int i15 = bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL);
        int i16 = bundle.getInt("NET_JITTER");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (string3 == null) {
            string3 = "";
        }
        hashMap2.put("MTLIVE_SERVER_IP", string3);
        hashMap2.put("MTLIVE_RESOLUTION", i + Constants.GestureMoveEvent.KEY_X + i2);
        if (string != null) {
            try {
                String[] split = string.replaceAll("%", "").split("/");
                if (split.length > 1) {
                    hashMap.put("MTLIVE_CPU_APP", Float.valueOf(Float.parseFloat(split[0])));
                    hashMap.put("MTLIVE_CPU_SYS", Float.valueOf(Float.parseFloat(split[1])));
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (string2 != null) {
            try {
                String[] split2 = string2.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                if (split2.length > 1) {
                    hashMap.put("MTLIVE_AEC_TYPE", Float.valueOf(split2[0]));
                    String[] split3 = split2[1].split(CommonConstant.Symbol.COMMA);
                    if (split3.length > 1) {
                        hashMap.put("MTLIVE_AUDIO_SAMPLE_RATE", Float.valueOf(split3[0].trim()));
                        hashMap.put("MTLIVE_NUM_OF_CHANNELS", Float.valueOf(split3[1].trim()));
                    }
                }
            } catch (NumberFormatException unused2) {
            }
        }
        hashMap.put("MTLIVE_AV_SPEED", Float.valueOf(i3));
        hashMap.put("MTLIVE_VIDEO_BITRATE", Float.valueOf(i4));
        hashMap.put("MTLIVE_AUDIO_BITRATE", Float.valueOf(i5));
        float f = i6;
        hashMap.put("MTLIVE_FPS", Float.valueOf(f));
        hashMap.put("MTLIVE_VIDEO_CACHE", Float.valueOf(i7));
        hashMap.put("MTLIVE_AUDIO_CACHE", Float.valueOf(i8));
        hashMap.put("MTLIVE_VIDEO_DROP", Float.valueOf(i9));
        hashMap.put("MTLIVE_AUDIO_DROP", Float.valueOf(i10));
        hashMap.put("MTLIVE_GOP", Float.valueOf(i11));
        hashMap.put("MTLIVE_V_DEC_CACHE_SIZE", Float.valueOf(i12));
        hashMap.put("MTLIVE_AV_PLAY_INTERVAL", Float.valueOf(i15));
        hashMap.put("MTLIVE_AV_RECV_INTERVAL", Float.valueOf(i14));
        hashMap.put("MTLIVE_AUDIO_CACHE_THRESHOLD", Float.valueOf(i13));
        hashMap.put("MTLIVE_JIT", Float.valueOf(i16));
        if (i9 < b) {
            b = i9;
        }
        hashMap.put("MTLIVE_VIDEO_DROP_REALTIME", Float.valueOf(i9 - b));
        hashMap.put("MTLIVE_VIDEO_ENCODED", Float.valueOf(f * 2.0f));
        b = i9;
        e.a(context, bVar, hashMap, hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.meituan.mtliveqos.common.c.a a(int r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2 = 0
            r8[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.mtlive.pusher.mlvb.b.a
            java.lang.String r10 = "bb26df1f09ef04f4534523f4be42c24c"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            com.sankuai.meituan.mtliveqos.common.c$a r11 = (com.sankuai.meituan.mtliveqos.common.c.a) r11
            return r11
        L22:
            switch(r11) {
                case -102051: goto L56;
                case -102050: goto L56;
                case -102049: goto L56;
                case -102048: goto L56;
                case -102047: goto L56;
                case -102046: goto L56;
                case -102045: goto L56;
                case -102044: goto L56;
                case -102043: goto L56;
                case -102042: goto L56;
                case -102041: goto L56;
                case -102040: goto L56;
                case -102039: goto L56;
                case -102038: goto L56;
                case -102037: goto L56;
                case -102036: goto L56;
                case -102035: goto L56;
                case -102034: goto L56;
                case -102033: goto L56;
                case -102032: goto L56;
                case -102031: goto L56;
                default: goto L25;
            }
        L25:
            switch(r11) {
                case -102016: goto L53;
                case -102015: goto L53;
                default: goto L28;
            }
        L28:
            switch(r11) {
                case -3336: goto L50;
                case -3335: goto L50;
                case -3334: goto L50;
                case -3333: goto L50;
                default: goto L2b;
            }
        L2b:
            switch(r11) {
                case -3328: goto L56;
                case -3327: goto L56;
                case -3326: goto L56;
                case -3325: goto L4d;
                case -3324: goto L50;
                case -3323: goto L50;
                case -3322: goto L50;
                case -3321: goto L50;
                case -3320: goto L4a;
                case -3319: goto L4a;
                case -3318: goto L4a;
                case -3317: goto L4a;
                case -3316: goto L4a;
                default: goto L2e;
            }
        L2e:
            switch(r11) {
                case -1328: goto L47;
                case -1327: goto L47;
                default: goto L31;
            }
        L31:
            switch(r11) {
                case -1323: goto L44;
                case -1322: goto L44;
                case -1321: goto L44;
                case -1320: goto L44;
                case -1319: goto L44;
                case -1318: goto L44;
                case -1317: goto L44;
                case -1316: goto L44;
                case -1315: goto L44;
                case -1314: goto L44;
                default: goto L34;
            }
        L34:
            switch(r11) {
                case -1309: goto L53;
                case -1308: goto L53;
                default: goto L37;
            }
        L37:
            switch(r11) {
                case -1306: goto L41;
                case -1305: goto L41;
                case -1304: goto L41;
                case -1303: goto L41;
                case -1302: goto L44;
                case -1301: goto L44;
                default: goto L3a;
            }
        L3a:
            switch(r11) {
                case -100013: goto L4a;
                case -7001: goto L53;
                case -3330: goto L56;
                case -3308: goto L4a;
                case -3301: goto L4a;
                case 0: goto L40;
                default: goto L3d;
            }
        L3d:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_OTHER
            return r11
        L40:
            return r2
        L41:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CODEC
            return r11
        L44:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_DEVICE
            return r11
        L47:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CUSTOMCAPTURE
            return r11
        L4a:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_ENTER_ROOM
            return r11
        L4d:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_EXITROOM
            return r11
        L50:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CDN
            return r11
        L53:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_SHARESCREEN
            return r11
        L56:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CONNECTOTHERROOM
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mtlive.pusher.mlvb.b.a(int):com.sankuai.meituan.mtliveqos.common.c$a");
    }
}
