package com.meituan.android.ptcommonim.pageadapter.message.item;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.view.View;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.c;
import com.meituan.android.ptcommonim.pageadapter.message.view.PTIMMachRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b extends com.meituan.android.ptcommonim.pageadapter.message.item.a {
    public static ChangeQuickRedirect a;
    final Context b;
    final com.meituan.android.ptcommonim.pageadapter.message.utils.b c;
    protected final com.sankuai.xm.imui.session.entity.b<GeneralMessage> d;
    protected final Map<String, Object> j;
    public final com.meituan.android.ptcommonim.pageadapter.message.mach.f k;
    final Handler l;
    volatile com.sankuai.waimai.mach.manager.cache.e m;
    public PTIMMachRootView n;
    public a o;
    protected final com.meituan.android.ptcommonim.pageadapter.message.mach.d p;
    protected Boolean q;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public int b;
    }

    public abstract int a(Map<String, Object> map, int i);

    public abstract MachInfo a(GeneralMessage generalMessage, boolean z);

    public b(Context context, com.meituan.android.ptcommonim.pageadapter.message.mach.f fVar, com.meituan.android.ptcommonim.pageadapter.message.utils.b bVar, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar2, Map<String, Object> map) {
        Object[] objArr = {context, fVar, bVar, bVar2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617f9b4d994b44e8dedf2bd914d74a61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617f9b4d994b44e8dedf2bd914d74a61");
            return;
        }
        this.q = Boolean.TRUE;
        this.b = context;
        this.l = new Handler(this.b.getMainLooper());
        this.c = bVar;
        this.k = fVar;
        this.d = bVar2;
        this.j = map;
        this.p = new com.meituan.android.ptcommonim.pageadapter.message.mach.d(this.k) { // from class: com.meituan.android.ptcommonim.pageadapter.message.item.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.d, com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "702380fc34a8aaa718535c4e33974a03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "702380fc34a8aaa718535c4e33974a03");
                    return;
                }
                super.a(aVar);
                if ("pt-im-guider-tip-card".equals(this.d.machId)) {
                    b.this.n.a(-1, -2);
                } else {
                    a aVar2 = b.this.o;
                    if (aVar2 != null && aVar != null && aVar2.a == aVar.s() && aVar2.b == aVar.t()) {
                        return;
                    }
                    b bVar3 = b.this;
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar3, changeQuickRedirect3, false, "235447332d4ee6f09309ad8b34805ade", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar3, changeQuickRedirect3, false, "235447332d4ee6f09309ad8b34805ade");
                    } else if (aVar != null) {
                        bVar3.o = new a();
                        bVar3.o.a = aVar.s();
                        bVar3.o.b = aVar.t();
                    }
                    if (b.this.n != null) {
                        b.this.n.a(-1, b.this.o.b);
                    }
                }
                b.this.c.a(b.this.d.a().getMsgUuid(), b.this);
            }

            @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.d, com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c1602c0e2668113218ee85e1ea111ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c1602c0e2668113218ee85e1ea111ee");
                    return;
                }
                super.a();
                MachInfo machInfo = this.d;
                if (b.this.q.booleanValue() && "pt-im-guider-tip-card".equals(machInfo.machId)) {
                    b.this.q = Boolean.FALSE;
                    SessionFragment a2 = com.sankuai.xm.imui.session.b.a(b.this.b);
                    if (a2 != null) {
                        a2.y();
                    }
                }
            }
        };
    }

    public final void a(PTIMMachRootView pTIMMachRootView) {
        Activity activity;
        SessionFragment a2;
        int a3;
        Object[] objArr = {pTIMMachRootView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a0d112358fef7e7e48ef67c720f2af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a0d112358fef7e7e48ef67c720f2af2");
            return;
        }
        this.h = true;
        this.n = pTIMMachRootView;
        PTIMMachRootView pTIMMachRootView2 = this.n;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = PTIMMachRootView.a;
        if (PatchProxy.isSupport(objArr2, pTIMMachRootView2, changeQuickRedirect2, false, "bd69a9eafa6de0e19d1c98163de6e2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pTIMMachRootView2, changeQuickRedirect2, false, "bd69a9eafa6de0e19d1c98163de6e2fd");
        } else {
            pTIMMachRootView2.c = this;
            pTIMMachRootView2.b.b = this;
        }
        this.n.setVisibility(0);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6b8ee9c16623e9bdfb4a270ff0e6ed7", RobustBitConfig.DEFAULT_VALUE)) {
            activity = (Activity) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6b8ee9c16623e9bdfb4a270ff0e6ed7");
        } else {
            activity = (this.b == null || (a2 = com.sankuai.xm.imui.session.b.a(this.b)) == null) ? null : a2.getActivity();
        }
        Activity activity2 = activity;
        if (activity2 == null || activity2.isFinishing()) {
            return;
        }
        MachViewGroup machContainer = this.n.getMachContainer();
        this.n.setRetryListener(c.a(this, activity2, machContainer));
        Object[] objArr4 = {this.j, Integer.valueOf(this.d.a().getType())};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        int intValue = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6a72913baeeef75ce348bbf2b5069f1e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6a72913baeeef75ce348bbf2b5069f1e")).intValue() : -1;
        Map<String, Object> map = this.j;
        int type = this.d.a().getType();
        Object[] objArr5 = {map, Integer.valueOf(type)};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "29d1e7ab65cd62a7e75e21578f3a6f59", RobustBitConfig.DEFAULT_VALUE)) {
            a3 = ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "29d1e7ab65cd62a7e75e21578f3a6f59")).intValue();
        } else if (this.o != null) {
            a3 = this.o.b;
        } else {
            a3 = a(map, type);
        }
        this.n.a(intValue, a3);
        a(activity2, machContainer, false);
    }

    public static /* synthetic */ void a(b bVar, Activity activity, MachViewGroup machViewGroup, View view) {
        Object[] objArr = {bVar, activity, machViewGroup, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f5cc17fe4b16c900262530afe0e331f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f5cc17fe4b16c900262530afe0e331f");
        } else {
            bVar.a(activity, machViewGroup, true);
        }
    }

    private void a(Activity activity, MachViewGroup machViewGroup, boolean z) {
        Object[] objArr = {activity, machViewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0d110c1889a6953700bde6ad82dfb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0d110c1889a6953700bde6ad82dfb6");
            return;
        }
        Mach mach = this.k.b;
        mach.removeRenderListener(this.p);
        mach.addRenderListener(this.p);
        if (this.m != null) {
            this.p.a(this.j, (MachInfo) null);
            try {
                mach.initWithBundle(activity, machViewGroup, this.m);
                mach.render(this.j);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        MachInfo a2 = a(this.d.a(), z);
        if (a2 != null && a2.isValid()) {
            this.p.a(this.j, a2);
            com.meituan.android.ptcommonim.pageadapter.message.mach.c.a(a2.machId, a2.moduleId, a2.biz, new AnonymousClass2(mach, activity, machViewGroup));
            return;
        }
        this.n.a(-1);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.pageadapter.message.item.b$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements c.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Mach b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ MachViewGroup d;

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15807a11f04a357221a19c4a0975b962", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15807a11f04a357221a19c4a0975b962");
            } else {
                b.this.l.post(d.a(this, eVar, this.b, this.c, this.d));
            }
        }

        public static /* synthetic */ void a(AnonymousClass2 anonymousClass2, com.sankuai.waimai.mach.manager.cache.e eVar, Mach mach, Activity activity, MachViewGroup machViewGroup) {
            Object[] objArr = {anonymousClass2, eVar, mach, activity, machViewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5724ffd2e2df6e08216b4a252a3dbf76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5724ffd2e2df6e08216b4a252a3dbf76");
                return;
            }
            try {
                b.this.m = eVar;
                PTIMMachRootView pTIMMachRootView = b.this.n;
                mach.initWithBundle(activity, machViewGroup, eVar);
                mach.render(b.this.j);
                if (pTIMMachRootView == null || !b.this.h) {
                    return;
                }
                pTIMMachRootView.a(0);
            } catch (Throwable unused) {
            }
        }

        @Override // com.meituan.android.ptcommonim.pageadapter.message.mach.c.a
        @WorkerThread
        public final void a(@NonNull CacheException cacheException) {
            Object[] objArr = {cacheException};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52674c77fc9dd32031a902c7100b1d99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52674c77fc9dd32031a902c7100b1d99");
            } else {
                b.this.l.post(e.a(this));
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c653c7e3bd5c271cda30053018d7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c653c7e3bd5c271cda30053018d7e9");
            return;
        }
        this.h = false;
        if (this.n != null) {
            PTIMMachRootView pTIMMachRootView = this.n;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = PTIMMachRootView.a;
            if (PatchProxy.isSupport(objArr2, pTIMMachRootView, changeQuickRedirect2, false, "0a8e52d9e41680d153ab86a95d24cee9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pTIMMachRootView, changeQuickRedirect2, false, "0a8e52d9e41680d153ab86a95d24cee9");
            } else if (pTIMMachRootView.c == this) {
                pTIMMachRootView.a(0);
                pTIMMachRootView.setRetryListener(null);
                pTIMMachRootView.c = null;
                pTIMMachRootView.b.b = null;
            }
        }
        this.k.b.removeRenderListener(this.p);
        this.n = null;
    }

    public final Map<String, Object> c() {
        return this.j;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b149c5df21cdeb19c3455de378eb35c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b149c5df21cdeb19c3455de378eb35c");
        } else if (this.k != null) {
            this.k.a();
        }
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.a
    public final /* bridge */ /* synthetic */ View a() {
        return this.n;
    }
}
