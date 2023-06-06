package com.dianping.shield.node.processor.impl.cell;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellNodeExposeProcessor$handler$2 extends i implements a<Handler> {
    public static final CellNodeExposeProcessor$handler$2 INSTANCE = new CellNodeExposeProcessor$handler$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public CellNodeExposeProcessor$handler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final Handler invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1d99f0c6e016e996a3d908d7889eec", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1d99f0c6e016e996a3d908d7889eec") : new Handler(Looper.getMainLooper());
    }
}
