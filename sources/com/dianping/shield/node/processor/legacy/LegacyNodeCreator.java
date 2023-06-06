package com.dianping.shield.node.processor.legacy;

import android.content.Context;
import android.view.View;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/LegacyNodeCreator;", "", "()V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyNodeCreator {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @JvmStatic
    @NotNull
    public static final ViewItem createLoadingViewItem(@NotNull Context context, @NotNull View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e70a4a3b7c79ed175efb534f26787ee", RobustBitConfig.DEFAULT_VALUE) ? (ViewItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e70a4a3b7c79ed175efb534f26787ee") : Companion.createLoadingViewItem(context, view);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/LegacyNodeCreator$Companion;", "", "()V", "createLoadingViewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "context", "Landroid/content/Context;", Constants.EventType.VIEW, "Landroid/view/View;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ViewItem createLoadingViewItem(@NotNull Context context, @NotNull View view) {
            Object[] objArr = {context, view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88189c02c172440df4b6b4018b4cb470", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88189c02c172440df4b6b4018b4cb470");
            }
            h.b(context, "context");
            h.b(view, Constants.EventType.VIEW);
            ViewItem viewItem = new ViewItem();
            viewItem.viewType = NodeCreator.LOADING_TYPE_CUSTOM;
            return viewItem;
        }
    }
}
