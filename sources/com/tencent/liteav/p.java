package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.dianping.titans.js.JsBridgeResult;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.ijk.media.player.IjkBitrateItem;
import com.tencent.ijk.media.player.MediaInfo;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.TextureRenderView;
import com.tencent.rtmp.TXBitrateItem;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class p extends t {
    protected boolean a;
    private TXCVodVideoView f;
    private com.tencent.liteav.txcvodplayer.d g;
    private n h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private float m;
    private Surface n;
    private com.tencent.liteav.txcvodplayer.e o;

    @Override // com.tencent.liteav.t
    public void a(com.tencent.liteav.basic.opengl.p pVar) {
    }

    @Override // com.tencent.liteav.t
    public void a(boolean z, int i) {
    }

    @Override // com.tencent.liteav.t
    public void c(boolean z) {
    }

    @Override // com.tencent.liteav.t
    public int d(int i) {
        return 0;
    }

    @Override // com.tencent.liteav.t
    public int e() {
        return 0;
    }

    @Override // com.tencent.liteav.t
    public int i() {
        return 0;
    }

    public p(Context context) {
        super(context);
        this.h = null;
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = 1.0f;
        this.o = new com.tencent.liteav.txcvodplayer.e() { // from class: com.tencent.liteav.p.1
            @Override // com.tencent.liteav.txcvodplayer.e
            public void a(int i, Bundle bundle) {
                com.tencent.liteav.basic.c.b bVar;
                Bundle bundle2 = new Bundle(bundle);
                int i2 = -2303;
                if (i == -2301) {
                    p.this.h.a(-2301, "network disconnect, has retry reconnect, but still failed!");
                    i2 = -2301;
                } else if (i == 2011) {
                    bundle2.putInt("EVT_PARAM1", p.this.f.getMetaRotationDegree());
                    i2 = 2011;
                } else if (i == 2103) {
                    i2 = 2103;
                } else if (i != 2106) {
                    switch (i) {
                        case -2305:
                            p.this.h.a(-2305, "HLS decrypt key error");
                            i2 = -2305;
                            break;
                        case -2304:
                            p.this.h.a(-2304, "h265 decode failed");
                            if (!p.this.i) {
                                p.this.g.a(false);
                            }
                            i2 = -2304;
                            break;
                        case -2303:
                            p.this.h.a(-2303, "file not found");
                            break;
                        default:
                            int i3 = 1;
                            switch (i) {
                                case 2003:
                                    if (!p.this.i) {
                                        p.this.i = true;
                                        p.this.h.f();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putInt(TXCAVRoomConstants.EVT_ID, 2008);
                                        bundle3.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                                        bundle3.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                                        MediaInfo mediaInfo = p.this.f.getMediaInfo();
                                        int i4 = (mediaInfo == null || mediaInfo.mVideoDecoderImpl == null || !mediaInfo.mVideoDecoderImpl.contains("hevc")) ? 0 : 1;
                                        if (p.this.f.getPlayerType() == 0) {
                                            if (i4 == 0) {
                                                bundle3.putCharSequence("description", p.this.g.a() ? "Enables hardware decoding" : "Enables software decoding");
                                            } else {
                                                bundle3.putCharSequence("description", p.this.g.a() ? "Enables hardware decoding H265" : "Enables software decoding h265");
                                            }
                                            bundle3.putInt("EVT_PARAM1", p.this.g.a() ? 1 : 2);
                                            bundle3.putInt("hevc", i4);
                                        } else {
                                            bundle3.putCharSequence("description", "Enables hardware decoding");
                                            bundle3.putInt("EVT_PARAM1", 2);
                                        }
                                        if (!p.this.g.a()) {
                                            i3 = i4 == 0 ? 0 : 2;
                                        } else if (i4 != 0) {
                                            i3 = 3;
                                        }
                                        p.this.h.b(i3);
                                        a(2008, bundle3);
                                        i2 = 2003;
                                        break;
                                    } else {
                                        return;
                                    }
                                    break;
                                case 2004:
                                    i2 = 2004;
                                    p.this.h.e();
                                    break;
                                case 2005:
                                    i2 = 2005;
                                    p.this.h.a(bundle.getInt(TXLiveConstants.EVT_PLAY_DURATION, 0), bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS, 0));
                                    break;
                                case 2006:
                                    p.this.h.b();
                                    if (!p.this.a) {
                                        i2 = 2006;
                                        break;
                                    } else {
                                        p.this.f.b();
                                        p.this.h.a(true);
                                        TXCLog.d(TXVodPlayer.TAG, "loop play");
                                        return;
                                    }
                                case 2007:
                                    i2 = 2007;
                                    p.this.h.j();
                                    break;
                                case 2008:
                                    i2 = 2008;
                                    break;
                                case 2009:
                                    i2 = 2009;
                                    break;
                                default:
                                    switch (i) {
                                        case 2013:
                                            i2 = 2013;
                                            p.this.h.e();
                                            break;
                                        case 2014:
                                            i2 = 2014;
                                            break;
                                        default:
                                            switch (i) {
                                                case 2016:
                                                    TXCLog.i(TXVodPlayer.TAG, "vod play tcp connect success");
                                                    p.this.h.g();
                                                    return;
                                                case TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET /* 2017 */:
                                                    TXCLog.i(TXVodPlayer.TAG, "vod play first video packet");
                                                    p.this.h.i();
                                                    return;
                                                case TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED /* 2018 */:
                                                    TXCLog.i(TXVodPlayer.TAG, "vod play dns resolved");
                                                    p.this.h.h();
                                                    return;
                                                case TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE /* 2019 */:
                                                    return;
                                                default:
                                                    TXCLog.d(TXVodPlayer.TAG, "miss match event " + i);
                                                    return;
                                            }
                                    }
                            }
                    }
                } else {
                    if (!p.this.i) {
                        p.this.g.a(false);
                    }
                    i2 = 2106;
                }
                bundle2.putString("EVT_MSG", bundle.getString("description", ""));
                if (p.this.e == null || (bVar = p.this.e.get()) == null) {
                    return;
                }
                bVar.onNotifyEvent(i2, bundle2);
            }

            @Override // com.tencent.liteav.txcvodplayer.e
            public void a(Bundle bundle) {
                com.tencent.liteav.basic.c.b bVar;
                Bundle bundle2 = new Bundle();
                int[] a = com.tencent.liteav.basic.util.g.a();
                bundle2.putCharSequence("CPU_USAGE", (a[0] / 10) + "/" + (a[1] / 10) + "%");
                bundle2.putInt("VIDEO_FPS", (int) bundle.getFloat(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS));
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_DPS, (int) bundle.getFloat("dps"));
                bundle2.putInt("NET_SPEED", ((int) bundle.getLong("tcpSpeed")) / 1000);
                bundle2.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, ((int) bundle.getLong("cachedBytes")) / 1000);
                bundle2.putInt("VIDEO_WIDTH", p.this.f.getVideoWidth());
                bundle2.putInt("VIDEO_HEIGHT", p.this.f.getVideoHeight());
                bundle2.putString("SERVER_IP", p.this.f.getServerIp());
                p.this.h.e(p.this.f.getServerIp());
                if (p.this.e == null || (bVar = p.this.e.get()) == null) {
                    return;
                }
                bVar.onNotifyEvent(15001, bundle2);
            }
        };
        this.f = new TXCVodVideoView(context);
        this.f.setListener(this.o);
    }

    @Override // com.tencent.liteav.t
    public void a(j jVar) {
        super.a(jVar);
        if (this.g == null) {
            this.g = new com.tencent.liteav.txcvodplayer.d();
        }
        this.g.a(this.b.e);
        this.g.b(this.b.f);
        this.g.c(this.b.r);
        this.g.a(this.b.h);
        this.g.a(this.b.n);
        this.g.a(this.b.o);
        this.g.b(this.b.p);
        this.g.a(this.b.q);
        this.g.b(this.b.s);
        this.g.c(this.b.u);
        this.g.b(this.b.v);
        this.g.c(this.b.w);
        this.g.d(this.b.x);
        this.f.setConfig(this.g);
        this.l = jVar.t;
    }

    private String b(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "0";
        Uri parse = Uri.parse(str);
        String query = parse.getQuery();
        String str8 = "";
        boolean z = false;
        if (query != null && !query.isEmpty()) {
            String[] split = query.split("&");
            if (split.length > 0) {
                str3 = "";
                str4 = "";
                str5 = "";
                str6 = "";
                int i = 0;
                for (String str9 : split) {
                    String[] split2 = str9.split("=");
                    if (split2.length == 2) {
                        if ("spfileid".equalsIgnoreCase(split2[0])) {
                            str5 = split2[1];
                            i++;
                        } else if ("spdrmtype".equalsIgnoreCase(split2[0])) {
                            str6 = split2[1];
                            i++;
                        } else if ("spappid".equalsIgnoreCase(split2[0])) {
                            str3 = split2[1];
                            i++;
                        } else {
                            if (!str4.isEmpty()) {
                                str4 = str4 + "&";
                            }
                            str4 = str4 + str9;
                        }
                    } else {
                        TXCLog.e(TXVodPlayer.TAG, "fieldIds.length != 2");
                    }
                }
                if (i == 3) {
                    str7 = "1";
                    z = true;
                }
            } else {
                str3 = "";
                str4 = "";
                str5 = "";
                str6 = "";
            }
            if (z) {
                TXCLog.d(TXVodPlayer.TAG, "spfileid, " + str5 + ", spdrmtype= " + str6 + ", spappid=" + str3);
                this.h.d(str5);
                this.h.c(str6);
                this.h.f(str3);
                this.h.b(str7);
            }
            str8 = str4;
        }
        if (z) {
            str2 = parse.buildUpon().clearQuery().build().toString();
            if (!str8.isEmpty()) {
                str2 = parse.buildUpon().clearQuery().query(str8).build().toString();
            }
        } else {
            str2 = str;
        }
        TXCLog.i(TXVodPlayer.TAG, "parsePlayUrl url: " + str2);
        return str2;
    }

    @Override // com.tencent.liteav.t
    public int a(String str, int i) {
        if (this.d != null) {
            this.d.setVisibility(0);
            if (this.d.getVideoView() == null) {
                TextureRenderView textureRenderView = new TextureRenderView(this.d.getContext());
                this.d.addVideoView(textureRenderView);
                this.f.setTextureRenderView(textureRenderView);
            }
            this.d.getVideoView().setVisibility(0);
        } else if (this.n != null) {
            this.f.setRenderSurface(this.n);
        }
        this.h = new n(this.c);
        String b = b(str);
        this.h.a(b);
        this.h.a(this.k);
        this.i = false;
        this.f.setPlayerType(this.g.b());
        this.f.b(this.j);
        this.f.setVideoPath(b);
        this.f.setAutoPlay(this.k);
        this.f.setRate(this.m);
        this.f.setAutoRotate(this.l);
        this.f.b();
        this.h.a(1);
        TXCLog.d(TXVodPlayer.TAG, "startPlay " + b);
        TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bt);
        try {
            if (Class.forName("com.tencent.liteav.demo.play.SuperPlayerView") != null) {
                TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bE);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // com.tencent.liteav.t
    public int a(boolean z) {
        this.f.c();
        if (this.d != null && this.d.getVideoView() != null && z) {
            this.d.getVideoView().setVisibility(8);
        }
        if (this.h != null) {
            this.h.b();
            return 0;
        }
        return 0;
    }

    @Override // com.tencent.liteav.t
    public void a(Surface surface) {
        this.n = surface;
        if (this.f != null) {
            this.f.setRenderSurface(this.n);
        }
    }

    @Override // com.tencent.liteav.t
    public void a() {
        this.f.d();
        if (this.h != null) {
            this.h.c();
        }
    }

    @Override // com.tencent.liteav.t
    public void b() {
        this.f.b();
        if (this.h != null) {
            this.h.d();
        }
    }

    @Override // com.tencent.liteav.t
    public void e(int i) {
        this.f.a(i * 1000);
        if (!this.i || this.h == null) {
            return;
        }
        this.h.k();
    }

    public void a(float f) {
        this.f.a((int) (f * 1000.0f));
        if (!this.i || this.h == null) {
            return;
        }
        this.h.k();
    }

    public float h() {
        if (this.f != null) {
            return this.f.getCurrentPosition() / 1000.0f;
        }
        return 0.0f;
    }

    public float j() {
        if (this.f != null) {
            return this.f.getBufferDuration() / 1000.0f;
        }
        return 0.0f;
    }

    public float k() {
        if (this.f != null) {
            return this.f.getDuration() / 1000.0f;
        }
        return 0.0f;
    }

    public float l() {
        if (this.f != null) {
            return this.f.getBufferDuration() / 1000.0f;
        }
        return 0.0f;
    }

    public int m() {
        if (this.f != null) {
            return this.f.getVideoWidth();
        }
        return 0;
    }

    public int n() {
        if (this.f != null) {
            return this.f.getVideoHeight();
        }
        return 0;
    }

    @Override // com.tencent.liteav.t
    public void b(boolean z) {
        this.f.setMute(z);
    }

    @Override // com.tencent.liteav.t
    public void c(int i) {
        this.f.setVolume(i);
    }

    public void f(int i) {
        this.f.setAudioPlayoutVolume(i);
    }

    @Override // com.tencent.liteav.t
    public void a(int i) {
        if (i == 1) {
            this.f.setRenderMode(0);
        } else {
            this.f.setRenderMode(1);
        }
    }

    @Override // com.tencent.liteav.t
    public void b(int i) {
        this.f.setVideoRotationDegree(360 - i);
    }

    @Override // com.tencent.liteav.t
    public void a(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != this.d) {
            if (this.d != null) {
                this.d.removeVideoView();
            }
            if (tXCloudVideoView != 0) {
                tXCloudVideoView.removeVideoView();
            }
        }
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (tXCloudVideoView.getVideoView() == null) {
                TextureRenderView textureRenderView = new TextureRenderView(tXCloudVideoView.getContext());
                tXCloudVideoView.addVideoView(textureRenderView);
                this.f.setTextureRenderView(textureRenderView);
            }
            tXCloudVideoView.getVideoView().setVisibility(0);
        }
        super.a(tXCloudVideoView);
    }

    public void a(TextureRenderView textureRenderView) {
        if (this.f != null) {
            this.f.setRenderView(textureRenderView);
        }
    }

    @Override // com.tencent.liteav.t
    public TextureView d() {
        if (this.d != null) {
            return this.d.getVideoView();
        }
        return null;
    }

    @Override // com.tencent.liteav.t
    public boolean c() {
        return this.f.e();
    }

    @Override // com.tencent.liteav.t
    public boolean d(boolean z) {
        this.j = z;
        if (this.f != null) {
            return this.f.b(z);
        }
        return true;
    }

    @Override // com.tencent.liteav.t
    public void e(boolean z) {
        this.k = z;
        if (this.f != null) {
            this.f.setAutoPlay(z);
        }
    }

    @Override // com.tencent.liteav.t
    public void b(float f) {
        this.m = f;
        if (this.f != null) {
            this.f.setRate(f);
        }
        if (this.h != null) {
            this.h.a(f);
        }
    }

    public void c(float f) {
        if (this.f != null) {
            this.f.setStartTime(f);
        }
    }

    public int o() {
        if (this.f != null) {
            return this.f.getBitrateIndex();
        }
        return 0;
    }

    public void g(int i) {
        if (this.f != null) {
            this.f.setBitrateIndex(i);
        }
        if (!this.i || this.h == null) {
            return;
        }
        this.h.l();
    }

    public ArrayList<TXBitrateItem> p() {
        ArrayList<IjkBitrateItem> supportedBitrates;
        ArrayList<TXBitrateItem> arrayList = new ArrayList<>();
        if (this.f != null && (supportedBitrates = this.f.getSupportedBitrates()) != null) {
            Iterator<IjkBitrateItem> it = supportedBitrates.iterator();
            while (it.hasNext()) {
                IjkBitrateItem next = it.next();
                TXBitrateItem tXBitrateItem = new TXBitrateItem();
                tXBitrateItem.index = next.index;
                tXBitrateItem.width = next.width;
                tXBitrateItem.height = next.height;
                tXBitrateItem.bitrate = next.bitrate;
                arrayList.add(tXBitrateItem);
            }
        }
        return arrayList;
    }

    public void f(boolean z) {
        this.a = z;
    }

    public void g(boolean z) {
        TextureView d = d();
        if (d != null) {
            if (this.b.t && (this.f.getMetaRotationDegree() == 90 || this.f.getMetaRotationDegree() == 270)) {
                d.setScaleY(z ? -1.0f : 1.0f);
            } else {
                d.setScaleX(z ? -1.0f : 1.0f);
            }
        }
        if (this.h != null) {
            this.h.b(z);
        }
    }
}
