package com.meituan.mmp.lib.api.video;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.ba;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends e implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    public static ChangeQuickRedirect c;
    private TextView A;
    private ViewStub B;
    private TextView C;
    private ViewStub D;
    private View E;
    private TextView F;
    private ProgressBar G;
    private ViewStub H;
    private View I;
    private TextView J;
    private ViewStub K;
    private TextView L;
    private ImageView M;
    private View N;
    private View O;
    private ProgressBar P;
    private boolean Q;
    private CountDownTimer R;
    private String S;
    private final int T;
    private boolean U;
    private boolean V;
    private boolean W;
    protected TextView d;
    boolean e;
    public int f;
    public int g;
    public Boolean h;
    private Context i;
    private com.meituan.mmp.lib.interfaces.c j;
    private ImageView k;
    private boolean l;
    private ImageView m;
    private ViewStub n;
    private View o;
    private ImageView p;
    private TextView q;
    private LinearLayout r;
    private TextView s;
    private boolean t;
    private View u;
    private ViewStub v;
    private ImageView w;
    private TextView x;
    private SeekBar y;
    private ImageView z;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // com.meituan.mmp.lib.api.video.e, android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public f(Context context, String str, int i, @NonNull com.meituan.mmp.lib.interfaces.c cVar) {
        super(context);
        Object[] objArr = {context, str, Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8012b07f3cd00440bb0dc730354f6e00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8012b07f3cd00440bb0dc730354f6e00");
            return;
        }
        this.l = true;
        this.e = true;
        this.U = false;
        this.f = -1;
        this.V = true;
        this.g = -1;
        this.h = null;
        this.W = true;
        this.i = context;
        this.j = cVar;
        this.S = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8b609220973574f61ca34eb230c81d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8b609220973574f61ca34eb230c81d8");
        } else {
            LayoutInflater.from(this.i).inflate(R.layout.mmp_video_palyer_controller, (ViewGroup) this, true);
            this.m = (ImageView) findViewById(R.id.center_start);
            this.k = (ImageView) findViewById(R.id.image);
            this.n = (ViewStub) findViewById(R.id.topStub);
            this.v = (ViewStub) findViewById(R.id.bottom);
            this.A = (TextView) findViewById(R.id.length);
            this.B = (ViewStub) findViewById(R.id.loading);
            this.D = (ViewStub) findViewById(R.id.change_position);
            this.H = (ViewStub) findViewById(R.id.error);
            this.K = (ViewStub) findViewById(R.id.completed);
            this.P = (ProgressBar) findViewById(R.id.videoProgressBar);
            this.m.setOnClickListener(this);
            setOnClickListener(this);
        }
        this.T = i;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90e69e699d28e880f5e470706ed92a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90e69e699d28e880f5e470706ed92a6");
        } else if (this.u != null) {
        } else {
            this.u = this.v.inflate();
            this.w = (ImageView) this.u.findViewById(R.id.restart_or_pause);
            this.x = (TextView) this.u.findViewById(R.id.position);
            this.d = (TextView) this.u.findViewById(R.id.duration);
            this.x.setVisibility(n() ? 0 : 4);
            this.d.setVisibility(n() ? 0 : 4);
            this.y = (SeekBar) this.u.findViewById(R.id.seek);
            this.z = (ImageView) this.u.findViewById(R.id.full_screen);
            this.w.setOnClickListener(this);
            this.z.setOnClickListener(this);
            this.y.setOnSeekBarChangeListener(this);
            this.y.setVisibility(n() ? 0 : 4);
            this.u.setVisibility(this.t ? 0 : 8);
            e(this.V);
            j();
            if (this.W) {
                this.w.setVisibility(0);
            } else {
                this.w.setVisibility(8);
            }
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84ffa2d3ddd1fc84b589620ae6e2de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84ffa2d3ddd1fc84b589620ae6e2de0");
        } else if (this.o != null) {
        } else {
            this.o = this.n.inflate();
            this.p = (ImageView) findViewById(R.id.back);
            this.q = (TextView) findViewById(R.id.title);
            this.r = (LinearLayout) findViewById(R.id.battery_time);
            this.s = (TextView) findViewById(R.id.time);
            this.p.setOnClickListener(this);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83a662526e338d5747fe88f882bfcc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83a662526e338d5747fe88f882bfcc7");
        } else if (this.I != null) {
        } else {
            this.I = this.H.inflate();
            this.J = (TextView) findViewById(R.id.retry);
            this.J.setOnClickListener(this);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c5ead543203c813f0522887f0a719b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c5ead543203c813f0522887f0a719b6");
            return;
        }
        this.l = z;
        if ((this.b.e() || this.b.g()) && this.m != null) {
            this.m.setVisibility(z ? 0 : 4);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745aece548a554cbef6bdee84fdf5645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745aece548a554cbef6bdee84fdf5645");
            return;
        }
        this.t = z;
        if (this.u != null) {
            this.u.setVisibility(z ? 0 : 4);
            j();
            if (this.b.g()) {
                setTopBottomVisible(true);
            }
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e8fbe01196759d5f2eeae31474f70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e8fbe01196759d5f2eeae31474f70c");
        } else {
            m();
        }
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604dd71e50be9c21f4f8af790f8d4c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604dd71e50be9c21f4f8af790f8d4c21");
            return;
        }
        this.W = z;
        if (this.w != null) {
            this.w.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35281769617b0caf4ad2b7d18fe64869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35281769617b0caf4ad2b7d18fe64869");
        } else {
            this.q.setText(str);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void setImage(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727044f436793b4b9aac18931f82b8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727044f436793b4b9aac18931f82b8a6");
        } else {
            this.k.setImageResource(i);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void setLenght(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c3fbbd2654b8fe43f0a07c3bdc818b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c3fbbd2654b8fe43f0a07c3bdc818b");
        } else {
            this.A.setText(ba.a(j));
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void setVideoPlayer(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6f1787022036ddebed9fb1413221ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6f1787022036ddebed9fb1413221ff");
        } else {
            super.setVideoPlayer(cVar);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f98a78ed49942ced4a72c8529a3c986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f98a78ed49942ced4a72c8529a3c986");
            return;
        }
        switch (i) {
            case -1:
                i();
                c();
                setTopBottomVisible(false);
                h();
                i();
                this.I.setVisibility(0);
                this.m.setVisibility(8);
                break;
            case 1:
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6113718d9bd6a3fa69a221a5f7a18639", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6113718d9bd6a3fa69a221a5f7a18639");
                } else if (this.C != null) {
                    this.B.setVisibility(0);
                } else {
                    this.B.inflate();
                    this.C = (TextView) findViewById(R.id.load_text);
                }
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                this.k.setVisibility(8);
                this.B.setVisibility(0);
                this.C.setText("正在准备...");
                if (this.I != null) {
                    this.I.setVisibility(8);
                }
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                if (this.o != null) {
                    this.o.setVisibility(8);
                }
                if (this.u != null) {
                    this.u.setVisibility(8);
                }
                this.m.setVisibility(8);
                this.A.setVisibility(8);
                a("onVideoWaiting", new JSONObject());
                break;
            case 2:
                a("onVideoResourceLoad", new JSONObject());
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                this.B.setVisibility(8);
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                g();
                b();
                a("onVideoCanPlay", new JSONObject());
                if (!this.t && this.P != null) {
                    this.P.setVisibility(4);
                }
                setTopBottomVisible(this.b.t());
                if (this.b.t()) {
                    b(this.l);
                    break;
                }
                break;
            case 3:
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                this.B.setVisibility(8);
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                g();
                this.w.setImageResource(R.drawable.mmp_ic_video_pause);
                k();
                if (this.f != 3) {
                    a("onVideoPlay", new JSONObject());
                }
                if (!this.t && this.P != null) {
                    this.P.setVisibility(4);
                }
                if (this.m != null) {
                    this.m.setVisibility(8);
                    break;
                }
                break;
            case 4:
                if (this.O != null) {
                    this.O.setVisibility(8);
                }
                this.B.setVisibility(8);
                g();
                this.w.setImageResource(R.drawable.mmp_ic_video_play);
                l();
                a("onVideoPause", new JSONObject());
                break;
            case 5:
                this.B.setVisibility(0);
                this.C.setText("正在缓冲...");
                k();
                a("onVideoWaiting", new JSONObject());
                break;
            case 6:
                this.B.setVisibility(0);
                g();
                this.w.setImageResource(R.drawable.mmp_ic_video_play);
                this.C.setText("正在缓冲...");
                l();
                a("onVideoWaiting", new JSONObject());
                break;
            case 7:
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "413e4bdac0c45cc61d56c61176b29ad3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "413e4bdac0c45cc61d56c61176b29ad3");
                } else if (this.N == null) {
                    this.O = this.K.inflate();
                    this.N = findViewById(R.id.replay);
                    this.L = (TextView) findViewById(R.id.replayTxt);
                    this.M = (ImageView) findViewById(R.id.replayImg);
                    this.N.setOnClickListener(this);
                }
                c();
                setTopBottomVisible(false);
                this.k.setVisibility(0);
                this.O.setVisibility(0);
                this.L.setText("重新播放");
                this.M.setVisibility(0);
                a("onVideoEnded", new JSONObject());
                break;
            case 8:
                c();
                l();
                if (this.y != null) {
                    this.y.setProgress(0);
                }
                a("onVideoPause", new JSONObject());
                if (this.G != null) {
                    this.G.setProgress(0);
                    this.G.setSecondaryProgress(0);
                }
                this.k.setVisibility(8);
                if (this.P != null) {
                    this.P.setProgress(0);
                }
                if (this.O != null) {
                    this.O.setVisibility(0);
                }
                if (this.x != null) {
                    this.x.setText("00:00");
                    this.w.setImageResource(R.drawable.mmp_ic_video_play);
                }
                this.B.setVisibility(8);
                break;
        }
        this.f = i;
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "485926da17d3c8ad8f73c14d3c19e191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "485926da17d3c8ad8f73c14d3c19e191");
            return;
        }
        h();
        g();
        JSONObject jSONObject = new JSONObject();
        switch (i) {
            case 10:
                this.p.setVisibility(8);
                this.z.setImageResource(R.drawable.mmp_ic_video_zoom);
                this.z.setVisibility(0);
                this.r.setVisibility(8);
                try {
                    jSONObject.put("fullScreen", false);
                    jSONObject.put("direction", this.g);
                } catch (JSONException unused) {
                }
                a("onVideoFullScreenChange", jSONObject);
                return;
            case 11:
                this.p.setVisibility(0);
                this.z.setVisibility(0);
                this.z.setImageResource(R.drawable.mmp_ic_video_shrink);
                this.r.setVisibility(0);
                try {
                    jSONObject.put("fullScreen", true);
                    jSONObject.put("direction", this.g);
                } catch (JSONException unused2) {
                }
                a("onVideoFullScreenChange", jSONObject);
                return;
            case 12:
                this.p.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b40f54683d231d5179024d74faf5ae44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b40f54683d231d5179024d74faf5ae44");
            return;
        }
        this.Q = false;
        c();
        l();
        if (this.u != null) {
            this.y.setProgress(0);
            this.y.setSecondaryProgress(0);
            this.z.setImageResource(R.drawable.mmp_ic_video_zoom);
            this.u.setVisibility(8);
        }
        if (this.l) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
        this.k.setVisibility(0);
        if (this.x != null) {
            this.x.setText("00:00");
            this.d.setText("00:00");
            this.P.setProgress(0);
        }
        this.A.setVisibility(0);
        h();
        this.o.setVisibility(0);
        if (this.p != null && this.b != null && !this.b.o()) {
            this.p.setVisibility(8);
        }
        this.B.setVisibility(8);
        if (this.I != null) {
            this.I.setVisibility(8);
        }
        if (this.O != null) {
            this.O.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66793399199ee1cad4d9b80138904fd3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66793399199ee1cad4d9b80138904fd3");
        } else if (view == this.m) {
            if (this.b.e() || this.b.g()) {
                this.b.a();
            }
        } else if (view == this.p) {
            if (this.b.o()) {
                this.b.b(true);
            } else if (this.b.p()) {
                this.b.s();
            }
        } else if (view == this.w) {
            if (this.b.j() || this.b.h()) {
                this.b.d();
            } else if (this.b.k() || this.b.i()) {
                this.b.a(false);
            } else if (this.b.e()) {
                this.b.a();
            } else if (this.b.g()) {
                this.b.a();
            }
        } else if (view == this.z) {
            if (this.b.q() || this.b.p()) {
                this.b.r();
            } else if (this.b.o()) {
                this.b.b(true);
            }
        } else if (view == this.J) {
            this.b.a(false);
        } else if (view == this.N) {
            this.b.a(false);
        } else if (view == this) {
            e();
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2918be4a9bf06308b6fde545f52ec58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2918be4a9bf06308b6fde545f52ec58");
        } else if (this.b.j() || this.b.k() || this.b.h() || this.b.i() || this.b.l() || this.b.g()) {
            setTopBottomVisible(!this.Q);
        } else if (this.b.m()) {
            this.b.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBottomVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8da4c86e210ec2656dd03ec8abbbfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8da4c86e210ec2656dd03ec8abbbfd");
            return;
        }
        if (this.o != null) {
            this.o.setVisibility(z ? 0 : 8);
        }
        if (this.t && this.u != null) {
            this.u.setVisibility(z ? 0 : 8);
            j();
        }
        if (this.t && this.e) {
            if (this.h.booleanValue()) {
                this.P.setVisibility(z ? 4 : 0);
            } else {
                this.P.setVisibility(4);
            }
        } else {
            this.P.setVisibility(4);
        }
        this.Q = z;
        if (z) {
            if (this.b.k() || this.b.i()) {
                return;
            }
            k();
            return;
        }
        l();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1ff39b9f1c5a6a29dd2966aeec50f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1ff39b9f1c5a6a29dd2966aeec50f3");
            return;
        }
        l();
        if (this.R == null) {
            this.R = new CountDownTimer(8000L, 8000L) { // from class: com.meituan.mmp.lib.api.video.f.1
                public static ChangeQuickRedirect a;

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                }

                {
                    super(8000L, 8000L);
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15d5241948c6df7d6032db1a04412f01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15d5241948c6df7d6032db1a04412f01");
                    } else {
                        f.this.setTopBottomVisible(false);
                    }
                }
            };
        }
        this.R.start();
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3d42d66ebc6b88a1b8851800c3dc5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3d42d66ebc6b88a1b8851800c3dc5d");
        } else if (this.R != null) {
            this.R.cancel();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecd32d6088ac29b3ef563064ee473574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecd32d6088ac29b3ef563064ee473574");
            return;
        }
        if (this.b.i()) {
            this.b.a(false);
        }
        this.b.a(((float) (this.b.getDuration() * seekBar.getProgress())) / 100.0f);
        k();
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2331c3940f565837ea922a118af63812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2331c3940f565837ea922a118af63812");
            return;
        }
        long currentPosition = this.b.getCurrentPosition();
        long duration = this.b.getDuration();
        this.y.setSecondaryProgress(this.b.getBufferPercentage());
        float f = (((float) currentPosition) * 1.0f) / ((float) duration);
        this.y.setProgress((int) (100.0f * f));
        this.x.setText(ba.a(currentPosition));
        this.d.setText(ba.a(duration));
        if (this.s != null) {
            this.s.setText(new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.CHINA).format(new Date()));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("viewId", this.S);
            jSONObject.put("position", f);
            jSONObject.put("duration", duration / 1000);
        } catch (JSONException unused) {
        }
        a("onVideoTimeUpdate", jSONObject);
        this.P.setProgress(this.y.getProgress());
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da0e981c28a8e52dd9ae76a8eb994c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da0e981c28a8e52dd9ae76a8eb994c5c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72ce785281c87e3b90e6f1a88b081c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72ce785281c87e3b90e6f1a88b081c96");
        } else if (this.E == null) {
            this.E = this.D.inflate();
            this.F = (TextView) findViewById(R.id.change_position_current);
            this.G = (ProgressBar) findViewById(R.id.change_position_progress);
        }
        this.E.setVisibility(0);
        long j2 = ((float) (i * j)) / 100.0f;
        this.F.setText(ba.a(j2));
        this.G.setProgress(i);
        this.y.setProgress(i);
        this.x.setText(ba.a(j2));
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3aef802f8dd06694b979c0d9ad7dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3aef802f8dd06694b979c0d9ad7dfb");
        } else if (this.E != null) {
            this.E.setVisibility(8);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26643283c285fb0c49002920f3ed00a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26643283c285fb0c49002920f3ed00a4");
            return;
        }
        try {
            jSONObject.put("viewId", this.S);
        } catch (JSONException unused) {
        }
        this.j.a(str, jSONObject, this.T);
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void a(boolean z) {
        this.U = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4e5bc0166015e00cb238d3fbb27343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4e5bc0166015e00cb238d3fbb27343");
            return;
        }
        this.U = true;
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec98d54d4b7586ca0ba0fa36303f80d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec98d54d4b7586ca0ba0fa36303f80d1");
            return;
        }
        this.U = false;
        super.onDetachedFromWindow();
    }

    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5009fc491189459d35aae055adb4bc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5009fc491189459d35aae055adb4bc85");
            return;
        }
        this.V = z;
        if (this.z != null) {
            if (z) {
                this.z.setVisibility(0);
            } else {
                this.z.setVisibility(8);
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.video.e
    public final void setFullScreenDirection(int i) {
        this.g = i;
    }

    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc78c3206b09dcb301f6b096fc931c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc78c3206b09dcb301f6b096fc931c12");
            return;
        }
        this.h = bool;
        g();
        m();
        d();
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b545a733797d386e69ab1033ea95578a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b545a733797d386e69ab1033ea95578a");
            return;
        }
        boolean n = n();
        this.y.setVisibility(n ? 0 : 4);
        this.x.setVisibility(n ? 0 : 8);
        this.d.setVisibility(n ? 0 : 8);
        this.P.setVisibility(n ? 0 : 4);
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92aad145f15ef4a2c4c6c909b0905406", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92aad145f15ef4a2c4c6c909b0905406")).booleanValue();
        }
        if (this.e) {
            if (this.h == null) {
                return true;
            }
            return this.h.booleanValue();
        }
        return false;
    }
}
