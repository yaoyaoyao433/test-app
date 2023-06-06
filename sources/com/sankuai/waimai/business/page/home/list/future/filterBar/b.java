package com.sankuai.waimai.business.page.home.list.future.filterBar;

import android.arch.lifecycle.q;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.nested.NestedSmoothRecyclerView;
import com.sankuai.waimai.business.page.home.list.future.FutureViewModel;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final FutureViewModel b;
    boolean c;
    FloatFilterDialogView d;
    com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;
    public b.a f;
    private FrameLayout g;
    private NestedSmoothRecyclerView h;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "5a1cbdcc0c8f8120e4b18a0728f8e5e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "5a1cbdcc0c8f8120e4b18a0728f8e5e0");
        } else {
            bVar.e.n();
        }
    }

    public b(Context context, NestedSmoothRecyclerView nestedSmoothRecyclerView, FrameLayout frameLayout, FrameLayout frameLayout2, PageFragment pageFragment, com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {context, nestedSmoothRecyclerView, frameLayout, frameLayout2, pageFragment, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda022f15ef1f923e3aa7fe189a78ff3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda022f15ef1f923e3aa7fe189a78ff3");
            return;
        }
        this.c = false;
        this.f = new b.a() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a() {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(DialogFragment dialogFragment, int i, int i2, long j) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(DialogFragment dialogFragment, ArrayList<String> arrayList) {
                Object[] objArr2 = {dialogFragment, arrayList};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2345d3e3b0c288c478d2f279d935dd3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2345d3e3b0c288c478d2f279d935dd3c");
                    return;
                }
                b.a(b.this);
                b.this.b(true);
                b.this.b.a(new com.sankuai.waimai.business.page.home.list.future.net.b(b.this.e.z(), 1));
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26c6cc1c23431d95c00afa9f79d004f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26c6cc1c23431d95c00afa9f79d004f5");
                } else if (b.this.e == null) {
                } else {
                    if (z) {
                        b.this.e.a(str);
                    } else {
                        b.this.e.b(str);
                    }
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(String str, int i, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec6e46988f0fe398537bd672535b5a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec6e46988f0fe398537bd672535b5a0");
                } else if (b.this.e == null) {
                } else {
                    b.this.e.a(str, i, i2);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4083425b36b4a5554c5d722762479a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4083425b36b4a5554c5d722762479a1");
                } else if (b.this.c) {
                    b.this.a(true);
                    b.this.c = false;
                    b.this.e.p();
                    if (b.this.d != null) {
                        b.this.d.a(true);
                    }
                    b.this.b.d = false;
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60cb984cd12d30c755f983128a5ee7c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60cb984cd12d30c755f983128a5ee7c2");
                } else if (b.this.e == null) {
                } else {
                    b.this.e.p();
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.b s = b.this.e.s();
                    Set<String> h = b.this.e.h();
                    Map<String, g> k = b.this.e.k();
                    if (b.this.d != null) {
                        b.this.d.a(s, h, k);
                    }
                    b.a(b.this);
                    b.this.b.a(new com.sankuai.waimai.business.page.home.list.future.net.b(b.this.e.z()));
                }
            }
        };
        if (this.d == null) {
            this.d = new FloatFilterDialogView(context);
            this.d.setFragmentManager(pageFragment.getChildFragmentManager());
            this.d.setPageInfoKey(AppUtil.generatePageInfoKey(pageFragment));
            this.d.setOnDialogSortItemClickListener(this.f);
            frameLayout2.addView(this.d);
        }
        this.e = bVar;
        this.g = frameLayout;
        this.h = nestedSmoothRecyclerView;
        this.b = (FutureViewModel) q.a(pageFragment).a(FutureViewModel.class);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454806654cdd3e6f2e74d6fd48789661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454806654cdd3e6f2e74d6fd48789661");
        } else if (z) {
            this.g.setImportantForAccessibility(1);
            this.h.setImportantForAccessibility(1);
        } else {
            this.g.setImportantForAccessibility(4);
            this.h.setImportantForAccessibility(4);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6dfdee82effdc95c54a2eebde96380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6dfdee82effdc95c54a2eebde96380");
        } else if (this.c) {
            a(true);
            this.b.d = false;
            this.c = false;
            this.e.p();
            if (this.d != null) {
                this.d.a(z);
            }
        }
    }
}
