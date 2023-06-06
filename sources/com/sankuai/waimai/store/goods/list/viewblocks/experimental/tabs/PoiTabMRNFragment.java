package com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.b;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.c;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiTabMRNFragment extends SGCommonRNFragment implements View.OnTouchListener, PrioritySmoothNestedScrollView.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    public VelocityTracker b;
    private int k;
    private boolean l;
    private e m;
    private BroadcastReceiver n;
    private IntentFilter o;
    private com.facebook.react.views.scroll.e p;
    private String q;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a r;
    private String s;
    private float t;
    private float u;
    private boolean v;
    private boolean w;
    private a x;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@NonNull com.facebook.react.views.scroll.e eVar);
    }

    public PoiTabMRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8116bffd47592ccbf98fcc1e873ce609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8116bffd47592ccbf98fcc1e873ce609");
            return;
        }
        this.k = 0;
        this.l = false;
        this.q = "";
        this.v = true;
        this.b = VelocityTracker.obtain();
    }

    public static /* synthetic */ int a(PoiTabMRNFragment poiTabMRNFragment, int i) {
        poiTabMRNFragment.k = 0;
        return 0;
    }

    public static /* synthetic */ void a(PoiTabMRNFragment poiTabMRNFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, poiTabMRNFragment, changeQuickRedirect, false, "9654fd42c3d083d726fcedccdfba7973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiTabMRNFragment, changeQuickRedirect, false, "9654fd42c3d083d726fcedccdfba7973");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "213bef2ea33f442ecc5cea2e1a5c1fb0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "213bef2ea33f442ecc5cea2e1a5c1fb0");
                    } else if (PoiTabMRNFragment.this.k > 3) {
                    } else {
                        PoiTabMRNFragment.this.s();
                        if (PoiTabMRNFragment.this.p == null) {
                            PoiTabMRNFragment.e(PoiTabMRNFragment.this);
                            PoiTabMRNFragment.a(PoiTabMRNFragment.this);
                        }
                    }
                }
            }, 500, "");
        }
    }

    public static /* synthetic */ void a(PoiTabMRNFragment poiTabMRNFragment, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, poiTabMRNFragment, changeQuickRedirect, false, "caf52b887ed7705327153b07e7ac364a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiTabMRNFragment, changeQuickRedirect, false, "caf52b887ed7705327153b07e7ac364a");
            return;
        }
        try {
            ReactContext t = poiTabMRNFragment.t();
            if (t == null || !t.getCatalystInstance().hasNativeModule(SMMRNShopCartModule.class)) {
                return;
            }
            ((SMMRNShopCartModule) t.getCatalystInstance().getNativeModule(SMMRNShopCartModule.class)).updatePoiHelper(aVar);
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
    }

    public static /* synthetic */ boolean a(PoiTabMRNFragment poiTabMRNFragment, boolean z) {
        poiTabMRNFragment.w = false;
        return false;
    }

    public static /* synthetic */ int e(PoiTabMRNFragment poiTabMRNFragment) {
        int i = poiTabMRNFragment.k;
        poiTabMRNFragment.k = i + 1;
        return i;
    }

    public static PoiTabMRNFragment a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b20f603d8dd4ab83e6097b1245cd86c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiTabMRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b20f603d8dd4ab83e6097b1245cd86c");
        }
        Bundle bundle = new Bundle();
        PoiTabMRNFragment poiTabMRNFragment = new PoiTabMRNFragment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        poiTabMRNFragment.setArguments(bundle);
        return poiTabMRNFragment;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c29e27b027b53e121dc9afb934d8d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c29e27b027b53e121dc9afb934d8d4");
            return;
        }
        this.x = aVar;
        if (this.x == null || this.p == null) {
            return;
        }
        this.x.a(this.p);
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daec159e21b04d2fd38bb330713a1eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daec159e21b04d2fd38bb330713a1eae");
            return;
        }
        this.m = eVar;
        this.r = eVar != null ? eVar.d() : new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.s = eVar != null ? String.valueOf(this.r.d()) : "";
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c326a1c2ea186e4107939d540b3164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c326a1c2ea186e4107939d540b3164");
            return;
        }
        SCShopCartDelegate u = u();
        if (u != null) {
            u.h();
            boolean d = u.d();
            if (this.l != d) {
                Object[] objArr2 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84ca679ca78fe36d75055f8796d9ece5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84ca679ca78fe36d75055f8796d9ece5");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("hasTip", d);
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(t(), "AdjustContentInset", createMap);
                }
                this.l = d;
            }
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(t(), "RefreshGoodsList", Arguments.createMap());
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0a687e745b51aeabb16b7168778f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0a687e745b51aeabb16b7168778f15");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c07696e02c2de18ac59c67a531f8e7a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c07696e02c2de18ac59c67a531f8e7a8");
        } else {
            this.o = new IntentFilter();
            if (TextUtils.equals(p(), "flashbuy-store-info")) {
                str = TextUtils.equals(q(), "flashbuy-store-comments") ? "supermarket:poi_comment_page_did_mount" : "supermarket:poi_info_page_did_mount";
            } else {
                str = "supermarket:membercard_detail_page_did_mount";
            }
            this.o.addAction(str);
            this.n = new BroadcastReceiver() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr3 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51e327b505cef2cf57fd101e199786f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51e327b505cef2cf57fd101e199786f2");
                        return;
                    }
                    try {
                        PoiTabMRNFragment.this.q = new JSONObject(intent.getExtras().get("data").toString()).optString("list_view_react_tag");
                        PoiTabMRNFragment.a(PoiTabMRNFragment.this, 0);
                        PoiTabMRNFragment.a(PoiTabMRNFragment.this);
                        PoiTabMRNFragment.a(PoiTabMRNFragment.this, PoiTabMRNFragment.this.r);
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
            };
        }
        getActivity().registerReceiver(this.n, this.o);
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.order.a.e().a(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3b7be01ecd27b2e38858daf3343b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3b7be01ecd27b2e38858daf3343b91");
            return;
        }
        super.onActivityCreated(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33c9f4703a1bddc1dc01dd4b57fc77da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33c9f4703a1bddc1dc01dd4b57fc77da");
        } else {
            b().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b726035cbe7395698e502e423252317a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b726035cbe7395698e502e423252317a");
                        return;
                    }
                    PoiTabMRNFragment.this.s();
                    PoiTabMRNFragment.this.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment
    public final Map<String, String> r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdd5fe630fb1522334102f8fb1c59e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdd5fe630fb1522334102f8fb1c59e7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "poihome");
        return hashMap;
    }

    @Subscribe
    public void onMRNLoadShopCartSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a417826711f841c3591f1fb2e1a499a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a417826711f841c3591f1fb2e1a499a");
        } else if (eVar == null || eVar.a == null) {
        } else {
            if ((t.a(this.s) || com.sankuai.waimai.store.order.a.e().b(this.s, eVar.f)) && ((SGCommonRNFragment) this).i) {
                this.s = eVar.f;
                this.r = eVar.a;
            }
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b342c7656ee50e1544740740c0825567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b342c7656ee50e1544740740c0825567");
        } else if (cVar == null || t.a(cVar.a) || u() == null || getActivity() == null || getActivity().isFinishing() || !com.sankuai.waimai.store.order.a.e().b(this.s, cVar.f) || !((SGCommonRNFragment) this).i) {
        } else {
            f.a().a(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getActivity().getWindow().getDecorView(), cVar.a), getActivity().hashCode(), this.s);
        }
    }

    @Subscribe
    public void onMRNShowShopCartEvent(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a0ea4b0982385431b481677c7c3ea7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a0ea4b0982385431b481677c7c3ea7a");
        } else if (iVar == null) {
        } else {
            SCShopCartDelegate u = u();
            if (com.sankuai.waimai.store.order.a.e().b(this.s, iVar.f) && u != null && ((SGCommonRNFragment) this).i) {
                if (this.r != null && this.r.c() && iVar.a) {
                    u.b(true);
                } else {
                    u.b(false);
                }
            }
        }
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de42a17104851e8952e21e1918963d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de42a17104851e8952e21e1918963d0");
        } else if (jVar == null || jVar.b == null || jVar.a == null || u() == null || getActivity() == null || getActivity().isFinishing() || jVar.c != getActivity().hashCode() || !com.sankuai.waimai.store.order.a.e().b(this.s, jVar.f) || !((SGCommonRNFragment) this).i) {
        } else {
            g.a(getActivity(), jVar.b, jVar.a.b, -1);
        }
    }

    @Subscribe
    public void openContactPoiDialog(b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838858e4577879f9ab9ab4c96d458ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838858e4577879f9ab9ab4c96d458ea0");
        } else if (bVar != null && TextUtils.equals(bVar.a, "contact_poi") && getActivity() != null && !getActivity().isFinishing()) {
            String q = q();
            Object[] objArr2 = {q};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b45e15a4bf799261138e7a6bc9a9751", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b45e15a4bf799261138e7a6bc9a9751")).booleanValue();
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
            if (this.w) {
                return;
            }
            this.w = true;
            new CustomDialog.a(this.m.k()).a(bVar.b).a((CharSequence[]) arrayList.toArray(new String[com.sankuai.shangou.stone.util.a.a((List) arrayList)]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5faa2b76828c36fee2f21554e4d3c395", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5faa2b76828c36fee2f21554e4d3c395");
                        return;
                    }
                    try {
                        String str2 = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i2);
                        String substring = str2 == null ? null : str2.substring(str2.lastIndexOf(58));
                        if (!TextUtils.isEmpty(substring)) {
                            z.a(PoiTabMRNFragment.this.m.k(), substring);
                        } else {
                            dialogInterface.dismiss();
                        }
                    } catch (Exception e) {
                        PoiTabMRNFragment.a(PoiTabMRNFragment.this, false);
                        dialogInterface.dismiss();
                        com.sankuai.waimai.store.base.log.a.a(e.getMessage());
                    }
                }
            }).a(IPaymentManager.NO_ACTION, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f885a2da2454285f73e172ccf609d9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f885a2da2454285f73e172ccf609d9f");
                    } else {
                        PoiTabMRNFragment.a(PoiTabMRNFragment.this, false);
                    }
                }
            }).c();
        }
    }

    private ReactContext t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b7a5a23d3cd3793804bbf4351cad48", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b7a5a23d3cd3793804bbf4351cad48");
        }
        if (l() != null) {
            return l().getCurrentReactContext();
        }
        return null;
    }

    private SCShopCartDelegate u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd20aa4caaba658838b4170ad40d3eb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCShopCartDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd20aa4caaba658838b4170ad40d3eb1");
        }
        if (this.m != null) {
            return this.m.n();
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564f37ec1a18e10d8a7d3bc3c3c60aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564f37ec1a18e10d8a7d3bc3c3c60aaa");
            return;
        }
        super.a(z);
        if (z) {
            if (this.p == null) {
                s();
                return;
            } else {
                w();
                return;
            }
        }
        v();
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54022696b69c4ddafa7806b6509ccd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54022696b69c4ddafa7806b6509ccd7");
        } else if (this.m == null || this.m.e() == null) {
        } else {
            this.m.e().b(this);
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e793abd365e7d8a063ef16aad67ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e793abd365e7d8a063ef16aad67ba3");
        } else if (this.m == null || this.m.e() == null) {
        } else {
            this.m.e().a(this);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ef324588425ea72b8fd54d27b25300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ef324588425ea72b8fd54d27b25300");
        } else if (z) {
            if (this.p == null) {
                s();
            } else {
                w();
            }
            x();
        } else {
            v();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700687daacafb1c5e4d0bb8a5ab139be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700687daacafb1c5e4d0bb8a5ab139be");
        } else if (this.p == null || this.m == null || this.m.e() == null) {
        } else {
            this.m.e().setForbidScroll(this.p.getScrollY() > 0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9dc2c7606d5a130f24cbacd7e35fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9dc2c7606d5a130f24cbacd7e35fff");
        } else if (this.m == null || t.a(this.q) || !((SGCommonRNFragment) this).i) {
        } else {
            this.p = (com.facebook.react.views.scroll.e) com.sankuai.waimai.store.mrn.shopcartbridge.a.a(b(), this.q);
            if (this.x == null || this.p == null) {
                return;
            }
            this.x.a(this.p);
            w();
            this.p.setOnTouchListener(this);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34272085fee81ebb4523356dcdc4e153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34272085fee81ebb4523356dcdc4e153");
            return;
        }
        super.onPause();
        v();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63bd1dffd205ec4a074c4e07e99dbb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63bd1dffd205ec4a074c4e07e99dbb9");
            return;
        }
        super.onResume();
        w();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80d71f56c29567e2e38f09bfab5a004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80d71f56c29567e2e38f09bfab5a004");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.order.a.e().b(this);
        getActivity().unregisterReceiver(this.n);
        com.meituan.android.bus.a.a().b(this);
        this.m = null;
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89547c1f79ace8e6a8df5eee895958d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89547c1f79ace8e6a8df5eee895958d6");
        } else if (this.m == null || this.m.e() == null) {
        } else {
            if (this.p != null && this.p.canScrollVertically(1)) {
                if (b(i)) {
                    this.m.e().setForbidScroll(true);
                    return;
                } else {
                    this.m.e().setForbidScroll(false);
                    return;
                }
            }
            this.m.e().setForbidScroll(false);
        }
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17de5a7e74e1d0dde6e630a7f91a64cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17de5a7e74e1d0dde6e630a7f91a64cd")).booleanValue() : i >= y();
    }

    private int y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec013b4c3cce4d2bbdf96c952a6b521", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec013b4c3cce4d2bbdf96c952a6b521")).intValue();
        }
        if (this.m == null) {
            return 0;
        }
        return this.m.g();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3f59a009a6dd281bcb8e30daa76a88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3f59a009a6dd281bcb8e30daa76a88")).booleanValue();
        }
        this.b.addMovement(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.u = motionEvent.getRawY();
                this.t = motionEvent.getRawY();
                break;
            case 1:
                this.b.computeCurrentVelocity(100);
                int i = -((int) this.b.getYVelocity());
                if (Math.abs(i) > 0 && n.a((int) (this.u - motionEvent.getRawY())) == n.a(i)) {
                    float f = i;
                    if (!this.p.dispatchNestedPreFling(0.0f, f) && !this.v) {
                        this.p.dispatchNestedFling(0.0f, f, false);
                    }
                }
                this.t = 0.0f;
                this.b.clear();
                break;
            case 2:
                if (Math.abs(this.t) > 0.0f && this.m != null) {
                    if (!b(this.m.e().getScrollY()) && this.t - motionEvent.getRawY() > 0.0f) {
                        this.m.e().scrollBy(0, (int) (this.t - motionEvent.getRawY()));
                    } else if (this.p.getScrollY() == 0 && this.t - motionEvent.getRawY() < 0.0f) {
                        this.m.e().scrollBy(0, (int) (this.t - motionEvent.getRawY()));
                    }
                    if ((this.t - motionEvent.getRawY() >= 0.0f || this.p.getScrollY() <= 0) && (this.m.e().getScrollY() == 0 || !b(this.m.e().getScrollY()))) {
                        this.v = true;
                    } else {
                        this.v = false;
                    }
                }
                this.t = motionEvent.getRawY();
                break;
            case 3:
                this.t = 0.0f;
                this.b.clear();
                break;
        }
        return this.v;
    }
}
