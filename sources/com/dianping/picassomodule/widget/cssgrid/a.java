package com.dianping.picassomodule.widget.cssgrid;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<T> mList;

    public abstract View getView(int i);

    public a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e0753349fee0a2b7396c805432f2f22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e0753349fee0a2b7396c805432f2f22");
        } else {
            this.mList = list;
        }
    }

    public a(T[] tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bb6bec15237ad0d1c7e36f111be5d48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bb6bec15237ad0d1c7e36f111be5d48");
        } else {
            this.mList = new ArrayList(Arrays.asList(tArr));
        }
    }

    public T getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dffb32e7ded932b5c9a5095b67fc0dd", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dffb32e7ded932b5c9a5095b67fc0dd") : this.mList.get(i);
    }

    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "158a790f0958ae1263c302f51490e619", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "158a790f0958ae1263c302f51490e619")).intValue();
        }
        if (this.mList == null) {
            return 0;
        }
        return this.mList.size();
    }
}
