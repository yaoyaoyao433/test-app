package com.dianping.sharkpush;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.nvnetwork.g;
import com.dianping.sdk.pike.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    Map<String, com.dianping.sdk.pike.d> b;
    private Queue<a> d;
    private int e;
    private String f;
    private final com.dianping.sdk.pike.a g;
    private final Runnable h;

    public static /* synthetic */ int a(c cVar, int i) {
        cVar.e = 10;
        return 10;
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "7fd29d5a69b1986f719a07206be85cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "7fd29d5a69b1986f719a07206be85cdf");
            return;
        }
        synchronized (cVar.d) {
            if (cVar.d.size() > 0) {
                cVar.d.poll();
                cVar.b(cVar.d.peek());
            }
        }
    }

    public static /* synthetic */ int b(c cVar) {
        int i = cVar.e;
        cVar.e = i + 1;
        return i;
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a7fcc5d21bf3e2601b75f9e76e62bb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a7fcc5d21bf3e2601b75f9e76e62bb0");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c(g.b());
                }
            }
        }
        return c;
    }

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f3773778024f788c4aca6e4df3ccfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f3773778024f788c4aca6e4df3ccfb");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.d = new LinkedList();
        this.g = new com.dianping.sdk.pike.a() { // from class: com.dianping.sharkpush.c.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sdk.pike.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b03c2c077b7b36ac2c488eb326dd7b69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b03c2c077b7b36ac2c488eb326dd7b69");
                } else {
                    c.a(c.this);
                }
            }

            @Override // com.dianping.sdk.pike.a
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac26122c14aee8d4e15738feee3878f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac26122c14aee8d4e15738feee3878f4");
                    return;
                }
                c.b(c.this);
                if (c.this.e > 10) {
                    c.a(c.this, 10);
                }
                com.dianping.nvtunnelkit.core.c.a().a(c.this.h, com.dianping.nvtunnelkit.utils.g.a(c.this.e) * 1000);
            }
        };
        this.h = new Runnable() { // from class: com.dianping.sharkpush.c.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6556f6d96acf37d91bbcdbbfc057012", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6556f6d96acf37d91bbcdbbfc057012");
                    return;
                }
                synchronized (c.this.d) {
                    com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "userIdChangeRetryTask exec queue size: " + c.this.d.size());
                    c.this.b((a) c.this.d.peek());
                }
            }
        };
        if (com.dianping.sdk.pike.util.g.a(context)) {
            com.dianping.sharkpush.b.b = true;
            h.a(true);
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a421ec08fccbd30ef64f610b4e2cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a421ec08fccbd30ef64f610b4e2cc7");
        } else {
            h.a(runnable);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893e8eeec1de677ff891d157b2b040ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893e8eeec1de677ff891d157b2b040ad");
        } else if (!TextUtils.isEmpty(str) && !str.equals(this.f)) {
            com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "update unionId: " + str);
            this.f = str;
            if (this.b.size() > 0) {
                for (Map.Entry<String, com.dianping.sdk.pike.d> entry : this.b.entrySet()) {
                    com.dianping.sdk.pike.d value = entry.getValue();
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = com.dianping.sdk.pike.c.a;
                    if (PatchProxy.isSupport(objArr2, value, changeQuickRedirect2, false, "a5a399e7b87e70d283f7181302a8fe1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, value, changeQuickRedirect2, false, "a5a399e7b87e70d283f7181302a8fe1d");
                    } else {
                        value.a(str, (com.dianping.sdk.pike.a) null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082a6b0cb2c446b19d5eae9fe2ad4057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082a6b0cb2c446b19d5eae9fe2ad4057");
            return;
        }
        synchronized (this.d) {
            if (this.d.size() >= 50) {
                com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "userIdChangeCacheQueue size beyond max");
                return;
            }
            boolean isEmpty = this.d.isEmpty();
            this.d.offer(aVar);
            if (isEmpty) {
                b(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1b10174bfe6c933086fca842d8ae72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1b10174bfe6c933086fca842d8ae72");
        } else if (aVar == null) {
        } else {
            switch (aVar.a) {
                case Login:
                    h.a(aVar.b, this.g);
                    return;
                case Logout:
                    h.a(this.g);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public b a;
        public String b;

        public a(b bVar, String str) {
            this.a = bVar;
            this.b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        Login,
        Logout;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd5dc032e5e8244b891da84eb13e8d2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd5dc032e5e8244b891da84eb13e8d2c");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95cfff15f70c03fe681dd4f2c8fda5d6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95cfff15f70c03fe681dd4f2c8fda5d6") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d7b4375bff427f880812de2cdcce20a", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d7b4375bff427f880812de2cdcce20a") : (b[]) values().clone();
        }
    }
}
