package com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewStub;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.a<c, d, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1349aa1280815845b2db70b0404b1b5c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1349aa1280815845b2db70b0404b1b5c") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11fb4ed67bab45ceea219c1bfd336920", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11fb4ed67bab45ceea219c1bfd336920") : new c(m(), this.h, (com.sankuai.waimai.bussiness.order.confirm.a) F());
    }

    public b(com.sankuai.waimai.bussiness.order.confirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c6198667dc51eeb6aeaefd6319d047", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c6198667dc51eeb6aeaefd6319d047");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "333ef39ef078836dd0f7b4f997ccefbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "333ef39ef078836dd0f7b4f997ccefbe");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aI.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22508911bdc7e7286492684b8ef3890e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22508911bdc7e7286492684b8ef3890e") : ((c) b.this.g).h;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aJ.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "936f54c5711483b3e26ce76bc65ea2cc", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "936f54c5711483b3e26ce76bc65ea2cc");
                }
                c cVar = (c) b.this.g;
                String str = ((d) b.this.G()).p.k;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d0f4b41c2a9b4c2e6223817d41144d6a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d0f4b41c2a9b4c2e6223817d41144d6a");
                    return null;
                } else if (aa.a(str)) {
                    cVar.i.setText(R.string.wm_order_confirm_submit);
                    return null;
                } else {
                    cVar.i.setText(str);
                    return null;
                }
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aK.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5000b4bf2e29b28c4e983aba49fd6434", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5000b4bf2e29b28c4e983aba49fd6434");
                    return;
                }
                c cVar = (c) b.this.g;
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "ec9fc16eac2874245d84ac8105fdf3a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "ec9fc16eac2874245d84ac8105fdf3a7");
                } else {
                    cVar.i.setText(str2);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aL.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "104f9e1cfdce0299b70f3a30bf7409bb", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "104f9e1cfdce0299b70f3a30bf7409bb");
                }
                if (((c) b.this.g).e == null) {
                    return b.this.i();
                }
                return ((c) b.this.g).e;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aG.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ea4a64480ff4b1552ae44de37536b90", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ea4a64480ff4b1552ae44de37536b90") : ((c) b.this.g).j;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aH.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38e2357e9ff26893ae3d1b06735f65d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38e2357e9ff26893ae3d1b06735f65d3");
                } else {
                    ((c) b.this.g).a(bool2.booleanValue());
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bd.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63684904656d12e89de3221b79d6e5d7", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63684904656d12e89de3221b79d6e5d7");
                }
                c cVar = (c) b.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "2facc84c75d9eb3fd1b6b40b39aa68e7", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "2facc84c75d9eb3fd1b6b40b39aa68e7")).booleanValue();
                } else if (cVar.k.getVisibility() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bg.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00d3203e5b109a05269357b07a69dee2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00d3203e5b109a05269357b07a69dee2") : ((c) b.this.g).e();
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bh.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4541b1c12860ac0aa1627b8bbdd985a", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4541b1c12860ac0aa1627b8bbdd985a") : Integer.valueOf(((c) b.this.g).o ? 1 : 0);
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bi.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4a710820b8c92d373cacf554b5976a8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4a710820b8c92d373cacf554b5976a8") : ((c) b.this.g).f();
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).L.a(new com.meituan.android.cube.pga.action.b<i.c<Integer, Map<String, Object>>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Integer, Map<String, Object>> cVar) {
                i.c<Integer, Map<String, Object>> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fd0b0f1246615f4ac8dc1f2da385e1c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fd0b0f1246615f4ac8dc1f2da385e1c");
                } else if (com.sankuai.waimai.platform.model.c.a().b() == 1 || cVar2 == null || cVar2.d == null || cVar2.c.intValue() != 1 || ((d) b.this.n).p == null || ((d) b.this.n).p.q == null || TextUtils.isEmpty(((d) b.this.n).p.q.uniqueIdentifyCode)) {
                } else {
                    cVar2.d.put("unique_identify_code", ((d) b.this.n).p.q.uniqueIdentifyCode);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bj.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cbab327c60fd2bb6e2c70dd28fef94a", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cbab327c60fd2bb6e2c70dd28fef94a");
                }
                if (((d) b.this.n).p == null || ((d) b.this.n).p.q == null) {
                    return null;
                }
                return ((d) b.this.n).p.q.uniqueIdentifyCode;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bk.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ba6980799801ad15e9bfa139ac1e3bd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ba6980799801ad15e9bfa139ac1e3bd");
                }
                if (((d) b.this.n).p != null && ((d) b.this.n).p.q != null && ((d) b.this.n).p.q.productList != null) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5dd668a872733e60242a98b64dbd1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5dd668a872733e60242a98b64dbd1c2");
            return;
        }
        super.I();
        c cVar = (c) this.g;
        com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d dVar = ((d) this.n).p;
        int c = ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bl.a().c();
        Object[] objArr2 = {dVar, Integer.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "ae3aee5ff859411495e6a0241f4eb174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "ae3aee5ff859411495e6a0241f4eb174");
        } else {
            cVar.a(dVar, c);
        }
    }
}
