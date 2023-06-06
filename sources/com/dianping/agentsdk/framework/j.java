package com.dianping.agentsdk.framework;

import android.view.ViewGroup;
import com.dianping.shield.framework.PageContainerLayoutModeInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000f\b\u0000\u0010\u0001 \u0001*\u00070\u0002¢\u0006\u0002\b\u00032\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J\\\u0010\u0010\u001a\u00020\u00062\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u00132\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0013H&¨\u0006\u0016"}, d2 = {"Lcom/dianping/agentsdk/framework/CellManagerInterface;", "T", "Landroid/view/ViewGroup;", "Lkotlin/jvm/JvmWildcard;", "", "notifyCellChanged", "", "setAgentContainerView", "containerView", "(Landroid/view/ViewGroup;)V", "setLayoutModeController", "pageContainerLayoutModeInterface", "Lcom/dianping/shield/framework/PageContainerLayoutModeInterface;", "updateAgentCell", "agent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "updateCells", "addList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "updateList", "deleteList", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface j<T extends ViewGroup> {
    void notifyCellChanged();

    void setAgentContainerView(@NotNull T t);

    void setLayoutModeController(@Nullable PageContainerLayoutModeInterface pageContainerLayoutModeInterface);

    void updateAgentCell(@NotNull AgentInterface agentInterface);

    void updateCells(@Nullable ArrayList<AgentInterface> arrayList, @Nullable ArrayList<AgentInterface> arrayList2, @Nullable ArrayList<AgentInterface> arrayList3);
}
