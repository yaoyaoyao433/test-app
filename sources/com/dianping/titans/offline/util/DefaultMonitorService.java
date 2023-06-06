package com.dianping.titans.offline.util;

import android.content.Context;
import com.dianping.monitor.impl.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DefaultMonitorService extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final AtomicBoolean hasSetup = new AtomicBoolean(false);
    private static Context sAppContext;
    private static int sAppId;

    public DefaultMonitorService(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22aa00d818aaa3bfa0b4bd0db9186d3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22aa00d818aaa3bfa0b4bd0db9186d3f");
        } else {
            sAppContext = context.getApplicationContext();
        }
    }

    public static synchronized void setUp(Context context, int i) {
        synchronized (DefaultMonitorService.class) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0f58834859fddbfcba850215ea18055", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0f58834859fddbfcba850215ea18055");
            } else if (hasSetup.get()) {
            } else {
                sAppContext = context;
                sAppId = i;
                hasSetup.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class SingletonHolder {
        private static final DefaultMonitorService INSTANCE = new DefaultMonitorService(DefaultMonitorService.sAppContext, DefaultMonitorService.sAppId);
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static DefaultMonitorService getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ba0a4f424f27c4eb9429c7a9682897a", RobustBitConfig.DEFAULT_VALUE) ? (DefaultMonitorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ba0a4f424f27c4eb9429c7a9682897a") : SingletonHolder.INSTANCE;
    }

    @Override // com.dianping.monitor.impl.a
    public String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c11be813c0a8f9bfbf7073d096a21a12", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c11be813c0a8f9bfbf7073d096a21a12") : GetUUID.getInstance().getUUID(sAppContext);
    }

    public void reportOfflineHit(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "459ddaf5d291b4ad7420140d1cddffb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "459ddaf5d291b4ad7420140d1cddffb7");
            return;
        }
        pv4(0L, "offline_" + str, 0, 0, i, 0, 0, 0, "", str2);
    }
}
