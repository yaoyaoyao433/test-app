package com.sankuai.waimai.platform.mach.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private boolean b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1054a {
        JS_EXECUTOR_REUSE;
        
        public static ChangeQuickRedirect a;

        EnumC1054a() {
            Object[] objArr = {r10, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d7abd5e6b32c6f59235182083e56f1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d7abd5e6b32c6f59235182083e56f1");
            }
        }

        public static EnumC1054a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed80d51fd7592d25ed3af74845e5b007", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1054a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed80d51fd7592d25ed3af74845e5b007") : (EnumC1054a) Enum.valueOf(EnumC1054a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC1054a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b131bc7d08d6ad90fc3a3256f66f8089", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1054a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b131bc7d08d6ad90fc3a3256f66f8089") : (EnumC1054a[]) values().clone();
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c89c9c1b17d1c863b82bf69ea5b56f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c89c9c1b17d1c863b82bf69ea5b56f1");
        } else {
            this.b = true;
        }
    }
}
