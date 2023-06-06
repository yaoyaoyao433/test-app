package com.meituan.msi.api.record;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.l;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecordApi implements IMsiApi, l, com.meituan.msi.lifecycle.a {
    public static ChangeQuickRedirect a;
    private static Set<String> c = new HashSet();
    private static Set<Integer> d = new HashSet();
    private int b;
    private Object e;
    private volatile a f;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b232325543ae81e96e0f484caa66788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b232325543ae81e96e0f484caa66788");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd17ec692d0a1576d7c00b5d3a2bbe04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd17ec692d0a1576d7c00b5d3a2bbe04");
        }
    }

    @MsiApiMethod(name = "getRecorderManager")
    public void getRecorderManager() {
    }

    @MsiApiMethod(isCallback = true, name = "RecorderManager.onError")
    public void onError(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "RecorderManager.onFrameRecorded", response = OnFrameRecordedEvent.class)
    public void onFrameRecorded(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "RecorderManager.onPause")
    public void onPause(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b661e622683881be8faa7e0ca718376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b661e622683881be8faa7e0ca718376");
        }
    }

    @MsiApiMethod(isCallback = true, name = "RecorderManager.onResume")
    public void onResume(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347f19aeca9461722c8deb9f8a9d5878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347f19aeca9461722c8deb9f8a9d5878");
        }
    }

    @MsiApiMethod(isCallback = true, name = "RecorderManager.onStart")
    public void onStart(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9188cf55ad655c47d4c095328a350425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9188cf55ad655c47d4c095328a350425");
        }
    }

    @MsiApiMethod(isCallback = true, name = "RecorderManager.onStop", response = OnStopEvent.class)
    public void onStop(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aace9fb38db47a02bbeb609f5f435bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aace9fb38db47a02bbeb609f5f435bd");
        }
    }

    @MsiApiMethod(name = "startRecord", response = StartRecordResponse.class)
    public void startRecord(MsiContext msiContext) {
    }

    public RecordApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095586764f99361739b1111b0ba126ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095586764f99361739b1111b0ba126ca");
            return;
        }
        this.b = 600000;
        this.e = new Object();
        this.f = a.IDLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x047a, code lost:
        if (r14 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04a9, code lost:
        if (r14 == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.msi.api.record.RecordApi r41, com.meituan.msi.api.record.StartParam r42, com.meituan.msi.bean.MsiContext r43) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.record.RecordApi.a(com.meituan.msi.api.record.RecordApi, com.meituan.msi.api.record.StartParam, com.meituan.msi.bean.MsiContext):void");
    }

    static {
        c.add("aac");
        c.add("PCM");
        d.add(8000);
        d.add(11025);
        d.add(12000);
        d.add(16000);
        d.add(22050);
        d.add(24000);
        d.add(32000);
        d.add(44100);
        d.add(48000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        IDLE,
        RECORDING,
        PAUSED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1235b81041dd28e3d3054581e2a9f2e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1235b81041dd28e3d3054581e2a9f2e");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f0abe6650e9e7362a23a1ad6e8fb282", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f0abe6650e9e7362a23a1ad6e8fb282") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e79193e3e6ba7bbccf6dac80a9f0f51e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e79193e3e6ba7bbccf6dac80a9f0f51e") : (a[]) values().clone();
        }
    }

    @MsiApiMethod(name = "RecorderManager.pause")
    public void pause(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c40aad1a02809beb19d98d1fb79882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c40aad1a02809beb19d98d1fb79882");
        } else if (this.f == a.RECORDING) {
            synchronized (this.e) {
                this.f = a.PAUSED;
            }
        } else {
            a("operateRecorder:fail not recording", msiContext);
        }
    }

    @MsiApiMethod(name = "RecorderManager.resume")
    public void resume(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d09f07e7d2519ee6704652d2626910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d09f07e7d2519ee6704652d2626910");
        } else if (this.f == a.PAUSED) {
            synchronized (this.e) {
                this.e.notify();
                this.f = a.RECORDING;
            }
            msiContext.dispatchEvent("RecorderManager.onResume", new OnResumeEvent());
        } else if (this.f == a.IDLE) {
            a("operateRecorder:fail resume record fail", msiContext);
        } else if (this.f == a.RECORDING) {
            a("operateRecorder:fail not paused", msiContext);
        }
    }

    @MsiApiMethod(name = "RecorderManager.start", request = StartParam.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_MICROPHONE})
    public void start(final StartParam startParam, final MsiContext msiContext) {
        Object[] objArr = {startParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3f580c09ede973ecb80c3fd1e94656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3f580c09ede973ecb80c3fd1e94656");
        } else if (this.f != a.IDLE) {
            a("operateRecorder:fail is recording or paused", msiContext);
        } else {
            m.b(new Runnable() { // from class: com.meituan.msi.api.record.RecordApi.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3040d367e513a3bcb133f1283a60865d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3040d367e513a3bcb133f1283a60865d");
                    } else {
                        RecordApi.a(RecordApi.this, startParam, msiContext);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "RecorderManager.stop")
    public void stop(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d10794b177bc748c23df3808ee3fb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d10794b177bc748c23df3808ee3fb1");
        } else if (this.f == a.PAUSED) {
            synchronized (this.e) {
                this.e.notify();
                this.f = a.IDLE;
            }
        } else if (this.f == a.RECORDING) {
            this.f = a.IDLE;
        } else {
            a("operateRecorder:fail recorder not start", msiContext);
        }
    }

    @Override // com.meituan.msi.api.l
    public final String[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a74fda14564df616105823b535ed88", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a74fda14564df616105823b535ed88") : new String[]{PermissionGuard.PERMISSION_MICROPHONE};
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0737405c7a4c84262c48bd7eade13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0737405c7a4c84262c48bd7eade13b");
        } else if (this.f == a.RECORDING) {
            this.f = a.PAUSED;
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "398ab1993188a4c6b9e29160e0dcb667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "398ab1993188a4c6b9e29160e0dcb667");
        } else if (this.f == a.PAUSED) {
            synchronized (this.e) {
                this.e.notify();
                this.f = a.IDLE;
            }
        } else if (this.f == a.RECORDING) {
            this.f = a.IDLE;
        }
    }

    private static int a(File file, MsiContext msiContext) {
        Object[] objArr = {file, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d43ac048a07a7021b9e0ec7698b7e967", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d43ac048a07a7021b9e0ec7698b7e967")).intValue();
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            OnErrorEvent onErrorEvent = new OnErrorEvent();
            onErrorEvent.errMsg = TextUtils.isEmpty(e.getMessage()) ? "getDuration default errorMsg" : e.getMessage();
            msiContext.dispatchEvent("RecorderManager.onError", onErrorEvent);
            com.meituan.msi.log.a.a("RecordApi#getDuration " + onErrorEvent.errMsg + "filePath=" + file.getAbsolutePath());
            return 0;
        }
    }

    private void a(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581e324d2f5bfd4ec80788aea26eac01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581e324d2f5bfd4ec80788aea26eac01");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "error";
        }
        OnErrorEvent onErrorEvent = new OnErrorEvent();
        onErrorEvent.errMsg = str;
        msiContext.dispatchEvent("RecorderManager.onError", onErrorEvent);
        com.meituan.msi.log.a.a("RecordApi#error " + onErrorEvent.errMsg + " args:" + msiContext.getArgs().toString());
    }
}
