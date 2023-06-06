package com.meituan.android.common.weaver.impl;

import android.content.Context;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.weaver.impl.WeaveReader;
import com.meituan.android.common.weaver.impl.rules.RootRule;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.WeaverParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WeaverImplMain extends AbsWeaver implements WeaveReader.WeaveReaderListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    @VisibleForTesting
    public DelayChain mDelayChain;
    @GuardedBy("this")
    @VisibleForTesting
    public LocalServerSocket mServer;
    @GuardedBy("this")
    private LocalSocket mSocket;

    public WeaverImplMain(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e92aca0d459b64eff3e2df9b1eeba5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e92aca0d459b64eff3e2df9b1eeba5f");
        } else {
            this.mDelayChain = new DelayChain(new RootRule(), RemoteConfig.sConfig.getDelay());
        }
    }

    public synchronized void accept() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25d7004e347f8aa6622afeb64c32cbb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25d7004e347f8aa6622afeb64c32cbb5");
            return;
        }
        this.mSocket = new LocalSocket();
        this.mSocket.bind(new LocalSocketAddress(socketPath(), LocalSocketAddress.Namespace.FILESYSTEM));
        this.mServer = new LocalServerSocket(this.mSocket.getFileDescriptor());
        loop();
    }

    @VisibleForTesting
    public synchronized void loop() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9322f8bced0d03e54b29f6ba990b121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9322f8bced0d03e54b29f6ba990b121");
        }
        while (true) {
            new WeaveReader(this, this.mServer.accept(), this).readInChildThread();
        }
    }

    @Override // com.meituan.android.common.weaver.impl.AbsWeaver
    public void onWeaveBg(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d5a8ec19ba16aa445d057dc63ad0c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d5a8ec19ba16aa445d057dc63ad0c0b");
        } else {
            this.mDelayChain.append(weaverEvent);
        }
    }

    @Nullable
    public WeaverEvent parseWeaveEvent(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17adf7305e9dcbb49703944c09267d9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17adf7305e9dcbb49703944c09267d9c");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return WeaverParser.parseFromJson(jSONObject.optString("t", ""), jSONObject.optJSONObject("m"), jSONObject.optLong("s"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4dd27a689e30b8e2440514c8089c622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4dd27a689e30b8e2440514c8089c622");
            return;
        }
        System.out.println("here");
        IOUtils.close(this.mSocket);
        if (this.mServer != null) {
            this.mServer.close();
        }
        this.mSocket = null;
        this.mServer = null;
    }

    @Override // com.meituan.android.common.weaver.impl.WeaveReader.WeaveReaderListener
    public void onWeaveEventReceive(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f9dfe4a2390f0e3c77f4333eadccc6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f9dfe4a2390f0e3c77f4333eadccc6d");
        } else {
            this.mDelayChain.append(weaverEvent);
        }
    }
}
