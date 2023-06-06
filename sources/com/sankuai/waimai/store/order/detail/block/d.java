package com.sankuai.waimai.store.order.detail.block;

import android.content.Context;
import android.view.View;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.order.detail.dialog.MedicineInstructionDialog;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = Map.class, nativeId = {"wm_order_detail_sg_medicine_instruction_template"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class d extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.e, a, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "136bfbcb412c8d823053c31715bccfd8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "136bfbcb412c8d823053c31715bccfd8") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa7f032fda1574d1a4873ccb29a772d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa7f032fda1574d1a4873ccb29a772d") : new com.sankuai.waimai.store.order.detail.blockview.e(m());
    }

    public d(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9477e2d56ad2d5a5ee4ca742a315c6a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9477e2d56ad2d5a5ee4ca742a315c6a3");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f335842e5ff295d985b7d9ea7a95b481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f335842e5ff295d985b7d9ea7a95b481");
        } else {
            super.s();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de3555717b5506a6ef2fc80b2ceb822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de3555717b5506a6ef2fc80b2ceb822");
            return;
        }
        super.I();
        final com.sankuai.waimai.store.order.detail.blockview.e r2 = r();
        Map<String, String> e = ((a) this.n).e();
        Object[] objArr2 = {e};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.detail.blockview.e.d;
        if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "ab0dad137f5d4067e474b0addf0e4e12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "ab0dad137f5d4067e474b0addf0e4e12");
            return;
        }
        String str = e.get("usage_desc");
        final String str2 = e.get("tips_title");
        final String str3 = e.get("tips_desc");
        if (!t.a(str)) {
            r2.e.setText(str);
        }
        if (t.a(str2) || t.a(str3)) {
            return;
        }
        r2.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.blockview.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicineInstructionDialog medicineInstructionDialog;
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fbe8fcae6fe62472316b4015be633a9f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fbe8fcae6fe62472316b4015be633a9f");
                } else if (r2.c != null) {
                    MedicineInstructionDialog.a aVar = MedicineInstructionDialog.a.C1252a.a;
                    Context context = r2.c;
                    Object[] objArr4 = {context};
                    ChangeQuickRedirect changeQuickRedirect4 = MedicineInstructionDialog.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "1c0899fedcfb73e7f9e71672b55e47ed", RobustBitConfig.DEFAULT_VALUE)) {
                        medicineInstructionDialog = (MedicineInstructionDialog) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "1c0899fedcfb73e7f9e71672b55e47ed");
                    } else {
                        if (!aVar.b.containsKey(context)) {
                            aVar.b.put(context, new MedicineInstructionDialog(context));
                        }
                        medicineInstructionDialog = aVar.b.get(context);
                    }
                    String str4 = str2;
                    String str5 = str3;
                    Object[] objArr5 = {str4, str5};
                    ChangeQuickRedirect changeQuickRedirect5 = MedicineInstructionDialog.a;
                    if (PatchProxy.isSupport(objArr5, medicineInstructionDialog, changeQuickRedirect5, false, "6097a903c7df6f1c146fa9fb78cc5066", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, medicineInstructionDialog, changeQuickRedirect5, false, "6097a903c7df6f1c146fa9fb78cc5066");
                    } else if (t.a(str4) || t.a(str5)) {
                    } else {
                        medicineInstructionDialog.c.setText(str4);
                        medicineInstructionDialog.b.setText(str5);
                        com.sankuai.waimai.store.util.d.b(medicineInstructionDialog);
                    }
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<Map<String, String>> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ab850ce96527b5b28da0eb721a7187", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ab850ce96527b5b28da0eb721a7187");
            }
            return Boolean.valueOf(this.c != 0);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a089693ee8cd11268bb17a69663a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a089693ee8cd11268bb17a69663a18");
            return;
        }
        super.bE_();
        r().e();
    }
}
