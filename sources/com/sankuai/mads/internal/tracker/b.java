package com.sankuai.mads.internal.tracker;

import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/sankuai/mads/internal/tracker/Tracker;", "", "()V", "report", "", "trackInfo", "Lcom/sankuai/mads/internal/tracker/TrackInfo;", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final b b = new b();

    @JvmStatic
    public static final void a(@NotNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f505f11af4fcd2c80a7398f54c98fb5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f505f11af4fcd2c80a7398f54c98fb5a");
            return;
        }
        h.b(aVar, "trackInfo");
        if (aVar.c.length() > 0) {
            Sniffer.smell(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }
}
