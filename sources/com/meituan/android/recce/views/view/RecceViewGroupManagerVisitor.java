package com.meituan.android.recce.views.view;

import android.support.v4.view.ViewCompat;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.d;
import com.facebook.yoga.b;
import com.meituan.android.recce.mrn.uimanager.c;
import com.meituan.android.recce.views.view.RecceViewGroup;
import com.meituan.android.recce.views.view.RecceViewGroupManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceViewGroupManagerVisitor<T extends RecceViewGroup, V extends RecceViewGroupManager<T>> extends c<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceViewGroupManagerVisitor(T t, V v) {
        super(t, v);
        Object[] objArr = {t, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b8ca009d4e38753524ca89b7cac1dad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b8ca009d4e38753524ca89b7cac1dad");
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitPressedBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d45e9c2e797dd7ed06c3d5ad4d37511c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d45e9c2e797dd7ed06c3d5ad4d37511c");
        }
        ((RecceViewGroup) this.view).setPressedBackgroundColor(i);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a959fd626bbb4e1c1dda79037c7df8ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a959fd626bbb4e1c1dda79037c7df8ae");
        }
        setBorderColor((RecceViewGroup) this.view, 8, Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderLeftColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e774ae52449357670462f62e0fea28a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e774ae52449357670462f62e0fea28a");
        }
        setBorderColor((RecceViewGroup) this.view, 0, Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderRightColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33b8e10e406e2301e7b47818d79f0fda", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33b8e10e406e2301e7b47818d79f0fda");
        }
        setBorderColor((RecceViewGroup) this.view, 2, Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderStartColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb04f4566969fd06fc321a99ce2cbc10", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb04f4566969fd06fc321a99ce2cbc10");
        }
        setBorderColor((RecceViewGroup) this.view, 4, Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderEndColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fb528975dc56b7dfa017640ebbfed42", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fb528975dc56b7dfa017640ebbfed42");
        }
        setBorderColor((RecceViewGroup) this.view, 5, Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc4235e2a69b5270b9849ff5ee27cb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc4235e2a69b5270b9849ff5ee27cb5");
        }
        setBorderColor((RecceViewGroup) this.view, 1, Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final Void visitBorderBottomColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e38336a5265553f7e2adab5a0fc738e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e38336a5265553f7e2adab5a0fc738e1");
        }
        setBorderColor((RecceViewGroup) this.view, 3, Integer.valueOf(i));
        return null;
    }

    private void setBorderColor(RecceViewGroup recceViewGroup, int i, Integer num) {
        Object[] objArr = {recceViewGroup, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79f8bcad22e8efc59c1693b1843545ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79f8bcad22e8efc59c1693b1843545ba");
        } else {
            recceViewGroup.setBorderColor(i, num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK, num != null ? num.intValue() >>> 24 : Float.NaN);
        }
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final Void visitBorderBottomWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "398e5985401d4a9411f13101407ee18d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "398e5985401d4a9411f13101407ee18d");
        }
        ((RecceViewGroup) this.view).setBorderWidth(3, w.a(f));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b56d0f8af141db6b44dcf05dc31d77f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b56d0f8af141db6b44dcf05dc31d77f");
        }
        if (!b.a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!b.a(f)) {
            f = w.a(f);
        }
        ((RecceViewGroup) this.view).setBorderRadius(f);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopRightRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34789b8ea928b08a6d91c8efef6d8e28", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34789b8ea928b08a6d91c8efef6d8e28");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.TOP_RIGHT.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopLeftRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40f213f519e98a160d8fc7d2ee9c5bbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40f213f519e98a160d8fc7d2ee9c5bbc");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.TOP_LEFT.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopEndRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe461327dbb6be68b9a2f56d0ae587ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe461327dbb6be68b9a2f56d0ae587ff");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.TOP_END.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderTopStartRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2db6e0ed5ab76e5d5102231e75dacf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2db6e0ed5ab76e5d5102231e75dacf2");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.TOP_START.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomEndRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04d2ea61eaf9e32e1c683e9dd13522bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04d2ea61eaf9e32e1c683e9dd13522bb");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.BOTTOM_END.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomLeftRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d8f867812c667529211ce11ba37c5b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d8f867812c667529211ce11ba37c5b6");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.BOTTOM_LEFT.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomRightRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220124a88a35ac2aae78904673bb9961", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220124a88a35ac2aae78904673bb9961");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.BOTTOM_RIGHT.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderBottomStartRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "562f13bf3e4615989871b57822c41701", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "562f13bf3e4615989871b57822c41701");
        }
        ((RecceViewGroup) this.view).setBorderRadius(w.a(f), d.a.BOTTOM_START.ordinal());
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9ed5e6c5c6298856d50327a14b5d524", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9ed5e6c5c6298856d50327a14b5d524");
        }
        ((RecceViewGroup) this.view).setBorderWidth(8, w.a(f));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitElevation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dcb0348032ab118dbbdd3ccc0a040d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dcb0348032ab118dbbdd3ccc0a040d1");
        }
        ViewCompat.setElevation(this.view, w.a(f));
        return null;
    }
}
