package com.meituan.ai.speech.base.log;

import android.support.annotation.Keep;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\u001a.\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\b\u001a&\u0010\t\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\u001a.\u0010\t\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\b\u001a&\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\u001a.\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"spLogD", "", "T", "", "msg", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "tag", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "spLogE", "spLogW", "speech-base_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class SPLogKt {
    public static ChangeQuickRedirect a;

    @Keep
    private static final <T> void spLogE(@NotNull T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00081eef4f93cdab7379dee7d58714f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00081eef4f93cdab7379dee7d58714f");
            return;
        }
        String simpleName = t.getClass().getSimpleName();
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
            Log.e("[" + simpleName + ']', str);
        }
    }

    @Keep
    private static final <T> void spLogE(@NotNull T t, String str, String str2) {
        Object[] objArr = {t, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e8959a177689d96e929f71677958f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e8959a177689d96e929f71677958f3b");
        } else if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
            Log.e("[" + str + ']', str2);
        }
    }

    @Keep
    private static final <T> void spLogW(@NotNull T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4177d5e7e10fed0260d2c71ac18bea8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4177d5e7e10fed0260d2c71ac18bea8d");
            return;
        }
        String simpleName = t.getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
    }

    @Keep
    private static final <T> void spLogW(@NotNull T t, String str, String str2) {
        Object[] objArr = {t, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b39c4e76bc0148c8ee55d91d8935998a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b39c4e76bc0148c8ee55d91d8935998a");
        } else if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append(']');
        }
    }

    @Keep
    private static final <T> void spLogD(@NotNull T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47d769d5c24255959adbe76b795cacbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47d769d5c24255959adbe76b795cacbc");
            return;
        }
        String simpleName = t.getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
    }

    @Keep
    private static final <T> void spLogD(@NotNull T t, String str, String str2) {
        Object[] objArr = {t, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4a08a8d4c5e4c45669b6291ccdbd185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4a08a8d4c5e4c45669b6291ccdbd185");
        } else if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append(']');
        }
    }
}
