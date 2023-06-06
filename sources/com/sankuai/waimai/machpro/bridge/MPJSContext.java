package com.sankuai.waimai.machpro.bridge;

import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.f;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPJSContext {
    public static ChangeQuickRedirect a;
    public final long b;
    public boolean c;
    public b d;

    private native Object _callJSModule(long j, String str, String str2, MachArray machArray);

    private native Object _callJsMethod(long j, long j2, String str, MachArray machArray);

    private native void _connectToDebugger(long j, String str);

    private native void _destroy(long j);

    private native void _evaluateBinary(long j, byte[] bArr);

    private native void _executePendingJob(long j);

    private native long _initJSContext(MPBridge mPBridge, MachMap machMap);

    private native Object _invokeJSCallBack(long j, long j2, Object obj);

    private native void _sendEvent(long j, String str, MachMap machMap);

    private native void _setData(long j, MachMap machMap);

    private native void _updateMachEnv(long j, MachMap machMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void _releaseJSCallBack(long j, long j2);

    public native void _setDisableGc(long j, int i);

    public native void _triggerGC(long j);

    public native void _wirtePerformanceData(long j, MachMap machMap);

    static {
        if (f.a().l) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            k.a("mach-pro", arrayList);
            com.sankuai.waimai.machpro.util.a.d("主线程加载Mach Pro So");
        } catch (Throwable th) {
            com.sankuai.waimai.machpro.util.a.a("MPJSContext | libmach-pro.so加载失败！！！" + th.getMessage());
        }
    }

    public MPJSContext(MPBridge mPBridge) {
        Object[] objArr = {mPBridge};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf77d150ec2e4a62a88d3bfa550d025c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf77d150ec2e4a62a88d3bfa550d025c");
            return;
        }
        a();
        MachMap machMap = null;
        if (f.a().i != null) {
            com.sankuai.waimai.machpro.c cVar = f.a().i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "5f35765f6da39727128c9f95507ddeee", RobustBitConfig.DEFAULT_VALUE)) {
                machMap = (MachMap) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "5f35765f6da39727128c9f95507ddeee");
            } else {
                if (cVar.l == null) {
                    cVar.l = new MachMap();
                    cVar.l.put("appName", cVar.b);
                    cVar.l.put("version", cVar.d);
                    cVar.l.put(DeviceInfo.OS_NAME, cVar.e);
                    cVar.l.put("osVersion", cVar.f);
                    cVar.l.put("uuid", cVar.h);
                    cVar.l.put("scale", Float.valueOf(com.sankuai.waimai.machpro.a.b.density));
                    cVar.l.put("densityDpi", Integer.valueOf(com.sankuai.waimai.machpro.a.b.densityDpi));
                    cVar.l.put("isDebug", Boolean.valueOf(cVar.i));
                    cVar.l.put("isIOS", Boolean.FALSE);
                    cVar.l.put("isAndroid", Boolean.TRUE);
                    cVar.l.put("navigationBarHeight", Integer.valueOf(cVar.k));
                    cVar.l.put(DeviceInfo.DEVICE_MODEL, cVar.g);
                    cVar.l.put("isFullScreen", Boolean.FALSE);
                }
                machMap = cVar.l;
            }
        }
        this.b = _initJSContext(mPBridge, machMap);
        this.c = false;
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.sankuai.waimai.machpro.bridge.MPJSContext.1
            public static ChangeQuickRedirect a;

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58b01ad6cba7b1aa4cba4522c4e4453b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58b01ad6cba7b1aa4cba4522c4e4453b");
                } else if (MPJSContext.this.c) {
                } else {
                    MPJSContext.this.c();
                    Choreographer.getInstance().postFrameCallback(this);
                    com.sankuai.waimai.machpro.animator.a.a().b();
                }
            }
        });
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee7328d573840fa7dc19d05275c7f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee7328d573840fa7dc19d05275c7f14");
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("JavaScript must run on the main thread");
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e4c242df591f8874dd589b2f7999f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e4c242df591f8874dd589b2f7999f5");
            return;
        }
        a();
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            _destroy(this.b);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
        }
    }

    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc20688cb48e1d68bab47ac3d93d5fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc20688cb48e1d68bab47ac3d93d5fa");
            return;
        }
        a();
        if (this.c || bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            _evaluateBinary(this.b, bArr);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
        }
    }

    public final Object a(String str, String str2, MachArray machArray) {
        Object[] objArr = {str, str2, machArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f93e71ea2acd0b0879880381db11a3e1", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f93e71ea2acd0b0879880381db11a3e1");
        }
        a();
        if (this.c || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return _callJSModule(this.b, str, str2, machArray);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
            return null;
        }
    }

    public final void a(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25231e2c43d95e0dbc5d559e74d6a582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25231e2c43d95e0dbc5d559e74d6a582");
            return;
        }
        a();
        if (machMap == null || machMap.size() <= 0) {
            return;
        }
        try {
            _updateMachEnv(this.b, machMap);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
        }
    }

    public final void b(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "623f079e5319a95e86a37a2d0738f74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "623f079e5319a95e86a37a2d0738f74d");
            return;
        }
        a();
        if (this.c) {
            return;
        }
        try {
            _setData(this.b, machMap);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
        }
    }

    public final Object a(long j, String str, MachArray machArray) {
        Object[] objArr = {new Long(j), str, machArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0dad7149200cccf50e9c5672c7c2cf2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0dad7149200cccf50e9c5672c7c2cf2");
        }
        a();
        if (this.c || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return _callJsMethod(this.b, j, str, machArray);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
            return null;
        }
    }

    public final Object a(long j, Object obj) {
        Object[] objArr = {new Long(j), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0c37c7d780cc6cfb698d69532c50c6", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0c37c7d780cc6cfb698d69532c50c6");
        }
        a();
        if (this.c) {
            return null;
        }
        try {
            return _invokeJSCallBack(this.b, j, obj);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
            return null;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8168eacd021e348dbc38dd539b7dedaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8168eacd021e348dbc38dd539b7dedaa");
            return;
        }
        a();
        if (this.c) {
            return;
        }
        try {
            _executePendingJob(this.b);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
        }
    }

    public final void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35752b9324ae56bb6d4e790ef7bb82a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35752b9324ae56bb6d4e790ef7bb82a");
            return;
        }
        a();
        if (this.c) {
            return;
        }
        try {
            _sendEvent(this.b, str, machMap);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
        }
    }
}
