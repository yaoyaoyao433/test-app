package com.sankuai.waimai.store.mrn.marketing;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.c;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.manager.marketing.a;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.b;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.StoreError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
@ReactModule(name = SGMarketingModule.MODULE_NAME)
/* loaded from: classes5.dex */
public class SGMarketingModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String EVENT_NAME_APPEAR = "sm_mrn_page_did_appear_event";
    private static final String EVENT_NAME_DISAPPEAR = "sm_mrn_page_did_disappear_event";
    private static final String EVENT_NAME_INIT = "sm_mrn_page_init_event";
    private static final String EVENT_NAME_REQUEST_FAILED = "sm_mrn_page_main_request_fail_event";
    private static final String EVENT_NAME_REQUEST_START = "sm_mrn_page_main_request_start_event";
    private static final String EVENT_NAME_REQUEST_SUCCESS = "sm_mrn_page_main_request_success_event";
    private static final String EVENT_NAME_RESET = "sm_mrn_page_main_request_reset_event";
    public static final String MODULE_NAME = "SMMRNPageLifeCycle";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, a> sMarketingMap = new HashMap();
    private static final Map<String, Boolean> sMarketingRequestRecord = new HashMap();

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public SGMarketingModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53183b1f7f8a4fad9f70834db8b30541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53183b1f7f8a4fad9f70834db8b30541");
        } else {
            getReactApplicationContext().addLifecycleEventListener(this);
        }
    }

    @ReactMethod
    public void mrnPageLifeCycleChangeEvent(final String str, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c513f6197ac362b31dc42e933a7409f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c513f6197ac362b31dc42e933a7409f");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.marketing.SGMarketingModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    k a2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c84731232a4739134831106cd0b24b92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c84731232a4739134831106cd0b24b92");
                        return;
                    }
                    ae.a(SGMarketingModule.MODULE_NAME, SGMarketingModule.this + ": mrnPageLifeCycleChangeEvent start, eventName = " + str);
                    Activity currentActivity = SGMarketingModule.this.getCurrentActivity();
                    if (SGMarketingModule.this.isActivityInvalid(currentActivity, promise) || (a2 = r.a(SGMarketingModule.this.getReactApplicationContext())) == null) {
                        return;
                    }
                    String str2 = a2.l;
                    if (TextUtils.isEmpty(str2)) {
                        d.a(SGMarketingModule.MODULE_NAME, promise, new Exception("entryName is empty"));
                        return;
                    }
                    ae.a(SGMarketingModule.MODULE_NAME, "entryName = " + str2);
                    a aVar = (a) SGMarketingModule.sMarketingMap.get(a2.toString());
                    if (SGMarketingModule.EVENT_NAME_INIT.equals(str)) {
                        if (aVar != null) {
                            d.a(SGMarketingModule.MODULE_NAME, promise, new Exception("marketingTemplateController is exist"));
                            return;
                        }
                        List list = (List) j.h().a(SCConfigPath.PAGE_MRN_MARKETING_REQUEST, new TypeToken<List<MarketingWhiteListItem>>() { // from class: com.sankuai.waimai.store.mrn.marketing.SGMarketingModule.1.1
                        }.getType());
                        if (com.sankuai.shangou.stone.util.a.b(list)) {
                            d.a(SGMarketingModule.MODULE_NAME, promise, new Exception("white list is empty"));
                            return;
                        }
                        int i = -1;
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MarketingWhiteListItem marketingWhiteListItem = (MarketingWhiteListItem) it.next();
                            if (marketingWhiteListItem != null && str2.equals(marketingWhiteListItem.entryName)) {
                                i = marketingWhiteListItem.pageType;
                                break;
                            }
                        }
                        if (i > 0) {
                            View currentPageRootView = SGMarketingModule.this.getCurrentPageRootView(SGMarketingModule.this.getCurrentActivity());
                            if (currentPageRootView == null) {
                                d.a(SGMarketingModule.MODULE_NAME, promise, new Exception("rootView is null"));
                                return;
                            }
                            String a3 = r.a(SGMarketingModule.this.getReactApplicationContext()) != null ? b.a().a(r.a(SGMarketingModule.this.getReactApplicationContext()).l) : null;
                            if (TextUtils.isEmpty(a3)) {
                                ah.a(StoreError.MrnError, "cid is null");
                            }
                            a aVar2 = new a(currentActivity, currentPageRootView, i);
                            aVar2.l = a3;
                            SGMarketingModule.sMarketingMap.put(a2.toString(), aVar2);
                        } else {
                            Promise promise2 = promise;
                            d.a(SGMarketingModule.MODULE_NAME, promise2, new Exception(a2.l + " is not in whiteList or pageType error"));
                            return;
                        }
                    } else if (aVar == null) {
                        d.a(SGMarketingModule.MODULE_NAME, promise, new Exception("marketingTemplateController is null"));
                        return;
                    } else if (SGMarketingModule.EVENT_NAME_APPEAR.equals(str)) {
                        aVar.h();
                    } else if (SGMarketingModule.EVENT_NAME_DISAPPEAR.equals(str)) {
                        aVar.i();
                    } else if (SGMarketingModule.EVENT_NAME_REQUEST_START.equals(str)) {
                        if (!SGMarketingModule.this.isMarketingRequested(a2.toString())) {
                            HashMap<String, Object> hashMap = readableMap != null ? readableMap.toHashMap() : null;
                            if (hashMap == null) {
                                hashMap = new HashMap<>();
                            }
                            if (hashMap.get("data") instanceof Map) {
                                hashMap.putAll((Map) hashMap.get("data"));
                            }
                            hashMap.put("page_type", Integer.valueOf(aVar.k));
                            ae.a(SGMarketingModule.MODULE_NAME, "params = " + i.a(hashMap));
                            aVar.a(hashMap, currentActivity.toString());
                            SGMarketingModule.sMarketingRequestRecord.put(a2.toString(), Boolean.TRUE);
                        }
                    } else if (SGMarketingModule.EVENT_NAME_RESET.equals(str)) {
                        aVar.j();
                    } else if (SGMarketingModule.EVENT_NAME_REQUEST_SUCCESS.equals(str)) {
                        aVar.a(true);
                    } else if (SGMarketingModule.EVENT_NAME_REQUEST_FAILED.equals(str)) {
                        aVar.a(false);
                    }
                    ae.a(SGMarketingModule.MODULE_NAME, "mrnPageLifeCycleChangeEvent end");
                    d.a(promise);
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMarketingRequested(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6622e0f0413c3bcbe0cd7cdbe87608bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6622e0f0413c3bcbe0cd7cdbe87608bc")).booleanValue();
        }
        Boolean bool = sMarketingRequestRecord.get(str);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityInvalid(Activity activity, Promise promise) {
        Object[] objArr = {activity, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "108a2b77f4cad605c1510c7ecae2e67d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "108a2b77f4cad605c1510c7ecae2e67d")).booleanValue();
        }
        if (com.sankuai.waimai.store.util.b.a(activity)) {
            d.a(promise, new Exception("current activity is null"));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getCurrentPageRootView(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35389c8e1a1a3e91383262fe8c38ada3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35389c8e1a1a3e91383262fe8c38ada3");
        }
        if (com.sankuai.waimai.store.util.b.a(activity)) {
            return null;
        }
        if (activity instanceof MRNBaseActivity) {
            return activity.findViewById(16908290);
        }
        if (activity instanceof FragmentActivity) {
            List<Fragment> fragments = ((FragmentActivity) activity).getSupportFragmentManager().getFragments();
            if (com.sankuai.shangou.stone.util.a.b(fragments)) {
                return null;
            }
            for (Fragment fragment : fragments) {
                if ((fragment instanceof MRNBaseFragment) && fragment.isVisible()) {
                    return fragment.getView();
                }
            }
        }
        return null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea3d32dc3f2f55f456692dc3fd1eb8f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea3d32dc3f2f55f456692dc3fd1eb8f1");
            return;
        }
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b82154db5e6846a9e4ae1831fea48aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b82154db5e6846a9e4ae1831fea48aa");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        c.a(currentActivity.toString());
        k a = r.a(getReactApplicationContext());
        if (a == null) {
            return;
        }
        sMarketingRequestRecord.remove(a.toString());
        a remove = sMarketingMap.remove(a.toString());
        if (remove != null) {
            remove.j();
        }
    }
}
