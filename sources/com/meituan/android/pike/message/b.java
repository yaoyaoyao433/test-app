package com.meituan.android.pike.message;

import android.content.Context;
import com.meituan.android.pike.PikeClient;
import com.meituan.android.pike.message.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public c b;
    public HashMap<String, a> c;
    private com.meituan.android.pike.inner.a d;
    private final Object e;
    private Context f;

    public b(com.meituan.android.pike.inner.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abed104fb8a7574950d2744a13be20f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abed104fb8a7574950d2744a13be20f6");
            return;
        }
        this.f = context;
        this.d = aVar;
        this.e = new Object();
        this.c = new HashMap<>();
    }

    private c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9fedb52a298ac84335d87e86e77a94e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9fedb52a298ac84335d87e86e77a94e");
        }
        synchronized (this.e) {
            if (this.b == null) {
                this.b = new c(this);
            }
        }
        return this.b;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976e240f720934a34e10cfb6475b847c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976e240f720934a34e10cfb6475b847c");
            return;
        }
        synchronized (this.e) {
            this.c.remove(str);
        }
    }

    public void a(C0345b c0345b, PikeClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {c0345b, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb8ba84c0932e90bf67e002d90befec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb8ba84c0932e90bf67e002d90befec");
        } else if (sendMessageCallback != null) {
            synchronized (this.e) {
                if (!this.c.containsKey(c0345b.e)) {
                    this.c.put(c0345b.e, new a(c0345b, sendMessageCallback));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        C0345b b;
        PikeClient.SendMessageCallback c;

        public a(C0345b c0345b, PikeClient.SendMessageCallback sendMessageCallback) {
            Object[] objArr = {c0345b, sendMessageCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5fa785fa8f53299d2cc7dbec0166312", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5fa785fa8f53299d2cc7dbec0166312");
                return;
            }
            this.b = c0345b;
            this.c = sendMessageCallback;
        }
    }

    public final void a(int i, String str) {
        a aVar;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5400df1f0a48032b41c87e746c087724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5400df1f0a48032b41c87e746c087724");
            return;
        }
        c a2 = a();
        a2.a(c.b.NORMAL + CommonConstant.Symbol.COLON + str);
        synchronized (this.e) {
            aVar = this.c.get(str);
        }
        if (aVar != null) {
            C0345b c0345b = aVar.b;
            PikeClient.SendMessageCallback sendMessageCallback = aVar.c;
            com.meituan.android.pike.message.a aVar2 = new com.meituan.android.pike.message.a();
            aVar2.b = c0345b.e;
            aVar2.c = c0345b.f;
            aVar2.a(c0345b.d);
            if (i == 0) {
                sendMessageCallback.onSuccess(aVar2);
            } else {
                sendMessageCallback.onFailure(aVar2, i);
            }
            a(str);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pike.message.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0345b {
        public static ChangeQuickRedirect a;
        public JSONObject b;
        int c;
        public long d;
        public String e;
        String f;

        public C0345b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79865fee6bf5ef6399ebf26638c0d921", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79865fee6bf5ef6399ebf26638c0d921");
            } else {
                this.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final com.meituan.android.pike.message.b.C0345b r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pike.message.b.a(com.meituan.android.pike.message.b$b, boolean):void");
    }
}
