package com.dianping.shield.dynamic.diff.module;

import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/useritem/ViewItem;", "kotlin.jvm.PlatformType", "T", "Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;", "V", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseModuleInfoDiff$defaultFailedViewItem$2 extends i implements a<ViewItem> {
    public static final BaseModuleInfoDiff$defaultFailedViewItem$2 INSTANCE = new BaseModuleInfoDiff$defaultFailedViewItem$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseModuleInfoDiff$defaultFailedViewItem$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    public final ViewItem invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79d2e0a3c6c428eae638f4c105ed9d22", RobustBitConfig.DEFAULT_VALUE) ? (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79d2e0a3c6c428eae638f4c105ed9d22") : ViewItem.simpleViewItem(null);
    }
}
