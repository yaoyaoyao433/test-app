package com.dianping.shield.node.adapter;

import android.util.Pair;
import android.util.SparseArray;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.utils.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "element", "Landroid/util/Pair;", "Lcom/dianping/shield/entity/ViewExtraInfo;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AttachStatusManager$updateCurrentInScreenElement$2<T> extends i implements b<Pair<T, ViewExtraInfo>, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SparseArray $completeElementList;
    public final /* synthetic */ SparseArray $extraVisibleElementList;
    public final /* synthetic */ AttachStatusManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachStatusManager$updateCurrentInScreenElement$2(AttachStatusManager attachStatusManager, SparseArray sparseArray, SparseArray sparseArray2) {
        super(1);
        this.this$0 = attachStatusManager;
        this.$extraVisibleElementList = sparseArray;
        this.$completeElementList = sparseArray2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "e", "Landroid/util/Pair;", "Lcom/dianping/shield/entity/ViewExtraInfo;", "v", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.dianping.shield.node.adapter.AttachStatusManager$updateCurrentInScreenElement$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements c<Pair<T, ViewExtraInfo>, Pair<T, ViewExtraInfo>, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.c
        public final /* synthetic */ Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(invoke((Pair) ((Pair) obj), (Pair) ((Pair) obj2)));
        }

        public final boolean invoke(@NotNull Pair<T, ViewExtraInfo> pair, @NotNull Pair<T, ViewExtraInfo> pair2) {
            Object[] objArr = {pair, pair2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26dda294b4e92ffa5eea4969d576f439", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26dda294b4e92ffa5eea4969d576f439")).booleanValue();
            }
            h.b(pair, "e");
            h.b(pair2, "v");
            return h.a(pair.first, pair2.first);
        }
    }

    @Override // kotlin.jvm.functions.b
    public final /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke((Pair) ((Pair) obj)));
    }

    public final boolean invoke(@NotNull Pair<T, ViewExtraInfo> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdb752e8a82f43c3f3bb60e778ac0b70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdb752e8a82f43c3f3bb60e778ac0b70")).booleanValue();
        }
        h.b(pair, "element");
        return (this.this$0.containElement$shieldCore_release(this.$extraVisibleElementList, pair, AnonymousClass1.INSTANCE) || CollectionUtils.Companion.hasEqualsValue(pair, this.$completeElementList)) ? false : true;
    }
}
