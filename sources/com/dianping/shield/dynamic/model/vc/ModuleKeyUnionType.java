package com.dianping.shield.dynamic.model.vc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "", "()V", "StringKey", "StringKeyCallback", "StructKey", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StringKeyCallback;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StructKey;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StringKey;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ModuleKeyUnionType {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StringKeyCallback;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "keyFunc", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "key", "getKey", "()Ljava/lang/String;", "key$delegate", "Lkotlin/Lazy;", "getKeyFunc", "()Lkotlin/jvm/functions/Function0;", "setKeyFunc", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class StringKeyCallback extends ModuleKeyUnionType {
        public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(StringKeyCallback.class), "key", "getKey()Ljava/lang/String;"))};
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private final d key$delegate;
        @Nullable
        private a<String> keyFunc;

        public StringKeyCallback() {
            this(null, 1, null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4402188d39fc21800398c0ffde3269a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4402188d39fc21800398c0ffde3269a7");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static /* synthetic */ StringKeyCallback copy$default(StringKeyCallback stringKeyCallback, a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar = stringKeyCallback.keyFunc;
            }
            return stringKeyCallback.copy(aVar);
        }

        @Nullable
        public final a<String> component1() {
            return this.keyFunc;
        }

        @NotNull
        public final StringKeyCallback copy(@Nullable a<String> aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14c851d9099e8f500ac065440096e1d5", RobustBitConfig.DEFAULT_VALUE) ? (StringKeyCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14c851d9099e8f500ac065440096e1d5") : new StringKeyCallback(aVar);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10a02fb19b2554a96685bf983943be1d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10a02fb19b2554a96685bf983943be1d")).booleanValue() : this == obj || ((obj instanceof StringKeyCallback) && h.a(this.keyFunc, ((StringKeyCallback) obj).keyFunc));
        }

        @Nullable
        public final String getKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (String) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18e6b832d53b74e162c363fe3b726d3e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18e6b832d53b74e162c363fe3b726d3e") : this.key$delegate.a());
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da8fcf17f7e10892a864f12fb7bdfec1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da8fcf17f7e10892a864f12fb7bdfec1")).intValue();
            }
            a<String> aVar = this.keyFunc;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "553fdbfc6e7933a1ab8645ef3eab8198", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "553fdbfc6e7933a1ab8645ef3eab8198");
            }
            return "StringKeyCallback(keyFunc=" + this.keyFunc + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        public StringKeyCallback(@Nullable a<String> aVar) {
            super(null);
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee30c4f8e46248b19b4c32a18ab51c70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee30c4f8e46248b19b4c32a18ab51c70");
                return;
            }
            this.keyFunc = aVar;
            this.key$delegate = e.a(kotlin.i.NONE, new ModuleKeyUnionType$StringKeyCallback$key$2(this));
        }

        public /* synthetic */ StringKeyCallback(a aVar, int i, f fVar) {
            this((i & 1) != 0 ? null : aVar);
        }

        @Nullable
        public final a<String> getKeyFunc() {
            return this.keyFunc;
        }

        public final void setKeyFunc(@Nullable a<String> aVar) {
            this.keyFunc = aVar;
        }
    }

    public ModuleKeyUnionType() {
    }

    public /* synthetic */ ModuleKeyUnionType(f fVar) {
        this();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StructKey;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "n", "", "priority", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getN", "()Ljava/lang/String;", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StructKey;", "equals", "", "other", "", "hashCode", "toString", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class StructKey extends ModuleKeyUnionType {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private final String n;
        @Nullable
        private final Integer priority;

        @NotNull
        public static /* synthetic */ StructKey copy$default(StructKey structKey, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = structKey.n;
            }
            if ((i & 2) != 0) {
                num = structKey.priority;
            }
            return structKey.copy(str, num);
        }

        @Nullable
        public final String component1() {
            return this.n;
        }

        @Nullable
        public final Integer component2() {
            return this.priority;
        }

        @NotNull
        public final StructKey copy(@Nullable String str, @Nullable Integer num) {
            Object[] objArr = {str, num};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a2f4cd6e989eb380e78a88f373240db", RobustBitConfig.DEFAULT_VALUE) ? (StructKey) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a2f4cd6e989eb380e78a88f373240db") : new StructKey(str, num);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18afc205e36af353d1d1c032a13fef83", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18afc205e36af353d1d1c032a13fef83")).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof StructKey) {
                    StructKey structKey = (StructKey) obj;
                    if (!h.a((Object) this.n, (Object) structKey.n) || !h.a(this.priority, structKey.priority)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2456b160fd2cf5fd75ee74a0a52dfe25", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2456b160fd2cf5fd75ee74a0a52dfe25")).intValue();
            }
            String str = this.n;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.priority;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b71096fbf37a171a668e5d69aac66113", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b71096fbf37a171a668e5d69aac66113");
            }
            return "StructKey(n=" + this.n + ", priority=" + this.priority + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        public StructKey(@Nullable String str, @Nullable Integer num) {
            super(null);
            Object[] objArr = {str, num};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a401f2bf4e1c08dce6da4abd8290855c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a401f2bf4e1c08dce6da4abd8290855c");
                return;
            }
            this.n = str;
            this.priority = num;
        }

        @Nullable
        public final String getN() {
            return this.n;
        }

        @Nullable
        public final Integer getPriority() {
            return this.priority;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StringKey;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class StringKey extends ModuleKeyUnionType {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private String key;

        @NotNull
        public static /* synthetic */ StringKey copy$default(StringKey stringKey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringKey.key;
            }
            return stringKey.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.key;
        }

        @NotNull
        public final StringKey copy(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e74c2a98536bc7ac394abe9ef9d1562", RobustBitConfig.DEFAULT_VALUE) ? (StringKey) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e74c2a98536bc7ac394abe9ef9d1562") : new StringKey(str);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b66c410e6a4960862e83dc78426572d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b66c410e6a4960862e83dc78426572d2")).booleanValue() : this == obj || ((obj instanceof StringKey) && h.a((Object) this.key, (Object) ((StringKey) obj).key));
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2765e2f541fa4c42cbdada9755dc0cd1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2765e2f541fa4c42cbdada9755dc0cd1")).intValue();
            }
            String str = this.key;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "474fa511e289f1154b2c6629c3ff34a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "474fa511e289f1154b2c6629c3ff34a5");
            }
            return "StringKey(key=" + this.key + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        public StringKey(@Nullable String str) {
            super(null);
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b6d8c6c6f4d19741dde787f90614a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b6d8c6c6f4d19741dde787f90614a8");
            } else {
                this.key = str;
            }
        }

        @Nullable
        public final String getKey() {
            return this.key;
        }

        public final void setKey(@Nullable String str) {
            this.key = str;
        }
    }
}
