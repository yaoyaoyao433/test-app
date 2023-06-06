package com.dianping.shield.node.useritem;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/node/useritem/DataHashable;", "", "dataHash", "", "()Ljava/lang/Integer;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DataHashable {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Nullable
        public static Integer dataHash(DataHashable dataHashable) {
            return null;
        }
    }

    @Nullable
    Integer dataHash();
}
