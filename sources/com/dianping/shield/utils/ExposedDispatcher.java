package com.dianping.shield.utils;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ExposedAction;
import com.dianping.shield.feature.CellExposedInterface;
import com.dianping.shield.feature.ExposedInterface;
import com.dianping.shield.feature.ExtraCellExposedInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposedDispatcher {
    private static final long ONE_WEEK_MILLISECONDS = 604800000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private MyHandler mExposeHandler;

    public ExposedDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11f68e0ef11acae696837098166effa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11f68e0ef11acae696837098166effa9");
        } else {
            this.mExposeHandler = new MyHandler(this);
        }
    }

    public void exposedAction(ExposedAction exposedAction) {
        long extraCellStayDuration;
        int maxExtraExposeCount;
        int i = 0;
        Object[] objArr = {exposedAction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63df6c70b503584585a555f74ed0cd45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63df6c70b503584585a555f74ed0cd45");
        } else if (exposedAction == null || exposedAction.owner == null) {
        } else {
            if (!exposedAction.isAddExposed) {
                this.mExposeHandler.removeMessages(exposedAction.hashCode());
                return;
            }
            ExposedObj exposedObj = new ExposedObj();
            exposedObj.section = exposedAction.section;
            exposedObj.row = exposedAction.row;
            exposedObj.cellType = exposedAction.cellType;
            if (exposedAction.isAgentExposed && (exposedAction.owner instanceof ExposedInterface)) {
                ExposedInterface exposedInterface = (ExposedInterface) exposedAction.owner;
                extraCellStayDuration = exposedInterface.stayDuration();
                maxExtraExposeCount = exposedInterface.maxExposeCount();
                exposedObj.delayTime = exposedInterface.exposeDuration();
                exposedObj.exposedInterface = exposedInterface;
            } else if (exposedAction.cellType == CellType.NORMAL && (exposedAction.owner instanceof CellExposedInterface)) {
                CellExposedInterface cellExposedInterface = (CellExposedInterface) exposedAction.owner;
                extraCellStayDuration = cellExposedInterface.stayDuration(exposedAction.section, exposedAction.row);
                maxExtraExposeCount = cellExposedInterface.maxExposeCount(exposedAction.section, exposedAction.row);
                exposedObj.delayTime = cellExposedInterface.exposeDuration(exposedAction.section, exposedAction.row);
                exposedObj.cellExposedInterface = cellExposedInterface;
            } else if (exposedAction.cellType == CellType.NORMAL || !(exposedAction.owner instanceof ExtraCellExposedInterface)) {
                return;
            } else {
                ExtraCellExposedInterface extraCellExposedInterface = (ExtraCellExposedInterface) exposedAction.owner;
                extraCellStayDuration = extraCellExposedInterface.extraCellStayDuration(exposedAction.section, exposedAction.cellType);
                maxExtraExposeCount = extraCellExposedInterface.maxExtraExposeCount(exposedAction.section, exposedAction.cellType);
                exposedObj.delayTime = extraCellExposedInterface.extraCellExposeDuration(exposedAction.section, exposedAction.cellType);
                exposedObj.extraExposedInterface = extraCellExposedInterface;
            }
            int hashCode = exposedAction.hashCode();
            if (this.mExposeHandler.exposedActionCountMap.containsKey(Integer.valueOf(hashCode))) {
                i = this.mExposeHandler.exposedActionCountMap.get(Integer.valueOf(hashCode)).count;
                StringBuilder sb = new StringBuilder("check count for ");
                sb.append(hashCode);
                sb.append(", count = ");
                sb.append(i);
                sb.append(" Action = ");
                sb.append(exposedAction);
            } else {
                this.mExposeHandler.exposedActionCountMap.put(Integer.valueOf(hashCode), new CountObj(0));
                StringBuilder sb2 = new StringBuilder("ExposeCountMap.put(");
                sb2.append(hashCode);
                sb2.append("， 0), Action = ");
                sb2.append(exposedAction);
            }
            if (i >= maxExtraExposeCount || extraCellStayDuration > ONE_WEEK_MILLISECONDS) {
                return;
            }
            Message message = new Message();
            message.what = exposedAction.hashCode();
            message.obj = exposedObj;
            this.mExposeHandler.sendMessageDelayed(message, extraCellStayDuration);
        }
    }

    public void finishExposed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cc96ef70331c303bc94bcde4ca8d3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cc96ef70331c303bc94bcde4ca8d3a2");
            return;
        }
        this.mExposeHandler.removeCallbacksAndMessages(null);
        this.mExposeHandler.exposedActionCountMap.clear();
    }

    public void pauseExposed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dbf3f90a5f9a4adfbc96f0bba1b6fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dbf3f90a5f9a4adfbc96f0bba1b6fbf");
        } else {
            this.mExposeHandler.removeCallbacksAndMessages(null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class MyHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<ExposedDispatcher> dispatcherWeakReference;
        public HashMap<Integer, CountObj> exposedActionCountMap;

        public MyHandler(ExposedDispatcher exposedDispatcher) {
            Object[] objArr = {exposedDispatcher};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922de8397080f6cbc805817c586256a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922de8397080f6cbc805817c586256a3");
                return;
            }
            this.exposedActionCountMap = new HashMap<>();
            this.dispatcherWeakReference = new WeakReference<>(exposedDispatcher);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43461bc2c29413342bacdcd3a69345a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43461bc2c29413342bacdcd3a69345a");
                return;
            }
            super.handleMessage(message);
            if (this.dispatcherWeakReference.get() == null || message.obj == null) {
                return;
            }
            ExposedObj exposedObj = (ExposedObj) message.obj;
            CountObj countObj = this.exposedActionCountMap.get(Integer.valueOf(message.what));
            if (exposedObj.exposedInterface != null) {
                int maxExposeCount = exposedObj.exposedInterface.maxExposeCount();
                exposedObj.delayTime = exposedObj.exposedInterface.exposeDuration();
                if (countObj.count >= maxExposeCount) {
                    return;
                }
                exposedObj.exposedInterface.onExposed(countObj.count + 1);
            } else if (exposedObj.cellExposedInterface != null) {
                if ((exposedObj.cellExposedInterface instanceof af) && (exposedObj.section < 0 || exposedObj.section >= ((af) exposedObj.cellExposedInterface).getSectionCount() || exposedObj.row < 0 || exposedObj.row >= ((af) exposedObj.cellExposedInterface).getRowCount(exposedObj.section))) {
                    Log.e("Shield", "Expose Index out of bound");
                    return;
                }
                int maxExposeCount2 = exposedObj.cellExposedInterface.maxExposeCount(exposedObj.section, exposedObj.row);
                exposedObj.delayTime = exposedObj.cellExposedInterface.exposeDuration(exposedObj.section, exposedObj.row);
                if (countObj.count >= maxExposeCount2) {
                    return;
                }
                exposedObj.cellExposedInterface.onExposed(exposedObj.section, exposedObj.row, countObj.count + 1);
                StringBuilder sb = new StringBuilder("OnCellExposed - (");
                sb.append(exposedObj.section);
                sb.append(", ");
                sb.append(exposedObj.row);
                sb.append("), CellType = ");
                sb.append(exposedObj.cellType);
            } else if (exposedObj.extraExposedInterface == null) {
                return;
            } else {
                if ((exposedObj.extraExposedInterface instanceof af) && (exposedObj.section < 0 || exposedObj.section >= ((af) exposedObj.extraExposedInterface).getSectionCount())) {
                    Log.e("Shield", "Expose Index out of bound");
                    return;
                }
                int maxExtraExposeCount = exposedObj.extraExposedInterface.maxExtraExposeCount(exposedObj.section, exposedObj.cellType);
                exposedObj.delayTime = exposedObj.extraExposedInterface.extraCellStayDuration(exposedObj.section, exposedObj.cellType);
                if (countObj.count >= maxExtraExposeCount) {
                    return;
                }
                exposedObj.extraExposedInterface.onExtraCellExposed(exposedObj.section, exposedObj.cellType, countObj.count + 1);
                StringBuilder sb2 = new StringBuilder("OnExtraCellExposed - (");
                sb2.append(exposedObj.section);
                sb2.append(", ");
                sb2.append(exposedObj.row);
                sb2.append("), CellType = ");
                sb2.append(exposedObj.cellType);
            }
            countObj.count++;
            if (exposedObj.delayTime > ExposedDispatcher.ONE_WEEK_MILLISECONDS || exposedObj.delayTime <= 0) {
                return;
            }
            Message message2 = new Message();
            message2.what = message.what;
            message2.obj = exposedObj;
            sendMessageDelayed(message2, exposedObj.delayTime);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class CountObj {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;

        public CountObj(int i) {
            this.count = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class ExposedObj {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CellExposedInterface cellExposedInterface;
        public CellType cellType;
        public long delayTime;
        public ExposedInterface exposedInterface;
        public ExtraCellExposedInterface extraExposedInterface;
        public int row;
        public int section;

        public ExposedObj() {
            this.delayTime = 0L;
            this.section = 0;
            this.row = 0;
        }
    }
}
