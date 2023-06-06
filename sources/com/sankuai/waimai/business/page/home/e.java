package com.sankuai.waimai.business.page.home;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.page.common.model.EmptyBtnInfo;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.locate.a;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.foundation.location.LocationCatReporter;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static boolean g = false;
    public static boolean h = false;
    HomePageFragment b;
    com.sankuai.waimai.platform.widget.emptylayout.d c;
    ViewGroup d;
    View e;
    boolean f;
    private boolean i;
    private boolean j;
    private boolean k;
    private Dialog l;
    private com.sankuai.waimai.business.page.home.locate.a m;
    private Dialog n;
    private Dialog o;
    private Dialog p;
    private boolean q;

    public static /* synthetic */ Dialog a(e eVar, Dialog dialog) {
        eVar.n = null;
        return null;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.j = false;
        return false;
    }

    public static /* synthetic */ Dialog b(e eVar, Dialog dialog) {
        eVar.o = null;
        return null;
    }

    public static /* synthetic */ void b(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "308ef5e2e3091f60dc74445ff12b189b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "308ef5e2e3091f60dc74445ff12b189b");
            return;
        }
        eVar.b.i.a(2);
        WMLocation p = g.a().p();
        final HomePageViewModel homePageViewModel = eVar.b.m;
        if (p == null || p.getLatitude() == 0.0d || p.getLongitude() == 0.0d) {
            return;
        }
        WmAddress k = g.a().k();
        if (k != null && k.hasAddress() && homePageViewModel != null) {
            homePageViewModel.a(k.getAddress(), true);
            if (eVar.c.s == d.b.PROGRESS) {
                String address = k.getAddress();
                if (TextUtils.equals(address, com.meituan.android.singleton.b.a.getString(R.string.wm_default_address_loading))) {
                    address = "";
                }
                eVar.c.b(eVar.b.getString(R.string.wm_page_loading_poilist, address));
                return;
            }
            return;
        }
        g.a().a(p.getLatitude(), p.getLongitude(), new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.business.page.home.e.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.b
            public final void a(@Nullable WmAddress wmAddress) {
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13f237dcc5e8954b737a22b4fcb5ff58", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13f237dcc5e8954b737a22b4fcb5ff58");
                } else if (homePageViewModel == null) {
                } else {
                    if (wmAddress != null && wmAddress.hasAddress()) {
                        homePageViewModel.a(wmAddress.getAddress(), false);
                        return;
                    }
                    i.d(new com.sankuai.waimai.business.page.home.log.a().a("home_page_address").d(wmAddress == null ? "address null" : wmAddress.toString()).b(true).b());
                    homePageViewModel.a(e.this.b.F.getString(R.string.wm_page_poiList_locating_unknown), false);
                }
            }
        });
    }

    public static /* synthetic */ boolean b(e eVar, boolean z) {
        eVar.k = false;
        return false;
    }

    public static /* synthetic */ boolean c(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "4a445a20b68dfcfcbd6a7f2324ac3395", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "4a445a20b68dfcfcbd6a7f2324ac3395")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.location.utils.c.a(eVar.b.getContext()).equals(c.a.OPEN)) {
            return false;
        }
        eVar.b.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1203);
        return true;
    }

    public static /* synthetic */ boolean c(e eVar, boolean z) {
        eVar.f = false;
        return false;
    }

    public static /* synthetic */ void d(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "16d4611bf1d2dd2b3f603d045779e2c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "16d4611bf1d2dd2b3f603d045779e2c2");
            return;
        }
        PreloadDataModel.get().setLocationTimeoutState(false);
        if (eVar.n == null || !eVar.n.isShowing()) {
            if (eVar.o == null || !eVar.o.isShowing()) {
                if (eVar.p == null || !eVar.p.isShowing()) {
                    if (eVar.k) {
                        eVar.k = false;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "607f6da0f3cbf400616c545ca52eb191", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "607f6da0f3cbf400616c545ca52eb191");
                        } else if (eVar.k || g || h || eVar.b == null || f.a(eVar.b.getActivity())) {
                        } else {
                            eVar.k = true;
                            if (eVar.f) {
                                return;
                            }
                            eVar.o = new RooAlertDialog.a(new ContextThemeWrapper(eVar.b.getActivity(), 2131558627)).a(R.string.wm_page_poiList_locating_permission_request_title).b(R.string.wm_page_poiList_locating_permission_request_message).a(R.string.wm_page_poiList_locating_permission_request_button, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.4
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7618e4ebae83bccd6038047f052e573e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7618e4ebae83bccd6038047f052e573e");
                                    } else {
                                        Privacy.createPermissionGuard().a((Activity) e.this.b.getActivity(), "Locate.once", "dj-b5e9814e9fb3a8f6", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.page.home.e.4.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.meituan.android.privacy.interfaces.d
                                            public final void onResult(String str, int i2) {
                                                Object[] objArr4 = {str, Integer.valueOf(i2)};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "299955dd069c5f84662497531f2e51ed", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "299955dd069c5f84662497531f2e51ed");
                                                    return;
                                                }
                                                com.sankuai.waimai.platform.capacity.permission.a.a(str, i2);
                                                if (i2 > 0) {
                                                    if (e.c(e.this)) {
                                                        return;
                                                    }
                                                    com.sankuai.waimai.platform.capacity.log.c.a().a(1300, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
                                                    e.this.b.i.a(2);
                                                    return;
                                                }
                                                com.sankuai.waimai.platform.capacity.permission.b.a((Context) e.this.b.getActivity(), false);
                                            }
                                        });
                                    }
                                }
                            }).b(eVar.b.getString(R.string.wm_page_home_cancel_location_service), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.3
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "198a32f62fb6f3a737bf707b7c58d055", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "198a32f62fb6f3a737bf707b7c58d055");
                                    } else if (PageSP.a()) {
                                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(e.this.b).a(HomePageViewModel.class);
                                        homePageViewModel.O = true;
                                        homePageViewModel.N = true;
                                        ((HomeActionBarViewModel) q.a(e.this.b).a(HomeActionBarViewModel.class)).a(e.this.b.F);
                                    }
                                }
                            }).a(false).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.home.e.2
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    Object[] objArr3 = {dialogInterface};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9a947ab9e0f5e7afd5d2fe7ad0c6c00c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9a947ab9e0f5e7afd5d2fe7ad0c6c00c");
                                        return;
                                    }
                                    e.b(e.this, (Dialog) null);
                                    e.b(e.this, false);
                                }
                            }).b();
                        }
                    } else if (eVar.j) {
                        eVar.j = false;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "aac373455b271dd55b08b9ea1848212c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "aac373455b271dd55b08b9ea1848212c");
                        } else if (eVar.j || g || h || eVar.b == null || f.a(eVar.b.getActivity())) {
                        } else {
                            eVar.j = true;
                            if (eVar.f) {
                                return;
                            }
                            i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("0").b());
                            eVar.n = new RooAlertDialog.a(new ContextThemeWrapper(eVar.b.getActivity(), 2131558627)).a(R.string.wm_page_poiList_locating_failed).b(R.string.wm_page_home_location_service_msg).a(R.string.wm_page_home_open_location_service, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.13
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8c7fc20021439f21a24bccbfc0134754", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8c7fc20021439f21a24bccbfc0134754");
                                        return;
                                    }
                                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("4").b());
                                    if (!com.sankuai.waimai.foundation.location.utils.c.a(e.this.b.getContext()).equals(c.a.OPEN)) {
                                        e.this.b.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1203);
                                    } else {
                                        e.this.b.j.a(e.this.b);
                                    }
                                }
                            }).b(eVar.b.getString(R.string.wm_page_home_cancel_location_service), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.12
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "420f81ba1a38b9befb443749144c1bcb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "420f81ba1a38b9befb443749144c1bcb");
                                        return;
                                    }
                                    if (PageSP.a()) {
                                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(e.this.b).a(HomePageViewModel.class);
                                        homePageViewModel.O = g.a().p() == null;
                                        homePageViewModel.N = true;
                                        ((HomeActionBarViewModel) q.a(e.this.b).a(HomeActionBarViewModel.class)).a(e.this.b.F);
                                    }
                                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("5").b());
                                }
                            }).a(false).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.home.e.11
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    Object[] objArr4 = {dialogInterface};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f24da9aca11c839ac625b030736c4cda", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f24da9aca11c839ac625b030736c4cda");
                                        return;
                                    }
                                    e.a(e.this, (Dialog) null);
                                    e.a(e.this, false);
                                }
                            }).b();
                        }
                    } else if (eVar.i) {
                        eVar.i = false;
                    }
                }
            }
        }
    }

    public e(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c4fd1dd483d8ebb56933ca79ef9cb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c4fd1dd483d8ebb56933ca79ef9cb6");
            return;
        }
        this.i = false;
        this.j = false;
        this.f = false;
        this.k = false;
        this.b = homePageFragment;
        this.m = new com.sankuai.waimai.business.page.home.locate.a(homePageFragment.q());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "554938ada64bf8835afbdb718a3abc76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "554938ada64bf8835afbdb718a3abc76");
        } else {
            com.sankuai.waimai.business.page.common.util.d.a(this.b.getActivity(), new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.page.home.e.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bc7e805bb4c718a1d724e8cc55e148d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bc7e805bb4c718a1d724e8cc55e148d");
                    } else if (i > 0) {
                        if (e.c(e.this)) {
                            return;
                        }
                        com.sankuai.waimai.platform.capacity.log.c.a().a(1300, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
                        e.this.b.j.a(e.this.b);
                    } else {
                        com.sankuai.waimai.platform.capacity.permission.b.a((Context) e.this.b.getActivity(), false);
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b249c9a58da5228bf969d9c20c854a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b249c9a58da5228bf969d9c20c854a44");
        } else {
            this.c.h();
        }
    }

    public final d.b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9d4cd959b5c657dd100199d6ae6590", RobustBitConfig.DEFAULT_VALUE) ? (d.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9d4cd959b5c657dd100199d6ae6590") : this.c.s;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1278c07048e044d26c504e906ccae161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1278c07048e044d26c504e906ccae161");
        } else {
            this.c.d();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa6e1dd2813540c816285806ec1c5f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa6e1dd2813540c816285806ec1c5f5");
        } else {
            this.c.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, String str, List<EmptyBtnInfo> list) {
        Object[] objArr = {Integer.valueOf(i), str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7eae9315281a64c7c3dd173faa7d883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7eae9315281a64c7c3dd173faa7d883");
            return;
        }
        this.c.h();
        if (this.d == null) {
            this.d = (ViewGroup) ((ViewStub) this.e.findViewById(R.id.vs_empty_view)).inflate();
            if (this.d.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = ((HomeActionBarViewModel) q.a(this.b).a(HomeActionBarViewModel.class)).d();
            }
        }
        if (this.d == null || this.d.getParent() == null) {
            return;
        }
        this.d.setVisibility(0);
        ImageView imageView = (ImageView) this.d.findViewById(R.id.img_empty);
        if (i == 2) {
            com.meituan.roodesign.resfetcher.runtime.c.a(imageView, "waimai_c_page_image_home_poi_list_empty");
        } else if (i == 3) {
            com.meituan.roodesign.resfetcher.runtime.c.a(imageView, "waimai_c_page_image_home_poi_list_electric_fence");
        }
        TextView textView = (TextView) this.d.findViewById(R.id.tv_info);
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i == 3) {
            textView.setText(com.meituan.android.singleton.b.a.getResources().getText(R.string.wm_page_home_electric_fence_description));
        }
        LinearLayout linearLayout = (LinearLayout) this.d.findViewById(R.id.ll_btn_layout);
        linearLayout.removeAllViews();
        if (list != null) {
            for (final EmptyBtnInfo emptyBtnInfo : list) {
                if (!TextUtils.isEmpty(emptyBtnInfo.text) && !TextUtils.isEmpty(emptyBtnInfo.url)) {
                    TextView textView2 = (TextView) LayoutInflater.from(this.b.F).inflate(R.layout.wm_page_home_poi_list_empty_view_btn, (ViewGroup) linearLayout, false);
                    textView2.setText(emptyBtnInfo.text);
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e42d7d9f4e29bc403efdb3a43d69c58", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e42d7d9f4e29bc403efdb3a43d69c58");
                            } else if (TextUtils.isEmpty(emptyBtnInfo.text)) {
                            } else {
                                com.sankuai.waimai.foundation.router.a.a(e.this.b.F, emptyBtnInfo.url);
                            }
                        }
                    });
                    linearLayout.addView(textView2);
                }
            }
        }
    }

    public final void e() {
        String string;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79daf209185dc9f3a4162cf3eadd77ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79daf209185dc9f3a4162cf3eadd77ae");
        } else if (!PreloadDataModel.get().isLocateFailedOrTimeout() || this.b == null || f.a(this.b.F) || !com.sankuai.waimai.platform.domain.manager.user.a.i().a() || this.f || g || h) {
        } else {
            boolean z = !d.b();
            boolean equals = com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN);
            if (!z || !equals) {
                PreloadDataModel.get().setLocationTimeoutState(false);
                return;
            }
            Boolean a2 = ((HomePageViewModel) q.a(this.b).a(HomePageViewModel.class)).d.a();
            if (a2 == null || !a2.booleanValue()) {
                return;
            }
            com.sankuai.waimai.business.page.home.locate.c.a(0);
            this.f = true;
            if (this.l != null) {
                this.q = PreloadDataModel.get().getCurrentLocation() == null;
                if (this.q) {
                    string = this.b.getString(R.string.wm_page_home_title_location_recommend_dialog_locating);
                } else {
                    string = this.b.getString(R.string.wm_page_home_title_location_recommend_dialog);
                }
                a((CharSequence) string);
                if (this.q) {
                    i();
                }
                h();
                com.sankuai.waimai.business.page.home.locate.c.a(5);
                if (this.q) {
                    LocationCatReporter.c(3000);
                    LocationCatReporter.b(4000);
                    com.sankuai.waimai.foundation.location.a.a(5500);
                }
                this.l.show();
                return;
            }
            com.sankuai.waimai.business.page.home.locate.c.a(1);
            this.m.a(new a.InterfaceC0787a() { // from class: com.sankuai.waimai.business.page.home.e.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.locate.a.InterfaceC0787a
                public final void a(@NonNull List<AddressItem> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a542bbb5a6cdf8c892e1e7becc94e98b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a542bbb5a6cdf8c892e1e7becc94e98b");
                    } else if (e.this.b == null || f.a(e.this.b.F) || !PreloadDataModel.get().isLocateFailedOrTimeout() || !com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                        e.c(e.this, false);
                        e.d(e.this);
                    } else if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                        e.c(e.this, false);
                        e.d(e.this);
                        com.sankuai.waimai.business.page.home.locate.c.a(3);
                    } else {
                        com.sankuai.waimai.business.page.home.locate.c.a(2);
                        e.this.q = PreloadDataModel.get().getCurrentLocation() == null;
                        e.this.l = new com.sankuai.waimai.business.page.home.locate.b(e.this.b, list, e.this.q).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.home.e.6.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                Object[] objArr3 = {dialogInterface};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "29df47943a79a6d96e08cb7882dec5e6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "29df47943a79a6d96e08cb7882dec5e6");
                                } else {
                                    e.c(e.this, false);
                                }
                            }
                        }).a();
                        if (e.g || e.h) {
                            e.c(e.this, false);
                            return;
                        }
                        Boolean a3 = ((HomePageViewModel) q.a(e.this.b).a(HomePageViewModel.class)).d.a();
                        if (a3 != null && a3.booleanValue()) {
                            if (e.this.q) {
                                e.this.i();
                            }
                            e.this.h();
                            com.sankuai.waimai.business.page.home.locate.c.a(5);
                            if (e.this.q) {
                                LocationCatReporter.c(3000);
                                LocationCatReporter.b(4000);
                                com.sankuai.waimai.foundation.location.a.a(5500);
                            }
                            e.this.l.show();
                            return;
                        }
                        e.c(e.this, false);
                    }
                }

                @Override // com.sankuai.waimai.business.page.home.locate.a.InterfaceC0787a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b1a73f78da06ace5415acb0078b829f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b1a73f78da06ace5415acb0078b829f");
                        return;
                    }
                    e.c(e.this, false);
                    e.d(e.this);
                    com.sankuai.waimai.business.page.home.locate.c.a(4);
                }
            }, 3);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530f012744b670c1a752c171813bcf56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530f012744b670c1a752c171813bcf56");
            return;
        }
        g();
        if (this.b == null || f.a(this.b.getActivity())) {
            return;
        }
        try {
            if (this.n != null && this.n.isShowing()) {
                this.n.dismiss();
            }
            if (this.o != null && this.o.isShowing()) {
                this.o.dismiss();
            }
            if (this.p == null || !this.p.isShowing()) {
                return;
            }
            this.p.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4e9858f810b898617da3f76a74e056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4e9858f810b898617da3f76a74e056");
            return;
        }
        this.j = false;
        this.i = false;
        this.k = false;
        if (this.b == null || f.a(this.b.getActivity())) {
            return;
        }
        try {
            if (this.n != null && this.n.isShowing()) {
                this.n.dismiss();
            }
            if (this.o != null && this.o.isShowing()) {
                this.o.dismiss();
            }
            if (this.p == null || !this.p.isShowing()) {
                return;
            }
            this.p.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7403b8b2cd86f7a5db184d7e22ea2b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7403b8b2cd86f7a5db184d7e22ea2b59");
            return;
        }
        this.m.a();
        if (this.b != null && !f.a(this.b.getActivity())) {
            try {
                if (this.l != null && this.l.isShowing()) {
                    this.l.dismiss();
                }
            } catch (Exception unused) {
            }
        }
        this.f = false;
    }

    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77219551b06727d35ec3bf6ce9fa77c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77219551b06727d35ec3bf6ce9fa77c");
        } else if (this.l == null || !this.l.isShowing()) {
        } else {
            ((TextView) this.l.findViewById(R.id.dialog_title)).setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a9e4b61b35fd90c53d7ca4ab52896e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a9e4b61b35fd90c53d7ca4ab52896e");
            return;
        }
        com.sankuai.waimai.business.page.home.preload.e.b();
        WMLocation wMLocation = new WMLocation(WMLocation.WM_LOCATION_NETWORK_CHECK);
        LocationResultCode locationResultCode = new LocationResultCode();
        locationResultCode.a = 1205;
        locationResultCode.b = "locate timeout";
        wMLocation.setLocationResultCode(locationResultCode);
        h.c((WMLocation) null);
        com.sankuai.waimai.platform.domain.manager.location.a.c();
        this.b.j.b(wMLocation);
    }
}
