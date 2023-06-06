package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, com.meituan.android.mtplayer.video.callback.a, a {
    public static ChangeQuickRedirect a;
    private b A;
    private final int B;
    private final int C;
    @SuppressLint({"HandlerLeak"})
    private Handler D;
    public ImageView b;
    com.meituan.android.mtplayer.video.callback.c c;
    boolean d;
    public int e;
    public final int f;
    public final int g;
    public Context h;
    BroadcastReceiver i;
    private ImageView j;
    private ProgressBar k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private SeekBar p;
    private ViewGroup q;
    private TextView r;
    private TextView s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private View y;
    private Activity z;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public static /* synthetic */ void a(e eVar, int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "95f8d80b0e141acf4cc9b8bc7a3e54db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "95f8d80b0e141acf4cc9b8bc7a3e54db");
            return;
        }
        eVar.i();
        if (eVar.c.e()) {
            eVar.c.d();
            eVar.u = true;
        }
    }

    public static /* synthetic */ void a(e eVar, String str, ImageView imageView) {
        Object[] objArr = {str, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "9c497e23f6a6fa537b5d3e08fa539f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "9c497e23f6a6fa537b5d3e08fa539f9c");
        } else if (imageView == null || eVar.h == null) {
        } else {
            int a2 = g.a(com.meituan.android.singleton.b.a, 113.0f);
            int a3 = g.a(com.meituan.android.singleton.b.a, 85.0f);
            BlurTransformation a4 = BlurTransformation.a(com.meituan.android.singleton.b.a, 0.1f, 0.3f, 0.33f);
            if (com.sankuai.waimai.foundation.core.a.e()) {
                a4.b = false;
            }
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = eVar.h;
            c.c = str;
            b.C0608b a5 = c.a(a2, a3);
            a5.f = ImageQualityUtil.c();
            a5.a(new FixedSizeTransform(a2, a3), a4).a(imageView);
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.v = false;
        return false;
    }

    public static /* synthetic */ void h(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "bdc1a4960227c089fea324be2088ff02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "bdc1a4960227c089fea324be2088ff02");
            return;
        }
        if (eVar.t == 0) {
            eVar.a((String) null, com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(eVar.c.getDuration() * 1000));
        } else {
            eVar.a((String) null, (String) null);
        }
        if (eVar.c == null || eVar.c.e() || eVar.t == 0 || !eVar.u) {
            return;
        }
        eVar.c.c();
    }

    public e(View view, Context context, Activity activity, b bVar) {
        Object[] objArr = {view, context, activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9762bdc8cae11bde73c28ce9d67db98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9762bdc8cae11bde73c28ce9d67db98");
            return;
        }
        this.u = false;
        this.v = true;
        this.d = false;
        this.w = false;
        this.e = 0;
        this.B = 1;
        this.C = 3000;
        this.D = new Handler() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.e.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "607c82f2cc5965db58d0564cc4423c2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "607c82f2cc5965db58d0564cc4423c2d");
                } else if (message.what == 1 && e.this.x && e.this.c != null && e.this.c.e()) {
                    e.this.f();
                }
            }
        };
        this.i = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.PoiVideoController$3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
                if (r14.equals("4G") != false) goto L29;
             */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r14, android.content.Intent r15) {
                /*
                    Method dump skipped, instructions count: 240
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.PoiVideoController$3.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        this.y = view;
        this.h = context;
        this.f = g.a(com.meituan.android.singleton.b.a);
        this.g = Math.round((this.f * 9.0f) / 16.0f);
        this.z = activity;
        this.A = bVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "328c0b7588d066dea12839425a564954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "328c0b7588d066dea12839425a564954");
            return;
        }
        this.b = (ImageView) this.y.findViewById(R.id.iv_poi_video_cover);
        this.j = (ImageView) this.y.findViewById(R.id.iv_play_pause_btn);
        this.k = (ProgressBar) this.y.findViewById(R.id.pb_circle_loading);
        this.l = (ImageView) this.y.findViewById(R.id.iv_mute_toggle_btn);
        this.m = (ImageView) this.y.findViewById(R.id.iv_close_btn);
        this.q = (ViewGroup) this.y.findViewById(R.id.rl_play_progress_bar);
        this.r = (TextView) this.q.findViewById(R.id.txt_player_position);
        this.s = (TextView) this.q.findViewById(R.id.txt_player_duration);
        this.p = (SeekBar) this.q.findViewById(R.id.player_small_screen_seekBar);
        this.o = (TextView) this.y.findViewById(R.id.tv_player_tip);
        this.n = (TextView) this.y.findViewById(R.id.tv_player_text);
        this.y.setLayoutParams(new ViewGroup.LayoutParams(this.f, this.g));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "627e0ad4277cdb34fa4b1f00f09eb0b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "627e0ad4277cdb34fa4b1f00f09eb0b5");
        } else {
            int e = g.e(com.meituan.android.singleton.b.a);
            int a2 = g.a(com.meituan.android.singleton.b.a, 5.0f);
            int i = e + a2;
            ((RelativeLayout.LayoutParams) this.m.getLayoutParams()).setMargins(a2, i, 0, 0);
            ((RelativeLayout.LayoutParams) this.l.getLayoutParams()).setMargins(0, i, a2, 0);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3d9545709c2c80bdf380bd808243ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3d9545709c2c80bdf380bd808243ea0");
        } else {
            this.j.setOnClickListener(this);
            this.m.setOnClickListener(this);
            this.l.setOnClickListener(this);
            this.p.setOnSeekBarChangeListener(this);
            this.p.setOnClickListener(this);
            this.y.setOnClickListener(this);
        }
        e();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f2d00183d7160e809318207c0d17da", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f2d00183d7160e809318207c0d17da");
            return;
        }
        int id = view.getId();
        if (id == R.id.iv_play_pause_btn) {
            b();
        } else if (id == R.id.iv_close_btn) {
            if (this.e == 1) {
                b(0);
            }
        } else if (id == R.id.iv_mute_toggle_btn) {
            a(!this.w);
        } else if (id == R.id.rl_controller_layout) {
            if (this.e == 0 && this.c.e()) {
                b(1);
            } else if (this.e == 1 && this.c.e()) {
                if (this.x) {
                    f();
                } else {
                    g();
                }
            }
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e6295e715a17a6b596d60a7c2f94130", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e6295e715a17a6b596d60a7c2f94130")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
        if (r1.equals("2G") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.e.a
            java.lang.String r10 = "c646576643c4553cfc8e6304dfa0452e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            com.meituan.android.mtplayer.video.callback.c r1 = r11.c
            boolean r1 = r1.e()
            if (r1 == 0) goto L28
            com.meituan.android.mtplayer.video.callback.c r1 = r11.c
            r1.d()
            r11.u = r0
            return
        L28:
            android.content.Context r1 = com.meituan.android.singleton.b.a
            java.lang.String r1 = com.sankuai.waimai.foundation.utils.p.b(r1)
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 1621(0x655, float:2.272E-42)
            r5 = 1
            if (r3 == r4) goto L91
            r0 = 1652(0x674, float:2.315E-42)
            if (r3 == r0) goto L87
            r0 = 1683(0x693, float:2.358E-42)
            if (r3 == r0) goto L7d
            r0 = 1714(0x6b2, float:2.402E-42)
            if (r3 == r0) goto L73
            r0 = 2694997(0x291f55, float:3.776495E-39)
            if (r3 == r0) goto L69
            r0 = 1002405936(0x3bbf8030, float:0.0058441386)
            if (r3 == r0) goto L5f
            r0 = 1959784951(0x74cff1f7, float:1.3180091E32)
            if (r3 == r0) goto L54
            goto L9a
        L54:
            java.lang.String r0 = "invalid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            r0 = 4
            goto L9b
        L5f:
            java.lang.String r0 = "Unavailable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            r0 = 5
            goto L9b
        L69:
            java.lang.String r0 = "WiFi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            r0 = 6
            goto L9b
        L73:
            java.lang.String r0 = "5G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            r0 = 3
            goto L9b
        L7d:
            java.lang.String r0 = "4G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            r0 = 2
            goto L9b
        L87:
            java.lang.String r0 = "3G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9a
            r0 = 1
            goto L9b
        L91:
            java.lang.String r3 = "2G"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L9a
            goto L9b
        L9a:
            r0 = -1
        L9b:
            switch(r0) {
                case 0: goto La3;
                case 1: goto La3;
                case 2: goto La3;
                case 3: goto La3;
                case 4: goto L9f;
                case 5: goto L9f;
                case 6: goto Laa;
                default: goto L9e;
            }
        L9e:
            goto Lb5
        L9f:
            r11.i()
            goto Lb5
        La3:
            int r0 = r11.e
            if (r0 != r5) goto Lb0
            r11.h()
        Laa:
            com.meituan.android.mtplayer.video.callback.c r0 = r11.c
            r0.c()
            goto Lb5
        Lb0:
            com.meituan.android.mtplayer.video.callback.c r0 = r11.c
            r0.c()
        Lb5:
            java.lang.String r0 = "b_waimai_y0fk1qoe_mc"
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = com.sankuai.waimai.log.judas.JudasManualManager.a(r0)
            android.app.Activity r1 = r11.z
            java.lang.String r1 = com.meituan.android.common.statistics.utils.AppUtil.generatePageInfoKey(r1)
            r0.b = r1
            java.lang.String r1 = "c_CijEL"
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = r0.a(r1)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.e.b():void");
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9a67ae537c6f735e041bc6ebd86d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9a67ae537c6f735e041bc6ebd86d72");
            return;
        }
        this.w = z;
        if (z) {
            this.c.a(0.0f, 0.0f);
        } else {
            this.c.a(1.0f, 1.0f);
        }
        if (this.l != null) {
            this.l.setSelected(z);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
        this.c = cVar;
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final View getView() {
        return this.y;
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f35c2594649b5d1ebfda7ea92f55fb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f35c2594649b5d1ebfda7ea92f55fb1");
            return;
        }
        this.t = i;
        switch (i) {
            case -1:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_ERROR", new Object[0]);
                a(com.meituan.android.singleton.b.a.getString(R.string.mtplayer_player_error_tip_unknown), (String) null);
                return;
            case 0:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_IDLE", new Object[0]);
                return;
            case 1:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_PREPARING", new Object[0]);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a17fc881054b307d38ff8ca1ac3c0de3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a17fc881054b307d38ff8ca1ac3c0de3");
                    return;
                }
                this.j.setVisibility(4);
                c(0);
                this.k.setVisibility(0);
                e(0);
                f(8);
                d(8);
                a((String) null, (String) null);
                d();
                return;
            case 2:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_PREPARED", new Object[0]);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b951b1fc4aab89e152ada4c94db55892", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b951b1fc4aab89e152ada4c94db55892");
                    return;
                }
                this.j.setVisibility(4);
                c(0);
                this.k.setVisibility(8);
                e(0);
                f(8);
                d(8);
                a((String) null, (String) null);
                return;
            case 3:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_PLAYING", new Object[0]);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e08e3ef8913691d99bbc74951620dad5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e08e3ef8913691d99bbc74951620dad5");
                    return;
                }
                if (this.e == 0) {
                    f();
                } else if (this.e == 1) {
                    c(8);
                }
                a((String) null, (String) null);
                this.j.setSelected(true);
                l();
                return;
            case 4:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_PAUSED", new Object[0]);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "42797613fcf2dbff30bcb30892b218e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "42797613fcf2dbff30bcb30892b218e4");
                    return;
                }
                this.j.setSelected(false);
                g();
                return;
            case 5:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_BUFFERING_PLAYING", new Object[0]);
                return;
            case 6:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_BUFFERING_PAUSED", new Object[0]);
                return;
            case 7:
                com.sankuai.waimai.foundation.utils.log.a.e("PoiVideoBlock", "STATE_PLAYBACK_COMPLETED", new Object[0]);
                c();
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5237178f9f8641c97e8b74fefad7b995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5237178f9f8641c97e8b74fefad7b995");
            return;
        }
        this.p.setProgress((i * 100) / i2);
        this.p.setSecondaryProgress(i3);
        this.s.setText(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(i2));
        this.r.setText(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1280e230de54e5069a734e10ce939169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1280e230de54e5069a734e10ce939169");
            return;
        }
        this.c.a((this.c.getDuration() * seekBar.getProgress()) / 100);
        l();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c181260970cbea1591d62fb209221725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c181260970cbea1591d62fb209221725");
            return;
        }
        this.j.setSelected(false);
        this.j.setVisibility(0);
        c(0);
        this.k.setVisibility(8);
        e(0);
        this.l.setVisibility(8);
        this.q.setVisibility(8);
        if (this.t == 0) {
            a((String) null, (String) null);
        } else if (this.t == 1) {
            a((String) null, com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.c.getDuration() * 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbd3699c416dc9324faaf799418cff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbd3699c416dc9324faaf799418cff5");
            return;
        }
        this.j.setVisibility(4);
        c(8);
        this.k.setVisibility(8);
        e(0);
        f(8);
        d(8);
        if (this.e == 1) {
            this.x = false;
        }
        d();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6250791081393c7c33332bc964f32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6250791081393c7c33332bc964f32c");
            return;
        }
        this.j.setVisibility(0);
        c(8);
        this.k.setVisibility(8);
        e(0);
        f(0);
        d(0);
        if (this.e == 1) {
            this.x = true;
        }
        l();
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e983fd51f3eb08a9fcd49cca5d11f62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e983fd51f3eb08a9fcd49cca5d11f62");
            return;
        }
        if (aa.a(str)) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            this.o.setText(str);
        }
        if (aa.a(str2) || this.e == 0) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        this.n.setText(str2);
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9468cff9663c1f87cb17598c2bfa1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9468cff9663c1f87cb17598c2bfa1dd");
        } else if (this.t == 7) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(i);
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be71dca7739a4755588c2cffd4fd568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be71dca7739a4755588c2cffd4fd568");
        } else if (this.e == 0) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(i);
        }
    }

    private void e(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228bd1fe89d2cfb729a31d048d9c2b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228bd1fe89d2cfb729a31d048d9c2b3c");
        } else if (this.e == 0) {
            this.m.setVisibility(8);
        } else if (this.e == 1) {
            this.m.setVisibility(0);
        }
    }

    private void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e5615c10c48a3932d37cc9e58e8a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e5615c10c48a3932d37cc9e58e8a11");
        } else if (this.e == 0) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(i);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22990a4253b6e960abfd28af4ec9ac14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22990a4253b6e960abfd28af4ec9ac14");
        } else if (f.a(this.h)) {
        } else {
            this.e = i;
            if (this.A != null) {
                this.A.a(i);
            }
            j();
            g(i);
            k();
        }
    }

    private void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0d66a8da265bcb3a554ec55beabc06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0d66a8da265bcb3a554ec55beabc06");
        } else if (i != 0) {
            if (i == 1) {
                g();
            }
        } else if (this.c.e()) {
            f();
        } else {
            g();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52850af65faccdbfa495ced68dcef82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52850af65faccdbfa495ced68dcef82");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.y.setLayoutParams(layoutParams);
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7387d93b04f2563207028915ccf81f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7387d93b04f2563207028915ccf81f");
        } else if (this.e == 0) {
            this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (this.e == 1) {
            this.b.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b0c04678a8e11559da8b02d2c43dd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b0c04678a8e11559da8b02d2c43dd8");
        } else if (this.D != null) {
            this.D.removeCallbacksAndMessages(null);
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a18ab1c4f7d4bcad357b0a6303231ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a18ab1c4f7d4bcad357b0a6303231ab2");
        } else if (this.D == null) {
        } else {
            this.D.removeCallbacksAndMessages(null);
            if (this.x && this.c != null && this.c.e() && this.e == 1) {
                this.D.sendEmptyMessageDelayed(1, PayTask.j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc94fc41a25f4ddba20a1a227e294929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc94fc41a25f4ddba20a1a227e294929");
        } else if (this.d) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("PoiVideoBlock", "registerNetReceiver()", new Object[0]);
            this.d = true;
            this.v = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (this.h != null) {
                this.h.registerReceiver(this.i, intentFilter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4741e60384c39be620abe131af97b03d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4741e60384c39be620abe131af97b03d");
            return;
        }
        ae.a(getView(), com.meituan.android.singleton.b.a.getResources().getString(R.string.mtplayer_player_3g_tip_title_without_num));
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4f71ccdd10792798181581662004d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4f71ccdd10792798181581662004d7");
        } else {
            a(com.meituan.android.singleton.b.a.getString(R.string.mtplayer_player_error_tip_network_disconnected), (String) null);
        }
    }
}
