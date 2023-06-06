package com.meituan.passport.utils;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class d implements Handler.Callback {
    public static ChangeQuickRedirect a;
    private static Map<String, b> i;
    public int b;
    public b c;
    private int d;
    private WeakReference<a> e;
    private Handler f;
    private int g;
    private String h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(int i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bcff0963a6351097aa1fbf8c43856e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bcff0963a6351097aa1fbf8c43856e0")).booleanValue();
        }
        a aVar = this.e.get();
        if (this.g >= 0 && aVar != null) {
            aVar.a(this.g);
            this.g--;
            this.f.sendEmptyMessageDelayed(8, this.d);
        } else if (aVar != null) {
            aVar.a();
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        String a;
        long b;
        public boolean c;

        public b() {
        }
    }

    public static b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d45ecf01361ec30cf6a8d62a7d4c1551", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d45ecf01361ec30cf6a8d62a7d4c1551");
        }
        if (i == null) {
            i = new HashMap();
        }
        b bVar = i.get(str);
        if (bVar == null) {
            bVar = new b();
            bVar.a = "";
            bVar.c = true;
            bVar.b = -1L;
        }
        i.put(str, bVar);
        return bVar;
    }

    public d(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58391d20436a8a79427b8505ad66ddb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58391d20436a8a79427b8505ad66ddb0");
            return;
        }
        this.b = 60;
        this.d = 1000;
        this.g = 0;
        this.e = new WeakReference<>(aVar);
        this.h = str;
        this.f = g.a(this);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c25f84da7b9d6b445a12442ec4e9286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c25f84da7b9d6b445a12442ec4e9286");
        } else {
            this.f.removeMessages(8);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e1bc9e548fd7c4becd4fef2dbc26b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e1bc9e548fd7c4becd4fef2dbc26b84");
            return;
        }
        this.c = a(str);
        this.g = a(this.c);
        if (this.g == this.b) {
            this.c.b = System.currentTimeMillis();
            this.c.c = false;
            this.c.a = this.h;
        }
        a();
        this.f.sendEmptyMessage(8);
    }

    private int a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1b955b98a287e4d1caff2fcd0693d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1b955b98a287e4d1caff2fcd0693d6")).intValue();
        }
        if (!TextUtils.equals(this.h, bVar.a)) {
            bVar.b = -1L;
            bVar.a = this.h;
        }
        if (bVar.b < 0) {
            return this.b;
        }
        int currentTimeMillis = this.b - ((int) ((System.currentTimeMillis() - bVar.b) / 1000));
        return currentTimeMillis > 0 ? currentTimeMillis : this.b;
    }
}
