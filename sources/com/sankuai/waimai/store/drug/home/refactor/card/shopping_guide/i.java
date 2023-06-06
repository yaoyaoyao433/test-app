package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a;
import com.sankuai.waimai.store.drug.home.newp.sg.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.drug.home.newp.block.optimization.a<BaseModuleDesc.a> {
    public static ChangeQuickRedirect h;
    private final com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a<BaseModuleDesc> i;
    private f j;

    public i(@NonNull com.sankuai.waimai.store.param.a aVar, @NonNull SCBaseActivity sCBaseActivity, @NonNull f fVar) {
        super(aVar, sCBaseActivity);
        Object[] objArr = {aVar, sCBaseActivity, fVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781e5c44a78fe2265220a7d351830869", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781e5c44a78fe2265220a7d351830869");
            return;
        }
        this.i = new com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a<>();
        this.j = fVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d23c9f8474e822849358722b79903942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d23c9f8474e822849358722b79903942");
        } else if ("mach".equals(this.j.a)) {
            com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a<BaseModuleDesc> aVar2 = this.i;
            a.InterfaceC1154a<BaseModuleDesc> interfaceC1154a = new a.InterfaceC1154a<BaseModuleDesc>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.i.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a.InterfaceC1154a
                public final /* synthetic */ void a(BaseModuleDesc baseModuleDesc) {
                    a.C1157a c1157a;
                    com.sankuai.waimai.store.drug.home.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> a2;
                    com.sankuai.waimai.store.drug.home.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar3;
                    BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
                    Object[] objArr3 = {baseModuleDesc2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dbeab5726992b84ba0ad8fef3522bb66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dbeab5726992b84ba0ad8fef3522bb66");
                        return;
                    }
                    if (baseModuleDesc2.jsonData == null || baseModuleDesc2.jsonData.size() == 0) {
                        baseModuleDesc2.layoutInfo.a = 0;
                        baseModuleDesc2.layoutInfo.b = 0;
                    }
                    i iVar = i.this;
                    i iVar2 = i.this;
                    String str = baseModuleDesc2.moduleId;
                    i iVar3 = i.this;
                    BaseModuleDesc.a aVar4 = baseModuleDesc2.layoutInfo;
                    Object[] objArr4 = {aVar4};
                    ChangeQuickRedirect changeQuickRedirect4 = i.h;
                    if (PatchProxy.isSupport(objArr4, iVar3, changeQuickRedirect4, false, "b377c64a36341bbe9796accb490ca008", RobustBitConfig.DEFAULT_VALUE)) {
                        c1157a = (a.C1157a) PatchProxy.accessDispatch(objArr4, iVar3, changeQuickRedirect4, false, "b377c64a36341bbe9796accb490ca008");
                    } else {
                        Object[] objArr5 = {aVar4};
                        ChangeQuickRedirect changeQuickRedirect5 = a.C1157a.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "180672d876b36837b684254af98f7585", RobustBitConfig.DEFAULT_VALUE)) {
                            c1157a = (a.C1157a) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "180672d876b36837b684254af98f7585");
                        } else if (aVar4 != null) {
                            c1157a = new a.C1157a();
                            c1157a.b = aVar4.a;
                            c1157a.c = aVar4.b;
                        } else {
                            c1157a = new a.C1157a();
                        }
                    }
                    Object[] objArr6 = {str, c1157a};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.drug.home.newp.block.optimization.a.a;
                    if (PatchProxy.isSupport(objArr6, iVar2, changeQuickRedirect6, false, "b0b50a328780ae4e01fc11d4144918c6", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar3 = (com.sankuai.waimai.store.drug.home.newp.sg.a) PatchProxy.accessDispatch(objArr6, iVar2, changeQuickRedirect6, false, "b0b50a328780ae4e01fc11d4144918c6");
                    } else {
                        Object[] objArr7 = {9};
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.drug.home.newp.block.optimization.a.a;
                        if (PatchProxy.isSupport(objArr7, iVar2, changeQuickRedirect7, false, "7ac79c1f1a172c661ae667150d38cfa0", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = (com.sankuai.waimai.store.drug.home.newp.sg.a) PatchProxy.accessDispatch(objArr7, iVar2, changeQuickRedirect7, false, "7ac79c1f1a172c661ae667150d38cfa0");
                        } else {
                            a2 = iVar2.e.a(9);
                            a2.e = iVar2.d.size();
                            iVar2.d.add(a2);
                        }
                        if (c1157a != null) {
                            a2.f = c1157a;
                        }
                        iVar2.f.put(a2.e, str);
                        aVar3 = a2;
                    }
                    Object[] objArr8 = {aVar3, baseModuleDesc2};
                    ChangeQuickRedirect changeQuickRedirect8 = i.h;
                    if (PatchProxy.isSupport(objArr8, iVar, changeQuickRedirect8, false, "71013ca444d1739f3a2d2cf3cd6c6278", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, iVar, changeQuickRedirect8, false, "71013ca444d1739f3a2d2cf3cd6c6278");
                    } else if (aVar3 == null) {
                    } else {
                        aVar3.g = baseModuleDesc2;
                    }
                }
            };
            Object[] objArr3 = {"mach", interfaceC1154a};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "12b1d49e9f3c0787d3d7286565854f51", RobustBitConfig.DEFAULT_VALUE)) {
                com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a aVar3 = (com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "12b1d49e9f3c0787d3d7286565854f51");
            } else {
                aVar2.b.put("mach", interfaceC1154a);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.block.optimization.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc85d1d8b0a69a2f620b3ccceb50af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc85d1d8b0a69a2f620b3ccceb50af0");
            return;
        }
        com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a<BaseModuleDesc> aVar = this.i;
        String str = this.j.a;
        BaseModuleDesc baseModuleDesc = this.j.b;
        Object[] objArr2 = {str, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "00d70fe1a460285c06c8bc7bd9e68c18", RobustBitConfig.DEFAULT_VALUE)) {
            a.InterfaceC1154a interfaceC1154a = (a.InterfaceC1154a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "00d70fe1a460285c06c8bc7bd9e68c18");
            return;
        }
        a.InterfaceC1154a<BaseModuleDesc> interfaceC1154a2 = aVar.b.get(str);
        if (interfaceC1154a2 != null) {
            interfaceC1154a2.a(baseModuleDesc);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.block.optimization.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c556a0b3024735cb4c2411bf307a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c556a0b3024735cb4c2411bf307a87");
        } else {
            super.a();
        }
    }
}
