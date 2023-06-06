package com.meituan.msc.mmpviews.perflist.item;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RListCellViewManager extends MPShellDelegateViewGroupManager<a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    @Nonnull
    public final String a() {
        return "MSCRListItem";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84a7fa28670419489358edf46dd53fc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84a7fa28670419489358edf46dd53fc") : new a(themedReactContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void b(@NonNull View view) {
        a aVar = (a) view;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "830e147ac8c69b925b74c545b38dbb10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "830e147ac8c69b925b74c545b38dbb10");
            return;
        }
        super.b((RListCellViewManager) aVar);
        if (aVar.getParent() == null || !(aVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) aVar.getParent()).removeView(aVar);
    }
}
