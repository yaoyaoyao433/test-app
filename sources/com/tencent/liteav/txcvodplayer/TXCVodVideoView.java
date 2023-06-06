package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkBitrateItem;
import com.tencent.ijk.media.player.IjkLibLoader;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.ijk.media.player.IjkTimedText;
import com.tencent.ijk.media.player.MediaInfo;
import com.tencent.ijk.media.player.TextureMediaPlayer;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.txcvodplayer.a;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCVodVideoView extends FrameLayout {
    private int A;
    private String B;
    private float C;
    private com.tencent.liteav.txcvodplayer.a.a D;
    private com.tencent.liteav.txcvodplayer.a.b E;
    private long F;
    private boolean G;
    private int H;
    private float I;
    private float J;
    private boolean K;
    private int L;
    private boolean M;
    private b N;
    private boolean O;
    private IMediaPlayer.OnCompletionListener P;
    private IMediaPlayer.OnInfoListener Q;
    private int R;
    private IMediaPlayer.OnErrorListener S;
    private IMediaPlayer.OnHevcVideoDecoderErrorListener T;
    private IMediaPlayer.OnVideoDecoderErrorListener U;
    private IMediaPlayer.OnBufferingUpdateListener V;
    private IMediaPlayer.OnSeekCompleteListener W;
    protected boolean a;
    private IMediaPlayer.OnTimedTextListener aa;
    private IjkMediaPlayer.OnNativeInvokeListener ab;
    private IMediaPlayer.OnHLSKeyErrorListener ac;
    private int ad;
    private e ae;
    private Handler af;
    private boolean ag;
    protected boolean b;
    protected boolean c;
    protected final int d;
    IMediaPlayer.OnVideoSizeChangedListener e;
    IMediaPlayer.OnPreparedListener f;
    a.InterfaceC1464a g;
    private String h;
    private Uri i;
    private int j;
    private int k;
    private a.b l;
    private IMediaPlayer m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private Context w;
    private d x;
    private com.tencent.liteav.txcvodplayer.a y;
    private int z;

    public int getPlayerType() {
        return 0;
    }

    public void setPlayerType(int i) {
    }

    static /* synthetic */ int r(TXCVodVideoView tXCVodVideoView) {
        int i = tXCVodVideoView.R;
        tXCVodVideoView.R = i + 1;
        return i;
    }

    public int getMetaRotationDegree() {
        return this.s;
    }

    public TXCVodVideoView(Context context) {
        super(context);
        this.h = "TXCVodVideoView";
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = null;
        this.a = true;
        this.C = 1.0f;
        this.E = com.tencent.liteav.txcvodplayer.a.b.a();
        this.b = true;
        this.c = true;
        this.d = 0;
        this.G = false;
        this.H = -1;
        this.I = 1.0f;
        this.J = 1.0f;
        this.K = false;
        this.O = false;
        this.e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                boolean z = (TXCVodVideoView.this.o != i2 && Math.abs(TXCVodVideoView.this.o - i2) > 16) || (TXCVodVideoView.this.n != i && Math.abs(TXCVodVideoView.this.n - i) > 16);
                TXCVodVideoView.this.n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.z = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.A = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.n != 0 && TXCVodVideoView.this.o != 0) {
                    if (TXCVodVideoView.this.y != null) {
                        TXCVodVideoView.this.y.setVideoSize(TXCVodVideoView.this.n, TXCVodVideoView.this.o);
                        TXCVodVideoView.this.y.setVideoSampleAspectRatio(TXCVodVideoView.this.z, TXCVodVideoView.this.A);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.n + "*" + TXCVodVideoView.this.o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.af != null) {
                        TXCVodVideoView.this.af.sendMessage(message);
                    }
                }
            }
        };
        this.f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.j == 1) {
                    TXCVodVideoView.this.a(2013, "VOD ready", "prepared");
                    if (!TXCVodVideoView.this.c) {
                        TXCVodVideoView.this.k = 4;
                        TXCVodVideoView.this.c = true;
                    }
                    TXCVodVideoView.this.j = 2;
                }
                TXCVodVideoView.this.u = 0;
                if (TXCVodVideoView.this.j == -1) {
                    TXCVodVideoView.this.j = 3;
                    TXCVodVideoView.this.k = 3;
                }
                if (TXCVodVideoView.this.af != null) {
                    TXCVodVideoView.this.af.sendEmptyMessage(100);
                    TXCVodVideoView.this.af.sendEmptyMessage(103);
                }
                TXCVodVideoView.this.n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.n == 0 || TXCVodVideoView.this.o == 0) {
                    if (TXCVodVideoView.this.k == 3) {
                        TXCVodVideoView.this.b();
                    }
                } else if (TXCVodVideoView.this.y != null) {
                    TXCVodVideoView.this.y.setVideoSize(TXCVodVideoView.this.n, TXCVodVideoView.this.o);
                    TXCVodVideoView.this.y.setVideoSampleAspectRatio(TXCVodVideoView.this.z, TXCVodVideoView.this.A);
                    if ((!TXCVodVideoView.this.y.shouldWaitForResize() || (TXCVodVideoView.this.p == TXCVodVideoView.this.n && TXCVodVideoView.this.q == TXCVodVideoView.this.o)) && TXCVodVideoView.this.k == 3) {
                        TXCVodVideoView.this.b();
                    }
                }
            }
        };
        this.P = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.j = 5;
                TXCVodVideoView.this.k = 5;
                TXCVodVideoView.this.a(2006, "Playback completed", "play end");
            }
        };
        this.Q = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                switch (i) {
                    case 3:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                        if (!TXCVodVideoView.this.M) {
                            TXCVodVideoView.this.a(2003, "VOD displayed the first frame", "render start");
                        }
                        TXCVodVideoView.this.setRate(TXCVodVideoView.this.C);
                        TXCVodVideoView.this.M = true;
                        break;
                    case 700:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                        break;
                    case 701:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BUFFERING_START:");
                        TXCVodVideoView.this.a(2007, "Buffer started", "loading start");
                        break;
                    case 702:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BUFFERING_END: eof " + i2);
                        TXCVodVideoView.this.a(2014, "Buffer ended", "loading end");
                        if ((i2 == 0 || TXCVodVideoView.this.i == null || TXCVodVideoView.this.i.getPath() == null || !TXCVodVideoView.this.i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.k == 3) {
                            TXCVodVideoView.this.a(2004, "Playback started", "playing");
                            break;
                        }
                        break;
                    case 703:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i2);
                        break;
                    case 800:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BAD_INTERLEAVING:");
                        break;
                    case 801:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_NOT_SEEKABLE:");
                        break;
                    case 802:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_METADATA_UPDATE:");
                        break;
                    case 901:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                        break;
                    case 902:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                        break;
                    case 10001:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i2);
                        TXCVodVideoView.this.s = i2;
                        if (TXCVodVideoView.this.a && TXCVodVideoView.this.s > 0) {
                            TXCVodVideoView.this.r = TXCVodVideoView.this.s;
                            if (TXCVodVideoView.this.y != null) {
                                TXCVodVideoView.this.y.setVideoRotation(TXCVodVideoView.this.r);
                            }
                        }
                        TXCVodVideoView.this.a(2011, "Video angle " + TXCVodVideoView.this.s, "rotation " + TXCVodVideoView.this.s);
                        break;
                    case 10002:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                        break;
                    case 10011:
                        TXCVodVideoView.this.a((int) TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                        break;
                }
                return true;
            }
        };
        this.S = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                String str = TXCVodVideoView.this.h;
                TXCLog.e(str, "onError: " + i + CommonConstant.Symbol.COMMA + i2);
                TXCVodVideoView.this.j = -1;
                TXCVodVideoView.this.k = -1;
                if (i != -1004 || i2 != -2303) {
                    if (TXCVodVideoView.this.F != TXCVodVideoView.this.getCurrentPosition()) {
                        TXCVodVideoView.this.R = 0;
                    }
                    TXCVodVideoView.this.F = TXCVodVideoView.this.getCurrentPosition();
                    if (TXCVodVideoView.r(TXCVodVideoView.this) < TXCVodVideoView.this.x.a) {
                        if (TXCVodVideoView.this.af != null) {
                            TXCVodVideoView.this.af.sendEmptyMessageDelayed(102, TXCVodVideoView.this.x.b * 1000.0f);
                        }
                    } else {
                        TXCVodVideoView.this.a(-2301, "Disconnected from the network. Playback error", "disconnect");
                        TXCVodVideoView.this.c();
                    }
                    return true;
                }
                TXCVodVideoView.this.a(i2, "The file does not exist", "file not exist");
                TXCVodVideoView.this.c();
                return true;
            }
        };
        this.T = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.h;
                TXCVodVideoView.this.a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.U = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.h;
                if (TXCVodVideoView.this.j != 4) {
                    TXCVodVideoView.this.a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.M || !TXCVodVideoView.this.x.d || Math.min(TXCVodVideoView.this.o, TXCVodVideoView.this.n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.x.d = false;
                TXCVodVideoView.this.g();
            }
        };
        this.V = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
                TXCVodVideoView.this.t = i;
            }
        };
        this.W = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.v(TXCVodVideoView.this.h, "seek complete");
                TXCVodVideoView.this.G = false;
                if (TXCVodVideoView.this.H >= 0) {
                    TXCVodVideoView.this.a(TXCVodVideoView.this.H);
                }
            }
        };
        this.aa = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.ab = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i, Bundle bundle) {
                if (i == 2) {
                    String string = bundle.getString("url");
                    int i2 = bundle.getInt("error");
                    int i3 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
                    TXCLog.i(TXCVodVideoView.this.h, "http connect url:" + string + ",error:" + i2 + ",httpCode:" + i3);
                    return false;
                } else if (i != 131074) {
                    if (i != 131106) {
                        return false;
                    }
                    String string2 = bundle.getString("url");
                    int i4 = bundle.getInt("error");
                    String str = "dns resolved url:" + string2 + ",error:" + i4;
                    TXCLog.i(TXCVodVideoView.this.h, str);
                    if (i4 == 0) {
                        TXCVodVideoView.this.a((int) TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, str, "dns resolved");
                    }
                    return true;
                } else {
                    TXCVodVideoView.this.B = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    int i5 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                    int i6 = bundle.getInt("error");
                    String str2 = "TCP Connect ServerIp:" + TXCVodVideoView.this.B + ",port:" + i5 + ",error:" + i6;
                    TXCLog.i(TXCVodVideoView.this.h, str2);
                    if (i6 == 0) {
                        TXCVodVideoView.this.a(2016, str2, "tcp open");
                    }
                    return true;
                }
            }
        };
        this.ac = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.h, "onHLSKeyError");
                TXCVodVideoView.this.a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.m.stop();
                    TXCVodVideoView.this.m.release();
                    TXCVodVideoView.this.m = null;
                }
                TXCVodVideoView.this.j = -1;
                TXCVodVideoView.this.k = -1;
            }
        };
        this.g = new a.InterfaceC1464a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar, int i, int i2, int i3) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceChanged");
                TXCVodVideoView.this.p = i2;
                TXCVodVideoView.this.q = i3;
                boolean z = false;
                boolean z2 = TXCVodVideoView.this.k == 3;
                if (!TXCVodVideoView.this.y.shouldWaitForResize() || (TXCVodVideoView.this.n == i2 && TXCVodVideoView.this.o == i3)) {
                    z = true;
                }
                if (TXCVodVideoView.this.m != null && z2 && z && TXCVodVideoView.this.k == 3) {
                    TXCVodVideoView.this.b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar, int i, int i2) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceCreated");
                TXCVodVideoView.this.l = bVar;
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.a(TXCVodVideoView.this.m, bVar);
                } else {
                    TXCVodVideoView.this.f();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceDestroyed");
                TXCVodVideoView.this.l = null;
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.m.setSurface(null);
                }
                TXCVodVideoView.this.a();
            }
        };
        this.ad = 0;
        this.ag = false;
        a(context);
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = "TXCVodVideoView";
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = null;
        this.a = true;
        this.C = 1.0f;
        this.E = com.tencent.liteav.txcvodplayer.a.b.a();
        this.b = true;
        this.c = true;
        this.d = 0;
        this.G = false;
        this.H = -1;
        this.I = 1.0f;
        this.J = 1.0f;
        this.K = false;
        this.O = false;
        this.e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                boolean z = (TXCVodVideoView.this.o != i2 && Math.abs(TXCVodVideoView.this.o - i2) > 16) || (TXCVodVideoView.this.n != i && Math.abs(TXCVodVideoView.this.n - i) > 16);
                TXCVodVideoView.this.n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.z = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.A = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.n != 0 && TXCVodVideoView.this.o != 0) {
                    if (TXCVodVideoView.this.y != null) {
                        TXCVodVideoView.this.y.setVideoSize(TXCVodVideoView.this.n, TXCVodVideoView.this.o);
                        TXCVodVideoView.this.y.setVideoSampleAspectRatio(TXCVodVideoView.this.z, TXCVodVideoView.this.A);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.n + "*" + TXCVodVideoView.this.o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.af != null) {
                        TXCVodVideoView.this.af.sendMessage(message);
                    }
                }
            }
        };
        this.f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.j == 1) {
                    TXCVodVideoView.this.a(2013, "VOD ready", "prepared");
                    if (!TXCVodVideoView.this.c) {
                        TXCVodVideoView.this.k = 4;
                        TXCVodVideoView.this.c = true;
                    }
                    TXCVodVideoView.this.j = 2;
                }
                TXCVodVideoView.this.u = 0;
                if (TXCVodVideoView.this.j == -1) {
                    TXCVodVideoView.this.j = 3;
                    TXCVodVideoView.this.k = 3;
                }
                if (TXCVodVideoView.this.af != null) {
                    TXCVodVideoView.this.af.sendEmptyMessage(100);
                    TXCVodVideoView.this.af.sendEmptyMessage(103);
                }
                TXCVodVideoView.this.n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.n == 0 || TXCVodVideoView.this.o == 0) {
                    if (TXCVodVideoView.this.k == 3) {
                        TXCVodVideoView.this.b();
                    }
                } else if (TXCVodVideoView.this.y != null) {
                    TXCVodVideoView.this.y.setVideoSize(TXCVodVideoView.this.n, TXCVodVideoView.this.o);
                    TXCVodVideoView.this.y.setVideoSampleAspectRatio(TXCVodVideoView.this.z, TXCVodVideoView.this.A);
                    if ((!TXCVodVideoView.this.y.shouldWaitForResize() || (TXCVodVideoView.this.p == TXCVodVideoView.this.n && TXCVodVideoView.this.q == TXCVodVideoView.this.o)) && TXCVodVideoView.this.k == 3) {
                        TXCVodVideoView.this.b();
                    }
                }
            }
        };
        this.P = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.j = 5;
                TXCVodVideoView.this.k = 5;
                TXCVodVideoView.this.a(2006, "Playback completed", "play end");
            }
        };
        this.Q = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                switch (i) {
                    case 3:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                        if (!TXCVodVideoView.this.M) {
                            TXCVodVideoView.this.a(2003, "VOD displayed the first frame", "render start");
                        }
                        TXCVodVideoView.this.setRate(TXCVodVideoView.this.C);
                        TXCVodVideoView.this.M = true;
                        break;
                    case 700:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                        break;
                    case 701:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BUFFERING_START:");
                        TXCVodVideoView.this.a(2007, "Buffer started", "loading start");
                        break;
                    case 702:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BUFFERING_END: eof " + i2);
                        TXCVodVideoView.this.a(2014, "Buffer ended", "loading end");
                        if ((i2 == 0 || TXCVodVideoView.this.i == null || TXCVodVideoView.this.i.getPath() == null || !TXCVodVideoView.this.i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.k == 3) {
                            TXCVodVideoView.this.a(2004, "Playback started", "playing");
                            break;
                        }
                        break;
                    case 703:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i2);
                        break;
                    case 800:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BAD_INTERLEAVING:");
                        break;
                    case 801:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_NOT_SEEKABLE:");
                        break;
                    case 802:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_METADATA_UPDATE:");
                        break;
                    case 901:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                        break;
                    case 902:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                        break;
                    case 10001:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i2);
                        TXCVodVideoView.this.s = i2;
                        if (TXCVodVideoView.this.a && TXCVodVideoView.this.s > 0) {
                            TXCVodVideoView.this.r = TXCVodVideoView.this.s;
                            if (TXCVodVideoView.this.y != null) {
                                TXCVodVideoView.this.y.setVideoRotation(TXCVodVideoView.this.r);
                            }
                        }
                        TXCVodVideoView.this.a(2011, "Video angle " + TXCVodVideoView.this.s, "rotation " + TXCVodVideoView.this.s);
                        break;
                    case 10002:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                        break;
                    case 10011:
                        TXCVodVideoView.this.a((int) TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                        break;
                }
                return true;
            }
        };
        this.S = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                String str = TXCVodVideoView.this.h;
                TXCLog.e(str, "onError: " + i + CommonConstant.Symbol.COMMA + i2);
                TXCVodVideoView.this.j = -1;
                TXCVodVideoView.this.k = -1;
                if (i != -1004 || i2 != -2303) {
                    if (TXCVodVideoView.this.F != TXCVodVideoView.this.getCurrentPosition()) {
                        TXCVodVideoView.this.R = 0;
                    }
                    TXCVodVideoView.this.F = TXCVodVideoView.this.getCurrentPosition();
                    if (TXCVodVideoView.r(TXCVodVideoView.this) < TXCVodVideoView.this.x.a) {
                        if (TXCVodVideoView.this.af != null) {
                            TXCVodVideoView.this.af.sendEmptyMessageDelayed(102, TXCVodVideoView.this.x.b * 1000.0f);
                        }
                    } else {
                        TXCVodVideoView.this.a(-2301, "Disconnected from the network. Playback error", "disconnect");
                        TXCVodVideoView.this.c();
                    }
                    return true;
                }
                TXCVodVideoView.this.a(i2, "The file does not exist", "file not exist");
                TXCVodVideoView.this.c();
                return true;
            }
        };
        this.T = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.h;
                TXCVodVideoView.this.a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.U = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.h;
                if (TXCVodVideoView.this.j != 4) {
                    TXCVodVideoView.this.a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.M || !TXCVodVideoView.this.x.d || Math.min(TXCVodVideoView.this.o, TXCVodVideoView.this.n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.x.d = false;
                TXCVodVideoView.this.g();
            }
        };
        this.V = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
                TXCVodVideoView.this.t = i;
            }
        };
        this.W = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.v(TXCVodVideoView.this.h, "seek complete");
                TXCVodVideoView.this.G = false;
                if (TXCVodVideoView.this.H >= 0) {
                    TXCVodVideoView.this.a(TXCVodVideoView.this.H);
                }
            }
        };
        this.aa = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.ab = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i, Bundle bundle) {
                if (i == 2) {
                    String string = bundle.getString("url");
                    int i2 = bundle.getInt("error");
                    int i3 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
                    TXCLog.i(TXCVodVideoView.this.h, "http connect url:" + string + ",error:" + i2 + ",httpCode:" + i3);
                    return false;
                } else if (i != 131074) {
                    if (i != 131106) {
                        return false;
                    }
                    String string2 = bundle.getString("url");
                    int i4 = bundle.getInt("error");
                    String str = "dns resolved url:" + string2 + ",error:" + i4;
                    TXCLog.i(TXCVodVideoView.this.h, str);
                    if (i4 == 0) {
                        TXCVodVideoView.this.a((int) TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, str, "dns resolved");
                    }
                    return true;
                } else {
                    TXCVodVideoView.this.B = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    int i5 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                    int i6 = bundle.getInt("error");
                    String str2 = "TCP Connect ServerIp:" + TXCVodVideoView.this.B + ",port:" + i5 + ",error:" + i6;
                    TXCLog.i(TXCVodVideoView.this.h, str2);
                    if (i6 == 0) {
                        TXCVodVideoView.this.a(2016, str2, "tcp open");
                    }
                    return true;
                }
            }
        };
        this.ac = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.h, "onHLSKeyError");
                TXCVodVideoView.this.a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.m.stop();
                    TXCVodVideoView.this.m.release();
                    TXCVodVideoView.this.m = null;
                }
                TXCVodVideoView.this.j = -1;
                TXCVodVideoView.this.k = -1;
            }
        };
        this.g = new a.InterfaceC1464a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar, int i, int i2, int i3) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceChanged");
                TXCVodVideoView.this.p = i2;
                TXCVodVideoView.this.q = i3;
                boolean z = false;
                boolean z2 = TXCVodVideoView.this.k == 3;
                if (!TXCVodVideoView.this.y.shouldWaitForResize() || (TXCVodVideoView.this.n == i2 && TXCVodVideoView.this.o == i3)) {
                    z = true;
                }
                if (TXCVodVideoView.this.m != null && z2 && z && TXCVodVideoView.this.k == 3) {
                    TXCVodVideoView.this.b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar, int i, int i2) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceCreated");
                TXCVodVideoView.this.l = bVar;
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.a(TXCVodVideoView.this.m, bVar);
                } else {
                    TXCVodVideoView.this.f();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceDestroyed");
                TXCVodVideoView.this.l = null;
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.m.setSurface(null);
                }
                TXCVodVideoView.this.a();
            }
        };
        this.ad = 0;
        this.ag = false;
        a(context);
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = "TXCVodVideoView";
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = null;
        this.a = true;
        this.C = 1.0f;
        this.E = com.tencent.liteav.txcvodplayer.a.b.a();
        this.b = true;
        this.c = true;
        this.d = 0;
        this.G = false;
        this.H = -1;
        this.I = 1.0f;
        this.J = 1.0f;
        this.K = false;
        this.O = false;
        this.e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i22, int i3, int i4) {
                boolean z = (TXCVodVideoView.this.o != i22 && Math.abs(TXCVodVideoView.this.o - i22) > 16) || (TXCVodVideoView.this.n != i2 && Math.abs(TXCVodVideoView.this.n - i2) > 16);
                TXCVodVideoView.this.n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.z = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.A = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.n != 0 && TXCVodVideoView.this.o != 0) {
                    if (TXCVodVideoView.this.y != null) {
                        TXCVodVideoView.this.y.setVideoSize(TXCVodVideoView.this.n, TXCVodVideoView.this.o);
                        TXCVodVideoView.this.y.setVideoSampleAspectRatio(TXCVodVideoView.this.z, TXCVodVideoView.this.A);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.n + "*" + TXCVodVideoView.this.o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.af != null) {
                        TXCVodVideoView.this.af.sendMessage(message);
                    }
                }
            }
        };
        this.f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.j == 1) {
                    TXCVodVideoView.this.a(2013, "VOD ready", "prepared");
                    if (!TXCVodVideoView.this.c) {
                        TXCVodVideoView.this.k = 4;
                        TXCVodVideoView.this.c = true;
                    }
                    TXCVodVideoView.this.j = 2;
                }
                TXCVodVideoView.this.u = 0;
                if (TXCVodVideoView.this.j == -1) {
                    TXCVodVideoView.this.j = 3;
                    TXCVodVideoView.this.k = 3;
                }
                if (TXCVodVideoView.this.af != null) {
                    TXCVodVideoView.this.af.sendEmptyMessage(100);
                    TXCVodVideoView.this.af.sendEmptyMessage(103);
                }
                TXCVodVideoView.this.n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.n == 0 || TXCVodVideoView.this.o == 0) {
                    if (TXCVodVideoView.this.k == 3) {
                        TXCVodVideoView.this.b();
                    }
                } else if (TXCVodVideoView.this.y != null) {
                    TXCVodVideoView.this.y.setVideoSize(TXCVodVideoView.this.n, TXCVodVideoView.this.o);
                    TXCVodVideoView.this.y.setVideoSampleAspectRatio(TXCVodVideoView.this.z, TXCVodVideoView.this.A);
                    if ((!TXCVodVideoView.this.y.shouldWaitForResize() || (TXCVodVideoView.this.p == TXCVodVideoView.this.n && TXCVodVideoView.this.q == TXCVodVideoView.this.o)) && TXCVodVideoView.this.k == 3) {
                        TXCVodVideoView.this.b();
                    }
                }
            }
        };
        this.P = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.j = 5;
                TXCVodVideoView.this.k = 5;
                TXCVodVideoView.this.a(2006, "Playback completed", "play end");
            }
        };
        this.Q = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i22) {
                switch (i2) {
                    case 3:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                        if (!TXCVodVideoView.this.M) {
                            TXCVodVideoView.this.a(2003, "VOD displayed the first frame", "render start");
                        }
                        TXCVodVideoView.this.setRate(TXCVodVideoView.this.C);
                        TXCVodVideoView.this.M = true;
                        break;
                    case 700:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                        break;
                    case 701:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BUFFERING_START:");
                        TXCVodVideoView.this.a(2007, "Buffer started", "loading start");
                        break;
                    case 702:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BUFFERING_END: eof " + i22);
                        TXCVodVideoView.this.a(2014, "Buffer ended", "loading end");
                        if ((i22 == 0 || TXCVodVideoView.this.i == null || TXCVodVideoView.this.i.getPath() == null || !TXCVodVideoView.this.i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.k == 3) {
                            TXCVodVideoView.this.a(2004, "Playback started", "playing");
                            break;
                        }
                        break;
                    case 703:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i22);
                        break;
                    case 800:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_BAD_INTERLEAVING:");
                        break;
                    case 801:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_NOT_SEEKABLE:");
                        break;
                    case 802:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_METADATA_UPDATE:");
                        break;
                    case 901:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                        break;
                    case 902:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                        break;
                    case 10001:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i22);
                        TXCVodVideoView.this.s = i22;
                        if (TXCVodVideoView.this.a && TXCVodVideoView.this.s > 0) {
                            TXCVodVideoView.this.r = TXCVodVideoView.this.s;
                            if (TXCVodVideoView.this.y != null) {
                                TXCVodVideoView.this.y.setVideoRotation(TXCVodVideoView.this.r);
                            }
                        }
                        TXCVodVideoView.this.a(2011, "Video angle " + TXCVodVideoView.this.s, "rotation " + TXCVodVideoView.this.s);
                        break;
                    case 10002:
                        TXCLog.i(TXCVodVideoView.this.h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                        break;
                    case 10011:
                        TXCVodVideoView.this.a((int) TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                        break;
                }
                return true;
            }
        };
        this.S = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i22) {
                String str = TXCVodVideoView.this.h;
                TXCLog.e(str, "onError: " + i2 + CommonConstant.Symbol.COMMA + i22);
                TXCVodVideoView.this.j = -1;
                TXCVodVideoView.this.k = -1;
                if (i2 != -1004 || i22 != -2303) {
                    if (TXCVodVideoView.this.F != TXCVodVideoView.this.getCurrentPosition()) {
                        TXCVodVideoView.this.R = 0;
                    }
                    TXCVodVideoView.this.F = TXCVodVideoView.this.getCurrentPosition();
                    if (TXCVodVideoView.r(TXCVodVideoView.this) < TXCVodVideoView.this.x.a) {
                        if (TXCVodVideoView.this.af != null) {
                            TXCVodVideoView.this.af.sendEmptyMessageDelayed(102, TXCVodVideoView.this.x.b * 1000.0f);
                        }
                    } else {
                        TXCVodVideoView.this.a(-2301, "Disconnected from the network. Playback error", "disconnect");
                        TXCVodVideoView.this.c();
                    }
                    return true;
                }
                TXCVodVideoView.this.a(i22, "The file does not exist", "file not exist");
                TXCVodVideoView.this.c();
                return true;
            }
        };
        this.T = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.h;
                TXCVodVideoView.this.a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.U = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.h;
                if (TXCVodVideoView.this.j != 4) {
                    TXCVodVideoView.this.a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.M || !TXCVodVideoView.this.x.d || Math.min(TXCVodVideoView.this.o, TXCVodVideoView.this.n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.x.d = false;
                TXCVodVideoView.this.g();
            }
        };
        this.V = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
                TXCVodVideoView.this.t = i2;
            }
        };
        this.W = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.v(TXCVodVideoView.this.h, "seek complete");
                TXCVodVideoView.this.G = false;
                if (TXCVodVideoView.this.H >= 0) {
                    TXCVodVideoView.this.a(TXCVodVideoView.this.H);
                }
            }
        };
        this.aa = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.ab = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i2, Bundle bundle) {
                if (i2 == 2) {
                    String string = bundle.getString("url");
                    int i22 = bundle.getInt("error");
                    int i3 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
                    TXCLog.i(TXCVodVideoView.this.h, "http connect url:" + string + ",error:" + i22 + ",httpCode:" + i3);
                    return false;
                } else if (i2 != 131074) {
                    if (i2 != 131106) {
                        return false;
                    }
                    String string2 = bundle.getString("url");
                    int i4 = bundle.getInt("error");
                    String str = "dns resolved url:" + string2 + ",error:" + i4;
                    TXCLog.i(TXCVodVideoView.this.h, str);
                    if (i4 == 0) {
                        TXCVodVideoView.this.a((int) TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, str, "dns resolved");
                    }
                    return true;
                } else {
                    TXCVodVideoView.this.B = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    int i5 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                    int i6 = bundle.getInt("error");
                    String str2 = "TCP Connect ServerIp:" + TXCVodVideoView.this.B + ",port:" + i5 + ",error:" + i6;
                    TXCLog.i(TXCVodVideoView.this.h, str2);
                    if (i6 == 0) {
                        TXCVodVideoView.this.a(2016, str2, "tcp open");
                    }
                    return true;
                }
            }
        };
        this.ac = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.h, "onHLSKeyError");
                TXCVodVideoView.this.a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.m.stop();
                    TXCVodVideoView.this.m.release();
                    TXCVodVideoView.this.m = null;
                }
                TXCVodVideoView.this.j = -1;
                TXCVodVideoView.this.k = -1;
            }
        };
        this.g = new a.InterfaceC1464a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar, int i2, int i22, int i3) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceChanged");
                TXCVodVideoView.this.p = i22;
                TXCVodVideoView.this.q = i3;
                boolean z = false;
                boolean z2 = TXCVodVideoView.this.k == 3;
                if (!TXCVodVideoView.this.y.shouldWaitForResize() || (TXCVodVideoView.this.n == i22 && TXCVodVideoView.this.o == i3)) {
                    z = true;
                }
                if (TXCVodVideoView.this.m != null && z2 && z && TXCVodVideoView.this.k == 3) {
                    TXCVodVideoView.this.b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar, int i2, int i22) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceCreated");
                TXCVodVideoView.this.l = bVar;
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.a(TXCVodVideoView.this.m, bVar);
                } else {
                    TXCVodVideoView.this.f();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC1464a
            public void a(@NonNull a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.y) {
                    TXCLog.e(TXCVodVideoView.this.h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.h, "onSurfaceDestroyed");
                TXCVodVideoView.this.l = null;
                if (TXCVodVideoView.this.m != null) {
                    TXCVodVideoView.this.m.setSurface(null);
                }
                TXCVodVideoView.this.a();
            }
        };
        this.ad = 0;
        this.ag = false;
        a(context);
    }

    private void a(Context context) {
        this.w = context.getApplicationContext();
        this.x = new d();
        i();
        this.n = 0;
        this.o = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.j = 0;
        this.k = 0;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.af = new a(this, mainLooper);
        } else {
            this.af = null;
        }
        this.N = new b();
    }

    public void setRenderView(com.tencent.liteav.txcvodplayer.a aVar) {
        String str = this.h;
        TXCLog.i(str, "setRenderView " + aVar);
        if (this.y != null) {
            if (this.m != null) {
                this.m.setDisplay(null);
            }
            View view = this.y.getView();
            this.y.removeRenderCallback(this.g);
            this.y = null;
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        if (aVar == null) {
            return;
        }
        this.y = aVar;
        aVar.setAspectRatio(this.ad);
        if (this.n > 0 && this.o > 0) {
            aVar.setVideoSize(this.n, this.o);
        }
        if (this.z > 0 && this.A > 0) {
            aVar.setVideoSampleAspectRatio(this.z, this.A);
        }
        View view2 = this.y.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (view2.getParent() == null) {
            addView(view2);
        }
        this.y.addRenderCallback(this.g);
        this.y.setVideoRotation(this.r);
    }

    public void setRender(int i) {
        switch (i) {
            case 0:
                setRenderView(null);
                return;
            case 1:
                setRenderView(new SurfaceRenderView(this.w));
                return;
            case 2:
                TextureRenderView textureRenderView = new TextureRenderView(this.w);
                if (this.m != null) {
                    textureRenderView.getSurfaceHolder().a(this.m);
                    textureRenderView.setVideoSize(this.m.getVideoWidth(), this.m.getVideoHeight());
                    textureRenderView.setVideoSampleAspectRatio(this.m.getVideoSarNum(), this.m.getVideoSarDen());
                    textureRenderView.setAspectRatio(this.ad);
                }
                setRenderView(textureRenderView);
                return;
            default:
                TXCLog.e(this.h, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i)));
                return;
        }
    }

    public void setTextureRenderView(TextureRenderView textureRenderView) {
        String str = this.h;
        TXCLog.i(str, "setTextureRenderView " + textureRenderView);
        if (this.m != null) {
            textureRenderView.getSurfaceHolder().a(this.m);
            textureRenderView.setVideoSize(this.m.getVideoWidth(), this.m.getVideoHeight());
            textureRenderView.setVideoSampleAspectRatio(this.m.getVideoSarNum(), this.m.getVideoSarDen());
            textureRenderView.setAspectRatio(this.ad);
        }
        setRenderView(textureRenderView);
    }

    public void setRenderSurface(final Surface surface) {
        this.l = new a.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.1
            @Override // com.tencent.liteav.txcvodplayer.a.b
            public void a(IMediaPlayer iMediaPlayer) {
                iMediaPlayer.setSurface(surface);
            }

            @Override // com.tencent.liteav.txcvodplayer.a.b
            @NonNull
            public com.tencent.liteav.txcvodplayer.a a() {
                return TXCVodVideoView.this.y;
            }
        };
        if (this.m != null) {
            a(this.m, this.l);
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.i = uri;
        this.v = 0;
        this.R = 0;
        this.B = null;
        String str = this.h;
        TXCLog.i(str, "setVideoURI " + uri);
        f();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public boolean f() {
        IjkMediaPlayer ijkMediaPlayer;
        TXCLog.i(this.h, "openVideo");
        if (this.i == null) {
            return false;
        }
        a(false);
        if (this.b) {
            ((AudioManager) this.w.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        }
        try {
            String uri = this.i.toString();
            if (uri.startsWith("/") && !new File(uri).exists()) {
                throw new FileNotFoundException();
            }
            if (this.i != null) {
                ijkMediaPlayer = new IjkMediaPlayer(new IjkLibLoader() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
                    @Override // com.tencent.ijk.media.player.IjkLibLoader
                    public void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
                        g.a(str);
                    }
                });
                IjkMediaPlayer.native_setLogLevel(3);
                ijkMediaPlayer.setOnNativeInvokeListener(this.ab);
                if (this.x.d) {
                    ijkMediaPlayer.setOption(4, "mediacodec", 1L);
                    ijkMediaPlayer.setOption(4, "mediacodec-hevc", 1L);
                    this.O = true;
                } else {
                    ijkMediaPlayer.setOption(4, "mediacodec", 0L);
                    this.O = false;
                }
                TXCLog.i(this.h, "ijk mediacodec " + this.x.d);
                ijkMediaPlayer.setOption(4, "mediacodec-auto-rotate", 0L);
                ijkMediaPlayer.setOption(4, "mediacodec-handle-resolution-change", 0L);
                ijkMediaPlayer.setOption(4, "opensles", 0L);
                ijkMediaPlayer.setOption(4, "overlay-format", 842225234L);
                ijkMediaPlayer.setOption(4, "framedrop", 1L);
                ijkMediaPlayer.setOption(4, "soundtouch", 1L);
                ijkMediaPlayer.setOption(4, "max-fps", 30L);
                if (this.c && this.k != 4) {
                    ijkMediaPlayer.setOption(4, "start-on-prepared", 1L);
                } else {
                    ijkMediaPlayer.setOption(4, "start-on-prepared", 0L);
                }
                ijkMediaPlayer.setOption(4, "load-on-prepared", 1L);
                ijkMediaPlayer.setOption(1, "http-detect-range-support", 0L);
                ijkMediaPlayer.setOption(2, "skip_loop_filter", 0L);
                ijkMediaPlayer.setOption(2, "skip_frame", 0L);
                ijkMediaPlayer.setOption(1, "timeout", (int) (this.x.c * 1000.0f * 1000.0f));
                ijkMediaPlayer.setOption(1, "reconnect", 1L);
                ijkMediaPlayer.setOption(1, "analyzeduration", 90000000L);
                ijkMediaPlayer.setOption(4, "enable-accurate-seek", this.x.i ? 1L : 0L);
                ijkMediaPlayer.setOption(4, "disable-bitrate-sync", this.x.j ? 0L : 1L);
                ijkMediaPlayer.setOption(1, "dns_cache_timeout", 0L);
                ijkMediaPlayer.setOption(1, "cache_max_capacity", 2147483647L);
                if (this.u > 0) {
                    ijkMediaPlayer.setOption(4, "seek-at-start", this.u);
                    TXCLog.i(this.h, "ijk start time " + this.u);
                }
                if (this.x.m > 0) {
                    ijkMediaPlayer.setOption(4, "max-buffer-size", this.x.m * 1024 * 1024);
                    TXCLog.i(this.h, "ijk max buffer size " + this.x.m);
                }
                if (this.x.h != null) {
                    String str = null;
                    for (String str2 : this.x.h.keySet()) {
                        str = str == null ? String.format("%s: %s", str2, this.x.h.get(str2)) : str + StringUtil.CRLF_STRING + String.format("%s: %s", str2, this.x.h.get(str2));
                    }
                    ijkMediaPlayer.setOption(1, "headers", str);
                }
                ijkMediaPlayer.setBitrateIndex(this.L);
                IjkMediaPlayer.native_setLogLevel(5);
                if (this.x.e != null && this.E.e(uri)) {
                    this.E.b(this.x.e);
                    this.E.a(this.x.f);
                    this.D = this.E.d(uri);
                    if (this.D != null) {
                        if (this.D.a() != null) {
                            ijkMediaPlayer.setOption(1, "cache_file_path", this.D.a());
                            uri = "ijkio:cache:ffio:" + this.i.toString();
                        } else if (this.D.b() != null) {
                            ijkMediaPlayer.setOption(1, "cache_db_path", this.D.b());
                            uri = "ijkhlscache:" + this.i.toString();
                        }
                    }
                }
            } else {
                ijkMediaPlayer = null;
            }
            TXCLog.i(this.h, "ijk media player " + ijkMediaPlayer);
            this.m = new TextureMediaPlayer(ijkMediaPlayer);
            this.m.setDataSource(uri);
            this.m.setOnPreparedListener(this.f);
            this.m.setOnVideoSizeChangedListener(this.e);
            this.m.setOnCompletionListener(this.P);
            this.m.setOnErrorListener(this.S);
            this.m.setOnInfoListener(this.Q);
            this.m.setOnBufferingUpdateListener(this.V);
            this.m.setOnSeekCompleteListener(this.W);
            this.m.setOnTimedTextListener(this.aa);
            this.m.setOnHLSKeyErrorListener(this.ac);
            this.m.setOnHevcVideoDecoderErrorListener(this.T);
            this.m.setOnVideoDecoderErrorListener(this.U);
            this.t = 0;
            a(this.m, this.l);
            this.m.setAudioStreamType(3);
            this.m.setScreenOnWhilePlaying(true);
            this.m.prepareAsync();
            this.m.setVolume(this.I, this.J);
            setMute(this.K);
            if (this.N != null) {
                this.N.a(this.m);
            }
            this.j = 1;
        } catch (FileNotFoundException unused) {
            this.j = -1;
            this.k = -1;
            this.S.onError(this.m, -1004, -2303);
        } catch (Exception e) {
            TXCLog.w(this.h, e.toString());
            this.j = -1;
            this.k = -1;
            this.S.onError(this.m, 1, 0);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
            return;
        }
        TXCLog.i(this.h, "bindSurfaceHolder");
        bVar.a(iMediaPlayer);
    }

    void a() {
        if (this.m != null) {
            this.m.setDisplay(null);
        }
    }

    void a(boolean z) {
        if (this.m != null) {
            String str = this.h;
            TXCLog.i(str, "release player " + this.m);
            this.m.release();
            this.m = null;
            this.j = 0;
            if (z) {
                this.k = 0;
                this.n = 0;
                this.o = 0;
            }
            if (this.b) {
                ((AudioManager) this.w.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
    }

    public void b() {
        TXCLog.i(this.h, "start");
        if (h()) {
            this.m.start();
            if (this.j != 3 && !this.G) {
                this.j = 3;
                a(2004, "Playback started", "playing");
            }
        }
        this.k = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TXCLog.i(this.h, "replay");
        if (this.u == 0 && this.m != null && this.v > 0) {
            this.u = (int) this.m.getCurrentPosition();
        }
        if (f()) {
            return;
        }
        a(false);
    }

    public void c() {
        if (this.m != null) {
            if (this.D != null) {
                if (getDuration() <= 0) {
                    this.E.a(this.D.d(), true);
                } else {
                    this.E.a(this.D.d(), false);
                }
                this.D = null;
            }
            this.m.stop();
            this.m.release();
            this.m = null;
            this.i = null;
            this.n = 0;
            this.o = 0;
            this.C = 1.0f;
            this.G = false;
            this.H = -1;
            this.j = 0;
            this.k = 0;
            this.M = false;
            this.O = false;
            this.L = 0;
            if (this.N != null) {
                this.N.a((IMediaPlayer) null);
            }
            if (this.b) {
                ((AudioManager) this.w.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
        if (this.af != null) {
            this.af.removeMessages(102);
        }
        TXCLog.i(this.h, "stop");
    }

    public void d() {
        this.k = 4;
        TXCLog.i(this.h, "pause");
        if (h() && this.m.isPlaying()) {
            this.m.pause();
            this.j = 4;
        }
    }

    public int getDuration() {
        if (this.m != null && this.v <= 0) {
            this.v = (int) this.m.getDuration();
        }
        return this.v;
    }

    public int getCurrentPosition() {
        if (this.G && this.H >= 0) {
            return this.H;
        }
        if (this.u > 0) {
            return this.u;
        }
        if (this.m != null) {
            return (int) this.m.getCurrentPosition();
        }
        return 0;
    }

    public void a(int i) {
        String str = this.h;
        TXCLog.i(str, "seek to " + i);
        if (getUrlPathExtention().equals(IjkMediaMeta.IJKM_KEY_M3U8)) {
            i = Math.min(i, getDuration() - 1000);
        }
        if (i >= 0 && h()) {
            if (i > getDuration()) {
                i = getDuration();
            }
            if (this.G) {
                this.H = i;
            } else {
                this.H = -1;
                this.m.seekTo(i);
            }
            this.G = true;
        }
    }

    public void setMute(boolean z) {
        this.K = z;
        if (this.m == null) {
            return;
        }
        if (z) {
            this.m.setVolume(0.0f, 0.0f);
        } else {
            this.m.setVolume(this.I, this.J);
        }
    }

    public void setVolume(int i) {
        float f = i / 100.0f;
        this.I = f;
        this.J = f;
        if (this.m != null) {
            this.m.setVolume(this.I, this.J);
        }
    }

    public void setAudioPlayoutVolume(int i) {
        if (this.m != null) {
            this.m.setAudioVolume(i);
        }
    }

    public boolean e() {
        return h() && this.m.isPlaying() && this.j != 4;
    }

    public int getBufferDuration() {
        if (this.m != null) {
            getUnwrappedMediaPlayer();
            int duration = (this.t * getDuration()) / 100;
            if (duration < getCurrentPosition()) {
                duration = getCurrentPosition();
            }
            return Math.abs(getDuration() - duration) < 1000 ? getDuration() : duration;
        }
        return 0;
    }

    private boolean h() {
        return (this.m == null || this.j == -1 || this.j == 0 || this.j == 1) ? false : true;
    }

    public void setConfig(d dVar) {
        if (dVar != null) {
            this.x = dVar;
            this.E.a(this.x.k);
        }
    }

    public void setRenderMode(int i) {
        this.ad = i;
        if (this.y != null) {
            this.y.setAspectRatio(this.ad);
        }
        if (this.y != null) {
            this.y.setVideoRotation(this.r);
        }
    }

    public void setVideoRotationDegree(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            if (i != 360) {
                String str = this.h;
                TXCLog.e(str, "not support degree " + i);
                return;
            }
            i = 0;
        }
        this.r = i;
        if (this.y != null) {
            this.y.setVideoRotation(this.r);
        }
        if (this.y != null) {
            this.y.setAspectRatio(this.ad);
        }
    }

    public int getVideoRotationDegree() {
        return this.r;
    }

    private void i() {
        setRender(0);
    }

    public boolean b(boolean z) {
        if (this.j == 0) {
            this.b = z;
            return true;
        }
        return false;
    }

    public void setAutoPlay(boolean z) {
        this.c = z;
    }

    public void setRate(float f) {
        String str = this.h;
        TXCLog.i(str, "setRate " + f);
        if (this.m != null) {
            this.m.setRate(f);
        }
        this.C = f;
    }

    public void setStartTime(float f) {
        this.u = (int) (f * 1000.0f);
    }

    public void setAutoRotate(boolean z) {
        this.a = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends Handler {
        private final WeakReference<TXCVodVideoView> a;
        private final int b;

        public a(TXCVodVideoView tXCVodVideoView, Looper looper) {
            super(looper);
            this.b = 500;
            this.a = new WeakReference<>(tXCVodVideoView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TXCVodVideoView tXCVodVideoView = this.a.get();
            if (tXCVodVideoView == null || tXCVodVideoView.ae == null) {
                return;
            }
            switch (message.what) {
                case 100:
                    IMediaPlayer unwrappedMediaPlayer = tXCVodVideoView.getUnwrappedMediaPlayer();
                    if (unwrappedMediaPlayer == null) {
                        return;
                    }
                    IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) unwrappedMediaPlayer;
                    float videoOutputFramesPerSecond = ijkMediaPlayer.getVideoOutputFramesPerSecond();
                    float videoDecodeFramesPerSecond = ijkMediaPlayer.getVideoDecodeFramesPerSecond();
                    long videoCachedBytes = ijkMediaPlayer.getVideoCachedBytes() + ijkMediaPlayer.getAudioCachedBytes();
                    long bitRate = ijkMediaPlayer.getBitRate();
                    long tcpSpeed = ijkMediaPlayer.getTcpSpeed();
                    Bundle bundle = new Bundle();
                    bundle.putFloat(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS, videoOutputFramesPerSecond);
                    bundle.putFloat("dps", videoDecodeFramesPerSecond);
                    bundle.putLong("cachedBytes", videoCachedBytes);
                    bundle.putLong("bitRate", bitRate);
                    bundle.putLong("tcpSpeed", tcpSpeed);
                    tXCVodVideoView.ae.a(bundle);
                    removeMessages(100);
                    sendEmptyMessageDelayed(100, 500L);
                    return;
                case 101:
                    tXCVodVideoView.ae.a(message.arg1, message.getData());
                    return;
                case 102:
                    tXCVodVideoView.g();
                    tXCVodVideoView.a(2103, "VOD network reconnected", "reconnect");
                    return;
                case 103:
                    long currentPosition = tXCVodVideoView.getCurrentPosition();
                    Bundle bundle2 = new Bundle();
                    long bufferDuration = tXCVodVideoView.getBufferDuration();
                    long duration = tXCVodVideoView.getDuration();
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (currentPosition / 1000));
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_DURATION, (int) (duration / 1000));
                    bundle2.putInt("EVT_PLAYABLE_DURATION", (int) (bufferDuration / 1000));
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) currentPosition);
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_DURATION_MS, (int) duration);
                    bundle2.putInt(TXLiveConstants.EVT_PLAYABLE_DURATION_MS, (int) bufferDuration);
                    tXCVodVideoView.ae.a(2005, bundle2);
                    if (tXCVodVideoView.m != null) {
                        removeMessages(103);
                        if (tXCVodVideoView.x.l <= 0) {
                            tXCVodVideoView.x.l = 500;
                        }
                        sendEmptyMessageDelayed(103, tXCVodVideoView.x.l);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2) {
        if ((i == -2304 || i == 2106) && this.ag) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        Bundle bundle = new Bundle();
        message.arg1 = i;
        bundle.putString("description", str);
        message.setData(bundle);
        if (this.af != null) {
            this.af.sendMessage(message);
        }
        if (i != 2018 && i != 2016) {
            String str3 = this.h;
            TXCLog.i(str3, "sendSimpleEvent " + i + StringUtil.SPACE + str2);
        }
        this.ag = i == -2304 || i == 2106;
    }

    public void setListener(e eVar) {
        this.ae = eVar;
    }

    public int getVideoWidth() {
        return this.n;
    }

    public int getVideoHeight() {
        return this.o;
    }

    public String getServerIp() {
        return this.B;
    }

    @NonNull
    String getUrlPathExtention() {
        if (this.i == null || this.i.getPath() == null) {
            return "";
        }
        String path = this.i.getPath();
        return path.substring(path.lastIndexOf(CommonConstant.Symbol.DOT) + 1, path.length());
    }

    public IMediaPlayer getUnwrappedMediaPlayer() {
        if (this.m instanceof TextureMediaPlayer) {
            return ((TextureMediaPlayer) this.m).getBackEndMediaPlayer();
        }
        return this.m;
    }

    public int getBitrateIndex() {
        if (this.m != null) {
            return this.m.getBitrateIndex();
        }
        return this.L;
    }

    public void setBitrateIndex(int i) {
        String str = this.h;
        TXCLog.i(str, "setBitrateIndex " + i);
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (this.m != null) {
            if (this.x.j) {
                this.m.setBitrateIndex(i);
            } else {
                g();
            }
        }
    }

    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        if (this.m != null) {
            return this.m.getSupportedBitrates();
        }
        return new ArrayList<>();
    }

    public MediaInfo getMediaInfo() {
        if (this.m == null) {
            return null;
        }
        return this.m.getMediaInfo();
    }
}
