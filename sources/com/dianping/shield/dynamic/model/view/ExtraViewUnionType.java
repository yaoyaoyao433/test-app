package com.dianping.shield.dynamic.model.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;", "", "()V", "ExtraReusableViewInfo", "ExtraViewInfo", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraReusableViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ExtraViewUnionType {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraReusableViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;", "value", "Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;", "(Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;)V", "getValue", "()Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class ExtraReusableViewInfo extends ExtraViewUnionType {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo value;

        @NotNull
        public static /* synthetic */ ExtraReusableViewInfo copy$default(ExtraReusableViewInfo extraReusableViewInfo, com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo extraReusableViewInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                extraReusableViewInfo2 = extraReusableViewInfo.value;
            }
            return extraReusableViewInfo.copy(extraReusableViewInfo2);
        }

        @NotNull
        public final com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo component1() {
            return this.value;
        }

        @NotNull
        public final ExtraReusableViewInfo copy(@NotNull com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo extraReusableViewInfo) {
            Object[] objArr = {extraReusableViewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88373279df82b34d649801ff56f3413b", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExtraReusableViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88373279df82b34d649801ff56f3413b");
            }
            h.b(extraReusableViewInfo, "value");
            return new ExtraReusableViewInfo(extraReusableViewInfo);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a91ab722292a718eabf3a59a43583647", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a91ab722292a718eabf3a59a43583647")).booleanValue() : this == obj || ((obj instanceof ExtraReusableViewInfo) && h.a(this.value, ((ExtraReusableViewInfo) obj).value));
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab69bd2a970453b63cf4525884df34b2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab69bd2a970453b63cf4525884df34b2")).intValue();
            }
            com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo extraReusableViewInfo = this.value;
            if (extraReusableViewInfo != null) {
                return extraReusableViewInfo.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc3a25a5027cee7f07c71e9f61add136", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc3a25a5027cee7f07c71e9f61add136");
            }
            return "ExtraReusableViewInfo(value=" + this.value + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExtraReusableViewInfo(@NotNull com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo extraReusableViewInfo) {
            super(null);
            h.b(extraReusableViewInfo, "value");
            Object[] objArr = {extraReusableViewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a62855b25a246ac052e74bcf1394834", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a62855b25a246ac052e74bcf1394834");
            } else {
                this.value = extraReusableViewInfo;
            }
        }

        @NotNull
        public final com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo getValue() {
            return this.value;
        }
    }

    public ExtraViewUnionType() {
    }

    public /* synthetic */ ExtraViewUnionType(f fVar) {
        this();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;", "value", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;)V", "getValue", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class ExtraViewInfo extends ExtraViewUnionType {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final com.dianping.shield.dynamic.model.view.ExtraViewInfo value;

        @NotNull
        public static /* synthetic */ ExtraViewInfo copy$default(ExtraViewInfo extraViewInfo, com.dianping.shield.dynamic.model.view.ExtraViewInfo extraViewInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                extraViewInfo2 = extraViewInfo.value;
            }
            return extraViewInfo.copy(extraViewInfo2);
        }

        @NotNull
        public final com.dianping.shield.dynamic.model.view.ExtraViewInfo component1() {
            return this.value;
        }

        @NotNull
        public final ExtraViewInfo copy(@NotNull com.dianping.shield.dynamic.model.view.ExtraViewInfo extraViewInfo) {
            Object[] objArr = {extraViewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9d825ee52c7b7f8b16db78bf8234d44", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExtraViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9d825ee52c7b7f8b16db78bf8234d44");
            }
            h.b(extraViewInfo, "value");
            return new ExtraViewInfo(extraViewInfo);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "140028cf0931801b8971e37a68cf940d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "140028cf0931801b8971e37a68cf940d")).booleanValue() : this == obj || ((obj instanceof ExtraViewInfo) && h.a(this.value, ((ExtraViewInfo) obj).value));
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce505b34facdf0ce69c8851dd5cde2b4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce505b34facdf0ce69c8851dd5cde2b4")).intValue();
            }
            com.dianping.shield.dynamic.model.view.ExtraViewInfo extraViewInfo = this.value;
            if (extraViewInfo != null) {
                return extraViewInfo.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86d22a0e13b81bb6df9404c51e9f1ae3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86d22a0e13b81bb6df9404c51e9f1ae3");
            }
            return "ExtraViewInfo(value=" + this.value + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExtraViewInfo(@NotNull com.dianping.shield.dynamic.model.view.ExtraViewInfo extraViewInfo) {
            super(null);
            h.b(extraViewInfo, "value");
            Object[] objArr = {extraViewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70b4acba9ccc93b57675ca6f9ff66c53", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70b4acba9ccc93b57675ca6f9ff66c53");
            } else {
                this.value = extraViewInfo;
            }
        }

        @NotNull
        public final com.dianping.shield.dynamic.model.view.ExtraViewInfo getValue() {
            return this.value;
        }
    }
}
