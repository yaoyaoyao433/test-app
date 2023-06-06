package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebStorage {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface QuotaUpdater {
        void updateQuota(long j);
    }

    public void deleteAllData() {
    }

    public void deleteOrigin(String str) {
    }

    public void getOrigins(MTValueCallback<Map> mTValueCallback) {
    }

    public void getQuotaForOrigin(String str, MTValueCallback<Long> mTValueCallback) {
    }

    public void getUsageForOrigin(String str, MTValueCallback<Long> mTValueCallback) {
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Origin {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String mOrigin;
        private long mQuota;
        private long mUsage;

        public Origin(String str, long j, long j2) {
            Object[] objArr = {str, new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037d9f7b7217114c29140df185f06bf4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037d9f7b7217114c29140df185f06bf4");
                return;
            }
            this.mOrigin = null;
            this.mQuota = 0L;
            this.mUsage = 0L;
            this.mOrigin = str;
            this.mQuota = j;
            this.mUsage = j2;
        }

        public String getOrigin() {
            return this.mOrigin;
        }

        public long getQuota() {
            return this.mQuota;
        }

        public long getUsage() {
            return this.mUsage;
        }
    }

    public static MTWebStorage getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4f46c0e48a6b31ad5ff7e52e3d6b036", RobustBitConfig.DEFAULT_VALUE) ? (MTWebStorage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4f46c0e48a6b31ad5ff7e52e3d6b036") : MTWebViewFactory.getProvider().getWebStorage();
    }
}
