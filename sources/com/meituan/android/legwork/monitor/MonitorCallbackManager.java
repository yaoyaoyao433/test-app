package com.meituan.android.legwork.monitor;

import android.support.annotation.Keep;
import com.meituan.android.legwork.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MonitorCallbackManager implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MonitorCallbackManager instance = new MonitorCallbackManager();
    private c callback;

    public static MonitorCallbackManager getInstance() {
        return instance;
    }

    public c getCallback() {
        return this.callback;
    }

    public void setCallback(c cVar) {
        this.callback = cVar;
    }

    public int currentTimeSec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe56b1e4ea3bf1277d6663b62a9683e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe56b1e4ea3bf1277d6663b62a9683e8")).intValue();
        }
        checkCallback();
        return (int) (this.callback.currentTime() / 1000);
    }

    @Override // com.meituan.android.legwork.monitor.c
    public long currentTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e9894301abadb2b75fa57e1212a41e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e9894301abadb2b75fa57e1212a41e6")).longValue();
        }
        checkCallback();
        return this.callback.currentTime();
    }

    @Override // com.meituan.android.legwork.monitor.c
    public int appType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92e07bf8224b77b40d05128d98df4c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92e07bf8224b77b40d05128d98df4c0a")).intValue();
        }
        checkCallback();
        return this.callback.appType();
    }

    @Override // com.meituan.android.legwork.monitor.c
    public String appVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0aaa1bce32d2bbd932a76cad7a43ea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0aaa1bce32d2bbd932a76cad7a43ea7");
        }
        checkCallback();
        return this.callback.appVersion();
    }

    @Override // com.meituan.android.legwork.monitor.c
    public String mtUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef2bbc83091c7b9876590ab2ba61999b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef2bbc83091c7b9876590ab2ba61999b");
        }
        checkCallback();
        return this.callback.mtUserId();
    }

    @Override // com.meituan.android.legwork.monitor.c
    public String currentCity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "053fa00538dbbc63d55cf13658adeaa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "053fa00538dbbc63d55cf13658adeaa7");
        }
        checkCallback();
        return this.callback.currentCity();
    }

    @Override // com.meituan.android.legwork.monitor.c
    public String cityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a35c5fb476399bfc2cf373fec8eb60b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a35c5fb476399bfc2cf373fec8eb60b");
        }
        checkCallback();
        return this.callback.cityId();
    }

    private void checkCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "413171e30ee37475317083c0ee3227bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "413171e30ee37475317083c0ee3227bd");
        } else if (this.callback == null) {
            q.a().b();
        }
    }
}
