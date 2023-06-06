package com.dianping.video.template.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    private TemplateTrack e;
    private TemplateTrack f;
    private TemplateTrack g;

    public final List<com.dianping.video.template.model.tracksegment.c> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0bfcc68553dba8aa341fe26c5d2923", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0bfcc68553dba8aa341fe26c5d2923");
        }
        ArrayList arrayList = new ArrayList();
        if (this.e != null) {
            for (int i = 0; i < this.e.a(); i++) {
                arrayList.add((com.dianping.video.template.model.tracksegment.c) this.e.a(i));
            }
        }
        return arrayList;
    }

    public final List<com.dianping.video.template.model.tracksegment.b> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b4c0f55f236e159ac8ef1d38eeb93b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b4c0f55f236e159ac8ef1d38eeb93b");
        }
        ArrayList arrayList = new ArrayList();
        if (this.g != null) {
            for (int i = 0; i < this.g.a(); i++) {
                arrayList.add((com.dianping.video.template.model.tracksegment.b) this.g.a(i));
            }
        }
        return arrayList;
    }

    public final List<com.dianping.video.template.model.tracksegment.a> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f3618d6bf0e9624f2bbecb41ffd3dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f3618d6bf0e9624f2bbecb41ffd3dc");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f != null) {
            for (int i = 0; i < this.f.a(); i++) {
                arrayList.add((com.dianping.video.template.model.tracksegment.a) this.f.a(i));
            }
        }
        return arrayList;
    }
}
