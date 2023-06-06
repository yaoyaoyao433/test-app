package com.dianping.shield.node.adapter;

import android.util.Pair;
import com.dianping.shield.entity.ViewExtraInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", AdvanceSetting.NETWORK_TYPE, "Landroid/util/Pair;", "Lcom/dianping/shield/entity/ViewExtraInfo;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AttachStatusManager$updateCurrentInScreenElement$1<T> extends i implements b<Pair<T, ViewExtraInfo>, Boolean> {
    public static final AttachStatusManager$updateCurrentInScreenElement$1 INSTANCE = new AttachStatusManager$updateCurrentInScreenElement$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    public AttachStatusManager$updateCurrentInScreenElement$1() {
        super(1);
    }

    public final boolean invoke(@NotNull Pair<T, ViewExtraInfo> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fce51b1d0d1a8c5c95c1a957f02ae0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fce51b1d0d1a8c5c95c1a957f02ae0f")).booleanValue();
        }
        h.b(pair, AdvanceSetting.NETWORK_TYPE);
        return true;
    }

    @Override // kotlin.jvm.functions.b
    public final /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke((Pair) ((Pair) obj)));
    }
}
