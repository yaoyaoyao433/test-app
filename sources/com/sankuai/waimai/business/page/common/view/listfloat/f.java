package com.sankuai.waimai.business.page.common.view.listfloat;

import android.app.Activity;
import android.os.Handler;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public Activity b;
    public boolean c;
    public ViewGroup d;
    public int e;
    public Handler f;
    public Runnable g;

    public f(ViewGroup viewGroup, Activity activity) {
        Object[] objArr = {viewGroup, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8b344dc5711c20e21e936a7557466b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8b344dc5711c20e21e936a7557466b");
            return;
        }
        this.f = new Handler();
        this.g = new Runnable() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.f.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0cc20f867dabe9ae9daeb99c22c1ab5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0cc20f867dabe9ae9daeb99c22c1ab5");
                } else if (f.this.b == null || f.this.d == null || f.this.b.isFinishing() || !f.this.c) {
                } else {
                    f.this.d.animate().translationX(0.0f).alpha(0.8f).start();
                    f.this.c = false;
                }
            }
        };
        this.d = viewGroup;
        this.e = (activity.getResources().getDimensionPixelSize(R.dimen.wm_page_common_list_icon_width) / 2) + activity.getResources().getDimensionPixelOffset(R.dimen.wm_page_common_list_icon_padding);
        this.b = activity;
    }
}
