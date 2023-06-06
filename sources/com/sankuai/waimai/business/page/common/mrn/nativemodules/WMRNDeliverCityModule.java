package com.sankuai.waimai.business.page.common.mrn.nativemodules;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.persistent.sp.a;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.d;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.BubbleInfoBean;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRNDeliverCityModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNDeliverCityManager";
    }

    public WMRNDeliverCityModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7a0197ce0f1e5385e13a9139a72aaee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7a0197ce0f1e5385e13a9139a72aaee");
        }
    }

    @ReactMethod
    public void getFilter(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7e1197fcb3177b6c1a63c9ce1ee8783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7e1197fcb3177b6c1a63c9ce1ee8783");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.common.mrn.nativemodules.WMRNDeliverCityModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    WritableMap writableMap;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "53c47d3b1b60c2acb24914930cb4f3eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "53c47d3b1b60c2acb24914930cb4f3eb");
                        return;
                    }
                    String b = a.b(b.a, "whole_city_filter_bar_data", (String) null);
                    if (TextUtils.isEmpty(b)) {
                        b = b.a.getString(R.string.takeout_widget_filter_bar_default_sort_item_data_json);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("sortBy", new JSONArray(b));
                        jSONObject.put("showRedDot", WMRNDeliverCityModule.this.needShowRedDot());
                    } catch (JSONException unused) {
                    }
                    try {
                        writableMap = g.a(jSONObject);
                    } catch (JSONException unused2) {
                        writableMap = null;
                    }
                    if (promise != null) {
                        promise.resolve(writableMap);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void markRedDotShown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c041a81fab381162670617d3e0e8dff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c041a81fab381162670617d3e0e8dff5");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.common.mrn.nativemodules.WMRNDeliverCityModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bcb8812612f03b62419b6c8f0c621723", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bcb8812612f03b62419b6c8f0c621723");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.a bubbleInfo = WMRNDeliverCityModule.this.getBubbleInfo();
                    if (bubbleInfo == null) {
                        return;
                    }
                    WMRNDeliverCityModule.this.setBubbleHistory(4, "bubble_code_last_tab_item", bubbleInfo.b);
                    com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                }
            });
        }
    }

    @ReactMethod
    public void markFilterItemBubbleShown(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc43acbaeb7b69d6d8b6d21dcdd1b7fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc43acbaeb7b69d6d8b6d21dcdd1b7fc");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.common.mrn.nativemodules.WMRNDeliverCityModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5bad85d69b52eb5ece5b947447a64526", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5bad85d69b52eb5ece5b947447a64526");
                        return;
                    }
                    WMRNDeliverCityModule.this.setBubbleHistory(6, str, i);
                    com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean needShowRedDot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1336a0cca2d37a214587e96764b532b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1336a0cca2d37a214587e96764b532b")).booleanValue();
        }
        com.sankuai.waimai.platform.widget.filterbar.domain.model.a bubbleInfo = getBubbleInfo();
        if (bubbleInfo == null || !bubbleInfo.a) {
            return false;
        }
        BubbleHistory bubbleHistory = getBubbleHistory(bubbleInfo.b);
        return bubbleHistory == null || bubbleHistory.d == null || !bubbleHistory.d.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.platform.widget.filterbar.domain.model.a getBubbleInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46a7245cd0059488a1437bb344bca57c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46a7245cd0059488a1437bb344bca57c");
        }
        ArrayList<d> a = d.a(a.b(getReactApplicationContext(), "filter_bar_group_resource", ""));
        com.sankuai.waimai.platform.widget.filterbar.domain.model.a aVar = null;
        if (a != null && !a.isEmpty()) {
            Iterator<d> it = a.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next != null && next.g == -1) {
                    aVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(next.b, next.c);
                }
            }
        }
        return aVar;
    }

    private BubbleHistory getBubbleHistory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd34ca94641ee4d05b5faab164e7c9ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (BubbleHistory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd34ca94641ee4d05b5faab164e7c9ba");
        }
        String b = a.b(getReactApplicationContext(), "filter_bar_bubble_history_list", "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(b);
            int length = jSONArray.length();
            if (length > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
                for (int i2 = 0; i2 < length; i2++) {
                    BubbleHistory a = aVar.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.a.a(jSONArray.optJSONObject(i2)));
                    if (a != null && a.a() && currentTimeMillis - a.e <= 2592000000L && a.a(4, "bubble_code_last_tab_item", i)) {
                        return a;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubbleHistory(int i, String str, int i2) {
        JSONArray jSONArray;
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8994bb1fabc33ed235c206de378df180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8994bb1fabc33ed235c206de378df180");
            return;
        }
        String b = a.b(getReactApplicationContext(), "filter_bar_bubble_history_list", "");
        int i4 = -1;
        try {
            if (!TextUtils.isEmpty(b)) {
                jSONArray = new JSONArray(b);
            } else {
                jSONArray = new JSONArray();
            }
            int length = jSONArray.length();
            if (length > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
                while (true) {
                    if (i3 < length) {
                        BubbleHistory a = aVar.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.a.a(jSONArray.optJSONObject(i3)));
                        if (a != null && a.a() && currentTimeMillis - a.e <= 2592000000L && a.a(i, str, i2)) {
                            i4 = i3;
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            }
            if (i4 >= 0) {
                jSONArray.remove(i4);
            }
            com.sankuai.waimai.platform.widget.filterbar.implement.model.a aVar2 = new com.sankuai.waimai.platform.widget.filterbar.implement.model.a();
            aVar2.b = i;
            aVar2.c = str;
            aVar2.d = new BubbleInfoBean();
            aVar2.d.isShow = true;
            aVar2.d.version = i2;
            aVar2.e = System.currentTimeMillis();
            jSONArray.put(aVar2.a());
            a.a((Context) getReactApplicationContext(), "filter_bar_bubble_history_list", jSONArray.toString());
        } catch (Exception unused) {
        }
    }
}
