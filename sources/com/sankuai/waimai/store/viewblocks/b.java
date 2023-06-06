package com.sankuai.waimai.store.viewblocks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.store.util.ao;
import com.sankuai.waimai.store.viewblocks.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends com.sankuai.waimai.store.base.b implements com.meituan.android.mtplayer.video.callback.a, c.a {
    public static ChangeQuickRedirect c;
    private int a;
    private boolean b;
    final c d;
    final c e;
    boolean f;
    public com.meituan.android.mtplayer.video.callback.c g;
    com.sankuai.waimai.platform.domain.core.goods.e h;
    private com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a i;
    @SuppressLint({"HandlerLeak"})
    private Handler j;

    public b(@NonNull Context context, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba7680c658049fb18a7136cb83a625c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba7680c658049fb18a7136cb83a625c6");
            return;
        }
        this.b = false;
        this.j = new Handler() { // from class: com.sankuai.waimai.store.viewblocks.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f41cd77b05c10986a9a131d383ab860", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f41cd77b05c10986a9a131d383ab860");
                } else if (message.what == 1 && b.this.f && b.this.g != null && b.this.g.e()) {
                    b.this.e();
                }
            }
        };
        this.i = aVar;
        this.d = new c(this) { // from class: com.sankuai.waimai.store.viewblocks.b.2
            @Override // com.sankuai.waimai.store.viewblocks.c
            public final int a() {
                return R.layout.wm_sc_full_player_cover_controller;
            }
        };
        this.e = b();
    }

    public c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c70d7a48116c838156c905dd66ec5f", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c70d7a48116c838156c905dd66ec5f") : new c(this) { // from class: com.sankuai.waimai.store.viewblocks.b.3
            @Override // com.sankuai.waimai.store.viewblocks.c
            public final int a() {
                return R.layout.wm_sc_detail_player_cover_controller;
            }
        };
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949399da6ff3c99bdcf60060b7671a33", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949399da6ff3c99bdcf60060b7671a33");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(this.d.a(layoutInflater, viewGroup));
        frameLayout.addView(this.e.a(layoutInflater, viewGroup));
        return frameLayout;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55803899c7e0511c65cf15e6d66f39cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55803899c7e0511c65cf15e6d66f39cd");
            return;
        }
        super.onViewCreated();
        this.b = true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d8a47bbf8c53275605c979eda9211a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d8a47bbf8c53275605c979eda9211a");
        } else if (this.b && this.g != null) {
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e47efc5579a8c0d1e296f58cc92e502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e47efc5579a8c0d1e296f58cc92e502");
        } else if (this.b) {
            d(k());
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95eb0e407e6bd0f327422c12951a3edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95eb0e407e6bd0f327422c12951a3edc");
        } else if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "190d3a809ea87832b434aecfe8fabb37", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "190d3a809ea87832b434aecfe8fabb37")).booleanValue() : "WiFi".equals(p.b(this.mContext));
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79066f86e96d0aebfa026aacacaa4004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79066f86e96d0aebfa026aacacaa4004");
            return;
        }
        this.d.m();
        this.e.l();
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
        this.g = cVar;
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d908b5c5c1e59ee3781a445b782c3ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d908b5c5c1e59ee3781a445b782c3ee");
            return;
        }
        this.a = i;
        switch (i) {
            case -1:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_ERROR", new Object[0]);
                a(getContext().getString(R.string.wm_sc_player_error_tip_unknown), (String) null);
                return;
            case 0:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_IDLE", new Object[0]);
                return;
            case 1:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PREPARING", new Object[0]);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "496f2e01c114149a4748a07297f43aea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "496f2e01c114149a4748a07297f43aea");
                } else {
                    this.d.f();
                    this.e.f();
                    this.f = false;
                    if (this.j != null) {
                        this.j.removeMessages(1);
                    }
                }
                a((String) null, (String) null);
                return;
            case 2:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PREPARED", new Object[0]);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90115296cced8398a60374a0fec759f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90115296cced8398a60374a0fec759f3");
                } else {
                    this.d.g();
                    this.e.g();
                }
                d(k());
                return;
            case 3:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PLAYING", new Object[0]);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = c;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a9354c6a7c37324a65e2225887aff781", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a9354c6a7c37324a65e2225887aff781");
                } else {
                    c(true);
                    this.d.c();
                    this.d.e();
                    this.e.c();
                    this.e.e();
                    if (this.f && this.j != null) {
                        this.j.removeCallbacksAndMessages(null);
                        this.j.sendEmptyMessageDelayed(1, PayTask.j);
                    }
                }
                a((String) null, (String) null);
                return;
            case 4:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PAUSED", new Object[0]);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = c;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "88eefc7ad5a08d3f08b432a74ed200ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "88eefc7ad5a08d3f08b432a74ed200ee");
                    return;
                }
                c(false);
                this.d.h();
                this.e.h();
                this.f = true;
                if (this.j != null) {
                    this.j.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            case 5:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_BUFFERING_PLAYING", new Object[0]);
                this.d.b();
                this.e.b();
                return;
            case 6:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_BUFFERING_PAUSED", new Object[0]);
                this.d.b();
                this.e.b();
                return;
            case 7:
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "STATE_PLAYBACK_COMPLETED", new Object[0]);
                c(false);
                a(this.h);
                this.d.d();
                this.e.d();
                return;
            default:
                return;
        }
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c33e9defc70f3f1ac5800cc90eb1a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c33e9defc70f3f1ac5800cc90eb1a2")).booleanValue() : com.sankuai.waimai.foundation.core.service.player.a.a().isPlayerMuting();
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f6ac692a299279151f4c1da1a6e4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f6ac692a299279151f4c1da1a6e4c8");
        } else {
            com.sankuai.waimai.foundation.core.service.player.a.a().setPlayerMuting(z);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5611fc868d45f217fc3252895a20dbec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5611fc868d45f217fc3252895a20dbec");
            return;
        }
        this.d.a(str, str2);
        this.e.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4195915f2d061ff453b0ddb46e7a6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4195915f2d061ff453b0ddb46e7a6e");
            return;
        }
        l();
        if (eVar != null) {
            a((String) null, ao.a(eVar.e * 1000));
        } else {
            a((String) null, (String) null);
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f00fd063eea248ff88e6a0eebd8e44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f00fd063eea248ff88e6a0eebd8e44");
            return;
        }
        this.d.i();
        this.e.i();
        this.f = false;
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b33cb8b5eec18b616af5a0d0380f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b33cb8b5eec18b616af5a0d0380f7e");
            return;
        }
        this.d.j();
        this.e.j();
        this.f = false;
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
        if (this.i != null) {
            this.i.b(false);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8141992c98d5e94abac88c2efc2c0da8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8141992c98d5e94abac88c2efc2c0da8");
            return;
        }
        b(z);
        d(z);
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849ea6e0b5df0ebe65d3bed36a628d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849ea6e0b5df0ebe65d3bed36a628d0d");
            return;
        }
        this.d.a(z);
        this.e.a(z);
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbdfd83b118cf12ff59e5c124cf0b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbdfd83b118cf12ff59e5c124cf0b0a");
            return;
        }
        if (z) {
            m();
        } else {
            n();
        }
        this.d.b(z);
        this.e.b(z);
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f10e5cc8d46cb8e513ce9fa02f22c85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f10e5cc8d46cb8e513ce9fa02f22c85");
        } else if (this.g != null) {
            this.g.a(0.0f, 0.0f);
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f32ad68fc1bd223c0930e8cb4ae716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f32ad68fc1bd223c0930e8cb4ae716");
            return;
        }
        float a = ao.a();
        if (this.g != null) {
            this.g.a(a, a);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d4d68b2c06fa66ff064a503db6d0c4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d4d68b2c06fa66ff064a503db6d0c4b");
            return;
        }
        this.d.a(i, i2, i3);
        this.e.a(i, i2, i3);
    }

    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60984221a6c87e4f4beee5ba226fb099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60984221a6c87e4f4beee5ba226fb099");
        } else if (z) {
            if (z2) {
                e();
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "989c91d10da68ecbd13106a08cabb019", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "989c91d10da68ecbd13106a08cabb019");
                return;
            }
            this.d.k();
            this.e.k();
            this.f = true;
            if (this.j != null) {
                this.j.removeCallbacksAndMessages(null);
                this.j.sendEmptyMessageDelayed(1, PayTask.j);
            }
            if (this.i != null) {
                this.i.b(true);
            }
        }
    }

    public final boolean f() {
        return this.a == 3;
    }

    public void a() {
        char c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b029c327728e8f46efcb2f5a0e9d90ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b029c327728e8f46efcb2f5a0e9d90ed");
        } else if (this.g == null || !this.b) {
        } else {
            if (this.i != null) {
                this.i.a(true, c());
            }
            String b = p.b(com.meituan.android.singleton.b.a);
            int hashCode = b.hashCode();
            if (hashCode == 1621) {
                if (b.equals("2G")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else if (hashCode == 1652) {
                if (b.equals("3G")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode == 1683) {
                if (b.equals("4G")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else if (hashCode == 2694997) {
                if (b.equals("WiFi")) {
                    c2 = 5;
                }
                c2 = 65535;
            } else if (hashCode != 1002405936) {
                if (hashCode == 1959784951 && b.equals("invalid")) {
                    c2 = 3;
                }
                c2 = 65535;
            } else {
                if (b.equals("Unavailable")) {
                    c2 = 4;
                }
                c2 = 65535;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    this.g.c();
                    return;
                case 3:
                case 4:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe51389b78763f4893bd86efa4df2444", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe51389b78763f4893bd86efa4df2444");
                        return;
                    } else {
                        a(com.meituan.android.singleton.b.a.getString(R.string.wm_sc_player_error_tip_network_disconnected), (String) null);
                        return;
                    }
                case 5:
                    this.g.c();
                    return;
                default:
                    return;
            }
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1525ee54833ed21109dba50fb6b63ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1525ee54833ed21109dba50fb6b63ac");
        } else if (this.g == null || !this.b) {
        } else {
            if (this.i != null) {
                this.i.a(false, c());
            }
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.c.a
    public final void a(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91680c1ed681a61dbdad51773d944025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91680c1ed681a61dbdad51773d944025");
        } else if (this.g == null) {
        } else {
            int duration = (this.g.getDuration() * seekBar.getProgress()) / 100;
            if (this.g != null) {
                this.g.a(duration);
            }
            if (this.j != null) {
                this.j.removeMessages(1);
                this.j.sendEmptyMessageDelayed(1, PayTask.j);
            }
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.c.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ffd95b1a8de88d13cf5d3438a7bc1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ffd95b1a8de88d13cf5d3438a7bc1c");
        } else if (f()) {
            g();
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.c.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab7da08e8a54ad7f7e616f7e9c3a778e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab7da08e8a54ad7f7e616f7e9c3a778e");
        } else {
            a(!k());
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.c.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26308660d722197037c30b48c75aba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26308660d722197037c30b48c75aba8");
        } else {
            a(f(), this.f);
        }
    }
}
