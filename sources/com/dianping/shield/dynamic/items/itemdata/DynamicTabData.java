package com.dianping.shield.dynamic.items.itemdata;

import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/dianping/shield/dynamic/items/itemdata/DynamicTabData;", "", "normalData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "selectData", "data", "", "(Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;Ljava/lang/String;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicTabData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public String data;
    @JvmField
    @NotNull
    public DynamicModuleViewItemData normalData;
    @JvmField
    @NotNull
    public DynamicModuleViewItemData selectData;

    public DynamicTabData(@NotNull DynamicModuleViewItemData dynamicModuleViewItemData, @NotNull DynamicModuleViewItemData dynamicModuleViewItemData2, @Nullable String str) {
        h.b(dynamicModuleViewItemData, "normalData");
        h.b(dynamicModuleViewItemData2, "selectData");
        this.normalData = dynamicModuleViewItemData;
        this.selectData = dynamicModuleViewItemData2;
        this.data = str;
    }
}
