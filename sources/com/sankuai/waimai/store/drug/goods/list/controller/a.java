package com.sankuai.waimai.store.drug.goods.list.controller;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.drug.manager.collection.b;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends g implements b.a {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    protected View.OnClickListener d;

    public void b(boolean z) {
    }

    public a(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15cc885a04d26f08edaa07d1363213ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15cc885a04d26f08edaa07d1363213ff");
            return;
        }
        this.c = true;
        this.d = new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1346bd3cf3ca07e10a259a11402161db", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1346bd3cf3ca07e10a259a11402161db");
                    return;
                }
                final a aVar = a.this;
                boolean z = !a.this.b ? 1 : 0;
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e820b69249f1c91a01f13efe0cb054c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e820b69249f1c91a01f13efe0cb054c3");
                } else if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "6c71c206a413e64f9ff00daddd1ec1ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "6c71c206a413e64f9ff00daddd1ec1ab");
                    } else {
                        new CustomDialog.a(aVar.m).a(R.string.wm_sc_takeout_warm_tip).b(R.string.wm_sc_goods_list_collect_tips_to_login).a(R.string.wm_sc_comon_to_login_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.a.3
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0e73c01009ba3d82434caba4a3c2151d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0e73c01009ba3d82434caba4a3c2151d");
                                    return;
                                }
                                com.sankuai.waimai.store.manager.user.a.a().b(new com.sankuai.waimai.store.i.user.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.a.3.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.i.user.a
                                    public final void a(a.b bVar) {
                                    }

                                    @Override // com.sankuai.waimai.store.i.user.a
                                    public final void a(a.EnumC1205a enumC1205a) {
                                        Object[] objArr6 = {enumC1205a};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f1f99cae25b962fd045329a21649d926", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f1f99cae25b962fd045329a21649d926");
                                            return;
                                        }
                                        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
                                        if (enumC1205a == a.EnumC1205a.LOGIN && com.sankuai.waimai.store.manager.user.a.a().b()) {
                                            a aVar2 = a.this;
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "17bb33aae8ccfc3d5327f3782ccd7ab7", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "17bb33aae8ccfc3d5327f3782ccd7ab7");
                                                return;
                                            }
                                            com.sankuai.waimai.store.drug.manager.collection.b a2 = com.sankuai.waimai.store.drug.manager.collection.b.a();
                                            Activity activity = aVar2.m;
                                            String officialPoiId = aVar2.l.b.getOfficialPoiId();
                                            String l = aVar2.n.l();
                                            Object[] objArr8 = {activity, officialPoiId, l};
                                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.drug.manager.collection.b.a;
                                            if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "7e06ae782edfddd0e823404d02af730f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "7e06ae782edfddd0e823404d02af730f");
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
                                com.sankuai.waimai.store.manager.user.a.a((Context) a.this.m);
                            }
                        }).b(R.string.wm_sc_goods_list_collect_tips_to_login_later, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.a.4
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7b9037157e7e04b2bdeab61de3dc2f23", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7b9037157e7e04b2bdeab61de3dc2f23");
                                }
                            }
                        }).a(false).b();
                    }
                } else if (z) {
                    com.sankuai.waimai.store.drug.manager.collection.b.a().a(aVar.m, aVar.l.b.getOfficialPoiId(), aVar.n.l());
                } else {
                    com.sankuai.waimai.store.drug.manager.collection.b.a().b(aVar.m, aVar.l.b.getOfficialPoiId(), aVar.n.l());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", a.this.l.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(a.this.l.v()));
                hashMap.put("type", Integer.valueOf(a.this.b ? 1 : 2));
                com.sankuai.waimai.store.manager.judas.b.a(a.this.m, "b_79bdr").b(hashMap).a();
            }
        };
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.g
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98d9510df0e2b53101e1d957d44c727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98d9510df0e2b53101e1d957d44c727");
            return;
        }
        com.sankuai.waimai.store.drug.manager.collection.b a2 = com.sankuai.waimai.store.drug.manager.collection.b.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.manager.collection.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5c84045d21ec8d62e78e4b966276ac75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5c84045d21ec8d62e78e4b966276ac75");
        } else {
            if (a2.b == null) {
                a2.b = new ArrayList();
            }
            a2.b.add(this);
        }
        com.sankuai.waimai.store.drug.manager.collection.b.a().a(new com.sankuai.waimai.store.i.collection.a() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2fea2f00013785b1885127169680dd91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2fea2f00013785b1885127169680dd91");
                    return;
                }
                a.this.a(true);
                am.a(a.this.m, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_collect_success));
                com.sankuai.waimai.store.drug.manager.collection.b.a().a(a.this.l.g(), true);
                a.this.l.b.setFavorite(true);
                a.this.c = false;
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void b(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "847b0924733c300798a74eaa841b4fa7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "847b0924733c300798a74eaa841b4fa7");
                    return;
                }
                a.this.a(false);
                am.a(a.this.m, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_collect_cancel));
                a.this.l.b.setFavorite(false);
                a.this.c = false;
                com.sankuai.waimai.store.drug.manager.collection.b.a().a(a.this.l.g(), false);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str, boolean z) {
                Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ead20196c1eb2978ccdf20f32375351", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ead20196c1eb2978ccdf20f32375351");
                    return;
                }
                a.this.a(z);
                if (com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_COLLECT) {
                    return;
                }
                if (z) {
                    am.a(a.this.m, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_haved_collect));
                } else {
                    com.sankuai.waimai.store.drug.manager.collection.b.a().a(a.this.m, a.this.l.b.getOfficialPoiId(), a.this.n.l());
                }
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void c(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b34dfc6412100dea75dc7540979ec293", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b34dfc6412100dea75dc7540979ec293");
                } else {
                    a.this.a(false);
                }
            }
        });
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c2f9ad40cabd58891c00262f1a671e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c2f9ad40cabd58891c00262f1a671e");
            return;
        }
        if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            this.b = z;
        } else {
            this.b = false;
        }
        this.l.b.setFavorite(this.b);
        b(this.b);
    }

    @Override // com.sankuai.waimai.store.drug.manager.collection.b.a
    public final void a(long j, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018b24d2944f8e097afbc54c0e176d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018b24d2944f8e097afbc54c0e176d1f");
        } else if ((!this.c || z2) && this.l.g() == j) {
            a(z);
        }
    }
}
