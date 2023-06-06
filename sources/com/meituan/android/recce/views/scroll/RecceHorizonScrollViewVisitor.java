package com.meituan.android.recce.views.scroll;

import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.d;
import com.meituan.android.recce.mrn.uimanager.c;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceHorizonScrollViewVisitor extends c<d, ReactHorizontalScrollViewManager> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceHorizonScrollViewVisitor(d dVar, RecceHorizonScrollViewManager recceHorizonScrollViewManager) {
        super(dVar, recceHorizonScrollViewManager);
        Object[] objArr = {dVar, recceHorizonScrollViewManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c5ddd9705783a6f6d3fc330888782a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c5ddd9705783a6f6d3fc330888782a8");
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22d56dc89cfaf305e9490520cd5b756e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22d56dc89cfaf305e9490520cd5b756e");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setScrollEnabled((d) this.view, z);
        return (Void) super.visitScrollEnabled(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff1f2d23d514c82cf396f20f52db7007", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff1f2d23d514c82cf396f20f52db7007");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setDecelerationRate((d) this.view, f);
        return (Void) super.visitDecelerationRate(f);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitDisableIntervalMomentum(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bcb8de086b2276819f352bb4ed77d7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bcb8de086b2276819f352bb4ed77d7a");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setDisableIntervalMomentum((d) this.view, z);
        return (Void) super.visitDisableIntervalMomentum(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSnapToInterval(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9922310df56a08d575d82773ee9c44b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9922310df56a08d575d82773ee9c44b1");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setSnapToInterval((d) this.view, f);
        return (Void) super.visitSnapToInterval(f);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSnapToStart(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cedc33c2692f7a93d40a8318b48e6b88", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cedc33c2692f7a93d40a8318b48e6b88");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setSnapToStart((d) this.view, z);
        return (Void) super.visitSnapToStart(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSnapToEnd(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71d171e8cc9134ea6a2f739a6f5dbed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71d171e8cc9134ea6a2f739a6f5dbed");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setSnapToEnd((d) this.view, z);
        return (Void) super.visitSnapToEnd(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitPagingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fc5e9d1e9c0a469239a095c180c0b82", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fc5e9d1e9c0a469239a095c180c0b82");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setPagingEnabled((d) this.view, z);
        return (Void) super.visitPagingEnabled(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitOverScrollMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4cb14e968ad1f364c4d19cbec13ac06", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4cb14e968ad1f364c4d19cbec13ac06");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setOverScrollMode((d) this.view, OverScrollMode.caseName(i));
        return (Void) super.visitOverScrollMode(i);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitPersistentScrollbar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d820e3577c1901537b44b06a5de69249", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d820e3577c1901537b44b06a5de69249");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setPersistentScrollbar((d) this.view, z);
        return (Void) super.visitPersistentScrollbar(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitFadingEdgeLength(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e2956bb4b0b8d8ab314ee192e6b4393", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e2956bb4b0b8d8ab314ee192e6b4393");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setFadingEdgeLength((d) this.view, (int) f);
        return (Void) super.visitFadingEdgeLength(f);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitShowsHorizontalScrollIndicator(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19f5d881e3cced94f4e866256c698081", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19f5d881e3cced94f4e866256c698081");
        }
        ((ReactHorizontalScrollViewManager) this.viewManager).setShowsHorizontalScrollIndicator((d) this.view, z);
        return (Void) super.visitShowsHorizontalScrollIndicator(z);
    }
}
