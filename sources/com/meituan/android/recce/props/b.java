package com.meituan.android.recce.props;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.recce.props.gens.AlignContent;
import com.meituan.android.recce.props.gens.AlignItems;
import com.meituan.android.recce.props.gens.AlignSelf;
import com.meituan.android.recce.props.gens.AspectRatio;
import com.meituan.android.recce.props.gens.BackfaceVisibility;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomEndRadius;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomStartRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderEndColor;
import com.meituan.android.recce.props.gens.BorderEndWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStartColor;
import com.meituan.android.recce.props.gens.BorderStartWidth;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopEndRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.BorderTopStartRadius;
import com.meituan.android.recce.props.gens.Direction;
import com.meituan.android.recce.props.gens.Display;
import com.meituan.android.recce.props.gens.FlexDirection;
import com.meituan.android.recce.props.gens.FlexGrow;
import com.meituan.android.recce.props.gens.FlexShrink;
import com.meituan.android.recce.props.gens.FlexWrap;
import com.meituan.android.recce.props.gens.FontStyle;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.IsShow;
import com.meituan.android.recce.props.gens.ItemBackgroundColor;
import com.meituan.android.recce.props.gens.JustifyContent;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginEnd;
import com.meituan.android.recce.props.gens.MarginHorizontal;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginStart;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MarginVertical;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.MinWidth;
import com.meituan.android.recce.props.gens.Overflow;
import com.meituan.android.recce.props.gens.PaddingEnd;
import com.meituan.android.recce.props.gens.PaddingStart;
import com.meituan.android.recce.props.gens.PaddingVertical;
import com.meituan.android.recce.props.gens.Position;
import com.meituan.android.recce.props.gens.PressedBackgroundColor;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.android.recce.props.gens.TextTransform;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a<ReadableMap> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* bridge */ /* synthetic */ Object visitData(String str) {
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* bridge */ /* synthetic */ Object visitEllipsizeMode(int i) {
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* bridge */ /* synthetic */ Object visitFlexBasis(float f, boolean z, boolean z2) {
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* bridge */ /* synthetic */ Object visitNumberOfLines(int i) {
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* bridge */ /* synthetic */ Object visitSource(String str) {
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitAlignContent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27739175dd7ca5fdcc603f96d9b79c93", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27739175dd7ca5fdcc603f96d9b79c93") : JavaOnlyMap.of(AlignContent.LOWER_CASE_NAME, AlignContent.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitAlignItems(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f2ec92215e09aee4f2fcd8cd506e289", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f2ec92215e09aee4f2fcd8cd506e289") : JavaOnlyMap.of(AlignItems.LOWER_CASE_NAME, AlignItems.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitAlignSelf(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf2e1fae8dcfb638f878dc3cf503727", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf2e1fae8dcfb638f878dc3cf503727") : JavaOnlyMap.of(AlignSelf.LOWER_CASE_NAME, AlignSelf.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitAspectRatio(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba66c91c46e88f5ccac8e34fec47995", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba66c91c46e88f5ccac8e34fec47995") : JavaOnlyMap.of(AspectRatio.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBackfaceVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32baa3a6bbc26abb3c0f33b6fcd527b6", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32baa3a6bbc26abb3c0f33b6fcd527b6") : JavaOnlyMap.of(BackfaceVisibility.LOWER_CASE_NAME, BackfaceVisibility.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4da83a505cc337999322898fd51cac", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4da83a505cc337999322898fd51cac") : JavaOnlyMap.of("backgroundColor", Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderBottomColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d0d91789b1b09050fdbb945538ebd8", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d0d91789b1b09050fdbb945538ebd8") : JavaOnlyMap.of(BorderBottomColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderBottomEndRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2d6af5f32e0f706cf29f9850a2c4ef", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2d6af5f32e0f706cf29f9850a2c4ef") : JavaOnlyMap.of(BorderBottomEndRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderBottomLeftRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038ac40732ec7fbfe54eada934f99ce6", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038ac40732ec7fbfe54eada934f99ce6") : JavaOnlyMap.of(BorderBottomLeftRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderBottomRightRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5556e2fafd7817ed71e6d07ecaca3ccb", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5556e2fafd7817ed71e6d07ecaca3ccb") : JavaOnlyMap.of(BorderBottomRightRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderBottomStartRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df954af520b4235446684c0e2ddd6e3", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df954af520b4235446684c0e2ddd6e3") : JavaOnlyMap.of(BorderBottomStartRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderBottomWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8df23bd744e97a2ade2a693615ac0f5", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8df23bd744e97a2ade2a693615ac0f5") : JavaOnlyMap.of(BorderBottomWidth.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f497d7de0637d53ec87b8f985d3daf0", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f497d7de0637d53ec87b8f985d3daf0") : JavaOnlyMap.of("borderColor", Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderEndColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048880fb0d9539dc3ea610b834b27b9a", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048880fb0d9539dc3ea610b834b27b9a") : JavaOnlyMap.of(BorderEndColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderEndWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf9cb4e2f5e4a65c72cc3040e1d7589", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf9cb4e2f5e4a65c72cc3040e1d7589") : JavaOnlyMap.of(BorderEndWidth.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderLeftColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b90a5ef35b6eb4ec686c0239edb12db", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b90a5ef35b6eb4ec686c0239edb12db") : JavaOnlyMap.of(BorderLeftColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderLeftWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1d95f4f4a4424f2b9e4e8786786a92", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1d95f4f4a4424f2b9e4e8786786a92") : JavaOnlyMap.of(BorderLeftWidth.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40bd3bbc4a27cffec94176592c8514a", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40bd3bbc4a27cffec94176592c8514a") : JavaOnlyMap.of(BorderRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderRightColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b016da990ad2cc3bdbd95716ac5fafd", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b016da990ad2cc3bdbd95716ac5fafd") : JavaOnlyMap.of(BorderRightColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderRightWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f376c00cde9ba76ac25db8c4d6f788", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f376c00cde9ba76ac25db8c4d6f788") : JavaOnlyMap.of(BorderRightWidth.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderStartColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843df9e27e69c01f38272055be2b66de", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843df9e27e69c01f38272055be2b66de") : JavaOnlyMap.of(BorderStartColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderStartWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb356794657e2946afef989955afe44", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb356794657e2946afef989955afe44") : JavaOnlyMap.of(BorderStartWidth.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cab97aa11195751e80d5f188d78103", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cab97aa11195751e80d5f188d78103") : JavaOnlyMap.of(BorderStyle.LOWER_CASE_NAME, BorderStyle.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderTopColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4364aad247c718f02785351c9608dbf", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4364aad247c718f02785351c9608dbf") : JavaOnlyMap.of(BorderTopColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderTopEndRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20048a9b47650b823c2de733ea3a42bc", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20048a9b47650b823c2de733ea3a42bc") : JavaOnlyMap.of(BorderTopEndRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderTopLeftRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2256c19dc6d1d75a6d2027728b13d801", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2256c19dc6d1d75a6d2027728b13d801") : JavaOnlyMap.of(BorderTopLeftRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderTopRightRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a00ae0dd3338874a49667991edea25", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a00ae0dd3338874a49667991edea25") : JavaOnlyMap.of(BorderTopRightRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderTopStartRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e28691b2ffa40933e5e6d7bb6d28c067", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e28691b2ffa40933e5e6d7bb6d28c067") : JavaOnlyMap.of(BorderTopStartRadius.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99d9f7d799f619be8f021d8be2b0a43", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99d9f7d799f619be8f021d8be2b0a43") : JavaOnlyMap.of("borderWidth", Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitBottom(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8352249a9716949614080e137a8768", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8352249a9716949614080e137a8768") : a("bottom", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7f6b27bb3e83660944b418a0739a4e", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7f6b27bb3e83660944b418a0739a4e") : JavaOnlyMap.of("color", Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitDirection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33a06bbf6c1580b9270eac3d8b731bd", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33a06bbf6c1580b9270eac3d8b731bd") : JavaOnlyMap.of("direction", Direction.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitDisplay(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7111471bd8e1641bc6c4e50a149bea", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7111471bd8e1641bc6c4e50a149bea") : JavaOnlyMap.of("display", Display.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5c6fe206ffeb3006c143984ae4bf7b", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5c6fe206ffeb3006c143984ae4bf7b") : JavaOnlyMap.of("enable", Boolean.valueOf(z));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFlex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c05a148eb5f23611108d81c28c2282", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c05a148eb5f23611108d81c28c2282") : JavaOnlyMap.of("flex", Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFlexDirection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f5459e7006c582b22bf4519426d1e2", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f5459e7006c582b22bf4519426d1e2") : JavaOnlyMap.of(FlexDirection.LOWER_CASE_NAME, FlexDirection.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFlexGrow(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63932951cd948a2e102c498b55d7af9", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63932951cd948a2e102c498b55d7af9") : JavaOnlyMap.of(FlexGrow.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFlexShrink(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d31c0169e05f87dc5cf09097adef9dc", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d31c0169e05f87dc5cf09097adef9dc") : JavaOnlyMap.of(FlexShrink.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFlexWrap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae9864c355cf07d4c4bd77dc8e50c24", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae9864c355cf07d4c4bd77dc8e50c24") : JavaOnlyMap.of(FlexWrap.LOWER_CASE_NAME, FlexWrap.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFontSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a513fb777c62636c3b257aa50570acbd", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a513fb777c62636c3b257aa50570acbd") : JavaOnlyMap.of("fontSize", Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFontStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba5aaac642d950fc6c3dd4268f1c9a3", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba5aaac642d950fc6c3dd4268f1c9a3") : JavaOnlyMap.of("fontStyle", FontStyle.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitFontWeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8933a1a9c46077b59be53016b5b54bc", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8933a1a9c46077b59be53016b5b54bc") : JavaOnlyMap.of(FontWeight.LOWER_CASE_NAME, FontWeight.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitHeight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8328766481aa05a30be68f10f9632b40", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8328766481aa05a30be68f10f9632b40") : a("height", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitIsShow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b754c19e962c1bcef21c39034ad208", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b754c19e962c1bcef21c39034ad208") : JavaOnlyMap.of(IsShow.LOWER_CASE_NAME, Boolean.valueOf(z));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitItemBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29753707029e489676b2b7a844d89b22", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29753707029e489676b2b7a844d89b22") : JavaOnlyMap.of(ItemBackgroundColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitJustifyContent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ecb7004b29b4586047791f1d97f575", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ecb7004b29b4586047791f1d97f575") : JavaOnlyMap.of(JustifyContent.LOWER_CASE_NAME, JustifyContent.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitLeft(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47757717018c943947f87e73220386a4", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47757717018c943947f87e73220386a4") : a("left", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitLetterSpacing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd761289a93a36baab1c087b9d23476", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd761289a93a36baab1c087b9d23476") : JavaOnlyMap.of(LetterSpacing.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitLineHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ba2fddcbec636e8c9158dde3282213", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ba2fddcbec636e8c9158dde3282213") : JavaOnlyMap.of(LineHeight.LOWER_CASE_NAME, Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMargin(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ab2686fa3d417ec2eb4d03f9fb8063", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ab2686fa3d417ec2eb4d03f9fb8063") : a("margin", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginBottom(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17019cf1966061fe621940cd6eb4f37d", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17019cf1966061fe621940cd6eb4f37d") : a(MarginBottom.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginEnd(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088d68b63e62c38221f4d900401c4b4e", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088d68b63e62c38221f4d900401c4b4e") : a(MarginEnd.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginHorizontal(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2ce1a9e8fcc71b4a5b78a1c7238cdc", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2ce1a9e8fcc71b4a5b78a1c7238cdc") : a(MarginHorizontal.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginLeft(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27037726fcf1131edd8b1adb97ad72fc", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27037726fcf1131edd8b1adb97ad72fc") : a(MarginLeft.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginRight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14335f1e4a701851214d901ba89f357", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14335f1e4a701851214d901ba89f357") : a(MarginRight.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginStart(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc105ab8485b64032ce60c19aea6e44", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc105ab8485b64032ce60c19aea6e44") : a(MarginStart.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginTop(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811023dd3c8c1a141ac5dec3834036b0", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811023dd3c8c1a141ac5dec3834036b0") : a(MarginTop.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMarginVertical(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13e6e13355691d8e5aca7a5911fdd75", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13e6e13355691d8e5aca7a5911fdd75") : a(MarginVertical.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMaxHeight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eeee537915270827504e0f4902e272b", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eeee537915270827504e0f4902e272b") : a("maxHeight", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMaxWidth(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046e30556e29062f7c40f0666a679cf1", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046e30556e29062f7c40f0666a679cf1") : a("maxWidth", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMinHeight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4b7f5efc56b3832934e48ddd973387", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4b7f5efc56b3832934e48ddd973387") : a(MinHeight.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitMinWidth(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c5b7856427beb2e4660c193bba57d7", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c5b7856427beb2e4660c193bba57d7") : a(MinWidth.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitOpacity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a889d7d60781d0236fef9d7bdfc3ff", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a889d7d60781d0236fef9d7bdfc3ff") : JavaOnlyMap.of("opacity", Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitOverflow(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97dd0e79600cc10e4a4392c6c2a3de40", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97dd0e79600cc10e4a4392c6c2a3de40") : JavaOnlyMap.of("overflow", Overflow.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPadding(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae67e5aa5bace90b158e8be7cb889a1", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae67e5aa5bace90b158e8be7cb889a1") : a("padding", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingBottom(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b5b135948728b056bc701d4aa6ba6a", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b5b135948728b056bc701d4aa6ba6a") : a("paddingBottom", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingEnd(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558e672d92260d35f86abb537d35f800", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558e672d92260d35f86abb537d35f800") : a(PaddingEnd.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingLeft(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1e0205f3842664927a18934238f777", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1e0205f3842664927a18934238f777") : a("paddingLeft", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingRight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92ce311009f8a67be8a1a10a44b2346", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92ce311009f8a67be8a1a10a44b2346") : a("paddingRight", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingStart(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239335e388dd561fee90e643dfcf6a3b", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239335e388dd561fee90e643dfcf6a3b") : a(PaddingStart.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingTop(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aaede1cb924d10a6c4fa74d23394dfb", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aaede1cb924d10a6c4fa74d23394dfb") : a("paddingTop", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPaddingVertical(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60ec0867ab675a4e03f248f5bb4c241", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60ec0867ab675a4e03f248f5bb4c241") : a(PaddingVertical.LOWER_CASE_NAME, f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fecfdc3f3e80d48cdb7807c0e7e16a72", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fecfdc3f3e80d48cdb7807c0e7e16a72") : JavaOnlyMap.of("position", Position.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitPressedBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae8c1d9e1b7a2d80ecb314cf1bca30d", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae8c1d9e1b7a2d80ecb314cf1bca30d") : JavaOnlyMap.of(PressedBackgroundColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitResizeMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4deb8ed49c8edef27ee036268474de7d", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4deb8ed49c8edef27ee036268474de7d") : JavaOnlyMap.of(ResizeMode.LOWER_CASE_NAME, ResizeMode.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitRight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62004b3c47ada8cb2ae0d5471873bcdb", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62004b3c47ada8cb2ae0d5471873bcdb") : a("right", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitStart(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f756a7cc698abe1addc7d43238f2660", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f756a7cc698abe1addc7d43238f2660") : a("start", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e24de06700ddd95d7fc138a7a221b8", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e24de06700ddd95d7fc138a7a221b8") : JavaOnlyMap.of("text", str);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitTextAlign(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f6ede5bfc082551133274495290d55", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f6ede5bfc082551133274495290d55") : JavaOnlyMap.of(TextAlign.LOWER_CASE_NAME, TextAlign.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitTextShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b15d9e8c3ea65ad175251e518b4d65", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b15d9e8c3ea65ad175251e518b4d65") : JavaOnlyMap.of("textShadowColor", Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitTextShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82d8edfabc33c40c17b1a1545b7523a", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82d8edfabc33c40c17b1a1545b7523a") : JavaOnlyMap.of("textShadowRadius", Float.valueOf(f));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitTextTransform(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd46a241b9209418da10ec16b069739", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd46a241b9209418da10ec16b069739") : JavaOnlyMap.of("textTransform", TextTransform.caseName(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitTintColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd65696d5e947cd02ee86fbfff9207a", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd65696d5e947cd02ee86fbfff9207a") : JavaOnlyMap.of(TintColor.LOWER_CASE_NAME, Integer.valueOf(i));
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitTop(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af847a64d57c5b32dcb68bc7746c612", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af847a64d57c5b32dcb68bc7746c612") : a("top", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitWidth(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe49334fbc331bf286b21a1e4a246d2", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe49334fbc331bf286b21a1e4a246d2") : a("width", f, z);
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cafb12dfda18a38a1396b4f9631d610", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cafb12dfda18a38a1396b4f9631d610") : JavaOnlyMap.of("zIndex", Float.valueOf(f));
    }

    private ReadableMap a(String str, float f, boolean z) {
        Object[] objArr = {str, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04d7c768d7ce57f5e397715f9168e75", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04d7c768d7ce57f5e397715f9168e75");
        }
        if (z) {
            return JavaOnlyMap.of(str, f + "%");
        }
        return JavaOnlyMap.of(str, Float.valueOf(f));
    }
}
