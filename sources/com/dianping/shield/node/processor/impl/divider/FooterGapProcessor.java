package com.dianping.shield.node.processor.impl.divider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.dianping.shield.node.DividerThemePackage;
import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.cellnode.DividerConfigInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/processor/impl/divider/FooterGapProcessor;", "Lcom/dianping/shield/node/processor/impl/divider/DividerInfoProcessor;", "context", "Landroid/content/Context;", "dividerThemePackage", "Lcom/dianping/shield/node/DividerThemePackage;", "(Landroid/content/Context;Lcom/dianping/shield/node/DividerThemePackage;)V", "handleDividerInfo", "", "data", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class FooterGapProcessor extends DividerInfoProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context context;
    private final DividerThemePackage dividerThemePackage;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[PositionType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PositionType.LAST.ordinal()] = 1;
            $EnumSwitchMapping$0[PositionType.SINGLE.ordinal()] = 2;
            $EnumSwitchMapping$0[PositionType.FIRST.ordinal()] = 3;
            $EnumSwitchMapping$0[PositionType.MIDDLE.ordinal()] = 4;
        }
    }

    public FooterGapProcessor(@NotNull Context context, @NotNull DividerThemePackage dividerThemePackage) {
        h.b(context, "context");
        h.b(dividerThemePackage, "dividerThemePackage");
        Object[] objArr = {context, dividerThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f606c3c18fdfecc0ac331af8abfda51c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f606c3c18fdfecc0ac331af8abfda51c");
            return;
        }
        this.context = context;
        this.dividerThemePackage = dividerThemePackage;
    }

    @Override // com.dianping.shield.node.processor.impl.divider.DividerInfoProcessor
    public final boolean handleDividerInfo(@NotNull ShieldDisplayNode shieldDisplayNode) {
        ShieldSection shieldSection;
        ShieldViewCell shieldViewCell;
        Drawable drawable;
        ShieldSection shieldSection2;
        Drawable drawable2;
        ShieldSection shieldSection3;
        ShieldViewCell shieldViewCell2;
        ShieldSection shieldSection4;
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "726bbca9727db37d4eaa330773881f68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "726bbca9727db37d4eaa330773881f68")).booleanValue();
        }
        h.b(shieldDisplayNode, "data");
        if (shieldDisplayNode.dividerInfo == null) {
            shieldDisplayNode.dividerInfo = new DividerConfigInfo();
            r rVar = r.a;
        }
        r rVar2 = null;
        switch (WhenMappings.$EnumSwitchMapping$0[shieldDisplayNode.getPositionType().ordinal()]) {
            case 1:
            case 2:
                ShieldRow shieldRow = shieldDisplayNode.rowParent;
                int i = -1;
                int i2 = (shieldRow == null || (shieldSection4 = shieldRow.sectionParent) == null) ? -1 : shieldSection4.sectionFooterHeight;
                ShieldRow shieldRow2 = shieldDisplayNode.rowParent;
                if (shieldRow2 != null && (shieldSection3 = shieldRow2.sectionParent) != null && (shieldViewCell2 = shieldSection3.cellParent) != null) {
                    i = shieldViewCell2.sectionFooterHeight;
                }
                if (i2 >= 0) {
                    DividerConfigInfo dividerConfigInfo = shieldDisplayNode.dividerInfo;
                    if (dividerConfigInfo != null) {
                        dividerConfigInfo.footerGapHeight = i2;
                    }
                } else if (i >= 0) {
                    DividerConfigInfo dividerConfigInfo2 = shieldDisplayNode.dividerInfo;
                    if (dividerConfigInfo2 != null) {
                        dividerConfigInfo2.footerGapHeight = i;
                    }
                } else {
                    DividerConfigInfo dividerConfigInfo3 = shieldDisplayNode.dividerInfo;
                    if (dividerConfigInfo3 != null) {
                        dividerConfigInfo3.footerGapHeight = this.dividerThemePackage.defaultFooterHeight;
                    }
                }
                ShieldRow shieldRow3 = shieldDisplayNode.rowParent;
                if (shieldRow3 == null || (shieldSection2 = shieldRow3.sectionParent) == null || (drawable2 = shieldSection2.sectionFooterDrawable) == null) {
                    ShieldRow shieldRow4 = shieldDisplayNode.rowParent;
                    if (shieldRow4 != null && (shieldSection = shieldRow4.sectionParent) != null && (shieldViewCell = shieldSection.cellParent) != null && (drawable = shieldViewCell.sectionFooterDrawable) != null) {
                        DividerConfigInfo dividerConfigInfo4 = shieldDisplayNode.dividerInfo;
                        if (dividerConfigInfo4 != null) {
                            dividerConfigInfo4.footerGapDrawable = drawable;
                        }
                        rVar2 = r.a;
                    }
                } else {
                    DividerConfigInfo dividerConfigInfo5 = shieldDisplayNode.dividerInfo;
                    if (dividerConfigInfo5 != null) {
                        dividerConfigInfo5.footerGapDrawable = drawable2;
                    }
                    rVar2 = r.a;
                }
                if (rVar2 == null) {
                    if (this.dividerThemePackage.defaultFooterDrawable != null) {
                        DividerConfigInfo dividerConfigInfo6 = shieldDisplayNode.dividerInfo;
                        if (dividerConfigInfo6 != null) {
                            dividerConfigInfo6.footerGapDrawable = this.dividerThemePackage.defaultFooterDrawable;
                        }
                    } else {
                        DividerConfigInfo dividerConfigInfo7 = shieldDisplayNode.dividerInfo;
                        if (dividerConfigInfo7 != null) {
                            dividerConfigInfo7.footerGapDrawable = this.dividerThemePackage.defaultSpaceDrawable;
                        }
                    }
                    r rVar3 = r.a;
                    break;
                }
                break;
            case 3:
            case 4:
                DividerConfigInfo dividerConfigInfo8 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo8 != null) {
                    dividerConfigInfo8.footerGapHeight = 0;
                }
                DividerConfigInfo dividerConfigInfo9 = shieldDisplayNode.dividerInfo;
                if (dividerConfigInfo9 != null) {
                    dividerConfigInfo9.footerGapDrawable = null;
                    break;
                }
                break;
        }
        return false;
    }
}
