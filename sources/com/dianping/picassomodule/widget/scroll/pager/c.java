package com.dianping.picassomodule.widget.scroll.pager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/pager/PageSelectReason;", "", "(Ljava/lang/String;I)V", "USER_SWIPE", "INITIAL", "UPDATE_PROPS", "AUTO_PLAY", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public enum c {
    USER_SWIPE,
    INITIAL,
    UPDATE_PROPS,
    AUTO_PLAY;
    
    public static ChangeQuickRedirect a;

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return (c) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95bc7ff69ed6027b5efe098fb3c468d1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95bc7ff69ed6027b5efe098fb3c468d1") : Enum.valueOf(c.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (c[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cde5e278773a60f062ff76e05e3e03b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cde5e278773a60f062ff76e05e3e03b") : values().clone());
    }

    c() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b8926d4e658c85bfbf7ba9450185c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b8926d4e658c85bfbf7ba9450185c9");
        }
    }
}
