package com.meituan.android.common.dfingerprint.raptor;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.RaptorInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.meituan.uuid.UUIDChangedListener;
import com.meituan.uuid.UUIDListener;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RaptorImpl implements RaptorInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<ReportItem> metricsCache;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ReportItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int raptorCode;
        public String raptorKey;
        public int raptorReqLen;
        public int raptorResLen;
        public int raptorTime;
    }

    public RaptorImpl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b08d220cf00a7dfee6162fed6cb7f88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b08d220cf00a7dfee6162fed6cb7f88");
            return;
        }
        this.metricsCache = null;
        if (context == null) {
            return;
        }
        RaptorMonitorService.init(context);
        try {
            GetUUID getUUID = GetUUID.getInstance();
            getUUID.registerUUIDListener(new UUIDListener() { // from class: com.meituan.android.common.dfingerprint.raptor.RaptorImpl.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.uuid.UUIDListener
                public void notify(Context context2, String str) {
                    Object[] objArr2 = {context2, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9673f041bed6fea00ca3afcf3865d7f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9673f041bed6fea00ca3afcf3865d7f7");
                    } else {
                        RaptorMonitorService.setUnionID(str);
                    }
                }
            });
            RaptorMonitorService.setUnionID(getUUID.loadUUIDFromSelfCache(context, new UUIDChangedListener() { // from class: com.meituan.android.common.dfingerprint.raptor.RaptorImpl.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.uuid.UUIDChangedListener
                public void notifyChanged(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb587cb3db8ae3060656bd5cd0ed07b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb587cb3db8ae3060656bd5cd0ed07b5");
                    } else {
                        RaptorMonitorService.setUnionID(str2);
                    }
                }
            }));
        } catch (Throwable unused) {
        }
    }

    private boolean flushCache(String str, int i, int i2, int i3, int i4) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5036942f3047b3db2305833835b3e2c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5036942f3047b3db2305833835b3e2c0")).booleanValue();
        }
        synchronized (RaptorImpl.class) {
            if (RaptorMonitorService.getInstance() == null) {
                if (this.metricsCache == null) {
                    this.metricsCache = new ArrayList<>();
                }
                ReportItem reportItem = new ReportItem();
                reportItem.raptorKey = str;
                reportItem.raptorCode = i;
                reportItem.raptorTime = i4;
                reportItem.raptorReqLen = i2;
                reportItem.raptorResLen = i3;
                this.metricsCache.add(reportItem);
                return true;
            }
            if (this.metricsCache != null) {
                Iterator<ReportItem> it = this.metricsCache.iterator();
                while (it.hasNext()) {
                    ReportItem next = it.next();
                    RaptorMonitorService.getInstance().pv4(0L, next.raptorKey, 0, 8, next.raptorCode, next.raptorReqLen, next.raptorResLen, next.raptorTime, null, null);
                }
                this.metricsCache = null;
            }
            return false;
        }
    }

    @Override // com.meituan.android.common.dfingerprint.RaptorInterface
    public void raptorFakeAPI(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7041064bb040286875708d3b748c9256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7041064bb040286875708d3b748c9256");
            return;
        }
        try {
            if (RaptorMonitorService.isRaptorValid() && !TextUtils.isEmpty(str) && i >= 0 && i2 >= 0) {
                RaptorMonitorService.getInstance().pv4(0L, str, 0, 8, i, 0, 0, i2, null, null);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.meituan.android.common.dfingerprint.RaptorInterface
    public void raptorAPI(String str, int i, int i2, int i3, int i4) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f1b2f9145b213caf1731e0d425594bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f1b2f9145b213caf1731e0d425594bb");
            return;
        }
        try {
            if (RaptorMonitorService.isRaptorValid() && !TextUtils.isEmpty(str) && i >= 0 && i4 >= 0 && i2 >= 0 && i3 >= 0) {
                RaptorMonitorService.getInstance().pv4(0L, str, 0, 8, i, i2, i3, i4, null, null);
            }
        } catch (Throwable unused) {
        }
    }
}
