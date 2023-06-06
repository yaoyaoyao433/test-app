package com.meituan.msi.api.component.video;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.msi.api.component.video.bean.FullScreenEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class VideoCoverView extends FrameLayout implements View.OnClickListener, View.OnTouchListener, SeekBar.OnSeekBarChangeListener, com.meituan.android.mtplayer.video.callback.a {
    public static ChangeQuickRedirect a;
    private TextView A;
    private SeekBar B;
    private TextView C;
    private ImageView D;
    private ImageView E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;
    private int S;
    private VideoParam T;
    private Boolean U;
    private Boolean V;
    private a W;
    private int aa;
    private ViewGroup ab;
    private int ac;
    private Handler ad;
    private Runnable ae;
    com.meituan.android.mtplayer.video.callback.c b;
    boolean c;
    boolean d;
    private d e;
    private ImageView f;
    private LinearLayout g;
    private TextView h;
    private ImageView i;
    private ImageView j;
    private LinearLayout k;
    private TextView l;
    private ProgressBar m;
    private LinearLayout n;
    private ProgressBar o;
    private LinearLayout p;
    private ProgressBar q;
    private LinearLayout r;
    private TextView s;
    private LinearLayout t;
    private ImageView u;
    private TextView v;
    private TextView w;
    private LinearLayout x;
    private ImageView y;
    private TextView z;

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final View getView() {
        return this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public VideoCoverView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171f836ae29f55bdac7c1113d4d20f30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171f836ae29f55bdac7c1113d4d20f30");
        }
    }

    private VideoCoverView(Context context, AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e97469bf1164952a62862bc04cd8113", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e97469bf1164952a62862bc04cd8113");
        }
    }

    public VideoCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70de185a118ffc01994fd56159368661", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70de185a118ffc01994fd56159368661");
            return;
        }
        this.R = 0;
        this.S = 0;
        this.U = Boolean.FALSE;
        this.V = Boolean.FALSE;
        this.c = false;
        this.ac = -1;
        this.d = false;
        this.ad = new Handler(Looper.getMainLooper());
        this.ae = new Runnable() { // from class: com.meituan.msi.api.component.video.VideoCoverView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bc4b6c46314d03cdddc587b0652cdc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bc4b6c46314d03cdddc587b0652cdc7");
                } else {
                    VideoCoverView.this.setTopBottomVisible(false);
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8ff6eadaf06cc18463e71f5ec299ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8ff6eadaf06cc18463e71f5ec299ea1");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02d4ae73370d6f1d5f7c9f315e8db874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02d4ae73370d6f1d5f7c9f315e8db874");
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.msi_video_player_conver_layout, (ViewGroup) this, true);
            this.f = (ImageView) findViewById(R.id.image);
            this.i = (ImageView) findViewById(R.id.center_start);
            this.j = (ImageView) findViewById(R.id.center_poster);
            this.g = (LinearLayout) findViewById(R.id.loading);
            this.h = (TextView) findViewById(R.id.load_text);
            this.k = (LinearLayout) findViewById(R.id.change_position);
            this.l = (TextView) findViewById(R.id.change_position_current);
            this.m = (ProgressBar) findViewById(R.id.change_position_progress);
            this.n = (LinearLayout) findViewById(R.id.change_brightness);
            this.o = (ProgressBar) findViewById(R.id.change_brightness_progress);
            this.p = (LinearLayout) findViewById(R.id.change_volume);
            this.q = (ProgressBar) findViewById(R.id.change_volume_progress);
            this.r = (LinearLayout) findViewById(R.id.error);
            this.s = (TextView) findViewById(R.id.retry);
            this.t = (LinearLayout) findViewById(R.id.top);
            this.u = (ImageView) findViewById(R.id.back);
            this.v = (TextView) findViewById(R.id.title);
            this.w = (TextView) findViewById(R.id.change_speed);
            this.x = (LinearLayout) findViewById(R.id.bottom);
            this.y = (ImageView) findViewById(R.id.start_or_pause);
            this.z = (TextView) findViewById(R.id.position);
            this.A = (TextView) findViewById(R.id.duration);
            this.B = (SeekBar) findViewById(R.id.seek);
            this.C = (TextView) findViewById(R.id.clarity);
            this.E = (ImageView) findViewById(R.id.volume_mute);
            this.D = (ImageView) findViewById(R.id.full_screen);
            this.u.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "13d58dbb36ab50b111abbed26f5b1c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "13d58dbb36ab50b111abbed26f5b1c8a");
        } else {
            this.i.setOnClickListener(this);
            this.s.setOnClickListener(this);
            this.u.setOnClickListener(this);
            this.w.setOnClickListener(this);
            this.y.setOnClickListener(this);
            this.B.setOnSeekBarChangeListener(this);
            this.D.setOnClickListener(this);
            this.E.setOnClickListener(this);
            setOnClickListener(this);
            setOnTouchListener(this);
        }
        a();
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
        this.b = cVar;
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111cd183a324829f5de4f90abac27b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111cd183a324829f5de4f90abac27b61");
            return;
        }
        this.R = i;
        PrintStream printStream = System.out;
        printStream.println("MsiVideo onPlayStateChanged " + i);
        switch (i) {
            case -1:
                this.r.setVisibility(0);
                this.g.setVisibility(8);
                this.i.setVisibility(8);
                this.ad.removeCallbacks(this.ae);
                setTopBottomVisible(false);
                if (this.W != null) {
                    this.W.a(-1, "player occur error,player don't supply more detail error message");
                }
                this.e.h();
                return;
            case 0:
                if (this.W != null) {
                    this.W.a(0, null);
                    return;
                }
                return;
            case 1:
                this.g.setVisibility(0);
                this.h.setText("正在准备中......");
                this.r.setVisibility(8);
                this.i.setVisibility(8);
                if (this.W != null) {
                    this.W.a(1, null);
                    return;
                }
                return;
            case 2:
                setVolumeMuted(this.V.booleanValue());
                this.f.setVisibility(4);
                this.g.setVisibility(8);
                this.y.setImageResource(R.drawable.msi_mtplayer_player_pause_normal);
                if (this.W != null) {
                    this.W.a(2, null);
                    return;
                }
                return;
            case 3:
                this.f.setVisibility(4);
                this.j.setVisibility(8);
                this.g.setVisibility(8);
                this.i.setVisibility(8);
                this.ad.removeCallbacks(this.ae);
                this.ad.postDelayed(this.ae, MetricsAnrManager.ANR_THRESHOLD);
                this.y.setImageResource(R.drawable.msi_mtplayer_player_pause_normal);
                if (this.W != null) {
                    this.W.a(3, null);
                }
                d dVar = this.e;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d.b;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a33be90c5bc635aea7da22314ad5943e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a33be90c5bc635aea7da22314ad5943e");
                    return;
                } else if (dVar.d != null) {
                    dVar.c = true;
                    dVar.d.removeCallbacksAndMessages(null);
                    dVar.d.sendEmptyMessage(1);
                    return;
                } else {
                    return;
                }
            case 4:
                this.g.setVisibility(8);
                this.y.setImageResource(R.drawable.msi_mtplayer_player_play_icon);
                if (this.d) {
                    this.d = false;
                    setTopBottomVisible(true);
                    this.ad.removeCallbacks(this.ae);
                    this.ad.postDelayed(this.ae, MetricsAnrManager.ANR_THRESHOLD);
                } else if (this.W != null) {
                    this.W.a(4, null);
                }
                this.e.h();
                return;
            case 5:
                this.g.setVisibility(0);
                this.h.setText("正在缓冲中......");
                this.y.setImageResource(R.drawable.msi_mtplayer_player_play_icon);
                if (this.W != null) {
                    this.W.a(5, null);
                    return;
                }
                return;
            case 6:
                if (this.W != null) {
                    this.W.a(6, null);
                    return;
                }
                return;
            case 7:
                if (this.T != null && !this.T.loop) {
                    this.f.setVisibility(0);
                    this.B.setProgress(0);
                    this.y.setImageResource(R.drawable.msi_mtplayer_player_play_icon);
                    this.z.setText(e.a(0L));
                    this.ad.removeCallbacks(this.ae);
                    setTopBottomVisible(true);
                }
                if (this.W != null) {
                    this.W.a(7, null);
                }
                this.e.h();
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3724072cc220f9e1857eaf94b64821ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3724072cc220f9e1857eaf94b64821ab");
            return;
        }
        this.B.setProgress((i * 100) / i2);
        this.B.setSecondaryProgress(i3);
        this.A.setText(e.a(i2));
        this.z.setText(e.a(i));
    }

    public final void setVideoView(d dVar) {
        this.e = dVar;
    }

    public final void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208b90202b47c9fd847eec0a92f327ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208b90202b47c9fd847eec0a92f327ec");
        } else {
            this.v.setText(str);
        }
    }

    public final void setVideoBottomImage(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1dfa1e1cdc2621f196b75a4e2947e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1dfa1e1cdc2621f196b75a4e2947e4d");
        } else {
            this.f.setImageResource(i);
        }
    }

    public final void setVideoBottomImage(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a734fb4ef2c0424165a3166db13908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a734fb4ef2c0424165a3166db13908");
        } else {
            this.f.setImageBitmap(bitmap);
        }
    }

    public final ImageView getVideoBottomImage() {
        return this.f;
    }

    public final void setParam(VideoParam videoParam) {
        Object[] objArr = {videoParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a664266eb9024875514ef829ca0e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a664266eb9024875514ef829ca0e95");
        } else if (videoParam == null) {
        } else {
            this.T = videoParam;
            if (!TextUtils.isEmpty(videoParam.poster)) {
                Picasso.g(getContext()).d(videoParam.poster).a(this.j);
                if (f()) {
                    this.j.setVisibility(0);
                }
            } else {
                this.j.setVisibility(4);
            }
            if (!videoParam.controls) {
                this.x.setVisibility(8);
            } else {
                this.x.setVisibility(0);
            }
            if (videoParam.showPlayBtn) {
                this.y.setVisibility(0);
            } else {
                this.y.setVisibility(8);
            }
            if (videoParam.showCurrentPlayTime) {
                this.z.setVisibility(0);
            } else {
                this.z.setVisibility(8);
            }
            if (videoParam.showDuration) {
                this.A.setVisibility(0);
            } else {
                this.A.setVisibility(8);
            }
            if (videoParam.showCenterPlayBtn && f()) {
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
            this.V = Boolean.valueOf(videoParam.muted);
            if (videoParam.showMuteBtn && this.V.booleanValue()) {
                this.E.setVisibility(0);
                this.E.setImageResource(R.drawable.mtplayer_palyer_volume_mute);
                setVolumeMuted(true);
            } else if (videoParam.showMuteBtn && !this.V.booleanValue()) {
                this.E.setVisibility(0);
                this.E.setImageResource(R.drawable.mtplayer_palyer_volume);
                setVolumeMuted(false);
            } else {
                this.E.setVisibility(8);
                setVolumeMuted(this.V.booleanValue());
            }
            if (videoParam.autoplay && this.b != null && this.R == 0) {
                this.b.c();
            }
            this.D.setVisibility(videoParam.showFullscreenBtn ? 0 : 8);
        }
    }

    public final void setPlayStateListener(a aVar) {
        this.W = aVar;
    }

    private boolean f() {
        int i = this.R;
        if (i != -1) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return false;
                default:
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBottomVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f933e7166b4f01c371181408eb3b69bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f933e7166b4f01c371181408eb3b69bf");
        } else if (this.T == null || this.T.controls) {
            this.Q = z;
            this.t.setVisibility(z ? 0 : 4);
            this.x.setVisibility(z ? 0 : 4);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de260f8c51f3d2f35fbf0ac8c0a774ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de260f8c51f3d2f35fbf0ac8c0a774ab");
        } else {
            this.k.setVisibility(8);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b193ebb9db6aa7604060e2743c7395b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b193ebb9db6aa7604060e2743c7395b9");
        } else {
            this.p.setVisibility(8);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36866385962fcb5ab3526fd2694f865b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36866385962fcb5ab3526fd2694f865b");
        } else {
            this.n.setVisibility(8);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f35fa1d428ba1fc2deb61d1b58326e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f35fa1d428ba1fc2deb61d1b58326e");
            return;
        }
        this.B.setProgress(0);
        this.y.setImageResource(R.drawable.msi_mtplayer_player_play_icon);
        this.B.setSecondaryProgress(0);
        this.i.setVisibility(0);
        this.f.setVisibility(0);
        this.j.setVisibility(0);
        this.t.setVisibility(0);
        this.x.setVisibility(8);
        this.g.setVisibility(8);
        this.r.setVisibility(8);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int streamMaxVolume;
        int streamVolume;
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0299aeb3c6e161ae70c938e855a13e2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0299aeb3c6e161ae70c938e855a13e2a")).booleanValue();
        }
        if (this.S == 0) {
            return false;
        }
        if (!(this.R == -1)) {
            if (!(this.R == 1) && !j()) {
                if (!(this.R == 7)) {
                    this.F = motionEvent.getX();
                    this.G = motionEvent.getY();
                    switch (motionEvent.getAction()) {
                        case 0:
                            this.H = this.F;
                            this.I = this.G;
                            this.N = false;
                            this.O = false;
                            this.P = false;
                            break;
                        case 1:
                        case 3:
                            if (this.N) {
                                g();
                                if (this.b != null) {
                                    this.b.a(this.B.getProgress() / 100.0f);
                                }
                                return true;
                            } else if (this.P) {
                                i();
                                return true;
                            } else if (this.O) {
                                this.ac = -1;
                                h();
                                return true;
                            }
                            break;
                        case 2:
                            this.J = this.F - this.H;
                            this.K = this.G - this.I;
                            this.L = Math.abs(this.J);
                            this.M = Math.abs(this.K);
                            if (!this.N && !this.O && !this.P) {
                                if (this.L > 80.0f) {
                                    this.N = true;
                                } else if (this.M > 80.0f) {
                                    if (this.H < getWidth() * 0.5f) {
                                        this.P = true;
                                    } else {
                                        this.O = true;
                                    }
                                }
                            }
                            if (this.N) {
                                float duration = this.b.getDuration();
                                int max = (int) Math.max(0.0f, Math.min(duration, this.b.getCurrentPosition() + ((this.J * duration) / getWidth())));
                                int i = (int) ((max / duration) * 100.0f);
                                this.B.setProgress(i);
                                long j = max;
                                Object[] objArr2 = {Integer.valueOf(i), new Long(j)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae940da24d8b3fd6c03caccc6136e00b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae940da24d8b3fd6c03caccc6136e00b");
                                } else {
                                    if (this.k.getVisibility() == 8) {
                                        this.k.setVisibility(0);
                                    }
                                    this.m.setProgress(i);
                                    this.l.setText(e.a(j));
                                }
                            }
                            if (this.P) {
                                this.K = -this.K;
                                Activity activity = (Activity) getContext();
                                Object[] objArr3 = {activity};
                                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                                float max2 = Math.max(0.0f, Math.min(1.0f, (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7763d740cd39631b91ecf9b351248886", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7763d740cd39631b91ecf9b351248886")).floatValue() : activity.getWindow().getAttributes().screenBrightness) + (this.K / getHeight()))) / 1.0f;
                                this.b.setBrightness(max2);
                                int i2 = (int) (max2 * 100.0f);
                                Object[] objArr4 = {Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "030dd3bb561ab4064ac1eec59560844e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "030dd3bb561ab4064ac1eec59560844e");
                                } else {
                                    if (this.n.getVisibility() == 8) {
                                        this.n.setVisibility(0);
                                    }
                                    this.o.setProgress(i2);
                                }
                            }
                            if (this.O) {
                                this.K = -this.K;
                                Context context = getContext();
                                Object[] objArr5 = {context};
                                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "17d34b0156b9d0d7b060669fc8358913", RobustBitConfig.DEFAULT_VALUE)) {
                                    streamMaxVolume = ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "17d34b0156b9d0d7b060669fc8358913")).intValue();
                                } else {
                                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                                    streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : 0;
                                }
                                float f = streamMaxVolume;
                                int height = (int) ((this.K * f) / getHeight());
                                if (this.ac == -1) {
                                    Context context2 = getContext();
                                    Object[] objArr6 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect6 = e.a;
                                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "58dd2c9829800ffbf520f3270fcc8bd9", RobustBitConfig.DEFAULT_VALUE)) {
                                        streamVolume = ((Integer) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "58dd2c9829800ffbf520f3270fcc8bd9")).intValue();
                                    } else {
                                        AudioManager audioManager2 = (AudioManager) context2.getSystemService("audio");
                                        streamVolume = audioManager2 != null ? audioManager2.getStreamVolume(3) : 0;
                                    }
                                    this.ac = streamVolume;
                                }
                                int max3 = Math.max(0, Math.min(streamMaxVolume, this.ac + height));
                                Context context3 = getContext();
                                Object[] objArr7 = {context3, Integer.valueOf(max3)};
                                ChangeQuickRedirect changeQuickRedirect7 = e.a;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "3c815983c074c98c8b08f4e5430fc3d2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "3c815983c074c98c8b08f4e5430fc3d2");
                                } else {
                                    AudioManager audioManager3 = (AudioManager) context3.getSystemService("audio");
                                    if (audioManager3 != null) {
                                        audioManager3.setStreamVolume(3, max3, 0);
                                    }
                                }
                                int i3 = (int) ((max3 / f) * 100.0f);
                                Object[] objArr8 = {Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (!PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4a3f6bb166628703d3e6de68add17c45", RobustBitConfig.DEFAULT_VALUE)) {
                                    if (this.p.getVisibility() == 8) {
                                        this.p.setVisibility(0);
                                    }
                                    this.q.setProgress(i3);
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4a3f6bb166628703d3e6de68add17c45");
                                    break;
                                }
                            }
                            break;
                    }
                    return false;
                }
            }
        }
        g();
        h();
        i();
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d62b749031dbe95a849f4c840f2c7ae", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d62b749031dbe95a849f4c840f2c7ae");
            return;
        }
        int id = view.getId();
        if (id == R.id.center_start) {
            this.b.c();
            this.i.setVisibility(8);
        } else if (id == R.id.retry) {
            this.b.f();
            this.b.c();
        } else if (id == R.id.back) {
            if (this.S == 1) {
                e();
            }
        } else if (id == R.id.start_or_pause) {
            if (l() || k()) {
                this.b.d();
            } else {
                this.b.c();
            }
        } else if (id == R.id.full_screen) {
            if (this.S == 1) {
                e();
            } else if (this.S == 0) {
                b(this.T.direction);
            }
            this.ad.removeCallbacks(this.ae);
            this.ad.postDelayed(this.ae, MetricsAnrManager.ANR_THRESHOLD);
        } else if (id == R.id.change_speed) {
            if (view.getTag() == null) {
                view.setTag(Float.valueOf(1.0f));
            }
            float max = Math.max((((Float) view.getTag()).floatValue() + 1.0f) % 7.0f, 1.0f);
            this.b.setPlaySpeed(max);
            view.setTag(Float.valueOf(max));
        } else if (id == R.id.volume_mute) {
            if (this.V.booleanValue()) {
                setVolumeMuted(false);
                this.E.setImageResource(R.drawable.mtplayer_palyer_volume);
                this.V = Boolean.FALSE;
                this.T.muted = false;
            } else {
                setVolumeMuted(true);
                this.E.setImageResource(R.drawable.mtplayer_palyer_volume_mute);
                this.V = Boolean.TRUE;
                this.T.muted = true;
            }
            this.ad.removeCallbacks(this.ae);
            this.ad.postDelayed(this.ae, MetricsAnrManager.ANR_THRESHOLD);
        } else if (view == this) {
            if (!j() && !l()) {
                if (!(this.R == 4) && !k()) {
                    if (!(this.R == 6)) {
                        return;
                    }
                }
            }
            this.ad.removeCallbacks(this.ae);
            setTopBottomVisible(!this.Q);
            if (this.Q) {
                this.ad.postDelayed(this.ae, MetricsAnrManager.ANR_THRESHOLD);
            }
        }
    }

    private void setVolumeMuted(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a58a7b8e9f7ba2923b7b66dc8f660a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a58a7b8e9f7ba2923b7b66dc8f660a");
        } else if (this.b == null) {
        } else {
            if (z) {
                this.b.a(1.0E-4f, 1.0E-4f);
            } else {
                this.b.a(1.0f, 1.0f);
            }
        }
    }

    private boolean j() {
        return this.R == 2;
    }

    private boolean k() {
        return this.R == 5;
    }

    private boolean l() {
        return this.R == 3;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0793aca278cfc62c2d49c9115d0b2bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0793aca278cfc62c2d49c9115d0b2bae");
            return;
        }
        this.b.a((this.b.getDuration() * seekBar.getProgress()) / 100);
        this.e.j();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3dd61ac76f9edb4fb3e00c7e11cc5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3dd61ac76f9edb4fb3e00c7e11cc5b0");
        } else if (this.b != null) {
            this.b.c();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49358fd42517703b77fdfbf4e813986b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49358fd42517703b77fdfbf4e813986b");
        } else if (this.b != null) {
            if (l() || k()) {
                this.b.d();
            }
        }
    }

    public final boolean d() {
        return this.S == 1;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c05adf17e118c313d470c11cc33c09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c05adf17e118c313d470c11cc33c09");
            return;
        }
        Activity activity = this.e.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        m();
        if (!d()) {
            this.ab = (ViewGroup) this.e.getParent();
        }
        this.S = 1;
        this.D.setImageResource(R.drawable.mtplayer_player_to_small_icon);
        this.e.setBackgroundColor(-16777216);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.component.video.VideoCoverView.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c798c100eb77abdc6afddcacc170848", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c798c100eb77abdc6afddcacc170848");
                }
            }
        });
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.e, new ViewGroup.LayoutParams(-1, -1));
        a(i, true);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036db1136cf195a98d2458deb5646dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036db1136cf195a98d2458deb5646dc2");
            return;
        }
        Activity activity = this.e.getActivity();
        if (this.ab == null || activity == null || activity.isFinishing()) {
            return;
        }
        n();
        this.D.setImageResource(R.drawable.msi_mtplayer_player_to_full_icon);
        this.S = 0;
        this.u.setVisibility(8);
        this.e.setOnClickListener(null);
        this.e.setClickable(false);
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        this.ab.addView(this.e, new ViewGroup.LayoutParams(-1, -1));
        a(0, false);
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b37f2de7971842167282ab2c5da5fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b37f2de7971842167282ab2c5da5fe3");
            return;
        }
        Activity activity = this.e.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().addFlags(1024);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT < 19) {
            viewGroup.setSystemUiVisibility(8);
            return;
        }
        this.aa = viewGroup.getSystemUiVisibility();
        viewGroup.setSystemUiVisibility(5126);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ab0e06614aada7254f399da41f99ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ab0e06614aada7254f399da41f99ba");
            return;
        }
        Activity activity = this.e.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT > 19) {
            decorView.setSystemUiVisibility(this.aa);
        }
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.show();
        }
        activity.getWindow().clearFlags(1024);
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d984076e167c6e9da2c24fb3b923314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d984076e167c6e9da2c24fb3b923314");
            return;
        }
        Activity activity = this.e.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (i == 0) {
            activity.setRequestedOrientation(1);
        } else {
            if (i != 90) {
                if (i == -90) {
                    activity.setRequestedOrientation(8);
                } else if (this.e.getMeasuredWidth() < this.e.getMeasuredHeight()) {
                    activity.setRequestedOrientation(1);
                }
            }
            activity.setRequestedOrientation(0);
        }
        FullScreenEvent fullScreenEvent = new FullScreenEvent();
        fullScreenEvent.fullScreen = z;
        fullScreenEvent.direction = i == 0 ? "vertical" : "horizontal";
        if (this.W != null) {
            this.W.a(9, fullScreenEvent);
        }
    }
}
