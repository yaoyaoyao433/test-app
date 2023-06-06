package com.sankuai.waimai.alita.core.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.data.EventFilter;
import com.meituan.android.common.aidata.data.api.EventFilterListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import com.sankuai.waimai.alita.core.config.observabledata.a;
import com.sankuai.waimai.alita.core.event.a;
import com.sankuai.waimai.alita.core.event.b;
import com.sankuai.waimai.alita.core.event.facade.g;
import com.sankuai.waimai.alita.core.utils.h;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaRealTimeEventCenter implements EventFilterListener, a.InterfaceC0700a<String> {
    public static final String ALITA_SPLIT_EVENT_KEY = "alitaSplitData";
    public static final String ALITA_SPLIT_EVENT_NAME = "ALITA_LONG_DATA_SPLIT";
    private static final int ALITA_SPLIT_LENGTH = 4500;
    private static final int ALITA_SPLIT_LENGTH_LIMIT = 100000;
    private static final int ALITA_SPLIT_MAX_LENGTH = 9000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile AlitaRealTimeEventCenter sInstance;
    private b.a eventFilterCallback;
    private final b interceptor;
    private final HashMap<String, CopyOnWriteArrayList<c>> mListenerMap;
    private final a mRealTimeEventHandler;
    private final Map<String, com.sankuai.waimai.alita.core.event.a> mSplitCache;

    public EventFilter getLxEventFilter() {
        return null;
    }

    public static AlitaRealTimeEventCenter getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de40c648230b6a14dceeee560eeee42f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaRealTimeEventCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de40c648230b6a14dceeee560eeee42f");
        }
        if (sInstance == null) {
            synchronized (AlitaRealTimeEventCenter.class) {
                if (sInstance == null) {
                    sInstance = new AlitaRealTimeEventCenter();
                }
            }
        }
        return sInstance;
    }

    public AlitaRealTimeEventCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a342dca3fd75a855db46698023154ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a342dca3fd75a855db46698023154ec");
            return;
        }
        this.mListenerMap = new HashMap<>();
        this.mRealTimeEventHandler = new a();
        this.mSplitCache = new ConcurrentHashMap();
        this.eventFilterCallback = new b.a() { // from class: com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.event.b.a
            public final void a(List<String> list, com.sankuai.waimai.alita.core.event.a aVar) {
                Object[] objArr2 = {list, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b3f587bade48ad8eed742fe844aaeae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b3f587bade48ad8eed742fe844aaeae");
                } else if (h.a(list)) {
                } else {
                    d dVar = new d();
                    dVar.a = list;
                    dVar.b = aVar;
                    AlitaRealTimeEventCenter.this.dispatchRealTimeEvent(dVar);
                    com.sankuai.waimai.alita.core.utils.c.a("EventFilter | dispatch | " + aVar.toString());
                }
            }
        };
        this.interceptor = new b();
    }

    @Nullable
    public com.sankuai.waimai.alita.core.event.a getSplitEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59296f47dde62b9f927d09f11f22fba0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59296f47dde62b9f927d09f11f22fba0") : this.mSplitCache.get(str);
    }

    @Nullable
    private com.sankuai.waimai.alita.core.event.a removeSplitEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10f7ee059dc002beabb44e60fa820ac0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10f7ee059dc002beabb44e60fa820ac0") : this.mSplitCache.remove(str);
    }

    private void putSplitEvent(@NonNull String str, @NonNull com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427168fd479429b6f4d449157a0fc0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427168fd479429b6f4d449157a0fc0b0");
        } else {
            this.mSplitCache.put(str, aVar);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void sendRealTimeEvent(com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a81326f7d023fe62471ef7250d9ae59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a81326f7d023fe62471ef7250d9ae59");
        } else {
            onReceiveRealTimeEvent(aVar);
        }
    }

    private void onReceiveRealTimeEvent(com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65171ddddb785565d169767eeb431c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65171ddddb785565d169767eeb431c83");
        } else {
            this.interceptor.a(aVar, this.eventFilterCallback);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r12 != null) goto L14;
     */
    @Override // com.meituan.android.common.aidata.data.api.EventFilterListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onData(com.meituan.android.common.aidata.entity.EventData r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter.changeQuickRedirect
            java.lang.String r10 = "acbcf5c2e7730cda88c84d2a3e65a903"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1b:
            com.sankuai.waimai.alita.core.event.a r0 = new com.sankuai.waimai.alita.core.event.a
            r0.<init>(r12)
            java.util.Map r12 = r0.e()
            if (r12 == 0) goto L3f
            java.lang.String r1 = "alitaSplitData"
            java.lang.Object r12 = r12.get(r1)
            boolean r1 = r12 instanceof java.lang.String
            if (r1 == 0) goto L3f
            java.lang.String r12 = (java.lang.String) r12
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L3f
            com.sankuai.waimai.alita.core.event.a r12 = r11.removeSplitEvent(r12)
            if (r12 == 0) goto L3f
            goto L40
        L3f:
            r12 = r0
        L40:
            r11.onReceiveRealTimeEvent(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter.onData(com.meituan.android.common.aidata.entity.EventData):void");
    }

    @Override // com.sankuai.waimai.alita.core.config.observabledata.a.InterfaceC0700a
    public void update(String str, String str2) {
        com.sankuai.waimai.alita.core.event.a aVar;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32be550fd29e3d1f23b4f7b564cff834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32be550fd29e3d1f23b4f7b564cff834");
            return;
        }
        Object[] objArr2 = {AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS};
        ChangeQuickRedirect changeQuickRedirect3 = g.a.a;
        g.a aVar2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "93bcc43792c1cbe05be13fb7534f67c9", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "93bcc43792c1cbe05be13fb7534f67c9") : new g.a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
        aVar2.c = str;
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr3 = {new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect4 = g.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect4, false, "b1f551a8cbd7a8b8149c95035d9aaa7a", RobustBitConfig.DEFAULT_VALUE)) {
            g.a aVar3 = (g.a) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect4, false, "b1f551a8cbd7a8b8149c95035d9aaa7a");
        } else {
            aVar2.d = currentTimeMillis;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = g.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect5, false, "a2eed2d800c0ab4aacb370faeaeb02c7", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect5, false, "a2eed2d800c0ab4aacb370faeaeb02c7");
        } else {
            com.sankuai.waimai.alita.core.event.a aVar4 = new com.sankuai.waimai.alita.core.event.a();
            aVar4.b = "session_update";
            if (aVar2.b != null) {
                aVar4.c = aVar2.b;
            }
            if (aVar2.c != null) {
                aVar4.h = aVar2.c;
            }
            if (aVar2.d != 0) {
                aVar4.a(aVar2.d);
            }
            aVar = aVar4;
        }
        writeAlitaCustomEvent(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, aVar);
    }

    public void writeLXCustomEvent(String str, String str2, String str3, Map<String, Object> map, String str4, String str5, boolean z) {
        Object[] objArr = {str, str2, str3, map, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c11e71aea4b353d2e2c3f4af467f745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c11e71aea4b353d2e2c3f4af467f745");
            return;
        }
        a.C0701a a2 = a.C0701a.a(str);
        a2.d = str3;
        a2.e = map;
        a2.c = str4;
        a2.b = str5;
        writeLXCustomEvent(a2.a(), z);
    }

    public void writeLXCustomEvent(@NonNull com.sankuai.waimai.alita.core.event.a aVar, boolean z) {
        HashMap hashMap;
        String jSONObject;
        int length;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8807f3d45b3c8e739b769b9d9894148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8807f3d45b3c8e739b769b9d9894148");
            return;
        }
        Map<String, Object> e = aVar.e();
        if (AlitaBizConfigUtil.a(6) && z && e != null) {
            try {
                jSONObject = new JSONObject(aVar.e()).toString();
                length = jSONObject.length();
            } catch (Exception unused) {
            }
            if (length > 100000) {
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.WriteSqlCompatible.MONITOR_KEY, 0, AlitaBundleUtil.a("")).addTags("event_name", TextUtils.isEmpty(aVar.a()) ? "" : aVar.a()).addTags("bid", TextUtils.isEmpty(aVar.d()) ? "" : aVar.d()).addTags("cid", TextUtils.isEmpty(aVar.c()) ? "" : aVar.c()).addTags("category", TextUtils.isEmpty(aVar.b()) ? "" : aVar.b()).commit();
            } else if (length > 9000) {
                String uuid = UUID.randomUUID().toString();
                putSplitEvent(uuid, aVar);
                int length2 = jSONObject.length();
                int i = ((length2 - 1) / ALITA_SPLIT_LENGTH) + 1;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < i) {
                    int i3 = i2 * ALITA_SPLIT_LENGTH;
                    i2++;
                    arrayList.add(jSONObject.substring(i3, Math.min(i2 * ALITA_SPLIT_LENGTH, length2)));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(ALITA_SPLIT_EVENT_KEY, uuid);
                for (int i4 = 0; i4 < i; i4++) {
                    try {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(ALITA_SPLIT_EVENT_KEY, arrayList.get(i4));
                        AIData.writeCustomEvent(ALITA_SPLIT_EVENT_NAME, "", String.valueOf(i4), hashMap3, String.valueOf(i), uuid, true);
                    } catch (Exception unused2) {
                        e = hashMap2;
                    }
                }
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.WriteSqlCompatible.MONITOR_KEY, 1, AlitaBundleUtil.a("")).addTags("event_name", TextUtils.isEmpty(aVar.a()) ? "" : aVar.a()).addTags("bid", TextUtils.isEmpty(aVar.d()) ? "" : aVar.d()).addTags("cid", TextUtils.isEmpty(aVar.c()) ? "" : aVar.c()).addTags("category", TextUtils.isEmpty(aVar.b()) ? "" : aVar.b()).commit();
                hashMap = hashMap2;
                AIData.writeCustomEvent(aVar.a(), "", aVar.d(), hashMap, aVar.c(), aVar.b(), z);
            }
        }
        hashMap = e;
        AIData.writeCustomEvent(aVar.a(), "", aVar.d(), hashMap, aVar.c(), aVar.b(), z);
    }

    public void writeAlitaCustomEvent(String str, String str2, String str3, String str4, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, str4, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c32015e5ee156ec826232d5860f3b77f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c32015e5ee156ec826232d5860f3b77f");
            return;
        }
        a.C0701a a2 = a.C0701a.a(str2);
        a2.d = str3;
        a2.c = str4;
        a2.e = map;
        writeAlitaCustomEvent(str, a2.a());
    }

    public void writeAlitaCustomEvent(String str, com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d25c19f320c979c61a603a1f45a868f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d25c19f320c979c61a603a1f45a868f1");
            return;
        }
        d dVar = new d();
        dVar.a = new ArrayList();
        dVar.a.add(str);
        dVar.b = aVar;
        dispatchRealTimeEvent(dVar);
    }

    public void addEventListener(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fcbeb78be77213d192d6437f32228f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fcbeb78be77213d192d6437f32228f7");
        } else if (cVar != null) {
            synchronized (this.mListenerMap) {
                if (this.mListenerMap.containsKey(str)) {
                    this.mListenerMap.get(str).add(cVar);
                } else {
                    CopyOnWriteArrayList<c> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList.add(cVar);
                    this.mListenerMap.put(str, copyOnWriteArrayList);
                }
            }
        }
    }

    public void removeEventListener(String str, c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e7c904ae8902d7180a7772caa919002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e7c904ae8902d7180a7772caa919002");
            return;
        }
        synchronized (this.mListenerMap) {
            if (this.mListenerMap.containsKey(str) && (copyOnWriteArrayList = this.mListenerMap.get(str)) != null) {
                Iterator<c> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next == null || next == cVar) {
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }
    }

    public void removeEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0b90a678eb96ace138b35366aa12bfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0b90a678eb96ace138b35366aa12bfb");
            return;
        }
        synchronized (this.mListenerMap) {
            if (this.mListenerMap.containsKey(str)) {
                CopyOnWriteArrayList<c> copyOnWriteArrayList = this.mListenerMap.get(str);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.mListenerMap.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRealTimeEvent(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "363c02c0c28749bc7e976e97c44dff92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "363c02c0c28749bc7e976e97c44dff92");
        } else if (dVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = dVar;
            this.mRealTimeEventHandler.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRealTimeEventListener(String str, com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45eb275cfce5891a4070334a49c98fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45eb275cfce5891a4070334a49c98fd");
            return;
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.mListenerMap.get(str);
        if (h.a(copyOnWriteArrayList)) {
            return;
        }
        Iterator<c> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<AlitaRealTimeEventCenter> b;

        private a(AlitaRealTimeEventCenter alitaRealTimeEventCenter) {
            super(Looper.getMainLooper());
            Object[] objArr = {alitaRealTimeEventCenter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74cc9b031f71407d03620d1352ede34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74cc9b031f71407d03620d1352ede34");
            } else {
                this.b = new WeakReference<>(alitaRealTimeEventCenter);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AlitaRealTimeEventCenter alitaRealTimeEventCenter;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c4741d0f77be6feaf7ef918c74a857", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c4741d0f77be6feaf7ef918c74a857");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1 && (message.obj instanceof d) && (alitaRealTimeEventCenter = this.b.get()) != null) {
                for (String str : ((d) message.obj).a) {
                    alitaRealTimeEventCenter.notifyRealTimeEventListener(str, ((d) message.obj).b);
                }
            }
        }
    }

    public void addRealtimeEventFilter(String str, com.sankuai.waimai.alita.platform.init.g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8189e06a8a56066fc1dbc91c22239643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8189e06a8a56066fc1dbc91c22239643");
            return;
        }
        this.interceptor.a(str, gVar);
        com.sankuai.waimai.alita.core.utils.c.a("AlitaVSCodeDebug", "addRealtimeEventFilter biz: " + str);
    }

    public void removeRealtimeEventFilter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e7236fe1feb36df4a0295c98f7a9e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e7236fe1feb36df4a0295c98f7a9e1c");
        } else {
            this.interceptor.a(str);
        }
    }
}
