package com.dianping.imagemanager.base;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.dianping.imagemanager.utils.c;
import com.dianping.imagemanager.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static ArrayList<e> n = new ArrayList<>();
    public boolean b;
    public Context c;
    @Deprecated
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    private SharedPreferences m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0077a {
        public static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4437b4506d65da9181b41b82cf6383a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4437b4506d65da9181b41b82cf6383a9");
            return;
        }
        this.b = false;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = 0;
        this.i = 4096;
        this.j = 15000;
        this.k = 15000;
        this.l = false;
    }

    public static a a() {
        return C0077a.a;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941cb98b3faa468811c593677d05e103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941cb98b3faa468811c593677d05e103");
            return;
        }
        b.a().a(context);
        if (this.c != null || context == null) {
            return;
        }
        if (context instanceof Application) {
            this.c = context;
        } else {
            this.c = context.getApplicationContext();
        }
        if (this.c != null) {
            com.dianping.gryphon.d.a(this.c);
            com.dianping.imagemanager.image.cache.c.a(this.c);
            com.dianping.imagemanager.image.cache.memory.b.a().a(this.c);
            this.h = this.c.getSharedPreferences("dpimageview", 0).getBoolean("globalMemCacheEnabled", true);
            com.dianping.imagemanager.utils.a.a(a.class, "DPImageEnvironment globalMemCacheEnabled=" + this.h);
            com.dianping.imagemanager.utils.c.a(new c.a() { // from class: com.dianping.imagemanager.base.a.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.imagemanager.utils.c.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47deedca7947a4158a10b526608b7a36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47deedca7947a4158a10b526608b7a36");
                    } else {
                        a.this.i = Math.min(i, 8192);
                    }
                }
            });
        }
        this.b = true;
    }

    public static ArrayList<e> b() {
        return n;
    }

    public final SharedPreferences c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a73b809a61b71b7ab078a180ecb68bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a73b809a61b71b7ab078a180ecb68bd");
        }
        if (this.m == null && this.c != null) {
            this.m = this.c.getSharedPreferences("dpimageview", 0);
        }
        return this.m;
    }
}
