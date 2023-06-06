package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.foundation.utils.p;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    protected static final String EMPTY_KEY = "empty_header_key";
    private static final int MSG_ERROR = 260;
    private static final int MSG_FINISHED = 259;
    private static final int MSG_ON_PROGRESS = 258;
    private static final int MSG_START = 257;
    private static final int STATE_ERROR = 516;
    private static final int STATE_FINISH = 515;
    private static final int STATE_INITIALIZED = 513;
    private static final int STATE_START = 514;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected com.sankuai.waimai.platform.net.networkdiagnose.a callback;
    protected Context context;
    private com.sankuai.waimai.platform.net.networkdiagnose.b diagnostic;
    private JSONObject diagnosticResult;
    protected final HandlerC1070a handler;
    private int state;
    private static final String[] DIAGNOSTIC_TAGS = {"Diagnostic"};
    private static final Executor EXECUTOR = c.a("Diagnostic-Runner");

    public String getName() {
        return "Strategy";
    }

    public abstract void onDiagnose();

    public void onProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a39242755b9c4d13a55b2b569f3bda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a39242755b9c4d13a55b2b569f3bda2");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.networkdiagnose.strategy.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class HandlerC1070a extends Handler {
        public static ChangeQuickRedirect a;
        private a b;

        public HandlerC1070a(a aVar) {
            this.b = aVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c7acdc83e1577bcf31c7a2ab6cfa96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c7acdc83e1577bcf31c7a2ab6cfa96");
                return;
            }
            switch (message.what) {
                case 257:
                    this.b.onStart();
                    return;
                case a.MSG_ON_PROGRESS /* 258 */:
                    this.b.onProgress(message.arg1);
                    return;
                case a.MSG_FINISHED /* 259 */:
                    this.b.onFinished();
                    return;
                case 260:
                    this.b.onError();
                    return;
                default:
                    return;
            }
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d23ff548e095e06fe5d11c651152a514", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d23ff548e095e06fe5d11c651152a514");
            return;
        }
        this.state = 513;
        this.handler = new HandlerC1070a(this);
        this.callback = null;
        this.diagnosticResult = new JSONObject();
        this.context = context;
    }

    public a(Context context, com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76eb0d9c0891adc11308af9132c00eaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76eb0d9c0891adc11308af9132c00eaf");
            return;
        }
        this.state = 513;
        this.handler = new HandlerC1070a(this);
        this.callback = null;
        this.diagnosticResult = new JSONObject();
        this.context = context;
        this.callback = aVar;
    }

    public void setNetworkDiagnostic(com.sankuai.waimai.platform.net.networkdiagnose.b bVar) {
        this.diagnostic = bVar;
    }

    public void diagnose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49816ee49e2e83455ab9f053d60f033a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49816ee49e2e83455ab9f053d60f033a");
        } else if (isFinished()) {
            throw new RuntimeException("Diagnostic strategy can only be run once!");
        } else {
            if (isStarted() || isErrored()) {
                return;
            }
            if (p.b(this.context) != "Unavailable") {
                this.handler.obtainMessage(257).sendToTarget();
                com.sankuai.waimai.launcher.util.aop.b.a(EXECUTOR, new Runnable() { // from class: com.sankuai.waimai.platform.net.networkdiagnose.strategy.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df8778f154a7aa1612760bfd0ee643e8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df8778f154a7aa1612760bfd0ee643e8");
                            return;
                        }
                        try {
                            a.this.onDiagnose();
                        } catch (Exception e) {
                            a.this.handler.obtainMessage(260, e).sendToTarget();
                        }
                        a.this.handler.obtainMessage(a.MSG_FINISHED).sendToTarget();
                    }
                });
                return;
            }
            onError();
        }
    }

    public void setDiagnosticCallback(com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        boolean z = false;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72a78e4f6ba05cdc5a6a3b66f90b4f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72a78e4f6ba05cdc5a6a3b66f90b4f58");
            return;
        }
        this.callback = aVar;
        if (this.diagnostic != null) {
            com.sankuai.waimai.platform.net.networkdiagnose.b bVar = this.diagnostic;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.networkdiagnose.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "767a238b08cdc398cfa7e827623f0052", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "767a238b08cdc398cfa7e827623f0052")).booleanValue();
            } else if (aVar != null && bVar.b != null) {
                z = bVar.b.contains(aVar);
            }
            if (z) {
                return;
            }
            this.diagnostic.a(aVar);
        }
    }

    public boolean hasDiagnosticCallback() {
        return this.callback != null;
    }

    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce9e5eca1efbaa1a434953e45a88a696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce9e5eca1efbaa1a434953e45a88a696");
            return;
        }
        this.state = STATE_START;
        if (this.callback != null) {
            this.callback.a(getName());
        }
    }

    public void onFinished() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "608e6274d0f72cd14f4e05d59c58f70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "608e6274d0f72cd14f4e05d59c58f70d");
        } else if (isFinished() || isErrored()) {
        } else {
            this.state = STATE_FINISH;
            if (this.callback != null) {
                this.callback.b(getName());
            }
            if (this.diagnostic != null) {
                this.diagnostic.a();
            }
        }
    }

    public void onError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ad1361725b4f1586945b6dd12c0194d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ad1361725b4f1586945b6dd12c0194d");
        } else if (isFinished() || isErrored()) {
        } else {
            this.state = STATE_ERROR;
            if (this.callback != null) {
                this.callback.c(getName());
            }
            if (this.diagnostic != null) {
                this.diagnostic.a();
            }
        }
    }

    private boolean isStarted() {
        return this.state == STATE_START;
    }

    public boolean isFinished() {
        return this.state == STATE_FINISH;
    }

    public boolean isErrored() {
        return this.state == STATE_ERROR;
    }

    public JSONObject getDiagnosticResult() {
        return this.diagnosticResult;
    }

    public void publishResult(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0841bb785e531eea9f9efa8f22d0ed43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0841bb785e531eea9f9efa8f22d0ed43");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                this.diagnosticResult.put(str, obj);
                com.dianping.networklog.c.a(getName() + '#' + str + ":\n" + obj, 3, DIAGNOSTIC_TAGS);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void destroy() {
        this.state = STATE_FINISH;
    }
}
