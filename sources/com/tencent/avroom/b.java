package com.tencent.avroom;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.avprotocol.TXCAVProtocol;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.d;
import com.tencent.liteav.e;
import com.tencent.liteav.i;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends com.tencent.liteav.basic.module.a {
    private static String d = "DataCollectionPusher";
    private Context a;
    private long b;
    private e e;
    private TXCAVRoomLisenter f;
    private Timer h;
    private WeakReference<TXCAVProtocol> j;
    private Handler c = new Handler(Looper.getMainLooper());
    private TimerTask g = null;
    private WeakReference<d> i = null;
    private HashMap k = new HashMap(100);
    private HashMap l = new HashMap(100);
    private HashMap m = new HashMap(100);

    public b(int i, long j, Context context, i iVar) {
        this.e = null;
        this.a = context.getApplicationContext();
        this.b = j;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        setID(sb.toString());
        this.e = new e(this.a);
        this.e.a(iVar.c);
        this.e.b(iVar.s);
        this.e.a(iVar.a, iVar.b);
        e eVar = this.e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        eVar.d(sb2.toString());
        e eVar2 = this.e;
        eVar2.a("rtmp://0.livepush.myqcloud.com/live/" + (i + CommonConstant.Symbol.UNDERLINE + j));
        TXCLog.w(d, "stream_id = " + j);
    }

    public void a(TXCAVRoomLisenter tXCAVRoomLisenter) {
        this.f = tXCAVRoomLisenter;
    }

    public void a(d dVar) {
        this.i = new WeakReference<>(dVar);
    }

    public void a(TXCAVProtocol tXCAVProtocol) {
        this.j = new WeakReference<>(tXCAVProtocol);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("myid", this.b);
        bundle.putCharSequence("CPU_USAGE", (((Long) this.k.get("u32_app_cpu_usage")).intValue() / 10) + "/" + (((Long) this.k.get("u32_cpu_usage")).intValue() / 10) + "%");
        bundle.putInt("VIDEO_WIDTH", a("VIDEO_WIDTH"));
        bundle.putInt("VIDEO_HEIGHT", a("VIDEO_HEIGHT"));
        bundle.putInt("NET_SPEED", a("u32_avg_net_speed"));
        bundle.putInt("VIDEO_FPS", a("u32_fps"));
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_DROP, a("video_drop"));
        bundle.putInt("VIDEO_BITRATE", a("u32_avg_video_bitrate"));
        bundle.putInt("AUDIO_BITRATE", a("u32_avg_audio_bitrate"));
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, a("u32_avg_cache_size"));
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, (String) this.k.get("AUDIO_INFO"));
        bundle.putCharSequence("SERVER_IP", (String) this.k.get("u32_server_ip"));
        bundle.putInt("qos_video_bitrate", a("qos_video_bitrate"));
        int a = a("u32_fps");
        if (a == 0) {
            a = 15;
        }
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) ((((a(TXLiveConstants.NET_STATUS_VIDEO_GOP) * 10) / a) / 10.0f) + 0.5d));
        return bundle;
    }

    private int a(String str) {
        Number number = (Number) this.k.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public void a() {
        if (this.g != null) {
            this.g.cancel();
        }
        this.e.a();
        this.h = new Timer(true);
        this.g = new TimerTask() { // from class: com.tencent.avroom.b.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                d dVar;
                TXCAVProtocol tXCAVProtocol;
                if (b.this.j != null && (tXCAVProtocol = (TXCAVProtocol) b.this.j.get()) != null) {
                    TXCAVProtocol.UploadStats uploadStats = tXCAVProtocol.getUploadStats();
                    b.this.a(uploadStats, (long) ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                    b.this.setStatusValue(7012, String.valueOf(uploadStats.serverIP));
                }
                if (b.this.i != null && (dVar = (d) b.this.i.get()) != null) {
                    b.this.k.put("VIDEO_WIDTH", Long.valueOf(dVar.d()));
                    b.this.k.put("VIDEO_HEIGHT", Long.valueOf(dVar.e()));
                }
                if (b.this.i != null && b.this.i.get() != null) {
                    b.this.k.put(TXLiveConstants.NET_STATUS_VIDEO_GOP, Integer.valueOf(TXCStatus.c(((d) b.this.i.get()).getID(), MapConstant.LayerPropertyFlag_MarkerHeight)));
                }
                int[] a = g.a();
                b.this.k.put("u32_app_cpu_usage", Long.valueOf(a[0]));
                b.this.k.put("u32_cpu_usage", Long.valueOf(a[1]));
                b.this.k.put("u32_fps", Long.valueOf((long) TXCStatus.d(b.this.getID(), MapConstant.LayerPropertyFlag_MarkerSpacing)));
                String unused = b.d;
                new StringBuilder("run: kAvgVideoBitrate").append(Long.valueOf(TXCStatus.c(b.this.getID(), MapConstant.LayerPropertyFlag_MarkerAvoidScreen)));
                final Bundle d2 = b.this.d();
                b.this.c.post(new Runnable() { // from class: com.tencent.avroom.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (b.this.f != null) {
                            b.this.f.onAVRoomStatus(b.this.b, d2);
                        }
                    }
                });
                b.this.setStatusValue(7002, b.this.k.get("u32_avg_audio_bitrate"));
                b.this.setStatusValue(7001, b.this.k.get("u32_avg_video_bitrate"));
                b.this.setStatusValue(7004, b.this.k.get("u32_avg_net_speed_audio"));
                b.this.setStatusValue(7003, b.this.k.get("u32_avg_net_speed_video"));
                b.this.setStatusValue(7005, b.this.k.get("u32_avg_cache_size"));
                b.this.setStatusValue(7007, b.this.k.get("video_drop"));
                b.this.setStatusValue(7007, b.this.k.get("video_drop"));
                if (b.this.e != null) {
                    b.this.e.e();
                }
            }
        };
        this.h.schedule(this.g, 0L, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    public void b() {
        if (this.h != null) {
            this.h.cancel();
            this.h = null;
        }
        if (this.e != null) {
            this.e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TXCAVProtocol.UploadStats uploadStats, long j) {
        if (uploadStats == null || j == 0) {
            return;
        }
        long j2 = j * 1024;
        this.k.put("u32_avg_video_bitrate", Long.valueOf(((a("u32_avg_video_bitrate", uploadStats.inVideoBytes) * 8) * 1000) / j2));
        this.k.put("u32_avg_audio_bitrate", Long.valueOf(((a("u32_avg_audio_bitrate", uploadStats.inAudioBytes) * 8) * 1000) / j2));
        long a = a("VIDEO_BITRATE", uploadStats.outVideoBytes);
        long a2 = a("AUDIO_BITRATE", uploadStats.outAudioBytes);
        this.k.put("u32_avg_net_speed_video", Long.valueOf(((a * 8) * 1000) / j2));
        this.k.put("u32_avg_net_speed_audio", Long.valueOf(((a2 * 8) * 1000) / j2));
        this.k.put("u32_avg_net_speed", Long.valueOf((((a2 + a) * 8) * 1000) / j2));
        this.k.put("u32_avg_cache_size", Long.valueOf(uploadStats.videoCacheLen));
        this.k.put("video_drop", Long.valueOf(uploadStats.videoDropCount));
        this.k.put("u32_server_ip", uploadStats.serverIP);
        if (uploadStats.dnsTS != -1) {
            this.k.put("u32_dns_time", Long.valueOf(uploadStats.dnsTS - uploadStats.startTS));
        } else {
            this.k.put("u32_dns_time", Long.valueOf(uploadStats.dnsTS));
        }
        if (uploadStats.connTS != -1) {
            this.k.put("u32_connect_server_time", Long.valueOf(uploadStats.connTS - uploadStats.startTS));
        } else {
            this.k.put("u32_connect_server_time", Long.valueOf(uploadStats.connTS));
        }
        this.k.put("u32_channel_type", Long.valueOf(uploadStats.channelType));
        this.k.put("u64_timestamp", Long.valueOf(uploadStats.startTS));
    }

    private long a(String str, long j) {
        if (!this.m.containsKey(str)) {
            this.m.put(str, 0L);
        }
        if (!this.l.containsKey(str)) {
            this.l.put(str, 0L);
        }
        if (((Long) this.l.get(str)).longValue() > j) {
            this.m.put(str, Long.valueOf(((Long) this.m.get(str)).longValue() + j));
            this.l.put(str, Long.valueOf(j));
            return j;
        }
        long longValue = j - ((Long) this.l.get(str)).longValue();
        this.l.put(str, Long.valueOf(j));
        return longValue;
    }
}
