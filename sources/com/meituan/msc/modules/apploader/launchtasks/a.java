package com.meituan.msc.modules.apploader.launchtasks;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends com.meituan.msc.common.aov_task.task.a<Integer> {
    public static ChangeQuickRedirect d;
    protected final com.meituan.msc.modules.engine.h e;

    public abstract com.meituan.msc.b c();

    public abstract String d();

    public a(String str, com.meituan.msc.modules.engine.h hVar) {
        super(str);
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aeb548a1f8bc9a6210f9f91410178eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aeb548a1f8bc9a6210f9f91410178eb");
        } else {
            this.e = hVar;
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.a
    public final com.meituan.msc.common.support.java.util.concurrent.a<Integer> b(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18851b515272eace477503a4417a6a8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18851b515272eace477503a4417a6a8e");
        }
        this.e.o.a(d());
        com.meituan.msc.common.aov_task.task.c<?> b = aVar.b(m.class);
        if (b != null) {
            String str = (String) aVar.a((m) b);
            if (TextUtils.isEmpty(str)) {
                str = this.e.r.f();
            }
            com.meituan.msc.b o = this.e.r.o(str);
            if (o != c()) {
                com.meituan.msc.modules.reporter.g.d("BaseCreateRenderTask", "render type no match", str, o, this);
                return com.meituan.msc.common.support.java.util.concurrent.a.c((Object) null);
            }
        }
        final com.meituan.msc.common.support.java.util.concurrent.a<Integer> aVar2 = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.apploader.launchtasks.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53224f545b89a2bf0e8c6826a1e22d8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53224f545b89a2bf0e8c6826a1e22d8c");
                    return;
                }
                aVar2.d((com.meituan.msc.common.support.java.util.concurrent.a) Integer.valueOf(((com.meituan.msc.modules.engine.c) a.this.e.c(com.meituan.msc.modules.engine.c.class)).a(a.this.c())));
                a.this.e.o.b(a.this.d());
            }
        });
        return aVar2;
    }
}
