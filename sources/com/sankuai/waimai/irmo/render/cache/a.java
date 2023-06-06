package com.sankuai.waimai.irmo.render.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    @NonNull
    protected File b;

    public abstract boolean a(@NonNull ap apVar);

    public a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90783ad6434e954d036967ae9f0d6590", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90783ad6434e954d036967ae9f0d6590");
            return;
        }
        File b2 = q.b(com.meituan.android.singleton.b.a, "irmo", str2);
        if (!b2.exists()) {
            b2.mkdirs();
        }
        this.b = new File(b2, a(str));
    }

    @Nullable
    public static a a(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c811e351e01ae0e750c69389c6c8bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c811e351e01ae0e750c69389c6c8bd7");
        }
        if (i != 0) {
            return null;
        }
        return new b(str);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a528001a1ce5c27e1a954e7801d5d886", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a528001a1ce5c27e1a954e7801d5d886")).booleanValue() : this.b.isFile() && this.b.exists();
    }

    @NonNull
    public final File b() {
        return this.b;
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c2d5f66f7a7afb75a8d861c2cf40f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c2d5f66f7a7afb75a8d861c2cf40f8");
        }
        try {
            return f.a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).f();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.render.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0974a extends a {
        public static ChangeQuickRedirect c;

        public C0974a(@NonNull String str, @NonNull String str2) {
            super(str, str2);
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5b4a1ca8a5e11b28c3dfc6405430c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5b4a1ca8a5e11b28c3dfc6405430c8");
            }
        }

        @Override // com.sankuai.waimai.irmo.render.cache.a
        public final boolean a(@NonNull ap apVar) {
            Object[] objArr = {apVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e95743ad46f12ba21b8caef0e7baac", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e95743ad46f12ba21b8caef0e7baac")).booleanValue();
            }
            String string = apVar.string();
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.b));
                bufferedWriter.write(string);
                bufferedWriter.flush();
                bufferedWriter.close();
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends C0974a {
        public b(@NonNull String str) {
            super(str, "dsl");
        }
    }
}
