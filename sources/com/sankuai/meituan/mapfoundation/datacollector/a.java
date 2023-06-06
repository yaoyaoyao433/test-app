package com.sankuai.meituan.mapfoundation.datacollector;

import android.content.Context;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static boolean b;
    private static int c;

    static {
        try {
            Statistics.isInitialized();
            b = true;
        } catch (Throwable unused) {
            b = false;
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46f69cd9f08a11d444271a5519bc9406", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46f69cd9f08a11d444271a5519bc9406") : Statistics.getPageName(str);
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a03be5f779df29bd160f3a11c949daab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a03be5f779df29bd160f3a11c949daab");
        }
        if (b) {
            return AppUtil.generatePageInfoKey(context);
        }
        if (context == null) {
            return "";
        }
        return context.getClass().getSimpleName() + context.hashCode();
    }

    public static void a(int i) {
        c = i;
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d91bbb720414bf2b44a0416654e31c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d91bbb720414bf2b44a0416654e31c");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(bVar.a).writeModelView(bVar.b, bVar.c, bVar.e, bVar.d);
        }
    }

    public static void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85ea26399cb50ddd906be8294dd3864a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85ea26399cb50ddd906be8294dd3864a");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(bVar.a).writeModelClick(bVar.b, bVar.c, bVar.e, bVar.d);
        }
    }

    public static void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "556c2593152370e16e0ca9c7f586bad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "556c2593152370e16e0ca9c7f586bad8");
        } else {
            com.dianping.codelog.b.b(cls, str, str2);
        }
    }

    public static void a(int i, c cVar) {
        Object[] objArr = {Integer.valueOf((int) TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6effee749db18b4490bdea97d427a9bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6effee749db18b4490bdea97d427a9bc");
        } else if (cVar.b != null && !cVar.b.isEmpty() && com.sankuai.meituan.mapfoundation.base.a.b != null) {
            m mVar = new m(TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED, com.sankuai.meituan.mapfoundation.base.a.b);
            if (cVar.a != null && !cVar.a.isEmpty()) {
                for (String str : cVar.a.keySet()) {
                    mVar.a(str, cVar.a.get(str));
                }
            }
            for (String str2 : cVar.b.keySet()) {
                mVar.a(str2, Collections.singletonList(cVar.b.get(str2)));
            }
            mVar.a();
        }
    }
}
