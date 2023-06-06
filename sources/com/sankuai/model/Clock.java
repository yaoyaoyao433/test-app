package com.sankuai.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Clock {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static TimeProvider timeProvider = new DefaultTimeProvider();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface TimeProvider {
        long currentTimeMillis();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class DefaultTimeProvider implements TimeProvider {
        public static ChangeQuickRedirect changeQuickRedirect;

        public DefaultTimeProvider() {
        }

        @Override // com.sankuai.model.Clock.TimeProvider
        public long currentTimeMillis() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba1711aa40b7953adbf541481ffd49f5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba1711aa40b7953adbf541481ffd49f5")).longValue() : System.currentTimeMillis();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class FixedTimeProvider implements TimeProvider {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final long fixedTime;

        public FixedTimeProvider(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3df37fcdecf03d5c0cd3feeab9ec4a8d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3df37fcdecf03d5c0cd3feeab9ec4a8d");
            } else {
                this.fixedTime = j;
            }
        }

        @Override // com.sankuai.model.Clock.TimeProvider
        public long currentTimeMillis() {
            return this.fixedTime;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class OffsetTimeProvider implements TimeProvider {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final long offsetTime;

        public OffsetTimeProvider(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f2be44194d699ece91514839b7b9a9a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f2be44194d699ece91514839b7b9a9a");
            } else {
                this.offsetTime = j;
            }
        }

        @Override // com.sankuai.model.Clock.TimeProvider
        public long currentTimeMillis() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8963fdd997839a4022b55290942fcee", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8963fdd997839a4022b55290942fcee")).longValue() : System.currentTimeMillis() + this.offsetTime;
        }
    }

    public static long currentTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "563f65f9be83cfe64ed51bf8d7c0bcfc", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "563f65f9be83cfe64ed51bf8d7c0bcfc")).longValue() : timeProvider.currentTimeMillis();
    }

    public static void setFixCurrentTimeMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2bb655a267bff9e96af7728fd90eab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2bb655a267bff9e96af7728fd90eab2");
        } else {
            timeProvider = new FixedTimeProvider(j);
        }
    }

    public static void setOffsetCurrentTimeMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "661a43886880ca3b162ffd828ad339a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "661a43886880ca3b162ffd828ad339a4");
        } else {
            timeProvider = new OffsetTimeProvider(j);
        }
    }

    public static void setDefaultCurrentTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e84bc5b18837699ef3d70c9eb9811ee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e84bc5b18837699ef3d70c9eb9811ee4");
        } else {
            timeProvider = new DefaultTimeProvider();
        }
    }
}
