package com.meituan.android.common.locate.statusmanager;

import com.meituan.android.common.locate.MTLocationPurpose;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class a implements f.a {
    private static a a;
    private static Object b = new Object();
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, Integer> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f26eb421cd3d6fe8bf6d414e0a369d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f26eb421cd3d6fe8bf6d414e0a369d6");
            return;
        }
        this.c = new HashMap<>();
        f.a(this);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8aef1ae6639aa0ed14d2b479d8f9fed", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8aef1ae6639aa0ed14d2b479d8f9fed");
        }
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public synchronized boolean b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "665bc53df0056dfe8e24c22eef257866", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "665bc53df0056dfe8e24c22eef257866")).booleanValue();
        }
        Integer num = this.c.get(MTLocationPurpose.Transport);
        if (num != null && num.intValue() > 0) {
            z = true;
        }
        return z;
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b31007a8373a4cb16483e5ec17dd1fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b31007a8373a4cb16483e5ec17dd1fc8");
            return;
        }
        boolean b2 = b();
        SystemLocator systemLocator = SystemLocator.getInstance(null, null);
        boolean isGpsRunning = systemLocator != null ? systemLocator.isGpsRunning() : false;
        c.a("StatusManager::onCollectConfigChange:isEnabledNavi:" + b2 + ":gpsRunning:" + isGpsRunning, 3);
        if (b2 && systemLocator != null && isGpsRunning) {
            systemLocator.stopGnnsEventListen();
            systemLocator.startGnnsEventListen();
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }
}
