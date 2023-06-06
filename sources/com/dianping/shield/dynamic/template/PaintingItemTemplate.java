package com.dianping.shield.dynamic.template;

import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006j\n\u0012\u0006\b\u0001\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/dynamic/template/PaintingItemTemplate;", "Lcom/dianping/shield/dynamic/template/DynamicComputeTemplate;", "()V", "painting", "", "computingList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "Lkotlin/collections/ArrayList;", "callbackFun", "Lcom/dianping/shield/dynamic/template/PaintingItemCallback;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PaintingItemTemplate extends DynamicComputeTemplate {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void painting(@NotNull ArrayList<? extends IDynamicModuleViewItem> arrayList, @NotNull PaintingItemCallback paintingItemCallback) {
        Object[] objArr = {arrayList, paintingItemCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9195af30cae1e49ceede9c35ea08aa85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9195af30cae1e49ceede9c35ea08aa85");
            return;
        }
        h.b(arrayList, "computingList");
        h.b(paintingItemCallback, "callbackFun");
        compute(arrayList, new PaintingItemTemplate$painting$1(paintingItemCallback));
    }
}
