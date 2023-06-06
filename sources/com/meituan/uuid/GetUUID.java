package com.meituan.uuid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback2;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GetUUID {
    public static final String REGISTER = "register";
    public static final String UPDATE = "update";
    private static final int VERIFY_FAIL = 1;
    private static final int VERIFY_SUCCESS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static GetUUID instance;
    public static volatile String sUUID;
    public boolean isNeedVerifyUuidInSdcard;
    private volatile boolean isReportSp;
    public final List<UUIDChangedListener> uuidChangedListeners;
    public final List<UUIDListener> uuidListeners;
    private static final Executor SINGLE_THREAD_EXECUTOR = c.a("uuid_get");
    private static final Executor MULTI_THREAD_POOL = c.a("uuid_callback", 4);
    private static volatile boolean isIot = false;

    private String getUUIDFromLocalByContentProvider(Context context) throws Throwable {
        return null;
    }

    public static synchronized void init(UUIDEventLogProvider uUIDEventLogProvider) {
        synchronized (GetUUID.class) {
            Object[] objArr = {uUIDEventLogProvider};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a146cd8d3f3da15bc583f0bd21c3884c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a146cd8d3f3da15bc583f0bd21c3884c");
            } else {
                instance = new GetUUID(uUIDEventLogProvider);
            }
        }
    }

    public static synchronized GetUUID getInstance() {
        synchronized (GetUUID.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d44aa22533851327b9e860f831b5804", 6917529027641081856L)) {
                return (GetUUID) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d44aa22533851327b9e860f831b5804");
            }
            if (instance == null) {
                instance = new GetUUID();
            }
            return instance;
        }
    }

    public static synchronized GetUUID getInstance(boolean z) {
        synchronized (GetUUID.class) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c03ac48ec78cec1a199a40b91251582d", 6917529027641081856L)) {
                return (GetUUID) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c03ac48ec78cec1a199a40b91251582d");
            }
            isIot = z;
            if (instance == null) {
                instance = new GetUUID();
            }
            return instance;
        }
    }

    public GetUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3461c53c7b8f616d5a5737d9cdaf5342", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3461c53c7b8f616d5a5737d9cdaf5342");
            return;
        }
        this.uuidListeners = Collections.synchronizedList(new ArrayList());
        this.uuidChangedListeners = Collections.synchronizedList(new ArrayList());
        this.isNeedVerifyUuidInSdcard = true;
        this.isReportSp = false;
    }

    public GetUUID(UUIDEventLogProvider uUIDEventLogProvider) {
        Object[] objArr = {uUIDEventLogProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b2531d367e391a49d4d09b655e3bf7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b2531d367e391a49d4d09b655e3bf7e");
            return;
        }
        this.uuidListeners = Collections.synchronizedList(new ArrayList());
        this.uuidChangedListeners = Collections.synchronizedList(new ArrayList());
        this.isNeedVerifyUuidInSdcard = true;
        this.isReportSp = false;
        UUIDHelper.getInstance().setEventLogProvider(uUIDEventLogProvider);
    }

    public void registerUUIDListener(UUIDListener uUIDListener) {
        Object[] objArr = {uUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13eabf87e1a2bfd977a287a3d8467b78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13eabf87e1a2bfd977a287a3d8467b78");
        } else {
            this.uuidListeners.add(uUIDListener);
        }
    }

    public void unregisterUUIDListener(UUIDListener uUIDListener) {
        Object[] objArr = {uUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5a6b260775b5296573269f5bc1ed082", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5a6b260775b5296573269f5bc1ed082");
        } else {
            this.uuidListeners.remove(uUIDListener);
        }
    }

    public void registerUUIDChangedListener(UUIDChangedListener uUIDChangedListener) {
        Object[] objArr = {uUIDChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f13b3ecd07709a33c7ad0985ad9b07c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f13b3ecd07709a33c7ad0985ad9b07c0");
        } else {
            this.uuidChangedListeners.add(uUIDChangedListener);
        }
    }

    public void unRegisterUUIDChagnedListener(UUIDChangedListener uUIDChangedListener) {
        Object[] objArr = {uUIDChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "883c0c8dd3df9ab27e8b349205a5ff70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "883c0c8dd3df9ab27e8b349205a5ff70");
        } else {
            this.uuidChangedListeners.remove(uUIDChangedListener);
        }
    }

    @Deprecated
    public String loadUUIDFromLocalCacheInstant(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fde9d43d8889fb3536012fc1dec8272", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fde9d43d8889fb3536012fc1dec8272");
        }
        Context appContext = UUIDUtils.getAppContext(context);
        String uUIDFromLocal = UUIDHelper.getUUIDFromLocal(appContext);
        if (TextUtils.isEmpty(uUIDFromLocal)) {
            try {
                return getUUIDFromLocalByContentProvider(appContext);
            } catch (Throwable th) {
                UUIDHelper.getInstance().getEventLogProvider().throwableReport(th);
            }
        }
        return uUIDFromLocal;
    }

    @Deprecated
    public String loadUUIDFromSelfCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e2d3f817f37be0581f1a6464b299ddf", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e2d3f817f37be0581f1a6464b299ddf");
        }
        Context appContext = UUIDUtils.getAppContext(context);
        if (UUIDHelper.checkUUIDValid(sUUID)) {
            return sUUID;
        }
        return UUIDHelper.getUUIDFromSelf(appContext);
    }

    public String loadUUIDFromSelfCache(Context context, UUIDChangedListener uUIDChangedListener) {
        Object[] objArr = {context, uUIDChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67a91d5724f13c9751f4e10be5a6641e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67a91d5724f13c9751f4e10be5a6641e");
        }
        Context appContext = UUIDUtils.getAppContext(context);
        registerUUIDChangedListener(uUIDChangedListener);
        if (UUIDHelper.checkUUIDValid(sUUID)) {
            return sUUID;
        }
        return UUIDHelper.getUUIDFromSelf(appContext);
    }

    private void initUnionidAndOaid(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4fa9eafdbf5805fe3f5dce575cf5db7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4fa9eafdbf5805fe3f5dce575cf5db7");
            return;
        }
        if (isIot) {
            OneIdHandler.getInstance(context).initOnIot();
        } else {
            OneIdHandler.getInstance(context).init();
        }
        OaidManager.getInstance().getOaid(context, new OaidCallback2() { // from class: com.meituan.uuid.GetUUID.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
            public void onFail(String str) {
            }

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
            public void onSuccuss(boolean z, String str, boolean z2) {
            }

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback2
            public void onSuccuss(boolean z, String str, boolean z2, OaidManager.Source source) {
            }
        });
    }

    public String getUUID(@NonNull final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0eda61d6b899efc9994b573a84a26ea", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0eda61d6b899efc9994b573a84a26ea");
        }
        final Context appContext = UUIDUtils.getAppContext(context);
        if (UUIDHelper.checkUUIDValid(sUUID)) {
            notifyListeners(appContext, sUUID);
            return sUUID;
        } else if (context == null) {
            return "";
        } else {
            initUnionidAndOaid(context);
            UuidPrivacyHelper.registerPrivacyMode(context);
            final StatUtil statUtil = new StatUtil();
            statUtil.monitorLog = MonitorManager.createNewMonitor(statUtil, context, System.currentTimeMillis(), "uuid");
            final Pair<String, Integer> uUIDTimeConsuming = getUUIDTimeConsuming(appContext, statUtil);
            String str = (String) uUIDTimeConsuming.first;
            notifyListeners(appContext, str);
            if (ProcessUtils.isMainThread()) {
                b.a(SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.uuid.GetUUID.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b3569bcfe2b83655a2b7a578b30c9cc", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b3569bcfe2b83655a2b7a578b30c9cc");
                            return;
                        }
                        DeviceInfo deviceInfo = new DeviceInfo(context);
                        deviceInfo.initUuidTransfer(context);
                        GetUUID.this.getIdFromLocalOrNetwork(appContext, deviceInfo, statUtil, uUIDTimeConsuming, null);
                    }
                });
                return str;
            }
            DeviceInfo deviceInfo = new DeviceInfo(context);
            deviceInfo.initUuidTransfer(context);
            return getIdFromLocalOrNetwork(appContext, deviceInfo, statUtil, uUIDTimeConsuming, null);
        }
    }

    public String getSyncUUID(Context context, UUIDListener uUIDListener) {
        Object[] objArr = {context, uUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcfe769825704248be4d0ac371dd7b52", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcfe769825704248be4d0ac371dd7b52");
        }
        Context appContext = UUIDUtils.getAppContext(context);
        if (UUIDHelper.checkUUIDValid(sUUID)) {
            notifyListener(appContext, sUUID, uUIDListener);
            return sUUID;
        } else if (appContext == null) {
            return "";
        } else {
            StatUtil statUtil = new StatUtil();
            statUtil.monitorLog = MonitorManager.createNewMonitor(statUtil, context, System.currentTimeMillis(), "uuid");
            String str = (String) getUUIDTimeConsuming(appContext, statUtil).first;
            notifyListeners(appContext, str);
            getUUID(context, uUIDListener);
            return str;
        }
    }

    public void getUUID(final Context context, final UUIDListener uUIDListener) {
        Object[] objArr = {context, uUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39043e0377c5404b49b6b65114c24e29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39043e0377c5404b49b6b65114c24e29");
            return;
        }
        final Context appContext = UUIDUtils.getAppContext(context);
        if (UUIDHelper.checkUUIDValid(sUUID)) {
            notifyListener(appContext, sUUID, uUIDListener);
        } else if (context == null) {
        } else {
            initUnionidAndOaid(context);
            UuidPrivacyHelper.registerPrivacyMode(context);
            final StatUtil statUtil = new StatUtil();
            statUtil.monitorLog = MonitorManager.createNewMonitor(statUtil, context, System.currentTimeMillis(), "uuid");
            b.a(SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.uuid.GetUUID.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f7400ac4db7954d81e65d7d0eb9af25", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f7400ac4db7954d81e65d7d0eb9af25");
                    } else if (UUIDHelper.checkUUIDValid(GetUUID.sUUID)) {
                        GetUUID.this.notifyListener(appContext, GetUUID.sUUID, uUIDListener);
                    } else {
                        DeviceInfo deviceInfo = new DeviceInfo(context);
                        deviceInfo.initUuidTransfer(context);
                        Pair uUIDTimeConsuming = GetUUID.this.getUUIDTimeConsuming(appContext, statUtil);
                        String str = (String) uUIDTimeConsuming.first;
                        if (UUIDHelper.isOverdue(appContext) || UUIDHelper.isUuidTransfer(deviceInfo)) {
                            GetUUID.this.getIdFromLocalOrNetwork(appContext, deviceInfo, statUtil, uUIDTimeConsuming, uUIDListener);
                            return;
                        }
                        GetUUID.this.notifyListener(appContext, str, uUIDListener);
                        GetUUID.sUUID = str;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getIdFromLocalOrNetwork(android.content.Context r19, com.meituan.android.common.unionid.oneid.util.DeviceInfo r20, com.meituan.android.common.unionid.oneid.statstics.StatUtil r21, android.util.Pair<java.lang.String, java.lang.Integer> r22, com.meituan.uuid.UUIDListener r23) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r0 = 5
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r14 = 0
            r13[r14] = r8
            r15 = 1
            r13[r15] = r9
            r0 = 2
            r13[r0] = r10
            r0 = 3
            r13[r0] = r11
            r0 = 4
            r13[r0] = r12
            com.meituan.robust.ChangeQuickRedirect r5 = com.meituan.uuid.GetUUID.changeQuickRedirect
            java.lang.String r6 = "3a9ef85c3aca81e8581368d481643bf4"
            r3 = 0
            r16 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r0 = r13
            r1 = r18
            r2 = r5
            r4 = r6
            r15 = r5
            r14 = r6
            r5 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r7, r15, r0, r14)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L3c:
            boolean r0 = com.meituan.uuid.UUIDHelper.isOverdue(r19)
            if (r0 != 0) goto L4f
            boolean r0 = com.meituan.uuid.UUIDHelper.isUuidTransfer(r20)
            if (r0 != 0) goto L4f
            java.lang.Object r0 = r11.first
            java.lang.String r0 = (java.lang.String) r0
            com.meituan.uuid.GetUUID.sUUID = r0
            return r0
        L4f:
            boolean r0 = com.meituan.uuid.UUIDHelper.isUuidTransfer(r20)
            if (r0 == 0) goto L60
            java.lang.String r0 = "uuid"
            r1 = 142(0x8e, float:1.99E-43)
            r2 = 0
            r3 = 1
            com.meituan.android.common.unionid.oneid.monitor.MonitorManager.addEvent(r0, r1, r3, r2)
            goto L74
        L60:
            if (r11 == 0) goto L74
            java.lang.Object r0 = r11.first
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.meituan.uuid.UUIDHelper.checkUUIDValid(r0)
            if (r0 == 0) goto L74
            java.lang.String r0 = "update"
            android.util.Pair r0 = com.meituan.uuid.UUIDHelper.registerFromServer(r8, r0, r9, r11, r10)
            goto L7b
        L74:
            java.lang.String r0 = "register"
            android.util.Pair r0 = com.meituan.uuid.UUIDHelper.registerFromServer(r8, r0, r9, r11, r10)
        L7b:
            if (r0 == 0) goto Lb5
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = com.meituan.uuid.UUIDHelper.checkUUIDValid(r1)
            if (r1 == 0) goto Lb5
            java.lang.String r1 = com.meituan.uuid.UUIDHelper.getUUIDFromLocal(r19)
            boolean r2 = com.meituan.uuid.UUIDHelper.checkUUIDValid(r1)
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r0.first
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lb5
            java.util.List<com.meituan.uuid.UUIDChangedListener> r2 = r7.uuidChangedListeners
            java.util.Iterator r2 = r2.iterator()
        L9f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r2.next()
            com.meituan.uuid.UUIDChangedListener r3 = (com.meituan.uuid.UUIDChangedListener) r3
            if (r3 == 0) goto L9f
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
            r3.notifyChanged(r1, r4)
            goto L9f
        Lb5:
            if (r12 == 0) goto Lca
            if (r0 == 0) goto Lca
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = com.meituan.uuid.UUIDHelper.checkUUIDValid(r1)
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            r7.notifyListener(r8, r1, r12)
        Lca:
            if (r0 == 0) goto Ld1
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld1:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.uuid.GetUUID.getIdFromLocalOrNetwork(android.content.Context, com.meituan.android.common.unionid.oneid.util.DeviceInfo, com.meituan.android.common.unionid.oneid.statstics.StatUtil, android.util.Pair, com.meituan.uuid.UUIDListener):java.lang.String");
    }

    private JSONObject getGlobalReadOnlyFilesMsg(Pair<String, String> pair, boolean z) {
        Object[] objArr = {pair, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6865196e20fa468e0db39d06bf683a97", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6865196e20fa468e0db39d06bf683a97");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", pair.first);
            jSONObject.put("source", pair.second);
            jSONObject.put("isValid", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<String, Integer> getUUIDTimeConsuming(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c08c48506e0a4688594bd01143305b09", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c08c48506e0a4688594bd01143305b09");
        }
        String str = "";
        if (!this.isReportSp) {
            MonitorManager.addEvent(statUtil, "uuid", 130, true);
        }
        String fromPreference = UUIDHelper.getFromPreference(context);
        if (TextUtils.isEmpty(fromPreference)) {
            UUIDUtils.logReport(context, GetUUID.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"mem_null", "sp_null"});
        }
        int i = 14;
        int verifyUUID = verifyUUID(statUtil, fromPreference, 130, 14);
        if (verifyUUID == 0) {
            return new Pair<>(fromPreference, 2);
        }
        if (1 == verifyUUID) {
            str = fromPreference;
        } else {
            i = 0;
        }
        MonitorManager.addEvent(statUtil, "uuid", 136, true);
        String str2 = (String) UUIDHelper.getFromGlobalReadOnlyFiles(context).first;
        if (TextUtils.isEmpty(str2)) {
            UUIDUtils.logReport(context, GetUUID.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"mem_null", "sp_null", "data_file_read_null"});
            MonitorManager.addEvent(statUtil, "uuid", 136, false);
        }
        int i2 = 15;
        int verifyUUID2 = verifyUUID(statUtil, str2, 136, 15);
        if (verifyUUID2 == 0) {
            return new Pair<>(str2, 5);
        }
        if (1 != verifyUUID2) {
            str2 = str;
            i2 = i;
        }
        MonitorManager.addEvent(statUtil, "uuid", 131, true);
        String fromSdcardEncrypted = UUIDHelper.getFromSdcardEncrypted(context);
        if (TextUtils.isEmpty(fromSdcardEncrypted)) {
            UUIDUtils.logReport(context, GetUUID.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"mem_null", "sp_null", "data_file_read_null", "sdcard_read_null"});
            MonitorManager.addEvent(statUtil, "uuid", 131, false);
        }
        int verifyUUID3 = verifyUUID(statUtil, fromSdcardEncrypted, 131, 16);
        if (verifyUUID3 == 0) {
            return new Pair<>(fromSdcardEncrypted, 4);
        }
        if (1 == verifyUUID3) {
            str2 = fromSdcardEncrypted;
            i2 = 16;
        }
        if (TextUtils.isEmpty(str2)) {
            if (UUIDHelper.checkSdcardEncryptedExist(context)) {
                return new Pair<>(str2, 41);
            }
            if (context == null) {
                return new Pair<>(str2, 11);
            }
        }
        return new Pair<>(str2, Integer.valueOf(i2));
    }

    private int verifyUUID(StatUtil statUtil, String str, int i, int i2) {
        Object[] objArr = {statUtil, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fe6f311965929a7979e691b5e162972", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fe6f311965929a7979e691b5e162972")).intValue();
        }
        if (UUIDHelper.checkUUIDValid(str)) {
            if (!this.isReportSp) {
                MonitorManager.addEvent(statUtil, "uuid", i, false, MonitorManager.getMsg(str));
            }
            this.isReportSp = true;
            return 0;
        } else if (!TextUtils.isEmpty(str)) {
            if (!this.isReportSp) {
                MonitorManager.addEvent(statUtil, "uuid", i, false, MonitorManager.getMsg(i2, str, ""));
            }
            this.isReportSp = true;
            return 1;
        } else {
            if (!this.isReportSp) {
                MonitorManager.addEvent(statUtil, "uuid", i, false);
            }
            this.isReportSp = true;
            return -1;
        }
    }

    private void saveAndNotifyUUID(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c20f3e679824dd9285b33c92d59fa7ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c20f3e679824dd9285b33c92d59fa7ad");
            return;
        }
        sUUID = str;
        if (TextUtils.isEmpty(str)) {
            UUIDUtils.logReport(context, GetUUID.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"callback_null"});
        }
        UUIDSaveManager.getInstance().saveToCurrentApp(context, str);
        notifyListeners(context, str);
    }

    private void saveAndNotifyUUID(Context context, String str, UUIDListener uUIDListener) {
        Object[] objArr = {context, str, uUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4480f447e66250e1d212abc07e1132a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4480f447e66250e1d212abc07e1132a1");
            return;
        }
        sUUID = str;
        if (TextUtils.isEmpty(str)) {
            UUIDUtils.logReport(context, GetUUID.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"callback_null"});
        }
        UUIDSaveManager.getInstance().saveToCurrentApp(context, str);
        notifyListener(context, str, uUIDListener);
    }

    private void notifyListeners(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "651830f783f905eb6f7ccc12f715a9cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "651830f783f905eb6f7ccc12f715a9cb");
        } else if (this.uuidListeners != null) {
            synchronized (this.uuidListeners) {
                for (UUIDListener uUIDListener : this.uuidListeners) {
                    notifyListener(context, str, uUIDListener);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListener(final Context context, final String str, final UUIDListener uUIDListener) {
        Object[] objArr = {context, str, uUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "008d5b5acb7dfc32add77a07a36ae57c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "008d5b5acb7dfc32add77a07a36ae57c");
        } else if (TextUtils.isEmpty(str) || context == null || uUIDListener == null) {
        } else {
            b.a(MULTI_THREAD_POOL, new Runnable() { // from class: com.meituan.uuid.GetUUID.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2bc179af9fca3ad50e12e4eb26f96bbf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2bc179af9fca3ad50e12e4eb26f96bbf");
                        return;
                    }
                    try {
                        uUIDListener.notify(context, str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Deprecated
    public static void clearMemoCache() {
        sUUID = null;
    }
}
