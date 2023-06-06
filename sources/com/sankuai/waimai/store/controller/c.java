package com.sankuai.waimai.store.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.s;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.share.a;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.aj;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.v;
import com.sankuai.waimai.store.viewblocks.MenuItemView;
import com.sankuai.waimai.store.viewblocks.e;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c extends g implements com.sankuai.waimai.store.i.share.a {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    GetMenuResponse c;
    SCShareTip d;
    List<Poi.LabelInfoListItem> e;
    public com.sankuai.waimai.store.viewblocks.e f;
    com.sankuai.waimai.store.i.share.b g;
    public int h;
    public com.sankuai.waimai.store.im.number.c i;
    protected View.OnClickListener j;
    a.InterfaceC1326a k;
    private e.a p;

    public abstract View b();

    public void b(View view) {
    }

    public abstract TextView c();

    public static /* synthetic */ int a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "3e044283a6da91d7194dacdd002c23c0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "3e044283a6da91d7194dacdd002c23c0")).intValue() : cVar.c().getVisibility() == 0 ? 1 : 0;
    }

    public static /* synthetic */ String a(c cVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "fc6b665960ace04dbeb0d333688d3fbd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "fc6b665960ace04dbeb0d333688d3fbd") : !TextUtils.isEmpty(str) ? Uri.parse(str).buildUpon().appendQueryParameter("biz_im_from", str2).build().toString() : str;
    }

    public c(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06dda8e0e899ed395e641945557f5030", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06dda8e0e899ed395e641945557f5030");
            return;
        }
        this.i = new com.sankuai.waimai.store.im.number.c() { // from class: com.sankuai.waimai.store.controller.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.number.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "564acc1eadd6d528897e5067fe67c173", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "564acc1eadd6d528897e5067fe67c173");
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d2763c1aef6f51aea42025321fc42ba1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d2763c1aef6f51aea42025321fc42ba1");
                    return;
                }
                if (i > 0) {
                    cVar.c().setVisibility(0);
                    if (i <= 99) {
                        cVar.c().setText(String.valueOf(i));
                    } else {
                        cVar.c().setText("99+");
                    }
                } else {
                    cVar.c().setVisibility(8);
                }
                if (cVar.f != null) {
                    cVar.f.b(i);
                }
            }
        };
        this.j = new View.OnClickListener() { // from class: com.sankuai.waimai.store.controller.c.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c9b5f9b365f4486a9541f3cdef7722a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c9b5f9b365f4486a9541f3cdef7722a");
                    return;
                }
                c.this.a();
                if (c.this.f.b()) {
                    c.this.f.a();
                    return;
                }
                GetMenuResponse getMenuResponse = (GetMenuResponse) c.this.o.m().a("restaurant_menu_data", (Class<Object>) GetMenuResponse.class);
                if (getMenuResponse != null) {
                    c.this.c = getMenuResponse;
                }
                c.this.f.a(c.this.c);
                c.this.f.b(c.this.b());
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_PKwLc").a("is_fold", Integer.valueOf(c.this.f.b() ? 1 : 0)).a("new_message_badge", Integer.valueOf(c.a(c.this))).a("poi_id", c.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v())).a();
                final c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "0f095954f30c4f9302566700db3fabbb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "0f095954f30c4f9302566700db3fabbb");
                    return;
                }
                final List list = (List) com.sankuai.waimai.store.config.i.h().a("class_load", new TypeToken<ArrayList<String>>() { // from class: com.sankuai.waimai.store.controller.c.7
                }.getType());
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                    al.a(new al.a() { // from class: com.sankuai.waimai.store.controller.c.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.util.al.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5b5b6e8e47218e882c50a5a83dd5150b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5b5b6e8e47218e882c50a5a83dd5150b");
                                return;
                            }
                            for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                                if (i % 2 == c.this.h) {
                                    String str = (String) list.get(i);
                                    if (!TextUtils.isEmpty(str)) {
                                        try {
                                            Class.forName(str);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                            c.this.h = c.this.h == 0 ? 1 : 0;
                        }
                    }, (String) null);
                }
            }
        };
        this.k = new a.InterfaceC1326a() { // from class: com.sankuai.waimai.store.controller.c.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.share.a.InterfaceC1326a
            public final void a(@Nullable String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d82b809edfff970d480ea3b348fee11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d82b809edfff970d480ea3b348fee11");
                    return;
                }
                if (c.this.n instanceof SCBaseActivity) {
                    ((SCBaseActivity) c.this.n).v();
                }
                if (c.this.d != null) {
                    SCShareTip sCShareTip = (SCShareTip) s.a(c.this.d);
                    if (sCShareTip != null) {
                        if (!TextUtils.isEmpty(str)) {
                            sCShareTip.setIcon(str);
                        }
                    } else {
                        sCShareTip = c.this.d;
                    }
                    SCShareTip sCShareTip2 = sCShareTip;
                    Bundle bundle = new Bundle();
                    HashMap hashMap = new HashMap();
                    hashMap.put("channel_id", c.this.d.getChannels());
                    hashMap.put("poi_id", c.this.b.d());
                    hashMap.put("spu_id", "");
                    bundle.putInt("source", 4);
                    com.sankuai.waimai.store.manager.share.a.a(c.this.n, sCShareTip2, c.this, c.this.g, bundle, hashMap);
                }
            }
        };
        this.p = new e.a() { // from class: com.sankuai.waimai.store.controller.c.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ab7669efbae28c72ff1263ff3a6241b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ab7669efbae28c72ff1263ff3a6241b");
                    return;
                }
                com.sankuai.waimai.store.manager.user.a.a(c.this.n, new Runnable() { // from class: com.sankuai.waimai.store.controller.c.10.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c181a08bf08044dc8e5bc1846a5f2e43", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c181a08bf08044dc8e5bc1846a5f2e43");
                        } else {
                            com.sankuai.waimai.store.router.g.a(c.this.n, 103);
                        }
                    }
                });
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_4vdrU").a("index", Integer.valueOf(c.this.f.c(1))).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b20bb9594a3a625e3e84dc93149e634", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b20bb9594a3a625e3e84dc93149e634");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", c.this.b.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v()));
                hashMap.put("index", Integer.valueOf(c.this.f.c(2)));
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_y9Ftn").b(hashMap).a();
                if (c.this.d != null && c.this.d.getActivityId() != 0) {
                    HashSet<String> a2 = ab.b().a(c.this.n, "has_clicked_activity_share_button", (HashSet<String>) null);
                    if (a2 == null) {
                        a2 = new HashSet<>();
                    }
                    a2.add(String.valueOf(c.this.d.getActivityId()));
                    ab.b().b(c.this.n, "has_clicked_activity_share_button", a2);
                }
                if (c.this.d != null) {
                    if (k.b()) {
                        c.this.d.setMiniprogramType(0);
                    } else {
                        c.this.d.setMiniprogramType(2);
                    }
                    com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_ZcbTM").a("channel_id", c.this.d.getChannels()).a();
                    if (TextUtils.isEmpty(c.this.d.getMiniProgramId())) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("source", 4);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("channel_id", c.this.d.getChannels());
                        hashMap2.put("poi_id", c.this.b.d());
                        hashMap2.put("spu_id", "");
                        com.sankuai.waimai.store.manager.share.a.a(c.this.n, c.this.d, c.this, c.this.g, bundle, hashMap2);
                    } else {
                        if (c.this.n instanceof SCBaseActivity) {
                            ((SCBaseActivity) c.this.n).u();
                        }
                        com.sankuai.waimai.store.goods.list.share.a aVar = new com.sankuai.waimai.store.goods.list.share.a(c.this.n, c.this.d.getIcon());
                        aVar.a(c.this.e);
                        aVar.a(c.this.k);
                    }
                }
                c.this.f.a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46b9c02c77b29df1307ea9391bcda2e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46b9c02c77b29df1307ea9391bcda2e3");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("sg-dx-im-from", "sg-from-Restaurant");
                bundle.putString("sg-msgOriginId", "c_waimai_qeknbhm9");
                com.sankuai.waimai.business.im.api.a.a().a(c.this.n, (SessionId) null, 1, 0L, c.this.b.f(), 0L, 10, "", false, bundle);
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_1aJbL").a("index", Integer.valueOf(c.this.f.c(3))).a("new_message_badge", Integer.valueOf(c.this.c().getVisibility() == 0 ? 2 : 0)).a("poi_id", c.this.b.d()).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(int i, int i2, boolean z, String str) {
                final String a2;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f688ace30e053048adc546a96ccdbff7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f688ace30e053048adc546a96ccdbff7");
                    return;
                }
                if (i == 1) {
                    a2 = c.a(c.this, str, "2");
                } else {
                    a2 = i == 2 ? c.a(c.this, str, "1") : str;
                }
                if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                    com.sankuai.waimai.store.router.d.a(c.this.n, a2);
                } else {
                    com.sankuai.waimai.store.manager.user.a.a(c.this.n, new Runnable() { // from class: com.sankuai.waimai.store.controller.c.10.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39435814588a403a8fe8ac327ae5c361", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39435814588a403a8fe8ac327ae5c361");
                            } else {
                                com.sankuai.waimai.store.router.d.a(c.this.n, a2);
                            }
                        }
                    });
                }
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_kSuht").a("index", Integer.valueOf(i2)).a("new_message_badge", Integer.valueOf(c.a(c.this))).a("poi_id", c.this.b.d()).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41d88fd45a29c28e213e1b74295e8219", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41d88fd45a29c28e213e1b74295e8219");
                    return;
                }
                com.sankuai.waimai.store.router.g.a(c.this.n, c.this.b.b.getId(), c.this.b.b.getStringPoiId(), 101, c.this.b.b, 1, c.this.o.b());
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_Aurrk").a("index", Integer.valueOf(c.this.f.c(6))).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e33548cd3ff73362755c60a750e845c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e33548cd3ff73362755c60a750e845c4");
                    return;
                }
                final c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b95655c8c148fe1704b8d57920bd0ffb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b95655c8c148fe1704b8d57920bd0ffb");
                } else {
                    boolean z = !cVar.b.b.isFavorite();
                    if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "aba20a2828ba0c9e8ea56d7d5eda3a23", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "aba20a2828ba0c9e8ea56d7d5eda3a23");
                        } else {
                            new CustomDialog.a(cVar.n).a(R.string.wm_sc_takeout_warm_tip).b(R.string.wm_sc_goods_list_collect_tips_to_login).a(R.string.wm_sc_comon_to_login_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.controller.c.2
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "462f46937723aa410598d0b55497ffad", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "462f46937723aa410598d0b55497ffad");
                                        return;
                                    }
                                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COLLECT;
                                    com.sankuai.waimai.store.manager.user.a.a((Context) c.this.n);
                                }
                            }).b(R.string.wm_sc_goods_list_collect_tips_to_login_later, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.controller.c.3
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "17b8afb1b788c97ab73aaa09172e284e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "17b8afb1b788c97ab73aaa09172e284e");
                                    }
                                }
                            }).a(false).b();
                        }
                    } else if (z) {
                        com.sankuai.waimai.store.manager.collection.b.a().a(cVar.n, cVar.b.b.getOfficialPoiId(), cVar.o.l());
                    } else {
                        com.sankuai.waimai.store.manager.collection.b.a().b(cVar.n, cVar.b.b.getOfficialPoiId(), cVar.o.l());
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", c.this.b.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v()));
                hashMap.put("type", Integer.valueOf(c.this.b.b.isFavorite() ? 1 : 2));
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_79bdr").b(hashMap).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void f() {
                int i;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "370c439ccccfcac5b46f9e716646b0c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "370c439ccccfcac5b46f9e716646b0c6");
                } else if (c.this.b.c()) {
                    com.sankuai.waimai.store.router.g.a(c.this.n, c.this.b.b.getId(), c.this.b.b.getStringPoiId(), 101, c.this.b.b, 0, c.this.o.b());
                    c cVar = c.this;
                    Object[] objArr3 = {"b_suD8h"};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "8239bc46088cef8cfcb49b13c0175539", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "8239bc46088cef8cfcb49b13c0175539");
                    } else if (cVar.b.c()) {
                        String str = "-999";
                        Poi.PoiComment poiComment = cVar.b.b.poiComment;
                        if (poiComment != null) {
                            int i2 = com.sankuai.shangou.stone.util.a.a((List) poiComment.comments) > 0 ? 1 : 0;
                            int i3 = com.sankuai.shangou.stone.util.a.a((List) poiComment.commentLabels) > 0 ? 1 : 0;
                            r8 = i2;
                            str = poiComment.commentScore;
                            i = i3;
                        } else {
                            i = 0;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", cVar.b.d());
                        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(cVar.b.v()));
                        hashMap.put("score", str);
                        hashMap.put("has_comment", Integer.valueOf(r8));
                        hashMap.put("has_word", Integer.valueOf(i));
                        com.sankuai.waimai.store.manager.judas.b.a(cVar.o.b(), "b_suD8h").b(hashMap).a();
                    }
                }
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d1224592a6e6d7c059f42d731e7ba41", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d1224592a6e6d7c059f42d731e7ba41");
                    return;
                }
                com.sankuai.waimai.store.router.d.a(c.this.n, str);
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_GSJvy").a("index", Integer.valueOf(i)).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(final View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bbaebc24a3259309bb25fcb66348257", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bbaebc24a3259309bb25fcb66348257");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_waimai_p9n5xgeo_mc").a("poi_id", c.this.b.d()).a();
                if (c.this.c == null || com.sankuai.shangou.stone.util.a.b(c.this.c.menuInfoArrayList)) {
                    return;
                }
                Iterator<GetMenuResponse.MenuInfo> it = c.this.c.menuInfoArrayList.iterator();
                while (it.hasNext()) {
                    GetMenuResponse.MenuInfo next = it.next();
                    if (next != null && next.b == 10) {
                        GetMenuResponse.MenuInfo.AdditionalInfo additionalInfo = next.g;
                        if (additionalInfo == null || additionalInfo.d == null) {
                            am.a(c.this.n, (int) R.string.wm_sg_shortcut_error);
                            return;
                        }
                        final GetMenuResponse.MenuInfo.AdditionalInfo.b bVar = additionalInfo.d;
                        if (TextUtils.isEmpty(bVar.c) || TextUtils.isEmpty(bVar.a) || TextUtils.isEmpty(bVar.b)) {
                            am.a(c.this.n, (int) R.string.wm_sg_shortcut_error);
                            return;
                        } else {
                            m.b(bVar.b).a(new b.a() { // from class: com.sankuai.waimai.store.controller.c.10.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a(Bitmap bitmap) {
                                    Object[] objArr3 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "054b31d190135532d89ea0c505cb280c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "054b31d190135532d89ea0c505cb280c");
                                        return;
                                    }
                                    c cVar = c.this;
                                    Context context = view.getContext();
                                    String str = bVar.c;
                                    String str2 = bVar.a;
                                    Object[] objArr4 = {context, str, str2, bitmap};
                                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "88b2a0e64a9f1eddf7f1ffdf904293fa", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "88b2a0e64a9f1eddf7f1ffdf904293fa");
                                        return;
                                    }
                                    aj a2 = aj.a();
                                    a2.b = str;
                                    a2.c = str2;
                                    a2.a(bitmap).a(context);
                                    new CustomDialog.a(context).a(context.getString(R.string.wm_sg_shortcut_alert_dialog_title)).b(context.getString(R.string.wm_sg_shortcut_alert_dialog_message, v.c ? context.getString(R.string.wm_sg_shortcut_current_app_meituan) : context.getString(R.string.wm_sg_shortcut_current_app_waimai))).a(context.getString(R.string.wm_sc_common_ok), (DialogInterface.OnClickListener) null).a(true).b();
                                }

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31026cb48b27effca560de5ef60da240", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31026cb48b27effca560de5ef60da240");
                                    } else {
                                        am.a(c.this.n, (int) R.string.wm_sg_shortcut_network_error);
                                    }
                                }
                            });
                            return;
                        }
                    }
                }
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                com.sankuai.waimai.store.callback.a a2;
                String str;
                int v;
                int i2;
                int i3;
                Object[] objArr2 = {Integer.valueOf(i), list, sparseArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69f82dfeeae424e85154259f056c689d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69f82dfeeae424e85154259f056c689d");
                    return;
                }
                for (int i4 = 0; i4 < list.size(); i4++) {
                    switch (list.get(i4).intValue()) {
                        case 1:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_HgRNe").a("index", Integer.valueOf(i4)).a();
                            continue;
                        case 2:
                            a2 = com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_iITgs").a("poi_id", c.this.b.d());
                            str = KernelConfig.KEY_CONTAINER_TYPE;
                            v = c.this.b.v();
                            break;
                        case 3:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_j3bF8").a("index", Integer.valueOf(i4)).a("new_message_badge", Integer.valueOf(sparseArray.get(3).getUnReadOrRedDotVisible() ? 2 : 0)).a("poi_id", c.this.b.d()).a();
                            continue;
                        case 4:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_waimai_6ee6dth0_mv").a("index", Integer.valueOf(i4)).a("new_message_badge", Integer.valueOf(c.a(c.this))).a("poi_id", c.this.b.d()).a();
                            continue;
                        case 5:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_k7JL1").a("index", Integer.valueOf(i4)).a();
                            continue;
                        case 6:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_FHtF6").a("index", Integer.valueOf(i4)).a();
                            continue;
                        case 7:
                            c cVar = c.this;
                            Object[] objArr3 = {"b_x9DU9"};
                            ChangeQuickRedirect changeQuickRedirect3 = c.a;
                            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "0d4169b183921f23ed8bdc50e15ad40f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "0d4169b183921f23ed8bdc50e15ad40f");
                                continue;
                            } else if (cVar.b.c()) {
                                String str2 = "-999";
                                Poi.PoiComment poiComment = cVar.b.b.poiComment;
                                if (poiComment != null) {
                                    int i5 = com.sankuai.shangou.stone.util.a.a((List) poiComment.comments) > 0 ? 1 : 0;
                                    i3 = com.sankuai.shangou.stone.util.a.a((List) poiComment.commentLabels) > 0 ? 1 : 0;
                                    String str3 = poiComment.commentScore;
                                    i2 = i5;
                                    str2 = str3;
                                } else {
                                    i2 = 0;
                                    i3 = 0;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("poi_id", cVar.b.d());
                                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(cVar.b.v()));
                                hashMap.put("score", str2);
                                hashMap.put("has_comment", Integer.valueOf(i2));
                                hashMap.put("has_word", Integer.valueOf(i3));
                                com.sankuai.waimai.store.manager.judas.b.b(cVar.o.b(), "b_x9DU9").b(hashMap).a();
                            }
                        case 8:
                            a2 = com.sankuai.waimai.store.manager.judas.b.b(c.this.o.b(), "b_waimai_b_79bdr_mv").a("poi_id", c.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v()));
                            str = "type";
                            if (c.this.b.b.isFavorite()) {
                                v = 1;
                                break;
                            } else {
                                v = 2;
                                break;
                            }
                        default:
                    }
                    a2.a(str, Integer.valueOf(v)).a("index", Integer.valueOf(i4)).a();
                }
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd9b801fa8331d1e38ca0e7951952ae6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd9b801fa8331d1e38ca0e7951952ae6");
                } else if (c.this.c == null || com.sankuai.shangou.stone.util.a.b(c.this.c.menuInfoArrayList)) {
                } else {
                    Iterator<GetMenuResponse.MenuInfo> it = c.this.c.menuInfoArrayList.iterator();
                    while (it.hasNext()) {
                        GetMenuResponse.MenuInfo next = it.next();
                        if (next != null && next.b == 17 && next.g != null && next.g.f != null && !t.a(next.g.f.upcScheme)) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("poiId", c.this.b.f());
                            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, c.this.b.h());
                            com.sankuai.waimai.store.router.d.a(c.this.n, next.g.f.upcScheme, bundle);
                            com.sankuai.waimai.store.manager.judas.b.a(c.this.o.b(), "b_waimai_d1uasick_mc").a(AppUtil.generatePageInfoKey(c.this.n)).a("poi_id", c.this.b.d()).a();
                        }
                    }
                }
            }
        };
        this.b = this.m;
        this.g = new com.sankuai.waimai.store.share.c(dVar.b(), "b_66ir7ie8", dVar.k());
        this.o.m().c("restaurant_menu_service", (String) new com.sankuai.waimai.store.goods.list.interfaces.a() { // from class: com.sankuai.waimai.store.controller.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.interfaces.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f7413d1eed86899989cc4f9d7b58825", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f7413d1eed86899989cc4f9d7b58825");
                } else {
                    c.this.d();
                }
            }
        });
        com.sankuai.waimai.store.manager.collection.b.a().a(new com.sankuai.waimai.store.i.collection.a() { // from class: com.sankuai.waimai.store.controller.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void c(String str) {
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8317566807e50ce1c4220b7df0b3ffa7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8317566807e50ce1c4220b7df0b3ffa7");
                    return;
                }
                c.this.b.b.setFavorite(true);
                am.a(c.this.n, (int) R.string.wm_sc_common_collect_success);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "691673c5c3bc3ceeccf54d7bca642ce4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "691673c5c3bc3ceeccf54d7bca642ce4");
                    return;
                }
                c.this.b.b.setFavorite(false);
                am.a(c.this.n, (int) R.string.wm_sc_common_collect_cancel);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14405e4d1b6362e9f983eb14cd54e50c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14405e4d1b6362e9f983eb14cd54e50c");
                } else if (com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_COLLECT) {
                } else {
                    if (z) {
                        am.a(c.this.n, (int) R.string.wm_sc_common_haved_collect);
                    } else {
                        com.sankuai.waimai.store.manager.collection.b.a().a(c.this.n, c.this.b.b.getOfficialPoiId(), c.this.o.l());
                    }
                }
            }
        });
        this.h = ab.b().b((Context) this.n, "key_unused_flag", 1);
    }

    @Override // com.sankuai.waimai.store.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b04d9a10215ba66bb912c4cf214eedd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b04d9a10215ba66bb912c4cf214eedd");
            return;
        }
        super.a(view);
        b(view);
        a();
        com.sankuai.waimai.store.im.number.d.a().a(this.i);
        d();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b396f5b62c6008c1e4b96ea9eb04fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b396f5b62c6008c1e4b96ea9eb04fc9");
        } else if (this.f == null) {
            this.f = new com.sankuai.waimai.store.viewblocks.e(this.n, 1, this.m);
            this.f.i = this.p;
            this.f.a(b());
        }
    }

    public final void a(SCShareTip sCShareTip, List<Poi.LabelInfoListItem> list) {
        this.d = sCShareTip;
        this.e = list;
    }

    void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd48fd3954f0e4562df80d1ac1d12929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd48fd3954f0e4562df80d1ac1d12929");
            return;
        }
        this.c = (GetMenuResponse) this.o.m().a("restaurant_menu_data", (Class<Object>) GetMenuResponse.class);
        a(this.c);
    }

    private void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687bf0440db2c2880d49170b2d89501f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687bf0440db2c2880d49170b2d89501f");
            return;
        }
        this.c = getMenuResponse;
        if (this.c != null) {
            this.f.a(this.c);
        }
        e();
        com.sankuai.waimai.store.im.number.d.a().a(this.c);
    }

    public final void e() {
        GetMenuResponse.MenuInfo.AdditionalInfo.d poiImInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994d69d8c369f3687978be57c043cc0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994d69d8c369f3687978be57c043cc0a");
            return;
        }
        GetMenuResponse getMenuResponse = this.c;
        if (getMenuResponse == null || (poiImInfo = getMenuResponse.getPoiImInfo()) == null) {
            return;
        }
        com.sankuai.waimai.business.im.api.a.a().a(poiImInfo.a, poiImInfo.b, "pub-service", new d.a() { // from class: com.sankuai.waimai.store.controller.c.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.a
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cd2050474e18a279bf7d9ac44fe0e43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cd2050474e18a279bf7d9ac44fe0e43");
                } else {
                    al.a(new Runnable() { // from class: com.sankuai.waimai.store.controller.c.11.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17d0342147a5686e77154062815db1e7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17d0342147a5686e77154062815db1e7");
                            } else if (c.this.f != null) {
                                c.this.f.a(i);
                            }
                        }
                    }, c.this.o.l());
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.i.share.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b1419b005c6a812cbf1fac6716895e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b1419b005c6a812cbf1fac6716895e");
            return;
        }
        String str = "";
        if (this.b.b != null && !com.sankuai.shangou.stone.util.a.b(this.b.b.getShareLabelInfo())) {
            ArrayList arrayList = new ArrayList();
            for (Poi.LabelInfoListItem labelInfoListItem : this.b.b.getShareLabelInfo()) {
                if (labelInfoListItem != null) {
                    arrayList.add(String.valueOf(labelInfoListItem.type));
                }
            }
            str = t.a(arrayList, CommonConstant.Symbol.COMMA);
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.o.b(), "b_RvD9N").a(AppUtil.generatePageInfoKey(this.n)).a("poi_id", this.b.d()).a("channel_id", Integer.valueOf(i)).a("act_type", str).a();
    }
}
