package com.sankuai.meituan.shortvideocore.adapter.holder;

import android.arch.lifecycle.k;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.shortvideocore.config.DebugView;
import com.sankuai.meituan.shortvideocore.widget.PoisonBufferingView;
import com.sankuai.meituan.shortvideocore.widget.TouchLayer;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.SoftReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.meituan.shortvideocore.adapter.holder.a implements View.OnClickListener {
    public static ChangeQuickRedirect l;
    private PoisonBufferingView A;
    private final View B;
    private final View C;
    private final Handler D;
    private String E;
    private boolean F;
    private boolean G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private DebugView M;
    public int m;
    public h n;
    public boolean o;
    private final Context p;
    private final View q;
    private final View r;
    private final FrameLayout s;
    private TouchLayer t;
    private ImageView u;
    private MTVideoPlayerView v;
    private VideoPlayerParam w;
    private boolean x;
    private com.sankuai.meituan.shortvideocore.adapter.item.b y;
    private View z;

    public static /* synthetic */ void a(b bVar, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "82795260d2042242923ac1025f8e624e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "82795260d2042242923ac1025f8e624e");
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) bVar.C.getLayoutParams();
        aVar.z = f;
        bVar.C.setLayoutParams(aVar);
    }

    public static /* synthetic */ void a(b bVar, long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1c86393f9eae37c57bd5a99a02b0b092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1c86393f9eae37c57bd5a99a02b0b092");
        } else if (bVar.M != null) {
            bVar.M.a(j, str);
        }
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.G = true;
        return true;
    }

    public static /* synthetic */ boolean c(b bVar, boolean z) {
        bVar.F = true;
        return true;
    }

    public static /* synthetic */ boolean d(b bVar, boolean z) {
        bVar.L = true;
        return true;
    }

    public static /* synthetic */ boolean f(b bVar, boolean z) {
        bVar.x = false;
        return false;
    }

    public static /* synthetic */ int k(b bVar) {
        int i = bVar.K;
        bVar.K = i + 1;
        return i;
    }

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c76b0fa8954d0e85fbb59dd267f0137", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c76b0fa8954d0e85fbb59dd267f0137");
            return;
        }
        this.x = true;
        this.o = false;
        this.D = new a(this);
        this.K = 1;
        this.p = view.getContext();
        this.s = (FrameLayout) view.findViewById(R.id.short_video_top_view);
        this.A = (PoisonBufferingView) view.findViewById(R.id.poison_buffering_view);
        this.t = (TouchLayer) view.findViewById(R.id.mt_video_view_container);
        this.v = (MTVideoPlayerView) view.findViewById(R.id.mt_video_view);
        this.u = (ImageView) view.findViewById(R.id.mt_cover_image);
        this.q = view.findViewById(R.id.short_video_error);
        this.r = view.findViewById(R.id.mt_video_player);
        this.B = view.findViewById(R.id.progressView_container);
        this.C = view.findViewById(R.id.thumbView);
        this.z = view.findViewById(R.id.view_top_black);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341954b80ef5e4ea6bd887b2dfcb22ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341954b80ef5e4ea6bd887b2dfcb22ae");
        } else if (this.y != null) {
            StringBuilder sb = new StringBuilder("currentPosition: ");
            sb.append(this.y.a);
            sb.append(" ---> msg = ");
            sb.append(str2);
        } else {
            new StringBuilder("currentPosition: null ---> msg = ").append(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d71df16565fb7bb47b53df233551a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d71df16565fb7bb47b53df233551a12");
        } else {
            this.D.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae42a277ad565ba472dc104156da38e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae42a277ad565ba472dc104156da38e");
            return;
        }
        super.e();
        a("ShortVideoVH", "onViewAttachedToWindow");
        this.m = 0;
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746ccc807771e780e7480ff06def15a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746ccc807771e780e7480ff06def15a2");
            return;
        }
        a("ShortVideoVH", "onViewDetachedFromWindow");
        super.f();
        if (this.v != null && this.e != null) {
            int duration = this.v.getDuration();
            int currentPosition = this.v.getCurrentPosition();
            if (duration != 0) {
                int duration2 = (this.m * this.v.getDuration()) + currentPosition;
                this.e.a(this.v.getPlayerType());
                final com.sankuai.meituan.shortvideocore.statistics.a aVar = this.e;
                final float f = duration2;
                final String str = this.E;
                Object[] objArr2 = {Float.valueOf(f), str};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "26c38ebb43cdb26d0a039d1cd21fbed7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "26c38ebb43cdb26d0a039d1cd21fbed7");
                } else {
                    new StringBuilder("reportLiveDuration: ").append(f);
                    com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.8
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ca115866c2588d3ba86e6678911f438", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ca115866c2588d3ba86e6678911f438");
                                return;
                            }
                            Map a2 = a.a(aVar);
                            a2.put("MTLIVE_LIVE_DURATION", Float.valueOf(f));
                            com.sankuai.meituan.mtliveqos.a.a(aVar.i, a.c(str), a2, a.c(aVar));
                        }
                    });
                }
            }
        }
        a(11111);
        this.x = true;
        if (this.w != null) {
            this.w.e();
            this.w = null;
        }
        if (this.v != null) {
            b(false);
            this.v.f();
        }
        if (this.u != null) {
            this.u.setVisibility(0);
        }
        if (this.A != null) {
            this.A.b();
        }
        this.E = null;
        this.L = false;
        this.J = false;
        this.F = false;
        this.G = false;
        this.K = 1;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = l;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b568055c0d141775b2f3f72ab46d5c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b568055c0d141775b2f3f72ab46d5c99");
        } else if (this.M != null) {
            this.M.setTitleName("");
            this.M.a(-1L, "");
        }
        i();
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47330ce077960e062304201952da6b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47330ce077960e062304201952da6b8a");
            return;
        }
        super.d();
        a("ShortVideoVH", "onViewRecycled");
        if (this.w != null) {
            this.w.e();
            this.w = null;
        }
        this.x = true;
        if (this.v != null) {
            b(false);
            this.v.g();
        }
        i();
        a(-2);
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void a(com.sankuai.meituan.shortvideocore.adapter.item.a aVar) {
        Integer num;
        int a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "936832befdd53e37606fdd1101c7409a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "936832befdd53e37606fdd1101c7409a");
            return;
        }
        if (aVar instanceof com.sankuai.meituan.shortvideocore.adapter.item.b) {
            this.y = (com.sankuai.meituan.shortvideocore.adapter.item.b) aVar;
        }
        if (this.y == null) {
            return;
        }
        a("ShortVideoVH", "bindView = " + aVar.c);
        this.E = this.y.e;
        this.u.setVisibility(0);
        this.q.setVisibility(8);
        this.q.setOnClickListener(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = l;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a41f46d85e9c23bfc430b1164fc4d846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a41f46d85e9c23bfc430b1164fc4d846");
        } else if (this.g != null) {
            com.sankuai.meituan.shortvideocore.a aVar2 = this.g;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.shortvideocore.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "076c6e815eef5260956d3a4778928db7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "076c6e815eef5260956d3a4778928db7")).booleanValue() : aVar2.b.c) {
                this.M = new DebugView(this.p);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 16;
                this.M.setLayoutParams(layoutParams);
                this.s.addView(this.M);
            }
        }
        String str = this.E;
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = l;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0012584637857e338a6bbc343da496e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0012584637857e338a6bbc343da496e9");
        } else if (this.M != null) {
            this.M.setTitleName(str);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = l;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "29b6821ee73052f2705331fe00503128", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "29b6821ee73052f2705331fe00503128");
        } else {
            if (this.g != null) {
                com.sankuai.meituan.shortvideocore.a aVar3 = this.g;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.shortvideocore.a.a;
                num = PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "1bffcad57ab5015929100a05b236cb03", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "1bffcad57ab5015929100a05b236cb03") : aVar3.b.b;
            } else {
                num = null;
            }
            if (this.k != null) {
                num = this.k;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 5) {
                    switch (intValue) {
                        case 0:
                            this.v.setDisplayMode(num.intValue());
                            this.u.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            break;
                        case 1:
                            this.v.setDisplayMode(num.intValue());
                            this.u.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                    }
                } else {
                    this.v.setDisplayMode(num.intValue());
                    this.u.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
        }
        a(aVar.c);
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = l;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f456509595c374d51a2a5f792d8d9df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f456509595c374d51a2a5f792d8d9df7");
        } else {
            this.t.setGestureDetector(new GestureDetector(this.p, new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.meituan.shortvideocore.adapter.holder.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    Object[] objArr8 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d61bc3bb99059424aa4c4ee7936643fa", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d61bc3bb99059424aa4c4ee7936643fa")).booleanValue();
                    }
                    if (motionEvent.getY() < b.this.t.getTouchMinY()) {
                        if (b.this.v != null) {
                            if (b.this.v.e()) {
                                b.this.c();
                            } else {
                                b.this.b();
                            }
                        }
                        if (b.this.y != null && b.this.c != null) {
                            com.sankuai.meituan.shortvideocore.adapter.item.b unused = b.this.y;
                        }
                    }
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onDoubleTap(MotionEvent motionEvent) {
                    Object[] objArr8 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "156bf04b6dff5410393692e67d8bbc7e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "156bf04b6dff5410393692e67d8bbc7e")).booleanValue();
                    }
                    if (b.this.y != null && b.this.c != null) {
                        com.sankuai.meituan.shortvideocore.adapter.item.b unused = b.this.y;
                    }
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final void onLongPress(MotionEvent motionEvent) {
                    Object[] objArr8 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "87f067b114c4f48d83b5b336c0b28037", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "87f067b114c4f48d83b5b336c0b28037");
                    } else if (b.this.y == null || b.this.c == null) {
                    } else {
                        com.sankuai.meituan.shortvideocore.adapter.item.b unused = b.this.y;
                    }
                }
            }));
            if (this.v != null) {
                this.t.a(a2 - com.sankuai.meituan.shortvideocore.utils.b.a(this.p, 130.0f), com.sankuai.meituan.shortvideocore.utils.b.a(this.p), new TouchLayer.a() { // from class: com.sankuai.meituan.shortvideocore.adapter.holder.b.2
                });
            } else {
                this.t.a(0.0f, 0.0f, null);
            }
        }
        if (TextUtils.isEmpty(this.y.f)) {
            return;
        }
        RequestCreator d = Picasso.g(this.p).d(this.y.f);
        d.k = DiskCacheStrategy.SOURCE;
        d.a(this.u);
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348eec91df70bd9665fb5b034613b906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348eec91df70bd9665fb5b034613b906");
            return;
        }
        this.x = z;
        this.z.setVisibility(z ? 0 : 4);
        if (this.y == null || TextUtils.isEmpty(this.y.e)) {
            return;
        }
        if (this.v.e()) {
            if (this.x) {
                b(false);
                this.x = false;
                return;
            }
            return;
        }
        this.r.setVisibility(8);
        this.q.setVisibility(8);
        k();
        if (this.w != null && j()) {
            boolean f = this.w.f();
            this.e.a(this.v.getPlayerType());
            this.e.a(f, this.E);
            a("ShortVideoVH", "mVideoPlayerParam hasVideoCached = " + f);
        }
        a("ShortVideoVH", "start = " + z);
        c(true);
        this.v.c();
        this.I = System.currentTimeMillis();
        if (j()) {
            this.e.a(this.v.getPlayerType());
            this.e.b(this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        return (this.x || this.e == null) ? false : true;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ced63e865b16b2b4cdd6e9779f3a5d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ced63e865b16b2b4cdd6e9779f3a5d8");
        } else if (this.w != null) {
        } else {
            if (this.e != null) {
                com.sankuai.meituan.shortvideocore.statistics.a.h = this.e.f;
            }
            this.w = new VideoPlayerParam(this.y.e);
            this.w.a(this.p, "short_video_cache");
            this.w.a((m.b) null, 3);
            this.v.setDataSource(this.w);
            this.v.setLooping(true);
            this.v.setDisplayView(MTVideoPlayerView.a.TYPE_TEXTURE);
            l lVar = l.TYPE_ANDROID;
            if (com.sankuai.meituan.shortvideocore.config.a.a(this.p).e) {
                lVar = com.sankuai.meituan.mtplayer.a.a();
            }
            this.v.setPlayerType(lVar);
            a("ShortVideoVH", "prepareVideo: playerType = " + lVar);
            this.e.a(lVar);
            this.v.setMultiPlayerManager(this.n);
            this.v.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.sankuai.meituan.shortvideocore.adapter.holder.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i, int i2, int i3) {
                }

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i) {
                    long currentTimeMillis;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "552ab65b88663a1c932d04649a6e21a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "552ab65b88663a1c932d04649a6e21a7");
                        return;
                    }
                    if (-1 == i) {
                        b.this.q.setVisibility(0);
                        b.this.A.b();
                        if (b.this.j()) {
                            b.this.e.a(b.this.v.getPlayerType());
                            b.this.e.a(-1, b.this.E);
                        }
                    } else if (3 == i) {
                        if (b.this.j() && !b.this.e.d) {
                            b.this.e.a(b.this.v.getPlayerType());
                            final com.sankuai.meituan.shortvideocore.statistics.a aVar = b.this.e;
                            final float currentTimeMillis2 = (float) (System.currentTimeMillis() - b.this.e.c);
                            final String str = b.this.E;
                            Object[] objArr3 = {Float.valueOf(currentTimeMillis2), str};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5c7b530d0390a6aeefbc14c79190e85b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5c7b530d0390a6aeefbc14c79190e85b");
                            } else {
                                new StringBuilder("reportEnterFirstFrameDuration: ").append(currentTimeMillis2);
                                com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.3
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "70d289db75e09fcca42cb7798bea9bca", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "70d289db75e09fcca42cb7798bea9bca");
                                            return;
                                        }
                                        Map a2 = a.a(aVar);
                                        a2.put("MTLIVE_VIDEO_ENTER_FIRST_FRAME", Float.valueOf(currentTimeMillis2));
                                        com.sankuai.meituan.mtliveqos.a.a(aVar.i, a.c(str), a2, a.c(aVar));
                                    }
                                });
                            }
                            b.this.e.d = true;
                        }
                        if (!b.this.F || !b.this.J) {
                            b.this.a("reportFirstFrameDuration", "--------");
                            if (b.this.j() && !b.this.G) {
                                long currentTimeMillis3 = System.currentTimeMillis() - b.this.I;
                                if (b.this.e != null) {
                                    b.this.e.a(b.this.v.getPlayerType());
                                    final com.sankuai.meituan.shortvideocore.statistics.a aVar2 = b.this.e;
                                    final float f = (float) currentTimeMillis3;
                                    final String str2 = b.this.E;
                                    Object[] objArr4 = {Float.valueOf(f), str2};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "cb737b40dfa3de3361e30777ef512260", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "cb737b40dfa3de3361e30777ef512260");
                                    } else {
                                        new StringBuilder("reportFirstFrameDuration: ").append(f);
                                        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.4
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr5 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d864332acf74e9839339427019b78137", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d864332acf74e9839339427019b78137");
                                                    return;
                                                }
                                                Map a2 = a.a(aVar2);
                                                a2.put("MTLIVE_FIRST_VIDEO_FRAME", Float.valueOf(f));
                                                com.sankuai.meituan.mtliveqos.a.a(aVar2.i, a.c(str2), a2, a.c(aVar2));
                                            }
                                        });
                                    }
                                }
                                b.b(b.this, true);
                            }
                        } else {
                            if (b.this.j()) {
                                b.this.e.a(b.this.v.getPlayerType());
                                b.this.e.b(b.this.K, b.this.E);
                                b.k(b.this);
                                b.this.e.a((float) (System.currentTimeMillis() - b.this.H), b.this.E);
                            }
                            b.this.J = false;
                        }
                        b.c(b.this, true);
                        if (!b.this.L) {
                            b.this.e.a(b.this.v.getPlayerType());
                            b bVar = b.this;
                            com.sankuai.meituan.shortvideocore.statistics.a aVar3 = b.this.e;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                            if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "f64aa0667b3c5e123278a8b6b7041cea", RobustBitConfig.DEFAULT_VALUE)) {
                                currentTimeMillis = ((Long) PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "f64aa0667b3c5e123278a8b6b7041cea")).longValue();
                            } else {
                                currentTimeMillis = aVar3.e == 0 ? -2L : System.currentTimeMillis() - aVar3.e;
                            }
                            b.a(bVar, currentTimeMillis, b.this.y.e);
                            final com.sankuai.meituan.shortvideocore.statistics.a aVar4 = b.this.e;
                            final String str3 = b.this.E;
                            Object[] objArr6 = {str3};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect6, false, "5be0153006715a236565464b8110a0f8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, aVar4, changeQuickRedirect6, false, "5be0153006715a236565464b8110a0f8");
                            } else if (aVar4.e != 0) {
                                final long currentTimeMillis4 = System.currentTimeMillis() - aVar4.e;
                                aVar4.e = 0L;
                                new StringBuilder("reportStartPlayCost: ").append(currentTimeMillis4);
                                com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.11
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr7 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3e6c69eff7311f1254d05c9a43277c8d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3e6c69eff7311f1254d05c9a43277c8d");
                                            return;
                                        }
                                        Map a2 = a.a(aVar4);
                                        a2.put("MTLIVE_VIDEO_START_PLAY_COST", Float.valueOf((float) currentTimeMillis4));
                                        com.sankuai.meituan.mtliveqos.a.a(aVar4.i, a.c(str3), a2, a.c(aVar4));
                                    }
                                });
                            }
                            b.d(b.this, true);
                        }
                        b.this.c(false);
                        b.this.u.setVisibility(8);
                    } else if (7 == i) {
                        b.this.m++;
                    } else if (4 == i) {
                        b.this.i();
                    }
                    if (5 == i || 6 == i) {
                        if (b.this.F) {
                            b.this.H = System.currentTimeMillis();
                            b.this.J = true;
                        }
                        b.this.c(true);
                    }
                    if (!b.this.x) {
                        b.this.a(i);
                    }
                    if (1 == i) {
                        b.this.c(true);
                    } else if (2 == i) {
                        if (b.this.x) {
                            b.this.a("ShortVideoVH", "pause STATE_PREPARED");
                            b.f(b.this, false);
                            b.this.b(false);
                        }
                    } else if (3 == i && b.this.x) {
                        b.f(b.this, false);
                        b.this.a("ShortVideoVH", "pause STATE_PLAYING");
                        b.this.b(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d0d1c022ae658844ed65556e5c7cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d0d1c022ae658844ed65556e5c7cd0");
        } else if (z) {
            if (this.A != null) {
                this.A.a();
            }
            this.B.setVisibility(8);
            i();
        } else {
            if (this.A != null) {
                this.A.b();
            }
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77bebeac65df5d9fa3e22a7ed54f4b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77bebeac65df5d9fa3e22a7ed54f4b0c");
            return;
        }
        a("ShortVideoVH", "notificationPlayStatus = " + i);
        if (this.y != null && this.b != null) {
            this.y.b = i;
            this.b.b((k<com.sankuai.meituan.shortvideocore.adapter.item.a>) this.y);
        }
        if (this.y == null || this.d == null) {
            return;
        }
        this.d.a(this.y);
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "460da43e40d0c1bc1af53c0f070a02cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "460da43e40d0c1bc1af53c0f070a02cb");
            return;
        }
        a("ShortVideoVH", "pause");
        if (this.v != null) {
            this.v.d();
        }
        if (z) {
            this.r.setVisibility(0);
        }
        c(false);
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87adb7674b2f9ca1bbe69a02f2a008d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87adb7674b2f9ca1bbe69a02f2a008d");
            return;
        }
        super.c();
        b(true);
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c5ccb68d6285a7d151a3fe84995615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c5ccb68d6285a7d151a3fe84995615");
            return;
        }
        super.b();
        a("ShortVideoVH", "resume");
        this.z.setVisibility(4);
        if (this.v != null) {
            a(false);
            this.r.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebded388ebbf7ff5f79a6e1456058e33", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebded388ebbf7ff5f79a6e1456058e33");
        } else if (this.q == view) {
            this.q.setVisibility(8);
            a(false);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d1a1492d9fc37ff9a4c07979192690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d1a1492d9fc37ff9a4c07979192690");
        } else if (this.v == null) {
        } else {
            a("ShortVideoVH", "showTopBlackView");
            b(false);
            this.z.setVisibility(0);
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.adapter.holder.a
    public final com.sankuai.meituan.shortvideocore.adapter.item.a a() {
        return this.y;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends Handler {
        public static ChangeQuickRedirect a;
        public SoftReference<b> b;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c70bc14185e235e74320549a1aed7c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c70bc14185e235e74320549a1aed7c4");
                return;
            }
            this.b = null;
            this.b = new SoftReference<>(bVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec485a7fbf6f8701abe6d0ad171f8711", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec485a7fbf6f8701abe6d0ad171f8711");
                return;
            }
            super.handleMessage(message);
            b bVar = this.b.get();
            if (bVar != null && message.what == 1) {
                int currentPosition = bVar.v.getCurrentPosition();
                int duration = bVar.v.getDuration();
                if (duration <= 0) {
                    return;
                }
                float f = (currentPosition * 1.0f) / duration;
                if (f > 0.0f && !bVar.o) {
                    bVar.o = true;
                    bVar.c(false);
                    bVar.u.setVisibility(8);
                }
                if (bVar.f) {
                    b.a(bVar, f);
                }
                if (bVar.f || bVar.h != null) {
                    bVar.D.sendEmptyMessageDelayed(1, 200L);
                }
            }
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff20eb20903a689b8bf38beaba538512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff20eb20903a689b8bf38beaba538512");
            return;
        }
        boolean z = this.f;
        if (z) {
            this.B.setVisibility(0);
            this.D.removeCallbacksAndMessages(null);
        }
        if (z || this.h != null) {
            this.D.sendEmptyMessage(1);
        }
    }
}
