package com.meituan.android.common.statistics.exposure;

import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureMvTimeStampManager;
import com.meituan.android.common.statistics.ipc.RemoteProxyThread;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AbstractExposureInfo extends RemoteProxyThread {
    private static final String TAG = ExposureInfo.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String app_msid;
    protected EventName curEventName;
    protected long duration;
    protected long duration_gap;
    private boolean firstMv;
    protected String log_category;
    protected int mIndex;
    protected String mPageInfoKey;
    protected int mduration_cnt;
    protected long mduration_total;
    protected String mreq_id;
    protected String msid;
    protected long mv_begin_time;
    protected long mv_end_time;
    protected int nt;
    protected String req_id;
    protected String sdk_version;
    protected String val_bid;
    protected String val_cid;
    private Map<String, Object> val_lab;
    protected String web_req_id;

    public void commit() {
    }

    public void md(AbstractExposureInfo abstractExposureInfo) {
    }

    public void modelDisappear(AbstractExposureInfo abstractExposureInfo) {
    }

    public AbstractExposureInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map, int i, String str9, long j, EventName eventName) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, map, Integer.valueOf(i), str9, new Long(j), eventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08fa077e2f3eb9d23b0e1efc8c1774be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08fa077e2f3eb9d23b0e1efc8c1774be");
            return;
        }
        this.mduration_total = 0L;
        this.mduration_cnt = 0;
        this.duration = -1L;
        this.duration_gap = -1L;
        this.mPageInfoKey = str;
        this.sdk_version = str2;
        this.log_category = str3;
        this.msid = str4;
        this.app_msid = str5;
        this.web_req_id = str6;
        this.val_bid = str7;
        this.val_cid = str8;
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
        if (TextUtils.isEmpty(this.val_cid) && pageInfo != null) {
            this.val_cid = pageInfo.getCid();
        }
        this.val_lab = map;
        this.nt = i;
        this.mreq_id = str9;
        this.mv_begin_time = j;
        this.curEventName = eventName;
    }

    public void mv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "778feb16b6ba45683c46bf147d8002f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "778feb16b6ba45683c46bf147d8002f1");
        } else if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            String str = TAG;
            LogUtil.log(str, "mv repeat mreq_id: " + this.mreq_id + " mv_begin_time: " + this.mv_begin_time);
            this.firstMv = this.mv_end_time > this.mv_begin_time;
            this.mv_begin_time = SystemClock.elapsedRealtime();
            this.curEventName = EventName.MODEL_VIEW;
            if (this.mv_end_time > 0) {
                this.duration_gap = this.mv_begin_time - this.mv_end_time;
            }
            if (ConfigManager.getInstance(Statistics.getContext()).dispatchBlueMvTm()) {
                StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.exposure.AbstractExposureInfo.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bdc68874ffaad086e02957995f3f53d7", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bdc68874ffaad086e02957995f3f53d7");
                        } else {
                            ExposureMvTimeStampManager.getInstance().onHandle(new ExposureMvTimeStampManager.MvTimeStamp(AbstractExposureInfo.this.mreq_id, System.currentTimeMillis()));
                        }
                    }
                });
            }
        }
    }

    public void md() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6f732c1ccfb6bfb9895607caba9c544", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6f732c1ccfb6bfb9895607caba9c544");
        } else if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            LogUtil.log(TAG, "md mreq_id: " + this.mreq_id);
            if (this.mv_begin_time > this.mv_end_time) {
                this.mv_end_time = SystemClock.elapsedRealtime();
                this.duration = this.mv_end_time - this.mv_begin_time;
                this.mduration_total += this.duration;
                this.mduration_cnt++;
            }
            c.a("mv_begin_time：" + this.mv_begin_time + ",mv_end_time：" + this.mv_end_time + ",mduration_total：" + this.mduration_total + ",mduration_cnt：" + this.mduration_cnt + ",duration：" + this.duration, 3);
        }
    }

    public void mrnModelDisappear(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90bd31bba0a49e9b5faa68ddb37094f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90bd31bba0a49e9b5faa68ddb37094f8");
            return;
        }
        String str = TAG;
        LogUtil.log(str, "mrnMd mreq_id: " + this.mreq_id);
        this.duration = j;
        this.mduration_total = j2;
        this.mduration_cnt = i;
    }

    public void writeModelDisappear(String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6b0f0b4165af1f2b29fe7a77b0ddf5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6b0f0b4165af1f2b29fe7a77b0ddf5c");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MODEL_DISAPPEAR;
        eventInfo.val_bid = str2;
        eventInfo.val_cid = str3;
        eventInfo.val_lab = map;
        eventInfo.mreq_id = str4;
        eventInfo.isAuto = 7;
        eventInfo.level = EventLevel.URGENT;
        eventInfo.sf = false;
        eventInfo.mCacheControl = EventInfo.CacheControl.CACHE_LOCAL;
        String str5 = null;
        if (!TextUtils.isEmpty(this.log_category) && this.log_category.startsWith(Constants.PREFIX)) {
            str5 = this.log_category.substring(this.log_category.length());
        }
        LogUtil.log("write model disappear: " + eventInfo.toJson().toString());
        Statistics.getChannel(str5).writeEvent(str, eventInfo);
    }

    public void updateReqId(String str) {
        this.req_id = str;
    }

    public void updateSession(String str) {
        this.msid = str;
    }

    public void updateAppSession(String str) {
        this.app_msid = str;
    }

    public void updateCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad132c3537248063922115a099b69310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad132c3537248063922115a099b69310");
        } else if (TextUtils.isEmpty(this.val_cid)) {
            this.val_cid = str;
        }
    }

    public String getSdkVersion() {
        return this.sdk_version;
    }

    public String getLogCategory() {
        return this.log_category;
    }

    public String getMsid() {
        return this.msid;
    }

    public String getAppMsid() {
        return this.app_msid;
    }

    public String getReqId() {
        return this.req_id;
    }

    public String getMreqId() {
        return this.mreq_id;
    }

    public String getWebReqId() {
        return this.web_req_id;
    }

    public String getValBid() {
        return this.val_bid;
    }

    public String getValCid() {
        return this.val_cid;
    }

    public int getNt() {
        return this.nt;
    }

    public long getMdurationTotal() {
        return this.mduration_total;
    }

    public int getMdurationCnt() {
        return this.mduration_cnt;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getDurationGap() {
        return this.duration_gap;
    }

    public boolean isFirstMv() {
        return this.firstMv;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47bf39541e6c052d7f697466ee20199d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47bf39541e6c052d7f697466ee20199d");
        }
        return "AbstractExposureInfo{sdk_version='" + this.sdk_version + "', log_category='" + this.log_category + "', msid='" + this.msid + "', app_msid='" + this.app_msid + "', req_id='" + this.req_id + "', web_req_id='" + this.web_req_id + "', val_bid='" + this.val_bid + "', val_cid='" + this.val_cid + "', val_lab=" + this.val_lab + ", nt=" + this.nt + ", mreq_id='" + this.mreq_id + "', mv_begin_time=" + this.mv_begin_time + ", mv_end_time=" + this.mv_end_time + ", mduration_total=" + this.mduration_total + ", mduration_cnt=" + this.mduration_cnt + ", duration=" + this.duration + ", duration_gap=" + this.duration_gap + ", firstMv=" + this.firstMv + ", mPageInfoKey='" + this.mPageInfoKey + "', mIndex=" + this.mIndex + ", curEventName=" + this.curEventName + '}';
    }
}
