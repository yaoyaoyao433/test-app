package com.sankuai.waimai.rocks.view.viewmodel;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a {
    public RecyclerView.LayoutManager p;
    public com.sankuai.waimai.rocks.model.a q;
    public boolean r;
    public boolean s;
    public volatile boolean t;
    public List<e> o = new ArrayList();
    public a u = a.MAIN;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        MAIN,
        SECOND;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ef7c8ad548c0271b481e4303489d88", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ef7c8ad548c0271b481e4303489d88");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3b7f1228720edd80867b801f65b8964", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3b7f1228720edd80867b801f65b8964") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c49c599b311487ac5f6d7cebcc51c4ab", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c49c599b311487ac5f6d7cebcc51c4ab") : (a[]) values().clone();
        }
    }
}
