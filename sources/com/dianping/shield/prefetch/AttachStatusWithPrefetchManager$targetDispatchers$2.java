package com.dianping.shield.prefetch;

import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002`\u0004\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", "T", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AttachStatusWithPrefetchManager$targetDispatchers$2<T> extends i implements a<ArrayList<ElementStatusEventListener<T>>> {
    public static final AttachStatusWithPrefetchManager$targetDispatchers$2 INSTANCE = new AttachStatusWithPrefetchManager$targetDispatchers$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public AttachStatusWithPrefetchManager$targetDispatchers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    @NotNull
    public final ArrayList<ElementStatusEventListener<T>> invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd928b8ad21ebaf67f3659418be0e1d0", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd928b8ad21ebaf67f3659418be0e1d0") : new ArrayList<>();
    }
}
