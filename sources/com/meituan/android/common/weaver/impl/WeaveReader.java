package com.meituan.android.common.weaver.impl;

import android.net.LocalSocket;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEvent;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEventWithActivity;
import com.meituan.android.common.weaver.impl.natives.NativeFFPEvent;
import com.meituan.android.common.weaver.impl.natives.NativeRouteEvent;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.IOUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WeaveReader implements Closeable, Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicInteger sIndex = new AtomicInteger(0);
    private static ErrorReporter sReporter = new ErrorReporter("weaver-reader", 3);
    private final WeaveReaderListener listener;
    @VisibleForTesting
    public BufferedReader mReader;
    private final WeaverImplMain main;
    private final LocalSocket socket;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface WeaveReaderListener {
        void onWeaveEventReceive(@NonNull WeaverEvent weaverEvent);
    }

    public WeaveReader(@NonNull WeaverImplMain weaverImplMain, @NonNull LocalSocket localSocket, @NonNull WeaveReaderListener weaveReaderListener) {
        Object[] objArr = {weaverImplMain, localSocket, weaveReaderListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dc089e3ed861ec3c19cf9e9b9920454", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dc089e3ed861ec3c19cf9e9b9920454");
            return;
        }
        this.main = weaverImplMain;
        this.socket = localSocket;
        this.listener = weaveReaderListener;
    }

    public void readInChildThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "370415633097750966dd9e601bfe226c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "370415633097750966dd9e601bfe226c");
            return;
        }
        c.a("weave-reader#" + sIndex.addAndGet(1), this).start();
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4beff714bc35f13b2411630583db34b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4beff714bc35f13b2411630583db34b0");
            return;
        }
        try {
            ContainerEvent.fake();
            readUntilEOF();
        } catch (Throwable th) {
            try {
                if (th instanceof IOException) {
                    th.printStackTrace();
                } else {
                    sReporter.report(th);
                }
            } finally {
                IOUtils.close(this);
            }
        }
    }

    public void readUntilEOF() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c7bfc397b9b0ad9bf0f6701710a4ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c7bfc397b9b0ad9bf0f6701710a4ef9");
            return;
        }
        this.mReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        Arrays.asList(NativeRouteEvent.class, NativeFFPEvent.class, ContainerEvent.class, CustomTagsEvent.class, CustomTagsEventWithActivity.class);
        while (true) {
            String readLine = this.mReader.readLine();
            if (readLine == null) {
                return;
            }
            WeaverEvent parseWeaveEvent = this.main.parseWeaveEvent(readLine);
            if (parseWeaveEvent != null) {
                this.listener.onWeaveEventReceive(parseWeaveEvent);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b454f830e9dc06041040b08781c31d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b454f830e9dc06041040b08781c31d7e");
        } else {
            this.socket.close();
        }
    }
}
