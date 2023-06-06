package com.meituan.android.common.weaver.impl;

import android.content.Context;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WeaverImplSubProcess extends AbsWeaver {
    public static ChangeQuickRedirect changeQuickRedirect;
    @VisibleForTesting
    public ErrorReporter mErrorReporter;
    private LocalSocket mSocket;
    @GuardedBy("this")
    @VisibleForTesting
    public BufferedWriter mWriter;

    public WeaverImplSubProcess(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c30882ec51e4dd013dfe4e5127bca7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c30882ec51e4dd013dfe4e5127bca7e");
        } else {
            this.mErrorReporter = new ErrorReporter("weaver", 2);
        }
    }

    @Override // com.meituan.android.common.weaver.impl.AbsWeaver
    public synchronized void onWeaveBg(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aed71154b77110c659ab22e3cde81bda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aed71154b77110c659ab22e3cde81bda");
            return;
        }
        if (this.mWriter == null) {
            this.mWriter = open();
            if (this.mWriter == null) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", weaverEvent.getType());
        jSONObject.put("m", weaverEvent.toJson());
        jSONObject.put("s", weaverEvent.createMs());
        this.mWriter.write(jSONObject.toString());
        this.mWriter.write("\n");
        this.mWriter.flush();
    }

    @Nullable
    public BufferedWriter open() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f28b24d870e0ece0a4f508bc6df3f17", RobustBitConfig.DEFAULT_VALUE)) {
            return (BufferedWriter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f28b24d870e0ece0a4f508bc6df3f17");
        }
        this.mSocket = localSocket();
        try {
            this.mSocket.connect(new LocalSocketAddress(socketPath(), LocalSocketAddress.Namespace.FILESYSTEM));
            return new BufferedWriter(new OutputStreamWriter(this.mSocket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            IOUtils.close(this);
            return null;
        }
    }

    @VisibleForTesting
    public LocalSocket localSocket() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4540adb08a260f0f9f329b88b1422ab7", RobustBitConfig.DEFAULT_VALUE) ? (LocalSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4540adb08a260f0f9f329b88b1422ab7") : new LocalSocket(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5958ce1e3171f7a0aa0d7b3c124bd61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5958ce1e3171f7a0aa0d7b3c124bd61");
            return;
        }
        IOUtils.close(this.mWriter);
        IOUtils.close(this.mSocket);
        this.mWriter = null;
        this.mSocket = null;
    }
}
