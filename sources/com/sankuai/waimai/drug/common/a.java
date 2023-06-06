package com.sankuai.waimai.drug.common;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends j {
    public static ChangeQuickRedirect h;
    @NonNull
    private final b i;

    public a(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42aa43505341bab918da1aedb89bad50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42aa43505341bab918da1aedb89bad50");
        } else {
            this.i = new b(this.mContext, this.b);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.i;
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4068efeba7e530fbbf21f8ac140c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4068efeba7e530fbbf21f8ac140c2c");
            return;
        }
        b bVar = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7eec7d0d948fee2562828d78c1e56546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7eec7d0d948fee2562828d78c1e56546");
        } else if (bVar.c != null) {
            if (bVar.c.z() || !bVar.b.i(bVar.c.d())) {
                bVar.a(0);
                bVar.e.setTextColor(bVar.getResources().getColor(R.color.wm_sg_color_BCBCBD));
                bVar.d.setColorFilter(bVar.getResources().getColor(R.color.wm_sg_color_BCBCBD));
                bVar.setEnabled(false);
                return;
            }
            bVar.a(bVar.b.a(bVar.c.d()));
            bVar.e.setTextColor(bVar.getResources().getColor(R.color.wm_sg_color_575859));
            bVar.d.setColorFilter(bVar.getResources().getColor(R.color.wm_sg_color_575859));
            bVar.setEnabled(true);
        }
    }
}
