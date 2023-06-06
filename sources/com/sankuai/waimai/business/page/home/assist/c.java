package com.sankuai.waimai.business.page.home.assist;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect x;
    public View A;
    int B;
    private View v;
    private View.OnClickListener w;
    protected Activity y;
    protected String z;

    public c(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb1b5ce3cf25fcbf9dec93c309c16c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb1b5ce3cf25fcbf9dec93c309c16c5");
            return;
        }
        this.B = 0;
        this.w = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.assist.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e03df8fd0b532fab0af83bfa1dc379d2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e03df8fd0b532fab0af83bfa1dc379d2");
                    return;
                }
                if (c.this.B != 0) {
                    if (c.this.B == 2) {
                        JudasManualManager.a a2 = JudasManualManager.a("b_2aunupiv").a("c_i5kxn8l");
                        a2.b = c.this.z;
                        a2.a();
                    }
                } else {
                    JudasManualManager.a a3 = JudasManualManager.a("b_z69w6iwr").a("c_m84bv26");
                    a3.b = c.this.z;
                    a3.a();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("sa_scheme_channel", c.this.B);
                c.this.a(c.this.y, bundle);
            }
        };
        this.y = activity;
        this.z = str;
    }

    public void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eccd724d3adc5f0e8a9fac1dc79a334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eccd724d3adc5f0e8a9fac1dc79a334");
            return;
        }
        this.A = view;
        if (this.v == null) {
            this.v = LayoutInflater.from(view.getContext()).inflate(R.layout.wm_page_smart_assistant_layout, (ViewGroup) view, true);
            this.v.findViewById(R.id.smart_assistant_img_poiList).setOnClickListener(this.w);
        }
    }

    public final void a(final Activity activity, final Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9463baec28d1ff0c164d47c494d7d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9463baec28d1ff0c164d47c494d7d01");
        } else if (f.a(activity)) {
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.business.page.home.assist.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2402ee5b84572d9898a23ef7de929a3f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2402ee5b84572d9898a23ef7de929a3f");
                    } else if (f.a(activity)) {
                    } else {
                        activity.overridePendingTransition(R.anim.wm_common_popup_window_slide_in, R.anim.wm_page_fading_out);
                        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.F, bundle);
                        activity.overridePendingTransition(R.anim.wm_common_popup_window_slide_in, R.anim.wm_page_fading_out);
                    }
                }
            });
        }
    }
}
