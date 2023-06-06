package com.dianping.shield.dynamic.template;

import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import kotlin.r;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", VersionInfo.P1, "", "", "Lkotlin/ParameterName;", "name", "errorSet", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PaintingItemTemplate$painting$1 extends g implements b<Set<? extends String>, r> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PaintingItemTemplate$painting$1(PaintingItemCallback paintingItemCallback) {
        super(1, paintingItemCallback);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "onPaintingFinish";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45141e6a6b7a9f5577e278e634af73e7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45141e6a6b7a9f5577e278e634af73e7") : u.a(PaintingItemCallback.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "onPaintingFinish(Ljava/util/Set;)V";
    }

    @Override // kotlin.jvm.functions.b
    public final /* bridge */ /* synthetic */ r invoke(Set<? extends String> set) {
        invoke2((Set<String>) set);
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01a02c312e646aa1cfd31cc4a08fee95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01a02c312e646aa1cfd31cc4a08fee95");
            return;
        }
        h.b(set, VersionInfo.P1);
        ((PaintingItemCallback) this.receiver).onPaintingFinish(set);
    }
}
