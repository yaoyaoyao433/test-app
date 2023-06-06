package com.dianping.shield.viewcell;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.ac;
import com.dianping.agentsdk.framework.ad;
import com.dianping.agentsdk.framework.ag;
import com.dianping.agentsdk.framework.ai;
import com.dianping.agentsdk.framework.al;
import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.m;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.framework.s;
import com.dianping.agentsdk.framework.w;
import com.dianping.agentsdk.framework.x;
import com.dianping.agentsdk.framework.y;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.feature.SectionTitleInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseViewCell implements ac, ad, ag, ai, al, s, w, x, y, SectionTitleInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context mContext;
    protected w.a mOnItemClickListener;
    protected y.a mOnItemLongClickListener;

    @Override // com.dianping.agentsdk.framework.s
    public int dividerOffset(int i, int i2) {
        return -1;
    }

    public s.a dividerShowType(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.n
    public View emptyView() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.ac
    public String getCellStatusViewType(l.b bVar, m mVar) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.s
    public Drawable getDivider(int i, int i2) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.ag
    public r getDividerInfo(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public float getFooterDividerOffset(int i) {
        return -1.0f;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public int getFooterViewType(int i) {
        return 0;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public int getFooterViewTypeCount() {
        return 1;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public float getHeaderDividerOffset(int i) {
        return -1.0f;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public int getHeaderViewType(int i) {
        return 0;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public int getHeaderViewTypeCount() {
        return 1;
    }

    @Override // com.dianping.agentsdk.framework.ad
    public String getLoadingMoreViewType(l.a aVar, m mVar) {
        return null;
    }

    public float getSectionFooterHeight(int i) {
        return -1.0f;
    }

    public float getSectionHeaderHeight(int i) {
        return -1.0f;
    }

    @Override // com.dianping.shield.feature.SectionTitleInterface
    public String getSectionTitle(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public boolean hasBottomDividerForFooter(int i) {
        return true;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public boolean hasBottomDividerForHeader(int i) {
        return true;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public boolean hasFooterForSection(int i) {
        return false;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public boolean hasHeaderForSection(int i) {
        return false;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public boolean hasTopDividerForHeader(int i) {
        return true;
    }

    @Override // com.dianping.agentsdk.framework.al
    public z.a linkNext(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.al
    public z.b linkPrevious(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.n
    public View loadingFailedView() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.o
    public View loadingMoreFailedView() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.o
    public View.OnClickListener loadingMoreRetryListener() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.o
    public View loadingMoreView() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.n
    public View.OnClickListener loadingRetryListener() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.n
    public View loadingView() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.o
    public void onBindView(l.a aVar) {
    }

    @Override // com.dianping.agentsdk.framework.ai
    public View onCreateFooterView(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public View onCreateHeaderView(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.s
    public boolean showDivider(int i, int i2) {
        return true;
    }

    @Override // com.dianping.agentsdk.framework.ai
    public void updateFooterView(View view, int i, ViewGroup viewGroup) {
    }

    @Override // com.dianping.agentsdk.framework.ai
    public void updateHeaderView(View view, int i, ViewGroup viewGroup) {
    }

    @Override // com.dianping.agentsdk.framework.q
    public void updateLoadingEmptyView(View view) {
    }

    @Override // com.dianping.agentsdk.framework.q
    public void updateLoadingFailedView(View view) {
    }

    @Override // com.dianping.agentsdk.framework.p
    public void updateLoadingMoreFailedView(View view) {
    }

    @Override // com.dianping.agentsdk.framework.p
    public void updateLoadingMoreView(View view) {
    }

    @Override // com.dianping.agentsdk.framework.q
    public void updateLoadingView(View view) {
    }

    public BaseViewCell(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02fa23f1477be81d3e55046180ebf250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02fa23f1477be81d3e55046180ebf250");
        } else {
            this.mContext = context;
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    @Override // com.dianping.agentsdk.framework.n
    public l.b loadingStatus() {
        return l.b.UNKNOWN;
    }

    @Override // com.dianping.agentsdk.framework.o
    public l.a loadingMoreStatus() {
        return l.a.UNKNOWN;
    }

    @Override // com.dianping.agentsdk.framework.x
    public long getItemId(int i, int i2) {
        long j;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "591f829e8af4f21280fff5c7d9e63df5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "591f829e8af4f21280fff5c7d9e63df5")).longValue();
        }
        long j2 = 0;
        for (int i3 = 0; i3 < getSectionCount(); i3++) {
            if (i3 < i) {
                j = j2;
                for (int i4 = 0; i4 < getRowCount(i3); i4++) {
                    j++;
                }
            } else if (i3 == i) {
                j = j2;
                for (int i5 = 0; i5 < getRowCount(i3); i5++) {
                    if (i5 < i2) {
                        j++;
                    }
                }
            }
            j2 = j;
        }
        return j2;
    }

    @Override // com.dianping.agentsdk.framework.w
    public w.a getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public void setOnItemClickListener(w.a aVar) {
        this.mOnItemClickListener = aVar;
    }

    @Override // com.dianping.agentsdk.framework.y
    public y.a getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public void setOnItemLongClickListener(y.a aVar) {
        this.mOnItemLongClickListener = aVar;
    }
}
