package com.dianping.shield.runtime;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/runtime/ShieldMapiPrefetchInterface;", "", PackageLoadReporter.Source.PREFETCH, "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", Constants.TRAFFIC_URI, "Landroid/net/Uri;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ShieldMapiPrefetchInterface {
    void prefetch(@NotNull Context context, @NotNull Intent intent);

    void prefetch(@NotNull Context context, @NotNull Uri uri);
}
