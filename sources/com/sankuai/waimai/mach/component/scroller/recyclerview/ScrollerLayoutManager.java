package com.sankuai.waimai.mach.component.scroller.recyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScrollerLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    public b b;
    private Context c;
    private int d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(int i);

        void b(int i);

        void c(int i);

        void d(int i);

        void e(int i);
    }

    public ScrollerLayoutManager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291352f05b5b56451010d024ea4ff1c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291352f05b5b56451010d024ea4ff1c4");
        }
    }

    public ScrollerLayoutManager(Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ecace7b75bd03430349bf51c2cbb928", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ecace7b75bd03430349bf51c2cbb928");
            return;
        }
        this.c = context;
        this.d = i;
        setOrientation(this.d);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        Context b;
        public int c;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c654e4f3561d8dc734e5de81f5dc39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c654e4f3561d8dc734e5de81f5dc39");
            } else {
                this.b = context;
            }
        }
    }

    public final int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63450bc80219700367950dc86e4b2846", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63450bc80219700367950dc86e4b2846")).intValue();
        }
        if (getItemCount() == 0) {
            return 0;
        }
        if (z) {
            return findLastVisibleItemPosition();
        }
        return findFirstVisibleItemPosition();
    }

    public ScrollerLayoutManager(a aVar) {
        this(aVar.b, aVar.c);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f079a85e78ace9c9e75a32f4cafe23d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f079a85e78ace9c9e75a32f4cafe23d");
        }
    }
}
