package com.sankuai.waimai.business.page.common.view.listfloat;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected View c;
    protected RelativeLayout d;
    public f e;

    public b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd52243d9573d1d6fe1631e2b4988b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd52243d9573d1d6fe1631e2b4988b9");
        } else {
            this.b = activity;
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7d0bfd7f9331340a6fd76f62017612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7d0bfd7f9331340a6fd76f62017612");
            return;
        }
        this.c = view;
        this.d = (RelativeLayout) view.findViewById(R.id.quality_tag_container);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78019c466ff817f306c503a92a6cbf45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78019c466ff817f306c503a92a6cbf45");
        } else {
            this.e = new f(this.d, this.b);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6014b59242e5c9cca3804fdffe538e16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6014b59242e5c9cca3804fdffe538e16");
        } else if (this.d == null) {
        } else {
            this.d.setVisibility(0);
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd48b77e521ccaa579faad9971b5818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd48b77e521ccaa579faad9971b5818");
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }
}
