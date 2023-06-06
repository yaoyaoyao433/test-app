package com.sankuai.waimai.business.search.ui.result.mach.component.gallery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.GalleryCardContainer;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.GalleryCardLayoutManager;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.mach.utils.e;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.mach.component.a<GalleryCardContainer> implements GalleryCardContainer.a, com.sankuai.waimai.mach.component.b {
    public static ChangeQuickRedirect a;
    private c c;
    private GalleryCardContainer d;
    private int e;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8d95874de1e5fbba92f253b8bde264c", RobustBitConfig.DEFAULT_VALUE) ? (GalleryCardContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8d95874de1e5fbba92f253b8bde264c") : new GalleryCardContainer(context);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ddd6365fb859477affb7a2471e14e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ddd6365fb859477affb7a2471e14e7");
        } else {
            this.c = new c();
        }
    }

    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf4f80704cc9e7a5a88e1f71843ccad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf4f80704cc9e7a5a88e1f71843ccad");
            return;
        }
        super.a();
        c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "73d69983811b63e8302222d0f80dedcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "73d69983811b63e8302222d0f80dedcd");
        } else {
            cVar.b = 7;
            cVar.c = 0.9f;
            cVar.d = false;
            cVar.e = 54;
            cVar.f = 84;
        }
        String a2 = a("item-space");
        String a3 = a("item-scale");
        String a4 = a("has-more");
        String a5 = a("more-offset");
        String a6 = a("enter-more-offset");
        d dVar = null;
        d dVar2 = (k() == null || !(k().get("@enter-more") instanceof d)) ? null : (d) k().get("@enter-more");
        d dVar3 = (k() == null || !(k().get("@more-status-changed") instanceof d)) ? null : (d) k().get("@more-status-changed");
        String a7 = a(RemoteMessageConst.NOTIFICATION);
        if (k() != null && (k().get("@index-change") instanceof d)) {
            dVar = (d) k().get("@index-change");
        }
        this.c.b = f(a2);
        this.c.c = c(a3);
        this.c.d = j(a4);
        this.c.e = f(a5);
        this.c.f = f(a6);
        this.c.g = dVar2;
        this.c.h = dVar3;
        this.c.i = a7;
        this.c.j = dVar;
    }

    private boolean j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b452f7f8da9e02f3071d72d02491b6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b452f7f8da9e02f3071d72d02491b6d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.mach.component.a
    public void a(GalleryCardContainer galleryCardContainer) {
        Object[] objArr = {galleryCardContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146788822d15228a5fb112b805030932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146788822d15228a5fb112b805030932");
            return;
        }
        super.a((b) galleryCardContainer);
        this.c.k = this.m;
        this.d = galleryCardContainer;
        this.d.setIndexChangedListener(this);
        if (this.d != null) {
            final GalleryCardContainer galleryCardContainer2 = this.d;
            c cVar = this.c;
            com.sankuai.waimai.mach.node.a<V> aVar = this.n;
            Object[] objArr2 = {cVar, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = GalleryCardContainer.a;
            if (PatchProxy.isSupport(objArr2, galleryCardContainer2, changeQuickRedirect2, false, "b67016a18544b3a2fde9f00194038ab0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, galleryCardContainer2, changeQuickRedirect2, false, "b67016a18544b3a2fde9f00194038ab0");
            } else if (!e.a(aVar) || cVar == null || galleryCardContainer2.c == null) {
            } else {
                galleryCardContainer2.e = cVar;
                galleryCardContainer2.h = new ArrayList(aVar.b());
                if (galleryCardContainer2.d == null) {
                    galleryCardContainer2.d = new a(galleryCardContainer2.h, aVar.f.getRenderEngine());
                    galleryCardContainer2.c.setAdapter(galleryCardContainer2.d);
                } else {
                    galleryCardContainer2.d.a(galleryCardContainer2.h);
                }
                galleryCardContainer2.d.b = cVar;
                galleryCardContainer2.g = new GalleryCardLayoutManager(galleryCardContainer2.getContext(), 0, false);
                galleryCardContainer2.c.setLayoutManager(galleryCardContainer2.g);
                galleryCardContainer2.g.b = new GalleryCardLayoutManager.a() { // from class: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.GalleryCardContainer.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.GalleryCardLayoutManager.a
                    public final void a(int i) {
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6740f313a73cc78db7945476fa130c47", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6740f313a73cc78db7945476fa130c47");
                            return;
                        }
                        galleryCardContainer2.a(i);
                        if (galleryCardContainer2.i == null || i == galleryCardContainer2.j) {
                            return;
                        }
                        galleryCardContainer2.j = i;
                        galleryCardContainer2.i.a(i);
                    }
                };
                if (galleryCardContainer2.f == null) {
                    galleryCardContainer2.f = new com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a(cVar);
                    try {
                        final com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a aVar2 = galleryCardContainer2.f;
                        RecyclerView recyclerView = galleryCardContainer2.c;
                        Object[] objArr3 = {recyclerView};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "ef9d21fa59454d091077d08a7fe5f704", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "ef9d21fa59454d091077d08a7fe5f704");
                        } else {
                            aVar2.b = recyclerView;
                            aVar2.d = aVar2.b.getContext();
                            if (aVar2.b != null) {
                                RecyclerView.LayoutManager layoutManager = aVar2.b.getLayoutManager();
                                if (layoutManager instanceof GalleryCardLayoutManager) {
                                    aVar2.e = (GalleryCardLayoutManager) layoutManager;
                                    aVar2.f = aVar2.e.b;
                                }
                            }
                            aVar2.p.a(recyclerView);
                            recyclerView.addOnScrollListener(aVar2.q);
                            recyclerView.addItemDecoration(new a.C0870a());
                            recyclerView.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c01b5537c384d49d19b5c55963e7e54e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c01b5537c384d49d19b5c55963e7e54e");
                                    } else {
                                        a.a(aVar2);
                                    }
                                }
                            });
                        }
                    } catch (Exception e) {
                        Log.wtf(GalleryCardContainer.b, "setSwitcherConfig: ", e);
                    }
                    final com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a aVar3 = galleryCardContainer2.f;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "2589886d3ee3c935f91ed883d913220d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "2589886d3ee3c935f91ed883d913220d");
                    } else {
                        aVar3.b.addOnChildAttachStateChangeListener(new RecyclerView.h() { // from class: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.1
                            public static ChangeQuickRedirect a;

                            @Override // android.support.v7.widget.RecyclerView.h
                            public final void onChildViewAttachedToWindow(View view) {
                                Object[] objArr5 = {view};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3db92d5bd537f90180be51da90df7909", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3db92d5bd537f90180be51da90df7909");
                                } else if (view instanceof FooterView) {
                                    aVar3.c = (FooterView) view;
                                }
                            }

                            @Override // android.support.v7.widget.RecyclerView.h
                            public final void onChildViewDetachedFromWindow(View view) {
                                Object[] objArr5 = {view};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6b912e0bacf0f3f84914851665e6d5f8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6b912e0bacf0f3f84914851665e6d5f8");
                                } else if (view instanceof FooterView) {
                                    aVar3.c = null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.result.mach.component.gallery.GalleryCardContainer.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca729ac47138abb984ae0f3417c0c12a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca729ac47138abb984ae0f3417c0c12a");
            return;
        }
        this.e = i;
        d dVar = this.c.j;
        if (this.m == null || dVar == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(i));
        this.m.asyncCallJSMethod(dVar.b, linkedList);
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f059bf2305d768d73cdd1ceb867d3fb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f059bf2305d768d73cdd1ceb867d3fb9")).intValue();
        }
        GalleryCardContainer galleryCardContainer = (GalleryCardContainer) this.o;
        if (galleryCardContainer == null) {
            return 0;
        }
        return galleryCardContainer.getItemCount();
    }
}
