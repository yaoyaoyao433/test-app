package com.sankuai.waimai.machpro.base;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachArray implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Object> mObjects;

    public MachArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95af6f630343419c3a7196fa8fac03c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95af6f630343419c3a7196fa8fac03c2");
        } else {
            this.mObjects = new ArrayList();
        }
    }

    public void add(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efdbffc4c78131906e6131018543f7bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efdbffc4c78131906e6131018543f7bf");
        } else {
            this.mObjects.add(obj);
        }
    }

    public void add(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c400bf98d51f022152c3d976ee124416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c400bf98d51f022152c3d976ee124416");
        } else {
            this.mObjects.add(i, obj);
        }
    }

    public Object get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93cef9351fc81ac524dc94bab05ce814", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93cef9351fc81ac524dc94bab05ce814") : this.mObjects.get(i);
    }

    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6b28bc11f1144bb9526e42dd9fdad7f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6b28bc11f1144bb9526e42dd9fdad7f")).intValue() : this.mObjects.size();
    }

    public Object[] toArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee7805ad1d9b897fa9d9249a4b7faded", RobustBitConfig.DEFAULT_VALUE) ? (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee7805ad1d9b897fa9d9249a4b7faded") : this.mObjects.toArray();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d746c160ae1cddcede21d7b979e326", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d746c160ae1cddcede21d7b979e326") : this.mObjects.toString();
    }
}
