package com.dianping.shield.dynamic.items.paintingcallback;

import android.content.Context;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewOverScreenPaintingCallBack;", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "dynamicPaitingInterface", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "needSetMargin", "", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;Z)V", "createViewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicViewOverScreenPaintingCallBack extends DynamicViewPaintingCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    public /* synthetic */ DynamicViewOverScreenPaintingCallBack(DynamicChassisInterface dynamicChassisInterface, DynamicPaitingInterface dynamicPaitingInterface, boolean z, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? null : dynamicPaitingInterface, (i & 4) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicViewOverScreenPaintingCallBack(@NotNull DynamicChassisInterface dynamicChassisInterface, @Nullable DynamicPaitingInterface dynamicPaitingInterface, boolean z) {
        super(dynamicChassisInterface, dynamicPaitingInterface, z);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface, dynamicPaitingInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ed8871f41590397ce9da73b2c18bdf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ed8871f41590397ce9da73b2c18bdf7");
        }
    }

    @Override // com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback, com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7be81cda5353140091215fbe642272ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7be81cda5353140091215fbe642272ba");
        }
        h.b(context, "context");
        DynamicViewHolder dynamicViewHolder = new DynamicViewHolder(new DynamicOverScreenWrapperView(context));
        dynamicViewHolder.setParentView(viewGroup);
        return dynamicViewHolder;
    }
}
