package com.sankuai.waimai.platform.machpro.refresh;

import android.os.Handler;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.list.e;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.machpro.component.view.b {
    public static ChangeQuickRedirect a;
    private String b;
    private b c;
    private String e;
    private RecyclerView f;
    private com.sankuai.waimai.machpro.component.list.c g;
    private boolean h;
    private String i;
    private Handler j;
    private boolean k;
    private final Runnable l;

    public static /* synthetic */ void a(a aVar) {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "efa1baac1639206bef120b3a3e464552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "efa1baac1639206bef120b3a3e464552");
        } else if (aVar.c == null || aVar.g == null) {
        } else {
            aVar.g.a(new com.sankuai.waimai.machpro.component.list.a() { // from class: com.sankuai.waimai.platform.machpro.refresh.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.component.list.a
                public final e a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8595f5f758e8c03f57bff3c13e315f02", RobustBitConfig.DEFAULT_VALUE)) {
                        return (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8595f5f758e8c03f57bff3c13e315f02");
                    }
                    c cVar = new c(a.this.mMachContext.getContext(), LayoutInflater.from(a.this.mMachContext.getContext()).inflate(R.layout.wm_mach_pro_list_loadmore_view, (ViewGroup) null));
                    if (!TextUtils.isEmpty(a.this.i)) {
                        cVar.d = a.this.i;
                    }
                    return cVar;
                }
            });
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1648a0fbb4d5334e5035ef26b0522e0d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1648a0fbb4d5334e5035ef26b0522e0d")).booleanValue();
            } else if (aVar.f != null && (aVar.f.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) aVar.f.getParent();
                while (true) {
                    if (viewGroup != null) {
                        if (!(viewGroup instanceof CoordinatorLayout)) {
                            if ((viewGroup instanceof com.sankuai.waimai.machpro.component.body.b) || !(viewGroup.getParent() instanceof ViewGroup)) {
                                break;
                            }
                            viewGroup = (ViewGroup) viewGroup.getParent();
                        } else {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            aVar.k = z;
            aVar.f.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.platform.machpro.refresh.a.3
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    int i2;
                    int i3 = 0;
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2501a99ddd8fddd35cc393ab10c1b935", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2501a99ddd8fddd35cc393ab10c1b935");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        if (a.this.f.getLayoutManager() instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) a.this.f.getLayoutManager();
                            r1 = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                            i2 = linearLayoutManager.getItemCount();
                            i3 = 1;
                        } else if (a.this.f.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) a.this.f.getLayoutManager();
                            int[] findLastCompletelyVisibleItemPositions = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(null);
                            r1 = findLastCompletelyVisibleItemPositions.length >= 2 ? findLastCompletelyVisibleItemPositions[findLastCompletelyVisibleItemPositions.length - 1] : -1;
                            i2 = staggeredGridLayoutManager.getItemCount();
                            i3 = 3;
                        } else {
                            i2 = -1;
                        }
                        if (i2 <= 0 || r1 < i2 - i3) {
                            return;
                        }
                        if (a.this.h) {
                            a.this.g.a(101);
                            a.this.dispatchEvent(a.this.e, null);
                            return;
                        }
                        a.this.g.a(103);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b6b8bbd94c950707a03ac412280dc9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b6b8bbd94c950707a03ac412280dc9f");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (a.this.k) {
                        a.this.j.removeCallbacks(a.this.l);
                        if (i2 > 0) {
                            a.this.j.postDelayed(a.this.l, 100L);
                        }
                    }
                }
            });
            if (aVar.h) {
                aVar.g.a(102);
            } else {
                aVar.g.a(103);
            }
        }
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1030c52384b97bc069e4593e3d7b56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1030c52384b97bc069e4593e3d7b56");
            return;
        }
        this.j = new Handler();
        this.k = false;
        this.l = new Runnable() { // from class: com.sankuai.waimai.platform.machpro.refresh.a.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                StaggeredGridLayoutManager staggeredGridLayoutManager;
                int[] findLastCompletelyVisibleItemPositions;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04fca1d1e2fb904ebee7bc762ddd47e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04fca1d1e2fb904ebee7bc762ddd47e2");
                } else if (a.this.f == null || !(a.this.f.getLayoutManager() instanceof StaggeredGridLayoutManager) || (findLastCompletelyVisibleItemPositions = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) a.this.f.getLayoutManager()).findLastCompletelyVisibleItemPositions(null)) == null || findLastCompletelyVisibleItemPositions.length < 2 || Math.max(findLastCompletelyVisibleItemPositions[0], findLastCompletelyVisibleItemPositions[1]) < staggeredGridLayoutManager.getItemCount() - 1) {
                } else {
                    a.this.f.stopScroll();
                }
            }
        };
        this.mYogaNode.b(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: b */
    public b createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9016241407b93359ef3d0dc9b5b8d30b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9016241407b93359ef3d0dc9b5b8d30b");
        }
        this.c = new b(this.mMachContext.getContext(), this.mYogaNode);
        return this.c;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c420200d0ab481156c52e85841b6c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c420200d0ab481156c52e85841b6c4a");
        } else if ("loading".equals(str)) {
            if (com.sankuai.waimai.machpro.util.b.d(obj)) {
                return;
            }
            if (this.c.d()) {
                this.c.e();
            } else if (this.g != null) {
                if (this.h) {
                    this.g.a(102);
                } else {
                    this.g.a(103);
                }
            }
        } else if ("hasmore".equals(str) || "hasMore".equals(str)) {
            this.h = com.sankuai.waimai.machpro.util.b.d(obj);
            if (this.g != null) {
                if (this.h) {
                    this.g.a(101);
                } else {
                    this.g.a(103);
                }
            }
        } else if ("nomoretip".equals(str) || "noMoreTip".equals(str)) {
            this.i = com.sankuai.waimai.machpro.util.b.a(obj, "");
        } else {
            super.updateAttribute(str, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r13.equals("pullDown") == false) goto L26;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.machpro.refresh.a.a
            java.lang.String r11 = "1cd642114d602664637c61a18959c034"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L22
            return
        L22:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -977126464(0xffffffffc5c23bc0, float:-6215.4688)
            if (r2 == r3) goto L3c
            r3 = 1578802311(0x5e1a9c87, float:2.785232E18)
            if (r2 == r3) goto L32
            goto L47
        L32:
            java.lang.String r2 = "pullDown"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L47
            goto L48
        L3c:
            java.lang.String r0 = "pullUp"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L47
            r0 = 0
            goto L48
        L47:
            r0 = -1
        L48:
            switch(r0) {
                case 0: goto L78;
                case 1: goto L4f;
                default: goto L4b;
            }
        L4b:
            super.addEventListener(r13)
            goto L87
        L4f:
            r12.b = r13
            java.lang.Object[] r13 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r0 = com.sankuai.waimai.platform.machpro.refresh.a.a
            java.lang.String r8 = "fc382420eb088a967336ecea85912e4b"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r13
            r2 = r12
            r3 = r0
            r5 = r8
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L68
            com.meituan.robust.PatchProxy.accessDispatch(r13, r12, r0, r9, r8)
            goto L87
        L68:
            com.sankuai.waimai.platform.machpro.refresh.b r13 = r12.c
            r13.c()
            com.sankuai.waimai.platform.machpro.refresh.b r13 = r12.c
            com.sankuai.waimai.platform.machpro.refresh.a$5 r0 = new com.sankuai.waimai.platform.machpro.refresh.a$5
            r0.<init>()
            r13.setRefreshListener(r0)
            return
        L78:
            r12.e = r13
            android.os.Handler r13 = com.sankuai.waimai.machpro.util.b.b()
            com.sankuai.waimai.platform.machpro.refresh.a$1 r0 = new com.sankuai.waimai.platform.machpro.refresh.a$1
            r0.<init>()
            r13.post(r0)
            return
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.refresh.a.addEventListener(java.lang.String):void");
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e05a0635217fc3b43b940a217f8790c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e05a0635217fc3b43b940a217f8790c");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        if (mPComponent instanceof com.sankuai.waimai.machpro.component.list.b) {
            this.f = ((com.sankuai.waimai.machpro.component.list.b) mPComponent).a();
            this.c.setRecyclerView(this.f);
        }
        if (this.f == null || !(this.f.getAdapter() instanceof com.sankuai.waimai.machpro.component.list.c)) {
            return;
        }
        this.g = (com.sankuai.waimai.machpro.component.list.c) this.f.getAdapter();
    }
}
