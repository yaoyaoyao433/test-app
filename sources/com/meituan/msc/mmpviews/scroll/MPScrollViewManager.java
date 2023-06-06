package com.meituan.msc.mmpviews.scroll;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCScrollView")
/* loaded from: classes3.dex */
public class MPScrollViewManager extends MPNestedShellViewGroupManager<i, ViewGroup> {
    public static ChangeQuickRedirect a;
    public a b;

    @Override // com.meituan.msc.uimanager.as
    public final /* bridge */ /* synthetic */ View a(ThemedReactContext themedReactContext) {
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCScrollView";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(int i, @NonNull ThemedReactContext themedReactContext, ab abVar) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67226c6141a2dd2a1e9cd828e6745624", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67226c6141a2dd2a1e9cd828e6745624");
        }
        Boolean bool = null;
        Boolean valueOf = (abVar == null || !abVar.a("scrollX")) ? null : Boolean.valueOf(com.meituan.msc.mmpviews.util.b.a(abVar.c("scrollX")));
        if (abVar != null && abVar.a("scrollY")) {
            bool = Boolean.valueOf(com.meituan.msc.mmpviews.util.b.a(abVar.c("scrollY")));
        }
        return new i(themedReactContext, bool != null ? bool.booleanValue() || valueOf == null || !valueOf.booleanValue() : valueOf == null, (valueOf != null && valueOf.booleanValue()) || (bool != null && bool.booleanValue()), (abVar != null && abVar.a("enableNested") && com.meituan.msc.mmpviews.util.b.a(abVar.c("enableNested"))) ? false : false);
    }

    @Override // com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager
    public final /* synthetic */ ViewGroup a(i iVar) {
        i iVar2 = iVar;
        Object[] objArr = {iVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1855afcb456ddd084438f2769ed61428", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1855afcb456ddd084438f2769ed61428") : (ViewGroup) ((ViewGroup) iVar2.getChildAt(0)).getChildAt(0);
    }

    public MPScrollViewManager() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4aa9fe797f46d09b4c8d191c6c3e60a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4aa9fe797f46d09b4c8d191c6c3e60a");
        }
    }

    private MPScrollViewManager(@Nullable a aVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d863810af4e1211d68801cf4c77cb8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d863810af4e1211d68801cf4c77cb8e");
            return;
        }
        this.b = null;
        this.b = null;
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f118f32b47f313818662840a6c95410b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f118f32b47f313818662840a6c95410b");
        } else if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setScrollEnabled(z);
        }
    }

    @ReactProp(name = "upperThreshold")
    public void setUpperThreshold(i iVar, int i) {
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c2f5b94e0b8417fa49c944c4b3ccd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c2f5b94e0b8417fa49c944c4b3ccd7");
        } else if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setUpperThreshold(i);
        }
    }

    @ReactProp(name = "lowerThreshold")
    public void setLowerThreshold(i iVar, int i) {
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea5bbba16c99e69f3fb8ec0bf4980f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea5bbba16c99e69f3fb8ec0bf4980f7");
        } else if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setLowerThreshold(i);
        }
    }

    @ReactProp(name = "scrollTop")
    public void setScrollTop(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079d922b7e7924f3572b060b01ed2e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079d922b7e7924f3572b060b01ed2e21");
            return;
        }
        double b = com.meituan.msc.mmpviews.util.b.b(dynamic);
        if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setScrollTop(b);
        }
    }

    @ReactProp(name = "scrollLeft")
    public void setScrollLeft(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029e83691fdd9bdf1b0f7fbde3725ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029e83691fdd9bdf1b0f7fbde3725ab2");
            return;
        }
        double b = com.meituan.msc.mmpviews.util.b.b(dynamic);
        if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setScrollLeft(b);
        }
    }

    @ReactProp(name = "scrollWithAnimation")
    public void setScrollWithAnimation(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0b3a1c1492eb9b1e6fcd319f77ba6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0b3a1c1492eb9b1e6fcd319f77ba6c");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setScrollWithAnimation(a2);
        }
    }

    @ReactProp(name = "enhanced")
    public void setEnhanced(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332ae9defe37027c94d04a71014e1977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332ae9defe37027c94d04a71014e1977");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setEnhanced(a2);
        }
    }

    @ReactProp(name = "showScrollbar")
    public void setShowScrollbar(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa48ae0b4d19b73dd97bd61d4f241d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa48ae0b4d19b73dd97bd61d4f241d9");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        if (iVar.getChildAt(0) instanceof b) {
            ((b) iVar.getChildAt(0)).setShowScrollbar(a2);
        }
    }

    @ReactProp(name = "scrollX")
    public void setScrollX(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c01e0454401991b21b7bf3870a667b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c01e0454401991b21b7bf3870a667b");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        View childAt = iVar.getChildAt(0);
        if (childAt instanceof c) {
            ((b) childAt).setScrollEnabled(a2);
        }
    }

    @ReactProp(name = "scrollY")
    public void setScrollY(i iVar, Dynamic dynamic) {
        Object[] objArr = {iVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e0a1d6a3d6df92f68ab1718cf4e6d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e0a1d6a3d6df92f68ab1718cf4e6d2");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        View childAt = iVar.getChildAt(0);
        if ((childAt instanceof f) || (childAt instanceof MPNestedScrollView)) {
            ((b) childAt).setScrollEnabled(a2);
        }
    }
}
