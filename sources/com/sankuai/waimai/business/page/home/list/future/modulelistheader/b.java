package com.sankuai.waimai.business.page.home.list.future.modulelistheader;

import android.arch.lifecycle.k;
import android.content.Context;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextView e;
    TextView f;
    PersonalizedBean g;
    LinearLayout h;
    PageFragment i;
    HomePageViewModel j;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_page_home_person_tips;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9222c6f3bc2dac6a67678ded2025eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9222c6f3bc2dac6a67678ded2025eb");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3f2e5c2c8455b932ce9b938eb9ff2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3f2e5c2c8455b932ce9b938eb9ff2d");
            return;
        }
        super.b();
        this.h = (LinearLayout) this.b.findViewById(R.id.ll_tips_content);
        this.e = (TextView) this.b.findViewById(R.id.title);
        this.f = (TextView) this.b.findViewById(R.id.icon_title);
        this.b.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.modulelistheader.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf788f63b7a872838b881e9c07b8dc87", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf788f63b7a872838b881e9c07b8dc87");
                    return;
                }
                e.b();
                b.this.e();
                if (b.this.j != null) {
                    HomePageViewModel homePageViewModel = b.this.j;
                    PersonalizedBean personalizedBean = b.this.g;
                    Object[] objArr3 = {personalizedBean};
                    ChangeQuickRedirect changeQuickRedirect3 = HomePageViewModel.a;
                    if (PatchProxy.isSupport(objArr3, homePageViewModel, changeQuickRedirect3, false, "827d8d40d747ed0c7349b6d081ad7db0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, homePageViewModel, changeQuickRedirect3, false, "827d8d40d747ed0c7349b6d081ad7db0");
                    } else {
                        homePageViewModel.v.b((k<PersonalizedBean>) personalizedBean);
                    }
                }
                f.a("b_waimai_5axp6a6s_mc");
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.modulelistheader.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f76ac5aa20cffb3a54542276ae3939a4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f76ac5aa20cffb3a54542276ae3939a4");
                } else if (b.this.g == null || TextUtils.isEmpty(b.this.g.getOenPersonalizedScheme())) {
                } else {
                    com.sankuai.waimai.foundation.router.a.a(b.this.c, Uri.parse(b.this.g.getOenPersonalizedScheme()).toString(), "隐私管理");
                    f.a("b_waimai_8gxx8hsr_mc");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49e524c50e329bf87bc2f1de5d79f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49e524c50e329bf87bc2f1de5d79f2a");
        } else if (this.h == null || (layoutParams = this.h.getLayoutParams()) == null) {
        } else {
            layoutParams.height = 1;
            this.h.setLayoutParams(layoutParams);
        }
    }
}
