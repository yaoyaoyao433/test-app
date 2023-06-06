package com.sankuai.waimai.store.drug.home.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b99dd087f15267b9d70bee02c3a60d85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b99dd087f15267b9d70bee02c3a60d85")).booleanValue() : !TextUtils.isEmpty(str) && ("drug-homepage-o2o-pharmacy-feed".equals(str) || "drug-homepage-o2o-pharmacy-feed-new".equals(str));
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0723a01b4cbe6bef494a2fa0183d3655", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0723a01b4cbe6bef494a2fa0183d3655")).booleanValue() : !TextUtils.isEmpty(str) && ("drug-homepage-o2o-pharmacy-module".equals(str) || "drug-homepage-o2o-pharmacy-module-new1".equals(str) || "drug-homepage-o2o-pharmacy-module-new2".equals(str) || "drug-homepage-o2o-pharmacy-module-new3".equals(str));
    }

    public static void a(@NonNull Activity activity, @NonNull Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8c9788d26fe1776fcfaee1f6dc0946c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8c9788d26fe1776fcfaee1f6dc0946c");
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null || map.size() == 0) {
            return;
        }
        Uri data = intent.getData();
        Uri.Builder builder = data == null ? new Uri.Builder() : data.buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null) {
                builder.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        intent.setData(builder.build());
    }

    public static Map<String, Object> a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58561a96a9ad46689ff0173bb88c8308", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58561a96a9ad46689ff0173bb88c8308");
        }
        HashMap hashMap = new HashMap();
        try {
            Uri data = activity.getIntent().getData();
            if (data != null) {
                for (String str : data.getQueryParameterNames()) {
                    hashMap.put(str, data.getQueryParameter(str));
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return hashMap;
    }
}
