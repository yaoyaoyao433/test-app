package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.drug.mrn.DrugCommonMRNFragment;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mrn.shopcartbridge.IPoiTabMrnService;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugPoiTabMRNFragment extends DrugCommonMRNFragment implements View.OnTouchListener, PrioritySmoothNestedScrollView.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    @NonNull
    private final b A;
    private DrugNetInfoLoadView B;
    com.sankuai.waimai.store.drug.goods.list.delegate.d b;
    com.facebook.react.views.scroll.e k;
    public VelocityTracker l;
    a m;
    View.OnTouchListener n;
    public RestMenuResponse.b o;
    public boolean p;
    private int r;
    private boolean s;
    private BroadcastReceiver t;
    private String u;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@NonNull com.facebook.react.views.scroll.e eVar);
    }

    public static /* synthetic */ void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95a1ca00dc7186b7d15a115a0c4b46d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95a1ca00dc7186b7d15a115a0c4b46d5");
        }
    }

    @Override // com.sankuai.waimai.store.drug.mrn.DrugCommonMRNFragment
    public final boolean s() {
        return false;
    }

    public DrugPoiTabMRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f042f39722d570990c60ac91225fe646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f042f39722d570990c60ac91225fe646");
            return;
        }
        this.r = 0;
        this.s = false;
        this.u = "";
        this.y = true;
        this.l = VelocityTracker.obtain();
        this.A = new b();
        this.p = false;
    }

    public static /* synthetic */ int a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, int i) {
        drugPoiTabMRNFragment.r = 0;
        return 0;
    }

    public static /* synthetic */ void a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, drugPoiTabMRNFragment, changeQuickRedirect, false, "5653be43ca9e460fc54105dfa9877c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, drugPoiTabMRNFragment, changeQuickRedirect, false, "5653be43ca9e460fc54105dfa9877c8f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("mrn_entry");
                String optString2 = jSONObject.optString("mrn_component");
                if (TextUtils.equals(optString, drugPoiTabMRNFragment.p()) && TextUtils.equals(optString2, drugPoiTabMRNFragment.q())) {
                    b bVar = drugPoiTabMRNFragment.A;
                    FragmentActivity activity = drugPoiTabMRNFragment.getActivity();
                    Object[] objArr2 = {jSONObject, activity};
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0e1894248734a26933e91069d9fd96e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0e1894248734a26933e91069d9fd96e6");
                    } else {
                        bVar.c = b.a(jSONObject.optString("end_color"));
                        bVar.b = b.a(jSONObject.optString("start_color"));
                        if (activity == null) {
                            bVar.d = 0;
                        } else {
                            bVar.d = com.sankuai.shangou.stone.util.h.a(activity, jSONObject.optInt("linear_height", 0));
                        }
                    }
                    drugPoiTabMRNFragment.u = jSONObject.optString("list_view_react_tag");
                    drugPoiTabMRNFragment.r = 0;
                    drugPoiTabMRNFragment.y();
                    drugPoiTabMRNFragment.a(drugPoiTabMRNFragment.v);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ boolean a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, boolean z) {
        drugPoiTabMRNFragment.z = false;
        return false;
    }

    public static /* synthetic */ int e(DrugPoiTabMRNFragment drugPoiTabMRNFragment) {
        int i = drugPoiTabMRNFragment.r;
        drugPoiTabMRNFragment.r = i + 1;
        return i;
    }

    public static DrugPoiTabMRNFragment c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76aafc21d4097dbce701a236d0d6562c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugPoiTabMRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76aafc21d4097dbce701a236d0d6562c");
        }
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = new DrugPoiTabMRNFragment();
        drugPoiTabMRNFragment.setArguments(SGCommonRNFragment.b(str));
        return drugPoiTabMRNFragment;
    }

    public static DrugPoiTabMRNFragment a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c1f9b04e2a8f402f36367c4195743ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugPoiTabMRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c1f9b04e2a8f402f36367c4195743ec");
        }
        Bundle bundle = new Bundle();
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = new DrugPoiTabMRNFragment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        drugPoiTabMRNFragment.setArguments(bundle);
        return drugPoiTabMRNFragment;
    }

    public final void a(com.sankuai.waimai.store.drug.goods.list.delegate.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849dc5df72822e483ee32b9b2ba989f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849dc5df72822e483ee32b9b2ba989f5");
            return;
        }
        this.b = dVar;
        this.v = dVar != null ? dVar.d() : new com.sankuai.waimai.store.platform.domain.manager.poi.a();
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42f550e90f5267ed998853d4c3b5331d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42f550e90f5267ed998853d4c3b5331d");
            return;
        }
        com.sankuai.waimai.store.shopping.cart.delegate.b z = z();
        if (z != null) {
            z.h();
            boolean d = z.d();
            if (this.s != d) {
                Object[] objArr2 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1eddd306631b2a0aab3b0415e6a9c66", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1eddd306631b2a0aab3b0415e6a9c66");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("hasTip", d);
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(t(), "AdjustContentInset", createMap);
                }
                this.s = d;
            }
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(t(), "RefreshGoodsList", Arguments.createMap());
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IntentFilter intentFilter;
        String str;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dbcd7e601eedca639674064eee720f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dbcd7e601eedca639674064eee720f");
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c3d328bdf7ba8e8adb067aa1c8c2da4", RobustBitConfig.DEFAULT_VALUE)) {
                intentFilter = (IntentFilter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c3d328bdf7ba8e8adb067aa1c8c2da4");
            } else {
                intentFilter = new IntentFilter();
                if (TextUtils.equals(p(), "flashbuy-store-info")) {
                    str = TextUtils.equals(q(), "flashbuy-store-comments") ? "supermarket:poi_comment_page_did_mount" : "supermarket:poi_info_page_did_mount";
                } else if (TextUtils.equals(p(), "flashbuy-drug-poi")) {
                    str = (TextUtils.equals(q(), "flashbuy-drug-retail-poi") || TextUtils.equals(q(), "flashbuy-retail-self-poi")) ? "medicine:retail_poi_page_did_update" : "supermarket:drug_tab_scrollview_did_mount";
                } else {
                    str = "supermarket:drug_tab_scrollview_did_mount";
                }
                intentFilter.addAction(str);
                this.t = new BroadcastReceiver() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        Object[] objArr3 = {context, intent};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc316675cdbcceeb849ccd6f2879b286", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc316675cdbcceeb849ccd6f2879b286");
                            return;
                        }
                        String action = intent.getAction();
                        if ("supermarket:drug_tab_scrollview_did_mount".equals(action) || "medicine:retail_poi_page_did_update".equals(action)) {
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                return;
                            }
                            DrugPoiTabMRNFragment.a(DrugPoiTabMRNFragment.this, extras.getString("data"));
                            return;
                        }
                        try {
                            DrugPoiTabMRNFragment.this.u = new JSONObject(intent.getExtras().get("data").toString()).optString("list_view_react_tag");
                            DrugPoiTabMRNFragment.a(DrugPoiTabMRNFragment.this, 0);
                            DrugPoiTabMRNFragment.this.y();
                            DrugPoiTabMRNFragment.this.a(DrugPoiTabMRNFragment.this.v);
                        } catch (Exception e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                };
            }
            activity.registerReceiver(this.t, intentFilter);
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.order.a.e().a(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b91b3b02c70c9f836a8fbfb195ad2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b91b3b02c70c9f836a8fbfb195ad2e");
            return;
        }
        super.onActivityCreated(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7206368bf173c6d3514a2cf429f9b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7206368bf173c6d3514a2cf429f9b68");
        } else {
            b().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc4d47316a09249c73439a7e0098b0f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc4d47316a09249c73439a7e0098b0f0");
                        return;
                    }
                    DrugPoiTabMRNFragment.this.x();
                    DrugPoiTabMRNFragment.this.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        boolean z;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692356d7d56a35216c9daec3f278b8d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692356d7d56a35216c9daec3f278b8d0");
            return;
        }
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19214b44ac1df8e3e2e3269c4c50f6d1", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19214b44ac1df8e3e2e3269c4c50f6d1")).booleanValue();
        } else {
            String q = q();
            z = !TextUtils.isEmpty(q) && ("flashbuy-drug-retail-poi".equals(q) || "flashbuy-drug-self-poi".equals(q) || "flashbuy-retail-self-poi".equals(q));
        }
        if (z && (activity instanceof SCBaseActivity) && (getView() instanceof FrameLayout)) {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) activity;
            DrugShopStatusViewModel drugShopStatusViewModel = (DrugShopStatusViewModel) q.a((FragmentActivity) sCBaseActivity).a(DrugShopStatusViewModel.class);
            android.arch.lifecycle.k<Boolean> kVar = drugShopStatusViewModel.d;
            Object[] objArr3 = {this, activity, drugShopStatusViewModel};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            kVar.a(sCBaseActivity, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "691ca29ca38da0c3983735e3de00572f", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "691ca29ca38da0c3983735e3de00572f") : new f(this, activity, drugShopStatusViewModel));
        }
    }

    public static /* synthetic */ void a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, Activity activity, DrugShopStatusViewModel drugShopStatusViewModel, Boolean bool) {
        Object[] objArr = {drugPoiTabMRNFragment, activity, drugShopStatusViewModel, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "073051b4114522ce8e5dee555ba2eb41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "073051b4114522ce8e5dee555ba2eb41");
        } else if (bool != null && bool.booleanValue()) {
            if (drugPoiTabMRNFragment.B == null) {
                FrameLayout frameLayout = (FrameLayout) drugPoiTabMRNFragment.getView();
                int childCount = frameLayout.getChildCount();
                if (childCount > 0) {
                    for (int i = 0; i < childCount; i++) {
                        u.c(frameLayout.getChildAt(i));
                    }
                }
                drugPoiTabMRNFragment.B = new DrugNetInfoLoadView(activity, null, 0, false);
                drugPoiTabMRNFragment.B.setOnClickListener(g.a());
                drugPoiTabMRNFragment.B.setReloadButtonText(R.string.drug_shop_no_merchandise_button_text);
                drugPoiTabMRNFragment.B.a(activity.getString(R.string.drug_shop_no_merchandise_pager_tip), "", false);
                String h = drugPoiTabMRNFragment.v == null ? "" : drugPoiTabMRNFragment.v.h();
                drugPoiTabMRNFragment.B.setReloadClickListener(h.a(drugShopStatusViewModel, activity, h));
                drugPoiTabMRNFragment.B.setOnTouchListener(drugPoiTabMRNFragment);
                TextView reloadButtonView = drugPoiTabMRNFragment.B.getReloadButtonView();
                com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(reloadButtonView, String.valueOf(System.identityHashCode(reloadButtonView)));
                Object[] objArr2 = {h, activity};
                ChangeQuickRedirect changeQuickRedirect2 = i.a;
                aVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f71a6df0586d768e183b30476b8e2acd", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f71a6df0586d768e183b30476b8e2acd") : new i(h, activity));
                com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) activity, aVar);
                frameLayout.addView(drugPoiTabMRNFragment.B, new FrameLayout.LayoutParams(-1, -1));
            }
            u.a(drugPoiTabMRNFragment.B);
        }
    }

    public static /* synthetic */ void a(String str, Activity activity) {
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3de9e465e1918c71aa920be3495f86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3de9e465e1918c71aa920be3495f86a");
        } else {
            DrugShopStatusViewModel.b(str, 1, ((SCBaseActivity) activity).d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30fa7738ccdb98a16a98c8476076cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30fa7738ccdb98a16a98c8476076cc4");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37a63098253394c188bfe1a08cc1d849", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37a63098253394c188bfe1a08cc1d849");
                    } else if (DrugPoiTabMRNFragment.this.r > 3) {
                    } else {
                        DrugPoiTabMRNFragment.this.x();
                        if (DrugPoiTabMRNFragment.this.k == null) {
                            DrugPoiTabMRNFragment.e(DrugPoiTabMRNFragment.this);
                            DrugPoiTabMRNFragment.this.y();
                        }
                    }
                }
            }, 500, "");
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment
    public final Map<String, String> r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62c8e0698b96afe0a060c0061c43057", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62c8e0698b96afe0a060c0061c43057");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "poihome");
        return hashMap;
    }

    @Subscribe
    public void onMRNLoadShopCartSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd89b186de36e9d60a990739b61c99b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd89b186de36e9d60a990739b61c99b");
        } else if (eVar == null || eVar.a == null || !a(eVar) || !((SGCommonRNFragment) this).i || isResumed()) {
        } else {
            this.v = eVar.a;
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.c cVar) {
        com.sankuai.waimai.store.shopping.cart.delegate.b z;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1899963f3399708139736a7511cd57ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1899963f3399708139736a7511cd57ad");
        } else if (cVar == null || t.a(cVar.a) || z() == null || getActivity() == null || getActivity().isFinishing() || !a(cVar) || !((SGCommonRNFragment) this).i || !isResumed()) {
        } else {
            com.sankuai.waimai.store.shopping.cart.f.a().a(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getActivity().getWindow().getDecorView(), cVar.a), getActivity().hashCode(), this.v.d());
            if (!cVar.b || (z = z()) == null) {
                return;
            }
            z.a(cVar.c);
        }
    }

    @Subscribe
    public void onMRNShowShopCartEvent(com.sankuai.waimai.store.mrn.shopcartbridge.event.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d6ea6fca926a90d895d4a48cd0763d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d6ea6fca926a90d895d4a48cd0763d");
        } else if (iVar == null) {
        } else {
            com.sankuai.waimai.store.shopping.cart.delegate.b z = z();
            if (a(iVar) && z != null && ((SGCommonRNFragment) this).i && isResumed()) {
                if (this.v != null && this.v.c() && iVar.a) {
                    z.b(true);
                } else {
                    z.b(false);
                }
            }
        }
    }

    private boolean a(@NonNull com.sankuai.waimai.store.mrn.shopcartbridge.event.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28e16a2712481cdcc309a84bb00deb1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28e16a2712481cdcc309a84bb00deb1")).booleanValue() : kVar.a(this.v.g(), this.v.h());
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(com.sankuai.waimai.store.mrn.shopcartbridge.event.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3d19b27ab9e378672bc34501f36671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3d19b27ab9e378672bc34501f36671");
        } else if (jVar == null || jVar.b == null || jVar.a == null || z() == null || getActivity() == null || getActivity().isFinishing() || !a(jVar) || !((SGCommonRNFragment) this).i || !isResumed()) {
        } else {
            if (jVar.b.mrnExtension != null) {
                com.sankuai.waimai.store.drug.util.d.a(getActivity(), jVar.b, jVar.a.b, jVar.b.mrnExtension.getIndex(), jVar.b.mrnExtension.getKeyword(), jVar.b.mrnExtension.getSearchLogId(), jVar.b.mrnExtension.getSearchGlobalId(), 0, jVar.b.mrnExtension.getStid());
                return;
            }
            com.sankuai.waimai.store.drug.util.d.a(getActivity(), jVar.b, jVar.a.b, 0);
        }
    }

    @Subscribe
    public void openContactPoiDialog(com.sankuai.waimai.store.mrn.shopcartbridge.event.b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d4496432ca6c5d9c3c305ee093fba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d4496432ca6c5d9c3c305ee093fba9");
        } else if (bVar != null && TextUtils.equals(bVar.a, "contact_poi") && getActivity() != null && !getActivity().isFinishing()) {
            String q = q();
            Object[] objArr2 = {q};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48dddf8069c52b86181ad508b9d0c030", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48dddf8069c52b86181ad508b9d0c030")).booleanValue();
            } else {
                z = (TextUtils.equals(q, "flashbuy-store-info-only") || TextUtils.equals(q, "flashbuy-drug-store-info-only")) ? false : true;
            }
            if (z) {
                return;
            }
            final ArrayList arrayList = new ArrayList();
            int a2 = com.sankuai.shangou.stone.util.a.a((List) bVar.c);
            for (int i = 0; i < a2; i++) {
                Object a3 = com.sankuai.shangou.stone.util.a.a(bVar.c, i);
                if (a3 instanceof String) {
                    String str = (String) a3;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
            if (this.z) {
                return;
            }
            this.z = true;
            new CustomDialog.a(this.b.k()).a(bVar.b).a((CharSequence[]) arrayList.toArray(new String[com.sankuai.shangou.stone.util.a.a((List) arrayList)]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "28b547859eeb43f341484a14a2500fee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "28b547859eeb43f341484a14a2500fee");
                        return;
                    }
                    try {
                        String str2 = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i2);
                        String substring = str2 == null ? null : str2.substring(str2.lastIndexOf(58));
                        if (!TextUtils.isEmpty(substring)) {
                            z.a(DrugPoiTabMRNFragment.this.b.k(), substring);
                        } else {
                            dialogInterface.dismiss();
                        }
                    } catch (Exception e) {
                        DrugPoiTabMRNFragment.a(DrugPoiTabMRNFragment.this, false);
                        dialogInterface.dismiss();
                        com.sankuai.waimai.store.base.log.a.a(e.getMessage());
                    }
                }
            }).a(IPaymentManager.NO_ACTION, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6020366c55b5bc001adfccfc6f5fe61", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6020366c55b5bc001adfccfc6f5fe61");
                    } else {
                        DrugPoiTabMRNFragment.a(DrugPoiTabMRNFragment.this, false);
                    }
                }
            }).c();
        }
    }

    public final ReactContext t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "623d6560395344b09ec29c878bb19841", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "623d6560395344b09ec29c878bb19841");
        }
        if (n() == null || l() == null) {
            return null;
        }
        return l().getCurrentReactContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63f1e4c1165b22a7347be7def089263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63f1e4c1165b22a7347be7def089263");
            return;
        }
        try {
            ReactContext t = t();
            ((IPoiTabMrnService) com.sankuai.waimai.router.a.a(IPoiTabMrnService.class, IPoiTabMrnService.DRUG_POI_MRN)).updateMRNBridgePoiHelper(t, aVar);
            ((DrugMRNShopCartModule) t.getCatalystInstance().getNativeModule(DrugMRNShopCartModule.class)).updatePoiHelper(aVar);
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
    }

    private com.sankuai.waimai.store.shopping.cart.delegate.b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174b5aa1e61fc5cf07eb89b3794f2234", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.shopping.cart.delegate.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174b5aa1e61fc5cf07eb89b3794f2234");
        }
        if (this.b != null) {
            return this.b.o();
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df37885decab7d76618cda115b85e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df37885decab7d76618cda115b85e26");
            return;
        }
        super.a(z);
        if (z) {
            if (this.k == null) {
                x();
                return;
            }
            return;
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3116636044bd208941db658d385e9ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3116636044bd208941db658d385e9ee2");
        } else if (this.b == null || this.b.e() == null) {
        } else {
            this.b.e().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4c056f728c9d6bc0c5923eedb26901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4c056f728c9d6bc0c5923eedb26901");
        } else if (this.b == null || this.b.e() == null) {
        } else {
            this.b.e().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1efc4fac4a06632934eedb78c735f03", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1efc4fac4a06632934eedb78c735f03")).booleanValue() : this.k.canScrollVertically(1) || this.k.canScrollVertically(-1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9fada1455b0cb9601bc23e712f479b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9fada1455b0cb9601bc23e712f479b0");
        } else if (this.b == null || t.a(this.u) || !((SGCommonRNFragment) this).i) {
        } else {
            this.k = (com.facebook.react.views.scroll.e) com.sankuai.waimai.store.mrn.shopcartbridge.a.a(b(), this.u);
            if (this.m == null || this.k == null) {
                return;
            }
            this.m.a(this.k);
            v();
            this.k.setBackground(this.A.a());
            this.k.setOnTouchListener(this);
            c_(this.b.e().getScrollY());
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cbe4085ee1ae02894b5867bb177a5bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cbe4085ee1ae02894b5867bb177a5bf");
            return;
        }
        super.onPause();
        u();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73128fe00014c334c12ebe880b02d575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73128fe00014c334c12ebe880b02d575");
            return;
        }
        super.onResume();
        v();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856912d9d1d76f7ad474db67e9cae34c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856912d9d1d76f7ad474db67e9cae34c");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.order.a.e().b(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.t);
        }
        com.meituan.android.bus.a.a().b(this);
        this.b = null;
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be34d32a4fac36f42002b0d521a9699e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be34d32a4fac36f42002b0d521a9699e");
        } else if (this.b == null || this.b.e() == null) {
        } else {
            if (this.k != null && w()) {
                if (i >= A()) {
                    this.b.e().setForbidScroll(true);
                    return;
                } else {
                    this.b.e().setForbidScroll(false);
                    return;
                }
            }
            this.b.e().setForbidScroll(false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea878bd4a7061ad98a97b545a60cbd5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea878bd4a7061ad98a97b545a60cbd5c")).booleanValue();
        }
        b bVar = this.A;
        com.facebook.react.views.scroll.e eVar = this.k;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b8692ef7c89f6c248ac7f76390f4be0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b8692ef7c89f6c248ac7f76390f4be0d");
        } else if (eVar != null) {
            Drawable background = eVar.getBackground();
            if (background instanceof com.sankuai.waimai.store.widgets.drawable.a) {
                ((com.sankuai.waimai.store.widgets.drawable.a) background).f = eVar.getScrollY();
            }
        }
        if (this.n != null) {
            this.n.onTouch(view, motionEvent);
        }
        this.l.addMovement(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.x = motionEvent.getRawY();
                this.w = motionEvent.getRawY();
                break;
            case 1:
                this.l.computeCurrentVelocity(100);
                int i = -((int) this.l.getYVelocity());
                if (Math.abs(i) > 0 && n.a((int) (this.x - motionEvent.getRawY())) == n.a(i)) {
                    float f = i;
                    if (!this.k.dispatchNestedPreFling(0.0f, f) && !this.y) {
                        this.k.dispatchNestedFling(0.0f, f, false);
                    }
                }
                this.w = 0.0f;
                this.l.clear();
                break;
            case 2:
                if (Math.abs(this.w) > 0.0f && this.b != null) {
                    if (this.b.e().getScrollY() < A() && this.w - motionEvent.getRawY() > 0.0f) {
                        this.b.e().scrollBy(0, (int) (this.w - motionEvent.getRawY()));
                    } else if (this.k.getScrollY() == 0 && this.w - motionEvent.getRawY() < 0.0f) {
                        this.b.e().scrollBy(0, (int) (this.w - motionEvent.getRawY()));
                    }
                    if ((this.w - motionEvent.getRawY() > 0.0f || this.k.getScrollY() < 0) && (this.b.e().getScrollY() == 0 || this.b.e().getScrollY() < A())) {
                        this.y = true;
                    } else {
                        this.y = false;
                    }
                }
                this.w = motionEvent.getRawY();
                break;
            case 3:
                this.w = 0.0f;
                this.l.clear();
                break;
        }
        return this.y;
    }

    private int A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37bfc0ab16a9a8bf63b1aa6d52c99502", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37bfc0ab16a9a8bf63b1aa6d52c99502")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.g();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        int d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d694b9b5e959ab7a23649e289b9670ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d694b9b5e959ab7a23649e289b9670ce");
                return;
            }
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        static int a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3c5b6e47e78964c88b1e2a00c6df085", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3c5b6e47e78964c88b1e2a00c6df085")).intValue() : com.sankuai.shangou.stone.util.d.a(str, 0);
        }

        Drawable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd8de49c8fbcccb2d4781531203a544", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd8de49c8fbcccb2d4781531203a544");
            }
            com.sankuai.waimai.store.widgets.drawable.a aVar = new com.sankuai.waimai.store.widgets.drawable.a();
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.e = this.d;
            return aVar;
        }
    }

    public static /* synthetic */ void a(DrugShopStatusViewModel drugShopStatusViewModel, Activity activity, String str, View view) {
        Object[] objArr = {drugShopStatusViewModel, activity, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d01dce0ce389da249938e98dc95b0eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d01dce0ce389da249938e98dc95b0eb");
        } else if (TextUtils.isEmpty(drugShopStatusViewModel.g)) {
        } else {
            com.sankuai.waimai.store.router.d.a(activity, drugShopStatusViewModel.g);
            DrugShopStatusViewModel.a(str, 1, ((SCBaseActivity) activity).d());
        }
    }
}
