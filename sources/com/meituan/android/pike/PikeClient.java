package com.meituan.android.pike;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class PikeClient {

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public interface SendMessageCallback {
        void onFailure(com.meituan.android.pike.message.a aVar, int i);

        void onSuccess(com.meituan.android.pike.message.a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static final PikeClient a = com.meituan.android.pike.manager.b.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d {
        void a(com.meituan.android.pike.message.a aVar);
    }

    public abstract long a(long j);

    public abstract void a();

    public abstract void a(b bVar);

    public abstract void a(d dVar);

    public abstract void a(com.meituan.android.pike.message.a aVar, SendMessageCallback sendMessageCallback);

    public abstract boolean a(String str, a aVar, Context context, com.meituan.android.pike.a aVar2);

    public abstract void b();

    public abstract void b(b bVar);

    public abstract void b(d dVar);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public short c;
        public String d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public com.meituan.android.pike.inner.c i;
        public HashMap<String, String> j;
        public boolean k;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081aa3701b4b490919e1ad69dae4ce5e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081aa3701b4b490919e1ad69dae4ce5e");
                return;
            }
            this.b = -1;
            this.d = "";
            this.e = -1;
            this.f = true;
            this.g = -1;
            this.h = -1;
            this.k = true;
        }
    }
}
