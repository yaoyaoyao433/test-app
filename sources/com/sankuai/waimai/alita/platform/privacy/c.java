package com.sankuai.waimai.alita.platform.privacy;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static String b = "PersonalRecommendSettingWM";

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1d1bdebd2bd360b028fd005de776641", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1d1bdebd2bd360b028fd005de776641") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final c a = new c();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f4a56e3283abdb087ceaf518f596a6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f4a56e3283abdb087ceaf518f596a6a");
        }
        String sharedValue = StorageUtil.getSharedValue(com.meituan.android.singleton.b.a, "waimai_personal_content");
        return TextUtils.isEmpty(sharedValue) ? "0" : sharedValue;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be7e9016c58ef8f6d2d5cb678340f2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be7e9016c58ef8f6d2d5cb678340f2b");
        }
        String sharedValue = StorageUtil.getSharedValue(com.meituan.android.singleton.b.a, "waimai_personal_ad");
        return TextUtils.isEmpty(sharedValue) ? "0" : sharedValue;
    }
}
