package com.sankuai.waimai.business.restaurant.goodsdetail.videoview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PlayerControllerView extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, com.meituan.android.mtplayer.video.callback.a, com.sankuai.waimai.business.restaurant.base.gallery.a {
    @LayoutRes
    private static final int D = 2130968977;
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private boolean C;
    @SuppressLint({"HandlerLeak"})
    private Handler E;
    public BroadcastReceiver b;
    private SeekBar c;
    private ProgressBar d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ViewGroup h;
    private RelativeLayout i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private b o;
    private a p;
    private boolean q;
    private com.meituan.android.mtplayer.video.callback.c r;
    private int s;
    private e t;
    private boolean u;
    private k v;
    private boolean w;
    private boolean x;
    private int y;
    private com.sankuai.waimai.business.restaurant.goodsdetail.videoview.a z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
    }

    @LayoutRes
    public int getLayout() {
        return -1;
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public View getView() {
        return this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public static /* synthetic */ void d(PlayerControllerView playerControllerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, playerControllerView, changeQuickRedirect, false, "8698467f07ce58683d4536179e2ec1c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, playerControllerView, changeQuickRedirect, false, "8698467f07ce58683d4536179e2ec1c6");
        } else if (!playerControllerView.A) {
            if (playerControllerView.r.e()) {
                playerControllerView.r.d();
                playerControllerView.w = true;
            }
            playerControllerView.i();
        } else {
            playerControllerView.A = false;
        }
    }

    public static /* synthetic */ void e(PlayerControllerView playerControllerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, playerControllerView, changeQuickRedirect, false, "28a81db4f2d3cb041a254fa24b067c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, playerControllerView, changeQuickRedirect, false, "28a81db4f2d3cb041a254fa24b067c6c");
        } else if (!playerControllerView.A) {
            if (playerControllerView.r.e()) {
                playerControllerView.r.d();
                playerControllerView.w = true;
            }
            playerControllerView.h();
        } else {
            playerControllerView.A = false;
        }
    }

    public static /* synthetic */ void f(PlayerControllerView playerControllerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, playerControllerView, changeQuickRedirect, false, "2d8bd1cf762175d730fed2bc0df27231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, playerControllerView, changeQuickRedirect, false, "2d8bd1cf762175d730fed2bc0df27231");
        } else if (!playerControllerView.A) {
            if (playerControllerView.s == 0) {
                playerControllerView.a(null, com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(playerControllerView.t.e * 1000));
            } else {
                playerControllerView.a(null, null);
            }
            if (playerControllerView.r == null || playerControllerView.r.e() || playerControllerView.s == 0 || !playerControllerView.w) {
                return;
            }
            playerControllerView.r.c();
        } else {
            playerControllerView.A = false;
        }
    }

    public PlayerControllerView(@NonNull Context context, e eVar, boolean z, com.sankuai.waimai.business.restaurant.goodsdetail.videoview.a aVar, b bVar) {
        this(context, null, -1);
        Object[] objArr = {context, eVar, (byte) 1, aVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38028961ff34c3823d06405d953f472b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38028961ff34c3823d06405d953f472b");
            return;
        }
        this.t = eVar;
        this.u = true;
        this.z = aVar;
        this.o = null;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edcd16c6a075f6a78fc2cc33cda09502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edcd16c6a075f6a78fc2cc33cda09502");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "showInitView", new Object[0]);
            a(this.t);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b44e0222439ed7d94399721191f2cd5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b44e0222439ed7d94399721191f2cd5e");
            } else {
                int a2 = g.a(com.meituan.android.singleton.b.a) - g.a(com.meituan.android.singleton.b.a, 30.0f);
                b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c2.b = getContext();
                c2.c = this.t.d;
                c2.a(a2, (int) (a2 * 0.75f)).a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr4 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a44a0079c6bd6a717e432c061d82c1bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a44a0079c6bd6a717e432c061d82c1bc");
                        } else if (PlayerControllerView.this.j != null) {
                            PlayerControllerView.this.j.setImageBitmap(bitmap);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8e2a8fa19f06cfe970a14ec0b4bb3fae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8e2a8fa19f06cfe970a14ec0b4bb3fae");
                        } else if (PlayerControllerView.this.j != null) {
                            PlayerControllerView.this.j.setImageResource(R.drawable.wm_common_food_default);
                        }
                    }
                });
            }
            if (this.u) {
                c(0);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "eea3a18812155d6677ed08141a5482f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "eea3a18812155d6677ed08141a5482f1");
        } else if (this.u) {
            this.j.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.j.setBackgroundColor(Color.parseColor(DiagnoseLog.COLOR_ERROR));
        } else {
            this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public PlayerControllerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e8f27ce7c5914dfab940cf147820b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e8f27ce7c5914dfab940cf147820b7");
            return;
        }
        this.w = false;
        this.x = false;
        this.A = true;
        this.B = false;
        this.E = new Handler() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e1644d43c01742df7841b09dc59aa3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e1644d43c01742df7841b09dc59aa3b");
                } else if (message.what == 1 && PlayerControllerView.this.q && PlayerControllerView.this.r != null && PlayerControllerView.this.r.e()) {
                    PlayerControllerView.this.e();
                }
            }
        };
        this.b = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
                if (r14.equals("4G") != false) goto L25;
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
                    com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.AnonymousClass3.a
                    java.lang.String r12 = "aae72c4f7744586caec6e288dde17f83"
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
                    com.sankuai.waimai.foundation.utils.log.a.b(r1, r2, r3)
                    java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                    java.lang.String r15 = r15.getAction()
                    boolean r15 = r1.equals(r15)
                    if (r15 == 0) goto Lc6
                    java.lang.String r14 = com.sankuai.waimai.foundation.utils.p.b(r14)
                    java.lang.String r15 = "MTPlayer"
                    java.lang.String r1 = "netReceiver netWorkType=%s"
                    java.lang.Object[] r2 = new java.lang.Object[r10]
                    r2[r9] = r14
                    com.sankuai.waimai.foundation.utils.log.a.b(r15, r1, r2)
                    r15 = -1
                    int r1 = r14.hashCode()
                    r2 = 1621(0x655, float:2.272E-42)
                    if (r1 == r2) goto La5
                    r2 = 1652(0x674, float:2.315E-42)
                    if (r1 == r2) goto L9b
                    r2 = 1683(0x693, float:2.358E-42)
                    if (r1 == r2) goto L92
                    r0 = 1714(0x6b2, float:2.402E-42)
                    if (r1 == r0) goto L88
                    r0 = 2694997(0x291f55, float:3.776495E-39)
                    if (r1 == r0) goto L7e
                    r0 = 1002405936(0x3bbf8030, float:0.0058441386)
                    if (r1 == r0) goto L74
                    r0 = 1959784951(0x74cff1f7, float:1.3180091E32)
                    if (r1 == r0) goto L69
                    goto Laf
                L69:
                    java.lang.String r0 = "invalid"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto Laf
                    r0 = 4
                    goto Lb0
                L74:
                    java.lang.String r0 = "Unavailable"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto Laf
                    r0 = 5
                    goto Lb0
                L7e:
                    java.lang.String r0 = "WiFi"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto Laf
                    r0 = 6
                    goto Lb0
                L88:
                    java.lang.String r0 = "5G"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto Laf
                    r0 = 3
                    goto Lb0
                L92:
                    java.lang.String r1 = "4G"
                    boolean r14 = r14.equals(r1)
                    if (r14 == 0) goto Laf
                    goto Lb0
                L9b:
                    java.lang.String r0 = "3G"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto Laf
                    r0 = 1
                    goto Lb0
                La5:
                    java.lang.String r0 = "2G"
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto Laf
                    r0 = 0
                    goto Lb0
                Laf:
                    r0 = -1
                Lb0:
                    switch(r0) {
                        case 0: goto Lc0;
                        case 1: goto Lc0;
                        case 2: goto Lc0;
                        case 3: goto Lc0;
                        case 4: goto Lba;
                        case 5: goto Lba;
                        case 6: goto Lb4;
                        default: goto Lb3;
                    }
                Lb3:
                    goto Lc6
                Lb4:
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView r14 = com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.this
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.f(r14)
                    goto Lc6
                Lba:
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView r14 = com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.this
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.e(r14)
                    return
                Lc0:
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView r14 = com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.this
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.d(r14)
                    return
                Lc6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.AnonymousClass3.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1637507fa4a255358b72974b05becf92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1637507fa4a255358b72974b05becf92");
            return;
        }
        setTag("PlayerControllerView");
        g();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57ab02adb16006f92f2e7787075c94b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57ab02adb16006f92f2e7787075c94b4");
        } else {
            LayoutInflater.from(getContext()).inflate(getLayout() == -1 ? D : getLayout(), (ViewGroup) this, true);
            this.d = (ProgressBar) findViewById(R.id.pb_circle_loading);
            this.n = (TextView) findViewById(R.id.txt_video_tip);
            this.c = (SeekBar) findViewById(R.id.player_small_screen_seekBar);
            this.f = (ImageView) findViewById(R.id.player_play_icon);
            this.g = (ImageView) findViewById(R.id.img_player_close);
            this.k = (TextView) findViewById(R.id.player_continue);
            this.l = (TextView) findViewById(R.id.txt_player_position);
            this.m = (TextView) findViewById(R.id.txt_player_duration);
            this.e = (ImageView) findViewById(R.id.player_mute_toggle);
            this.h = (ViewGroup) findViewById(R.id.rl_play_progress_bar);
            this.i = (RelativeLayout) findViewById(R.id.rl_cover_view);
            this.j = (ImageView) findViewById(R.id.iv_video_cover);
            if (this.j instanceof RoundedImageView) {
                ((RoundedImageView) this.j).setCornerRadius(g.a(getContext(), 5.0f));
            }
            this.e.setSelected(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", true));
            if (getContext() instanceof Activity) {
                Activity activity = (Activity) getContext();
                if (com.sankuai.waimai.platform.capacity.immersed.a.a(activity)) {
                    int a2 = g.a(activity, 5.0f);
                    ah.a(this.g, a2, g.e(activity) + a2, a2, a2);
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f91619527eb61a5650beb7b1fd17127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f91619527eb61a5650beb7b1fd17127");
            return;
        }
        this.g.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.c.setOnSeekBarChangeListener(this);
        this.i.setOnClickListener(this);
        this.v = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b.class).e().b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).c(new c(this));
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
        this.r = cVar;
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaaa042913daeb4f349a8f22737d72ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaaa042913daeb4f349a8f22737d72ac");
            return;
        }
        this.c.setProgress((i * 100) / i2);
        this.c.setSecondaryProgress(i3);
        this.m.setText(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(i2));
        this.l.setText(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(i));
        this.y = i;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f95d8db7cd963200ec90735f4390054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f95d8db7cd963200ec90735f4390054");
            return;
        }
        int duration = (this.r.getDuration() * seekBar.getProgress()) / 100;
        if (this.r != null) {
            this.r.a(duration);
        }
        if (this.E != null) {
            this.E.removeMessages(1);
            this.E.sendEmptyMessageDelayed(1, PayTask.j);
        }
        if (this.z != null) {
            JudasManualManager.a a2 = JudasManualManager.a("b_i764wl3d").a("c_u4fk4kw");
            a2.b = AppUtil.generatePageInfoKey(getContext());
            a2.a("volume", 1 ^ d()).a("network", p.c(com.meituan.android.singleton.b.a)).a("poi_id", this.z.a).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.goodsdetail.videoview.PlayerControllerView.onClick(android.view.View):void");
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6064a7291157de155f6c8d02e0ddab51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6064a7291157de155f6c8d02e0ddab51");
            return;
        }
        this.s = i;
        switch (i) {
            case -1:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_ERROR", new Object[0]);
                a(getContext().getString(R.string.mtplayer_player_error_tip_unknown), null);
                return;
            case 0:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_IDLE", new Object[0]);
                return;
            case 1:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_PREPARING", new Object[0]);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9554ee1e8176ff064c41e0550858111e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9554ee1e8176ff064c41e0550858111e");
                } else {
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.f, 4);
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.e, 8);
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.h, 8);
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.d, 0);
                    if (this.u) {
                        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 0);
                    } else {
                        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 8);
                    }
                    this.q = false;
                    if (this.E != null) {
                        this.E.removeMessages(1);
                    }
                }
                a(null, null);
                return;
            case 2:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_PREPARED", new Object[0]);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6e78db04ea9312b0411261df39a98097", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6e78db04ea9312b0411261df39a98097");
                } else {
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.d, 8);
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.j, 8);
                }
                setVolumeState(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", true));
                return;
            case 3:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_PLAYING", new Object[0]);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "49b1bdfb76e047d06eaf099ae6712eaa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "49b1bdfb76e047d06eaf099ae6712eaa");
                } else {
                    setPlayPauseBtn(true);
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.d, 8);
                    if (this.q && this.E != null) {
                        this.E.removeCallbacksAndMessages(null);
                        this.E.sendEmptyMessageDelayed(1, PayTask.j);
                    }
                }
                a(null, null);
                return;
            case 4:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_PAUSED", new Object[0]);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d5ebe4026fc5534b3a20e35bcf731b39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d5ebe4026fc5534b3a20e35bcf731b39");
                    return;
                }
                setPlayPauseBtn(false);
                com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.d, 8);
                com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.f, 0);
                com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.e, 0);
                com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.h, 0);
                if (this.u) {
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 0);
                } else {
                    com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 8);
                }
                this.q = true;
                if (this.E != null) {
                    this.E.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            case 5:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_BUFFERING_PLAYING", new Object[0]);
                setLoadingView(0);
                return;
            case 6:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_BUFFERING_PAUSED", new Object[0]);
                setLoadingView(0);
                return;
            case 7:
                com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "STATE_PLAYBACK_COMPLETED", new Object[0]);
                setPlayPauseBtn(false);
                a(this.t);
                com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.j, 0);
                b(1);
                return;
            default:
                return;
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df09ffd208709b148cedda4c2e62f964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df09ffd208709b148cedda4c2e62f964");
            return;
        }
        if (aa.a(str)) {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.n, 8);
        } else {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.n, 0);
            this.n.setText(str);
        }
        if (aa.a(str2)) {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.k, 8);
            return;
        }
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.k, 0);
        this.k.setText(str2);
    }

    private void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d66c62d0d512330256b720584abc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d66c62d0d512330256b720584abc6a");
            return;
        }
        f();
        if (eVar != null) {
            a(null, com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(eVar.e * 1000));
        } else {
            a(null, null);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6b28768333bf590a5a14b2231b81ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6b28768333bf590a5a14b2231b81ca");
            return;
        }
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.f, 0);
        if (this.u) {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 0);
        } else {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 8);
        }
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.e, 8);
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.h, 8);
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.d, 8);
        this.q = false;
        if (this.E != null) {
            this.E.removeCallbacksAndMessages(null);
        }
        if (this.z != null) {
            JudasManualManager.a a2 = JudasManualManager.b("b_z1ff7blt").a("c_u4fk4kw");
            a2.b = AppUtil.generatePageInfoKey(getContext());
            a2.a("volume", !d()).a("network", p.c(com.meituan.android.singleton.b.a)).a("poi_id", this.z.a).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4404b5c5d1167d212750b0528c5ccb2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4404b5c5d1167d212750b0528c5ccb2d");
            return;
        }
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.n, 8);
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.f, 4);
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.k, 8);
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.e, 8);
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.h, 8);
        if (this.u) {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 0);
        } else {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.g, 8);
        }
        this.q = false;
        if (this.E != null) {
            this.E.removeCallbacksAndMessages(null);
        }
    }

    public void setPlayPauseBtn(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06fc4d56b49c9605438a082ac52f2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06fc4d56b49c9605438a082ac52f2bc");
        } else if (this.f != null) {
            this.f.setSelected(z);
        }
    }

    public void setLoadingView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb5c1ffb14d4d035a4dd4b1988b7b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb5c1ffb14d4d035a4dd4b1988b7b53");
        } else {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.d, i);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9dc90f5299710fdafc1e01a1d31f9cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9dc90f5299710fdafc1e01a1d31f9cc");
            return;
        }
        this.r.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49bcbe88b6431a80aa506e1dcf26a3ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49bcbe88b6431a80aa506e1dcf26a3ca");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("MTPlayer", "unRegisterReceiver()", new Object[0]);
        if (this.B) {
            this.B = false;
            getContext().unregisterReceiver(this.b);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e41d6bd3bc4df9b71d68941afb9d66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e41d6bd3bc4df9b71d68941afb9d66a");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("MTPlayer", "registerNetReceiver()", new Object[0]);
        this.B = true;
        this.A = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.b, intentFilter);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5faa96989b5a17a0d1b855d4b0faae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5faa96989b5a17a0d1b855d4b0faae9");
        } else if (!this.A) {
            a(String.format(getContext().getResources().getString(R.string.mtplayer_player_3g_tip_title), this.t.f), this.s != 0 ? getContext().getString(R.string.wm_restaurant_good_video_continue) : com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a(this.t.e * 1000));
            this.x = true;
        } else {
            this.A = false;
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff815c9e2de88f4fa43b398645b19f37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff815c9e2de88f4fa43b398645b19f37");
        } else if (this.z == null || this.t == null) {
        } else {
            JudasManualManager.a a2 = JudasManualManager.a("b_qbrmss30").a("c_u4fk4kw");
            a2.b = AppUtil.generatePageInfoKey(getContext());
            a2.a("network", p.c(com.meituan.android.singleton.b.a)).a("poi_id", this.z.a).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a("video_time", (int) (this.y / 1000)).a("video_size", this.t.f).a("video_close", i).a();
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b8fbe78d03772c556cbd420a30b2e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b8fbe78d03772c556cbd420a30b2e0");
        } else if (this.z != null) {
            JudasManualManager.a a2 = JudasManualManager.a("b_ggfem2lg").a("c_u4fk4kw");
            a2.b = AppUtil.generatePageInfoKey(getContext());
            a2.a("poi_id", this.z.a).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a(UIConfig.FULL_SCREEN, i).a();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47f9b7531888f4ff4b317384837a234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47f9b7531888f4ff4b317384837a234");
            return;
        }
        if (this.r != null) {
            this.r.g();
        }
        this.v.unsubscribe();
        if (this.E != null) {
            this.E.removeCallbacksAndMessages(null);
        }
        b(0);
        if (this.u) {
            c(1);
        }
    }

    public void setVolumeState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c65c6ce92a3f6d4745d47e5ebf9f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c65c6ce92a3f6d4745d47e5ebf9f15");
            return;
        }
        if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "709090a841f76837587fab7fffb2760c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "709090a841f76837587fab7fffb2760c");
            } else {
                this.r.a(0.0f, 0.0f);
            }
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d50c1730805dc8d327d1eaedf785c2e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d50c1730805dc8d327d1eaedf785c2e0");
            } else {
                this.r.a(1.0f, 1.0f);
            }
        }
        if (this.e != null) {
            this.e.setSelected(z);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements rx.functions.b<com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b> {
        public static ChangeQuickRedirect a;
        private ai<View> b;

        @Override // rx.functions.b
        public final /* synthetic */ void call(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b bVar) {
            int streamVolume;
            int streamVolume2;
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6afa522794ee9a9fe8e182ef9b0cee58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6afa522794ee9a9fe8e182ef9b0cee58");
                return;
            }
            View a2 = this.b.a();
            if (!(a2 instanceof PlayerControllerView) || bVar2 == null) {
                return;
            }
            if (bVar2.b == 0) {
                int i = bVar2.d;
                PlayerControllerView playerControllerView = (PlayerControllerView) a2;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = PlayerControllerView.a;
                if (PatchProxy.isSupport(objArr2, playerControllerView, changeQuickRedirect2, false, "cb2673d5d9bdd04bfb48d04eb8277e6a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, playerControllerView, changeQuickRedirect2, false, "cb2673d5d9bdd04bfb48d04eb8277e6a");
                    return;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2b2c59b719cba687ee66d8713558ef95", RobustBitConfig.DEFAULT_VALUE)) {
                    streamVolume = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2b2c59b719cba687ee66d8713558ef95")).intValue();
                } else {
                    AudioManager audioManager = (AudioManager) com.meituan.android.singleton.b.a.getSystemService("audio");
                    streamVolume = audioManager != null ? audioManager.getStreamVolume(1) : 0;
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.goodsdetail.videoview.c.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f653ab076c9481aed7de7675769523ea", RobustBitConfig.DEFAULT_VALUE)) {
                    streamVolume2 = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f653ab076c9481aed7de7675769523ea")).intValue();
                } else {
                    AudioManager audioManager2 = (AudioManager) com.meituan.android.singleton.b.a.getSystemService("audio");
                    streamVolume2 = audioManager2 != null ? audioManager2.getStreamVolume(3) : 0;
                }
                com.sankuai.waimai.foundation.utils.log.a.a("handleKeyDown", "currentSystemVolume = %d, currentMediaVolume = %d", Integer.valueOf(streamVolume), Integer.valueOf(streamVolume2));
                boolean d = playerControllerView.d();
                switch (i) {
                    case 24:
                        if (streamVolume2 <= 0 || !d) {
                            return;
                        }
                        playerControllerView.b(false);
                        return;
                    case 25:
                        if (streamVolume2 != 0 || d) {
                            return;
                        }
                        playerControllerView.b(true);
                        return;
                    default:
                        return;
                }
            } else if (bVar2.b == 1) {
                ((PlayerControllerView) a2).setVolumeState(bVar2.c);
            }
        }

        public c(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75516ecb4fd8123b4686e32562b12c9f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75516ecb4fd8123b4686e32562b12c9f");
                return;
            }
            this.b = new ai<>();
            this.b.a(view);
        }
    }

    public void setOnClickCloseBtnListener(a aVar) {
        this.p = aVar;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14e31c6036b9158abab61954c7ea88ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14e31c6036b9158abab61954c7ea88ec");
        } else if (z) {
        } else {
            this.r.d();
        }
    }

    boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eee331cfee9098f218669f6cf23d94e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eee331cfee9098f218669f6cf23d94e8")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", true);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9dfff75ce3412ff429ee3a776a31b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9dfff75ce3412ff429ee3a776a31b6");
            return;
        }
        setVolumeState(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", true));
        if (this.B) {
            return;
        }
        g();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f261104fb1bca705a4ea7a2df098ff51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f261104fb1bca705a4ea7a2df098ff51");
        } else {
            a(com.meituan.android.singleton.b.a.getString(R.string.mtplayer_player_error_tip_network_disconnected), null);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6bdc44fdb960830c74d7ba92aecc63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6bdc44fdb960830c74d7ba92aecc63");
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", z);
        setVolumeState(z);
    }
}
