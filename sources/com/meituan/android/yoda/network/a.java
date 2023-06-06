package com.meituan.android.yoda.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Network;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected static final String b = x.i();
    public AtomicBoolean c;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0380a {
        public Bitmap a;
        public String b;
    }

    public abstract a a(Context context);

    public abstract void a(Network network, String str, String str2, String str3, String str4, com.meituan.android.yoda.interfaces.h<String> hVar, boolean z);

    public abstract void a(String str, int i, String str2, String str3, String str4, File file, String str5, boolean z, HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar);

    public abstract void a(String str, int i, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar);

    public abstract void a(String str, com.meituan.android.yoda.interfaces.h<YodaResult> hVar);

    public abstract void a(String str, String str2, com.meituan.android.yoda.interfaces.h<ap> hVar);

    public abstract void b(String str, int i, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar);

    public abstract a c();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ed4ebb79dd5617029cd5aaa8e7d100", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ed4ebb79dd5617029cd5aaa8e7d100");
        } else {
            this.c = new AtomicBoolean(true);
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0a8cd0e04295ffcc9d0cb4d3ab66649", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0a8cd0e04295ffcc9d0cb4d3ab66649") : b.e();
    }

    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c009a9e634d311e3a78b8c738275e56b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c009a9e634d311e3a78b8c738275e56b");
        }
        this.c.compareAndSet(false, true);
        return this;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "585f49110a48e08d5f97be63b04368d5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "585f49110a48e08d5f97be63b04368d5") : com.meituan.android.yoda.plugins.d.a().g.a();
    }

    public final HashMap<String, String> a(int i, String str, String str2, boolean z, HashMap<String, String> hashMap) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07d1d42ce6f9ce87f9cc9de234d5154", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07d1d42ce6f9ce87f9cc9de234d5154");
        }
        HashMap<String, String> hashMap2 = hashMap == null ? new HashMap<>(8) : hashMap;
        hashMap2.put("id", String.valueOf(i));
        hashMap2.put(OtherVerifyTypeConstants.REQUEST_CODE, str);
        hashMap2.put("listIndex", str2);
        hashMap2.put("feVersion", b);
        hashMap2.put(FingerprintManager.TAG, d());
        hashMap2.put("accessibility_enabled", String.valueOf(z));
        com.meituan.android.yoda.model.behavior.d.a(hashMap2);
        return hashMap2;
    }
}
