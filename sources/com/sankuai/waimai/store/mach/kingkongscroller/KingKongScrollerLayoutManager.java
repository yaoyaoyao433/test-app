package com.sankuai.waimai.store.mach.kingkongscroller;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class KingKongScrollerLayoutManager extends LinearLayoutManager {
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

    public KingKongScrollerLayoutManager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24047df1f28f193bb9d5bbf2c71ed4a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24047df1f28f193bb9d5bbf2c71ed4a5");
        }
    }

    public KingKongScrollerLayoutManager(Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9550a7510fb85901f3848fff3f530963", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9550a7510fb85901f3848fff3f530963");
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
        int c;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01ba5776ad9f2fa2b0991691de5fd07", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01ba5776ad9f2fa2b0991691de5fd07");
            } else {
                this.b = context;
            }
        }
    }

    public final int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8019d15c67ee5904f8a3ba851f92fc4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8019d15c67ee5904f8a3ba851f92fc4d")).intValue();
        }
        if (getItemCount() == 0) {
            return 0;
        }
        if (z) {
            return findLastVisibleItemPosition();
        }
        return findFirstVisibleItemPosition();
    }

    public KingKongScrollerLayoutManager(a aVar) {
        this(aVar.b, aVar.c);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5c66b54726d533bf79474c066281fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5c66b54726d533bf79474c066281fa");
        }
    }
}
