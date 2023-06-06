package com.sankuai.waimai.store.newwidgets.twolevel;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.SCNestedPullRefreshView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGTwoLevelPullToRefreshView extends SCNestedPullRefreshView {
    public static ChangeQuickRedirect g;
    public SGRefreshHeaderHelper h;
    protected boolean i;
    public boolean j;
    private boolean k;
    private int l;

    public SGTwoLevelPullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d6338488083678e85a119dc7bee20c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d6338488083678e85a119dc7bee20c5");
            return;
        }
        this.i = false;
        this.k = false;
        this.j = false;
        this.l = 0;
    }

    public SGTwoLevelPullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89620fe9579a410ba0fd9b2ae6486d15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89620fe9579a410ba0fd9b2ae6486d15");
            return;
        }
        this.i = false;
        this.k = false;
        this.j = false;
        this.l = 0;
    }

    public SGTwoLevelPullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e72c35e7bf00c89c5b81bc274d93fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e72c35e7bf00c89c5b81bc274d93fc");
            return;
        }
        this.i = false;
        this.k = false;
        this.j = false;
        this.l = 0;
    }

    @TargetApi(21)
    public SGTwoLevelPullToRefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3aa38f3f2a747153b802e3845a840e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3aa38f3f2a747153b802e3845a840e8");
            return;
        }
        this.i = false;
        this.k = false;
        this.j = false;
        this.l = 0;
    }

    public void setForbidScroll(boolean z) {
        this.i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: Throwable -> 0x02d7, TryCatch #0 {Throwable -> 0x02d7, blocks: (B:14:0x0034, B:16:0x004b, B:134:0x02b8, B:136:0x02be, B:138:0x02c2, B:140:0x02d0, B:19:0x005c, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x0076, B:33:0x0082, B:133:0x02b4, B:34:0x0086, B:36:0x008c, B:37:0x0091, B:38:0x0096, B:40:0x009b, B:43:0x00ba, B:45:0x00d5, B:66:0x0138, B:68:0x013c, B:69:0x013e, B:72:0x0144, B:74:0x014b, B:75:0x0150, B:77:0x0156, B:81:0x016d, B:100:0x01ba, B:82:0x0175, B:84:0x017c, B:86:0x0182, B:90:0x0193, B:91:0x0199, B:93:0x019d, B:95:0x01a3, B:99:0x01b5, B:46:0x00e0, B:49:0x00e6, B:51:0x00ec, B:54:0x00f3, B:56:0x00fb, B:61:0x011e, B:63:0x0129, B:57:0x010a, B:101:0x01c2, B:103:0x01c8, B:131:0x029e, B:104:0x01d0, B:106:0x01d4, B:108:0x01f3, B:109:0x01f8, B:111:0x01fc, B:112:0x0201, B:114:0x0205, B:115:0x020a, B:116:0x0239, B:118:0x023f, B:120:0x0254, B:121:0x0258, B:123:0x025c, B:126:0x0261, B:128:0x0265, B:129:0x026a, B:130:0x029b, B:132:0x02a4), top: B:146:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[Catch: Throwable -> 0x02d7, TryCatch #0 {Throwable -> 0x02d7, blocks: (B:14:0x0034, B:16:0x004b, B:134:0x02b8, B:136:0x02be, B:138:0x02c2, B:140:0x02d0, B:19:0x005c, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x0076, B:33:0x0082, B:133:0x02b4, B:34:0x0086, B:36:0x008c, B:37:0x0091, B:38:0x0096, B:40:0x009b, B:43:0x00ba, B:45:0x00d5, B:66:0x0138, B:68:0x013c, B:69:0x013e, B:72:0x0144, B:74:0x014b, B:75:0x0150, B:77:0x0156, B:81:0x016d, B:100:0x01ba, B:82:0x0175, B:84:0x017c, B:86:0x0182, B:90:0x0193, B:91:0x0199, B:93:0x019d, B:95:0x01a3, B:99:0x01b5, B:46:0x00e0, B:49:0x00e6, B:51:0x00ec, B:54:0x00f3, B:56:0x00fb, B:61:0x011e, B:63:0x0129, B:57:0x010a, B:101:0x01c2, B:103:0x01c8, B:131:0x029e, B:104:0x01d0, B:106:0x01d4, B:108:0x01f3, B:109:0x01f8, B:111:0x01fc, B:112:0x0201, B:114:0x0205, B:115:0x020a, B:116:0x0239, B:118:0x023f, B:120:0x0254, B:121:0x0258, B:123:0x025c, B:126:0x0261, B:128:0x0265, B:129:0x026a, B:130:0x029b, B:132:0x02a4), top: B:146:0x0034 }] */
    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.SCAbsScrollPullRefresh, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.newwidgets.twolevel.SGTwoLevelPullToRefreshView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.SCAbsScrollPullRefresh
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df925565f365f57a63b86f29bf0d8ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df925565f365f57a63b86f29bf0d8ff5");
            return;
        }
        super.a();
        if (this.h != null) {
            SGRefreshHeaderHelper sGRefreshHeaderHelper = this.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = SGRefreshHeaderHelper.a;
            if (PatchProxy.isSupport(objArr2, sGRefreshHeaderHelper, changeQuickRedirect2, false, "16a044696ac882f46fbf4934565e5f77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sGRefreshHeaderHelper, changeQuickRedirect2, false, "16a044696ac882f46fbf4934565e5f77");
            } else {
                sGRefreshHeaderHelper.a();
            }
        }
    }

    public void setAllowTwoLevel(boolean z) {
        this.j = z;
    }
}
