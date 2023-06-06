package com.sankuai.waimai.business.restaurant.base.gallery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mtplayer.video.callback.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.goods.e;
import java.util.HashMap;
import java.util.Map;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GalleryVideoControlPanel extends FrameLayout implements com.meituan.android.mtplayer.video.callback.a, com.sankuai.waimai.business.restaurant.base.gallery.a {
    public static ChangeQuickRedirect a;
    private View b;
    private ProgressBar c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private c g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private e m;
    private String n;
    private int o;
    private int p;
    private String q;
    private boolean r;
    private boolean s;
    private k t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private BroadcastReceiver y;

    @Override // com.meituan.android.mtplayer.video.callback.a
    public View getView() {
        return this;
    }

    public static /* synthetic */ void a(GalleryVideoControlPanel galleryVideoControlPanel) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, galleryVideoControlPanel, changeQuickRedirect, false, "3be2079520c6831caddc9170465a9876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, galleryVideoControlPanel, changeQuickRedirect, false, "3be2079520c6831caddc9170465a9876");
        } else if (galleryVideoControlPanel.g.e()) {
            galleryVideoControlPanel.g.d();
        } else {
            galleryVideoControlPanel.g.c();
        }
    }

    public static /* synthetic */ boolean b(GalleryVideoControlPanel galleryVideoControlPanel, boolean z) {
        galleryVideoControlPanel.i = false;
        return false;
    }

    public GalleryVideoControlPanel(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092dcb90d545bb2cbc2552e4f9a624d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092dcb90d545bb2cbc2552e4f9a624d8");
            return;
        }
        this.h = true;
        this.i = true;
        this.j = false;
        this.p = -1;
        this.r = false;
        this.s = false;
        this.u = true;
        this.v = 0;
        this.w = 0;
        this.x = -1;
        this.y = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.3
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a92a401f00577954559a5559e144f98f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a92a401f00577954559a5559e144f98f");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "netReceiver onReceive()", new Object[0]);
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (!GalleryVideoControlPanel.this.i) {
                        com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "netReceiver netWorkType=%s", GalleryVideoControlPanel.this.n);
                        GalleryVideoControlPanel.this.f();
                        return;
                    }
                    GalleryVideoControlPanel.b(GalleryVideoControlPanel.this, false);
                }
            }
        };
    }

    public GalleryVideoControlPanel(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f80fbad460662b5b0c819aa722b56c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f80fbad460662b5b0c819aa722b56c7");
            return;
        }
        this.h = true;
        this.i = true;
        this.j = false;
        this.p = -1;
        this.r = false;
        this.s = false;
        this.u = true;
        this.v = 0;
        this.w = 0;
        this.x = -1;
        this.y = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.3
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a92a401f00577954559a5559e144f98f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a92a401f00577954559a5559e144f98f");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "netReceiver onReceive()", new Object[0]);
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (!GalleryVideoControlPanel.this.i) {
                        com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "netReceiver netWorkType=%s", GalleryVideoControlPanel.this.n);
                        GalleryVideoControlPanel.this.f();
                        return;
                    }
                    GalleryVideoControlPanel.b(GalleryVideoControlPanel.this, false);
                }
            }
        };
    }

    public GalleryVideoControlPanel(@NonNull Context context, e eVar, boolean z, int i, int i2, String str, int i3) {
        this(context);
        boolean z2 = false;
        Object[] objArr = {context, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70f8af592e920770e6c3f0034fc60da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70f8af592e920770e6c3f0034fc60da");
            return;
        }
        setTag("PlayerControllerView");
        this.m = eVar;
        this.k = z;
        this.l = true;
        this.o = i;
        this.p = i2;
        this.q = str;
        this.x = i3;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b688ff04efc12474f7299f50610832d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b688ff04efc12474f7299f50610832d5");
        } else {
            this.b = LayoutInflater.from(getContext()).inflate(R.layout.wm_restaurant_gallery_video_control_panel, (ViewGroup) this, true);
            this.c = (ProgressBar) this.b.findViewById(R.id.pb_play_progress);
            this.d = (ImageView) this.b.findViewById(R.id.tv_video_cover);
            this.f = (ImageView) this.b.findViewById(R.id.iv_btn_play);
            this.e = (ImageView) this.b.findViewById(R.id.tv_player_loading);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19c03efcada4e8fa7135bfa590f7e1bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19c03efcada4e8fa7135bfa590f7e1bf");
            } else {
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = getContext();
                c.c = this.m.d;
                c.e = 1;
                c.a(this.d);
                this.d.setVisibility(0);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dd7c01c799344dff0ba63e8fc78b86b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dd7c01c799344dff0ba63e8fc78b86b7");
        } else {
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ab83d224c1e5bb33bc7af9363103b346", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ab83d224c1e5bb33bc7af9363103b346");
                    } else {
                        GalleryVideoControlPanel.a(GalleryVideoControlPanel.this);
                    }
                }
            });
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "37c8d59e292c779846fd596af6a3b247", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "37c8d59e292c779846fd596af6a3b247");
                    } else {
                        GalleryVideoControlPanel.a(GalleryVideoControlPanel.this);
                    }
                }
            });
            this.t = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b.class).e().b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).c(new a(this));
        }
        d();
        f();
        String str2 = eVar.c;
        if (!aa.a(str2) && str2.startsWith("http")) {
            z2 = true;
        }
        this.u = z2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements rx.functions.b<com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b> {
        public static ChangeQuickRedirect a;
        private ai<GalleryVideoControlPanel> b;

        @Override // rx.functions.b
        public final /* synthetic */ void call(com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b bVar) {
            com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c987bc937ef4666de0e9317edadd4b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c987bc937ef4666de0e9317edadd4b0");
                return;
            }
            GalleryVideoControlPanel a2 = this.b.a();
            if (a2 == null || bVar2 == null || bVar2.b != 1) {
                return;
            }
            a2.setVolumeState(bVar2.c);
        }

        public a(GalleryVideoControlPanel galleryVideoControlPanel) {
            Object[] objArr = {galleryVideoControlPanel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3ab9bc4acccc2ed033d944899a8625", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3ab9bc4acccc2ed033d944899a8625");
                return;
            }
            this.b = new ai<>();
            this.b.a(galleryVideoControlPanel);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd754da69bf74c7ca87b1fa8c3557f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd754da69bf74c7ca87b1fa8c3557f0a");
        } else if (this.j || f.a(getContext())) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("PoiVideoBlock", "registerNetReceiver()", new Object[0]);
            this.j = true;
            this.i = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.y, intentFilter);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf40ab3daef840a602b6587b49ba5b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf40ab3daef840a602b6587b49ba5b2a");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("PoiVideoBlock", "unRegisterReceiver()", new Object[0]);
        if (this.j) {
            this.j = false;
            if (f.a(getContext())) {
                return;
            }
            getContext().unregisterReceiver(this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r1.equals("2G") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.a
            java.lang.String r10 = "bc75326eb8189190981640c01c76c0db"
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
            android.content.Context r1 = r11.getContext()
            java.lang.String r1 = com.sankuai.waimai.foundation.utils.p.b(r1)
            r11.n = r1
            java.lang.String r1 = r11.n
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 1621(0x655, float:2.272E-42)
            if (r3 == r4) goto L86
            r0 = 1652(0x674, float:2.315E-42)
            if (r3 == r0) goto L7c
            r0 = 1683(0x693, float:2.358E-42)
            if (r3 == r0) goto L72
            r0 = 1714(0x6b2, float:2.402E-42)
            if (r3 == r0) goto L68
            r0 = 2694997(0x291f55, float:3.776495E-39)
            if (r3 == r0) goto L5e
            r0 = 1002405936(0x3bbf8030, float:0.0058441386)
            if (r3 == r0) goto L54
            r0 = 1959784951(0x74cff1f7, float:1.3180091E32)
            if (r3 == r0) goto L49
            goto L8f
        L49:
            java.lang.String r0 = "invalid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            r0 = 1
            goto L90
        L54:
            java.lang.String r0 = "Unavailable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            r0 = 2
            goto L90
        L5e:
            java.lang.String r0 = "WiFi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            r0 = 6
            goto L90
        L68:
            java.lang.String r0 = "5G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            r0 = 5
            goto L90
        L72:
            java.lang.String r0 = "4G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            r0 = 4
            goto L90
        L7c:
            java.lang.String r0 = "3G"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            r0 = 3
            goto L90
        L86:
            java.lang.String r3 = "2G"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8f
            goto L90
        L8f:
            r0 = -1
        L90:
            switch(r0) {
                case 0: goto La2;
                case 1: goto L9b;
                case 2: goto L9b;
                case 3: goto L94;
                case 4: goto L94;
                case 5: goto L94;
                default: goto L93;
            }
        L93:
            goto La9
        L94:
            r0 = 2131365281(0x7f0a0da1, float:1.8350423E38)
            r11.b(r0)
            goto La9
        L9b:
            r0 = 2131365280(0x7f0a0da0, float:1.835042E38)
            r11.b(r0)
            return
        La2:
            r0 = 2131365279(0x7f0a0d9f, float:1.8350419E38)
            r11.b(r0)
            return
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.f():void");
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public void setPlayerController(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999cf6ae129f613b617f29d62fa169d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999cf6ae129f613b617f29d62fa169d2");
            return;
        }
        this.g = cVar;
        this.g.setLooping(true);
        setVolumeState(true);
        if (this.k) {
            this.g.b();
            this.k = false;
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21dbb7861e75280d33d75f3216fde87c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21dbb7861e75280d33d75f3216fde87c");
            return;
        }
        this.w = i;
        switch (i) {
            case -1:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_ERROR", new Object[0]);
                b(R.string.mtplayer_player_error_tip_unknown);
                return;
            case 0:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_IDLE", new Object[0]);
                g();
                return;
            case 1:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_PREPARING", new Object[0]);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "709e3a705608a68ec39884c0daaf853f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "709e3a705608a68ec39884c0daaf853f");
                    return;
                }
                h();
                this.d.setVisibility(0);
                this.f.setVisibility(8);
                return;
            case 2:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_PREPARED", new Object[0]);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7041122f434570c8bb7fa4f2b4320b7a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7041122f434570c8bb7fa4f2b4320b7a");
                } else {
                    i();
                    this.d.setVisibility(0);
                    this.f.setVisibility(8);
                }
                this.g.c();
                return;
            case 3:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_PLAYING", new Object[0]);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d5c9d4143f1220caeb73b51a620b15b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d5c9d4143f1220caeb73b51a620b15b8");
                    return;
                }
                this.f.setVisibility(8);
                this.d.setVisibility(8);
                i();
                return;
            case 4:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_PAUSED", new Object[0]);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9283795c2375df981fe3d2850df059a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9283795c2375df981fe3d2850df059a0");
                    return;
                }
                i();
                this.d.setVisibility(8);
                this.f.setVisibility(0);
                return;
            case 5:
                h();
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_BUFFERING_PLAYING", new Object[0]);
                return;
            case 6:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_BUFFERING_PAUSED", new Object[0]);
                return;
            case 7:
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "STATE_PLAYBACK_COMPLETED", new Object[0]);
                if (!this.l) {
                    g();
                }
                this.r = false;
                this.s = false;
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd002ecf628aae6dd4658c45850f14eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd002ecf628aae6dd4658c45850f14eb");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "onPlayProgressChange:" + i + "/" + i2, new Object[0]);
        int i4 = (i * 100) / i2;
        this.c.setProgress(i4);
        if (i / 1000 >= 3) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54f7b8abfbabfd6efddcdc95558917cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54f7b8abfbabfd6efddcdc95558917cc");
            } else if (!this.r && (this.o == 1 || this.o == 2 || this.x == 0)) {
                com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "reportVideoPlay", new Object[0]);
                String generatePageInfoKey = AppUtil.generatePageInfoKey((Activity) getContext());
                HashMap hashMap = new HashMap();
                if (this.p != -1) {
                    hashMap.put("evaluate_tab", Integer.valueOf(this.p));
                }
                hashMap.put("sources", Integer.valueOf(this.o));
                if (!aa.a(this.q)) {
                    hashMap.putAll(a(this.q));
                }
                JudasManualManager.b("b_waimai_dp8dfpsu_mv", "c_waimai_x6f4dc3r", generatePageInfoKey).a((Map<String, Object>) hashMap).a();
                this.r = true;
            }
        }
        if (i4 >= 90) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee648b9f9931dd921a3a1bbfcb9808f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee648b9f9931dd921a3a1bbfcb9808f3");
            } else if (this.s) {
            } else {
                if (this.o == 1 || this.o == 2 || this.x == 0) {
                    com.sankuai.waimai.foundation.utils.log.a.b("PoiVideoBlock", "reportVideoComplete", new Object[0]);
                    String generatePageInfoKey2 = AppUtil.generatePageInfoKey((Activity) getContext());
                    HashMap hashMap2 = new HashMap();
                    if (this.p != -1) {
                        hashMap2.put("evaluate_tab", Integer.valueOf(this.p));
                    }
                    hashMap2.put("sources", Integer.valueOf(this.o));
                    if (!aa.a(this.q)) {
                        hashMap2.putAll(a(this.q));
                    }
                    JudasManualManager.b("b_waimai_3aqtyp9w_mv", "c_waimai_x6f4dc3r", generatePageInfoKey2).a((Map<String, Object>) hashMap2).a();
                    this.s = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolumeState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2537b773c8797a6e72f823ebc8f973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2537b773c8797a6e72f823ebc8f973");
            return;
        }
        this.h = z;
        if (z) {
            this.g.a(0.0f, 0.0f);
        } else {
            this.g.a(1.0f, 1.0f);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593c785a7a9de85cb0dc5ca3ee3ec273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593c785a7a9de85cb0dc5ca3ee3ec273");
            return;
        }
        i();
        this.d.setVisibility(0);
        this.f.setVisibility(0);
        this.c.setProgress(0);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e48cb2bb51b73551d311e7e95bf2be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e48cb2bb51b73551d311e7e95bf2be7");
            return;
        }
        ah.b(this.e, (int) R.drawable.wm_common_progress_rotate);
        this.e.setVisibility(0);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccdff2fb69be8ac18ef3f2f47ad7f5b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccdff2fb69be8ac18ef3f2f47ad7f5b5");
            return;
        }
        ah.a(this.e);
        this.e.setVisibility(8);
    }

    private void b(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a97d1d6b864bad9c6faaa2ab65a56a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a97d1d6b864bad9c6faaa2ab65a56a6");
        } else if (this.u) {
            ae.a((Activity) getContext(), i);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e87376b12d36a1eccc9394ef27f32b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e87376b12d36a1eccc9394ef27f32b8a");
        } else if (this.g != null) {
            if (!z) {
                this.g.f();
            } else if (this.k) {
            } else {
                this.g.b();
            }
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161edf31ce53e5e5d82d738fbb18f462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161edf31ce53e5e5d82d738fbb18f462");
            return;
        }
        this.v = this.w;
        this.g.d();
        e();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99c85aab4219abd1ba886cc1ceec5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99c85aab4219abd1ba886cc1ceec5ef");
            return;
        }
        d();
        f();
        if (this.v != 3 || this.g.e()) {
            return;
        }
        this.g.c();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.gallery.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a126b0c0cedaa461e44656c3f0de1fd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a126b0c0cedaa461e44656c3f0de1fd3");
            return;
        }
        if (this.t != null) {
            this.t.unsubscribe();
        }
        e();
        if (this.g != null) {
            this.g.g();
        }
        this.r = false;
        this.s = false;
    }

    @NonNull
    private Map<String, Object> a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df1d40c9d77fb2a8b56b54858032919", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df1d40c9d77fb2a8b56b54858032919");
        }
        HashMap hashMap = new HashMap();
        try {
            return !aa.a(str) ? (Map) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.business.restaurant.base.gallery.GalleryVideoControlPanel.4
            }.getType()) : hashMap;
        } catch (Exception unused) {
            return hashMap;
        }
    }
}
