package com.sankuai.waimai.store.controller;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.View;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.manager.collection.b;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends g implements b.a {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    protected View.OnClickListener d;

    @Override // com.sankuai.waimai.store.controller.g
    public void a(View view) {
    }

    public void b(boolean z) {
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "faa6e9153e1b898e7391bbe163f82e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "faa6e9153e1b898e7391bbe163f82e30");
        } else if (j.h().a("send_knb_event_after_collect", true)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "com.meituan.waimai.restaurantLiked.notification");
                jSONObject.put("poiID", str);
                jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
                jSONObject.put("isLiked", z);
                JsHandlerFactory.publish(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public a(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5890c7a9cff7d4e843828b0598d8b1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5890c7a9cff7d4e843828b0598d8b1c");
            return;
        }
        this.c = true;
        this.d = new View.OnClickListener() { // from class: com.sankuai.waimai.store.controller.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52d428f41cae82c00c46d8dd4ea91117", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52d428f41cae82c00c46d8dd4ea91117");
                    return;
                }
                final a aVar = a.this;
                boolean z = !a.this.b ? 1 : 0;
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "68cb3698c39033e35ffcfcf51e2f06c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "68cb3698c39033e35ffcfcf51e2f06c5");
                } else if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "57b889b389cb91d084c42743a59bb9a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "57b889b389cb91d084c42743a59bb9a4");
                    } else {
                        new CustomDialog.a(aVar.n).a(R.string.wm_sc_takeout_warm_tip).b(R.string.wm_sc_goods_list_collect_tips_to_login).a(R.string.wm_sc_comon_to_login_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.controller.a.3
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8a11060775024e7946c28d77881cc812", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8a11060775024e7946c28d77881cc812");
                                    return;
                                }
                                com.sankuai.waimai.store.manager.user.a.a().b(new com.sankuai.waimai.store.i.user.a() { // from class: com.sankuai.waimai.store.controller.a.3.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.i.user.a
                                    public final void a(a.b bVar) {
                                    }

                                    @Override // com.sankuai.waimai.store.i.user.a
                                    public final void a(a.EnumC1205a enumC1205a) {
                                        Object[] objArr6 = {enumC1205a};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b5c439465ad5fd68d8538c533501b761", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b5c439465ad5fd68d8538c533501b761");
                                            return;
                                        }
                                        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
                                        if (enumC1205a == a.EnumC1205a.LOGIN && com.sankuai.waimai.store.manager.user.a.a().b()) {
                                            a aVar2 = a.this;
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "959744b00bb1ed76341411251c86ead0", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "959744b00bb1ed76341411251c86ead0");
                                                return;
                                            }
                                            com.sankuai.waimai.store.manager.collection.b a2 = com.sankuai.waimai.store.manager.collection.b.a();
                                            Activity activity = aVar2.n;
                                            String officialPoiId = aVar2.m.b.getOfficialPoiId();
                                            String l = aVar2.o.l();
                                            Object[] objArr8 = {activity, officialPoiId, l};
                                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.manager.collection.b.a;
                                            if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "60cabdffd0364f142d2992ffece8198c", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "60cabdffd0364f142d2992ffece8198c");
                                                return;
                                            } else {
                                                com.sankuai.waimai.foundation.core.service.collect.b.a().checkCollectPoi(activity, officialPoiId, l);
                                                return;
                                            }
                                        }
                                        a.this.a(false);
                                    }
                                });
                                com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COLLECT;
                                com.sankuai.waimai.store.manager.user.a.a((Context) a.this.n);
                            }
                        }).b(R.string.wm_sc_goods_list_collect_tips_to_login_later, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.controller.a.4
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cd6a30c6fc11a141fa47392004f3842e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cd6a30c6fc11a141fa47392004f3842e");
                                }
                            }
                        }).a(false).b();
                    }
                } else if (z) {
                    com.sankuai.waimai.store.manager.collection.b.a().a(aVar.n, aVar.m.b.getOfficialPoiId(), aVar.o.l());
                } else {
                    com.sankuai.waimai.store.manager.collection.b.a().b(aVar.n, aVar.m.b.getOfficialPoiId(), aVar.o.l());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", a.this.m.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(a.this.m.v()));
                hashMap.put("type", Integer.valueOf(a.this.b ? 1 : 2));
                com.sankuai.waimai.store.manager.judas.b.a(a.this.n, "b_79bdr").b(hashMap).a();
            }
        };
        com.sankuai.waimai.store.manager.collection.b.a().a(new com.sankuai.waimai.store.i.collection.a() { // from class: com.sankuai.waimai.store.controller.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cedad575b2000762c55a5dcaaf726223", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cedad575b2000762c55a5dcaaf726223");
                    return;
                }
                a.this.a(true);
                am.a(a.this.n, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_collect_success));
                com.sankuai.waimai.store.manager.collection.b.a().a(a.this.m.f(), true);
                a.this.m.b.setFavorite(true);
                a.a(a.this, String.valueOf(a.this.m.f()), a.this.m.h(), true);
                a.this.c = false;
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73b66f6b6b71a043e50c93066e7047d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73b66f6b6b71a043e50c93066e7047d9");
                    return;
                }
                a.this.a(false);
                am.a(a.this.n, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_collect_cancel));
                a.this.m.b.setFavorite(false);
                a.this.c = false;
                a.a(a.this, String.valueOf(a.this.m.f()), a.this.m.h(), false);
                com.sankuai.waimai.store.manager.collection.b.a().a(a.this.m.f(), false);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f995c47dbfbe3fb85334187a2dd77e38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f995c47dbfbe3fb85334187a2dd77e38");
                    return;
                }
                a.this.a(z);
                if (com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_COLLECT) {
                    return;
                }
                if (z) {
                    am.a(a.this.n, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_haved_collect));
                } else {
                    com.sankuai.waimai.store.manager.collection.b.a().a(a.this.n, a.this.m.b.getOfficialPoiId(), a.this.o.l());
                }
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void c(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2794f8dc4a02b256437ebb52d951379b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2794f8dc4a02b256437ebb52d951379b");
                } else {
                    a.this.a(false);
                }
            }
        });
        com.sankuai.waimai.store.manager.collection.b a2 = com.sankuai.waimai.store.manager.collection.b.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.collection.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3b743699ccce6f2580e5a8916f6065d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3b743699ccce6f2580e5a8916f6065d6");
            return;
        }
        if (a2.b == null) {
            a2.b = new ArrayList();
        }
        a2.b.add(this);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d7764937767d0d7efc92b9b5d3d514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d7764937767d0d7efc92b9b5d3d514");
            return;
        }
        if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            this.b = z;
        } else {
            this.b = false;
        }
        this.m.b.setFavorite(this.b);
        b(this.b);
    }

    @Override // com.sankuai.waimai.store.manager.collection.b.a
    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03872faca19ecedcc42e986b2b641909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03872faca19ecedcc42e986b2b641909");
        } else if (this.c || this.m.f() != j) {
        } else {
            a(z);
        }
    }
}
