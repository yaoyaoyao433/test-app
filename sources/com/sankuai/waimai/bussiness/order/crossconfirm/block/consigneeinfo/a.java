package com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<CT extends b & com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d & com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b> extends com.meituan.android.cube.pga.block.a<c, e, CT> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602ceb8fea56b4baa7cde373c3ade8df", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602ceb8fea56b4baa7cde373c3ade8df") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab53799f20ec078b9feec301b38a3d92", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab53799f20ec078b9feec301b38a3d92") : new c(m(), (com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
    }

    public a(CT ct) {
        super(ct);
        Object[] objArr = {ct};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e972f0551ea94a21a481f10ffdf3e023", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e972f0551ea94a21a481f10ffdf3e023");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc9ecaf8eb142f32335eb74093e16f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc9ecaf8eb142f32335eb74093e16f4");
            return;
        }
        super.s();
        ((b) F()).m().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d20670eab644845f33e18f71dc35bb22", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d20670eab644845f33e18f71dc35bb22") : ((c) a.this.g).q;
            }
        };
        ((b) F()).i().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd28b17cb91b876b79407ccc51bfd865", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd28b17cb91b876b79407ccc51bfd865") : ((c) a.this.g).e;
            }
        };
        ((b) F()).j().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d795314b8261a9c5e9d301c7367b49a", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d795314b8261a9c5e9d301c7367b49a");
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                return PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b3c898aa6f6ccb5cc594e7633f1eb9c0", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b3c898aa6f6ccb5cc594e7633f1eb9c0") : Integer.valueOf(cVar.m.d);
            }
        };
        ((b) F()).k().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "684a35e8673f4676bf1fbb05a5fec824", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "684a35e8673f4676bf1fbb05a5fec824");
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "92a5794453365b51d8cc38a78fd6a45d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (AddressItem) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "92a5794453365b51d8cc38a78fd6a45d");
                }
                if (cVar.e == null || TextUtils.isEmpty(cVar.e.addrBrief)) {
                    cVar.a(-1L, 1);
                    return null;
                }
                return cVar.e;
            }
        };
        ((b) F()).l().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6231c4fdfff2e66973adf534b938801b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6231c4fdfff2e66973adf534b938801b") : Integer.valueOf(((c) a.this.g).g);
            }
        };
        ((b) F()).o().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.14
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7987616fde4ed0fcf5f5bb5d9192c13", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7987616fde4ed0fcf5f5bb5d9192c13") : ((c) a.this.g).s;
            }
        };
        ((b) F()).p().a(new com.meituan.android.cube.pga.action.b<i.c<Integer, Integer>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.15
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Integer, Integer> cVar) {
                i.c<Integer, Integer> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af1e2edb7763771d5bb81f1890b5843a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af1e2edb7763771d5bb81f1890b5843a");
                    return;
                }
                final c cVar3 = (c) a.this.g;
                int intValue = cVar2.c.intValue();
                int intValue2 = cVar2.d.intValue();
                Object[] objArr3 = {Integer.valueOf(intValue), Integer.valueOf(intValue2)};
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar3, changeQuickRedirect3, false, "eafa6f52e91041b307bcf98fb3b439da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar3, changeQuickRedirect3, false, "eafa6f52e91041b307bcf98fb3b439da");
                    return;
                }
                String a2 = cVar3.a(intValue);
                if (TextUtils.isEmpty(a2)) {
                    a2 = cVar3.c(R.string.wm_order_confirm_still_order);
                }
                DialogInterface.OnClickListener b = cVar3.b(intValue);
                if (b == null) {
                    b = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.13
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e43e22a45acbf4f0b8442d5e76df496", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e43e22a45acbf4f0b8442d5e76df496");
                            } else {
                                c.i(cVar3);
                            }
                        }
                    };
                }
                String a3 = cVar3.a(intValue2);
                if (TextUtils.isEmpty(a3)) {
                    a3 = cVar3.c(R.string.wm_order_confirm_go_to_map);
                }
                DialogInterface.OnClickListener b2 = cVar3.b(intValue2);
                if (b2 == null) {
                    b2 = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cadb94ffecf22a0111f16ba56065470a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cadb94ffecf22a0111f16ba56065470a");
                            } else {
                                com.sankuai.waimai.bussiness.order.base.a.a(cVar3.r, AddressScene.DEFAULT_SCENE, cVar3.e, cVar3.e(), cVar3.f(), cVar3.g());
                            }
                        }
                    };
                }
                if (cVar3.r != null) {
                    new CustomDialog.a(cVar3.r).a(cVar3.c(R.string.wm_order_confirm_main_title_1)).b(cVar3.c(R.string.wm_order_confirm_sub_title_1)).b(R.drawable.wm_order_confirm_address_not_in_range_1).a(a3, b2).b(a2, b).a(true).b();
                }
            }
        });
        ((b) F()).q().b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.16
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "863c289452430aee9588144c7a4d9ae5", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "863c289452430aee9588144c7a4d9ae5") : Boolean.valueOf(((c) a.this.g).t);
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b) ((b) F())).x().a(new com.meituan.android.cube.pga.action.b<i.c<Long, Integer>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.17
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Long, Integer> cVar) {
                i.c<Long, Integer> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed1920866e779dc53bfe2f438d7fea2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed1920866e779dc53bfe2f438d7fea2f");
                } else {
                    ((c) a.this.g).a(cVar2.c.longValue(), cVar2.d.intValue());
                }
            }
        });
        ((c) this.g).u = new c.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.a
            public final void a(int i, boolean z, boolean z2) {
                Object[] objArr2 = {Integer.valueOf(i), (byte) 1, (byte) 0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03b561ef8ce1ae6f289d4339bb0e1bc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03b561ef8ce1ae6f289d4339bb0e1bc3");
                } else {
                    ((b) a.this.F()).n().a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>) new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c(i, true, false));
                }
            }
        };
        ((c) this.g).w = new c.b() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c33d61bc869e032c05d3fd3450d7b69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c33d61bc869e032c05d3fd3450d7b69");
                } else {
                    ((b) a.this.F()).r().a();
                }
            }
        };
        ((c) this.g).j.x = new c.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.a
            public final void a(AddressItem addressItem) {
                Object[] objArr2 = {addressItem};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50cc9aaedfd52182085715236b0fb44f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50cc9aaedfd52182085715236b0fb44f");
                } else if (addressItem != null) {
                    ((c) a.this.g).a(addressItem);
                } else {
                    ((b) a.this.F()).n().a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>) new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c(((c) a.this.g).g, true, false));
                }
            }
        };
        ((b) F()).g().a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "deaa4a37b98f91db708f7875c199a02f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "deaa4a37b98f91db708f7875c199a02f");
                } else if (aVar2.a == 1002 && aVar2.b == -1) {
                    c cVar = (c) a.this.g;
                    int i = aVar2.a;
                    int i2 = aVar2.b;
                    Intent intent = aVar2.c;
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                    ChangeQuickRedirect changeQuickRedirect3 = c.d;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "988393c48edc0ce22a2143fb511e8e4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "988393c48edc0ce22a2143fb511e8e4e");
                    } else {
                        cVar.j.a(i, i2, intent);
                    }
                }
            }
        });
        ((b) F()).s().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bfd8e490cdb94637bee8340cd879800", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bfd8e490cdb94637bee8340cd879800") : Boolean.valueOf(((c) a.this.g).p);
            }
        };
        ((b) F()).t().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f40539f45661a0595d8cf9073be5c6e3", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f40539f45661a0595d8cf9073be5c6e3");
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c86e4856a8f0054476f7c3604f3ff109", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c86e4856a8f0054476f7c3604f3ff109")).booleanValue();
                } else if (cVar.j != null && cVar.j.w) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        ((b) F()).u().a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63f970bb68526d5255c5bde2cd3d0ad9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63f970bb68526d5255c5bde2cd3d0ad9");
                    return;
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "68fc571a44ef724c7a278985c3068e1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "68fc571a44ef724c7a278985c3068e1e");
                } else if (cVar.j != null) {
                    cVar.j.w = false;
                }
            }
        });
        ((b) F()).v().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50da809f57f3983a405d922ace8b6828", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50da809f57f3983a405d922ace8b6828");
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c4444b6bcc36dd4665bf452a5c53e40b", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c4444b6bcc36dd4665bf452a5c53e40b")).booleanValue();
                } else if (cVar.j != null && cVar.j.b()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2feeaf0f37b3c3a5f4ff7d383f40fc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2feeaf0f37b3c3a5f4ff7d383f40fc33");
            return;
        }
        super.I();
        c cVar = (c) this.g;
        d dVar = ((e) this.n).p;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "d8681c757faa8b96de784d225763a29f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "d8681c757faa8b96de784d225763a29f");
            return;
        }
        cVar.m = dVar;
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = c.d;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b042f2503ea0ea7322327af2ad85cf07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b042f2503ea0ea7322327af2ad85cf07");
            return;
        }
        cVar.j.b(cVar.e());
        cVar.j.d = cVar.f();
        cVar.j.h = cVar.g();
        cVar.j.i = cVar.h();
        com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c cVar2 = cVar.j;
        List<Long> g = cVar.g();
        Object[] objArr4 = {g};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.a;
        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "eaf2a919fa1415bac935d4c34d00c0a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "eaf2a919fa1415bac935d4c34d00c0a0");
            i = 1;
        } else if (!com.sankuai.waimai.foundation.utils.b.b(g)) {
            StringBuilder sb = new StringBuilder();
            for (Long l : g) {
                sb.append(l);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            String sb2 = sb.toString();
            i = 1;
            if (sb2.length() > 1) {
                cVar2.e = sb2.substring(0, sb2.length() - 1);
            }
        } else {
            i = 1;
            cVar2.e = "";
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c cVar3 = cVar.j;
        List<String> h = cVar.h();
        Object[] objArr5 = new Object[i];
        objArr5[0] = h;
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.a;
        if (PatchProxy.isSupport(objArr5, cVar3, changeQuickRedirect5, false, "a5008fe5c30e3727d7e8bd70e1a44119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, cVar3, changeQuickRedirect5, false, "a5008fe5c30e3727d7e8bd70e1a44119");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(h)) {
            cVar3.f = com.sankuai.waimai.foundation.location.v2.d.a().toJson(h);
        } else {
            cVar3.f = "";
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = c.d;
        if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "7fe461c22696cf6c6a80b98520cd538b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "7fe461c22696cf6c6a80b98520cd538b");
        } else {
            cVar.h.setVisibility(0);
            cVar.n.setVisibility(0);
        }
        cVar.a(dVar);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a8d2c1f375dd5dd9531cb3729710c09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a8d2c1f375dd5dd9531cb3729710c09");
            return;
        }
        super.b(bundle);
        c cVar = (c) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "79ed2e04fb1d5a8ffd598577fc748c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "79ed2e04fb1d5a8ffd598577fc748c79");
            return;
        }
        bundle.putInt("mCurDeliveryType", cVar.g);
        bundle.putString("mPhone", cVar.s);
        bundle.putBoolean("mCheckShippingArea", cVar.t);
        bundle.putSerializable("mAddressItem", cVar.e);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "770f34faece1eee838d0c403309f6e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "770f34faece1eee838d0c403309f6e53");
            return;
        }
        super.c(bundle);
        c cVar = (c) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6d1a5a48c8e714b56b0576e1b53334bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6d1a5a48c8e714b56b0576e1b53334bf");
            return;
        }
        AddressItem c = com.sankuai.waimai.platform.domain.manager.location.a.c(cVar.r);
        if (c != null && !TextUtils.isEmpty(c.addrBrief)) {
            cVar.e = c;
        } else {
            AddressItem addressItem = (AddressItem) f.a(bundle, "mAddressItem");
            if (addressItem != null) {
                cVar.e = addressItem;
                com.sankuai.waimai.platform.domain.manager.location.a.b(cVar.r, cVar.e);
            }
        }
        cVar.g = bundle.getInt("mCurDeliveryType");
        cVar.t = bundle.getBoolean("mCheckShippingArea");
        cVar.s = bundle.getString("mPhone");
        cVar.v = true;
    }
}
