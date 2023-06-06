package com.dianping.shield.monitor;

import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.AgentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/monitor/ShieldMonitorUtil;", "", "()V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldMonitorUtil {
    private static final String COMMON_DIVIDER = "|";
    public static final Companion Companion = new Companion(null);
    public static final int MODULE_CONSTRUCT = 1;
    public static final int MODULE_CREATE = 2;
    public static final int MODULE_PAINTING = 3;
    public static final int MODULE_UNKNOWN = 0;
    public static final int PAGE_CREATE = 1;
    private static final String PAGE_DIVIDER = "~";
    public static final int PAGE_PAINTING = 3;
    public static final int PAGE_UNKNOWN = 0;
    public static final int PAGE_UPDATE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    @JvmStatic
    @Nullable
    public static final String formatBusiness(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6170bb9fbd23fb719d58d51b77f4d2a9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6170bb9fbd23fb719d58d51b77f4d2a9") : Companion.formatBusiness(str);
    }

    @JvmStatic
    @Nullable
    public static final String formatModuleKey(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "512ff26b716889f54c9375c69ca80312", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "512ff26b716889f54c9375c69ca80312") : Companion.formatModuleKey(str);
    }

    @JvmStatic
    @NotNull
    public static final String getModuleKey(@NotNull Fragment fragment, @NotNull AgentInterface agentInterface, int i) {
        Object[] objArr = {fragment, agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9584d8a34a9ac6729600dd531e2ec720", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9584d8a34a9ac6729600dd531e2ec720") : Companion.getModuleKey(fragment, agentInterface, i);
    }

    @JvmStatic
    @NotNull
    public static final String getModuleKey(@NotNull String str, @NotNull String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6e36bcfdd26664b50eb150fedc5faf1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6e36bcfdd26664b50eb150fedc5faf1") : Companion.getModuleKey(str, str2, i);
    }

    @JvmStatic
    @NotNull
    public static final String getModuleKey(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e03cc311758d6c989cfd03501ee6421", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e03cc311758d6c989cfd03501ee6421") : Companion.getModuleKey(str, str2, str3);
    }

    @JvmStatic
    @NotNull
    public static final String getPageKey(@NotNull Fragment fragment, int i) {
        Object[] objArr = {fragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3674eab8bdcbdf6f56be7d20fc504ec5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3674eab8bdcbdf6f56be7d20fc504ec5") : Companion.getPageKey(fragment, i);
    }

    @JvmStatic
    @NotNull
    public static final String getPageKey(@NotNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5018b1881f178e776156bbd461d62d05", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5018b1881f178e776156bbd461d62d05") : Companion.getPageKey(str, i);
    }

    @JvmStatic
    @NotNull
    public static final String getPageKey(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b44d80eeab8c775f02931276dbb0eba0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b44d80eeab8c775f02931276dbb0eba0") : Companion.getPageKey(str, str2);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0007J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0007J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006H\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/monitor/ShieldMonitorUtil$Companion;", "", "()V", "COMMON_DIVIDER", "", "MODULE_CONSTRUCT", "", "MODULE_CREATE", "MODULE_PAINTING", "MODULE_UNKNOWN", "PAGE_CREATE", "PAGE_DIVIDER", "PAGE_PAINTING", "PAGE_UNKNOWN", "PAGE_UPDATE", "formatBusiness", ShieldMonitorKey.TAG_BUSINESS, "formatModuleKey", "key", "getModuleKey", "fragment", "Landroid/support/v4/app/Fragment;", "agentInterface", "Lcom/dianping/agentsdk/framework/AgentInterface;", "type", "businessVC", "businessAgent", "specific", "getPageKey", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getPageKey(@NotNull String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b1320218ffadb842d84fd4166646f45", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b1320218ffadb842d84fd4166646f45");
            }
            h.b(str, ShieldMonitorKey.TAG_BUSINESS);
            switch (i) {
                case 1:
                    return "MFController~" + str + "~create";
                case 2:
                    return "MFController~" + str + "~update";
                case 3:
                    return "MFController~" + str + "~painting";
                default:
                    return "MFController~" + str + "~unknown";
            }
        }

        @JvmStatic
        @NotNull
        public final String getModuleKey(@NotNull String str, @NotNull String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "644e8ce9b3b37cde5437c5aa187ea781", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "644e8ce9b3b37cde5437c5aa187ea781");
            }
            h.b(str, "businessVC");
            h.b(str2, "businessAgent");
            switch (i) {
                case 1:
                    return "MFModule~" + str + '|' + str2 + "~construct";
                case 2:
                    return "MFModule~" + str + '|' + str2 + "~create";
                case 3:
                    return "MFModule~" + str + '|' + str2 + "~painting";
                default:
                    return "MFModule~" + str + '|' + str2 + "~unknown";
            }
        }

        @JvmStatic
        @NotNull
        public final String getPageKey(@NotNull String str, @NotNull String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8f3b62ab3a49dd6765857308acc0073", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8f3b62ab3a49dd6765857308acc0073");
            }
            h.b(str, ShieldMonitorKey.TAG_BUSINESS);
            h.b(str2, "specific");
            return "MFController~" + str + '~' + str2;
        }

        @JvmStatic
        @NotNull
        public final String getModuleKey(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e4ebd830bfb032a876345e188db7d2", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e4ebd830bfb032a876345e188db7d2");
            }
            h.b(str, "businessVC");
            h.b(str2, "businessAgent");
            h.b(str3, "specific");
            return "MFModule~" + str + '|' + str2 + '~' + str3;
        }

        @JvmStatic
        @NotNull
        public final String getPageKey(@NotNull Fragment fragment, int i) {
            Object[] objArr = {fragment, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "324eff1d9b960e339de7f7bb5ec4204a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "324eff1d9b960e339de7f7bb5ec4204a");
            }
            h.b(fragment, "fragment");
            if (fragment instanceof ShieldGAInterface) {
                Companion companion = this;
                String business = ((ShieldGAInterface) fragment).getShieldGAInfo().getBusiness();
                if (business == null) {
                    business = fragment.getClass().getName();
                    h.a((Object) business, "fragment.javaClass.name");
                }
                return companion.getPageKey(business, i);
            }
            String name = fragment.getClass().getName();
            h.a((Object) name, "fragment.javaClass.name");
            return getPageKey(name, i);
        }

        @JvmStatic
        @NotNull
        public final String getModuleKey(@NotNull Fragment fragment, @NotNull AgentInterface agentInterface, int i) {
            Object[] objArr = {fragment, agentInterface, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f293926663d1509a079afd77b39f7d1c", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f293926663d1509a079afd77b39f7d1c");
            }
            h.b(fragment, "fragment");
            h.b(agentInterface, "agentInterface");
            if ((fragment instanceof ShieldGAInterface) && (agentInterface instanceof ShieldGAInterface)) {
                Companion companion = this;
                String business = ((ShieldGAInterface) fragment).getShieldGAInfo().getBusiness();
                if (business == null) {
                    business = fragment.getClass().getName();
                    h.a((Object) business, "fragment.javaClass.name");
                }
                String business2 = ((ShieldGAInterface) agentInterface).getShieldGAInfo().getBusiness();
                if (business2 == null) {
                    business2 = agentInterface.getClass().getName();
                    h.a((Object) business2, "agentInterface.javaClass.name");
                }
                return companion.getModuleKey(business, business2, i);
            }
            String name = fragment.getClass().getName();
            h.a((Object) name, "fragment.javaClass.name");
            String name2 = agentInterface.getClass().getName();
            h.a((Object) name2, "agentInterface.javaClass.name");
            return getModuleKey(name, name2, i);
        }

        @JvmStatic
        @Nullable
        public final String formatBusiness(@Nullable String str) {
            boolean z = true;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ccb3473d7e07af397eb3245f4b2eb3b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ccb3473d7e07af397eb3245f4b2eb3b");
            }
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (z || !g.a((CharSequence) str2, (CharSequence) CommonConstant.Symbol.XOR, false)) {
                return str;
            }
            kotlin.text.f fVar = new kotlin.text.f("(\\^mrnmodulesvc\\^)|\\^");
            h.b(str2, TensorConfig.KEY_INPUT_ARRAY);
            h.b("|", "replacement");
            String replaceAll = fVar.a.matcher(str2).replaceAll("|");
            h.a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll;
        }

        @JvmStatic
        @Nullable
        public final String formatModuleKey(@Nullable String str) {
            int a;
            boolean z = false;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39aea576a65d2ce2831f65af7a465f35", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39aea576a65d2ce2831f65af7a465f35");
            }
            String str2 = str;
            if (((str2 == null || str2.length() == 0) ? true : true) || (a = g.a((CharSequence) str2, CommonConstant.Symbol.COLON, 0, false, 6, (Object) null)) <= 0 || a >= str.length() - 1) {
                return str;
            }
            int i = a + 1;
            int length = str.length();
            if (str != null) {
                String substring = str.substring(i, length);
                h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new o("null cannot be cast to non-null type java.lang.String");
        }
    }
}
