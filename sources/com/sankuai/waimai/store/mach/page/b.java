package com.sankuai.waimai.store.mach.page;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.mach.page.d;
import com.sankuai.waimai.store.mach.page.mach.MachCommonData;
import com.sankuai.waimai.store.mach.page.widget.SlidingTabLayout;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.MachBackgroundConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mach.page.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1220b {
        void a(int i, Object obj);

        void a(int i, String str);

        void a(d<d.a> dVar, d<MachCommonData> dVar2, MachBackgroundConfig machBackgroundConfig, List<d<MachCommonData>> list, List<d<MachCommonData>> list2, boolean z, boolean z2);

        void a(Poi.PoiCouponItem poiCouponItem);

        void a(String str, int i);

        void a(List<d<MachCommonData>> list, boolean z);

        void a(boolean z);

        void b(List<d<MachCommonData>> list, boolean z);

        void bA_();

        void bz_();

        SlidingTabLayout e();

        SCBaseActivity n();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected InterfaceC1220b b;

        public abstract void a();

        public abstract void a(int i);

        public abstract void b();

        public abstract String c();

        public abstract void d();

        public abstract void e();

        public abstract long f();

        public abstract long g();

        public abstract boolean h();

        public a(InterfaceC1220b interfaceC1220b) {
            Object[] objArr = {interfaceC1220b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12b58ba650092dcd9e541da1b0482d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12b58ba650092dcd9e541da1b0482d4");
            } else {
                this.b = interfaceC1220b;
            }
        }
    }
}
