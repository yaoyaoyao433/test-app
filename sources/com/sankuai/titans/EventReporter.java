package com.sankuai.titans;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class EventReporter {
    public static final int LINK_TYPE_OFFLINE = 1;
    public static final int LINK_TYPE_SHARK = 2;
    public static final int LINK_TYPE_SIMPLE = 0;
    public static final int OFFLINE_STEP_BUNDLE_REQUEST = 3;
    public static final int OFFLINE_STEP_BUNDLE_RESPONSE = 4;
    public static final int OFFLINE_STEP_DOWNLOAD_REQUEST = 5;
    public static final int OFFLINE_STEP_DOWNLOAD_RESPONSE = 6;
    public static final int OFFLINE_STEP_WRITE = 7;
    public static final int PAGE_LOAD_ABORT = 2;
    public static final int PAGE_LOAD_FAILURE = 1;
    public static final int PAGE_LOAD_SUCCESS = 0;
    private static final String REPORT_CHANNEL = "fe_knb_report";
    public static final String REPORT_RESPONSE_ERROR_TAG = "titansx-response-error";
    public static final String REPORT_TYPE_ACCESS = "titansx-access";
    public static final String REPORT_TYPE_BRIDGE = "titansx-bridge";
    public static final String REPORT_TYPE_OFFLINE = "titansx-offline";
    public static final String REPORT_TYPE_STORAGE = "titansx-storage";
    public static final String REPORT_TYPE_TIMING = "custom.aggregation.titansx-timing";
    public static final int STORAGE_ACTION_READ = 0;
    public static final int STORAGE_ACTION_REMOVE = 2;
    public static final int STORAGE_ACTION_WRITE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean canStorageReport;
    private final Map<String, EventInfo> eventInfoMap;
    private boolean isGetStorageReport;
    private boolean isRemoveStorageReport;
    private boolean isSetStorageReport;
    private final List<String> queryWhiteList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final EventReporter instance = new EventReporter();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class EventInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String frame;
        private String page;
        private long time;

        public String getFrame() {
            return this.frame;
        }

        public String getPage() {
            return this.page;
        }

        public long getTime() {
            return this.time;
        }

        public EventInfo(String str, String str2) {
            Object[] objArr = {EventReporter.this, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53aac77187932a0fe332264de05555fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53aac77187932a0fe332264de05555fe");
                return;
            }
            this.frame = str;
            this.page = str2;
            this.time = System.currentTimeMillis();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class RequestLog {
        public static final int FAILURE = 1;
        public static final int SUCCESS = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        private int failureValue;
        private int link;
        private int successValue;
        private String url;

        public RequestLog(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94ddcfdd6a5b2d79537cb77d91984735", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94ddcfdd6a5b2d79537cb77d91984735");
                return;
            }
            this.successValue = 1;
            this.failureValue = 0;
            this.url = str;
            this.link = i;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public int getLink() {
            return this.link;
        }

        public void setLink(int i) {
            this.link = i;
        }

        public int getValue(int i) {
            return i == 0 ? this.successValue : this.failureValue;
        }

        public void setSuccessValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6c747cd9527ecd73f2c5f6f4d2ee732", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6c747cd9527ecd73f2c5f6f4d2ee732");
            } else {
                this.successValue++;
            }
        }

        public void setFailureValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c086e4e54d28f0547b177b1c95efdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c086e4e54d28f0547b177b1c95efdf");
                return;
            }
            this.successValue--;
            this.failureValue++;
        }

        public Map<String, Object> build(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecd5235db319c8addcfc5aef42db723e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecd5235db319c8addcfc5aef42db723e");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.url);
            hashMap.put(RegionLinkDao.TABLENAME, Integer.valueOf(this.link));
            hashMap.put("status", Integer.valueOf(i));
            return hashMap;
        }
    }

    public EventReporter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcbadb7a770235faa572634d50829bca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcbadb7a770235faa572634d50829bca");
            return;
        }
        this.queryWhiteList = new ArrayList();
        this.eventInfoMap = new HashMap();
        this.isSetStorageReport = false;
        this.isGetStorageReport = false;
        this.isRemoveStorageReport = false;
        this.canStorageReport = false;
    }

    public static EventReporter getInstance() {
        return Holder.instance;
    }

    public final void setStorageReport(boolean z) {
        this.isSetStorageReport = z;
    }

    public final void getStorageReport(boolean z) {
        this.isGetStorageReport = z;
    }

    public final void removeStorageReport(boolean z) {
        this.isRemoveStorageReport = z;
    }

    public final void canStorageReport(boolean z) {
        this.canStorageReport = z;
    }

    public final List<String> getQueryWhiteList() {
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "371b24f61769d4fe912f70a9087a069b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "371b24f61769d4fe912f70a9087a069b");
        }
        synchronized (this.queryWhiteList) {
            arrayList = new ArrayList(this.queryWhiteList);
        }
        return arrayList;
    }

    public final void setQueryWhiteList(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1965b5091dc4ef2234af78bfbce20f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1965b5091dc4ef2234af78bfbce20f90");
            return;
        }
        synchronized (this.queryWhiteList) {
            this.queryWhiteList.clear();
            this.queryWhiteList.addAll(list);
        }
    }

    public final void markStartEvent(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7d9eb1077b3e1c956b392820cb73e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7d9eb1077b3e1c956b392820cb73e2");
        } else if (str == null || uri == null) {
        } else {
            String basicURLString = UriKit.basicURLString(uri);
            String str2 = str + CommonConstant.Symbol.MINUS + basicURLString;
            EventInfo eventInfo = new EventInfo(str, basicURLString);
            synchronized (this.eventInfoMap) {
                this.eventInfoMap.put(str2, eventInfo);
            }
        }
    }

    public final EventInfo pickStartEvent(String str, Uri uri) {
        EventInfo remove;
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f337914e76c9e5373552a03cab857017", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f337914e76c9e5373552a03cab857017");
        }
        if (str == null || uri == null) {
            return null;
        }
        String str2 = str + CommonConstant.Symbol.MINUS + UriKit.basicURLString(uri);
        synchronized (this.eventInfoMap) {
            remove = this.eventInfoMap.remove(str2);
        }
        return remove;
    }

    public final void reportTiming(String str, Uri uri, long j) {
        Object[] objArr = {str, uri, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "118390242dafa6349ee2d8af3a2e6498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "118390242dafa6349ee2d8af3a2e6498");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME, str);
        hashMap.put("page", UriKit.basicURLString(uri));
        Babel.logRT(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag(REPORT_TYPE_TIMING).optional(hashMap).value(j).build());
    }

    public final void reportResponseError(int i, String str, String str2, String str3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5f8e1bf6d9dff002b1d003e772a2e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5f8e1bf6d9dff002b1d003e772a2e2f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorStatus", Integer.valueOf(i));
        hashMap.put("errorURL", !TextUtils.isEmpty(str) ? str : "");
        hashMap.put("sourceURL", !TextUtils.isEmpty(str2) ? str2 : "");
        hashMap.put("referURL", !TextUtils.isEmpty(str3) ? str3 : "");
        hashMap.put("isMainFrame", Integer.valueOf(z ? 1 : 0));
        Babel.logRT(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag(REPORT_RESPONSE_ERROR_TAG).optional(hashMap).value(1L).build());
    }

    public final void reportTiming(String str, Uri uri, long j, String str2) {
        Object[] objArr = {str, uri, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6b3a11c3619f7ab20965104d1fa01d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6b3a11c3619f7ab20965104d1fa01d3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME, str);
        hashMap.put("lastframe", str2);
        hashMap.put("page", UriKit.basicURLString(uri));
        Babel.logRT(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag(REPORT_TYPE_TIMING).optional(hashMap).value(j).build());
    }

    public final void reportPageAccess(Uri uri, int i, String str) {
        Object[] objArr = {uri, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2932c566295442a0b35ce3bc27a259e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2932c566295442a0b35ce3bc27a259e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page", UriKit.basicURLString(uri));
        hashMap.put("status", Integer.valueOf(i));
        hashMap.put("kernel", "chrome");
        hashMap.put("titans", str);
        Babel.logRT(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag(REPORT_TYPE_ACCESS).optional(hashMap).build());
    }

    public final void reportOffline(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7e5ed3558f18687c0984f4f8fc515fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7e5ed3558f18687c0984f4f8fc515fc");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.SPEED_METER_STEP, Integer.valueOf(i));
        hashMap.put(com.tencent.connect.common.Constants.PARAM_SCOPE, str);
        hashMap.put("status", Integer.valueOf(i2));
        Babel.log(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag(REPORT_TYPE_OFFLINE).optional(hashMap).build());
    }

    public final void setStorageReport(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c294532eb6a649069793529e8035ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c294532eb6a649069793529e8035ca8");
        } else if (this.canStorageReport && this.isSetStorageReport) {
            reportStorage(i, i2, str, str2);
        }
    }

    public final void getStorageReport(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d477e212e51626c9f0af7601e174ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d477e212e51626c9f0af7601e174ea");
        } else if (this.canStorageReport && this.isGetStorageReport) {
            reportStorage(i, i2, str, str2);
        }
    }

    public final void removeStorageReport(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adf9715da18d402fd77e669651387045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adf9715da18d402fd77e669651387045");
        } else if (this.canStorageReport && this.isRemoveStorageReport) {
            reportStorage(i, i2, str, str2);
        }
    }

    private void reportStorage(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2f1a69d33aa053d531f78fab4a15346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2f1a69d33aa053d531f78fab4a15346");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(i));
        hashMap.put("level", Integer.valueOf(i2));
        hashMap.put("key", str);
        hashMap.put("data", str2);
        Babel.logRT(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag(REPORT_TYPE_STORAGE).optional(hashMap).build());
    }
}
