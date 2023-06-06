package com.meituan.android.recce.host;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import android.view.View;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.host.binary.BinWriter;
import com.meituan.android.recce.utils.a;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class HostImplement extends HostInternal implements HostInterface {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static final String TAG = "HostImplement";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean needPreprocessing;
    protected static byte[] viewData;
    private final HostHandler hostHandler;
    protected long hostRef;

    private static native void nBindingHostAPI();

    private native void nCallbackSend(long j, long j2, byte[] bArr);

    private native boolean nDispatchAppEvent(long j, byte[] bArr);

    private native boolean nDispatchEvent(long j, int i, int i2, byte[] bArr);

    private native void nDrop(long j);

    private static native void nLaunch(byte[] bArr);

    private native long nNewHostInstance(String str, String str2);

    private native long nNewHostInstanceDio(String str, String str2, int i, int i2);

    private native void nRunStart(long j, byte[] bArr);

    private native void nSendSystemEvent(long j, int i);

    private native void writeApplyViewData(long j, byte[] bArr);

    @Override // com.meituan.android.recce.host.HostInterface
    public final void appendViewManagerNameList(String[] strArr) {
    }

    @Override // com.meituan.android.recce.host.HostInternal
    public final void reportError(int i, int i2, int i3, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198622fab518b1e1af03ab803478ee7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198622fab518b1e1af03ab803478ee7f");
        }
    }

    static {
        preprocessing();
        needPreprocessing = true;
        viewData = new byte[1800];
    }

    public static void launch(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16e02a94e41aa4b138257fa580053055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16e02a94e41aa4b138257fa580053055");
            return;
        }
        try {
            nLaunch(context.getCacheDir().getAbsolutePath().getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            Log.e(TAG, "launch 失败: " + e);
        }
    }

    public static void preprocessing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "871c8c39021ab01619acae6adfdf9bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "871c8c39021ab01619acae6adfdf9bd6");
        } else if (needPreprocessing) {
            try {
                nBindingHostAPI();
                needPreprocessing = false;
            } catch (Exception e) {
                Log.e(TAG, "preprocessing 调用失败", e);
            }
        }
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final boolean isValid() {
        return this.hostRef != 0;
    }

    private void newHostInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8f527bcb18713f4d6a512b1d9251009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8f527bcb18713f4d6a512b1d9251009");
            return;
        }
        try {
            String[] viewManagerNameList = this.hostHandler.getViewManagerNameList();
            StringBuilder sb = new StringBuilder();
            for (String str2 : viewManagerNameList) {
                sb.append(str2);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            this.hostRef = nNewHostInstance(str, sb.toString());
        } catch (Exception e) {
            Log.e(TAG, "newHostInstance 调用失败", e);
        }
    }

    private void newHostInstance(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec6a9695e1c356efdf2721c8cec80fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec6a9695e1c356efdf2721c8cec80fbc");
            return;
        }
        try {
            String[] viewManagerNameList = this.hostHandler.getViewManagerNameList();
            StringBuilder sb = new StringBuilder();
            for (String str2 : viewManagerNameList) {
                sb.append(str2);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            this.hostRef = nNewHostInstanceDio(str, sb.toString(), i, i2);
        } catch (Exception e) {
            Log.e(TAG, "newHostInstance 调用失败", e);
        }
    }

    public HostImplement(HostHandler hostHandler, String str) {
        int i = 0;
        Object[] objArr = {hostHandler, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ca0ea10589a8b4114400d5473d0f1e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ca0ea10589a8b4114400d5473d0f1e7");
            return;
        }
        this.hostRef = 0L;
        this.hostHandler = hostHandler;
        preprocessing();
        if (a.a(com.meituan.android.recce.a.b())) {
            newHostInstance(str + "/app.wasm");
            return;
        }
        DioFile[] m = new DioFile(str).m();
        DioFile dioFile = null;
        int length = m.length;
        while (true) {
            if (i >= length) {
                break;
            }
            DioFile dioFile2 = m[i];
            if (dioFile2.e().contains("app.wasm")) {
                dioFile = dioFile2;
                break;
            }
            i++;
        }
        com.meituan.dio.a p = dioFile.p();
        newHostInstance(str, p.c(), p.b());
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final void runStart(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ad3b43aac0518115fc24d9f0fabcffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ad3b43aac0518115fc24d9f0fabcffd");
        } else if (isValid()) {
            nRunStart(this.hostRef, bArr);
        }
    }

    @Override // com.meituan.android.recce.host.HostInternal
    public final void applyViewChanged(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eea05b861103ce9ceb34cf0b547ae97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eea05b861103ce9ceb34cf0b547ae97");
            return;
        }
        if (i > viewData.length) {
            viewData = new byte[i * 2];
        }
        writeApplyViewData(j, viewData);
        byte[] bArr = viewData;
        viewData = new byte[i * 2];
        this.hostHandler.applyViewChanged(i, bArr);
    }

    @Override // com.meituan.android.recce.host.HostInternal
    public final byte[] syncInvokeBridge(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be412a90d38970845674157ad32ebbb0", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be412a90d38970845674157ad32ebbb0") : this.hostHandler.syncInvokeBridge(str, str2);
    }

    @Override // com.meituan.android.recce.host.HostInternal
    public final void asyncInvokeBridge(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f924db3b4a24d49d7145f843e51bb884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f924db3b4a24d49d7145f843e51bb884");
            return;
        }
        BinReader binReader = new BinReader(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            this.hostHandler.asyncInvokeBridge(binReader.getString(), binReader.getString(), new AsyncCallback(this, binReader.getLong()));
        }
    }

    @Override // com.meituan.android.recce.host.HostInternal
    public final void postDelayedMessage(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85cc308e6f2af6a972c7c779378f3d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85cc308e6f2af6a972c7c779378f3d64");
        } else {
            HANDLER.postDelayed(new RecceRunnable(this, j2), j);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class RecceRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private long callbackRef;
        private WeakReference<HostImplement> weakReferenceHostImplement;

        public RecceRunnable(HostImplement hostImplement, long j) {
            Object[] objArr = {hostImplement, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4687cf35586f6271da501f9011ec0b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4687cf35586f6271da501f9011ec0b2");
                return;
            }
            this.weakReferenceHostImplement = new WeakReference<>(hostImplement);
            this.callbackRef = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d438c1482e695611c16a93547361fd4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d438c1482e695611c16a93547361fd4e");
                return;
            }
            HostImplement hostImplement = this.weakReferenceHostImplement.get();
            if (hostImplement != null) {
                hostImplement.callbackSend(this.callbackRef, new byte[0]);
            }
        }
    }

    @Override // com.meituan.android.recce.host.HostInternal
    public final boolean callbackSend(long j, byte[] bArr) {
        Object[] objArr = {new Long(j), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7935c600246b954b776095548be1c467", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7935c600246b954b776095548be1c467")).booleanValue();
        }
        if (isValid()) {
            nCallbackSend(this.hostRef, j, bArr);
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final boolean dispatchEvent(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4c4454d3ba10ce41cc1ead216ddb83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4c4454d3ba10ce41cc1ead216ddb83")).booleanValue();
        }
        if (isValid()) {
            if (str == null) {
                str = "";
            }
            return nDispatchEvent(this.hostRef, i, i2, str.getBytes());
        }
        return false;
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final boolean dispatchEvent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b0ef29fdc02a824bb902d3bc4e2f4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b0ef29fdc02a824bb902d3bc4e2f4f")).booleanValue() : dispatchAppEvent(str, str2);
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final boolean dispatchAppEvent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7671d4573955e113e7005e3485e1ee4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7671d4573955e113e7005e3485e1ee4f")).booleanValue();
        }
        if (isValid()) {
            if (str2 == null) {
                str2 = "";
            }
            BinWriter binWriter = new BinWriter();
            binWriter.putString(str);
            binWriter.putString(str2);
            return nDispatchAppEvent(this.hostRef, binWriter.asBytes());
        }
        return false;
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final void sendSystemEvent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36611e11cd4d74408340afca4b7ffe17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36611e11cd4d74408340afca4b7ffe17");
        } else if (isValid()) {
            nSendSystemEvent(this.hostRef, i);
        }
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final void drop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44483758e6797daf3330281e5f144274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44483758e6797daf3330281e5f144274");
        } else if (isValid()) {
            nDrop(this.hostRef);
            this.hostRef = 0L;
        }
    }

    @Override // com.meituan.android.recce.host.HostInterface
    public final boolean dispatchViewEvent(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a65e85659502a09becfd0531f3a72533", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a65e85659502a09becfd0531f3a72533")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        return dispatchEvent(view.getId(), i, str);
    }

    public final void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5b0eb417fcbcbbb024d3aff96902c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5b0eb417fcbcbbb024d3aff96902c0e");
            return;
        }
        drop();
        super.finalize();
    }
}
