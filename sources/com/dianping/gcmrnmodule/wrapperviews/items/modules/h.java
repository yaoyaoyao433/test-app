package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/PageAppearanceType;", "", "(Ljava/lang/String;I)V", "None", "Appear", "Disappear", "ActiveChanged", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public enum h {
    None,
    Appear,
    Disappear,
    ActiveChanged;
    
    public static ChangeQuickRedirect a;

    public static h valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return (h) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09c3c5e2a8172254ff21e78ad03af357", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09c3c5e2a8172254ff21e78ad03af357") : Enum.valueOf(h.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (h[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91c52d9eb44682dad1256b7118abd194", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91c52d9eb44682dad1256b7118abd194") : values().clone());
    }

    h() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0c2be0caf25fdb89fcab880531a45c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0c2be0caf25fdb89fcab880531a45c");
        }
    }
}
