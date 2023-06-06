package com.sankuai.waimai.pouch.mach.swiper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PouchSwiperContainer extends MachViewGroup {
    public static ChangeQuickRedirect a = null;
    private static final String g = "PouchSwiperContainer";
    public PouchSwiperView b;
    com.sankuai.waimai.mach.component.swiper.a c;
    com.sankuai.waimai.pouch.mach.swiper.b d;
    public ScaleLayoutManager e;
    public b f;
    private a h;
    private boolean i;
    private com.sankuai.waimai.mach.component.swiper.recyclerview.c j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void b(int i);
    }

    public static /* synthetic */ boolean a(PouchSwiperContainer pouchSwiperContainer, boolean z) {
        pouchSwiperContainer.i = false;
        return false;
    }

    public void setIndexChangedListener(a aVar) {
        this.h = aVar;
    }

    public PouchSwiperContainer(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7630c04bbb53cf1fa736d745a21e92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7630c04bbb53cf1fa736d745a21e92");
        }
    }

    private PouchSwiperContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc0595217841bef0d90afc067a29417d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc0595217841bef0d90afc067a29417d");
        }
    }

    public PouchSwiperContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4142ee165f7e0480073df099f2bdbb0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4142ee165f7e0480073df099f2bdbb0a");
            return;
        }
        this.i = true;
        this.j = new com.sankuai.waimai.mach.component.swiper.recyclerview.c() { // from class: com.sankuai.waimai.pouch.mach.swiper.PouchSwiperContainer.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.c, com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "116deb2346f0c0270caa03b5accb48cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "116deb2346f0c0270caa03b5accb48cd");
                } else if (PouchSwiperContainer.this.i) {
                    int i3 = PouchSwiperContainer.this.d.g;
                    if (i3 != 0) {
                        PouchSwiperContainer.this.a(i3);
                    }
                    PouchSwiperContainer.a(PouchSwiperContainer.this, false);
                }
            }
        };
        this.f = new b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2232ab57c5ffad4436daa31a562a3fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2232ab57c5ffad4436daa31a562a3fcd");
            return;
        }
        this.b = new PouchSwiperView(getContext());
        this.b.setNestedScrollingEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setClipChildren(false);
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c890dbe23422ec037ebb654d0b485abe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c890dbe23422ec037ebb654d0b485abe")).intValue();
        }
        if (this.c != null) {
            return this.c.getItemCount();
        }
        return 0;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "546e760e63e2fe9aa230ef5c63763b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "546e760e63e2fe9aa230ef5c63763b2f");
            return;
        }
        if (this.b != null) {
            this.b.addOnScrollListener(this.f);
        }
        if (this.e != null) {
            this.e.m = this.j;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c0df8fdedfad677985abb8e754a71e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c0df8fdedfad677985abb8e754a71e");
        } else if (i < 0) {
        } else {
            if (this.b != null) {
                this.b.a(i);
            }
            if (this.h != null) {
                this.h.b(i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.k {
        public static ChangeQuickRedirect a;
        private int c;

        public b() {
            Object[] objArr = {PouchSwiperContainer.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e3cac390637f6616031882a72831ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e3cac390637f6616031882a72831ee");
            } else {
                this.c = -1;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84356d441ecd1f90647e653249d3dcd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84356d441ecd1f90647e653249d3dcd");
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (PouchSwiperContainer.this.e != null) {
                int f = PouchSwiperContainer.this.e.f();
                if (this.c != f && PouchSwiperContainer.this.h != null) {
                    PouchSwiperContainer.this.h.b(f);
                }
                this.c = f;
            }
        }
    }
}
