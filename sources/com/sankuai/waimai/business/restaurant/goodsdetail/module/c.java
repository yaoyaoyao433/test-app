package com.sankuai.waimai.business.restaurant.goodsdetail.module;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.business.restaurant.base.share.a;
import com.sankuai.waimai.business.restaurant.goodsdetail.module.a;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.restaurant.goodsdetail.module.a {
    public static ChangeQuickRedirect g;

    public c(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c9b2328d76460f5f485baba3e4d9e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c9b2328d76460f5f485baba3e4d9e8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6acfcc207a27aa7bbf35bacbf7650658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6acfcc207a27aa7bbf35bacbf7650658");
            return;
        }
        this.c = new C0835c();
        this.d = new b();
        this.e = new d();
        this.f = new a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.goodsdetail.module.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0835c implements a.c {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.business.restaurant.goodsdetail.widget.a b;
        Dialog c;
        a.f d;

        private C0835c() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3d0ba7143b374386ef746724979cea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3d0ba7143b374386ef746724979cea");
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.c
        public final void a(final GoodsSpu goodsSpu) {
            Object[] objArr = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9ff11846f520d161bca0d16a5509a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9ff11846f520d161bca0d16a5509a8");
                return;
            }
            Activity a2 = c.this.a();
            if (goodsSpu == null) {
                return;
            }
            if (this.b == null) {
                this.b = new com.sankuai.waimai.business.restaurant.goodsdetail.widget.a(a2.getLayoutInflater().inflate(R.layout.wm_restaurant_goods_detail_local_share_layout, (ViewGroup) c.this.b.findViewById(R.id.fl_mrn_container), true));
            }
            if (this.b != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9eb2ab7273ce3598a4878737fe12edc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9eb2ab7273ce3598a4878737fe12edc2");
                } else if (this.c == null || !this.c.isShowing()) {
                    this.c = com.sankuai.waimai.foundation.core.utils.d.a(c.this.a());
                }
                this.b.a(goodsSpu.getShareTip(), new a.InterfaceC0823a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.share.a.InterfaceC0823a
                    public final void a(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4c30096b289900b099866a497bbefaa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4c30096b289900b099866a497bbefaa");
                            return;
                        }
                        C0835c c0835c = C0835c.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = C0835c.a;
                        if (PatchProxy.isSupport(objArr4, c0835c, changeQuickRedirect4, false, "92f31ace25ca5e005b9e625b5449fc9c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, c0835c, changeQuickRedirect4, false, "92f31ace25ca5e005b9e625b5449fc9c");
                        } else if (c0835c.c != null) {
                            com.sankuai.waimai.foundation.core.utils.d.a(c0835c.c);
                        }
                        final C0835c c0835c2 = C0835c.this;
                        GoodsSpu goodsSpu2 = goodsSpu;
                        Object[] objArr5 = {goodsSpu2};
                        ChangeQuickRedirect changeQuickRedirect5 = C0835c.a;
                        if (PatchProxy.isSupport(objArr5, c0835c2, changeQuickRedirect5, false, "e1f90710a8807273abb973906e779749", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, c0835c2, changeQuickRedirect5, false, "e1f90710a8807273abb973906e779749");
                        } else if (goodsSpu2 == null || goodsSpu2 == null || goodsSpu2.getShareTip() == null) {
                        } else {
                            if (goodsSpu2.getShareTip().getActivityId() != 0) {
                                Set a3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) c.this.a(), "has_clicked_activity_share_button", (Set<String>) null);
                                if (a3 == null) {
                                    a3 = new HashSet();
                                }
                                a3.add(String.valueOf(goodsSpu2.getShareTip().getActivityId()));
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.b(c.this.a(), "has_clicked_activity_share_button", a3);
                            }
                            if (goodsSpu2 != null) {
                                Bundle bundle = new Bundle();
                                ShareTip shareTip = goodsSpu2.getShareTip();
                                if (c0835c2.b != null) {
                                    c0835c2.b.b();
                                    shareTip.setIcon(c0835c2.b.c());
                                }
                                shareTip.setCid("c_u4fk4kw");
                                bundle.putInt("source", 5);
                                if (c0835c2.d != null) {
                                    c0835c2.d.a(true);
                                }
                                com.sankuai.waimai.share.b.a(c.this.a(), shareTip, new com.sankuai.waimai.foundation.core.service.share.listener.a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.c.2
                                    @Override // com.sankuai.waimai.foundation.core.service.share.listener.a
                                    public final void a(int i) {
                                    }
                                }, (com.sankuai.waimai.foundation.core.service.share.listener.b) null, bundle);
                            }
                        }
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.c
        public final void a(a.f fVar) {
            this.d = fVar;
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.c
        public final void a() {
            this.d = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b implements a.b {
        public static ChangeQuickRedirect a;
        a.g b;
        d.a c;
        private a.b e;

        private b() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b3011dccb5caf1ad73907c5e165194", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b3011dccb5caf1ad73907c5e165194");
                return;
            }
            this.e = new a.b() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.api.msgcenter.a.b
                public final void a(boolean z, boolean z2, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b756c2e09308cbdf9fe010716d6ff5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b756c2e09308cbdf9fe010716d6ff5b");
                    } else {
                        com.sankuai.waimai.imbase.manager.b.a().a(b.this.c);
                    }
                }
            };
            this.c = new d.a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.a
                public final void a(final int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30ac24d57bbef2b4c4c6c12b776fc143", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30ac24d57bbef2b4c4c6c12b776fc143");
                    } else if (c.this.a() == null || c.this.a().isFinishing()) {
                    } else {
                        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.b.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72d7bfac4aa12ea37b5c6810a99b2d75", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72d7bfac4aa12ea37b5c6810a99b2d75");
                                    return;
                                }
                                boolean showMsgCenterDot = com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot();
                                if (b.this.b != null) {
                                    b.this.b.a(i, showMsgCenterDot);
                                }
                            }
                        });
                    }
                }
            };
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.b
        public final void a(final String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5535db7ea165cc4ccc01aef245c05c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5535db7ea165cc4ccc01aef245c05c");
            } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                com.sankuai.waimai.foundation.router.a.a(c.this.a(), str);
            } else {
                com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.NONE;
                com.sankuai.waimai.platform.domain.manager.user.a.a(c.this.a(), new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b33c250e163b64e090af5ef6c0fc3cb3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b33c250e163b64e090af5ef6c0fc3cb3");
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(c.this.a(), str);
                        }
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.b
        public final void a(a.g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac1307f43c2a8174c451700b458c8927", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac1307f43c2a8174c451700b458c8927");
                return;
            }
            this.b = gVar;
            com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this.e);
            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterUnReadCount();
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be988fbb734d7dbfbbc1df8c476f8eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be988fbb734d7dbfbbc1df8c476f8eb");
                return;
            }
            com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(this.e);
            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterUnReadCount();
            this.b = null;
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.b
        public final a.e b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66680e9bccde8e18e1b3e9616a7f4bfc", RobustBitConfig.DEFAULT_VALUE)) {
                return (a.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66680e9bccde8e18e1b3e9616a7f4bfc");
            }
            a.e eVar = new a.e();
            eVar.a = com.sankuai.waimai.business.im.api.msgcenter.a.a().getUnReadImCount();
            eVar.b = com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot();
            return eVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d implements a.d {
        public static ChangeQuickRedirect a;

        private d() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25af97e107a6873794ae5760751cfe3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25af97e107a6873794ae5760751cfe3");
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.d
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc99b4581c04adf060d8f60f56e7629b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc99b4581c04adf060d8f60f56e7629b");
            } else if (c.this.a() == null) {
            } else {
                com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.NONE;
                com.sankuai.waimai.platform.domain.manager.user.a.a(c.this.a(), new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c3c5f5e274a86ee5177396f239a49f4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c3c5f5e274a86ee5177396f239a49f4");
                        } else {
                            com.sankuai.waimai.platform.capacity.abtest.d.a(c.this.a());
                        }
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements a.InterfaceC0834a {
        public static ChangeQuickRedirect a;
        a.g b;

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2ae28f44ef7ca3bb42e72b09e27fcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2ae28f44ef7ca3bb42e72b09e27fcd");
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.InterfaceC0834a
        public final void a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369cbb97a8da3114213c295eb986774d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369cbb97a8da3114213c295eb986774d");
            } else {
                com.sankuai.waimai.business.im.api.a.a().a(c.this.a(), (SessionId) null, 2, 0L, com.sankuai.waimai.platform.domain.core.poi.b.a(str), str, j, 10, ((BaseActivity) c.this.a()).w(), false);
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.InterfaceC0834a
        public final void a(a.g gVar) {
            this.b = gVar;
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.InterfaceC0834a
        public final void a() {
            this.b = null;
        }

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.InterfaceC0834a
        public final void a(long j, short s) {
            Object[] objArr = {new Long(j), Short.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cefbccaee1d4e4832bb27a615faf50eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cefbccaee1d4e4832bb27a615faf50eb");
            } else {
                com.sankuai.waimai.business.im.api.a.a().a(j, s, "pub-service", new d.a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa7ef8c03ce4b83d0774a013a8762454", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa7ef8c03ce4b83d0774a013a8762454");
                        } else if (a.this.b != null) {
                            a.this.b.a(i, false);
                        }
                    }
                });
            }
        }
    }
}
