package com.meituan.android.ptcommonim.pageadapter.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFrameMachContainer extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final Handler b;
    private com.meituan.android.ptcommonim.pageadapter.message.mach.f c;
    private MachViewGroup d;
    private com.sankuai.waimai.mach.manager.cache.e e;
    private b f;
    private com.meituan.android.ptcommonim.pageadapter.message.mach.d g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends com.meituan.android.ptcommonim.pageadapter.message.mach.d {
        public static ChangeQuickRedirect a;
        private boolean e;

        public a(com.meituan.android.ptcommonim.pageadapter.message.mach.f fVar) {
            super(fVar);
            Object[] objArr = {PTFrameMachContainer.this, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5598af84d1fac3be56fcba3cecd869", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5598af84d1fac3be56fcba3cecd869");
            } else {
                this.e = false;
            }
        }

        @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.d, com.sankuai.waimai.mach.g
        public final void a(com.sankuai.waimai.mach.node.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08922fd24ff60f4595bdb7fb97c4212e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08922fd24ff60f4595bdb7fb97c4212e");
            } else if (PTFrameMachContainer.this.c == null || this.e) {
            } else {
                this.e = true;
                PTFrameMachContainer.this.b.post(d.a(this));
            }
        }
    }

    public PTFrameMachContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1a8ab7ed825df377375776f796187b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1a8ab7ed825df377375776f796187b");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        a(context);
    }

    public PTFrameMachContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5368074bf3b0fc6bc0f753b11ee5dd15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5368074bf3b0fc6bc0f753b11ee5dd15");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        a(context);
    }

    public PTFrameMachContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2e24ba2c9f38a69a89e70ca46c84c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2e24ba2c9f38a69a89e70ca46c84c9");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6955180792c651c169bb436d887cd1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6955180792c651c169bb436d887cd1c9");
            return;
        }
        setGravity(1);
        this.d = new MachViewGroup(context);
        this.d.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        addView(this.d);
    }

    public void setMachLoadCallback(b bVar) {
        this.f = bVar;
    }

    public void setMachProxy(com.meituan.android.ptcommonim.pageadapter.message.mach.f fVar) {
        this.c = fVar;
    }

    public final void a(Activity activity, MachInfo machInfo, Map<String, Object> map) {
        Object[] objArr = {activity, machInfo, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25deb10143e3c4eed84e1949bfb1ecd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25deb10143e3c4eed84e1949bfb1ecd7");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            if (this.c != null && machInfo != null && map != null && !map.isEmpty()) {
                if (this.g == null) {
                    this.g = new a(this.c);
                }
                this.g.a(map, machInfo);
                Mach mach = this.c.b;
                mach.addRenderListener(this.g);
                if (this.e != null) {
                    try {
                        mach.initWithBundle(activity, this.d, this.e);
                        mach.render(map);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                com.meituan.android.ptcommonim.pageadapter.message.mach.c.a(machInfo.machId, machInfo.moduleId, machInfo.biz, new AnonymousClass1(mach, activity, map));
                return;
            }
            this.b.post(com.meituan.android.ptcommonim.pageadapter.widget.a.a(this));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements c.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Mach b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ Map d;

        public AnonymousClass1(Mach mach, Activity activity, Map map) {
            this.b = mach;
            this.c = activity;
            this.d = map;
        }

        @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.c.a
        @WorkerThread
        public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2133d8c58dfe862c902a4bd638b615f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2133d8c58dfe862c902a4bd638b615f4");
            } else {
                PTFrameMachContainer.this.b.post(com.meituan.android.ptcommonim.pageadapter.widget.b.a(this, eVar, this.b, this.c, this.d));
            }
        }

        @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.c.a
        @WorkerThread
        public final void a(@NonNull CacheException cacheException) {
            Object[] objArr = {cacheException};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b9c6fa37503d5780fa0028b4b90b33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b9c6fa37503d5780fa0028b4b90b33");
            } else {
                PTFrameMachContainer.this.b.post(c.a(this));
            }
        }
    }

    public static /* synthetic */ void a(PTFrameMachContainer pTFrameMachContainer) {
        Object[] objArr = {pTFrameMachContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc51604e69fb54fe5ac325d22471ceb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc51604e69fb54fe5ac325d22471ceb6");
        } else if (pTFrameMachContainer.f != null) {
            pTFrameMachContainer.f.a();
        }
    }
}
