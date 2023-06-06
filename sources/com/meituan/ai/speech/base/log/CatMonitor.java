package com.meituan.ai.speech.base.log;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.dianping.monitor.impl.m;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJJ\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\u00130\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00130\u0012H\u0007J\u0094\u0001\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\"\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001ej\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u001f2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001ej\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u001f2\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/meituan/ai/speech/base/log/CatMonitor;", "", "()V", "appId", "", "isInit", "", "monitor", "Lcom/dianping/monitor/impl/BaseMonitorService;", "uuid", "", "init", "", "context", "Landroid/content/Context;", "catAppId", "uploadCustomIndicator", "params", "", "Lkotlin/Pair;", "", "tags", "uploadNetIndicator", "code", ProtoConstant.COMMAND, "requestBytes", "responseBytes", "responseTime", "url", "headerReq", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headerResp", "samplingRate", "extend", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class CatMonitor {
    public static final CatMonitor INSTANCE = new CatMonitor();
    private static int appId = TbsListener.ErrorCode.RENAME_SUCCESS;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean isInit;
    private static com.dianping.monitor.impl.a monitor;
    private static String uuid;

    public final void init(@NotNull Context context, int i, @NotNull String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "919af5a7ab95261a8e29b064d09e53b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "919af5a7ab95261a8e29b064d09e53b2");
            return;
        }
        h.b(context, "context");
        h.b(str, "uuid");
        try {
            if (isInit) {
                return;
            }
            uuid = str;
            monitor = new a(str, context, context, appId);
            isInit = true;
        } catch (Exception unused) {
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', "[CAT]Init Exception");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, d2 = {"com/meituan/ai/speech/base/log/CatMonitor$init$1", "Lcom/dianping/monitor/impl/BaseMonitorService;", "getUnionid", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a extends com.dianping.monitor.impl.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String c;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Context context, Context context2, int i) {
            super(context2, i);
            this.c = str;
            this.d = context;
            Object[] objArr = {CatMonitor.this, str, context, context2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb73f9eaa2c85b15db20ecf9cea99f1b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb73f9eaa2c85b15db20ecf9cea99f1b");
            }
        }

        @Override // com.dianping.monitor.impl.a
        @NotNull
        public final String getUnionid() {
            return this.c;
        }
    }

    @Keep
    public final void uploadNetIndicator(int i, @NotNull String str, int i2, int i3, int i4, @Nullable String str2, @NotNull HashMap<String, String> hashMap, @NotNull HashMap<String, String> hashMap2, int i5, @Nullable String str3) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, hashMap, hashMap2, Integer.valueOf(i5), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4307e8a3533f55a70690649d41f027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4307e8a3533f55a70690649d41f027");
            return;
        }
        h.b(str, ProtoConstant.COMMAND);
        h.b(hashMap, "headerReq");
        h.b(hashMap2, "headerResp");
        if (isInit) {
            try {
                com.dianping.monitor.impl.a aVar = monitor;
                if (aVar != null) {
                    aVar.pvCat(System.currentTimeMillis(), str, 0, 8, 8, i, i2, i3, i4, null, null, i5, str2, str2, "POST", hashMap, hashMap2, null, str3);
                }
            } catch (Exception unused) {
                String simpleName = getClass().getSimpleName();
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                    Log.e("[" + simpleName + ']', "[CAT]Net API Exception");
                }
            }
        }
    }

    @Keep
    public final void uploadCustomIndicator(@NotNull Context context, @NotNull List<? extends k<String, ? extends List<Float>>> list, @NotNull List<k<String, String>> list2) {
        Object[] objArr = {context, list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ed2cc2d0a25c5349b21f65d4fbef3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ed2cc2d0a25c5349b21f65d4fbef3fc");
            return;
        }
        h.b(context, "context");
        h.b(list, "params");
        h.b(list2, "tags");
        try {
            int i = appId;
            String str = uuid;
            if (str == null) {
                h.a("uuid");
            }
            m mVar = new m(i, context, str);
            for (k<String, ? extends List<Float>> kVar : list) {
                mVar.a(kVar.a, (List) kVar.b);
            }
            for (k<String, String> kVar2 : list2) {
                mVar.a(kVar2.a, kVar2.b);
            }
            mVar.a("os", "android");
            mVar.a();
        } catch (Exception unused) {
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', "[CAT]Custom Monitor Exception");
            }
        }
    }
}
