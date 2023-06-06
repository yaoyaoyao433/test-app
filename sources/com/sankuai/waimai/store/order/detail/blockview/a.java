package com.sankuai.waimai.store.order.detail.blockview;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public com.sankuai.waimai.store.consultation.a e;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_st_drug_consultation_entry;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfb5d3b44a135c59ca7eee84eae3d73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfb5d3b44a135c59ca7eee84eae3d73");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5323218aa5d8e907e75c6461f0f89c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5323218aa5d8e907e75c6461f0f89c82");
            return;
        }
        super.b();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.sankuai.shangou.stone.util.h.a(this.c, 167.0f);
        }
        Activity activity = (Activity) this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db207ce98bdfe7ee6b00e4ded300b28e", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db207ce98bdfe7ee6b00e4ded300b28e");
        } else {
            str = getClass().getSimpleName() + System.currentTimeMillis();
        }
        this.e = new com.sankuai.waimai.store.consultation.a(activity, str, "c_hgowsqb", "");
        this.e.a((ViewGroup) this.b.findViewById(R.id.drug_im_entrance_container));
    }
}
