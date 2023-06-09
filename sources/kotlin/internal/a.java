package kotlin.internal;

import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lkotlin/internal/JRE7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", LogMonitor.EXCEPTION_TAG, "kotlin-stdlib-jre7"}, k = 1, mv = {1, 1, 9})
/* loaded from: classes7.dex */
public class a extends b {
    @Override // kotlin.internal.b
    public final void a(@NotNull Throwable th, @NotNull Throwable th2) {
        h.b(th, "cause");
        h.b(th2, LogMonitor.EXCEPTION_TAG);
        th.addSuppressed(th2);
    }
}
