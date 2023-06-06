package com.meituan.msc.mmpviews.list.item;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.mmpviews.util.b;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCListCellViewManager extends MPShellDelegateViewGroupManager<a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    @Nonnull
    public final String a() {
        return "MSCListCell";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac448b00139327591a2515e7b2234e60", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac448b00139327591a2515e7b2234e60") : new a(themedReactContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void b(@NonNull View view) {
        a aVar = (a) view;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97bccac8bee6dee1d063485b8eac76e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97bccac8bee6dee1d063485b8eac76e8");
            return;
        }
        super.b((MSCListCellViewManager) aVar);
        if (aVar.getParent() == null || !(aVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) aVar.getParent()).removeView(aVar);
    }

    @ReactProp(name = "sectionHeader")
    public void setSectionHeader(a aVar, Dynamic dynamic) {
        Object[] objArr = {aVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90e14528ce63536114b9f3cb11221b0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90e14528ce63536114b9f3cb11221b0f");
        } else {
            aVar.setFullSpan(b.a(dynamic));
        }
    }
}
