package com.meituan.passport.utils;

import android.support.annotation.RestrictTo;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class aj {
    public static ChangeQuickRedirect a;

    public static void a(Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3274134663199d99bbad7c486edc05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3274134663199d99bbad7c486edc05f");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(obj), str, (Map<String, Object>) null, str2);
        }
    }

    public static void a(Object obj, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {obj, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "185296995265990176b7072926a2ae80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "185296995265990176b7072926a2ae80");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(obj), str, map, str2);
        }
    }

    public static void b(Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "460870da708e784ceb8b82497b81314b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "460870da708e784ceb8b82497b81314b");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel("group").writeModelView(AppUtil.generatePageInfoKey(obj), str, (Map<String, Object>) null, str2);
        }
    }

    public static void b(Object obj, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {obj, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "653b28f8d981b958aa555223607e4cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "653b28f8d981b958aa555223607e4cae");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel("group").writeModelView(AppUtil.generatePageInfoKey(obj), str, map, str2);
        }
    }

    public static void a(Object obj, String str, Map<String, Object> map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c7d5a67f746b5bb16e2cd2d6e5d75be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c7d5a67f746b5bb16e2cd2d6e5d75be");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel("group").writePageView(AppUtil.generatePageInfoKey(obj), str, map);
        }
    }
}
