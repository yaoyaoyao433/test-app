package com.sankuai.mads.internal.tracker;

import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/sankuai/mads/internal/tracker/TrackInfo;", "", ShieldMonitorKey.TAG_BUSINESS, "", ShowLogJsHandler.PARAM_NAME_MODULE, "type", "desc", SnifferDBHelper.COLUMN_LOG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusiness", "()Ljava/lang/String;", "getDesc", "getLog", "getModule", "getType", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @NotNull
    final String b;
    @NotNull
    final String c;
    @Nullable
    final String d;
    @Nullable
    final String e;
    @Nullable
    final String f;

    private a(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        h.b(str, ShieldMonitorKey.TAG_BUSINESS);
        h.b(str2, ShowLogJsHandler.PARAM_NAME_MODULE);
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06389bb120d5c60ed32d584129ba7e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06389bb120d5c60ed32d584129ba7e2");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, int i, f fVar) {
        this("mads", str2, str3, str4, str5);
    }
}
