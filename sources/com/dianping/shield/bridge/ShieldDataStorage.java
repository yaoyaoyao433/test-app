package com.dianping.shield.bridge;

import android.content.Context;
import android.content.SharedPreferences;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0017¨\u0006\f"}, d2 = {"Lcom/dianping/shield/bridge/ShieldDataStorage;", "", "()V", "getSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "key", "", JsBridgeResult.ARG_KEY_LOCATION_MODE, "", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldDataStorage {
    public static final Companion Companion = new Companion(null);
    private static final int MODE_MULTI_PROCESS = 4;
    private static final int MODE_PRIVATE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int getMODE_MULTI_PROCESS() {
        return MODE_MULTI_PROCESS;
    }

    public static final int getMODE_PRIVATE() {
        return MODE_PRIVATE;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/bridge/ShieldDataStorage$Companion;", "", "()V", "MODE_MULTI_PROCESS", "", "MODE_MULTI_PROCESS$annotations", "getMODE_MULTI_PROCESS", "()I", "MODE_PRIVATE", "MODE_PRIVATE$annotations", "getMODE_PRIVATE", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        public static /* synthetic */ void MODE_MULTI_PROCESS$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void MODE_PRIVATE$annotations() {
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final int getMODE_PRIVATE() {
            return ShieldDataStorage.MODE_PRIVATE;
        }

        public final int getMODE_MULTI_PROCESS() {
            return ShieldDataStorage.MODE_MULTI_PROCESS;
        }
    }

    @JvmOverloads
    @NotNull
    public SharedPreferences getSharedPreferences(@NotNull Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5275a7cc3cdd732c189411d6036d7a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5275a7cc3cdd732c189411d6036d7a1");
        }
        h.b(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, MODE_MULTI_PROCESS);
        h.a((Object) sharedPreferences, "context.getSharedPrefere…s(key,MODE_MULTI_PROCESS)");
        return sharedPreferences;
    }

    @JvmOverloads
    @NotNull
    public SharedPreferences getSharedPreferences(@NotNull Context context, @Nullable String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f0a0916e3dbeffdf9c48c07b4ddd680", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f0a0916e3dbeffdf9c48c07b4ddd680");
        }
        h.b(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
        h.a((Object) sharedPreferences, "context.getSharedPreferences(key,mode)");
        return sharedPreferences;
    }
}
