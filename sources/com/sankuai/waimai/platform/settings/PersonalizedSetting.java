package com.sankuai.waimai.platform.settings;

import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PersonalizedSetting {
    public static ChangeQuickRedirect a = null;
    private static final String b = "PersonalizedSetting";
    private static PersonalizedSetting c;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface PersonalizedStatus {
    }

    public static PersonalizedSetting a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd381c4e987124fe2b131179bf500a9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PersonalizedSetting) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd381c4e987124fe2b131179bf500a9b");
        }
        if (c == null) {
            synchronized (PersonalizedSetting.class) {
                if (c == null) {
                    c = new PersonalizedSetting();
                }
            }
        }
        return c;
    }

    public long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8eedbddda6559e01245c3d96ae5eef", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8eedbddda6559e01245c3d96ae5eef")).longValue() : System.currentTimeMillis();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46bd5e371d646cab4a0ce11dedcff1e0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46bd5e371d646cab4a0ce11dedcff1e0")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, "waimai_key_personalized_enabled", true);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56ad8efb34c6dd28668b854042d09a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56ad8efb34c6dd28668b854042d09a2");
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "waimai_key_personlized_data_cleared", true);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "waimai_key_personlized_data_cleared_time", d());
    }
}
