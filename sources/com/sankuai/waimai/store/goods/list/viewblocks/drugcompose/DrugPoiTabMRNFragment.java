package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugPoiTabMRNFragment extends SGCommonRNFragment implements View.OnTouchListener, PrioritySmoothNestedScrollView.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    private a A;
    com.sankuai.waimai.store.goods.list.delegate.e b;
    com.facebook.react.views.scroll.e k;
    public VelocityTracker l;
    public View.OnTouchListener m;
    public b n;
    public RestMenuResponse.b o;
    private int p;
    private boolean q;
    private BroadcastReceiver r;
    private String s;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a t;
    private String u;
    private float v;
    private float w;
    private boolean x;
    private boolean y;
    @NonNull
    private final c z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@NonNull com.facebook.react.views.scroll.e eVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void b();

        void c();
    }

    public DrugPoiTabMRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b89fbb560a1e879c29df07902360414", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b89fbb560a1e879c29df07902360414");
            return;
        }
        this.p = 0;
        this.q = false;
        this.s = "";
        this.x = true;
        this.l = VelocityTracker.obtain();
        this.z = new c();
    }

    public static /* synthetic */ int a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, int i) {
        drugPoiTabMRNFragment.p = 0;
        return 0;
    }

    public static /* synthetic */ void a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, drugPoiTabMRNFragment, changeQuickRedirect, false, "30ed0852bccef1f8d5afd3a06cc21c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, drugPoiTabMRNFragment, changeQuickRedirect, false, "30ed0852bccef1f8d5afd3a06cc21c65");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("mrn_entry");
                String optString2 = jSONObject.optString("mrn_component");
                if (TextUtils.equals(optString, drugPoiTabMRNFragment.p()) && TextUtils.equals(optString2, drugPoiTabMRNFragment.q())) {
                    c cVar = drugPoiTabMRNFragment.z;
                    FragmentActivity activity = drugPoiTabMRNFragment.getActivity();
                    Object[] objArr2 = {jSONObject, activity};
                    ChangeQuickRedirect changeQuickRedirect2 = c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c697af970d3f98e9a9fdb462e6295d43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c697af970d3f98e9a9fdb462e6295d43");
                    } else {
                        cVar.c = c.a(jSONObject.optString("end_color"));
                        cVar.b = c.a(jSONObject.optString("start_color"));
                        if (activity == null) {
                            cVar.d = 0;
                        } else {
                            cVar.d = h.a(activity, jSONObject.optInt("linear_height", 0));
                        }
                    }
                    drugPoiTabMRNFragment.s = jSONObject.optString("list_view_react_tag");
                    drugPoiTabMRNFragment.p = 0;
                    drugPoiTabMRNFragment.x();
                    drugPoiTabMRNFragment.a(drugPoiTabMRNFragment.t);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ boolean a(DrugPoiTabMRNFragment drugPoiTabMRNFragment, boolean z) {
        drugPoiTabMRNFragment.y = false;
        return false;
    }

    public static /* synthetic */ int e(DrugPoiTabMRNFragment drugPoiTabMRNFragment) {
        int i = drugPoiTabMRNFragment.p;
        drugPoiTabMRNFragment.p = i + 1;
        return i;
    }

    public static DrugPoiTabMRNFragment c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d0fbf9a1be8c13f640c17202f554e2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugPoiTabMRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d0fbf9a1be8c13f640c17202f554e2c");
        }
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = new DrugPoiTabMRNFragment();
        drugPoiTabMRNFragment.setArguments(SGCommonRNFragment.b(str));
        return drugPoiTabMRNFragment;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d191c59d4ef80b86831b9ccb17937c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d191c59d4ef80b86831b9ccb17937c3");
            return;
        }
        this.A = aVar;
        if (this.A == null || this.k == null) {
            return;
        }
        this.A.a(this.k);
    }

    public final void a(com.sankuai.waimai.store.goods.list.delegate.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d88a255a344af40fdd4b9dcbe763ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d88a255a344af40fdd4b9dcbe763ff0");
            return;
        }
        this.b = eVar;
        this.t = eVar != null ? eVar.d() : new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.u = eVar != null ? this.t.d() : "";
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74d18998cea03c2779c0715c1d87f31d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74d18998cea03c2779c0715c1d87f31d");
            return;
        }
        SCShopCartDelegate y = y();
        if (y != null) {
            y.h();
            boolean d = y.d();
            if (this.q != d) {
                Object[] objArr2 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "655ce6be21aa725c6ddc66e4865d6823", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "655ce6be21aa725c6ddc66e4865d6823");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("hasTip", d);
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(s(), "AdjustContentInset", createMap);
                }
                this.q = d;
            }
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(s(), "RefreshGoodsList", Arguments.createMap());
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IntentFilter intentFilter;
        String str;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c678df0f968f0e001baa2f5b0e29b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c678df0f968f0e001baa2f5b0e29b9");
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6aba1830f57e193b58f196a666ab9d35", RobustBitConfig.DEFAULT_VALUE)) {
                intentFilter = (IntentFilter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6aba1830f57e193b58f196a666ab9d35");
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
                this.r = new BroadcastReceiver() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        Object[] objArr3 = {context, intent};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1279d64ac77ce7dad19cdeb37be6cf5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1279d64ac77ce7dad19cdeb37be6cf5");
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
                            DrugPoiTabMRNFragment.this.s = new JSONObject(intent.getExtras().get("data").toString()).optString("list_view_react_tag");
                            DrugPoiTabMRNFragment.a(DrugPoiTabMRNFragment.this, 0);
                            DrugPoiTabMRNFragment.this.x();
                            DrugPoiTabMRNFragment.this.a(DrugPoiTabMRNFragment.this.t);
                        } catch (Exception e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                };
            }
            activity.registerReceiver(this.r, intentFilter);
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.order.a.e().a(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be4a1bc5ccd5db7ed70d2fcf976dbd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be4a1bc5ccd5db7ed70d2fcf976dbd9");
            return;
        }
        super.onActivityCreated(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c242425b57a58ffdede5de8a3c57d82b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c242425b57a58ffdede5de8a3c57d82b");
        } else {
            b().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca7e391a828c6450c11ec22f21f71ff4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca7e391a828c6450c11ec22f21f71ff4");
                        return;
                    }
                    DrugPoiTabMRNFragment.this.w();
                    DrugPoiTabMRNFragment.this.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4176d267ec60388d85fb4bfe1c65984c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4176d267ec60388d85fb4bfe1c65984c");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2443a8bd135f706038aeeb7f9a8b2e63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2443a8bd135f706038aeeb7f9a8b2e63");
                    } else if (DrugPoiTabMRNFragment.this.p > 3) {
                    } else {
                        DrugPoiTabMRNFragment.this.w();
                        if (DrugPoiTabMRNFragment.this.k == null) {
                            DrugPoiTabMRNFragment.e(DrugPoiTabMRNFragment.this);
                            DrugPoiTabMRNFragment.this.x();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19eb3b060436ec8feed0d555a72104e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19eb3b060436ec8feed0d555a72104e8");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "poihome");
        return hashMap;
    }

    @Subscribe
    public void onMRNLoadShopCartSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdd3ac97af252781711ba9818f3b588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdd3ac97af252781711ba9818f3b588");
        } else if (eVar == null || eVar.a == null) {
        } else {
            if ((t.a(this.u) || com.sankuai.waimai.store.order.a.e().b(this.u, eVar.f)) && ((SGCommonRNFragment) this).i && !isResumed()) {
                this.u = eVar.f;
                this.t = eVar.a;
            }
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.c cVar) {
        SCShopCartDelegate y;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be6e44d8358dfe74d1432e624338a55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be6e44d8358dfe74d1432e624338a55");
        } else if (cVar == null || t.a(cVar.a) || y() == null || getActivity() == null || getActivity().isFinishing() || !com.sankuai.waimai.store.order.a.e().b(this.u, cVar.f) || !((SGCommonRNFragment) this).i || !isResumed()) {
        } else {
            com.sankuai.waimai.store.shopping.cart.f.a().a(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getActivity().getWindow().getDecorView(), cVar.a), getActivity().hashCode(), this.u);
            if (!cVar.b || (y = y()) == null) {
                return;
            }
            y.a(cVar.c);
        }
    }

    @Subscribe
    public void onMRNShowShopCartEvent(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "630318ffa0eebdc3726a862b54ab358e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "630318ffa0eebdc3726a862b54ab358e");
        } else if (iVar == null) {
        } else {
            SCShopCartDelegate y = y();
            if (com.sankuai.waimai.store.order.a.e().b(this.u, iVar.f) && y != null && ((SGCommonRNFragment) this).i && isResumed()) {
                if (this.t != null && this.t.c() && iVar.a) {
                    y.b(true);
                } else {
                    y.b(false);
                }
            }
        }
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02981f2a052fcca18cc9b89b2b89da11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02981f2a052fcca18cc9b89b2b89da11");
        } else if (jVar == null || jVar.b == null || jVar.a == null || y() == null || getActivity() == null || getActivity().isFinishing() || !com.sankuai.waimai.store.order.a.e().b(this.u, jVar.f) || !((SGCommonRNFragment) this).i || !isResumed()) {
        } else {
            if (jVar.b.mrnExtension != null) {
                g.a(getActivity(), jVar.b, jVar.a.b, jVar.b.mrnExtension.getIndex(), jVar.b.mrnExtension.getKeyword(), jVar.b.mrnExtension.getSearchLogId(), jVar.b.mrnExtension.getSearchGlobalId(), 0, jVar.b.mrnExtension.getStid());
                return;
            }
            g.a(getActivity(), jVar.b, jVar.a.b, -1);
        }
    }

    @Subscribe
    public void openContactPoiDialog(com.sankuai.waimai.store.mrn.shopcartbridge.event.b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c76123dd9472b8ff9f011d310b0e185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c76123dd9472b8ff9f011d310b0e185");
        } else if (bVar != null && TextUtils.equals(bVar.a, "contact_poi") && getActivity() != null && !getActivity().isFinishing()) {
            String q = q();
            Object[] objArr2 = {q};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "913d063b0ae90000bc31a86de06518c5", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "913d063b0ae90000bc31a86de06518c5")).booleanValue();
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
            if (this.y) {
                return;
            }
            this.y = true;
            new CustomDialog.a(this.b.k()).a(bVar.b).a((CharSequence[]) arrayList.toArray(new String[com.sankuai.shangou.stone.util.a.a((List) arrayList)]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5dc91445ac52cb6c3c6fce90b1ee8742", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5dc91445ac52cb6c3c6fce90b1ee8742");
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
            }).a(IPaymentManager.NO_ACTION, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5892ba65c1ff22ed170131fca640e5a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5892ba65c1ff22ed170131fca640e5a");
                    } else {
                        DrugPoiTabMRNFragment.a(DrugPoiTabMRNFragment.this, false);
                    }
                }
            }).c();
        }
    }

    public final ReactContext s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f58f4fee6162e0bd15258bd3468ed4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f58f4fee6162e0bd15258bd3468ed4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be436c38aa2d2008fa7cb5bf7e77edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be436c38aa2d2008fa7cb5bf7e77edc");
            return;
        }
        try {
            ReactContext s = s();
            if (s == null || !s.getCatalystInstance().hasNativeModule(SMMRNShopCartModule.class)) {
                return;
            }
            ((SMMRNShopCartModule) s.getCatalystInstance().getNativeModule(SMMRNShopCartModule.class)).updatePoiHelper(aVar);
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
    }

    private SCShopCartDelegate y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbbcc6000e123b00ae75521e017dd7c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCShopCartDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbbcc6000e123b00ae75521e017dd7c0");
        }
        if (this.b != null) {
            return this.b.n();
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a249916a0ce7ca0cb14494730c439b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a249916a0ce7ca0cb14494730c439b52");
            return;
        }
        super.a(z);
        if (z) {
            if (this.k == null) {
                w();
                return;
            }
            return;
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5c8c24cbaded154cf4755cca4fde72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5c8c24cbaded154cf4755cca4fde72");
        } else if (this.b == null || this.b.e() == null) {
        } else {
            this.b.e().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f395a5a3a98941cb49b510a50d02c903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f395a5a3a98941cb49b510a50d02c903");
        } else if (this.b == null || this.b.e() == null) {
        } else {
            this.b.e().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4a8b4227eccc2654146710e25b5eb7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4a8b4227eccc2654146710e25b5eb7")).booleanValue() : this.k.canScrollVertically(1) || this.k.canScrollVertically(-1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bccde39d6e3fc4a77aa80eb0d77613b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bccde39d6e3fc4a77aa80eb0d77613b");
        } else if (this.b == null || t.a(this.s) || !((SGCommonRNFragment) this).i) {
        } else {
            this.k = (com.facebook.react.views.scroll.e) com.sankuai.waimai.store.mrn.shopcartbridge.a.a(b(), this.s);
            if (this.A == null || this.k == null) {
                return;
            }
            this.A.a(this.k);
            u();
            this.k.setBackground(this.z.a());
            this.k.setOnTouchListener(this);
            c_(this.b.e().getScrollY());
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20804c30ab60313a2f49b0c9beb17cd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20804c30ab60313a2f49b0c9beb17cd4");
            return;
        }
        super.onPause();
        t();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb570085482f35a59ec516f42933dc3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb570085482f35a59ec516f42933dc3b");
            return;
        }
        super.onResume();
        u();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8a7cf2b45f2d48e945ab3ab620773b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8a7cf2b45f2d48e945ab3ab620773b");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.order.a.e().b(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.r);
        }
        com.meituan.android.bus.a.a().b(this);
        this.b = null;
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491c7afcfcb09f69f2902de6f9a6472e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491c7afcfcb09f69f2902de6f9a6472e");
        } else if (this.b == null || this.b.e() == null) {
        } else {
            if (this.k != null && v()) {
                if (i >= z()) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8eee91c1770b6d34823b597e7b8571", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8eee91c1770b6d34823b597e7b8571")).booleanValue();
        }
        c cVar = this.z;
        com.facebook.react.views.scroll.e eVar = this.k;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9a6bb71871d6ba1f34a982f141086337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9a6bb71871d6ba1f34a982f141086337");
        } else if (eVar != null) {
            Drawable background = eVar.getBackground();
            if (background instanceof com.sankuai.waimai.store.widgets.drawable.a) {
                ((com.sankuai.waimai.store.widgets.drawable.a) background).f = eVar.getScrollY();
            }
        }
        if (this.m != null) {
            this.m.onTouch(view, motionEvent);
        }
        this.l.addMovement(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.w = motionEvent.getRawY();
                this.v = motionEvent.getRawY();
                break;
            case 1:
                this.l.computeCurrentVelocity(100);
                int i = -((int) this.l.getYVelocity());
                if (Math.abs(i) > 0 && n.a((int) (this.w - motionEvent.getRawY())) == n.a(i)) {
                    float f = i;
                    if (!this.k.dispatchNestedPreFling(0.0f, f) && !this.x) {
                        this.k.dispatchNestedFling(0.0f, f, false);
                    }
                }
                this.v = 0.0f;
                this.l.clear();
                break;
            case 2:
                if (Math.abs(this.v) > 0.0f && this.b != null) {
                    if (this.b.e().getScrollY() < z() && this.v - motionEvent.getRawY() > 0.0f) {
                        this.b.e().scrollBy(0, (int) (this.v - motionEvent.getRawY()));
                    } else if (this.k.getScrollY() == 0 && this.v - motionEvent.getRawY() < 0.0f) {
                        this.b.e().scrollBy(0, (int) (this.v - motionEvent.getRawY()));
                    }
                    if ((this.v - motionEvent.getRawY() >= 0.0f || this.k.getScrollY() <= 0) && (this.b.e().getScrollY() == 0 || this.b.e().getScrollY() < z())) {
                        this.x = true;
                    } else {
                        this.x = false;
                    }
                }
                this.v = motionEvent.getRawY();
                break;
            case 3:
                this.v = 0.0f;
                this.l.clear();
                break;
        }
        return this.x;
    }

    private int z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58187c5f8fcf533eedadca105f04b33b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58187c5f8fcf533eedadca105f04b33b")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.g();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        int d;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2085866b3ac9fdc1f1cb3161780c61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2085866b3ac9fdc1f1cb3161780c61");
                return;
            }
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        static int a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f06ea2f2dd11215e89fb90c7c2d169ad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f06ea2f2dd11215e89fb90c7c2d169ad")).intValue() : com.sankuai.shangou.stone.util.d.a(str, 0);
        }

        Drawable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88399fc45d42be51963976ec4594a05f", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88399fc45d42be51963976ec4594a05f");
            }
            com.sankuai.waimai.store.widgets.drawable.a aVar = new com.sankuai.waimai.store.widgets.drawable.a();
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.e = this.d;
            return aVar;
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f904d78b19c28f47039bbd5aa12351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f904d78b19c28f47039bbd5aa12351");
            return;
        }
        super.f();
        if (this.n != null) {
            this.n.c();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3484ed2e2d0c3ccfba8d24ab0129a15a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3484ed2e2d0c3ccfba8d24ab0129a15a");
            return;
        }
        super.i();
        if (this.n != null) {
            this.n.b();
        }
    }
}
