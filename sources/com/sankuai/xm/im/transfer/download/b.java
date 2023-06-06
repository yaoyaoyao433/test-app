package com.sankuai.xm.im.transfer.download;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    Map<Integer, d> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719eda5f4ee56c3c9f236cc231cef22a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719eda5f4ee56c3c9f236cc231cef22a");
        } else {
            this.b = new HashMap();
        }
    }

    public final boolean a(int i, d dVar) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0cc6dbda61142ebcf52641cd68f421", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0cc6dbda61142ebcf52641cd68f421")).booleanValue();
        }
        synchronized (this) {
            z = this.b.put(Integer.valueOf(i), dVar) != null;
        }
        return z;
    }

    public final d a(int i) {
        d remove;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ed9ddef068dbc5c8414620efed415c", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ed9ddef068dbc5c8414620efed415c");
        }
        synchronized (this) {
            remove = this.b.remove(Integer.valueOf(i));
        }
        return remove;
    }

    public final d a(String str) {
        d remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ccf05ee884c715eb3b306cd09db885", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ccf05ee884c715eb3b306cd09db885");
        }
        synchronized (this) {
            int i = -1;
            Iterator<Integer> it = this.b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = it.next().intValue();
                if (TextUtils.equals(this.b.get(Integer.valueOf(intValue)).g, str)) {
                    i = intValue;
                    break;
                }
            }
            remove = this.b.remove(Integer.valueOf(i));
        }
        return remove;
    }

    public final d b(int i) {
        d dVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c043eb27ec92fc7c6f292fb48884e7b3", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c043eb27ec92fc7c6f292fb48884e7b3");
        }
        synchronized (this) {
            dVar = this.b.get(Integer.valueOf(i));
        }
        return dVar;
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9fb2665f7df58c722e7dcc096a09627", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9fb2665f7df58c722e7dcc096a09627")).booleanValue();
        }
        synchronized (this) {
            for (Integer num : this.b.keySet()) {
                if (this.b.get(Integer.valueOf(num.intValue())).g.equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int a() {
        int size;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114bb6bc2d362a68caf148ce70350803", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114bb6bc2d362a68caf148ce70350803")).intValue();
        }
        synchronized (this) {
            size = this.b.size();
        }
        return size;
    }
}
