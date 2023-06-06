package com.meituan.metrics.traffic;

import android.support.annotation.NonNull;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.report.DataUtils;
import com.meituan.metrics.traffic.report.ReportDetailManager;
import com.meituan.metrics.util.ByteBatcher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class HttpTracker {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class InputStreamTracker extends InputStream {
        private static final String TAG = "InputStreamTracker";
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean detailReportEnable;
        private final ByteBatcher mByteBatcher;
        private final Connection myConnectionTracker;
        private boolean myFirstRead;
        private final InputStream myWrapped;
        private ByteArrayOutputStream outputStream;
        private boolean reported;
        private final MetricsTrafficManager trafficManager;

        private void onClose(int i) {
        }

        private void onReadBegin(int i) {
        }

        public InputStreamTracker(InputStream inputStream, Connection connection, MetricsTrafficManager metricsTrafficManager, TrafficRecord trafficRecord) {
            Object[] objArr = {inputStream, connection, metricsTrafficManager, trafficRecord};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bf65e0e7f8b3af44830c79796580f04", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bf65e0e7f8b3af44830c79796580f04");
                return;
            }
            this.reported = false;
            this.myFirstRead = true;
            this.outputStream = new ByteArrayOutputStream();
            this.mByteBatcher = new ByteBatcher(new ByteBatcher.FlushReceiver() { // from class: com.meituan.metrics.traffic.HttpTracker.InputStreamTracker.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.ByteBatcher.FlushReceiver
                public void receive(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "54a2b009ddef64c598f33570e044230d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "54a2b009ddef64c598f33570e044230d");
                    } else {
                        InputStreamTracker.this.reportBytes(InputStreamTracker.this.myConnectionTracker.myId, i);
                    }
                }
            });
            this.myWrapped = inputStream;
            this.myConnectionTracker = connection;
            this.trafficManager = metricsTrafficManager;
            if (trafficRecord == null || trafficRecord.detail == null || !ReportDetailManager.getInstance().isEnable() || !DataUtils.canParseJson(trafficRecord)) {
                return;
            }
            this.detailReportEnable = true;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a087c3fc1bc1532735385934963b2304", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a087c3fc1bc1532735385934963b2304")).intValue() : this.myWrapped.available();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acf82cb3ea2962a7d90c954e4fa38c78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acf82cb3ea2962a7d90c954e4fa38c78")).booleanValue() : this.myWrapped.markSupported();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a26f80923291c00ec5f3c81465ca742", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a26f80923291c00ec5f3c81465ca742");
            } else {
                this.myWrapped.mark(i);
            }
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "973d1fea38533de40f395f4689582840", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "973d1fea38533de40f395f4689582840");
            } else {
                this.myWrapped.reset();
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa428c6be42069537803e5239f1658df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa428c6be42069537803e5239f1658df");
                return;
            }
            this.myWrapped.close();
            this.mByteBatcher.finish();
            onClose(this.myConnectionTracker.myId);
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr) throws IOException {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d874240983f897e9841f0bc4c2522a2f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d874240983f897e9841f0bc4c2522a2f")).intValue() : read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4ee1ee1b70a0a21f8fb0bbe990f815b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4ee1ee1b70a0a21f8fb0bbe990f815b")).intValue();
            }
            if (this.myFirstRead) {
                onReadBegin(this.myConnectionTracker.myId);
                this.myFirstRead = false;
            }
            int read = this.myWrapped.read();
            this.mByteBatcher.addBytes(1);
            if (this.detailReportEnable && read >= 0) {
                if (this.mByteBatcher.getLength() > 204800) {
                    this.detailReportEnable = false;
                    this.outputStream.reset();
                } else {
                    this.outputStream.write(read);
                }
            }
            return read;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3077511060596c45fc128a530e2c422f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3077511060596c45fc128a530e2c422f")).intValue();
            }
            if (this.myFirstRead) {
                onReadBegin(this.myConnectionTracker.myId);
                this.myFirstRead = false;
            }
            int read = this.myWrapped.read(bArr, i, i2);
            if (this.detailReportEnable && read >= 0) {
                if (this.mByteBatcher.getLength() > 204800) {
                    this.detailReportEnable = false;
                    this.outputStream.reset();
                } else {
                    this.outputStream.write(bArr, i, read);
                }
            }
            this.mByteBatcher.addBytes(read);
            return read;
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d70574336c27efbb3d476b5bef6c7035", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d70574336c27efbb3d476b5bef6c7035")).longValue();
            }
            if (this.myFirstRead) {
                onReadBegin(this.myConnectionTracker.myId);
                this.myFirstRead = false;
            }
            return this.myWrapped.skip(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reportBytes(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58d142c3b00d63d3f7d3dafb37b7e81c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58d142c3b00d63d3f7d3dafb37b7e81c");
                return;
            }
            this.reported = true;
            this.trafficManager.onResponseBody(i, i2);
            this.trafficManager.onRequestFinished(i);
        }

        public final boolean needReport() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b6a924c544d065796df01cddd08418a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b6a924c544d065796df01cddd08418a")).booleanValue() : !this.reported && this.mByteBatcher.getLength() > 0;
        }

        public final void reportBatcher() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc2537128976837dc8f34cd34b1b00b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc2537128976837dc8f34cd34b1b00b");
            } else {
                this.mByteBatcher.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class OutputStreamTracker extends OutputStream {
        private static final String TAG = "OutputStreamTracker";
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ByteBatcher mByteBatcher;
        private final Connection myConnectionTracker;
        private boolean myFirstWrite;
        private final OutputStream myWrapped;
        private boolean reported;
        private final MetricsTrafficManager trafficManager;

        private void onClose(int i) {
        }

        private void onWriteBegin(int i) {
        }

        public OutputStreamTracker(OutputStream outputStream, Connection connection, MetricsTrafficManager metricsTrafficManager) {
            Object[] objArr = {outputStream, connection, metricsTrafficManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdfb8c4923fdb3488fc62a8f85aaa7a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdfb8c4923fdb3488fc62a8f85aaa7a2");
                return;
            }
            this.myFirstWrite = true;
            this.reported = false;
            this.mByteBatcher = new ByteBatcher(new ByteBatcher.FlushReceiver() { // from class: com.meituan.metrics.traffic.HttpTracker.OutputStreamTracker.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.ByteBatcher.FlushReceiver
                public void receive(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba83c8463c1321517292e394bf5edd0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba83c8463c1321517292e394bf5edd0f");
                    } else {
                        OutputStreamTracker.this.reportBytes(OutputStreamTracker.this.myConnectionTracker.myId, i);
                    }
                }
            });
            this.myWrapped = outputStream;
            this.myConnectionTracker = connection;
            this.trafficManager = metricsTrafficManager;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c26ab1df27727901fe949d3691a95960", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c26ab1df27727901fe949d3691a95960");
                return;
            }
            this.myWrapped.close();
            this.mByteBatcher.finish();
            onClose(this.myConnectionTracker.myId);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d7fb565c2201e415e7bfeccf59cf0e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d7fb565c2201e415e7bfeccf59cf0e7");
            } else {
                this.myWrapped.flush();
            }
        }

        @Override // java.io.OutputStream
        public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31fe4dd9e1b10508a7b6ead2686e000d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31fe4dd9e1b10508a7b6ead2686e000d");
                return;
            }
            if (this.myFirstWrite) {
                onWriteBegin(this.myConnectionTracker.myId);
                this.myFirstWrite = false;
            }
            this.mByteBatcher.addBytes(i2);
            this.myWrapped.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da0ec322825a2825a1cecea376f14c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da0ec322825a2825a1cecea376f14c2");
                return;
            }
            if (this.myFirstWrite) {
                onWriteBegin(this.myConnectionTracker.myId);
                this.myFirstWrite = false;
            }
            this.mByteBatcher.addBytes(1);
            this.myWrapped.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(@NonNull byte[] bArr) throws IOException {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9febe40a969c395aa154f7325c9b22b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9febe40a969c395aa154f7325c9b22b");
            } else {
                write(bArr, 0, bArr.length);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reportBytes(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c367019f89ac6a03ef91d2875f517db5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c367019f89ac6a03ef91d2875f517db5");
                return;
            }
            this.reported = true;
            this.trafficManager.onPostRequest(i, i2);
        }

        public final boolean needReport() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83ccb98911bff18cef16a71e99f9d610", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83ccb98911bff18cef16a71e99f9d610")).booleanValue() : !this.reported && this.mByteBatcher.getLength() > 0;
        }

        public final void reportBatcher() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "367f0534ece066473cb7d0d836201a62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "367f0534ece066473cb7d0d836201a62");
            } else {
                this.mByteBatcher.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class Connection implements HttpConnectionTracker {
        private static final String TAG = "TrackerConnection";
        public static ChangeQuickRedirect changeQuickRedirect;
        private InputStreamTracker inputTracker;
        private final int myId;
        private OutputStreamTracker outputTracker;
        private final MetricsTrafficManager trafficManager;

        private void onRequestBody(int i) {
        }

        public Connection(String str, MetricsTrafficManager metricsTrafficManager) {
            Object[] objArr = {str, metricsTrafficManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a601a4f9bcda44e768c5caaada713e7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a601a4f9bcda44e768c5caaada713e7");
                return;
            }
            this.trafficManager = metricsTrafficManager;
            this.myId = nextId();
            onPreConnect(this.myId, str);
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void disconnect() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d9cbafe28e9f435aee3d1a930fd264", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d9cbafe28e9f435aee3d1a930fd264");
            } else {
                onDisconnect(this.myId);
            }
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void error(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7a9b0950ec3cf7a57c17dd38390e0ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7a9b0950ec3cf7a57c17dd38390e0ba");
            } else {
                onError(this.myId, th);
            }
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final OutputStream trackRequestBody(OutputStream outputStream) {
            Object[] objArr = {outputStream};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a731436b1eb7152b90ac557dcea9aec6", RobustBitConfig.DEFAULT_VALUE)) {
                return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a731436b1eb7152b90ac557dcea9aec6");
            }
            onRequestBody(this.myId);
            this.outputTracker = new OutputStreamTracker(outputStream, this, this.trafficManager);
            return this.outputTracker;
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void trackRequest(String str, Map<String, List<String>> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a71940c2882eabe83e3039cd571294e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a71940c2882eabe83e3039cd571294e");
            } else {
                onRequest(this.myId, str, map);
            }
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void trackResponse(int i, String str, Map<String, List<String>> map) {
            Object[] objArr = {Integer.valueOf(i), str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18715710b6f3c53be1824959849a56ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18715710b6f3c53be1824959849a56ca");
                return;
            }
            if (this.outputTracker != null && this.outputTracker.needReport()) {
                this.outputTracker.reportBatcher();
            }
            onResponse(this.myId, i, str, map);
            if (this.inputTracker == null || !this.inputTracker.needReport()) {
                return;
            }
            this.inputTracker.reportBatcher();
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final InputStream trackResponseBody(InputStream inputStream) {
            Object[] objArr = {inputStream};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca23f56738b4ffa37b0e9665efe96a05", RobustBitConfig.DEFAULT_VALUE)) {
                return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca23f56738b4ffa37b0e9665efe96a05");
            }
            onResponseBody(this.myId);
            this.inputTracker = new InputStreamTracker(inputStream, this, this.trafficManager, this.trafficManager.getRecord(this.myId));
            return this.inputTracker;
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void reportResponseBody(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c0a0bfdea7674d7fb321c8b22d35bbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c0a0bfdea7674d7fb321c8b22d35bbe");
                return;
            }
            this.trafficManager.onResponseBody(this.myId, j);
            this.trafficManager.onRequestFinished(this.myId);
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void reportRequestBody(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9117a8c739654b8410e1d6cb0e7b391f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9117a8c739654b8410e1d6cb0e7b391f");
            } else {
                this.trafficManager.onPostRequest(this.myId, j);
            }
        }

        @Override // com.meituan.metrics.traffic.HttpConnectionTracker
        public final void reportDetail(TrafficRecord.Detail detail) {
            Object[] objArr = {detail};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "569d2e1dc11dd9992c3adecaacca3786", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "569d2e1dc11dd9992c3adecaacca3786");
            } else {
                this.trafficManager.setDetail(this.myId, detail);
            }
        }

        private int nextId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06abdfe089371a89f61fd93494081e4a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06abdfe089371a89f61fd93494081e4a")).intValue() : this.trafficManager.getNextRequestId();
        }

        private void onPreConnect(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8ca2ae549b3460225051e600972a42d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8ca2ae549b3460225051e600972a42d");
            } else {
                this.trafficManager.onPreRequest(i, str);
            }
        }

        private void onRequest(int i, String str, Map<String, List<String>> map) {
            Object[] objArr = {Integer.valueOf(i), str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c49e09e35af378c399baa08a9dff0f64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c49e09e35af378c399baa08a9dff0f64");
                return;
            }
            String property = System.getProperty("http.keepAlive", "");
            HashMap hashMap = new HashMap();
            if (property.length() > 0) {
                hashMap.put("Connection", Collections.singletonList(property));
            }
            String property2 = System.getProperty("http.agent", "");
            if (property2.length() > 0) {
                hashMap.put("User-Agent", Collections.singletonList(property2));
            }
            if (hashMap.size() > 0) {
                hashMap.putAll(map);
                map = hashMap;
            }
            this.trafficManager.onRequest(i, str, map);
        }

        private void onResponse(int i, int i2, String str, Map<String, List<String>> map) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dfc0ca1ce4aa1ae889b6cdf26d3400d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dfc0ca1ce4aa1ae889b6cdf26d3400d");
            } else {
                this.trafficManager.onResponse(i, i2, str, map);
            }
        }

        private void onResponseBody(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e10154b029f47fa5e9b4931b957117cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e10154b029f47fa5e9b4931b957117cf");
            } else if (this.outputTracker == null || !this.outputTracker.needReport()) {
            } else {
                this.outputTracker.reportBatcher();
            }
        }

        private void onDisconnect(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43261f33991ed051abdb9b1975dcf3d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43261f33991ed051abdb9b1975dcf3d4");
            } else if (this.outputTracker == null || !this.outputTracker.needReport()) {
            } else {
                this.outputTracker.reportBatcher();
            }
        }

        private void onError(int i, Throwable th) {
            Object[] objArr = {Integer.valueOf(i), th};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f0412362fe7b954e02d6e383ec0786", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f0412362fe7b954e02d6e383ec0786");
                return;
            }
            if (this.outputTracker != null && this.outputTracker.needReport()) {
                this.outputTracker.reportBatcher();
            }
            this.trafficManager.onRequestFailed(i, th);
        }
    }

    public static HttpConnectionTracker trackConnection(String str, MetricsTrafficManager metricsTrafficManager) {
        Object[] objArr = {str, metricsTrafficManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba18dfe2995adb3812b07cb63edb4fc9", RobustBitConfig.DEFAULT_VALUE) ? (HttpConnectionTracker) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba18dfe2995adb3812b07cb63edb4fc9") : new Connection(str, metricsTrafficManager);
    }
}
