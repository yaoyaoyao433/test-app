package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.meituan.serviceloader.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBRouterManager {
    private static String TAG = "KNBRouterManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mInited;
    public List<Page> pages;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class RouterManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static KNBRouterManager instance = new KNBRouterManager();
    }

    public KNBRouterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0237236b08dbdb951ab942b31a560374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0237236b08dbdb951ab942b31a560374");
            return;
        }
        this.mInited = false;
        this.pages = new ArrayList(2);
    }

    public static KNBRouterManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc46c35d8cbaa035e2c0a847f334e87a", RobustBitConfig.DEFAULT_VALUE) ? (KNBRouterManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc46c35d8cbaa035e2c0a847f334e87a") : RouterManagerHolder.instance;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdd0141e72c87ff0c5d1bd3f996f2702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdd0141e72c87ff0c5d1bd3f996f2702");
            return;
        }
        synchronized (KNBRouterManager.class) {
            if (this.mInited) {
                return;
            }
            this.mInited = true;
            try {
                List<KNBRouterInit> a = b.a(KNBRouterInit.class, "");
                if (a != null) {
                    for (KNBRouterInit kNBRouterInit : a) {
                        kNBRouterInit.init(context);
                    }
                }
            } catch (Exception unused) {
                if (KNBWebManager.isDebug()) {
                    Log.e(TAG, "KNBRouterManager init error");
                }
            }
        }
    }

    public void checkInit(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3647a1f6ae3dae0ca59c980f6f237fca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3647a1f6ae3dae0ca59c980f6f237fca");
        } else if (this.mInited) {
        } else {
            init(context);
        }
    }

    public void pushActivity(String str, Activity activity) {
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7d23e09a9e66f1dae0e26b26dbac0e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7d23e09a9e66f1dae0e26b26dbac0e9");
            return;
        }
        this.pages.add(new Page(str, activity));
        handleUrlParams(str, activity);
    }

    public void popActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d26b5bc380cfba81507e8aa979b0c035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d26b5bc380cfba81507e8aa979b0c035");
            return;
        }
        for (int size = this.pages.size() - 1; size >= 0; size--) {
            Page page = this.pages.get(size);
            if (page != null && page.activity != null && page.activity.get() == activity) {
                this.pages.remove(size);
                return;
            }
        }
    }

    private void handleUrlParams(String str, Activity activity) {
        Activity activity2;
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "811dbc7eb5c5b4d105f4d508239a118f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "811dbc7eb5c5b4d105f4d508239a118f");
            return;
        }
        Uri data = activity.getIntent().getData();
        if (data != null && TextUtils.equals("1", data.getQueryParameter("singleton"))) {
            int size = this.pages.size();
            String clearQueryAndFragment = UriUtil.clearQueryAndFragment(str);
            for (int i = size - 1; i >= 0; i--) {
                Page page = this.pages.get(i);
                if (page != null && TextUtils.equals(page.url, clearQueryAndFragment) && page.activity != null && (activity2 = page.activity.get()) != activity) {
                    activity2.finish();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class Page {
        public static ChangeQuickRedirect changeQuickRedirect;
        public WeakReference<Activity> activity;
        public String url;

        public Page(String str, Activity activity) {
            this.url = UriUtil.clearQueryAndFragment(str);
            this.activity = new WeakReference<>(activity);
        }
    }
}
