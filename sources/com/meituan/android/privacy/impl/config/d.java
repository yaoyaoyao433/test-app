package com.meituan.android.privacy.impl.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.v;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.privacy.impl.config.e;
import com.meituan.android.privacy.interfaces.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile d i;
    public final RealConfig b;
    @GuardedBy("this")
    public volatile b c;
    public final q d;
    public final q e;
    public final j f;
    public volatile boolean g;
    @NonNull
    private final Context h;
    private volatile boolean j;
    private final CopyOnWriteArraySet<aa> k;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "1bcfeb38842227240b16ee91bd3875e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "1bcfeb38842227240b16ee91bd3875e4");
            return;
        }
        b bVar = null;
        synchronized (dVar) {
            if (dVar.c instanceof g) {
                bVar = dVar.c;
                dVar.b.b();
                dVar.c = dVar.b;
                dVar.j = true;
            }
        }
        if ((bVar instanceof g) && ProcessUtils.isMainProcess(dVar.h)) {
            com.dianping.networklog.c.a("Privacy System Launch Complete", 3);
            try {
                g gVar = (g) bVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "b58e65d0605cec3629162c215301fc24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "b58e65d0605cec3629162c215301fc24");
                } else if (ProcessUtils.isMainProcess(gVar.c)) {
                    HashMap hashMap = new HashMap();
                    for (String str : gVar.f.a()) {
                        f a2 = gVar.b.a(str, false);
                        if (a2 != null) {
                            hashMap.put(str, a2);
                        }
                    }
                    PrintStream printStream = System.out;
                    printStream.println("LDK: 启动过程中需要预先加载的配置: " + gVar.f.toString());
                    PrintStream printStream2 = System.out;
                    printStream2.println("LDK: 启动过程中使用到的未注册配置: " + gVar.e.toString());
                    gVar.d.d.a("additional_launch", gVar.d.a(hashMap));
                    gVar.d.d.a("not_registered", gVar.e.a());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public HashMap<String, String> c;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f2e176978d7c1fb9c93daae19ce82d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f2e176978d7c1fb9c93daae19ce82d");
            }
            return "PermissionHints{displayName='" + this.b + "', permission2Desc=" + this.c + '}';
        }
    }

    private d(@NonNull Context context) {
        e a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17c1d8db181ddf49af4431ae34f7db1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17c1d8db181ddf49af4431ae34f7db1");
            return;
        }
        this.j = false;
        this.k = new CopyOnWriteArraySet<>();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.h = applicationContext;
        } else {
            this.h = context;
        }
        this.d = q.a(this.h, "privacy_config", 2);
        this.e = q.a(this.h, "privacy_netfilter", 2);
        this.f = new j(this.h, this.e);
        com.meituan.android.privacy.impl.c.a().c = this.f;
        this.b = new RealConfig(this.h, this);
        String b = this.d.b("appVersion", (String) null);
        int b2 = this.d.b("sdk_version", 0);
        if (!TextUtils.equals(b, AppUtil.getApplicationVersion(this.h)) || b2 != 2) {
            this.g = this.d.b("is_privacy_mode", false);
            if (ProcessUtils.isMainProcess(this.h)) {
                this.d.c();
                this.e.c();
                if (this.g) {
                    this.d.a("is_privacy_mode", true);
                }
                this.d.a("appVersion", AppUtil.getApplicationVersion(this.h));
                this.d.a("sdk_version", 2);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a1df6640c576584cf671c9c113e431a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a1df6640c576584cf671c9c113e431a");
            } else {
                try {
                    a2 = this.b.a(false);
                } catch (Throwable th) {
                    if (th instanceof e.a) {
                        throw ((e.a) th);
                    }
                    th.printStackTrace();
                    a2 = e.a();
                }
                this.c = new g(this.b, this.h, a2, this);
            }
        } else {
            this.g = this.d.b("is_privacy_mode", false);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcf9efc114c0292a64ca132a641e4698", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcf9efc114c0292a64ca132a641e4698");
            } else {
                g gVar = new g(this.b, this.h, b(true), this);
                gVar.a(c());
                gVar.a(this.d.b("not_registered", Collections.emptySet()));
                this.c = gVar;
            }
        }
        m.b = this.d.b("is_mock", false);
        com.sankuai.android.jarvis.c.c("privacy-policy").schedule(new Runnable() { // from class: com.meituan.android.privacy.impl.config.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "41ce4aa7731cbce809c48bc8a80564c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "41ce4aa7731cbce809c48bc8a80564c7");
                } else {
                    d.a(d.this);
                }
            }
        }, 5L, TimeUnit.SECONDS);
        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.privacy.impl.config.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9dcfa2cc09f11135aa3da6ee0ca14f97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9dcfa2cc09f11135aa3da6ee0ca14f97");
                } else {
                    d.this.f.b();
                }
            }
        });
    }

    public final boolean a(@NonNull aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4d731a9f9dac0b4e384d2eb65b3ac3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4d731a9f9dac0b4e384d2eb65b3ac3")).booleanValue();
        }
        boolean b = this.d.b("is_privacy_mode", false);
        if (b != this.g) {
            this.g = b;
            a(b);
        }
        this.k.add(aaVar);
        return b;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29bb08726ca25b154b76a9ff275a4210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29bb08726ca25b154b76a9ff275a4210");
            return;
        }
        boolean b = this.d.b("is_privacy_mode", false);
        if (b != this.g) {
            this.g = b;
            a(b);
        }
    }

    public void a(boolean z) {
        aa aaVar;
        Throwable th;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d4b7e88d8b1c532cbdbc6fc62df222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d4b7e88d8b1c532cbdbc6fc62df222");
            return;
        }
        Iterator<aa> it = this.k.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                aaVar = it.next();
                try {
                    if (aaVar.onPrivacyModeChanged(z)) {
                        arrayList.add(aaVar);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    if (aaVar != null) {
                        arrayList.add(aaVar);
                    }
                }
            } catch (Throwable th3) {
                aaVar = null;
                th = th3;
            }
        }
        this.k.removeAll(arrayList);
    }

    @Nullable
    public final e a(boolean z, @NonNull String str) {
        FileInputStream fileInputStream;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897437f34c28c8c63a4b3fe73108ac19", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897437f34c28c8c63a4b3fe73108ac19");
        }
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            e eVar = new e();
            eVar.a(fileInputStream, z);
            eVar.c = str;
            return eVar;
        } catch (Throwable th2) {
            th = th2;
            try {
                if (th instanceof FileNotFoundException) {
                    th.printStackTrace();
                    return null;
                }
                th.printStackTrace();
                throw new RuntimeException(th);
            } finally {
                IOUtils.close(fileInputStream);
            }
        }
    }

    public final e b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7cca37b5934d6742a07991cd07a9160", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7cca37b5934d6742a07991cd07a9160");
        }
        String str = null;
        for (int i2 = 1; i2 <= 5; i2++) {
            String b = this.d.b("current_config", (String) null);
            if (b != null && !TextUtils.equals(b, str)) {
                try {
                    e a2 = a(z, b);
                    if (a2 != null) {
                        a2.c = b;
                        a2.d = false;
                        return a2;
                    }
                    str = b;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        try {
            return this.b.a(z);
        } catch (IOException e) {
            e.printStackTrace();
            return e.a();
        }
    }

    public final byte[] a(@NonNull Map<String, f> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55821df50107d0065187385820df7a24", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55821df50107d0065187385820df7a24");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.a(new DataOutputStream(byteArrayOutputStream), (ByteBuffer) null, map);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    private Map<String, f> c() {
        byte[] bytes;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e692f741ae7db89b4d59fe3c0aae863d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e692f741ae7db89b4d59fe3c0aae863d");
        }
        q qVar = this.d;
        Object[] objArr2 = {"additional_launch", null};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "c4f3d988ce824d42be75fe819a95566c", RobustBitConfig.DEFAULT_VALUE)) {
            bytes = (byte[]) PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "c4f3d988ce824d42be75fe819a95566c");
        } else {
            u uVar = u.f;
            Object[] objArr3 = {"additional_launch", null, uVar};
            ChangeQuickRedirect changeQuickRedirect3 = q.a;
            if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "1ff79841d3e1f2ee2bbacb043542a14b", RobustBitConfig.DEFAULT_VALUE)) {
                bytes = (byte[]) PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "1ff79841d3e1f2ee2bbacb043542a14b");
            } else if (v.d) {
                bytes = qVar.a(uVar, false).b("additional_launch", (byte[]) null);
            } else {
                String b = qVar.b.b("additional_launch", (String) null, uVar);
                bytes = b == null ? null : b.getBytes();
            }
        }
        if (bytes == null || bytes.length == 0) {
            return Collections.emptyMap();
        }
        try {
            return e.a(new DataInputStream(new ByteArrayInputStream(bytes)), (ByteBuffer) null);
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public static d a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4da78b0c659a36133bb203970ea9db5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4da78b0c659a36133bb203970ea9db5e");
        }
        if (i == null) {
            synchronized (d.class) {
                if (i == null) {
                    i = new d(context);
                }
            }
        }
        return i;
    }

    public final com.meituan.android.privacy.interfaces.config.c a(f fVar, String str, String str2) {
        Object[] objArr = {fVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa75cbe141cc9c04568a3eaa12dca50", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa75cbe141cc9c04568a3eaa12dca50") : this.c.a(fVar, str, str2);
    }

    public final f a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3489114246d7ed71712c8e741bc9c8d2", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3489114246d7ed71712c8e741bc9c8d2") : this.c.a(str, z);
    }

    @NonNull
    public final com.meituan.android.privacy.interfaces.config.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42314a0d0a5f7d3a0556beb34ef876d0", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42314a0d0a5f7d3a0556beb34ef876d0") : this.c.b(str);
    }

    @WorkerThread
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501a9eee63384851cabbdfe0a7f08e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501a9eee63384851cabbdfe0a7f08e8b");
        } else if (this.j) {
            RealConfig realConfig = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = RealConfig.a;
            if (PatchProxy.isSupport(objArr2, realConfig, changeQuickRedirect2, false, "5d6e8ce9c6869fcc4aab480254c82714", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, realConfig, changeQuickRedirect2, false, "5d6e8ce9c6869fcc4aab480254c82714");
            } else if (realConfig.e != Long.MAX_VALUE) {
                realConfig.c(PayLabelConstants.KEY_LABEL_CHECK);
            }
        }
    }
}
