package com.meituan.android.recce.views.text;

import com.facebook.react.uimanager.w;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.meituan.android.recce.mrn.uimanager.a;
import com.meituan.android.recce.props.gens.FontStyle;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.android.recce.props.gens.TextTransform;
import com.meituan.android.recce.views.text.GetTextAttributesable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceBaseTextShadowNodeVisitor<T extends ReactBaseTextShadowNode & GetTextAttributesable> extends a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceBaseTextShadowNodeVisitor(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01e0c4c94a102f6f37035e057653ac09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01e0c4c94a102f6f37035e057653ac09");
        } else {
            this.shadowNode = t;
        }
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f305c75740d28bc3889af33f99619f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f305c75740d28bc3889af33f99619f0");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setColor(Integer.valueOf(i));
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitFontSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "885291479626c5e176bd2f79d2d64d8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "885291479626c5e176bd2f79d2d64d8d");
        }
        ((GetTextAttributesable) ((ReactBaseTextShadowNode) this.shadowNode)).getTextAttributes().a(f);
        ((ReactBaseTextShadowNode) this.shadowNode).markUpdated();
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitFontStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4a3062786e30cc66384378a3046a52c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4a3062786e30cc66384378a3046a52c");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setFontStyle(FontStyle.caseName(i));
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitFontWeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89f640e08233a861a8ebc8514e3079a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89f640e08233a861a8ebc8514e3079a5");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setFontWeight(FontWeight.caseName(i));
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitLetterSpacing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec845f1666c4c97feddf2db6ebfaa946", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec845f1666c4c97feddf2db6ebfaa946");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setLetterSpacing(f);
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitLineHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0768fd2b70cbe03238004ec2c7bf292", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0768fd2b70cbe03238004ec2c7bf292");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setLineHeight(f);
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitTextAlign(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b573c4a945c8b96bb350b456ac14a2ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b573c4a945c8b96bb350b456ac14a2ce");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setTextAlign(TextAlign.caseName(i));
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitTextShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df5fc96533b7723e897744764f1b1a8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df5fc96533b7723e897744764f1b1a8d");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setTextShadowColor(i);
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitTextShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c99cac80f9ec72f4c81ee4a289e7f2e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c99cac80f9ec72f4c81ee4a289e7f2e8");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setTextShadowRadius(w.a(f));
        return null;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.a, com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitTextTransform(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dabb2e36dee8843662f94a3a0fb4e5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dabb2e36dee8843662f94a3a0fb4e5f");
        }
        ((ReactBaseTextShadowNode) this.shadowNode).setTextTransform(TextTransform.caseName(i));
        return null;
    }
}
