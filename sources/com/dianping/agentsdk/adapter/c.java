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
import com.dianping.agentsdk.framework.o;
import com.dianping.agentsdk.framework.p;
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
public final class c extends n<o> {
    public static ChangeQuickRedirect a;
    protected LoadingAndLoadingMoreCreator b;
    private final int c;
    private final int d;
    private final int e;

    public c(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, o oVar) {
        super(context, cVar, oVar);
        Object[] objArr = {context, cVar, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42dc982728e6c62ec5101a6339f8bfb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42dc982728e6c62ec5101a6339f8bfb3");
            return;
        }
        this.c = 0;
        this.d = 1;
        this.e = 2;
    }

    public final void a(LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.b = loadingAndLoadingMoreCreator;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getSectionCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd05af15719b38d5dba6f1d98b31293", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd05af15719b38d5dba6f1d98b31293")).intValue();
        }
        if (this.extraInterface != 0 && a()) {
            return super.getSectionCount() + 1;
        }
        return super.getSectionCount();
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70efec37686f7384be2aaf91220b83e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70efec37686f7384be2aaf91220b83e")).booleanValue();
        }
        if (this.extraInterface != 0) {
            return ((o) this.extraInterface).loadingMoreStatus() == l.a.LOADING || ((o) this.extraInterface).loadingMoreStatus() == l.a.FAILED;
        }
        return false;
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7220f348ab8ee9c4a89af694ea8c941", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7220f348ab8ee9c4a89af694ea8c941")).booleanValue() : a() && i == getSectionCount() - 1;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final boolean isInnerSection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd948f7042f170688e28e97053614df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd948f7042f170688e28e97053614df")).booleanValue();
        }
        if (a(i)) {
            return false;
        }
        return super.isInnerSection(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d1d6e7cdfea81e5eaebb4384a8612a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d1d6e7cdfea81e5eaebb4384a8612a")).intValue();
        }
        if (this.extraInterface == 0 || !a(i)) {
            return super.getRowCount(i);
        }
        return 1;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final int getInnerType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ed1cfc5134913ce3891e3207887cca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ed1cfc5134913ce3891e3207887cca")).intValue() : i < 2 ? i : super.getInnerType(i - 2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final CellType getCellType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5047efb323c5614efe6bf6cba8c9f2c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5047efb323c5614efe6bf6cba8c9f2c2");
        }
        if (i == 0 || i == 1) {
            return CellType.LOADING_MORE;
        }
        return super.getCellType(i - 2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final CellType getCellType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac101b11aa9901bd65395fdb1596cfd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac101b11aa9901bd65395fdb1596cfd8");
        }
        if (a(i)) {
            return CellType.LOADING_MORE;
        }
        return super.getCellType(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final Pair<Integer, Integer> getInnerPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ade8b655cedf16b0f091502172acbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ade8b655cedf16b0f091502172acbb");
        }
        if (a(i)) {
            return new Pair<>(Integer.valueOf(i), 0);
        }
        return super.getInnerPosition(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6292154c6a28bad071d1e9d7fc5721ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6292154c6a28bad071d1e9d7fc5721ab")).floatValue();
        }
        if (a(i)) {
            return -1.0f;
        }
        return super.getSectionHeaderHeight(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9495caf41f3fb776e7fec47feeb806cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9495caf41f3fb776e7fec47feeb806cc")).floatValue();
        }
        if (a(i)) {
            return -1.0f;
        }
        return super.getSectionFooterHeight(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a51c6aa52c0437f082a9d05ea25375", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a51c6aa52c0437f082a9d05ea25375");
        }
        if (a(i)) {
            return null;
        }
        return super.getTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8efba9f7d4db58954eb9edd4b5e1760", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8efba9f7d4db58954eb9edd4b5e1760");
        }
        if (a(i)) {
            return null;
        }
        return super.getBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect topDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f2b52ce116538165719c2e79b3574d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f2b52ce116538165719c2e79b3574d");
        }
        if (a(i)) {
            return null;
        }
        return super.topDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect bottomDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfeab0bd2a8bcf7298b70d269484e19a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfeab0bd2a8bcf7298b70d269484e19a");
        }
        if (a(i)) {
            return null;
        }
        return super.bottomDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347dfe2060154ec99274934a41147e26", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347dfe2060154ec99274934a41147e26");
        }
        if (a(i)) {
            return null;
        }
        return super.getPreviousLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923728cd1620683353ac38d2ce7c27ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923728cd1620683353ac38d2ce7c27ae");
        }
        if (a(i)) {
            return null;
        }
        return super.getNextLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final long getItemId(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7305d72885fba18b4b2522503ed9fc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7305d72885fba18b4b2522503ed9fc3")).longValue();
        }
        if (this.extraInterface != 0) {
            if (((o) this.extraInterface).loadingMoreStatus() == l.a.LOADING && i == getSectionCount() - 1) {
                return 0L;
            }
            if (((o) this.extraInterface).loadingMoreStatus() == l.a.FAILED && i == getSectionCount() - 1) {
                return 1L;
            }
        }
        return super.getItemId(i, i2) + 2;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getItemViewType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2489a312715c2b06dfd6112dab7add82", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2489a312715c2b06dfd6112dab7add82")).intValue();
        }
        if (this.extraInterface != 0) {
            if (((o) this.extraInterface).loadingMoreStatus() == l.a.LOADING && i == getSectionCount() - 1) {
                return 0;
            }
            if (((o) this.extraInterface).loadingMoreStatus() == l.a.FAILED && i == getSectionCount() - 1) {
                return 1;
            }
        }
        return super.getItemViewType(i, i2) + 2;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f104fb7dcfc0d65820c1d5a93044033", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f104fb7dcfc0d65820c1d5a93044033")).booleanValue();
        }
        if (a(i)) {
            return false;
        }
        return super.showTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ad54b854b66b9e1d8b1480c4d62d26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ad54b854b66b9e1d8b1480c4d62d26")).booleanValue();
        }
        if (a(i)) {
            return false;
        }
        return super.showBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasBottomDividerVerticalOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3d4b0aa8d42e748dee381c2eed870a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3d4b0aa8d42e748dee381c2eed870a")).booleanValue();
        }
        if (a(i)) {
            return false;
        }
        return super.hasBottomDividerVerticalOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasTopDividerVerticalOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191433e8650962cdfa1d1ee64c366ce9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191433e8650962cdfa1d1ee64c366ce9")).booleanValue();
        }
        if (a(i)) {
            return false;
        }
        return super.hasTopDividerVerticalOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.a
    public final r getDividerInfo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06da8d5ee88cda9183e1d37db60ba51b", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06da8d5ee88cda9183e1d37db60ba51b");
        }
        if (a(i)) {
            return null;
        }
        return super.getDividerInfo(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final void onBindViewHolder(b.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23757982223e7a88794f59ab02111a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23757982223e7a88794f59ab02111a62");
            return;
        }
        if (this.extraInterface != 0) {
            if (getItemViewType(i, i2) == 0) {
                ((o) this.extraInterface).onBindView(l.a.LOADING);
                if (this.extraInterface instanceof p) {
                    ((p) this.extraInterface).updateLoadingMoreView(aVar.itemView);
                    return;
                }
                return;
            } else if (getItemViewType(i, i2) == 1) {
                ((o) this.extraInterface).onBindView(l.a.FAILED);
                if (this.extraInterface instanceof p) {
                    ((p) this.extraInterface).updateLoadingMoreFailedView(aVar.itemView);
                    return;
                }
                return;
            }
        }
        super.onBindViewHolder(aVar, i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, android.support.v7.widget.RecyclerView.a
    public final b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c3510efef69ad35e20860ea1980d15", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c3510efef69ad35e20860ea1980d15");
        }
        if (this.extraInterface != 0) {
            if (i == 0) {
                View loadingMoreView = ((o) this.extraInterface).loadingMoreView();
                TextView textView = loadingMoreView;
                if (loadingMoreView == null) {
                    if (this.b == null) {
                        TextView textView2 = new TextView(getContext());
                        textView2.setGravity(17);
                        textView2.setPadding(aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f));
                        textView2.setText("未设置默认LoadingMoreView");
                        textView = textView2;
                    } else {
                        textView = this.b.loadingMoreView();
                    }
                }
                return new b.a(textView);
            } else if (i == 1) {
                View loadingMoreFailedView = ((o) this.extraInterface).loadingMoreFailedView();
                TextView textView3 = loadingMoreFailedView;
                if (loadingMoreFailedView == null) {
                    if (this.b == null) {
                        TextView textView4 = new TextView(getContext());
                        textView4.setGravity(17);
                        textView4.setPadding(aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f), aq.a(getContext(), 10.0f));
                        textView4.setText("未设置默认LoadingMoreFailedView");
                        textView3 = textView4;
                    } else {
                        textView3 = this.b.loadingMoreFailedView();
                    }
                }
                if (((o) this.extraInterface).loadingMoreRetryListener() != null && textView3 != null) {
                    textView3.setOnClickListener(((o) this.extraInterface).loadingMoreRetryListener());
                }
                return new b.a(textView3);
            } else {
                return super.onCreateViewHolder(viewGroup, i - 2);
            }
        }
        return super.onCreateViewHolder(viewGroup, i);
    }
}
