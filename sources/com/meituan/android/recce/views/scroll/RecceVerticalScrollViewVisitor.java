package com.meituan.android.recce.views.scroll;

import com.facebook.react.uimanager.w;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.scroll.e;
import com.meituan.android.recce.mrn.uimanager.c;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceVerticalScrollViewVisitor extends c<e, ReactScrollViewManager> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceVerticalScrollViewVisitor(e eVar, RecceVerticalScrollViewManager recceVerticalScrollViewManager) {
        super(eVar, recceVerticalScrollViewManager);
        Object[] objArr = {eVar, recceVerticalScrollViewManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc2fcc34342f44bdb5a72a53b114721", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc2fcc34342f44bdb5a72a53b114721");
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d3849137711b1e326826b72b91c1b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d3849137711b1e326826b72b91c1b2f");
        }
        setBorderRadius(f, 0);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopLeftRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63c525f405cb2002b7a4e99791edf757", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63c525f405cb2002b7a4e99791edf757");
        }
        setBorderRadius(f, 1);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopRightRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da24c61f3df0e86d37e9b91146ce4389", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da24c61f3df0e86d37e9b91146ce4389");
        }
        setBorderRadius(f, 2);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomRightRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b03d9218353b9f7865d8d0ac2ba2ffd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b03d9218353b9f7865d8d0ac2ba2ffd");
        }
        setBorderRadius(f, 3);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomLeftRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "153267288592fb5e4002cb91a6994564", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "153267288592fb5e4002cb91a6994564");
        }
        setBorderRadius(f, 4);
        return null;
    }

    private void setBorderRadius(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36369a0fc974f5ad08625513a25537d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36369a0fc974f5ad08625513a25537d9");
        } else {
            ((ReactScrollViewManager) this.viewManager).setBorderRadius((e) this.view, i, w.a(f));
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "823b421b03922cc1a2095076982d1807", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "823b421b03922cc1a2095076982d1807");
        }
        setBorderColor(i, 0);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderLeftColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "560ec9cc8c68af7004b333728cc6532b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "560ec9cc8c68af7004b333728cc6532b");
        }
        setBorderColor(i, 1);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderRightColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "056784b089ac35df4e10660ca8d73df9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "056784b089ac35df4e10660ca8d73df9");
        }
        setBorderColor(i, 2);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c295cdbd99474a68da634a5c540eb3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c295cdbd99474a68da634a5c540eb3e");
        }
        setBorderColor(i, 3);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b83769a620858c947dafad3ec4bc3bc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b83769a620858c947dafad3ec4bc3bc7");
        }
        setBorderColor(i, 4);
        return null;
    }

    private void setBorderColor(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe910ec87ee1d5194e4a67de7b26e254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe910ec87ee1d5194e4a67de7b26e254");
        } else {
            ((ReactScrollViewManager) this.viewManager).setBorderColor((e) this.view, i2, Integer.valueOf(i));
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c0d1161eea249fc410a1dc74405ce1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c0d1161eea249fc410a1dc74405ce1b");
        }
        setBorderWidth(f, 0);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderLeftWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e8bdcd576dc23d8d8dbfbc42f62355", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e8bdcd576dc23d8d8dbfbc42f62355");
        }
        setBorderWidth(f, 1);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderRightWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784dfca83d4a68977ad1d1148e4e22e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784dfca83d4a68977ad1d1148e4e22e3");
        }
        setBorderWidth(f, 2);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca2bdeeb3399063d3f18b788ac56e4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca2bdeeb3399063d3f18b788ac56e4d");
        }
        setBorderWidth(f, 4);
        return null;
    }

    private void setBorderWidth(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a818b8229f05116b835d9a717218e633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a818b8229f05116b835d9a717218e633");
        } else {
            ((ReactScrollViewManager) this.viewManager).setBorderWidth((e) this.view, i, w.a(f));
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ff06281ba83d94b5b3dd34209ab1028", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ff06281ba83d94b5b3dd34209ab1028");
        }
        ((ReactScrollViewManager) this.viewManager).setScrollEnabled((e) this.view, z);
        return (Void) super.visitScrollEnabled(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0029870c6c23fbc4d3b5314c3b88ed4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0029870c6c23fbc4d3b5314c3b88ed4a");
        }
        ((ReactScrollViewManager) this.viewManager).setDecelerationRate((e) this.view, f);
        return (Void) super.visitDecelerationRate(f);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitDisableIntervalMomentum(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf32f3e1fe20a99e9c2234d8c276416", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf32f3e1fe20a99e9c2234d8c276416");
        }
        ((ReactScrollViewManager) this.viewManager).setDisableIntervalMomentum((e) this.view, z);
        return (Void) super.visitDisableIntervalMomentum(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSnapToInterval(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b410f69855a5b6bf2c73a4e503d3d0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b410f69855a5b6bf2c73a4e503d3d0d");
        }
        ((ReactScrollViewManager) this.viewManager).setSnapToInterval((e) this.view, f);
        return (Void) super.visitSnapToInterval(f);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSnapToStart(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c83c1239c568e952405e24a29cf072f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c83c1239c568e952405e24a29cf072f9");
        }
        ((ReactScrollViewManager) this.viewManager).setSnapToStart((e) this.view, z);
        return (Void) super.visitSnapToStart(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSnapToEnd(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c52e84b9d764e091cf6efdbd23fc7fb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c52e84b9d764e091cf6efdbd23fc7fb6");
        }
        ((ReactScrollViewManager) this.viewManager).setSnapToEnd((e) this.view, z);
        return (Void) super.visitSnapToEnd(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitPagingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12ab67f9c2e5c3b5962c6c4981d20e67", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12ab67f9c2e5c3b5962c6c4981d20e67");
        }
        ((ReactScrollViewManager) this.viewManager).setPagingEnabled((e) this.view, z);
        return (Void) super.visitPagingEnabled(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitOverScrollMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39782d8340a1fa45bb61b3919d5dc46b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39782d8340a1fa45bb61b3919d5dc46b");
        }
        ((ReactScrollViewManager) this.viewManager).setOverScrollMode((e) this.view, OverScrollMode.caseName(i));
        return (Void) super.visitOverScrollMode(i);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitPersistentScrollbar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9d41573ccbce0922a9dde7686661103", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9d41573ccbce0922a9dde7686661103");
        }
        ((ReactScrollViewManager) this.viewManager).setPersistentScrollbar((e) this.view, z);
        return (Void) super.visitPersistentScrollbar(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitFadingEdgeLength(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36ad25e3bba466b3b6d3deb19cd5223a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36ad25e3bba466b3b6d3deb19cd5223a");
        }
        ((ReactScrollViewManager) this.viewManager).setFadingEdgeLength((e) this.view, (int) f);
        return (Void) super.visitFadingEdgeLength(f);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitShowsVerticalScrollIndicator(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df8308e20f697b1c2213c5fe311eaf96", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df8308e20f697b1c2213c5fe311eaf96");
        }
        ((ReactScrollViewManager) this.viewManager).setShowsVerticalScrollIndicator((e) this.view, z);
        return (Void) super.visitShowsVerticalScrollIndicator(z);
    }
}
