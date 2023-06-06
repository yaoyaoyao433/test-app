package com.meituan.android.yoda.model;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.IOUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    public static volatile ExecutorService b = com.sankuai.android.jarvis.c.b("yoda-statistics");
    private static final String e = "b";
    public boolean c;
    public boolean d;
    private InterfaceC0379b f;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0379b {
        InterfaceC0379b a(int i);

        InterfaceC0379b c(String str);

        InterfaceC0379b d(String str);

        InterfaceC0379b e(String str);

        InterfaceC0379b f(String str);

        InterfaceC0379b g(String str);

        String getAction();

        String getBid();

        int getConfirmType();

        String getPageCid();

        long getPageDuration();

        String getPageInfoKey();

        String getRequestCode();
    }

    private b(InterfaceC0379b interfaceC0379b) {
        Object[] objArr = {interfaceC0379b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f0579edd7b3a9667baff45e28ba338", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f0579edd7b3a9667baff45e28ba338");
            return;
        }
        this.c = false;
        this.d = false;
        this.f = interfaceC0379b;
        this.d = !TextUtils.isEmpty(this.f.getBid());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54ce9bb05b9bf2f1468804f35fd5f729", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54ce9bb05b9bf2f1468804f35fd5f729")).booleanValue() : Statistics.isInitialized();
    }

    public static b a(InterfaceC0379b interfaceC0379b) {
        Object[] objArr = {interfaceC0379b};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8c058d743a990908199fb18ac90e927", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8c058d743a990908199fb18ac90e927") : new b(interfaceC0379b);
    }

    public static synchronized void a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d59fcc9037e7d49a80c0b995661f0804", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d59fcc9037e7d49a80c0b995661f0804");
                return;
            }
            if (b != null) {
                b.shutdown();
                b = null;
            }
        }
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fd99542e7eb8c25a310dc240a24d5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fd99542e7eb8c25a310dc240a24d5ca");
        } else {
            bVar.d().writeModelView(bVar.f.getPageInfoKey(), bVar.f.getBid(), bVar.a(false), bVar.f.getPageCid());
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94626b348e34c646952a2544539c4860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94626b348e34c646952a2544539c4860");
        } else if (this.d && this.c) {
            c();
            b.execute(d.a(this));
        }
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71b25d142dc8a4903f222b0e812be730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71b25d142dc8a4903f222b0e812be730");
        } else {
            bVar.d().writeModelClick(bVar.f.getPageInfoKey(), bVar.f.getBid(), bVar.a(false), bVar.f.getPageCid());
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba098b8bd4815340c5ae24e9ecad8adc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba098b8bd4815340c5ae24e9ecad8adc");
        } else if (this.c) {
            c();
            b.execute(e.a(this, str, str2));
        }
    }

    public static /* synthetic */ void b(b bVar, String str, String str2) {
        Object[] objArr = {bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "530dec9bff71721170b62eed2ec5015e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "530dec9bff71721170b62eed2ec5015e");
        } else {
            bVar.d().writePageView(str, str2, bVar.a(false));
        }
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5057b8ad49c6d16d1c5140cc9ee4475f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5057b8ad49c6d16d1c5140cc9ee4475f");
        } else if (this.c) {
            c();
            b.execute(f.a(this, str, str2));
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        Object[] objArr = {bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2d98baf38222bb2b43c9b653df0ab50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2d98baf38222bb2b43c9b653df0ab50");
        } else {
            bVar.d().writePageDisappear(str, str2, bVar.a(true));
        }
    }

    private Channel d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a8bb9dacff05154ea1e38884f23787", RobustBitConfig.DEFAULT_VALUE) ? (Channel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a8bb9dacff05154ea1e38884f23787") : Statistics.getChannel("techportal");
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a0b8bd644aab83efff38eb048731a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a0b8bd644aab83efff38eb048731a31");
        } else if (b == null) {
            e();
        }
    }

    private static synchronized void e() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1b383046a83ca73433beb1eb92ed07c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1b383046a83ca73433beb1eb92ed07c");
                return;
            }
            if (b == null) {
                b = com.sankuai.android.jarvis.c.b("yoda_statistics_model");
            }
        }
    }

    private HashMap<String, Object> a(boolean z) {
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2f2b8792c68be4e8330997a2d9ffea", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2f2b8792c68be4e8330997a2d9ffea");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.f.getRequestCode());
        jsonObject.addProperty("action", this.f.getAction());
        jsonObject.addProperty("method", Integer.valueOf(this.f.getConfirmType()));
        jsonObject.addProperty(IOUtils.YODA_VERSION, x.i());
        a a2 = a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d4492e15e201d179d4481f5e8b40b2e8", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d4492e15e201d179d4481f5e8b40b2e8");
        } else if (a2.b.size() > 0) {
            String a3 = x.a(a2.b);
            a2.b.clear();
            str = a3;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            jsonObject.addProperty("feError", str);
        }
        if (z) {
            jsonObject.addProperty("pageDuration", Long.valueOf(this.f.getPageDuration()));
            hashMap.put("duration", Long.valueOf(this.f.getPageDuration()));
        } else {
            jsonObject.addProperty("pageDuration", "");
        }
        hashMap.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.f.getRequestCode());
        hashMap.put("action", this.f.getAction());
        hashMap.put("method", Integer.valueOf(this.f.getConfirmType()));
        hashMap.put(IOUtils.YODA_VERSION, x.i());
        hashMap.put("custom", jsonObject.toString());
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static a c = new a();
        public CopyOnWriteArrayList<Error> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1fe9d3b984cbe47f393487e547a750", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1fe9d3b984cbe47f393487e547a750");
            } else {
                this.b = new CopyOnWriteArrayList<>();
            }
        }

        public static a a() {
            return c;
        }

        public final void a(String str, Object obj, String str2) {
            Object[] objArr = {str, obj, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "405da90858163656bdb2780ee565d4e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "405da90858163656bdb2780ee565d4e9");
            } else {
                this.b.add(a(str, obj, 0, null));
            }
        }

        private Error a(String str, Object obj, int i, String str2) {
            Object[] objArr = {str, obj, 0, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603f7f828e31ed7053da2c4282a54330", RobustBitConfig.DEFAULT_VALUE)) {
                return (Error) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603f7f828e31ed7053da2c4282a54330");
            }
            Error error = new Error();
            StringBuilder sb = new StringBuilder("msg:");
            sb.append(str);
            if (obj != null) {
                sb.append(" ,instance:");
                sb.append(obj.getClass().getSimpleName());
            }
            if (str2 != null) {
                sb.append(" ,extraMsg:");
                sb.append(str2);
            }
            error.message = sb.toString();
            return error;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c implements InterfaceC0379b {
        public static ChangeQuickRedirect a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        private long h;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2369f46975f4fc001d0f165c6733d37", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2369f46975f4fc001d0f165c6733d37");
                return;
            }
            this.b = "";
            this.d = "";
            this.e = "";
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final InterfaceC0379b c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final String getBid() {
            return this.b;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final InterfaceC0379b a(int i) {
            this.c = i;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final int getConfirmType() {
            return this.c;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final InterfaceC0379b d(String str) {
            this.d = str;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final String getRequestCode() {
            return this.d;
        }

        public final InterfaceC0379b a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33dc0ffa4adb5b2a07c37ddd4791082", RobustBitConfig.DEFAULT_VALUE)) {
                return (InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33dc0ffa4adb5b2a07c37ddd4791082");
            }
            this.h = j;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final long getPageDuration() {
            return this.h;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final InterfaceC0379b e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final String getAction() {
            return this.e;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final InterfaceC0379b f(String str) {
            this.f = str;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final String getPageCid() {
            return this.f;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final InterfaceC0379b g(String str) {
            this.g = str;
            return this;
        }

        @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
        public final String getPageInfoKey() {
            return this.g;
        }
    }
}
