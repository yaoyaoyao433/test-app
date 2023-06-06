package com.meituan.android.recce.views.modal;

import com.meituan.android.recce.mrn.uimanager.c;
import com.meituan.android.recce.props.gens.AnimationType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceModalVisitor extends c<RecceModalView, RecceModalManager> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceModalVisitor(RecceModalView recceModalView, RecceModalManager recceModalManager) {
        super(recceModalView, recceModalManager);
        Object[] objArr = {recceModalView, recceModalManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0cf8de9365d52bdac7ae7c920367e10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0cf8de9365d52bdac7ae7c920367e10");
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitAnimationType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94164db6f75ce67da1862d892cce83d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94164db6f75ce67da1862d892cce83d4");
        }
        ((RecceModalView) this.view).setAnimationType(AnimationType.caseName(i));
        return (Void) super.visitAnimationType(i);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitTransparent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "131a714d561f5186350a7361e53704fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "131a714d561f5186350a7361e53704fb");
        }
        ((RecceModalView) this.view).setTransparent(z);
        return (Void) super.visitTransparent(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitStatusBarTranslucent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a15900ca3f1313692305a0d39661150", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a15900ca3f1313692305a0d39661150");
        }
        ((RecceModalView) this.view).setStatusBarTranslucent(z);
        return (Void) super.visitStatusBarTranslucent(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitHardwareAccelerated(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4026993908e64fc50e65530cd2cf53e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4026993908e64fc50e65530cd2cf53e2");
        }
        ((RecceModalView) this.view).setHardwareAccelerated(z);
        return (Void) super.visitHardwareAccelerated(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitRequestClose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b5e27690eee117bdd5695426a73eb54", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b5e27690eee117bdd5695426a73eb54");
        }
        ((RecceModalManager) this.viewManager).handleBackKey((RecceModalView) this.view);
        return (Void) super.visitRequestClose();
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitShow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c363093e4cdf5ec2773e5f1038fc950a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c363093e4cdf5ec2773e5f1038fc950a");
        }
        ((RecceModalManager) this.viewManager).handleShowEvent((RecceModalView) this.view);
        return (Void) super.visitShow();
    }
}
