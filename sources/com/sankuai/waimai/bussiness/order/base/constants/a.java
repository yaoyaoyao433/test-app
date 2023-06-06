package com.sankuai.waimai.bussiness.order.base.constants;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static final String a = com.sankuai.waimai.foundation.router.interfaces.b.d + "/crossorder";

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.base.constants.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0883a {
        public static String a = "b_d526k4n8";
        public static String b = "b_gesje92i";
        public static String c = "b_iv6nv7jf";
        public static String d = "b_qhy8hkuu";
        public static String e = "b_3bt2p6zd";
        public static String f = "b_ptbwzmzk";
        public static String g = "b_fn6ljsn1";
        public static String h = "b_j29vgr7p";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.bussiness.order.base.constants.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public enum EnumC0884a {
            PUSH_NOTIFY_DAYS,
            PUSH_NOTIFY_TIMES,
            PUSH_NOTIFY_OPEN_TIMESTAMP,
            PUSH_NOFIFY_OPEN_FREQUENCY;
            
            public static ChangeQuickRedirect a;

            EnumC0884a() {
                Object[] objArr = {r10, Integer.valueOf(r11)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdb4f237a3c8be31552c8d364018724", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdb4f237a3c8be31552c8d364018724");
                }
            }

            public static EnumC0884a valueOf(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23a7f93434843613fd9b2ffd1536c053", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0884a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23a7f93434843613fd9b2ffd1536c053") : (EnumC0884a) Enum.valueOf(EnumC0884a.class, str);
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static EnumC0884a[] valuesCustom() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "330fe8cfc6647bb4efb824e34418154b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0884a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "330fe8cfc6647bb4efb824e34418154b") : (EnumC0884a[]) values().clone();
            }
        }
    }
}
