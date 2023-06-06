package com.meituan.android.common.locate.api;

import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public class GpsMonitorStateManager {
    private static volatile GpsMonitorStateManager a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Set<String> b;

    public GpsMonitorStateManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d93049744a1b7f9ecff288f81ebcd2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d93049744a1b7f9ecff288f81ebcd2e");
        } else {
            this.b = new HashSet();
        }
    }

    public static GpsMonitorStateManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c7da5a4bd0e12b9253cc3793638052f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GpsMonitorStateManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c7da5a4bd0e12b9253cc3793638052f");
        }
        if (a == null) {
            synchronized (GpsMonitorStateManager.class) {
                if (a == null) {
                    a = new GpsMonitorStateManager();
                }
            }
        }
        return a;
    }

    public Set<String> getBizNames() {
        return this.b;
    }

    public synchronized void setGpsMonitorState(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7df19f598e985cebb51b81060e5570b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7df19f598e985cebb51b81060e5570b5");
            return;
        }
        if (z) {
            this.b.add(str);
        } else {
            this.b.remove(str);
        }
        c.a("fusion::setGpsMonitorState bizName:" + str + " isOpen:" + z);
        com.meituan.android.common.locate.fusionlocation.controller.a.a().a(z);
    }
}
