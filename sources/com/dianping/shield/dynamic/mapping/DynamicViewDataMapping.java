package com.dianping.shield.dynamic.mapping;

import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R6\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dianping/shield/dynamic/mapping/DynamicViewDataMapping;", "", "()V", "viewDataMapping", "Ljava/util/HashMap;", "Lcom/dianping/shield/dynamic/utils/DMConstant$DynamicModuleViewType;", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$ViewDataCreator;", "Lkotlin/collections/HashMap;", "getViewDataMapping", "()Ljava/util/HashMap;", "setViewDataMapping", "(Ljava/util/HashMap;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicViewDataMapping {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final DynamicViewDataMapping INSTANCE = new DynamicViewDataMapping();
    @NotNull
    private static HashMap<DMConstant.DynamicModuleViewType, DynamicMappingInterface.ViewDataCreator> viewDataMapping = new HashMap<>();

    @NotNull
    public final HashMap<DMConstant.DynamicModuleViewType, DynamicMappingInterface.ViewDataCreator> getViewDataMapping() {
        return viewDataMapping;
    }

    public final void setViewDataMapping(@NotNull HashMap<DMConstant.DynamicModuleViewType, DynamicMappingInterface.ViewDataCreator> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "260a3461305fc58b2ceadc98994edc50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "260a3461305fc58b2ceadc98994edc50");
            return;
        }
        h.b(hashMap, "<set-?>");
        viewDataMapping = hashMap;
    }
}
