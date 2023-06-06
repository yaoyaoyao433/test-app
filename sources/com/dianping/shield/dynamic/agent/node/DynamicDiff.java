package com.dianping.shield.dynamic.agent.node;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003JE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\u000eJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "T", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "Lcom/dianping/shield/dynamic/protocols/DynamicViewItemsHolderInterface;", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "", "onComputingComplete", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DynamicDiff<T extends DiffableInfo> extends DynamicViewItemsHolderInterface {
    void diff(@NotNull T t, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2);

    @Nullable
    String getId();

    void onComputingComplete();

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static /* synthetic */ void diff$default(DynamicDiff dynamicDiff, DiffableInfo diffableInfo, ArrayList arrayList, Integer num, Integer num2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: diff");
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            dynamicDiff.diff(diffableInfo, arrayList, num, num2);
        }
    }
}
