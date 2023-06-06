package com.sankuai.waimai.mach.component.scroller;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.base.MachBaseViewContainer;
import com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager;
import com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerRecyclerView;
import com.sankuai.waimai.mach.parser.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScrollerContainer extends MachBaseViewContainer {
    public static ChangeQuickRedirect c;
    ScrollerRecyclerView d;
    ScrollerLayoutManager e;
    com.sankuai.waimai.mach.component.scroller.recyclerview.a f;
    d g;
    d h;
    d i;
    String j;
    private int l;
    private a m;
    private List<Integer> n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public ScrollerContainer(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596e652ead6505c645c841cc7597a197", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596e652ead6505c645c841cc7597a197");
        }
    }

    private ScrollerContainer(Context context, AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573add17e543deef639619f367c34156", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573add17e543deef639619f367c34156");
        }
    }

    public ScrollerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d5dd7b6a38f7ec8f1f964a1fee3ab3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d5dd7b6a38f7ec8f1f964a1fee3ab3");
            return;
        }
        this.l = -1;
        this.n = new ArrayList();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b5c97638d99b16167420d49aebb43e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b5c97638d99b16167420d49aebb43e1");
            return;
        }
        this.d = new ScrollerRecyclerView(getContext());
        this.d.setNestedScrollingEnabled(false);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        addView(this.d);
    }

    public void setScrollCallback(a aVar) {
        this.m = aVar;
    }

    public int getCurrIndex() {
        return this.l;
    }

    public List<Integer> getDisplayList() {
        return this.n;
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f333e00d12a4503758798ed63d54d820", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f333e00d12a4503758798ed63d54d820")).intValue();
        }
        if (this.f != null) {
            return this.f.getItemCount();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(com.sankuai.waimai.mach.node.a aVar) {
        while (true) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52920b5c42311a5a19f9f6643ccc09c4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52920b5c42311a5a19f9f6643ccc09c4")).booleanValue();
            }
            if (aVar == null) {
                return false;
            }
            if (aVar.e != null && (aVar.e.h instanceof com.sankuai.waimai.mach.component.swiper.b)) {
                return true;
            }
            aVar = aVar.e;
        }
    }
}
