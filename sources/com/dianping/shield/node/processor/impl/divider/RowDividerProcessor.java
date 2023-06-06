package com.dianping.shield.node.processor.impl.divider;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import com.dianping.shield.node.DividerThemePackage;
import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.cellnode.DividerConfigInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.useritem.DividerStyle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J(\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/node/processor/impl/divider/RowDividerProcessor;", "Lcom/dianping/shield/node/processor/impl/divider/DividerInfoProcessor;", "dividerThemePackage", "Lcom/dianping/shield/node/DividerThemePackage;", "(Lcom/dianping/shield/node/DividerThemePackage;)V", "addBottomLineCustom", "", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "addDividerInfo", "dividerType", "Lcom/dianping/shield/node/processor/impl/divider/RowDividerProcessor$DividerType;", "addTopLineCustom", "createDrawable", "Landroid/graphics/drawable/Drawable;", "color", "", "handleDividerInfo", "", "data", "pickOffsetRect", "Landroid/graphics/Rect;", "rowRect", "sectionRect", "defaultRect", "DividerType", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowDividerProcessor extends DividerInfoProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final DividerThemePackage dividerThemePackage;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[PositionType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PositionType.FIRST.ordinal()] = 1;
            $EnumSwitchMapping$0[PositionType.MIDDLE.ordinal()] = 2;
            $EnumSwitchMapping$0[PositionType.LAST.ordinal()] = 3;
            $EnumSwitchMapping$0[PositionType.SINGLE.ordinal()] = 4;
            int[] iArr2 = new int[DividerStyle.StyleType.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[DividerStyle.StyleType.TOP.ordinal()] = 1;
            $EnumSwitchMapping$1[DividerStyle.StyleType.MIDDLE.ordinal()] = 2;
            $EnumSwitchMapping$1[DividerStyle.StyleType.BOTTOM.ordinal()] = 3;
            $EnumSwitchMapping$1[DividerStyle.StyleType.SINGLE.ordinal()] = 4;
            $EnumSwitchMapping$1[DividerStyle.StyleType.NONE.ordinal()] = 5;
            int[] iArr3 = new int[DividerType.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[DividerType.TOP.ordinal()] = 1;
            $EnumSwitchMapping$2[DividerType.MIDDLE.ordinal()] = 2;
            $EnumSwitchMapping$2[DividerType.BOTTOM.ordinal()] = 3;
        }
    }

    public RowDividerProcessor(@NotNull DividerThemePackage dividerThemePackage) {
        h.b(dividerThemePackage, "dividerThemePackage");
        Object[] objArr = {dividerThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf1a842fc9b9512cadb919a53a19fdc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf1a842fc9b9512cadb919a53a19fdc8");
        } else {
            this.dividerThemePackage = dividerThemePackage;
        }
    }

    @Override // com.dianping.shield.node.processor.impl.divider.DividerInfoProcessor
    public final boolean handleDividerInfo(@NotNull ShieldDisplayNode shieldDisplayNode) {
        DividerStyle.StyleType styleType;
        ShieldSection shieldSection;
        DividerStyle dividerStyle;
        DividerStyle dividerStyle2;
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ef77f94f7a9c9bb8af9e32e0a91801", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ef77f94f7a9c9bb8af9e32e0a91801")).booleanValue();
        }
        h.b(shieldDisplayNode, "data");
        if (shieldDisplayNode.dividerInfo == null) {
            shieldDisplayNode.dividerInfo = new DividerConfigInfo();
            r rVar = r.a;
        }
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        if (shieldRow == null || (dividerStyle2 = shieldRow.dividerStyle) == null || (styleType = dividerStyle2.styleType) == null) {
            ShieldRow shieldRow2 = shieldDisplayNode.rowParent;
            styleType = (shieldRow2 == null || (shieldSection = shieldRow2.sectionParent) == null || (dividerStyle = shieldSection.dividerStyle) == null) ? null : dividerStyle.styleType;
        }
        if (styleType == null) {
            styleType = DividerStyle.StyleType.AUTO;
        }
        if (!this.dividerThemePackage.enableDivider) {
            styleType = DividerStyle.StyleType.NONE;
        }
        if (styleType == DividerStyle.StyleType.AUTO) {
            switch (WhenMappings.$EnumSwitchMapping$0[shieldDisplayNode.getPositionType().ordinal()]) {
                case 1:
                    styleType = DividerStyle.StyleType.TOP;
                    break;
                case 2:
                    styleType = DividerStyle.StyleType.MIDDLE;
                    break;
                case 3:
                    styleType = DividerStyle.StyleType.BOTTOM;
                    break;
                case 4:
                    styleType = DividerStyle.StyleType.SINGLE;
                    break;
                default:
                    styleType = DividerStyle.StyleType.AUTO;
                    break;
            }
        }
        switch (WhenMappings.$EnumSwitchMapping$1[styleType.ordinal()]) {
            case 1:
                addDividerInfo(shieldDisplayNode, DividerType.TOP);
                addDividerInfo(shieldDisplayNode, DividerType.MIDDLE);
                break;
            case 2:
                addTopLineCustom(shieldDisplayNode);
                addDividerInfo(shieldDisplayNode, DividerType.MIDDLE);
                break;
            case 3:
                addTopLineCustom(shieldDisplayNode);
                addDividerInfo(shieldDisplayNode, DividerType.BOTTOM);
                break;
            case 4:
                addDividerInfo(shieldDisplayNode, DividerType.TOP);
                addDividerInfo(shieldDisplayNode, DividerType.BOTTOM);
                break;
            case 5:
                addTopLineCustom(shieldDisplayNode);
                addBottomLineCustom(shieldDisplayNode);
                break;
        }
        return false;
    }

    private final void addTopLineCustom(ShieldDisplayNode shieldDisplayNode) {
        DividerStyle dividerStyle;
        Integer num;
        DividerStyle dividerStyle2;
        Drawable drawable;
        DividerStyle dividerStyle3;
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c43113d96435d79729c97fd670dc9b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c43113d96435d79729c97fd670dc9b2");
            return;
        }
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        if (shieldRow == null || !shieldRow.showCellTopLineDivider) {
            return;
        }
        DividerConfigInfo dividerConfigInfo = shieldDisplayNode.dividerInfo;
        Drawable drawable2 = null;
        if (dividerConfigInfo != null) {
            ShieldRow shieldRow2 = shieldDisplayNode.rowParent;
            dividerConfigInfo.cellTopLineOffset = (shieldRow2 == null || (dividerStyle3 = shieldRow2.dividerStyle) == null) ? null : dividerStyle3.cellTopLineOffset;
        }
        DividerConfigInfo dividerConfigInfo2 = shieldDisplayNode.dividerInfo;
        if (dividerConfigInfo2 != null) {
            ShieldRow shieldRow3 = shieldDisplayNode.rowParent;
            if (shieldRow3 == null || (dividerStyle2 = shieldRow3.dividerStyle) == null || (drawable = dividerStyle2.cellTopLineDrawable) == null) {
                ShieldRow shieldRow4 = shieldDisplayNode.rowParent;
                if (shieldRow4 != null && (dividerStyle = shieldRow4.dividerStyle) != null && (num = dividerStyle.cellTopLineColor) != null) {
                    drawable2 = createDrawable(num.intValue());
                }
            } else {
                drawable2 = drawable;
            }
            dividerConfigInfo2.cellTopLineDrawable = drawable2;
        }
    }

    private final void addBottomLineCustom(ShieldDisplayNode shieldDisplayNode) {
        DividerStyle dividerStyle;
        Integer num;
        DividerStyle dividerStyle2;
        Drawable drawable;
        DividerStyle dividerStyle3;
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c758400a101e41dec29e9f69681e3612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c758400a101e41dec29e9f69681e3612");
            return;
        }
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        if (shieldRow == null || !shieldRow.showCellBottomLineDivider) {
            return;
        }
        DividerConfigInfo dividerConfigInfo = shieldDisplayNode.dividerInfo;
        Drawable drawable2 = null;
        if (dividerConfigInfo != null) {
            ShieldRow shieldRow2 = shieldDisplayNode.rowParent;
            dividerConfigInfo.cellBottomLineOffset = (shieldRow2 == null || (dividerStyle3 = shieldRow2.dividerStyle) == null) ? null : dividerStyle3.cellBottomLineOffset;
        }
        DividerConfigInfo dividerConfigInfo2 = shieldDisplayNode.dividerInfo;
        if (dividerConfigInfo2 != null) {
            ShieldRow shieldRow3 = shieldDisplayNode.rowParent;
            if (shieldRow3 == null || (dividerStyle2 = shieldRow3.dividerStyle) == null || (drawable = dividerStyle2.cellBottomLineDrawable) == null) {
                ShieldRow shieldRow4 = shieldDisplayNode.rowParent;
                if (shieldRow4 != null && (dividerStyle = shieldRow4.dividerStyle) != null && (num = dividerStyle.cellBottomLineColor) != null) {
                    drawable2 = createDrawable(num.intValue());
                }
            } else {
                drawable2 = drawable;
            }
            dividerConfigInfo2.cellBottomLineDrawable = drawable2;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/node/processor/impl/divider/RowDividerProcessor$DividerType;", "", "(Ljava/lang/String;I)V", "TOP", "MIDDLE", "BOTTOM", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum DividerType {
        TOP,
        MIDDLE,
        BOTTOM;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static DividerType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (DividerType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f90d114e4e570d697c08ec0b3d25766e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f90d114e4e570d697c08ec0b3d25766e") : Enum.valueOf(DividerType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DividerType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (DividerType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bd975b7bf133a243ce8a5f745a4fab6", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bd975b7bf133a243ce8a5f745a4fab6") : values().clone());
        }

        DividerType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28621a97333570d739de985ebc4650e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28621a97333570d739de985ebc4650e8");
            }
        }
    }

    private final void addDividerInfo(ShieldDisplayNode shieldDisplayNode, DividerType dividerType) {
        Drawable createDrawable;
        DividerStyle dividerStyle;
        Integer num;
        ShieldSection shieldSection;
        DividerStyle dividerStyle2;
        Integer num2;
        ShieldSection shieldSection2;
        DividerStyle dividerStyle3;
        ShieldSection shieldSection3;
        DividerStyle dividerStyle4;
        Integer num3;
        ShieldSection shieldSection4;
        DividerStyle dividerStyle5;
        DividerStyle dividerStyle6;
        Integer num4;
        DividerStyle dividerStyle7;
        DividerStyle dividerStyle8;
        ShieldSection shieldSection5;
        DividerStyle dividerStyle9;
        DividerStyle dividerStyle10;
        ShieldSection shieldSection6;
        DividerStyle dividerStyle11;
        DividerStyle dividerStyle12;
        Drawable createDrawable2;
        DividerStyle dividerStyle13;
        Integer num5;
        ShieldSection shieldSection7;
        DividerStyle dividerStyle14;
        Integer num6;
        ShieldSection shieldSection8;
        DividerStyle dividerStyle15;
        ShieldSection shieldSection9;
        DividerStyle dividerStyle16;
        Integer num7;
        ShieldSection shieldSection10;
        DividerStyle dividerStyle17;
        DividerStyle dividerStyle18;
        Integer num8;
        DividerStyle dividerStyle19;
        DividerStyle dividerStyle20;
        ShieldSection shieldSection11;
        DividerStyle dividerStyle21;
        DividerStyle dividerStyle22;
        ShieldSection shieldSection12;
        DividerStyle dividerStyle23;
        DividerStyle dividerStyle24;
        Drawable createDrawable3;
        DividerStyle dividerStyle25;
        Integer num9;
        ShieldSection shieldSection13;
        DividerStyle dividerStyle26;
        Integer num10;
        ShieldSection shieldSection14;
        DividerStyle dividerStyle27;
        ShieldSection shieldSection15;
        DividerStyle dividerStyle28;
        Integer num11;
        ShieldSection shieldSection16;
        DividerStyle dividerStyle29;
        DividerStyle dividerStyle30;
        Integer num12;
        DividerStyle dividerStyle31;
        DividerStyle dividerStyle32;
        ShieldSection shieldSection17;
        DividerStyle dividerStyle33;
        DividerStyle dividerStyle34;
        ShieldSection shieldSection18;
        DividerStyle dividerStyle35;
        DividerStyle dividerStyle36;
        Object[] objArr = {shieldDisplayNode, dividerType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49a8f28669a145556c0be4657cab6d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49a8f28669a145556c0be4657cab6d88");
            return;
        }
        Drawable drawable = null;
        switch (WhenMappings.$EnumSwitchMapping$2[dividerType.ordinal()]) {
            case 1:
                ShieldRow shieldRow = shieldDisplayNode.rowParent;
                if (shieldRow == null || !shieldRow.showCellTopLineDivider) {
                    return;
                }
                DividerConfigInfo dividerConfigInfo = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo != null) {
                    ShieldRow shieldRow2 = shieldDisplayNode.rowParent;
                    Rect rect = (shieldRow2 == null || (dividerStyle12 = shieldRow2.dividerStyle) == null) ? null : dividerStyle12.cellTopLineOffset;
                    ShieldRow shieldRow3 = shieldDisplayNode.rowParent;
                    Rect pickOffsetRect = pickOffsetRect(rect, (shieldRow3 == null || (shieldSection6 = shieldRow3.sectionParent) == null || (dividerStyle11 = shieldSection6.dividerStyle) == null) ? null : dividerStyle11.cellTopLineOffset, this.dividerThemePackage.defaultSectionDividerOffset);
                    if (pickOffsetRect == null) {
                        ShieldRow shieldRow4 = shieldDisplayNode.rowParent;
                        Rect rect2 = (shieldRow4 == null || (dividerStyle10 = shieldRow4.dividerStyle) == null) ? null : dividerStyle10.topStyleLineOffset;
                        ShieldRow shieldRow5 = shieldDisplayNode.rowParent;
                        pickOffsetRect = pickOffsetRect(rect2, (shieldRow5 == null || (shieldSection5 = shieldRow5.sectionParent) == null || (dividerStyle9 = shieldSection5.dividerStyle) == null) ? null : dividerStyle9.topStyleLineOffset, this.dividerThemePackage.defaultSectionDividerOffset);
                    }
                    if (pickOffsetRect == null) {
                        pickOffsetRect = this.dividerThemePackage.defaultSectionDividerOffset;
                    }
                    dividerConfigInfo.cellTopLineOffset = pickOffsetRect;
                }
                DividerConfigInfo dividerConfigInfo2 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo2 != null) {
                    ShieldRow shieldRow6 = shieldDisplayNode.rowParent;
                    if (shieldRow6 == null || (dividerStyle8 = shieldRow6.dividerStyle) == null || (createDrawable = dividerStyle8.cellTopLineDrawable) == null) {
                        ShieldRow shieldRow7 = shieldDisplayNode.rowParent;
                        createDrawable = (shieldRow7 == null || (dividerStyle = shieldRow7.dividerStyle) == null || (num = dividerStyle.cellTopLineColor) == null) ? null : createDrawable(num.intValue());
                    }
                    if (createDrawable == null) {
                        ShieldRow shieldRow8 = shieldDisplayNode.rowParent;
                        createDrawable = (shieldRow8 == null || (dividerStyle7 = shieldRow8.dividerStyle) == null) ? null : dividerStyle7.topStyleLineDrawable;
                    }
                    if (createDrawable == null) {
                        ShieldRow shieldRow9 = shieldDisplayNode.rowParent;
                        createDrawable = (shieldRow9 == null || (dividerStyle6 = shieldRow9.dividerStyle) == null || (num4 = dividerStyle6.topStyleLineColor) == null) ? null : createDrawable(num4.intValue());
                    }
                    if (createDrawable == null) {
                        ShieldRow shieldRow10 = shieldDisplayNode.rowParent;
                        createDrawable = (shieldRow10 == null || (shieldSection4 = shieldRow10.sectionParent) == null || (dividerStyle5 = shieldSection4.dividerStyle) == null) ? null : dividerStyle5.cellTopLineDrawable;
                    }
                    if (createDrawable == null) {
                        ShieldRow shieldRow11 = shieldDisplayNode.rowParent;
                        createDrawable = (shieldRow11 == null || (shieldSection3 = shieldRow11.sectionParent) == null || (dividerStyle4 = shieldSection3.dividerStyle) == null || (num3 = dividerStyle4.cellTopLineColor) == null) ? null : createDrawable(num3.intValue());
                    }
                    if (createDrawable == null) {
                        ShieldRow shieldRow12 = shieldDisplayNode.rowParent;
                        createDrawable = (shieldRow12 == null || (shieldSection2 = shieldRow12.sectionParent) == null || (dividerStyle3 = shieldSection2.dividerStyle) == null) ? null : dividerStyle3.topStyleLineDrawable;
                    }
                    if (createDrawable == null) {
                        ShieldRow shieldRow13 = shieldDisplayNode.rowParent;
                        if (shieldRow13 != null && (shieldSection = shieldRow13.sectionParent) != null && (dividerStyle2 = shieldSection.dividerStyle) != null && (num2 = dividerStyle2.topStyleLineColor) != null) {
                            drawable = createDrawable(num2.intValue());
                        }
                    } else {
                        drawable = createDrawable;
                    }
                    if (drawable == null) {
                        drawable = this.dividerThemePackage.defaultSectionTopDivider;
                    }
                    if (drawable == null) {
                        drawable = this.dividerThemePackage.defaultSectionDivider;
                    }
                    dividerConfigInfo2.cellTopLineDrawable = drawable;
                    return;
                }
                return;
            case 2:
                ShieldRow shieldRow14 = shieldDisplayNode.rowParent;
                if (shieldRow14 == null || !shieldRow14.showCellBottomLineDivider) {
                    return;
                }
                DividerConfigInfo dividerConfigInfo3 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo3 != null) {
                    ShieldRow shieldRow15 = shieldDisplayNode.rowParent;
                    Rect rect3 = (shieldRow15 == null || (dividerStyle24 = shieldRow15.dividerStyle) == null) ? null : dividerStyle24.cellBottomLineOffset;
                    ShieldRow shieldRow16 = shieldDisplayNode.rowParent;
                    Rect pickOffsetRect2 = pickOffsetRect(rect3, (shieldRow16 == null || (shieldSection12 = shieldRow16.sectionParent) == null || (dividerStyle23 = shieldSection12.dividerStyle) == null) ? null : dividerStyle23.cellBottomLineOffset, this.dividerThemePackage.defaultDividerOffset);
                    if (pickOffsetRect2 == null) {
                        ShieldRow shieldRow17 = shieldDisplayNode.rowParent;
                        Rect rect4 = (shieldRow17 == null || (dividerStyle22 = shieldRow17.dividerStyle) == null) ? null : dividerStyle22.middleStyleLineOffset;
                        ShieldRow shieldRow18 = shieldDisplayNode.rowParent;
                        pickOffsetRect2 = pickOffsetRect(rect4, (shieldRow18 == null || (shieldSection11 = shieldRow18.sectionParent) == null || (dividerStyle21 = shieldSection11.dividerStyle) == null) ? null : dividerStyle21.middleStyleLineOffset, this.dividerThemePackage.defaultDividerOffset);
                    }
                    if (pickOffsetRect2 == null) {
                        pickOffsetRect2 = this.dividerThemePackage.defaultDividerOffset;
                    }
                    dividerConfigInfo3.cellBottomLineOffset = pickOffsetRect2;
                }
                DividerConfigInfo dividerConfigInfo4 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo4 != null) {
                    ShieldRow shieldRow19 = shieldDisplayNode.rowParent;
                    if (shieldRow19 == null || (dividerStyle20 = shieldRow19.dividerStyle) == null || (createDrawable2 = dividerStyle20.cellBottomLineDrawable) == null) {
                        ShieldRow shieldRow20 = shieldDisplayNode.rowParent;
                        createDrawable2 = (shieldRow20 == null || (dividerStyle13 = shieldRow20.dividerStyle) == null || (num5 = dividerStyle13.cellBottomLineColor) == null) ? null : createDrawable(num5.intValue());
                    }
                    if (createDrawable2 == null) {
                        ShieldRow shieldRow21 = shieldDisplayNode.rowParent;
                        createDrawable2 = (shieldRow21 == null || (dividerStyle19 = shieldRow21.dividerStyle) == null) ? null : dividerStyle19.middleStyleLineDrawable;
                    }
                    if (createDrawable2 == null) {
                        ShieldRow shieldRow22 = shieldDisplayNode.rowParent;
                        createDrawable2 = (shieldRow22 == null || (dividerStyle18 = shieldRow22.dividerStyle) == null || (num8 = dividerStyle18.middleStyleLineColor) == null) ? null : createDrawable(num8.intValue());
                    }
                    if (createDrawable2 == null) {
                        ShieldRow shieldRow23 = shieldDisplayNode.rowParent;
                        createDrawable2 = (shieldRow23 == null || (shieldSection10 = shieldRow23.sectionParent) == null || (dividerStyle17 = shieldSection10.dividerStyle) == null) ? null : dividerStyle17.cellBottomLineDrawable;
                    }
                    if (createDrawable2 == null) {
                        ShieldRow shieldRow24 = shieldDisplayNode.rowParent;
                        createDrawable2 = (shieldRow24 == null || (shieldSection9 = shieldRow24.sectionParent) == null || (dividerStyle16 = shieldSection9.dividerStyle) == null || (num7 = dividerStyle16.cellBottomLineColor) == null) ? null : createDrawable(num7.intValue());
                    }
                    if (createDrawable2 == null) {
                        ShieldRow shieldRow25 = shieldDisplayNode.rowParent;
                        createDrawable2 = (shieldRow25 == null || (shieldSection8 = shieldRow25.sectionParent) == null || (dividerStyle15 = shieldSection8.dividerStyle) == null) ? null : dividerStyle15.middleStyleLineDrawable;
                    }
                    if (createDrawable2 == null) {
                        ShieldRow shieldRow26 = shieldDisplayNode.rowParent;
                        if (shieldRow26 != null && (shieldSection7 = shieldRow26.sectionParent) != null && (dividerStyle14 = shieldSection7.dividerStyle) != null && (num6 = dividerStyle14.middleStyleLineColor) != null) {
                            drawable = createDrawable(num6.intValue());
                        }
                    } else {
                        drawable = createDrawable2;
                    }
                    if (drawable == null) {
                        drawable = this.dividerThemePackage.defaultDivider;
                    }
                    dividerConfigInfo4.cellBottomLineDrawable = drawable;
                    return;
                }
                return;
            case 3:
                ShieldRow shieldRow27 = shieldDisplayNode.rowParent;
                if (shieldRow27 == null || !shieldRow27.showCellBottomLineDivider) {
                    return;
                }
                DividerConfigInfo dividerConfigInfo5 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo5 != null) {
                    ShieldRow shieldRow28 = shieldDisplayNode.rowParent;
                    Rect rect5 = (shieldRow28 == null || (dividerStyle36 = shieldRow28.dividerStyle) == null) ? null : dividerStyle36.cellBottomLineOffset;
                    ShieldRow shieldRow29 = shieldDisplayNode.rowParent;
                    Rect pickOffsetRect3 = pickOffsetRect(rect5, (shieldRow29 == null || (shieldSection18 = shieldRow29.sectionParent) == null || (dividerStyle35 = shieldSection18.dividerStyle) == null) ? null : dividerStyle35.cellBottomLineOffset, this.dividerThemePackage.defaultSectionDividerOffset);
                    if (pickOffsetRect3 == null) {
                        ShieldRow shieldRow30 = shieldDisplayNode.rowParent;
                        Rect rect6 = (shieldRow30 == null || (dividerStyle34 = shieldRow30.dividerStyle) == null) ? null : dividerStyle34.bottomStyleLineOffset;
                        ShieldRow shieldRow31 = shieldDisplayNode.rowParent;
                        pickOffsetRect3 = pickOffsetRect(rect6, (shieldRow31 == null || (shieldSection17 = shieldRow31.sectionParent) == null || (dividerStyle33 = shieldSection17.dividerStyle) == null) ? null : dividerStyle33.bottomStyleLineOffset, this.dividerThemePackage.defaultSectionDividerOffset);
                    }
                    if (pickOffsetRect3 == null) {
                        pickOffsetRect3 = this.dividerThemePackage.defaultSectionDividerOffset;
                    }
                    dividerConfigInfo5.cellBottomLineOffset = pickOffsetRect3;
                }
                DividerConfigInfo dividerConfigInfo6 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo6 != null) {
                    ShieldRow shieldRow32 = shieldDisplayNode.rowParent;
                    if (shieldRow32 == null || (dividerStyle32 = shieldRow32.dividerStyle) == null || (createDrawable3 = dividerStyle32.cellBottomLineDrawable) == null) {
                        ShieldRow shieldRow33 = shieldDisplayNode.rowParent;
                        createDrawable3 = (shieldRow33 == null || (dividerStyle25 = shieldRow33.dividerStyle) == null || (num9 = dividerStyle25.cellBottomLineColor) == null) ? null : createDrawable(num9.intValue());
                    }
                    if (createDrawable3 == null) {
                        ShieldRow shieldRow34 = shieldDisplayNode.rowParent;
                        createDrawable3 = (shieldRow34 == null || (dividerStyle31 = shieldRow34.dividerStyle) == null) ? null : dividerStyle31.bottomStyleLineDrawable;
                    }
                    if (createDrawable3 == null) {
                        ShieldRow shieldRow35 = shieldDisplayNode.rowParent;
                        createDrawable3 = (shieldRow35 == null || (dividerStyle30 = shieldRow35.dividerStyle) == null || (num12 = dividerStyle30.bottomStyleLineColor) == null) ? null : createDrawable(num12.intValue());
                    }
                    if (createDrawable3 == null) {
                        ShieldRow shieldRow36 = shieldDisplayNode.rowParent;
                        createDrawable3 = (shieldRow36 == null || (shieldSection16 = shieldRow36.sectionParent) == null || (dividerStyle29 = shieldSection16.dividerStyle) == null) ? null : dividerStyle29.cellBottomLineDrawable;
                    }
                    if (createDrawable3 == null) {
                        ShieldRow shieldRow37 = shieldDisplayNode.rowParent;
                        createDrawable3 = (shieldRow37 == null || (shieldSection15 = shieldRow37.sectionParent) == null || (dividerStyle28 = shieldSection15.dividerStyle) == null || (num11 = dividerStyle28.cellBottomLineColor) == null) ? null : createDrawable(num11.intValue());
                    }
                    if (createDrawable3 == null) {
                        ShieldRow shieldRow38 = shieldDisplayNode.rowParent;
                        createDrawable3 = (shieldRow38 == null || (shieldSection14 = shieldRow38.sectionParent) == null || (dividerStyle27 = shieldSection14.dividerStyle) == null) ? null : dividerStyle27.bottomStyleLineDrawable;
                    }
                    if (createDrawable3 == null) {
                        ShieldRow shieldRow39 = shieldDisplayNode.rowParent;
                        if (shieldRow39 != null && (shieldSection13 = shieldRow39.sectionParent) != null && (dividerStyle26 = shieldSection13.dividerStyle) != null && (num10 = dividerStyle26.bottomStyleLineColor) != null) {
                            drawable = createDrawable(num10.intValue());
                        }
                    } else {
                        drawable = createDrawable3;
                    }
                    if (drawable == null) {
                        drawable = this.dividerThemePackage.defaultSectionBottomDivider;
                    }
                    if (drawable == null) {
                        drawable = this.dividerThemePackage.defaultSectionDivider;
                    }
                    dividerConfigInfo6.cellBottomLineDrawable = drawable;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final Drawable createDrawable(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4370ef4cab6aac7a2a81ce407ee5bb22", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4370ef4cab6aac7a2a81ce407ee5bb22");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), 1);
        return gradientDrawable;
    }

    private final Rect pickOffsetRect(Rect rect, Rect rect2, Rect rect3) {
        Rect adjustNegativeValueBy;
        Rect adjustNegativeValueBy2;
        Object[] objArr = {rect, rect2, rect3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f929938faa3f8ec34509ea00e707ef2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f929938faa3f8ec34509ea00e707ef2");
        }
        if (rect == null || (adjustNegativeValueBy = RowDividerProcessorKt.adjustNegativeValueBy(rect, rect2)) == null || (adjustNegativeValueBy2 = RowDividerProcessorKt.adjustNegativeValueBy(adjustNegativeValueBy, rect3)) == null) {
            if (rect2 != null) {
                return RowDividerProcessorKt.adjustNegativeValueBy(rect2, rect3);
            }
            return null;
        }
        return adjustNegativeValueBy2;
    }
}
