package com.dianping.shield.bridge.feature;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/bridge/feature/CellManagerCommonFunctionInterface;", "Lcom/dianping/shield/bridge/feature/AgentGlobalPositionInterface;", "Lcom/dianping/shield/bridge/feature/AgentScrollerInterface;", "convertCellInterfaceToItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "getMaxTopViewY", "", "setDisableDecoration", "", "disableDecoration", "", "setPageName", "pageName", "", "setShieldGAInfo", "shieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface CellManagerCommonFunctionInterface extends AgentGlobalPositionInterface, AgentScrollerInterface {
    @Nullable
    ShieldSectionCellItem convertCellInterfaceToItem(@NotNull af afVar);

    int getMaxTopViewY();

    void setDisableDecoration(boolean z);

    void setPageName(@NotNull String str);

    void setShieldGAInfo(@NotNull ShieldGAInfo shieldGAInfo);
}
