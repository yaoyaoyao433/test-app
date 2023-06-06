package com.sankuai.waimai.irmo.canvas.bridge;

import android.os.Looper;
import android.view.Choreographer;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.canvas.container.INFBridge;
import com.sankuai.waimai.irmo.canvas.module.INFCanvasApi;
import com.sankuai.waimai.irmo.canvas.util.b;
import com.sankuai.waimai.irmo.utils.d;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class INFJSContext {
    public static ChangeQuickRedirect a;
    public static volatile boolean b;
    long c;
    boolean d;

    private native void _destroy(long j);

    private native void _evaluateBinary(long j, byte[] bArr);

    private native long _initJSContext(INFBridge iNFBridge, INFCanvasApi iNFCanvasApi);

    private native Object _invokeJSCallBack(long j, long j2, Object obj);

    private native void _sendEvent(long j, String str, CanvasMap canvasMap);

    private native void _setData(long j, CanvasMap canvasMap);

    private static native void initEnv(CanvasMap canvasMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void _releaseJSCallBack(long j, long j2);

    static {
        try {
            if (b) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("mach-pro");
            k.a("inf-canvas", arrayList);
            b = true;
            d.a("Java inf_canvas_log: So load success ", new Object[0]);
        } catch (Throwable th) {
            d.a("Java inf_canvas_log: So load failed , msg: " + th.getMessage(), new Object[0]);
        }
    }

    public INFJSContext(final INFBridge iNFBridge, INFCanvasApi iNFCanvasApi) {
        Object[] objArr = {iNFBridge, iNFCanvasApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46768577c2819d2c39135667a6ee30b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46768577c2819d2c39135667a6ee30b");
            return;
        }
        b();
        try {
            this.c = _initJSContext(iNFBridge, iNFCanvasApi);
        } catch (Exception unused) {
            d.a("Java inf_canvas_log: _initJSContext  failed", new Object[0]);
        }
        this.d = false;
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.sankuai.waimai.irmo.canvas.bridge.INFJSContext.1
            public static ChangeQuickRedirect a;

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0776eab378bd8bee326420cc66b6b22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0776eab378bd8bee326420cc66b6b22");
                } else if (INFJSContext.this.d) {
                } else {
                    Choreographer.getInstance().postFrameCallback(this);
                    if (iNFBridge != null) {
                        iNFBridge.frameCallback();
                    }
                }
            }
        });
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d950f5acea076a7f303bfbff22771e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d950f5acea076a7f303bfbff22771e06");
        } else if (!b) {
            d.a("Java inf_canvas_log: INFJSContext init failed , so is not loaded ", new Object[0]);
        } else if (com.sankuai.waimai.irmo.a.a().c == null || com.sankuai.waimai.irmo.a.a().c.a() == null) {
        } else {
            initEnv(com.sankuai.waimai.irmo.a.a().c.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4eb0e847c89e99248c3e15bdd1fdca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4eb0e847c89e99248c3e15bdd1fdca0");
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("JavaScript must run on the main thread");
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edb2a0388115f0a712a5c1791e32508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edb2a0388115f0a712a5c1791e32508");
            return;
        }
        b();
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            _destroy(this.c);
        } catch (Exception e) {
            d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + b.a(e.getStackTrace()), new Object[0]);
        }
    }

    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fccccb545849161480f4f2479a8975eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fccccb545849161480f4f2479a8975eb");
            return;
        }
        b();
        if (this.d || bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            _evaluateBinary(this.c, bArr);
        } catch (Exception e) {
            d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + b.a(e.getStackTrace()), new Object[0]);
        }
    }

    public final void a(CanvasMap canvasMap) {
        Object[] objArr = {canvasMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468771c105b3501ed1dfe70b7781517b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468771c105b3501ed1dfe70b7781517b");
            return;
        }
        b();
        if (this.d) {
            return;
        }
        try {
            _setData(this.c, canvasMap);
        } catch (Exception e) {
            d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + b.a(e.getStackTrace()), new Object[0]);
        }
    }

    public final Object a(long j, Object obj) {
        Object[] objArr = {new Long(j), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bd7bd6282dba80c45669f995cb7549", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bd7bd6282dba80c45669f995cb7549");
        }
        b();
        if (this.d) {
            return null;
        }
        try {
            return _invokeJSCallBack(this.c, j, obj);
        } catch (Exception e) {
            d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + b.a(e.getStackTrace()), new Object[0]);
            return null;
        }
    }

    public final void a(String str, CanvasMap canvasMap) {
        Object[] objArr = {str, canvasMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16984d591e098a50dd36bba022a2b0ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16984d591e098a50dd36bba022a2b0ab");
            return;
        }
        b();
        if (this.d) {
            return;
        }
        try {
            _sendEvent(this.c, str, canvasMap);
        } catch (Exception e) {
            d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + b.a(e.getStackTrace()), new Object[0]);
        }
    }
}
