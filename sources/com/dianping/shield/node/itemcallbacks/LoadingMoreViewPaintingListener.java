package com.dianping.shield.node.itemcallbacks;

import com.dianping.agentsdk.framework.l;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "", "onBindViewCalled", "", Constants.EventType.VIEW, "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "data", "status", "Lcom/dianping/agentsdk/framework/CellStatus$LoadingMoreStatus;", "onCreateViewCalled", "createdView", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface LoadingMoreViewPaintingListener {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void onCreateViewCalled(LoadingMoreViewPaintingListener loadingMoreViewPaintingListener, @NotNull ShieldViewHolder shieldViewHolder, @NotNull l.a aVar) {
            Object[] objArr = {loadingMoreViewPaintingListener, shieldViewHolder, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6f456ce538551ac24bc6ae84d6b5b4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6f456ce538551ac24bc6ae84d6b5b4f");
                return;
            }
            h.b(shieldViewHolder, "createdView");
            h.b(aVar, "status");
        }
    }

    void onBindViewCalled(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @NotNull l.a aVar);

    void onCreateViewCalled(@NotNull ShieldViewHolder shieldViewHolder, @NotNull l.a aVar);
}
