package com.sankuai.meituan.mtlive.mtrtc.tx;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.mtrtc.library.MTRTCVideoView;
import com.sankuai.meituan.mtlive.mtrtc.library.b;
import com.sankuai.meituan.mtlive.mtrtc.library.c;
import com.sankuai.meituan.mtlive.mtrtc.library.d;
import com.sankuai.meituan.mtlive.mtrtc.library.g;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.mtliveqos.common.e;
import com.sankuai.meituan.mtliveqos.f;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements b {
    public static ChangeQuickRedirect b;
    protected static TRTCCloud c;
    private int a;
    private com.sankuai.meituan.mtlive.mtrtc.library.a d;
    private d e;
    private long f;
    private Context g;
    private long h;
    private String i;
    private long j;
    private String k;
    private int l;
    private String m;
    private String n;
    private com.sankuai.meituan.mtliveqos.statistic.b o;

    public static /* synthetic */ c.C0611c a(a aVar, TRTCCloudDef.TRTCQuality tRTCQuality) {
        Object[] objArr = {tRTCQuality};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0ac3213fedbea8f35685bfc04c526740", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.C0611c) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0ac3213fedbea8f35685bfc04c526740");
        }
        if (tRTCQuality == null) {
            return null;
        }
        c.C0611c c0611c = new c.C0611c();
        c0611c.b = tRTCQuality.quality;
        c0611c.a = tRTCQuality.userId;
        return c0611c;
    }

    public static /* synthetic */ c.d a(a aVar, TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult) {
        Object[] objArr = {tRTCSpeedTestResult};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ebaafd5341608aaddf7fa48af60ad427", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.d) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ebaafd5341608aaddf7fa48af60ad427");
        }
        if (tRTCSpeedTestResult == null) {
            return null;
        }
        c.d dVar = new c.d();
        dVar.d = tRTCSpeedTestResult.downLostRate;
        dVar.a = tRTCSpeedTestResult.ip;
        dVar.b = tRTCSpeedTestResult.quality;
        dVar.e = tRTCSpeedTestResult.rtt;
        dVar.c = tRTCSpeedTestResult.upLostRate;
        return dVar;
    }

    public static /* synthetic */ c.f a(a aVar, TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo) {
        Object[] objArr = {tRTCVolumeInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3a975d4035e8d9411c507c6be032ae0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.f) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3a975d4035e8d9411c507c6be032ae0e");
        }
        if (tRTCVolumeInfo == null) {
            return null;
        }
        c.f fVar = new c.f();
        fVar.a = tRTCVolumeInfo.userId;
        fVar.b = tRTCVolumeInfo.volume;
        return fVar;
    }

    public static /* synthetic */ g a(a aVar, TRTCStatistics tRTCStatistics) {
        g.b bVar;
        g.a aVar2;
        int i = 1;
        char c2 = 0;
        Object[] objArr = {tRTCStatistics};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "aa16d92d8c92664030afe2b138c0781b", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "aa16d92d8c92664030afe2b138c0781b");
        }
        if (tRTCStatistics == null) {
            return null;
        }
        g gVar = new g();
        gVar.a = tRTCStatistics.appCpu;
        gVar.e = tRTCStatistics.downLoss;
        gVar.g = tRTCStatistics.receiveBytes;
        if (tRTCStatistics.localArray != null) {
            ArrayList<g.a> arrayList = new ArrayList<>();
            Iterator<TRTCStatistics.TRTCLocalStatistics> it = tRTCStatistics.localArray.iterator();
            while (it.hasNext()) {
                TRTCStatistics.TRTCLocalStatistics next = it.next();
                if (next != null) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = next;
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f3d5d2611c8040bac3eee91c9995aadf", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2 = (g.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f3d5d2611c8040bac3eee91c9995aadf");
                    } else if (next == null) {
                        aVar2 = null;
                    } else {
                        aVar2 = new g.a();
                        aVar2.f = next.audioBitrate;
                        aVar2.e = next.audioSampleRate;
                        aVar2.c = next.frameRate;
                        aVar2.b = next.height;
                        aVar2.g = next.streamType;
                        aVar2.d = next.videoBitrate;
                        aVar2.a = next.width;
                    }
                    arrayList.add(aVar2);
                }
                i = 1;
            }
            gVar.h = arrayList;
        }
        if (tRTCStatistics.remoteArray != null) {
            ArrayList<g.b> arrayList2 = new ArrayList<>();
            Iterator<TRTCStatistics.TRTCRemoteStatistics> it2 = tRTCStatistics.remoteArray.iterator();
            while (it2.hasNext()) {
                TRTCStatistics.TRTCRemoteStatistics next2 = it2.next();
                if (next2 != null) {
                    Object[] objArr3 = new Object[1];
                    objArr3[c2] = next2;
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0080f03883156f976ed782c75ee34ef4", RobustBitConfig.DEFAULT_VALUE)) {
                        bVar = (g.b) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0080f03883156f976ed782c75ee34ef4");
                    } else if (next2 == null) {
                        bVar = null;
                    } else {
                        bVar = new g.b();
                        bVar.g = next2.audioBitrate;
                        bVar.f = next2.audioSampleRate;
                        bVar.d = next2.frameRate;
                        bVar.c = next2.height;
                        bVar.h = next2.streamType;
                        bVar.e = next2.videoBitrate;
                        bVar.a = next2.finalLoss;
                        bVar.b = next2.width;
                    }
                    arrayList2.add(bVar);
                }
                c2 = 0;
            }
            gVar.i = arrayList2;
        }
        gVar.c = tRTCStatistics.rtt;
        gVar.f = tRTCStatistics.sendBytes;
        gVar.b = tRTCStatistics.systemCpu;
        gVar.d = tRTCStatistics.upLoss;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.sankuai.meituan.mtliveqos.common.c.a a(com.sankuai.meituan.mtlive.mtrtc.tx.a r11, int r12) {
        /*
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.mtlive.mtrtc.tx.a.b
            java.lang.String r10 = "b8dd835dd6be57cfe396bd9ee342fb68"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.sankuai.meituan.mtliveqos.common.c$a r11 = (com.sankuai.meituan.mtliveqos.common.c.a) r11
            return r11
        L22:
            switch(r12) {
                case -102051: goto L57;
                case -102050: goto L57;
                case -102049: goto L57;
                case -102048: goto L57;
                case -102047: goto L57;
                case -102046: goto L57;
                case -102045: goto L57;
                case -102044: goto L57;
                case -102043: goto L57;
                case -102042: goto L57;
                case -102041: goto L57;
                case -102040: goto L57;
                case -102039: goto L57;
                case -102038: goto L57;
                case -102037: goto L57;
                case -102036: goto L57;
                case -102035: goto L57;
                case -102034: goto L57;
                case -102033: goto L57;
                case -102032: goto L57;
                case -102031: goto L57;
                default: goto L25;
            }
        L25:
            switch(r12) {
                case -102016: goto L54;
                case -102015: goto L54;
                default: goto L28;
            }
        L28:
            switch(r12) {
                case -3336: goto L51;
                case -3335: goto L51;
                case -3334: goto L51;
                case -3333: goto L51;
                default: goto L2b;
            }
        L2b:
            switch(r12) {
                case -3328: goto L57;
                case -3327: goto L57;
                case -3326: goto L57;
                case -3325: goto L4e;
                case -3324: goto L51;
                case -3323: goto L51;
                case -3322: goto L51;
                case -3321: goto L51;
                case -3320: goto L4b;
                case -3319: goto L4b;
                case -3318: goto L4b;
                case -3317: goto L4b;
                case -3316: goto L4b;
                default: goto L2e;
            }
        L2e:
            switch(r12) {
                case -1328: goto L48;
                case -1327: goto L48;
                default: goto L31;
            }
        L31:
            switch(r12) {
                case -1323: goto L45;
                case -1322: goto L45;
                case -1321: goto L45;
                case -1320: goto L45;
                case -1319: goto L45;
                case -1318: goto L45;
                case -1317: goto L45;
                case -1316: goto L45;
                case -1315: goto L45;
                case -1314: goto L45;
                default: goto L34;
            }
        L34:
            switch(r12) {
                case -1309: goto L54;
                case -1308: goto L54;
                default: goto L37;
            }
        L37:
            switch(r12) {
                case -1306: goto L42;
                case -1305: goto L42;
                case -1304: goto L42;
                case -1303: goto L42;
                case -1302: goto L45;
                case -1301: goto L45;
                default: goto L3a;
            }
        L3a:
            switch(r12) {
                case -100013: goto L4b;
                case -7001: goto L54;
                case -3330: goto L57;
                case -3308: goto L4b;
                case -3301: goto L4b;
                case 0: goto L40;
                default: goto L3d;
            }
        L3d:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_OTHER
            return r11
        L40:
            r11 = 0
            return r11
        L42:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CODEC
            return r11
        L45:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_DEVICE
            return r11
        L48:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CUSTOMCAPTURE
            return r11
        L4b:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_ENTER_ROOM
            return r11
        L4e:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_EXITROOM
            return r11
        L51:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CDN
            return r11
        L54:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_SHARESCREEN
            return r11
        L57:
            com.sankuai.meituan.mtliveqos.common.c$a r11 = com.sankuai.meituan.mtliveqos.common.c.a.TRTC_CONNECTOTHERROOM
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mtlive.mtrtc.tx.a.a(com.sankuai.meituan.mtlive.mtrtc.tx.a, int):com.sankuai.meituan.mtliveqos.common.c$a");
    }

    public static /* synthetic */ void a(a aVar, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "33ebf86efb79a3d4cbe8056a4034e4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "33ebf86efb79a3d4cbe8056a4034e4bb");
        } else if (i != 2105 || bundle == null) {
        } else {
            try {
                Matcher matcher = Pattern.compile("[0-9]+").matcher(bundle.getString("EVT_MSG"));
                if (matcher.find()) {
                    Float valueOf = Float.valueOf(matcher.group());
                    HashMap hashMap = new HashMap();
                    hashMap.put("MTLIVE_VIDEO_FROZEN", valueOf);
                    com.sankuai.meituan.mtliveqos.d.a(aVar.g, aVar.g(), hashMap, null, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void a(a aVar, Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, c.f fVar, TRTCStatistics tRTCStatistics) {
        int i = 0;
        Object[] objArr = {context, bVar, fVar, tRTCStatistics};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "abbcd561d6e31e3006326e434dfd443a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "abbcd561d6e31e3006326e434dfd443a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_CPU_APP", Float.valueOf(tRTCStatistics.appCpu));
        hashMap.put("MTLIVE_CPU_SYS", Float.valueOf(tRTCStatistics.systemCpu));
        hashMap.put("MTLIVE_RTT", Float.valueOf(tRTCStatistics.rtt));
        hashMap.put("MTLIVE_UP_LOSS", Float.valueOf(tRTCStatistics.upLoss));
        hashMap.put("MTLIVE_DOWN_LOSS", Float.valueOf(tRTCStatistics.downLoss));
        if (tRTCStatistics.localArray != null) {
            Iterator<TRTCStatistics.TRTCLocalStatistics> it = tRTCStatistics.localArray.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                TRTCStatistics.TRTCLocalStatistics next = it.next();
                i2 += next.frameRate;
                i3 += next.videoBitrate;
                i4 += next.audioBitrate;
                i5 = next.audioSampleRate;
            }
            hashMap.put("MTLIVE_VIDEO_BITRATE", Float.valueOf(i3));
            hashMap.put("MTLIVE_FPS", Float.valueOf(i2));
            hashMap.put("MTLIVE_AUDIO_BITRATE", Float.valueOf(i4));
            hashMap.put("MTLIVE_AUDIO_SAMPLE_RATE", Float.valueOf(i5));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("MTLIVE_RESOLUTION", "0x0");
            aVar.a(context, bVar, (Map<String, Float>) hashMap, (Map<String, String>) hashMap2, true);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("MTLIVE_CPU_APP", Float.valueOf(tRTCStatistics.appCpu));
        hashMap3.put("MTLIVE_CPU_SYS", Float.valueOf(tRTCStatistics.systemCpu));
        hashMap3.put("MTLIVE_RTT", Float.valueOf(tRTCStatistics.rtt));
        hashMap3.put("MTLIVE_UP_LOSS", Float.valueOf(tRTCStatistics.upLoss));
        hashMap3.put("MTLIVE_DOWN_LOSS", Float.valueOf(tRTCStatistics.downLoss));
        if (tRTCStatistics.remoteArray != null) {
            Iterator<TRTCStatistics.TRTCRemoteStatistics> it2 = tRTCStatistics.remoteArray.iterator();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (it2.hasNext()) {
                TRTCStatistics.TRTCRemoteStatistics next2 = it2.next();
                i += next2.finalLoss;
                i6 += next2.frameRate;
                i7 += next2.videoBitrate;
                i8 += next2.audioBitrate;
                i10 = next2.width;
                i11 = next2.height;
                i9 = next2.audioSampleRate;
            }
            hashMap3.put("MTLIVE_FINAL_LOSS", Float.valueOf(i));
            hashMap3.put("MTLIVE_VIDEO_BITRATE", Float.valueOf(i7));
            hashMap3.put("MTLIVE_FPS", Float.valueOf(i6));
            hashMap3.put("MTLIVE_AUDIO_BITRATE", Float.valueOf(i8));
            hashMap3.put("MTLIVE_AUDIO_SAMPLE_RATE", Float.valueOf(i9));
            HashMap hashMap4 = new HashMap();
            hashMap4.put("MTLIVE_RESOLUTION", i10 + Constants.GestureMoveEvent.KEY_X + i11);
            aVar.a(context, bVar, (Map<String, Float>) hashMap3, (Map<String, String>) hashMap4, false);
        }
    }

    public static /* synthetic */ void a(a aVar, c.a aVar2, int i, String str) {
        Object[] objArr = {aVar2, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a747d7ed913cc074728b042e8dde6047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a747d7ed913cc074728b042e8dde6047");
            return;
        }
        new HashMap().put("MTLIVE_ROOM_ID", String.valueOf(aVar.a));
        com.sankuai.meituan.mtliveqos.statistic.a aVar3 = new com.sankuai.meituan.mtliveqos.statistic.a();
        aVar3.b = i;
        aVar3.d = aVar2 == null ? StringUtil.NULL : aVar2.ao;
        aVar3.c = str;
        aVar.g();
    }

    public a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aab620b1737cd4f5f15f9f3203265bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aab620b1737cd4f5f15f9f3203265bd");
            return;
        }
        this.f = 0L;
        this.h = 0L;
        this.g = context.getApplicationContext();
        this.i = String.valueOf(i);
        c = TRTCCloud.sharedInstance(context);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18b9097982b5306b87b3a98b76f5fc15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18b9097982b5306b87b3a98b76f5fc15");
        } else {
            c.setListener(new TRTCCloudListener() { // from class: com.sankuai.meituan.mtlive.mtrtc.tx.a.1
                public static ChangeQuickRedirect a;

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onError(int i2, String str, Bundle bundle) {
                    Object[] objArr3 = {Integer.valueOf(i2), str, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "159b2957dff9432b8a09a43dab9c6f75", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "159b2957dff9432b8a09a43dab9c6f75");
                        return;
                    }
                    super.onError(i2, str, bundle);
                    a aVar = a.this;
                    aVar.a("onError ", "错误回调，表示 SDK 不可恢复的错误 errorCode = " + i2 + " 描述 = " + str);
                    if (a.this.e != null) {
                        a.this.e.onError(i2, str, bundle);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onWarning(int i2, String str, Bundle bundle) {
                    Object[] objArr3 = {Integer.valueOf(i2), str, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9d579f29fd5054f3ef7a75db4ab25076", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9d579f29fd5054f3ef7a75db4ab25076");
                        return;
                    }
                    super.onWarning(i2, str, bundle);
                    a aVar = a.this;
                    aVar.a("onWarning ", "警告回调，用于告知您一些非严重性问题 warnCode = " + i2 + " 描述 = " + str);
                    a.a(a.this, a.a(a.this, i2), i2, str);
                    a.a(a.this, i2, bundle);
                    if (a.this.e != null) {
                        a.this.e.onWarning(i2, str, bundle);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onEnterRoom(long j) {
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c7eb7263143a8129a032901b9a3a456", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c7eb7263143a8129a032901b9a3a456");
                        return;
                    }
                    super.onEnterRoom(j);
                    a.this.j = System.currentTimeMillis();
                    a aVar = a.this;
                    aVar.a("onEnterRoom ", "进入房间 time = " + j);
                    if (a.this.e != null) {
                        a.this.e.onEnterRoom(j);
                    }
                    if (j < 0) {
                        int i2 = (int) j;
                        a.a(a.this, a.a(a.this, i2), i2, "");
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onExitRoom(int i2) {
                    Object[] objArr3 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "459f7f402d451c42e40f2a08c508f57a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "459f7f402d451c42e40f2a08c508f57a");
                        return;
                    }
                    super.onExitRoom(i2);
                    a aVar = a.this;
                    aVar.a("onExitRoom ", "onExitRoom: " + i2);
                    if (a.this.e != null) {
                        a.this.e.onExitRoom(i2);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onSwitchRole(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2d51cf40f5291770b204fd4847b7ae1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2d51cf40f5291770b204fd4847b7ae1");
                        return;
                    }
                    super.onSwitchRole(i2, str);
                    a aVar = a.this;
                    aVar.a("onSwitchRole ", "切换角色的事件回调 result = " + i2 + " 描述  = " + str);
                    if (a.this.e != null) {
                        a.this.e.onSwitchRole(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onConnectOtherRoom(String str, int i2, String str2) {
                    Object[] objArr3 = {str, Integer.valueOf(i2), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7113f3f106173cfcee6e8c01dea552e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7113f3f106173cfcee6e8c01dea552e");
                        return;
                    }
                    super.onConnectOtherRoom(str, i2, str2);
                    a aVar = a.this;
                    aVar.a("onConnectOtherRoom ", "跨房连麦会结果回调 result = " + i2 + " 描述  = " + str);
                    if (a.this.e != null) {
                        a.this.e.onConnectOtherRoom(str, i2, str2);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onDisConnectOtherRoom(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d00e94cff626847fa97fda160a63c53c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d00e94cff626847fa97fda160a63c53c");
                        return;
                    }
                    super.onDisConnectOtherRoom(i2, str);
                    a aVar = a.this;
                    aVar.a("onDisConnectOtherRoom ", "退出跨房通话 result = " + i2 + " 描述  = " + str);
                    if (a.this.e != null) {
                        a.this.e.onDisConnectOtherRoom(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onRemoteUserEnterRoom(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4e4df7d35e9049e94d05e34410ba74a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4e4df7d35e9049e94d05e34410ba74a");
                        return;
                    }
                    super.onRemoteUserEnterRoom(str);
                    a aVar = a.this;
                    aVar.a("onRemoteUserEnterRoom ", "onRemoteUserEnterRoom: " + str);
                    if (a.this.e != null) {
                        a.this.e.onRemoteUserEnterRoom(str);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onRemoteUserLeaveRoom(String str, int i2) {
                    Object[] objArr3 = {str, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da665b0de9d3032e59c9a1a767d150b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da665b0de9d3032e59c9a1a767d150b5");
                        return;
                    }
                    super.onRemoteUserLeaveRoom(str, i2);
                    a aVar = a.this;
                    aVar.a("onRemoteUserLeaveRoom ", "onRemoteUserLeaveRoom: " + str + ",  " + i2);
                    if (a.this.e != null) {
                        a.this.e.onRemoteUserLeaveRoom(str, i2);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onUserVideoAvailable(String str, boolean z) {
                    Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56d443ace358b0dff282a918bc0c27b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56d443ace358b0dff282a918bc0c27b8");
                        return;
                    }
                    super.onUserVideoAvailable(str, z);
                    a aVar = a.this;
                    aVar.a("onUserVideoAvailable ", "onUserVideoAvailable: " + str + ", " + z);
                    if (a.this.e != null) {
                        a.this.e.onUserVideoAvailable(str, z);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onUserSubStreamAvailable(String str, boolean z) {
                    Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e52205c1b360eb19874b3880b011534", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e52205c1b360eb19874b3880b011534");
                        return;
                    }
                    super.onUserSubStreamAvailable(str, z);
                    a aVar = a.this;
                    aVar.a("onUserSubStreamAvailable ", "onUserSubStreamAvailable: " + str + ", " + z);
                    if (a.this.e != null) {
                        a.this.e.onUserSubStreamAvailable(str, z);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onUserAudioAvailable(String str, boolean z) {
                    Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f6136de8e4e0cc84026539950a9afec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f6136de8e4e0cc84026539950a9afec");
                        return;
                    }
                    super.onUserAudioAvailable(str, z);
                    a aVar = a.this;
                    aVar.a("onUserAudioAvailable ", "onUserAudioAvailable: " + str + ", " + z);
                    if (a.this.e != null) {
                        a.this.e.onUserAudioAvailable(str, z);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onFirstVideoFrame(String str, int i2, int i3, int i4) {
                    Object[] objArr3 = {str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7e3d2f3106ed820ce19d55ebb2576cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7e3d2f3106ed820ce19d55ebb2576cd");
                        return;
                    }
                    super.onFirstVideoFrame(str, i2, i3, i4);
                    a aVar = a.this;
                    aVar.a("onFirstVideoFrame ", "onFirstVideoFrame: " + str + ", " + i2 + ", " + i3 + ", " + i4);
                    if (a.this.e != null) {
                        a.this.e.onFirstVideoFrame(str, i2, i3, i4);
                    }
                    if (TextUtils.isEmpty(str) || !TextUtils.equals(str, a.this.m)) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("MTLIVE_FIRST_VIDEO_FRAME", Float.valueOf((float) (System.currentTimeMillis() - a.this.j)));
                    a.this.a((Map<String, Float>) hashMap, true);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onFirstAudioFrame(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1396775f455d0069016abc10f98f83f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1396775f455d0069016abc10f98f83f1");
                        return;
                    }
                    super.onFirstAudioFrame(str);
                    a aVar = a.this;
                    aVar.a("onFirstAudioFrame ", "onFirstAudioFrame: " + str);
                    if (a.this.e != null) {
                        a.this.e.onFirstAudioFrame(str);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onSendFirstLocalVideoFrame(int i2) {
                    Object[] objArr3 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "569985fbd3aab7a9cf129f4c09c33531", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "569985fbd3aab7a9cf129f4c09c33531");
                        return;
                    }
                    super.onSendFirstLocalVideoFrame(i2);
                    a aVar = a.this;
                    aVar.a("onSendFirstLocalVideoFrame ", "onSendFirstLocalVideoFrame: " + i2);
                    if (a.this.e != null) {
                        a.this.e.onSendFirstLocalVideoFrame(i2);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onSendFirstLocalAudioFrame() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "375f1ca7ffea1493880381edfa8b93ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "375f1ca7ffea1493880381edfa8b93ba");
                        return;
                    }
                    super.onSendFirstLocalAudioFrame();
                    a.this.a("onSendFirstLocalAudioFrame ", "onSendFirstLocalAudioFrame");
                    if (a.this.e != null) {
                        a.this.e.onSendFirstLocalAudioFrame();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onUserEnter(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8229af0882cab101f4869af4f89fbb96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8229af0882cab101f4869af4f89fbb96");
                    } else {
                        super.onUserEnter(str);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onUserExit(String str, int i2) {
                    Object[] objArr3 = {str, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03cc62762d9b83f561c5d8d9a12778ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03cc62762d9b83f561c5d8d9a12778ab");
                    } else {
                        super.onUserExit(str, i2);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onNetworkQuality(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
                    Object[] objArr3 = {tRTCQuality, arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "632d04206d749925941ac40af0f354ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "632d04206d749925941ac40af0f354ed");
                        return;
                    }
                    super.onNetworkQuality(tRTCQuality, arrayList);
                    if (6 == tRTCQuality.quality) {
                        a.a(a.this, c.a.TRTC_NETWORK, 0, "网络不可用");
                    }
                    ArrayList<c.C0611c> arrayList2 = null;
                    if (arrayList != null) {
                        arrayList2 = new ArrayList<>();
                        Iterator<TRTCCloudDef.TRTCQuality> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(a.a(a.this, it.next()));
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("MTLIVE_NET", Float.valueOf(0.0f));
                        a.this.a((Map<String, Float>) hashMap, false);
                    }
                    if (a.this.e != null) {
                        a.this.e.onNetworkQuality(a.a(a.this, tRTCQuality), arrayList2);
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("MTLIVE_NET", Float.valueOf(tRTCQuality.quality));
                    a.this.a((Map<String, Float>) hashMap2, true);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onStatistics(TRTCStatistics tRTCStatistics) {
                    Object[] objArr3 = {tRTCStatistics};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7545ab0915ba3504153baef8cc5dd3e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7545ab0915ba3504153baef8cc5dd3e0");
                        return;
                    }
                    super.onStatistics(tRTCStatistics);
                    if (a.this.e != null) {
                        a.this.e.onStatistics(a.a(a.this, tRTCStatistics));
                    }
                    a.this.f = tRTCStatistics.sendBytes;
                    a.this.h = tRTCStatistics.receiveBytes;
                    a.a(a.this, a.this.g, a.this.g(), a.this.d(a.this.l), tRTCStatistics);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onConnectionLost() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "04386f0b6256f32a09ab7779fe6c0066", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "04386f0b6256f32a09ab7779fe6c0066");
                        return;
                    }
                    super.onConnectionLost();
                    a.this.a("onConnectionLost ", "onConnectionLost");
                    if (a.this.e != null) {
                        a.this.e.onConnectionLost();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onTryToReconnect() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f7cd9a018daa0615269929700a15d34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f7cd9a018daa0615269929700a15d34");
                        return;
                    }
                    super.onTryToReconnect();
                    a.this.a("onTryToReconnect ", "onTryToReconnect");
                    if (a.this.e != null) {
                        a.this.e.onTryToReconnect();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onConnectionRecovery() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6af6b0d8e1eb810ec806fb1b9f89d5d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6af6b0d8e1eb810ec806fb1b9f89d5d0");
                        return;
                    }
                    super.onConnectionRecovery();
                    a.this.a("onConnectionRecovery ", "onConnectionRecovery");
                    if (a.this.e != null) {
                        a.this.e.onConnectionRecovery();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onSpeedTest(TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult, int i2, int i3) {
                    Object[] objArr3 = {tRTCSpeedTestResult, Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "644e7f2af89316469c0956cb8017e689", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "644e7f2af89316469c0956cb8017e689");
                        return;
                    }
                    super.onSpeedTest(tRTCSpeedTestResult, i2, i3);
                    if (a.this.e != null) {
                        a.this.e.onSpeedTest(a.a(a.this, tRTCSpeedTestResult), i2, i3);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onCameraDidReady() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8511dee4cf94dc504588c9b7c02118f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8511dee4cf94dc504588c9b7c02118f");
                        return;
                    }
                    super.onCameraDidReady();
                    a.this.a("onCameraDidReady ", "onCameraDidReady");
                    if (a.this.e != null) {
                        a.this.e.onCameraDidReady();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onMicDidReady() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de5aa35b3f02771181fedae12f1e1cff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de5aa35b3f02771181fedae12f1e1cff");
                        return;
                    }
                    super.onMicDidReady();
                    a.this.a("onMicDidReady ", "onMicDidReady");
                    if (a.this.e != null) {
                        a.this.e.onMicDidReady();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onAudioRouteChanged(int i2, int i3) {
                    Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7dfd2b4be40b79bd1a9d7192cfd4a17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7dfd2b4be40b79bd1a9d7192cfd4a17");
                        return;
                    }
                    super.onAudioRouteChanged(i2, i3);
                    a aVar = a.this;
                    aVar.a("onAudioRouteChanged ", "onAudioRouteChanged: " + i2 + ", " + i3);
                    if (a.this.e != null) {
                        a.this.e.onAudioRouteChanged(i2, i3);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i2) {
                    Object[] objArr3 = {arrayList, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce6581a6ade179a430b465252a82defd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce6581a6ade179a430b465252a82defd");
                        return;
                    }
                    super.onUserVoiceVolume(arrayList, i2);
                    ArrayList<c.f> arrayList2 = null;
                    if (arrayList != null) {
                        arrayList2 = new ArrayList<>();
                        Iterator<TRTCCloudDef.TRTCVolumeInfo> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(a.a(a.this, it.next()));
                        }
                    }
                    if (a.this.e != null) {
                        a.this.e.onUserVoiceVolume(arrayList2, i2);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onRecvCustomCmdMsg(String str, int i2, int i3, byte[] bArr) {
                    Object[] objArr3 = {str, Integer.valueOf(i2), Integer.valueOf(i3), bArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fabac0e212c94ef1631f1578d3057fdd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fabac0e212c94ef1631f1578d3057fdd");
                        return;
                    }
                    super.onRecvCustomCmdMsg(str, i2, i3, bArr);
                    a aVar = a.this;
                    aVar.a("onRecvCustomCmdMsg ", "onRecvCustomCmdMsg: " + str + ", " + i2 + ", " + i3);
                    if (a.this.e != null) {
                        a.this.e.onRecvCustomCmdMsg(str, i2, i3, bArr);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onMissCustomCmdMsg(String str, int i2, int i3, int i4) {
                    Object[] objArr3 = {str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d69f4c8025da275f170585c6d23fc70", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d69f4c8025da275f170585c6d23fc70");
                        return;
                    }
                    super.onMissCustomCmdMsg(str, i2, i3, i4);
                    a aVar = a.this;
                    aVar.a("onMissCustomCmdMsg ", "onMissCustomCmdMsg: " + str + ", " + i2 + ", " + i3 + ", " + i4);
                    if (a.this.e != null) {
                        a.this.e.onMissCustomCmdMsg(str, i2, i3, i4);
                    }
                    a.a(a.this, a.a(a.this, i3), i3, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onRecvSEIMsg(String str, byte[] bArr) {
                    Object[] objArr3 = {str, bArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba8556ad7cb783a069cb020d7c0357f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba8556ad7cb783a069cb020d7c0357f5");
                        return;
                    }
                    super.onRecvSEIMsg(str, bArr);
                    a aVar = a.this;
                    aVar.a("onRecvSEIMsg ", "onRecvSEIMsg: " + str);
                    if (a.this.e != null) {
                        a.this.e.onRecvSEIMsg(str, bArr);
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onStartPublishing(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9aee7fa9c192b902af0529d5433464f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9aee7fa9c192b902af0529d5433464f6");
                        return;
                    }
                    super.onStartPublishing(i2, str);
                    a aVar = a.this;
                    aVar.a("onStartPublishing ", "onStartPublishing: " + i2 + ", " + str);
                    if (a.this.e != null) {
                        a.this.e.onStartPublishing(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onStopPublishing(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d19696897cc1343cbe1b671593956f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d19696897cc1343cbe1b671593956f1");
                        return;
                    }
                    super.onStopPublishing(i2, str);
                    a aVar = a.this;
                    aVar.a("onStopPublishing ", "onStopPublishing: " + i2 + ", " + str);
                    if (a.this.e != null) {
                        a.this.e.onStopPublishing(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onStartPublishCDNStream(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7dcb8a6a02e1d8f63ba8e9543314a004", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7dcb8a6a02e1d8f63ba8e9543314a004");
                        return;
                    }
                    super.onStartPublishCDNStream(i2, str);
                    a aVar = a.this;
                    aVar.a("onStartPublishCDNStream ", "onStartPublishCDNStream: " + i2 + ", " + str);
                    if (a.this.e != null) {
                        a.this.e.onStartPublishCDNStream(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onStopPublishCDNStream(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4a878b7df10c3ac740246dde3aa2273", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4a878b7df10c3ac740246dde3aa2273");
                        return;
                    }
                    super.onStopPublishCDNStream(i2, str);
                    a aVar = a.this;
                    aVar.a("onStopPublishCDNStream ", "onStopPublishCDNStream: " + i2 + ", " + str);
                    if (a.this.e != null) {
                        a.this.e.onStopPublishCDNStream(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onSetMixTranscodingConfig(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8f3cecc3da9d18597d927f8da0f28f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8f3cecc3da9d18597d927f8da0f28f9");
                        return;
                    }
                    super.onSetMixTranscodingConfig(i2, str);
                    a aVar = a.this;
                    aVar.a("onSetMixTranscodingConfig ", "onSetMixTranscodingConfig: " + i2 + ", " + str);
                    if (a.this.e != null) {
                        a.this.e.onSetMixTranscodingConfig(i2, str);
                    }
                    a.a(a.this, a.a(a.this, i2), i2, str);
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onAudioEffectFinished(int i2, int i3) {
                    Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9557bcb7d8cdc060386b56be92dd3c7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9557bcb7d8cdc060386b56be92dd3c7c");
                        return;
                    }
                    super.onAudioEffectFinished(i2, i3);
                    a aVar = a.this;
                    aVar.a("onAudioEffectFinished ", "onAudioEffectFinished: " + i2 + ", " + i3);
                    if (a.this.e != null) {
                        a.this.e.onAudioEffectFinished(i2, i3);
                    }
                    a.a(a.this, a.a(a.this, i3), i3, "");
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onScreenCaptureStarted() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef6d2fa3e1b8e3a298b7aea7f448c6ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef6d2fa3e1b8e3a298b7aea7f448c6ee");
                        return;
                    }
                    super.onScreenCaptureStarted();
                    a.this.a("onScreenCaptureStarted ", "onScreenCaptureStarted");
                    if (a.this.e != null) {
                        a.this.e.onScreenCaptureStarted();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onScreenCapturePaused() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f57533139c26393e08b4ee7ed079ae2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f57533139c26393e08b4ee7ed079ae2a");
                        return;
                    }
                    super.onScreenCapturePaused();
                    a.this.a("onScreenCapturePaused ", "onScreenCapturePaused");
                    if (a.this.e != null) {
                        a.this.e.onScreenCapturePaused();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onScreenCaptureResumed() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20e11f1a4f4e058a4c058905c164b7cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20e11f1a4f4e058a4c058905c164b7cb");
                        return;
                    }
                    super.onScreenCaptureResumed();
                    a.this.a("onScreenCaptureResumed ", "onScreenCaptureResumed");
                    if (a.this.e != null) {
                        a.this.e.onScreenCaptureResumed();
                    }
                }

                @Override // com.tencent.trtc.TRTCCloudListener
                public final void onScreenCaptureStopped(int i2) {
                    Object[] objArr3 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8738ca6c8bb4d4b72acb2c5422fdb370", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8738ca6c8bb4d4b72acb2c5422fdb370");
                        return;
                    }
                    super.onScreenCaptureStopped(i2);
                    a aVar = a.this;
                    aVar.a("onScreenCaptureStopped ", "onScreenCaptureStopped: " + i2);
                    if (a.this.e != null) {
                        a.this.e.onScreenCaptureStopped(i2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.mtliveqos.statistic.b g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5d2b9b23f57aa97c348cdbee0bcc4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5d2b9b23f57aa97c348cdbee0bcc4e");
        }
        if (this.o == null) {
            this.o = new com.sankuai.meituan.mtliveqos.statistic.b();
        }
        this.o.d = d(this.l);
        this.o.e = c.g.TCRC;
        this.o.c = this.i;
        this.o.h = "1.0";
        this.o.p = System.currentTimeMillis();
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b92ce16312ccfd8f548f03bc3b69418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b92ce16312ccfd8f548f03bc3b69418");
            return;
        }
        com.sankuai.meituan.mtliveqos.statistic.c cVar = new com.sankuai.meituan.mtliveqos.statistic.c();
        cVar.d = str2 + " STREAM_ID = " + this.k;
        cVar.c = str;
        cVar.b = a.class.getSimpleName();
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_ROOM_ID", String.valueOf(this.a));
        Context context = this.g;
        com.sankuai.meituan.mtliveqos.statistic.b g = g();
        Object[] objArr2 = {context, g, cVar, hashMap, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "87100b20f23eea7893fa59af377e87fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "87100b20f23eea7893fa59af377e87fc");
            return;
        }
        hashMap.put("MTLIVE_IS_PUSH", "push");
        hashMap.put("MTLIVE_LIVE_TYPE", g.d.l);
        e.a(context, g, cVar, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Float> map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babd87929321ed7e7ae59701f3425404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babd87929321ed7e7ae59701f3425404");
        } else {
            f.a(this.g, g(), map, new HashMap(), null, z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a7871cf58c129705b9ef12561a73c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a7871cf58c129705b9ef12561a73c5");
            return;
        }
        a("destroySharedInstance", "destroySharedInstance");
        TRTCCloud.destroySharedInstance();
        this.d = null;
        this.e = null;
        this.m = null;
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c3465d357643ea9abd0e260233a360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c3465d357643ea9abd0e260233a360");
            return;
        }
        a("setListener", "设置回调接口");
        this.e = dVar;
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(c.b bVar, int i) {
        TRTCCloudDef.TRTCParams tRTCParams;
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b5f049d0ad73ceb148e5f32fc18fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b5f049d0ad73ceb148e5f32fc18fb4");
            return;
        }
        a("enterRoom", " 进入房间 scene:" + i + "param: " + bVar.toString());
        this.l = i;
        this.a = bVar.e;
        this.n = bVar.c;
        TRTCCloud tRTCCloud = c;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3e6accf8498e6e988488fc3cfa3cdf3", RobustBitConfig.DEFAULT_VALUE)) {
            tRTCParams = (TRTCCloudDef.TRTCParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3e6accf8498e6e988488fc3cfa3cdf3");
        } else if (bVar == null) {
            tRTCParams = null;
        } else {
            TRTCCloudDef.TRTCParams tRTCParams2 = new TRTCCloudDef.TRTCParams();
            tRTCParams2.businessInfo = bVar.j;
            tRTCParams2.privateMapKey = bVar.i;
            tRTCParams2.role = bVar.f;
            tRTCParams2.roomId = bVar.e;
            tRTCParams2.sdkAppId = bVar.b;
            tRTCParams2.streamId = bVar.g;
            tRTCParams2.userDefineRecordId = bVar.h;
            tRTCParams2.userId = bVar.c;
            tRTCParams2.userSig = bVar.d;
            tRTCParams = tRTCParams2;
        }
        tRTCCloud.enterRoom(tRTCParams, i);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49e9db24dea5a8414bfb470975877f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49e9db24dea5a8414bfb470975877f8");
            return;
        }
        a("exitRoom", " 离开房间");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d67de4aa785af9866751e849387773d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d67de4aa785af9866751e849387773d");
        } else if (this.j > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.j;
            HashMap hashMap = new HashMap();
            hashMap.put("MTLIVE_LIVE_DURATION", Float.valueOf(((float) currentTimeMillis) / 1000.0f));
            a((Map<String, Float>) hashMap, true);
        }
        c.exitRoom();
    }

    private TXCloudVideoView a(MTRTCVideoView mTRTCVideoView) {
        TXCloudVideoView tXCloudVideoView;
        Object[] objArr = {mTRTCVideoView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b828faa1d756812d4186baea4b82978e", RobustBitConfig.DEFAULT_VALUE)) {
            return (TXCloudVideoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b828faa1d756812d4186baea4b82978e");
        }
        if (mTRTCVideoView.getSurfaceView() != null) {
            tXCloudVideoView = new TXCloudVideoView(mTRTCVideoView.getSurfaceView());
        } else {
            tXCloudVideoView = new TXCloudVideoView(this.g);
            if (mTRTCVideoView.getTextureView() != null) {
                tXCloudVideoView.addVideoView(mTRTCVideoView.getTextureView());
            }
        }
        if (!TextUtils.isEmpty(mTRTCVideoView.getUserId())) {
            tXCloudVideoView.setUserId(mTRTCVideoView.getUserId());
        }
        mTRTCVideoView.addView(tXCloudVideoView, -1, -1);
        return tXCloudVideoView;
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(boolean z, MTRTCVideoView mTRTCVideoView) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), mTRTCVideoView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52912f97b7293c5874a6eb5c9b3cd3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52912f97b7293c5874a6eb5c9b3cd3d");
            return;
        }
        a("startLocalPreview", " 开启本地视频的预览画面");
        c.startLocalPreview(z, a(mTRTCVideoView));
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989c459b70221b9a1527a47a42ee40d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989c459b70221b9a1527a47a42ee40d9");
            return;
        }
        a("stopLocalPreview", " 停止本地视频采集及预览");
        c.stopLocalPreview();
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(String str, MTRTCVideoView mTRTCVideoView) {
        Object[] objArr = {str, mTRTCVideoView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cdfb2784479ca278128251a1bf75a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cdfb2784479ca278128251a1bf75a5f");
            return;
        }
        a("startRemoteView", " 开始显示远端视频画面 userId = " + str);
        c.startRemoteView(str, a(mTRTCVideoView));
        if (TextUtils.isEmpty(this.m)) {
            this.m = str;
        }
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2bf003e5b51371c421e319b5283b2a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2bf003e5b51371c421e319b5283b2a6");
            return;
        }
        a("stopRemoteView", " 停止显示远端视频画面，同时不再拉取该远端用户的视频数据流 userId = " + str);
        c.stopRemoteView(str);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(c.e eVar) {
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd4a54525d1b61597d03520c651d254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd4a54525d1b61597d03520c651d254");
            return;
        }
        a("setVideoEncoderParam", " 设置视频编码器相关参数  ");
        TRTCCloud tRTCCloud = c;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d6e7b9a840ad329c1ddb89643080ed2", RobustBitConfig.DEFAULT_VALUE)) {
            tRTCVideoEncParam = (TRTCCloudDef.TRTCVideoEncParam) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d6e7b9a840ad329c1ddb89643080ed2");
        } else if (eVar == null) {
            tRTCVideoEncParam = null;
        } else {
            TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam2 = new TRTCCloudDef.TRTCVideoEncParam();
            tRTCVideoEncParam2.videoBitrate = eVar.d;
            tRTCVideoEncParam2.videoFps = eVar.c;
            tRTCVideoEncParam2.videoResolution = eVar.a;
            tRTCVideoEncParam2.videoResolutionMode = eVar.b;
            tRTCVideoEncParam2.enableAdjustRes = eVar.e;
            tRTCVideoEncParam = tRTCVideoEncParam2;
        }
        tRTCCloud.setVideoEncoderParam(tRTCVideoEncParam);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(c.a aVar) {
        TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78116bb2280c7042de34d9b7a437b769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78116bb2280c7042de34d9b7a437b769");
            return;
        }
        a("setNetworkQosParam", " 设置网络流控相关参数");
        TRTCCloud tRTCCloud = c;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28db8dcd60b83ad2576f81e807110f4c", RobustBitConfig.DEFAULT_VALUE)) {
            tRTCNetworkQosParam = (TRTCCloudDef.TRTCNetworkQosParam) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28db8dcd60b83ad2576f81e807110f4c");
        } else if (aVar == null) {
            tRTCNetworkQosParam = null;
        } else {
            TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam2 = new TRTCCloudDef.TRTCNetworkQosParam();
            tRTCNetworkQosParam2.preference = aVar.a;
            tRTCNetworkQosParam2.controlMode = aVar.b;
            tRTCNetworkQosParam = tRTCNetworkQosParam2;
        }
        tRTCCloud.setNetworkQosParam(tRTCNetworkQosParam);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e619f9b428707ced2679dd0749365957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e619f9b428707ced2679dd0749365957");
            return;
        }
        a("setLocalViewFillMode", "设置本地图像的渲染模式 mode = " + i);
        c.setLocalViewFillMode(i);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9afbfee83858d8b6b8ceeea5bce7da34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9afbfee83858d8b6b8ceeea5bce7da34");
            return;
        }
        a("setRemoteViewFillMode", "设置远端图像的渲染模式 userId = " + str + " mode = 0");
        c.setRemoteViewFillMode(str, 0);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53928783e819f49f63ac17df7b897eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53928783e819f49f63ac17df7b897eea");
            return;
        }
        a("startLocalAudio", "开始向直播 CDN 推流 ");
        c.startLocalAudio();
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8d3e4cc51b4c08dd9bb645e42fdf12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8d3e4cc51b4c08dd9bb645e42fdf12");
            return;
        }
        a("stopLocalAudio", "关闭本地音频的采集和上行");
        c.stopLocalAudio();
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74ccf1c176cbde0083b963e1f3795d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74ccf1c176cbde0083b963e1f3795d8");
            return;
        }
        a("muteLocalAudio", " 静音/取消静音本地的音频 mute = " + z);
        c.muteLocalAudio(z);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void b(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b93a8286a75f3c8286729b75ed9591b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b93a8286a75f3c8286729b75ed9591b7");
            return;
        }
        a("setAudioRoute", "设置声音播放模式。 route = 0");
        c.setAudioRoute(0);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59317b41da0d1239ee9f9b9364cc4ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59317b41da0d1239ee9f9b9364cc4ad0");
            return;
        }
        a("muteAllRemoteAudio", "静音/取消静音所有用户的声音。 mute = " + z);
        c.muteAllRemoteAudio(z);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void c(int i) {
        Object[] objArr = {2000};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04deab45aa997805b0c43c07300caa37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04deab45aa997805b0c43c07300caa37");
            return;
        }
        a("enableAudioVolumeEvaluation", "启用音量大小评估 intervalMs = 2000");
        c.enableAudioVolumeEvaluation(2000);
    }

    @Override // com.sankuai.meituan.mtlive.mtrtc.library.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3af74712b7b62bb12e31385c196dc5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3af74712b7b62bb12e31385c196dc5d");
            return;
        }
        a("switchCamera", "切换摄像头 ");
        c.switchCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.f d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256cf824c72805486d65fe5744954a04", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256cf824c72805486d65fe5744954a04");
        }
        if (i == 1) {
            return c.f.LIVE;
        }
        if (i == 2) {
            return c.f.AUDIO_CALL;
        }
        if (i == 0) {
            return c.f.VIDEO_CALL;
        }
        if (i == 3) {
            return c.f.VOICE_CHAT_ROOM;
        }
        return c.f.UNKNOWN;
    }

    private void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2, boolean z) {
        Object[] objArr = {context, bVar, map, map2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d21584fc280072af06c812f6804c7dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d21584fc280072af06c812f6804c7dee");
        } else {
            f.a(context, bVar, map, map2, null, z);
        }
    }
}
