package com.sankuai.waimai.business.page.home.layer.fault;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.model.HomePagePoiListResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private ViewStub A;
    private TextView B;
    private ImageView C;
    private View D;
    private Activity w;
    private View x;
    private PageFragment y;
    private LinearLayout z;

    public static /* synthetic */ void a(a aVar, HomePagePoiListResponse homePagePoiListResponse) {
        Object[] objArr = {homePagePoiListResponse};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f51bdc19eb2cebd1f8626a7914eb4fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f51bdc19eb2cebd1f8626a7914eb4fe1");
        } else if (homePagePoiListResponse != null) {
            String errorTip = homePagePoiListResponse.getErrorTip();
            final String errorUrl = homePagePoiListResponse.getErrorUrl();
            if (!TextUtils.isEmpty(errorTip)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = v;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "89c58e75c652f45beb18e2b2fb0597d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "89c58e75c652f45beb18e2b2fb0597d6");
                } else {
                    if (aVar.A == null) {
                        aVar.A = (ViewStub) aVar.x.findViewById(R.id.fault_tip_view_stub);
                    }
                    if (aVar.z == null) {
                        aVar.z = (LinearLayout) aVar.x.findViewById(R.id.page_common_foot_layout_main);
                    }
                    if (aVar.B == null || aVar.C == null) {
                        aVar.D = aVar.A.inflate();
                        aVar.B = (TextView) aVar.D.findViewById(R.id.fault_tip_txt);
                        aVar.C = (ImageView) aVar.D.findViewById(R.id.fault_tip_close_img);
                    }
                }
                aVar.B.setText(errorTip);
                Object[] objArr3 = {errorUrl};
                ChangeQuickRedirect changeQuickRedirect3 = v;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "9b15a42b785f74ecec082eb2e80a6263", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "9b15a42b785f74ecec082eb2e80a6263");
                } else {
                    aVar.B.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.layer.fault.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3801bc65c1802ffc813d941641efdacc", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3801bc65c1802ffc813d941641efdacc");
                            } else if (TextUtils.isEmpty(errorUrl)) {
                            } else {
                                com.sankuai.waimai.foundation.router.a.a(a.this.w, errorUrl, view.getContext().getString(R.string.wm_page_home_fault_detail));
                            }
                        }
                    });
                    aVar.C.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.layer.fault.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9d0ab4cbd9ca2d6121f0f8f5ff0369fe", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9d0ab4cbd9ca2d6121f0f8f5ff0369fe");
                            } else if (a.this.A != null) {
                                a.this.A.setVisibility(8);
                                a.this.b(0);
                                com.sankuai.waimai.business.page.homepage.manager.a.a(60);
                                ((FaultViewModel) q.a(a.this.y).a(FaultViewModel.class)).a(false);
                            }
                        }
                    });
                }
                if (aVar.D == null || aVar.D.getVisibility() != 0) {
                    return;
                }
                ((FaultViewModel) q.a(aVar.y).a(FaultViewModel.class)).a(true);
                aVar.b(90);
                com.sankuai.waimai.business.page.homepage.manager.a.a(90);
            } else if (aVar.A != null) {
                aVar.A.setVisibility(8);
                ((FaultViewModel) q.a(aVar.y).a(FaultViewModel.class)).a(false);
            }
        }
    }

    public a(PageFragment pageFragment, View view) {
        Object[] objArr = {pageFragment, view};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbe6d8117b70d2e6dd87244b4c250a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbe6d8117b70d2e6dd87244b4c250a6");
            return;
        }
        this.w = pageFragment.F;
        this.y = pageFragment;
        this.x = view;
        FragmentActivity fragmentActivity = (FragmentActivity) pageFragment.F;
        Object[] objArr2 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4a3a36dd04994b7ee12ecba34a7700d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4a3a36dd04994b7ee12ecba34a7700d");
        } else {
            ((FaultViewModel) q.a(fragmentActivity).a(FaultViewModel.class)).b.a(new l<HomePagePoiListResponse>() { // from class: com.sankuai.waimai.business.page.home.layer.fault.a.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable HomePagePoiListResponse homePagePoiListResponse) {
                    HomePagePoiListResponse homePagePoiListResponse2 = homePagePoiListResponse;
                    Object[] objArr3 = {homePagePoiListResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d70bda7ae499e217635de60d4b4f05bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d70bda7ae499e217635de60d4b4f05bf");
                    } else if (homePagePoiListResponse2 != null) {
                        a.a(a.this, homePagePoiListResponse2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf1123995a575ebdc796a48fb889485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf1123995a575ebdc796a48fb889485");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.z.setLayoutParams(marginLayoutParams);
    }
}
