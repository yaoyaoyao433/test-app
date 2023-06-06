package com.meituan.msi.api.component.video;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.msi.api.component.video.bean.VideoMetadata;
import com.meituan.msi.api.component.video.bean.VideoProgressEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d extends FrameLayout implements b, com.meituan.msi.view.e {
    public static ChangeQuickRedirect b;
    private MTVideoPlayerView a;
    boolean c;
    @SuppressLint({"HandlerLeak"})
    final Handler d;
    private VideoCoverView e;
    private MTVideoPlayerView.a f;
    private VideoPlayerParam g;
    private VideoParam h;
    private Context i;
    private String j;
    private a k;
    private com.meituan.msi.context.a l;

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a28b03e3fa8d33126485105cfb14da1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a28b03e3fa8d33126485105cfb14da1");
            return;
        }
        this.j = "";
        this.c = false;
        this.d = new Handler() { // from class: com.meituan.msi.api.component.video.d.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1a4f65cd70bc2b7912ba883596fc3db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1a4f65cd70bc2b7912ba883596fc3db");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 1 || d.this.a == null) {
                    return;
                }
                d.this.j();
                if (d.this.c) {
                    d.this.d.sendEmptyMessageDelayed(1, 250L);
                }
            }
        };
        this.i = context;
    }

    public d() {
        super(com.meituan.msi.a.f());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628261045e6a261e518fd39be31dc00e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628261045e6a261e518fd39be31dc00e");
            return;
        }
        this.j = "";
        this.c = false;
        this.d = new Handler() { // from class: com.meituan.msi.api.component.video.d.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1a4f65cd70bc2b7912ba883596fc3db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1a4f65cd70bc2b7912ba883596fc3db");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 1 || d.this.a == null) {
                    return;
                }
                d.this.j();
                if (d.this.c) {
                    d.this.d.sendEmptyMessageDelayed(1, 250L);
                }
            }
        };
        this.i = com.meituan.msi.a.f();
    }

    public void setIActivityContext(com.meituan.msi.context.a aVar) {
        this.l = aVar;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29ebb64000514c83381c7f62e7ac887", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29ebb64000514c83381c7f62e7ac887");
        }
        if (this.l == null) {
            return null;
        }
        return this.l.a();
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643297549718503521b2c520a7b1a7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643297549718503521b2c520a7b1a7d0");
            return;
        }
        this.a = new MTVideoPlayerView(this.i);
        setBackgroundColor(-16777216);
        this.a.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.meituan.msi.api.component.video.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3ac7fc50f685fb00746f316a970a1bb", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3ac7fc50f685fb00746f316a970a1bb")).booleanValue();
                }
                Log.e("mtplayer", "onLongClick: ");
                return false;
            }
        });
        this.f = MTVideoPlayerView.a.TYPE_TEXTURE;
        this.e = new VideoCoverView(getActivity() != null ? getActivity() : getContext());
        this.e.setVideoView(this);
        this.a.setCoverView(this.e);
        this.a.setDisplayMode(i);
        addView(this.a);
    }

    public VideoMetadata getMetaData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f43ea1ccc0a2738b74fc585b16cb650", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoMetadata) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f43ea1ccc0a2738b74fc585b16cb650");
        }
        VideoMetadata videoMetadata = new VideoMetadata();
        if (this.a != null) {
            Bitmap videoBitmap = this.a.getVideoBitmap();
            if (videoBitmap != null) {
                videoMetadata.height = videoBitmap.getHeight();
                videoMetadata.width = videoBitmap.getWidth();
            }
            videoMetadata.duration = this.a.getDuration() / 1000;
        }
        return videoMetadata;
    }

    public final void a(VideoParam videoParam) {
        Object[] objArr = {videoParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089a5969d86a182cc05446ac70f2cd8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089a5969d86a182cc05446ac70f2cd8e");
            return;
        }
        System.out.println("MsiVideo updateVideoParam ");
        if (this.a == null) {
            int a = videoParam != null ? a(videoParam.objectFit) : 0;
            PrintStream printStream = System.out;
            printStream.println("MsiVideo the displayMode is " + a);
            a(a);
        }
        if (this.a == null || this.e == null) {
            return;
        }
        if (videoParam != null && !TextUtils.isEmpty(videoParam.src) && !TextUtils.equals(this.j, videoParam.src)) {
            if (!TextUtils.isEmpty(this.j)) {
                PrintStream printStream2 = System.out;
                printStream2.println("MsiVideo reset video " + videoParam.src);
                this.a.f();
                this.e.a();
            }
            this.g = new VideoPlayerParam(videoParam.src);
            this.g.a(getContext(), "mycache");
            this.j = videoParam.src;
            this.a.setDataSource(this.g);
            this.a.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.meituan.msi.api.component.video.d.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i, int i2, int i3) {
                }

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e48b8c94a9e4b738326d29dcbf3b155a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e48b8c94a9e4b738326d29dcbf3b155a");
                    } else if (i != 7 || d.this.e == null) {
                    } else {
                        d.this.e.setVideoBottomImage(d.this.a.getVideoBitmap());
                    }
                }
            });
        }
        if (this.a != null && videoParam != null) {
            this.a.setLooping(videoParam.loop);
            this.a.setDisplayMode(a(videoParam.objectFit));
        }
        this.e.setParam(videoParam);
        if (videoParam != null) {
            if (TextUtils.equals(videoParam.operation, "play")) {
                a();
            } else if (TextUtils.equals(videoParam.operation, "pause")) {
                d();
            }
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db34bb854b825d811e0b11897804117f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db34bb854b825d811e0b11897804117f");
            return;
        }
        this.c = false;
        if (this.d != null) {
            this.d.removeCallbacksAndMessages(null);
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52486576aaaa547d6ec5898ce773936b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52486576aaaa547d6ec5898ce773936b");
            return;
        }
        if (this.e != null) {
            this.e.setPlayStateListener(aVar);
        }
        this.k = aVar;
    }

    public VideoParam getVideoParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943f101ef6a1c2e3ca23739c5ea3da42", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943f101ef6a1c2e3ca23739c5ea3da42");
        }
        if (this.h == null) {
            this.h = new VideoParam();
        }
        return this.h;
    }

    @Override // com.meituan.msi.api.component.video.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96cc36de6fd9841b227d190c278111ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96cc36de6fd9841b227d190c278111ed");
        } else if (this.e != null) {
            this.e.c();
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa0fde60a5ec297bd1d5bff5bf5adeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa0fde60a5ec297bd1d5bff5bf5adeb");
        } else if (this.a != null) {
            this.a.g();
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b67eec063e2f85b59475feadadb39a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b67eec063e2f85b59475feadadb39a")).intValue();
        }
        if ("fill".equals(str)) {
            return 5;
        }
        if (DynamicTitleParser.PARSER_VAL_STRETCH_COVER.equals(str)) {
            return 1;
        }
        return "contain".equals(str) ? 0 : 0;
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47bdca11618c6290c68be13503ae8875", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47bdca11618c6290c68be13503ae8875")).booleanValue();
        }
        if (this.e.d()) {
            this.e.e();
            return true;
        }
        return false;
    }

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1126cfc843c326f34e8dac854fc656d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1126cfc843c326f34e8dac854fc656d8");
        } else if (this.e != null) {
            VideoCoverView videoCoverView = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = VideoCoverView.a;
            if (PatchProxy.isSupport(objArr2, videoCoverView, changeQuickRedirect2, false, "d632a2ca471c29bdeae06995013fa8a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, videoCoverView, changeQuickRedirect2, false, "d632a2ca471c29bdeae06995013fa8a8");
            } else if (videoCoverView.b.e()) {
                videoCoverView.b.d();
                videoCoverView.c = true;
            }
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed00897236618be6a3254375716a91fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed00897236618be6a3254375716a91fa");
        } else if (this.e != null) {
            VideoCoverView videoCoverView = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = VideoCoverView.a;
            if (PatchProxy.isSupport(objArr2, videoCoverView, changeQuickRedirect2, false, "72b62d5294779d3938ec99a22cd5eacf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, videoCoverView, changeQuickRedirect2, false, "72b62d5294779d3938ec99a22cd5eacf");
                return;
            }
            if (videoCoverView.c) {
                videoCoverView.b.c();
            }
            videoCoverView.c = false;
        }
    }

    @Override // com.meituan.msi.api.component.video.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7005ce153a59cfb6da67beae0a458b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7005ce153a59cfb6da67beae0a458b6b");
        } else if (this.e != null) {
            VideoCoverView videoCoverView = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = VideoCoverView.a;
            if (PatchProxy.isSupport(objArr2, videoCoverView, changeQuickRedirect2, false, "633841739d5d65a8e58269a72d97b955", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, videoCoverView, changeQuickRedirect2, false, "633841739d5d65a8e58269a72d97b955");
                return;
            }
            videoCoverView.d = true;
            if (videoCoverView.b != null) {
                videoCoverView.b.d();
                videoCoverView.b.a(0);
            }
            videoCoverView.a();
        }
    }

    @Override // com.meituan.msi.api.component.video.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3377d94367db7d1ab2104b3f2298a1b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3377d94367db7d1ab2104b3f2298a1b6");
        } else if (this.e != null) {
            this.e.b();
        }
    }

    @Override // com.meituan.msi.api.component.video.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b88bc249b9a8043259aa377a7b31b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b88bc249b9a8043259aa377a7b31b56");
        } else if (this.e != null) {
            this.e.b(i);
        }
    }

    @Override // com.meituan.msi.api.component.video.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2aae003ef2084c11e03cd5663689b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2aae003ef2084c11e03cd5663689b6");
        } else if (this.e != null) {
            this.e.e();
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462c4275905200b3265b9ea5bcf33e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462c4275905200b3265b9ea5bcf33e79");
            return;
        }
        int currentPosition = this.a.getCurrentPosition();
        int duration = this.a.getDuration();
        if (duration <= 0) {
            return;
        }
        if (currentPosition > duration) {
            currentPosition = duration;
        }
        VideoProgressEvent videoProgressEvent = new VideoProgressEvent();
        videoProgressEvent.currentTime = (currentPosition * 1.0f) / duration;
        videoProgressEvent.duration = duration / 1000;
        if (this.k != null) {
            this.k.a(8, videoProgressEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b1e84e472212042be1f31d35cfe9592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b1e84e472212042be1f31d35cfe9592");
            return;
        }
        Activity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            h();
        }
        super.onDetachedFromWindow();
    }
}
