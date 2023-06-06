package com.sankuai.mads.internal.cache;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sankuai/mads/internal/cache/TimeDataCache;", "T", "", "get", "Lkotlin/Function0;", "expireTime", "", "(Lkotlin/jvm/functions/Function0;J)V", "getExpireTime", "()J", "setExpireTime", "(J)V", "lastGetTime", "value", "Ljava/lang/Object;", "()Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class b<T> {
    public static ChangeQuickRedirect a;
    private T b;
    private long c;
    private kotlin.jvm.functions.a<? extends T> d;
    private long e;

    public b(@NotNull kotlin.jvm.functions.a<? extends T> aVar, long j) {
        h.b(aVar, "get");
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66343f7f751a0a3c2cc653fb354e5c9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66343f7f751a0a3c2cc653fb354e5c9b");
            return;
        }
        this.d = aVar;
        this.e = j;
    }

    @Nullable
    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26db1415ef88b40f3d1b7b95ea9b02ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26db1415ef88b40f3d1b7b95ea9b02ef");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.c > this.e) {
            this.c = elapsedRealtime;
            this.b = this.d.invoke();
        }
        return this.b;
    }
}
