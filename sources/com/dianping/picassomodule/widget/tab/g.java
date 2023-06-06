package com.dianping.picassomodule.widget.tab;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "", "(Ljava/lang/String;I)V", "USER_CLICK", "USER_SCROLL", "UPDATE_PROPS", "AUTO", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public enum g {
    USER_CLICK,
    USER_SCROLL,
    UPDATE_PROPS,
    AUTO;
    
    public static ChangeQuickRedirect a;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return (g) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab2675b2c75e99c85e342fb3421fcfb0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab2675b2c75e99c85e342fb3421fcfb0") : Enum.valueOf(g.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (g[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33a96e4a678b2c78ea59142bf8309659", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33a96e4a678b2c78ea59142bf8309659") : values().clone());
    }

    g() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b37b05eb06ad6354423b615f4474233", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b37b05eb06ad6354423b615f4474233");
        }
    }
}
