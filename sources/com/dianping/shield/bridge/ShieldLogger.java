package com.dianping.shield.bridge;

import android.util.Log;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0017J,\u0010\u0011\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0017J;\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u0017JC\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u001aJ;\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u0017JC\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u001aJ;\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u0017JC\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J;\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u0017JC\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u001aJ;\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u0017JC\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/dianping/shield/bridge/ShieldLogger;", "", "()V", "TAG_DEFAULT", "", "level", "", "getLevel", "()I", "setLevel", "(I)V", "codeLogError", "", "clazz", "Ljava/lang/Class;", "message", "subTag", "codeLogInfo", "d", "tag", SnifferDBHelper.COLUMN_LOG, "obj", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "i", "isLoggable", "", "v", "w", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldLogger {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String TAG_DEFAULT;
    private int level;
    public static final Companion Companion = new Companion(null);
    private static final int VERBOSE = 2;
    private static final int DEBUG = 3;
    private static final int INFO = 4;
    private static final int WARN = 5;
    private static final int ERROR = 6;

    public static final int getDEBUG() {
        return DEBUG;
    }

    public static final int getERROR() {
        return ERROR;
    }

    public static final int getINFO() {
        return INFO;
    }

    public static final int getVERBOSE() {
        return VERBOSE;
    }

    public static final int getWARN() {
        return WARN;
    }

    @JvmOverloads
    public void codeLogError(@Nullable Class<?> cls, @Nullable String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bdfe6165c790dac68210a9cdbc314de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bdfe6165c790dac68210a9cdbc314de");
        } else {
            codeLogError$default(this, cls, str, null, 4, null);
        }
    }

    @JvmOverloads
    public void codeLogInfo(@Nullable Class<?> cls, @Nullable String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb6b74dd8b4e87e42ae791f8681a6858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb6b74dd8b4e87e42ae791f8681a6858");
        } else {
            codeLogInfo$default(this, cls, str, null, 4, null);
        }
    }

    @JvmOverloads
    public void d(@Nullable String str, @NotNull Throwable th, @NotNull Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44b5e3be05e5a7707736b7a0bc306b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44b5e3be05e5a7707736b7a0bc306b22");
        } else {
            d$default(this, null, str, th, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void d(@Nullable String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc92b4c319db9802bb8b9f435bd74c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc92b4c319db9802bb8b9f435bd74c8a");
        } else {
            d$default(this, null, str, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void e(@Nullable String str, @NotNull Throwable th, @NotNull Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21d4a2820bb6d24ed26027b203c64732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21d4a2820bb6d24ed26027b203c64732");
        } else {
            e$default(this, null, str, th, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void e(@Nullable String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b613489a7a28949301d70f27921eb9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b613489a7a28949301d70f27921eb9a");
        } else {
            e$default(this, null, str, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void i(@Nullable String str, @NotNull Throwable th, @NotNull Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46f239b2f423daa83883c885d3ebfbf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46f239b2f423daa83883c885d3ebfbf6");
        } else {
            i$default(this, null, str, th, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void i(@Nullable String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4494f56bb10152b3ff92b33c60fe45bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4494f56bb10152b3ff92b33c60fe45bf");
        } else {
            i$default(this, null, str, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void v(@Nullable String str, @NotNull Throwable th, @NotNull Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1b175fe65d00ffec81995757b2c448d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1b175fe65d00ffec81995757b2c448d");
        } else {
            v$default(this, null, str, th, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void v(@Nullable String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "196dcfebacc0473040c5664820eb00e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "196dcfebacc0473040c5664820eb00e5");
        } else {
            v$default(this, null, str, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void w(@Nullable String str, @NotNull Throwable th, @NotNull Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f90bc1007f73e63bcf612245dacbbfbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f90bc1007f73e63bcf612245dacbbfbb");
        } else {
            w$default(this, null, str, th, objArr, 1, null);
        }
    }

    @JvmOverloads
    public void w(@Nullable String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b90b3b7fb54a45218acf291273a8b145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b90b3b7fb54a45218acf291273a8b145");
        } else {
            w$default(this, null, str, objArr, 1, null);
        }
    }

    public ShieldLogger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca009573020cab4fd99537f57f58313", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca009573020cab4fd99537f57f58313");
            return;
        }
        this.TAG_DEFAULT = "S.H.I.E.L.D";
        this.level = Integer.MAX_VALUE;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/dianping/shield/bridge/ShieldLogger$Companion;", "", "()V", "DEBUG", "", "DEBUG$annotations", "getDEBUG", "()I", "ERROR", "ERROR$annotations", "getERROR", "INFO", "INFO$annotations", "getINFO", "VERBOSE", "VERBOSE$annotations", "getVERBOSE", "WARN", "WARN$annotations", "getWARN", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        public static /* synthetic */ void DEBUG$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void ERROR$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void INFO$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void VERBOSE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void WARN$annotations() {
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final int getVERBOSE() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cc6cd780a9606eb2c690b3ca6bfa497", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cc6cd780a9606eb2c690b3ca6bfa497")).intValue() : ShieldLogger.VERBOSE;
        }

        public final int getDEBUG() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b81d8bf85904c2d35f09406d1709c59", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b81d8bf85904c2d35f09406d1709c59")).intValue() : ShieldLogger.DEBUG;
        }

        public final int getINFO() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e9fbe20105f42986a1ec981cd2c841a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e9fbe20105f42986a1ec981cd2c841a")).intValue() : ShieldLogger.INFO;
        }

        public final int getWARN() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297965a5485c6775de3498775ef23754", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297965a5485c6775de3498775ef23754")).intValue() : ShieldLogger.WARN;
        }

        public final int getERROR() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f767ee019535b801d6e1d33de07f00c2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f767ee019535b801d6e1d33de07f00c2")).intValue() : ShieldLogger.ERROR;
        }
    }

    public final int getLevel() {
        return this.level;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public boolean isLoggable(int i) {
        return i >= this.level;
    }

    @JvmOverloads
    public static /* synthetic */ void v$default(ShieldLogger shieldLogger, String str, String str2, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.v(str, str2, objArr);
    }

    @JvmOverloads
    public void v(@Nullable String str, @Nullable String str2, @NotNull Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cb1f7a9bce24bc535e4a1a13c5eb601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cb1f7a9bce24bc535e4a1a13c5eb601");
            return;
        }
        h.b(objArr, "obj");
        if (VERBOSE >= this.level) {
            if (!(true ^ (objArr.length == 0)) || str2 == null) {
                return;
            }
            w wVar = w.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            h.a((Object) String.format(str2, Arrays.copyOf(copyOf, copyOf.length)), "java.lang.String.format(format, *args)");
        }
    }

    @JvmOverloads
    public static /* synthetic */ void v$default(ShieldLogger shieldLogger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.v(str, str2, th, objArr);
    }

    @JvmOverloads
    public void v(@Nullable String str, @Nullable String str2, @NotNull Throwable th, @NotNull Object... objArr) {
        String str3;
        Object[] objArr2 = {str, str2, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08815217c907508388eff77918499edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08815217c907508388eff77918499edd");
            return;
        }
        h.b(th, "e");
        h.b(objArr, "obj");
        if (VERBOSE >= this.level) {
            if (!(true ^ (objArr.length == 0))) {
                Log.v(str, str2, th);
                return;
            }
            if (str2 != null) {
                w wVar = w.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                h.a((Object) str3, "java.lang.String.format(format, *args)");
            } else {
                str3 = null;
            }
            Log.v(str, str3, th);
        }
    }

    @JvmOverloads
    public static /* synthetic */ void d$default(ShieldLogger shieldLogger, String str, String str2, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.d(str, str2, objArr);
    }

    @JvmOverloads
    public void d(@Nullable String str, @Nullable String str2, @NotNull Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e38e53d207721fe4a93101c67bf18d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e38e53d207721fe4a93101c67bf18d42");
            return;
        }
        h.b(objArr, "obj");
        if (DEBUG >= this.level) {
            if (!(true ^ (objArr.length == 0)) || str2 == null) {
                return;
            }
            w wVar = w.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            h.a((Object) String.format(str2, Arrays.copyOf(copyOf, copyOf.length)), "java.lang.String.format(format, *args)");
        }
    }

    @JvmOverloads
    public static /* synthetic */ void d$default(ShieldLogger shieldLogger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.d(str, str2, th, objArr);
    }

    @JvmOverloads
    public void d(@Nullable String str, @Nullable String str2, @NotNull Throwable th, @NotNull Object... objArr) {
        String str3;
        Object[] objArr2 = {str, str2, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d190ae0c14aef9157af7a48fa30349dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d190ae0c14aef9157af7a48fa30349dd");
            return;
        }
        h.b(th, "e");
        h.b(objArr, "obj");
        if (DEBUG >= this.level) {
            if (!(true ^ (objArr.length == 0))) {
                Log.d(str, str2, th);
                return;
            }
            if (str2 != null) {
                w wVar = w.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                h.a((Object) str3, "java.lang.String.format(format, *args)");
            } else {
                str3 = null;
            }
            Log.d(str, str3, th);
        }
    }

    @JvmOverloads
    public static /* synthetic */ void i$default(ShieldLogger shieldLogger, String str, String str2, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.i(str, str2, objArr);
    }

    @JvmOverloads
    public void i(@Nullable String str, @Nullable String str2, @NotNull Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b484e6b16aa3286e39507776776f67e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b484e6b16aa3286e39507776776f67e");
            return;
        }
        h.b(objArr, "obj");
        if (INFO >= this.level) {
            if (!(true ^ (objArr.length == 0)) || str2 == null) {
                return;
            }
            w wVar = w.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            h.a((Object) String.format(str2, Arrays.copyOf(copyOf, copyOf.length)), "java.lang.String.format(format, *args)");
        }
    }

    @JvmOverloads
    public static /* synthetic */ void i$default(ShieldLogger shieldLogger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.i(str, str2, th, objArr);
    }

    @JvmOverloads
    public void i(@Nullable String str, @Nullable String str2, @NotNull Throwable th, @NotNull Object... objArr) {
        String str3;
        Object[] objArr2 = {str, str2, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73474ee22bc2607a545457a7d58e8ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73474ee22bc2607a545457a7d58e8ec6");
            return;
        }
        h.b(th, "e");
        h.b(objArr, "obj");
        if (INFO >= this.level) {
            if (!(true ^ (objArr.length == 0))) {
                Log.i(str, str2, th);
                return;
            }
            if (str2 != null) {
                w wVar = w.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                h.a((Object) str3, "java.lang.String.format(format, *args)");
            } else {
                str3 = null;
            }
            Log.i(str, str3, th);
        }
    }

    @JvmOverloads
    public static /* synthetic */ void w$default(ShieldLogger shieldLogger, String str, String str2, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.w(str, str2, objArr);
    }

    @JvmOverloads
    public void w(@Nullable String str, @Nullable String str2, @NotNull Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed323f1325266dda7e01c04423cca9fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed323f1325266dda7e01c04423cca9fc");
            return;
        }
        h.b(objArr, "obj");
        if (WARN >= this.level) {
            if (!(true ^ (objArr.length == 0)) || str2 == null) {
                return;
            }
            w wVar = w.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            h.a((Object) String.format(str2, Arrays.copyOf(copyOf, copyOf.length)), "java.lang.String.format(format, *args)");
        }
    }

    @JvmOverloads
    public static /* synthetic */ void w$default(ShieldLogger shieldLogger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.w(str, str2, th, objArr);
    }

    @JvmOverloads
    public void w(@Nullable String str, @Nullable String str2, @NotNull Throwable th, @NotNull Object... objArr) {
        String str3;
        Object[] objArr2 = {str, str2, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f55a48df0bae49e50ff9b4f48005162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f55a48df0bae49e50ff9b4f48005162");
            return;
        }
        h.b(th, "e");
        h.b(objArr, "obj");
        if (WARN >= this.level) {
            if (!(true ^ (objArr.length == 0))) {
                Log.w(str, str2, th);
                return;
            }
            if (str2 != null) {
                w wVar = w.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                h.a((Object) str3, "java.lang.String.format(format, *args)");
            } else {
                str3 = null;
            }
            Log.w(str, str3, th);
        }
    }

    @JvmOverloads
    public static /* synthetic */ void e$default(ShieldLogger shieldLogger, String str, String str2, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.e(str, str2, objArr);
    }

    @JvmOverloads
    public void e(@Nullable String str, @Nullable String str2, @NotNull Object... objArr) {
        String str3;
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d50920f69bdcb83798c83a40451fdfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d50920f69bdcb83798c83a40451fdfb");
            return;
        }
        h.b(objArr, "obj");
        if (ERROR >= this.level) {
            if (!(!(objArr.length == 0))) {
                Log.e(str, str2);
                return;
            }
            if (str2 != null) {
                w wVar = w.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                h.a((Object) str3, "java.lang.String.format(format, *args)");
            } else {
                str3 = null;
            }
            Log.e(str, str3);
        }
    }

    @JvmOverloads
    public static /* synthetic */ void e$default(ShieldLogger shieldLogger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 1) != 0) {
            str = shieldLogger.TAG_DEFAULT;
        }
        shieldLogger.e(str, str2, th, objArr);
    }

    @JvmOverloads
    public void e(@Nullable String str, @Nullable String str2, @NotNull Throwable th, @NotNull Object... objArr) {
        String str3;
        Object[] objArr2 = {str, str2, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe53cb7c7d36bd212335ee015930820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe53cb7c7d36bd212335ee015930820");
            return;
        }
        h.b(th, "e");
        h.b(objArr, "obj");
        if (ERROR >= this.level) {
            if (!(true ^ (objArr.length == 0))) {
                Log.e(str, str2, th);
                return;
            }
            if (str2 != null) {
                w wVar = w.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                h.a((Object) str3, "java.lang.String.format(format, *args)");
            } else {
                str3 = null;
            }
            Log.e(str, str3, th);
        }
    }

    @JvmOverloads
    public static /* synthetic */ void codeLogInfo$default(ShieldLogger shieldLogger, Class cls, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: codeLogInfo");
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        shieldLogger.codeLogInfo(cls, str, str2);
    }

    @JvmOverloads
    public void codeLogInfo(@Nullable Class<?> cls, @Nullable String str, @Nullable String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d485bb5b9f34bdea87433021b93c6118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d485bb5b9f34bdea87433021b93c6118");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls != null ? cls.getSimpleName() : null);
        sb.append('@');
        sb.append(str2);
    }

    @JvmOverloads
    public static /* synthetic */ void codeLogError$default(ShieldLogger shieldLogger, Class cls, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: codeLogError");
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        shieldLogger.codeLogError(cls, str, str2);
    }

    @JvmOverloads
    public void codeLogError(@Nullable Class<?> cls, @Nullable String str, @Nullable String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef6f388ca351c33928ebad7ae55055a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef6f388ca351c33928ebad7ae55055a8");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls != null ? cls.getSimpleName() : null);
        sb.append('@');
        sb.append(str2);
        Log.e(sb.toString(), str);
    }
}
