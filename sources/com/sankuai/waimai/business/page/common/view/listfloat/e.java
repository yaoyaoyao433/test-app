package com.sankuai.waimai.business.page.common.view.listfloat;

import android.app.Activity;
import android.os.Handler;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Activity b;
    boolean c;
    ViewGroup d;
    private int e;
    private Handler f;
    private Runnable g;

    public e(ViewGroup viewGroup, Activity activity) {
        Object[] objArr = {viewGroup, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c573db8dee43f5161d22ec6f7473bca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c573db8dee43f5161d22ec6f7473bca");
            return;
        }
        this.f = new Handler();
        this.g = new Runnable() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b7ae7ac033b3bf3762aa8cd8b5653f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b7ae7ac033b3bf3762aa8cd8b5653f");
                } else if (e.this.b == null || e.this.d == null || e.this.b.isFinishing() || !e.this.c) {
                } else {
                    e.this.d.animate().translationX(0.0f).alpha(1.0f).start();
                    e.this.c = false;
                }
            }
        };
        this.d = viewGroup;
        this.e = (activity.getResources().getDimensionPixelSize(R.dimen.wm_page_common_list_icon_width) / 2) + activity.getResources().getDimensionPixelOffset(R.dimen.wm_page_common_list_icon_padding);
        this.b = activity;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1801b865dac901bde4fc289a222f111a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1801b865dac901bde4fc289a222f111a");
        } else if (this.b == null || this.d == null || this.b.isFinishing()) {
        } else {
            if (this.f != null) {
                this.f.removeCallbacks(this.g);
            }
            if (this.c) {
                return;
            }
            this.d.animate().translationX(this.e).alpha(0.5f).start();
            this.c = true;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "571fe6c1d2198c56f7a55790407950c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "571fe6c1d2198c56f7a55790407950c8");
        } else if (this.f != null) {
            this.f.postDelayed(this.g, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }
}
