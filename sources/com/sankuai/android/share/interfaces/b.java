package com.sankuai.android.share.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        WEIXIN_FRIEDN,
        WEIXIN_CIRCLE,
        QQ,
        RENREN,
        SINA_WEIBO,
        TENCENT_WEIBO,
        EMAIL,
        SMS,
        QZONE,
        MORE_SHARE,
        INVALID,
        COPY,
        PASSWORD;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705d514e50ae9718ebf2966e5081f834", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705d514e50ae9718ebf2966e5081f834");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c534e7f8933e7c7ef3ac1859ffa68d83", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c534e7f8933e7c7ef3ac1859ffa68d83") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e238e7685c3977b0bec249ca693555e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e238e7685c3977b0bec249ca693555e") : (a[]) values().clone();
        }
    }
}
