package com.meizu.cloud.pushsdk.d.c;

import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.d.c.a;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
/* loaded from: classes3.dex */
public final class b extends com.meizu.cloud.pushsdk.d.c.a {
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final int l;

    /* loaded from: classes3.dex */
    public static abstract class a<T extends a<T>> extends a.AbstractC0528a<T> {
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        int l = 0;

        public final T a(int i) {
            this.l = i;
            return (T) a();
        }

        public final T a(String str) {
            this.d = str;
            return (T) a();
        }

        public final T b(String str) {
            this.e = str;
            return (T) a();
        }

        public final b b() {
            return new b(this);
        }

        public final T c(String str) {
            this.f = str;
            return (T) a();
        }

        public final T d(String str) {
            this.g = str;
            return (T) a();
        }

        public final T e(String str) {
            this.h = str;
            return (T) a();
        }

        public final T f(String str) {
            this.i = str;
            return (T) a();
        }

        public final T g(String str) {
            this.j = str;
            return (T) a();
        }

        public final T h(String str) {
            this.k = str;
            return (T) a();
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.d.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0529b extends a<C0529b> {
        private C0529b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.meizu.cloud.pushsdk.d.c.a.AbstractC0528a
        public final /* synthetic */ a.AbstractC0528a a() {
            return this;
        }
    }

    public static a<?> a() {
        return new C0529b();
    }

    protected b(a<?> aVar) {
        super(aVar);
        this.e = aVar.e;
        this.f = aVar.f;
        this.d = aVar.d;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public final c b() {
        c cVar = new c();
        cVar.a("en", this.d);
        cVar.a("ti", this.e);
        cVar.a(AppIconSetting.DEFAULT_LARGE_ICON, this.f);
        cVar.a("pv", this.g);
        cVar.a("pn", this.h);
        cVar.a("si", this.i);
        cVar.a("ms", this.j);
        cVar.a("ect", this.k);
        cVar.a(BrightRemindSetting.BRIGHT_REMIND, Integer.valueOf(this.l));
        cVar.a(NotificationStyle.EXPANDABLE_IMAGE_URL, this.c);
        cVar.a("ts", Long.toString(this.b));
        return cVar;
    }
}
