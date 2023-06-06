package com.meituan.msc.mmpviews.list.common;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public enum Command {
    scrollToLocation,
    append,
    splice,
    remove,
    update,
    updates,
    scrollTo,
    scrollIntoIndex;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Command valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc902151c5bc355fc5b086de82fce113", RobustBitConfig.DEFAULT_VALUE) ? (Command) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc902151c5bc355fc5b086de82fce113") : (Command) Enum.valueOf(Command.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Command[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8cc0c44f62d63f55409b70d3164f7ac1", RobustBitConfig.DEFAULT_VALUE) ? (Command[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8cc0c44f62d63f55409b70d3164f7ac1") : (Command[]) values().clone();
    }

    Command() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52c8461c6e59130875b60df3b944ec01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52c8461c6e59130875b60df3b944ec01");
        }
    }
}
