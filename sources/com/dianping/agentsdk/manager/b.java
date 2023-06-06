package com.dianping.agentsdk.manager;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.an;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.i;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.dianping.shield.adapter.MergeAdapterTypeRefreshListener;
import com.dianping.shield.adapter.TopPositionAdapter;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface;
import com.dianping.shield.consts.ShieldConst;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ExposedDetails;
import com.dianping.shield.entity.ExposedInfo;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ScrollScope;
import com.dianping.shield.entity.SectionTitleInfo;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.ExposeScreenLoadedInterface;
import com.dianping.shield.feature.HotZoneItemListener;
import com.dianping.shield.feature.HotZoneObserverInterface;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.feature.RecyclerPoolSizeInterface;
import com.dianping.shield.feature.ScrollToTopOffsetInterface;
import com.dianping.shield.feature.TopPositionInterface;
import com.dianping.shield.framework.PageContainerLayoutModeInterface;
import com.dianping.shield.layoutmanager.CoveredYInterface;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedStep;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration;
import com.dianping.shield.utils.ExposedEngine;
import com.dianping.shield.utils.HotZoneEngine;
import com.dianping.shield.utils.HotZoneItemEngine;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements an<RecyclerView>, MergeAdapterTypeRefreshListener, CellManagerCommonFunctionInterface, ExposeScreenLoadedInterface {
    public static ChangeQuickRedirect a;
    public static final Handler b = new Handler(Looper.getMainLooper());
    protected static final Comparator<i> c = new Comparator<i>() { // from class: com.dianping.agentsdk.manager.b.1
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(i iVar, i iVar2) {
            i iVar3 = iVar;
            i iVar4 = iVar2;
            Object[] objArr = {iVar3, iVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df0cee19e220a85895803fddeced7aa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df0cee19e220a85895803fddeced7aa")).intValue() : iVar3.b.getIndex().equals(iVar4.b.getIndex()) ? iVar3.d.compareTo(iVar4.d) : iVar3.b.getIndex().compareTo(iVar4.b.getIndex());
        }
    };
    protected boolean A;
    protected AgentInterface B;
    protected boolean C;
    protected ar D;
    protected ShieldGAInfo E;
    private PageContainerLayoutModeInterface F;
    private boolean G;
    private boolean H;
    private final Runnable I;
    private StaggeredGridSpaceDecoration J;
    protected final HashMap<String, i> d;
    protected com.dianping.agentsdk.manager.a e;
    protected ArrayList<i> f;
    protected ArrayList<ArrayList<i>> g;
    protected Context h;
    protected RecyclerView i;
    protected RecyclerView.LayoutManager j;
    protected ShieldLayoutManagerInterface k;
    protected com.dianping.agentsdk.sectionrecycler.section.b l;
    protected boolean m;
    protected RecyclerView.k n;
    protected RecyclerView.k o;
    protected RecyclerView.k p;
    protected boolean q;
    protected Handler r;
    protected ExposedEngine s;
    protected LoadingAndLoadingMoreCreator t;
    protected Map<HotZoneObserverInterface, HotZoneEngine> u;
    protected ArrayList<HotZoneEngine> v;
    protected Map<HotZoneItemListener, HotZoneItemEngine> w;
    protected ArrayList<HotZoneItemEngine> x;
    protected ArrayList<SectionTitleInfo> y;
    protected ArrayList<String> z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public AgentInterface a;
        public int b;
        public int c;
        public CellType d;
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    @NotNull
    public ShieldSectionCellItem convertCellInterfaceToItem(@NotNull af afVar) {
        return null;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.G = false;
        return false;
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.H = false;
        return false;
    }

    @Override // com.dianping.agentsdk.framework.j
    public /* synthetic */ void setAgentContainerView(ViewGroup viewGroup) {
        RecyclerView recyclerView = (RecyclerView) viewGroup;
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d7a87a81d24686755be4e3df9d483e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d7a87a81d24686755be4e3df9d483e");
        } else if (recyclerView != null) {
            this.i = recyclerView;
            this.j = this.i.getLayoutManager();
            if (this.j instanceof ShieldLayoutManagerInterface) {
                this.k = (ShieldLayoutManagerInterface) this.j;
            } else if (this.j == null || "android.support.v7.widget.LinearLayoutManager".equals(this.j.getClass().getCanonicalName())) {
                LinearLayoutManagerWithSmoothOffset linearLayoutManagerWithSmoothOffset = new LinearLayoutManagerWithSmoothOffset(this.h);
                linearLayoutManagerWithSmoothOffset.setOrientation(1);
                this.i.setLayoutManager(linearLayoutManagerWithSmoothOffset);
                this.j = linearLayoutManagerWithSmoothOffset;
                this.k = linearLayoutManagerWithSmoothOffset;
            }
            this.i.setAdapter(this.l);
            if (this.q) {
                this.i.removeOnScrollListener(this.n);
                this.i.addOnScrollListener(this.n);
            }
            this.i.addOnScrollListener(this.p);
            this.i.addOnScrollListener(this.o);
            if (this.l != null && (this.j instanceof CoveredYInterface)) {
                this.l.setCoveredYInterface((CoveredYInterface) this.j);
            }
            if (!(this.j instanceof TopLinearLayoutManager) || this.l == null) {
                return;
            }
            ((TopLinearLayoutManager) this.j).addOnViewTopStateChangeListener(this.l);
        }
    }

    public b(Context context) {
        this(context, false);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf57d6a4fc5c83a7eaa1f851303e8aa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf57d6a4fc5c83a7eaa1f851303e8aa1");
        }
    }

    public b(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfcaa7e0e7dc54e769a18e66d9fea760", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfcaa7e0e7dc54e769a18e66d9fea760");
            return;
        }
        this.d = new LinkedHashMap();
        this.r = new Handler();
        this.s = new ExposedEngine();
        this.u = new LinkedHashMap();
        this.v = new ArrayList<>();
        this.w = new LinkedHashMap();
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.z = new ArrayList<>();
        this.A = true;
        this.C = false;
        this.G = false;
        this.H = false;
        this.I = new Runnable() { // from class: com.dianping.agentsdk.manager.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e01c248d2bf9ea8fb2b202e8f32b047", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e01c248d2bf9ea8fb2b202e8f32b047");
                    return;
                }
                b.b.removeCallbacks(this);
                b.this.b();
            }
        };
        this.h = context;
        this.m = z;
        this.l = new com.dianping.agentsdk.sectionrecycler.section.b(context);
        this.l.setHasStableIds(z);
        this.l.g = this;
        this.l.h = new b.e() { // from class: com.dianping.agentsdk.manager.b.3
            public static ChangeQuickRedirect a;

            @Override // com.dianping.agentsdk.sectionrecycler.section.b.e
            public final void a(SparseArray<TopPositionAdapter.TopInfo> sparseArray) {
                int i;
                int i2;
                Object[] objArr2 = {sparseArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfefb42dec832e349663557d2b7185ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfefb42dec832e349663557d2b7185ea");
                } else if (b.this.j instanceof TopLinearLayoutManager) {
                    int headerCount = b.this.i instanceof ShieldRecyclerViewInterface ? ((ShieldRecyclerViewInterface) b.this.i).getHeaderCount() : 0;
                    TopLinearLayoutManager topLinearLayoutManager = (TopLinearLayoutManager) b.this.j;
                    topLinearLayoutManager.clearTopPosition();
                    if (sparseArray == null || sparseArray.size() == 0) {
                        return;
                    }
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        int keyAt = sparseArray.keyAt(i3) + headerCount;
                        TopPositionAdapter.TopInfo valueAt = sparseArray.valueAt(i3);
                        if (valueAt != null) {
                            int i4 = valueAt.start == TopPositionInterface.AutoStartTop.ALWAYS ? 0 : keyAt;
                            if (valueAt.end == TopPositionInterface.AutoStopTop.MODULE) {
                                i2 = valueAt.moduleEnd + headerCount;
                            } else if (valueAt.end == TopPositionInterface.AutoStopTop.SECTION) {
                                i2 = valueAt.sectionEnd + headerCount;
                            } else {
                                i = valueAt.end == TopPositionInterface.AutoStopTop.CELL ? keyAt : Integer.MAX_VALUE;
                                topLinearLayoutManager.addTopPosition(keyAt, i4, i, valueAt.offset, valueAt.zPosition);
                            }
                            i = i2;
                            topLinearLayoutManager.addTopPosition(keyAt, i4, i, valueAt.offset, valueAt.zPosition);
                        }
                    }
                }
            }
        };
        if (this.j instanceof CoveredYInterface) {
            this.l.setCoveredYInterface((CoveredYInterface) this.j);
        }
        this.e = new com.dianping.agentsdk.manager.a();
        this.o = new RecyclerView.k() { // from class: com.dianping.agentsdk.manager.b.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "357a524d2fedb07b9abc891e88cba8e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "357a524d2fedb07b9abc891e88cba8e7");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (b.this.B != null && b.this.A && i == 1) {
                    b.this.A = false;
                }
            }
        };
        this.n = new RecyclerView.k() { // from class: com.dianping.agentsdk.manager.b.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce7535d4cb2bff05492792c05be823e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce7535d4cb2bff05492792c05be823e3");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (b.this.G && i == 0) {
                    b.this.resumeExpose();
                    b.a(b.this, false);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4deecb54c204a84333fb880bbe9a31ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4deecb54c204a84333fb880bbe9a31ca");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (i2 > 0) {
                    b.this.a(ScrollDirection.UP);
                } else if (i2 < 0) {
                    b.this.a(ScrollDirection.DOWN);
                } else {
                    b.this.a(ScrollDirection.STATIC);
                }
            }
        };
        this.p = new RecyclerView.k() { // from class: com.dianping.agentsdk.manager.b.6
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc937a06152c5744cbb45c4fc97e0add", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc937a06152c5744cbb45c4fc97e0add");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (b.this.H && i == 0) {
                    Iterator<HotZoneEngine> it = b.this.v.iterator();
                    while (it.hasNext()) {
                        it.next().scroll(ScrollDirection.STATIC, recyclerView, b.this.l);
                    }
                    Iterator<HotZoneItemEngine> it2 = b.this.x.iterator();
                    while (it2.hasNext()) {
                        it2.next().scroll(ScrollDirection.STATIC, recyclerView, b.this.l);
                    }
                    b.b(b.this, false);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fea742a9a04c1925e6c1aa27c57377af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fea742a9a04c1925e6c1aa27c57377af");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (b.this.H) {
                    return;
                }
                Iterator<HotZoneEngine> it = b.this.v.iterator();
                while (it.hasNext()) {
                    HotZoneEngine next = it.next();
                    if (i2 > 0) {
                        next.scroll(ScrollDirection.UP, recyclerView, b.this.l);
                    } else if (i2 < 0) {
                        next.scroll(ScrollDirection.DOWN, recyclerView, b.this.l);
                    }
                }
                Iterator<HotZoneItemEngine> it2 = b.this.x.iterator();
                while (it2.hasNext()) {
                    HotZoneItemEngine next2 = it2.next();
                    if (i2 > 0) {
                        next2.scroll(ScrollDirection.UP, recyclerView, b.this.l);
                    } else if (i2 < 0) {
                        next2.scroll(ScrollDirection.DOWN, recyclerView, b.this.l);
                    }
                }
            }
        };
    }

    public final void a(ar arVar) {
        this.D = arVar;
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setPageName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf9e131217c13784bf011f1f6775ab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf9e131217c13784bf011f1f6775ab5");
        } else if (this.l != null) {
            this.l.f = str;
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setShieldGAInfo(@NotNull ShieldGAInfo shieldGAInfo) {
        this.E = shieldGAInfo;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9850c72a9c608ed353c91627ae0e35d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9850c72a9c608ed353c91627ae0e35d");
        } else {
            this.l.setEnableDivider(z);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf848b8fef8f851ee5afad8944cba713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf848b8fef8f851ee5afad8944cba713");
            return;
        }
        this.l.setDefaultOffset(f);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@ setDefaultLeftOffset to" + f, new Object[0]);
        }
    }

    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e44788c703d73c68095437074478a5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e44788c703d73c68095437074478a5e");
            return;
        }
        this.l.setDefaultSpaceHight(f);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultSpaceHeight to" + f, new Object[0]);
        }
    }

    public final void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ce698dcd8cf4a605661a9672c9a97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ce698dcd8cf4a605661a9672c9a97b");
            return;
        }
        this.l.setDefaultSpaceDrawable(drawable);
        if (!ShieldEnvironment.INSTANCE.isDebug() || drawable == null) {
            return;
        }
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultSpaceDrawable to" + drawable.toString(), new Object[0]);
    }

    public final void b(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58bde4a3b37af7c7c6443b2f0697f56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58bde4a3b37af7c7c6443b2f0697f56");
            return;
        }
        this.l.setDefaultHeaderDrawable(drawable);
        if (!ShieldEnvironment.INSTANCE.isDebug() || drawable == null) {
            return;
        }
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultHeaderBackgroundColor to" + drawable.toString(), new Object[0]);
    }

    public final void c(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c9a8057a2a8916c1df811bb5d94abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c9a8057a2a8916c1df811bb5d94abe");
            return;
        }
        this.l.setDefaultFooterDrawable(drawable);
        if (!ShieldEnvironment.INSTANCE.isDebug() || drawable == null) {
            return;
        }
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultFooterBackgroundColor to" + drawable.toString(), new Object[0]);
    }

    public final void d(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccac93b1d72e449ae0b7654382185112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccac93b1d72e449ae0b7654382185112");
            return;
        }
        this.l.setDefaultDivider(drawable);
        if (!ShieldEnvironment.INSTANCE.isDebug() || drawable == null) {
            return;
        }
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultDivider to" + drawable.toString(), new Object[0]);
    }

    public final void e(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62fd02f5268b2e9cf656d01c3981adda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62fd02f5268b2e9cf656d01c3981adda");
            return;
        }
        this.l.setDefaultSectionDivider(drawable);
        if (!ShieldEnvironment.INSTANCE.isDebug() || drawable == null) {
            return;
        }
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultSectionDivider to" + drawable.toString(), new Object[0]);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adc5de54b1c65760148d19e4c54947b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adc5de54b1c65760148d19e4c54947b7");
            return;
        }
        this.l.setBottomFooterDividerDecoration(z);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@setBottomFooterDivider to" + z, new Object[0]);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9414e74bacb888cbe45c94ba62f783f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9414e74bacb888cbe45c94ba62f783f");
            return;
        }
        this.l.setSectionGapMode(z);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@setSectionGapMode to" + z, new Object[0]);
        }
    }

    public final void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ba7096c977326a3ce1be52b6cf4b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ba7096c977326a3ce1be52b6cf4b5c");
            return;
        }
        this.l.setDefaultRightOffset(f);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@setDefaultRightOffset to" + f, new Object[0]);
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setDisableDecoration(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac4b5d32d94e0bb7b1d959357f4ecf02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac4b5d32d94e0bb7b1d959357f4ecf02");
            return;
        }
        this.l.setDisableDecoration(z);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@setDisableDecoration to" + z, new Object[0]);
        }
    }

    public final void a(LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.t = loadingAndLoadingMoreCreator;
    }

    public final void a(HotZoneObserverInterface hotZoneObserverInterface, String str) {
        Object[] objArr = {hotZoneObserverInterface, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be4284ddbb61f0f04c8026c8c0264d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be4284ddbb61f0f04c8026c8c0264d9");
        } else if (this.i != null && this.u.get(hotZoneObserverInterface) == null) {
            HotZoneEngine hotZoneEngine = new HotZoneEngine();
            hotZoneEngine.setHotZoneObserverInterface(hotZoneObserverInterface, str);
            this.u.put(hotZoneObserverInterface, hotZoneEngine);
            this.v.add(hotZoneEngine);
        }
    }

    public final void a(HotZoneObserverInterface hotZoneObserverInterface) {
        HotZoneEngine hotZoneEngine;
        Object[] objArr = {hotZoneObserverInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810ff87d466cc09ecd55c9b892c8d800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810ff87d466cc09ecd55c9b892c8d800");
        } else if (this.i == null || (hotZoneEngine = this.u.get(hotZoneObserverInterface)) == null) {
        } else {
            this.v.remove(hotZoneEngine);
            this.u.remove(hotZoneObserverInterface);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a76129cb7dba830a697eb3caebcac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a76129cb7dba830a697eb3caebcac0");
            return;
        }
        Iterator<HotZoneEngine> it = this.v.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    public final void b() {
        com.dianping.agentsdk.adapter.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4c9f2bba5cd7f9e8cccb940d992d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4c9f2bba5cd7f9e8cccb940d992d6f");
            return;
        }
        this.f = new ArrayList<>(this.d.values());
        Collections.sort(this.f, c);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8964643912b001a967e9b7b8341d5a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8964643912b001a967e9b7b8341d5a3d");
        } else {
            com.dianping.agentsdk.sectionrecycler.section.b bVar2 = this.l;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.agentsdk.sectionrecycler.section.b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "d5786e92bbcd66062f164e1065c32577", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "d5786e92bbcd66062f164e1065c32577");
            } else {
                bVar2.a(true);
            }
            this.e.a();
        }
        this.g = new ArrayList<>();
        ArrayList<i> arrayList = new ArrayList<>();
        C0051b c0051b = null;
        Iterator<i> it = this.f.iterator();
        while (it.hasNext()) {
            i next = it.next();
            C0051b a2 = a(next.b.getIndex());
            if (c0051b == null) {
                arrayList = new ArrayList<>();
                arrayList.add(next);
            } else if (a(c0051b, a2)) {
                arrayList.add(next);
            } else {
                this.g.add(arrayList);
                arrayList = new ArrayList<>();
                arrayList.add(next);
            }
            c0051b = a2;
        }
        if (!arrayList.isEmpty()) {
            this.g.add(arrayList);
        }
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                if (this.g.get(i) != null) {
                    for (int i2 = 0; i2 < this.g.get(i).size(); i2++) {
                        if (this.g.get(i).get(i2) != null) {
                            try {
                                i iVar = this.g.get(i).get(i2);
                                iVar.i = com.dianping.agentsdk.utils.a.a(i, com.dianping.agentsdk.utils.a.a(this.g.size()));
                                iVar.j = com.dianping.agentsdk.utils.a.a(i2, com.dianping.agentsdk.utils.a.a(this.g.get(i).size()));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        if (!this.f.isEmpty()) {
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                i iVar2 = this.f.get(i3);
                if (iVar2.g != null) {
                    if (iVar2.g instanceof com.dianping.agentsdk.adapter.b) {
                        bVar = (com.dianping.agentsdk.adapter.b) iVar2.g;
                    } else {
                        bVar = new com.dianping.agentsdk.adapter.b(this.h, (c) iVar2.g, this.e);
                    }
                    this.e.a(bVar, i3, iVar2.i);
                    iVar2.g = bVar;
                    if (this.D != null) {
                        if (bVar.getItemCount() > 0) {
                            ar arVar = this.D;
                            arVar.a(ShieldConst.AGENT_VISIBILITY_KEY + iVar2.b.getHostName(), true);
                        } else {
                            ar arVar2 = this.D;
                            arVar2.a(ShieldConst.AGENT_VISIBILITY_KEY + iVar2.b.getHostName(), false);
                        }
                    }
                    e();
                    if ((iVar2.b.getSectionCellInterface() instanceof ScrollToTopOffsetInterface) && ((ScrollToTopOffsetInterface) iVar2.b.getSectionCellInterface()).needScrollToTop() && (!this.C || this.B == null)) {
                        this.B = iVar2.b;
                    }
                    Object[] objArr4 = {iVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f859084b18900df0f34be7a35e1376a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f859084b18900df0f34be7a35e1376a6");
                    } else if (iVar2.g != null && (iVar2.g instanceof c)) {
                        com.dianping.agentsdk.sectionrecycler.section.b bVar3 = this.l;
                        c cVar = (c) iVar2.g;
                        Object[] objArr5 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect5 = com.dianping.agentsdk.sectionrecycler.section.b.a;
                        if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "bafdd6fbe37b2c4cc5ac8f5f25a11333", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "bafdd6fbe37b2c4cc5ac8f5f25a11333");
                        } else {
                            Object[] objArr6 = {cVar, (byte) 1};
                            ChangeQuickRedirect changeQuickRedirect6 = com.dianping.agentsdk.sectionrecycler.section.b.a;
                            if (PatchProxy.isSupport(objArr6, bVar3, changeQuickRedirect6, false, "ef0a2e5e168e233f83c3e0409b831d08", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, bVar3, changeQuickRedirect6, false, "ef0a2e5e168e233f83c3e0409b831d08");
                            } else {
                                cVar.registerAdapterDataObserver(bVar3.e);
                                bVar3.d.add(cVar);
                                bVar3.a();
                                bVar3.notifyDataSetChanged();
                                bVar3.b();
                            }
                        }
                    }
                }
            }
        }
        this.l.notifyDataSetChanged();
        if (this.B != null && this.A) {
            a(this.B, 0, 0, 0, true, false);
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@CellUpdate@" + this.d.toString(), new Object[0]);
        }
        a(ScrollDirection.STATIC);
        f();
        if (this.E == null || this.E.getBusiness() == null) {
            return;
        }
        ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.getPageKey(this.E.getBusiness(), 2), ShieldSpeedStep.MF_STEP_NEED_RELOAD_TABLE_VIEW.getStep());
        ShieldSpeedMonitorUtil.INSTANCE.sendEvent(ShieldMonitorUtil.getPageKey(this.E.getBusiness(), 2));
    }

    @Override // com.dianping.agentsdk.framework.j
    public void setLayoutModeController(@Nullable PageContainerLayoutModeInterface pageContainerLayoutModeInterface) {
        this.F = pageContainerLayoutModeInterface;
    }

    @Override // com.dianping.agentsdk.framework.j
    public void notifyCellChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877f742d898b86b29d2543a6c2bf19ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877f742d898b86b29d2543a6c2bf19ce");
            return;
        }
        b.removeCallbacks(this.I);
        b.post(this.I);
    }

    private int a(AgentInterface agentInterface, int i, int i2) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f094541b620f8bd194daed84763f9a56", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f094541b620f8bd194daed84763f9a56")).intValue() : a(agentInterface, i, i2, true);
    }

    private int a(AgentInterface agentInterface, int i, int i2, boolean z) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2e59b7f525cf998544a517dbb61dcb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2e59b7f525cf998544a517dbb61dcb")).intValue();
        }
        i a2 = a(agentInterface);
        if (this.l == null || a2 == null || !(a2.g instanceof c)) {
            return -1;
        }
        return this.l.a((c) a2.g, i, i2, z);
    }

    private void a(AgentInterface agentInterface, int i, int i2, int i3, boolean z, boolean z2) {
        int a2;
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39ef5fdc8ff5c3360303b2b58119038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39ef5fdc8ff5c3360303b2b58119038");
        } else if (this.j == null || (a2 = a(agentInterface, i, i2)) < 0) {
        } else {
            if (z2) {
                pauseExpose();
                this.G = true;
            }
            this.H = true;
            if (z && (this.j instanceof e)) {
                this.k.scrollToPositionWithOffset(a2, ((e) this.j).getAutoOffset() + i3, false);
            } else {
                this.k.scrollToPositionWithOffset(a2, i3, false);
            }
        }
    }

    private void a(AgentInterface agentInterface, int i, int i2, int i3, boolean z, boolean z2, float f, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        int a2;
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73bbfe62275d84fcfb7e7f7b7f3e0d29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73bbfe62275d84fcfb7e7f7b7f3e0d29");
        } else if (this.j == null || (a2 = a(agentInterface, i, i2)) < 0) {
        } else {
            if (z2) {
                pauseExpose();
                this.G = true;
            }
            this.H = true;
            if (z && (this.j instanceof e)) {
                this.k.scrollToPositionWithOffset(a2, i3 + ((e) this.j).getAutoOffset(), true, f, arrayList);
            } else {
                this.k.scrollToPositionWithOffset(a2, i3, true, f, arrayList);
            }
        }
    }

    private void a(AgentInterface agentInterface, int i, int i2, boolean z, boolean z2, boolean z3, float f, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7119d91e77420750457350cc37cee256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7119d91e77420750457350cc37cee256");
        } else {
            a(a(agentInterface), i, i2, z, z2, z3, f, arrayList);
        }
    }

    private void a(i iVar, int i, int i2, boolean z, boolean z2, boolean z3, float f, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        int a2;
        Object[] objArr = {iVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46359f4f84f3f1809f1f2b90c72447ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46359f4f84f3f1809f1f2b90c72447ae");
        } else if (!(this.j instanceof LinearLayoutManagerWithSmoothOffset) || iVar == null || iVar.b == null || iVar.g == null || iVar.g.getItemCount() <= 0 || (a2 = a(iVar.b, i, 0, false)) < 0) {
        } else {
            if (z2) {
                pauseExpose();
                this.G = true;
            }
            this.H = true;
            if (z && (this.j instanceof e)) {
                this.k.scrollToPositionWithOffset(a2, i2 + ((e) this.j).getAutoOffset(), z3, f, arrayList);
            } else {
                this.k.scrollToPositionWithOffset(a2, i2, z3, f, arrayList);
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbff3d5a85f08e2bf5897c6595ace0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbff3d5a85f08e2bf5897c6595ace0e");
            return;
        }
        finishExpose();
        this.s.stopMoveStatusDispatch();
        this.s.clearMoveStatusMap();
        if (this.i != null) {
            this.i.removeOnScrollListener(this.p);
            this.u.clear();
            this.v.clear();
            this.w.clear();
            this.x.clear();
        }
        b.removeCallbacks(this.I);
    }

    public final void a(ScrollDirection scrollDirection) {
        int i;
        b.c a2;
        int autoOffset;
        int childAdapterPosition;
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd86fc1651463f60761282e9a835eb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd86fc1651463f60761282e9a835eb91");
        } else if (!this.q || this.j == null || this.l == null || this.k == null) {
        } else {
            int findFirstVisibleItemPosition = this.k.findFirstVisibleItemPosition(false);
            int findLastVisibleItemPosition = this.k.findLastVisibleItemPosition(false);
            int findFirstVisibleItemPosition2 = this.k.findFirstVisibleItemPosition(true);
            int findLastVisibleItemPosition2 = this.k.findLastVisibleItemPosition(true);
            if (!(this.j instanceof e) || (autoOffset = ((e) this.j).getAutoOffset()) <= 0) {
                i = findFirstVisibleItemPosition;
            } else {
                i = findFirstVisibleItemPosition;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.i.getChildCount()) {
                        break;
                    }
                    View childAt = this.i.getChildAt(i2);
                    if (childAt != null) {
                        if (this.i instanceof ShieldRecyclerViewInterface) {
                            childAdapterPosition = ((ShieldRecyclerViewInterface) this.i).getShieldChildAdapterPosition(childAt);
                        } else {
                            childAdapterPosition = this.i.getChildAdapterPosition(childAt);
                        }
                        if (childAdapterPosition >= i) {
                            Rect rect = new Rect();
                            childAt.getHitRect(rect);
                            if (rect.bottom <= autoOffset) {
                                continue;
                            } else if (rect.top < autoOffset) {
                                i = childAdapterPosition;
                            } else if (rect.top > autoOffset) {
                                findFirstVisibleItemPosition2 = childAdapterPosition;
                            } else {
                                findFirstVisibleItemPosition2 = childAdapterPosition;
                                i = findFirstVisibleItemPosition2;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
            }
            int i3 = (findLastVisibleItemPosition - i) + 2;
            if (i3 <= 0) {
                return;
            }
            ArrayList<ExposedInfo> arrayList = new ArrayList<>(i3);
            while (i <= findLastVisibleItemPosition) {
                Pair<Integer, Integer> sectionIndex = this.l.getSectionIndex(i);
                if (sectionIndex != null && (a2 = this.l.a(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue())) != null && !this.l.a(a2.b).isDestoryed()) {
                    ExposedInfo exposedInfo = new ExposedInfo();
                    exposedInfo.owner = this.l.a(a2.b);
                    exposedInfo.details = new ExposedDetails();
                    exposedInfo.details.isComplete = false;
                    exposedInfo.details.section = a2.c;
                    exposedInfo.details.row = a2.d;
                    exposedInfo.details.cellType = exposedInfo.owner.getCellType(exposedInfo.details.section, exposedInfo.details.row);
                    if (i >= findFirstVisibleItemPosition2 && i <= findLastVisibleItemPosition2) {
                        exposedInfo.details.isComplete = true;
                    }
                    arrayList.add(exposedInfo);
                }
                i++;
            }
            this.s.updateExposedSections(arrayList, scrollDirection);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void startExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafe81f6866dddad83fbef5436b6ee7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafe81f6866dddad83fbef5436b6ee7a");
            return;
        }
        this.q = true;
        a(ScrollDirection.STATIC);
        if (this.i != null) {
            this.i.removeOnScrollListener(this.n);
            this.i.addOnScrollListener(this.n);
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@StartExpose", new Object[0]);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void startExpose(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0377b81493dbc778736bafacbc32267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0377b81493dbc778736bafacbc32267");
        } else {
            this.r.postDelayed(new Runnable() { // from class: com.dianping.agentsdk.manager.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1afa91553528d56fda2cad611698b1c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1afa91553528d56fda2cad611698b1c3");
                        return;
                    }
                    b.this.r.removeCallbacks(this);
                    b.this.startExpose();
                }
            }, j);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void finishExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562f5d9d2979f340bebfb7874f2cb2b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562f5d9d2979f340bebfb7874f2cb2b2");
            return;
        }
        this.q = false;
        if (this.r != null) {
            this.r.removeCallbacksAndMessages(null);
        }
        if (this.i != null) {
            this.i.removeOnScrollListener(this.n);
        }
        if (this.s != null) {
            this.s.stopExposedDispatcher();
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@FinishExpose", new Object[0]);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void pauseExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9873b9b8cbc0c97b8034a72c0ff70355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9873b9b8cbc0c97b8034a72c0ff70355");
            return;
        }
        this.q = false;
        if (this.s != null) {
            this.s.pauseExposedDispatcher();
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@PauseExpose", new Object[0]);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void resumeExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313e87ca0ea7f7e883178b7cfc276555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313e87ca0ea7f7e883178b7cfc276555");
            return;
        }
        this.q = true;
        a(ScrollDirection.STATIC);
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.d("@PageName:" + this.h.toString() + "@ResumeExpose", new Object[0]);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void resetExposeSCI(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e9c93dacb8abbf65e7dc07edfc997a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e9c93dacb8abbf65e7dc07edfc997a");
            return;
        }
        ArrayList<ExposedInfo> arrayList = new ArrayList<>(this.s.getInnerInfos().size());
        Iterator<ExposedInfo> it = this.s.getInnerInfos().iterator();
        while (it.hasNext()) {
            ExposedInfo next = it.next();
            if (next.owner.getSectionCellInterface() != afVar) {
                arrayList.add(next);
            }
        }
        this.s.updateExposedSections(arrayList, ScrollDirection.STATIC);
        a(ScrollDirection.STATIC);
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void resetExposeRow(af afVar, int i, int i2) {
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91644d65a1d9ab79bbd5e45eb09da152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91644d65a1d9ab79bbd5e45eb09da152");
            return;
        }
        ArrayList<ExposedInfo> arrayList = new ArrayList<>(this.s.getInnerInfos().size());
        Iterator<ExposedInfo> it = this.s.getInnerInfos().iterator();
        while (it.hasNext()) {
            ExposedInfo next = it.next();
            if (next.owner.getSectionCellInterface() != afVar) {
                arrayList.add(next);
            } else {
                Pair<Integer, Integer> innerPosition = next.owner.getInnerPosition(next.details.section, next.details.row);
                if (((Integer) innerPosition.first).intValue() != i || ((Integer) innerPosition.second).intValue() != i2) {
                    arrayList.add(next);
                }
            }
        }
        this.s.updateExposedSections(arrayList, ScrollDirection.STATIC);
        a(ScrollDirection.STATIC);
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public void resetExposeExtraCell(af afVar, int i, CellType cellType) {
        Object[] objArr = {afVar, Integer.valueOf(i), cellType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4238c6150ac406f73bd81a942fb46f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4238c6150ac406f73bd81a942fb46f2");
            return;
        }
        ArrayList<ExposedInfo> arrayList = new ArrayList<>(this.s.getInnerInfos().size());
        Iterator<ExposedInfo> it = this.s.getInnerInfos().iterator();
        while (it.hasNext()) {
            ExposedInfo next = it.next();
            if (next.owner.getSectionCellInterface() != afVar) {
                arrayList.add(next);
            } else {
                CellType cellType2 = next.owner.getCellType(next.details.section, next.details.row);
                if (next.details.section != i || cellType2 != cellType) {
                    arrayList.add(next);
                }
            }
        }
        this.s.updateExposedSections(arrayList, ScrollDirection.STATIC);
        a(ScrollDirection.STATIC);
    }

    public final void b(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98eca26e47f8cf7b7b44e1635de59cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98eca26e47f8cf7b7b44e1635de59cb1");
        } else {
            this.s.dispatchAgentDisappearWithLifecycle(scrollDirection);
        }
    }

    public final void c(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63522d5ea13219fdb0f09a36453f1fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63522d5ea13219fdb0f09a36453f1fe3");
        } else {
            this.s.dispatchAgentAappearWithLifecycle(scrollDirection);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48827fa53a23492c7616a9bf39613e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48827fa53a23492c7616a9bf39613e2");
        } else {
            this.s.storeMoveStatusMap();
        }
    }

    @Override // com.dianping.agentsdk.framework.j
    public void updateAgentCell(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230e38467d9771c7a07a5ba60579b39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230e38467d9771c7a07a5ba60579b39d");
        } else {
            updateAgentCell(agentInterface, ap.UPDATE_ALL, 0, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0200 A[LOOP:1: B:57:0x01fa->B:59:0x0200, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.dianping.agentsdk.framework.an
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAgentCell(com.dianping.agentsdk.framework.AgentInterface r23, com.dianping.agentsdk.framework.ap r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.manager.b.updateAgentCell(com.dianping.agentsdk.framework.AgentInterface, com.dianping.agentsdk.framework.ap, int, int, int):void");
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2243727ddc167e826c60665a7aae1410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2243727ddc167e826c60665a7aae1410");
        } else if (this.D != null) {
            ArrayList<String> c2 = this.l.c();
            if (c2.size() == this.z.size() && c2.equals(this.z)) {
                return;
            }
            this.z = c2;
            this.D.a(ShieldConst.AGENT_VISIBILITY_LIST_KEY, (Serializable) c2);
        }
    }

    private void a(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55669ab996178d63f85c1ea67c38f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55669ab996178d63f85c1ea67c38f41");
        } else if (i != com.dianping.agentsdk.sectionrecycler.section.e.INDEX_NOT_EXIST && i2 > 0) {
            cVar.notifyItemRangeInserted(i, i2);
        } else {
            cVar.notifyDataSetChanged();
        }
    }

    private void b(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239dbfeebbfd56b18056a36a0d418171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239dbfeebbfd56b18056a36a0d418171");
        } else if (i != com.dianping.agentsdk.sectionrecycler.section.e.INDEX_NOT_EXIST && i2 > 0) {
            cVar.notifyItemRangeRemoved(i, i2);
        } else {
            cVar.notifyDataSetChanged();
        }
    }

    private void c(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "832a3fa2933d77b3ba057f522fd2929a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "832a3fa2933d77b3ba057f522fd2929a");
        } else if (i != com.dianping.agentsdk.sectionrecycler.section.e.INDEX_NOT_EXIST && i2 > 0) {
            cVar.notifyItemRangeChanged(i, i2);
        } else {
            cVar.notifyDataSetChanged();
        }
    }

    private int d(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2d7c6ceda63a372d2b70d80ee1243b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2d7c6ceda63a372d2b70d80ee1243b")).intValue();
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if (i5 >= 0 && i5 < cVar.getSectionCount()) {
                i3 += cVar.getRowCount(i5);
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e2, code lost:
        if ((r0 instanceof com.dianping.shield.feature.ExtraCellTopInterface) != false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.agentsdk.framework.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateCells(java.util.ArrayList<com.dianping.agentsdk.framework.AgentInterface> r17, java.util.ArrayList<com.dianping.agentsdk.framework.AgentInterface> r18, java.util.ArrayList<com.dianping.agentsdk.framework.AgentInterface> r19) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.manager.b.updateCells(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // com.dianping.shield.adapter.MergeAdapterTypeRefreshListener
    public void onMergedTypeRefresh() {
        Map<Integer, Integer> recyclerableViewSizeMap;
        int a2;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc4a612aeca6f7bf0aba8312fa6996f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc4a612aeca6f7bf0aba8312fa6996f");
        } else if (!this.f.isEmpty()) {
            int i = 0;
            while (i < this.f.size()) {
                i iVar = this.f.get(i);
                if (iVar.g != null && (iVar.b.getSectionCellInterface() instanceof RecyclerPoolSizeInterface) && (recyclerableViewSizeMap = ((RecyclerPoolSizeInterface) iVar.b.getSectionCellInterface()).recyclerableViewSizeMap()) != null && !recyclerableViewSizeMap.isEmpty()) {
                    for (Map.Entry<Integer, Integer> entry : recyclerableViewSizeMap.entrySet()) {
                        AgentInterface agentInterface = iVar.b;
                        int intValue = entry.getKey().intValue();
                        int intValue2 = entry.getValue().intValue();
                        Object[] objArr2 = new Object[3];
                        objArr2[c2] = agentInterface;
                        objArr2[1] = Integer.valueOf(intValue);
                        objArr2[2] = Integer.valueOf(intValue2);
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        i iVar2 = iVar;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31470a39385cf708af5669b529877516", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31470a39385cf708af5669b529877516");
                        } else {
                            i a3 = a(agentInterface);
                            if (this.l != null && a3 != null && a3.g != null && (a3.g instanceof c) && (a2 = this.l.a((c) a3.g, intValue)) > 0) {
                                this.i.getRecycledViewPool().a(a2, intValue2);
                            }
                        }
                        iVar = iVar2;
                        c2 = 0;
                    }
                }
                i++;
                c2 = 0;
            }
        }
    }

    private i a(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310b81d45732e5d7485e563cb6df0d20", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310b81d45732e5d7485e563cb6df0d20");
        }
        if (agentInterface == null) {
            return null;
        }
        i iVar = this.d.get(b(agentInterface));
        if (iVar != null) {
            return iVar;
        }
        for (Map.Entry<String, i> entry : this.d.entrySet()) {
            if (agentInterface == entry.getValue().b) {
                return entry.getValue();
            }
        }
        return null;
    }

    private String b(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d78542fd5def94d5f38443cc50a5045", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d78542fd5def94d5f38443cc50a5045");
        }
        if (agentInterface == null) {
            return null;
        }
        if (TextUtils.isEmpty(agentInterface.getIndex())) {
            return agentInterface.getHostName();
        }
        return agentInterface.getIndex() + CommonConstant.Symbol.COLON + agentInterface.getHostName();
    }

    private boolean a(C0051b c0051b, C0051b c0051b2) {
        while (true) {
            Object[] objArr = {c0051b, c0051b2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb2fd7620e0bbe25321d97de1b6a9f4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb2fd7620e0bbe25321d97de1b6a9f4")).booleanValue();
            }
            if (!c0051b.a.equals(c0051b2.a)) {
                return false;
            }
            if ((!c0051b.a.equals(c0051b2.a) || c0051b.b.equals(c0051b2.b)) && c0051b.a.equals(c0051b2.a) && c0051b.b.equals(c0051b2.b) && c0051b.c != null && c0051b.c != null && c0051b2.c != null) {
                c0051b = c0051b.c;
                c0051b2 = c0051b2.c;
            }
        }
    }

    private C0051b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464ebeb3f2461e1b35ca5d78695ffe19", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0051b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464ebeb3f2461e1b35ca5d78695ffe19");
        }
        C0051b c0051b = new C0051b();
        int indexOf = str.indexOf(46);
        if (indexOf < 0) {
            return null;
        }
        c0051b.a = str.substring(0, indexOf);
        String substring = str.substring(indexOf + 1, str.length());
        int indexOf2 = substring.indexOf(46);
        if (indexOf2 < 0) {
            c0051b.b = substring;
        } else {
            c0051b.b = substring.substring(0, indexOf2);
            c0051b.c = a(substring.substring(indexOf2 + 1, substring.length()));
        }
        return c0051b;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a6329bb33a721e62b8e549d0264737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a6329bb33a721e62b8e549d0264737");
        } else if (this.f != null && !this.f.isEmpty()) {
            this.y.clear();
            for (int i = 0; i < this.f.size(); i++) {
                i iVar = this.f.get(i);
                if (iVar.g instanceof c) {
                    c cVar = (c) iVar.g;
                    for (int i2 = 0; i2 < cVar.getSectionCount(); i2++) {
                        String sectionTitle = cVar.getSectionTitle(i2);
                        if (!TextUtils.isEmpty(sectionTitle)) {
                            this.y.add(new SectionTitleInfo(iVar.c, i2, sectionTitle));
                        }
                    }
                }
            }
            this.D.a(ShieldConst.SECTION_TITLE_LIST_KEY, (ArrayList<? extends Parcelable>) this.y);
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentScrollerInterface
    public void scrollToNode(@NotNull AgentScrollerParams agentScrollerParams) {
        Object[] objArr = {agentScrollerParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b392c1179ee2c8aa1e8c6fa9b43fa15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b392c1179ee2c8aa1e8c6fa9b43fa15b");
        } else if (agentScrollerParams.getScope() == ScrollScope.PAGE) {
            int i = agentScrollerParams.offset;
            boolean z = agentScrollerParams.needPauseExpose;
            ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList = agentScrollerParams.listenerArrayList;
            Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71d5c858232be292adff53b97b705d2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71d5c858232be292adff53b97b705d2f");
            } else if (this.j instanceof LinearLayoutManagerWithSmoothOffset) {
                if (z) {
                    pauseExpose();
                    this.G = true;
                }
                this.H = true;
                ((LinearLayoutManagerWithSmoothOffset) this.j).smoothScrollToPosition(0, i, -1.0f, arrayList);
            }
        } else if (agentScrollerParams.getNodeInfo() == null) {
        } else {
            AgentInterface agent = agentScrollerParams.getNodeInfo().getAgent();
            switch (agentScrollerParams.getScope()) {
                case AGENT:
                    int i2 = agentScrollerParams.offset;
                    boolean z2 = agentScrollerParams.needAutoOffset;
                    boolean z3 = agentScrollerParams.needPauseExpose;
                    boolean z4 = agentScrollerParams.isSmooth;
                    float f = agentScrollerParams.speed;
                    ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList2 = agentScrollerParams.listenerArrayList;
                    Object[] objArr3 = {agent, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42bfc8166e6e4a0f4cd8bf2e9297304e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42bfc8166e6e4a0f4cd8bf2e9297304e");
                        return;
                    } else {
                        a(agent, 0, i2, z2, z3, z4, f, arrayList2);
                        return;
                    }
                case SECTION:
                    a(agent, agentScrollerParams.getNodeInfo().getSection(), agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose, agentScrollerParams.isSmooth, agentScrollerParams.speed, agentScrollerParams.listenerArrayList);
                    return;
                case ROW:
                    if (agentScrollerParams.isSmooth) {
                        a(agent, agentScrollerParams.getNodeInfo().getSection(), agentScrollerParams.getNodeInfo().getCellInfo().row, agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose, agentScrollerParams.speed, agentScrollerParams.listenerArrayList);
                        return;
                    } else {
                        a(agent, agentScrollerParams.getNodeInfo().getSection(), agentScrollerParams.getNodeInfo().getCellInfo().row, agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose);
                        return;
                    }
                case HEADER:
                    if (agentScrollerParams.isSmooth) {
                        a(agent, agentScrollerParams.getNodeInfo().getSection(), -1, agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose, agentScrollerParams.speed, agentScrollerParams.listenerArrayList);
                        return;
                    } else {
                        a(agent, agentScrollerParams.getNodeInfo().getSection(), -1, agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose);
                        return;
                    }
                case FOOTER:
                    if (agentScrollerParams.isSmooth) {
                        a(agent, agentScrollerParams.getNodeInfo().getSection(), -2, agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose, agentScrollerParams.speed, agentScrollerParams.listenerArrayList);
                        return;
                    } else {
                        a(agent, agentScrollerParams.getNodeInfo().getSection(), -2, agentScrollerParams.offset, agentScrollerParams.needAutoOffset, agentScrollerParams.needPauseExpose);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    public int getNodeGlobalPosition(@NotNull NodeInfo nodeInfo) {
        Object[] objArr = {nodeInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808b923fda971a707cc5aa3fc3d80ff5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808b923fda971a707cc5aa3fc3d80ff5")).intValue();
        }
        switch (nodeInfo.getScope()) {
            case AGENT:
                return a(nodeInfo.getAgent(), 0, 0, false);
            case SECTION:
                return a(nodeInfo.getAgent(), nodeInfo.getSection(), 0, false);
            case ROW:
                return a(nodeInfo.getAgent(), nodeInfo.getSection(), nodeInfo.getRow());
            case HEADER:
                return a(nodeInfo.getAgent(), nodeInfo.getSection(), -1);
            case FOOTER:
                return a(nodeInfo.getAgent(), nodeInfo.getSection(), -2);
            default:
                return -1;
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    @Nullable
    public NodeInfo getAgentInfoByGlobalPosition(int i) {
        a aVar;
        Pair<Integer, Integer> sectionIndex;
        b.c a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fa5e6521f0bfc844c7bbb76de3ada0", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fa5e6521f0bfc844c7bbb76de3ada0");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e5196067f2208936dc62187f51db16d", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e5196067f2208936dc62187f51db16d");
        } else if (i < 0 || i >= this.l.getItemCount() || (sectionIndex = this.l.getSectionIndex(i)) == null || (a2 = this.l.a(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue())) == null) {
            aVar = null;
        } else {
            a aVar2 = new a();
            c a3 = this.l.a(a2.b);
            if (a3 != null) {
                aVar2.a = a3.getAgentInterface();
            }
            Pair<Integer, Integer> innerPosition = a3.getInnerPosition(a2.c, a2.d);
            if (innerPosition != null) {
                aVar2.b = ((Integer) innerPosition.first).intValue();
                aVar2.c = ((Integer) innerPosition.second).intValue();
                if (((Integer) innerPosition.second).intValue() >= 0) {
                    aVar2.d = CellType.NORMAL;
                } else if (((Integer) innerPosition.second).intValue() == -1) {
                    aVar2.d = CellType.HEADER;
                } else if (((Integer) innerPosition.second).intValue() == -2) {
                    aVar2.d = CellType.FOOTER;
                }
            }
            aVar = aVar2;
        }
        if (aVar != null) {
            switch (aVar.d) {
                case NORMAL:
                    return NodeInfo.row(aVar.a, aVar.b, aVar.c);
                case HEADER:
                    return NodeInfo.header(aVar.a, aVar.b);
                case FOOTER:
                    return NodeInfo.footer(aVar.a, aVar.b);
                case LOADING:
                case LOADING_MORE:
                    NodeInfo agent = NodeInfo.agent(aVar.a);
                    agent.getCellInfo().section = aVar.b;
                    agent.getCellInfo().row = aVar.c;
                    agent.getCellInfo().cellType = aVar.d;
                    return agent;
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    @Nullable
    public int getMaxTopViewY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692bbf9d9bc4ba3c94c68d93a5bf57df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692bbf9d9bc4ba3c94c68d93a5bf57df")).intValue();
        }
        if (this.j instanceof TopLinearLayoutManager) {
            return ((TopLinearLayoutManager) this.j).getCoveredY();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.agentsdk.manager.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0051b {
        public String a;
        public String b;
        public C0051b c;

        public C0051b() {
        }
    }
}
