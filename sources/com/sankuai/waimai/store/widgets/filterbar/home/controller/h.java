package com.sankuai.waimai.store.widgets.filterbar.home.controller;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.FilterBaseDataItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface h {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, int i2);

        void a(int i, int i2, List<String> list, List<FilterConditionResponse.FilterGroup> list2);

        void a(long j, List<SortItem> list);

        void a(BaseModuleDesc baseModuleDesc);

        void a(String str, boolean z);

        void a(List<String> list);

        void a(boolean z, String str, List<String> list, List<FilterConditionResponse.FilterGroup.FilterItem> list2);

        void b(long j, List<SGSortModel> list);

        void b(boolean z);

        void c(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract long a();

        public abstract void a(int i);

        public abstract void a(int i, long j, String str, int i2);

        public abstract void a(int i, boolean z);

        public abstract void a(int i, boolean z, String str, boolean z2, String str2, boolean z3);

        public abstract void a(long j);

        public abstract void a(long j, String str, int i, i.a aVar);

        public abstract void a(String str, String str2, FilterConditionResponse filterConditionResponse, i.a aVar);

        public abstract void a(boolean z);

        public abstract void b();

        public abstract void b(int i);

        @NonNull
        public abstract List<String> c();

        public abstract void c(int i);

        public abstract String d(int i);

        @NonNull
        public abstract List<FilterBaseDataItem> d();

        public abstract String e(int i);

        public abstract void e();

        public abstract String f();

        public abstract void g();

        public a(final b... bVarArr) {
            Object[] objArr = {bVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6482313227a242b87824f0b3de6c9f21", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6482313227a242b87824f0b3de6c9f21");
            } else {
                this.b = new b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(String str, boolean z) {
                        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b68ddec524050245c09e174a86b11ea4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b68ddec524050245c09e174a86b11ea4");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(str, z);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(long j, List<SortItem> list) {
                        Object[] objArr2 = {new Long(j), list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83ee4eebcebaeb311ea8eff79b28589e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83ee4eebcebaeb311ea8eff79b28589e");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(j, list);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void b(long j, List<SGSortModel> list) {
                        Object[] objArr2 = {new Long(j), list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7be5630105a5b679ae2a5ccf0b678a97", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7be5630105a5b679ae2a5ccf0b678a97");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.b(j, list);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void b(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "031ba60be1a0858eafdd69593b8ece48", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "031ba60be1a0858eafdd69593b8ece48");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.b(z);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(int i, int i2, List<String> list, List<FilterConditionResponse.FilterGroup> list2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), list, list2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c28250774b272755ffe4a8da6390f742", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c28250774b272755ffe4a8da6390f742");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(i, i2, list, list2);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2069137e5b37bc32ee55f8d9bd95869", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2069137e5b37bc32ee55f8d9bd95869");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(i, i2);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(boolean z, String str, List<String> list, List<FilterConditionResponse.FilterGroup.FilterItem> list2) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, list, list2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50a2c26db8765085d8429b28049d97b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50a2c26db8765085d8429b28049d97b0");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(z, str, list, list2);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(BaseModuleDesc baseModuleDesc) {
                        Object[] objArr2 = {baseModuleDesc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ce457a765ae2131cebb5fab58dc9753", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ce457a765ae2131cebb5fab58dc9753");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(baseModuleDesc);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void c(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd6ed5aac3ba67ed44d61f14961e0393", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd6ed5aac3ba67ed44d61f14961e0393");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.c(z);
                        }
                    }

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
                    public final void a(List<String> list) {
                        Object[] objArr2 = {list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fe87736ca078c07564b819df98c82d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fe87736ca078c07564b819df98c82d6");
                            return;
                        }
                        for (b bVar : bVarArr) {
                            bVar.a(list);
                        }
                    }
                };
            }
        }
    }
}
