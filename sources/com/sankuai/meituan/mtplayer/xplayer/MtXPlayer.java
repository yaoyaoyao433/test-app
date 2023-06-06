package com.sankuai.meituan.mtplayer.xplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.huawei.hms.utils.FileUtil;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.shortvideocore.config.b;
import com.sankuai.meituan.xp.c;
import com.sankuai.meituan.xp.f;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MtXPlayer extends com.meituan.android.mtplayer.video.player.a {
    private static final String TAG = "MtXPlayer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isCompletion;
    private boolean isRenderStart;
    private boolean isStart;
    private final a mtXPlayerBackEndPlayer;
    private Surface surface;

    @Override // com.meituan.android.mtplayer.video.player.d
    public int getPlayerType() {
        return 2;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setAudioStreamType(int i) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException, IllegalArgumentException, IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.a
    public void setOption(int i, String str, String str2) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setScreenOnWhilePlaying(boolean z) {
    }

    @Deprecated
    public MtXPlayer() throws Exception {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64f3595eda74b1080b3b82c4b789fd1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64f3595eda74b1080b3b82c4b789fd1c");
        }
    }

    public MtXPlayer(Context context) throws Exception {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a310a69d666e6aa9ab0b4ded65205b02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a310a69d666e6aa9ab0b4ded65205b02");
        } else if (com.sankuai.meituan.mtplayer.a.a() != l.TYPE_XPLAYER) {
            throw new NullPointerException();
        } else {
            context = context == null ? b.a : context;
            f fVar = new f(context, null);
            this.mtXPlayerBackEndPlayer = new a(fVar);
            fVar.b = new c.a() { // from class: com.sankuai.meituan.mtplayer.xplayer.MtXPlayer.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.xp.c.a
                public final void a(int i, Bundle bundle) {
                    Object[] objArr2 = {Integer.valueOf(i), bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6f6669b3714f58a84024aaf74a3978c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6f6669b3714f58a84024aaf74a3978c");
                        return;
                    }
                    new StringBuilder("onPlayEvent: ").append(i);
                    if (1001 == i) {
                        if (!MtXPlayer.this.isStart) {
                            MtXPlayer.this.pause();
                        }
                        MtXPlayer.this.notifyOnPrepared();
                    } else if (1002 == i) {
                        MtXPlayer.this.notifyOnVideoSizeChanged(MtXPlayer.this.getVideoWidth(), MtXPlayer.this.getVideoHeight(), MtXPlayer.this.getVideoSarNum(), MtXPlayer.this.getVideoSarDen());
                    } else if (1003 != i) {
                        if (1004 == i) {
                            MtXPlayer.this.isCompletion = true;
                            MtXPlayer.this.notifyOnCompletion();
                        } else if (1005 == i) {
                            MtXPlayer.this.notifyOnError(bundle.getInt("what"), bundle.getInt("extra"));
                        } else if (i == 1101) {
                            MtXPlayer.this.notifyOnSeekComplete();
                        }
                    } else if (!MtXPlayer.this.isStart) {
                        MtXPlayer.this.pause();
                    } else {
                        int i2 = bundle.getInt("what");
                        int i3 = bundle.getInt("extra");
                        if (i2 == 3) {
                            MtXPlayer.this.isRenderStart = true;
                        }
                        if (i2 == 701) {
                            if (!MtXPlayer.this.isRenderStart || i3 == 1) {
                                return;
                            }
                            if (MtXPlayer.this.isCompletion) {
                                MtXPlayer.this.isCompletion = false;
                                return;
                            }
                        }
                        new StringBuilder("onPlayEvent: EVENT_ON_INFO ").append(i2);
                        MtXPlayer.this.notifyOnInfo(i2, i3);
                    }
                }
            };
            fVar.a(1, "probesize", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
            fVar.a(1, "analyzemaxduration", 2000000L);
            fVar.a(1, "analyzeduration", 1L);
            fVar.a(4, "enable-accurate-seek", 1L);
            com.sankuai.meituan.shortvideocore.config.a a = com.sankuai.meituan.shortvideocore.config.a.a(context);
            if (a.a()) {
                fVar.a(4, "max-buffer-size", a.i);
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5e2fed4388bf9329a4685d2627587ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5e2fed4388bf9329a4685d2627587ff");
        } else if (surfaceHolder != null) {
            this.surface = surfaceHolder.getSurface();
            this.mtXPlayerBackEndPlayer.a(surfaceHolder.getSurface());
        } else {
            this.mtXPlayerBackEndPlayer.a((Surface) null);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setSurface(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c559c9406c45612d527829aab948642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c559c9406c45612d527829aab948642");
            return;
        }
        this.surface = surface;
        this.mtXPlayerBackEndPlayer.a(surface);
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setDataSource(final String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aa239da8bf119259c35b50c873f629f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aa239da8bf119259c35b50c873f629f");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "261d346024fdd0162815eef1ea462918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "261d346024fdd0162815eef1ea462918");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "12762b680c2a4273ab5e28d86cb4bf91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "12762b680c2a4273ab5e28d86cb4bf91");
                        return;
                    }
                    try {
                        aVar.b(str);
                    } catch (Exception unused) {
                    }
                }
            });
        }
        new StringBuilder("setDataSource: ").append(str);
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void prepareAsync() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baf5d3654c8f96a220e33c79d4dc380c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baf5d3654c8f96a220e33c79d4dc380c");
            return;
        }
        this.isStart = false;
        this.mtXPlayerBackEndPlayer.a(com.sankuai.meituan.shortvideocore.statistics.a.h);
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "ea19f50ceb769c15d6f53965e1aabf68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "ea19f50ceb769c15d6f53965e1aabf68");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "52ad1d6f4ddbebc8e43a9fc987d66ab4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "52ad1d6f4ddbebc8e43a9fc987d66ab4");
                    } else {
                        aVar.b();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void start() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1385eac4167d75a611999e352f33797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1385eac4167d75a611999e352f33797");
            return;
        }
        this.isStart = true;
        this.mtXPlayerBackEndPlayer.a(com.sankuai.meituan.shortvideocore.statistics.a.h);
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "4afe909a4ee766844d0fcc5ff03cda53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "4afe909a4ee766844d0fcc5ff03cda53");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c41efe2d85e9fd2131271fd4c7ece6e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c41efe2d85e9fd2131271fd4c7ece6e1");
                    } else {
                        aVar.a();
                    }
                }
            });
        }
    }

    public void stop() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb4ed7d019c17f79a8f292b0acf21fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb4ed7d019c17f79a8f292b0acf21fac");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "67f3d999d5d65fb8557de50b3990e001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "67f3d999d5d65fb8557de50b3990e001");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "27422af5a2637b0561aa83be8e83aad0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "27422af5a2637b0561aa83be8e83aad0");
                    } else {
                        aVar.d();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void pause() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97b30ee506854959f17a07b211a452fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97b30ee506854959f17a07b211a452fa");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "7689789e87e2321c9ce27368213d9191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "7689789e87e2321c9ce27368213d9191");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b083926224d6585c9da0874538e1bf64", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b083926224d6585c9da0874538e1bf64");
                    } else {
                        aVar.c();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public int getVideoWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5beb747156960be670f919ee70386ec0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5beb747156960be670f919ee70386ec0")).intValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "36d03c370d424820fe77976af679855e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "36d03c370d424820fe77976af679855e")).intValue() : aVar.c.e;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public int getVideoHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d837a515ef901963fd784b316a6d093", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d837a515ef901963fd784b316a6d093")).intValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "0ab52ee43d1ff37294c6c2e3fca8334d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "0ab52ee43d1ff37294c6c2e3fca8334d")).intValue() : aVar.c.f;
    }

    public int getVideoSarNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccb4a1d79daa1f72a9b5c56a6b43c7a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccb4a1d79daa1f72a9b5c56a6b43c7a3")).intValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "01f415abeb939e789c07a69f00d2bad4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "01f415abeb939e789c07a69f00d2bad4")).intValue() : aVar.c.g;
    }

    public int getVideoSarDen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d076bd1a3c232b7798ccc80debc7ac2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d076bd1a3c232b7798ccc80debc7ac2")).intValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "a04d01f5cd47f73bb4b65d1367d069c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "a04d01f5cd47f73bb4b65d1367d069c7")).intValue() : aVar.c.h;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public boolean isPlaying() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0434b9cb9a0d619975b43ede1e3d90cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0434b9cb9a0d619975b43ede1e3d90cd")).booleanValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "4570c3d5ea1e19266cd89c53d3969fba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "4570c3d5ea1e19266cd89c53d3969fba")).booleanValue();
        }
        f fVar = aVar.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.xp.a.a;
        return PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "6802b3cae1dc3e73f716e1a01f1c515d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "6802b3cae1dc3e73f716e1a01f1c515d")).booleanValue() : fVar.c._isPlaying();
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void seekTo(int i) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3600aa08a2b54865a88a239803e03def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3600aa08a2b54865a88a239803e03def");
        } else {
            this.mtXPlayerBackEndPlayer.a(i);
        }
    }

    public void seekTo(long j) throws IllegalStateException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f82dca2be5228c45dabc4db5a9096475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f82dca2be5228c45dabc4db5a9096475");
        } else {
            this.mtXPlayerBackEndPlayer.a(j);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public long getCurrentPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f7998b9f905fc8e73d019ca7b677bd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f7998b9f905fc8e73d019ca7b677bd0")).longValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        long longValue = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "fe9e5b7472136174f1e02cc2617246a7", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "fe9e5b7472136174f1e02cc2617246a7")).longValue() : aVar.c.j();
        long duration = getDuration();
        return longValue > duration ? duration : longValue;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public long getDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04ea895eaf922db75bd7a8d0c05d141", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04ea895eaf922db75bd7a8d0c05d141")).longValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "d303d4160f009bd38231fdc0e91c5227", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "d303d4160f009bd38231fdc0e91c5227")).longValue() : aVar.c.k();
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "346e97daf0683df18a7fb963f394e058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "346e97daf0683df18a7fb963f394e058");
            return;
        }
        this.isStart = false;
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "e23de4e3685953d3b4178c262c20fa8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "e23de4e3685953d3b4178c262c20fa8c");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c58c6b2b3aaefea0d2882cac95cfd031", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c58c6b2b3aaefea0d2882cac95cfd031");
                        return;
                    }
                    aVar.f();
                    a aVar2 = aVar;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect5, false, "3bd5e98952a8c67c941a0e45cb6de859", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect5, false, "3bd5e98952a8c67c941a0e45cb6de859");
                    } else {
                        aVar2.b.shutdown();
                    }
                }
            });
        }
        com.sankuai.meituan.shortvideocore.statistics.a.h = null;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61e91463d5afe9ffce6c1a556bc918fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61e91463d5afe9ffce6c1a556bc918fb");
            return;
        }
        this.isCompletion = false;
        this.isRenderStart = false;
        this.isStart = false;
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "0286f611decfdbb61a6faabd36f3a4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "0286f611decfdbb61a6faabd36f3a4da");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "831514db35b8d21000b5837d74140afc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "831514db35b8d21000b5837d74140afc");
                    } else {
                        aVar.e();
                    }
                }
            });
        }
        setSurface(this.surface);
    }

    public boolean isLooping() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d8c25e4a258b5271a72f4fbc49e65ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d8c25e4a258b5271a72f4fbc49e65ff")).booleanValue();
        }
        a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "2fda5bd40e08650a33013d794447126c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "2fda5bd40e08650a33013d794447126c")).booleanValue();
        }
        f fVar = aVar.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = f.p;
        return PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "51771020cc270ebbb68abed6247fdd30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "51771020cc270ebbb68abed6247fdd30")).booleanValue() : fVar.q._getLoopCount() != 1;
    }

    public void setLooping(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8707632f96359a9151747cc3fb252fca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8707632f96359a9151747cc3fb252fca");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "7b936614fba3b3c6c0987ab738362046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "7b936614fba3b3c6c0987ab738362046");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5bc70307ff49d99f1d04fd71506f33a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5bc70307ff49d99f1d04fd71506f33a7");
                        return;
                    }
                    f fVar = aVar.c;
                    boolean z2 = z;
                    Object[] objArr4 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect5 = f.p;
                    if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect5, false, "f019f9d2414bbe950015d1ae63be117d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect5, false, "f019f9d2414bbe950015d1ae63be117d");
                        return;
                    }
                    fVar.c("setLooping: isLooping:" + z2);
                    fVar.q._setLoopCount(!z2 ? 1 : 0);
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setVolume(final float f, final float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a024127d84990eccce09b1774339019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a024127d84990eccce09b1774339019");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "afa291f31ddcbb4ce6bca04814655eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "afa291f31ddcbb4ce6bca04814655eea");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "01ecce2cb4439a402a4507e8e1a9d5b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "01ecce2cb4439a402a4507e8e1a9d5b5");
                    } else {
                        aVar.a(f, f2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setPlayerSpeed(final float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c7a7c499a947d3c7eb3ee2d1c3fe56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c7a7c499a947d3c7eb3ee2d1c3fe56");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "cca7103da861512403404f2c6b429987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "cca7103da861512403404f2c6b429987");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6faaf9885a8182e1e116db45fe5b2847", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6faaf9885a8182e1e116db45fe5b2847");
                        return;
                    }
                    f fVar = aVar.c;
                    float f2 = f;
                    Object[] objArr4 = {Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.xp.a.a;
                    if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect5, false, "62dee20975c85b7a9fedade2a85e0caf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect5, false, "62dee20975c85b7a9fedade2a85e0caf");
                    } else {
                        fVar.c._setSpeed(f2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.a, com.meituan.android.mtplayer.video.player.d
    public void setOption(final int i, final String str, final long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9fd0b0994a24f0dbafd8e1b6f021617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9fd0b0994a24f0dbafd8e1b6f021617");
            return;
        }
        final a aVar = this.mtXPlayerBackEndPlayer;
        Object[] objArr2 = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "83d1c90493969d034219aaa88d6f5366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "83d1c90493969d034219aaa88d6f5366");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2d83ef2001f73eb1a65bd23c891535d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2d83ef2001f73eb1a65bd23c891535d7");
                    } else {
                        aVar.c.a(i, str, j);
                    }
                }
            });
        }
    }
}
