package com.meituan.android.ptcommonim.mach;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.c;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import com.sankuai.xm.base.util.ActivityUtils;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final f b;
    final Map<String, Object> c;
    final Handler d;
    MachViewGroup e;
    volatile com.sankuai.waimai.mach.manager.cache.e f;
    public volatile boolean g;
    private final Context h;
    private final MachInfo i;
    private final g j;
    private final boolean k;

    public b(Context context, final f fVar, Map<String, Object> map, MachInfo machInfo) {
        Object[] objArr = {context, fVar, map, machInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df399b19b392c74723efedea6abef2c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df399b19b392c74723efedea6abef2c9");
            return;
        }
        this.k = false;
        this.h = context;
        this.b = fVar;
        this.c = map;
        this.d = new Handler(context.getMainLooper());
        this.i = machInfo;
        this.j = new g() { // from class: com.meituan.android.ptcommonim.mach.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i, Throwable th) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str, String str2) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3921d5f7a65ee73bcb4e3687706866f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3921d5f7a65ee73bcb4e3687706866f");
                } else {
                    b.this.e.requestLayout();
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5df7d3f465924311ba6890f329dfcd3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5df7d3f465924311ba6890f329dfcd3f");
                } else if (fVar != null) {
                    fVar.a();
                }
            }
        };
    }

    public final void a(MachViewGroup machViewGroup) {
        Activity a2;
        Object[] objArr = {machViewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b69987d38673700c82814c36253688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b69987d38673700c82814c36253688");
            return;
        }
        this.g = true;
        this.e = machViewGroup;
        this.e.setVisibility(0);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a25b41981d2f90e10a67960534882eb5", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a25b41981d2f90e10a67960534882eb5");
        } else {
            a2 = this.h == null ? null : ActivityUtils.a(this.h);
        }
        Activity activity = a2;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        MachViewGroup machViewGroup2 = this.e;
        Object[] objArr3 = {activity, machViewGroup2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37c16584a5073e98f8de4ccfceaea52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37c16584a5073e98f8de4ccfceaea52b");
            return;
        }
        Mach mach = this.b.b;
        mach.removeRenderListener(this.j);
        mach.addRenderListener(this.j);
        if (this.f != null) {
            this.d.post(c.a(this, mach, activity, machViewGroup2));
        } else if (this.i == null || !this.i.isValid()) {
        } else {
            com.meituan.android.ptcommonim.pageadapter.message.mach.c.a(this.i.machId, this.i.moduleId, this.i.biz, new AnonymousClass2(mach, activity, machViewGroup2));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.mach.b$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements c.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Mach b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ MachViewGroup d;

        @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.c.a
        @WorkerThread
        public final void a(@NonNull CacheException cacheException) {
        }

        public AnonymousClass2(Mach mach, Activity activity, MachViewGroup machViewGroup) {
            this.b = mach;
            this.c = activity;
            this.d = machViewGroup;
        }

        @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.c.a
        @WorkerThread
        public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "783d1621c615b29f0d4b6829ce3e49bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "783d1621c615b29f0d4b6829ce3e49bb");
            } else {
                b.this.d.post(d.a(this, eVar, this.b, this.c, this.d));
            }
        }
    }
}
