package com.sankuai.waimai.store.v2.detail.component.root;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.base.preload.e;
import com.sankuai.waimai.store.base.preload.f;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsPromotion;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.v2.detail.component.root.b;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends b.a {
    public static ChangeQuickRedirect c;
    a d;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private GoodsSpu f;
    private com.sankuai.waimai.store.notification.a g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private String l;
    private final long m;
    private Runnable n;
    private com.sankuai.waimai.store.manager.marketing.a o;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8c5e1524e605bead01db45f82ee3ee5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8c5e1524e605bead01db45f82ee3ee5c");
        } else if (cVar.b == null || cVar.f == null || cVar.f.promotion == null || cVar.d == null) {
        } else {
            GoodsPromotion goodsPromotion = cVar.f.promotion;
            if (goodsPromotion.currentTime + cVar.d.b >= goodsPromotion.activityDeadline) {
                cVar.b.s();
                cVar.d.removeCallbacks(cVar.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        long b;
        private WeakReference<b.InterfaceC1337b> c;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db138dd0af89ae8cb11990826224905", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db138dd0af89ae8cb11990826224905");
            } else if (message != null && message.what == 1) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61c4e02cfc7e188c62bbdd70d5fb672c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61c4e02cfc7e188c62bbdd70d5fb672c");
                    return;
                }
                this.b++;
                ad.a(new Runnable() { // from class: com.sankuai.waimai.store.v2.detail.component.root.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75c9d8ca8eb3e1e52486a827834f0fd2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75c9d8ca8eb3e1e52486a827834f0fd2");
                        } else if (a.this.c == null || a.this.c.get() == null) {
                        } else {
                            ((b.InterfaceC1337b) a.this.c.get()).b(a.this.b);
                        }
                    }
                });
            }
        }
    }

    public c(b.InterfaceC1337b interfaceC1337b) {
        super(interfaceC1337b);
        Object[] objArr = {interfaceC1337b};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a266ee0c5e81a70c884b5303eb329dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a266ee0c5e81a70c884b5303eb329dc");
            return;
        }
        this.e = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.g = new com.sankuai.waimai.store.notification.a(this.e);
        this.h = -1L;
        this.i = -1L;
        this.j = false;
        this.k = false;
        this.m = 1000L;
        this.n = new Runnable() { // from class: com.sankuai.waimai.store.v2.detail.component.root.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ddcb366f85250819a2063aa0a6cf95d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ddcb366f85250819a2063aa0a6cf95d");
                } else if (c.this.d != null) {
                    c.this.d.sendEmptyMessage(1);
                    c.this.d.postDelayed(this, 1000L);
                    c.a(c.this);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b3daeb01f7de50bdd8d83d0b4c9798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b3daeb01f7de50bdd8d83d0b4c9798");
        } else if (bundle != null) {
            this.h = bundle.getLong("key_detail_save_poi_id", -1L);
            this.i = bundle.getLong("key_detail_save_spu_id", -1L);
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08af8205985bfa00a245bbb8dc29b84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08af8205985bfa00a245bbb8dc29b84e");
        } else if (bundle == null) {
        } else {
            bundle.putLong("key_detail_save_poi_id", this.e.f());
            if (this.f != null) {
                bundle.putLong("key_detail_save_spu_id", this.f.getId());
            }
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    @NonNull
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final GoodsSpu c() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5bc46e66bfd982cf0eda2c2ff740f14", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5bc46e66bfd982cf0eda2c2ff740f14")).booleanValue() : this.o == null || this.o.g();
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a7b26f4526e372ab26660fc64950af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a7b26f4526e372ab26660fc64950af");
        } else if (this.e.f() <= 0) {
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(this.e.f(), this.e.h(), 2, new k<GetMenuResponse>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    GetMenuResponse getMenuResponse = (GetMenuResponse) obj;
                    Object[] objArr2 = {getMenuResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "741c1640601779e0def2b9d3fe735bae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "741c1640601779e0def2b9d3fe735bae");
                    } else {
                        c.this.b.a(getMenuResponse);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55bb454b1a194528ba73432f8f6fda3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55bb454b1a194528ba73432f8f6fda3d");
            return;
        }
        this.g.a();
        if (this.o != null) {
            this.o.h();
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec6a790f352d112e655d08b5931467d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec6a790f352d112e655d08b5931467d");
            return;
        }
        this.g.b();
        if (this.o != null) {
            this.o.i();
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fff329bd95fb074b5bb6de15d449941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fff329bd95fb074b5bb6de15d449941");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "139fa3f0ed6ccaf8765cf99ac29929d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "139fa3f0ed6ccaf8765cf99ac29929d5");
        } else if (this.d != null) {
            this.d.removeCallbacks(this.n);
            this.d = null;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2b4365e7358490af9539a7f7465ee9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2b4365e7358490af9539a7f7465ee9e");
        } else {
            String a2 = d.a(this.b.q().getIntent(), "key_pre_request_cache", "key_pre_request_cache", "");
            e.a().a(a2);
            if (!TextUtils.isEmpty(a2)) {
                com.sankuai.waimai.store.base.net.c.a(a2);
            }
            f.a(a2);
        }
        if (this.o != null) {
            this.o.j();
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.a
    public final String g() {
        return this.l;
    }
}
