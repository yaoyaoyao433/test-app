package com.dianping.base.push.pushservice;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class k {
    public static ChangeQuickRedirect a = null;
    private static final String b = "k";
    private static k c;
    private static Context d;
    private j e;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void a(com.dianping.base.push.pushservice.k r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.k.a(com.dianping.base.push.pushservice.k, java.lang.String):void");
    }

    private k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78631f47600702991964a0997107a79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78631f47600702991964a0997107a79");
            return;
        }
        d = context;
        try {
            this.e = new j(context);
        } catch (Throwable th) {
            c.d(b, th.toString());
        }
    }

    public static synchronized k a(Context context) {
        synchronized (k.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c4a5140bd2e27f10e82885a412f22ba", RobustBitConfig.DEFAULT_VALUE)) {
                return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c4a5140bd2e27f10e82885a412f22ba");
            }
            if (c == null) {
                synchronized (k.class) {
                    if (c == null) {
                        c = new k(context);
                    }
                }
            }
            return c;
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d5075068eb0c987424e795a1091f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d5075068eb0c987424e795a1091f43");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("channel", Integer.valueOf(a()));
            hashMap.put("url", str2);
            hashMap.put("token", f.d(d));
            Statistics.getChannel().writeModelView("", str, hashMap, "c_group_4lnmt8fq");
        } catch (Exception e) {
            String str3 = b;
            c.b(str3, "sendStatistics data error: " + e.toString());
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cfc989f5c89d5e135c1b754368dfb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cfc989f5c89d5e135c1b754368dfb5")).intValue();
        }
        if (com.dianping.base.push.pushservice.util.e.c()) {
            return 4;
        }
        if (com.dianping.base.push.pushservice.util.e.f()) {
            return 8;
        }
        return com.dianping.base.push.pushservice.util.e.d() ? 9 : -1;
    }

    public final synchronized void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3011a4ad3149b34720faf76f5b54b3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3011a4ad3149b34720faf76f5b54b3b2");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.dianping.base.push.pushservice.util.h.a(), new Runnable() { // from class: com.dianping.base.push.pushservice.k.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bc9fdcdab8e05b4e2f7ec7fa98d2ad4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bc9fdcdab8e05b4e2f7ec7fa98d2ad4");
                    } else {
                        k.a(k.this, str);
                    }
                }
            });
        }
    }

    private void a(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0bb39696e2e4f644b06a1f6d26a5de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0bb39696e2e4f644b06a1f6d26a5de");
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            a("b_group_877diobi_mv", it.next());
        }
    }
}
