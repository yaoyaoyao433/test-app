package com.sankuai.waimai.launcher.util.constants;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.util.constants.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0995a {
        IMAGE_LOADER_TIMEOUT;
        
        public static ChangeQuickRedirect a;

        EnumC0995a() {
            Object[] objArr = {r10, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424949f3579c0fb3d4723709aee448b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424949f3579c0fb3d4723709aee448b6");
            }
        }

        public static EnumC0995a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa25d5b0a4406eb52049d755c75c41c", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0995a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa25d5b0a4406eb52049d755c75c41c") : (EnumC0995a) Enum.valueOf(EnumC0995a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0995a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df310a3be5ad7e6b019049903b4d0cbb", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0995a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df310a3be5ad7e6b019049903b4d0cbb") : (EnumC0995a[]) values().clone();
        }
    }
}
