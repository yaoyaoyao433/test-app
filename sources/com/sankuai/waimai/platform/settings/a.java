package com.sankuai.waimai.platform.settings;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8359badb8cce978115e796e6598f996", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8359badb8cce978115e796e6598f996") : C1080a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1080a {
        private static final a a = new a();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7dc81ae54adab4bab882fbf36f8817b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7dc81ae54adab4bab882fbf36f8817b");
        }
        String sharedValue = StorageUtil.getSharedValue(b.a, "waimai_personal_content");
        return TextUtils.isEmpty(sharedValue) ? "0" : sharedValue;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c12cb66b7e9643ad38df65b53f8439c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c12cb66b7e9643ad38df65b53f8439c3");
        }
        String sharedValue = StorageUtil.getSharedValue(b.a, "waimai_personal_ad");
        return TextUtils.isEmpty(sharedValue) ? "0" : sharedValue;
    }
}
