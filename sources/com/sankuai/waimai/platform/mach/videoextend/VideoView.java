package com.sankuai.waimai.platform.mach.videoextend;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.log.i;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class VideoView extends FrameLayout {
    public static ChangeQuickRedirect a;
    boolean b;
    public BroadcastReceiver c;
    private MTVideoPlayerView d;
    private VideoCoverView e;
    private VideoPlayerParam f;
    private b g;
    private boolean h;
    private Context i;
    private boolean j;
    private String k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private c p;
    private List<Integer> q;
    private String r;
    private Handler s;
    private int t;
    private boolean u;
    private String v;
    private com.sankuai.waimai.mach.widget.d w;
    private Path x;
    private RectF y;
    private m.b z;

    public static /* synthetic */ int a(VideoView videoView, int i) {
        videoView.m = 1;
        return 1;
    }

    public static /* synthetic */ void a(VideoView videoView, int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, videoView, changeQuickRedirect, false, "f52ec9267a80c31029463d8a6d450f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoView, changeQuickRedirect, false, "f52ec9267a80c31029463d8a6d450f28");
        } else if (f.a(videoView.i)) {
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, videoView.i.getResources().getString(R.string.wm_page_home_dynmic_layout_flexbox_video_cmd), j);
        }
    }

    public static /* synthetic */ boolean b(VideoView videoView, boolean z) {
        videoView.b = false;
        return false;
    }

    public static /* synthetic */ boolean c(VideoView videoView, boolean z) {
        videoView.o = true;
        return true;
    }

    public static /* synthetic */ boolean d(VideoView videoView, boolean z) {
        videoView.u = true;
        return true;
    }

    public static /* synthetic */ int l(VideoView videoView) {
        int i = videoView.t;
        videoView.t = i + 1;
        return i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends Handler {
        private final WeakReference<VideoView> a;

        public a(VideoView videoView) {
            this.a = new WeakReference<>(videoView);
        }
    }

    public VideoView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7444f19d696425f141e5b08a5313e693", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7444f19d696425f141e5b08a5313e693");
        }
    }

    private VideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b48521b9f5e612260a1bdd911ad66b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b48521b9f5e612260a1bdd911ad66b7");
        }
    }

    public VideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b103b1250f6c74c78c48da95358916", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b103b1250f6c74c78c48da95358916");
            return;
        }
        this.h = false;
        this.j = false;
        this.m = 1;
        this.b = false;
        this.o = false;
        this.r = "";
        this.s = new a(this);
        this.v = VideoView.class.getSimpleName();
        this.z = new m.b() { // from class: com.sankuai.waimai.platform.mach.videoextend.VideoView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a319a2161bd1115433486c0588cfd4df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a319a2161bd1115433486c0588cfd4df");
                    return;
                }
                VideoView.this.h = true;
                if (VideoView.this.j) {
                    VideoView.this.b();
                }
                if (VideoView.this.g == null || !VideoView.this.g.a()) {
                    return;
                }
                VideoView.a(VideoView.this, 17900, VideoView.this.n);
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54f5b2d978a3e236b698a65bab6f8282", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54f5b2d978a3e236b698a65bab6f8282");
                    return;
                }
                VideoView.this.h = false;
                if (VideoView.this.g == null || !VideoView.this.g.a()) {
                    return;
                }
                VideoView.a(VideoView.this, 17901, VideoView.this.n);
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2de6f3a59940179330ebf2a95aa02523", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2de6f3a59940179330ebf2a95aa02523");
                    return;
                }
                VideoView.this.h = false;
                if (VideoView.this.g == null || !VideoView.this.g.a()) {
                    return;
                }
                VideoView.a(VideoView.this, 17901, VideoView.this.n);
                i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("home_video").b("video_load_error").b(true).c(exc.getMessage()).b());
            }
        };
        this.c = new BroadcastReceiver() { // from class: com.sankuai.waimai.platform.mach.videoextend.VideoView.2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da6597b2b1282e187864ecf68df7760a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da6597b2b1282e187864ecf68df7760a");
                } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || VideoView.this.i == null || !p.a(VideoView.this.i) || VideoView.this.h) {
                } else {
                    VideoView.this.f.a(VideoView.this.z);
                }
            }
        };
        this.i = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2899b3d155241ab1bc0bc2ece7929aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2899b3d155241ab1bc0bc2ece7929aac");
        } else if (this.i != null) {
            setWillNotDraw(false);
            this.d = new MTVideoPlayerView(this.i);
            this.e = new VideoCoverView(this.i);
            addView(this.d);
        }
    }

    public void setData(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea0a4f37fa1eeb2332092508960c8db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea0a4f37fa1eeb2332092508960c8db");
            return;
        }
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7258ad1233467d7dd353c1315ab5e064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7258ad1233467d7dd353c1315ab5e064");
        } else if (bVar == null || this.i == null) {
        } else {
            if (a() && TextUtils.equals(this.r, bVar.d)) {
                return;
            }
            this.q = bVar.j;
            this.g = bVar;
            this.r = bVar.d;
            this.k = p.b(this.i);
            this.e.setPlayPositionVisibility(bVar.k ? 0 : 8);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19b12324e59bdeddb96136ca04f98808", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19b12324e59bdeddb96136ca04f98808");
            } else if (this.g == null || this.e == null) {
            } else {
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = this.i;
                c.j = R.drawable.wm_page_bg_bid_banner_item_place_holder_without_title;
                c.i = R.drawable.wm_page_bg_bid_banner_item_place_holder_without_title;
                c.e = 1;
                c.c = this.g.e;
                c.a(this.e.getVideoBottomImage());
                this.f = new VideoPlayerParam(this.g.d);
                this.f.a("video-cache", new d.a(this.i).a(10).a());
                d();
                this.d.setDataSource(this.f);
                this.d.setLooping(!a());
                this.h = false;
                if (com.sankuai.waimai.platform.utils.d.b(this.i, "develop_cpm_video_volume", false)) {
                    this.d.a(1.0f, 1.0f);
                } else {
                    this.d.a(0.0f, 0.0f);
                }
                this.n = SystemClock.elapsedRealtime();
                this.f.a(this.z);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "42b9ceed125b67d13d34de7e504bf7c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "42b9ceed125b67d13d34de7e504bf7c4");
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    if (this.i != null) {
                        this.i.registerReceiver(this.c, intentFilter);
                    }
                }
                this.d.setDisplayMode(1);
                this.d.setDisplayView(MTVideoPlayerView.a.TYPE_TEXTURE);
                this.d.setCoverView(this.e);
                this.d.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.sankuai.waimai.platform.mach.videoextend.VideoView.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                    public final void a(int i) {
                        Object[] objArr5 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fc77110b18b999264bf38ebc84584801", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fc77110b18b999264bf38ebc84584801");
                        } else if (i == -1) {
                            VideoView.b(VideoView.this, false);
                            VideoView.a(VideoView.this, 1);
                        } else if (i != 7) {
                        } else {
                            VideoView.c(VideoView.this, true);
                            if (VideoView.this.u || !VideoView.this.a()) {
                                return;
                            }
                            VideoView.d(VideoView.this, true);
                            VideoView.this.a("platinum_video_end", (Map<String, Object>) null);
                            if (VideoView.this.s != null) {
                                VideoView.this.s.postDelayed(new Runnable() { // from class: com.sankuai.waimai.platform.mach.videoextend.VideoView.3.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "12676c8cb0e9f0ce67dd7e86cd10b154", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "12676c8cb0e9f0ce67dd7e86cd10b154");
                                            return;
                                        }
                                        VideoView.b(VideoView.this, false);
                                        VideoView.this.b();
                                    }
                                }, VideoView.this.g.i * 1000);
                            }
                        }
                    }

                    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                    public final void a(int i, int i2, int i3) {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0d0db6c5b025e096a8abbe97dc67d26b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0d0db6c5b025e096a8abbe97dc67d26b");
                        } else if (VideoView.this.a()) {
                            int i4 = (i + 500) / 1000;
                            if (VideoView.this.t < VideoView.this.q.size()) {
                                int intValue = ((Integer) VideoView.this.q.get(VideoView.this.t)).intValue();
                                if ((intValue >= 0 ? intValue : (i2 / 1000) + intValue) == i4) {
                                    VideoView.l(VideoView.this);
                                    VideoView videoView = VideoView.this;
                                    Integer valueOf = Integer.valueOf(intValue);
                                    Object[] objArr6 = {"platinum_video_time_point_event", "time", valueOf};
                                    ChangeQuickRedirect changeQuickRedirect6 = VideoView.a;
                                    if (PatchProxy.isSupport(objArr6, videoView, changeQuickRedirect6, false, "fc4f5c3a7cb4c83650ec2011a1e6e61d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, videoView, changeQuickRedirect6, false, "fc4f5c3a7cb4c83650ec2011a1e6e61d");
                                        return;
                                    }
                                    ArrayMap arrayMap = new ArrayMap();
                                    arrayMap.put("time", valueOf);
                                    videoView.a("platinum_video_time_point_event", arrayMap);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc5f53dc20f7d963039724b981681d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc5f53dc20f7d963039724b981681d9")).booleanValue() : !com.sankuai.waimai.foundation.utils.d.a(this.q);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "630bf233b91aa228b948a1ee119b31bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "630bf233b91aa228b948a1ee119b31bf");
            return;
        }
        this.j = true;
        if (this.d == null || this.b) {
            return;
        }
        if (this.h) {
            this.b = true;
            this.o = false;
            this.d.a(0);
            this.m = 0;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55cceeea5fbf56fe042ebd1a9c523a83", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55cceeea5fbf56fe042ebd1a9c523a83");
            } else if (a()) {
                this.u = false;
                this.t = 0;
                a("platinum_video_start", (Map<String, Object>) null);
            }
            this.d.c();
            return;
        }
        this.f.a(this.z);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b55d510577feada5b115cb7fce18333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b55d510577feada5b115cb7fce18333");
            return;
        }
        this.j = false;
        if (this.d == null || !this.b) {
            return;
        }
        this.b = false;
        this.d.d();
        if (this.s != null) {
            this.s.removeCallbacksAndMessages(null);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8406a47be0763383bef50844312cc472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8406a47be0763383bef50844312cc472");
        } else if (this.d != null) {
            this.b = false;
            this.d.f();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052acf0c5abf5c0c64d7ab6567b83b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052acf0c5abf5c0c64d7ab6567b83b4b");
            return;
        }
        if (this.d != null) {
            this.d.g();
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb95c567aa8f01dad1c64abf347dda71", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb95c567aa8f01dad1c64abf347dda71");
            } else if (this.i != null) {
                this.i.unregisterReceiver(this.c);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e(this.v, e.toString(), new Object[0]);
        }
        if (this.s != null) {
            this.s.removeCallbacksAndMessages(null);
        }
    }

    private void setVideoPlayTime(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2490891b8415e06f4a43f40e9f81b118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2490891b8415e06f4a43f40e9f81b118");
            return;
        }
        if (this.o) {
            i = getDuration();
        }
        this.l = i;
    }

    public int getVideoPlayTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a79dd3d273b84cf98b4f5672dc62b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a79dd3d273b84cf98b4f5672dc62b3")).intValue();
        }
        setVideoPlayTime(getCurrentPosition());
        return this.l;
    }

    public int getLoadNetState() {
        char c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d1d8ec1260b3edbaf2c3c8ccaca468", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d1d8ec1260b3edbaf2c3c8ccaca468")).intValue();
        }
        String str = this.k;
        int hashCode = str.hashCode();
        if (hashCode == 1621) {
            if (str.equals("2G")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 1652) {
            if (str.equals("3G")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1683) {
            if (hashCode == 2694997 && str.equals("WiFi")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("4G")) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return -1;
        }
    }

    public int getVideoPlayStatus() {
        return this.m;
    }

    public int getDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec2d48ecebdef8ad20f66034c10dc61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec2d48ecebdef8ad20f66034c10dc61")).intValue();
        }
        if (this.d != null) {
            return (this.d.getDuration() + 500) / 1000;
        }
        return 0;
    }

    private int getCurrentPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16789ed27490212522ff1ee8c7b47610", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16789ed27490212522ff1ee8c7b47610")).intValue();
        }
        if (this.d != null) {
            return (this.d.getCurrentPosition() + 500) / 1000;
        }
        return 0;
    }

    public void setJsCallBack(c cVar) {
        this.p = cVar;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a57a2ca3cd926e958ce8a15b839e6bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a57a2ca3cd926e958ce8a15b839e6bb");
        } else if (this.p != null) {
            this.p.a(str, map);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799bd2fcb72934c2127be3cdf409035b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799bd2fcb72934c2127be3cdf409035b");
            return;
        }
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof com.sankuai.waimai.mach.widget.d) {
            this.w = (com.sankuai.waimai.mach.widget.d) layoutParams;
            this.x = new Path();
            this.y = new RectF(0.0f, 0.0f, this.w.width, this.w.height);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075cb6c7eb7470262bbc835a52ed957f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075cb6c7eb7470262bbc835a52ed957f");
            return;
        }
        if (this.w != null && this.w.c()) {
            this.x.addRoundRect(this.y, this.w.b(), Path.Direction.CW);
            canvas.clipPath(this.x);
        }
        super.onDraw(canvas);
    }
}
