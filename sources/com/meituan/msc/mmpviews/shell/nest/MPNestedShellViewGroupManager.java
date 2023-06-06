package com.meituan.msc.mmpviews.shell.nest;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.mmpviews.shell.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MPNestedShellViewGroupManager<T extends d, InnerViewGroup extends ViewGroup> extends MPShellDelegateViewGroupManager<T> {
    public static ChangeQuickRedirect e;

    public abstract InnerViewGroup a(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public /* synthetic */ View a(ViewGroup viewGroup, int i) {
        return b((MPNestedShellViewGroupManager<T, InnerViewGroup>) ((d) viewGroup), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void a(ViewGroup viewGroup, View view) {
        d dVar = (d) viewGroup;
        Object[] objArr = {dVar, view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf97cc89c7b0e14c0500f0c0249a454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf97cc89c7b0e14c0500f0c0249a454");
        } else {
            a((MPNestedShellViewGroupManager<T, InnerViewGroup>) dVar).removeView(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public /* bridge */ /* synthetic */ void a(ViewGroup viewGroup, View view, int i) {
        a((MPNestedShellViewGroupManager<T, InnerViewGroup>) ((d) viewGroup), view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public /* bridge */ /* synthetic */ int b(ViewGroup viewGroup) {
        return b((MPNestedShellViewGroupManager<T, InnerViewGroup>) ((d) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public /* synthetic */ void b(ViewGroup viewGroup, int i) {
        a((MPNestedShellViewGroupManager<T, InnerViewGroup>) ((d) viewGroup), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void c(ViewGroup viewGroup) {
        d dVar = (d) viewGroup;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d0d79a403a5b0d105692a65dc54c16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d0d79a403a5b0d105692a65dc54c16");
        } else {
            a((MPNestedShellViewGroupManager<T, InnerViewGroup>) dVar).removeAllViews();
        }
    }

    public void a(T t, View view, int i) {
        Object[] objArr = {t, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1417e0978f71783d48d7eda62167b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1417e0978f71783d48d7eda62167b94");
        } else {
            a((MPNestedShellViewGroupManager<T, InnerViewGroup>) t).addView(view, i);
        }
    }

    public void a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cc82483febbade448c24f2ea5c66a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cc82483febbade448c24f2ea5c66a0");
        } else {
            a((MPNestedShellViewGroupManager<T, InnerViewGroup>) t).removeViewAt(i);
        }
    }

    public View b(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c5d398151cd9f3adab47d8b7b304db", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c5d398151cd9f3adab47d8b7b304db") : a((MPNestedShellViewGroupManager<T, InnerViewGroup>) t).getChildAt(i);
    }

    public int b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51a26bc95f2453a79db813bfdc3a4d8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51a26bc95f2453a79db813bfdc3a4d8")).intValue() : a((MPNestedShellViewGroupManager<T, InnerViewGroup>) t).getChildCount();
    }
}
