package com.meituan.android.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final e<com.sankuai.meituan.city.a> b = new e<com.sankuai.meituan.city.a>() { // from class: com.meituan.android.singleton.a.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ com.sankuai.meituan.city.a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d332fa621f6e55508ff4e36507e20478", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.city.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d332fa621f6e55508ff4e36507e20478") : new com.sankuai.meituan.city.a(b.a);
        }
    };

    public static com.sankuai.meituan.city.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aea5580c8407478368dbfbd5314ae0b1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.city.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aea5580c8407478368dbfbd5314ae0b1") : b.b();
    }
}
