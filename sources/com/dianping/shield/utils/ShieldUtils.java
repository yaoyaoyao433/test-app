package com.dianping.shield.utils;

import com.dianping.agentsdk.framework.AgentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0003J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/utils/ShieldUtils;", "", "()V", "IMPORTED_CONTAINER_PREFIX", "", "getIMPORTED_CONTAINER_PREFIX$shieldCore_release", "()Ljava/lang/String;", "IMPORTED_DIVIDER", "getIMPORTED_DIVIDER$shieldCore_release", "IMPORTED_PREFIX", "getIMPORTED_PREFIX$shieldCore_release", "IMPORTED_SCROLLTAB_PREFIX", "getIMPORTED_SCROLLTAB_PREFIX$shieldCore_release", "IMPORTED_TAB_PREFIX", "getIMPORTED_TAB_PREFIX$shieldCore_release", "getHostKey", "agentInterface", "Lcom/dianping/agentsdk/framework/AgentInterface;", "getImportedHostKey", "hostKey", "prefix", "getRealHostKey", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ShieldUtils INSTANCE = new ShieldUtils();
    @NotNull
    private static final String IMPORTED_DIVIDER = IMPORTED_DIVIDER;
    @NotNull
    private static final String IMPORTED_DIVIDER = IMPORTED_DIVIDER;
    @NotNull
    private static final String IMPORTED_PREFIX = IMPORTED_PREFIX;
    @NotNull
    private static final String IMPORTED_PREFIX = IMPORTED_PREFIX;
    @NotNull
    private static final String IMPORTED_TAB_PREFIX = IMPORTED_TAB_PREFIX;
    @NotNull
    private static final String IMPORTED_TAB_PREFIX = IMPORTED_TAB_PREFIX;
    @NotNull
    private static final String IMPORTED_CONTAINER_PREFIX = IMPORTED_CONTAINER_PREFIX;
    @NotNull
    private static final String IMPORTED_CONTAINER_PREFIX = IMPORTED_CONTAINER_PREFIX;
    @NotNull
    private static final String IMPORTED_SCROLLTAB_PREFIX = "GCPicassoImportedModule/picassoscrolltab_";

    @NotNull
    public final String getIMPORTED_DIVIDER$shieldCore_release() {
        return IMPORTED_DIVIDER;
    }

    @NotNull
    public final String getIMPORTED_PREFIX$shieldCore_release() {
        return IMPORTED_PREFIX;
    }

    @NotNull
    public final String getIMPORTED_TAB_PREFIX$shieldCore_release() {
        return IMPORTED_TAB_PREFIX;
    }

    @NotNull
    public final String getIMPORTED_CONTAINER_PREFIX$shieldCore_release() {
        return IMPORTED_CONTAINER_PREFIX;
    }

    @NotNull
    public final String getIMPORTED_SCROLLTAB_PREFIX$shieldCore_release() {
        return IMPORTED_SCROLLTAB_PREFIX;
    }

    @JvmStatic
    @NotNull
    public static final String getHostKey(@Nullable AgentInterface agentInterface) {
        String realHostKey;
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b10f0f3164146a5309958918cc07e9a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b10f0f3164146a5309958918cc07e9a4");
        }
        if (agentInterface != null) {
            String hostName = agentInterface.getHostName();
            if (hostName == null) {
                hostName = "";
            }
            String str = hostName;
            if (g.a((CharSequence) str, IMPORTED_PREFIX, 0, false, 6, (Object) null) != -1) {
                realHostKey = getImportedHostKey(hostName, IMPORTED_PREFIX);
            } else if (g.a((CharSequence) str, IMPORTED_TAB_PREFIX, 0, false, 6, (Object) null) != -1) {
                realHostKey = getImportedHostKey(hostName, IMPORTED_TAB_PREFIX);
            } else if (g.a((CharSequence) str, IMPORTED_CONTAINER_PREFIX, 0, false, 6, (Object) null) != -1) {
                realHostKey = getImportedHostKey(hostName, IMPORTED_CONTAINER_PREFIX);
            } else if (g.a((CharSequence) str, IMPORTED_SCROLLTAB_PREFIX, 0, false, 6, (Object) null) != -1) {
                realHostKey = getImportedHostKey(hostName, IMPORTED_SCROLLTAB_PREFIX);
            } else {
                realHostKey = getRealHostKey(hostName);
            }
            if (realHostKey != null) {
                return realHostKey;
            }
        }
        return "";
    }

    @JvmStatic
    private static final String getImportedHostKey(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "52ddc31289a3f47b656097de8c9ab285", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "52ddc31289a3f47b656097de8c9ab285");
        }
        String str3 = str;
        int a = g.a((CharSequence) str3, str2, 0, false, 6, (Object) null);
        int a2 = g.a((CharSequence) str3, IMPORTED_DIVIDER, 0, false, 6, (Object) null);
        if (a == -1 || a2 == -1 || a2 < str2.length() + a) {
            return str;
        }
        int length = a + str2.length();
        if (str != null) {
            String substring = str.substring(length, a2);
            h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new o("null cannot be cast to non-null type java.lang.String");
    }

    @JvmStatic
    private static final String getRealHostKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9e754390dbd8cb70437217f67137115", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9e754390dbd8cb70437217f67137115");
        }
        String str2 = str;
        if (g.b(str2, "@", 0, false, 6, null) != -1) {
            int b = g.b(str2, "@", 0, false, 6, null) + 1;
            if (str == null) {
                throw new o("null cannot be cast to non-null type java.lang.String");
            }
            str = str.substring(b);
            h.a((Object) str, "(this as java.lang.String).substring(startIndex)");
        }
        String str3 = str;
        if (g.a((CharSequence) str3, "#", 0, false, 6, (Object) null) != -1) {
            int a = g.a((CharSequence) str3, "#", 0, false, 6, (Object) null);
            if (str != null) {
                String substring = str.substring(0, a);
                h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new o("null cannot be cast to non-null type java.lang.String");
        }
        return str;
    }
}
