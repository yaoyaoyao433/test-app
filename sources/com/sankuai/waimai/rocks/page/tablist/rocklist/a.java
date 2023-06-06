package com.sankuai.waimai.rocks.page.tablist.rocklist;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    b a(Context context, EnumC1131a enumC1131a);

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.rocks.page.tablist.rocklist.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1131a {
        GLOBAL,
        AREA,
        TAB_PAGE;
        
        public static ChangeQuickRedirect a;

        EnumC1131a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879235c2b248f44c3955f44a404528f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879235c2b248f44c3955f44a404528f3");
            }
        }

        public static EnumC1131a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68c919c6036c61c942d46b7f48eb4f58", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1131a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68c919c6036c61c942d46b7f48eb4f58") : (EnumC1131a) Enum.valueOf(EnumC1131a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC1131a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b62acb12ed021bafb2c19627c62b969", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1131a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b62acb12ed021bafb2c19627c62b969") : (EnumC1131a[]) values().clone();
        }
    }
}
