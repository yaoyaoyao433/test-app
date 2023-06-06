package com.sankuai.waimai.alita.platform.privacy;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "PersonalRecommendSettingDP";

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "324a366fcbb1beddc42669b1eed5ef04", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "324a366fcbb1beddc42669b1eed5ef04") : C0722a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.platform.privacy.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0722a {
        private static final a a = new a();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9241f39e2273256686d040ce36596d56", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9241f39e2273256686d040ce36596d56");
        }
        String sharedValue = StorageUtil.getSharedValue(com.meituan.android.singleton.b.a, "dianping.user.privacyStatus.32");
        return (TextUtils.equals(sharedValue, "0") || TextUtils.equals(sharedValue, "1")) ? sharedValue : "2";
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbffe15701872cf4ab0698873e44386f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbffe15701872cf4ab0698873e44386f");
        }
        String sharedValue = StorageUtil.getSharedValue(com.meituan.android.singleton.b.a, "dianping.user.privacyStatus.31");
        return (TextUtils.equals(sharedValue, "0") || TextUtils.equals(sharedValue, "1")) ? sharedValue : "2";
    }
}
