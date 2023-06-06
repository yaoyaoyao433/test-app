package com.dianping.shield.dynamic.diff.module;

import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "T", "Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;", "V", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "id", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseModuleInfoDiff$diffChildren$4 extends i implements b<String, DynamicDiff<ViewInfo>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseModuleInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseModuleInfoDiff$diffChildren$4(BaseModuleInfoDiff baseModuleInfoDiff) {
        super(1);
        this.this$0 = baseModuleInfoDiff;
    }

    @Override // kotlin.jvm.functions.b
    @Nullable
    public final DynamicDiff<ViewInfo> invoke(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc285d63863bd24a8d96ea7eeb7bc47b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc285d63863bd24a8d96ea7eeb7bc47b");
        }
        h.b(str, "id");
        ViewItem viewItem = this.this$0.getDynamicModuleItem().loadingMoreFailedViewItem;
        if (!(viewItem instanceof DynamicViewItem)) {
            viewItem = null;
        }
        DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem;
        if (dynamicViewItem == null || !h.a((Object) dynamicViewItem.getId(), (Object) str)) {
            return null;
        }
        ViewItem viewItem2 = this.this$0.getDynamicModuleItem().loadingMoreFailedViewItem;
        if (viewItem2 != null) {
            return (DynamicViewItem) viewItem2;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.ViewInfo>");
    }
}
