package com.dianping.agentsdk.framework;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface s {
    int dividerOffset(int i, int i2);

    a dividerShowType(int i);

    Drawable getDivider(int i, int i2);

    boolean showDivider(int i, int i2);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        TOP_END,
        ALL,
        NONE,
        MIDDLE,
        NO_TOP,
        DEFAULT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6631db547280730192144437fc8dc826", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6631db547280730192144437fc8dc826");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf67b476d6f62f436723bde4ecd344e0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf67b476d6f62f436723bde4ecd344e0") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "953e5894bf5c55cb1c6de19b9674c6ff", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "953e5894bf5c55cb1c6de19b9674c6ff") : (a[]) values().clone();
        }
    }
}
