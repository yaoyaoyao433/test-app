package com.meituan.msc.views.view;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.uimanager.RNViewGroupManager;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.view.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RNReactClippingViewManager<T extends b> extends RNViewGroupManager<T> {
    public static ChangeQuickRedirect d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup, int i) {
        return a((RNReactClippingViewManager<T>) ((b) viewGroup), i);
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void a(ViewGroup viewGroup, View view, int i) {
        b bVar = (b) viewGroup;
        Object[] objArr = {bVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32187e2bc35e2d4f64d7c44d7baa39c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32187e2bc35e2d4f64d7c44d7baa39c4");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (!bVar.getRemoveClippedSubviews()) {
            bVar.addView(view, i);
            return;
        }
        Object[] objArr2 = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.b;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "61c026f4aab1bd2a04e8783265ef4cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "61c026f4aab1bd2a04e8783265ef4cac");
        } else {
            bVar.a(view, i, b.c);
        }
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ int b(ViewGroup viewGroup) {
        b bVar = (b) viewGroup;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f43ab6ee295feac67df6c42f41b9ef0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f43ab6ee295feac67df6c42f41b9ef0")).intValue();
        }
        if (bVar.getRemoveClippedSubviews()) {
            return bVar.getAllChildrenCount();
        }
        return bVar.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void b(ViewGroup viewGroup, int i) {
        b bVar = (b) viewGroup;
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f11c1ecea3476855bd653efdb0c5ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f11c1ecea3476855bd653efdb0c5ce");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (bVar.getRemoveClippedSubviews()) {
            View a = a((RNReactClippingViewManager<T>) bVar, i);
            if (a.getParent() != null) {
                bVar.removeView(a);
            }
            bVar.a(a);
            return;
        }
        bVar.removeViewAt(i);
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void c(ViewGroup viewGroup) {
        b bVar = (b) viewGroup;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15b42c450a177c9d129473c63ccc802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15b42c450a177c9d129473c63ccc802");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (bVar.getRemoveClippedSubviews()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.b;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "210fe591cbe9a3d5906759435576a020", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "210fe591cbe9a3d5906759435576a020");
                return;
            }
            com.facebook.infer.annotation.a.a(bVar.d);
            com.facebook.infer.annotation.a.a(bVar.e);
            for (int i = 0; i < bVar.f; i++) {
                bVar.e[i].removeOnLayoutChangeListener(bVar.g);
            }
            bVar.removeAllViewsInLayout();
            bVar.f = 0;
            return;
        }
        bVar.removeAllViews();
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8eb2a7a9e0821b98f30d36e3e52a982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8eb2a7a9e0821b98f30d36e3e52a982");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        t.setRemoveClippedSubviews(z);
    }

    private View a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8799ccabc0fbbcfb753b183f81cd9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8799ccabc0fbbcfb753b183f81cd9e");
        }
        if (t.getRemoveClippedSubviews()) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.b;
            return PatchProxy.isSupport(objArr2, t, changeQuickRedirect2, false, "20918df2aaae99258a82afdcc7c75157", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, t, changeQuickRedirect2, false, "20918df2aaae99258a82afdcc7c75157") : ((View[]) com.facebook.infer.annotation.a.a(t.e))[i];
        }
        return t.getChildAt(i);
    }
}
