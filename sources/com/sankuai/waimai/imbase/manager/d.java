package com.sankuai.waimai.imbase.manager;

import android.app.Application;
import android.content.Context;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a(List<com.sankuai.xm.im.session.entry.a> list);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.manager.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0965d {
        void a(List<com.sankuai.xm.im.session.entry.a> list);

        void b(List<com.sankuai.xm.im.session.entry.a> list);
    }

    void a(Application application);

    void a(Application application, boolean z);

    void a(Context context);

    void a(a aVar);

    void a(c cVar);

    void a(SessionId sessionId, IMClient.g<com.sankuai.xm.im.session.entry.a> gVar);

    void a(String str);

    void a(short s, long j, int i, b bVar);

    void a(short s, long j, long j2, short s2, String str, a aVar);

    void a(short s, a aVar);

    void a(short s, c cVar);

    void a(short s, InterfaceC0965d interfaceC0965d);

    void a(boolean z);

    boolean a();

    void b(short s, InterfaceC0965d interfaceC0965d);

    void b(boolean z);

    boolean b();

    void c(boolean z);

    boolean c();

    boolean e();

    void f();

    void g();
}
