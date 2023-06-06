package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class StoreThresholdInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<BundleSetting> bundleSetting;
    public HashMap<String, BusinessInfo> content;
    public long defaultThreshold;
    public int version;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class BusinessInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long size;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cb2281aed75bcba8871bcb5b25a651d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cb2281aed75bcba8871bcb5b25a651d");
            }
            return "BusinessInfo{size=" + this.size + '}';
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class BundleSetting {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int keepVersionCount;
        public String name;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "facd927f33a786f6e7d10e3bd3acfed7", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "facd927f33a786f6e7d10e3bd3acfed7");
            }
            return "BundleSetting{name='" + this.name + "', keepVersionCount=" + this.keepVersionCount + '}';
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9de6438f9de694227b0935f26c7e29db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9de6438f9de694227b0935f26c7e29db");
        }
        return "StoreThresholdInfo{content=" + this.content + ", defaultThreshold=" + this.defaultThreshold + ", version=" + this.version + ", bundleSetting=" + this.bundleSetting + '}';
    }
}
