package com.meituan.android.mrn.component.list.common;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public enum Command {
    scrollToLocation,
    renderCell,
    addCellData,
    removeCellData,
    removeSectionData,
    updateCellData,
    scrollTo;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Command valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5612a37626a552408a2071348df432c3", RobustBitConfig.DEFAULT_VALUE) ? (Command) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5612a37626a552408a2071348df432c3") : (Command) Enum.valueOf(Command.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Command[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "574f1a9554d1dc61fd652c66182d0dc0", RobustBitConfig.DEFAULT_VALUE) ? (Command[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "574f1a9554d1dc61fd652c66182d0dc0") : (Command[]) values().clone();
    }

    Command() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859bdb8d4c1f0c5306c26b1d2b30063c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859bdb8d4c1f0c5306c26b1d2b30063c");
        }
    }
}
