package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.q;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.framework.z;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends n<com.dianping.agentsdk.framework.n> {
    public static ChangeQuickRedirect a;
    protected LoadingAndLoadingMoreCreator b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public d(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, com.dianping.agentsdk.framework.n nVar) {
        super(context, cVar, nVar);
        Object[] objArr = {context, cVar, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889cc7ecd1f23d21ade80a48b53efe1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889cc7ecd1f23d21ade80a48b53efe1e");
            return;
        }
        this.c = 0;
        this.d = 1;
        this.e = 2;
        this.f = 3;
    }

    public final void a(LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.b = loadingAndLoadingMoreCreator;
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef8f9f5714108798a39ba36af4367ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef8f9f5714108798a39ba36af4367ba")).booleanValue() : this.extraInterface != 0 && (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.LOADING || ((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.FAILED || ((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.EMPTY);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final boolean isInnerSection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e4e6f3f9c723ae145b0757f3056df6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e4e6f3f9c723ae145b0757f3056df6")).booleanValue();
        }
        if (a()) {
            return false;
        }
        return super.isInnerSection(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getSectionCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9b82d582761bc98d62e64164d3a853", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9b82d582761bc98d62e64164d3a853")).intValue();
        }
        if (a()) {
            return 1;
        }
        return super.getSectionCount();
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "953bc6188cc4a9ff71ea5070d11dab29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "953bc6188cc4a9ff71ea5070d11dab29")).intValue();
        }
        if (a()) {
            return 1;
        }
        return super.getRowCount(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getItemViewType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d501a4835bb6b0d56e5f01ba352bea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d501a4835bb6b0d56e5f01ba352bea")).intValue();
        }
        if (this.extraInterface != 0) {
            if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.LOADING) {
                return 0;
            }
            if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.FAILED) {
                return 1;
            }
            if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.EMPTY) {
                return 2;
            }
        }
        return super.getItemViewType(i, i2) + 3;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final int getInnerType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1210091078577bc8b92707d4b83aa11", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1210091078577bc8b92707d4b83aa11")).intValue() : i < 3 ? i : super.getInnerType(i - 3);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final long getItemId(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ce69957ba50b1c2e5151d3608cd3a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ce69957ba50b1c2e5151d3608cd3a2")).longValue();
        }
        if (this.extraInterface != 0) {
            if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.LOADING) {
                return 0L;
            }
            if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.FAILED) {
                return 1L;
            }
            if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingStatus() == l.b.EMPTY) {
                return 2L;
            }
        }
        return super.getItemId(i, i2) + 3;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final CellType getCellType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e5f252804fdb8f9879f8402dbeff46", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e5f252804fdb8f9879f8402dbeff46");
        }
        if (a()) {
            return CellType.LOADING;
        }
        return super.getCellType(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final CellType getCellType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c5eeace78082c49832a145afc4bafa", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c5eeace78082c49832a145afc4bafa");
        }
        if (i == 0 || i == 1 || i == 2) {
            return CellType.LOADING;
        }
        return super.getCellType(i - 3);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final Pair<Integer, Integer> getInnerPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852eccc5016ddb8ee4a56c8fca39cb91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852eccc5016ddb8ee4a56c8fca39cb91");
        }
        if (a()) {
            return new Pair<>(0, 0);
        }
        return super.getInnerPosition(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4949bbd1b51b6b1f00534f2f2161e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4949bbd1b51b6b1f00534f2f2161e0")).floatValue();
        }
        if (a()) {
            return -1.0f;
        }
        return super.getSectionHeaderHeight(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6805b23fc0a756312a974c1062ec94f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6805b23fc0a756312a974c1062ec94f")).floatValue();
        }
        if (a()) {
            return -1.0f;
        }
        return super.getSectionFooterHeight(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab5b815a4ee7ffbda68249cdc00090e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab5b815a4ee7ffbda68249cdc00090e");
        }
        if (a()) {
            return null;
        }
        return super.getTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78a9465aea6485162aeffb2651b00c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78a9465aea6485162aeffb2651b00c3");
        }
        if (a()) {
            return null;
        }
        return super.getBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect topDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710ba45ca7973b698b445a3ab79bb078", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710ba45ca7973b698b445a3ab79bb078");
        }
        if (a()) {
            return null;
        }
        return super.topDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect bottomDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aaf238489da7f37b5e471ed74e55dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aaf238489da7f37b5e471ed74e55dfc");
        }
        if (a()) {
            return null;
        }
        return super.bottomDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "280b17eb670a7d4fc60490476565539d", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "280b17eb670a7d4fc60490476565539d");
        }
        if (a()) {
            return null;
        }
        return super.getPreviousLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80cc1579a2fac36f4a59c5fae8df10f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80cc1579a2fac36f4a59c5fae8df10f9");
        }
        if (a()) {
            return null;
        }
        return super.getNextLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a2e53fec0ca5f6d6e71cf9ca86d402", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a2e53fec0ca5f6d6e71cf9ca86d402")).booleanValue();
        }
        if (a()) {
            return false;
        }
        return super.showTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e494f3992b296a4657cb07f4c3f5e22f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e494f3992b296a4657cb07f4c3f5e22f")).booleanValue();
        }
        if (a()) {
            return false;
        }
        return super.showBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasBottomDividerVerticalOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd74e80856fa5e0d363fdf6cbf14ad9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd74e80856fa5e0d363fdf6cbf14ad9")).booleanValue();
        }
        if (a()) {
            return false;
        }
        return super.hasBottomDividerVerticalOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasTopDividerVerticalOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37ce5e1ac0b8af1baec7c1798c25353", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37ce5e1ac0b8af1baec7c1798c25353")).booleanValue();
        }
        if (a()) {
            return false;
        }
        return super.hasTopDividerVerticalOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.a
    public final r getDividerInfo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31a0816985533f443b23423be326d27", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31a0816985533f443b23423be326d27");
        }
        if (a()) {
            return null;
        }
        return super.getDividerInfo(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final void onBindViewHolder(b.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393787f54fcdb7b83c359cf4963aa53e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393787f54fcdb7b83c359cf4963aa53e");
        } else if (a()) {
            if (getItemViewType(i, i2) == 0) {
                if (this.extraInterface instanceof q) {
                    ((q) this.extraInterface).updateLoadingView(aVar.itemView);
                }
            } else if (getItemViewType(i, i2) == 1) {
                if (this.extraInterface instanceof q) {
                    ((q) this.extraInterface).updateLoadingFailedView(aVar.itemView);
                }
            } else if (getItemViewType(i, i2) == 2 && (this.extraInterface instanceof q)) {
                ((q) this.extraInterface).updateLoadingEmptyView(aVar.itemView);
            }
        } else {
            super.onBindViewHolder(aVar, i, i2);
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, android.support.v7.widget.RecyclerView.a
    public final b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d8f1025156904ff727a2b0b9768d91", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d8f1025156904ff727a2b0b9768d91");
        }
        if (this.extraInterface != 0) {
            if (i == 0) {
                View loadingView = ((com.dianping.agentsdk.framework.n) this.extraInterface).loadingView();
                TextView textView = loadingView;
                if (loadingView == null) {
                    if (this.b == null) {
                        TextView textView2 = new TextView(getContext());
                        textView2.setGravity(17);
                        textView2.setPadding(aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f));
                        textView2.setText("未设置默认LoadingView");
                        textView = textView2;
                    } else {
                        textView = this.b.loadingView();
                    }
                }
                return new b.a(textView);
            } else if (i != 1) {
                if (i == 2) {
                    View emptyView = ((com.dianping.agentsdk.framework.n) this.extraInterface).emptyView();
                    TextView textView3 = emptyView;
                    if (emptyView == null) {
                        if (this.b == null) {
                            TextView textView4 = new TextView(getContext());
                            textView4.setGravity(17);
                            textView4.setPadding(aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f));
                            textView4.setText("未设置默认EmptyView");
                            textView3 = textView4;
                        } else {
                            textView3 = this.b.emptyView();
                        }
                    }
                    return new b.a(textView3);
                }
                return super.onCreateViewHolder(viewGroup, i - 3);
            } else {
                View loadingFailedView = ((com.dianping.agentsdk.framework.n) this.extraInterface).loadingFailedView();
                TextView textView5 = loadingFailedView;
                if (loadingFailedView == null) {
                    if (this.b == null) {
                        TextView textView6 = new TextView(getContext());
                        textView6.setGravity(17);
                        textView6.setPadding(aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f));
                        textView6.setText("未设置默认FailedView");
                        textView5 = textView6;
                    } else {
                        textView5 = this.b.loadingFailedView();
                    }
                }
                if (((com.dianping.agentsdk.framework.n) this.extraInterface).loadingRetryListener() != null && textView5 != null) {
                    textView5.setOnClickListener(((com.dianping.agentsdk.framework.n) this.extraInterface).loadingRetryListener());
                }
                return new b.a(textView5);
            }
        }
        return super.onCreateViewHolder(viewGroup, i);
    }
}
