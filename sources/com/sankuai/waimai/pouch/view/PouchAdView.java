package com.sankuai.waimai.pouch.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface PouchAdView {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(String str);
    }

    void a();

    void a(Activity activity, com.sankuai.waimai.mach.recycler.b bVar, PouchDynamicAd pouchDynamicAd);

    void a(Context context, ViewGroup viewGroup, com.sankuai.waimai.pouch.model.c cVar, PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.a aVar, String str);

    void a(Context context, com.sankuai.waimai.pouch.model.c cVar, PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.a aVar, String str);

    void a(Rect rect);

    void a(ViewGroup viewGroup, PouchDynamicAd pouchDynamicAd);

    void a(com.sankuai.waimai.mach.b bVar);

    void a(PouchDynamicAd pouchDynamicAd);

    void a(PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.model.b bVar);

    void a(com.sankuai.waimai.pouch.model.c cVar);

    void a(com.sankuai.waimai.pouch.plugin.b bVar);

    void a(a aVar);

    void a(b bVar);

    void a(Set set, String str);

    Mach b();

    void b(PouchDynamicAd pouchDynamicAd);

    void c();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    com.sankuai.waimai.pouch.mach.container.a k();
}
