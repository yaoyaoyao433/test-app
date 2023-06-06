package com.tencent.avroom;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.avprotocol.TXCAVProtocol;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.renderer.f;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private static String c = "DataCollectionPlayer";
    private long a;
    private TXCAVRoomLisenter n;
    private WeakReference<f> o;
    private WeakReference<TXCAVProtocol> p;
    private WeakReference<TXCRenderAndDec> q;
    private Timer s;
    private Handler b = new Handler(Looper.getMainLooper());
    private HashMap d = new HashMap(100);
    private HashMap e = new HashMap(100);
    private HashMap f = new HashMap(100);
    private boolean g = false;
    private long h = 0;
    private long i = 0;
    private long j = 0;
    private long k = 0;
    private int l = 0;
    private int m = 0;
    private TimerTask r = null;

    static /* synthetic */ long e(a aVar) {
        long j = aVar.k;
        aVar.k = 1 + j;
        return j;
    }

    public a(long j) {
        this.a = j;
    }

    public void a(int i) {
        this.m += i;
    }

    public void b(int i) {
        this.l += i;
    }

    public void a(f fVar) {
        if (fVar != null) {
            fVar.setID(String.format("%d", Long.valueOf(this.a)));
        }
        this.o = new WeakReference<>(fVar);
    }

    public void a(TXCAVProtocol tXCAVProtocol) {
        this.p = new WeakReference<>(tXCAVProtocol);
    }

    public void a(TXCAVRoomLisenter tXCAVRoomLisenter) {
        this.n = tXCAVRoomLisenter;
    }

    public void a(TXCRenderAndDec tXCRenderAndDec) {
        this.q = new WeakReference<>(tXCRenderAndDec);
    }

    public void a() {
        if (this.r != null) {
            this.r.cancel();
        }
        this.s = new Timer(true);
        this.r = new TimerTask() { // from class: com.tencent.avroom.a.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                f fVar;
                TXCAVProtocol tXCAVProtocol;
                TXCLog.i(a.c, "dataCollectingStart run: ");
                if (a.this.p != null && (tXCAVProtocol = (TXCAVProtocol) a.this.p.get()) != null) {
                    a.this.a(tXCAVProtocol.getDownloadStats(), (long) ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
                if (a.this.o != null && (fVar = (f) a.this.o.get()) != null) {
                    a.this.a(fVar.l(), (long) ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
                long videoCacheFrameCount = ((TXCRenderAndDec) a.this.q.get()).getVideoCacheFrameCount();
                if (a.this.g) {
                    a.e(a.this);
                    a.this.j += videoCacheFrameCount;
                    if (videoCacheFrameCount > a.this.i) {
                        a.this.i = videoCacheFrameCount;
                    }
                }
                if (a.this.q != null && a.this.q.get() != null) {
                    a.this.d.put(TXLiveConstants.NET_STATUS_VIDEO_CACHE, Integer.valueOf((int) ((TXCRenderAndDec) a.this.q.get()).getVideoCacheDuration()));
                    a.this.d.put("VIDEO_CACHE_CNT", Integer.valueOf((int) ((TXCRenderAndDec) a.this.q.get()).getVideoCacheFrameCount()));
                    a.this.d.put("V_DEC_CACHE_CNT", Integer.valueOf(((TXCRenderAndDec) a.this.q.get()).getVideoDecCacheFrameCount()));
                    a.this.d.put("AV_INTERVAL", Integer.valueOf((int) ((TXCRenderAndDec) a.this.q.get()).getAVPlayInterval()));
                    a.this.d.put("AV_NET_RECV_INTERVAL", Long.valueOf(((TXCRenderAndDec) a.this.q.get()).getAVNetRecvInterval()));
                    a.this.d.put(TXLiveConstants.NET_STATUS_VIDEO_GOP, Integer.valueOf(((TXCRenderAndDec) a.this.q.get()).getVideoGop()));
                }
                a.this.d.put("AUDIO_INFO", TXCAudioEngine.getInstance().getPlayAECType() + " | " + TXCStatus.c(String.valueOf(a.this.a), TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE) + CommonConstant.Symbol.COMMA + TXCStatus.c(String.valueOf(a.this.a), 2020) + " | " + TXCAudioEngine.getInstance().getPlaySampleRate() + CommonConstant.Symbol.COMMA + TXCAudioEngine.getInstance().getPlayChannels());
                a.this.d.put(TXLiveConstants.NET_STATUS_AUDIO_CACHE, Integer.valueOf(TXCStatus.c(String.valueOf(a.this.a), 2007)));
                a.this.d.put("AUDIO_JITTER", Integer.valueOf(TXCStatus.c(String.valueOf(a.this.a), TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED)));
                a.this.d.put("AUDIO_SPEED", Integer.valueOf(TXCStatus.c(String.valueOf(a.this.a), 2021)));
                int[] a = g.a();
                a.this.d.put("u32_app_cpu_usage", Long.valueOf((long) a[0]));
                a.this.d.put("u32_cpu_usage", Long.valueOf((long) a[1]));
                final Bundle d = a.this.d();
                a.this.b.post(new Runnable() { // from class: com.tencent.avroom.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.n != null) {
                            a.this.n.onAVRoomStatus(a.this.a, d);
                        }
                    }
                });
            }
        };
        this.s.schedule(this.r, 0L, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    public void b() {
        if (this.s != null) {
            this.s.cancel();
            this.s = null;
        }
        if (this.d != null) {
            this.d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f.a aVar, long j) {
        if (aVar == null || j == 0) {
            return;
        }
        this.d.put("u32_fps", Long.valueOf((a("u32_fps", aVar.c) * 10000) / j));
        this.d.put("u32_first_i_frame", Long.valueOf(aVar.k));
        this.d.put("u32_avg_block_count", Long.valueOf(aVar.g));
        this.d.put("u32_avg_block_time", Long.valueOf(aVar.f));
        this.d.put("VIDEO_WIDTH", Long.valueOf(aVar.m));
        this.d.put("VIDEO_HEIGHT", Long.valueOf(aVar.n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("myid", 16842960L);
        bundle.putCharSequence("CPU_USAGE", (((Long) this.d.get("u32_app_cpu_usage")).intValue() / 10) + "/" + (((Long) this.d.get("u32_cpu_usage")).intValue() / 10) + "%");
        bundle.putInt("VIDEO_WIDTH", a("VIDEO_WIDTH"));
        bundle.putInt("VIDEO_HEIGHT", a("VIDEO_HEIGHT"));
        bundle.putInt("NET_SPEED", a("u32_avg_net_speed"));
        bundle.putInt("VIDEO_FPS", a("u32_fps") / 10);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_DROP, a("video_drop"));
        bundle.putInt("VIDEO_BITRATE", a("u32_avg_video_bitrate"));
        bundle.putInt("AUDIO_BITRATE", a("u32_avg_audio_bitrate"));
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, a(TXLiveConstants.NET_STATUS_AUDIO_CACHE));
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, a(TXLiveConstants.NET_STATUS_VIDEO_CACHE));
        bundle.putInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE, a("VIDEO_CACHE_CNT"));
        bundle.putInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE, a("V_DEC_CACHE_CNT"));
        bundle.putInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL, a("AV_INTERVAL"));
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, (String) this.d.get("AUDIO_INFO"));
        bundle.putCharSequence("SERVER_IP", (String) this.d.get("u32_server_ip"));
        bundle.putInt("NET_JITTER", a("AUDIO_JITTER"));
        bundle.putInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL, a("AV_NET_RECV_INTERVAL"));
        bundle.putFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD, a("AUDIO_SPEED"));
        int a = a("u32_fps") / 10;
        if (a == 0) {
            a = 15;
        }
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) ((((a(TXLiveConstants.NET_STATUS_VIDEO_GOP) * 10) / a) / 10.0f) + 0.5d));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TXCAVProtocol.DownloadStats downloadStats, long j) {
        if (downloadStats == null || j == 0) {
            return;
        }
        String str = c;
        TXCLog.i(str, "updateNetStats: diff_a raw " + downloadStats.afterParseAudioBytes);
        String str2 = c;
        TXCLog.i(str2, "updateNetStats: diff_v raw " + downloadStats.afterParseVideoBytes);
        downloadStats.afterParseAudioBytes = (long) this.l;
        downloadStats.afterParseVideoBytes = (long) this.m;
        long a = a("u32_avg_audio_bitrate", downloadStats.afterParseAudioBytes);
        String str3 = c;
        StringBuilder sb = new StringBuilder("updateNetStats: kAvgAudioBitrate ");
        long j2 = j * 1024;
        long j3 = ((a * 8) * 1000) / j2;
        sb.append(Long.valueOf(j3));
        TXCLog.i(str3, sb.toString());
        this.d.put("u32_avg_audio_bitrate", Long.valueOf(j3));
        long a2 = a("u32_avg_video_bitrate", downloadStats.afterParseVideoBytes);
        String str4 = c;
        TXCLog.i(str4, "updateNetStats: diff_v " + a2);
        String str5 = c;
        StringBuilder sb2 = new StringBuilder("updateNetStats: kAvgVideoBitrate ");
        long j4 = ((a2 * 8) * 1000) / j2;
        sb2.append(Long.valueOf(j4));
        TXCLog.i(str5, sb2.toString());
        this.d.put("u32_avg_video_bitrate", Long.valueOf(j4));
        long j5 = (((a + a2) * 8) * 1000) / j2;
        new StringBuilder("updateNetStats: kAvgNetSpeed ").append(Long.valueOf(j5));
        this.d.put("u32_avg_net_speed", Long.valueOf(j5));
        this.d.put("u32_server_ip", downloadStats.serverIP);
        this.d.put("u32_dns_time", Long.valueOf(downloadStats.dnsTS));
        this.d.put("u32_connect_server_time", Long.valueOf(downloadStats.connTS));
        this.d.put("u64_timestamp", Long.valueOf(downloadStats.startTS));
        this.d.put("u32_first_frame_down", Long.valueOf(downloadStats.firstVideoTS));
    }

    private long a(String str, long j) {
        if (!this.f.containsKey(str)) {
            this.f.put(str, 0L);
        }
        if (!this.e.containsKey(str)) {
            this.e.put(str, 0L);
        }
        if (((Long) this.e.get(str)).longValue() > j) {
            this.f.put(str, Long.valueOf(((Long) this.f.get(str)).longValue() + j));
            this.e.put(str, Long.valueOf(j));
            return j;
        }
        long longValue = j - ((Long) this.e.get(str)).longValue();
        this.e.put(str, Long.valueOf(j));
        return longValue;
    }

    private int a(String str) {
        Number number = (Number) this.d.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }
}
