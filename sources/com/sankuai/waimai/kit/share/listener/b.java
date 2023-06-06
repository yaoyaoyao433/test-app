package com.sankuai.waimai.kit.share.listener;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.ShareBean;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {
    void a(ShareBean shareBean, a aVar);

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        NONE(-1),
        COMPLETE(1),
        FAILED(2),
        CANCEL(3);
        
        public static ChangeQuickRedirect a;
        public final int f;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8795f5d7e458d401d07185e4cbe32f69", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8795f5d7e458d401d07185e4cbe32f69") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b7e146726109cfc0b32a43630498dcd", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b7e146726109cfc0b32a43630498dcd") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8241164e8a3f509fa26bc766ebbb2870", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8241164e8a3f509fa26bc766ebbb2870");
            } else {
                this.f = i;
            }
        }
    }
}
