package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.views.view.RNLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RNViewGroupManager<T extends ViewGroup> extends RNBaseViewManager<T, RNLayoutShadowNode> implements e<T>, f {
    private static WeakHashMap<View, Integer> b = new WeakHashMap<>();
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msc.uimanager.as
    public final /* bridge */ /* synthetic */ void a(View view, Object obj) {
    }

    @Override // com.meituan.msc.uimanager.f
    public final boolean h() {
        return false;
    }

    @Override // com.meituan.msc.uimanager.as
    /* renamed from: g */
    public RNLayoutShadowNode d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3593a89de9d4c95a5906a5c9752969", RobustBitConfig.DEFAULT_VALUE) ? (RNLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3593a89de9d4c95a5906a5c9752969") : new RNLayoutShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public Class<? extends RNLayoutShadowNode> c() {
        return RNLayoutShadowNode.class;
    }

    @Override // com.meituan.msc.uimanager.e
    public void a(T t, View view, int i) {
        Object[] objArr = {t, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d9b9bcb6c914b0848b615fd06e23c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d9b9bcb6c914b0848b615fd06e23c3");
        } else {
            t.addView(view, i);
        }
    }

    public static void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b6702440816ec48c947568a5205e92a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b6702440816ec48c947568a5205e92a");
        } else {
            b.put(view, Integer.valueOf(i));
        }
    }

    @Nullable
    public static Integer c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d4b4436c3012ad8ddbf77c8c0a5988f", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d4b4436c3012ad8ddbf77c8c0a5988f") : b.get(view);
    }

    @Override // com.meituan.msc.uimanager.e
    public int b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24709fa4be382c5010411f355346cf3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24709fa4be382c5010411f355346cf3")).intValue() : t.getChildCount();
    }

    @Override // com.meituan.msc.uimanager.e
    public View a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b94fb4e7254094eb5fd9ec41e02331", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b94fb4e7254094eb5fd9ec41e02331") : t.getChildAt(i);
    }

    @Override // com.meituan.msc.uimanager.e
    public void b(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c6422b706f32b5d8477649c91ee68b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c6422b706f32b5d8477649c91ee68b");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        t.removeViewAt(i);
    }

    @Override // com.meituan.msc.uimanager.e
    public final void a(T t, View view) {
        Object[] objArr = {t, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3851130327ab97414c462e4f5093f40e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3851130327ab97414c462e4f5093f40e");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < b((RNViewGroupManager<T>) t); i++) {
            if (a((RNViewGroupManager<T>) t, i) == view) {
                b((RNViewGroupManager<T>) t, i);
                return;
            }
        }
    }

    @Override // com.meituan.msc.uimanager.e
    public void c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda582731d1917a6f544e9a8384b4c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda582731d1917a6f544e9a8384b4c82");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        for (int b2 = b((RNViewGroupManager<T>) t) - 1; b2 >= 0; b2--) {
            b((RNViewGroupManager<T>) t, b2);
        }
    }
}
