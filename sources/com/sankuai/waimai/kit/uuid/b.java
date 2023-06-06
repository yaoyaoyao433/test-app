package com.sankuai.waimai.kit.uuid;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.meituan.uuid.UUIDEventLogProvider;
import com.sankuai.waimai.kit.utils.d;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static AtomicBoolean c = new AtomicBoolean(false);
    private static String d = null;
    private static Queue<com.sankuai.waimai.kit.uuid.a> e = new ConcurrentLinkedQueue();

    private static void a(Context context, com.sankuai.waimai.kit.uuid.a aVar, boolean z) {
        Object[] objArr = {context, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4586d9f04ce8648fb6bec02bff62a144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4586d9f04ce8648fb6bec02bff62a144");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2eb7680dad8dfa399a358f67180736a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2eb7680dad8dfa399a358f67180736a1");
        } else if (!b) {
            GetUUID.init(new UUIDEventLogProvider() { // from class: com.sankuai.waimai.kit.uuid.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.uuid.UUIDEventLogProvider
                public final void commonInfoReport(String str) {
                }

                @Override // com.meituan.uuid.UUIDEventLogProvider
                public final void throwableReport(Throwable th) {
                }

                @Override // com.meituan.uuid.UUIDEventLogProvider
                public final void getUUIDReturnReport(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cc531e82054a6c636b43fedcd4c260a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cc531e82054a6c636b43fedcd4c260a");
                    } else {
                        Statistics.setUUID(str);
                    }
                }
            });
            b = true;
        }
        if (z) {
            a(context);
        }
        if (aVar != null) {
            if (!TextUtils.isEmpty(d)) {
                aVar.a(context, d);
            }
            e.add(aVar);
        }
        if (c.compareAndSet(false, true)) {
            d.a(new a(context), (String) null);
        }
    }

    public static void a(Context context, com.sankuai.waimai.kit.uuid.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76138b25e496c0f9a3dfd8b7d580db9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76138b25e496c0f9a3dfd8b7d580db9b");
        } else {
            a(context, aVar, true);
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cf4fe22f9902ff373a4ec58565eeca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cf4fe22f9902ff373a4ec58565eeca6");
        }
        if (TextUtils.isEmpty(d)) {
            String a2 = com.sankuai.waimai.kit.utils.a.a(context);
            if (!TextUtils.isEmpty(a2)) {
                d = a2;
                Statistics.setUUID(a2);
            }
            a(context, null, false);
        }
        return d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends d.a {
        public static ChangeQuickRedirect a;
        private final Context b;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60aed55122c66b56d05facbd0e6120e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60aed55122c66b56d05facbd0e6120e");
            } else {
                this.b = context;
            }
        }

        @Override // com.sankuai.waimai.kit.utils.d.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcbf55164e97ebb7f1835bd9e8fe3a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcbf55164e97ebb7f1835bd9e8fe3a5");
            } else {
                b.c.set(false);
            }
        }

        @Override // com.sankuai.waimai.kit.utils.d.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28dc9f0ec4e324183e5bff85e782aa45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28dc9f0ec4e324183e5bff85e782aa45");
                return;
            }
            try {
                String uuid = GetUUID.getInstance().getUUID(this.b);
                if (!TextUtils.isEmpty(uuid)) {
                    for (com.sankuai.waimai.kit.uuid.a aVar = (com.sankuai.waimai.kit.uuid.a) b.e.poll(); aVar != null; aVar = (com.sankuai.waimai.kit.uuid.a) b.e.poll()) {
                        if (!TextUtils.equals(uuid, b.d)) {
                            aVar.a(this.b, uuid);
                        }
                    }
                    Context context = this.b;
                    Object[] objArr2 = {context, uuid};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.kit.utils.a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a2a1817fc26e7eb9fef357d856002907", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a2a1817fc26e7eb9fef357d856002907");
                    } else {
                        com.sankuai.waimai.kit.utils.a.a(context, "a_uuid", uuid);
                    }
                    Statistics.setUUID(uuid);
                }
                String unused = b.d = uuid;
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
