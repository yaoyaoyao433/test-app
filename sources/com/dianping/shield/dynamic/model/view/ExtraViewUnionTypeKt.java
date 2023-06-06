package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b¨\u0006\u0003"}, d2 = {"unzipValue", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ExtraViewUnionTypeKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public static final ExtraViewInfo unzipValue(@NotNull ExtraViewUnionType extraViewUnionType) {
        Object[] objArr = {extraViewUnionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1b90516624b18353e4dbf034987c1f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExtraViewInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1b90516624b18353e4dbf034987c1f6");
        }
        h.b(extraViewUnionType, "receiver$0");
        if (extraViewUnionType instanceof ExtraViewUnionType.ExtraReusableViewInfo) {
            return ((ExtraViewUnionType.ExtraReusableViewInfo) extraViewUnionType).getValue();
        }
        if (extraViewUnionType instanceof ExtraViewUnionType.ExtraViewInfo) {
            return ((ExtraViewUnionType.ExtraViewInfo) extraViewUnionType).getValue();
        }
        throw new j();
    }
}
