package com.dianping.shield.node.processor.legacy;

import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.o;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/LegacyLoadingMoreListener;", "Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "sci", "Lcom/dianping/agentsdk/framework/CellStatusMoreInterface;", "(Lcom/dianping/agentsdk/framework/CellStatusMoreInterface;)V", "onBindViewCalled", "", Constants.EventType.VIEW, "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "data", "", "status", "Lcom/dianping/agentsdk/framework/CellStatus$LoadingMoreStatus;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyLoadingMoreListener implements LoadingMoreViewPaintingListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final o sci;

    public LegacyLoadingMoreListener(@NotNull o oVar) {
        h.b(oVar, "sci");
        Object[] objArr = {oVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5645f9a7fc969c339530e3a88c32eea7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5645f9a7fc969c339530e3a88c32eea7");
        } else {
            this.sci = oVar;
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener
    public final void onCreateViewCalled(@NotNull ShieldViewHolder shieldViewHolder, @NotNull l.a aVar) {
        Object[] objArr = {shieldViewHolder, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b9154d6e6d9ab810b54c257a20b413c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b9154d6e6d9ab810b54c257a20b413c");
            return;
        }
        h.b(shieldViewHolder, "createdView");
        h.b(aVar, "status");
        LoadingMoreViewPaintingListener.DefaultImpls.onCreateViewCalled(this, shieldViewHolder, aVar);
    }

    @Override // com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener
    public final void onBindViewCalled(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @NotNull l.a aVar) {
        Object[] objArr = {shieldViewHolder, obj, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f906c41b22c99a0b1c8532168691ae28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f906c41b22c99a0b1c8532168691ae28");
            return;
        }
        h.b(shieldViewHolder, Constants.EventType.VIEW);
        h.b(aVar, "status");
        this.sci.onBindView(aVar);
    }
}
