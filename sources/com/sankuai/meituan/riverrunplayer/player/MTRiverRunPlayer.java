package com.sankuai.meituan.riverrunplayer.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.meituan.mtlive.player.library.a;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.riverrunplayer.player.c;
import com.sankuai.meituan.riverrunplayer.player.h;
import com.sankuai.meituan.riverrunplayer.views.TextureRenderView;
import com.tencent.avroom.TXCAVRoomConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTRiverRunPlayer implements com.sankuai.meituan.mtlive.player.library.a {
    public static ChangeQuickRedirect a;
    public g b;
    private Context c;
    private com.sankuai.meituan.mtlive.player.library.b d;

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(a.b bVar) {
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(com.sankuai.meituan.mtlive.player.library.d dVar) {
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a14f67983a601d3ad2c97db5b4e4d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a14f67983a601d3ad2c97db5b4e4d15");
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final boolean c(boolean z) {
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d(int i) {
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b43323eaa8833ab8d8b081f51a7c7df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b43323eaa8833ab8d8b081f51a7c7df");
        }
    }

    public static /* synthetic */ void a(MTRiverRunPlayer mTRiverRunPlayer, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTRiverRunPlayer, changeQuickRedirect, false, "d76ba842b979f64cdebc979c664bbfad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTRiverRunPlayer, changeQuickRedirect, false, "d76ba842b979f64cdebc979c664bbfad");
        } else if (mTRiverRunPlayer.d != null) {
            mTRiverRunPlayer.d.a(i, bundle);
        }
    }

    public MTRiverRunPlayer(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00242109c3ef35c0aa5d5dd3aeb6c24a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00242109c3ef35c0aa5d5dd3aeb6c24a");
            return;
        }
        this.c = context;
        this.b = new g(context, i);
        h.a aVar = new h.a();
        Object[] objArr2 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = h.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ec66efdbc874a8de689a7aeb2b8e5170", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (h.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ec66efdbc874a8de689a7aeb2b8e5170");
        } else {
            aVar.b.b = false;
        }
        Object[] objArr3 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = h.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "59a78530cff0a6b23bf98beb7bfdfebf", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (h.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "59a78530cff0a6b23bf98beb7bfdfebf");
        } else {
            aVar.b.c = true;
        }
        h hVar = aVar.b;
        g gVar = this.b;
        Object[] objArr4 = {hVar};
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "93ccb81e373407ab6409e3ada6e10060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "93ccb81e373407ab6409e3ada6e10060");
        } else {
            if (hVar != null) {
                gVar.f = hVar;
            }
            gVar.n = gVar.f.d;
        }
        this.b.a(0);
        this.b.g = new c.d() { // from class: com.sankuai.meituan.riverrunplayer.player.MTRiverRunPlayer.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.sankuai.meituan.riverrunplayer.player.c.d
            public final void a(int i2) {
                Object[] objArr5 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ccc7276a0abbf6741dc468b7dec9504b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ccc7276a0abbf6741dc468b7dec9504b");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("EVT_TIME", System.currentTimeMillis());
                com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
                bVar.d = c.f.PLAY;
                bVar.e = c.g.RIVER_RUN;
                bVar.f = true;
                Context context2 = MTRiverRunPlayer.this.c;
                com.sankuai.meituan.mtliveqos.c.a(context2, bVar, "MTRiverrunPlayer_Event", "onPlayStateChange: " + i2);
                if (i2 == -1) {
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, -2301);
                    bundle.putString("EVT_MSG", "网络断连，且经多次重连抢救无效，更多重试请自行重启推流");
                    MTRiverRunPlayer.a(MTRiverRunPlayer.this, -2301, bundle);
                    return;
                }
                switch (i2) {
                    case 2:
                        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2001);
                        bundle.putString("EVT_MSG", "已经连接服务器");
                        MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2001, bundle);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(TXCAVRoomConstants.EVT_ID, 2002);
                        bundle2.putString("EVT_MSG", "已经连接服务器");
                        MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2002, bundle2);
                        return;
                    case 3:
                        break;
                    default:
                        switch (i2) {
                            case 6:
                                bundle.putInt(TXCAVRoomConstants.EVT_ID, 2007);
                                bundle.putString("EVT_MSG", "播放器进入缓冲");
                                MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2007, bundle);
                                return;
                            case 7:
                                break;
                            case 8:
                                bundle.putInt(TXCAVRoomConstants.EVT_ID, 2006);
                                bundle.putString("EVT_MSG", "视频播放结束");
                                MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2006, bundle);
                                return;
                            case 9:
                                bundle.putInt(TXCAVRoomConstants.EVT_ID, 2103);
                                bundle.putString("EVT_MSG", "网络断连, 已启动自动重连");
                                MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2103, bundle);
                                return;
                            default:
                                switch (i2) {
                                    case 1002:
                                        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2003);
                                        bundle.putString("EVT_MSG", "收到第一个I帧");
                                        MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2003, bundle);
                                        return;
                                    case 1003:
                                        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2108);
                                        bundle.putString("EVT_MSG", "第一个I帧硬解失败，已自动切换到软解");
                                        MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2108, bundle);
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
                bundle.putInt(TXCAVRoomConstants.EVT_ID, 2004);
                bundle.putString("EVT_MSG", "视频播放开始");
                MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2004, bundle);
            }

            @Override // com.sankuai.meituan.riverrunplayer.player.c.d
            public final void a(int i2, Bundle bundle) {
                Object[] objArr5 = {Integer.valueOf(i2), bundle};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a6033180ccdf54fe4b5145f8b624f2c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a6033180ccdf54fe4b5145f8b624f2c7");
                } else if (i2 == 14) {
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, 2009);
                    MTRiverRunPlayer.a(MTRiverRunPlayer.this, 2009, bundle);
                }
            }
        };
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(com.sankuai.meituan.mtlive.player.library.b bVar) {
        this.d = bVar;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(com.sankuai.meituan.mtlive.player.library.view.a aVar) {
        final boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cd0718c8f73a73fae96224699fbf81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cd0718c8f73a73fae96224699fbf81");
        } else if (aVar == null) {
        } else {
            com.sankuai.meituan.riverrunplayer.views.b bVar = new com.sankuai.meituan.riverrunplayer.views.b(this.c);
            aVar.addView(bVar, new FrameLayout.LayoutParams(-2, -2, 17));
            if (k.a().b()) {
                TextView textView = new TextView(this.c);
                textView.setText("自研");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
                layoutParams.gravity = 53;
                aVar.addView(textView, layoutParams);
            }
            final g gVar = this.b;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "b396f3199b7c7b5002e6e4d958e70c18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "b396f3199b7c7b5002e6e4d958e70c18");
                return;
            }
            z = (gVar.d == null || gVar.d == bVar) ? false : false;
            gVar.b("setPlayerView: currentPlayerView: " + gVar.d + " , newPlayerView: " + bVar + ",isViewChanged:" + z);
            gVar.d = bVar;
            bVar.setRenderCallback(new TextureRenderView.a() { // from class: com.sankuai.meituan.riverrunplayer.player.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.riverrunplayer.views.TextureRenderView.a
                public final void a(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
                    Object[] objArr3 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa57b35a4f53852c1e3b23c7c7a152e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa57b35a4f53852c1e3b23c7c7a152e4");
                        return;
                    }
                    b bVar2 = gVar;
                    bVar2.b("onSurfaceCreated surfaceTexture: " + surfaceTexture + ", width: " + i + " , height: " + i2 + ":isPlaying " + gVar.h());
                    if (z || !gVar.f.c || gVar.m == null) {
                        gVar.m = surfaceTexture;
                        gVar.a(surfaceTexture);
                        return;
                    }
                    b.e(gVar);
                }

                @Override // com.sankuai.meituan.riverrunplayer.views.TextureRenderView.a
                public final void a(@NonNull SurfaceTexture surfaceTexture, int i, int i2, int i3) {
                    Object[] objArr3 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84abcad55665e9c8603e6abb3fc2f7ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84abcad55665e9c8603e6abb3fc2f7ad");
                        return;
                    }
                    b bVar2 = gVar;
                    bVar2.b("onSurfaceChanged surfaceTexture: " + surfaceTexture + " format: " + i + ", width: " + i2 + " , height: " + i3);
                    gVar.m = surfaceTexture;
                }

                @Override // com.sankuai.meituan.riverrunplayer.views.TextureRenderView.a
                public final boolean a(@NonNull SurfaceTexture surfaceTexture) {
                    Object[] objArr3 = {surfaceTexture};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4719b13e8a7416f88eeee625d705195f", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4719b13e8a7416f88eeee625d705195f")).booleanValue();
                    }
                    boolean z2 = gVar.f.c;
                    b bVar2 = gVar;
                    bVar2.b("onSurfaceDestroyed surfaceTexture: " + surfaceTexture + " , isUsingInFloatWindow: " + z2);
                    gVar.m = surfaceTexture;
                    return !z2;
                }
            });
            if (!z || gVar.i == 0 || gVar.j == 0 || gVar.d == null) {
                return;
            }
            gVar.d.getRenderView().setAspectRatio(gVar.p);
            gVar.d.getRenderView().a(gVar.i, gVar.j);
            gVar.d.getRenderView().b(gVar.k, gVar.l);
            gVar.d.requestLayout();
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982ea5ccb3c2506a98babc9b087ca7d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982ea5ccb3c2506a98babc9b087ca7d6")).intValue();
        }
        com.sankuai.meituan.riverrunplayer.util.a.a(str);
        return this.b.a(str, 0) ? 0 : -1;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1dd616e58c5a9518f7d21c1b443efd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1dd616e58c5a9518f7d21c1b443efd9")).intValue();
        }
        this.b.c();
        return 0;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e7f1102de08830a5561afa0eabd516", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e7f1102de08830a5561afa0eabd516")).intValue();
        }
        this.b.c();
        return 0;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f2f2624314450c51f10ad462708b27", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f2f2624314450c51f10ad462708b27")).booleanValue() : this.b.h();
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d0e7598eb75a8d1b736772e6c8ecdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d0e7598eb75a8d1b736772e6c8ecdc");
        } else {
            this.b.e();
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6100be0e9731ed634d5dfc3aa6b6f8d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6100be0e9731ed634d5dfc3aa6b6f8d2");
        } else {
            this.b.g();
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e474c7d47f041e64e32fff7caedb4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e474c7d47f041e64e32fff7caedb4b");
        } else {
            this.b.a(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3013de0418a4b75366ed80dfcc6d03f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3013de0418a4b75366ed80dfcc6d03f6");
            return;
        }
        g gVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "a5dc86cffd997e4294ed7862a3b7678f", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "a5dc86cffd997e4294ed7862a3b7678f")).booleanValue();
            return;
        }
        gVar.b("setRenderRotation: " + i);
        if (gVar.d == null || i < 0) {
            gVar.b("unable to setRenderMode when playerView is null");
        } else {
            gVar.d.getRenderView().setRotation(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57744e841b6477e9a41c136b4d186e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57744e841b6477e9a41c136b4d186e06");
            return;
        }
        g gVar = this.b;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = g.q;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "b3bf885896a0d70af338a0693829a743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "b3bf885896a0d70af338a0693829a743");
            return;
        }
        gVar.b("setMute:" + z);
        gVar.r = z;
        if (gVar.c == null || !gVar.c.a()) {
            return;
        }
        gVar.a(gVar.r ? 0.0f : gVar.b);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9ff130a6921107d162631abe8a453d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9ff130a6921107d162631abe8a453d");
            return;
        }
        g gVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "1bff7d230594065e29952f4736d658f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "1bff7d230594065e29952f4736d658f3");
            return;
        }
        gVar.b("setAudioRoute: " + i);
        if (i == 0) {
            gVar.e.setMode(0);
            gVar.e.setSpeakerphoneOn(true);
        } else if (1 == i) {
            gVar.e.setSpeakerphoneOn(false);
            if (Build.VERSION.SDK_INT >= 11) {
                gVar.e.setMode(3);
            } else {
                gVar.e.setMode(2);
            }
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(a.c cVar) {
        Bitmap bitmap;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff09e3b5775c11072585bb464e3fbdcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff09e3b5775c11072585bb464e3fbdcf");
            return;
        }
        g gVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "86cf6b4150543c8bb1457481d832da44", RobustBitConfig.DEFAULT_VALUE)) {
            bitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "86cf6b4150543c8bb1457481d832da44");
        } else {
            bitmap = gVar.d == null ? null : gVar.d.getRenderView().getBitmap();
        }
        if (cVar != null) {
            cVar.a(bitmap);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b84a1b061795a8626fe42841532c166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b84a1b061795a8626fe42841532c166");
        } else {
            this.b.i();
        }
    }
}
