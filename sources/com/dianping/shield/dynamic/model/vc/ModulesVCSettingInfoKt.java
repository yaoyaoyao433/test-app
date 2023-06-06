package com.dianping.shield.dynamic.model.vc;

import android.os.Bundle;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"addToBundle", "", "Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "bundle", "Landroid/os/Bundle;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ModulesVCSettingInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void addToBundle(@NotNull ModulesVCSettingInfo modulesVCSettingInfo, @NotNull Bundle bundle) {
        Object[] objArr = {modulesVCSettingInfo, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5e77033d36d17cd1649ae78abbe8b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5e77033d36d17cd1649ae78abbe8b3f");
            return;
        }
        h.b(modulesVCSettingInfo, "receiver$0");
        h.b(bundle, "bundle");
        Integer leftMargin = modulesVCSettingInfo.getLeftMargin();
        if (leftMargin != null) {
            bundle.putInt("leftMargin", leftMargin.intValue());
        }
        Integer rightMargin = modulesVCSettingInfo.getRightMargin();
        if (rightMargin != null) {
            bundle.putInt("rightMargin", rightMargin.intValue());
        }
        Integer sectionHeaderHeight = modulesVCSettingInfo.getSectionHeaderHeight();
        if (sectionHeaderHeight != null) {
            bundle.putInt("sectionHeaderHeight", sectionHeaderHeight.intValue());
        }
        Integer sectionFooterHeight = modulesVCSettingInfo.getSectionFooterHeight();
        if (sectionFooterHeight != null) {
            bundle.putInt("sectionFooterHeight", sectionFooterHeight.intValue());
        }
        Integer heightForExtraFirstSectionHeader = modulesVCSettingInfo.getHeightForExtraFirstSectionHeader();
        if (heightForExtraFirstSectionHeader != null) {
            bundle.putInt("heightForExtraFirstSectionHeader", heightForExtraFirstSectionHeader.intValue());
        }
        Integer heightForExtraLastSectionFooter = modulesVCSettingInfo.getHeightForExtraLastSectionFooter();
        if (heightForExtraLastSectionFooter != null) {
            bundle.putInt("heightForExtraLastSectionFooter", heightForExtraLastSectionFooter.intValue());
        }
        Integer linkType = modulesVCSettingInfo.getLinkType();
        if (linkType != null) {
            bundle.putInt("linkType", linkType.intValue());
        }
        Integer autoTopHoverOffset = modulesVCSettingInfo.getAutoTopHoverOffset();
        if (autoTopHoverOffset != null) {
            bundle.putInt("autoTopHoverOffset", autoTopHoverOffset.intValue());
        }
        Integer autoExposeViewType = modulesVCSettingInfo.getAutoExposeViewType();
        if (autoExposeViewType != null) {
            bundle.putInt(DMKeys.KEY_AUTO_EXPOSE_VIEW_TYPE, autoExposeViewType.intValue());
        }
        Boolean reserveUnUsedModule = modulesVCSettingInfo.getReserveUnUsedModule();
        if (reserveUnUsedModule != null) {
            bundle.putBoolean("reserveUnUsedModule", reserveUnUsedModule.booleanValue());
        }
    }
}
