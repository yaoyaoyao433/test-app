package com.dianping.shield.component.extensions.common;

import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/component/extensions/common/BaseScrollableRow;", "Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "()V", "extraMarginBottom", "", "extraMarginLeft", "extraMarginRight", "extraMarginTop", "onDidInterceptTouchListener", "Lcom/dianping/shield/component/interfaces/OnDidInterceptTouchListener;", "scrollEventDispatcherProvider", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class BaseScrollableRow extends CommonContainerRow {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int extraMarginBottom;
    @JvmField
    public int extraMarginLeft;
    @JvmField
    public int extraMarginRight;
    @JvmField
    public int extraMarginTop;
    @JvmField
    @Nullable
    public OnDidInterceptTouchListener onDidInterceptTouchListener;
    @JvmField
    @Nullable
    public ComponentScrollEventHelper.IEventDispatcherProvider scrollEventDispatcherProvider;

    @Override // com.dianping.shield.component.extensions.common.CommonContainerRow, com.dianping.shield.node.cellnode.ShieldRow
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60e288c69c3fbf63e6e5557e7fa9754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60e288c69c3fbf63e6e5557e7fa9754");
            return;
        }
        super.clear();
        this.extraMarginTop = 0;
        this.extraMarginRight = 0;
        this.extraMarginBottom = 0;
        this.extraMarginLeft = 0;
        this.scrollEventDispatcherProvider = null;
        this.onDidInterceptTouchListener = null;
    }
}
