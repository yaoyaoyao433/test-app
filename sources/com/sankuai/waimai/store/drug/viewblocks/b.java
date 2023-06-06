package com.sankuai.waimai.store.drug.viewblocks;

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
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.drug.viewblocks.c;
import com.sankuai.waimai.store.util.ao;
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
    e h;
    private com.sankuai.waimai.store.drug.video.video.a i;
    @SuppressLint({"HandlerLeak"})
    private Handler j;

    public b(@NonNull Context context, com.sankuai.waimai.store.drug.video.video.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4647029c645b356c11703269c42cbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4647029c645b356c11703269c42cbb");
            return;
        }
        this.b = false;
        this.j = new Handler() { // from class: com.sankuai.waimai.store.drug.viewblocks.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "482576250adb0816983f5b52d67ab2cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "482576250adb0816983f5b52d67ab2cf");
                } else if (message.what == 1 && b.this.f && b.this.g != null && b.this.g.e()) {
                    b.this.e();
                }
            }
        };
        this.i = aVar;
        this.d = new c(this) { // from class: com.sankuai.waimai.store.drug.viewblocks.b.2
            @Override // com.sankuai.waimai.store.drug.viewblocks.c
            public final int a() {
                return R.layout.wm_drug_full_player_cover_controller;
            }
        };
        this.e = b();
    }

    public c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4908899d6fdff8da228c31489921e3a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4908899d6fdff8da228c31489921e3a") : new c(this) { // from class: com.sankuai.waimai.store.drug.viewblocks.b.3
            @Override // com.sankuai.waimai.store.drug.viewblocks.c
            public final int a() {
                return R.layout.wm_sc_detail_player_cover_controller;
            }
        };
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6831aee493ebc970c7a00fcb64d1ad3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6831aee493ebc970c7a00fcb64d1ad3b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510528f97d666964d8bbc9e59dbe814b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510528f97d666964d8bbc9e59dbe814b");
            return;
        }
        super.onViewCreated();
        this.b = true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1dbfa8a7dec531b584ed6c70da3cc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1dbfa8a7dec531b584ed6c70da3cc33");
        } else if (this.b && this.g != null) {
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6129fd0c239e6d8d77f1acb5786a249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6129fd0c239e6d8d77f1acb5786a249");
        } else if (this.b) {
            d(k());
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6337cc7733137143e2141a0b184b18ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6337cc7733137143e2141a0b184b18ca");
        } else if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a96cf091d94c32dbe03b0228d5a9bb0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a96cf091d94c32dbe03b0228d5a9bb0")).booleanValue() : "WiFi".equals(p.b(this.mContext));
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e798635c9e1c66c9c7635ffa67014d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e798635c9e1c66c9c7635ffa67014d3b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b9cf631c62d6ed6321e4968ef14aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b9cf631c62d6ed6321e4968ef14aba");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3814a4ca6ebe6c5bbc7c368c72daea8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3814a4ca6ebe6c5bbc7c368c72daea8");
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
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0061c35ca371b31a4986cddcb3e5b31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0061c35ca371b31a4986cddcb3e5b31");
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
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d133198ee2da3c50aa271347646d5b32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d133198ee2da3c50aa271347646d5b32");
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
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9a7a79ea7b6b1600cf3c5846681441c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9a7a79ea7b6b1600cf3c5846681441c2");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701d9b442a5c8f0437637e6a28afad3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701d9b442a5c8f0437637e6a28afad3e")).booleanValue() : com.sankuai.waimai.foundation.core.service.player.a.a().isPlayerMuting();
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8130b1dca02f99380d33d8b436948020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8130b1dca02f99380d33d8b436948020");
        } else {
            com.sankuai.waimai.foundation.core.service.player.a.a().setPlayerMuting(z);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483ebb292c879459a5bda27a3cd3c6b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483ebb292c879459a5bda27a3cd3c6b4");
            return;
        }
        this.d.a(str, str2);
        this.e.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d8337a93c2be248b01b810d7c3d43a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d8337a93c2be248b01b810d7c3d43a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdcab6f7ce07e8ba314a8f2011cef718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdcab6f7ce07e8ba314a8f2011cef718");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ffb326f1ca7d24632a66bf2743e69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ffb326f1ca7d24632a66bf2743e69e");
            return;
        }
        this.d.j();
        this.e.j();
        this.f = false;
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0124eb2cab8c7d9701effe8bd917199a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0124eb2cab8c7d9701effe8bd917199a");
            return;
        }
        b(z);
        d(z);
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba480387500f8f6f51eb1b35b0e5665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba480387500f8f6f51eb1b35b0e5665");
            return;
        }
        this.d.a(z);
        this.e.a(z);
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1de37b0267b06669b63dedaf9f38ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1de37b0267b06669b63dedaf9f38ead");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5acf5286eef5c7d8c7f29cf01d2991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5acf5286eef5c7d8c7f29cf01d2991");
        } else if (this.g != null) {
            this.g.a(0.0f, 0.0f);
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7908b2b13ed7d58204051b244d79a4ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7908b2b13ed7d58204051b244d79a4ed");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3775acf988162a4cb1a5e929d95d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3775acf988162a4cb1a5e929d95d58");
            return;
        }
        this.d.a(i, i2, i3);
        this.e.a(i, i2, i3);
    }

    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2dcc1fa9fe65080e6740b7b4f2211a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2dcc1fa9fe65080e6740b7b4f2211a1");
        } else if (z) {
            if (z2) {
                e();
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a63df788f097bd5e020cbd69fee933d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a63df788f097bd5e020cbd69fee933d");
                return;
            }
            this.d.k();
            this.e.k();
            this.f = true;
            if (this.j != null) {
                this.j.removeCallbacksAndMessages(null);
                this.j.sendEmptyMessageDelayed(1, PayTask.j);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0c397c06f0d5a492700f6efd6cba5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0c397c06f0d5a492700f6efd6cba5a");
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75ad051814ce4888c88724ff8196f771", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75ad051814ce4888c88724ff8196f771");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c1fc058f4a8f75cd7b3189f5985627c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c1fc058f4a8f75cd7b3189f5985627c");
        } else if (this.g == null || !this.b) {
        } else {
            if (this.i != null) {
                this.i.a(false, c());
            }
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.c.a
    public final void a(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3c5951586b3a4df9fdc8cdb1033b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3c5951586b3a4df9fdc8cdb1033b4e");
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

    @Override // com.sankuai.waimai.store.drug.viewblocks.c.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8949118ec59dde4a6b89bbd01d9536a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8949118ec59dde4a6b89bbd01d9536a0");
        } else if (f()) {
            g();
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.c.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f507449c68ff9c84acf4cf3157b61782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f507449c68ff9c84acf4cf3157b61782");
        } else {
            a(!k());
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.c.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d95cf158eae1987ff6468083be5c9180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d95cf158eae1987ff6468083be5c9180");
        } else {
            a(f(), this.f);
        }
    }
}
