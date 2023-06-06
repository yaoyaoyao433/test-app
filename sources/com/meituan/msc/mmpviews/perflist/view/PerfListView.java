package com.meituan.msc.mmpviews.perflist.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.msc.common.utils.aq;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.MSCWritableMap;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.mmpviews.list.BaseListView;
import com.meituan.msc.mmpviews.list.MSCLinearLayoutManager;
import com.meituan.msc.mmpviews.list.event.d;
import com.meituan.msc.mmpviews.list.sticky.StickyLinearLayoutManager;
import com.meituan.msc.mmpviews.perflist.event.RListEventEmitter;
import com.meituan.msc.mmpviews.perflist.node.b;
import com.meituan.msc.mmpviews.shell.f;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.af;
import com.meituan.msc.uimanager.list.d;
import com.meituan.msc.uimanager.list.e;
import com.meituan.msc.uimanager.p;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msc.views.ReactRootView;
import com.meituan.msc.views.scroll.VelocityHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class PerfListView extends BaseListView implements com.meituan.msc.mmpviews.list.c, com.meituan.msc.mmpviews.perflist.a<b>, com.meituan.msc.mmpviews.shell.b, com.meituan.msc.uimanager.rlist.a {
    public static ChangeQuickRedirect j;
    private volatile boolean A;
    private com.meituan.msc.mmpviews.perflist.event.a B;
    private boolean C;
    private boolean D;
    private com.meituan.msc.mmpviews.list.msclist.data.c E;
    private boolean F;
    private String G;
    private ArrayList<com.meituan.msc.uimanager.rlist.b> H;
    private com.meituan.msc.mmpviews.list.msclist.b I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private com.meituan.msc.devsupport.perf.a P;
    private JSInstance Q;
    private final ArrayList<Runnable> R;
    private com.meituan.msc.mmpviews.perflist.node.b S;
    private Map<Integer, c> T;
    private Runnable U;
    private final Map<Integer, com.meituan.msc.mmpviews.list.sticky.c> V;
    private volatile boolean W;
    private int aa;
    private Map<Integer, String> ab;
    private Map<Integer, p> ac;
    private boolean ad;
    private final Runnable ae;
    private int af;
    private final f ag;
    public com.meituan.msc.mmpviews.perflist.b<b> k;
    public ThemedReactContext l;
    public ab m;
    public VelocityHelper n;
    boolean o;
    public UIImplementation p;
    public ReactQueueConfiguration q;
    public PerfEventRecorder r;
    public LifecycleEventListener s;
    private HashMap<String, com.meituan.msc.mmpviews.list.msclist.f> t;
    private com.meituan.msc.mmpviews.list.event.b u;
    private SparseIntArray v;
    private RecyclerView.LayoutManager w;
    private boolean x;
    private boolean y;
    private boolean z;

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final /* synthetic */ b a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291aff83c0c071a9a374b4abf0ca52b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291aff83c0c071a9a374b4abf0ca52b5");
        }
        PerfTrace.begin("rList_create_cell");
        FrameLayout frameLayout = new FrameLayout(getContext());
        b.a b2 = this.S.b(this.aa);
        if (b2 == null) {
            throw new RuntimeException("data is null when onCreateViewHolder !!");
        }
        frameLayout.setTag(R.id.native_item_tag, new a(b2, i, this.aa, getId()));
        PerfTrace.end("rList_create_cell");
        return new b(frameLayout);
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final /* synthetic */ void a(b bVar, int i) {
        c cVar;
        a aVar;
        c cVar2;
        int i2;
        View a2;
        String str;
        c cVar3;
        ViewGroup viewGroup;
        View a3;
        c cVar4;
        ViewGroup viewGroup2;
        com.meituan.msc.uimanager.rlist.b bVar2;
        b bVar3 = bVar;
        Object[] objArr = {bVar3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904c8cf610a02666fca11aac37b0fbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904c8cf610a02666fca11aac37b0fbae");
            return;
        }
        PerfTrace.begin("rList_bind_cell");
        ViewGroup viewGroup3 = (ViewGroup) bVar3.itemView;
        a aVar2 = (a) viewGroup3.getTag(R.id.native_item_tag);
        if (aVar2 == null || aVar2.d == null) {
            throw new RuntimeException("cacheInfo is null in onBindViewHolder");
        }
        View childAt = viewGroup3.getChildCount() == 0 ? null : viewGroup3.getChildAt(0);
        c cVar5 = this.T.get(Integer.valueOf(aVar2.b));
        if (cVar5 == null) {
            c cVar6 = new c();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86cdf8c68fa2a8d1d45af678ae015727", RobustBitConfig.DEFAULT_VALUE)) {
                bVar2 = (com.meituan.msc.uimanager.rlist.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86cdf8c68fa2a8d1d45af678ae015727");
            } else {
                d dVar = new d(this.l.a());
                com.meituan.msc.uimanager.rlist.b a4 = com.meituan.msc.uimanager.rlist.b.a(dVar, this.p, i, this);
                dVar.setUIManagerModule(new e(dVar, a4, new RListEventEmitter(dVar, a4, this.l.getUIManagerModule().a().c, this.Q, this), this.l.getUIManagerModule()));
                dVar.initializeMessageQueueThreads(this.q);
                a4.A = getId();
                bVar2 = a4;
            }
            cVar6.b = bVar2;
            this.T.put(Integer.valueOf(aVar2.b), cVar6);
            cVar = cVar6;
        } else {
            cVar = cVar5;
        }
        aVar2.c = cVar.b;
        com.meituan.msc.uimanager.rlist.b bVar4 = cVar.b;
        bVar4.t();
        int hashCode = viewGroup3.hashCode();
        Object[] objArr3 = {bVar4, Integer.valueOf(hashCode)};
        ChangeQuickRedirect changeQuickRedirect3 = j;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b2a342bd8bac4156830224e39e57656", RobustBitConfig.DEFAULT_VALUE)) {
            NativeViewHierarchyManager nativeViewHierarchyManager = (NativeViewHierarchyManager) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b2a342bd8bac4156830224e39e57656");
        } else {
            com.meituan.msc.uimanager.rlist.d dVar2 = (com.meituan.msc.uimanager.rlist.d) bVar4.h();
            dVar2.i = hashCode;
            if (((com.meituan.msc.uimanager.rlist.c) dVar2.a()) == null) {
                com.meituan.msc.uimanager.rlist.c cVar7 = new com.meituan.msc.uimanager.rlist.c(bVar4.f());
                Object[] objArr4 = {Integer.valueOf(hashCode), cVar7};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.uimanager.rlist.d.h;
                if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "0c1b051e8dc1085370f31ac71d072400", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "0c1b051e8dc1085370f31ac71d072400");
                } else {
                    dVar2.j.put(Integer.valueOf(hashCode), cVar7);
                }
            }
        }
        if (childAt == null || childAt.getId() != cVar.c) {
            aVar = aVar2;
            c cVar8 = cVar;
            if (childAt != null) {
                g.d("RLIST", "removeRootViewSafe", Integer.valueOf(getId()));
                ((com.meituan.msc.uimanager.rlist.c) bVar4.h().a()).e(childAt.getId());
            }
            if (cVar8.c > 0 && cVar8.b.b(cVar8.c) != null) {
                int i3 = cVar8.d;
                int i4 = cVar8.c;
                Object[] objArr5 = {bVar4, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect5 = j;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d0bdc9ec391d9fb8b3e9ce9083070e18", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d0bdc9ec391d9fb8b3e9ce9083070e18");
                    cVar2 = cVar8;
                    i2 = 1073741824;
                } else {
                    com.meituan.msc.uimanager.rlist.d dVar3 = (com.meituan.msc.uimanager.rlist.d) bVar4.h();
                    com.meituan.msc.mmpviews.perflist.node.a a5 = this.S.a(i3);
                    if (a5 == null) {
                        throw new RuntimeException("rootListNode is null");
                    }
                    a(bVar4, a5.d, i, i3, i4, null, false, true);
                    PerfTrace.begin("rList_create_new_item");
                    com.meituan.msc.mmpviews.perflist.node.b bVar5 = this.S;
                    NativeViewHierarchyManager a6 = dVar3.a();
                    Object[] objArr6 = {Integer.valueOf(i), a6};
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.mmpviews.perflist.node.b.a;
                    cVar2 = cVar8;
                    if (PatchProxy.isSupport(objArr6, bVar5, changeQuickRedirect6, false, "250facf80b96bc742317994c4cc212e6", RobustBitConfig.DEFAULT_VALUE)) {
                        a3 = (View) PatchProxy.accessDispatch(objArr6, bVar5, changeQuickRedirect6, false, "250facf80b96bc742317994c4cc212e6");
                    } else {
                        b.a aVar3 = bVar5.b.get(i);
                        if (aVar3 == null || aVar3.d == null || a6 == null) {
                            throw new RuntimeException("listNode or nativeViewHierarchyManager is null ");
                        }
                        bVar5.a(aVar3.d, a6);
                        a3 = a6.a(aVar3.d.c);
                    }
                    a2 = a3;
                    aa b2 = bVar4.b(i4);
                    i2 = 1073741824;
                    a2.measure(View.MeasureSpec.makeMeasureSpec((int) b2.D(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) b2.E(), 1073741824));
                    PerfTrace.end("rList_create_new_item");
                }
                str = "createNewView";
            } else {
                cVar2 = cVar8;
                i2 = 1073741824;
                Object[] objArr7 = {bVar4, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect7 = j;
                a2 = PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e84b9865d9a2368effef35226a886c68", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e84b9865d9a2368effef35226a886c68") : bVar4.h().a().a(a(bVar4, new ThemedReactContext(bVar4.e(), this.q, this.l), i, -1, -1, null, true, true));
                str = "createNewShadow";
            }
            cVar3 = cVar2;
            cVar3.c = a2.getId();
            cVar3.d = i;
            viewGroup = viewGroup3;
            viewGroup.addView(a2);
        } else {
            com.meituan.msc.mmpviews.perflist.node.a aVar4 = aVar2.e;
            if (aVar4 == null) {
                throw new RuntimeException("reuseListNode is null");
            }
            com.meituan.msc.mmpviews.perflist.node.a a7 = this.S.a(i);
            if (a7 == null) {
                str = "reuseView";
                a(bVar4, aVar4, i, cVar.d, cVar.c, null);
                cVar.d = i;
                aVar = aVar2;
                cVar3 = cVar;
                a2 = childAt;
                viewGroup = viewGroup3;
            } else {
                if (this.ac.containsKey(Integer.valueOf(i)) && this.ac.get(Integer.valueOf(i)) != null) {
                    str = "updateImage";
                    p pVar = this.ac.get(Integer.valueOf(i));
                    int i5 = cVar.d;
                    int i6 = cVar.c;
                    Object[] objArr8 = {bVar4, aVar4, Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6), pVar};
                    ChangeQuickRedirect changeQuickRedirect8 = j;
                    int i7 = i5;
                    c cVar9 = cVar;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "b6f97243d6a25c33742085d10d9b9a28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "b6f97243d6a25c33742085d10d9b9a28");
                    } else {
                        com.meituan.msc.uimanager.rlist.d dVar4 = (com.meituan.msc.uimanager.rlist.d) bVar4.h();
                        if (i == i7) {
                            aa b3 = bVar4.b(pVar.a);
                            if (b3 != null) {
                                b3.a(new ab(pVar.b));
                            } else {
                                g.a("getAndUpdateRenderCommands", "path shadowNode is null in same position");
                            }
                            dVar4.l = true;
                            PerfTrace.begin("rList_dispatchViewUpdates");
                            a(bVar4, i6);
                            PerfTrace.end("rList_dispatchViewUpdates");
                            PerfTrace.begin("rList_cache_item_node");
                            com.meituan.msc.mmpviews.perflist.node.b bVar6 = this.S;
                            if (i7 < 0) {
                                i7 = i;
                            }
                            bVar6.a(i, i7, i6, dVar4.k);
                            a(bVar4, i, i6);
                            dVar4.d();
                            PerfTrace.end("rList_cache_item_node");
                        } else {
                            aVar = aVar2;
                            viewGroup2 = viewGroup3;
                            a(bVar4, aVar4.d, i, i7, i6, null, false, true, aVar4, pVar);
                            com.meituan.msc.mmpviews.perflist.node.a a8 = this.S.a(i);
                            if (a8 == null) {
                                throw new RuntimeException("cache listNode fail");
                            }
                            PerfTrace.begin("rList_diff_view_node");
                            this.S.a(aVar4, a8, dVar4.a(), false);
                            PerfTrace.end("rList_diff_view_node");
                            this.ac.remove(Integer.valueOf(i));
                            cVar4 = cVar9;
                            cVar4.d = i;
                        }
                    }
                    aVar = aVar2;
                    viewGroup2 = viewGroup3;
                    this.ac.remove(Integer.valueOf(i));
                    cVar4 = cVar9;
                    cVar4.d = i;
                } else {
                    aVar = aVar2;
                    cVar4 = cVar;
                    viewGroup2 = viewGroup3;
                    if (this.ab.containsKey(Integer.valueOf(i))) {
                        str = "update";
                        a(bVar4, aVar4, i, cVar4.d, cVar4.c, this.ab.get(Integer.valueOf(i)));
                        this.ab.remove(Integer.valueOf(i));
                        cVar4.d = i;
                    } else {
                        str = "back";
                        if (a7 != aVar4) {
                            Object[] objArr9 = {bVar4, aVar4, a7};
                            ChangeQuickRedirect changeQuickRedirect9 = j;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "ed0755dd8f02c3b4b35a8924bfdfc0ee", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "ed0755dd8f02c3b4b35a8924bfdfc0ee");
                            } else {
                                NativeViewHierarchyManager a9 = bVar4.h().a();
                                PerfTrace.begin("rList_diff_view_node");
                                this.S.a(aVar4, a7, a9, true);
                                PerfTrace.end("rList_diff_view_node");
                            }
                        }
                    }
                }
                cVar3 = cVar4;
                a2 = childAt;
                viewGroup = viewGroup2;
            }
            i2 = 1073741824;
        }
        a aVar5 = aVar;
        aVar5.d = this.S.b(i);
        aVar5.e = aVar5.d.d;
        com.meituan.msc.mmpviews.perflist.perf.a.a(this.S.a(i), aVar5.d.f, bVar4.h().a());
        if (TextUtils.equals("masonry", this.b)) {
            a2.setLayoutParams(new RecyclerView.g(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(a2.getMeasuredHeight(), i2)));
        }
        if (aVar5.d.a) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(a2.getMeasuredWidth(), i2), View.MeasureSpec.makeMeasureSpec(a2.getMeasuredHeight(), i2));
        }
        viewGroup.setLayoutParams(new RecyclerView.g(View.MeasureSpec.makeMeasureSpec(a2.getMeasuredWidth(), i2), View.MeasureSpec.makeMeasureSpec(a2.getMeasuredHeight(), i2)));
        PerfTrace.end("rList_bind_cell");
        g.d("RLIST", "onBindViewHolder", Integer.valueOf(getId()), Integer.valueOf(aVar5.b), Integer.valueOf(cVar3.d), str);
    }

    public static /* synthetic */ boolean a(PerfListView perfListView, boolean z) {
        perfListView.C = false;
        return false;
    }

    public static /* synthetic */ boolean b(PerfListView perfListView, boolean z) {
        perfListView.D = false;
        return false;
    }

    public static /* synthetic */ boolean c(PerfListView perfListView, boolean z) {
        perfListView.ad = false;
        return false;
    }

    public static /* synthetic */ boolean d(PerfListView perfListView, boolean z) {
        perfListView.z = false;
        return false;
    }

    public static /* synthetic */ boolean e(PerfListView perfListView, boolean z) {
        perfListView.y = true;
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PerfListView(android.content.Context r12, com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper.a r13) {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper.a.a
            java.lang.String r10 = "5f4d10acce955711b6698b92401799ec"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            if (r1 == 0) goto L20
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r9, r0, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L41
        L20:
            java.lang.Boolean r1 = r13.i
            if (r1 != 0) goto L2c
            java.lang.Boolean r1 = r13.h
            if (r1 != 0) goto L2a
        L28:
            r1 = 1
            goto L41
        L2a:
            r1 = 0
            goto L41
        L2c:
            java.lang.Boolean r1 = r13.i
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L28
            java.lang.Boolean r1 = r13.h
            if (r1 == 0) goto L28
            java.lang.Boolean r1 = r13.h
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2a
            goto L28
        L41:
            java.lang.String r3 = r13.d
            r11.<init>(r12, r1, r3)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r12
            r1[r2] = r13
            com.meituan.robust.ChangeQuickRedirect r12 = com.meituan.msc.mmpviews.perflist.view.PerfListView.j
            java.lang.String r13 = "ae19623024dd19ecd74ef21e79307da4"
            r6 = 0
            r8 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r3 = r1
            r4 = r11
            r5 = r12
            r7 = r13
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L62
            com.meituan.robust.PatchProxy.accessDispatch(r1, r11, r12, r0, r13)
            return
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.perflist.view.PerfListView.<init>(android.content.Context, com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper$a):void");
    }

    private PerfListView(Context context, boolean z, String str) {
        super(context);
        MSCLinearLayoutManager mSCLinearLayoutManager;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d994e1ecc213d3cd4fa228f6a54aea48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d994e1ecc213d3cd4fa228f6a54aea48");
            return;
        }
        this.t = new HashMap<>();
        this.v = new SparseIntArray();
        this.B = new com.meituan.msc.mmpviews.perflist.event.a();
        this.n = new VelocityHelper(getContext());
        this.C = false;
        this.D = false;
        this.E = new com.meituan.msc.mmpviews.list.msclist.data.c();
        this.F = false;
        this.o = false;
        this.G = null;
        this.H = new ArrayList<>();
        this.L = 0;
        this.M = 0;
        this.N = false;
        this.O = false;
        this.R = new ArrayList<>();
        this.S = new com.meituan.msc.mmpviews.perflist.node.b();
        this.T = new HashMap();
        this.U = new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3569eda31737075dc4f42ee2a518714e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3569eda31737075dc4f42ee2a518714e");
                } else if (PerfListView.this.o) {
                } else {
                    UiThreadUtil.assertOnUiThread();
                    g.b("RLIST", "main thread js engine ready callback");
                    PerfListView.this.l.getRuntimeDelegate().unregisterMainThreadJSEngineReadyCallback(this);
                    PerfListView.this.Q = PerfListView.this.l.getRuntimeDelegate().getMainThreadJSInstance();
                    Iterator it = PerfListView.this.R.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    PerfListView.this.requestLayout();
                    PerfListView.this.R.clear();
                }
            }
        };
        this.V = new TreeMap();
        this.W = false;
        this.ab = new HashMap();
        this.ac = new HashMap();
        this.ad = false;
        this.ae = new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f28c789cdf84d9fb6a143a8c76ff045", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f28c789cdf84d9fb6a143a8c76ff045");
                    return;
                }
                PerfListView.a(PerfListView.this, false);
                PerfListView.b(PerfListView.this, false);
                PerfListView.c(PerfListView.this, false);
                PerfListView.this.measure(View.MeasureSpec.makeMeasureSpec(PerfListView.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(PerfListView.this.getHeight(), 1073741824));
                PerfListView.this.layout(PerfListView.this.getLeft(), PerfListView.this.getTop(), PerfListView.this.getRight(), PerfListView.this.getBottom());
            }
        };
        this.af = -1;
        this.ag = new f(this);
        this.s = new LifecycleEventListener() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
            public final void onHostPause() {
            }

            @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
            public final void onHostResume() {
            }

            @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
            public final void onHostDestroy() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d7a3298be73df97ccebabb4b4241b11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d7a3298be73df97ccebabb4b4241b11");
                    return;
                }
                g.d("[MSCListView@onDestroy]", "onHostDestroy");
                PerfListView.this.d();
            }
        };
        g.b("RLIST", "PerfListView create: " + hashCode());
        this.b = str;
        this.P = new com.meituan.msc.devsupport.perf.a(context);
        g.d("[PerfListView@PerfListView]", StringUtil.SPACE + this);
        this.k = new com.meituan.msc.mmpviews.perflist.b<>(this);
        setAdapter(this.k);
        setOnFlingListener(new RecyclerView.i() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.3
            @Override // android.support.v7.widget.RecyclerView.i
            public final boolean onFling(int i, int i2) {
                return false;
            }
        });
        this.d = z ? 1 : 0;
        this.I = new com.meituan.msc.mmpviews.list.msclist.b();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "caea8bdf6b3f6c51f93fa56a115dfe04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "caea8bdf6b3f6c51f93fa56a115dfe04");
            return;
        }
        if (this.i || this.w == null) {
            if (TextUtils.equals(this.b, "grid")) {
                this.w = new GridLayoutManager(context, this.c, this.d, this.e);
            } else if (TextUtils.equals(this.b, "masonry")) {
                this.w = new StaggeredGridLayoutManager(this.c, this.d);
                addItemDecoration(new com.meituan.msc.mmpviews.list.msclist.view.a(this.L, this.M));
            } else {
                if (this.d == 1) {
                    mSCLinearLayoutManager = new StickyLinearLayoutManager(context, this.d, this.e, new com.meituan.msc.mmpviews.list.sticky.a() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.5
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.mmpviews.list.sticky.a
                        public final Map<Integer, com.meituan.msc.mmpviews.list.sticky.c> a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c6eca60eddb16f6b74a598102bd1047", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c6eca60eddb16f6b74a598102bd1047") : PerfListView.this.V == null ? new TreeMap() : PerfListView.this.V;
                        }
                    });
                } else {
                    mSCLinearLayoutManager = new MSCLinearLayoutManager(context, this.d, this.e);
                }
                mSCLinearLayoutManager.b = new MSCLinearLayoutManager.b() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.mmpviews.list.MSCLinearLayoutManager.b
                    public final void a(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "93ff44ff5a8b2a4daa0307c28d6b0b65", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "93ff44ff5a8b2a4daa0307c28d6b0b65");
                        } else {
                            PerfListView.this.getReactContext().getRuntimeDelegate().handleException(new Exception(th));
                        }
                    }
                };
                mSCLinearLayoutManager.setItemPrefetchEnabled(false);
                this.w = mSCLinearLayoutManager;
            }
            setLayoutManager(this.w);
            this.w.setAutoMeasureEnabled(true);
            this.i = false;
        }
        setItemAnimator(null);
        com.meituan.msc.mmpviews.list.debug.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3795aaad103dd95b88397a8b45d4c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3795aaad103dd95b88397a8b45d4c4a");
            return;
        }
        g.b("RLIST", "requestLayout: " + getId());
        super.requestLayout();
    }

    public ReactContext getReactContext() {
        return this.l;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eeceab80ebe51da7ec8b336651f81ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eeceab80ebe51da7ec8b336651f81ef");
        } else if (getId() > 0 && !this.W) {
            this.W = true;
            String a2 = a(new Pair<>("props", ((MSCReadableMap) this.m.b).getRealData()));
            g.d("RLIST", "createRList", Integer.valueOf(getId()), a2);
            a("createRList", a2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821d8ef72afd8ac32ce37ff0e2b4148a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821d8ef72afd8ac32ce37ff0e2b4148a");
            return;
        }
        super.onDetachedFromWindow();
        if (this.l == null) {
            return;
        }
        this.l.getRuntimeDelegate().unregisterMainThreadJSEngineReadyCallback(this.U);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc095b52267da7452afc40896f084fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc095b52267da7452afc40896f084fe");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.N || this.O) {
            return;
        }
        this.O = true;
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final int a(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b481a14e4f02db5d449e78f6fa4b151e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b481a14e4f02db5d449e78f6fa4b151e")).intValue();
        }
        this.aa = i;
        com.meituan.msc.mmpviews.perflist.node.b bVar = this.S;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.node.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "466362ff7e6400e1cc07cbd44fe6cb0c", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "466362ff7e6400e1cc07cbd44fe6cb0c");
        } else {
            str = (i < 0 || i >= bVar.b.size()) ? null : bVar.b.get(i).c;
        }
        if (str == null) {
            return 0;
        }
        getRecycledViewPool().a(str.hashCode(), 10);
        return str.hashCode();
    }

    private void a(com.meituan.msc.uimanager.rlist.b bVar, com.meituan.msc.mmpviews.perflist.node.a aVar, int i, int i2, int i3, String str) {
        Object[] objArr = {bVar, aVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3e588b31662f5a0ed50a79ab08faf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3e588b31662f5a0ed50a79ab08faf1");
        } else if (aVar == null) {
            throw new RuntimeException("reuseListNode is null when bindView");
        } else {
            com.meituan.msc.uimanager.rlist.d dVar = (com.meituan.msc.uimanager.rlist.d) bVar.h();
            a(bVar, aVar.d, i, i2, i3, str, false, false);
            com.meituan.msc.mmpviews.perflist.node.a a2 = this.S.a(i);
            if (a2 == aVar) {
                PerfTrace.begin("rList_exec_ui_operation");
                Iterator<UIViewOperationQueue.u> it = dVar.k.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                dVar.d();
                PerfTrace.end("rList_exec_ui_operation");
            } else if (a2 == null) {
                throw new RuntimeException("cache listNode fail");
            } else {
                dVar.d();
                PerfTrace.begin("rList_diff_view_node");
                this.S.a(aVar, a2, dVar.a(), false);
                PerfTrace.end("rList_diff_view_node");
            }
        }
    }

    private int a(com.meituan.msc.uimanager.rlist.b bVar, ThemedReactContext themedReactContext, int i, int i2, int i3, String str, boolean z, boolean z2) {
        Object[] objArr = {bVar, themedReactContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbc83a2fdc911b6e71f8cb464154119", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbc83a2fdc911b6e71f8cb464154119")).intValue() : a(bVar, themedReactContext, i, i2, i3, str, z, z2, null, null);
    }

    private int a(com.meituan.msc.uimanager.rlist.b bVar, ThemedReactContext themedReactContext, int i, int i2, int i3, String str, boolean z, boolean z2, com.meituan.msc.mmpviews.perflist.node.a aVar, p pVar) {
        int i4 = i2;
        Object[] objArr = {bVar, themedReactContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar, pVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef83a8bb36a7943c0f5b51c0e862718", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef83a8bb36a7943c0f5b51c0e862718")).intValue();
        }
        com.meituan.msc.uimanager.rlist.d dVar = (com.meituan.msc.uimanager.rlist.d) bVar.h();
        PerfTrace.begin("rList_execJs");
        String a2 = a(i, i4, str);
        PerfTrace.end("rList_execJs");
        PerfTrace.begin("rList_execRenderCommands");
        dVar.l = z;
        int a3 = a(bVar, themedReactContext, a2, i3);
        PerfTrace.end("rList_execRenderCommands");
        if (pVar != null) {
            aa a4 = com.meituan.msc.mmpviews.perflist.common.a.a(bVar, aVar, pVar.a);
            if (a4 != null) {
                pVar.a = a4.p();
                bVar.E = pVar;
            } else {
                g.a("getAndUpdateRenderCommands", "path shadowNode is null");
            }
        }
        PerfTrace.begin("rList_dispatchViewUpdates");
        a(bVar, a3);
        dVar.l = true;
        PerfTrace.end("rList_dispatchViewUpdates");
        bVar.E = null;
        PerfTrace.begin("rList_cache_item_node");
        com.meituan.msc.mmpviews.perflist.node.b bVar2 = this.S;
        if (i4 < 0) {
            i4 = i;
        }
        bVar2.a(i, i4, a3, dVar.k);
        a(bVar, i, a3);
        if (z2) {
            dVar.d();
        }
        PerfTrace.end("rList_cache_item_node");
        return a3;
    }

    private String a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6f24988caf896dc266574555b6329f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6f24988caf896dc266574555b6329f");
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(i);
        if (i2 >= 0) {
            jSONArray.put(i2);
        }
        String a2 = !TextUtils.isEmpty(str) ? a(new Pair<>("params", jSONArray), new Pair<>("causedBy", str)) : a(new Pair<>("params", jSONArray));
        g.d("RLIST", "renderItem", Integer.valueOf(getId()), a2);
        return a("renderItem", a2);
    }

    private void a(com.meituan.msc.uimanager.rlist.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ace2125b4403c8d1176c284ecce0868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ace2125b4403c8d1176c284ecce0868");
        } else if (TextUtils.equals("masonry", this.b)) {
            bVar.c(i, View.MeasureSpec.makeMeasureSpec((getWidth() - ((this.c - 1) * this.L)) / this.c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else if (this.d == 1) {
            bVar.c(i, View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            bVar.c(i, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(7:35|36|(2:38|39)(2:44|(3:49|50|(1:52)(5:53|(1:(2:58|(1:60)(1:61)))(3:62|63|(6:65|66|67|68|(2:70|71)(2:72|73)|43))|41|42|43))(1:48))|40|41|42|43)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        r15 = 2;
        r9 = 1;
        r7 = 0;
        r31.a(r32, r4.getInt(r6), r4.getString(r5), r4.getInt(r6), r4.optJSONObject(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r11 = r4.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x027c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027d, code lost:
        r1 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(com.meituan.msc.uimanager.rlist.b r31, com.meituan.msc.uimanager.ThemedReactContext r32, java.lang.String r33, int r34) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.perflist.view.PerfListView.a(com.meituan.msc.uimanager.rlist.b, com.meituan.msc.uimanager.ThemedReactContext, java.lang.String, int):int");
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdbd96d1bfcd54462c75c2b012cb9fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdbd96d1bfcd54462c75c2b012cb9fe");
        } else if (UiThreadUtil.isOnUiThread()) {
            this.ae.run();
        } else if (this.ad) {
        } else {
            this.ad = true;
            post(this.ae);
        }
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final void a(final JSONObject jSONObject, final String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f42add4c26a360e100cc5c39a921391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f42add4c26a360e100cc5c39a921391");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (this.o) {
            return;
        }
        this.Q = this.l.getRuntimeDelegate().getMainThreadJSInstance();
        if (this.Q != null) {
            b(jSONObject, str);
            return;
        }
        this.R.add(new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "108f151eb8c63c3b1ef20c8d8a2b5cd7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "108f151eb8c63c3b1ef20c8d8a2b5cd7");
                } else {
                    PerfListView.this.b(jSONObject, str);
                }
            }
        });
        this.l.getRuntimeDelegate().registerMainThreadJSEngineReadyCallback(this.U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d51fff08ebff28d4e00d5e284520209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d51fff08ebff28d4e00d5e284520209");
            return;
        }
        String optString = jSONObject.optString("action");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        PerfTrace.begin("rList_data_" + optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("args");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            PerfTrace.end("rList_data_" + optString);
            return;
        }
        g.d("RLIST", "onDataChangeInner", Integer.valueOf(getId()), optString);
        if ("append".equals(optString)) {
            a(optJSONArray, str);
        } else if ("update".equals(optString)) {
            b(optJSONArray, str);
        } else if ("splice".equals(optString)) {
            c(optJSONArray, str);
        } else if ("remove".equals(optString)) {
            d(optJSONArray, str);
        }
        PerfTrace.end("rList_data_" + optString);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ReactRootView reactRootView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e661592b555e4cca1bc70d85031d8bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e661592b555e4cca1bc70d85031d8bf");
            return;
        }
        super.onAttachedToWindow();
        e();
        ViewGroup viewGroup = this;
        while (true) {
            if (!a(viewGroup) && (viewGroup = (ViewGroup) viewGroup.getParent()) != null) {
                if (viewGroup.getClass().getSimpleName().equals("ViewRootImpl")) {
                    viewGroup = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (viewGroup != null) {
            try {
                if (viewGroup instanceof ReactRootView) {
                    reactRootView = (ReactRootView) viewGroup;
                } else {
                    Object[] objArr2 = {viewGroup};
                    ChangeQuickRedirect changeQuickRedirect2 = j;
                    reactRootView = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7540e3bd2c13d3c44e6688557a4100f5", RobustBitConfig.DEFAULT_VALUE) ? (ReactRootView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7540e3bd2c13d3c44e6688557a4100f5") : (ReactRootView) com.meituan.msc.utils.c.a(viewGroup, "mReactRootView");
                }
                this.u = new com.meituan.msc.mmpviews.list.event.f(viewGroup, getId());
                Field declaredField = ReactRootView.class.getDeclaredField("mJSTouchDispatcher");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(reactRootView);
                if (obj instanceof com.meituan.msc.mmpviews.list.event.b) {
                    ((com.meituan.msc.mmpviews.list.event.b) obj).a(this, this);
                    return;
                }
                this.u.a(this, this);
                declaredField.set(reactRootView, this.u);
            } catch (Throwable th) {
                g.a("[PerfListView@onAttachedToWindow]", th);
            }
        }
    }

    private boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed41cc0049ce799b51626104cf19101d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed41cc0049ce799b51626104cf19101d")).booleanValue() : view != null && (view.getClass().getSimpleName().equals("MSCRNView") || (view instanceof ReactRootView));
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02c339fdd163c57164b8d4679806964", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02c339fdd163c57164b8d4679806964")).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        if (this.o) {
            return false;
        }
        if (this.g) {
            com.meituan.msc.mmpviews.perflist.event.a aVar = this.B;
            float f = i;
            float f2 = i2;
            Object[] objArr2 = {this, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.event.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f371c1f3ab81d21a4a696da607c09605", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f371c1f3ab81d21a4a696da607c09605");
            } else {
                aVar.a(this, d.a.MOMENTUM_BEGIN, f, f2);
            }
            ViewCompat.postOnAnimationDelayed(this, new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b606bc9eb47044eb42d97f8bd98258e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b606bc9eb47044eb42d97f8bd98258e");
                    } else if (PerfListView.this.y) {
                        PerfListView.d(PerfListView.this, false);
                        com.meituan.msc.mmpviews.perflist.event.a aVar2 = PerfListView.this.B;
                        PerfListView perfListView = PerfListView.this;
                        Object[] objArr4 = {perfListView};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.perflist.event.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "4a935f2f0efc9e9eaa3760ee3d9489bf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "4a935f2f0efc9e9eaa3760ee3d9489bf");
                        } else {
                            aVar2.a(perfListView, d.a.MOMENTUM_END);
                        }
                    } else {
                        PerfListView.e(PerfListView.this, true);
                        ViewCompat.postOnAnimationDelayed(PerfListView.this, this, 20L);
                    }
                }
            }, 20L);
        }
        return fling;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b7e71c0f50efc9648b712195b135e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b7e71c0f50efc9648b712195b135e1");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.z) {
            this.y = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d8fc7c43bf7075a2c0d28e7e52714a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d8fc7c43bf7075a2c0d28e7e52714a");
            return;
        }
        super.onScrolled(i, i2);
        if (this.o) {
            return;
        }
        if (!this.F && Build.VERSION.SDK_INT >= 18) {
            Rect rect = new Rect();
            getDrawingRect(rect);
            setClipBounds(rect);
            this.F = true;
        }
        if (this.af > 0) {
            com.meituan.msc.mmpviews.perflist.event.a aVar = this.B;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.event.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "afbd728218f7ff9a6b15813cb2c31393", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "afbd728218f7ff9a6b15813cb2c31393")).booleanValue();
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z2 = (uptimeMillis - aVar.d <= 10 && i == 0 && i2 == 0) ? false : true;
                if (uptimeMillis - aVar.d != 0) {
                    aVar.b = i / ((float) (uptimeMillis - aVar.d));
                    aVar.c = i2 / ((float) (uptimeMillis - aVar.d));
                }
                aVar.d = uptimeMillis;
                z = z2;
            }
            if (z) {
                f();
                this.P.a(this.x, this.B.b, this.B.c);
                com.meituan.msc.mmpviews.perflist.event.a aVar2 = this.B;
                float f = this.B.b;
                float f2 = this.B.c;
                com.meituan.msc.mmpviews.list.msclist.data.c cVar = this.E;
                Object[] objArr3 = {this, Float.valueOf(f), Float.valueOf(f2), cVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.mmpviews.perflist.event.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "cbbbbe57cc30c8f471378705acc7c24a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "cbbbbe57cc30c8f471378705acc7c24a");
                } else {
                    aVar2.a(this, d.a.ON_SCROLL, f, f2, cVar);
                }
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                int itemCount = layoutManager.getItemCount();
                if (layoutManager.getChildCount() > 0) {
                    if (this.E.b == itemCount - 1 && !this.C) {
                        com.meituan.msc.mmpviews.perflist.event.a aVar3 = this.B;
                        Object[] objArr4 = {this};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.perflist.event.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "85abb04cc4d7b399e5473e0221c0aefb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "85abb04cc4d7b399e5473e0221c0aefb");
                        } else {
                            aVar3.a(this, d.a.SCROLL_TO_LOWER);
                        }
                        this.C = true;
                    }
                    if (this.E.a != 0 || this.D) {
                        return;
                    }
                    com.meituan.msc.mmpviews.perflist.event.a aVar4 = this.B;
                    Object[] objArr5 = {this};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.mmpviews.perflist.event.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "795495335c093c46491c666954903446", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "795495335c093c46491c666954903446");
                    } else {
                        aVar4.a(this, d.a.SCROLL_TO_UPPER);
                    }
                    this.D = true;
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925f841726ffad9120169acf9728b066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925f841726ffad9120169acf9728b066");
            return;
        }
        super.onScrollStateChanged(i);
        if (this.o) {
            return;
        }
        if (i == 1) {
            this.A = true;
        } else if (i == 2) {
            this.A = true;
        } else if (i == 0) {
            this.A = false;
        }
        this.af = i;
        int childCount = getLayoutManager().getChildCount();
        if (i != 0 || childCount <= 0) {
            return;
        }
        this.P.d();
        f();
    }

    @Override // com.meituan.msc.mmpviews.shell.b
    public f getDelegate() {
        return this.ag;
    }

    public void setLowerThreshold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9b8514ebbb4e0a991097390c848e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9b8514ebbb4e0a991097390c848e69");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.K = i;
    }

    public void setUpperThreshold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee48cea0549cf066fe124cb568d9a443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee48cea0549cf066fe124cb568d9a443");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.J = i;
    }

    public void setColumnCount(int i) {
        this.c = i;
        this.i = true;
    }

    public void setColumnGap(int i) {
        this.L = i;
        this.i = true;
    }

    public void setRowGap(int i) {
        this.M = i;
        this.i = true;
    }

    private void a(JSONArray jSONArray, JSONArray jSONArray2) {
        Object[] objArr = {jSONArray, jSONArray2};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8234f02f3edec8138682737adcbd684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8234f02f3edec8138682737adcbd684");
            return;
        }
        jSONArray.put(jSONArray2.toString());
        try {
            this.Q.executeJSFunction("JSBridge", "invokeCallback", jSONArray.toString());
        } catch (Exception e) {
            getReactContext().getRuntimeDelegate().handleException(e);
        }
    }

    @Override // com.meituan.msc.uimanager.rlist.a
    public final void a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699dbb7836cac5f54a572ef690e9f3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699dbb7836cac5f54a572ef690e9f3d9");
        } else if (this.o) {
            g.d("[MSCListView@notifyListItemChanged] list destroyed");
        } else if (pVar == null) {
        } else {
            b.a aVar = null;
            View view = pVar.c == null ? null : pVar.c.get();
            if (view == null) {
                return;
            }
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f88aa9fc53e88d20529c63b1efac7b99", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f88aa9fc53e88d20529c63b1efac7b99");
            } else {
                while (view != null && !(view instanceof com.meituan.msc.mmpviews.perflist.item.a)) {
                    if (a(view)) {
                        break;
                    }
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                if (view != null && (view.getParent() instanceof ViewGroup)) {
                    Object tag = ((View) view.getParent()).getTag(R.id.native_item_tag);
                    if (tag instanceof a) {
                        aVar = ((a) tag).d;
                    }
                }
            }
            int a2 = this.S.a(aVar);
            if (a2 < 0) {
                return;
            }
            this.ac.put(Integer.valueOf(a2), pVar);
            this.k.a(a2);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.s {
        public b(View view) {
            super(view);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3373eec36a638c495fc79ef432444975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3373eec36a638c495fc79ef432444975");
            return;
        }
        g.d("[MSCListView@onDestroy]", "onDestroy");
        this.o = true;
        if (this.Q != null) {
            String a2 = a(new Pair[0]);
            g.d("RLIST", "onDestroy", Integer.valueOf(getId()), a2);
            a("destroy", a2);
            this.Q = null;
        }
        if (this.t != null) {
            this.t.clear();
            this.t = null;
        }
        if (this.S != null) {
            com.meituan.msc.mmpviews.perflist.node.b bVar = this.S;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.node.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "94aca02aa953d9f33133c627bcdd6b0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "94aca02aa953d9f33133c627bcdd6b0a");
            } else {
                bVar.b.clear();
            }
            this.S = null;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = j;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18a003d23d35ede168595d8884498064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18a003d23d35ede168595d8884498064");
        } else if (this.H != null && !this.H.isEmpty()) {
            g.d("[MSCListView@clearMSCListNodes]", "cachedUIImplementation size: " + this.H.size());
            Iterator<com.meituan.msc.uimanager.rlist.b> it = this.H.iterator();
            while (it.hasNext()) {
                com.meituan.msc.uimanager.rlist.b next = it.next();
                aa q = next.q();
                if (q == null) {
                    g.a("[MSCListView@clearMSCListNodes]", "rootNode null");
                } else {
                    next.c(q.p());
                    next.u();
                }
            }
            this.H.clear();
            this.H = null;
        }
        if (this.s != null) {
            this.l.removeLifecycleEventListener(this.s);
            this.s = null;
        }
        if (this.l != null) {
            this.l = null;
        }
        if (this.k != null) {
            com.meituan.msc.mmpviews.perflist.b<b> bVar2 = this.k;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.perflist.b.a;
            if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "8c60439fe86ac9fce81d61a920c60db3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "8c60439fe86ac9fce81d61a920c60db3");
            } else {
                bVar2.b = null;
                bVar2.c = null;
            }
            this.k = null;
        }
        if (this.w != null) {
            this.w = null;
        }
        if (this.B != null) {
            this.B = null;
        }
        if (this.u != null) {
            this.u.a();
            this.u = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        if (this.v != null) {
            this.v.clear();
            this.v = null;
        }
    }

    public com.meituan.msc.devsupport.perf.a getMSCListPerfHelper() {
        return this.P;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        public UIImplementation c;
        public b.a d;
        public com.meituan.msc.mmpviews.perflist.node.a e;
        public int f;
        private int g;

        public a(b.a aVar, int i, int i2, int i3) {
            Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d443f812d2398b1030e3152494dfbbb0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d443f812d2398b1030e3152494dfbbb0");
                return;
            }
            this.d = aVar;
            this.b = i;
            this.g = i2;
            this.f = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        com.meituan.msc.uimanager.rlist.b b;
        public int c;
        public int d;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea209314689182d692fd2aa211efd5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea209314689182d692fd2aa211efd5b");
            } else {
                this.d = -1;
            }
        }
    }

    private String a(Pair<String, Object>... pairArr) {
        Object[] objArr = {pairArr};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2da80aa338490b2e19ca8c03948d125d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2da80aa338490b2e19ca8c03948d125d");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageId", this.l.getRuntimeDelegate().getPageId());
            jSONObject.put("viewId", getId());
            for (Pair<String, Object> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f70d9af1cd4f74ea62d5f51a4adf97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f70d9af1cd4f74ea62d5f51a4adf97");
        } else if (str == null) {
        } else {
            PerfTrace.begin("rList_send_data");
            a("onDataChange", str);
            PerfTrace.end("rList_send_data");
        }
    }

    private String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70b64a804a3d0a2da7df2d5183f45f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70b64a804a3d0a2da7df2d5183f45f9");
        }
        try {
            return this.Q.executeListFunction("JSBridge", "invoke", "RList", str, str2);
        } catch (Exception e) {
            getReactContext().getRuntimeDelegate().handleException(e);
            return null;
        }
    }

    private void a(ArrayList<Integer> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1eab5e1f3a3bda8653e67bf4f24ed47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1eab5e1f3a3bda8653e67bf4f24ed47");
            return;
        }
        for (Map.Entry<Integer, c> entry : this.T.entrySet()) {
            c value = entry.getValue();
            if (arrayList.contains(Integer.valueOf(value.d))) {
                value.d = -1;
                if (value.b != null && value.b.h() != null) {
                    value.b.d(value.c);
                    value.c = -1;
                }
            } else {
                Iterator<Integer> it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().intValue() < value.d) {
                        i++;
                    }
                }
                value.d -= i;
            }
            g.d("RLIST", "setShadowIndex-removeViewTypeInfo ", Integer.valueOf(value.d));
        }
    }

    private void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5059b0f264620836fc879eaed1bbc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5059b0f264620836fc879eaed1bbc8");
            return;
        }
        for (Map.Entry<Integer, c> entry : this.T.entrySet()) {
            c value = entry.getValue();
            if (value.d >= i && value.d < i + i2) {
                value.d = -1;
                if (value.b != null) {
                    value.b.d(value.c);
                    value.c = -1;
                }
            } else if (value.d >= i + i2) {
                value.d += i3 - i2;
            }
            g.d("RLIST", "setShadowIndex-spliceViewTypeInfo ", Integer.valueOf(value.d));
        }
    }

    private void a(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814cb8c94fb4f09950558c2b069795ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814cb8c94fb4f09950558c2b069795ef");
        } else if (list.size() != 0) {
            for (Map.Entry<Integer, c> entry : this.T.entrySet()) {
                c value = entry.getValue();
                if (list.contains(Integer.valueOf(value.d))) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.S.a()) {
                            break;
                        }
                        b.a b2 = this.S.b(i2);
                        if (b2 != null && !list.contains(Integer.valueOf(i2)) && b2.c.hashCode() == entry.getKey().intValue()) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    if (i >= 0 && i < this.S.a()) {
                        a(value, i);
                    }
                }
            }
        }
    }

    private void a(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b623bb0ae2ec71f37c214c7f041e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b623bb0ae2ec71f37c214c7f041e32");
            return;
        }
        for (Map.Entry<Integer, c> entry : this.T.entrySet()) {
            c value = entry.getValue();
            if (value.d >= i && value.d < (i3 = i + i2)) {
                int i4 = -1;
                if (i > 0) {
                    int i5 = -1;
                    for (int i6 = 0; i6 < i; i6++) {
                        b.a b2 = this.S.b(i6);
                        if (b2 != null && b2.c.hashCode() == entry.getKey().intValue()) {
                            i5 = i6;
                        }
                    }
                    i4 = i5;
                }
                if (i3 < getItemCount() - 1) {
                    while (i3 < getItemCount()) {
                        b.a b3 = this.S.b(i3);
                        if (b3 != null && b3.c.hashCode() == entry.getKey().intValue()) {
                            i4 = i3;
                        }
                        i3++;
                    }
                }
                if (i4 >= 0 && i4 < this.S.a()) {
                    a(entry.getValue(), i4);
                }
            }
        }
    }

    private void a(UIImplementation uIImplementation, int i, int i2) {
        Object[] objArr = {uIImplementation, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad9f190c07e4d100cfec8f7b78fba71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad9f190c07e4d100cfec8f7b78fba71");
        } else if (uIImplementation == null) {
        } else {
            com.meituan.msc.mmpviews.perflist.node.a a2 = this.S.a(i);
            aa b2 = uIImplementation.b(i2);
            if (b2 == null || a2 == null) {
                return;
            }
            a2.j = b2.F();
            a2.k = b2.G();
            a2.l = b2.H();
            a2.m = b2.I();
        }
    }

    @Override // com.meituan.msc.mmpviews.list.BaseListView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fed842d2cb76eeb6537abd8b1e2d748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fed842d2cb76eeb6537abd8b1e2d748");
        } else if (this.o) {
        } else {
            int c2 = (int) s.c(50.0f);
            this.K = c2;
            this.J = c2;
            this.Q = this.l.a().getRuntimeDelegate().getMainThreadJSInstance();
            if (this.Q != null) {
                c();
                return;
            }
            this.R.add(new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4585aa3cdef1ba91502c37c4d4a7a934", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4585aa3cdef1ba91502c37c4d4a7a934");
                    } else {
                        PerfListView.this.c();
                    }
                }
            });
            this.l.getRuntimeDelegate().registerMainThreadJSEngineReadyCallback(this.U);
        }
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db544e8265171e1b15453420ae54d1dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db544e8265171e1b15453420ae54d1dc")).intValue();
        }
        if (this.o) {
            g.a("[MSCListView@getItemCount]", "list already destroyed");
            return 0;
        } else if (this.l == null) {
            g.b("RLIST", "getItemCount themed context dont have set");
            return 0;
        } else if (!this.l.getRuntimeDelegate().isMainThreadJSEngineReady()) {
            g.b("RLIST", "getItemCount main thread js engine not ready");
            this.l.getRuntimeDelegate().registerMainThreadJSEngineReadyCallback(this.U);
            return 0;
        } else {
            return this.S.a();
        }
    }

    private void a(JSONArray jSONArray, String str) {
        Object[] objArr = {jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945c0c1d5c28a141630784f2dc4b10eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945c0c1d5c28a141630784f2dc4b10eb");
        } else if (this.o) {
        } else {
            a(str);
            Object[] objArr2 = new Object[3];
            objArr2[0] = "append";
            objArr2[1] = Integer.valueOf(getId());
            objArr2[2] = jSONArray == null ? StringUtil.NULL : Integer.valueOf(jSONArray.length());
            g.d("RLIST", objArr2);
            com.meituan.msc.mmpviews.list.msclist.data.a a2 = this.S.a(jSONArray);
            if (a2 != null) {
                g();
                this.k.a(a2.b, jSONArray.length());
            }
            e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(JSONArray jSONArray, String str) {
        Object[] objArr = {jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1eb469969473ee141ad0cd62b2129c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1eb469969473ee141ad0cd62b2129c4");
        } else if (!this.o) {
            g.d("RLIST", "update", Integer.valueOf(getId()), str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                if (optJSONArray == null || optJSONArray.length() < 2) {
                    g.d("[DataManager@updates] item to update is not formatted with index and data");
                    return;
                } else if (!(optJSONArray.opt(0) instanceof Integer)) {
                    g.d("[DataManager@updates] item data index is not a integer: " + optJSONArray.opt(0));
                    return;
                } else {
                    int optInt = optJSONArray.optInt(0);
                    if (!arrayList.contains(Integer.valueOf(optInt))) {
                        arrayList.add(Integer.valueOf(optInt));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            a(str);
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.ab.put(arrayList.get(i2), "dataChange");
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            Arrays.sort(iArr);
            g();
            if (iArr.length == 1) {
                this.k.a(iArr[0]);
                e();
            } else if (com.meituan.msc.mmpviews.list.common.a.a(iArr)) {
                final com.meituan.msc.mmpviews.perflist.b<b> bVar = this.k;
                final int i3 = iArr[0];
                final int length = iArr.length;
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(length)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "76615007a84319b12d49b363344440e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "76615007a84319b12d49b363344440e6");
                } else if (bVar.a()) {
                    bVar.notifyItemRangeChanged(i3, length);
                } else {
                    bVar.a(bVar.b, new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.b.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0f59f629c59a141dc7409bcf6c8e2e3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0f59f629c59a141dc7409bcf6c8e2e3");
                            } else {
                                bVar.notifyItemRangeChanged(i3, length);
                            }
                        }
                    });
                }
                e();
            } else {
                for (int i4 : iArr) {
                    this.k.a(i4);
                    e();
                }
            }
        }
    }

    private void c(JSONArray jSONArray, String str) {
        Object[] objArr = {jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b85e0200d5c7e32cc7ea2605cd010ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b85e0200d5c7e32cc7ea2605cd010ea");
        } else if (this.o) {
        } else {
            if (jSONArray.length() < 3) {
                g.d("RLIST", "onDataChange splice error", Integer.valueOf(jSONArray.length()));
                return;
            }
            int optInt = jSONArray.optInt(0);
            int optInt2 = jSONArray.optInt(1);
            JSONArray optJSONArray = jSONArray.optJSONArray(2);
            if (optInt < 0 || optInt > this.S.a() || optInt2 > this.S.a() - optInt) {
                Object[] objArr2 = new Object[5];
                objArr2[0] = "onDataChange splice error";
                objArr2[1] = Integer.valueOf(getId());
                objArr2[2] = Integer.valueOf(optInt);
                objArr2[3] = optJSONArray == null ? StringUtil.NULL : Integer.valueOf(optJSONArray.length());
                objArr2[4] = Integer.valueOf(optInt2);
                g.d("RLIST", objArr2);
                return;
            }
            if (optInt2 > 0) {
                a(optInt, optInt2);
            }
            Object[] objArr3 = new Object[5];
            objArr3[0] = "onDataChange splice";
            objArr3[1] = Integer.valueOf(getId());
            objArr3[2] = Integer.valueOf(optInt);
            objArr3[3] = optJSONArray == null ? StringUtil.NULL : Integer.valueOf(optJSONArray.length());
            objArr3[4] = Integer.valueOf(optInt2);
            g.d("RLIST", objArr3);
            a(str);
            com.meituan.msc.mmpviews.list.msclist.data.a a2 = this.S.a(optInt, optInt2, optJSONArray);
            if (a2 == null) {
                return;
            }
            a(optInt, optInt2, a2.c);
            g();
            if (optInt2 > 0) {
                this.k.b(optInt, optInt2);
            }
            if (a2.c > 0) {
                this.k.a(a2.b, a2.c);
            }
            e();
        }
    }

    private void d(JSONArray jSONArray, String str) {
        Object[] objArr = {jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab1b120294501ec2d46485bc4ac1f297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab1b120294501ec2d46485bc4ac1f297");
        } else if (!this.o && jSONArray != null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                int optInt = jSONArray.optInt(i);
                if (optInt >= 0 && optInt < this.S.a() && !arrayList.contains(Integer.valueOf(optInt))) {
                    arrayList.add(Integer.valueOf(optInt));
                }
            }
            Collections.sort(arrayList, new Comparator<Integer>() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListView.9
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Integer num, Integer num2) {
                    Integer num3 = num;
                    Integer num4 = num2;
                    Object[] objArr2 = {num3, num4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80f17b0607c58eaff14b113c737de5c8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80f17b0607c58eaff14b113c737de5c8")).intValue() : num3.intValue() - num4.intValue();
                }
            });
            if (arrayList.size() == 0) {
                g.d("RLIST", "remove error");
                return;
            }
            g.d("RLIST", "remove", Integer.valueOf(getId()), arrayList.toString());
            a((List<Integer>) arrayList);
            a(str);
            this.S.a(arrayList);
            a(arrayList);
            g();
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = jSONArray.optInt(i2);
            }
            if (com.meituan.msc.mmpviews.list.common.a.a(iArr)) {
                this.k.b(iArr[0], length);
            } else {
                final com.meituan.msc.mmpviews.perflist.b<b> bVar = this.k;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1d13469eb64ff490023665ff3cc263b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1d13469eb64ff490023665ff3cc263b7");
                } else if (bVar.a()) {
                    bVar.notifyDataSetChanged();
                } else {
                    bVar.a(bVar.b, new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.b.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7563999432789a44ca333adbf617c3a0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7563999432789a44ca333adbf617c3a0");
                            } else {
                                bVar.notifyDataSetChanged();
                            }
                        }
                    });
                }
            }
            e();
        }
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82fd26d0b9c9feae84c7994d9a533ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82fd26d0b9c9feae84c7994d9a533ba");
        } else if (!this.o && i >= 0 && i < getItemCount()) {
            g.d("RLIST", "reloadItem", Integer.valueOf(getId()), Integer.valueOf(i));
            this.ab.put(Integer.valueOf(i), "setState");
            this.k.a(i);
            e();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3e4f41de50686fd1cb80159a3aa6eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3e4f41de50686fd1cb80159a3aa6eb")).booleanValue();
        }
        if (!this.o && this.f) {
            this.n.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.x) {
                int a2 = (int) (aq.a(this.l, this.n.c * 1000.0f) * (-1.0d));
                g.a("ScrollVelocity: " + a2);
                this.P.l.add(Integer.valueOf(a2));
                this.n.a();
                com.meituan.msc.mmpviews.perflist.event.a aVar = this.B;
                float f = this.n.b;
                float f2 = this.n.c;
                Object[] objArr2 = {this, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.event.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c925a3b0e898c6f1c72144f62763be2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c925a3b0e898c6f1c72144f62763be2b");
                } else {
                    aVar.a(this, d.a.END_DRAG, f, f2);
                }
                this.x = false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dfd812eebdecc8fcab1442dcadd1e2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dfd812eebdecc8fcab1442dcadd1e2f")).booleanValue();
        }
        if (!this.o && this.f) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    com.meituan.msc.mmpviews.perflist.event.a aVar = this.B;
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.event.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f6e0842ea5b7e81c3daf6d7aa451cfb4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f6e0842ea5b7e81c3daf6d7aa451cfb4");
                    } else {
                        aVar.a(this, d.a.BEGIN_DRAG);
                    }
                    this.C = false;
                    this.D = false;
                    this.x = true;
                    return true;
                }
            } catch (Throwable th) {
                g.b("[MSCListView@onInterceptTouchEvent]", th, "notify native gesture error: ");
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    private void f() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b10c55dce8b8999b04fe904c8e0e12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b10c55dce8b8999b04fe904c8e0e12d");
        } else if (this.o) {
        } else {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            View view2 = null;
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                this.E.a = linearLayoutManager.findFirstVisibleItemPosition();
                this.E.b = linearLayoutManager.findLastVisibleItemPosition();
                view2 = linearLayoutManager.findViewByPosition(this.E.a);
                view = linearLayoutManager.findViewByPosition(this.E.b);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                this.E.a = iArr[0];
                staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
                this.E.b = iArr[staggeredGridLayoutManager.getSpanCount() - 1];
                view2 = staggeredGridLayoutManager.findViewByPosition(this.E.a);
                view = staggeredGridLayoutManager.findViewByPosition(this.E.b);
            } else {
                view = null;
            }
            this.E.c = view2 == null ? 0 : this.d == 1 ? view2.getTop() : view2.getLeft();
            this.E.d = view == null ? 0 : this.d == 1 ? view.getTop() : view.getLeft();
            this.E.f = view2 == null ? 0 : view2.getWidth();
            this.E.e = view2 == null ? 0 : view2.getHeight();
            this.E.h = view == null ? 0 : view.getWidth();
            this.E.g = view != null ? view.getHeight() : 0;
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b5b0ac863b690a28604ffe7b688565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b5b0ac863b690a28604ffe7b688565");
        } else if (!this.o && this.d != 0) {
            this.V.clear();
            for (int i = 0; i < this.S.a(); i++) {
                b.a b2 = this.S.b(i);
                if (b2 != null && b2.a) {
                    com.meituan.msc.mmpviews.list.sticky.c cVar = new com.meituan.msc.mmpviews.list.sticky.c();
                    cVar.a = i;
                    Object obj = b2.b;
                    if (obj instanceof Integer) {
                        cVar.b = ((Integer) b2.b).intValue();
                    } else if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.endsWith("rpx")) {
                            cVar.b = (int) com.meituan.msc.mmpviews.list.a.a(this.l, str);
                        } else {
                            cVar.b = (int) Double.parseDouble(str);
                        }
                    }
                    this.V.put(Integer.valueOf(i), cVar);
                }
            }
        }
    }

    public void setClassPrefix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eeed90ad7935bbe4cbefcc3cf7c031c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eeed90ad7935bbe4cbefcc3cf7c031c");
        } else if (this.o || this.G != null || str == null) {
        } else {
            this.G = str;
            this.I.b = this.G;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010c, code lost:
        if (r18.d == 1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // com.meituan.msc.mmpviews.perflist.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r19, org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.perflist.view.PerfListView.a(int, org.json.JSONObject):void");
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final JSONObject b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ea15c4113609d5c168b725cd1e2664", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ea15c4113609d5c168b725cd1e2664");
        }
        if (this.o) {
            return new JSONObject();
        }
        f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firstVisibleIndex", this.E.a);
            jSONObject.put("lastVisibleIndex", this.E.b);
            jSONObject.put("firstVisibleOffset", this.E.c);
            jSONObject.put("lastVisibleOffset", this.E.d);
        } catch (JSONException e) {
            g.a("[MSCListView@queryItemVisibility]", e);
        }
        return jSONObject;
    }

    @Override // com.meituan.msc.mmpviews.perflist.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7420b76057e83c5351e06b1363b5a875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7420b76057e83c5351e06b1363b5a875");
        } else if (!this.o) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject.optInt("successCallID"));
            JSONArray jSONArray2 = new JSONArray();
            View g = this.p.g(this.p.h().a().a());
            if (g == null) {
                a(jSONArray, jSONArray2);
                return;
            }
            int optInt = jSONObject.optInt("index");
            String optString = jSONObject.optString("selector");
            JSONObject optJSONObject = jSONObject.optJSONObject("fields");
            if (optInt < 0 || optInt >= this.S.a() || TextUtils.isEmpty(optString) || optJSONObject == null) {
                a(jSONArray, jSONArray2);
                return;
            }
            Pair<NativeViewHierarchyManager, JSONArray> a2 = com.meituan.msc.mmpviews.perflist.common.a.a(this, optInt, optString);
            if (a2 == null || a2.first == null || a2.second == null) {
                a(jSONArray, jSONArray2);
                return;
            }
            NativeViewHierarchyManager nativeViewHierarchyManager = (NativeViewHierarchyManager) a2.first;
            for (int i = 0; i < ((JSONArray) a2.second).length(); i++) {
                View a3 = nativeViewHierarchyManager.a(((JSONArray) a2.second).optInt(i));
                if (a3 != null) {
                    jSONArray2.put(((MSCWritableMap) af.a(g, a3, new MSCReadableMap(optJSONObject))).getRealData());
                }
            }
            a(jSONArray, jSONArray2);
        }
    }

    @Override // com.meituan.msc.mmpviews.list.c
    public final boolean a(String str, View view) {
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1034670ec9617b260eb80d25734cfff8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1034670ec9617b260eb80d25734cfff8")).booleanValue();
        }
        if (this.o) {
            return false;
        }
        while (view != null) {
            if (view.getTag(R.id.native_item_tag) != null) {
                a aVar = (a) view.getTag(R.id.native_item_tag);
                return aVar != null && str.equals(String.valueOf(aVar.f));
            } else if (a(view)) {
                break;
            } else {
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
        }
        return false;
    }

    @Override // com.meituan.msc.mmpviews.list.c
    public final void a(com.meituan.msc.mmpviews.list.event.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aac323801e22c8adef3816c1513672e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aac323801e22c8adef3816c1513672e");
        } else if (this.o || gVar == null || gVar.i == null) {
            g.b("[PerfListView@findTouchedViewToken]", null, "isDestroyed:", Boolean.valueOf(this.o), "token: ", gVar);
        } else if (this.A) {
            gVar.k = true;
        } else {
            View view = gVar.i;
            while (view != null && view.getTag(R.id.native_item_tag) == null) {
                if (a(view)) {
                    return;
                }
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            if (view == null) {
                return;
            }
            a aVar = (a) view.getTag(R.id.native_item_tag);
            if (aVar == null) {
                g.b("[PerfListView@findTouchedViewToken]", null, "cacheInfo null!");
                return;
            }
            gVar.b = this.S.a(aVar.d);
            gVar.h = getId();
            gVar.j = gVar.c;
        }
    }

    private void a(c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6c3238e838e1f3f7826b234b414539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6c3238e838e1f3f7826b234b414539");
            return;
        }
        com.meituan.msc.uimanager.rlist.b bVar = cVar.b;
        if (bVar == null) {
            return;
        }
        com.meituan.msc.uimanager.rlist.d dVar = (com.meituan.msc.uimanager.rlist.d) bVar.h();
        String a2 = a(i, cVar.d, (String) null);
        b.a b2 = this.S.b(i);
        dVar.l = false;
        a(bVar, (ThemedReactContext) bVar.r().getContext(), a2, cVar.c);
        a(bVar, cVar.c);
        if (b2.d == null) {
            this.S.a(i, cVar.d, cVar.c, dVar.k);
            a(bVar, i, cVar.c);
        }
        dVar.d();
        dVar.l = true;
        cVar.d = i;
        g.d("RLIST", "setShadowIndex-changeShadowIndexInner ", Integer.valueOf(cVar.d));
    }
}
