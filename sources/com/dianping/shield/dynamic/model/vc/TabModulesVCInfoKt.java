package com.dianping.shield.dynamic.model.vc;

import android.os.Bundle;
import com.dianping.shield.dynamic.model.extra.MPTInfo;
import com.dianping.shield.dynamic.model.extra.MPTInfoKt;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b¨\u0006\u0003"}, d2 = {"toBundle", "Landroid/os/Bundle;", "Lcom/dianping/shield/dynamic/model/vc/TabModulesVCInfo;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabModulesVCInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public static final Bundle toBundle(@NotNull TabModulesVCInfo tabModulesVCInfo) {
        Object[] objArr = {tabModulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b50ab5f24ae89f4ff1bffc4beb522d34", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b50ab5f24ae89f4ff1bffc4beb522d34");
        }
        h.b(tabModulesVCInfo, "receiver$0");
        Bundle bundle = new Bundle();
        ModulesVCSettingInfo settingInfo = tabModulesVCInfo.getSettingInfo();
        if (settingInfo != null) {
            ModulesVCSettingInfoKt.addToBundle(settingInfo, bundle);
        }
        SeparatorLineInfo separatorLineInfo = tabModulesVCInfo.getSeparatorLineInfo();
        if (separatorLineInfo != null) {
            SeparatorLineInfoKt.addToBundle(separatorLineInfo, bundle);
        }
        DragRefreshInfo dragRefreshInfo = tabModulesVCInfo.getDragRefreshInfo();
        if (dragRefreshInfo != null) {
            DragRefreshInfoKt.addToBundle(dragRefreshInfo, bundle);
        }
        String backgroundColor = tabModulesVCInfo.getBackgroundColor();
        if (backgroundColor != null) {
            bundle.putString("backgroundColor", backgroundColor);
        }
        String pageBackgroundColor = tabModulesVCInfo.getPageBackgroundColor();
        if (pageBackgroundColor != null) {
            bundle.putString("pageBackgroundColor", pageBackgroundColor);
        }
        MPTInfo mptInfo = tabModulesVCInfo.getMptInfo();
        if (mptInfo != null) {
            MPTInfoKt.addToBundle(mptInfo, bundle);
        }
        Integer cancelPullToRefreshThreshold = tabModulesVCInfo.getCancelPullToRefreshThreshold();
        if (cancelPullToRefreshThreshold != null) {
            bundle.putInt(DMKeys.KEY_CANCEL_PULL_TO_REFRESH_THRESHOLD, cancelPullToRefreshThreshold.intValue());
        }
        Boolean enableBounce = tabModulesVCInfo.getEnableBounce();
        if (enableBounce != null) {
            bundle.putBoolean(DMKeys.KEY_ENABLE_BOUNCE, enableBounce.booleanValue());
        }
        Boolean showScrollIndicator = tabModulesVCInfo.getShowScrollIndicator();
        if (showScrollIndicator != null) {
            bundle.putBoolean(DMKeys.KEY_SHOW_SCROLL_INDICATOR, showScrollIndicator.booleanValue());
        }
        return bundle;
    }
}
