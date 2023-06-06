package com.sankuai.waimai.business.address;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.addrsdk.constants.AddressType;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.CityListBean;
import com.sankuai.waimai.business.address.controller.c;
import com.sankuai.waimai.business.address.controller.d;
import com.sankuai.waimai.business.address.widget.CompatiblePopupWindow;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.widget.ActionBarView;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.model.MtAddressSearchResponse;
import com.sankuai.waimai.platform.domain.manager.location.search.a;
import com.sankuai.waimai.platform.domain.manager.location.search.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocateManuallyActivity extends BaseActivity implements c, b.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.address.controller.b D;
    private boolean E;
    private d F;
    private boolean G;
    private boolean H;
    private boolean I;
    private TextView J;
    private RelativeLayout K;
    private boolean L;
    private RooIconFont M;
    private d.b N;
    private CompatiblePopupWindow O;
    private LinearLayout P;
    private CityListBean.City Q;
    private String R;
    private WmAddress S;
    private String T;
    private int U;
    private String V;
    private final String[] W;
    private final int X;
    TextView b;
    TextView c;
    boolean d;
    double e;
    double f;
    private com.sankuai.waimai.platform.widget.emptylayout.d g;
    private View h;
    private TextView i;
    private EditText j;
    private View k;
    private View l;
    private TextView m;
    private View n;
    private View o;
    private boolean p;
    private boolean q;
    private int r;
    private String s;
    private StatisticsRecyclerView t;
    private com.sankuai.waimai.business.address.adapter.b u;
    private int v;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final boolean ao_() {
        return true;
    }

    public LocateManuallyActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dea3808107f58efec2366b25af5ca6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dea3808107f58efec2366b25af5ca6b");
            return;
        }
        this.v = 1;
        this.d = false;
        this.e = 0.0d;
        this.f = 0.0d;
        this.E = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.L = true;
        this.U = -1;
        this.V = "";
        this.W = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        this.X = 1000;
    }

    public static /* synthetic */ int a(LocateManuallyActivity locateManuallyActivity, int i) {
        locateManuallyActivity.U = TbsListener.ErrorCode.UNZIP_IO_ERROR;
        return TbsListener.ErrorCode.UNZIP_IO_ERROR;
    }

    public static /* synthetic */ void a(LocateManuallyActivity locateManuallyActivity, boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, locateManuallyActivity, changeQuickRedirect, false, "e51935f092b9ff148dc66b83030e7d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity, changeQuickRedirect, false, "e51935f092b9ff148dc66b83030e7d20");
            return;
        }
        try {
            String a2 = locateManuallyActivity.F.a();
            String d = g.d();
            if (!TextUtils.isEmpty(locateManuallyActivity.s)) {
                d = locateManuallyActivity.s;
            }
            String str = d;
            Object[] objArr2 = {str, a2, (byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, locateManuallyActivity, changeQuickRedirect2, false, "eed77d8a05bf410a372fe2d8cd94cadc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, locateManuallyActivity, changeQuickRedirect2, false, "eed77d8a05bf410a372fe2d8cd94cadc");
                return;
            }
            locateManuallyActivity.p = true;
            locateManuallyActivity.q = z2;
            double[] e = g.e();
            a.C1048a c1048a = new a.C1048a();
            a.C1048a c = c1048a.c(str);
            StringBuilder sb = new StringBuilder();
            sb.append(locateManuallyActivity.v);
            a.C1048a b = c.f(sb.toString()).e("50").b(a2);
            Object[] objArr3 = {"CITY"};
            ChangeQuickRedirect changeQuickRedirect3 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "d80234fc8a8cf5fda608a1f89e8bea82", RobustBitConfig.DEFAULT_VALUE)) {
                b = (a.C1048a) PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "d80234fc8a8cf5fda608a1f89e8bea82");
            } else {
                b.b.i = "CITY";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.sankuai.waimai.platform.domain.manager.location.search.b.a(locateManuallyActivity.getApplicationContext()));
            a.C1048a d2 = b.g(sb2.toString()).d("");
            Object[] objArr4 = {"true"};
            ChangeQuickRedirect changeQuickRedirect4 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr4, d2, changeQuickRedirect4, false, "5566b2cde441919ba4cfe446d4d45e66", RobustBitConfig.DEFAULT_VALUE)) {
                d2 = (a.C1048a) PatchProxy.accessDispatch(objArr4, d2, changeQuickRedirect4, false, "5566b2cde441919ba4cfe446d4d45e66");
            } else {
                d2.b.h = "true";
            }
            d2.a(com.sankuai.waimai.config.a.a().c());
            if (e != null) {
                c1048a.b(e[1]).a(e[0]).h(AddressConfig.ORDERY_BY_WEIGHT);
            } else {
                c1048a.h(AddressConfig.ORDERY_BY_WEIGHT);
            }
            locateManuallyActivity.g.d();
            com.sankuai.waimai.platform.domain.manager.location.search.b.a(locateManuallyActivity.bB_(), c1048a, new WeakReference(locateManuallyActivity), locateManuallyActivity.w());
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b(LocateManuallyActivity locateManuallyActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, locateManuallyActivity, changeQuickRedirect, false, "5b8aec6a47be75f69ec1e81fa62a7881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity, changeQuickRedirect, false, "5b8aec6a47be75f69ec1e81fa62a7881");
            return;
        }
        locateManuallyActivity.j.setCursorVisible(true);
        locateManuallyActivity.J.setVisibility(0);
        locateManuallyActivity.I = true;
    }

    public static /* synthetic */ void b(LocateManuallyActivity locateManuallyActivity, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, locateManuallyActivity, changeQuickRedirect, false, "5dbb9664f8964f3c84f4281855ece4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity, changeQuickRedirect, false, "5dbb9664f8964f3c84f4281855ece4f9");
        } else if (z) {
            if (locateManuallyActivity.G) {
                locateManuallyActivity.t.setVisibility(8);
                if (locateManuallyActivity.g.s == d.b.EMPTY) {
                    locateManuallyActivity.N = locateManuallyActivity.g.s;
                    locateManuallyActivity.g.h();
                }
            }
            locateManuallyActivity.n.setVisibility(8);
            locateManuallyActivity.h.setVisibility(0);
            locateManuallyActivity.l.setVisibility(0);
            com.sankuai.waimai.business.address.util.c.b(locateManuallyActivity);
            locateManuallyActivity.b(false);
        } else {
            if (locateManuallyActivity.G) {
                if (locateManuallyActivity.H) {
                    locateManuallyActivity.n.setVisibility(0);
                    locateManuallyActivity.t.setVisibility(8);
                } else if (locateManuallyActivity.N == d.b.EMPTY) {
                    locateManuallyActivity.N = locateManuallyActivity.g.s;
                    locateManuallyActivity.g.f();
                    locateManuallyActivity.n.setVisibility(8);
                    locateManuallyActivity.t.setVisibility(8);
                } else {
                    locateManuallyActivity.n.setVisibility(8);
                    locateManuallyActivity.t.setVisibility(0);
                }
            } else if (locateManuallyActivity.I) {
                locateManuallyActivity.n.setVisibility(0);
                locateManuallyActivity.t.setVisibility(8);
            }
            locateManuallyActivity.l.setVisibility(8);
            locateManuallyActivity.b(true);
        }
    }

    public static /* synthetic */ boolean c(LocateManuallyActivity locateManuallyActivity, boolean z) {
        locateManuallyActivity.E = true;
        return true;
    }

    public static /* synthetic */ boolean f(LocateManuallyActivity locateManuallyActivity, boolean z) {
        locateManuallyActivity.d = true;
        return true;
    }

    public static /* synthetic */ void j(LocateManuallyActivity locateManuallyActivity) {
        e createPermissionGuard;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, locateManuallyActivity, changeQuickRedirect, false, "517e13eb075ff072dee7cb62f0a930eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity, changeQuickRedirect, false, "517e13eb075ff072dee7cb62f0a930eb");
            return;
        }
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "68c7ff4fc45856b513fa52e7503fc501", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "68c7ff4fc45856b513fa52e7503fc501")).booleanValue();
        } else {
            WMLocation p2 = com.sankuai.waimai.foundation.location.v2.g.a().p();
            if (Build.VERSION.SDK_INT >= 23 && (p2 == null || !p2.hasLocatedPermission || !com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN))) {
                z = true;
            }
        }
        if (!z) {
            locateManuallyActivity.f();
        } else if ((p == null || !p.hasLocatedPermission) && (createPermissionGuard = Privacy.createPermissionGuard()) != null) {
            createPermissionGuard.a((Activity) locateManuallyActivity, "Locate.once", "dj-b5e9814e9fb3a8f6", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.15
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    boolean z2 = false;
                    Object[] objArr3 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d82708a76bc5e193669e89e7e1550899", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d82708a76bc5e193669e89e7e1550899");
                        return;
                    }
                    LocateManuallyActivity.this.L = (i > 0 || i == -10) ? true : true;
                    if (i > 0) {
                        if (com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN)) {
                            LocateManuallyActivity.this.f();
                        } else {
                            LocateManuallyActivity.this.m();
                        }
                    }
                }
            });
        } else {
            locateManuallyActivity.m();
        }
    }

    public static /* synthetic */ void s(LocateManuallyActivity locateManuallyActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, locateManuallyActivity, changeQuickRedirect, false, "dbd9c6e298eadee266ea3d8cc773621a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity, changeQuickRedirect, false, "dbd9c6e298eadee266ea3d8cc773621a");
            return;
        }
        locateManuallyActivity.t.setVisibility(0);
        locateManuallyActivity.h.setVisibility(0);
        locateManuallyActivity.G = true;
    }

    public static /* synthetic */ void t(LocateManuallyActivity locateManuallyActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, locateManuallyActivity, changeQuickRedirect, false, "86820580190a084656561bcb4a4f90c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity, changeQuickRedirect, false, "86820580190a084656561bcb4a4f90c5");
            return;
        }
        locateManuallyActivity.n.setVisibility(0);
        locateManuallyActivity.t.setVisibility(8);
        locateManuallyActivity.h.setVisibility(0);
        locateManuallyActivity.G = true;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e1b1a4d163224339160cf6e53d3844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e1b1a4d163224339160cf6e53d3844");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_address_manually_activity_locate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b712b7f5aee476798e26ac75bcf45c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b712b7f5aee476798e26ac75bcf45c4a");
        } else {
            com.sankuai.waimai.addrsdk.a.a(a.a);
        }
        Object[] objArr3 = {bundle};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06aed4dd31de87d8abd2a4a209f6e19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06aed4dd31de87d8abd2a4a209f6e19a");
        } else if (bundle != null) {
            this.R = bundle.getString("page_source", "FROM_INTERNAL_LOCATE_MANUALLY");
            this.S = WmAddress.parse(bundle.getString("wm_address_from_external", ""));
        } else {
            if (getIntent() != null) {
                String a2 = a(getIntent(), GearsLocator.ADDRESS);
                String a3 = a(getIntent(), "lat");
                String a4 = a(getIntent(), "lng");
                String a5 = a(getIntent(), "cityName");
                this.T = a(getIntent(), RemoteMessageConst.Notification.NOTIFY_ID);
                if (!com.sankuai.waimai.foundation.core.a.d() && !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a5) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
                    WmAddress wmAddress = new WmAddress();
                    WMLocation wMLocation = new WMLocation(WMLocation.WM_LOCATION_ADD_ADDRSS);
                    try {
                        wMLocation.setLongitude(Double.parseDouble(a4));
                        wMLocation.setLatitude(Double.parseDouble(a3));
                    } catch (Exception unused) {
                    }
                    LocationResultCode locationResultCode = new LocationResultCode();
                    locationResultCode.a = 1200;
                    locationResultCode.b = "";
                    wMLocation.setLocationResultCode(locationResultCode);
                    wmAddress.setWMLocation(wMLocation);
                    wmAddress.setCreateTime(System.currentTimeMillis());
                    wmAddress.setAddress(a2);
                    City city = new City();
                    city.setCityName(a5);
                    wmAddress.setMafCity(city);
                    wmAddress.setMeitaunCity(city);
                    h.c(wmAddress.getWMLocation());
                    h.b(wmAddress);
                } else {
                    this.R = f.a(getIntent(), "page_source");
                    String a6 = f.a(getIntent(), "wm_address_from_external");
                    if (!TextUtils.isEmpty(a6)) {
                        this.S = WmAddress.parse(a6);
                    }
                    if (this.S != null && this.S.getWMLocation() != null && this.S.getWMLocation().getLocationResultCode() != null && this.S.getWMLocation().getLocationResultCode().a == 1200 && !TextUtils.isEmpty(this.S.getAddress())) {
                        h.c(this.S.getWMLocation());
                        h.b(this.S);
                    }
                }
            }
            if (TextUtils.isEmpty(this.R)) {
                this.R = "FROM_INTERNAL_LOCATE_MANUALLY";
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c7deb515a134ca565baf9d1c25f261b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c7deb515a134ca565baf9d1c25f261b");
        } else {
            this.K = (RelativeLayout) findViewById(R.id.wm_common_locate_search_title_bar);
            this.h = findViewById(R.id.layout_history);
            this.l = findViewById(R.id.choose_city_list_layout);
            this.j = (EditText) findViewById(R.id.address_search_map_txt);
            this.k = findViewById(R.id.locate_manually_choose_city_tip_layout);
            this.m = (TextView) findViewById(R.id.locate_manually_switch_city_tip1);
            this.i = (TextView) findViewById(R.id.wm_address_city_location_text);
            this.n = findViewById(R.id.locate_manually_search_mask);
            this.o = findViewById(R.id.locate_cur_location_layout);
            this.b = (TextView) findViewById(R.id.txt_locateManually_locate);
            this.c = (TextView) findViewById(R.id.address_manually_locate_icon);
            this.t = (StatisticsRecyclerView) findViewById(R.id.list_map_location_info);
            this.J = (TextView) findViewById(R.id.search_address_txt);
            this.M = (RooIconFont) findViewById(R.id.wm_address_city_location_arrow);
            this.P = (LinearLayout) findViewById(R.id.address_map_locate_container);
            ViewCompat.setAccessibilityDelegate(this.j, new AccessibilityDelegateCompat() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.4
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    Object[] objArr5 = {view, accessibilityNodeInfoCompat};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "10f255f363fc46ecee0c670a1b861c64", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "10f255f363fc46ecee0c670a1b861c64");
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(EditText.class.getName());
                }
            });
        }
        this.F = new com.sankuai.waimai.business.address.controller.d(getApplicationContext());
        this.D = new com.sankuai.waimai.business.address.controller.b(getWindow().getDecorView(), getApplicationContext(), this, j(), w(), this.R);
        com.sankuai.waimai.business.address.controller.b bVar = this.D;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.address.controller.b.a;
        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "938bf88fafd0ac199e3f0ab9990353e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "938bf88fafd0ac199e3f0ab9990353e8");
        } else {
            bVar.b.setVisibility(8);
            bVar.c.setVisibility(8);
        }
        this.g = new com.sankuai.waimai.platform.widget.emptylayout.d(this);
        this.g.a(true);
        com.sankuai.waimai.platform.widget.emptylayout.d dVar = this.g;
        Object[] objArr6 = {Integer.valueOf((int) R.drawable.wm_address_ic_no_address), Integer.valueOf((int) R.string.wm_address_manually_no_location_searched), 0};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.platform.widget.emptylayout.d.c;
        if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "f3ff09b4c7a9b7ad7fe8482b0e0ef757", RobustBitConfig.DEFAULT_VALUE)) {
            com.sankuai.waimai.platform.widget.emptylayout.d dVar2 = (com.sankuai.waimai.platform.widget.emptylayout.d) PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "f3ff09b4c7a9b7ad7fe8482b0e0ef757");
        } else {
            dVar.a(R.drawable.wm_address_ic_no_address, R.string.wm_address_manually_no_location_searched, 0, 0, (View.OnClickListener) null);
        }
        this.F.j = this.g;
        String str = "";
        WmAddress j = j();
        if (j != null && !TextUtils.isEmpty(j.getAddress())) {
            str = j.getAddress();
        } else if ("FROM_INTERNAL_LOCATE_MANUALLY".equals(this.R)) {
            str = g.i();
        }
        TextView textView = this.b;
        if (TextUtils.isEmpty(str) || l()) {
            str = getString(R.string.wm_address_regeo_no_address);
        }
        textView.setText(str);
        d();
        c(true);
        this.u = new com.sankuai.waimai.business.address.adapter.b(getApplicationContext(), this.F);
        this.t.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.t.setAdapter(this.u);
        if (getIntent() == null) {
            return;
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b12a0727e085e9ab4815778bb4708f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b12a0727e085e9ab4815778bb4708f5d");
        } else {
            this.g.c(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.16
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "e32298477988fa723426b3672336c9fc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "e32298477988fa723426b3672336c9fc");
                    } else {
                        LocateManuallyActivity.a(LocateManuallyActivity.this, true, false);
                    }
                }
            });
            this.j.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.17
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr8 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2811691cad28ed28d711b55a10d36283", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2811691cad28ed28d711b55a10d36283")).booleanValue();
                    }
                    if (motionEvent.getAction() == 1) {
                        LocateManuallyActivity.b(LocateManuallyActivity.this);
                        LocateManuallyActivity.this.a(true);
                        LocateManuallyActivity.b(LocateManuallyActivity.this, false);
                    }
                    return false;
                }
            });
            this.j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.18
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    Object[] objArr8 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "1d48a6488bc42e168683167a357762dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "1d48a6488bc42e168683167a357762dd");
                    } else if (z) {
                        LocateManuallyActivity.b(LocateManuallyActivity.this);
                        LocateManuallyActivity.this.a(true);
                        LocateManuallyActivity.b(LocateManuallyActivity.this, false);
                    }
                }
            });
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.19
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "1ed7c5fba42ecc8542b33a58c42082cb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "1ed7c5fba42ecc8542b33a58c42082cb");
                    } else if (LocateManuallyActivity.this.l.getVisibility() == 0) {
                        LocateManuallyActivity.c(LocateManuallyActivity.this, true);
                        LocateManuallyActivity.this.d();
                        LocateManuallyActivity.this.c(false);
                        LocateManuallyActivity.b(LocateManuallyActivity.this, false);
                        JudasManualManager.a("b_sWgZs").a("is_same", "1").a();
                        if (LocateManuallyActivity.this.I) {
                            LocateManuallyActivity.this.F.b();
                            LocateManuallyActivity.this.h();
                            LocateManuallyActivity.this.g();
                        }
                    } else {
                        LocateManuallyActivity.b(LocateManuallyActivity.this, true);
                    }
                }
            });
            View findViewById = findViewById(R.id.address_map_locate_container);
            ViewCompat.setAccessibilityDelegate(findViewById, new AccessibilityDelegateCompat() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.9
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    Object[] objArr8 = {view, accessibilityNodeInfoCompat};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2dd337b8fcee253f40e0f249e2159230", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2dd337b8fcee253f40e0f249e2159230");
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string;
                    String str2;
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "336b7a247f58c8f5f1e1af121c859c26", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "336b7a247f58c8f5f1e1af121c859c26");
                    } else if (p.f(LocateManuallyActivity.this)) {
                        if (LocateManuallyActivity.this.l.getVisibility() == 0) {
                            LocateManuallyActivity.b(LocateManuallyActivity.this, false);
                            return;
                        }
                        JudasManualManager.a("b_mjfnT").a();
                        com.sankuai.waimai.addrsdk.manager.d a7 = com.sankuai.waimai.addrsdk.manager.d.a();
                        LocateManuallyActivity locateManuallyActivity = LocateManuallyActivity.this;
                        Object[] objArr9 = {locateManuallyActivity};
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.addrsdk.manager.d.a;
                        if (PatchProxy.isSupport(objArr9, a7, changeQuickRedirect9, false, "7740392849cca90bc24fe1ea1b3f56ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, a7, changeQuickRedirect9, false, "7740392849cca90bc24fe1ea1b3f56ed");
                        } else if (locateManuallyActivity != null) {
                            try {
                                Object[] objArr10 = {locateManuallyActivity};
                                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.addrsdk.manager.d.a;
                                if (PatchProxy.isSupport(objArr10, a7, changeQuickRedirect10, false, "ff45165d7a3bccde675716be1a8361da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr10, a7, changeQuickRedirect10, false, "ff45165d7a3bccde675716be1a8361da")).booleanValue() : "com.sankuai.meituan.takeoutnew".equals(locateManuallyActivity.getPackageName())) {
                                    string = locateManuallyActivity.getString(R.string.wm_city_list_rn_url);
                                    str2 = "com.sankuai.meituan.takeoutnew";
                                } else {
                                    Object[] objArr11 = {locateManuallyActivity};
                                    ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.addrsdk.manager.d.a;
                                    if (PatchProxy.isSupport(objArr11, a7, changeQuickRedirect11, false, "b3fceafc941a1014582a482bef61109c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr11, a7, changeQuickRedirect11, false, "b3fceafc941a1014582a482bef61109c")).booleanValue() : "com.sankuai.meituan.flashbuy".equals(locateManuallyActivity.getPackageName())) {
                                        string = locateManuallyActivity.getString(R.string.sg_city_list_rn_url);
                                        str2 = "com.sankuai.meituan.flashbuy";
                                    } else {
                                        Object[] objArr12 = {locateManuallyActivity};
                                        ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.addrsdk.manager.d.a;
                                        if (PatchProxy.isSupport(objArr12, a7, changeQuickRedirect12, false, "c0c92c10f1d364188a5b3aa52671bec2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr12, a7, changeQuickRedirect12, false, "c0c92c10f1d364188a5b3aa52671bec2")).booleanValue() : "com.dianping.v1".equals(locateManuallyActivity.getPackageName())) {
                                            string = locateManuallyActivity.getString(R.string.mt_city_list_rn_url);
                                            str2 = "com.dianping.v1";
                                        } else {
                                            Object[] objArr13 = {locateManuallyActivity};
                                            ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.addrsdk.manager.d.a;
                                            if (PatchProxy.isSupport(objArr13, a7, changeQuickRedirect13, false, "7eca828650f1c7d86f60df0b6ddb1aab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr13, a7, changeQuickRedirect13, false, "7eca828650f1c7d86f60df0b6ddb1aab")).booleanValue() : "com.sankuai.meituan.meituanwaimaibusiness".equals(locateManuallyActivity.getPackageName())) {
                                                string = locateManuallyActivity.getString(R.string.mt_biz_city_list_rn_url);
                                                str2 = "com.sankuai.meituan.meituanwaimaibusiness";
                                            } else {
                                                string = locateManuallyActivity.getString(R.string.mt_city_list_rn_url);
                                                str2 = "com.sankuai.meituan";
                                            }
                                        }
                                    }
                                }
                                Uri parse = Uri.parse(string);
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setPackage(str2);
                                intent.setData(parse);
                                locateManuallyActivity.startActivityForResult(intent, 1001);
                            } catch (Throwable unused2) {
                            }
                        }
                    } else {
                        ae.a((Activity) LocateManuallyActivity.this, (int) R.string.takeout_error_network);
                    }
                }
            });
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3ea8d2009492ad18ccc399239ed7e54e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3ea8d2009492ad18ccc399239ed7e54e");
                        return;
                    }
                    LocateManuallyActivity.this.a(false);
                    com.sankuai.waimai.business.address.util.c.b(LocateManuallyActivity.this);
                    LocateManuallyActivity.this.h();
                }
            });
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "99a336c184cbd21cef5f4d4ed7203227", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "99a336c184cbd21cef5f4d4ed7203227");
                    } else if (LocateManuallyActivity.this.L) {
                        JudasManualManager.a("b_SaNrB").a();
                        LocateManuallyActivity.this.L = false;
                        LocateManuallyActivity.j(LocateManuallyActivity.this);
                    }
                }
            });
            this.t.setOnRecyclerViewItemClickListener(new StatisticsRecyclerView.a() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView.a
                public final void a(View view, int i) {
                    boolean z;
                    com.sankuai.waimai.business.address.model.b bVar2;
                    Object[] objArr8 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "f0d5464d40d5a922e7bfb5ede1ee578b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "f0d5464d40d5a922e7bfb5ede1ee578b");
                    } else if (LocateManuallyActivity.this.u != null) {
                        com.sankuai.waimai.business.address.adapter.b bVar3 = LocateManuallyActivity.this.u;
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.address.adapter.b.a;
                        if (PatchProxy.isSupport(objArr9, bVar3, changeQuickRedirect9, false, "eb7b0f3c9ee9bb2cec20f5cae983804d", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr9, bVar3, changeQuickRedirect9, false, "eb7b0f3c9ee9bb2cec20f5cae983804d")).booleanValue();
                        } else {
                            z = bVar3.getItemCount() == 0;
                        }
                        if (z || LocateManuallyActivity.this.u.a(i) == null || !(LocateManuallyActivity.this.t.getAdapter() instanceof com.sankuai.waimai.business.address.adapter.b)) {
                            return;
                        }
                        LocateManuallyActivity.f(LocateManuallyActivity.this, true);
                        com.sankuai.waimai.business.address.model.a a7 = LocateManuallyActivity.this.u.a(i);
                        LocateManuallyActivity.this.e = a7.d / 1000000.0d;
                        LocateManuallyActivity.this.f = a7.e / 1000000.0d;
                        String str2 = a7.b;
                        String str3 = a7.f;
                        if (LocateManuallyActivity.this.k()) {
                            g.a(LocateManuallyActivity.this.e, LocateManuallyActivity.this.f, str2);
                            g.b(str3);
                            g.k();
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(LocateManuallyActivity.this.getApplicationContext());
                        com.sankuai.waimai.platform.domain.manager.location.a.c();
                        if (!TextUtils.isEmpty(LocateManuallyActivity.this.s)) {
                            String str4 = LocateManuallyActivity.this.s;
                            Object[] objArr10 = {str4};
                            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.address.util.b.a;
                            if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "5fb74a6812640a5cb7166a73109d8213", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "5fb74a6812640a5cb7166a73109d8213");
                            } else {
                                Object[] objArr11 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.address.util.b.a;
                                List<com.sankuai.waimai.business.address.model.b> a8 = PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "1d326633095b996e9f501c0dceaf123b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "1d326633095b996e9f501c0dceaf123b") : com.sankuai.waimai.business.address.util.b.a(com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_HISTORY_LOCATION_ADDRESS, ""));
                                if (com.sankuai.waimai.foundation.utils.b.b(a8)) {
                                    a8 = new ArrayList<>();
                                }
                                Object[] objArr12 = {str4};
                                ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.address.util.b.a;
                                if (PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "09746dbc41818d2b398bde481bc71581", RobustBitConfig.DEFAULT_VALUE)) {
                                    bVar2 = (com.sankuai.waimai.business.address.model.b) PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "09746dbc41818d2b398bde481bc71581");
                                } else if (TextUtils.isEmpty(str4)) {
                                    bVar2 = null;
                                } else {
                                    com.sankuai.waimai.business.address.model.b bVar4 = new com.sankuai.waimai.business.address.model.b();
                                    bVar4.b = str4;
                                    bVar4.a(new Date().getTime());
                                    bVar2 = bVar4;
                                }
                                if (bVar2 != null) {
                                    com.sankuai.waimai.business.address.util.b.a(a8, bVar2);
                                    com.sankuai.waimai.business.address.util.b.a(a8, 4);
                                    com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_HISTORY_LOCATION_ADDRESS, com.sankuai.waimai.business.address.util.b.a(a8));
                                }
                            }
                        }
                        if (LocateManuallyActivity.this.Q != null) {
                            com.sankuai.waimai.addrsdk.manager.b.a(LocateManuallyActivity.this.Q);
                        }
                        WmAddress wmAddress2 = new WmAddress();
                        wmAddress2.setStatusCode(1200);
                        WMLocation wMLocation2 = new WMLocation(WMLocation.WM_MANUALLY_LOCATE_PROVIDER);
                        wMLocation2.setLatitude(LocateManuallyActivity.this.e);
                        wMLocation2.setLongitude(LocateManuallyActivity.this.f);
                        LocationResultCode locationResultCode2 = new LocationResultCode();
                        locationResultCode2.a = 1200;
                        locationResultCode2.b = "";
                        wMLocation2.setLocationResultCode(locationResultCode2);
                        wmAddress2.setWMLocation(wMLocation2);
                        wmAddress2.setCreateTime(System.currentTimeMillis());
                        wmAddress2.setAddress(str2);
                        City city2 = new City();
                        city2.setCityName(a7.g);
                        city2.setCityCode(a7.f);
                        wmAddress2.setMafCity(city2);
                        if (LocateManuallyActivity.this.k()) {
                            com.sankuai.waimai.foundation.location.v2.g.a().a(wmAddress2, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                        }
                        com.sankuai.waimai.business.address.controller.d unused2 = LocateManuallyActivity.this.F;
                        if (LocateManuallyActivity.this.u != null) {
                            com.sankuai.waimai.business.address.adapter.b bVar5 = LocateManuallyActivity.this.u;
                            Object[] objArr13 = {Integer.valueOf(i), "b_b7WMJ"};
                            ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.business.address.adapter.b.a;
                            if (PatchProxy.isSupport(objArr13, bVar5, changeQuickRedirect13, false, "c9d305f84c25a78c54b75eb8f912cc33", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr13, bVar5, changeQuickRedirect13, false, "c9d305f84c25a78c54b75eb8f912cc33");
                            } else if (bVar5.f != null && bVar5.f.size() > i) {
                                ABStrategy strategy = ABTestManager.getInstance(bVar5.c).getStrategy("wm_address_services_test", null);
                                String str5 = strategy != null ? strategy.expName : "";
                                com.sankuai.waimai.business.address.model.a aVar = bVar5.f.get(i);
                                JudasManualManager.a("b_b7WMJ").a("index", i).a("keyword", bVar5.b.a()).a("address_longitude", String.valueOf(aVar.e)).a("address_latitude", String.valueOf(aVar.d)).a("address_name", aVar.b == null ? "" : aVar.b).a("city", aVar.g == null ? "" : aVar.g).a("page_type", bVar5.e ? "0" : "1").a("address_services", str5).a("address_address", aVar.c).a("search_type", "城市搜索").a("address_type", aVar.j).a("address_id", aVar.k).a("source", aVar.l).a();
                            }
                        }
                        LocateManuallyActivity.a(LocateManuallyActivity.this, (int) TbsListener.ErrorCode.UNZIP_IO_ERROR);
                        LocateManuallyActivity.this.V = "";
                        LocateManuallyActivity.this.b(str2, wmAddress2);
                    }
                }
            });
            this.t.a();
            this.t.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void a(int i) {
                    String str2;
                    Object[] objArr8 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4a46fe3d28e3009c302437fff47f2c64", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4a46fe3d28e3009c302437fff47f2c64");
                    } else if (LocateManuallyActivity.this.u == null || LocateManuallyActivity.this.u.a(i) == null) {
                    } else {
                        ABStrategy strategy = ABTestManager.getInstance(LocateManuallyActivity.this.getApplicationContext()).getStrategy("wm_address_services_test", null);
                        String str3 = strategy != null ? strategy.expName : "";
                        com.sankuai.waimai.business.address.model.a a7 = LocateManuallyActivity.this.u.a(i);
                        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
                        if (b != null && b.a() != null) {
                            str2 = b.a() + "+" + System.currentTimeMillis();
                        } else {
                            str2 = "+" + System.currentTimeMillis();
                        }
                        JudasManualManager.b("b_rev6f").a("index", i).a("keyword", LocateManuallyActivity.this.F.a()).a("address_longitude", String.valueOf(a7.e)).a("address_latitude", String.valueOf(a7.d)).a("address_name", a7.b == null ? "" : a7.b).a("city", a7.g == null ? "" : a7.g).a("page_type", LocateManuallyActivity.this.q ? "0" : "1").a("address_services", str3).a("address_address", a7.c).a("search_type", "城市搜索").a("address_type", a7.j).a("address_id", a7.k).a("source", a7.l).a("req_trace_id", str2).a();
                    }
                }

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void b(int i) {
                    String str2;
                    Object[] objArr8 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ae951d3e1f9f42c8d60aabe5a32efc06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ae951d3e1f9f42c8d60aabe5a32efc06");
                    } else if (LocateManuallyActivity.this.u == null || LocateManuallyActivity.this.u.a(i) == null) {
                    } else {
                        ABStrategy strategy = ABTestManager.getInstance(LocateManuallyActivity.this.getApplicationContext()).getStrategy("wm_address_services_test", null);
                        String str3 = strategy != null ? strategy.expName : "";
                        com.sankuai.waimai.business.address.model.a a7 = LocateManuallyActivity.this.u.a(i);
                        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
                        if (b != null && b.a() != null) {
                            str2 = b.a() + "+" + System.currentTimeMillis();
                        } else {
                            str2 = "+" + System.currentTimeMillis();
                        }
                        JudasManualManager.a("b_b7WMJ").a("index", i).a("keyword", LocateManuallyActivity.this.F.a()).a("address_longitude", String.valueOf(a7.e)).a("address_latitude", String.valueOf(a7.d)).a("address_name", a7.b == null ? "" : a7.b).a("city", a7.g == null ? "" : a7.g).a("page_type", LocateManuallyActivity.this.q ? "0" : "1").a("address_services", str3).a("address_address", a7.c).a("search_type", "城市搜索").a("address_type", a7.j).a("address_id", a7.k).a("source", a7.l).a("req_trace_id", str2).a();
                    }
                }
            });
            this.t.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr8 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "449b41d0e6310fef1f52a8730493b5d2", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "449b41d0e6310fef1f52a8730493b5d2")).booleanValue();
                    }
                    com.sankuai.waimai.business.address.util.c.b(LocateManuallyActivity.this);
                    return false;
                }
            });
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4ca97de34ce27efd8d57fc319b74fb45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4ca97de34ce27efd8d57fc319b74fb45");
        } else {
            a(false);
            g();
        }
        Object[] objArr9 = {Integer.valueOf((int) R.drawable.wm_address_manually_locate_back_icon), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect9 = BaseActivity.w;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "4f7dda67791e867e26c4c0b5c0d16518", RobustBitConfig.DEFAULT_VALUE)) {
            TextView textView2 = (TextView) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "4f7dda67791e867e26c4c0b5c0d16518");
        } else if (this.x != null) {
            ActionBarView actionBarView = this.x;
            Object[] objArr10 = {Integer.valueOf((int) R.drawable.wm_address_manually_locate_back_icon), (byte) 1};
            ChangeQuickRedirect changeQuickRedirect10 = ActionBarView.a;
            if (PatchProxy.isSupport(objArr10, actionBarView, changeQuickRedirect10, false, "ed445a74ffcc00e0b30d885bb5c98095", RobustBitConfig.DEFAULT_VALUE)) {
                TextView textView3 = (TextView) PatchProxy.accessDispatch(objArr10, actionBarView, changeQuickRedirect10, false, "ed445a74ffcc00e0b30d885bb5c98095");
            } else {
                actionBarView.c.setVisibility(8);
                Drawable drawable = ContextCompat.getDrawable(actionBarView.getContext(), R.drawable.wm_address_manually_locate_back_icon);
                Object[] objArr11 = {drawable};
                ChangeQuickRedirect changeQuickRedirect11 = ActionBarView.a;
                if (PatchProxy.isSupport(objArr11, actionBarView, changeQuickRedirect11, false, "3276081bf59e65c241b780bf3e854c76", RobustBitConfig.DEFAULT_VALUE)) {
                    TextView textView4 = (TextView) PatchProxy.accessDispatch(objArr11, actionBarView, changeQuickRedirect11, false, "3276081bf59e65c241b780bf3e854c76");
                } else {
                    actionBarView.b.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    TextView textView5 = actionBarView.b;
                }
            }
        }
        int color = getResources().getColor(R.color.takeout_white);
        Object[] objArr12 = {Integer.valueOf(color)};
        ChangeQuickRedirect changeQuickRedirect12 = BaseActivity.w;
        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d33c54f8a571e45c1b37c36c301ea8e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d33c54f8a571e45c1b37c36c301ea8e7");
        } else if (this.x != null) {
            this.x.setActionbarBackgroundColor(color);
        }
        c(R.string.wm_address_manually_title);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr13 = {view};
                ChangeQuickRedirect changeQuickRedirect13 = a;
                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "10fb139808b59c78bd007b6bdc67edf9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "10fb139808b59c78bd007b6bdc67edf9");
                    return;
                }
                JudasManualManager.a("b_2EU5Y").a();
                LocateManuallyActivity.this.D.a();
                com.sankuai.waimai.platform.domain.manager.user.a.a(LocateManuallyActivity.this, new Runnable() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr14 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect14 = a;
                        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "33c627784b64c5f82631ca05606df395", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "33c627784b64c5f82631ca05606df395");
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        String str2 = "meituanwaimai://waimai.meituan.com";
                        if (com.sankuai.waimai.foundation.core.a.e()) {
                            str2 = "imeituan://www.meituan.com";
                        } else if (com.sankuai.waimai.foundation.core.a.f()) {
                            str2 = "dianping:/";
                        }
                        String str3 = str2;
                        com.sankuai.waimai.foundation.router.a.a(LocateManuallyActivity.this, com.sankuai.waimai.addrsdk.manager.a.a().a("index", "home_add", str3, "", null, AddressScene.DEFAULT_SCENE.getValue(), AddressType.LBS_TYPE.getValue(), com.sankuai.waimai.foundation.location.v2.d.a().toJson(com.sankuai.waimai.platform.domain.manager.location.a.a()), 300, com.sankuai.waimai.platform.capacity.abtest.b.c(LocateManuallyActivity.this)), bundle2, 300);
                    }
                });
            }
        };
        Object[] objArr13 = {Integer.valueOf((int) R.string.wm_address_manually_title_right), Integer.valueOf((int) R.color.wm_address_black7), onClickListener};
        ChangeQuickRedirect changeQuickRedirect13 = BaseActivity.w;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "0616bc816e66b6ca1458f42d519657af", RobustBitConfig.DEFAULT_VALUE)) {
            TextView textView6 = (TextView) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "0616bc816e66b6ca1458f42d519657af");
        } else if (this.x != null) {
            ActionBarView actionBarView2 = this.x;
            Object[] objArr14 = {Integer.valueOf((int) R.string.wm_address_manually_title_right), Integer.valueOf((int) R.color.wm_address_black7), onClickListener};
            ChangeQuickRedirect changeQuickRedirect14 = ActionBarView.a;
            if (PatchProxy.isSupport(objArr14, actionBarView2, changeQuickRedirect14, false, "48fc994829195edd704bbbd4c0303619", RobustBitConfig.DEFAULT_VALUE)) {
                TextView textView7 = (TextView) PatchProxy.accessDispatch(objArr14, actionBarView2, changeQuickRedirect14, false, "48fc994829195edd704bbbd4c0303619");
            } else {
                CharSequence text = actionBarView2.getContext().getResources().getText(R.string.wm_address_manually_title_right);
                Object[] objArr15 = {text, Integer.valueOf((int) R.color.wm_address_black7), onClickListener};
                ChangeQuickRedirect changeQuickRedirect15 = ActionBarView.a;
                if (PatchProxy.isSupport(objArr15, actionBarView2, changeQuickRedirect15, false, "57a3afd152d73f8bedb133535570eee3", RobustBitConfig.DEFAULT_VALUE)) {
                    TextView textView8 = (TextView) PatchProxy.accessDispatch(objArr15, actionBarView2, changeQuickRedirect15, false, "57a3afd152d73f8bedb133535570eee3");
                } else {
                    actionBarView2.d.setText(text);
                    actionBarView2.d.setTextColor(actionBarView2.getResources().getColor(R.color.wm_address_black7));
                    actionBarView2.d.setOnClickListener(onClickListener);
                    TextView textView9 = actionBarView2.d;
                }
            }
        }
        TextView textView10 = (TextView) findViewById(16908290).findViewById(R.id.right_action_view);
        if (textView10 != null) {
            if (com.sankuai.waimai.foundation.core.a.d()) {
                textView10.setPadding(textView10.getPaddingLeft(), textView10.getPaddingTop(), com.sankuai.waimai.platform.widget.tag.util.b.a(this, 6.0f), textView10.getPaddingBottom());
            } else if (com.sankuai.waimai.foundation.core.a.e()) {
                textView10.setPadding(textView10.getPaddingLeft(), textView10.getPaddingTop(), com.sankuai.waimai.platform.widget.tag.util.b.a(this, 16.0f), textView10.getPaddingBottom());
            }
            ViewCompat.setAccessibilityDelegate(textView10, new AccessibilityDelegateCompat() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    Object[] objArr16 = {view, accessibilityNodeInfoCompat};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "6a33025e97018a65e7fc29e0a9738118", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "6a33025e97018a65e7fc29e0a9738118");
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        JudasManualManager.b("b_jYscK").a("c_9le3i2l").a();
        TextView textView11 = (TextView) findViewById(16908290).findViewById(R.id.left_action_view);
        if (textView11 != null) {
            textView11.setContentDescription("返回");
            ViewCompat.setAccessibilityDelegate(textView11, new AccessibilityDelegateCompat() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.3
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    Object[] objArr16 = {view, accessibilityNodeInfoCompat};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "3a4db9b178d8fdf58a3153f80f86c217", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "3a4db9b178d8fdf58a3153f80f86c217");
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
    }

    private String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b72da74bc78ca3086b6903bbc2c994", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b72da74bc78ca3086b6903bbc2c994");
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (queryParameter != null) {
                    return queryParameter;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return com.sankuai.waimai.platform.utils.f.a(intent, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671f37afb3ac7e53afb03a29377f9151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671f37afb3ac7e53afb03a29377f9151");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.R)) {
            bundle.putString("page_source", this.R);
        }
        String wmAddress = this.S == null ? null : this.S.toString();
        if (TextUtils.isEmpty(wmAddress)) {
            return;
        }
        bundle.putString("wm_address_from_external", wmAddress);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ecfd35e0c9fcb6da81f482d0b0c992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ecfd35e0c9fcb6da81f482d0b0c992");
            return;
        }
        this.J.setVisibility(8);
        this.j.setCursorVisible(false);
        this.I = false;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a1d92a683dbe2a6be48520e48111ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a1d92a683dbe2a6be48520e48111ba");
            return;
        }
        if (this.t != null) {
            this.t.b();
        }
        JudasManualManager.a("c_9le3i2l", this);
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad89e431795fc53eb5553f12cbfd66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad89e431795fc53eb5553f12cbfd66a");
            return;
        }
        WmAddress j = j();
        if (j != null && !l()) {
            if (j.getMeitaunCity() != null) {
                this.s = com.sankuai.waimai.platform.domain.manager.location.g.a(j.getMeitaunCity().getCityName(), getString(R.string.wm_address_province), getString(R.string.wm_address_city));
            }
            if (TextUtils.isEmpty(this.s) && j.getMafCity() != null) {
                this.s = com.sankuai.waimai.platform.domain.manager.location.g.a(j.getMafCity().getCityName(), getString(R.string.wm_address_province), getString(R.string.wm_address_city));
            }
            if (!TextUtils.isEmpty(this.s)) {
                this.r = 1;
                return;
            }
        }
        this.s = getString(R.string.wm_address_poiList_locating_failed);
        this.r = 3;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c950bdfc1705d238fbca5512ef65129a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c950bdfc1705d238fbca5512ef65129a")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            if (this.n.getVisibility() == 0 || this.G) {
                this.F.b();
                a(false);
                h();
                g();
                return true;
            }
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        WmAddress k;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d48fb53e8450b749bfb38b3ea27392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d48fb53e8450b749bfb38b3ea27392");
        } else if (this.n.getVisibility() == 0 || this.G) {
            this.F.b();
            a(false);
            h();
            g();
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d935982b4be5412061e0261b78b70161", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d935982b4be5412061e0261b78b70161");
            } else if (k() && (k = com.sankuai.waimai.foundation.location.v2.g.a().k()) != null && k.getWMLocation() != null && !k.getWMLocation().hasLocatedPermission && (TextUtils.isEmpty(k.getAddress()) || com.meituan.android.singleton.b.a.getString(R.string.wm_default_address_loading).equals(k.getAddress()))) {
                String string = com.meituan.android.singleton.b.a.getString(R.string.wm_default_address);
                k.setAddress(string);
                com.sankuai.waimai.foundation.location.v2.g.a().a(k, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                b(string, k);
            }
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9594b45631369d51664800bd01f1f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9594b45631369d51664800bd01f1f4");
            return;
        }
        i();
        this.E = false;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2c15bd16620d256d6f2a88fa9fcd67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2c15bd16620d256d6f2a88fa9fcd67");
            return;
        }
        this.U = TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM;
        this.V = "";
        DeviceLocateCallback deviceLocateCallback = new DeviceLocateCallback() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1347d82f7c361f6c7b80b204e06537fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1347d82f7c361f6c7b80b204e06537fd");
                    return;
                }
                LocateManuallyActivity.this.L = true;
                if (wMLocation.getLocationResultCode().a == 1200) {
                    LocateManuallyActivity locateManuallyActivity = LocateManuallyActivity.this;
                    Object[] objArr3 = {wMLocation};
                    ChangeQuickRedirect changeQuickRedirect3 = LocateManuallyActivity.a;
                    if (PatchProxy.isSupport(objArr3, locateManuallyActivity, changeQuickRedirect3, false, "04f89c4d4f1c6db806a69007d5e82c13", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, locateManuallyActivity, changeQuickRedirect3, false, "04f89c4d4f1c6db806a69007d5e82c13");
                        return;
                    }
                    locateManuallyActivity.e = wMLocation.getLatitude();
                    locateManuallyActivity.f = wMLocation.getLongitude();
                    locateManuallyActivity.d = true;
                    return;
                }
                LocateManuallyActivity locateManuallyActivity2 = LocateManuallyActivity.this;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = LocateManuallyActivity.a;
                if (PatchProxy.isSupport(objArr4, locateManuallyActivity2, changeQuickRedirect4, false, "019618c19b9289106441533aacb43886", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, locateManuallyActivity2, changeQuickRedirect4, false, "019618c19b9289106441533aacb43886");
                    return;
                }
                locateManuallyActivity2.b.setText(R.string.wm_address_manually_failed);
                locateManuallyActivity2.b.setTextColor(locateManuallyActivity2.getResources().getColor(R.color.wm_common_text_main));
                locateManuallyActivity2.c.setText(R.string.wm_address_manually_locate_again);
            }
        };
        com.sankuai.waimai.foundation.location.v2.callback.b bVar = new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.b
            public final void a(WmAddress wmAddress) {
                long j;
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f25c62e8ee17c656762f7ab95be54d31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f25c62e8ee17c656762f7ab95be54d31");
                    return;
                }
                LocateManuallyActivity.this.L = true;
                if (wmAddress != null && wmAddress.hasAddress()) {
                    LocateManuallyActivity locateManuallyActivity = LocateManuallyActivity.this;
                    String address = wmAddress.getAddress();
                    Object[] objArr3 = {address, wmAddress};
                    ChangeQuickRedirect changeQuickRedirect3 = LocateManuallyActivity.a;
                    if (PatchProxy.isSupport(objArr3, locateManuallyActivity, changeQuickRedirect3, false, "3a391211a1a027ac7fd4fe16be86776b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, locateManuallyActivity, changeQuickRedirect3, false, "3a391211a1a027ac7fd4fe16be86776b");
                        return;
                    }
                    locateManuallyActivity.a(address, wmAddress);
                    WMLocation wMLocation = wmAddress.getWMLocation();
                    long j2 = 0;
                    if (wMLocation != null) {
                        j2 = (long) (wMLocation.getLongitude() * 1000000.0d);
                        j = (long) (wMLocation.getLatitude() * 1000000.0d);
                    } else {
                        j = 0;
                    }
                    JudasManualManager.a("b_waimai_o5nf04so_mc", "c_9le3i2l", AppUtil.generatePageInfoKey(locateManuallyActivity)).a(GearsLocator.ADDRESS, address).a(Constants.PRIVACY.KEY_LONGITUDE, j2).a(Constants.PRIVACY.KEY_LATITUDE, j).a();
                    return;
                }
                LocateManuallyActivity locateManuallyActivity2 = LocateManuallyActivity.this;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = LocateManuallyActivity.a;
                if (PatchProxy.isSupport(objArr4, locateManuallyActivity2, changeQuickRedirect4, false, "9f2004cdda90a8515921a1b7805803bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, locateManuallyActivity2, changeQuickRedirect4, false, "9f2004cdda90a8515921a1b7805803bf");
                } else {
                    locateManuallyActivity2.a(locateManuallyActivity2.getString(R.string.wm_address_manually_failed), (WmAddress) null);
                }
            }
        };
        if (k()) {
            com.sankuai.waimai.foundation.location.v2.g.a().a(deviceLocateCallback, bVar, true, false, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), new k((FragmentActivity) this, "dj-b5e9814e9fb3a8f6"));
        } else {
            com.sankuai.waimai.foundation.location.v2.g.a().a(deviceLocateCallback, bVar, this.R, new k((FragmentActivity) this, "dj-b5e9814e9fb3a8f6"));
        }
    }

    void a(String str, WmAddress wmAddress) {
        Object[] objArr = {str, wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ce711150575c56900c9fcfffc744db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ce711150575c56900c9fcfffc744db");
            return;
        }
        this.b.setText(str);
        this.b.setTextColor(getResources().getColor(R.color.wm_common_text_main));
        this.c.setText(R.string.wm_address_manually_locate_again);
        if (this.d) {
            if (!str.equals(getString(R.string.wm_address_manually_failed))) {
                if (k()) {
                    g.a(this.e, this.f, str);
                    g.k();
                }
            } else {
                str = getString(R.string.wm_address_poiList_locating_unknown);
            }
            com.sankuai.waimai.platform.domain.manager.location.a.b(getApplicationContext());
            b(str, wmAddress);
            return;
        }
        this.L = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8babbeeee5307214aa061d6dace22a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8babbeeee5307214aa061d6dace22a9c");
        } else if (z) {
            this.n.setVisibility(0);
            this.F.f = getString(R.string.wm_address_manually_search_edit_hint);
            this.F.g = new d.a() { // from class: com.sankuai.waimai.business.address.LocateManuallyActivity.14
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.address.controller.d.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c86cf7cc9a30dc684719f1621fe2a7ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c86cf7cc9a30dc684719f1621fe2a7ce");
                        return;
                    }
                    String a2 = LocateManuallyActivity.this.F.a();
                    if (a2 != null && !TextUtils.isEmpty(a2.trim())) {
                        LocateManuallyActivity.this.g();
                        LocateManuallyActivity.a(LocateManuallyActivity.this, true, false);
                    } else {
                        ae.a(LocateManuallyActivity.this.getApplicationContext(), (int) R.string.wm_address_manually_search_edit_hint);
                    }
                    LocateManuallyActivity.b(LocateManuallyActivity.this, false);
                }

                @Override // com.sankuai.waimai.business.address.controller.d.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c192504b44969376ff706a09948fbe5e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c192504b44969376ff706a09948fbe5e");
                        return;
                    }
                    String a2 = LocateManuallyActivity.this.F.a();
                    if (a2 == null || TextUtils.isEmpty(a2.trim())) {
                        LocateManuallyActivity.this.H = true;
                        LocateManuallyActivity.t(LocateManuallyActivity.this);
                    } else {
                        LocateManuallyActivity.s(LocateManuallyActivity.this);
                        LocateManuallyActivity.a(LocateManuallyActivity.this, true, true);
                        LocateManuallyActivity.this.H = false;
                    }
                    if (LocateManuallyActivity.this.l.getVisibility() == 0) {
                        LocateManuallyActivity.this.l.setVisibility(8);
                        LocateManuallyActivity.this.b(true);
                    }
                }
            };
            this.F.a(this.K, null);
            com.sankuai.waimai.business.address.util.c.a(this);
        } else {
            this.n.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a42c628189aa70f0cca2ea005313631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a42c628189aa70f0cca2ea005313631");
        } else {
            com.sankuai.waimai.business.address.util.c.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0bc44cbbe1411ebd0c207170aacf27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0bc44cbbe1411ebd0c207170aacf27");
            return;
        }
        this.g.h();
        this.t.setVisibility(8);
        this.n.setVisibility(8);
        this.h.setVisibility(0);
        this.G = false;
        b();
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.search.b.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c3b53a60bcf006e668649606e032ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c3b53a60bcf006e668649606e032ff");
            return;
        }
        this.u.a();
        this.g.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // com.sankuai.waimai.platform.domain.manager.location.search.b.a
    public final void a(MtAddressSearchResponse mtAddressSearchResponse) {
        LocateManuallyActivity locateManuallyActivity;
        boolean z;
        LocateManuallyActivity locateManuallyActivity2 = this;
        Object[] objArr = {mtAddressSearchResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42616be778263322b13efe1b4178989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, locateManuallyActivity2, changeQuickRedirect, false, "e42616be778263322b13efe1b4178989");
        } else if (mtAddressSearchResponse.b != 200 || mtAddressSearchResponse.e == null) {
            locateManuallyActivity2.u.a();
            locateManuallyActivity2.g.g();
        } else {
            locateManuallyActivity2.g.h();
            try {
                locateManuallyActivity2.u.a();
                List<AddressItem> list = mtAddressSearchResponse.e;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0024a32ccab0340ac111be6e5c54637c", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr2, locateManuallyActivity2, changeQuickRedirect2, false, "0024a32ccab0340ac111be6e5c54637c");
                } else {
                    String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(bB_(), "address_filter_poitype", "");
                    Object[] objArr3 = {b, list};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.address.util.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5594e55ca1c501d13b9ec2fcc8276783", RobustBitConfig.DEFAULT_VALUE)) {
                        list = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5594e55ca1c501d13b9ec2fcc8276783");
                    } else if (!TextUtils.isEmpty(b)) {
                        String[] split = b.split(CommonConstant.Symbol.COMMA);
                        HashSet hashSet = new HashSet();
                        Collections.addAll(hashSet, split);
                        ArrayList arrayList = new ArrayList();
                        for (AddressItem addressItem : list) {
                            if (!TextUtils.isEmpty(addressItem.type)) {
                                for (String str : addressItem.type.split(";")) {
                                    if (hashSet.contains(str)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                                arrayList.add(addressItem);
                            }
                        }
                        list = arrayList;
                    }
                }
                locateManuallyActivity = list.size();
                try {
                    if (locateManuallyActivity <= 0) {
                        locateManuallyActivity2.g.f();
                        return;
                    }
                    locateManuallyActivity2.u.e = locateManuallyActivity2.q;
                    locateManuallyActivity2.u.d = locateManuallyActivity2.p;
                    ArrayList arrayList2 = new ArrayList((int) locateManuallyActivity);
                    int i = 0;
                    int i2 = locateManuallyActivity;
                    while (i < i2) {
                        try {
                            AddressItem addressItem2 = list.get(i);
                            int i3 = i2;
                            List<AddressItem> list2 = list;
                            arrayList2.add(new com.sankuai.waimai.business.address.model.a(addressItem2.addrBrief, addressItem2.addrDesc, addressItem2.lat, addressItem2.lng, addressItem2.cityCode, addressItem2.cityName, addressItem2.province, addressItem2.district, addressItem2.type, addressItem2.mapSearchPoiId, addressItem2.source));
                            i++;
                            i2 = i3;
                            list = list2;
                            locateManuallyActivity2 = this;
                        } catch (Exception unused) {
                            locateManuallyActivity = this;
                            ae.a(getApplicationContext(), locateManuallyActivity.getString(R.string.takeout_loading_fail_try_afterwhile));
                            return;
                        }
                    }
                    LocateManuallyActivity locateManuallyActivity3 = locateManuallyActivity2;
                    com.sankuai.waimai.business.address.adapter.b bVar = locateManuallyActivity3.u;
                    Object[] objArr4 = {arrayList2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.address.adapter.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "2c8ed5b08f4adc6c44c25cae0947fd52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "2c8ed5b08f4adc6c44c25cae0947fd52");
                    } else {
                        bVar.f.clear();
                        bVar.f.addAll(arrayList2);
                        bVar.notifyDataSetChanged();
                    }
                    locateManuallyActivity3.t.a();
                    JudasManualManager.b("b_7QLWZ").a();
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                locateManuallyActivity = locateManuallyActivity2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0473c3798c3ab67468efe00a2fcc3518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0473c3798c3ab67468efe00a2fcc3518");
        } else if (z) {
            this.M.setText(R.string.wm_c_iconfont_arrow_down_small);
        } else {
            this.M.setText(R.string.wm_c_iconfont_arrow_up_small);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933fbdaa3242548831b123d80862c604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933fbdaa3242548831b123d80862c604");
            return;
        }
        String b = b(this.s);
        this.i.setText(b);
        if (z) {
            this.m.setText(b);
        }
        int color = getResources().getColor(R.color.wm_common_text_main);
        switch (this.r) {
            case 1:
                color = getResources().getColor(R.color.wm_common_text_main);
                break;
            case 2:
                color = getResources().getColor(R.color.wm_common_text_highlight);
                break;
            case 3:
                color = getResources().getColor(R.color.wm_address_text_red2);
                break;
        }
        this.m.setTextColor(color);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r24, int r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.address.LocateManuallyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c217546325cc61267f2e1f7a81f6bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c217546325cc61267f2e1f7a81f6bc");
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e1eec3e7f81e70868e85e961e51fdb0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e1eec3e7f81e70868e85e961e51fdb0");
            } else if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) this, "show_change_city_bubble", false) || l()) {
                if (this.O == null) {
                    TextView textView = new TextView(this);
                    textView.setText(R.string.wm_address_manually_choose_city_tips);
                    textView.setTextColor(getResources().getColor(R.color.takeout_white));
                    textView.setTextSize(14.0f);
                    textView.setBackgroundResource(R.drawable.wm_address_bubble_tip);
                    textView.setPadding(com.sankuai.waimai.foundation.utils.g.a(this, 12.0f), com.sankuai.waimai.foundation.utils.g.a(this, 7.0f), com.sankuai.waimai.foundation.utils.g.a(this, 12.0f), com.sankuai.waimai.foundation.utils.g.a(this, 4.0f));
                    this.O = new CompatiblePopupWindow(textView, -2, -2);
                    this.O.setFocusable(false);
                    this.O.setTouchable(false);
                }
                try {
                    if (com.sankuai.waimai.foundation.utils.f.a(this) || this.O.isShowing()) {
                        return;
                    }
                    com.sankuai.waimai.platform.utils.p.a(this.O, this.P, 0, 0);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bce1e48cbd2ef074f162ae8249f27bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bce1e48cbd2ef074f162ae8249f27bc")).booleanValue();
        }
        i();
        return super.dispatchTouchEvent(motionEvent);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3e8dd5dc88c1ced371a85544407333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3e8dd5dc88c1ced371a85544407333");
        } else if (this.O != null) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) this, "show_change_city_bubble", true);
            try {
                com.sankuai.waimai.platform.utils.p.b(this.O);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.sankuai.waimai.business.address.controller.c
    public final void b(String str, WmAddress wmAddress) {
        Object[] objArr = {str, wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7ffd80644b0607eaa983800cfd330c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7ffd80644b0607eaa983800cfd330c");
            return;
        }
        g();
        if (k()) {
            com.sankuai.waimai.platform.domain.manager.location.a.a(wmAddress);
        }
        String str2 = null;
        if (wmAddress != null) {
            str2 = wmAddress.toString();
            a(wmAddress);
        }
        Intent intent = getIntent();
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("arg_selected_address", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("selected_address", str2);
        }
        if (this.U > 0) {
            intent.putExtra("operator_type", this.U);
        }
        if (!TextUtils.isEmpty(this.V)) {
            intent.putExtra("address_info", this.V);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.sankuai.waimai.business.address.controller.c
    public final void a(String str, WmAddress wmAddress, int i, String str2) {
        Object[] objArr = {str, wmAddress, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854aba72c2249c209f46ac25a2d696c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854aba72c2249c209f46ac25a2d696c5");
            return;
        }
        g();
        if (k()) {
            com.sankuai.waimai.platform.domain.manager.location.a.a(wmAddress);
        }
        String str3 = null;
        if (wmAddress != null) {
            str3 = wmAddress.toString();
            a(wmAddress);
        }
        Intent intent = getIntent();
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("arg_selected_address", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("selected_address", str3);
        }
        if (i > 0) {
            intent.putExtra("operator_type", i);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("address_info", str2);
        }
        setResult(-1, intent);
        finish();
    }

    private void a(@NonNull WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b018cb0323d8cb6ae79d3bbe7d6cf54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b018cb0323d8cb6ae79d3bbe7d6cf54d");
        } else if (com.sankuai.waimai.foundation.core.a.d() || wmAddress.getWMLocation() == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put(GearsLocator.ADDRESS, wmAddress.getAddress());
                jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, wmAddress.getWMLocation().getLongitude());
                jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, wmAddress.getWMLocation().getLatitude());
                jSONObject.put(RemoteMessageConst.Notification.NOTIFY_ID, this.T);
                jSONObject2.put("info", jSONObject);
                Intent intent = new Intent();
                intent.setPackage(getPackageName());
                intent.setAction("com.meituan.waimai.didGetLocationWithAddress.notification");
                intent.putExtra("info", jSONObject2.toString());
                LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            } catch (Exception unused) {
            }
        }
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10a671f52e915482c21068c2b82de8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10a671f52e915482c21068c2b82de8c");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 4) {
            return str.substring(0, 4) + "...";
        }
        return str;
    }

    private WmAddress j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dccc6ca6e6de4fc7e319224c4ab8ff4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dccc6ca6e6de4fc7e319224c4ab8ff4b");
        }
        if ("FROM_INTERNAL_LOCATE_MANUALLY".equals(this.R)) {
            return com.sankuai.waimai.foundation.location.v2.g.a().k();
        }
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0045d84ec6f572d5881b2d9e74eac46b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0045d84ec6f572d5881b2d9e74eac46b")).booleanValue() : ("search".equals(this.R) || "shoppingcart".equals(this.R)) ? false : true;
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e1c8e9b61303692ab4ccdc4cfd2525", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e1c8e9b61303692ab4ccdc4cfd2525")).booleanValue() : com.sankuai.waimai.foundation.location.v2.g.a().i() == null || !com.sankuai.waimai.foundation.location.v2.g.a().i().hasLocatedPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32f9e78d78023afdba9eebf48e497bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32f9e78d78023afdba9eebf48e497bb");
        } else {
            startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 301);
        }
    }
}
