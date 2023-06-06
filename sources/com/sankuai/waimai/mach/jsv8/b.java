package com.sankuai.waimai.mach.jsv8;

import android.app.Activity;
import android.os.Handler;
import android.support.annotation.UiThread;
import com.sankuai.waimai.mach.manager.cache.e;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Exception exc);

        void a(Map<String, Object> map, Map<String, Object> map2, com.sankuai.waimai.mach.model.data.a aVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.jsv8.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1011b {
        @UiThread
        void a(Object obj);
    }

    void a();

    void a(e eVar, Activity activity, com.sankuai.waimai.mach.model.data.a aVar);

    void a(String str, List<Object> list);

    void a(String str, List<Object> list, InterfaceC1011b interfaceC1011b);

    void a(String str, Map<String, Object> map);

    void a(Map<String, Object> map, a aVar, Handler handler);

    Object b(String str, List<Object> list);

    void b();

    void b(String str, Map<String, Object> map);

    void c();

    void d();

    void e();

    boolean f();
}
