package com.dianping.monitor.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.logreportswitcher.c;
import com.dianping.monitor.d;
import com.dianping.monitor.impl.e;
import com.dianping.monitor.impl.j;
import com.dianping.networklog.aj;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements com.dianping.monitor.e {
    private static final String TAG = "BaseMonitorService";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String globalUnionId;
    public final int appId;
    public final int appVersionCode;
    private e catMonitorService;
    public final Context context;
    private i crashMonitorHelper;
    private j dnsMonitorService;
    protected String monitorUrl;
    public boolean suspend;
    private static final ConcurrentLinkedQueue<InterfaceC0092a> baseMonitorArray = new ConcurrentLinkedQueue<>();
    public static boolean DEBUG = false;
    private static final Object NV_LINKER_REGISTER_LOCK = new Object();
    private static final AtomicBoolean initLogReportSwitcher = new AtomicBoolean();
    private static final AtomicBoolean initRaptorSelfMonitor = new AtomicBoolean();
    private static String system_Version = "";
    public static String SharkVersion = null;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.monitor.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0092a {
    }

    public int containerType() {
        return 1;
    }

    public abstract String getUnionid();

    @Deprecated
    public int version() {
        return 10;
    }

    @Deprecated
    public a(Context context, String str) {
        this(context, 1);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d8c45d984edfb959d0bfc105aa711fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d8c45d984edfb959d0bfc105aa711fa");
        }
    }

    public a(Context context) {
        this(context, c.a());
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9994a4a31ad03b2e42d5e978bf3ad51e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9994a4a31ad03b2e42d5e978bf3ad51e");
        }
    }

    public a(Context context, int i) {
        this(context, i, com.dianping.monitor.h.b(context));
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cc0d3d42681e149df1fd8ed4a84ed84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cc0d3d42681e149df1fd8ed4a84ed84");
        }
    }

    public a(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4f74a6d73a3b5e3aae0345798fb1f6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4f74a6d73a3b5e3aae0345798fb1f6c");
            return;
        }
        this.context = context.getApplicationContext();
        int a = c.a();
        i = a > 0 ? a : i;
        this.appId = i;
        t.b = i;
        this.appVersionCode = com.dianping.monitor.h.a(str);
        system_Version = com.dianping.monitor.h.b();
        this.crashMonitorHelper = i.a(context, i, "");
        this.dnsMonitorService = j.a(context, i, "");
        initCatMonitorService(context, i);
        initLogReportSwitch(i);
        initLoganUploadWriteStatus();
        registerNVLinker();
        initRaptorSelfMonitor();
        com.dianping.monitor.h.d(this.context);
        com.dianping.monitor.h.a(this.appId);
    }

    public static void setSharkSdkVersion(String str) {
        SharkVersion = str;
    }

    private void initCatMonitorService(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83977c96911343d355a4bf46dccc909c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83977c96911343d355a4bf46dccc909c");
        } else {
            this.catMonitorService = e.a(context, i, this);
        }
    }

    private void initLoganUploadWriteStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc2a16a210f87dbcadf9614893bd6be9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc2a16a210f87dbcadf9614893bd6be9");
        } else {
            com.dianping.networklog.c.a(new com.dianping.networklog.i() { // from class: com.dianping.monitor.impl.a.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.networklog.i
                public final void a(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "754f3107b7179a796314e0fd9399681d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "754f3107b7179a796314e0fd9399681d");
                    } else {
                        a.this.send(0L, str, 0, 0, i, 0, 0, 0, "", "", 100, true, false);
                    }
                }
            });
        }
    }

    private void registerNVLinker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8375954b6a48e83a659fe3d1f5253863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8375954b6a48e83a659fe3d1f5253863");
        } else if (NVLinker.getMonitor() == null) {
            synchronized (NV_LINKER_REGISTER_LOCK) {
                if (NVLinker.getMonitor() == null) {
                    NVLinker.registerMonitor(this);
                }
            }
        }
    }

    private void initLogReportSwitch(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b97685283dddff702f2d0e0677ce79ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b97685283dddff702f2d0e0677ce79ad");
        } else if (this.context == null || i <= 0 || !initLogReportSwitcher.compareAndSet(false, true)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            com.dianping.monitor.c cVar = new com.dianping.monitor.c(sb.toString(), "");
            com.dianping.logreportswitcher.c cVar2 = c.b.a;
            c.a aVar = new c.a() { // from class: com.dianping.monitor.impl.a.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.logreportswitcher.c.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "899a1684b6e1d70cd05b67346cba26ea", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "899a1684b6e1d70cd05b67346cba26ea");
                        return;
                    }
                    com.dianping.monitor.a.a("logreportswitcher update config > " + str);
                }
            };
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.logreportswitcher.c.a;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect3, false, "66e0ecb90ed09a3c10d1314de98faf13", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect3, false, "66e0ecb90ed09a3c10d1314de98faf13");
            } else {
                com.dianping.logreportswitcher.utils.d.a().b = aVar;
            }
            c.b.a.a(this.context, cVar);
        }
    }

    private void initRaptorSelfMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62e6f3c0f3f11e44f8a44433150a94b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62e6f3c0f3f11e44f8a44433150a94b6");
        } else if (this.context == null || this.appId <= 0 || !initRaptorSelfMonitor.compareAndSet(false, true)) {
        } else {
            r.b = this.context;
            r.c = this.appId;
            String _unionid = _unionid();
            if (_unionid == null) {
                _unionid = "";
            }
            r.d = _unionid;
        }
    }

    public void setDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "223f23047e48e31ef7bba0391ff68697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "223f23047e48e31ef7bba0391ff68697");
            return;
        }
        j jVar = this.dnsMonitorService;
        if (i > 0) {
            jVar.d = i;
        }
    }

    public void uploadDNS(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f07ea1697bd53f6064daeffa948dddf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f07ea1697bd53f6064daeffa948dddf");
            return;
        }
        j jVar = this.dnsMonitorService;
        Object[] objArr2 = {str, list};
        ChangeQuickRedirect changeQuickRedirect3 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect3, false, "249dbd8038813aaa7ec6a3f5dc229f2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect3, false, "249dbd8038813aaa7ec6a3f5dc229f2d");
        } else {
            jVar.a(str, list, null, j.a.DNS_MONITOR_DNS_TYPE_UNKNOWN);
        }
    }

    public void uploadDNS(String str, List<String> list, String str2) {
        Object[] objArr = {str, list, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "612726fde52536743ca6d0f095648066", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "612726fde52536743ca6d0f095648066");
        } else {
            this.dnsMonitorService.a(str, list, str2);
        }
    }

    public void uploadDNS(String str, List<String> list, j.a aVar) {
        Object[] objArr = {str, list, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c7097b42b36b8255c1ee59a705482e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c7097b42b36b8255c1ee59a705482e");
        } else {
            this.dnsMonitorService.a(str, list, null, aVar);
        }
    }

    public void uploadDNS(String str, List<String> list, String str2, j.a aVar) {
        Object[] objArr = {str, list, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2e8e1aac5c0398a0234f376f691bb83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2e8e1aac5c0398a0234f376f691bb83");
        } else {
            this.dnsMonitorService.a(str, list, str2, aVar);
        }
    }

    public void uploadCrashLog(long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9fe144a9f090322cfd4b32e93f98c7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9fe144a9f090322cfd4b32e93f98c7c");
        } else {
            this.crashMonitorHelper.a(j, _unionid(), str, str2, str3, null);
        }
    }

    public void uploadCrashLog(long j, String str, String str2, String str3, String str4) {
        Object[] objArr = {new Long(j), str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15de07a3c066e3bf24694246fddf653b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15de07a3c066e3bf24694246fddf653b");
        } else {
            this.crashMonitorHelper.a(j, _unionid(), str, str2, str3, str4);
        }
    }

    public void setCrashMonitorTimes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "275f6f2c0720d2f0146ff8e567a8fd12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "275f6f2c0720d2f0146ff8e567a8fd12");
            return;
        }
        i iVar = this.crashMonitorHelper;
        if (i > 0) {
            iVar.c = i;
        }
    }

    @Deprecated
    public a(Context context, String str, int i) {
        this(context, i);
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5c3defbd88224478ce3ef280e01874c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5c3defbd88224478ce3ef280e01874c");
        }
    }

    @Override // com.dianping.monitor.e
    public void pv(long j, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "746fa6600a16924add2adc9a66d617c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "746fa6600a16924add2adc9a66d617c7");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, null, null, 100, false, false);
        }
    }

    @Override // com.dianping.monitor.e
    public void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8726e224d024f300c301c826f87a7d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8726e224d024f300c301c826f87a7d8");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, null, i7, false, false);
        }
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c276fe8600b625beac8e1ae70e9255a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c276fe8600b625beac8e1ae70e9255a3");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, str3, i7, false, false);
        }
    }

    @Override // com.dianping.monitor.e
    public void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a4d75bb334913fc21e19eb71dcb09b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a4d75bb334913fc21e19eb71dcb09b");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, null, 100, false, false);
        }
    }

    public void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7, boolean z) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae2e12622b2b99862baf2096bfaf4447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae2e12622b2b99862baf2096bfaf4447");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, str3, i7, false, false, z, null);
        }
    }

    @Override // com.dianping.monitor.e
    public void pvCat(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, int i8, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, Integer.valueOf(i8), str4, str5, str6, hashMap, hashMap2, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4ea3bb09ae349dccb0e48ead2f8efe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4ea3bb09ae349dccb0e48ead2f8efe2");
        } else {
            pvShark(j, str, i, i2, i3, i4, i4, i5, i6, i7, str2, str3, i8, str4, str5, str6, hashMap, hashMap2, str7, str8, null);
        }
    }

    public void pvPike(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7, String str4) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45370a019b7df4d17af7ee46ce36e9ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45370a019b7df4d17af7ee46ce36e9ca");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, str3, i7, false, false, false, str4);
        }
    }

    public void pvShark(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, int i9, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8, String str9) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str2, str3, Integer.valueOf(i9), str4, str5, str6, hashMap, hashMap2, str7, str8, str9};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26e486931d7c76c1d11a906e219b51f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26e486931d7c76c1d11a906e219b51f0");
        } else {
            pvShark(j, str, i, i2, i3, i4, i5, i6, i7, i8, str2, str3, i9, str4, str5, str6, hashMap, hashMap2, str7, str8, str9, null);
        }
    }

    public void pvShark(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, int i9, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8, String str9, d.a aVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str2, str3, Integer.valueOf(i9), str4, str5, str6, hashMap, hashMap2, str7, str8, str9, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b03c637c6c36ab0f3cfaca51d065fe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b03c637c6c36ab0f3cfaca51d065fe5");
        } else {
            pvShark(j, str, i, i2, i3, i4, i5, i6, i7, i8, str2, str3, i9, str4, str5, str6, hashMap, hashMap2, str7, str8, str9, aVar, false);
        }
    }

    public void pvShark(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, int i9, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8, String str9, d.a aVar, boolean z) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str2, str3, Integer.valueOf(i9), str4, str5, str6, hashMap, hashMap2, str7, str8, str9, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4912935547d87937daedcf5b17eb3d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4912935547d87937daedcf5b17eb3d34");
            return;
        }
        q qVar = new q();
        qVar.b = str4;
        qVar.c = str5;
        qVar.g = str;
        qVar.d = str6;
        qVar.e = hashMap;
        qVar.h = i6;
        qVar.j = i;
        qVar.i = i8;
        qVar.k = i5;
        qVar.f = hashMap2;
        qVar.m = i7;
        qVar.l = i2;
        qVar.n = i3;
        qVar.o = str2;
        qVar.p = str7;
        qVar.q = str8;
        qVar.r = str3;
        d dVar = new d();
        dVar.b = j;
        dVar.c = str;
        dVar.d = i;
        dVar.e = i2;
        dVar.f = i5;
        dVar.u = i4;
        dVar.s = version();
        dVar.k = this.appVersionCode;
        dVar.g = i6;
        dVar.h = i7;
        dVar.i = i8;
        dVar.j = str2;
        dVar.l = str3;
        dVar.p = system_Version;
        dVar.m = i9;
        dVar.n = true;
        dVar.o = true;
        dVar.r = qVar;
        dVar.t = str9;
        dVar.x = containerType();
        dVar.z = aVar;
        dVar.y = z;
        send(dVar);
    }

    private static void handlerOnListenerBaseMonitorService(long j, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f30b408ca3efe6bbc1424e81697c5c3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f30b408ca3efe6bbc1424e81697c5c3f");
            return;
        }
        Iterator<InterfaceC0092a> it = baseMonitorArray.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void send(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85c594d988aeedfa00c6f324e974da7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85c594d988aeedfa00c6f324e974da7e");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, str3, i7, z, z2, false, null);
        }
    }

    private void send(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7, boolean z, boolean z2, boolean z3, String str4) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "728752179f7d245601d210e92d5c6b45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "728752179f7d245601d210e92d5c6b45");
            return;
        }
        handlerOnListenerBaseMonitorService(j, str, i, i2, i3, i4, i5, i6);
        d dVar = new d();
        dVar.b = j;
        dVar.c = str;
        dVar.d = i;
        dVar.e = i2;
        dVar.k = this.appVersionCode;
        dVar.s = version();
        dVar.f = i3;
        dVar.g = i4;
        dVar.h = i5;
        dVar.i = i6;
        dVar.j = str2;
        dVar.l = str3;
        dVar.p = system_Version;
        dVar.m = i7;
        dVar.n = z;
        dVar.o = z2;
        dVar.x = containerType();
        dVar.y = z3;
        dVar.t = str4;
        send(dVar);
    }

    private void send(d dVar) {
        int size;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c4a3f0a91133aeb89b75db0ef0f2655", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c4a3f0a91133aeb89b75db0ef0f2655");
        } else if (dVar == null || this.catMonitorService == null) {
        } else {
            dVar.q = new g(this.monitorUrl, dVar.s > 0 ? dVar.s : version(), basemonitorGetUnionid());
            e eVar = this.catMonitorService;
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "2895cc545a1eceeb18c7fa49d5e1c64e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "2895cc545a1eceeb18c7fa49d5e1c64e");
                return;
            }
            if (dVar != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.dianping.networklog.g.a;
                dVar.v = PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "f97d25908ffefebf557754b4ff266cd1", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "f97d25908ffefebf557754b4ff266cd1")).longValue() : aj.c();
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.dianping.networklog.g.a;
                dVar.w = PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "f8ebbcec5dfd00b0ad617ce371da519e", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "f8ebbcec5dfd00b0ad617ce371da519e")).longValue() : aj.d();
            }
            synchronized (eVar.e) {
                size = eVar.e.size();
                if (size < com.dianping.monitor.b.m()) {
                    eVar.e.add(dVar);
                }
            }
            eVar.b.removeCallbacks(eVar.f);
            if (size >= com.dianping.monitor.b.k()) {
                if (eVar.d != null) {
                    e.a.b(eVar.d);
                    return;
                }
                return;
            }
            eVar.b.postDelayed(eVar.f, com.dianping.monitor.b.l());
        }
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a26494a354f847a8dec02eeca092009c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a26494a354f847a8dec02eeca092009c");
        } else {
            send(j, str, i, i2, i3, i4, i5, i6, str2, str3, 100, false, false);
        }
    }

    public void pv4(com.dianping.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfe3daea2cb653240ab8751d2f61036f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfe3daea2cb653240ab8751d2f61036f");
        } else if (dVar == null) {
        } else {
            handlerOnListenerBaseMonitorService(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h);
            d dVar2 = new d();
            dVar2.b = dVar.a;
            dVar2.c = dVar.b;
            dVar2.d = dVar.c;
            dVar2.e = dVar.d;
            dVar2.k = this.appVersionCode;
            dVar2.s = version();
            dVar2.f = dVar.e;
            dVar2.g = dVar.f;
            dVar2.h = dVar.g;
            dVar2.i = dVar.h;
            dVar2.j = dVar.i;
            dVar2.l = dVar.j;
            dVar2.p = system_Version;
            dVar2.m = dVar.k;
            dVar2.n = false;
            dVar2.o = false;
            dVar2.x = containerType();
            dVar2.z = dVar.l;
            send(dVar2);
        }
    }

    @Deprecated
    public void setSuspending(boolean z) {
        this.suspend = z;
    }

    @Override // com.dianping.monitor.e
    public String getCommand(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f371b35c1644b48f692d03fe69606c0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f371b35c1644b48f692d03fe69606c0");
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        int lastIndexOf = str.lastIndexOf(47, indexOf);
        if (lastIndexOf < 0) {
            lastIndexOf = -1;
        }
        return str.substring(lastIndexOf + 1, indexOf);
    }

    public String basemonitorGetUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "038a62c727369ff8771b7e60de385cde", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "038a62c727369ff8771b7e60de385cde") : _unionid();
    }

    private String _unionid() {
        try {
            if (!TextUtils.isEmpty(globalUnionId)) {
                return globalUnionId;
            }
            return getUnionid();
        } catch (Exception e) {
            e.printStackTrace();
            if (DEBUG) {
                Log.e("basemonitor", "获取unionid出现异常啦!!");
                return "";
            }
            return "";
        }
    }

    public static String getUnionId() {
        return globalUnionId;
    }

    public static void setUnionId(String str) {
        globalUnionId = str;
    }

    public void startEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ee8ccb64bc1eeb90f6af9eea383f437", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ee8ccb64bc1eeb90f6af9eea383f437");
        } else {
            t.a(this.context, c.d(), _unionid(), str);
        }
    }

    public void addEvent(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c837dcdeca48b3b23fd10762e312270", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c837dcdeca48b3b23fd10762e312270");
        } else {
            t.a(str, i);
        }
    }

    public void addEvent(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4713ee8e596d919250d64c95c618e0fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4713ee8e596d919250d64c95c618e0fa");
        } else {
            t.a(str, i, j);
        }
    }

    public void startEvent(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06d3f53ebd2299c334c6fd39d97b86b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06d3f53ebd2299c334c6fd39d97b86b9");
        } else {
            t.a(this.context, c.d(), _unionid(), str, j);
        }
    }

    public void addEvent(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ea15c6f8e11ef8612b2a7c9eb400999", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ea15c6f8e11ef8612b2a7c9eb400999");
        } else {
            t.a(str, i, i2);
        }
    }

    public void sendEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09c8da174c5e91d510c9e467ad431c3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09c8da174c5e91d510c9e467ad431c3a");
        } else {
            t.a(str);
        }
    }

    public int getAppId() {
        return this.appId;
    }

    @Deprecated
    public JSONObject getSpeedMonitorConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69e32cf1a35164a80ce5ced26ec585a0", 6917529027641081856L) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69e32cf1a35164a80ce5ced26ec585a0") : new JSONObject();
    }

    public static void setOnListenerBaseMonitorService(InterfaceC0092a interfaceC0092a) {
        Object[] objArr = {interfaceC0092a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c07e95f928bad0a9e45f9d84898c0c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c07e95f928bad0a9e45f9d84898c0c6");
        } else if (interfaceC0092a == null || baseMonitorArray.contains(interfaceC0092a)) {
        } else {
            baseMonitorArray.add(interfaceC0092a);
        }
    }

    public static void removeOnListenerBaseMonitorService(InterfaceC0092a interfaceC0092a) {
        Object[] objArr = {interfaceC0092a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5fd9731f0ffffe4768b7f7f3964d94a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5fd9731f0ffffe4768b7f7f3964d94a");
        } else if (interfaceC0092a != null && baseMonitorArray.contains(interfaceC0092a)) {
            baseMonitorArray.remove(interfaceC0092a);
        }
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public void flush() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "062b6a039fe4032f471ccee5ace580af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "062b6a039fe4032f471ccee5ace580af");
        } else if (c.b.a.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE)) {
            e eVar = this.catMonitorService;
            if (eVar.d != null) {
                e.a.a(eVar.d);
            }
            if (NVLinker.isAppBackground()) {
                n.a(eVar.c).a();
                com.dianping.monitor.metric.f.a().b();
            }
        }
    }
}
