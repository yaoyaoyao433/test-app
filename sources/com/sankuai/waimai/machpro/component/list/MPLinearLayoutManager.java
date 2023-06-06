package com.sankuai.waimai.machpro.component.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    b b;
    boolean c;
    private a d;
    private Map<String, Integer> e;
    private RecyclerView.m f;
    private boolean g;
    private int h;
    private SparseArray<String> i;
    private MPListComponent j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z);
    }

    public MPLinearLayoutManager(Context context, int i, boolean z, MPListComponent mPListComponent) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), mPListComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f569750a1bf7cba72a5d6c7784708a5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f569750a1bf7cba72a5d6c7784708a5d");
            return;
        }
        this.e = new HashMap();
        this.h = -1;
        this.i = new SparseArray<>();
        this.c = true;
        this.j = mPListComponent;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fcc47f41ec2c70f8f50b5be9bc49619", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fcc47f41ec2c70f8f50b5be9bc49619")).booleanValue();
        }
        if (this.c) {
            return super.canScrollVertically();
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe278d1f79ff90524af7c141ebb3460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe278d1f79ff90524af7c141ebb3460");
            return;
        }
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        this.e.put(b(getPosition(view)), Integer.valueOf(view.getHeight()));
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac43296e8368cdcd87282838ede7c26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac43296e8368cdcd87282838ede7c26");
            return;
        }
        if (this.f == null) {
            this.f = mVar;
        }
        super.onLayoutChildren(mVar, state);
    }

    public final int a(int i) {
        int i2;
        View b2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a1ab93f05a9684a54c9b3ad8ab239f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a1ab93f05a9684a54c9b3ad8ab239f")).intValue();
        }
        Integer c = c(i);
        if (c == null) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de4c5cc2ddcd4c60a4680475623b514a", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de4c5cc2ddcd4c60a4680475623b514a")).intValue();
            } else {
                i2 = -1;
                if (this.f != null && (b2 = this.f.b(i)) != null) {
                    measureChildWithMargins(b2, 0, 0);
                    i2 = getDecoratedMeasuredHeight(b2);
                    this.f.a(b2);
                }
            }
            c = Integer.valueOf(i2);
            this.e.put(b(i), c);
        }
        return c.intValue();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b38b82d22e114230500fee899f3bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b38b82d22e114230500fee899f3bcd");
        } else {
            this.i.clear();
        }
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab10315a00988a854791cd97895634a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab10315a00988a854791cd97895634a1");
        }
        String str = this.i.get(i);
        if (str == null) {
            str = this.j.a(i);
            if (str == null) {
                str = String.valueOf(i);
            }
            this.i.put(i, str);
        }
        return str;
    }

    private Integer c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e71e396b6cc0c995ea789c3ae30787", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e71e396b6cc0c995ea789c3ae30787") : this.e.get(b(i));
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3312615827f967b82250a696b534541", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3312615827f967b82250a696b534541")).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int i = -((int) findViewByPosition(findFirstVisibleItemPosition).getY());
            for (int i2 = 0; i2 < findFirstVisibleItemPosition; i2++) {
                Integer c = c(i2);
                if (c == null) {
                    c = 0;
                }
                i += c.intValue();
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2161b9b95e8488909e56f621003c9a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2161b9b95e8488909e56f621003c9a44");
            return;
        }
        if (this.d == null) {
            this.d = new a(recyclerView.getContext());
        }
        this.d.setTargetPosition(i);
        startSmoothScroll(this.d);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b86efeafe650a0e242686ff0d32924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b86efeafe650a0e242686ff0d32924");
            return;
        }
        super.onLayoutCompleted(state);
        if (this.g) {
            this.g = false;
            if (this.b != null) {
                this.b.a(true);
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73503638775401d52bdd901ee2207055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73503638775401d52bdd901ee2207055");
            return;
        }
        this.g = true;
        this.h = i;
        super.scrollToPositionWithOffset(i, 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends ad {
        public static ChangeQuickRedirect a;
        boolean b;

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return -1;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {MPLinearLayoutManager.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea54ef6688eb7a7bad71ee261b54a4ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea54ef6688eb7a7bad71ee261b54a4ce");
            }
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onStop() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46184166e38dc05a81a0aa96b6dc51c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46184166e38dc05a81a0aa96b6dc51c7");
                return;
            }
            super.onStop();
            if (this.b || MPLinearLayoutManager.this.b == null) {
                return;
            }
            MPLinearLayoutManager.this.b.a(true);
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ee323f94964fc56451bce15282fde7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ee323f94964fc56451bce15282fde7")).intValue();
            }
            if (this.b) {
                return ((i3 + i4) / 2) - ((i + i2) / 2);
            }
            return super.calculateDtToFit(i, i2, i3, i4, i5);
        }
    }
}
