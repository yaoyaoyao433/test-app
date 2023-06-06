package com.sankuai.xm.file.transfer;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.file.bean.TransferContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e implements d {
    public static ChangeQuickRedirect b;
    protected static int c;
    protected List<d> d;
    protected Map<String, a> e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8292381c9b6b2399df2e40ee97e4364a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8292381c9b6b2399df2e40ee97e4364a");
            return;
        }
        this.d = new ArrayList();
        this.e = new ConcurrentHashMap();
    }

    public final synchronized void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7a41efb121bb3731587118679cdc6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7a41efb121bb3731587118679cdc6a");
            return;
        }
        if (!this.d.contains(dVar)) {
            this.d.add(dVar);
        }
    }

    public final synchronized TransferContext c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf4697f269e6ee5c6ef9d3c1c188d0a", 6917529027641081856L)) {
            return (TransferContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf4697f269e6ee5c6ef9d3c1c188d0a");
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            for (String str2 : this.e.keySet()) {
                if (str2.equals(str)) {
                    return this.e.get(str2).bU_();
                }
            }
            return null;
        }
    }

    public final synchronized void a(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375f705bcb8bfa6af2080abaa673c043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375f705bcb8bfa6af2080abaa673c043");
        } else {
            this.e.put(str, aVar);
        }
    }

    public final synchronized void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e683df39e3a6653b37eec87b6ff88f0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e683df39e3a6653b37eec87b6ff88f0f");
            return;
        }
        for (String str2 : this.e.keySet()) {
            if (str2.equals(str)) {
                this.e.remove(str2);
                return;
            }
        }
    }

    public final synchronized boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd97fdb63213fea91b703b81bbdcc6e8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd97fdb63213fea91b703b81bbdcc6e8")).booleanValue();
        }
        for (String str2 : this.e.keySet()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onStateChanged(TransferContext transferContext, int i) {
        ArrayList<d> arrayList;
        Object[] objArr = {transferContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f911e15593421c77553bf70abc601c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f911e15593421c77553bf70abc601c");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.d);
        }
        for (d dVar : arrayList) {
            dVar.onStateChanged(transferContext, i);
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onProgress(TransferContext transferContext, double d, double d2) {
        ArrayList<d> arrayList;
        Object[] objArr = {transferContext, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3707ee34bd3669145d42aea99df953ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3707ee34bd3669145d42aea99df953ba");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.d);
        }
        for (d dVar : arrayList) {
            dVar.onProgress(transferContext, d, d2);
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onError(TransferContext transferContext, int i, String str) {
        ArrayList<d> arrayList;
        Object[] objArr = {transferContext, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6f40dbf89fa4e371cfca9b0ffd4e7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6f40dbf89fa4e371cfca9b0ffd4e7f");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.d);
        }
        d(transferContext.getKey());
        for (d dVar : arrayList) {
            dVar.onError(transferContext, i, str);
        }
    }
}
