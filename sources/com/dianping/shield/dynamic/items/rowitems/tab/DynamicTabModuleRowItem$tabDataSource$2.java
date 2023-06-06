package com.dianping.shield.dynamic.items.rowitems.tab;

import com.dianping.shield.dynamic.items.rowitems.tab.DynamicTabModuleRowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem$TabRowItemDataSource;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicTabModuleRowItem$tabDataSource$2 extends i implements a<DynamicTabModuleRowItem.TabRowItemDataSource> {
    public static final DynamicTabModuleRowItem$tabDataSource$2 INSTANCE = new DynamicTabModuleRowItem$tabDataSource$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public DynamicTabModuleRowItem$tabDataSource$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final DynamicTabModuleRowItem.TabRowItemDataSource invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f4dd4cc34c92f05d71d719d852aa46", RobustBitConfig.DEFAULT_VALUE) ? (DynamicTabModuleRowItem.TabRowItemDataSource) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f4dd4cc34c92f05d71d719d852aa46") : new DynamicTabModuleRowItem.TabRowItemDataSource();
    }
}
