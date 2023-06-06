package com.sankuai.waimai.store.order.detail.blockview;

import android.content.Context;
import android.support.constraint.R;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.dialog.MedicineInstructionDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public TextView e;
    public ImageView f;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_detail_medicine_instruction_block_layout;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa50dfe259ac502b73abf675471c35cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa50dfe259ac502b73abf675471c35cc");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782ca31e43d1c32265b6f200bef4781c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782ca31e43d1c32265b6f200bef4781c");
            return;
        }
        super.b();
        this.e = (TextView) this.b.findViewById(R.id.tv_desc);
        this.f = (ImageView) this.b.findViewById(R.id.iv_desc_dialog);
    }

    public final void e() {
        MedicineInstructionDialog remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f078a4c71ac3daeba6f3450084fc6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f078a4c71ac3daeba6f3450084fc6ee");
            return;
        }
        MedicineInstructionDialog.a aVar = MedicineInstructionDialog.a.C1252a.a;
        Context context = this.c;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = MedicineInstructionDialog.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "24aa86b8406fa5c41af3822859037d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "24aa86b8406fa5c41af3822859037d96");
        } else if (context == null || !aVar.b.containsKey(context) || (remove = aVar.b.remove(context)) == null || !remove.isShowing()) {
        } else {
            com.sankuai.waimai.store.util.d.a(remove);
        }
    }
}
