package com.meituan.metrics.traffic.trace;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebviewDetailUnit extends DetailUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<String, Long> mtWebviewRefererMap;

    public MTWebviewDetailUnit(long j, long j2, boolean z, @NonNull String str) {
        super(j, j2, z);
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c41d096ebd6ef4a89cf65fffe76846c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c41d096ebd6ef4a89cf65fffe76846c");
            return;
        }
        this.mtWebviewRefererMap = new HashMap<>();
        this.mtWebviewRefererMap.put(str, Long.valueOf(j + j2));
    }

    public void updateNewTraffic(long j, long j2, boolean z, @NonNull String str) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12849de66947bf3560a96fceadc30b31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12849de66947bf3560a96fceadc30b31");
            return;
        }
        updateNewTraffic(j, j2, z);
        if (this.mtWebviewRefererMap.containsKey(str)) {
            this.mtWebviewRefererMap.put(str, Long.valueOf(this.mtWebviewRefererMap.get(str).longValue() + j + j2));
        } else {
            this.mtWebviewRefererMap.put(str, Long.valueOf(j + j2));
        }
    }
}
