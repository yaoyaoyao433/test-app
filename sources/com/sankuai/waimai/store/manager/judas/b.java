package com.sankuai.waimai.store.manager.judas;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.util.monitor.monitor.JudasMonitor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static SparseArray<String> b = new SparseArray<>();

    public static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f11b4c5895553aa08a11338cbf219d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f11b4c5895553aa08a11338cbf219d4c");
        } else {
            b.put(i, str);
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bed53bde3293fa5422064eeeeaf0c9cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bed53bde3293fa5422064eeeeaf0c9cb");
        } else {
            b.remove(i);
        }
    }

    private static String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "881966d418fd6bb99ae9c8198b03c4f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "881966d418fd6bb99ae9c8198b03c4f0") : b.get(i);
    }

    public static com.sankuai.waimai.store.callback.a a(Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80730b19f7049dfc9f3f012734a9ff69", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80730b19f7049dfc9f3f012734a9ff69");
        }
        String[] c = c(context, str);
        return a(c[0], c[1], str);
    }

    public static com.sankuai.waimai.store.callback.a b(Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7291dc1dbcdd31e7d3676ce4d06a608", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7291dc1dbcdd31e7d3676ce4d06a608");
        }
        String[] c = c(context, str);
        return b(c[0], c[1], str);
    }

    @Deprecated
    public static com.sankuai.waimai.store.callback.a a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e66414ea697b7eacf97ba69fc3998a8e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e66414ea697b7eacf97ba69fc3998a8e") : a(str, null, str2);
    }

    @Deprecated
    public static com.sankuai.waimai.store.callback.a b(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f909b13993b76578801ed1b9f1aaf6f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f909b13993b76578801ed1b9f1aaf6f") : b(str, null, str2);
    }

    @Deprecated
    public static com.sankuai.waimai.store.callback.a c(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e03847da40c56ce7d70c4246b9b88b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e03847da40c56ce7d70c4246b9b88b2c");
        }
        Object[] objArr2 = {str, null, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "044839fef11da83d8464ac8fff499802", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "044839fef11da83d8464ac8fff499802");
        }
        c cVar = new c(EventName.MODEL_VIEW, str, str2);
        cVar.b = null;
        return cVar;
    }

    public static com.sankuai.waimai.store.callback.a a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d915357a45c0d95fcb5375164b373993", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d915357a45c0d95fcb5375164b373993");
        }
        c cVar = new c(EventName.CLICK, str, str3);
        cVar.b = str2;
        return cVar;
    }

    public static com.sankuai.waimai.store.callback.a b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecb9dfe75ed9bbd1aa6724dad232fa92", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecb9dfe75ed9bbd1aa6724dad232fa92");
        }
        c cVar = new c(EventName.MODEL_VIEW, str, str3);
        cVar.b = str2;
        return cVar;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75c66b133cc884889c7509f5122891af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75c66b133cc884889c7509f5122891af");
        }
        String b2 = b(context);
        Object[] objArr2 = {context, b2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26787b94ca2139ecf6298578316537d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26787b94ca2139ecf6298578316537d1");
        } else if (TextUtils.isEmpty(b2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("root=");
            sb.append(context);
            for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof BaseMemberActivity) {
                    BaseMemberActivity baseMemberActivity = (BaseMemberActivity) context2;
                    com.sankuai.waimai.store.base.vessel.a aVar = baseMemberActivity.b;
                    if (aVar != null) {
                        String d = aVar.d();
                        sb.append(",out1=");
                        sb.append(d);
                        sb.append(",delegate=");
                        sb.append(aVar);
                    } else {
                        String b3 = baseMemberActivity.b();
                        sb.append(",out2=");
                        sb.append(b3);
                        sb.append(",basememberactivity=");
                        sb.append(context2);
                    }
                } else if (context2 instanceof SCBaseActivity) {
                    String b4 = ((SCBaseActivity) context2).b();
                    sb.append(",out3=");
                    sb.append(b4);
                    sb.append(",context=");
                    sb.append(context2);
                } else {
                    sb.append(",unknown-tmp=");
                    sb.append(context2);
                }
            }
            sb.append(",stackTrace=");
            sb.append(a());
            com.sankuai.waimai.store.util.monitor.c.a(JudasMonitor.ContextErrorException, sb.toString(), context == null ? MonitorManager.CONTEXT_IS_NULL_MSG : context.getClass().getName());
            com.sankuai.shangou.stone.util.log.a.a("content=" + sb.toString(), new Object[0]);
        }
        return b2;
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab264f4d2f3003997d7a0550497c6134", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab264f4d2f3003997d7a0550497c6134");
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                sb.append(stackTraceElement.getClassName());
                sb.append("#");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":L");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(");");
            }
        }
        return sb.toString();
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0b0b2ac561d48a480bdd6011dd42487", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0b0b2ac561d48a480bdd6011dd42487");
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof SCBaseActivity) {
                return ((SCBaseActivity) context).b();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return "";
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b46c61f045332c76c45dda22f538cec9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b46c61f045332c76c45dda22f538cec9") : AppUtil.generatePageInfoKey(obj);
    }

    public static String[] c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bff66326ab6ad50603ad7453ef9e6db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bff66326ab6ad50603ad7453ef9e6db");
        }
        String[] strArr = {"", ""};
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            } else if (context2 instanceof SCBaseActivity) {
                SCBaseActivity sCBaseActivity = (SCBaseActivity) context2;
                strArr[0] = sCBaseActivity.b();
                strArr[1] = sCBaseActivity.d();
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        if (TextUtils.isEmpty(strArr[0]) && context != null) {
            strArr[0] = b(context.hashCode());
            if (TextUtils.isEmpty(strArr[0]) && (context instanceof ContextWrapper)) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext() != null) {
                    strArr[0] = b(contextWrapper.getBaseContext().hashCode());
                }
            }
            strArr[1] = a((Object) context);
        }
        if (TextUtils.isEmpty(strArr[1])) {
            if (k.a()) {
                throw new IllegalArgumentException("Bid: " + str + ", PageInfoKey is empty. context instance must be either BaseMemberActivity or SCBaseActivity");
            } else if (!TextUtils.isEmpty(str)) {
                JudasMonitor judasMonitor = JudasMonitor.PageInfoKeyEmptyException;
                com.sankuai.waimai.store.util.monitor.c.a(judasMonitor, "cid=" + strArr[0] + ",bid=" + str + ",pageInfoKey=" + strArr[1], context == null ? MonitorManager.CONTEXT_IS_NULL_MSG : context.getClass().getName());
            }
        }
        return strArr;
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2aa2df03e29f13133ea8885642105b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2aa2df03e29f13133ea8885642105b2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, map);
        Statistics.getChannel().updateTag("waimai", hashMap);
    }
}
