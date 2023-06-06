package com.meituan.hotel.android.hplus.diagnoseTool;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class DiagnoseLog {
    public static final String AQUA = "#00FFFF";
    public static final String BLUE = "#4285f4";
    public static final String COLOR_ERROR = "#000000";
    public static final String COLOR_JS = "#f18701";
    public static final String COLOR_NATIVE = "#f7b801";
    public static final String COLOR_NETWORK = "#7678bd";
    public static final String COLOR_STEP = "#4e73ff";
    public static final String CUBE_MODULE = "CubeModule";
    public static final String DEFAULT_COLOR = "#88dd88";
    public static final String FUCHSIA = "#FF00FF";
    public static final String GRAY = "#808080";
    public static final String GREEN = "#88dd88";
    public static final String H5 = "H5";
    public static final String ITEM_FCP = "FCP";
    public static final String ITEM_FETCH_DATA = "首屏请求";
    public static final String ITEM_FMP = "FMP";
    public static final String ITEM_PREPARE_CONTAINER = "容器准备";
    public static final String ITEM_PREPARE_FETCH_DATA = "业务准备";
    public static final String ITEM_RENDER = "渲染";
    public static final String ITEM_REQUEST_ENABLED = "可发起请求时间";
    public static final String ITEM_START = "Start";
    public static final String LIME = "#00FF00";
    public static final String MAROON = "#800000";
    public static final String MRN = "MRN";
    public static final String NATIVE = "Native";
    public static final String NAVY = "#000080";
    public static final String OLIVE = "#808000";
    public static final String PURPLE = "#800080";
    public static final String RED = "#db4437";
    public static final String ROW_SECTION = "Section";
    public static final String ROW_STEP = "Step";
    public static final String ROW_TASK = "Task";
    private static final String TAG = "DiagnoseLog";
    public static final String TASK_FETCH_BRIDGE = "FetchBridge";
    public static final String TASK_FETCH_BRIDGE_FORMAT = "FetchBridge-%s %s";
    public static final String TASK_JS_METHOD = "JsMethod";
    public static final String TASK_LOADSCRIPT = "LoadScript";
    public static final String TASK_LOADSCRIPT_FORMAT = "LoadScript-%s-%s";
    public static final String TASK_MRN_BUNDLE_DOWNLOAD = "MRNBundleDownload";
    public static final String TASK_MRN_BUNDLE_DOWNLOAD_FORMAT = "MRNBundleDownload-%s";
    public static final String TEAL = "#008080";
    public static final String YELLOW = "#FFFF00";
    public static transient Map<String, BridgeBean> bridgeMap = new ConcurrentHashMap();
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient boolean bizBundleLoaded;
    public transient String bizName;
    public transient String curBundleName;
    public transient String entryName;
    public transient double firstIndexJsStartTime;
    public transient double fmpTime;
    public transient boolean hasRecvFmp;
    public transient boolean hasRequestNetwork;
    public transient boolean isFirstIndexBundle;
    public transient boolean isFirstNetwork;
    public List<LogItem> items;
    public transient ConcurrentHashMap<String, HashMap<String, List<Double>>> jsFuncCostTimesMap;
    public transient Map<String, Double> loadBundleMap;
    public transient ArrayList<View> mrnFsViewList;
    public transient int mrnRootViewBottomY;
    public transient Map<String, Double> networkMap;
    public String pageKey;
    public transient double renderStartTime;
    public transient double startTime;
    public String templateKey;
    public String url;

    public DiagnoseLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebb1da032ea89f29e5beedb6bceaf619", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebb1da032ea89f29e5beedb6bceaf619");
            return;
        }
        this.hasRequestNetwork = false;
        this.hasRecvFmp = false;
        this.fmpTime = 0.0d;
        this.jsFuncCostTimesMap = new ConcurrentHashMap<>();
        this.isFirstNetwork = true;
        this.bizName = "";
        this.entryName = "";
        this.networkMap = new ConcurrentHashMap();
        this.loadBundleMap = new ConcurrentHashMap();
        this.items = new CopyOnWriteArrayList();
        this.isFirstIndexBundle = true;
        this.firstIndexJsStartTime = 0.0d;
        this.mrnFsViewList = new ArrayList<>();
        this.mrnRootViewBottomY = 0;
        this.bizBundleLoaded = false;
        this.url = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.entryName = parseFromUrl(str, "mrn_entry=([^\\&\\s\\?\\=]+)[\\&]?");
        this.bizName = parseFromUrl(str, "mrn_biz=([^\\&\\s\\?\\=]+)[\\&]?");
    }

    private String parseFromUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b9c3c06a0f9d9e5add96e8e940f646", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b9c3c06a0f9d9e5add96e8e940f646");
        }
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public void appendItem(LogItem logItem) {
        Object[] objArr = {logItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08c735b46037b6d436451e48d469f037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08c735b46037b6d436451e48d469f037");
        } else if (logItem != null && logItem.start > 0.0d && logItem.end > 0.0d) {
            this.items.add(logItem);
        }
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f620ad8174a6b54f26e73cfeff65cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f620ad8174a6b54f26e73cfeff65cc5");
        } else {
            this.items.clear();
        }
    }

    public boolean hasLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b2d96331fd83dc4f40537ea0c70bf1b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b2d96331fd83dc4f40537ea0c70bf1b")).booleanValue() : this.items.size() > 0;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class LogItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public DetailBean detail;
        public String detailType;
        public double end;
        public String item;
        public String pageType;
        public String row;
        public String snapshot;
        public double start;
        public String step;
        public String tipColor;

        public LogItem(String str, String str2, String str3, double d, double d2, String str4) {
            Object[] objArr = {str, str2, str3, Double.valueOf(d), Double.valueOf(d2), str4};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2329e00600260ca859c033b34b8b4c69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2329e00600260ca859c033b34b8b4c69");
                return;
            }
            this.row = "";
            this.item = "";
            this.step = "";
            this.tipColor = "";
            this.snapshot = "";
            this.detailType = "";
            this.detail = new DetailBean();
            this.start = 0.0d;
            this.end = 0.0d;
            this.pageType = "";
            this.row = str;
            this.item = str2;
            this.step = str3 == null ? "" : str3;
            this.start = d;
            this.end = d2;
            this.tipColor = str4;
        }

        public LogItem(String str, double d, double d2, String str2) {
            String str3;
            String str4 = str;
            Object[] objArr = {str4, Double.valueOf(d), Double.valueOf(d2), str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1026f271475dd468eec2c40cd04df996", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1026f271475dd468eec2c40cd04df996");
                return;
            }
            this.row = "";
            this.item = "";
            this.step = "";
            this.tipColor = "";
            this.snapshot = "";
            this.detailType = "";
            this.detail = new DetailBean();
            this.start = 0.0d;
            this.end = 0.0d;
            this.pageType = "";
            try {
                str3 = new URI(str).getPath();
            } catch (Exception e) {
                e = e;
                str3 = str4;
            }
            try {
                if (str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                    str4 = str.split("/?")[0];
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                this.row = str3;
                this.item = str3;
                this.step = "";
                this.start = d;
                this.end = d2;
                this.tipColor = str2;
                this.detailType = SocialConstants.TYPE_REQUEST;
                this.detail = new DetailBean();
                this.detail.url = str4;
            }
            this.row = str3;
            this.item = str3;
            this.step = "";
            this.start = d;
            this.end = d2;
            this.tipColor = str2;
            this.detailType = SocialConstants.TYPE_REQUEST;
            this.detail = new DetailBean();
            this.detail.url = str4;
        }

        public LogItem(String str, String str2, String str3, double d, double d2, String str4, String str5) {
            Object[] objArr = {str, str2, str3, Double.valueOf(d), Double.valueOf(d2), str4, str5};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bda2d08f66f5d7a124b36e84bda1bba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bda2d08f66f5d7a124b36e84bda1bba");
                return;
            }
            this.row = "";
            this.item = "";
            this.step = "";
            this.tipColor = "";
            this.snapshot = "";
            this.detailType = "";
            this.detail = new DetailBean();
            this.start = 0.0d;
            this.end = 0.0d;
            this.pageType = "";
            this.row = str;
            this.item = str2;
            this.step = str3;
            this.start = d;
            this.end = d2;
            this.snapshot = str4 == null ? "" : str4;
            this.tipColor = str5;
        }

        public void parseDetailTagForCubeModule(com.meituan.hotel.android.hplus.diagnoseTool.picasso.a aVar, String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc67eec18ea6660fbf11abdef94e86b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc67eec18ea6660fbf11abdef94e86b4");
                return;
            }
            String unused = DiagnoseLog.TAG;
            StringBuilder sb = new StringBuilder("parseDetail() called with: picassoDiagnoseEvent = [");
            sb.append(aVar);
            sb.append("], eventName = [");
            sb.append(str);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            if (aVar == null) {
                return;
            }
            if (this.detail == null) {
                this.detail = new DetailBean();
            }
            if (this.detail.customItems == null) {
                this.detail.customItems = new ArrayList();
            }
            if (!TextUtils.isEmpty(aVar.a)) {
                this.detailType = SocialConstants.TYPE_REQUEST;
                this.detail.url = aVar.a;
            }
            if (!TextUtils.isEmpty(aVar.c)) {
                this.detail.customItems.add(new DetailBean.a("boardKeys", aVar.c));
            }
            if (TextUtils.isEmpty(aVar.b)) {
                return;
            }
            this.detailType = "queryJS";
            this.detail.customItems.add(new DetailBean.a("queryJSCacheCode", aVar.b));
            this.detail.customItems.add(new DetailBean.a("缓存类型", parseCacheCode(aVar.b)));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
            if (r13.equals("201") != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.String parseCacheCode(java.lang.String r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog.LogItem.changeQuickRedirect
                java.lang.String r11 = "913121a3fd9c4561098c78a9af24f21b"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r12
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1e
                java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                java.lang.String r13 = (java.lang.String) r13
                return r13
            L1e:
                boolean r1 = android.text.TextUtils.isEmpty(r13)
                if (r1 == 0) goto L27
                java.lang.String r13 = "UNKNOWN"
                return r13
            L27:
                r1 = -1
                int r2 = r13.hashCode()
                switch(r2) {
                    case 48: goto L5a;
                    case 49: goto L50;
                    default: goto L2f;
                }
            L2f:
                switch(r2) {
                    case 49586: goto L46;
                    case 49587: goto L3d;
                    case 49588: goto L33;
                    default: goto L32;
                }
            L32:
                goto L64
            L33:
                java.lang.String r0 = "202"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L64
                r0 = 2
                goto L65
            L3d:
                java.lang.String r2 = "201"
                boolean r13 = r13.equals(r2)
                if (r13 == 0) goto L64
                goto L65
            L46:
                java.lang.String r0 = "200"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L64
                r0 = 0
                goto L65
            L50:
                java.lang.String r0 = "1"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L64
                r0 = 3
                goto L65
            L5a:
                java.lang.String r0 = "0"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L64
                r0 = 4
                goto L65
            L64:
                r0 = -1
            L65:
                switch(r0) {
                    case 0: goto L7c;
                    case 1: goto L78;
                    case 2: goto L74;
                    case 3: goto L70;
                    case 4: goto L6c;
                    default: goto L68;
                }
            L68:
                java.lang.String r13 = "unKnown"
                return r13
            L6c:
                java.lang.String r13 = "网络请求"
                return r13
            L70:
                java.lang.String r13 = "缓存"
                return r13
            L74:
                java.lang.String r13 = "预加载缓存"
                return r13
            L78:
                java.lang.String r13 = "普通缓存"
                return r13
            L7c:
                java.lang.String r13 = "网络下载"
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog.LogItem.parseCacheCode(java.lang.String):java.lang.String");
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class DetailBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long offscreenCount;
        public long removedCount;
        public String toastContent;
        public String url;
        public long viewCount;
        public List<JsFunctionTimingInfosBean> jsFunctionTimingInfos = new ArrayList();
        public List<a> customItems = new ArrayList();

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes3.dex */
        public static class JsFunctionTimingInfosBean {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String benchkey;
            public List<Double> time;

            public JsFunctionTimingInfosBean(String str, List<Double> list) {
                this.benchkey = str;
                this.time = list;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class a {
            public String a;
            public String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class BridgeBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Double fetchBridgeStartTime;
        public String fetchBridgeType;
        public boolean isFromOnCreate;

        public BridgeBean(Double d, boolean z) {
            this.fetchBridgeType = "";
            this.fetchBridgeStartTime = d;
            this.isFromOnCreate = z;
        }

        public BridgeBean(Double d, boolean z, String str) {
            this.fetchBridgeType = "";
            this.fetchBridgeStartTime = d;
            this.isFromOnCreate = z;
            this.fetchBridgeType = str;
        }
    }
}
