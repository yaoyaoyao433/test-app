package com.sankuai.meituan.location.collector.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    List<b> b;
    private Handler c;

    /* loaded from: classes4.dex */
    public interface b {
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a27e0c78100f4266edde381af7bca33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a27e0c78100f4266edde381af7bca33");
            return;
        }
        this.b = new ArrayList();
        this.c = new a(this);
    }

    private File b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28738b5957fca9e9e855763c82dc5f35", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28738b5957fca9e9e855763c82dc5f35");
        }
        try {
            x.a(com.sankuai.meituan.location.collector.b.c(), com.meituan.android.common.locate.util.a.a, u.e, "locationRecordDir");
            File a2 = q.a(com.sankuai.meituan.location.collector.b.c(), com.meituan.android.common.locate.util.a.a, "locationRecordDir", u.e);
            if (a2.exists()) {
                return a2;
            }
            if (a2.mkdirs()) {
                return a2;
            }
            return null;
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        public c b;

        public a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f82e8a0736176b0fbaa86678e27010", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f82e8a0736176b0fbaa86678e27010");
            } else {
                this.b = cVar;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91579fd8f07f984ebbbd77c833b52504", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91579fd8f07f984ebbbd77c833b52504");
                return;
            }
            super.handleMessage(message);
            if (this.b == null) {
                LogUtils.a("CollectorFileManager handleMessage collectorFileManager null");
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (b bVar : this.b.b) {
                    arrayList.add(bVar);
                }
                int i = message.what;
                if (i != 1) {
                    if (i != 3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                Bundle data = message.getData();
                if (data == null || ((File) data.getSerializable("recordFile")) == null) {
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
            }
        }
    }

    public final File a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffa66b71c64aa594f8341bad9ec1123", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffa66b71c64aa594f8341bad9ec1123");
        }
        File b2 = b();
        if (b2 == null) {
            LogUtils.a("CollectorFileManager getLastRecord init fail");
            return null;
        }
        File file = new File(b2.getAbsolutePath(), "lastData");
        LogUtils.a("lastData path :" + file.getAbsolutePath());
        if (file.exists()) {
            file.delete();
        }
        String absolutePath = b().getAbsolutePath();
        File file2 = new File(absolutePath, h.a(com.sankuai.meituan.location.collector.b.c()).b + "reverseLastData");
        StringBuilder sb = new StringBuilder("reverseLastData path :");
        sb.append(file2.getAbsolutePath());
        LogUtils.a(sb.toString());
        if (file2.exists()) {
            return file2;
        }
        try {
            if (file2.createNewFile()) {
                return file2;
            }
        } catch (IOException e) {
            LogUtils.a(getClass(), e);
        }
        LogUtils.a("CollectorFileManager getLastRecord fail");
        return null;
    }
}
