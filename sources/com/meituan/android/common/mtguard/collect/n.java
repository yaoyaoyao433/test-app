package com.meituan.android.common.mtguard.collect;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.store.DfpSharedPref;
import com.meituan.android.common.mtguard.LifecycleManager;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.LinkedList;
/* loaded from: classes2.dex */
public class n implements c, com.meituan.android.common.mtguard.wtscore.plugin.a {
    private static final String c = "screen_capture";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String d = "screen_record";
    private static final int e = 253;
    private static final int f = 254;
    private static final int g = 5;
    private static String h = MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString();
    private static String i = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    private static String j = MediaStore.Video.Media.INTERNAL_CONTENT_URI.toString();
    private static String k = MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString();
    private static n t;
    public String a;
    public String b;
    private LinkedList<String> l;
    private LinkedList<String> m;
    private ContentObserver n;
    private ContentResolver o;
    private int p;
    private int q;
    private boolean r;
    private DfpSharedPref s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a extends ContentObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(Handler handler) {
            super(handler);
            Object[] objArr = {n.this, handler};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d48f4c9666dc811ffa3dbd4d9a22f2fb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d48f4c9666dc811ffa3dbd4d9a22f2fb");
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39aee1ec2165e9d7adbb902fa7277329", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39aee1ec2165e9d7adbb902fa7277329");
            } else if (n.this.l == null || n.this.l.size() != 5) {
            } else {
                n.this.l.removeFirst();
            }
        }

        public static /* synthetic */ void a(a aVar) {
            if (n.this.l == null || n.this.l.size() != 5) {
                return;
            }
            n.this.l.removeFirst();
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a5790ba2046a9efbfbbfb79a8ba7d49", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a5790ba2046a9efbfbbfb79a8ba7d49");
            } else if (n.this.m == null || n.this.m.size() != 5) {
            } else {
                n.this.m.removeFirst();
            }
        }

        public static /* synthetic */ void b(a aVar) {
            if (n.this.m == null || n.this.m.size() != 5) {
                return;
            }
            n.this.m.removeFirst();
        }

        @Override // android.database.ContentObserver
        public final void onChange(final boolean z, final Uri uri) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52a6e44f2cf443a5df0184b568d143b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52a6e44f2cf443a5df0184b568d143b4");
                return;
            }
            super.onChange(z, uri);
            if (uri != null && LifecycleManager.isInForeground()) {
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.n.a.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "04e9b20729dea8fb73b78bd68c0cf498", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "04e9b20729dea8fb73b78bd68c0cf498");
                            return;
                        }
                        synchronized (a.this) {
                            String uri2 = uri.toString();
                            if (uri2.contains(n.i) || uri2.contains(n.h)) {
                                MTGuardLog.setLogan("receive screenCapture, , " + z + ", " + uri.hashCode() + ", " + uri);
                                if (uri != null && uri.hashCode() != n.this.q) {
                                    n.this.q = uri.hashCode();
                                    a.a(a.this);
                                    n.this.l.add(String.valueOf(System.currentTimeMillis()));
                                    n.this.a = n.this.l.toString();
                                    n.this.s.writeString(n.c, n.this.a);
                                    MTGuardLog.setLogan("capture changed");
                                    NBridge.main3(50, new Object[]{Integer.valueOf((int) n.e)});
                                }
                            }
                            if (uri2.contains(n.k) || uri2.contains(n.j)) {
                                MTGuardLog.setLogan("receive screenRecord, , " + z + ", " + uri.hashCode() + ", " + uri);
                                if (uri != null && uri.hashCode() != n.this.p) {
                                    n.this.p = uri.hashCode();
                                    a.b(a.this);
                                    n.this.m.add(String.valueOf(System.currentTimeMillis()));
                                    n.this.b = n.this.m.toString();
                                    n.this.s.writeString(n.d, n.this.b);
                                    MTGuardLog.setLogan("record changed");
                                    NBridge.main3(50, new Object[]{Integer.valueOf((int) n.f)});
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public n(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8959eca4c14090c5da6054e2dca8b007", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8959eca4c14090c5da6054e2dca8b007");
            return;
        }
        this.p = 0;
        this.q = 0;
        this.r = false;
        this.s = DfpSharedPref.getInstance(context);
        this.l = a(this.s.readString(c));
        this.m = a(this.s.readString(d));
        this.a = this.l.toString();
        this.b = this.m.toString();
    }

    public static n a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b93c153e7e6524860ad1154a6e564bd", 6917529027641081856L)) {
            return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b93c153e7e6524860ad1154a6e564bd");
        }
        if (t == null) {
            synchronized (n.class) {
                if (t == null) {
                    t = new n(context);
                }
            }
        }
        return t;
    }

    @NonNull
    private static LinkedList<String> a(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f054d0f17e3d0af12413fa6099484ab", 6917529027641081856L)) {
            return (LinkedList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f054d0f17e3d0af12413fa6099484ab");
        }
        LinkedList<String> linkedList = new LinkedList<>();
        if (!TextUtils.isEmpty(str) && (split = str.replace('[', Constants.SPACE).replace(']', Constants.SPACE).trim().split(CommonConstant.Symbol.COMMA)) != null && split.length != 0) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    String trim = str2.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        linkedList.add(trim);
                    }
                }
            }
        }
        return linkedList;
    }

    private void g() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9605f1e4d04184d40d5571e1b6ca5599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9605f1e4d04184d40d5571e1b6ca5599");
            return;
        }
        try {
            if (this.r) {
                return;
            }
            Object[] main3 = NBridge.main3(53, new Object[]{Integer.valueOf((int) e)});
            boolean booleanValue = main3 == null ? false : ((Boolean) main3[0]).booleanValue();
            Object[] main32 = NBridge.main3(53, new Object[]{Integer.valueOf((int) f)});
            if (main32 != null) {
                z = ((Boolean) main32[0]).booleanValue();
            }
            if (!booleanValue && !z) {
                this.o.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, this.n);
                this.o.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.n);
                this.o.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.n);
                this.o.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.n);
                this.r = true;
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d11aea82d87e299ae7ab6b9a8b24976", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d11aea82d87e299ae7ab6b9a8b24976");
            return;
        }
        try {
            if (this.r) {
                this.o.unregisterContentObserver(this.n);
                this.r = false;
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private String i() {
        return this.a;
    }

    private String j() {
        return this.b;
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e7b790daea92c1ba28865bd60d927e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e7b790daea92c1ba28865bd60d927e6");
        } else {
            g();
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4cd6f73b5a90f0d4ad56994a4cccd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4cd6f73b5a90f0d4ad56994a4cccd9");
            return;
        }
        try {
            eVar.a(e, this);
            eVar.a(f, this);
            this.o = eVar.b.getContentResolver();
            this.n = new a(new Handler(Looper.getMainLooper()));
            if (LifecycleManager.isInForeground()) {
                g();
            }
            LifecycleManager.addAppStateListener(this);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfe5133e94bcf1a7ed5f80191c0a0b90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfe5133e94bcf1a7ed5f80191c0a0b90");
        } else if (z) {
            h();
        } else {
            g();
        }
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5023ba096d376030390b185f14262c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5023ba096d376030390b185f14262c");
        } else {
            h();
        }
    }
}
