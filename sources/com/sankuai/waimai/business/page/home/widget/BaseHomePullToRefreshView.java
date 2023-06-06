package com.sankuai.waimai.business.page.home.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper;
import com.sankuai.waimai.platform.widget.pullrefresh.NestedPullRefreshView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseHomePullToRefreshView extends NestedPullRefreshView {
    public static ChangeQuickRedirect a;
    private RefreshHeaderHelper b;
    private int i;
    private boolean j;

    public BaseHomePullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7568f358afc27d40d748c75d8a52cba1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7568f358afc27d40d748c75d8a52cba1");
            return;
        }
        this.i = 0;
        this.j = false;
    }

    public BaseHomePullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deea2fc780f43860b0769b492ecaf3e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deea2fc780f43860b0769b492ecaf3e0");
            return;
        }
        this.i = 0;
        this.j = false;
    }

    public BaseHomePullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1cbf71ca8564204f99d49b3dc60cec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1cbf71ca8564204f99d49b3dc60cec9");
            return;
        }
        this.i = 0;
        this.j = false;
    }

    @TargetApi(21)
    public BaseHomePullToRefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb8923139a20a27479414ec97bd6dc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb8923139a20a27479414ec97bd6dc7");
            return;
        }
        this.i = 0;
        this.j = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
        if (r3 <= 0) goto L86;
     */
    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.widget.BaseHomePullToRefreshView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setReFreshHeaderHelper(RefreshHeaderHelper refreshHeaderHelper) {
        this.b = refreshHeaderHelper;
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e60a284eebf1e0a2cf5c16a0a76e34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e60a284eebf1e0a2cf5c16a0a76e34");
            return;
        }
        super.a();
        if (this.b == null || this.b.k) {
            return;
        }
        RefreshHeaderHelper refreshHeaderHelper = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = RefreshHeaderHelper.a;
        if (PatchProxy.isSupport(objArr2, refreshHeaderHelper, changeQuickRedirect2, false, "cc29d436d46b04f937620c600999a97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, refreshHeaderHelper, changeQuickRedirect2, false, "cc29d436d46b04f937620c600999a97b");
        } else {
            refreshHeaderHelper.c();
        }
    }
}
