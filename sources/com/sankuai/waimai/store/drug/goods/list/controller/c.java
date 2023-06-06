package com.sankuai.waimai.store.drug.goods.list.controller;

import android.app.Activity;
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
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.s;
import com.sankuai.shangou.stone.util.t;
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
    com.sankuai.waimai.store.viewblocks.e f;
    com.sankuai.waimai.store.i.share.b g;
    com.sankuai.waimai.store.im.number.c h;
    protected View.OnClickListener i;
    a.InterfaceC1326a j;
    private e.a o;

    public abstract View b();

    public void b(View view) {
    }

    public abstract TextView c();

    public static /* synthetic */ int a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "7b44962eb7d45b998d26094cb0596efe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "7b44962eb7d45b998d26094cb0596efe")).intValue() : cVar.c().getVisibility() == 0 ? 1 : 0;
    }

    public static /* synthetic */ String a(c cVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bb2044febfb62d9bf7101796729708bd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bb2044febfb62d9bf7101796729708bd") : !TextUtils.isEmpty(str) ? Uri.parse(str).buildUpon().appendQueryParameter("biz_im_from", str2).build().toString() : str;
    }

    public c(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7f5ff8818264157ee51661283c3454", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7f5ff8818264157ee51661283c3454");
            return;
        }
        this.h = new com.sankuai.waimai.store.im.number.c() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.number.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc27c8081213538b60bf1cf19b656bf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc27c8081213538b60bf1cf19b656bf0");
                    return;
                }
                c cVar2 = c.this;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "449b656ad3fa8e6a3dd08ca4e08e8d3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "449b656ad3fa8e6a3dd08ca4e08e8d3a");
                    return;
                }
                if (i > 0) {
                    cVar2.c().setVisibility(0);
                    if (i <= 99) {
                        cVar2.c().setText(String.valueOf(i));
                    } else {
                        cVar2.c().setText("99+");
                    }
                } else {
                    cVar2.c().setVisibility(8);
                }
                if (cVar2.f != null) {
                    cVar2.f.b(i);
                }
            }
        };
        this.i = new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "954576fe7542a4864bbf960257483d1f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "954576fe7542a4864bbf960257483d1f");
                    return;
                }
                c.this.a();
                if (c.this.f.b()) {
                    c.this.f.a();
                    return;
                }
                GetMenuResponse getMenuResponse = (GetMenuResponse) c.this.n.m().a("restaurant_menu_data", (Class<Object>) GetMenuResponse.class);
                if (getMenuResponse != null) {
                    c.this.c = getMenuResponse;
                }
                c.this.f.a(c.this.c);
                c.this.f.b(c.this.b());
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_PKwLc").a("is_fold", Integer.valueOf(c.this.f.b() ? 1 : 0)).a("new_message_badge", Integer.valueOf(c.a(c.this))).a("poi_id", c.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v())).a();
            }
        };
        this.j = new a.InterfaceC1326a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.share.a.InterfaceC1326a
            public final void a(@Nullable String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f44a0c84e3e13e29d6a5792dcb257cf6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f44a0c84e3e13e29d6a5792dcb257cf6");
                    return;
                }
                if (c.this.m instanceof SCBaseActivity) {
                    ((SCBaseActivity) c.this.m).v();
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
                    hashMap.put("poi_id", Long.valueOf(c.this.b.g()));
                    hashMap.put("spu_id", "");
                    bundle.putInt("source", 4);
                    com.sankuai.waimai.store.manager.share.a.a(c.this.m, sCShareTip2, c.this, c.this.g, bundle, hashMap);
                }
            }
        };
        this.o = new e.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void g() {
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7a06b22f53d7948bd523c4989dbc52f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7a06b22f53d7948bd523c4989dbc52f");
                    return;
                }
                com.sankuai.waimai.store.manager.user.a.a(c.this.m, new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.6.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "538b85b1d970a37b7286852c3a61ecaf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "538b85b1d970a37b7286852c3a61ecaf");
                            return;
                        }
                        Activity activity = c.this.m;
                        Object[] objArr4 = {activity, 103};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.util.d.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "943ed4a7cf153db6cde771357912b63a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "943ed4a7cf153db6cde771357912b63a");
                        } else {
                            com.sankuai.waimai.platform.capacity.abtest.d.a(activity, "scene=drug", 103);
                        }
                    }
                });
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_4vdrU").a("index", Integer.valueOf(c.this.f.c(1))).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c20a07808d9bd29c36a00d6d9ec5d40c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c20a07808d9bd29c36a00d6d9ec5d40c");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", c.this.b.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v()));
                hashMap.put("index", Integer.valueOf(c.this.f.c(2)));
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_y9Ftn").b(hashMap).a();
                if (c.this.d != null && c.this.d.getActivityId() != 0) {
                    HashSet<String> a2 = ab.b().a(c.this.m, "has_clicked_activity_share_button", (HashSet<String>) null);
                    if (a2 == null) {
                        a2 = new HashSet<>();
                    }
                    a2.add(String.valueOf(c.this.d.getActivityId()));
                    ab.b().b(c.this.m, "has_clicked_activity_share_button", a2);
                }
                if (c.this.d != null) {
                    if (k.b()) {
                        c.this.d.setMiniprogramType(0);
                    } else {
                        c.this.d.setMiniprogramType(2);
                    }
                    com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_ZcbTM").a("channel_id", c.this.d.getChannels()).a();
                    if (TextUtils.isEmpty(c.this.d.getMiniProgramId())) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("source", 4);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("channel_id", c.this.d.getChannels());
                        hashMap2.put("poi_id", c.this.b.d());
                        hashMap2.put("spu_id", "");
                        com.sankuai.waimai.store.manager.share.a.a(c.this.m, c.this.d, c.this, c.this.g, bundle, hashMap2);
                    } else {
                        if (c.this.m instanceof SCBaseActivity) {
                            ((SCBaseActivity) c.this.m).u();
                        }
                        com.sankuai.waimai.store.drug.goods.list.share.a aVar = new com.sankuai.waimai.store.drug.goods.list.share.a(c.this.m, c.this.d.getIcon());
                        aVar.a(c.this.e);
                        aVar.a(c.this.j);
                    }
                }
                c.this.f.a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48fa4714d0a4664b34eef0272f5b1cf1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48fa4714d0a4664b34eef0272f5b1cf1");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("sg-dx-im-from", "sg-from-Restaurant");
                bundle.putString("sg-msgOriginId", "c_waimai_qeknbhm9");
                com.sankuai.waimai.business.im.api.a.a().a(c.this.m, (SessionId) null, 1, 0L, c.this.b.g(), 0L, 10, "", false, bundle);
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_1aJbL").a("index", Integer.valueOf(c.this.f.c(3))).a("new_message_badge", Integer.valueOf(c.this.c().getVisibility() == 0 ? 2 : 0)).a("poi_id", c.this.b.d()).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(int i, int i2, boolean z, String str) {
                final String a2;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51f26bb2285c52778b74a0af123b3e15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51f26bb2285c52778b74a0af123b3e15");
                    return;
                }
                if (i == 1) {
                    a2 = c.a(c.this, str, "2");
                } else {
                    a2 = i == 2 ? c.a(c.this, str, "1") : str;
                }
                if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                    com.sankuai.waimai.store.router.d.a(c.this.m, a2);
                } else {
                    com.sankuai.waimai.store.manager.user.a.a(c.this.m, new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.6.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db3316c100a8bcde8157ff488ee430d1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db3316c100a8bcde8157ff488ee430d1");
                            } else {
                                com.sankuai.waimai.store.router.d.a(c.this.m, a2);
                            }
                        }
                    });
                }
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_kSuht").a("index", Integer.valueOf(i2)).a("new_message_badge", Integer.valueOf(c.a(c.this))).a("poi_id", c.this.b.d()).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaaa5134ed58ee440140410b7c2c2dc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaaa5134ed58ee440140410b7c2c2dc1");
                    return;
                }
                com.sankuai.waimai.store.drug.util.d.a(c.this.m, c.this.b.b.getLongPoiId(), c.this.b.b.getStringPoiId(), 101, c.this.b.b, 1, c.this.n.n());
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_Aurrk").a("index", Integer.valueOf(c.this.f.c(6))).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d669d111cc1bbd18c9a50f49c5a312f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d669d111cc1bbd18c9a50f49c5a312f0");
                    return;
                }
                final c cVar2 = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "75f013d53f42ff1520262177712bec2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "75f013d53f42ff1520262177712bec2c");
                } else {
                    boolean z = !cVar2.b.b.isFavorite();
                    if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "ebf8a635fc15932233677b927a0419f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "ebf8a635fc15932233677b927a0419f2");
                        } else {
                            new CustomDialog.a(cVar2.m).a(R.string.wm_sc_takeout_warm_tip).b(R.string.wm_sc_goods_list_collect_tips_to_login).a(R.string.wm_sc_comon_to_login_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.8
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d88a754e954d49682d19912c930a1d1e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d88a754e954d49682d19912c930a1d1e");
                                        return;
                                    }
                                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COLLECT;
                                    com.sankuai.waimai.store.manager.user.a.a((Context) c.this.m);
                                }
                            }).b(R.string.wm_sc_goods_list_collect_tips_to_login_later, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.9
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "566aec2b70cc40f1316d87ba8f148a88", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "566aec2b70cc40f1316d87ba8f148a88");
                                    }
                                }
                            }).a(false).b();
                        }
                    } else if (z) {
                        com.sankuai.waimai.store.drug.manager.collection.b.a().a(cVar2.m, cVar2.b.b.getOfficialPoiId(), cVar2.n.l());
                    } else {
                        com.sankuai.waimai.store.drug.manager.collection.b.a().b(cVar2.m, cVar2.b.b.getOfficialPoiId(), cVar2.n.l());
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", c.this.b.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v()));
                hashMap.put("type", Integer.valueOf(c.this.b.b.isFavorite() ? 1 : 2));
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_79bdr").b(hashMap).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e476b7963bc87e90a24c84b7e5120f84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e476b7963bc87e90a24c84b7e5120f84");
                } else if (c.this.b.c()) {
                    com.sankuai.waimai.store.drug.util.d.a(c.this.m, c.this.b.b.getLongPoiId(), c.this.b.h(), 101, c.this.b.b, 0, c.this.n.n());
                    c cVar2 = c.this;
                    Object[] objArr3 = {"b_suD8h"};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "e158c8e6a4197de179ebc1a9e80d8458", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "e158c8e6a4197de179ebc1a9e80d8458");
                    } else if (cVar2.b.c()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", cVar2.b.d());
                        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(cVar2.b.v()));
                        com.sankuai.waimai.store.manager.judas.b.a(cVar2.n.b(), "b_suD8h").b(hashMap).a();
                    }
                }
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "923edbc6c6772bf5b77206a8dca188e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "923edbc6c6772bf5b77206a8dca188e7");
                    return;
                }
                com.sankuai.waimai.store.router.d.a(c.this.m, str);
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_GSJvy").a("index", Integer.valueOf(i)).a();
            }

            @Override // com.sankuai.waimai.store.viewblocks.e.a
            public final void a(final View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ef4602a0d989b9727db1e247200fd76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ef4602a0d989b9727db1e247200fd76");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(c.this.n.b(), "b_waimai_p9n5xgeo_mc").a("poi_id", c.this.b.d()).a();
                if (c.this.c == null || com.sankuai.shangou.stone.util.a.b(c.this.c.menuInfoArrayList)) {
                    return;
                }
                Iterator<GetMenuResponse.MenuInfo> it = c.this.c.menuInfoArrayList.iterator();
                while (it.hasNext()) {
                    GetMenuResponse.MenuInfo next = it.next();
                    if (next != null && next.b == 10) {
                        GetMenuResponse.MenuInfo.AdditionalInfo additionalInfo = next.g;
                        if (additionalInfo == null || additionalInfo.d == null) {
                            am.a(c.this.m, (int) R.string.wm_sg_shortcut_error);
                            return;
                        }
                        final GetMenuResponse.MenuInfo.AdditionalInfo.b bVar = additionalInfo.d;
                        if (TextUtils.isEmpty(bVar.c) || TextUtils.isEmpty(bVar.a) || TextUtils.isEmpty(bVar.b)) {
                            am.a(c.this.m, (int) R.string.wm_sg_shortcut_error);
                            return;
                        } else {
                            m.b(bVar.b).a(new b.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.6.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a(Bitmap bitmap) {
                                    Object[] objArr3 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e056204b4a12411df76322cba6a391c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e056204b4a12411df76322cba6a391c");
                                        return;
                                    }
                                    c cVar2 = c.this;
                                    Context context = view.getContext();
                                    String str = bVar.c;
                                    String str2 = bVar.a;
                                    Object[] objArr4 = {context, str, str2, bitmap};
                                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "7c11b14d724d9dfe7a9c16dacdb2ccd8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "7c11b14d724d9dfe7a9c16dacdb2ccd8");
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
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b997db67d5cc25458ff730f00a4932b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b997db67d5cc25458ff730f00a4932b");
                                    } else {
                                        am.a(c.this.m, (int) R.string.wm_sg_shortcut_network_error);
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
                Object[] objArr2 = {Integer.valueOf(i), list, sparseArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f135b8489f050cba870a457c4c9545c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f135b8489f050cba870a457c4c9545c7");
                    return;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    switch (list.get(i2).intValue()) {
                        case 1:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_HgRNe").a("index", Integer.valueOf(i2)).a();
                            continue;
                        case 2:
                            a2 = com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_iITgs").a("poi_id", c.this.b.d());
                            str = KernelConfig.KEY_CONTAINER_TYPE;
                            v = c.this.b.v();
                            break;
                        case 3:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_j3bF8").a("index", Integer.valueOf(i2)).a("new_message_badge", Integer.valueOf(sparseArray.get(3).getUnReadOrRedDotVisible() ? 2 : 0)).a("poi_id", c.this.b.d()).a();
                            continue;
                        case 4:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_waimai_6ee6dth0_mv").a("index", Integer.valueOf(i2)).a("new_message_badge", Integer.valueOf(c.a(c.this))).a("poi_id", c.this.b.d()).a();
                            continue;
                        case 5:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_k7JL1").a("index", Integer.valueOf(i2)).a();
                            continue;
                        case 6:
                            com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_FHtF6").a("index", Integer.valueOf(i2)).a();
                            continue;
                        case 7:
                            c cVar2 = c.this;
                            Object[] objArr3 = {"b_x9DU9"};
                            ChangeQuickRedirect changeQuickRedirect3 = c.a;
                            if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "406a76a4cf3ea11510b217cd92fe9c63", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "406a76a4cf3ea11510b217cd92fe9c63");
                                continue;
                            } else if (cVar2.b.c()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("poi_id", cVar2.b.d());
                                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(cVar2.b.v()));
                                com.sankuai.waimai.store.manager.judas.b.b(cVar2.n.b(), "b_x9DU9").b(hashMap).a();
                            }
                        case 8:
                            a2 = com.sankuai.waimai.store.manager.judas.b.b(c.this.n.b(), "b_waimai_b_79bdr_mv").a("poi_id", c.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(c.this.b.v()));
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
                    a2.a(str, Integer.valueOf(v)).a("index", Integer.valueOf(i2)).a();
                }
            }
        };
        this.b = this.l;
        this.g = new com.sankuai.waimai.store.share.c(cVar.b(), "b_66ir7ie8", cVar.k());
        this.n.m().c("restaurant_menu_service", (String) new com.sankuai.waimai.store.drug.goods.list.interfaces.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.goods.list.interfaces.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea1bf00eb9b2056c8186e19bbe00ba2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea1bf00eb9b2056c8186e19bbe00ba2a");
                } else {
                    c.this.d();
                }
            }
        });
        com.sankuai.waimai.store.drug.manager.collection.b.a().a(new com.sankuai.waimai.store.i.collection.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void c(String str) {
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f598eeea56e13beb2288e7db93c08dda", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f598eeea56e13beb2288e7db93c08dda");
                    return;
                }
                c.this.b.b.setFavorite(true);
                am.a(c.this.m, (int) R.string.wm_sc_common_collect_success);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbb80e077bcafa3762ebc0999351b22b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbb80e077bcafa3762ebc0999351b22b");
                    return;
                }
                c.this.b.b.setFavorite(false);
                am.a(c.this.m, (int) R.string.wm_sc_common_collect_cancel);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef90f0d8aa3314db8ea660c3b6d9481b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef90f0d8aa3314db8ea660c3b6d9481b");
                } else if (com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_COLLECT) {
                } else {
                    if (z) {
                        am.a(c.this.m, (int) R.string.wm_sc_common_haved_collect);
                    } else {
                        com.sankuai.waimai.store.drug.manager.collection.b.a().a(c.this.m, c.this.b.b.getOfficialPoiId(), c.this.n.l());
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f77ac425a798ad650bd24e557191d844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f77ac425a798ad650bd24e557191d844");
            return;
        }
        super.a(view);
        b(view);
        a();
        com.sankuai.waimai.drug.im.number.a a2 = com.sankuai.waimai.drug.im.number.a.a();
        com.sankuai.waimai.store.im.number.c cVar = this.h;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.drug.im.number.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "bc2561a9b33152a7bd9adb37e97f1044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "bc2561a9b33152a7bd9adb37e97f1044");
        } else if (cVar != null && !a2.b.contains(cVar)) {
            a2.a(cVar);
            a2.b.add(cVar);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d559c5f235ddf754ab875915e562e62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d559c5f235ddf754ab875915e562e62");
        } else if (this.f == null) {
            this.f = new com.sankuai.waimai.store.viewblocks.e(this.m, 1, this.l);
            this.f.i = this.o;
            this.f.a(b());
        }
    }

    void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "265cf9fc2764aafb74efba2f02db4522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "265cf9fc2764aafb74efba2f02db4522");
            return;
        }
        this.c = (GetMenuResponse) this.n.m().a("restaurant_menu_data", (Class<Object>) GetMenuResponse.class);
        a();
        a(this.c);
    }

    private void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36caceba9a76f7650b38a198986c7317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36caceba9a76f7650b38a198986c7317");
            return;
        }
        this.c = getMenuResponse;
        if (this.c != null) {
            this.f.a(this.c);
        }
        e();
        com.sankuai.waimai.drug.im.number.a.a().a(this.c);
    }

    public final void e() {
        GetMenuResponse.MenuInfo.AdditionalInfo.d poiImInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47acbc40c5ae64d2426cbdc1a48fb108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47acbc40c5ae64d2426cbdc1a48fb108");
            return;
        }
        GetMenuResponse getMenuResponse = this.c;
        if (getMenuResponse == null || (poiImInfo = getMenuResponse.getPoiImInfo()) == null) {
            return;
        }
        com.sankuai.waimai.business.im.api.a.a().a(poiImInfo.a, poiImInfo.b, "pub-service", new d.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.a
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2a520d1bfd75527733bee3d68640e3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2a520d1bfd75527733bee3d68640e3a");
                } else {
                    al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.c.7.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e55344db9db389701a7fcd4c51f788da", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e55344db9db389701a7fcd4c51f788da");
                            } else if (c.this.f != null) {
                                c.this.f.a(i);
                            }
                        }
                    }, c.this.n.l());
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.i.share.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566a672b6b79abf6d719e5b154b4e5c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566a672b6b79abf6d719e5b154b4e5c7");
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
        com.sankuai.waimai.store.manager.judas.b.a(this.n.b(), "b_RvD9N").a(AppUtil.generatePageInfoKey(this.m)).a("poi_id", this.b.d()).a("channel_id", Integer.valueOf(i)).a("act_type", str).a();
    }
}
