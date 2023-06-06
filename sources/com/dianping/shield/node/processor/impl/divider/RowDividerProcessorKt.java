package com.dianping.shield.node.processor.impl.divider;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0003"}, d2 = {"adjustNegativeValueBy", "Landroid/graphics/Rect;", "other", "shieldCore_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowDividerProcessorKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public static final Rect adjustNegativeValueBy(@NotNull Rect rect, @Nullable Rect rect2) {
        Object[] objArr = {rect, rect2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac030d1ce0009fc5e04c4f854113d3cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac030d1ce0009fc5e04c4f854113d3cc");
        }
        h.b(rect, "receiver$0");
        if (rect2 != null) {
            if (rect.left == -1) {
                rect.left = rect2.left;
            }
            if (rect.right == -1) {
                rect.right = rect2.right;
            }
            if (rect.top == -1) {
                rect.top = rect2.top;
            }
            if (rect.bottom == -1) {
                rect.bottom = rect2.bottom;
            }
        }
        return rect;
    }
}
