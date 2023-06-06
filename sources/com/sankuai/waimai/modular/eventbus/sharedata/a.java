package com.sankuai.waimai.modular.eventbus.sharedata;

import android.arch.lifecycle.q;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static <T extends SharedData> T a(Context context, Class<T> cls) {
        Object[] objArr = {context, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91a97d310a9739a6b90d35cdf07d50c2", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91a97d310a9739a6b90d35cdf07d50c2") : (T) a(a(context), (Class<SharedData>) cls);
    }

    public static <T extends SharedData> T a(Fragment fragment, Class<T> cls) {
        Object[] objArr = {fragment, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f65c83ccd655d3923019562aca90d527", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f65c83ccd655d3923019562aca90d527") : (T) a(a(fragment.getContext()), (Class<SharedData>) cls);
    }

    public static <T extends SharedData> T a(FragmentActivity fragmentActivity, Class<T> cls) {
        Object[] objArr = {fragmentActivity, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0278c188fb7abc2301ae4dba87b7f301", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0278c188fb7abc2301ae4dba87b7f301") : (T) q.a(fragmentActivity).a(cls);
    }

    private static FragmentActivity a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c61597391f49b2598bc91a48e10dd8be", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentActivity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c61597391f49b2598bc91a48e10dd8be");
        }
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        throw new C1029a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.modular.eventbus.sharedata.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1029a extends RuntimeException {
        public C1029a() {
            super("context should be an instance of FragmentActivity!");
        }
    }
}
