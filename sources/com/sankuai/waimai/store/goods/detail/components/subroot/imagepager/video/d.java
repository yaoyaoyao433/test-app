package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
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
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.util.ao;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, com.meituan.android.mtplayer.video.callback.a {
    public static ChangeQuickRedirect a;
    private a A;
    boolean b;
    public com.meituan.android.mtplayer.video.callback.c c;
    LiveInfo d;
    private SeekBar e;
    private ProgressBar f;
    private ImageView g;
    private ImageView h;
    private ViewGroup i;
    private RelativeLayout j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private int p;
    private com.sankuai.waimai.platform.domain.core.goods.e q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    @NonNull
    private final b x;
    private BroadcastReceiver y;
    @SuppressLint({"HandlerLeak"})
    private Handler z;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "8fac7a271ad433c6150a95a0069dd3c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "8fac7a271ad433c6150a95a0069dd3c8");
        } else if (!dVar.t) {
            if (dVar.c != null && dVar.c.e()) {
                dVar.c.d();
                dVar.r = true;
            }
            dVar.m();
        } else {
            dVar.t = false;
        }
    }

    public static /* synthetic */ void b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "829164b30e0182bdb5deac400dae526d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "829164b30e0182bdb5deac400dae526d");
        } else if (!dVar.t) {
            if (dVar.c != null && dVar.c.e()) {
                dVar.c.d();
                dVar.r = true;
            }
            dVar.l();
        } else {
            dVar.t = false;
        }
    }

    public static /* synthetic */ void c(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "5fce008bc9600d4ffc180fd640053f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "5fce008bc9600d4ffc180fd640053f3b");
        } else if (!dVar.t) {
            if (dVar.p == 0) {
                dVar.a(null, ao.a(dVar.q.e * 1000));
            } else {
                dVar.a(null, null);
            }
            if (dVar.c == null || dVar.c.e() || dVar.p == 0 || !dVar.r) {
                return;
            }
            dVar.c.c();
        } else {
            dVar.t = false;
        }
    }

    public d(@NonNull Context context, @NonNull com.sankuai.waimai.platform.domain.core.goods.e eVar, b bVar, a aVar) {
        super(context);
        Object[] objArr = {context, eVar, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26c86b4a77ba95ddba2448e6fea21b3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26c86b4a77ba95ddba2448e6fea21b3f");
            return;
        }
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = false;
        this.w = false;
        this.y = new BroadcastReceiver() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.SGDetailVideoPlayBlock$1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
                if (r14.equals("4G") != false) goto L23;
             */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r14, android.content.Intent r15) {
                /*
                    r13 = this;
                    r0 = 2
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    r9 = 0
                    r8[r9] = r14
                    r10 = 1
                    r8[r10] = r15
                    com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.SGDetailVideoPlayBlock$1.a
                    java.lang.String r12 = "5785b2f23ee42cd404c7af6704cc45f2"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r13
                    r3 = r11
                    r5 = r12
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L1e
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
                    return
                L1e:
                    java.lang.String r1 = "MTPlayer"
                    java.lang.String r2 = "netReceiver onReceive()"
                    java.lang.Object[] r3 = new java.lang.Object[r9]
                    com.sankuai.shangou.stone.util.log.a.a(r1, r2, r3)
                    java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                    java.lang.String r15 = r15.getAction()
                    boolean r15 = r1.equals(r15)
                    if (r15 == 0) goto Lb8
                    java.lang.String r14 = com.sankuai.waimai.foundation.utils.p.b(r14)
                    java.lang.String r15 = "MTPlayer"
                    java.lang.String r1 = "netReceiver netWorkType=%s"
                    java.lang.Object[] r2 = new java.lang.Object[r10]
                    r2[r9] = r14
                    com.sankuai.shangou.stone.util.log.a.a(r15, r1, r2)
                    r15 = -1
                    int r1 = r14.hashCode()
                    r2 = 1621(0x655, float:2.272E-42)
                    if (r1 == r2) goto L97
                    r2 = 1652(0x674, float:2.315E-42)
                    if (r1 == r2) goto L8d
                    r2 = 1683(0x693, float:2.358E-42)
                    if (r1 == r2) goto L84
                    r0 = 2694997(0x291f55, float:3.776495E-39)
                    if (r1 == r0) goto L7a
                    r0 = 1002405936(0x3bbf8030, float:0.0058441386)
                    if (r1 == r0) goto L70
                    r0 = 1959784951(0x74cff1f7, float:1.3180091E32)
                    if (r1 == r0) goto L65
                    goto La1
                L65:
                    java.lang.String r0 = "invalid"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto La1
                    r0 = 3
                    goto La2
                L70:
                    java.lang.String r0 = "Unavailable"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto La1
                    r0 = 4
                    goto La2
                L7a:
                    java.lang.String r0 = "WiFi"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto La1
                    r0 = 5
                    goto La2
                L84:
                    java.lang.String r1 = "4G"
                    boolean r14 = r14.equals(r1)
                    if (r14 == 0) goto La1
                    goto La2
                L8d:
                    java.lang.String r0 = "3G"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto La1
                    r0 = 1
                    goto La2
                L97:
                    java.lang.String r0 = "2G"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto La1
                    r0 = 0
                    goto La2
                La1:
                    r0 = -1
                La2:
                    switch(r0) {
                        case 0: goto Lb2;
                        case 1: goto Lb2;
                        case 2: goto Lb2;
                        case 3: goto Lac;
                        case 4: goto Lac;
                        case 5: goto La6;
                        default: goto La5;
                    }
                La5:
                    goto Lb8
                La6:
                    com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d r14 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.this
                    com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.c(r14)
                    goto Lb8
                Lac:
                    com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d r14 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.this
                    com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.b(r14)
                    return
                Lb2:
                    com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d r14 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.this
                    com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.a(r14)
                    return
                Lb8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.SGDetailVideoPlayBlock$1.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        this.z = new Handler() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c1f51a47b373cc912024f20095033f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c1f51a47b373cc912024f20095033f7");
                } else if (message.what == 1 && d.this.b && d.this.c != null && d.this.c.e()) {
                    d.this.g();
                }
            }
        };
        this.q = eVar;
        if (bVar == null) {
            this.x = new b();
        } else {
            this.x = bVar;
        }
        this.A = aVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2da438c92da072b812f8e00a53dc1f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2da438c92da072b812f8e00a53dc1f") : layoutInflater.inflate(R.layout.wm_sc_detail_player_cover_controller, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c712adaa928dcf53c258003807b3af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c712adaa928dcf53c258003807b3af");
            return;
        }
        super.onViewCreated();
        getView().setOnClickListener(this);
        this.f = (ProgressBar) findView(R.id.pb_circle_loading);
        this.o = (TextView) findView(R.id.txt_video_tip);
        this.o.setBackground(com.sankuai.waimai.store.util.e.b(this.mContext, (int) R.color.wm_sc_good_list_black9, (int) R.dimen.wm_sc_common_dimen_14));
        this.e = (SeekBar) findView(R.id.player_small_screen_seekBar);
        this.h = (ImageView) findView(R.id.player_play_icon);
        this.l = (TextView) findView(R.id.player_continue);
        this.m = (TextView) findView(R.id.txt_player_position);
        this.n = (TextView) findView(R.id.txt_player_duration);
        this.g = (ImageView) findView(R.id.player_mute_toggle);
        this.i = (ViewGroup) findView(R.id.rl_play_progress_bar);
        this.j = (RelativeLayout) findView(R.id.rl_cover_view);
        this.k = (ImageView) findView(R.id.iv_video_cover);
        this.g.setSelected(e());
        d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41c8df71b873a9c9651b2f37128ce63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41c8df71b873a9c9651b2f37128ce63c");
        } else {
            this.g.setOnClickListener(this);
            this.h.setOnClickListener(this);
            this.e.setOnSeekBarChangeListener(this);
            this.j.setOnClickListener(this);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d0d3d431f2a3ba7c56d82824603a2482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d0d3d431f2a3ba7c56d82824603a2482");
        } else {
            com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "showInitView", new Object[0]);
            a(this.q);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "39940a31232332217e840c3b63af72b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "39940a31232332217e840c3b63af72b3");
            } else {
                b.C0608b a2 = m.a(this.q.d, ImageQualityUtil.a());
                a2.b = getContext();
                a2.b(h.a(getContext())).a(new b.a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr5 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f4ec3b9c99784b83e98c7d9bb24521fe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f4ec3b9c99784b83e98c7d9bb24521fe");
                        } else {
                            d.this.k.setImageBitmap(bitmap);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6e6136e05a085e33b20651a17a293074", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6e6136e05a085e33b20651a17a293074");
                        } else {
                            d.this.k.setImageResource(R.drawable.wm_sc_common_poi_error);
                        }
                    }
                });
            }
        }
        this.w = true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a3c99244300d42aea3306d479698f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a3c99244300d42aea3306d479698f9");
        } else if (this.w) {
            if (this.c != null) {
                this.c.d();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fb1ce8547f90475fac3f71c4fd5a3e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fb1ce8547f90475fac3f71c4fd5a3e3");
                return;
            }
            com.sankuai.shangou.stone.util.log.a.b("MTPlayer", "unRegisterReceiver()", new Object[0]);
            if (this.u) {
                this.u = false;
                getContext().unregisterReceiver(this.y);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd0bebc0ee7705024faec74d6c51a40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd0bebc0ee7705024faec74d6c51a40");
        } else if (this.w) {
            b(e());
            d();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ebdf50406f055b99e97d8735c40ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ebdf50406f055b99e97d8735c40ab9");
            return;
        }
        if (this.c != null) {
            this.c.g();
        }
        if (this.z != null) {
            this.z.removeCallbacksAndMessages(null);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4995167a6e6f181fb28feba3ffea962", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4995167a6e6f181fb28feba3ffea962")).booleanValue() : this.x.b && "WiFi".equals(p.b(this.mContext)) && !this.v;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9043ef2cc167f5b9aa546bc379920c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9043ef2cc167f5b9aa546bc379920c10");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.b("MTPlayer", "registerNetReceiver()", new Object[0]);
        if (this.u) {
            return;
        }
        this.u = true;
        this.t = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.y, intentFilter);
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
        this.c = cVar;
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4c4c27d3c014ec6fc191f40e9fdb97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4c4c27d3c014ec6fc191f40e9fdb97");
            return;
        }
        this.p = i;
        switch (i) {
            case -1:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_ERROR", new Object[0]);
                a(getContext().getString(R.string.wm_sc_player_error_tip_unknown), null);
                return;
            case 0:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_IDLE", new Object[0]);
                return;
            case 1:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PREPARING", new Object[0]);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94a5890d585064ef85c015d27a17cad2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94a5890d585064ef85c015d27a17cad2");
                } else {
                    e.a(this.h, 4);
                    e.a(this.g, 8);
                    e.a(this.i, 8);
                    e.a(this.f, 0);
                    this.b = false;
                    if (this.z != null) {
                        this.z.removeMessages(1);
                    }
                }
                a(null, null);
                return;
            case 2:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PREPARED", new Object[0]);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f411e9d60f6b41bdd0aaf1857b1bde67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f411e9d60f6b41bdd0aaf1857b1bde67");
                } else {
                    e.a(this.f, 8);
                    e.a(this.k, 8);
                }
                b(e());
                return;
            case 3:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PLAYING", new Object[0]);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "998608c00c91318ac85e06924331bd2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "998608c00c91318ac85e06924331bd2a");
                } else {
                    a(true);
                    e.a(this.f, 8);
                    if (this.b && this.z != null) {
                        this.z.removeCallbacksAndMessages(null);
                        this.z.sendEmptyMessageDelayed(1, PayTask.j);
                    }
                }
                a(null, null);
                return;
            case 4:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PAUSED", new Object[0]);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a243f6d89e6360dceba25946a4285f97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a243f6d89e6360dceba25946a4285f97");
                    return;
                }
                a(false);
                e.a(this.f, 8);
                e.a(this.h, 0);
                e.a(this.g, 0);
                e.a(this.i, 0);
                this.b = true;
                if (this.z != null) {
                    this.z.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            case 5:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_BUFFERING_PLAYING", new Object[0]);
                b(0);
                return;
            case 6:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_BUFFERING_PAUSED", new Object[0]);
                b(0);
                return;
            case 7:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PLAYBACK_COMPLETED", new Object[0]);
                a(false);
                a(this.q);
                e.a(this.k, 0);
                return;
            default:
                return;
        }
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250dc0ae9f5143594463622b70f10419", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250dc0ae9f5143594463622b70f10419")).booleanValue() : com.sankuai.waimai.foundation.core.service.player.a.a().isPlayerMuting();
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b910bff36e03b9d16cc3c670e6387520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b910bff36e03b9d16cc3c670e6387520");
            return;
        }
        if (t.a(str)) {
            e.a(this.o, 8);
        } else {
            e.a(this.o, 0);
            this.o.setText(str);
        }
        if (t.a(str2)) {
            e.a(this.l, 8);
            return;
        }
        e.a(this.l, 0);
        this.l.setText(str2);
    }

    private void a(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3138df9aa4501fedf5d4e56ca031bff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3138df9aa4501fedf5d4e56ca031bff2");
            return;
        }
        f();
        if (eVar != null) {
            a(null, ao.a(eVar.e * 1000));
        } else {
            a(null, null);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6155af73cdab382b5f4d8c9049d528d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6155af73cdab382b5f4d8c9049d528d5");
            return;
        }
        e.a(this.h, 0);
        e.a(this.g, 8);
        e.a(this.i, 8);
        e.a(this.f, 8);
        this.b = false;
        if (this.z != null) {
            this.z.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "550daca203a29636c45ad1eb26e0df45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "550daca203a29636c45ad1eb26e0df45");
            return;
        }
        e.a(this.o, 8);
        e.a(this.h, 4);
        e.a(this.l, 8);
        e.a(this.g, 8);
        e.a(this.i, 8);
        this.b = false;
        if (this.z != null) {
            this.z.removeCallbacksAndMessages(null);
        }
        if (this.A != null) {
            this.A.b(false);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1bafd0b0237db028bd7cc078611834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1bafd0b0237db028bd7cc078611834");
        } else if (this.h != null) {
            this.h.setSelected(z);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89edcb8feb76442caf5802ce785ddeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89edcb8feb76442caf5802ce785ddeb");
            return;
        }
        if (z) {
            h();
        } else {
            i();
        }
        if (this.g != null) {
            this.g.setSelected(z);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515dfb362f4d17efcd6c14ed3e3857f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515dfb362f4d17efcd6c14ed3e3857f4");
        } else if (this.c != null) {
            this.c.a(0.0f, 0.0f);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ebaf009b8b348da6fc9068ae2c8aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ebaf009b8b348da6fc9068ae2c8aed");
            return;
        }
        float a2 = ao.a();
        if (this.c != null) {
            this.c.a(a2, a2);
        }
    }

    private void b(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3186013578130c0a031a54c74e1e0d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3186013578130c0a031a54c74e1e0d58");
        } else {
            e.a(this.f, 0);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b1032d9dc2ed7dc24bfcc0723182e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b1032d9dc2ed7dc24bfcc0723182e7");
        } else if (i2 == 0) {
        } else {
            this.e.setProgress((i * 100) / i2);
            this.e.setSecondaryProgress(i3);
            this.n.setText(ao.a(i2));
            this.m.setText(ao.a(i));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "296c38d3411e9d7fcc45083e76174257", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "296c38d3411e9d7fcc45083e76174257");
            return;
        }
        int id = view.getId();
        if (id == R.id.player_play_icon) {
            if (j()) {
                b();
            } else {
                k();
            }
        } else if (id == R.id.player_mute_toggle) {
            boolean z = !e() ? 1 : 0;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e6d3d1a406128c12fea7d549709e075", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e6d3d1a406128c12fea7d549709e075");
                return;
            }
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4ca9970a44e8d7201f98f1257c220c75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4ca9970a44e8d7201f98f1257c220c75");
            } else {
                com.sankuai.waimai.foundation.core.service.player.a.a().setPlayerMuting(z);
            }
            b(z);
        } else if (id == R.id.rl_cover_view && j()) {
            if (this.b) {
                g();
                return;
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00b26bcfdc1ea43a1855c78cb580405a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00b26bcfdc1ea43a1855c78cb580405a");
                return;
            }
            e.a(this.o, 8);
            e.a(this.h, 0);
            e.a(this.l, 8);
            e.a(this.g, 0);
            e.a(this.i, 0);
            this.b = true;
            if (this.z != null) {
                this.z.removeCallbacksAndMessages(null);
                this.z.sendEmptyMessageDelayed(1, PayTask.j);
            }
            if (this.A != null) {
                this.A.b(true);
            }
        }
    }

    private boolean j() {
        return this.p == 3;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815a98f812df9f844368b92776cc01e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815a98f812df9f844368b92776cc01e8")).booleanValue();
        }
        if ((this.d == null || !this.d.isLive()) && c()) {
            k();
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        if (r1.equals("2G") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.a
            java.lang.String r10 = "bb3dcdedf0b25341ebc3286abcdd2319"
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
            if (r1 == 0) goto Lac
            boolean r1 = r11.w
            if (r1 != 0) goto L22
            goto Lac
        L22:
            com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a r1 = r11.A
            r2 = 1
            if (r1 == 0) goto L30
            com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a r1 = r11.A
            boolean r3 = r11.c()
            r1.a(r2, r3)
        L30:
            r11.v = r2
            android.content.Context r1 = com.meituan.android.singleton.b.a
            java.lang.String r1 = com.sankuai.waimai.foundation.utils.p.b(r1)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1621(0x655, float:2.272E-42)
            if (r4 == r5) goto L8c
            r0 = 1652(0x674, float:2.315E-42)
            if (r4 == r0) goto L82
            r0 = 1683(0x693, float:2.358E-42)
            if (r4 == r0) goto L78
            r0 = 2694997(0x291f55, float:3.776495E-39)
            if (r4 == r0) goto L6e
            r0 = 1002405936(0x3bbf8030, float:0.0058441386)
            if (r4 == r0) goto L64
            r0 = 1959784951(0x74cff1f7, float:1.3180091E32)
            if (r4 == r0) goto L59
            goto L95
        L59:
            java.lang.String r0 = "invalid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L95
            r0 = 3
            goto L96
        L64:
            java.lang.String r0 = "Unavailable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L95
            r0 = 4
            goto L96
        L6e:
            java.lang.String r0 = "WiFi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L95
            r0 = 5
            goto L96
        L78:
            java.lang.String r0 = "4G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L95
            r0 = 2
            goto L96
        L82:
            java.lang.String r0 = "3G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L95
            r0 = 1
            goto L96
        L8c:
            java.lang.String r2 = "2G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L95
            goto L96
        L95:
            r0 = -1
        L96:
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L9e;
                case 2: goto L9e;
                case 3: goto L9a;
                case 4: goto L9a;
                case 5: goto La6;
                default: goto L99;
            }
        L99:
            goto Lab
        L9a:
            r11.l()
            return
        L9e:
            boolean r0 = r11.s
            if (r0 != 0) goto La6
            r11.m()
            return
        La6:
            com.meituan.android.mtplayer.video.callback.c r0 = r11.c
            r0.c()
        Lab:
            return
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.d.k():void");
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa4e6302beb039a9c7b207c6b03f984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa4e6302beb039a9c7b207c6b03f984");
        } else if (this.c == null || !this.w) {
        } else {
            if (this.A != null) {
                this.A.a(false, c());
            }
            this.c.d();
            this.r = false;
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11ca929a1419cf06ca86e05654196ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11ca929a1419cf06ca86e05654196ca");
        } else if (!this.t) {
            a(String.format(getContext().getResources().getString(R.string.wm_sc_player_3g_tip_title), this.q.f), this.p != 0 ? getContext().getString(R.string.wm_sc_restaurant_good_video_continue) : ao.a(this.q.e * 1000));
            this.s = true;
        } else {
            this.t = false;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0136a8aef8143d576ef3037fea1493e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0136a8aef8143d576ef3037fea1493e2");
        } else if (this.c == null) {
        } else {
            int duration = (this.c.getDuration() * seekBar.getProgress()) / 100;
            if (this.c != null) {
                this.c.a(duration);
            }
            if (this.z != null) {
                this.z.removeMessages(1);
                this.z.sendEmptyMessageDelayed(1, PayTask.j);
            }
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "902467910fb17cf9d9d25ba6192db079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "902467910fb17cf9d9d25ba6192db079");
        } else {
            a(com.meituan.android.singleton.b.a.getString(R.string.wm_sc_player_error_tip_network_disconnected), null);
        }
    }
}
