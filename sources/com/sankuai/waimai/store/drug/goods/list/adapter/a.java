package com.sankuai.waimai.store.drug.goods.list.adapter;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final int[] b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c596206bda80f9bccaef48c8117c624", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c596206bda80f9bccaef48c8117c624");
        } else {
            this.b = new int[]{R.id.wm_sc_drug_shop_content_mrn_container_id_1, R.id.wm_sc_drug_shop_content_mrn_container_id_2, R.id.wm_sc_drug_shop_content_mrn_container_id_3, R.id.wm_sc_drug_shop_content_mrn_container_id_4, R.id.wm_sc_drug_shop_content_mrn_container_id_5, R.id.wm_sc_drug_shop_content_mrn_container_id_6, R.id.wm_sc_drug_shop_content_mrn_container_id_7, R.id.wm_sc_drug_shop_content_mrn_container_id_8, R.id.wm_sc_drug_shop_content_mrn_container_id_9, R.id.wm_sc_drug_shop_content_mrn_container_id_10};
        }
    }

    public final int a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574105ff60a42614d53a67b827165e09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574105ff60a42614d53a67b827165e09")).intValue();
        }
        int i2 = -1;
        while (true) {
            if (i >= this.b.length) {
                break;
            }
            i2 = this.b[i];
            if (i2 != -1) {
                this.b[i] = -1;
                break;
            }
            i++;
        }
        return i2 == -1 ? View.generateViewId() : i2;
    }
}
