package com.meituan.android.recce.mrn.uimanager;

import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.recce.props.gens.LongClick;
import com.meituan.android.recce.views.anim.RecceAnim;
import com.meituan.android.recce.views.base.RecceUIManagerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f<T extends View, C extends LayoutShadowNode, V extends ViewManager<T, C>> extends com.meituan.android.recce.props.a<Void> {
    private static final String TAG = "ViewManagerVisitor";
    public static ChangeQuickRedirect changeQuickRedirect;
    public T view;
    public V viewManager;

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b690e67d5fc12d4dd9ce6aa9efa41e67", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b690e67d5fc12d4dd9ce6aa9efa41e67");
        }
        com.dianping.networklog.c.a("ViewManagerVisitor: visitClick view is " + this.viewManager.getName(), 3, new String[]{"Recce-Android"});
        this.view.setOnClickListener(g.a(this));
        return null;
    }

    public static /* synthetic */ void lambda$visitClick$0(f fVar, View view) {
        Object[] objArr = {fVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b6b10904c05f97431046aa8f7c53f235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b6b10904c05f97431046aa8f7c53f235");
            return;
        }
        com.dianping.networklog.c.a("ViewManagerVisitor: onClick  " + fVar.viewManager.getName(), 3, new String[]{"Recce-Android"});
        RecceUIManagerUtils.getRecceEventDispatcher(fVar.view).a(com.meituan.android.recce.events.f.a(fVar.view.getId(), 132, "click", null));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitLongClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b87ae651ccd90a9a67324b1fca0f50ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b87ae651ccd90a9a67324b1fca0f50ac");
        }
        this.view.setOnLongClickListener(h.a(this));
        return null;
    }

    public static /* synthetic */ boolean lambda$visitLongClick$1(f fVar, View view) {
        Object[] objArr = {fVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34a6fbc2139a25e82361ff58a98b5c45", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34a6fbc2139a25e82361ff58a98b5c45")).booleanValue();
        }
        RecceUIManagerUtils.getRecceEventDispatcher(fVar.view).a(com.meituan.android.recce.events.f.a(fVar.view.getId(), 133, LongClick.LOWER_CASE_NAME, null));
        return true;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cf8c6023dcfc1aa7513949f6529177f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cf8c6023dcfc1aa7513949f6529177f");
        }
        this.view.setBackgroundColor(i);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitOpacity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92756a4465b8e889c4740b32e0521816", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92756a4465b8e889c4740b32e0521816");
        }
        this.view.setAlpha(f);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitStartAnim(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43dee5462ca590924ded46370ff5868c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43dee5462ca590924ded46370ff5868c");
        }
        if (this.view instanceof RecceAnim) {
            ((RecceAnim) this.view).start(z);
        }
        return (Void) super.visitStartAnim(z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitAnimData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62ce30be5e1bb92da005d5b9cfbebfbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62ce30be5e1bb92da005d5b9cfbebfbe");
        }
        if (this.view instanceof RecceAnim) {
            ((RecceAnim) this.view).bindAnimData(str);
        }
        return (Void) super.visitAnimData(str);
    }
}
