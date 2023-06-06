package com.meituan.snare;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class SnareTestManager {
    private static final String MESSAGE_CRASH = "SnareTestManager-makeCrash";
    public static final String TAG_ISE = "ISE";
    public static final String TAG_JNI = "JNI";
    public static final String TAG_NPE = "NPE";
    public static final String TAG_OOM = "OOM";
    public static final String TAG_SOE = "SOE";
    public static final String TAG_WEB = "WEB";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final SnareTestManager instance = new SnareTestManager();
    private boolean isMain;

    public static SnareTestManager getInstance() {
        return instance;
    }

    public SnareTestManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c7c46297fcaa79f1f320efaecc3aba2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c7c46297fcaa79f1f320efaecc3aba2");
        } else {
            this.isMain = true;
        }
    }

    public void setChildThreadCrash(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26a67bc0b05b755c5166e06ca0b7b3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26a67bc0b05b755c5166e06ca0b7b3c0");
        } else {
            this.isMain = !z ? 1 : 0;
        }
    }

    public void makeJNICrash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dadb30060416ed3352098e7d5cda7d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dadb30060416ed3352098e7d5cda7d8");
        } else {
            makeCrash(TAG_JNI);
        }
    }

    public void makeJavaCrash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59300677396262dfdd96dce5474df2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59300677396262dfdd96dce5474df2e9");
        } else {
            makeCrash(TAG_NPE);
        }
    }

    public void makeCrash(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a19f913cbac2863e296c58b948c22b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a19f913cbac2863e296c58b948c22b08");
        } else {
            com.sankuai.android.jarvis.c.a(MESSAGE_CRASH).execute(new a(str, this.isMain));
        }
    }

    public void dumpHprof() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61b83ebe2ae7d5b41b1a9c757b1c6049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61b83ebe2ae7d5b41b1a9c757b1c6049");
        } else {
            t.a(new File(Environment.getExternalStorageDirectory(), "meituan_test.hprof").getAbsolutePath());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private String b;
        private boolean c;
        private ArrayList<byte[]> d;

        private void a(int i) {
            while (true) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13fce166f6285343298360b2464b153", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13fce166f6285343298360b2464b153");
                    return;
                }
                i++;
            }
        }

        public a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6cf5ec39519b5e771d8d4be4ddd8a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6cf5ec39519b5e771d8d4be4ddd8a2");
                return;
            }
            this.b = "";
            this.c = true;
            this.d = new ArrayList<>();
            this.b = str;
            this.c = z;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.Runnable
        public final void run() {
            char c;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1afcebcc210d8a113e57f15e27cf982", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1afcebcc210d8a113e57f15e27cf982");
            } else if (TextUtils.isEmpty(this.b)) {
            } else {
                if (this.c && Looper.getMainLooper() != Looper.myLooper()) {
                    new Handler(Looper.getMainLooper()).post(this);
                    return;
                }
                String str = this.b;
                switch (str.hashCode()) {
                    case 72795:
                        if (str.equals(SnareTestManager.TAG_ISE)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 73605:
                        if (str.equals(SnareTestManager.TAG_JNI)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 77507:
                        if (str.equals(SnareTestManager.TAG_NPE)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 78445:
                        if (str.equals(SnareTestManager.TAG_OOM)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82281:
                        if (str.equals(SnareTestManager.TAG_SOE)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 85812:
                        if (str.equals(SnareTestManager.TAG_WEB)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        a();
                        return;
                    case 1:
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7f3999ea98b55d22fe1a854e8f3d419", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7f3999ea98b55d22fe1a854e8f3d419");
                            return;
                        } else {
                            System.out.println("SnareTestManager-makeCrash-callNpe");
                            throw new NullPointerException(SnareTestManager.MESSAGE_CRASH);
                        }
                    case 2:
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0b3ec78510227f459d88c3c3b79ce81", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0b3ec78510227f459d88c3c3b79ce81");
                            return;
                        } else {
                            System.out.println("SnareTestManager-makeCrash-callISE");
                            throw new IllegalStateException(SnareTestManager.MESSAGE_CRASH);
                        }
                    case 3:
                        a(0);
                        return;
                    case 4:
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "acf137cd6293f03c8a6e5234e22b4f41", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "acf137cd6293f03c8a6e5234e22b4f41");
                            return;
                        }
                        System.out.println("SnareTestManager-makeCrash-callJNI");
                        m a2 = m.a();
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = m.a;
                        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "fb77f5dec6092b22961e411602d3f646", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "fb77f5dec6092b22961e411602d3f646");
                            return;
                        } else if (a2.d) {
                            NativeCrashHandler.makeJNICrashJava();
                            return;
                        } else {
                            return;
                        }
                    case 5:
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "27d01a90b273eb8f0b48810809693ba6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "27d01a90b273eb8f0b48810809693ba6");
                            return;
                        }
                        System.out.println("SnareTestManager-makeCrash-callWEB");
                        if (m.a().c != null) {
                            Runnable runnable = new Runnable() { // from class: com.meituan.snare.SnareTestManager.a.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c2e8d2ee62afc07feaa59431b808b6e9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c2e8d2ee62afc07feaa59431b808b6e9");
                                        return;
                                    }
                                    WebView webView = new WebView(m.a().c);
                                    webView.setWebViewClient(new WebViewClient());
                                    webView.loadUrl("chrome://crash");
                                }
                            };
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                new Handler(Looper.getMainLooper()).post(runnable);
                                return;
                            } else {
                                runnable.run();
                                return;
                            }
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17cae7b4b27dd7a8fad3b21198c34b82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17cae7b4b27dd7a8fad3b21198c34b82");
                return;
            }
            System.out.println("SnareTestManager-makeCrash-callOOM");
            while (true) {
                byte[] bArr = new byte[20971520];
                Arrays.fill(bArr, (byte) 0);
                this.d.add(bArr);
            }
        }
    }
}
