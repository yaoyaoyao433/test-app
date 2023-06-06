package com.sankuai.waimai.business.page.common.view.listfloat;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a = null;
    private static final int e = 2130969722;
    protected Activity b;
    protected View c;
    protected RelativeLayout d;
    private e f;

    public abstract boolean a(Context context);

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba9565149e914b5d53f31105de3936b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba9565149e914b5d53f31105de3936b");
        } else {
            this.b = activity;
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9065276bb95210fc9f56bdffc47bfe08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9065276bb95210fc9f56bdffc47bfe08");
            return;
        }
        this.c = view;
        this.d = (RelativeLayout) view.findViewById(R.id.layout_global_cart);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce0fbbd8e444d81ad8d3067b1631735c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce0fbbd8e444d81ad8d3067b1631735c");
        } else {
            this.f = new e(this.d, this.b);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ea578200e81fb2a4b3ac0417ceaa86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ea578200e81fb2a4b3ac0417ceaa86");
        } else if (this.d == null) {
        } else {
            if (a(this.b)) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f975f30637e93b2959bd9c623706d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f975f30637e93b2959bd9c623706d9");
        } else {
            this.f.a();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a503baea45fdf368699ff4242d87f178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a503baea45fdf368699ff4242d87f178");
        } else {
            this.f.b();
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161d13e1d9b61f9a959cca4b56089174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161d13e1d9b61f9a959cca4b56089174");
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }
}
