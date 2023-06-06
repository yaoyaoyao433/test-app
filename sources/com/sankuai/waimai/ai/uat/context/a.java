package com.sankuai.waimai.ai.uat.context;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public com.sankuai.waimai.ai.uat.a a;
    public long b;
    public long c;
    public long d;
    public String e;

    public EnumC0684a a() {
        return null;
    }

    public void a(Object obj) {
    }

    public abstract void a(String str, Object obj);

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ai.uat.context.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0684a {
        WMUATContextHome,
        WMUATContextSearch,
        WMUATContextRestaurant,
        WMUATContextFoodDetail,
        WMUATContextGlobal,
        WMUATContextUnknown;
        
        public static ChangeQuickRedirect a;

        EnumC0684a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29362f3e7d34bf3b72eafe4cf4108fff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29362f3e7d34bf3b72eafe4cf4108fff");
            }
        }

        public static EnumC0684a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffcf5c9bca02d22685699f6f83f45bf0", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0684a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffcf5c9bca02d22685699f6f83f45bf0") : (EnumC0684a) Enum.valueOf(EnumC0684a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0684a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c98af439fd7523a148075c109a1ad28", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0684a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c98af439fd7523a148075c109a1ad28") : (EnumC0684a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        WMUATPageHome,
        WMUATPageSearch,
        WMUATPageRestaurant,
        WMUATPageFoodDetail;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f33a2bfb3cfdb7873030b6cbde1733", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f33a2bfb3cfdb7873030b6cbde1733");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aab1f9104c27a79a5c103e918120b49f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aab1f9104c27a79a5c103e918120b49f") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ec21d7939b37417e3a962a1c5088df3", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ec21d7939b37417e3a962a1c5088df3") : (b[]) values().clone();
        }
    }
}
